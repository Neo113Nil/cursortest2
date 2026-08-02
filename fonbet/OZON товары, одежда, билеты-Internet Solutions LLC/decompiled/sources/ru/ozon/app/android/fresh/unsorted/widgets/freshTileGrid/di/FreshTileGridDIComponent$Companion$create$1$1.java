package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di;

import BZ.e;
import Sc.InterfaceC4008j;
import Sg.a;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.ProductMediaDelegate;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent$Companion$create$1$1;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u00060\tj\u0002`\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/di/FreshTileGridDIComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/di/FreshTileGridDIComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "getFreshTileDelegateV2", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "freshTileDelegateV2", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTileGridDIComponent$Companion$create$1$1 implements FreshTileGridDIComponent {
    final /* synthetic */ InterfaceC4008j<ActionV2Repository> $actionRepository$delegate;
    final /* synthetic */ InterfaceC4008j<AdultHandler> $adultHandler$delegate;
    final /* synthetic */ InterfaceC4008j<a> $analyticsScreenStorage$delegate;
    final /* synthetic */ InterfaceC4008j<CartService> $cartService$delegate;
    final /* synthetic */ InterfaceC4008j<FavoriteManager> $favoriteManager$delegate;
    final /* synthetic */ InterfaceC4008j<e> $miniAppConfigHolder$delegate;
    final /* synthetic */ C7475g $storage;
    private final Pc.a<FreshTileViewModel> viewModelProvider;

    /* JADX WARN: Multi-variable type inference failed */
    FreshTileGridDIComponent$Companion$create$1$1(C7475g c7475g, final InterfaceC4008j<? extends CartService> interfaceC4008j, final InterfaceC4008j<? extends AdultHandler> interfaceC4008j2, InterfaceC4008j<? extends FavoriteManager> interfaceC4008j3, InterfaceC4008j<? extends ActionV2Repository> interfaceC4008j4, InterfaceC4008j<? extends a> interfaceC4008j5, InterfaceC4008j<e> interfaceC4008j6) {
        this.$storage = c7475g;
        this.$cartService$delegate = interfaceC4008j;
        this.$adultHandler$delegate = interfaceC4008j2;
        this.$favoriteManager$delegate = interfaceC4008j3;
        this.$actionRepository$delegate = interfaceC4008j4;
        this.$analyticsScreenStorage$delegate = interfaceC4008j5;
        this.$miniAppConfigHolder$delegate = interfaceC4008j6;
        this.viewModelProvider = new Pc.a() { // from class: qx.b
            @Override // Pc.a
            public final Object get() {
                FreshTileViewModel viewModelProvider$lambda$1;
                viewModelProvider$lambda$1 = FreshTileGridDIComponent$Companion$create$1$1.viewModelProvider$lambda$1(InterfaceC4008j.this, interfaceC4008j2, this);
                return viewModelProvider$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreshTileViewModel viewModelProvider$lambda$1(InterfaceC4008j interfaceC4008j, InterfaceC4008j interfaceC4008j2, FreshTileGridDIComponent$Companion$create$1$1 freshTileGridDIComponent$Companion$create$1$1) {
        CartService create$lambda$0;
        AdultHandler create$lambda$1;
        create$lambda$0 = FreshTileGridDIComponent.Companion.create$lambda$0(interfaceC4008j);
        create$lambda$1 = FreshTileGridDIComponent.Companion.create$lambda$1(interfaceC4008j2);
        FreshTileViewModel freshTileViewModel = new FreshTileViewModel(create$lambda$0, create$lambda$1);
        freshTileViewModel.init(freshTileGridDIComponent$Companion$create$1$1.getTokenizedAnalytics());
        return freshTileViewModel;
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent
    public FeatureChecker getFeatureChecker() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getFeatureChecker();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent
    public FreshTileDelegateV2 getFreshTileDelegateV2() {
        FavoriteManager create$lambda$5;
        AdultHandler create$lambda$1;
        ActionV2Repository create$lambda$2;
        a create$lambda$3;
        e create$lambda$4;
        AdultHandler create$lambda$12;
        CartService create$lambda$0;
        AdultHandler create$lambda$13;
        l tokenizedAnalytics = getTokenizedAnalytics();
        create$lambda$5 = FreshTileGridDIComponent.Companion.create$lambda$5(this.$favoriteManager$delegate);
        create$lambda$1 = FreshTileGridDIComponent.Companion.create$lambda$1(this.$adultHandler$delegate);
        create$lambda$2 = FreshTileGridDIComponent.Companion.create$lambda$2(this.$actionRepository$delegate);
        create$lambda$3 = FreshTileGridDIComponent.Companion.create$lambda$3(this.$analyticsScreenStorage$delegate);
        create$lambda$4 = FreshTileGridDIComponent.Companion.create$lambda$4(this.$miniAppConfigHolder$delegate);
        FreshFavoriteDelegate freshFavoriteDelegate = new FreshFavoriteDelegate(create$lambda$5, create$lambda$1, create$lambda$2, create$lambda$3, create$lambda$4, getTokenizedAnalytics());
        l tokenizedAnalytics2 = getTokenizedAnalytics();
        create$lambda$12 = FreshTileGridDIComponent.Companion.create$lambda$1(this.$adultHandler$delegate);
        create$lambda$0 = FreshTileGridDIComponent.Companion.create$lambda$0(this.$cartService$delegate);
        ProductActionBarDelegate productActionBarDelegate = new ProductActionBarDelegate(tokenizedAnalytics2, create$lambda$12, create$lambda$0);
        create$lambda$13 = FreshTileGridDIComponent.Companion.create$lambda$1(this.$adultHandler$delegate);
        return new FreshTileDelegateV2(tokenizedAnalytics, freshFavoriteDelegate, productActionBarDelegate, new ProductMediaDelegate(create$lambda$13));
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent
    public Pc.a<FreshTileViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
