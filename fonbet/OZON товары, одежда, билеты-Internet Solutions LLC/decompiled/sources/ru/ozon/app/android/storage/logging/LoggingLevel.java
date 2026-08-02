package ru.ozon.app.android.storage.logging;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storage/logging/LoggingLevel;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "BASIC", "HEADERS", "BODY", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoggingLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LoggingLevel[] $VALUES;
    private final int value;
    public static final LoggingLevel NONE = new LoggingLevel("NONE", 0, 0);
    public static final LoggingLevel BASIC = new LoggingLevel("BASIC", 1, 1);
    public static final LoggingLevel HEADERS = new LoggingLevel("HEADERS", 2, 2);
    public static final LoggingLevel BODY = new LoggingLevel("BODY", 3, 3);

    private static final /* synthetic */ LoggingLevel[] $values() {
        return new LoggingLevel[]{NONE, BASIC, HEADERS, BODY};
    }

    static {
        LoggingLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LoggingLevel(String str, int i11, int i12) {
        this.value = i12;
    }

    @NotNull
    public static a<LoggingLevel> getEntries() {
        return $ENTRIES;
    }

    public static LoggingLevel valueOf(String str) {
        return (LoggingLevel) Enum.valueOf(LoggingLevel.class, str);
    }

    public static LoggingLevel[] values() {
        return (LoggingLevel[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
