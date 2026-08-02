package ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.applybutton;

import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.pdp.ui.configurators.base.WidgetScrollInfo;
import ru.ozon.app.android.pdp.ui.configurators.base.WidgetScrollInfoAspectsCompact;
import ru.ozon.app.android.pdp.ui.configurators.base.WidgetScrollInfoHolder$AspectsCompact;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/applybutton/DismissRefreshAndScrollActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DismissRefreshAndScrollActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "dismissRefreshAndScroll";

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        WidgetScrollInfoAspectsCompact widgetScrollInfoAspectsCompact;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            String link = ((AtomAction.Click) action).getLink();
            if (link != null) {
                WidgetScrollInfo widgetScrollInfo = WidgetScrollInfoHolder$AspectsCompact.INSTANCE.widgetScrollInfo();
                WidgetScrollInfoAspectsCompact widgetScrollInfoAspectsCompact2 = widgetScrollInfo instanceof WidgetScrollInfoAspectsCompact ? (WidgetScrollInfoAspectsCompact) widgetScrollInfo : null;
                if (widgetScrollInfoAspectsCompact2 != null) {
                    widgetScrollInfoAspectsCompact = WidgetScrollInfoAspectsCompact.copy$default(widgetScrollInfoAspectsCompact2, 0, 0, link, 3, null);
                    handlerRefs.getRefs().getNavigator().popBackStack();
                    ComposerExtKt.sendRefreshToTargetFragment$default(handlerRefs.getRefs().getContainer(), widgetScrollInfoAspectsCompact == null ? widgetScrollInfoAspectsCompact.getRefreshDeeplink() : null, new h.b(widgetScrollInfoAspectsCompact == null ? widgetScrollInfoAspectsCompact.busEventScroll() : null, null, 2), null, null, 12, null);
                }
            }
            widgetScrollInfoAspectsCompact = null;
            handlerRefs.getRefs().getNavigator().popBackStack();
            ComposerExtKt.sendRefreshToTargetFragment$default(handlerRefs.getRefs().getContainer(), widgetScrollInfoAspectsCompact == null ? widgetScrollInfoAspectsCompact.getRefreshDeeplink() : null, new h.b(widgetScrollInfoAspectsCompact == null ? widgetScrollInfoAspectsCompact.busEventScroll() : null, null, 2), null, null, 12, null);
        }
    }
}
