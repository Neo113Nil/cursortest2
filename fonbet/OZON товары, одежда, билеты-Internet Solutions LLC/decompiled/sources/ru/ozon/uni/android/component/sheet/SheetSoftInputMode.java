package ru.ozon.uni.android.component.sheet;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "ADJUST_RESIZE", "ADJUST_PAN", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SheetSoftInputMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SheetSoftInputMode[] $VALUES;
    public static final SheetSoftInputMode UNSPECIFIED = new SheetSoftInputMode("UNSPECIFIED", 0);
    public static final SheetSoftInputMode ADJUST_RESIZE = new SheetSoftInputMode("ADJUST_RESIZE", 1);
    public static final SheetSoftInputMode ADJUST_PAN = new SheetSoftInputMode("ADJUST_PAN", 2);

    private static final /* synthetic */ SheetSoftInputMode[] $values() {
        return new SheetSoftInputMode[]{UNSPECIFIED, ADJUST_RESIZE, ADJUST_PAN};
    }

    static {
        SheetSoftInputMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SheetSoftInputMode(String str, int i11) {
    }

    public static SheetSoftInputMode valueOf(String str) {
        return (SheetSoftInputMode) Enum.valueOf(SheetSoftInputMode.class, str);
    }

    public static SheetSoftInputMode[] values() {
        return (SheetSoftInputMode[]) $VALUES.clone();
    }
}
