package ru.ozon.app.android.favorites.domain.actionhandlers;

import AF.g;
import DF.a;
import Tm.C4047b;
import W10.c;
import a00.C4911f;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.favorites.data.listselector.FavoriteListAddRequest;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.flags.FavoritesWishlistsEnabledFlag;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR*\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010'\u001a\u000e\u0012\b\u0012\u00060%j\u0002`&\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "wishlistEventManager", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "favoriteAddToLists", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "favoriteListAdd", "showError", "()V", "handle", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LW10/c;", "getTrackingData", "()LW10/c;", "setTrackingData", "(LW10/c;)V", "Ljava/lang/ref/WeakReference;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Ljava/lang/ref/WeakReference;", "getContainer", "()Ljava/lang/ref/WeakReference;", "setContainer", "(Ljava/lang/ref/WeakReference;)V", "Lnc/a;", "disposable", "Lnc/a;", "", "getWishlistsEnabled", "()Z", "wishlistsEnabled", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesComposerActionHandler {

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private WeakReference<C4911f> container;

    @NotNull
    private final C8486a disposable;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final FeatureChecker featureChecker;
    private c trackingData;

    @NotNull
    private final WishlistEventManager wishlistEventManager;

    public FavoritesComposerActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull FavoriteEventManager favoriteEventManager, @NotNull FavoriteManager favoriteManager, @NotNull WishlistEventManager wishlistEventManager, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(wishlistEventManager, "wishlistEventManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.actionV2Repository = actionV2Repository;
        this.favoriteEventManager = favoriteEventManager;
        this.favoriteManager = favoriteManager;
        this.wishlistEventManager = wishlistEventManager;
        this.featureChecker = featureChecker;
        this.disposable = new C8486a();
    }

    private final void favoriteAddToLists(AtomAction.ComposerAction action) {
        Map<String, String> params;
        String str;
        Long y02;
        String str2;
        Long l11;
        Long l12;
        String id2 = action.getId();
        if (id2 == null || (params = action.getParams()) == null || (str = params.get("list_ids")) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        long longValue = y02.longValue();
        Long extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction(action);
        Long extractGiftIdFromFavoriteAction = ActionHandlersUtilsKt.extractGiftIdFromFavoriteAction(action);
        String extractUniqIdFromFavoriteAction = ActionHandlersUtilsKt.extractUniqIdFromFavoriteAction(action);
        if ((extractSkuFromFavoriteAction == null ? extractGiftIdFromFavoriteAction : extractSkuFromFavoriteAction) == null) {
            return;
        }
        if (getWishlistsEnabled()) {
            WishlistEventManager wishlistEventManager = this.wishlistEventManager;
            WishlistEvent.ProductAdditionStarted productAdditionStarted = new WishlistEvent.ProductAdditionStarted(extractSkuFromFavoriteAction, longValue, extractGiftIdFromFavoriteAction, extractUniqIdFromFavoriteAction);
            l11 = extractGiftIdFromFavoriteAction;
            str2 = extractUniqIdFromFavoriteAction;
            l12 = extractSkuFromFavoriteAction;
            longValue = longValue;
            wishlistEventManager.onWishlistChanged(productAdditionStarted);
        } else {
            str2 = extractUniqIdFromFavoriteAction;
            l11 = extractGiftIdFromFavoriteAction;
            l12 = extractSkuFromFavoriteAction;
        }
        ActionV2Request actionV2Request = new ActionV2Request(action.getParams(), id2, false, 4, null);
        C8486a c8486a = this.disposable;
        ActionV2Repository actionV2Repository = this.actionV2Repository;
        c cVar = this.trackingData;
        if (cVar == null) {
            cVar = new c(null, null, null);
        }
        Long l13 = l12;
        Long l14 = l11;
        String str3 = str2;
        InterfaceC8487b h11 = actionV2Repository.callActionWithTracking(actionV2Request, cVar, Object.class).g(C8125a.a()).h(new g(new FavoritesComposerActionHandler$favoriteAddToLists$1(l13, this, longValue, l14, str3), 5), new C4047b(new FavoritesComposerActionHandler$favoriteAddToLists$2(this, l13, longValue, l14, str3), 2));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    private final void favoriteListAdd(AtomAction.ComposerAction action) {
        Map<String, String> params;
        String str;
        Long y02;
        Map<String, String> params2;
        String str2;
        Long y03;
        String id2 = action.getId();
        if (id2 == null || (params = action.getParams()) == null || (str = params.get("sku")) == null || (y02 = h.y0(str)) == null || (params2 = action.getParams()) == null || (str2 = params2.get("id")) == null || (y03 = h.y0(str2)) == null) {
            return;
        }
        ActionV2Request actionV2Request = new ActionV2Request(new FavoriteListAddRequest(C7714v.a0(y02), y03.longValue(), null, 4, null), id2, false, 4, null);
        C8486a c8486a = this.disposable;
        ActionV2Repository actionV2Repository = this.actionV2Repository;
        c cVar = this.trackingData;
        if (cVar == null) {
            cVar = new c(null, null, null);
        }
        InterfaceC8487b h11 = actionV2Repository.callActionWithTracking(actionV2Request, cVar, Object.class).g(C8125a.a()).h(new a(new FavoritesComposerActionHandler$favoriteListAdd$1(this), 6), new BY.g(new FavoritesComposerActionHandler$favoriteListAdd$2(this), 5));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getWishlistsEnabled() {
        return this.featureChecker.isEnabled(FavoritesWishlistsEnabledFlag.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        C4911f c4911f;
        WeakReference<C4911f> weakReference = this.container;
        if (weakReference == null || (c4911f = weakReference.get()) == null) {
            return;
        }
        ViewGroup rootView = ContextExtKt.getRootView(c4911f.c());
        if (rootView == null && (rootView = ContextExtKt.getRootView(c4911f.a())) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, c4911f.g(), 62, null).show();
    }

    public final void handle(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (Intrinsics.d(id2, "favoriteAddToLists")) {
            favoriteAddToLists(action);
        } else if (Intrinsics.d(id2, "favoriteListAdd")) {
            favoriteListAdd(action);
        }
    }

    public final void setContainer(WeakReference<C4911f> weakReference) {
        this.container = weakReference;
    }

    public final void setTrackingData(c cVar) {
        this.trackingData = cVar;
    }
}
