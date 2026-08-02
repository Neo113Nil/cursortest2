package ru.ozon.app.android.travel.logger;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.android.ozonLogger.core.h;
import sj.d;
import sj.f;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/logger/TravelActionNonFatalLogger;", "", "<init>", "()V", "", "Ljava/lang/StackTraceElement;", "", "toReadableStacktrace", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "", "throwable", "locator", "", "logException", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lsj/d;", "ozonLogger$delegate", "LSc/j;", "getOzonLogger", "()Lsj/d;", "ozonLogger", "Companion", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelActionNonFatalLogger {

    /* renamed from: ozonLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonLogger = k.b(TravelActionNonFatalLogger$ozonLogger$2.INSTANCE);

    private final d getOzonLogger() {
        return (d) this.ozonLogger.getValue();
    }

    private final String toReadableStacktrace(StackTraceElement[] stackTraceElementArr) {
        return C7705l.P(stackTraceElementArr, " \n", null, null, null, 62);
    }

    public void logException(@NotNull Throwable throwable, @NotNull String locator) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(locator, "locator");
        d ozonLogger = getOzonLogger();
        c cVar = c.ERROR;
        String th2 = throwable.toString();
        Pair pair = new Pair("locator", locator);
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        h.a.d(ozonLogger, cVar, th2, f.a(U.j(pair, new Pair("stackTrace", toReadableStacktrace(stackTrace)))), null, 8);
    }
}
