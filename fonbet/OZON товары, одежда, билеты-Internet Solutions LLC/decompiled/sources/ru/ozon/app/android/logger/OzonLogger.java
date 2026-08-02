package ru.ozon.app.android.logger;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ!\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u00020\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/logger/OzonLogger;", "", "", "event", "", "tags", "logger", "", "level", "", "logEvent", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V", "", "throwable", "logException", "(Ljava/lang/Throwable;)V", "priority", "tag", "msg", "log", "(ILjava/lang/String;Ljava/lang/String;)V", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setTag", "(Ljava/lang/String;Ljava/lang/String;)V", "putKey", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "id", "setUserId", "(Ljava/lang/String;)V", "isLogToSentry", "()Z", "setLogToSentry", "(Z)V", "logger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OzonLogger {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(OzonLogger ozonLogger, int i11, String str, String str2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i12 & 1) != 0) {
                i11 = 3;
            }
            if ((i12 & 2) != 0) {
                str = null;
            }
            ozonLogger.log(i11, str, str2);
        }

        public static void logEvent(@NotNull OzonLogger ozonLogger, @NotNull String event, @NotNull Map<String, String> tags, @NotNull String logger, int i11) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(logger, "logger");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logEvent$default(OzonLogger ozonLogger, String str, Map map, String str2, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
            }
            if ((i12 & 2) != 0) {
                map = U.c();
            }
            if ((i12 & 4) != 0) {
                str2 = "ozon";
            }
            if ((i12 & 8) != 0) {
                i11 = 3;
            }
            ozonLogger.logEvent(str, map, str2, i11);
        }

        public static void logException(@NotNull OzonLogger ozonLogger, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }

        public static void putKey(@NotNull OzonLogger ozonLogger, @NotNull String key, String str) {
            Intrinsics.checkNotNullParameter(key, "key");
        }

        public static void setTag(@NotNull OzonLogger ozonLogger, @NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
        }

        public static void setUserId(@NotNull OzonLogger ozonLogger, String str) {
        }

        public static void putKey(@NotNull OzonLogger ozonLogger, @NotNull String key, Long l11) {
            Intrinsics.checkNotNullParameter(key, "key");
            ozonLogger.putKey(key, l11 != null ? l11.toString() : null);
        }

        public static void putKey(@NotNull OzonLogger ozonLogger, @NotNull String key, Integer num) {
            Intrinsics.checkNotNullParameter(key, "key");
            ozonLogger.putKey(key, num != null ? num.toString() : null);
        }

        public static void putKey(@NotNull OzonLogger ozonLogger, @NotNull String key, Boolean bool) {
            Intrinsics.checkNotNullParameter(key, "key");
            ozonLogger.putKey(key, bool != null ? bool.toString() : null);
        }
    }

    void log(int priority, String tag, @NotNull String msg);

    void logEvent(@NotNull String event, @NotNull Map<String, String> tags, @NotNull String logger, int level);

    void logException(@NotNull Throwable throwable);

    void putKey(@NotNull String key, Boolean value);

    void putKey(@NotNull String key, Long value);

    void putKey(@NotNull String key, String value);

    void setLogToSentry(boolean z11);

    void setTag(@NotNull String key, @NotNull String value);

    void setUserId(String id2);
}
