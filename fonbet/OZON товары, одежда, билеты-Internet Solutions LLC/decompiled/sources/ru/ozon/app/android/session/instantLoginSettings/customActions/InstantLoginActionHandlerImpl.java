package ru.ozon.app.android.session.instantLoginSettings.customActions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.actionHandlers.setPublicProfile.UpdateCellToggleKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.InstantLoginActionHandler;
import ru.ozon.app.android.session.instantLoginSettings.ui.InstantLoginManager;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/session/instantLoginSettings/customActions/InstantLoginActionHandlerImpl;", "Lru/ozon/app/android/delivery/customActionsHandlers/ozonid/InstantLoginActionHandler;", "instantLoginManager", "Lru/ozon/app/android/session/instantLoginSettings/ui/InstantLoginManager;", "<init>", "(Lru/ozon/app/android/session/instantLoginSettings/ui/InstantLoginManager;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstantLoginActionHandlerImpl extends InstantLoginActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final InstantLoginManager instantLoginManager;
    public static final int $stable = 8;

    public InstantLoginActionHandlerImpl(@NotNull InstantLoginManager instantLoginManager) {
        Intrinsics.checkNotNullParameter(instantLoginManager, "instantLoginManager");
        this.instantLoginManager = instantLoginManager;
        this.actionId = "instantLoginToggle";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            ComposerReferences refs = handlerRefs.getRefs();
            refs.getController().update(new UpdateCellToggleKey(action));
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            this.instantLoginManager.onAction(composerAction.getActionName(), composerAction.getParams(), refs);
        }
    }
}
