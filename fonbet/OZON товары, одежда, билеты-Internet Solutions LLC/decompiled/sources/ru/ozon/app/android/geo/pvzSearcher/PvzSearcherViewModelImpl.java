package ru.ozon.app.android.geo.pvzSearcher;

import Bc.e;
import Bc.i;
import Hs.d;
import W10.c;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.geo.addresseditformprompt.data.RecommendPvzRepository;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository;", "recommendPvzRepository", "<init>", "(Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "trackingData", "", "searchPvz", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "handle", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel$Action;", "actions", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActions", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PvzSearcherViewModelImpl extends w0 implements PvzSearcherViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SingleLiveEvent<PvzSearcherViewModel.Action> actions;

    @NotNull
    private final RecommendPvzRepository recommendPvzRepository;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl$Companion;", "", "<init>", "()V", "ACTION_SEARCH_PVZ", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PvzSearcherViewModelImpl(@NotNull RecommendPvzRepository recommendPvzRepository) {
        Intrinsics.checkNotNullParameter(recommendPvzRepository, "recommendPvzRepository");
        this.recommendPvzRepository = recommendPvzRepository;
        this.actions = new SingleLiveEvent<>();
    }

    private final void searchPvz(AtomAction.ComposerAction action, c trackingData) {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = new e(new i(this.recommendPvzRepository.getRecommendedPvz(action.getActionName(), trackingData).g(C8125a.a()), new DJ.e(new PvzSearcherViewModelImpl$searchPvz$1(this), 2)), new InterfaceC9019a() { // from class: Ky.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                PvzSearcherViewModelImpl.searchPvz$lambda$1(PvzSearcherViewModelImpl.this);
            }
        }).h(new Hs.c(new PvzSearcherViewModelImpl$searchPvz$3(this), 1), new d(new PvzSearcherViewModelImpl$searchPvz$4(this), 1));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void searchPvz$lambda$1(PvzSearcherViewModelImpl pvzSearcherViewModelImpl) {
        pvzSearcherViewModelImpl.getActions().setValue(PvzSearcherViewModel.Action.HideLoader.INSTANCE);
    }

    @Override // ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel
    public void handle(@NotNull AtomAction.ComposerAction action, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (Intrinsics.d(action.getId(), "searchPvz")) {
            searchPvz(action, trackingData);
        }
    }

    @Override // ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel
    @NotNull
    public SingleLiveEvent<PvzSearcherViewModel.Action> getActions() {
        return this.actions;
    }
}
