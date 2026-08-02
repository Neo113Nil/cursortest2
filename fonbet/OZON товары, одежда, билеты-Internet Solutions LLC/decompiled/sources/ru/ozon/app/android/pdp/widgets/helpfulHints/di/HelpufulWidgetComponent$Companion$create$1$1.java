package ru.ozon.app.android.pdp.widgets.helpfulHints.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.pdp.widgets.helpfulHints.data.HelpfulHintsMapper;
import ru.ozon.app.android.pdp.widgets.helpfulHints.presentation.HelpfulHintsViewModel;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010 \u001a\u00060\u001cj\u0002`\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"ru/ozon/app/android/pdp/widgets/helpfulHints/di/HelpufulWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/helpfulHints/di/HelpufulWidgetComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponent", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "getCustomActionHandlersComponent", "()Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "getFavoriteCoreComponentApi", "()Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "getCartServiceApi", "()Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/pdp/widgets/helpfulHints/data/HelpfulHintsMapper;", "helpfulHintsMapper$delegate", "LSc/j;", "getHelpfulHintsMapper", "()Lru/ozon/app/android/pdp/widgets/helpfulHints/data/HelpfulHintsMapper;", "helpfulHintsMapper", "Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;", "helpfulHintsViewModel$delegate", "getHelpfulHintsViewModel", "()Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;", "helpfulHintsViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpufulWidgetComponent$Companion$create$1$1 implements HelpufulWidgetComponent {
    private final CartServiceApi cartServiceApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponent;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;

    /* renamed from: helpfulHintsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j helpfulHintsMapper = k.b(HelpufulWidgetComponent$Companion$create$1$1$helpfulHintsMapper$2.INSTANCE);

    /* renamed from: helpfulHintsViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j helpfulHintsViewModel = k.b(new HelpufulWidgetComponent$Companion$create$1$1$helpfulHintsViewModel$2(this));

    HelpufulWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.customActionHandlersComponent = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
    }

    public final CartServiceApi getCartServiceApi() {
        return this.cartServiceApi;
    }

    @Override // ru.ozon.app.android.pdp.widgets.helpfulHints.di.HelpufulWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponent.getCustomActionHandlersStoreFactory();
    }

    public final FavoriteCoreComponentApi getFavoriteCoreComponentApi() {
        return this.favoriteCoreComponentApi;
    }

    @Override // ru.ozon.app.android.pdp.widgets.helpfulHints.di.HelpufulWidgetComponent
    public HelpfulHintsMapper getHelpfulHintsMapper() {
        return (HelpfulHintsMapper) this.helpfulHintsMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.helpfulHints.di.HelpufulWidgetComponent
    public HelpfulHintsViewModel getHelpfulHintsViewModel() {
        return (HelpfulHintsViewModel) this.helpfulHintsViewModel.getValue();
    }
}
