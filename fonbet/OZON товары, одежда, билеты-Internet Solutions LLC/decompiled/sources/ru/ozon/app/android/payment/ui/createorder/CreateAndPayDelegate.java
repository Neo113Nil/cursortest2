package ru.ozon.app.android.payment.ui.createorder;

import GZ.g;
import Sc.o;
import a00.C4911f;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import i10.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.GPayPanEnabledFlag;
import ru.ozon.app.android.payment.ui.R$string;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 b2\u00020\u0001:\u0001bBA\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BI\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J5\u0010%\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020'2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J9\u00106\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u001b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0004\u0018\u0001082\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0018H\u0002¢\u0006\u0004\b=\u0010<J!\u0010>\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020\u00182\u0006\u0010E\u001a\u00020D2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u00020\u00182\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H¢\u0006\u0004\bK\u0010LR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010MR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010OR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010PR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010QR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010RR\u001a\u0010U\u001a\u00060Sj\u0002`T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010Y\u001a\u00060Wj\u0002`X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010`\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00180^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayDelegate;", "", "Lkotlin/Function0;", "Lru/ozon/app/android/payment/ui/createorder/RootViewContainer;", "rootViewProvider", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "vm", "LGZ/g;", "router", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;LGZ/g;Lru/ozon/app/android/account/orders/OrderChangePreferences;Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "ref", "(Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/composer/ConfiguratorReferences;LGZ/g;Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;Lru/ozon/app/android/account/orders/OrderChangePreferences;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "show", "Li10/l$a;", "type", "", "switchLoader", "(ZLi10/l$a;)V", "", "fastPayLink", "cancelLink", "isRedirectBank", "processFastPay", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "payInfo", "link", "redirectLink", "processSberPay", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "config", "requestGooglePay", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)V", "closeFlow", "(Ljava/lang/String;Ljava/lang/String;)V", "redirect", "(Ljava/lang/String;)V", "message", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "errorType", "", "duration", "showError", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;Ljava/lang/Long;)V", "Lru/ozon/uni/android/flashbar/model/Action;", "makeFlashBarAction", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;)Lru/ozon/uni/android/flashbar/model/Action;", "refreshAction", "()V", "retryAction", "mergePaymentLinkWithCancelLink", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "handleAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "viewEffects", "trigger", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)V", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "handledState", "render", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "LGZ/g;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "La00/f;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "bus", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateAndPayDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;
    private InterfaceC7851b bus;
    private C4911f container;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final GooglePayManager googlePayManager;
    private ComposerNavigator navigator;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final Function0<RootViewContainer> rootViewProvider;

    @NotNull
    private final g router;

    @NotNull
    private final CreateAndPayViewModel vm;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayDelegate$Companion;", "", "<init>", "()V", "CREATE_FRESH_ORDER_ASYNC_LINK", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderDO.OrderError.TYPE.values().length];
            try {
                iArr[OrderDO.OrderError.TYPE.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderDO.OrderError.TYPE.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CreateAndPayDelegate(Function0<RootViewContainer> function0, CreateAndPayViewModel createAndPayViewModel, g gVar, OrderChangePreferences orderChangePreferences, GooglePayManager googlePayManager, FeatureChecker featureChecker) {
        this.rootViewProvider = function0;
        this.vm = createAndPayViewModel;
        this.router = gVar;
        this.orderChangePreferences = orderChangePreferences;
        this.googlePayManager = googlePayManager;
        this.featureChecker = featureChecker;
    }

    private final void closeFlow(String link, String cancelLink) {
        if (link != null) {
            g.a.a(this.router, mergePaymentLinkWithCancelLink(link, cancelLink), null, null, 6);
        } else if (cancelLink != null) {
            g.a.a(this.router, cancelLink, null, null, 6);
        }
    }

    private final void handleAction(AtomActionDTO action) {
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(AtomActionMapperKt.toAtomAction(action, null));
        } else {
            Intrinsics.n("actionHandler");
            throw null;
        }
    }

    private final Action makeFlashBarAction(OrderDO.OrderError.TYPE errorType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[errorType.ordinal()];
        if (i11 == 1) {
            return new Action(StringProvider.getString(R$string.payment_refresh_page), false, new CreateAndPayDelegate$makeFlashBarAction$1(this), 2, null);
        }
        if (i11 != 2) {
            return null;
        }
        return new Action(StringProvider.getString(R$string.payment_retry_create_order), false, new CreateAndPayDelegate$makeFlashBarAction$2(this), 2, null);
    }

    private final String mergePaymentLinkWithCancelLink(String link, String cancelLink) {
        if (cancelLink == null || h.K(cancelLink)) {
            return link;
        }
        Uri parse = Uri.parse(link);
        if (!Intrinsics.d(parse.getAuthority(), "payment")) {
            return link;
        }
        String uri = parse.buildUpon().appendQueryParameter("cancelLink", cancelLink).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final void processFastPay(String fastPayLink, final String cancelLink, boolean isRedirectBank) {
        if (isRedirectBank) {
            try {
                String uri = LinkGenerator.externalLink$default(LinkGenerator.INSTANCE, fastPayLink, false, 2, null).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                g.a.a(this.router, uri, null, null, 6);
            } catch (ActivityNotFoundException unused) {
                C4911f c4911f = this.container;
                if (c4911f == null) {
                    Intrinsics.n("container");
                    throw null;
                }
                ComposerExtKt.closeFlow(c4911f);
                Unit unit = Unit.f71690a;
            }
        } else {
            g.a.a(this.router, fastPayLink, null, null, 6);
        }
        C4911f c4911f2 = this.container;
        if (c4911f2 != null) {
            c4911f2.g().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayDelegate$processFastPay$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(J owner) {
                    String str;
                    g gVar;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    if (owner.getLifecycle().b() != AbstractC5434v.b.STARTED || (str = cancelLink) == null) {
                        return;
                    }
                    gVar = this.router;
                    g.a.a(gVar, str, null, null, 6);
                }
            });
        } else {
            Intrinsics.n("container");
            throw null;
        }
    }

    private final void processSberPay(OrderDO.PayBySberPay.SberPayInfo payInfo, String link, String redirectLink, String cancelLink) {
        if (link == null || cancelLink == null || redirectLink == null) {
            return;
        }
        g.a.a(this.router, redirectLink, U.j(new Pair("link", link), new Pair("cancelLink", cancelLink), new Pair("payInfo", payInfo)), null, 4);
    }

    private final void redirect(String redirectLink) {
        g.a.a(this.router, redirectLink, null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshAction() {
        InterfaceC7851b interfaceC7851b = this.bus;
        if (interfaceC7851b != null) {
            InterfaceC7851b.a.a(interfaceC7851b, null, null, null, null, 15);
        } else {
            Intrinsics.n("bus");
            throw null;
        }
    }

    private final void requestGooglePay(OrderDO.PayByNative.NativePaymentInfo payInfo, AndroidPlatformComponentConfig config) {
        GooglePayManager googlePayManager = this.googlePayManager;
        String gateway = payInfo.getGateway();
        if (h.K(gateway)) {
            gateway = null;
        }
        if (gateway == null) {
            gateway = "assist";
        }
        String merchant = payInfo.getMerchant();
        if (h.K(merchant)) {
            merchant = null;
        }
        if (merchant == null) {
            merchant = "570937";
        }
        String plainString = payInfo.getOrderSum().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        C4911f c4911f = this.container;
        if (c4911f != null) {
            googlePayManager.sendRequestToGooglePay(gateway, merchant, plainString, c4911f.i(), config, this.featureChecker.isEnabled(GPayPanEnabledFlag.INSTANCE));
        } else {
            Intrinsics.n("container");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryAction() {
        this.vm.retryCreateOrder();
    }

    private final void showError(String message, String title, OrderDO.OrderError.TYPE errorType, Long duration) {
        RootViewContainer invoke = this.rootViewProvider.invoke();
        if (invoke != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, invoke.getRootView(), title != null ? OzonSpannableStringKt.toOzonSpannableString(title) : null, OzonSpannableStringKt.toOzonSpannableString(message), makeFlashBarAction(errorType), duration, null, invoke.getLifecycleOwner(), 32, null).show();
        }
    }

    static /* synthetic */ void showError$default(CreateAndPayDelegate createAndPayDelegate, String str, String str2, OrderDO.OrderError.TYPE type, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            type = OrderDO.OrderError.TYPE.DEFAULT;
        }
        if ((i11 & 8) != 0) {
            l11 = null;
        }
        createAndPayDelegate.showError(str, str2, type, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchLoader(boolean show, l.a type) {
        if (show) {
            InterfaceC7851b interfaceC7851b = this.bus;
            if (interfaceC7851b != null) {
                interfaceC7851b.e(type);
                return;
            } else {
                Intrinsics.n("bus");
                throw null;
            }
        }
        InterfaceC7851b interfaceC7851b2 = this.bus;
        if (interfaceC7851b2 != null) {
            interfaceC7851b2.hideLoader();
        } else {
            Intrinsics.n("bus");
            throw null;
        }
    }

    static /* synthetic */ void switchLoader$default(CreateAndPayDelegate createAndPayDelegate, boolean z11, l.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new l.a.b(0L, null, 3);
        }
        createAndPayDelegate.switchLoader(z11, aVar);
    }

    public final void render(@NotNull HandledState<CreateAndPayViewState> handledState) {
        Intrinsics.checkNotNullParameter(handledState, "handledState");
        handledState.state(new CreateAndPayDelegate$render$1(this));
    }

    public final void trigger(@NotNull CreateAndPayViewModel.CreateAndPayViewEffects viewEffects, @NotNull AndroidPlatformComponentConfig config) {
        Intrinsics.checkNotNullParameter(viewEffects, "viewEffects");
        Intrinsics.checkNotNullParameter(config, "config");
        if (viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.CloseFlow) {
            this.orderChangePreferences.markAsUpdated();
            CreateAndPayViewModel.CreateAndPayViewEffects.CloseFlow closeFlow = (CreateAndPayViewModel.CreateAndPayViewEffects.CloseFlow) viewEffects;
            closeFlow(closeFlow.getLink(), closeFlow.getCancelLink());
        } else if (viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.ProcessSberPay) {
            CreateAndPayViewModel.CreateAndPayViewEffects.ProcessSberPay processSberPay = (CreateAndPayViewModel.CreateAndPayViewEffects.ProcessSberPay) viewEffects;
            processSberPay(processSberPay.getSberPayInfo(), processSberPay.getLink(), processSberPay.getRedirectLink(), processSberPay.getCancelLink());
        } else if (viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.RequestGooglePay) {
            requestGooglePay(((CreateAndPayViewModel.CreateAndPayViewEffects.RequestGooglePay) viewEffects).getGooglePayInfo(), config);
        } else if (viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.ProcessFastPay) {
            CreateAndPayViewModel.CreateAndPayViewEffects.ProcessFastPay processFastPay = (CreateAndPayViewModel.CreateAndPayViewEffects.ProcessFastPay) viewEffects;
            processFastPay(processFastPay.getFastPayLink(), processFastPay.getCancelLink(), processFastPay.getIsRedirectBank());
        } else if (viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.Redirect) {
            redirect(((CreateAndPayViewModel.CreateAndPayViewEffects.Redirect) viewEffects).getRedirectLink());
        } else {
            if (!(viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.Error)) {
                if (viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.CriticalError) {
                    showError$default(this, StringProvider.getString(ru.ozon.app.android.platform.R$string.error_payment_message_unknown_error_description), StringProvider.getString(ru.ozon.app.android.platform.R$string.error_payment_message_unknown_error_title), null, null, 12, null);
                } else {
                    if (!(viewEffects instanceof CreateAndPayViewModel.CreateAndPayViewEffects.HandleAction)) {
                        throw new o();
                    }
                    handleAction(((CreateAndPayViewModel.CreateAndPayViewEffects.HandleAction) viewEffects).getAction());
                }
                WhenExtKt.getExhaustive(Unit.f71690a);
            }
            CreateAndPayViewModel.CreateAndPayViewEffects.Error error = (CreateAndPayViewModel.CreateAndPayViewEffects.Error) viewEffects;
            showError(error.getMessage(), error.getTitle(), error.getType(), error.getDuration());
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateAndPayDelegate(@NotNull Function0<RootViewContainer> rootViewProvider, @NotNull CreateAndPayViewModel vm, @NotNull ConfiguratorReferences ref, @NotNull g router, @NotNull GooglePayManager googlePayManager, @NotNull OrderChangePreferences orderChangePreferences, @NotNull FeatureChecker featureChecker) {
        this(rootViewProvider, vm, router, orderChangePreferences, googlePayManager, featureChecker);
        Intrinsics.checkNotNullParameter(rootViewProvider, "rootViewProvider");
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.container = ref.getOwnerContainer();
        this.bus = ref.getController();
        this.navigator = ref.getNavigator();
        BaseActionHandler.Builder<BaseActionHandler.Builder<?>> invoke = BaseActionHandler.Builder.INSTANCE.invoke(ref.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(ref.getComposerWidgetComponentStorage()));
        invoke.onComposerAction(new CreateAndPayDelegate$1$1(vm));
        invoke.onClick(new CreateAndPayDelegate$1$2(vm));
        this.actionHandler = invoke.buildHandler();
    }
}
