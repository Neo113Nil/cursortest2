package ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;", "", "<init>", "(Ljava/lang/String;I)V", "CORNER_STYLE_DEFAULT", "CORNER_STYLE_ROUNDED", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CornerStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CornerStyle[] $VALUES;
    public static final CornerStyle CORNER_STYLE_DEFAULT = new CornerStyle("CORNER_STYLE_DEFAULT", 0);
    public static final CornerStyle CORNER_STYLE_ROUNDED = new CornerStyle("CORNER_STYLE_ROUNDED", 1);

    private static final /* synthetic */ CornerStyle[] $values() {
        return new CornerStyle[]{CORNER_STYLE_DEFAULT, CORNER_STYLE_ROUNDED};
    }

    static {
        CornerStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CornerStyle(String str, int i11) {
    }

    public static CornerStyle valueOf(String str) {
        return (CornerStyle) Enum.valueOf(CornerStyle.class, str);
    }

    public static CornerStyle[] values() {
        return (CornerStyle[]) $VALUES.clone();
    }
}
