package ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.o;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult;
import ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.favorites.ui.notification.FavoritesNotification;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/viewmodel/FavoriteToggleProductButtonViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractor;", "favoriteToggleProductButtonInteractor", "<init>", "(Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractor;)V", "", "", "Lze/h;", "Lru/ozon/app/android/favorites/ui/notification/FavoritesNotification;", "id", "getById", "(Ljava/util/Map;J)Lze/h;", "", "canProcessAction", "(Ljava/lang/Long;)Z", "LAe/h;", "observeNotificationEvents", "(J)LAe/h;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractor;", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/viewmodel/FavoriteToggleProductButtonUIState;", "buttonStates", "Ljava/util/Map;", "notificationChannels", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteToggleProductButtonViewModel extends w0 {

    @NotNull
    private final Map<Long, FavoriteToggleProductButtonUIState> buttonStates;

    @NotNull
    private final FavoriteToggleProductButtonInteractor favoriteToggleProductButtonInteractor;

    @NotNull
    private final Map<Long, h<FavoritesNotification>> notificationChannels;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel.FavoriteToggleProductButtonViewModel$1", f = "FavoriteToggleProductButtonViewModel.kt", l = {41, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel.FavoriteToggleProductButtonViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<FavoriteToggleProductButtonChangeResult, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = FavoriteToggleProductButtonViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        
            if (r1.n(r2, r9) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        
            if (r10.n(r1, r9) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                FavoriteToggleProductButtonChangeResult favoriteToggleProductButtonChangeResult = (FavoriteToggleProductButtonChangeResult) this.L$0;
                Long sku = favoriteToggleProductButtonChangeResult.getSku();
                if (sku == null && (sku = favoriteToggleProductButtonChangeResult.getGiftId()) == null) {
                    return Unit.f71690a;
                }
                long longValue = sku.longValue();
                FavoriteToggleProductButtonViewModel.this.buttonStates.put(new Long(longValue), new FavoriteToggleProductButtonUIState(false));
                if (favoriteToggleProductButtonChangeResult instanceof FavoriteToggleProductButtonChangeResult.Success) {
                    FavoriteToggleProductButtonViewModel favoriteToggleProductButtonViewModel = FavoriteToggleProductButtonViewModel.this;
                    h byId = favoriteToggleProductButtonViewModel.getById(favoriteToggleProductButtonViewModel.notificationChannels, longValue);
                    FavoritesNotification.Success success = new FavoritesNotification.Success(((FavoriteToggleProductButtonChangeResult.Success) favoriteToggleProductButtonChangeResult).getNotification());
                    this.label = 1;
                } else {
                    if (!(favoriteToggleProductButtonChangeResult instanceof FavoriteToggleProductButtonChangeResult.Failure)) {
                        throw new o();
                    }
                    FavoriteToggleProductButtonViewModel favoriteToggleProductButtonViewModel2 = FavoriteToggleProductButtonViewModel.this;
                    h byId2 = favoriteToggleProductButtonViewModel2.getById(favoriteToggleProductButtonViewModel2.notificationChannels, longValue);
                    FavoritesNotification.Error error = FavoritesNotification.Error.INSTANCE;
                    this.label = 2;
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FavoriteToggleProductButtonChangeResult favoriteToggleProductButtonChangeResult, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(favoriteToggleProductButtonChangeResult, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public FavoriteToggleProductButtonViewModel(@NotNull FavoriteToggleProductButtonInteractor favoriteToggleProductButtonInteractor) {
        Intrinsics.checkNotNullParameter(favoriteToggleProductButtonInteractor, "favoriteToggleProductButtonInteractor");
        this.favoriteToggleProductButtonInteractor = favoriteToggleProductButtonInteractor;
        this.buttonStates = new HashMap();
        this.notificationChannels = new HashMap();
        C2399j.C(favoriteToggleProductButtonInteractor.observeRequests(), x0.a(this));
        C2399j.C(new C2408n0(favoriteToggleProductButtonInteractor.getFavoriteToggleProductButtonUpdates(), new AnonymousClass1(null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h<FavoritesNotification> getById(Map<Long, h<FavoritesNotification>> map, long j11) {
        Long valueOf = Long.valueOf(j11);
        h<FavoritesNotification> hVar = map.get(valueOf);
        if (hVar == null) {
            hVar = k.a(-2, 6, null);
            map.put(valueOf, hVar);
        }
        return hVar;
    }

    public final boolean canProcessAction(Long id2) {
        if (id2 == null) {
            return false;
        }
        Map<Long, FavoriteToggleProductButtonUIState> map = this.buttonStates;
        FavoriteToggleProductButtonUIState favoriteToggleProductButtonUIState = map.get(id2);
        if (favoriteToggleProductButtonUIState == null) {
            favoriteToggleProductButtonUIState = new FavoriteToggleProductButtonUIState(false);
            map.put(id2, favoriteToggleProductButtonUIState);
        }
        return !favoriteToggleProductButtonUIState.getEnabled();
    }

    @NotNull
    public final InterfaceC2395h<FavoritesNotification> observeNotificationEvents(long id2) {
        return C2399j.H(getById(this.notificationChannels, id2));
    }

    public final void processAction(@NotNull AtomAction.ComposerAction action, @NotNull c trackingData) {
        long longValue;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Long extractListIdFromFavoriteAction = ActionHandlersUtilsKt.extractListIdFromFavoriteAction(action);
        if (extractListIdFromFavoriteAction != null) {
            long longValue2 = extractListIdFromFavoriteAction.longValue();
            Long extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction(action);
            Long extractGiftIdFromFavoriteAction = ActionHandlersUtilsKt.extractGiftIdFromFavoriteAction(action);
            String extractUniqIdFromFavoriteAction = ActionHandlersUtilsKt.extractUniqIdFromFavoriteAction(action);
            if (extractSkuFromFavoriteAction != null) {
                longValue = extractSkuFromFavoriteAction.longValue();
            } else if (extractGiftIdFromFavoriteAction == null) {
                return;
            } else {
                longValue = extractGiftIdFromFavoriteAction.longValue();
            }
            this.buttonStates.put(Long.valueOf(longValue), new FavoriteToggleProductButtonUIState(true));
            C10727i.c(x0.a(this), null, null, new FavoriteToggleProductButtonViewModel$processAction$1(this, extractSkuFromFavoriteAction, longValue2, extractGiftIdFromFavoriteAction, extractUniqIdFromFavoriteAction, action, trackingData, null), 3);
        }
    }
}
