package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct;

import Lm0.a;
import Py.b;
import Ty.C4050a;
import Ty.C4051b;
import Ty.C4052c;
import WZ.l;
import WZ.t;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062$\b\u0002\u0010\u000f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062$\b\u0002\u0010\u000f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;", "", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor;", "favoriteProductInteractor", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "", "initSubscribers", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Lkotlin/Function1;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "processEvents", "onFavoriteUpdateClick", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lkotlin/jvm/functions/Function1;)V", "", "hasSelectionAction", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)Z", "onFavoriteChanged", "resubscribe", "shareMoleculeUpdateState", "clearDisposables", "()V", "dispose", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavProductButtonView;", "view", "attachView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavProductButtonView;)V", "getCurrentFavState", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "trackAnalyticsViewEventIfNeed", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "getAnalyticData", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "setAnalyticData", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavProductButtonPresenter {
    private AnalyticData analyticData;

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final FavoriteProductMoleculeInteractor favoriteProductInteractor;
    private WeakReference<FavProductButtonView> view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter$Companion;", "", "<init>", "()V", "SAVED_SELECTION_ID", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FavProductButtonPresenter(@NotNull FavoriteProductMoleculeInteractor favoriteProductInteractor) {
        Intrinsics.checkNotNullParameter(favoriteProductInteractor, "favoriteProductInteractor");
        this.favoriteProductInteractor = favoriteProductInteractor;
        this.compositeDisposable = new C8486a();
    }

    private final boolean hasSelectionAction(FavoriteProductMolecule favoriteProductMolecule) {
        AtomActionDTO action = FavoriteProductMoleculeKt.getButton(favoriteProductMolecule).getAction();
        return Intrinsics.d(action != null ? action.getLink() : null, "addOrDeleteSavedSelection");
    }

    private final void initSubscribers(FavoriteProductMolecule molecule) {
        C8486a c8486a = this.compositeDisposable;
        InterfaceC8487b subscribe = this.favoriteProductInteractor.observeOutFavoritesEvents(molecule.getSku()).observeOn(C8125a.a()).filter(new b(new FavProductButtonPresenter$initSubscribers$1(this), 4)).subscribe(new C4050a(new FavProductButtonPresenter$initSubscribers$2(this)), new C4051b(new FavProductButtonPresenter$initSubscribers$3(a.f17149a)));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
        C8486a c8486a2 = this.compositeDisposable;
        InterfaceC8487b subscribe2 = this.favoriteProductInteractor.observeFavoritesUpdates(molecule.getSku()).observeOn(C8125a.a()).subscribe(new C4052c(new FavProductButtonPresenter$initSubscribers$4(this, molecule), 1));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "subscribe(...)");
        RxExtKt.plusAssign(c8486a2, subscribe2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initSubscribers$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onFavoriteChanged$default(FavProductButtonPresenter favProductButtonPresenter, FavoriteProductMolecule favoriteProductMolecule, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        favProductButtonPresenter.onFavoriteChanged(favoriteProductMolecule, function1);
    }

    private final void onFavoriteUpdateClick(FavoriteProductMolecule molecule, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> processEvents) {
        FavProductButtonView favProductButtonView;
        FavoriteProductMoleculeInteractor favoriteProductMoleculeInteractor = this.favoriteProductInteractor;
        FavoriteProductMolecule copy$default = FavoriteProductMolecule.copy$default(molecule, null, 0L, false, null, null, null, Integer.valueOf(hashCode()), 63, null);
        WeakReference<FavProductButtonView> weakReference = this.view;
        favoriteProductMoleculeInteractor.addFavoriteChangeRequest(copy$default, (weakReference == null || (favProductButtonView = weakReference.get()) == null) ? null : favProductButtonView.getTokenizedAnalytics(), this.analyticData, hasSelectionAction(molecule), processEvents);
    }

    public final void attachView(@NotNull FavProductButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = new WeakReference<>(view);
    }

    public final void clearDisposables() {
        this.compositeDisposable.d();
    }

    public final void dispose() {
        this.compositeDisposable.dispose();
        this.view = null;
    }

    public final FavoriteProductMolecule getCurrentFavState(FavoriteProductMolecule molecule) {
        if (molecule == null) {
            return null;
        }
        Boolean currentFavState = this.favoriteProductInteractor.getCurrentFavState(molecule.getSku());
        if (currentFavState != null) {
            Boolean bool = molecule.isFavorite() != currentFavState.booleanValue() ? currentFavState : null;
            if (bool != null) {
                return FavoriteProductMolecule.copy$default(molecule, null, 0L, bool.booleanValue(), null, null, null, null, 123, null);
            }
        }
        return molecule;
    }

    public final void onFavoriteChanged(@NotNull FavoriteProductMolecule molecule, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> processEvents) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        onFavoriteUpdateClick(molecule, processEvents);
    }

    public final void resubscribe(FavoriteProductMolecule molecule) {
        this.compositeDisposable.d();
        if (molecule != null) {
            initSubscribers(molecule);
        }
    }

    public final void setAnalyticData(AnalyticData analyticData) {
        this.analyticData = analyticData;
    }

    public final void shareMoleculeUpdateState(FavoriteProductMolecule molecule) {
        if (molecule == null) {
            return;
        }
        this.favoriteProductInteractor.shareUpdateMolecule(molecule);
    }

    public final void trackAnalyticsViewEventIfNeed(FavoriteProductMolecule molecule) {
        WeakReference<FavProductButtonView> weakReference;
        FavProductButtonView favProductButtonView;
        l tokenizedAnalytics;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        if (molecule == null || !hasSelectionAction(molecule) || (weakReference = this.view) == null || (favProductButtonView = weakReference.get()) == null || (tokenizedAnalytics = favProductButtonView.getTokenizedAnalytics()) == null || (trackingInfo = FavoriteProductMoleculeKt.getButton(molecule).getTrackingInfo()) == null) {
            return;
        }
        AnalyticData analyticData = this.analyticData;
        t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, analyticData != null ? analyticData.getVoId() : null, null, 2, null);
        if (mapToTokenizedEvent$default == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }
}
