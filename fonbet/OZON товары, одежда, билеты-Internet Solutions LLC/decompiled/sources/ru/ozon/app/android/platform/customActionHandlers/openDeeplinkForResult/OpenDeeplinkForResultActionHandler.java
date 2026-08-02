package ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult;

import GZ.g;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/openDeeplinkForResult/OpenDeeplinkForResultActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LGZ/g;", "screenRouter", "<init>", "(LGZ/g;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LGZ/g;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "", "getRequestId", "()I", "requestId", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class OpenDeeplinkForResultActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final g screenRouter;

    public OpenDeeplinkForResultActionHandler(@NotNull g screenRouter) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.screenRouter = screenRouter;
        this.actionId = "openDeeplinkForResult";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    protected abstract int getRequestId();

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.Move) && (link = ((AtomAction.Move) action).getLink()) != null) {
            this.screenRouter.b(link, getRequestId(), U.c());
        }
    }
}
