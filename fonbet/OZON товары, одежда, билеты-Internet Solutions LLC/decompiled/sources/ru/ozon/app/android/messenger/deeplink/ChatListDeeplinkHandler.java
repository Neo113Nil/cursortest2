package ru.ozon.app.android.messenger.deeplink;

import GZ.g;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
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
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;
import ru.ozon.app.android.utils.rx.RxExtKt;
import sZ.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/messenger/deeplink/ChatListDeeplinkHandler;", "LIZ/a;", "LIb/a;", "Lru/ozon/android/messenger/api/a;", "messengerFeature", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LGZ/g;", "ozonRouter", "<init>", "(LIb/a;Lru/ozon/app/android/cart/common/domain/CartService;LGZ/g;)V", "Lru/ozon/app/android/cart/common/models/CartAction;", "action", "", "handleCartAction", "(Lru/ozon/app/android/cart/common/models/CartAction;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LIb/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "LGZ/g;", "Lnc/b;", "cartDisposable", "Lnc/b;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListDeeplinkHandler implements a {
    private InterfaceC8487b cartDisposable;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final Ib.a<ru.ozon.android.messenger.api.a> messengerFeature;

    @NotNull
    private final g ozonRouter;

    public ChatListDeeplinkHandler(@NotNull Ib.a<ru.ozon.android.messenger.api.a> messengerFeature, @NotNull CartService cartService, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(messengerFeature, "messengerFeature");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.messengerFeature = messengerFeature;
        this.cartService = cartService;
        this.ozonRouter = ozonRouter;
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
        if (!Intrinsics.d(b11.getAuthority(), "communications")) {
            return false;
        }
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) C7714v.M(pathSegments);
        if (!Intrinsics.d(str, "notifications") && !Intrinsics.d(str, "chats")) {
            return false;
        }
        String queryParameter = b11.getQueryParameter(AppsFlyerProperties.CHANNEL);
        if (queryParameter != null && !h.K(queryParameter)) {
            return false;
        }
        String queryParameter2 = b11.getQueryParameter("guid");
        return queryParameter2 == null || h.K(queryParameter2);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        final ComponentCallbacksC5392m c11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        c11 = this.messengerFeature.get().c(new f.c(0), p.ORIGINAL);
        c11.getLifecycle().a(new G() { // from class: ru.ozon.app.android.messenger.deeplink.ChatListDeeplinkHandler$getDestination$1
            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == AbstractC5434v.a.ON_START) {
                    ComponentCallbacksC5392m.this.getLifecycle().e(this);
                    FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, ComponentCallbacksC5392m.this, false, 0L, 6, null);
                }
            }
        });
        c11.getLifecycle().a(new G() { // from class: ru.ozon.app.android.messenger.deeplink.ChatListDeeplinkHandler$getDestination$2
            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                InterfaceC8487b interfaceC8487b;
                CartService cartService;
                InterfaceC8487b interfaceC8487b2;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != AbstractC5434v.a.ON_START) {
                    if (event == AbstractC5434v.a.ON_STOP) {
                        interfaceC8487b2 = ChatListDeeplinkHandler.this.cartDisposable;
                        if (interfaceC8487b2 != null) {
                            interfaceC8487b2.dispose();
                        }
                        ChatListDeeplinkHandler.this.cartDisposable = null;
                        return;
                    }
                    return;
                }
                try {
                    interfaceC8487b = ChatListDeeplinkHandler.this.cartDisposable;
                    if (interfaceC8487b != null) {
                        interfaceC8487b.dispose();
                    }
                    ChatListDeeplinkHandler chatListDeeplinkHandler = ChatListDeeplinkHandler.this;
                    cartService = chatListDeeplinkHandler.cartService;
                    io.reactivex.p<CartAction> observeCartActions = cartService.observeCartActions();
                    J viewLifecycleOwner = c11.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    chatListDeeplinkHandler.cartDisposable = RxExtKt.observe$default(observeCartActions, viewLifecycleOwner, new ChatListDeeplinkHandler$getDestination$2$onStateChanged$1(ChatListDeeplinkHandler.this), new ChatListDeeplinkHandler$getDestination$2$onStateChanged$2(Lm0.a.f17149a), null, 8, null);
                } catch (IllegalStateException e11) {
                    Lm0.a.f17149a.e(e11);
                }
            }
        });
        return new c(K1.G.b(route.b(), "MessengerFragment"), c11, null, false, false, null, false, false, false, 508, null);
    }
}
