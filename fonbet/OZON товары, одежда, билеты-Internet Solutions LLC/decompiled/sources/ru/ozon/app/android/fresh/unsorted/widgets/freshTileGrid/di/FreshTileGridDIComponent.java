package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di;

import BZ.e;
import Sc.InterfaceC4008j;
import Sg.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aR\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/di/FreshTileGridDIComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "getFreshTileDelegateV2", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "freshTileDelegateV2", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FreshTileGridDIComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u0018²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/di/FreshTileGridDIComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/di/FreshTileGridDIComponent;", "create", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CartService create$lambda$0(InterfaceC4008j<? extends CartService> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AdultHandler create$lambda$1(InterfaceC4008j<? extends AdultHandler> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ActionV2Repository create$lambda$2(InterfaceC4008j<? extends ActionV2Repository> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a create$lambda$3(InterfaceC4008j<? extends a> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e create$lambda$4(InterfaceC4008j<e> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FavoriteManager create$lambda$5(InterfaceC4008j<? extends FavoriteManager> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FreshTileGridDIComponent create$lambda$6(C7475g c7475g, InterfaceC4008j interfaceC4008j, InterfaceC4008j interfaceC4008j2, InterfaceC4008j interfaceC4008j3, InterfaceC4008j interfaceC4008j4, InterfaceC4008j interfaceC4008j5, InterfaceC4008j interfaceC4008j6) {
            return new FreshTileGridDIComponent$Companion$create$1$1(c7475g, interfaceC4008j, interfaceC4008j2, interfaceC4008j3, interfaceC4008j4, interfaceC4008j5, interfaceC4008j6);
        }

        @NotNull
        public final C7473e<FreshTileGridDIComponent> create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            final InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new FreshTileGridDIComponent$Companion$create$cartService$2(storage));
            final InterfaceC4008j unsafeLazy2 = LazyUtilsKt.unsafeLazy(new FreshTileGridDIComponent$Companion$create$adultHandler$2(storage));
            final InterfaceC4008j unsafeLazy3 = LazyUtilsKt.unsafeLazy(new FreshTileGridDIComponent$Companion$create$actionRepository$2(storage));
            final InterfaceC4008j unsafeLazy4 = LazyUtilsKt.unsafeLazy(new FreshTileGridDIComponent$Companion$create$analyticsScreenStorage$2(storage));
            final InterfaceC4008j unsafeLazy5 = LazyUtilsKt.unsafeLazy(new FreshTileGridDIComponent$Companion$create$miniAppConfigHolder$2(storage));
            final InterfaceC4008j unsafeLazy6 = LazyUtilsKt.unsafeLazy(new FreshTileGridDIComponent$Companion$create$favoriteManager$2(storage));
            return new C7473e<>(N.b(FreshTileGridDIComponent.class), new InterfaceC7469a() { // from class: qx.a
                @Override // k20.InterfaceC7469a
                public final InterfaceC6958a component() {
                    FreshTileGridDIComponent create$lambda$6;
                    create$lambda$6 = FreshTileGridDIComponent.Companion.create$lambda$6(C7475g.this, unsafeLazy, unsafeLazy2, unsafeLazy6, unsafeLazy3, unsafeLazy4, unsafeLazy5);
                    return create$lambda$6;
                }
            });
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FreshTileDelegateV2 getFreshTileDelegateV2();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    Pc.a<FreshTileViewModel> getViewModelProvider();
}
