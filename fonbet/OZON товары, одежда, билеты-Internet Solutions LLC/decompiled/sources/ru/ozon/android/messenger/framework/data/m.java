package ru.ozon.android.messenger.framework.data;

import Sc.C4001c;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.d f87628a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.logger.a f87629b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends Throwable>[] f87630c;

    public m(@NotNull ru.ozon.android.messenger.framework.core.initialization.d messengerConfig, @NotNull ru.ozon.android.messenger.framework.logger.a logger) {
        Intrinsics.checkNotNullParameter(messengerConfig, "messengerConfig");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f87628a = messengerConfig;
        this.f87629b = logger;
        this.f87630c = new kotlin.reflect.d[]{N.b(CancellationException.class), N.b(SocketTimeoutException.class), N.b(UnknownHostException.class), N.b(ConnectException.class), N.b(InterruptedException.class), N.b(Error.class)};
    }

    static void a(m mVar, String str, String str2, Exception exc, Integer num, int i11) {
        String b11;
        if ((i11 & 4) != 0) {
            exc = null;
        }
        if ((i11 & 8) != 0) {
            num = null;
        }
        ru.ozon.android.messenger.framework.core.initialization.d dVar = mVar.f87628a;
        if (dVar.getOzonLoggerEnabled()) {
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.ERROR;
            String b12 = dVar.getNetworkConfig().b();
            dVar.getNetworkConfig().getClass();
            String S11 = kotlin.text.h.e0(str, b12, false) ? kotlin.text.h.S(kotlin.text.h.S(str, b12), "composer-api.bx/_action/v2") : str;
            if (num != null) {
                b11 = V.e.b(new Object[]{Integer.valueOf(num.intValue())}, 1, "statusCode = %s", "format(...)");
            } else {
                b11 = V.e.b(new Object[]{exc != null ? exc.getClass().getCanonicalName() : null}, 1, "exception = %s", "format(...)");
            }
            String c11 = G.g.c(V.e.b(new Object[]{S11}, 1, "Messenger failed action %s", "format(...)"), " ", b11);
            Tc.d builder = new Tc.d();
            builder.put(ImagesContract.URL, str);
            builder.put("errorDescription", str2);
            if (num != null) {
                builder.put("statusCode", num);
            }
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            mVar.f87629b.a(cVar, c11, sj.f.a(builder.u()));
        }
    }

    public final void b(@NotNull String url, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(exception, "exception");
        for (kotlin.reflect.d<? extends Throwable> dVar : this.f87630c) {
            if (dVar.A(exception)) {
                return;
            }
        }
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Unhandled exception";
        }
        a(this, url, localizedMessage, exception, null, 8);
    }

    public final void c(int i11, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a(this, url, V.e.b(new Object[]{Integer.valueOf(i11)}, 1, "Response status code was unacceptable: %s", "format(...)"), null, Integer.valueOf(i11), 4);
    }

    public final void d(@NotNull String blockName, @NotNull String blockKey, long j11, @NotNull Throwable throwable, @NotNull String reason, @NotNull Map<String, ? extends Object> additionalFields) {
        Intrinsics.checkNotNullParameter(blockName, "blockName");
        Intrinsics.checkNotNullParameter(blockKey, "blockKey");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
        if (this.f87628a.getOzonLoggerEnabled()) {
            for (kotlin.reflect.d<? extends Throwable> dVar : this.f87630c) {
                if (dVar.A(throwable)) {
                    return;
                }
            }
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.ERROR;
            String b11 = V.e.b(new Object[]{blockKey}, 1, "Block parsing failed: %s", "format(...)");
            Tc.d builder = new Tc.d();
            builder.put("blockName", blockName);
            builder.put("blockKey", blockKey);
            builder.put("blockVersion", Long.valueOf(j11));
            builder.put("reason", reason);
            String message = throwable.getMessage();
            if (message == null) {
                message = "Unhandled exception";
            }
            builder.put("errorDescription", message);
            String canonicalName = throwable.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = "";
            }
            builder.put("exceptionType", canonicalName);
            builder.put("stackTrace", C4001c.b(throwable));
            builder.putAll(additionalFields);
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            this.f87629b.a(cVar, b11, sj.f.a(builder.u()));
        }
    }
}
