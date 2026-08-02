package ru.ozon.app.android.pikazon.logging;

import G.g;
import Sc.InterfaceC3999a;
import Sc.o;
import android.annotation.SuppressLint;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.logging.PikazonLogConfig;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pikazon/logging/PikazonLogger;", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Logger;", "<init>", "()V", "", "addTimestamp", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;", "logConfig", "", "initialize", "(Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;)V", "message", "log", "(Ljava/lang/String;)V", "", "throwable", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "writeLog", "configuration", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;", "Ljava/text/SimpleDateFormat;", "formatter", "Ljava/text/SimpleDateFormat;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonLogger implements PikazonLogConfig.Logger {

    @NotNull
    public static final PikazonLogger INSTANCE = new PikazonLogger();

    @NotNull
    private static PikazonLogConfig configuration = PikazonLogConfig.Disabled.INSTANCE;

    @NotNull
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    private PikazonLogger() {
    }

    private final String addTimestamp(String str) {
        return g.c(formatter.format(Calendar.getInstance().getTime()), " | ", str);
    }

    public final void initialize(@NotNull PikazonLogConfig logConfig) {
        Intrinsics.checkNotNullParameter(logConfig, "logConfig");
        configuration = logConfig;
    }

    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        PikazonLogConfig.Logger.DefaultImpls.writeLog$default(this, addTimestamp(message), null, 2, null);
    }

    public final void logError(@NotNull String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        writeLog(addTimestamp(message), throwable);
    }

    @Override // ru.ozon.app.android.pikazon.logging.PikazonLogConfig.Logger
    @SuppressLint({"LogNotTimber"})
    public void writeLog(@NotNull String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        PikazonLogConfig pikazonLogConfig = configuration;
        if (pikazonLogConfig instanceof PikazonLogConfig.Disabled) {
            return;
        }
        if (!(pikazonLogConfig instanceof PikazonLogConfig.Enabled)) {
            throw new o();
        }
        PikazonLogConfig.Logger externalLogger = ((PikazonLogConfig.Enabled) pikazonLogConfig).getExternalLogger();
        if (externalLogger != null) {
            externalLogger.writeLog(message, throwable);
        } else if (throwable == null) {
            Log.d("Pikazon", message);
        } else {
            Log.e("Pikazon", message, throwable);
        }
    }
}
