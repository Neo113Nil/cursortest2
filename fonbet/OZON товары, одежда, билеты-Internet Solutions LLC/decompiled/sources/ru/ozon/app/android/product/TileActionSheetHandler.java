package ru.ozon.app.android.product;

import AF.b;
import AF.d;
import Bc.t;
import Mc.a;
import W10.c;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import qc.g;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.comparison.AddToComparisonResponse;
import ru.ozon.app.android.comparison.ComparisonRequest;
import ru.ozon.app.android.comparison.RemoveFromComparisonResponse;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.notification.NotificationDelegate;
import ru.ozon.app.android.favorites.domain.utils.FavoritesListExtentionsKt;
import ru.ozon.app.android.product.TileActionSheetHandler;
import ru.ozon.app.android.product.actionhandlers.ComposerActionWithRefreshActionHandler;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import uc.i;
import vc.C10300e;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00162\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J/\u00101\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020+H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00162\u0006\u0010/\u001a\u00020-2\u0006\u00103\u001a\u00020 H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020+2\u0006\u00103\u001a\u00020 H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00162\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b8\u00109J/\u0010>\u001a\u00020\u00162\u0006\u0010:\u001a\u00020+2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00162\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lru/ozon/app/android/product/TileActionSheetHandler;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "interactor", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "subscriptionService", "Lru/ozon/app/android/favorites/domain/bottomsheet/ActionListener;", "actionListener", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;Lru/ozon/app/android/account/subscription/SubscriptionService;Lru/ozon/app/android/favorites/domain/bottomsheet/ActionListener;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;)V", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "setWidgetViewItem", "(Lru/ozon/composer/ui/widget/l;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "setTrackingData", "(LW10/c;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "clear", "()V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Z", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "handleClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Z", "", "link", "", "id", "sku", AppMeasurementSdk.ConditionalUserProperty.NAME, "removeFromList", "(Ljava/lang/String;JJLjava/lang/String;)V", "isFavorite", "subscribeToStock", "(JZ)V", "getMessageForSubscribeToStockAction", "(Z)Ljava/lang/String;", "unsubscribeFromStock", "(J)V", "message", "deeplink", "", "icon", "onMessageReceived", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "createNotificationDelegate", "()Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "Lru/ozon/app/android/favorites/domain/bottomsheet/ActionListener;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "Lnc/a;", "disposables", "Lnc/a;", "LW10/c;", "widgetViewItem", "Lru/ozon/composer/ui/widget/l;", "notificationDelegate", "Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "Lru/ozon/app/android/product/actionhandlers/ComposerActionWithRefreshActionHandler;", "composerActionWithRefreshHandler", "Lru/ozon/app/android/product/actionhandlers/ComposerActionWithRefreshActionHandler;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileActionSheetHandler implements AtomActionSheetHandler {

    @NotNull
    private final ActionListener actionListener;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final ComposerActionWithRefreshActionHandler composerActionWithRefreshHandler;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;

    @NotNull
    private final FavoritesListsInteractor interactor;
    private NotificationDelegate notificationDelegate;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final SubscriptionService subscriptionService;

    @NotNull
    private c trackingData;
    private l widgetViewItem;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionSheetHandler.SheetAction.values().length];
            try {
                iArr[AtomActionSheetHandler.SheetAction.REMOVE_FROM_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.ADD_TO_COMPARISON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.REMOVE_FROM_COMPARISON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.COMPOSER_ACTION_WITH_REFRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.SUBSCRIBE_TO_STOCK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.UNSUBSCRIBE_FROM_STOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TileActionSheetHandler(@NotNull ComposerReferences references, @NotNull FavoritesListsInteractor interactor, @NotNull FavoriteInteractor favoriteInteractor, @NotNull FavoriteEventManager favoriteEventManager, @NotNull SubscriptionService subscriptionService, @NotNull ActionListener actionListener, @NotNull ActionV2Repository actionV2Repository, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(subscriptionService, "subscriptionService");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        this.references = references;
        this.interactor = interactor;
        this.favoriteInteractor = favoriteInteractor;
        this.favoriteEventManager = favoriteEventManager;
        this.subscriptionService = subscriptionService;
        this.actionListener = actionListener;
        this.actionV2Repository = actionV2Repository;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
        this.disposables = new C8486a();
        this.trackingData = new c(null, null, null);
        this.composerActionWithRefreshHandler = new ComposerActionWithRefreshActionHandler(references, actionV2Repository, null, 4, null);
    }

    private final NotificationDelegate createNotificationDelegate() {
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            r a11 = this.references.getContainer().a();
            viewGroup = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (viewGroup == null) {
                return null;
            }
        }
        this.favoritesComposerActionHandler.setContainer(new WeakReference<>(this.references.getContainer()));
        return new NotificationDelegate(viewGroup, this.references.getContainer().g(), new ActionHandler.Builder(this.references, TileActionSheetHandler$createNotificationDelegate$1.INSTANCE, new TileActionSheetHandler$createNotificationDelegate$2(this), new TileActionSheetHandler$createNotificationDelegate$3(this)).onComposerAction(new TileActionSheetHandler$createNotificationDelegate$4(this.favoritesComposerActionHandler)).buildHandler());
    }

    private final String getMessageForSubscribeToStockAction(boolean isFavorite) {
        return StringProvider.getString(isFavorite ? ru.ozon.app.android.videocover.R$string.common_widget_sold_out_subscription_message_in_favorites_android : R$string.common_widget_sold_out_subscription_message_android);
    }

    private final boolean handleClick(AtomAction.Click action) {
        String str;
        String str2;
        String str3;
        Map<String, String> params = action.getParams();
        boolean z11 = false;
        if (params != null && params.containsKey("NOT_NEED_PRE_PROCESS_ACTION_PARAMS_ID")) {
            return false;
        }
        AtomActionSheetHandler.SheetAction fromValue = AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(action.getId());
        int i11 = fromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()];
        Long l11 = null;
        if (i11 != 5) {
            if (i11 != 6) {
                return false;
            }
            Map<String, String> params2 = action.getParams();
            if (params2 != null && (str3 = params2.get("sku")) != null) {
                l11 = Long.valueOf(Long.parseLong(str3));
            }
            if (l11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            unsubscribeFromStock(l11.longValue());
            return false;
        }
        Map<String, String> params3 = action.getParams();
        if (params3 != null && (str2 = params3.get("sku")) != null) {
            l11 = Long.valueOf(Long.parseLong(str2));
        }
        if (l11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long longValue = l11.longValue();
        Map<String, String> params4 = action.getParams();
        if (params4 != null && (str = params4.get("isFavorite")) != null) {
            z11 = Boolean.parseBoolean(str);
        }
        subscribeToStock(longValue, z11);
        return true;
    }

    private final boolean handleComposerAction(AtomAction.ComposerAction action) {
        String str;
        String str2;
        Map<String, String> params = action.getParams();
        boolean z11 = false;
        if (params != null && params.containsKey("NOT_NEED_PRE_PROCESS_ACTION_PARAMS_ID")) {
            return false;
        }
        Map<String, String> params2 = action.getParams();
        Long y02 = (params2 == null || (str2 = params2.get("sku")) == null) ? null : h.y0(str2);
        AtomActionSheetHandler.SheetAction fromValue = AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(action.getId());
        int i11 = fromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()];
        if (i11 == 1) {
            Map<String, String> params3 = action.getParams();
            Long y03 = (params3 == null || (str = params3.get("id")) == null) ? null : h.y0(str);
            Map<String, String> params4 = action.getParams();
            String str3 = params4 != null ? params4.get(AppMeasurementSdk.ConditionalUserProperty.NAME) : null;
            String actionName = action.getActionName();
            if (y03 != null && y02 != null && str3 != null) {
                removeFromList(actionName, y03.longValue(), y02.longValue(), str3);
                return true;
            }
        } else if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    z11 = this.composerActionWithRefreshHandler.handle(action, this.trackingData);
                }
            } else if (y02 != null) {
                ActionV2Request actionV2Request = new ActionV2Request(new ComparisonRequest(y02.longValue()), action.getActionName(), false, 4, null);
                C8486a c8486a = this.disposables;
                t g10 = this.actionV2Repository.callActionWithTracking(actionV2Request, this.trackingData, RemoveFromComparisonResponse.class).j(a.b()).g(C8125a.a());
                final TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1 tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1 = new TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1(this);
                g gVar = new g(tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1) { // from class: ru.ozon.app.android.product.TileActionSheetHandler$sam$io_reactivex_functions_Consumer$0
                    private final /* synthetic */ Function1 function;

                    {
                        Intrinsics.checkNotNullParameter(tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1, "function");
                        this.function = tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1;
                    }

                    @Override // qc.g
                    public final /* synthetic */ void accept(Object obj) {
                        this.function.invoke(obj);
                    }
                };
                final TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2 tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2 = new TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2(this);
                InterfaceC8487b h11 = g10.h(gVar, new g(tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2) { // from class: ru.ozon.app.android.product.TileActionSheetHandler$sam$io_reactivex_functions_Consumer$0
                    private final /* synthetic */ Function1 function;

                    {
                        Intrinsics.checkNotNullParameter(tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2, "function");
                        this.function = tileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$2;
                    }

                    @Override // qc.g
                    public final /* synthetic */ void accept(Object obj) {
                        this.function.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
                RxExtKt.plusAssign(c8486a, h11);
                z11 = true;
            }
        } else if (y02 != null) {
            ActionV2Request actionV2Request2 = new ActionV2Request(new ComparisonRequest(y02.longValue()), action.getActionName(), false, 4, null);
            C8486a c8486a2 = this.disposables;
            t g11 = this.actionV2Repository.callActionWithTracking(actionV2Request2, this.trackingData, AddToComparisonResponse.class).j(a.b()).g(C8125a.a());
            final TileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$1 tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$1 = new TileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$1(this);
            g gVar2 = new g(tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$1) { // from class: ru.ozon.app.android.product.TileActionSheetHandler$sam$io_reactivex_functions_Consumer$0
                private final /* synthetic */ Function1 function;

                {
                    Intrinsics.checkNotNullParameter(tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$1, "function");
                    this.function = tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$1;
                }

                @Override // qc.g
                public final /* synthetic */ void accept(Object obj) {
                    this.function.invoke(obj);
                }
            };
            final TileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$2 tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$2 = new TileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$2(this);
            InterfaceC8487b h12 = g11.h(gVar2, new g(tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$2) { // from class: ru.ozon.app.android.product.TileActionSheetHandler$sam$io_reactivex_functions_Consumer$0
                private final /* synthetic */ Function1 function;

                {
                    Intrinsics.checkNotNullParameter(tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$2, "function");
                    this.function = tileActionSheetHandler$handleComposerAction$lambda$1$$inlined$invokeComparisonRequest$2;
                }

                @Override // qc.g
                public final /* synthetic */ void accept(Object obj) {
                    this.function.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(h12, "subscribe(...)");
            RxExtKt.plusAssign(c8486a2, h12);
            z11 = true;
        }
        return ((Boolean) WhenExtKt.getExhaustive(Boolean.valueOf(z11))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable throwable) {
        this.actionListener.onErrorReceived(FavoritesListExtentionsKt.toMessage(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMessageReceived(String message, String deeplink, Integer icon) {
        this.actionListener.onMessageReceived(message, 3000L, icon, deeplink != null ? StringProvider.getString(R$string.common_redirect_android) : null, deeplink);
    }

    static /* synthetic */ void onMessageReceived$default(TileActionSheetHandler tileActionSheetHandler, String str, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = Integer.valueOf(R$drawable.ic_m_green_check);
        }
        tileActionSheetHandler.onMessageReceived(str, str2, num);
    }

    private final void removeFromList(String link, long id2, long sku, String name) {
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = this.interactor.removeProductFromFavoritesList(id2, sku, link, this.trackingData).j(a.b()).g(C8125a.a()).h(new AF.a(new TileActionSheetHandler$removeFromList$1(this), 0), new b(new TileActionSheetHandler$removeFromList$2(this, name), 0));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    private final void subscribeToStock(final long sku, final boolean isFavorite) {
        C8486a c8486a = this.disposables;
        vc.l lVar = new vc.l((isFavorite ? C10300e.f102773a : this.favoriteInteractor.addToFavorite(sku)).d(new InterfaceC9019a() { // from class: AF.e
            @Override // qc.InterfaceC9019a
            public final void run() {
                TileActionSheetHandler.subscribeToStock$lambda$7(isFavorite, this, sku);
            }
        }).c(this.subscriptionService.subscribeToItemAvailabilityChange(sku)).k(a.b()), C8125a.a());
        i iVar = new i(new AF.g(new TileActionSheetHandler$subscribeToStock$3(this), 0), new InterfaceC9019a() { // from class: AF.f
            @Override // qc.InterfaceC9019a
            public final void run() {
                TileActionSheetHandler.subscribeToStock$lambda$8(TileActionSheetHandler.this, isFavorite);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToStock$lambda$7(boolean z11, TileActionSheetHandler tileActionSheetHandler, long j11) {
        if (z11) {
            return;
        }
        tileActionSheetHandler.favoriteInteractor.shareFavoriteState(j11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToStock$lambda$8(TileActionSheetHandler tileActionSheetHandler, boolean z11) {
        onMessageReceived$default(tileActionSheetHandler, tileActionSheetHandler.getMessageForSubscribeToStockAction(z11), null, null, 6, null);
    }

    private final void unsubscribeFromStock(long sku) {
        C8486a c8486a = this.disposables;
        vc.l lVar = new vc.l(this.subscriptionService.unsubscribeFromItemAvailabilityChange(sku).k(a.b()), C8125a.a());
        i iVar = new i(new d(new TileActionSheetHandler$unsubscribeFromStock$2(this), 0), new InterfaceC9019a() { // from class: AF.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                TileActionSheetHandler.unsubscribeFromStock$lambda$10(TileActionSheetHandler.this);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unsubscribeFromStock$lambda$10(TileActionSheetHandler tileActionSheetHandler) {
        onMessageReceived$default(tileActionSheetHandler, StringProvider.getString(ru.ozon.app.android.videocover.R$string.common_widget_sold_out_unsubscription_message_android), null, null, 6, null);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void clear() {
        this.notificationDelegate = null;
        this.disposables.d();
        this.composerActionWithRefreshHandler.onClear();
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            return handleComposerAction((AtomAction.ComposerAction) action);
        }
        if (action instanceof AtomAction.Click) {
            return handleClick((AtomAction.Click) action);
        }
        return false;
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void onBind() {
        AtomActionSheetHandler.DefaultImpls.onBind(this);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setTrackingData(@NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.trackingData = trackingData;
        this.favoritesComposerActionHandler.setTrackingData(trackingData);
        this.notificationDelegate = createNotificationDelegate();
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setWidgetViewItem(l viewItem) {
        this.widgetViewItem = viewItem;
    }
}
