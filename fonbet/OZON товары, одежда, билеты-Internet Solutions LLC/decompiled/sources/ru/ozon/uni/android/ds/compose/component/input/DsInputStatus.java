package ru.ozon.uni.android.ds.compose.component.input;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "SUCCESS", "ERROR", "READ_ONLY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsInputStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsInputStatus[] $VALUES;
    public static final DsInputStatus NEUTRAL = new DsInputStatus("NEUTRAL", 0);
    public static final DsInputStatus SUCCESS = new DsInputStatus("SUCCESS", 1);
    public static final DsInputStatus ERROR = new DsInputStatus("ERROR", 2);
    public static final DsInputStatus READ_ONLY = new DsInputStatus("READ_ONLY", 3);

    private static final /* synthetic */ DsInputStatus[] $values() {
        return new DsInputStatus[]{NEUTRAL, SUCCESS, ERROR, READ_ONLY};
    }

    static {
        DsInputStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsInputStatus(String str, int i11) {
    }

    public static DsInputStatus valueOf(String str) {
        return (DsInputStatus) Enum.valueOf(DsInputStatus.class, str);
    }

    public static DsInputStatus[] values() {
        return (DsInputStatus[]) $VALUES.clone();
    }
}
