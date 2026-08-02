package ru.ozon.app.android.favorites.ui.favoriteReserveButton;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Pk0.c;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import g.C6594f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult;
import ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonUIState;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.J;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0013J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001f\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\"\u0010#J/\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120!2\b\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R(\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006,"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor;", "favoriteReserveButtonInteractor", "<init>", "(Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor;)V", "", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonViewModel$FavoriteReserveButtonKey;", "LAe/x0;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState;", "", "sku", "wishlistId", "", "uniqId", "get", "(Ljava/util/Map;Ljava/lang/Long;JLjava/lang/String;)LAe/x0;", "Lze/h;", "Lru/ozon/uni/atoms/af/AtomAction;", "(Ljava/util/Map;Ljava/lang/Long;JLjava/lang/String;)Lze/h;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "onReserveClick", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "molecule", "Lxe/B0;", "updateLocalState", "(Ljava/lang/Long;JLru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;Ljava/lang/String;)Lxe/B0;", "LAe/h;", "observeReservedState", "(Ljava/lang/Long;JLjava/lang/String;)LAe/h;", "id", "observeActionEvents", "Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor;", "reservedButtonState", "Ljava/util/Map;", "actionChannels", "Companion", "FavoriteReserveButtonKey", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteReserveButtonViewModel extends w0 {

    @NotNull
    private final Map<FavoriteReserveButtonKey, h<AtomAction>> actionChannels;

    @NotNull
    private final FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonInteractor;

    @NotNull
    private final Map<FavoriteReserveButtonKey, x0<FavoriteReserveButtonUIState>> reservedButtonState;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final J exceptionHandler = new FavoriteReserveButtonViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel$1", f = "FavoriteReserveButtonViewModel.kt", l = {47, 54}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<FavoriteReservedChangeResult, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = FavoriteReserveButtonViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
        
            if (r1.emit(r12, r11) != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            if (r12.n(r4, r11) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FavoriteReservedChangeResult favoriteReservedChangeResult;
            Object obj2;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                favoriteReservedChangeResult = (FavoriteReservedChangeResult) this.L$0;
                if (favoriteReservedChangeResult instanceof FavoriteReservedChangeResult.Success) {
                    FavoriteReservedChangeResult.Success success = (FavoriteReservedChangeResult.Success) favoriteReservedChangeResult;
                    AtomAction action = success.getAction();
                    if (action != null) {
                        FavoriteReserveButtonViewModel favoriteReserveButtonViewModel = FavoriteReserveButtonViewModel.this;
                        h m697get = favoriteReserveButtonViewModel.m697get((Map<FavoriteReserveButtonKey, h<AtomAction>>) favoriteReserveButtonViewModel.actionChannels, success.getSku(), success.getWishlistId(), success.getUniqId());
                        this.L$0 = favoriteReservedChangeResult;
                        this.label = 1;
                    }
                } else {
                    if (!(favoriteReservedChangeResult instanceof FavoriteReservedChangeResult.Error)) {
                        throw new o();
                    }
                    obj2 = FavoriteReserveButtonUIState.Error.INSTANCE;
                    FavoriteReserveButtonViewModel favoriteReserveButtonViewModel2 = FavoriteReserveButtonViewModel.this;
                    x0 x0Var = favoriteReserveButtonViewModel2.get((Map<FavoriteReserveButtonKey, x0<FavoriteReserveButtonUIState>>) favoriteReserveButtonViewModel2.reservedButtonState, favoriteReservedChangeResult.getSku(), favoriteReservedChangeResult.getWishlistId(), favoriteReservedChangeResult.getUniqId());
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                favoriteReservedChangeResult = (FavoriteReservedChangeResult) this.L$0;
                s.b(obj);
            }
            obj2 = new FavoriteReserveButtonUIState.Success(((FavoriteReservedChangeResult.Success) favoriteReservedChangeResult).getMolecule());
            FavoriteReserveButtonViewModel favoriteReserveButtonViewModel22 = FavoriteReserveButtonViewModel.this;
            x0 x0Var2 = favoriteReserveButtonViewModel22.get((Map<FavoriteReserveButtonKey, x0<FavoriteReserveButtonUIState>>) favoriteReserveButtonViewModel22.reservedButtonState, favoriteReservedChangeResult.getSku(), favoriteReservedChangeResult.getWishlistId(), favoriteReservedChangeResult.getUniqId());
            this.L$0 = null;
            this.label = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FavoriteReservedChangeResult favoriteReservedChangeResult, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(favoriteReservedChangeResult, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonViewModel$Companion;", "", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonViewModel$FavoriteReserveButtonKey;", "", "", "sku", "wishlistId", "", "uniqId", "<init>", "(Ljava/lang/Long;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "Ljava/lang/String;", "getUniqId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteReserveButtonKey {
        private final Long sku;
        private final String uniqId;
        private final long wishlistId;

        public FavoriteReserveButtonKey(Long l11, long j11, String str) {
            this.sku = l11;
            this.wishlistId = j11;
            this.uniqId = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FavoriteReserveButtonKey)) {
                return false;
            }
            FavoriteReserveButtonKey favoriteReserveButtonKey = (FavoriteReserveButtonKey) other;
            return Intrinsics.d(this.sku, favoriteReserveButtonKey.sku) && this.wishlistId == favoriteReserveButtonKey.wishlistId && Intrinsics.d(this.uniqId, favoriteReserveButtonKey.uniqId);
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.wishlistId);
            String str = this.uniqId;
            return a11 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l11 = this.sku;
            long j11 = this.wishlistId;
            String str = this.uniqId;
            StringBuilder sb2 = new StringBuilder("FavoriteReserveButtonKey(sku=");
            sb2.append(l11);
            sb2.append(", wishlistId=");
            sb2.append(j11);
            return C6594f.a(", uniqId=", str, ")", sb2);
        }
    }

    public FavoriteReserveButtonViewModel(@NotNull FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonInteractor) {
        Intrinsics.checkNotNullParameter(favoriteReserveButtonInteractor, "favoriteReserveButtonInteractor");
        this.favoriteReserveButtonInteractor = favoriteReserveButtonInteractor;
        this.reservedButtonState = new HashMap();
        this.actionChannels = new HashMap();
        C2399j.C(favoriteReserveButtonInteractor.observeRequests(), androidx.lifecycle.x0.a(this));
        C2399j.C(new C2408n0(favoriteReserveButtonInteractor.getFavoriteReserveButtonUpdates(), new AnonymousClass1(null)), androidx.lifecycle.x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0<FavoriteReserveButtonUIState> get(Map<FavoriteReserveButtonKey, x0<FavoriteReserveButtonUIState>> map, Long l11, long j11, String str) {
        FavoriteReserveButtonKey favoriteReserveButtonKey = new FavoriteReserveButtonKey(l11, j11, str);
        x0<FavoriteReserveButtonUIState> x0Var = map.get(favoriteReserveButtonKey);
        if (x0Var == null) {
            x0Var = O0.a(null);
            map.put(favoriteReserveButtonKey, x0Var);
        }
        return x0Var;
    }

    @NotNull
    public final InterfaceC2395h<AtomAction> observeActionEvents(Long id2, long wishlistId, String uniqId) {
        return C2399j.H(m697get(this.actionChannels, id2, wishlistId, uniqId));
    }

    @NotNull
    public final InterfaceC2395h<FavoriteReserveButtonUIState> observeReservedState(Long sku, long wishlistId, String uniqId) {
        return new C2406m0(get(this.reservedButtonState, sku, wishlistId, uniqId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onReserveClick(@NotNull AtomAction.ComposerAction action, @NotNull W10.c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Long extractListIdFromFavoriteAction = ActionHandlersUtilsKt.extractListIdFromFavoriteAction(action);
        if (extractListIdFromFavoriteAction != null) {
            long longValue = extractListIdFromFavoriteAction.longValue();
            Long extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction(action);
            String extractUniqIdFromFavoriteAction = ActionHandlersUtilsKt.extractUniqIdFromFavoriteAction(action);
            Long extractGiftIdFromFavoriteAction = ActionHandlersUtilsKt.extractGiftIdFromFavoriteAction(action);
            if ((extractSkuFromFavoriteAction == null ? extractUniqIdFromFavoriteAction : extractSkuFromFavoriteAction) == null) {
                return;
            }
            C10727i.c(androidx.lifecycle.x0.a(this), exceptionHandler, null, new FavoriteReserveButtonViewModel$onReserveClick$1(this, extractSkuFromFavoriteAction, longValue, extractUniqIdFromFavoriteAction, extractGiftIdFromFavoriteAction, action, trackingData, null), 2);
        }
    }

    @NotNull
    public final B0 updateLocalState(Long sku, long wishlistId, @NotNull FavoriteReserveButtonMolecule molecule, String uniqId) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        return C10727i.c(androidx.lifecycle.x0.a(this), exceptionHandler, null, new FavoriteReserveButtonViewModel$updateLocalState$1(this, sku, wishlistId, uniqId, molecule, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: get, reason: collision with other method in class */
    public final h<AtomAction> m697get(Map<FavoriteReserveButtonKey, h<AtomAction>> map, Long l11, long j11, String str) {
        FavoriteReserveButtonKey favoriteReserveButtonKey = new FavoriteReserveButtonKey(l11, j11, str);
        h<AtomAction> hVar = map.get(favoriteReserveButtonKey);
        if (hVar == null) {
            hVar = k.a(-2, 6, null);
            map.put(favoriteReserveButtonKey, hVar);
        }
        return hVar;
    }
}
