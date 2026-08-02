package ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_PRIMARY", "STYLE_SECONDARY", "STYLE_EXPRESS", "STYLE_NEUTRAL", "STYLE_NEGATIVE", "STYLE_DISABLED", "STYLE_VIDEO", "STYLE_PRIMARY_BLACK", "STYLE_SECONDARY_BLACK", "STYLE_PRIMARY_WHITE", "STYLE_SECONDARY_WHITE", "STYLE_CLEAR_NEUTRAL", "STYLE_CLEAR_PRIMARY", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Style {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Style[] $VALUES;
    public static final Style STYLE_PRIMARY = new Style("STYLE_PRIMARY", 0);
    public static final Style STYLE_SECONDARY = new Style("STYLE_SECONDARY", 1);
    public static final Style STYLE_EXPRESS = new Style("STYLE_EXPRESS", 2);
    public static final Style STYLE_NEUTRAL = new Style("STYLE_NEUTRAL", 3);
    public static final Style STYLE_NEGATIVE = new Style("STYLE_NEGATIVE", 4);
    public static final Style STYLE_DISABLED = new Style("STYLE_DISABLED", 5);
    public static final Style STYLE_VIDEO = new Style("STYLE_VIDEO", 6);
    public static final Style STYLE_PRIMARY_BLACK = new Style("STYLE_PRIMARY_BLACK", 7);
    public static final Style STYLE_SECONDARY_BLACK = new Style("STYLE_SECONDARY_BLACK", 8);
    public static final Style STYLE_PRIMARY_WHITE = new Style("STYLE_PRIMARY_WHITE", 9);
    public static final Style STYLE_SECONDARY_WHITE = new Style("STYLE_SECONDARY_WHITE", 10);
    public static final Style STYLE_CLEAR_NEUTRAL = new Style("STYLE_CLEAR_NEUTRAL", 11);
    public static final Style STYLE_CLEAR_PRIMARY = new Style("STYLE_CLEAR_PRIMARY", 12);

    private static final /* synthetic */ Style[] $values() {
        return new Style[]{STYLE_PRIMARY, STYLE_SECONDARY, STYLE_EXPRESS, STYLE_NEUTRAL, STYLE_NEGATIVE, STYLE_DISABLED, STYLE_VIDEO, STYLE_PRIMARY_BLACK, STYLE_SECONDARY_BLACK, STYLE_PRIMARY_WHITE, STYLE_SECONDARY_WHITE, STYLE_CLEAR_NEUTRAL, STYLE_CLEAR_PRIMARY};
    }

    static {
        Style[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Style(String str, int i11) {
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) $VALUES.clone();
    }
}
