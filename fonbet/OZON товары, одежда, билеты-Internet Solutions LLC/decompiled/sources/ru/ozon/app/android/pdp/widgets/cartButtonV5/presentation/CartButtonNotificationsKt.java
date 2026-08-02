package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import a00.C4908c;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "isSubscribed", "La00/f;", "container", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "showProductSubscriptionNotification", "(ZLa00/f;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showCartButtonNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;La00/f;Lkotlin/jvm/functions/Function1;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonNotificationsKt {
    public static final void showCartButtonNotification(@NotNull NotificationDTO notification, @NotNull C4911f container, Function1<? super AtomAction, Unit> function1) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(container, "container");
        ComponentCallbacksC5392m c11 = container.c();
        ViewGroup composerContainer = (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) ? null : ComposerViewExtensionKt.composerContainer(rootView);
        C4908c g10 = container.g();
        if (composerContainer != null) {
            View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(composerContainer, NotificationBarKt.isAboveBottomWidgets(notification));
            NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(composerContainer, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
            if (asNotificationLayoutManager == null) {
                return;
            }
            NotificationBar.INSTANCE.make(asNotificationLayoutManager, notification, g10, function1).show();
        }
    }

    public static final void showProductSubscriptionNotification(boolean z11, @NotNull C4911f container, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (z11) {
            showCartButtonNotification(new NotificationDTO(StringProvider.getString(R$string.subscribe_to_product_notification_android), null, null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 510, null), container, function1);
        }
    }

    public static /* synthetic */ void showProductSubscriptionNotification$default(boolean z11, C4911f c4911f, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        showProductSubscriptionNotification(z11, c4911f, function1);
    }
}
