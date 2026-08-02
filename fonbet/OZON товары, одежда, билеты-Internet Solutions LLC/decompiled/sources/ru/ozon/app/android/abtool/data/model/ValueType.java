package ru.ozon.app.android.abtool.data.model;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/abtool/data/model/ValueType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STRING", "INT", "BOOLEAN", "FLOAT", "LONG", "EXCEPTION", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValueType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ValueType[] $VALUES;

    @NotNull
    private final String value;
    public static final ValueType STRING = new ValueType("STRING", 0, "string");
    public static final ValueType INT = new ValueType("INT", 1, "int");
    public static final ValueType BOOLEAN = new ValueType("BOOLEAN", 2, "bool");
    public static final ValueType FLOAT = new ValueType("FLOAT", 3, "float");
    public static final ValueType LONG = new ValueType("LONG", 4, "uint");
    public static final ValueType EXCEPTION = new ValueType("EXCEPTION", 5, "Exception");

    private static final /* synthetic */ ValueType[] $values() {
        return new ValueType[]{STRING, INT, BOOLEAN, FLOAT, LONG, EXCEPTION};
    }

    static {
        ValueType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ValueType(String str, int i11, String str2) {
        this.value = str2;
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

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
