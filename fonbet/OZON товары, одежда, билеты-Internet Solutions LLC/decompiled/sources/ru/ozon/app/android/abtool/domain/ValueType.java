package ru.ozon.app.android.abtool.domain;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/abtool/domain/ValueType;", "", "<init>", "(Ljava/lang/String;I)V", "STRING", "INT", "BOOLEAN", "FLOAT", "LONG", "EXCEPTION", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ValueType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ValueType[] $VALUES;
    public static final ValueType STRING = new ValueType("STRING", 0);
    public static final ValueType INT = new ValueType("INT", 1);
    public static final ValueType BOOLEAN = new ValueType("BOOLEAN", 2);
    public static final ValueType FLOAT = new ValueType("FLOAT", 3);
    public static final ValueType LONG = new ValueType("LONG", 4);
    public static final ValueType EXCEPTION = new ValueType("EXCEPTION", 5);

    private static final /* synthetic */ ValueType[] $values() {
        return new ValueType[]{STRING, INT, BOOLEAN, FLOAT, LONG, EXCEPTION};
    }

    static {
        ValueType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ValueType(String str, int i11) {
    }

    @NotNull
    public static a<ValueType> getEntries() {
        return $ENTRIES;
    }

    public static ValueType valueOf(String str) {
        return (ValueType) Enum.valueOf(ValueType.class, str);
    }

    public static ValueType[] values() {
        return (ValueType[]) $VALUES.clone();
    }
}
