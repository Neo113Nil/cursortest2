package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.SellerActionsPreviewDtoToDtoWrapperMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async.SellerActionsPreviewAsyncViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerActionsPreviewComponent$Companion$create$1$1$sellerActionsPreviewAsyncViewModel$2 extends AbstractC7737t implements Function0<SellerActionsPreviewAsyncViewModel> {
    final /* synthetic */ SellerActionsPreviewComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerActionsPreviewComponent$Companion$create$1$1$sellerActionsPreviewAsyncViewModel$2(SellerActionsPreviewComponent$Companion$create$1$1 sellerActionsPreviewComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = sellerActionsPreviewComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SellerActionsPreviewAsyncViewModel invoke() {
        CartServiceApi cartServiceApi;
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        cartServiceApi = this.this$0.cartServiceApi;
        CartService cartService = cartServiceApi.getCartService();
        composerWidgetAsyncComponentApi = this.this$0.composerWidgetAsyncComponentApi;
        return new SellerActionsPreviewAsyncViewModel(cartService, composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository(), new SellerActionsPreviewDtoToDtoWrapperMapper(), this.this$0.isSelect());
    }
}
