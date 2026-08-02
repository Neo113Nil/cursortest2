package ru.ozon.app.android.messenger.initializer;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.navigation.action.e;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.analytics.ActionUsageAnalytics;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.messenger.initializer.MessengerActionHandlerImpl;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u00020\u0001:\u0002BCBK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J\u0013\u0010\u001e\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J'\u0010\"\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010\u0017J\u0013\u0010'\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010\u0017J\u0013\u0010(\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010\u0017J\u0015\u0010)\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0010048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R'\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lru/ozon/app/android/messenger/initializer/MessengerActionHandlerImpl;", "Lru/ozon/android/messenger/framework/navigation/action/f;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/android/messenger/framework/analytics/i;", "trackerAnalyticsAdapter", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "appStoreInfoProvider", "Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;", "actionUsageAnalytics", "Landroid/content/Context;", "context", "", "namespace", "<init>", "(Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/android/messenger/framework/analytics/i;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "", "handleOpenWebViewAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "atomAction", "sendIntent", "Lru/ozon/uni/atoms/af/AtomAction;", "sendAnalytics", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "invokePlusClicked", "invokeMinusClicked", "", "quantity", "actionId", "sendTileScrollClicksAnalytics", "(ILjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "getCartActionType", "(ILjava/lang/String;)Ljava/lang/String;", "invokeAddToCart", "invokeAddToFavorite", "invokeRedirectToApplicationStore", "invokeOpenWebView", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Lkotlin/Unit;", "handleAction", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/android/messenger/framework/analytics/i;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;", "Landroid/content/Context;", "Ljava/lang/String;", "", "ignoreAlayticsIds", "Ljava/util/List;", "Lru/ozon/android/messenger/framework/navigation/action/e;", "messengerActionSender$delegate", "LSc/j;", "getMessengerActionSender", "()Lru/ozon/android/messenger/framework/navigation/action/e;", "messengerActionSender", "Lkotlin/Function1;", "baseActionHandler$delegate", "getBaseActionHandler", "()Lkotlin/jvm/functions/Function1;", "baseActionHandler", "Companion", "Factory", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerActionHandlerImpl implements f {

    @NotNull
    private final ActionUsageAnalytics actionUsageAnalytics;

    @NotNull
    private final AppStoreInfoProvider appStoreInfoProvider;

    /* renamed from: baseActionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j baseActionHandler;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final Context context;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;

    @NotNull
    private final List<String> ignoreAlayticsIds;

    /* renamed from: messengerActionSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j messengerActionSender;

    @NotNull
    private final String namespace;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final i trackerAnalyticsAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/messenger/initializer/MessengerActionHandlerImpl$Companion;", "", "<init>", "()V", "ADD_TO_CART", "", "ADD_TO_FAVORITE", "PLUS_CLICK", "MINUS_CLICK", "OPEN_AI_HISTORY", "PARAMS_ID", "PARAMS_SKU", "PARAMS_ITEM_ID", "PARAMS_DELIVERY_SCHEMA", "PARAMS_QUANTITY", "PARAMS_SOFT_AFTER_SKU", "PARAMS_FOR_STARS", "PARAMS_WHOLE_QUANT", "PARAMS_ANDROID_DEFAULT", "PARAMS_CURRENT_COUNT", "PARAMS_NEXT_COUNT", "PARAMS_PRODUCT_ID", "PARAMS_MIN_ITEMS", "OPEN_APPLICATION_STORE", "OZON_BROWSER_DEEPLINK_ARG", "HTTP_PROTOCOL", "OZON_STRING", "DEFAULT_QUANTITY", "", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/messenger/initializer/MessengerActionHandlerImpl$Factory;", "", "create", "Lru/ozon/app/android/messenger/initializer/MessengerActionHandlerImpl;", "namespace", "", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MessengerActionHandlerImpl create(@NotNull String namespace);
    }

    public MessengerActionHandlerImpl(@NotNull ComposerNavigator navigator, @NotNull i trackerAnalyticsAdapter, @NotNull CartService cartService, @NotNull FavoriteInteractor favoriteInteractor, @NotNull AppStoreInfoProvider appStoreInfoProvider, @NotNull ActionUsageAnalytics actionUsageAnalytics, @NotNull Context context, @NotNull String namespace) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(trackerAnalyticsAdapter, "trackerAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(appStoreInfoProvider, "appStoreInfoProvider");
        Intrinsics.checkNotNullParameter(actionUsageAnalytics, "actionUsageAnalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        this.navigator = navigator;
        this.trackerAnalyticsAdapter = trackerAnalyticsAdapter;
        this.cartService = cartService;
        this.favoriteInteractor = favoriteInteractor;
        this.appStoreInfoProvider = appStoreInfoProvider;
        this.actionUsageAnalytics = actionUsageAnalytics;
        this.context = context;
        this.namespace = namespace;
        this.ignoreAlayticsIds = C7714v.b0("plusClick", "minusClick", "openAiHistory");
        this.messengerActionSender = k.b(new MessengerActionHandlerImpl$messengerActionSender$2(this));
        this.baseActionHandler = k.a(n.NONE, new MessengerActionHandlerImpl$baseActionHandler$2(this));
    }

    private final Function1<AtomAction, Unit> getBaseActionHandler() {
        return (Function1) this.baseActionHandler.getValue();
    }

    private final String getCartActionType(int quantity, String actionId) {
        return (quantity == 0 || Intrinsics.d(actionId, "removeFromCart")) ? ActionType.REMOVE.INSTANCE.getType() : (quantity == 1 && Intrinsics.d(actionId, "plusButtonClick")) ? ActionType.TO_CART.INSTANCE.getType() : Intrinsics.d(actionId, "minusButtonClick") ? ActionType.DECREMENT.INSTANCE.getType() : (!Intrinsics.d(actionId, "plusButtonClick") || quantity <= 1) ? ActionType.TO_CART.INSTANCE.getType() : ActionType.INCREMENT.INSTANCE.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e getMessengerActionSender() {
        return (e) this.messengerActionSender.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if (r14 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleOpenWebViewAction(AtomAction.Click click) {
        AtomAction.Click click2;
        AtomAction.Click click3;
        String link = click.getLink();
        String str = null;
        try {
            URL url = new URL(String.valueOf(link));
            String host = url.getHost();
            Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
            if (h.t(host, "ozon", false)) {
                str = link;
            } else {
                String protocol = url.getProtocol();
                Intrinsics.checkNotNullExpressionValue(protocol, "getProtocol(...)");
                if (h.e0(protocol, "http", false)) {
                    str = "ozon://browser?url=" + link;
                }
            }
        } catch (MalformedURLException e11) {
            a.f17149a.e(e11);
        }
        String str2 = str;
        if (str2 != null) {
            if (link != null) {
                click2 = click;
                click3 = AtomAction.Click.copy$default(click2, null, str2, null, null, null, null, 61, null);
            } else {
                click2 = click;
            }
            click3 = click2;
            if (invokeOpenWebView(click3) != null) {
                return;
            }
        } else {
            click2 = click;
        }
        sendIntent(click2);
    }

    private final void invokeAddToCart(AtomAction.Click click) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer w02;
        String str5;
        Map<String, String> params = click.getParams();
        Boolean bool = null;
        LinkedHashMap u11 = params != null ? U.u(params) : null;
        String str6 = u11 != null ? (String) u11.remove("itemId") : null;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = u11 != null ? (String) u11.remove("id") : null;
        Long y02 = (u11 == null || (str5 = (String) u11.remove("selectedDeliverySchema")) == null) ? null : h.y0(str5);
        int intValue = (u11 == null || (str4 = (String) u11.remove("quantity")) == null || (w02 = h.w0(str4)) == null) ? 1 : w02.intValue();
        Long y03 = (u11 == null || (str3 = (String) u11.remove("sortAfterSku")) == null) ? null : h.y0(str3);
        Boolean valueOf = (u11 == null || (str2 = (String) u11.remove("forStars")) == null) ? null : Boolean.valueOf(Boolean.parseBoolean(str2));
        if (u11 != null && (str = (String) u11.remove("wholeQuant")) != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(str));
        }
        Boolean bool2 = bool;
        CartService cartService = this.cartService;
        if (str7 == null) {
            str7 = "";
        }
        RxExtKt.subscribeBy(CartService.DefaultImpls.addProductToCart$default(cartService, str7, intValue, y02, click.getTrackingInfo(), null, null, y03, valueOf, bool2, u11, 32, null), new MessengerActionHandlerImpl$invokeAddToCart$1(this, str6), new MessengerActionHandlerImpl$invokeAddToCart$2(a.f17149a));
    }

    private final void invokeAddToFavorite(AtomAction.Click click) {
        Map<String, String> params = click.getParams();
        String str = params != null ? params.get("sku") : null;
        Map<String, String> params2 = click.getParams();
        String str2 = params2 != null ? params2.get("itemId") : null;
        if (str2 == null) {
            str2 = "";
        }
        FavoriteInteractor favoriteInteractor = this.favoriteInteractor;
        if (str == null) {
            str = "";
        }
        RxExtKt.subscribeBy(favoriteInteractor.addToFavorite(Long.parseLong(str)), new MessengerActionHandlerImpl$invokeAddToFavorite$1(this, str2), new MessengerActionHandlerImpl$invokeAddToFavorite$2(a.f17149a));
    }

    private final void invokeMinusClicked(final AtomAction.Click click) {
        String str;
        String str2;
        Integer w02;
        Integer w03;
        Map<String, String> params = click.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : null;
        if (u11 == null || (str = (String) u11.remove("productId")) == null || (str2 = (String) u11.remove("nextCount")) == null || (w02 = h.w0(str2)) == null) {
            return;
        }
        final int intValue = w02.intValue();
        String str3 = (String) u11.remove("minItems");
        if (str3 == null || (w03 = h.w0(str3)) == null) {
            return;
        }
        int intValue2 = w03.intValue();
        String str4 = (String) u11.remove("selectedDeliverySchema");
        Long y02 = str4 != null ? h.y0(str4) : null;
        if (intValue >= intValue2) {
            CartService.DefaultImpls.addProductToCart$default(this.cartService, str, intValue, y02, click.getTrackingInfo(), null, "minusButtonClick", null, null, null, null, 960, null).d(new InterfaceC9019a() { // from class: rA.a
                @Override // qc.InterfaceC9019a
                public final void run() {
                    MessengerActionHandlerImpl.this.sendTileScrollClicksAnalytics(intValue, "minusButtonClick", click);
                }
            }).i();
        } else {
            CartService.DefaultImpls.removeProductFromCart$default(this.cartService, str, 0, y02, click.getTrackingInfo(), null, null, null, 96, null).d(new InterfaceC9019a() { // from class: rA.b
                @Override // qc.InterfaceC9019a
                public final void run() {
                    MessengerActionHandlerImpl.this.sendTileScrollClicksAnalytics(intValue, "minusButtonClick", click);
                }
            }).i();
        }
    }

    private final Unit invokeOpenWebView(AtomAction.Click click) {
        String link = click.getLink();
        if (link == null) {
            return null;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.navigator, link, null, 2, null);
        return Unit.f71690a;
    }

    private final void invokePlusClicked(final AtomAction.Click click) {
        String str;
        String str2;
        Integer w02;
        Integer w03;
        String str3;
        String str4;
        Map<String, String> params = click.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : null;
        if (u11 == null || (str = (String) u11.remove("productId")) == null || (str2 = (String) u11.remove("nextCount")) == null || (w02 = h.w0(str2)) == null) {
            return;
        }
        final int intValue = w02.intValue();
        String str5 = (String) u11.remove("currentCount");
        if (str5 == null || (w03 = h.w0(str5)) == null) {
            return;
        }
        int intValue2 = w03.intValue();
        String str6 = (String) u11.remove("selectedDeliverySchema");
        Long y02 = str6 != null ? h.y0(str6) : null;
        if (intValue2 == 0) {
            str3 = "";
            str4 = str3;
        } else {
            str3 = "plusButtonClick";
            str4 = "";
        }
        final String str7 = str3;
        CartService.DefaultImpls.addProductToCart$default(this.cartService, str, intValue, y02, click.getTrackingInfo(), null, intValue2 == 0 ? str4 : "plusButtonClick", null, null, null, u11, 448, null).d(new InterfaceC9019a() { // from class: rA.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                MessengerActionHandlerImpl.this.sendTileScrollClicksAnalytics(intValue, str7, click);
            }
        }).i();
    }

    private final void invokeRedirectToApplicationStore(AtomAction.Click click) {
        Map<String, String> params = click.getParams();
        if (params == null) {
            return;
        }
        String str = params.get(this.appStoreInfoProvider.retrievePackageName());
        if (str == null && (str = params.get("ANDROID_DEFAULT")) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.navigator, str, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void sendAnalytics(AtomAction atomAction) {
        if (!(atomAction instanceof AtomAction.SendAnalytics) || C7714v.A(this.ignoreAlayticsIds, atomAction.getId())) {
            return;
        }
        ru.ozon.android.messenger.framework.analytics.h.e(this.trackerAnalyticsAdapter, ru.ozon.android.messenger.framework.analytics.h.a(((AtomAction.SendAnalytics) atomAction).getTrackingInfo()));
    }

    private final void sendIntent(AtomAction.Click atomAction) {
        String link = atomAction.getLink();
        Intent intent = new Intent("android.intent.action.VIEW", link != null ? Uri.parse(link) : null);
        intent.addFlags(268435456);
        intent.putExtra("com.android.browser.application_id", this.context.getPackageName());
        try {
            this.context.startActivity(intent);
        } catch (ActivityNotFoundException e11) {
            a.f17149a.e(e11, "Activity was not found for " + intent, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendTileScrollClicksAnalytics(int quantity, String actionId, AtomAction.Click atomAction) {
        LinkedHashMap linkedHashMap;
        Set<Map.Entry<String, TokenizedTrackingInfo>> entrySet;
        String cartActionType = getCartActionType(quantity, actionId);
        Map<String, TokenizedTrackingInfo> trackingInfo = atomAction.getTrackingInfo();
        if (trackingInfo == null || (entrySet = trackingInfo.entrySet()) == null) {
            linkedHashMap = null;
        } else {
            Set<Map.Entry<String, TokenizedTrackingInfo>> set = entrySet;
            int h11 = U.h(C7714v.z(set, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            linkedHashMap = new LinkedHashMap(h11);
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                TokenizedTrackingInfo.a aVar = new TokenizedTrackingInfo.a((TokenizedTrackingInfo) ((Map.Entry) it.next()).getValue());
                aVar.b(cartActionType);
                Pair pair = new Pair(cartActionType, aVar.a());
                linkedHashMap.put(pair.e(), pair.f());
            }
        }
        sendAnalytics(AtomAction.Click.copy$default(atomAction.mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) linkedHashMap), cartActionType, null, null, null, null, null, 62, null));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // ru.ozon.android.messenger.framework.navigation.action.f
    public void handleAction(@NotNull AtomAction atomAction) {
        AtomAction.Click click;
        String id2;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        getBaseActionHandler().invoke(atomAction);
        if (!(atomAction instanceof AtomAction.Click) || (id2 = (click = (AtomAction.Click) atomAction).getId()) == null) {
            return;
        }
        switch (id2.hashCode()) {
            case -1505183730:
                if (id2.equals("plusClick")) {
                    invokePlusClicked(click);
                    break;
                }
                break;
            case 23457852:
                if (id2.equals("addToCart")) {
                    invokeAddToCart(click);
                    break;
                }
                break;
            case 1026644591:
                if (id2.equals("openWebView")) {
                    handleOpenWebViewAction(click);
                    break;
                }
                break;
            case 1050759352:
                if (id2.equals("addToFavorite")) {
                    invokeAddToFavorite(click);
                    break;
                }
                break;
            case 1802580728:
                if (id2.equals("minusClick")) {
                    invokeMinusClicked(click);
                    break;
                }
                break;
            case 1835625435:
                if (id2.equals("openApplicationStore")) {
                    invokeRedirectToApplicationStore(click);
                    break;
                }
                break;
        }
    }
}
