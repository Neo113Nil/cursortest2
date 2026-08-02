package ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStatus;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", "SELECTED", "INDETERMINATE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsCheckboxStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsCheckboxStatus[] $VALUES;
    public static final DsCheckboxStatus EMPTY = new DsCheckboxStatus("EMPTY", 0);
    public static final DsCheckboxStatus SELECTED = new DsCheckboxStatus("SELECTED", 1);
    public static final DsCheckboxStatus INDETERMINATE = new DsCheckboxStatus("INDETERMINATE", 2);

    private static final /* synthetic */ DsCheckboxStatus[] $values() {
        return new DsCheckboxStatus[]{EMPTY, SELECTED, INDETERMINATE};
    }

    static {
        DsCheckboxStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsCheckboxStatus(String str, int i11) {
    }

    public static DsCheckboxStatus valueOf(String str) {
        return (DsCheckboxStatus) Enum.valueOf(DsCheckboxStatus.class, str);
    }

    public static DsCheckboxStatus[] values() {
        return (DsCheckboxStatus[]) $VALUES.clone();
    }
}
