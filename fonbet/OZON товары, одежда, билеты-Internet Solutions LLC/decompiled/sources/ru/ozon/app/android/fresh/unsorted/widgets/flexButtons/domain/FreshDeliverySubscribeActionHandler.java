package ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.domain;

import Tg.b;
import Vg.f;
import a00.C4911f;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.fresh.unsorted.utils.NotificationHelper;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FreshDeliverySubscribeActionHandler;", "LVg/f;", "<init>", "()V", "La00/f;", "container", "", "isError", "", "showNotification", "(La00/f;Z)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "successNotificationModel", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotificationModel", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshDeliverySubscribeActionHandler extends f {

    @NotNull
    private final String actionId = "freshDeliverySubscribe";

    private final NotificationDTO errorNotificationModel() {
        return new NotificationDTO(StringProvider.getString(R$string.fresh_subscribe_delivery_title_warning_android), StringProvider.getString(R$string.fresh_subscribe_delivery_subtitle_warning_android), null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(C4911f container, boolean isError) {
        View view;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (view = c11.getView()) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, isError ? errorNotificationModel() : successNotificationModel(), container.i(), null).show();
    }

    static /* synthetic */ void showNotification$default(FreshDeliverySubscribeActionHandler freshDeliverySubscribeActionHandler, C4911f c4911f, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        freshDeliverySubscribeActionHandler.showNotification(c4911f, z11);
    }

    private final NotificationDTO successNotificationModel() {
        return new NotificationDTO(StringProvider.getString(R$string.fresh_subscribe_delivery_title_android), StringProvider.getString(R$string.fresh_subscribe_delivery_subtitle_android), null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 476, null);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        CustomActionHandler.HandlerReferences handlerReferences = new CustomActionHandler.HandlerReferences(((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(new C4911f(widgetInfo.a().e()), widgetInfo.b()), new FreshDeliverySubscribeActionHandler$processWidgetAction$handlerRefs$1(widgetInfo), widgetInfo.c(), widgetInfo.c().n());
        r i11 = handlerReferences.getRefs().getContainer().i();
        if (NotificationHelper.INSTANCE.areSystemNotificationsTurnedOn(i11)) {
            showNotification$default(this, widgetInfo.a(), false, 2, null);
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            showNotification(widgetInfo.a(), true);
        } else if (PermissionExtensionsKt.isPermissionGranted(i11, "android.permission.POST_NOTIFICATIONS")) {
            showNotification$default(this, widgetInfo.a(), false, 2, null);
        } else {
            ActivitiesKt.requestPermission(handlerReferences.getRefs().getContainer().i(), new FreshDeliverySubscribeActionHandler$processWidgetAction$1(this, widgetInfo));
        }
    }
}
