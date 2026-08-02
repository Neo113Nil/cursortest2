package ru.ozon.app.android.common.actionHandlers;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/CopyTextActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CopyTextActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "copyText";

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, String> params = click.getParams();
            String str = params != null ? params.get("restrictionMessage") : null;
            Map<String, String> params2 = click.getParams();
            String str2 = params2 != null ? params2.get("clipboardText") : null;
            Map<String, String> params3 = click.getParams();
            boolean D11 = h.D(params3 != null ? params3.get("closeIcon") : null, "SHOW", true);
            if (str == null || str2 == null) {
                return;
            }
            RestrictionsUtilsKt.showNotificationAndCopy(handlerRefs.getRefs().getContainer(), str2, str, D11);
        }
    }
}
