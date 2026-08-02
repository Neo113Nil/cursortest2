package ru.ozon.app.android.pikazon.logging.error;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/PikazonErrorsLogger;", "", "analyticsPlatform", "Lru/ozon/app/android/pikazon/logging/error/PikazonErrorsLogger$AnalyticsPlatform;", "getAnalyticsPlatform", "()Lru/ozon/app/android/pikazon/logging/error/PikazonErrorsLogger$AnalyticsPlatform;", "log", "", "logEntry", "Lru/ozon/app/android/pikazon/logging/error/PikazonErrorLogEntry;", "AnalyticsPlatform", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PikazonErrorsLogger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/PikazonErrorsLogger$AnalyticsPlatform;", "", "<init>", "(Ljava/lang/String;I)V", "OZON_LOGGER", "OZON_TRACKER", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnalyticsPlatform {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AnalyticsPlatform[] $VALUES;
        public static final AnalyticsPlatform OZON_LOGGER = new AnalyticsPlatform("OZON_LOGGER", 0);
        public static final AnalyticsPlatform OZON_TRACKER = new AnalyticsPlatform("OZON_TRACKER", 1);

        private static final /* synthetic */ AnalyticsPlatform[] $values() {
            return new AnalyticsPlatform[]{OZON_LOGGER, OZON_TRACKER};
        }

        static {
            AnalyticsPlatform[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AnalyticsPlatform(String str, int i11) {
        }

        public static AnalyticsPlatform valueOf(String str) {
            return (AnalyticsPlatform) Enum.valueOf(AnalyticsPlatform.class, str);
        }

        public static AnalyticsPlatform[] values() {
            return (AnalyticsPlatform[]) $VALUES.clone();
        }
    }

    @NotNull
    AnalyticsPlatform getAnalyticsPlatform();

    void log(@NotNull PikazonErrorLogEntry logEntry);
}
