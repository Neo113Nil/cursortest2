package ru.ozon.app.android.favorites.ui.actionhandler;

import De.C2859b;
import De.s;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import Wc.a;
import a00.C4911f;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoritesWishlistRemoveRequest;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent$Result$ActionResult;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 12\u00020\u0001:\u000212B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJL\u0010\u0017\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\"\u001a\u00020\u00162\n\u0010!\u001a\u00060\u001fj\u0002` H\u0082@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020\u001cH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001a\u0010-\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteWishlistRemoveActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "wishlistEventManager", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LVg/d;Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;)V", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteWishlistRemoveActionHandler$FavoriteWishlistRemoveResponse;", "response", "", "sku", "listId", "giftId", "", "uniqId", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "handleResponse", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lkotlin/coroutines/d;)Ljava/lang/Object;", "notifyProductRemovalFailed", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showError", "(La00/f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isOpenModalAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LVg/d;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "FavoriteWishlistRemoveResponse", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteWishlistRemoveActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final WishlistEventManager wishlistEventManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC4008j<M> coroutineScope$delegate = k.b(FavoriteWishlistRemoveActionHandler$Companion$coroutineScope$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteWishlistRemoveActionHandler$Companion;", "", "<init>", "()V", "Lxe/M;", "coroutineScope$delegate", "LSc/j;", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "", "MODAL_LINK", "Ljava/lang/String;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final M getCoroutineScope() {
            return (M) FavoriteWishlistRemoveActionHandler.coroutineScope$delegate.getValue();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteWishlistRemoveActionHandler$FavoriteWishlistRemoveResponse;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class FavoriteWishlistRemoveResponse {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        public FavoriteWishlistRemoveResponse(@NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public static /* synthetic */ FavoriteWishlistRemoveResponse copy$default(FavoriteWishlistRemoveResponse favoriteWishlistRemoveResponse, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = favoriteWishlistRemoveResponse.action;
            }
            return favoriteWishlistRemoveResponse.copy(atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final FavoriteWishlistRemoveResponse copy(@NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new FavoriteWishlistRemoveResponse(action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FavoriteWishlistRemoveResponse) && Intrinsics.d(this.action, ((FavoriteWishlistRemoveResponse) other).action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return C2859b.f("FavoriteWishlistRemoveResponse(action=", ")", this.action);
        }
    }

    public FavoriteWishlistRemoveActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull d customActionHandlersStoreFactory, @NotNull WishlistEventManager wishlistEventManager) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(wishlistEventManager, "wishlistEventManager");
        this.actionV2Repository = actionV2Repository;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.wishlistEventManager = wishlistEventManager;
        this.actionId = "favoriteWishlistRemove";
    }

    private final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerRefs) {
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new FavoriteWishlistRemoveActionHandler$createActionHandler$1(handlerRefs), new FavoriteWishlistRemoveActionHandler$createActionHandler$2(handlerRefs)).customActionHandlers(new FavoriteWishlistRemoveActionHandler$createActionHandler$3(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(ActionV2Response<FavoriteWishlistRemoveResponse> actionV2Response, Long l11, long j11, Long l12, String str, CustomActionHandler.HandlerReferences handlerReferences, kotlin.coroutines.d<? super Unit> dVar) {
        AtomActionDTO action;
        AtomAction atomAction;
        String error = actionV2Response.getError();
        if (error != null && error.length() != 0) {
            notifyProductRemovalFailed(l11, j11, l12, str);
            Object showError = showError(handlerReferences.getRefs().getContainer(), dVar);
            return showError == a.COROUTINE_SUSPENDED ? showError : Unit.f71690a;
        }
        FavoriteWishlistRemoveResponse data = actionV2Response.getData();
        if (data == null || (action = data.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return Unit.f71690a;
        }
        createActionHandler(handlerReferences).invoke(atomAction);
        if (isOpenModalAction(atomAction)) {
            notifyProductRemovalFailed(l11, j11, l12, str);
        }
        return Unit.f71690a;
    }

    private final boolean isOpenModalAction(AtomAction atomAction) {
        String link = atomAction instanceof AtomAction.Move ? ((AtomAction.Move) atomAction).getLink() : atomAction instanceof AtomAction.Click ? ((AtomAction.Click) atomAction).getLink() : atomAction instanceof AtomAction.OpenComposerNestedPage ? ((AtomAction.OpenComposerNestedPage) atomAction).getLink() : atomAction instanceof AtomAction.Refresh ? ((AtomAction.Refresh) atomAction).getLink() : null;
        if (link != null) {
            return h.t(link, "/modal", false);
        }
        return false;
    }

    private final void notifyProductRemovalFailed(Long sku, long listId, Long giftId, String uniqId) {
        this.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductRemoved(sku, listId, WishlistEvent$Result$ActionResult.FAILED, giftId, uniqId));
    }

    private final Object showError(C4911f c4911f, kotlin.coroutines.d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new FavoriteWishlistRemoveActionHandler$showError$2(c4911f, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.ComposerAction composerAction;
        Long extractListIdFromFavoriteAction;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.ComposerAction) && (extractListIdFromFavoriteAction = ActionHandlersUtilsKt.extractListIdFromFavoriteAction((composerAction = (AtomAction.ComposerAction) action))) != null) {
            long longValue = extractListIdFromFavoriteAction.longValue();
            Long extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction(composerAction);
            Long extractGiftIdFromFavoriteAction = ActionHandlersUtilsKt.extractGiftIdFromFavoriteAction(composerAction);
            String extractUniqIdFromFavoriteAction = ActionHandlersUtilsKt.extractUniqIdFromFavoriteAction(composerAction);
            if ((extractSkuFromFavoriteAction == null ? extractGiftIdFromFavoriteAction : extractSkuFromFavoriteAction) == null) {
                return;
            }
            ActionV2Request actionV2Request = new ActionV2Request(new FavoritesWishlistRemoveRequest(longValue, extractSkuFromFavoriteAction, null, extractGiftIdFromFavoriteAction, extractUniqIdFromFavoriteAction, 4, null), composerAction.getActionName(), false, 4, null);
            this.wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductRemovalStarted(extractSkuFromFavoriteAction, longValue, extractGiftIdFromFavoriteAction, extractUniqIdFromFavoriteAction));
            C10727i.c(Companion.getCoroutineScope(), null, null, new FavoriteWishlistRemoveActionHandler$processAction$1(this, actionV2Request, handlerRefs, extractSkuFromFavoriteAction, longValue, extractGiftIdFromFavoriteAction, extractUniqIdFromFavoriteAction, null), 3);
        }
    }
}
