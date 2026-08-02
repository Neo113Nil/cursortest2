package androidx.compose.foundation.text.selection;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionLayout.kt */
/* loaded from: classes11.dex */
public final class CrossStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CrossStatus[] $VALUES;
    public static final CrossStatus COLLAPSED;
    public static final CrossStatus CROSSED;
    public static final CrossStatus NOT_CROSSED;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        CROSSED = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        NOT_CROSSED = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        COLLAPSED = crossStatus3;
        CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        $VALUES = crossStatusArr;
        $ENTRIES = new asp(crossStatusArr);
    }

    public CrossStatus() {
        throw null;
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) $VALUES.clone();
    }
}
