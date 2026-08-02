package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.recyclerview;

import WZ.l;
import WZ.t;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.domain.CheckoutProductsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemView;", "contentView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemView;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;)Lkotlin/Unit;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductItemView;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutProductItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CheckoutProductItemView contentView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutProductItemViewHolder(@NotNull CheckoutProductItemView contentView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(contentView);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.contentView = contentView;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final Unit bind(@NotNull CheckoutProductsVO.ProductSplitVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.contentView.bind(item, this.actionHandler, this.tokenizedAnalytics);
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        return Unit.f71690a;
    }
}
