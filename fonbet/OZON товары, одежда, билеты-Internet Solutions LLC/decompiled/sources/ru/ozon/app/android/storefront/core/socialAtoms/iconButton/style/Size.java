package ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_XL", "SIZE_L", "SIZE_M", "SIZE_S", "SIZE_XS", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Size {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Size[] $VALUES;
    public static final Size SIZE_XL = new Size("SIZE_XL", 0);
    public static final Size SIZE_L = new Size("SIZE_L", 1);
    public static final Size SIZE_M = new Size("SIZE_M", 2);
    public static final Size SIZE_S = new Size("SIZE_S", 3);
    public static final Size SIZE_XS = new Size("SIZE_XS", 4);

    private static final /* synthetic */ Size[] $values() {
        return new Size[]{SIZE_XL, SIZE_L, SIZE_M, SIZE_S, SIZE_XS};
    }

    static {
        Size[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Size(String str, int i11) {
    }

    public static Size valueOf(String str) {
        return (Size) Enum.valueOf(Size.class, str);
    }

    public static Size[] values() {
        return (Size[]) $VALUES.clone();
    }
}
