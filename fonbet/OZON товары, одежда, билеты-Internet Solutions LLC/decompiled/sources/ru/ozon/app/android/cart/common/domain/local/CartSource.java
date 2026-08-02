package ru.ozon.app.android.cart.common.domain.local;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/common/domain/local/CartSource;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL", "REMOTE", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CartSource[] $VALUES;
    public static final CartSource LOCAL = new CartSource("LOCAL", 0);
    public static final CartSource REMOTE = new CartSource("REMOTE", 1);

    private static final /* synthetic */ CartSource[] $values() {
        return new CartSource[]{LOCAL, REMOTE};
    }

    static {
        CartSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CartSource(String str, int i11) {
    }

    public static CartSource valueOf(String str) {
        return (CartSource) Enum.valueOf(CartSource.class, str);
    }

    public static CartSource[] values() {
        return (CartSource[]) $VALUES.clone();
    }
}
