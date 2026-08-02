package ru.ozon.app.android.pdp.actionHandlers.copyToClipboard;

import Tg.b;
import Vg.f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.ClipboardWrapperKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/actionHandlers/copyToClipboard/CopyToClipboardActionHandler;", "LVg/f;", "<init>", "()V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CopyToClipboardActionHandler extends f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId = "copy";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/actionHandlers/copyToClipboard/CopyToClipboardActionHandler$Companion;", "", "<init>", "()V", "COPY_CLIPBOARD_ACTION_ID", "", "SKU_DATA", "NOTIFICATION_TEXT_DATA", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        AtomAction.Click click;
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.Click) {
            ComponentCallbacksC5392m c11 = widgetInfo.a().c();
            View view = c11 != null ? c11.getView() : null;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (params = (click = (AtomAction.Click) action).getParams()) == null || (str = params.get("sku")) == null) {
                return;
            }
            Context context = viewGroup.getContext();
            if (context != null) {
                ClipboardWrapperKt.toClipboard$default(context, null, str, 1, null);
            }
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null);
            if (asNotificationLayoutManager$default == null || (params2 = click.getParams()) == null || (str2 = params2.get("text")) == null) {
                return;
            }
            NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(str2, null, null, null, null, null, 3, null, null, NotificationDTO.Preset.SUCCESS, 414, null), widgetInfo.a().e(), null, 8, null).show();
        }
    }
}
