package ru.ozon.app.android.cart.common.domain;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MAIN_CART", "FAMILY_CART", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CartType[] $VALUES;
    private final String type;
    public static final CartType MAIN_CART = new CartType("MAIN_CART", 0, null, 1, null);
    public static final CartType FAMILY_CART = new CartType("FAMILY_CART", 1, "family");

    private static final /* synthetic */ CartType[] $values() {
        return new CartType[]{MAIN_CART, FAMILY_CART};
    }

    static {
        CartType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CartType(String str, int i11, String str2) {
        this.type = str2;
    }

    @NotNull
    public static a<CartType> getEntries() {
        return $ENTRIES;
    }

    public static CartType valueOf(String str) {
        return (CartType) Enum.valueOf(CartType.class, str);
    }

    public static CartType[] values() {
        return (CartType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    /* synthetic */ CartType(String str, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 1) != 0 ? null : str2);
    }
}
