package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;", "", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "notification", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Ll10/t;", "container", "show", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;Lkotlin/jvm/functions/Function1;Ll10/t;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonNotificationHandler {
    public final void show(@NotNull CartVO.NotificationBar notification, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull t container) {
        Pair pair;
        ViewGroup rootView;
        Object rootView2;
        ViewGroup rootView3;
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(container, "container");
        if (notification.getCanShowFromBottomSheetOnPreviewPage()) {
            r a11 = container.a();
            if (a11 == null || (rootView3 = ContextExtKt.getRootView(a11)) == null || (rootView2 = ComposerViewExtensionKt.composerCoordinatorLayout(rootView3)) == null) {
                r a12 = container.a();
                rootView2 = a12 != null ? ContextExtKt.getRootView(a12) : null;
            }
            pair = new Pair(rootView2, container.g());
        } else {
            ComponentCallbacksC5392m b11 = container.b();
            pair = new Pair((b11 == null || (rootView = ContextExtKt.getRootView(b11)) == null) ? null : ComposerViewExtensionKt.composerContainer(rootView), container.f());
        }
        ViewGroup viewGroup = (ViewGroup) pair.a();
        J j11 = (J) pair.b();
        if (viewGroup != null) {
            View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification.getNotificationWrapper()));
            NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
            if (asNotificationLayoutManager == null) {
                return;
            }
            C10727i.c(K.a(j11), null, null, new CartButtonNotificationHandler$show$1$1(notification, asNotificationLayoutManager, j11, actionHandler, null), 3);
        }
    }
}
