package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import WZ.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.cartdelegate.CartButtonDelegate;
import ru.ozon.app.android.product.databinding.WidgetSkuThinScrollItem248wVhBinding;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItem248wViewHolder;", "Lru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItemViewHolder;", "Lru/ozon/app/android/product/databinding/WidgetSkuThinScrollItem248wVhBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate;", "cartButtonDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "adultDelegate", "onTryToPreloadPdpVideo", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/product/databinding/WidgetSkuThinScrollItem248wVhBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroidx/recyclerview/widget/RecyclerView;", "stateElementsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getStateElementsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "stateElementsView", "Landroid/view/View;", "getStateElementsView", "()Landroid/view/View;", "Lru/ozon/uni/android/atom/icon/IconView;", "iconIv", "Lru/ozon/uni/android/atom/icon/IconView;", "getIconIv", "()Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "buttonIconIbv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getButtonIconIbv", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkuThinScrollItem248wViewHolder extends SkuThinScrollItemViewHolder<WidgetSkuThinScrollItem248wVhBinding> {

    @NotNull
    private final IconButtonV3View buttonIconIbv;

    @NotNull
    private final IconView iconIv;

    @NotNull
    private final RecyclerView stateElementsRv;

    @NotNull
    private final View stateElementsView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkuThinScrollItem248wViewHolder(@NotNull WidgetSkuThinScrollItem248wVhBinding binding, @NotNull ComposerReferences refs, AddToCartViewModel addToCartViewModel, @NotNull Function1<? super AtomAction, Unit> actionHandler, CartButtonDelegate cartButtonDelegate, AdultDelegate<SkuThinScrollVO.ItemVO> adultDelegate, Function1<? super AtomAction, Unit> function1, l lVar) {
        super(binding, refs, addToCartViewModel, actionHandler, cartButtonDelegate, adultDelegate, function1, lVar);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        RecyclerView stateElementsRv = binding.stateElementsRv;
        Intrinsics.checkNotNullExpressionValue(stateElementsRv, "stateElementsRv");
        this.stateElementsRv = stateElementsRv;
        View stateElementsView = binding.stateElementsView;
        Intrinsics.checkNotNullExpressionValue(stateElementsView, "stateElementsView");
        this.stateElementsView = stateElementsView;
        IconView iconIv = binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        this.iconIv = iconIv;
        IconButtonV3View buttonIconIbv = binding.buttonIconIbv;
        Intrinsics.checkNotNullExpressionValue(buttonIconIbv, "buttonIconIbv");
        this.buttonIconIbv = buttonIconIbv;
    }

    @Override // ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder
    @NotNull
    public IconButtonV3View getButtonIconIbv() {
        return this.buttonIconIbv;
    }

    @Override // ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder
    @NotNull
    public IconView getIconIv() {
        return this.iconIv;
    }

    @Override // ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder
    @NotNull
    public RecyclerView getStateElementsRv() {
        return this.stateElementsRv;
    }

    @Override // ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder
    @NotNull
    public View getStateElementsView() {
        return this.stateElementsView;
    }
}
