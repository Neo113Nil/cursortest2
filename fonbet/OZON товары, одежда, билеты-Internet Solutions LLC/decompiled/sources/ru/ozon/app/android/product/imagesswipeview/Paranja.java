package ru.ozon.app.android.product.imagesswipeview;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/Paranja;", "", "<init>", "(Ljava/lang/String;I)V", "PARANJA_BOTH_THEMES", "PARANJA_DARK_THEME", "PARANJA_DISABLED", "PARANJA_DISABLED_WHITE_BACKGROUND", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Paranja {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Paranja[] $VALUES;
    public static final Paranja PARANJA_BOTH_THEMES = new Paranja("PARANJA_BOTH_THEMES", 0);
    public static final Paranja PARANJA_DARK_THEME = new Paranja("PARANJA_DARK_THEME", 1);
    public static final Paranja PARANJA_DISABLED = new Paranja("PARANJA_DISABLED", 2);
    public static final Paranja PARANJA_DISABLED_WHITE_BACKGROUND = new Paranja("PARANJA_DISABLED_WHITE_BACKGROUND", 3);

    private static final /* synthetic */ Paranja[] $values() {
        return new Paranja[]{PARANJA_BOTH_THEMES, PARANJA_DARK_THEME, PARANJA_DISABLED, PARANJA_DISABLED_WHITE_BACKGROUND};
    }

    static {
        Paranja[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Paranja(String str, int i11) {
    }

    public static Paranja valueOf(String str) {
        return (Paranja) Enum.valueOf(Paranja.class, str);
    }

    public static Paranja[] values() {
        return (Paranja[]) $VALUES.clone();
    }
}
