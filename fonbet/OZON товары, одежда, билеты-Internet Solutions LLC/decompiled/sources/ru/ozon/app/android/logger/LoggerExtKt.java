package ru.ozon.app.android.logger;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.OzonLogger;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u000b\u0010\f\u001aI\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"", "message", "tag", "", "sendLog", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "Lkotlin/Function1;", "Lru/ozon/app/android/logger/OzonLogger;", "log", "sendNonFatal", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "", "", "args", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "logger_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerExtKt {
    public static final void sendLog(@NotNull String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        OzonLogger.DefaultImpls.log$default(BxLogger.INSTANCE, 0, str, message, 1, null);
    }

    public static /* synthetic */ void sendLog$default(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        sendLog(str, str2);
    }

    public static final void sendNonFatal(@NotNull Throwable throwable, @NotNull Function1<? super OzonLogger, Unit> log) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(log, "log");
        BxLogger bxLogger = BxLogger.INSTANCE;
        synchronized (bxLogger) {
            log.invoke(bxLogger);
            bxLogger.logException(throwable);
            Unit unit = Unit.f71690a;
        }
    }

    public static /* synthetic */ void sendNonFatal$default(Throwable th2, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        if ((i11 & 8) != 0) {
            map = null;
        }
        sendNonFatal(th2, str, str2, map);
    }

    public static final void sendNonFatal(Throwable th2, String str, @NotNull String tag, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        StringBuilder sb2 = new StringBuilder(str == null ? "" : str);
        if (sb2.length() > 0 && map != null && !map.isEmpty()) {
            sb2.append("\n");
            sb2.append("With arguments: \n");
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                sb2.append(key);
                sb2.append(" = ");
                sb2.append(String.valueOf(value));
                sb2.append(";\n");
            }
        }
        if (tag.length() > 0) {
            BxLogger bxLogger = BxLogger.INSTANCE;
            synchronized (bxLogger) {
                bxLogger.putKey("NonFatalTag", tag);
                Unit unit = Unit.f71690a;
            }
        }
        if (!h.K(sb2)) {
            BxLogger bxLogger2 = BxLogger.INSTANCE;
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            bxLogger2.log(6, tag, sb3);
        }
        BxLogger bxLogger3 = BxLogger.INSTANCE;
        if (th2 == null) {
            th2 = new Exception(str);
        }
        bxLogger3.logException(th2);
    }
}
