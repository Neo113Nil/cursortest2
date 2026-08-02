package ru.ozon.app.android.pdp.widgets.navBar.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.navBar.core.NavBarMapper;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarViewModel;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0010\u001a\u00060\u000bj\u0002`\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u00060\u001ej\u0002`\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"ru/ozon/app/android/pdp/widgets/navBar/di/NavBarWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/navBar/di/NavBarWidgetComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/pdp/widgets/navBar/core/NavBarMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/navBar/core/NavBarMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "navBarViewModel$delegate", "getNavBarViewModel", "()Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "navBarViewModel", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "viewedPond", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favMoleculeDelegateProvider", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarWidgetComponent$Companion$create$1$1 implements NavBarWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = DelegatesKt.lazyUnsafe(NavBarWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory = k.b(new NavBarWidgetComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));

    /* renamed from: navBarViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j navBarViewModel = k.b(new NavBarWidgetComponent$Companion$create$1$1$navBarViewModel$2(this));

    NavBarWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.di.NavBarWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.di.NavBarWidgetComponent
    public ProductFavoriteDelegateProvider getFavMoleculeDelegateProvider() {
        return ((FavoriteComponentApi) this.$storage.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.di.NavBarWidgetComponent
    public NavBarMapper getMapper() {
        return (NavBarMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.di.NavBarWidgetComponent
    public NavBarViewModel getNavBarViewModel() {
        return (NavBarViewModel) this.navBarViewModel.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.di.NavBarWidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.di.NavBarWidgetComponent
    public f getViewedPond() {
        return getRetainComposerComponentApi().getViewedPond();
    }
}
