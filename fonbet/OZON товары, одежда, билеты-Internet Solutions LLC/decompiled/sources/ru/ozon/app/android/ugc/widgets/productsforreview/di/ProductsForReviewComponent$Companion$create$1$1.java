package ru.ozon.app.android.ugc.widgets.productsforreview.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.ugc.widgets.productsforreview.data.ProductsForReviewMapper;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductsForReviewViewModel;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"ru/ozon/app/android/ugc/widgets/productsforreview/di/ProductsForReviewComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/widgets/productsforreview/di/ProductsForReviewComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "LSc/j;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductsForReviewViewModel;", "productsForReviewViewModel$delegate", "getProductsForReviewViewModel", "()LPc/a;", "productsForReviewViewModel", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewComponent$Companion$create$1$1 implements ProductsForReviewComponent {
    final /* synthetic */ C7475g $storage;
    private final ActionComponentApi actionComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(ProductsForReviewComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new ProductsForReviewComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: productsForReviewViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productsForReviewViewModel = k.b(new ProductsForReviewComponent$Companion$create$1$1$productsForReviewViewModel$2(this));

    ProductsForReviewComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.ugc.widgets.productsforreview.di.ProductsForReviewComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.productsforreview.di.ProductsForReviewComponent
    public ProductsForReviewMapper getMapper() {
        return (ProductsForReviewMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.productsforreview.di.ProductsForReviewComponent
    public Pc.a<ProductsForReviewViewModel> getProductsForReviewViewModel() {
        return (Pc.a) this.productsForReviewViewModel.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.productsforreview.di.ProductsForReviewComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }
}
