package ru.ozon.app.android.delivery.customActionsHandlers.removeSplit;

import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.R$string;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/removeSplit/RemoveSplitActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveSplitActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "removeSplit";

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.Click click;
        String link;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (link = (click = (AtomAction.Click) action).getLink()) == null) {
            return;
        }
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i11 = 0;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(Integer.valueOf(R$string.common_remove_split_alert_message_android), str2, Integer.valueOf(R$string.common_remove_split_alert_title_android), str3, R$string.common_remove_split_alert_action_android, str4, Integer.valueOf(R$string.common_remove_split_alert_cancel_action_android), i11, 170, null);
        Intent intent = new Intent();
        intent.putExtra("EXTRA_REMOVE_DEEPLINK", link);
        Map<String, String> params2 = click.getParams();
        if (params2 != null) {
            Intrinsics.checkNotNullParameter(params2, "<this>");
            str = (String) U.d(params2, "returnTrackingInfo");
        } else {
            str = null;
        }
        intent.putExtra("EXTRA_RETURN_TRACKING_INFO", str);
        intent.putExtra("EXTRA_WIDGET_ID", handlerRefs.getVoId());
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setTargetFragment(handlerRefs.getRefs().getContainer().c(), 9020);
        newInstanceForFragmentResult.show(handlerRefs.getRefs().getContainer().k(), (String) null);
    }
}
