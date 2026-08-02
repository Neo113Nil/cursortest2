package ru.ozon.app.android.favorites.ui.atomactionsheethandlers;

import B0.C2454a;
import BF.b;
import Bc.e;
import Bc.r;
import DM.f;
import DM.h;
import Fy.C3065c;
import GZ.g;
import Mc.a;
import W10.c;
import android.app.Activity;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.core.app.t;
import com.squareup.moshi.D;
import com.squareup.moshi.j;
import i10.l;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultDialog;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.favorites.ui.delegate.RemoveFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import uc.i;
import vc.l;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 k2\u00020\u0001:\u0002klB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020&2\u0006\u0010#\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020&2\u0006\u0010#\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020*H\u0002¢\u0006\u0004\b0\u0010,J\u0017\u00101\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020*H\u0002¢\u0006\u0004\b1\u0010,J5\u00108\u001a\u00020&2\u0006\u00102\u001a\u00020\u00192\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u000204\u0018\u0001032\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J/\u0010=\u001a\u00020&2\u0006\u0010:\u001a\u0002062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020&2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0019H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020&2\u0006\u0010#\u001a\u00020D2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bE\u0010FJ9\u0010K\u001a\u00020&2\u0006\u0010A\u001a\u00020\u00192\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010I\u001a\u0002062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010OR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010PR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010QR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010RR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010TR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010UR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010VR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010WR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010YR*\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010_\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/FavoritesListAtomActionSheetHandler;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "LGZ/g;", "ozonRouter", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "shoppingListsViewModel", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "", "removeListRedirectLink", "", "shouldGoBack", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "widgetTrackingData", "<init>", "(LGZ/g;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;Ljava/lang/String;ZLW10/c;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "", "onBind", "()V", "clear", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Z", "favoriteEntityAdd", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "favoriteEntityRemove", "sellerRemove", "sellerAdd", "postData", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "id", "addAllToCart", "(Ljava/lang/String;Ljava/util/Map;J)V", "listId", "permission", "shareAsManager", "shareList", "(JLjava/lang/String;Ljava/lang/Boolean;)V", "Landroid/app/Activity;", "activity", "message", "showShareSheet", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler$SheetAction;", "changePinStatus", "(Lru/ozon/app/android/action/sheet/AtomActionSheetHandler$SheetAction;J)V", "", "icon", "duration", "Lru/ozon/uni/android/flashbar/model/Action;", "showMessage", "(Ljava/lang/String;Ljava/lang/Integer;JLru/ozon/uni/android/flashbar/model/Action;)V", "LGZ/g;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "Ljava/lang/String;", "Z", "LW10/c;", "getWidgetTrackingData", "()LW10/c;", "setWidgetTrackingData", "(LW10/c;)V", "requestId", "J", "getRequestId", "()J", "setRequestId", "(J)V", "Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate;", "removeFavoritesListDelegate", "Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate;", "Lnc/a;", "disposables", "Lnc/a;", "Companion", "CartParamList", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritesListAtomActionSheetHandler implements AtomActionSheetHandler {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final CreateFavoritesListDelegate createFavoritesListDelegate;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final FavoriteEntityInteractor favoriteEntityInteractor;

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;

    @NotNull
    private final FavoritesListsInteractor favoritesListsInteractor;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final ComposerReferences references;
    private RemoveFavoritesListDelegate removeFavoritesListDelegate;
    private String removeListRedirectLink;
    private long requestId;

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    @NotNull
    private final ShoppingListsViewModel shoppingListsViewModel;
    private final boolean shouldGoBack;
    private c widgetTrackingData;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionSheetHandler.SheetAction.values().length];
            try {
                iArr[AtomActionSheetHandler.SheetAction.FAVORITES_SHARE_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.PIN_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.UNPIN_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.ADD_TO_CART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.DELETE_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.FAVORITE_CREATE_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.FAVORITE_SELLER_REMOVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.FAVORITE_SELLER_ADD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.ADD_TO_FAVORITE_ENTITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.REMOVE_FROM_FAVORITE_ENTITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FavoritesListAtomActionSheetHandler(@NotNull g ozonRouter, @NotNull JsonParser jsonDeserializer, @NotNull FavoritesListsInteractor favoritesListsInteractor, @NotNull ShoppingListsViewModel shoppingListsViewModel, @NotNull CartService cartService, @NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull ComposerReferences references, @NotNull CreateFavoritesListDelegate createFavoritesListDelegate, @NotNull AdultHandler adultHandler, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull FavoriteEntityInteractor favoriteEntityInteractor, String str, boolean z11, c cVar) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(favoritesListsInteractor, "favoritesListsInteractor");
        Intrinsics.checkNotNullParameter(shoppingListsViewModel, "shoppingListsViewModel");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(createFavoritesListDelegate, "createFavoritesListDelegate");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        this.ozonRouter = ozonRouter;
        this.jsonDeserializer = jsonDeserializer;
        this.favoritesListsInteractor = favoritesListsInteractor;
        this.shoppingListsViewModel = shoppingListsViewModel;
        this.cartService = cartService;
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        this.references = references;
        this.createFavoritesListDelegate = createFavoritesListDelegate;
        this.adultHandler = adultHandler;
        this.sellerFavoriteService = sellerFavoriteService;
        this.favoriteEntityInteractor = favoriteEntityInteractor;
        this.removeListRedirectLink = str;
        this.shouldGoBack = z11;
        this.widgetTrackingData = cVar;
        this.disposables = new C8486a();
        cartService.attach(references.getTokenizedAnalytics());
    }

    private final void addAllToCart(String postData, Map<String, TokenizedTrackingInfo> trackingInfo, long id2) {
        int i11 = 7;
        List<CartParamList> list = (List) this.jsonDeserializer.fromJson(postData, D.e(List.class, CartParamList.class));
        int i12 = 10;
        int h11 = U.h(C7714v.z(list, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (CartParamList cartParamList : list) {
            Pair pair = new Pair(Long.valueOf(cartParamList.getId()), new CartItemInfo(cartParamList.getQuantity(), cartParamList.getSelectedDeliverySchema(), null, null, null, null, 60, null));
            linkedHashMap.put(pair.e(), pair.f());
        }
        ArrayList arrayList = new ArrayList();
        for (CartParamList cartParamList2 : list) {
            ProductTokenizedCartAnalyticsEvent productTokenizedCartAnalyticsEvent = trackingInfo != null ? new ProductTokenizedCartAnalyticsEvent(cartParamList2.getId(), new TokenizedCartAnalyticsEvent(new TokenizedCartType.ChangeCartType(cartParamList2.getQuantity()), TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(this.requestId), null, 2, null))) : null;
            if (productTokenizedCartAnalyticsEvent != null) {
                arrayList.add(productTokenizedCartAnalyticsEvent);
            }
        }
        AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics = new AddProductsWithTokenizedAnalytics(linkedHashMap, arrayList, null, Long.valueOf(id2), null, 20, null);
        C8486a c8486a = this.disposables;
        y<CartAddItemDTO> addMultipleProductsWithCustomAnalytics = this.cartService.addMultipleProductsWithCustomAnalytics(addProductsWithTokenizedAnalytics);
        f fVar = new f(FavoritesListAtomActionSheetHandler$addAllToCart$1.INSTANCE, i11);
        addMultipleProductsWithCustomAnalytics.getClass();
        InterfaceC8487b h12 = new r(addMultipleProductsWithCustomAnalytics, fVar).g(C8125a.a()).h(new DM.g(new FavoritesListAtomActionSheetHandler$addAllToCart$2(this), i11), new h(new FavoritesListAtomActionSheetHandler$addAllToCart$3(this), i12));
        Intrinsics.checkNotNullExpressionValue(h12, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartAddItemDTO addAllToCart$lambda$12(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CartAddItemDTO) function1.invoke(p02);
    }

    private final void changePinStatus(AtomActionSheetHandler.SheetAction action, long id2) {
        C8486a c8486a = this.disposables;
        l lVar = new l(this.favoritesListsInteractor.changePinStatus(action.getId(), id2).k(a.b()), C8125a.a());
        i iVar = new i(new DM.i(new FavoritesListAtomActionSheetHandler$changePinStatus$2(this), 16), new InterfaceC9019a() { // from class: st.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                FavoritesListAtomActionSheetHandler.changePinStatus$lambda$18(FavoritesListAtomActionSheetHandler.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changePinStatus$lambda$18(FavoritesListAtomActionSheetHandler favoritesListAtomActionSheetHandler) {
        InterfaceC7851b.a.a(favoritesListAtomActionSheetHandler.references.getController(), null, null, null, null, 15);
        favoritesListAtomActionSheetHandler.favoritesListsEventsManager.onPinStatusChanged();
    }

    private final void favoriteEntityAdd(AtomAction.ComposerAction action) {
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.favoriteEntityInteractor.updateFavoriteEntity(action, false).h(new BF.a(new FavoritesListAtomActionSheetHandler$favoriteEntityAdd$1(this), 9), new b(new FavoritesListAtomActionSheetHandler$favoriteEntityAdd$2(this), 13));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    private final void favoriteEntityRemove(AtomAction.ComposerAction action) {
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.favoriteEntityInteractor.updateFavoriteEntity(action, true).h(new GH.b(new FavoritesListAtomActionSheetHandler$favoriteEntityRemove$1(this), 12), new C3065c(new FavoritesListAtomActionSheetHandler$favoriteEntityRemove$2(this), 16));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    private final boolean handleComposerAction(AtomAction.ComposerAction action) {
        String str;
        String str2;
        String str3;
        Map<String, String> params = action.getParams();
        final Boolean bool = null;
        bool = null;
        final Long y02 = (params == null || (str3 = params.get("id")) == null) ? null : kotlin.text.h.y0(str3);
        AtomActionSheetHandler.SheetAction fromValue = AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(action.getId());
        switch (fromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()]) {
            case 1:
                Map<String, String> params2 = action.getParams();
                boolean parseBoolean = (params2 == null || (str2 = params2.get("hasAdultProducts")) == null) ? false : Boolean.parseBoolean(str2);
                Map<String, String> params3 = action.getParams();
                final String str4 = params3 != null ? params3.get("permission") : null;
                Map<String, String> params4 = action.getParams();
                if (params4 != null && (str = params4.get("shareAsManager")) != null) {
                    bool = Boolean.valueOf(Boolean.parseBoolean(str));
                }
                if (y02 == null) {
                    return false;
                }
                if (parseBoolean) {
                    this.adultHandler.forceShowAdultDialog(this.references.getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler$handleComposerAction$1
                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultAccept() {
                            FavoritesListAtomActionSheetHandler.this.shareList(y02.longValue(), str4, bool);
                        }

                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultReject() {
                            AdultListener.DefaultImpls.onAdultReject(this);
                        }
                    }, new AdultDialog.Customisation(StringProvider.getString(R$string.favorites_adult_dialog_list_request), StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_share), null, AdultDialog.Customisation.Style.NO_STYLE, 4, null), true);
                } else {
                    shareList(y02.longValue(), str4, bool);
                }
                return true;
            case 2:
            case 3:
                if (y02 == null) {
                    return false;
                }
                changePinStatus(fromValue, y02.longValue());
                return true;
            case 4:
                Map<String, String> params5 = action.getParams();
                String str5 = params5 != null ? params5.get("postData") : null;
                if (y02 == null || str5 == null || str5.length() == 0) {
                    return false;
                }
                addAllToCart(str5, action.getTrackingInfo(), y02.longValue());
                return true;
            case 5:
                if (y02 == null) {
                    return false;
                }
                RemoveFavoritesListDelegate removeFavoritesListDelegate = this.removeFavoritesListDelegate;
                if (removeFavoritesListDelegate != null) {
                    removeFavoritesListDelegate.showRemoveConfirmationDialog(y02, this.removeListRedirectLink, this.shouldGoBack, this.requestId);
                    return true;
                }
                Intrinsics.n("removeFavoritesListDelegate");
                throw null;
            case 6:
                this.createFavoritesListDelegate.handle(action, this.references);
                return true;
            case 7:
                sellerRemove(action);
                return false;
            case 8:
                sellerAdd(action);
                return false;
            case 9:
                favoriteEntityAdd(action);
                return false;
            case 10:
                favoriteEntityRemove(action);
                return false;
            default:
                return false;
        }
    }

    private final boolean sellerAdd(AtomAction.ComposerAction action) {
        String str;
        Map<String, String> params = action.getParams();
        Long y02 = (params == null || (str = params.get("sellerId")) == null) ? null : kotlin.text.h.y0(str);
        if (y02 == null) {
            return false;
        }
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.sellerFavoriteService.addSellerFavoriteWithResult(y02.longValue()).j(a.b()).g(C8125a.a()).h(new DM.b(new FavoritesListAtomActionSheetHandler$sellerAdd$1(this), 9), new DM.c(new FavoritesListAtomActionSheetHandler$sellerAdd$2(this), 9));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
        return true;
    }

    private final boolean sellerRemove(AtomAction.ComposerAction action) {
        String str;
        Map<String, String> params = action.getParams();
        Long y02 = (params == null || (str = params.get("sellerId")) == null) ? null : kotlin.text.h.y0(str);
        if (y02 == null) {
            return false;
        }
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.sellerFavoriteService.removeSellerFavoriteWithResult(y02.longValue()).j(a.b()).g(C8125a.a()).h(new CJ.a(new FavoritesListAtomActionSheetHandler$sellerRemove$1(this), 7), new CJ.b(new FavoritesListAtomActionSheetHandler$sellerRemove$2(this), 9));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareList(long listId, String permission, Boolean shareAsManager) {
        this.references.getController().e(new l.a.C1079a(0L, null, 3));
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new e(this.favoritesListsInteractor.shareFavoritesList(listId, permission, shareAsManager).j(a.b()).g(C8125a.a()), new InterfaceC9019a() { // from class: st.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                FavoritesListAtomActionSheetHandler.shareList$lambda$15(FavoritesListAtomActionSheetHandler.this);
            }
        }).h(new Fw.b(new FavoritesListAtomActionSheetHandler$shareList$2(this), 10), new DM.e(new FavoritesListAtomActionSheetHandler$shareList$3(this), 10));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareList$lambda$15(FavoritesListAtomActionSheetHandler favoritesListAtomActionSheetHandler) {
        favoritesListAtomActionSheetHandler.references.getController().hideLoader();
    }

    private final void showMessage(String message, Integer icon, long duration, Action action) {
        ViewGroup b11 = Bl.b.b(this.references);
        if (b11 != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, b11, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, icon, null, null, null, action, null, null, null, Long.valueOf(duration), null, null, this.references.getContainer().f(), 56794, null).show();
        }
    }

    static /* synthetic */ void showMessage$default(FavoritesListAtomActionSheetHandler favoritesListAtomActionSheetHandler, String str, Integer num, long j11, Action action, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            j11 = 3000;
        }
        if ((i11 & 8) != 0) {
            action = null;
        }
        favoritesListAtomActionSheetHandler.showMessage(str, num, j11, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShareSheet(Activity activity, String message) {
        t.a aVar = new t.a(activity);
        aVar.g("text/plain");
        aVar.f(message);
        aVar.d(StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_share));
        aVar.h();
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void clear() {
        this.disposables.d();
        this.createFavoritesListDelegate.clear();
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Move)) {
            if (action instanceof AtomAction.ComposerAction) {
                return handleComposerAction((AtomAction.ComposerAction) action);
            }
            return false;
        }
        String link = ((AtomAction.Move) action).getLink();
        if (link == null) {
            return false;
        }
        String uri = Uri.parse(link).buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        boolean d11 = Intrinsics.d(uri, LinkGenerator.INSTANCE.createFavoritesList().toString());
        if (d11) {
            this.ozonRouter.b(link, 28416, U.c());
        }
        return d11;
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void onBind() {
        ShoppingListsViewModel shoppingListsViewModel = this.shoppingListsViewModel;
        ComposerReferences composerReferences = this.references;
        this.removeFavoritesListDelegate = new RemoveFavoritesListDelegate(shoppingListsViewModel, composerReferences, composerReferences.getContainer().f(), this.references.getContainer().g());
    }

    public final void setRequestId(long j11) {
        this.requestId = j11;
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setTrackingData(@NotNull c cVar) {
        AtomActionSheetHandler.DefaultImpls.setTrackingData(this, cVar);
    }

    public final void setWidgetTrackingData(c cVar) {
        this.widgetTrackingData = cVar;
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setWidgetViewItem(ru.ozon.composer.ui.widget.l lVar) {
        AtomActionSheetHandler.DefaultImpls.setWidgetViewItem(this, lVar);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/FavoritesListAtomActionSheetHandler$CartParamList;", "", "id", "", "quantity", "", "selectedDeliverySchema", "<init>", "(JILjava/lang/Long;)V", "getId", "()J", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(JILjava/lang/Long;)Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/FavoritesListAtomActionSheetHandler$CartParamList;", "equals", "", "other", "hashCode", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartParamList {
        public static final int $stable = 0;
        private final long id;
        private final int quantity;
        private final Long selectedDeliverySchema;

        public CartParamList(long j11, int i11, Long l11) {
            this.id = j11;
            this.quantity = i11;
            this.selectedDeliverySchema = l11;
        }

        public static /* synthetic */ CartParamList copy$default(CartParamList cartParamList, long j11, int i11, Long l11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j11 = cartParamList.id;
            }
            if ((i12 & 2) != 0) {
                i11 = cartParamList.quantity;
            }
            if ((i12 & 4) != 0) {
                l11 = cartParamList.selectedDeliverySchema;
            }
            return cartParamList.copy(j11, i11, l11);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        @NotNull
        public final CartParamList copy(long id2, int quantity, Long selectedDeliverySchema) {
            return new CartParamList(id2, quantity, selectedDeliverySchema);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartParamList)) {
                return false;
            }
            CartParamList cartParamList = (CartParamList) other;
            return this.id == cartParamList.id && this.quantity == cartParamList.quantity && Intrinsics.d(this.selectedDeliverySchema, cartParamList.selectedDeliverySchema);
        }

        public final long getId() {
            return this.id;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.quantity, Long.hashCode(this.id) * 31, 31);
            Long l11 = this.selectedDeliverySchema;
            return a11 + (l11 == null ? 0 : l11.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            int i11 = this.quantity;
            Long l11 = this.selectedDeliverySchema;
            StringBuilder b11 = Ql.c.b(j11, "CartParamList(id=", i11, ", quantity=");
            b11.append(", selectedDeliverySchema=");
            b11.append(l11);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ CartParamList(long j11, int i11, Long l11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, i11, (i12 & 4) != 0 ? null : l11);
        }
    }

    public /* synthetic */ FavoritesListAtomActionSheetHandler(g gVar, JsonParser jsonParser, FavoritesListsInteractor favoritesListsInteractor, ShoppingListsViewModel shoppingListsViewModel, CartService cartService, FavoritesListsEventsManager favoritesListsEventsManager, ComposerReferences composerReferences, CreateFavoritesListDelegate createFavoritesListDelegate, AdultHandler adultHandler, SellerFavoriteService sellerFavoriteService, FavoriteEntityInteractor favoriteEntityInteractor, String str, boolean z11, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, jsonParser, favoritesListsInteractor, shoppingListsViewModel, cartService, favoritesListsEventsManager, composerReferences, createFavoritesListDelegate, adultHandler, sellerFavoriteService, favoriteEntityInteractor, (i11 & 2048) != 0 ? null : str, (i11 & 4096) != 0 ? false : z11, (i11 & 8192) != 0 ? null : cVar);
    }
}
