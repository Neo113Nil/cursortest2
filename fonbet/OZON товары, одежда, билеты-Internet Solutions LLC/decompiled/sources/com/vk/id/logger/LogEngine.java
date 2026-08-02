package com.vk.id.logger;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/vk/id/logger/LogEngine;", "", "log", "", "logLevel", "Lcom/vk/id/logger/LogEngine$LogLevel;", "tag", "", "message", "throwable", "", "LogLevel", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface LogEngine {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/logger/LogEngine$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "DEBUG", "ERROR", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LogLevel {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel INFO = new LogLevel("INFO", 0);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 1);
        public static final LogLevel ERROR = new LogLevel("ERROR", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{INFO, DEBUG, ERROR};
        }

        static {
            LogLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LogLevel(String str, int i11) {
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    void log(@NotNull LogLevel logLevel, @NotNull String tag, @NotNull String message, Throwable throwable);
}
