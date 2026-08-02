package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ViewModel;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/productsforreviewV2/di/ProductsForReviewV2Component$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/di/ProductsForReviewV2Component;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "getActionComponentApi", "()Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductsForReviewV2ViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()LPc/a;", "viewModel", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2Mapper;", "mapper", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewV2Component$Companion$create$1$1 implements ProductsForReviewV2Component {
    private final ActionComponentApi actionComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new ProductsForReviewV2Component$Companion$create$1$1$viewModel$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ProductsForReviewV2Component$Companion$create$1$1$mapper$2.INSTANCE);

    ProductsForReviewV2Component$Companion$create$1$1(C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
    }

    public final ActionComponentApi getActionComponentApi() {
        return this.actionComponentApi;
    }

    public final StorageComponentApi getStorageComponentApi() {
        return this.storageComponentApi;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.di.ProductsForReviewV2Component
    public Pc.a<ProductsForReviewV2ViewModel> getViewModel() {
        return (Pc.a) this.viewModel.getValue();
    }
}
