package ru.ozon.app.android.atoms.data.controls.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/Style;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_PRIMARY", "ACTION_SECONDARY", "ACTION_TERTIARY", "ACCENT_PRIMARY", "ACCENT_SECONDARY", "NEUTRAL_SECONDARY", "NEUTRAL_TERTIARY", "NEGATIVE_SECONDARY", "TRANSPARENT", "APPLE", "BIG_PROMO", "GOSUSLUGI", "FRESH_PRIMARY", "POSITIVE_PRIMARY", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Style {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Style[] $VALUES;
    public static final Style ACTION_PRIMARY = new Style("ACTION_PRIMARY", 0);
    public static final Style ACTION_SECONDARY = new Style("ACTION_SECONDARY", 1);
    public static final Style ACTION_TERTIARY = new Style("ACTION_TERTIARY", 2);
    public static final Style ACCENT_PRIMARY = new Style("ACCENT_PRIMARY", 3);
    public static final Style ACCENT_SECONDARY = new Style("ACCENT_SECONDARY", 4);
    public static final Style NEUTRAL_SECONDARY = new Style("NEUTRAL_SECONDARY", 5);
    public static final Style NEUTRAL_TERTIARY = new Style("NEUTRAL_TERTIARY", 6);
    public static final Style NEGATIVE_SECONDARY = new Style("NEGATIVE_SECONDARY", 7);
    public static final Style TRANSPARENT = new Style("TRANSPARENT", 8);
    public static final Style APPLE = new Style("APPLE", 9);
    public static final Style BIG_PROMO = new Style("BIG_PROMO", 10);
    public static final Style GOSUSLUGI = new Style("GOSUSLUGI", 11);
    public static final Style FRESH_PRIMARY = new Style("FRESH_PRIMARY", 12);
    public static final Style POSITIVE_PRIMARY = new Style("POSITIVE_PRIMARY", 13);

    private static final /* synthetic */ Style[] $values() {
        return new Style[]{ACTION_PRIMARY, ACTION_SECONDARY, ACTION_TERTIARY, ACCENT_PRIMARY, ACCENT_SECONDARY, NEUTRAL_SECONDARY, NEUTRAL_TERTIARY, NEGATIVE_SECONDARY, TRANSPARENT, APPLE, BIG_PROMO, GOSUSLUGI, FRESH_PRIMARY, POSITIVE_PRIMARY};
    }

    static {
        Style[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Style(String str, int i11) {
    }

    @NotNull
    public static a<Style> getEntries() {
        return $ENTRIES;
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) $VALUES.clone();
    }
}
