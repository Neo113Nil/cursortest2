package ru.ozon.app.android.search.deeplink;

import GZ.g;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import c8.C5766e;
import com.appsflyer.AppsFlyerProperties;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.android.messenger.framework.data.p;
import ru.ozon.android.messenger.framework.presentation.messenger.f;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.flags.AiConversationWebViewEnabledFlag;
import ru.ozon.app.android.utils.rx.RxExtKt;
import sZ.c;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00060\u0001j\u0002`\u0002:\u0001+B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001b\u0010\u001c\u001a\u00020\u00152\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/search/deeplink/AIConversationDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/navigation/handlers/DeeplinkHandler;", "LIb/a;", "Lru/ozon/android/messenger/api/a;", "messengerFeature", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LIb/a;Lru/ozon/app/android/cart/common/domain/CartService;LGZ/g;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/cart/common/models/CartAction;", "action", "", "handleCartAction", "(Lru/ozon/app/android/cart/common/models/CartAction;)V", "Landroid/net/Uri;", "deeplink", "", "isAiConversationDeeplink", "(Landroid/net/Uri;)Z", "isMyAiDeeplink", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "Lru/ozon/app/android/navigation/newrouter/destinations/Destination;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LIb/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "LGZ/g;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lnc/b;", "cartDisposable", "Lnc/b;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AIConversationDeeplinkHandler implements a {
    private InterfaceC8487b cartDisposable;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Ib.a<ru.ozon.android.messenger.api.a> messengerFeature;

    @NotNull
    private final g ozonRouter;
    public static final int $stable = 8;

    public AIConversationDeeplinkHandler(@NotNull Ib.a<ru.ozon.android.messenger.api.a> messengerFeature, @NotNull CartService cartService, @NotNull g ozonRouter, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(messengerFeature, "messengerFeature");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.messengerFeature = messengerFeature;
        this.cartService = cartService;
        this.ozonRouter = ozonRouter;
        this.featureChecker = featureChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCartAction(CartAction action) {
        if (action instanceof CartAction.CartOpenSheetDeeplink) {
            g.a.a(this.ozonRouter, ((CartAction.CartOpenSheetDeeplink) action).getDeeplink(), null, null, 6);
        }
    }

    private final boolean isAiConversationDeeplink(Uri deeplink) {
        return Intrinsics.d(deeplink.getAuthority(), "aiConversation") && !this.featureChecker.isEnabled(AiConversationWebViewEnabledFlag.INSTANCE);
    }

    private final boolean isMyAiDeeplink(Uri deeplink) {
        String queryParameter;
        String queryParameter2;
        String str;
        String queryParameter3 = deeplink.getQueryParameter("namespace");
        if (Intrinsics.d(deeplink.getAuthority(), "my") && C5766e.c(deeplink, "getPathSegments(...)", 0, "chat") && (((queryParameter = deeplink.getQueryParameter(AppsFlyerProperties.CHANNEL)) != null && !h.K(queryParameter)) || ((queryParameter2 = deeplink.getQueryParameter("id")) != null && !h.K(queryParameter2)))) {
            if (queryParameter3 != null) {
                str = queryParameter3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            } else {
                str = null;
            }
            if (Intrinsics.d(str, "BX_AI_ASSISTANT_CHAT")) {
                return true;
            }
        }
        return false;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return (isAiConversationDeeplink(b11) || isMyAiDeeplink(b11)) && !this.featureChecker.isEnabled(AiConversationWebViewEnabledFlag.INSTANCE);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        final ComponentCallbacksC5392m c11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        c11 = this.messengerFeature.get().c(new f.a(route.b()), p.ORIGINAL);
        c11.getLifecycle().a(new G() { // from class: ru.ozon.app.android.search.deeplink.AIConversationDeeplinkHandler$getDestination$1
            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                InterfaceC8487b interfaceC8487b;
                CartService cartService;
                InterfaceC8487b interfaceC8487b2;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != AbstractC5434v.a.ON_START) {
                    if (event == AbstractC5434v.a.ON_STOP) {
                        interfaceC8487b2 = AIConversationDeeplinkHandler.this.cartDisposable;
                        if (interfaceC8487b2 != null) {
                            interfaceC8487b2.dispose();
                        }
                        AIConversationDeeplinkHandler.this.cartDisposable = null;
                        return;
                    }
                    return;
                }
                try {
                    interfaceC8487b = AIConversationDeeplinkHandler.this.cartDisposable;
                    if (interfaceC8487b != null) {
                        interfaceC8487b.dispose();
                    }
                    AIConversationDeeplinkHandler aIConversationDeeplinkHandler = AIConversationDeeplinkHandler.this;
                    cartService = aIConversationDeeplinkHandler.cartService;
                    io.reactivex.p<CartAction> observeCartActions = cartService.observeCartActions();
                    J viewLifecycleOwner = c11.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    aIConversationDeeplinkHandler.cartDisposable = RxExtKt.observe$default(observeCartActions, viewLifecycleOwner, new AIConversationDeeplinkHandler$getDestination$1$onStateChanged$1(AIConversationDeeplinkHandler.this), new AIConversationDeeplinkHandler$getDestination$1$onStateChanged$2(Lm0.a.f17149a), null, 8, null);
                } catch (IllegalStateException e11) {
                    Lm0.a.f17149a.e(e11);
                }
            }
        });
        return new c(K1.G.b(route.b(), "MessengerFragment"), c11, null, false, false, null, false, false, false, 508, null);
    }
}
