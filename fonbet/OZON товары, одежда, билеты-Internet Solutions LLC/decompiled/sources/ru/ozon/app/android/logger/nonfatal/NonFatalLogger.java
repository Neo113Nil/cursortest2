package ru.ozon.app.android.logger.nonfatal;

import Sc.InterfaceC4008j;
import Sc.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7141f;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.K1;
import io.sentry.protocol.E;
import io.sentry.protocol.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.logger.OzonLogger;
import sj.d;
import sj.f;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b%\u0010$J\u0019\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/logger/nonfatal/NonFatalLogger;", "Lru/ozon/app/android/logger/OzonLogger;", "<init>", "()V", "", "level", "Lio/sentry/I2;", "fromAndroidLogToSenty", "(I)Lio/sentry/I2;", "Lru/ozon/android/ozonLogger/core/c;", "fromAndroidLogToLogLevel", "(I)Lru/ozon/android/ozonLogger/core/c;", "", "Ljava/lang/StackTraceElement;", "", "toReadableStacktrace", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "event", "", "tags", "logger", "", "logEvent", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V", "", "throwable", "logException", "(Ljava/lang/Throwable;)V", "priority", "tag", "msg", "log", "(ILjava/lang/String;Ljava/lang/String;)V", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setTag", "(Ljava/lang/String;Ljava/lang/String;)V", "putKey", "id", "setUserId", "(Ljava/lang/String;)V", "", "isLogToSentry", "Z", "()Z", "setLogToSentry", "(Z)V", "Lsj/d;", "ozonLogger$delegate", "LSc/j;", "getOzonLogger", "()Lsj/d;", "ozonLogger", "Companion", "logger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NonFatalLogger implements OzonLogger {
    private boolean isLogToSentry;

    /* renamed from: ozonLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonLogger = k.b(NonFatalLogger$ozonLogger$2.INSTANCE);

    private final c fromAndroidLogToLogLevel(int level) {
        return level != 3 ? level != 4 ? level != 5 ? level != 6 ? c.ERROR : c.ERROR : c.WARNING : c.INFO : c.DEBUG;
    }

    private final I2 fromAndroidLogToSenty(int level) {
        return level != 3 ? level != 4 ? level != 5 ? level != 6 ? I2.DEBUG : I2.ERROR : I2.WARNING : I2.INFO : I2.DEBUG;
    }

    private final d getOzonLogger() {
        return (d) this.ozonLogger.getValue();
    }

    private final String toReadableStacktrace(StackTraceElement[] stackTraceElementArr) {
        return C7705l.P(stackTraceElementArr, " \n", null, null, null, 62);
    }

    /* renamed from: isLogToSentry, reason: from getter */
    public boolean getIsLogToSentry() {
        return this.isLogToSentry;
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void log(int priority, String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C7141f c7141f = new C7141f();
        if (tag == null) {
            tag = "NonFatalLogger";
        }
        c7141f.n(tag);
        c7141f.q(msg);
        K1.d().f(c7141f);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void logEvent(@NotNull String event, @NotNull Map<String, String> tags, @NotNull String logger, int level) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(logger, "logger");
        if (!getIsLogToSentry()) {
            h.a.d(getOzonLogger(), fromAndroidLogToLogLevel(level), event, f.a(tags), null, 8);
        } else if (K1.i()) {
            C7230z2 c7230z2 = new C7230z2();
            m mVar = new m();
            mVar.g(event);
            c7230z2.B0(mVar);
            c7230z2.c0(tags);
            c7230z2.z0(fromAndroidLogToSenty(level));
            c7230z2.A0(logger);
            Intrinsics.f(K1.d().r(c7230z2));
        }
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void logException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (getIsLogToSentry()) {
            Intrinsics.f(K1.d().u(throwable));
            return;
        }
        d ozonLogger = getOzonLogger();
        c cVar = c.ERROR;
        String th2 = throwable.toString();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        h.a.d(ozonLogger, cVar, th2, f.a(f.a(U.i(new Pair("stackTrace", toReadableStacktrace(stackTrace))))), null, 8);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String str, Boolean bool) {
        OzonLogger.DefaultImpls.putKey(this, str, bool);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setLogToSentry(boolean z11) {
        this.isLogToSentry = z11;
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setTag(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        K1.j(key, value);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setUserId(String id2) {
        E e11 = new E();
        e11.n(id2);
        K1.d().d(e11);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String str, Long l11) {
        OzonLogger.DefaultImpls.putKey(this, str, l11);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null) {
            value = "";
        }
        K1.d().c(key, value);
    }
}
