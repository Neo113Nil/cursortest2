package ru.ozon.app.android.common.actionHandlers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.utils.ClipboardWrapperKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/CopyAndDismissActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "createNotificationModel", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "text", "image", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CopyAndDismissActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "copyAndDismiss";

    private final NotificationDTO createNotificationModel(String text, String image) {
        if (text == null) {
            return null;
        }
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
        IconDTO.IconShape iconShape = IconDTO.IconShape.SQUIRCLE;
        if (image == null) {
            return null;
        }
        return new NotificationDTO(text, null, null, null, new NotificationDTO.LeftContent(new IconDTO(iconSize, null, iconShape, null, null, image, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FILL_CENTER, 65434, null), null, 2, null), null, null, null, null, null, 974, null);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        ViewGroup rootView;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, String> params = click.getParams();
            if (params != null && (str = params.get("clipboardText")) != null) {
                Context applicationContext = handlerRefs.getRefs().getContainer().i().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                ClipboardWrapperKt.toClipboard$default(applicationContext, null, str, 1, null);
            }
            r a11 = handlerRefs.getRefs().getContainer().a();
            ViewGroup composerContainer = (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) ? null : ComposerViewExtensionKt.composerContainer(rootView);
            Map<String, String> params2 = click.getParams();
            String str2 = params2 != null ? params2.get("notificationText") : null;
            Map<String, String> params3 = click.getParams();
            NotificationDTO createNotificationModel = createNotificationModel(str2, params3 != null ? params3.get("notificationImage") : null);
            if (createNotificationModel != null) {
                if (composerContainer == null) {
                    return;
                }
                View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(composerContainer, NotificationBarKt.isAboveBottomWidgets(createNotificationModel));
                NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(composerContainer, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
                if (asNotificationLayoutManager == null) {
                    return;
                } else {
                    NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager, createNotificationModel, handlerRefs.getRefs().getContainer().i(), null, 8, null).show();
                }
            }
            handlerRefs.getRefs().getNavigator().popBackStack();
        }
    }
}
