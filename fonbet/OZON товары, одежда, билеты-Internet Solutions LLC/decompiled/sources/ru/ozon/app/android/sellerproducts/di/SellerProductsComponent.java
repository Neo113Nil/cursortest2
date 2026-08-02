package ru.ozon.app.android.sellerproducts.di;

import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductActionSheetProxyBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductAdultImageWithVideoCoverBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductBackgroundBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductBadgesBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductButtonBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductButtonSubtitleBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductStateRecyclerViewBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.overlay.ProductOverlayBinderProvider;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.ProductToManyMapper;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 +2\u00020\u0001:\u0001+R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010*\u001a\u00060&j\u0002`'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/sellerproducts/di/SellerProductsComponent;", "Lhi/a;", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "getMapper", "()Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "mapper", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBadgesBinder;", "getProductBadgesBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBadgesBinder;", "productBadgesBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/overlay/ProductOverlayBinderProvider;", "getProductOverlayBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/overlay/ProductOverlayBinderProvider;", "productOverlayBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonSubtitleBinder;", "getProductButtonSubtitleBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonSubtitleBinder;", "productButtonSubtitleBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBackgroundBinder;", "getProductBackgroundBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductBackgroundBinder;", "productBackgroundBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductAdultImageWithVideoCoverBinder;", "getProductAdultImageWithVideoCoverBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductAdultImageWithVideoCoverBinder;", "productAdultImageWithVideoCoverBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonBinder;", "getProductButtonBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonBinder;", "productButtonBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder;", "getProductStateRecyclerViewBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder;", "productStateRecyclerViewBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetProxyBinder;", "getProductActionSheetProxyBinder", "()Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetProxyBinder;", "productActionSheetProxyBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SellerProductsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/sellerproducts/di/SellerProductsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/sellerproducts/di/SellerProductsComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/sellerproducts/di/SellerProductsComponent;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SellerProductsComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new SellerProductsComponent$Companion$create$1(storage);
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ProductToManyMapper getMapper();

    @NotNull
    ProductActionSheetProxyBinder getProductActionSheetProxyBinder();

    @NotNull
    ProductAdultImageWithVideoCoverBinder getProductAdultImageWithVideoCoverBinder();

    @NotNull
    ProductBackgroundBinder getProductBackgroundBinder();

    @NotNull
    ProductBadgesBinder getProductBadgesBinder();

    @NotNull
    ProductButtonBinder getProductButtonBinder();

    @NotNull
    ProductButtonSubtitleBinder getProductButtonSubtitleBinder();

    @NotNull
    ProductOverlayBinderProvider getProductOverlayBinder();

    @NotNull
    ProductStateRecyclerViewBinder getProductStateRecyclerViewBinder();
}
