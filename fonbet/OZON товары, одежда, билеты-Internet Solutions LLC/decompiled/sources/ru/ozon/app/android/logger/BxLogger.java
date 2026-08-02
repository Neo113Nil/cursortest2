package ru.ozon.app.android.logger;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.OzonLogger;
import ru.ozon.app.android.logger.autotest.AutoTestLogger;
import ru.ozon.app.android.logger.nonfatal.NonFatalLogger;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R*\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\"8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/logger/BxLogger;", "Lru/ozon/app/android/logger/OzonLogger;", "<init>", "()V", "", "event", "", "tags", "logger", "", "level", "", "logEvent", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V", "", "throwable", "logException", "(Ljava/lang/Throwable;)V", "priority", "tag", "msg", "log", "(ILjava/lang/String;Ljava/lang/String;)V", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setTag", "(Ljava/lang/String;Ljava/lang/String;)V", "putKey", "id", "setUserId", "(Ljava/lang/String;)V", "", "loggers", "[Lru/ozon/app/android/logger/OzonLogger;", "", "isLogToSentry", "Z", "()Z", "setLogToSentry", "(Z)V", "logger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BxLogger implements OzonLogger {
    private static boolean isLogToSentry;

    @NotNull
    public static final BxLogger INSTANCE = new BxLogger();

    @NotNull
    private static final OzonLogger[] loggers = {new NonFatalLogger(), new AutoTestLogger()};

    private BxLogger() {
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void log(int priority, String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        for (OzonLogger ozonLogger : loggers) {
            ozonLogger.log(priority, tag, msg);
        }
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void logEvent(@NotNull String event, @NotNull Map<String, String> tags, @NotNull String logger, int level) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(logger, "logger");
        for (OzonLogger ozonLogger : loggers) {
            ozonLogger.logEvent(event, tags, logger, level);
        }
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void logException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        for (OzonLogger ozonLogger : loggers) {
            ozonLogger.logException(throwable);
        }
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String str, Boolean bool) {
        OzonLogger.DefaultImpls.putKey(this, str, bool);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setLogToSentry(boolean z11) {
        for (OzonLogger ozonLogger : loggers) {
            ozonLogger.setLogToSentry(z11);
        }
        isLogToSentry = z11;
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setTag(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        for (OzonLogger ozonLogger : loggers) {
            ozonLogger.setTag(key, value);
        }
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setUserId(String id2) {
        for (OzonLogger ozonLogger : loggers) {
            ozonLogger.setUserId(id2);
        }
    }

    public void putKey(@NotNull String str, Integer num) {
        OzonLogger.DefaultImpls.putKey(this, str, num);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String str, Long l11) {
        OzonLogger.DefaultImpls.putKey(this, str, l11);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (OzonLogger ozonLogger : loggers) {
            ozonLogger.putKey(key, value);
        }
    }
}
