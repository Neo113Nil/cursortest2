package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.R$layout;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0014R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponsContainerViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponsContainerVO;", "parent", "Landroid/view/ViewGroup;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "containerView", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Landroid/view/ViewGroup;)V", "onBind", "vo", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CouponsContainerViewHolder extends ProductListItemViewHolder<CouponsContainerVO> {

    @NotNull
    private final ViewGroup containerView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CouponsContainerViewHolder(ViewGroup viewGroup, Function1 function1, ViewGroup viewGroup2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, function1, viewGroup2);
        if ((i11 & 4) != 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.view_social_coupons_container, viewGroup, false);
            Intrinsics.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) inflate;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder
    public void onBind(@NotNull CouponsContainerVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.containerView.removeAllViews();
        int i11 = 0;
        for (Object obj : vo.getCoupons()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CouponViewHolder couponViewHolder = new CouponViewHolder(this.containerView, null, null, null, 14, null);
            int P11 = C7714v.P(vo.getCoupons()) - i11;
            couponViewHolder.bind((CouponVO) obj, P11);
            FrameLayout constraintLayout = couponViewHolder.getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388613;
            layoutParams2.setMargins(0, 0, ResourceExtKt.toPx(12) * P11, 0);
            constraintLayout.setLayoutParams(layoutParams2);
            this.containerView.addView(couponViewHolder.getBinding().getConstraintLayout());
            i11 = i12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsContainerViewHolder(@NotNull ViewGroup parent, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull ViewGroup containerView) {
        super(containerView, R$id.couponsListItem, onAction);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        containerView.setId(R$id.couponsListItem);
    }
}
