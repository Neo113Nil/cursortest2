package ru.ozon.app.android.marketing.widgets.stickyLadder.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewModel;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderAsyncViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ru/ozon/app/android/marketing/widgets/stickyLadder/di/StickyLadderComponent$Companion$create$1$1", "Lru/ozon/app/android/marketing/widgets/stickyLadder/di/StickyLadderComponent;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel;", "stickyLadderAsyncViewModel$delegate", "LSc/j;", "getStickyLadderAsyncViewModel", "()Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel;", "stickyLadderAsyncViewModel", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "sellerActionPreviewProgressLadderViewModel$delegate", "getSellerActionPreviewProgressLadderViewModel", "()Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "sellerActionPreviewProgressLadderViewModel", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyLadderComponent$Companion$create$1$1 implements StickyLadderComponent {
    private final CartServiceApi cartServiceApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

    /* renamed from: stickyLadderAsyncViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stickyLadderAsyncViewModel = k.b(new StickyLadderComponent$Companion$create$1$1$stickyLadderAsyncViewModel$2(this));

    /* renamed from: sellerActionPreviewProgressLadderViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sellerActionPreviewProgressLadderViewModel = k.b(StickyLadderComponent$Companion$create$1$1$sellerActionPreviewProgressLadderViewModel$2.INSTANCE);

    StickyLadderComponent$Companion$create$1$1(C7475g c7475g) {
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
    }

    @Override // ru.ozon.app.android.marketing.widgets.stickyLadder.di.StickyLadderComponent
    public SellerActionPreviewProgressLadderViewModel getSellerActionPreviewProgressLadderViewModel() {
        return (SellerActionPreviewProgressLadderViewModel) this.sellerActionPreviewProgressLadderViewModel.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.stickyLadder.di.StickyLadderComponent
    public StickyLadderAsyncViewModel getStickyLadderAsyncViewModel() {
        return (StickyLadderAsyncViewModel) this.stickyLadderAsyncViewModel.getValue();
    }
}
