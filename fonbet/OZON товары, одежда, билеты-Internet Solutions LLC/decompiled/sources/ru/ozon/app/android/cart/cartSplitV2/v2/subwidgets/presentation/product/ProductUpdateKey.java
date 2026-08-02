package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import A00.a;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/ProductUpdateKey;", "LA00/a$J$a;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "state", "constructor-impl", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;)Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "", "toString-impl", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "getState", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final CartSplitV2ProductVO state;

    private /* synthetic */ ProductUpdateKey(CartSplitV2ProductVO cartSplitV2ProductVO) {
        this.state = cartSplitV2ProductVO;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProductUpdateKey m498boximpl(CartSplitV2ProductVO cartSplitV2ProductVO) {
        return new ProductUpdateKey(cartSplitV2ProductVO);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static CartSplitV2ProductVO m499constructorimpl(@NotNull CartSplitV2ProductVO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m500equalsimpl(CartSplitV2ProductVO cartSplitV2ProductVO, Object obj) {
        return (obj instanceof ProductUpdateKey) && Intrinsics.d(cartSplitV2ProductVO, ((ProductUpdateKey) obj).getState());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m501hashCodeimpl(CartSplitV2ProductVO cartSplitV2ProductVO) {
        return cartSplitV2ProductVO.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m502toStringimpl(CartSplitV2ProductVO cartSplitV2ProductVO) {
        return "ProductUpdateKey(state=" + cartSplitV2ProductVO + ")";
    }

    public boolean equals(Object obj) {
        return m500equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m501hashCodeimpl(this.state);
    }

    public String toString() {
        return m502toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ CartSplitV2ProductVO getState() {
        return this.state;
    }
}
