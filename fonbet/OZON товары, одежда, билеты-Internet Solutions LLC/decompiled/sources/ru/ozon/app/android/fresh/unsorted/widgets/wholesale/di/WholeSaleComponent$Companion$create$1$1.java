package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleViewModel;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/wholesale/di/WholeSaleComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/di/WholeSaleComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel;", "viewModel", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WholeSaleComponent$Companion$create$1$1 implements WholeSaleComponent {
    private final CartServiceApi cartServiceApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new WholeSaleComponent$Companion$create$1$1$viewModel$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(WholeSaleComponent$Companion$create$1$1$mapper$2.INSTANCE);

    WholeSaleComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
    }

    public CartService getCartService() {
        return this.cartServiceApi.getCartService();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di.WholeSaleComponent
    public WholeSaleMapper getMapper() {
        return (WholeSaleMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di.WholeSaleComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di.WholeSaleComponent
    public WholeSaleViewModel getViewModel() {
        return (WholeSaleViewModel) this.viewModel.getValue();
    }
}
