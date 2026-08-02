package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "", "<init>", "(Ljava/lang/String;I)V", "Closed", "Open", "Expanded", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomDrawerValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BottomDrawerValue[] $VALUES;
    public static final BottomDrawerValue Closed = new BottomDrawerValue("Closed", 0);
    public static final BottomDrawerValue Open = new BottomDrawerValue("Open", 1);
    public static final BottomDrawerValue Expanded = new BottomDrawerValue("Expanded", 2);

    private static final /* synthetic */ BottomDrawerValue[] $values() {
        return new BottomDrawerValue[]{Closed, Open, Expanded};
    }

    public static EnumEntries<BottomDrawerValue> getEntries() {
        return $ENTRIES;
    }

    private BottomDrawerValue(String str, int i) {
    }

    static {
        BottomDrawerValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BottomDrawerValue valueOf(String str) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, str);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) $VALUES.clone();
    }
}
