package cV;

import android.content.SharedPreferences;
import k20.C7475g;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModelImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56876c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f56874a = i11;
        this.f56875b = obj;
        this.f56876c = obj2;
    }

    @Override // Pc.a
    public final Object get() {
        ReviewGalleryV2MainViewModelImpl mainViewModel$lambda$3;
        AddToCartViewModel addToCartViewModelProvider$lambda$1;
        switch (this.f56874a) {
            case 0:
                mainViewModel$lambda$3 = ReviewGalleryComponent$Companion$create$1$1.mainViewModel$lambda$3((ReviewGalleryComponent$Companion$create$1$1) this.f56875b, (SharedPreferences) this.f56876c);
                return mainViewModel$lambda$3;
            default:
                addToCartViewModelProvider$lambda$1 = CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1.addToCartViewModelProvider$lambda$1((C7475g) this.f56875b, (CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1) this.f56876c);
                return addToCartViewModelProvider$lambda$1;
        }
    }
}
