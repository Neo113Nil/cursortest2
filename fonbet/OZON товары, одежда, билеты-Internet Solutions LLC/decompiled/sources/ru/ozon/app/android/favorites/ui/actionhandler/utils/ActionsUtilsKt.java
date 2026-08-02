package ru.ozon.app.android.favorites.ui.actionhandler.utils;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.J;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a7\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "hideModalIfNeed", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "showError", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "trackingPayloads", "showNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "Lxe/J;", "actionExceptionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lxe/J;", "Ll10/b;", "composerController", "Landroidx/lifecycle/B;", "lifecycleScope", "actionExceptionHandlerInternal", "(Ll10/b;Landroidx/lifecycle/B;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lxe/J;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionsUtilsKt {
    @NotNull
    public static final J actionExceptionHandler(@NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        return actionExceptionHandlerInternal(((RetainComposerComponentApi) handlerRefs.getRefs().getComponent(RetainComposerComponentApi.class)).getComposerController(), K.a(handlerRefs.getRefs().getContainer().e()), handlerRefs);
    }

    private static final J actionExceptionHandlerInternal(InterfaceC7851b interfaceC7851b, B b11, CustomActionHandler.HandlerReferences handlerReferences) {
        return new ActionsUtilsKt$actionExceptionHandlerInternal$$inlined$CoroutineExceptionHandler$1(J.f105405n0, interfaceC7851b, b11, handlerReferences);
    }

    public static final void hideModalIfNeed(@NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        ComponentCallbacksC5392m c11 = handlerRefs.getRefs().getContainer().c();
        if ((c11 != null ? c11.getParentFragment() : null) instanceof BottomSheetComposerFragment) {
            handlerRefs.getRefs().getNavigator().popBackStack();
        }
    }

    public static final void showError(@NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        ViewGroup rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, handlerRefs.getRefs().getContainer().g(), 62, null).show();
    }

    public static final void showNotification(@NotNull CustomActionHandler.HandlerReferences handlerRefs, @NotNull NotificationModelWrapper notification, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        Intrinsics.checkNotNullParameter(notification, "notification");
        ComposerExtKt.sendResultToTargetFragment(handlerRefs.getRefs().getContainer(), 12513, new ActionsUtilsKt$showNotification$1(notification, map, handlerRefs));
    }
}
