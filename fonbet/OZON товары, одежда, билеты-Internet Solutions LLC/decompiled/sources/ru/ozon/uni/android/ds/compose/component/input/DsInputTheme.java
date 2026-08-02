package ru.ozon.uni.android.ds.compose.component.input;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputTheme;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "TRANSPARENT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsInputTheme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsInputTheme[] $VALUES;
    public static final DsInputTheme SOLID = new DsInputTheme("SOLID", 0);
    public static final DsInputTheme TRANSPARENT = new DsInputTheme("TRANSPARENT", 1);

    private static final /* synthetic */ DsInputTheme[] $values() {
        return new DsInputTheme[]{SOLID, TRANSPARENT};
    }

    static {
        DsInputTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsInputTheme(String str, int i11) {
    }

    public static DsInputTheme valueOf(String str) {
        return (DsInputTheme) Enum.valueOf(DsInputTheme.class, str);
    }

    public static DsInputTheme[] values() {
        return (DsInputTheme[]) $VALUES.clone();
    }
}
