package ai.verisoul.sdk.logger;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lai/verisoul/sdk/logger/LogLevel;", "", "(Ljava/lang/String;I)V", "LOG", "WARN", "ERROR", "INFO", "METRIC", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel LOG = new LogLevel("LOG", 0);
    public static final LogLevel WARN = new LogLevel("WARN", 1);
    public static final LogLevel ERROR = new LogLevel("ERROR", 2);
    public static final LogLevel INFO = new LogLevel("INFO", 3);
    public static final LogLevel METRIC = new LogLevel("METRIC", 4);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{LOG, WARN, ERROR, INFO, METRIC};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LogLevel(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
