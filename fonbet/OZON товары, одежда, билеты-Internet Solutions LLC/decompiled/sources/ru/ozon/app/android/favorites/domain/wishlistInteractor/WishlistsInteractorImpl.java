package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Ak.C2436a;
import G.g;
import He.b;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListResponse;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RemoveFavoritesListsRequest;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistDelete;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractorImpl;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractor;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repo", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractorImpl$WishlistChangeRequest;", "request", "", "handleRequest", "(Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractorImpl$WishlistChangeRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "deleteWishlist", "(JLW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "permission", "shareWishlist", "(JLjava/lang/String;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "addWishlistChangeRequest", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/w0;", "wishlistChangeRequests", "LAe/w0;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistUpdate;", "_wishlistsUpdates", "LAe/h;", "wishlistsUpdates", "LAe/h;", "getWishlistsUpdates", "()LAe/h;", "Companion", "WishlistChangeRequest", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistsInteractorImpl implements WishlistsInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final M coroutineScope;

    @NotNull
    private final w0<WishlistUpdate> _wishlistsUpdates;

    @NotNull
    private final ActionV2Repository actionV2Repo;

    @NotNull
    private final w0<WishlistChangeRequest> wishlistChangeRequests;

    @NotNull
    private final InterfaceC2395h<WishlistUpdate> wishlistsUpdates;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractorImpl$WishlistChangeRequest;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractorImpl$1", f = "WishlistsInteractorImpl.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractorImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<WishlistChangeRequest, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = WishlistsInteractorImpl.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                WishlistChangeRequest wishlistChangeRequest = (WishlistChangeRequest) this.L$0;
                WishlistsInteractorImpl wishlistsInteractorImpl = WishlistsInteractorImpl.this;
                this.label = 1;
                if (wishlistsInteractorImpl.handleRequest(wishlistChangeRequest, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WishlistChangeRequest wishlistChangeRequest, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(wishlistChangeRequest, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractorImpl$Companion;", "", "<init>", "()V", "", "DELETE_WISHLIST", "Ljava/lang/String;", "SHARE_WISHLIST", "PERMISSION_PARAM_ID", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractorImpl$WishlistChangeRequest;", "", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "LW10/c;", "getTrackingData", "()LW10/c;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WishlistChangeRequest {

        @NotNull
        private final AtomAction.ComposerAction action;
        private final c trackingData;

        public WishlistChangeRequest(@NotNull AtomAction.ComposerAction action, c cVar) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.trackingData = cVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WishlistChangeRequest)) {
                return false;
            }
            WishlistChangeRequest wishlistChangeRequest = (WishlistChangeRequest) other;
            return Intrinsics.d(this.action, wishlistChangeRequest.action) && Intrinsics.d(this.trackingData, wishlistChangeRequest.trackingData);
        }

        @NotNull
        public final AtomAction.ComposerAction getAction() {
            return this.action;
        }

        public final c getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            c cVar = this.trackingData;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "WishlistChangeRequest(action=" + this.action + ", trackingData=" + this.trackingData + ")";
        }
    }

    static {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        String simpleName = Companion.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        coroutineScope = N.a(d11.plus(new L(simpleName)).plus(new WishlistsInteractorImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    public WishlistsInteractorImpl(@NotNull ActionV2Repository actionV2Repo) {
        Intrinsics.checkNotNullParameter(actionV2Repo, "actionV2Repo");
        this.actionV2Repo = actionV2Repo;
        C0 b11 = E0.b(0, 0, null, 7);
        this.wishlistChangeRequests = b11;
        C0 a11 = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this._wishlistsUpdates = a11;
        this.wishlistsUpdates = a11;
        C2399j.C(new C2408n0(b11, new AnonymousClass1(null)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
    
        if (r3.emit(r6, r4) == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (r6.emit(r9, r4) == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r3 != r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteWishlist(long j11, c cVar, d<? super Unit> dVar) {
        WishlistsInteractorImpl$deleteWishlist$1 wishlistsInteractorImpl$deleteWishlist$1;
        int i11;
        c cVar2;
        WishlistsInteractorImpl wishlistsInteractorImpl;
        long j12 = j11;
        if (dVar instanceof WishlistsInteractorImpl$deleteWishlist$1) {
            wishlistsInteractorImpl$deleteWishlist$1 = (WishlistsInteractorImpl$deleteWishlist$1) dVar;
            int i12 = wishlistsInteractorImpl$deleteWishlist$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wishlistsInteractorImpl$deleteWishlist$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wishlistsInteractorImpl$deleteWishlist$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = wishlistsInteractorImpl$deleteWishlist$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    w0<WishlistUpdate> w0Var = this._wishlistsUpdates;
                    WishlistDelete.Started started = new WishlistDelete.Started(j12);
                    wishlistsInteractorImpl$deleteWishlist$1.L$0 = this;
                    cVar2 = cVar;
                    wishlistsInteractorImpl$deleteWishlist$1.L$1 = cVar2;
                    wishlistsInteractorImpl$deleteWishlist$1.J$0 = j12;
                    wishlistsInteractorImpl$deleteWishlist$1.label = 1;
                    if (w0Var.emit(started, wishlistsInteractorImpl$deleteWishlist$1) != aVar) {
                        wishlistsInteractorImpl = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    j12 = wishlistsInteractorImpl$deleteWishlist$1.J$0;
                    wishlistsInteractorImpl = (WishlistsInteractorImpl) wishlistsInteractorImpl$deleteWishlist$1.L$0;
                    s.b(obj);
                    ActionV2Response actionV2Response = (ActionV2Response) obj;
                    String error = actionV2Response.getError();
                    if (error == null || error.length() == 0) {
                        w0<WishlistUpdate> w0Var2 = wishlistsInteractorImpl._wishlistsUpdates;
                        FavoriteActionV2Response favoriteActionV2Response = (FavoriteActionV2Response) actionV2Response.getData();
                        WishlistDelete.Success success = new WishlistDelete.Success(j12, favoriteActionV2Response != null ? favoriteActionV2Response.getNotification() : null, actionV2Response.getTrackingPayloads());
                        wishlistsInteractorImpl$deleteWishlist$1.L$0 = null;
                        wishlistsInteractorImpl$deleteWishlist$1.label = 4;
                    } else {
                        w0<WishlistUpdate> w0Var3 = wishlistsInteractorImpl._wishlistsUpdates;
                        WishlistDelete.Failure failure = new WishlistDelete.Failure(j12);
                        wishlistsInteractorImpl$deleteWishlist$1.L$0 = null;
                        wishlistsInteractorImpl$deleteWishlist$1.label = 3;
                    }
                    return aVar;
                }
                j12 = wishlistsInteractorImpl$deleteWishlist$1.J$0;
                c cVar3 = (c) wishlistsInteractorImpl$deleteWishlist$1.L$1;
                WishlistsInteractorImpl wishlistsInteractorImpl2 = (WishlistsInteractorImpl) wishlistsInteractorImpl$deleteWishlist$1.L$0;
                s.b(obj);
                cVar2 = cVar3;
                wishlistsInteractorImpl = wishlistsInteractorImpl2;
                ActionV2Request actionV2Request = new ActionV2Request(new RemoveFavoritesListsRequest(C7714v.a0(new Long(j12))), "favoriteDeleteList", false, 4, null);
                ActionV2Repository actionV2Repository = wishlistsInteractorImpl.actionV2Repo;
                if (cVar2 == null) {
                    cVar2 = new c(null, null, null);
                }
                wishlistsInteractorImpl$deleteWishlist$1.L$0 = wishlistsInteractorImpl;
                wishlistsInteractorImpl$deleteWishlist$1.L$1 = null;
                wishlistsInteractorImpl$deleteWishlist$1.J$0 = j12;
                wishlistsInteractorImpl$deleteWishlist$1.label = 2;
                obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar2, FavoriteActionV2Response.class, wishlistsInteractorImpl$deleteWishlist$1);
            }
        }
        wishlistsInteractorImpl$deleteWishlist$1 = new WishlistsInteractorImpl$deleteWishlist$1(this, dVar);
        Object obj2 = wishlistsInteractorImpl$deleteWishlist$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = wishlistsInteractorImpl$deleteWishlist$1.label;
        if (i11 != 0) {
        }
        ActionV2Request actionV2Request2 = new ActionV2Request(new RemoveFavoritesListsRequest(C7714v.a0(new Long(j12))), "favoriteDeleteList", false, 4, null);
        ActionV2Repository actionV2Repository2 = wishlistsInteractorImpl.actionV2Repo;
        if (cVar2 == null) {
        }
        wishlistsInteractorImpl$deleteWishlist$1.L$0 = wishlistsInteractorImpl;
        wishlistsInteractorImpl$deleteWishlist$1.L$1 = null;
        wishlistsInteractorImpl$deleteWishlist$1.J$0 = j12;
        wishlistsInteractorImpl$deleteWishlist$1.label = 2;
        obj2 = actionV2Repository2.callActionWithTrackingSuspend(actionV2Request2, cVar2, FavoriteActionV2Response.class, wishlistsInteractorImpl$deleteWishlist$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRequest(WishlistChangeRequest wishlistChangeRequest, d<? super Unit> dVar) {
        AtomAction.ComposerAction action = wishlistChangeRequest.getAction();
        Long extractListIdFromFavoriteAction = ActionHandlersUtilsKt.extractListIdFromFavoriteAction(action);
        if (extractListIdFromFavoriteAction == null) {
            return Unit.f71690a;
        }
        long longValue = extractListIdFromFavoriteAction.longValue();
        String id2 = wishlistChangeRequest.getAction().getId();
        if (Intrinsics.d(id2, "favoriteDeleteList")) {
            Object deleteWishlist = deleteWishlist(longValue, wishlistChangeRequest.getTrackingData(), dVar);
            return deleteWishlist == a.COROUTINE_SUSPENDED ? deleteWishlist : Unit.f71690a;
        }
        if (!Intrinsics.d(id2, "favoriteShareList")) {
            return Unit.f71690a;
        }
        Map<String, String> params = action.getParams();
        Object shareWishlist = shareWishlist(longValue, params != null ? params.get("permission") : null, wishlistChangeRequest.getTrackingData(), dVar);
        return shareWishlist == a.COROUTINE_SUSPENDED ? shareWishlist : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r1.emit(r4, r2) == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r1.emit(r4, r2) != r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shareWishlist(long j11, String str, c cVar, d<? super Unit> dVar) {
        WishlistsInteractorImpl$shareWishlist$1 wishlistsInteractorImpl$shareWishlist$1;
        int i11;
        final long j12;
        WishlistsInteractorImpl wishlistsInteractorImpl;
        FavoriteShareListResponse favoriteShareListResponse;
        String error;
        if (dVar instanceof WishlistsInteractorImpl$shareWishlist$1) {
            wishlistsInteractorImpl$shareWishlist$1 = (WishlistsInteractorImpl$shareWishlist$1) dVar;
            int i12 = wishlistsInteractorImpl$shareWishlist$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wishlistsInteractorImpl$shareWishlist$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wishlistsInteractorImpl$shareWishlist$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = wishlistsInteractorImpl$shareWishlist$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ActionV2Request actionV2Request = new ActionV2Request(new FavoriteShareListRequest(j11, str, null, 4, null), "favoriteShareList", false, 4, null);
                    ActionV2Repository actionV2Repository = this.actionV2Repo;
                    c cVar2 = cVar == null ? new c(null, null, null) : cVar;
                    wishlistsInteractorImpl$shareWishlist$1.L$0 = this;
                    j12 = j11;
                    wishlistsInteractorImpl$shareWishlist$1.J$0 = j12;
                    wishlistsInteractorImpl$shareWishlist$1.label = 1;
                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar2, FavoriteShareListResponse.class, wishlistsInteractorImpl$shareWishlist$1);
                    if (obj != aVar) {
                        wishlistsInteractorImpl = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                long j13 = wishlistsInteractorImpl$shareWishlist$1.J$0;
                wishlistsInteractorImpl = (WishlistsInteractorImpl) wishlistsInteractorImpl$shareWishlist$1.L$0;
                s.b(obj);
                j12 = j13;
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                favoriteShareListResponse = (FavoriteShareListResponse) actionV2Response.getData();
                error = actionV2Response.getError();
                if ((error != null || error.length() == 0) && favoriteShareListResponse != null) {
                    w0<WishlistUpdate> w0Var = wishlistsInteractorImpl._wishlistsUpdates;
                    final String c11 = g.c(favoriteShareListResponse.getTitle(), " ", favoriteShareListResponse.getUrl());
                    WishlistUpdate wishlistUpdate = new WishlistUpdate(j12, c11) { // from class: ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistShare$Success
                        private final long id;

                        @NotNull
                        private final String shareMessage;

                        {
                            Intrinsics.checkNotNullParameter(c11, "shareMessage");
                            this.id = j12;
                            this.shareMessage = c11;
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof WishlistShare$Success)) {
                                return false;
                            }
                            WishlistShare$Success wishlistShare$Success = (WishlistShare$Success) other;
                            return this.id == wishlistShare$Success.id && Intrinsics.d(this.shareMessage, wishlistShare$Success.shareMessage);
                        }

                        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
                        public long getId() {
                            return this.id;
                        }

                        public int hashCode() {
                            return this.shareMessage.hashCode() + (Long.hashCode(this.id) * 31);
                        }

                        @NotNull
                        public String toString() {
                            StringBuilder c12 = C2436a.c(this.id, "Success(id=", ", shareMessage=", this.shareMessage);
                            c12.append(")");
                            return c12.toString();
                        }
                    };
                    wishlistsInteractorImpl$shareWishlist$1.L$0 = null;
                    wishlistsInteractorImpl$shareWishlist$1.label = 3;
                } else {
                    w0<WishlistUpdate> w0Var2 = wishlistsInteractorImpl._wishlistsUpdates;
                    WishlistUpdate wishlistUpdate2 = new WishlistUpdate(j12) { // from class: ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistShare$Failure
                        private final long id;

                        {
                            this.id = j12;
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof WishlistShare$Failure) && this.id == ((WishlistShare$Failure) other).id;
                        }

                        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
                        public long getId() {
                            return this.id;
                        }

                        public int hashCode() {
                            return Long.hashCode(this.id);
                        }

                        @NotNull
                        public String toString() {
                            return Sh.b.b(this.id, "Failure(id=", ")");
                        }
                    };
                    wishlistsInteractorImpl$shareWishlist$1.L$0 = null;
                    wishlistsInteractorImpl$shareWishlist$1.label = 2;
                }
                return aVar;
            }
        }
        wishlistsInteractorImpl$shareWishlist$1 = new WishlistsInteractorImpl$shareWishlist$1(this, dVar);
        Object obj2 = wishlistsInteractorImpl$shareWishlist$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = wishlistsInteractorImpl$shareWishlist$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        favoriteShareListResponse = (FavoriteShareListResponse) actionV2Response2.getData();
        error = actionV2Response2.getError();
        if (error != null) {
        }
        w0<WishlistUpdate> w0Var3 = wishlistsInteractorImpl._wishlistsUpdates;
        final String c112 = g.c(favoriteShareListResponse.getTitle(), " ", favoriteShareListResponse.getUrl());
        WishlistUpdate wishlistUpdate3 = new WishlistUpdate(j12, c112) { // from class: ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistShare$Success
            private final long id;

            @NotNull
            private final String shareMessage;

            {
                Intrinsics.checkNotNullParameter(c112, "shareMessage");
                this.id = j12;
                this.shareMessage = c112;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WishlistShare$Success)) {
                    return false;
                }
                WishlistShare$Success wishlistShare$Success = (WishlistShare$Success) other;
                return this.id == wishlistShare$Success.id && Intrinsics.d(this.shareMessage, wishlistShare$Success.shareMessage);
            }

            @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.shareMessage.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder c12 = C2436a.c(this.id, "Success(id=", ", shareMessage=", this.shareMessage);
                c12.append(")");
                return c12.toString();
            }
        };
        wishlistsInteractorImpl$shareWishlist$1.L$0 = null;
        wishlistsInteractorImpl$shareWishlist$1.label = 3;
    }

    @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractor
    public Object addWishlistChangeRequest(@NotNull AtomAction.ComposerAction composerAction, c cVar, @NotNull d<? super Unit> dVar) {
        Object emit = this.wishlistChangeRequests.emit(new WishlistChangeRequest(composerAction, cVar), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractor
    @NotNull
    public InterfaceC2395h<WishlistUpdate> getWishlistsUpdates() {
        return this.wishlistsUpdates;
    }
}
