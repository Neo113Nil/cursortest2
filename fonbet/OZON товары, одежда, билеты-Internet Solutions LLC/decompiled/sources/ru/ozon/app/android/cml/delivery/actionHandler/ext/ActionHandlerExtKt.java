package ru.ozon.app.android.cml.delivery.actionHandler.ext;

import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a;\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "successAction", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/AtomAction;)V", "showDefaultError", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionHandlerExtKt {
    public static final void showDefaultError(@NotNull CustomActionHandler.HandlerReferences handlerReferences) {
        Intrinsics.checkNotNullParameter(handlerReferences, "<this>");
        C4911f container = handlerReferences.getRefs().getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    public static final void showNotification(@NotNull NotificationDTO notificationDTO, @NotNull CustomActionHandler.HandlerReferences handlerRefs, @NotNull Function1<? super AtomAction, Unit> actionHandler, AtomAction atomAction) {
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(notificationDTO, "<this>");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C4911f container = handlerRefs.getRefs().getContainer();
        if ((atomAction instanceof AtomAction.DismissAndScroll) || (atomAction instanceof AtomAction.DismissRedirect) || (atomAction instanceof AtomAction.DismissRefresh) || (atomAction instanceof AtomAction.Dismiss)) {
            rootView = ContextExtKt.getRootView(container.a());
        } else {
            ComponentCallbacksC5392m c11 = container.c();
            rootView = c11 != null ? c11.getView() : null;
        }
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notificationDTO, container.i(), actionHandler).show();
    }
}
