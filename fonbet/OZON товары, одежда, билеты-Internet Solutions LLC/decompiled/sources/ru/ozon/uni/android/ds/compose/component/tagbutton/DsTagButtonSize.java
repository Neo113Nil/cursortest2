package ru.ozon.uni.android.ds.compose.component.tagbutton;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;", "", "<init>", "(Ljava/lang/String;I)V", "Size500", "Size600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsTagButtonSize[] $VALUES;
    public static final DsTagButtonSize Size500 = new DsTagButtonSize("Size500", 0);
    public static final DsTagButtonSize Size600 = new DsTagButtonSize("Size600", 1);

    private static final /* synthetic */ DsTagButtonSize[] $values() {
        return new DsTagButtonSize[]{Size500, Size600};
    }

    static {
        DsTagButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsTagButtonSize(String str, int i11) {
    }

    public static DsTagButtonSize valueOf(String str) {
        return (DsTagButtonSize) Enum.valueOf(DsTagButtonSize.class, str);
    }

    public static DsTagButtonSize[] values() {
        return (DsTagButtonSize[]) $VALUES.clone();
    }
}
