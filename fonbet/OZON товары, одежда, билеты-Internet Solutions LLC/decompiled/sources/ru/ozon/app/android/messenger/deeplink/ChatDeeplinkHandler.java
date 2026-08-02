package ru.ozon.app.android.messenger.deeplink;

import GZ.g;
import GZ.j;
import IZ.c;
import Ib.a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.android.messenger.framework.data.p;
import ru.ozon.android.messenger.framework.presentation.messenger.f;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\u00172\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/messenger/deeplink/ChatDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "LIb/a;", "Lru/ozon/android/messenger/api/a;", "messengerFeature", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;LIb/a;Lru/ozon/app/android/cart/common/domain/CartService;LGZ/g;)V", "Lru/ozon/app/android/cart/common/models/CartAction;", "action", "", "handleCartAction", "(Lru/ozon/app/android/cart/common/models/CartAction;)V", "Landroid/net/Uri;", "deeplink", "", "", "pathSegments", "", "checkIsMyDeeplink", "(Landroid/net/Uri;Ljava/util/List;)Z", "checkIsCommunicationsDeeplink", "", "asNotBlankStringOrNull", "(Ljava/lang/Object;)Ljava/lang/String;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LIb/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "LGZ/g;", "Lnc/b;", "cartDisposable", "Lnc/b;", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatDeeplinkHandler extends c {
    private InterfaceC8487b cartDisposable;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final a<ru.ozon.android.messenger.api.a> messengerFeature;

    @NotNull
    private final g ozonRouter;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull a<ru.ozon.android.messenger.api.a> messengerFeature, @NotNull CartService cartService, @NotNull g ozonRouter) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(messengerFeature, "messengerFeature");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.messengerFeature = messengerFeature;
        this.cartService = cartService;
        this.ozonRouter = ozonRouter;
    }

    private final String asNotBlankStringOrNull(Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || h.K(str)) {
            return null;
        }
        return str;
    }

    private final boolean checkIsCommunicationsDeeplink(Uri deeplink, List<String> pathSegments) {
        String queryParameter;
        String queryParameter2;
        return Intrinsics.d(deeplink.getAuthority(), "communications") && Intrinsics.d(C7714v.Q(0, pathSegments), "chats") && Intrinsics.d(C7714v.Q(1, pathSegments), "chat") && !(((queryParameter = deeplink.getQueryParameter(AppsFlyerProperties.CHANNEL)) == null || h.K(queryParameter)) && ((queryParameter2 = deeplink.getQueryParameter("guid")) == null || h.K(queryParameter2)));
    }

    private final boolean checkIsMyDeeplink(Uri deeplink, List<String> pathSegments) {
        String queryParameter;
        String queryParameter2;
        String str;
        String queryParameter3 = deeplink.getQueryParameter("namespace");
        if (Intrinsics.d(deeplink.getAuthority(), "my") && Intrinsics.d(C7714v.Q(0, pathSegments), "chat") && (((queryParameter = deeplink.getQueryParameter(AppsFlyerProperties.CHANNEL)) != null && !h.K(queryParameter)) || ((queryParameter2 = deeplink.getQueryParameter("id")) != null && !h.K(queryParameter2)))) {
            if (queryParameter3 != null) {
                str = queryParameter3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            } else {
                str = null;
            }
            if (!Intrinsics.d(str, "BX_AI_ASSISTANT_CHAT")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCartAction(CartAction action) {
        if (action instanceof CartAction.CartOpenSheetDeeplink) {
            g.a.a(this.ozonRouter, ((CartAction.CartOpenSheetDeeplink) action).getDeeplink(), null, null, 6);
        }
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.f(pathSegments);
        return checkIsMyDeeplink(b11, pathSegments) || checkIsCommunicationsDeeplink(b11, pathSegments);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        final ComponentCallbacksC5392m c11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        c11 = this.messengerFeature.get().c(new f.b(route.b(), asNotBlankStringOrNull(route.e().get("firstUnreadMessageId"))), p.ORIGINAL);
        c11.getLifecycle().a(new G() { // from class: ru.ozon.app.android.messenger.deeplink.ChatDeeplinkHandler$getDestination$1
            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == AbstractC5434v.a.ON_START) {
                    ComponentCallbacksC5392m.this.getLifecycle().e(this);
                    View view = ComponentCallbacksC5392m.this.getView();
                    if (view != null) {
                        view.setFitsSystemWindows(true);
                    }
                    FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, ComponentCallbacksC5392m.this, false, 0L, 6, null);
                }
            }
        });
        c11.getLifecycle().a(new G() { // from class: ru.ozon.app.android.messenger.deeplink.ChatDeeplinkHandler$getDestination$2
            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                InterfaceC8487b interfaceC8487b;
                CartService cartService;
                InterfaceC8487b interfaceC8487b2;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != AbstractC5434v.a.ON_START) {
                    if (event == AbstractC5434v.a.ON_STOP) {
                        interfaceC8487b2 = ChatDeeplinkHandler.this.cartDisposable;
                        if (interfaceC8487b2 != null) {
                            interfaceC8487b2.dispose();
                        }
                        ChatDeeplinkHandler.this.cartDisposable = null;
                        return;
                    }
                    return;
                }
                try {
                    interfaceC8487b = ChatDeeplinkHandler.this.cartDisposable;
                    if (interfaceC8487b != null) {
                        interfaceC8487b.dispose();
                    }
                    ChatDeeplinkHandler chatDeeplinkHandler = ChatDeeplinkHandler.this;
                    cartService = chatDeeplinkHandler.cartService;
                    io.reactivex.p<CartAction> observeCartActions = cartService.observeCartActions();
                    J viewLifecycleOwner = c11.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    chatDeeplinkHandler.cartDisposable = RxExtKt.observe$default(observeCartActions, viewLifecycleOwner, new ChatDeeplinkHandler$getDestination$2$onStateChanged$1(ChatDeeplinkHandler.this), new ChatDeeplinkHandler$getDestination$2$onStateChanged$2(Lm0.a.f17149a), null, 8, null);
                } catch (IllegalStateException e11) {
                    Lm0.a.f17149a.e(e11);
                }
            }
        });
        return new sZ.c(K1.G.b(route.b(), "MessengerFragment"), c11, null, false, false, null, false, false, false, 508, null);
    }
}
