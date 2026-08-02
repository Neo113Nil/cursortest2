package ru.ozon.app.android.cart.domain;

import GZ.g;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.utils.link.CartDeeplinkValidationRules;
import ru.ozon.app.android.cart.common.utils.link.CartLinkGenerator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0004\u0018\u00010\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u000e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010&\u001a\u0004\u0018\u00010\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u000e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/cart/domain/CartNavigationServiceImpl;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "LGZ/g;", "router", "<init>", "(LGZ/g;)V", "Landroid/net/Uri;", "deeplink", "fallbackDeeplink", "Lkotlin/Function1;", "decorateDeeplink", "resolveDeeplink", "(Landroid/net/Uri;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)Landroid/net/Uri;", "", "", "params", "", "onResponseAddToCart", "(Ljava/util/Map;)V", "onRefreshed", "(Ljava/lang/String;)V", "onMasterUpdated", "onNavigateToCartByTab", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "it", "onLogosActionTriggered", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "onTeenModeChanged", "LGZ/g;", "", "mayUseDeeplinks", "Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentTab", "Ljava/lang/String;", "getCurrentTab", "()Ljava/lang/String;", "pendingTab", "getPendingTab", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartNavigationServiceImpl implements CartNavigationService {
    private String currentTab;
    private volatile boolean mayUseDeeplinks;
    private String pendingTab;

    @NotNull
    private final g router;

    public CartNavigationServiceImpl(@NotNull g router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.router = router;
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public String getCurrentTab() {
        return this.currentTab;
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public String getPendingTab() {
        return this.pendingTab;
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public void onLogosActionTriggered(@NotNull AtomAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Refresh) {
            CartDeeplinkValidationRules cartDeeplinkValidationRules = CartDeeplinkValidationRules.INSTANCE;
            AtomAction.Refresh refresh = (AtomAction.Refresh) it;
            String link = refresh.getLink();
            if (cartDeeplinkValidationRules.isCartTab(link != null ? Uri.parse(link) : null)) {
                onRefreshed(refresh.getLink());
            }
        }
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public void onMasterUpdated(String deeplink) {
        this.mayUseDeeplinks = true;
        if (Intrinsics.d(deeplink, getCurrentTab())) {
            return;
        }
        if (CartDeeplinkValidationRules.INSTANCE.isReserveCartTab(Uri.parse(deeplink == null ? "" : deeplink))) {
            this.pendingTab = deeplink;
            this.currentTab = deeplink;
            if (deeplink != null) {
                g.a.a(this.router, deeplink, null, null, 6);
            }
        }
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public void onNavigateToCartByTab() {
        CartLinkGenerator cartLinkGenerator = CartLinkGenerator.INSTANCE;
        Uri cart$default = CartLinkGenerator.cart$default(cartLinkGenerator, false, 1, null);
        if (Intrinsics.d(getPendingTab(), cart$default.toString())) {
            return;
        }
        CartDeeplinkValidationRules cartDeeplinkValidationRules = CartDeeplinkValidationRules.INSTANCE;
        if (cartDeeplinkValidationRules.isDefaultCartTab(cart$default)) {
            String currentTab = getCurrentTab();
            if (cartDeeplinkValidationRules.isDefaultCartTab(currentTab != null ? Uri.parse(currentTab) : null)) {
                return;
            }
        }
        this.pendingTab = CartLinkGenerator.cart$default(cartLinkGenerator, false, 1, null).toString();
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public void onRefreshed(String deeplink) {
        this.pendingTab = deeplink;
        if (deeplink != null) {
            this.currentTab = deeplink;
        }
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public void onResponseAddToCart(Map<String, String> params) {
        this.mayUseDeeplinks = true;
        this.pendingTab = params != null ? params.get("nextTabDeeplink") : null;
    }

    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    public void onTeenModeChanged() {
        this.pendingTab = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r6.isDefaultCartTab(r0 != null ? android.net.Uri.parse(r0) : null) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    @Override // ru.ozon.app.android.cart.common.domain.CartNavigationService
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Uri resolveDeeplink(@NotNull Uri deeplink, @NotNull Uri fallbackDeeplink, @NotNull Function1<? super Uri, ? extends Uri> decorateDeeplink) {
        boolean z11;
        String uri;
        Uri invoke;
        Uri parse;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(fallbackDeeplink, "fallbackDeeplink");
        Intrinsics.checkNotNullParameter(decorateDeeplink, "decorateDeeplink");
        String currentTab = getCurrentTab();
        String pendingTab = getPendingTab();
        boolean z12 = false;
        if (pendingTab != null && !h.K(pendingTab)) {
            CartDeeplinkValidationRules cartDeeplinkValidationRules = CartDeeplinkValidationRules.INSTANCE;
            if (!cartDeeplinkValidationRules.isFamilyCartTab(deeplink) && !Intrinsics.d(pendingTab, CartLinkGenerator.cart$default(CartLinkGenerator.INSTANCE, false, 1, null).toString()) && ((currentTab == null || (parse = Uri.parse(currentTab)) == null || !cartDeeplinkValidationRules.isFamilyCartTab(parse)) && !cartDeeplinkValidationRules.isMiniApp(deeplink) && !cartDeeplinkValidationRules.isMiniApp(Uri.parse(pendingTab)) && this.mayUseDeeplinks)) {
                z11 = true;
                if (z11) {
                    uri = fallbackDeeplink.toString();
                    Intrinsics.f(uri);
                } else {
                    uri = pendingTab;
                }
                if (!Intrinsics.d(uri, currentTab)) {
                    CartDeeplinkValidationRules cartDeeplinkValidationRules2 = CartDeeplinkValidationRules.INSTANCE;
                    if (cartDeeplinkValidationRules2.isDefaultCartTab(Uri.parse(uri))) {
                    }
                    invoke = (z11 || z12) ? decorateDeeplink.invoke(fallbackDeeplink) : decorateDeeplink.invoke(Uri.parse(pendingTab));
                    if (!CartDeeplinkValidationRules.INSTANCE.isMiniApp(invoke)) {
                        this.pendingTab = invoke.toString();
                        this.currentTab = invoke.toString();
                    }
                    return invoke;
                }
                z12 = true;
                if (z11) {
                }
                if (!CartDeeplinkValidationRules.INSTANCE.isMiniApp(invoke)) {
                }
                return invoke;
            }
        }
        z11 = false;
        if (z11) {
        }
        if (!Intrinsics.d(uri, currentTab)) {
        }
        z12 = true;
        if (z11) {
        }
        if (!CartDeeplinkValidationRules.INSTANCE.isMiniApp(invoke)) {
        }
        return invoke;
    }
}
