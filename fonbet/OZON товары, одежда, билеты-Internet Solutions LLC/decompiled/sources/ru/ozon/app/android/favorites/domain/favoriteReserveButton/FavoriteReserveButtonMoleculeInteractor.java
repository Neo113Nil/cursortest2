package ru.ozon.app.android.favorites.domain.favoriteReserveButton;

import Ae.C0;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import He.b;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReserveWishlistItemResponse;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult;
import ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.U;
import xe.X0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u00020\u0001:\u0003$%&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJJ\u0010\u0017\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001b¨\u0006'"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor$FavoriteReservedChangeData;", "data", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult;", "onFavoriteReservedChanged", "(Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor$FavoriteReservedChangeData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "sku", "wishlistId", "", "uniqId", "giftId", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "addFavoriteReservedChangeRequest", "(Ljava/lang/Long;JLjava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "observeRequests", "()LAe/h;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/w0;", "favoriteReservedChangeRequests", "LAe/w0;", "_favoriteReserveButtonUpdates", "favoriteReserveButtonUpdates", "LAe/h;", "getFavoriteReserveButtonUpdates", "Companion", "FavoriteReservedChangeRequest", "FavoriteReservedChangeData", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteReserveButtonMoleculeInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final M coroutineScope;

    @NotNull
    private final w0<FavoriteReservedChangeResult> _favoriteReserveButtonUpdates;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final InterfaceC2395h<FavoriteReservedChangeResult> favoriteReserveButtonUpdates;

    @NotNull
    private final w0<FavoriteReservedChangeData> favoriteReservedChangeRequests;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor$Companion;", "", "<init>", "()V", "Lxe/M;", "coroutineScope", "Lxe/M;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor$FavoriteReservedChangeData;", "", "", "sku", "wishlistId", "", "uniqId", "giftId", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Ljava/lang/Long;JLjava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "Ljava/lang/String;", "getUniqId", "()Ljava/lang/String;", "getGiftId", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "LW10/c;", "getTrackingData", "()LW10/c;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FavoriteReservedChangeData {

        @NotNull
        private final AtomAction.ComposerAction action;
        private final Long giftId;
        private final Long sku;

        @NotNull
        private final c trackingData;
        private final String uniqId;
        private final long wishlistId;

        public FavoriteReservedChangeData(Long l11, long j11, String str, Long l12, @NotNull AtomAction.ComposerAction action, @NotNull c trackingData) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(trackingData, "trackingData");
            this.sku = l11;
            this.wishlistId = j11;
            this.uniqId = str;
            this.giftId = l12;
            this.action = action;
            this.trackingData = trackingData;
        }

        @NotNull
        public final AtomAction.ComposerAction getAction() {
            return this.action;
        }

        public final Long getGiftId() {
            return this.giftId;
        }

        public final Long getSku() {
            return this.sku;
        }

        @NotNull
        public final c getTrackingData() {
            return this.trackingData;
        }

        public final String getUniqId() {
            return this.uniqId;
        }

        public final long getWishlistId() {
            return this.wishlistId;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor$FavoriteReservedChangeRequest;", "", "sku", "", "id", "giftId", "<init>", "(Ljava/lang/Long;JLjava/lang/Long;)V", "getSku", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()J", "getGiftId", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;JLjava/lang/Long;)Lru/ozon/app/android/favorites/domain/favoriteReserveButton/FavoriteReserveButtonMoleculeInteractor$FavoriteReservedChangeRequest;", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteReservedChangeRequest {
        private final Long giftId;
        private final long id;
        private final Long sku;

        public FavoriteReservedChangeRequest(Long l11, long j11, Long l12) {
            this.sku = l11;
            this.id = j11;
            this.giftId = l12;
        }

        public static /* synthetic */ FavoriteReservedChangeRequest copy$default(FavoriteReservedChangeRequest favoriteReservedChangeRequest, Long l11, long j11, Long l12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = favoriteReservedChangeRequest.sku;
            }
            if ((i11 & 2) != 0) {
                j11 = favoriteReservedChangeRequest.id;
            }
            if ((i11 & 4) != 0) {
                l12 = favoriteReservedChangeRequest.giftId;
            }
            return favoriteReservedChangeRequest.copy(l11, j11, l12);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getSku() {
            return this.sku;
        }

        /* renamed from: component2, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getGiftId() {
            return this.giftId;
        }

        @NotNull
        public final FavoriteReservedChangeRequest copy(Long sku, long id2, Long giftId) {
            return new FavoriteReservedChangeRequest(sku, id2, giftId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FavoriteReservedChangeRequest)) {
                return false;
            }
            FavoriteReservedChangeRequest favoriteReservedChangeRequest = (FavoriteReservedChangeRequest) other;
            return Intrinsics.d(this.sku, favoriteReservedChangeRequest.sku) && this.id == favoriteReservedChangeRequest.id && Intrinsics.d(this.giftId, favoriteReservedChangeRequest.giftId);
        }

        public final Long getGiftId() {
            return this.giftId;
        }

        public final long getId() {
            return this.id;
        }

        public final Long getSku() {
            return this.sku;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = Pk0.c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.id);
            Long l12 = this.giftId;
            return a11 + (l12 != null ? l12.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FavoriteReservedChangeRequest(sku=" + this.sku + ", id=" + this.id + ", giftId=" + this.giftId + ")";
        }
    }

    static {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        String simpleName = Companion.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        coroutineScope = N.a(d11.plus(new L(simpleName)).plus(new FavoriteReserveButtonMoleculeInteractor$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    public FavoriteReserveButtonMoleculeInteractor(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.favoriteReservedChangeRequests = E0.b(0, 0, null, 7);
        C0 b11 = E0.b(0, 0, null, 7);
        this._favoriteReserveButtonUpdates = b11;
        this.favoriteReserveButtonUpdates = b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onFavoriteReservedChanged(FavoriteReservedChangeData favoriteReservedChangeData, d<? super FavoriteReservedChangeResult> dVar) {
        FavoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1 favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1;
        int i11;
        FavoriteReserveWishlistItemResponse favoriteReserveWishlistItemResponse;
        String error;
        if (dVar instanceof FavoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1) {
            favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1 = (FavoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1) dVar;
            int i12 = favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ActionV2Request actionV2Request = new ActionV2Request(new FavoriteReservedChangeRequest(favoriteReservedChangeData.getSku(), favoriteReservedChangeData.getWishlistId(), favoriteReservedChangeData.getGiftId()), favoriteReservedChangeData.getAction().getActionName(), false, 4, null);
                    c trackingData = favoriteReservedChangeData.getTrackingData();
                    ActionV2Repository actionV2Repository = this.actionV2Repository;
                    favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.L$0 = favoriteReservedChangeData;
                    favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.label = 1;
                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, FavoriteReserveWishlistItemResponse.class, favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    favoriteReservedChangeData = (FavoriteReservedChangeData) favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.L$0;
                    s.b(obj);
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                favoriteReserveWishlistItemResponse = (FavoriteReserveWishlistItemResponse) actionV2Response.getData();
                error = actionV2Response.getError();
                if ((error == null && error.length() != 0) || favoriteReserveWishlistItemResponse == null) {
                    return new FavoriteReservedChangeResult.Error(favoriteReservedChangeData.getSku(), favoriteReservedChangeData.getUniqId(), favoriteReservedChangeData.getWishlistId());
                }
                Long sku = favoriteReservedChangeData.getSku();
                long wishlistId = favoriteReservedChangeData.getWishlistId();
                String uniqId = favoriteReservedChangeData.getUniqId();
                FavoriteReserveButtonMolecule favoriteReserveButtonMolecule = new FavoriteReserveButtonMolecule(favoriteReserveWishlistItemResponse.getReserveButton());
                AtomActionDTO action = favoriteReserveWishlistItemResponse.getAction();
                return new FavoriteReservedChangeResult.Success(sku, wishlistId, uniqId, favoriteReserveButtonMolecule, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
            }
        }
        favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1 = new FavoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1(this, dVar);
        Object obj2 = favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = favoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        favoriteReserveWishlistItemResponse = (FavoriteReserveWishlistItemResponse) actionV2Response2.getData();
        error = actionV2Response2.getError();
        if (error == null) {
        }
        Long sku2 = favoriteReservedChangeData.getSku();
        long wishlistId2 = favoriteReservedChangeData.getWishlistId();
        String uniqId2 = favoriteReservedChangeData.getUniqId();
        FavoriteReserveButtonMolecule favoriteReserveButtonMolecule2 = new FavoriteReserveButtonMolecule(favoriteReserveWishlistItemResponse.getReserveButton());
        AtomActionDTO action2 = favoriteReserveWishlistItemResponse.getAction();
        return new FavoriteReservedChangeResult.Success(sku2, wishlistId2, uniqId2, favoriteReserveButtonMolecule2, action2 != null ? AtomActionMapperKt.toAtomAction(action2, null) : null);
    }

    public final Object addFavoriteReservedChangeRequest(Long l11, long j11, String str, Long l12, @NotNull AtomAction.ComposerAction composerAction, @NotNull c cVar, @NotNull d<? super Unit> dVar) {
        Object emit = this.favoriteReservedChangeRequests.emit(new FavoriteReservedChangeData(l11, j11, str, l12, composerAction, cVar), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @NotNull
    public final InterfaceC2395h<FavoriteReservedChangeResult> getFavoriteReserveButtonUpdates() {
        return this.favoriteReserveButtonUpdates;
    }

    @NotNull
    public final InterfaceC2395h<FavoriteReservedChangeResult> observeRequests() {
        final w0<FavoriteReservedChangeData> w0Var = this.favoriteReservedChangeRequests;
        return new C2408n0(new InterfaceC2395h<FavoriteReservedChangeResult>() { // from class: ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor$observeRequests$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor$observeRequests$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ FavoriteReserveButtonMoleculeInteractor this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor$observeRequests$$inlined$map$1$2", f = "FavoriteReserveButtonMoleculeInteractor.kt", l = {53, 50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor$observeRequests$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonMoleculeInteractor) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = favoriteReserveButtonMoleculeInteractor;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
                
                    if (r10.emit(r11, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    M m11;
                    InterfaceC2397i interfaceC2397i;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i2 = this.$this_unsafeFlow;
                                m11 = FavoriteReserveButtonMoleculeInteractor.coroutineScope;
                                U a11 = C10727i.a(m11, null, null, new FavoriteReserveButtonMoleculeInteractor$observeRequests$1$1(this.this$0, (FavoriteReserveButtonMoleculeInteractor.FavoriteReservedChangeData) obj, null), 3);
                                anonymousClass1.L$0 = interfaceC2397i2;
                                anonymousClass1.label = 1;
                                Object s11 = a11.s(anonymousClass1);
                                if (s11 != obj3) {
                                    obj2 = s11;
                                    interfaceC2397i = interfaceC2397i2;
                                }
                                return obj3;
                            }
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                                return Unit.f71690a;
                            }
                            InterfaceC2397i interfaceC2397i3 = (InterfaceC2397i) anonymousClass1.L$0;
                            s.b(obj2);
                            interfaceC2397i = interfaceC2397i3;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Object obj32 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super FavoriteReservedChangeResult> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new FavoriteReserveButtonMoleculeInteractor$observeRequests$2(this._favoriteReserveButtonUpdates));
    }
}
