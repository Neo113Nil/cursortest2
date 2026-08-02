package ru.ozon.app.android.storefront.core.socialAtoms.productList.items;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "", "<init>", "(Ljava/lang/String;I)V", "LARGE", "SMALL", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ViewSize[] $VALUES;
    public static final ViewSize LARGE = new ViewSize("LARGE", 0);
    public static final ViewSize SMALL = new ViewSize("SMALL", 1);

    private static final /* synthetic */ ViewSize[] $values() {
        return new ViewSize[]{LARGE, SMALL};
    }

    static {
        ViewSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ViewSize(String str, int i11) {
    }

    public static ViewSize valueOf(String str) {
        return (ViewSize) Enum.valueOf(ViewSize.class, str);
    }

    public static ViewSize[] values() {
        return (ViewSize[]) $VALUES.clone();
    }
}
