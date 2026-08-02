package ru.ozon.app.android.storefront.widgets.feedback.common;

import A00.a;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/common/CloseFlowAndActionDoActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "Li10/h$b;", "getScrollOneTimePostProcessing", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;)Li10/h$b;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseFlowAndActionDoActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "closeFlow";

    private final h.b getScrollOneTimePostProcessing(AtomAction.ScrollPosition scrollPosition) {
        if (Intrinsics.d(scrollPosition, AtomAction.ScrollPosition.Top.INSTANCE)) {
            return new h.b(new a.C.C0000a(), null, 2);
        }
        return null;
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
        if (action instanceof AtomAction.DismissRedirect) {
            ComposerExtKt.closeFlow(handlerRefs.getRefs().getContainer());
            String link = ((AtomAction.DismissRedirect) action).getLink();
            if (link != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(handlerRefs.getRefs().getNavigator(), link, null, 2, null);
                return;
            }
            return;
        }
        if (action instanceof AtomAction.DismissRefresh) {
            AtomAction.DismissRefresh dismissRefresh = (AtomAction.DismissRefresh) action;
            ComposerExtKt.sendRefreshToTargetFragment$default(handlerRefs.getRefs().getContainer(), dismissRefresh.getLink(), getScrollOneTimePostProcessing(dismissRefresh.getScrollPosition()), null, null, 12, null);
            ComposerExtKt.closeFlow(handlerRefs.getRefs().getContainer());
        }
    }
}
