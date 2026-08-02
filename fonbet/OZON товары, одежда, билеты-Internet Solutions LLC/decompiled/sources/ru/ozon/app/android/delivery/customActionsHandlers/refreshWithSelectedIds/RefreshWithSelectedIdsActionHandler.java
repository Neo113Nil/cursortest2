package ru.ozon.app.android.delivery.customActionsHandlers.refreshWithSelectedIds;

import WZ.t;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J<\u0010\u000e\u001a\u00020\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/refreshWithSelectedIds/RefreshWithSelectedIdsActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handleAction", "params", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshWithSelectedIdsActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "refreshWithSelectedIds";

    private final void handleAction(Map<String, String> params, Map<String, TokenizedTrackingInfo> trackingInfo, CustomActionHandler.HandlerReferences handlerRefs) {
        t mapToTokenizedEvent$default;
        if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, handlerRefs.getVoId(), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(handlerRefs.getRefs().getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
        }
        InterfaceC7851b.a.a(handlerRefs.getRefs().getController(), null, params, null, new h.b(null, new l.a.b(0L, null, 3), 1), 5);
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
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            handleAction(composerAction.getParams(), composerAction.getTrackingInfo(), handlerRefs);
        } else if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            handleAction(click.getParams(), click.getTrackingInfo(), handlerRefs);
        }
    }
}
