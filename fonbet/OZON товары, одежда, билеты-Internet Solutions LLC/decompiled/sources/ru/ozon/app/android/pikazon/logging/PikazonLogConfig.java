package ru.ozon.app.android.pikazon.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;", "", "<init>", "()V", "Enabled", "Disabled", "Logger", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Disabled;", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Enabled;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PikazonLogConfig {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Disabled;", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disabled extends PikazonLogConfig {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return -1329037098;
        }

        @NotNull
        public String toString() {
            return "Disabled";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Enabled;", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Logger;", "externalLogger", "<init>", "(Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Logger;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Logger;", "getExternalLogger", "()Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Logger;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Enabled extends PikazonLogConfig {
        private final Logger externalLogger;

        public Enabled(Logger logger) {
            super(null);
            this.externalLogger = logger;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Enabled) && Intrinsics.d(this.externalLogger, ((Enabled) other).externalLogger);
        }

        public final Logger getExternalLogger() {
            return this.externalLogger;
        }

        public int hashCode() {
            Logger logger = this.externalLogger;
            if (logger == null) {
                return 0;
            }
            return logger.hashCode();
        }

        @NotNull
        public String toString() {
            return "Enabled(externalLogger=" + this.externalLogger + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pikazon/logging/PikazonLogConfig$Logger;", "", "writeLog", "", "message", "", "throwable", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Logger {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void writeLog$default(Logger logger, String str, Throwable th2, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeLog");
                }
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                logger.writeLog(str, th2);
            }
        }

        void writeLog(@NotNull String message, Throwable throwable);
    }

    public /* synthetic */ PikazonLogConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PikazonLogConfig() {
    }
}
