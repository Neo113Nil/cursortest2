package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.recyclerview;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.domain.CheckoutProductsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemViewHolder;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutProductsAdapter extends t<CheckoutProductsVO.ProductSplitVO, CheckoutProductItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutProductsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(CheckoutProductsDiffUtilCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CheckoutProductItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CheckoutProductsVO.ProductSplitVO productSplitVO = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(productSplitVO, "get(...)");
        holder.bind(productSplitVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CheckoutProductItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new CheckoutProductItemViewHolder(new CheckoutProductItemView(context, null, 0, 6, null), this.actionHandler, this.tokenizedAnalytics);
    }
}
