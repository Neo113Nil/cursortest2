package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel;

import Ae.C;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.s;
import WZ.l;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0019\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u0011J\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0013J\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0013J\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u001e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000200038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020)038\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavProductButtonV4ViewModel;", "", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor;", "favoriteProductInteractor", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcher", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "model", "", "needLocalFavStateUpdate", "", "updateLocalFavStateIfNeeded", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Z)V", "molecule", "observeFavoriteState", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "cancelJobs", "()V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "init", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;LWZ/l;Z)V", "onFavoriteClick", "onStart", "onStop", "onDestroy", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "LWZ/l;", "Lxe/B0;", "allFavoritesEventsJob", "Lxe/B0;", "lastFavoriteChangeJob", "LAe/x0;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState;", "_favState", "LAe/x0;", "Lxe/M;", "viewModelScope", "Lxe/M;", "Lze/h;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification;", "notificationChannel", "Lze/h;", "LAe/h;", "notificationEvent", "LAe/h;", "getNotificationEvent", "()LAe/h;", "favState", "getFavState", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavProductButtonV4ViewModel {

    @NotNull
    private final x0<FavMoleculeUIState> _favState;
    private B0 allFavoritesEventsJob;
    private AnalyticData analyticData;

    @NotNull
    private final CoroutineDispatcherProvider dispatcher;

    @NotNull
    private final InterfaceC2395h<FavMoleculeUIState> favState;

    @NotNull
    private final FavoriteProductMoleculeV4Interactor favoriteProductInteractor;
    private B0 lastFavoriteChangeJob;
    private FavoriteProductModel model;

    @NotNull
    private final h<FavMoleculeNotification> notificationChannel;

    @NotNull
    private final InterfaceC2395h<FavMoleculeNotification> notificationEvent;
    private l tokenizedAnalytics;

    @NotNull
    private final M viewModelScope;

    public FavProductButtonV4ViewModel(@NotNull FavoriteProductMoleculeV4Interactor favoriteProductInteractor, @NotNull CoroutineDispatcherProvider dispatcher) {
        Intrinsics.checkNotNullParameter(favoriteProductInteractor, "favoriteProductInteractor");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.favoriteProductInteractor = favoriteProductInteractor;
        this.dispatcher = dispatcher;
        x0<FavMoleculeUIState> a11 = O0.a(null);
        this._favState = a11;
        C2862e a12 = N.a(CoroutineContext.Element.a.d(dispatcher.getMainImmediate(), (H0) X0.b()));
        this.viewModelScope = a12;
        C11115c a13 = k.a(-2, 6, null);
        this.notificationChannel = a13;
        this.notificationEvent = C2399j.H(a13);
        this.favState = new C2406m0(C2399j.b(a11));
        C2399j.C(favoriteProductInteractor.observeRequests(), a12);
    }

    private final void cancelJobs() {
        B0 b02 = this.allFavoritesEventsJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.lastFavoriteChangeJob;
        if (b03 != null) {
            b03.j(null);
        }
    }

    private final void observeFavoriteState(FavoriteProductModel molecule) {
        final InterfaceC2395h<ProductFavoriteEvent> observeAllFavoritesEvents = this.favoriteProductInteractor.observeAllFavoritesEvents(molecule.getSku());
        this.allFavoritesEventsJob = C2399j.C(new C(new C2408n0(C2399j.B(new InterfaceC2395h<ProductFavoriteEvent>() { // from class: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel$observeFavoriteState$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel$observeFavoriteState$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ FavProductButtonV4ViewModel this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel$observeFavoriteState$$inlined$filter$1$2", f = "FavProductButtonV4ViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel$observeFavoriteState$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, FavProductButtonV4ViewModel favProductButtonV4ViewModel) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = favProductButtonV4ViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Integer changeSourceId = ((ProductFavoriteEvent) obj).getChangeSourceId();
                                int hashCode = this.this$0.hashCode();
                                if (changeSourceId == null || changeSourceId.intValue() != hashCode) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super ProductFavoriteEvent> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, this.dispatcher.getIO()), new FavProductButtonV4ViewModel$observeFavoriteState$2(this, null)), new FavProductButtonV4ViewModel$observeFavoriteState$3(null)), this.viewModelScope);
        this.lastFavoriteChangeJob = C2399j.C(new C(new C2408n0(C2399j.B(this.favoriteProductInteractor.observeLastFavoriteUpdates(molecule.getSku()), this.dispatcher.getIO()), new FavProductButtonV4ViewModel$observeFavoriteState$4(this, molecule, null)), new FavProductButtonV4ViewModel$observeFavoriteState$5(null)), this.viewModelScope);
    }

    private final void updateLocalFavStateIfNeeded(FavoriteProductModel model, boolean needLocalFavStateUpdate) {
        if (needLocalFavStateUpdate && model != null) {
            Boolean currentFavState = this.favoriteProductInteractor.getCurrentFavState(model.getSku());
            if (currentFavState == null || currentFavState.booleanValue() == model.getIsFavorite()) {
                return;
            }
            this.favoriteProductInteractor.updateLocalState(model);
        }
    }

    @NotNull
    public final InterfaceC2395h<FavMoleculeUIState> getFavState() {
        return this.favState;
    }

    @NotNull
    public final InterfaceC2395h<FavMoleculeNotification> getNotificationEvent() {
        return this.notificationEvent;
    }

    public final void init(FavoriteProductModel model, @NotNull AnalyticData analyticData, @NotNull l tokenizedAnalytics, boolean needLocalFavStateUpdate) {
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.model = model;
        this.analyticData = analyticData;
        this.tokenizedAnalytics = tokenizedAnalytics;
        cancelJobs();
        updateLocalFavStateIfNeeded(model, needLocalFavStateUpdate);
        if (model != null) {
            observeFavoriteState(model);
        }
    }

    public final void onDestroy() {
        cancelJobs();
        N.c(this.viewModelScope, null);
    }

    public final void onFavoriteClick(@NotNull FavoriteProductModel molecule) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        C10727i.c(this.viewModelScope, null, null, new FavProductButtonV4ViewModel$onFavoriteClick$1(this, molecule, null), 3);
    }

    public final void onStart() {
        cancelJobs();
        FavoriteProductModel favoriteProductModel = this.model;
        if (favoriteProductModel != null) {
            observeFavoriteState(favoriteProductModel);
        }
    }

    public final void onStop() {
        cancelJobs();
    }
}
