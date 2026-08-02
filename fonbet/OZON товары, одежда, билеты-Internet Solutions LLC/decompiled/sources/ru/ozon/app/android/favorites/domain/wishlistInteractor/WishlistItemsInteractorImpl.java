package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import G.g;
import He.b;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import ru.ozon.app.android.favorites.data.shoppinglists.models.ChangeProductsStateInFavoritesListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoritesWishlistRemoveRequest;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemAdd;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemDelete;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent$Result$ActionResult;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u000212B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019JF\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJN\u0010!\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020\u001b2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R \u0010-\u001a\b\u0012\u0004\u0012\u00020*0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractorImpl;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repo", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "wishlistEventManager", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractorImpl$WishlistItemChangeRequest;", "request", "", "handleRequest", "(Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractorImpl$WishlistItemChangeRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "sku", "listId", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd;", "addToWishlist", "(JJLW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "giftId", "", "uniqId", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete;", "removeFromWishlist", "(Ljava/lang/Long;JLW10/c;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "actionName", "addWishlistItemChangeRequest", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "LAe/w0;", "wishlistItemChangeRequests", "LAe/w0;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemUpdate;", "_wishlistItemUpdates", "LAe/h;", "wishlistItemUpdates", "LAe/h;", "getWishlistItemUpdates", "()LAe/h;", "Companion", "WishlistItemChangeRequest", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistItemsInteractorImpl implements WishlistItemsInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final M coroutineScope;

    @NotNull
    private final w0<WishlistItemUpdate> _wishlistItemUpdates;

    @NotNull
    private final ActionV2Repository actionV2Repo;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final WishlistEventManager wishlistEventManager;

    @NotNull
    private final w0<WishlistItemChangeRequest> wishlistItemChangeRequests;

    @NotNull
    private final InterfaceC2395h<WishlistItemUpdate> wishlistItemUpdates;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractorImpl$WishlistItemChangeRequest;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractorImpl$1", f = "WishlistItemsInteractorImpl.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractorImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<WishlistItemChangeRequest, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = WishlistItemsInteractorImpl.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                WishlistItemChangeRequest wishlistItemChangeRequest = (WishlistItemChangeRequest) this.L$0;
                WishlistItemsInteractorImpl wishlistItemsInteractorImpl = WishlistItemsInteractorImpl.this;
                this.label = 1;
                if (wishlistItemsInteractorImpl.handleRequest(wishlistItemChangeRequest, this) == aVar) {
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
        public final Object invoke(WishlistItemChangeRequest wishlistItemChangeRequest, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(wishlistItemChangeRequest, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractorImpl$Companion;", "", "<init>", "()V", "", "ADD_TO_WISHLIST", "Ljava/lang/String;", "REMOVE_FROM_WISHLIST", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractorImpl$WishlistItemChangeRequest;", "", "", "sku", "listId", "giftId", "", "uniqId", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;LW10/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getListId", "()J", "getGiftId", "Ljava/lang/String;", "getUniqId", "getActionName", "LW10/c;", "getTrackingData", "()LW10/c;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WishlistItemChangeRequest {

        @NotNull
        private final String actionName;
        private final Long giftId;
        private final long listId;
        private final Long sku;
        private final c trackingData;
        private final String uniqId;

        public WishlistItemChangeRequest(Long l11, long j11, Long l12, String str, @NotNull String actionName, c cVar) {
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            this.sku = l11;
            this.listId = j11;
            this.giftId = l12;
            this.uniqId = str;
            this.actionName = actionName;
            this.trackingData = cVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WishlistItemChangeRequest)) {
                return false;
            }
            WishlistItemChangeRequest wishlistItemChangeRequest = (WishlistItemChangeRequest) other;
            return Intrinsics.d(this.sku, wishlistItemChangeRequest.sku) && this.listId == wishlistItemChangeRequest.listId && Intrinsics.d(this.giftId, wishlistItemChangeRequest.giftId) && Intrinsics.d(this.uniqId, wishlistItemChangeRequest.uniqId) && Intrinsics.d(this.actionName, wishlistItemChangeRequest.actionName) && Intrinsics.d(this.trackingData, wishlistItemChangeRequest.trackingData);
        }

        @NotNull
        public final String getActionName() {
            return this.actionName;
        }

        public final Long getGiftId() {
            return this.giftId;
        }

        public final long getListId() {
            return this.listId;
        }

        public final Long getSku() {
            return this.sku;
        }

        public final c getTrackingData() {
            return this.trackingData;
        }

        public final String getUniqId() {
            return this.uniqId;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = Pk0.c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.listId);
            Long l12 = this.giftId;
            int hashCode = (a11 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.uniqId;
            int a12 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.actionName);
            c cVar = this.trackingData;
            return a12 + (cVar != null ? cVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "WishlistItemChangeRequest(sku=" + this.sku + ", listId=" + this.listId + ", giftId=" + this.giftId + ", uniqId=" + this.uniqId + ", actionName=" + this.actionName + ", trackingData=" + this.trackingData + ")";
        }
    }

    static {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        String simpleName = Companion.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        coroutineScope = N.a(d11.plus(new L(simpleName)).plus(new WishlistItemsInteractorImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    public WishlistItemsInteractorImpl(@NotNull ActionV2Repository actionV2Repo, @NotNull WishlistEventManager wishlistEventManager, @NotNull FavoriteEventManager favoriteEventManager, @NotNull FavoriteManager favoriteManager) {
        Intrinsics.checkNotNullParameter(actionV2Repo, "actionV2Repo");
        Intrinsics.checkNotNullParameter(wishlistEventManager, "wishlistEventManager");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.actionV2Repo = actionV2Repo;
        this.wishlistEventManager = wishlistEventManager;
        this.favoriteEventManager = favoriteEventManager;
        this.favoriteManager = favoriteManager;
        C0 b11 = E0.b(0, 0, null, 7);
        this.wishlistItemChangeRequests = b11;
        C0 a11 = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this._wishlistItemUpdates = a11;
        this.wishlistItemUpdates = a11;
        C2399j.C(new C2408n0(b11, new AnonymousClass1(null)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addToWishlist(long j11, long j12, c cVar, d<? super WishlistItemAdd> dVar) {
        WishlistItemsInteractorImpl$addToWishlist$1 wishlistItemsInteractorImpl$addToWishlist$1;
        int i11;
        WishlistItemsInteractorImpl wishlistItemsInteractorImpl;
        long j13;
        long j14;
        String error;
        if (dVar instanceof WishlistItemsInteractorImpl$addToWishlist$1) {
            wishlistItemsInteractorImpl$addToWishlist$1 = (WishlistItemsInteractorImpl$addToWishlist$1) dVar;
            int i12 = wishlistItemsInteractorImpl$addToWishlist$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wishlistItemsInteractorImpl$addToWishlist$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wishlistItemsInteractorImpl$addToWishlist$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = wishlistItemsInteractorImpl$addToWishlist$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    this.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductAdditionStarted(new Long(j11), j12, null, null, 12, null));
                    ActionV2Request actionV2Request = new ActionV2Request(new ChangeProductsStateInFavoritesListRequest(j12, C7714v.a0(new Long(j11)), null, 4, null), "favoriteListAdd", false, 4, null);
                    ActionV2Repository actionV2Repository = this.actionV2Repo;
                    c cVar2 = cVar == null ? new c(null, null, null) : cVar;
                    wishlistItemsInteractorImpl$addToWishlist$1.L$0 = this;
                    wishlistItemsInteractorImpl$addToWishlist$1.J$0 = j11;
                    wishlistItemsInteractorImpl$addToWishlist$1.J$1 = j12;
                    wishlistItemsInteractorImpl$addToWishlist$1.label = 1;
                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar2, FavoriteActionV2Response.class, wishlistItemsInteractorImpl$addToWishlist$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    wishlistItemsInteractorImpl = this;
                    j13 = j11;
                    j14 = j12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j15 = wishlistItemsInteractorImpl$addToWishlist$1.J$1;
                    long j16 = wishlistItemsInteractorImpl$addToWishlist$1.J$0;
                    wishlistItemsInteractorImpl = (WishlistItemsInteractorImpl) wishlistItemsInteractorImpl$addToWishlist$1.L$0;
                    s.b(obj);
                    j14 = j15;
                    j13 = j16;
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                error = actionV2Response.getError();
                if (error == null && error.length() != 0) {
                    wishlistItemsInteractorImpl.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductAdded(new Long(j13), j14, WishlistEvent$Result$ActionResult.FAILED, null, null, 24, null));
                    return new WishlistItemAdd.Failure(j14, j13, null, 4, null);
                }
                wishlistItemsInteractorImpl.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductAdded(new Long(j13), j14, WishlistEvent$Result$ActionResult.SUCCEED, null, null, 24, null));
                FavoriteActionV2Response favoriteActionV2Response = (FavoriteActionV2Response) actionV2Response.getData();
                wishlistItemsInteractorImpl.favoriteEventManager.onFavWishlistEdited(new FavoriteEvent.OnFavoriteWishlistEdited(favoriteActionV2Response == null ? favoriteActionV2Response.getNotification() : null, false, false, 6, null));
                FavoriteManager.DefaultImpls.addFavorite$default(wishlistItemsInteractorImpl.favoriteManager, j13, null, 2, null);
                FavoriteActionV2Response favoriteActionV2Response2 = (FavoriteActionV2Response) actionV2Response.getData();
                return new WishlistItemAdd.Success(j13, j14, null, favoriteActionV2Response2 != null ? favoriteActionV2Response2.getNotification() : null, actionV2Response.getTrackingPayloads(), 4, null);
            }
        }
        wishlistItemsInteractorImpl$addToWishlist$1 = new WishlistItemsInteractorImpl$addToWishlist$1(this, dVar);
        Object obj2 = wishlistItemsInteractorImpl$addToWishlist$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = wishlistItemsInteractorImpl$addToWishlist$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        error = actionV2Response2.getError();
        if (error == null) {
        }
        wishlistItemsInteractorImpl.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductAdded(new Long(j13), j14, WishlistEvent$Result$ActionResult.SUCCEED, null, null, 24, null));
        FavoriteActionV2Response favoriteActionV2Response3 = (FavoriteActionV2Response) actionV2Response2.getData();
        wishlistItemsInteractorImpl.favoriteEventManager.onFavWishlistEdited(new FavoriteEvent.OnFavoriteWishlistEdited(favoriteActionV2Response3 == null ? favoriteActionV2Response3.getNotification() : null, false, false, 6, null));
        FavoriteManager.DefaultImpls.addFavorite$default(wishlistItemsInteractorImpl.favoriteManager, j13, null, 2, null);
        FavoriteActionV2Response favoriteActionV2Response22 = (FavoriteActionV2Response) actionV2Response2.getData();
        return new WishlistItemAdd.Success(j13, j14, null, favoriteActionV2Response22 != null ? favoriteActionV2Response22.getNotification() : null, actionV2Response2.getTrackingPayloads(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (r11.emit(r12, r7) != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r12 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleRequest(WishlistItemChangeRequest wishlistItemChangeRequest, d<? super Unit> dVar) {
        WishlistItemsInteractorImpl$handleRequest$1 wishlistItemsInteractorImpl$handleRequest$1;
        int i11;
        WishlistItemsInteractorImpl wishlistItemsInteractorImpl;
        WishlistItemUpdate wishlistItemUpdate;
        if (dVar instanceof WishlistItemsInteractorImpl$handleRequest$1) {
            wishlistItemsInteractorImpl$handleRequest$1 = (WishlistItemsInteractorImpl$handleRequest$1) dVar;
            int i12 = wishlistItemsInteractorImpl$handleRequest$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wishlistItemsInteractorImpl$handleRequest$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                WishlistItemsInteractorImpl$handleRequest$1 wishlistItemsInteractorImpl$handleRequest$12 = wishlistItemsInteractorImpl$handleRequest$1;
                Object obj = wishlistItemsInteractorImpl$handleRequest$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = wishlistItemsInteractorImpl$handleRequest$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    String actionName = wishlistItemChangeRequest.getActionName();
                    if (Intrinsics.d(actionName, "favoriteListAdd")) {
                        Long sku = wishlistItemChangeRequest.getSku();
                        if (sku == null) {
                            return Unit.f71690a;
                        }
                        long longValue = sku.longValue();
                        long listId = wishlistItemChangeRequest.getListId();
                        c trackingData = wishlistItemChangeRequest.getTrackingData();
                        wishlistItemsInteractorImpl$handleRequest$12.L$0 = this;
                        wishlistItemsInteractorImpl$handleRequest$12.label = 1;
                        obj = addToWishlist(longValue, listId, trackingData, wishlistItemsInteractorImpl$handleRequest$12);
                        if (obj != aVar) {
                            wishlistItemsInteractorImpl = this;
                            wishlistItemUpdate = (WishlistItemAdd) obj;
                        }
                    } else {
                        if (!Intrinsics.d(actionName, "favoriteListRemove")) {
                            return Unit.f71690a;
                        }
                        Long sku2 = wishlistItemChangeRequest.getSku();
                        long listId2 = wishlistItemChangeRequest.getListId();
                        c trackingData2 = wishlistItemChangeRequest.getTrackingData();
                        Long giftId = wishlistItemChangeRequest.getGiftId();
                        String uniqId = wishlistItemChangeRequest.getUniqId();
                        wishlistItemsInteractorImpl$handleRequest$12.L$0 = this;
                        wishlistItemsInteractorImpl$handleRequest$12.label = 2;
                        obj = removeFromWishlist(sku2, listId2, trackingData2, giftId, uniqId, wishlistItemsInteractorImpl$handleRequest$12);
                        wishlistItemsInteractorImpl$handleRequest$12 = wishlistItemsInteractorImpl$handleRequest$12;
                        if (obj != aVar) {
                            wishlistItemsInteractorImpl = this;
                            wishlistItemUpdate = (WishlistItemUpdate) obj;
                            w0<WishlistItemUpdate> w0Var = wishlistItemsInteractorImpl._wishlistItemUpdates;
                            wishlistItemsInteractorImpl$handleRequest$12.L$0 = null;
                            wishlistItemsInteractorImpl$handleRequest$12.label = 3;
                        }
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    wishlistItemsInteractorImpl = (WishlistItemsInteractorImpl) wishlistItemsInteractorImpl$handleRequest$12.L$0;
                    s.b(obj);
                    wishlistItemUpdate = (WishlistItemAdd) obj;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    wishlistItemsInteractorImpl = (WishlistItemsInteractorImpl) wishlistItemsInteractorImpl$handleRequest$12.L$0;
                    s.b(obj);
                    wishlistItemUpdate = (WishlistItemUpdate) obj;
                    w0<WishlistItemUpdate> w0Var2 = wishlistItemsInteractorImpl._wishlistItemUpdates;
                    wishlistItemsInteractorImpl$handleRequest$12.L$0 = null;
                    wishlistItemsInteractorImpl$handleRequest$12.label = 3;
                }
            }
        }
        wishlistItemsInteractorImpl$handleRequest$1 = new WishlistItemsInteractorImpl$handleRequest$1(this, dVar);
        WishlistItemsInteractorImpl$handleRequest$1 wishlistItemsInteractorImpl$handleRequest$122 = wishlistItemsInteractorImpl$handleRequest$1;
        Object obj2 = wishlistItemsInteractorImpl$handleRequest$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = wishlistItemsInteractorImpl$handleRequest$122.label;
        if (i11 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeFromWishlist(Long l11, long j11, c cVar, Long l12, String str, d<? super WishlistItemDelete> dVar) {
        WishlistItemsInteractorImpl$removeFromWishlist$1 wishlistItemsInteractorImpl$removeFromWishlist$1;
        int i11;
        Long l13;
        String str2;
        long j12;
        WishlistItemsInteractorImpl wishlistItemsInteractorImpl;
        Long l14;
        String error;
        if (dVar instanceof WishlistItemsInteractorImpl$removeFromWishlist$1) {
            wishlistItemsInteractorImpl$removeFromWishlist$1 = (WishlistItemsInteractorImpl$removeFromWishlist$1) dVar;
            int i12 = wishlistItemsInteractorImpl$removeFromWishlist$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wishlistItemsInteractorImpl$removeFromWishlist$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wishlistItemsInteractorImpl$removeFromWishlist$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = wishlistItemsInteractorImpl$removeFromWishlist$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    this.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductRemovalStarted(l11, j11, l12, str));
                    ActionV2Request actionV2Request = new ActionV2Request(new FavoritesWishlistRemoveRequest(j11, l11, null, l12, str, 4, null), "favoriteListRemove", false, 4, null);
                    ActionV2Repository actionV2Repository = this.actionV2Repo;
                    c cVar2 = cVar == null ? new c(null, null, null) : cVar;
                    wishlistItemsInteractorImpl$removeFromWishlist$1.L$0 = this;
                    wishlistItemsInteractorImpl$removeFromWishlist$1.L$1 = l11;
                    l13 = l12;
                    wishlistItemsInteractorImpl$removeFromWishlist$1.L$2 = l13;
                    str2 = str;
                    wishlistItemsInteractorImpl$removeFromWishlist$1.L$3 = str2;
                    j12 = j11;
                    wishlistItemsInteractorImpl$removeFromWishlist$1.J$0 = j12;
                    wishlistItemsInteractorImpl$removeFromWishlist$1.label = 1;
                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar2, FavoriteActionV2Response.class, wishlistItemsInteractorImpl$removeFromWishlist$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    wishlistItemsInteractorImpl = this;
                    l14 = l11;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j13 = wishlistItemsInteractorImpl$removeFromWishlist$1.J$0;
                    String str3 = (String) wishlistItemsInteractorImpl$removeFromWishlist$1.L$3;
                    Long l15 = (Long) wishlistItemsInteractorImpl$removeFromWishlist$1.L$2;
                    l14 = (Long) wishlistItemsInteractorImpl$removeFromWishlist$1.L$1;
                    wishlistItemsInteractorImpl = (WishlistItemsInteractorImpl) wishlistItemsInteractorImpl$removeFromWishlist$1.L$0;
                    s.b(obj);
                    j12 = j13;
                    str2 = str3;
                    l13 = l15;
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                error = actionV2Response.getError();
                if (error == null && error.length() != 0) {
                    wishlistItemsInteractorImpl.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductRemoved(l14, j12, WishlistEvent$Result$ActionResult.FAILED, l13, str2));
                    return new WishlistItemDelete.Failure(j12, l14, l13);
                }
                wishlistItemsInteractorImpl.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductRemoved(l14, j12, WishlistEvent$Result$ActionResult.SUCCEED, l13, str2));
                wishlistItemsInteractorImpl.favoriteEventManager.onFavWishlistEdited(new FavoriteEvent.OnFavoriteWishlistEdited(null, false, false, 7, null));
                FavoriteActionV2Response favoriteActionV2Response = (FavoriteActionV2Response) actionV2Response.getData();
                return new WishlistItemDelete.Success(l14, j12, l13, favoriteActionV2Response != null ? favoriteActionV2Response.getNotification() : null, actionV2Response.getTrackingPayloads());
            }
        }
        wishlistItemsInteractorImpl$removeFromWishlist$1 = new WishlistItemsInteractorImpl$removeFromWishlist$1(this, dVar);
        Object obj2 = wishlistItemsInteractorImpl$removeFromWishlist$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = wishlistItemsInteractorImpl$removeFromWishlist$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        error = actionV2Response2.getError();
        if (error == null) {
        }
        wishlistItemsInteractorImpl.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductRemoved(l14, j12, WishlistEvent$Result$ActionResult.SUCCEED, l13, str2));
        wishlistItemsInteractorImpl.favoriteEventManager.onFavWishlistEdited(new FavoriteEvent.OnFavoriteWishlistEdited(null, false, false, 7, null));
        FavoriteActionV2Response favoriteActionV2Response2 = (FavoriteActionV2Response) actionV2Response2.getData();
        return new WishlistItemDelete.Success(l14, j12, l13, favoriteActionV2Response2 != null ? favoriteActionV2Response2.getNotification() : null, actionV2Response2.getTrackingPayloads());
    }

    @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor
    public Object addWishlistItemChangeRequest(Long l11, long j11, Long l12, String str, @NotNull String str2, c cVar, @NotNull d<? super Unit> dVar) {
        Object emit = this.wishlistItemChangeRequests.emit(new WishlistItemChangeRequest(l11, j11, l12, str, str2, cVar), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor
    @NotNull
    public InterfaceC2395h<WishlistItemUpdate> getWishlistItemUpdates() {
        return this.wishlistItemUpdates;
    }
}
