package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async.SellerActionsPreviewAsyncViewModel;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;

@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"ru/ozon/app/android/marketing/widgets/sellerActionsPreview/di/SellerActionsPreviewComponent$Companion$create$1$1", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/di/SellerActionsPreviewComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel;", "sellerActionsPreviewAsyncViewModel$delegate", "LSc/j;", "getSellerActionsPreviewAsyncViewModel", "()Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel;", "sellerActionsPreviewAsyncViewModel", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "sellerActionPreviewProgressLadderViewModel$delegate", "getSellerActionPreviewProgressLadderViewModel", "()Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewModel;", "sellerActionPreviewProgressLadderViewModel", "", "isSelect$delegate", "isSelect", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerActionsPreviewComponent$Companion$create$1$1 implements SellerActionsPreviewComponent {
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final CartServiceApi cartServiceApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

    /* renamed from: isSelect$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j isSelect;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: sellerActionPreviewProgressLadderViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sellerActionPreviewProgressLadderViewModel;

    /* renamed from: sellerActionsPreviewAsyncViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sellerActionsPreviewAsyncViewModel;
    private final l tokenizedAnalytics;

    SellerActionsPreviewComponent$Companion$create$1$1(C7475g c7475g) {
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.retainComposerComponentApi = retainComposerComponentApi;
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
        this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
        this.sellerActionsPreviewAsyncViewModel = k.b(new SellerActionsPreviewComponent$Companion$create$1$1$sellerActionsPreviewAsyncViewModel$2(this));
        this.sellerActionPreviewProgressLadderViewModel = k.b(SellerActionsPreviewComponent$Companion$create$1$1$sellerActionPreviewProgressLadderViewModel$2.INSTANCE);
        this.isSelect = k.b(new SellerActionsPreviewComponent$Companion$create$1$1$isSelect$2(this));
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di.SellerActionsPreviewComponent
    public SellerActionPreviewProgressLadderViewModel getSellerActionPreviewProgressLadderViewModel() {
        return (SellerActionPreviewProgressLadderViewModel) this.sellerActionPreviewProgressLadderViewModel.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di.SellerActionsPreviewComponent
    public SellerActionsPreviewAsyncViewModel getSellerActionsPreviewAsyncViewModel() {
        return (SellerActionsPreviewAsyncViewModel) this.sellerActionsPreviewAsyncViewModel.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di.SellerActionsPreviewComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di.SellerActionsPreviewComponent
    public boolean isSelect() {
        return ((Boolean) this.isSelect.getValue()).booleanValue();
    }
}
