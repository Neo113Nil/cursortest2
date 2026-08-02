package ru.ozon.app.android.actionHandlers.ugc.doubleDismissAndRefresh;

import A00.a;
import a00.C4911f;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.doubleDismiss.DoubleDismissActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/doubleDismissAndRefresh/DoubleDismissAndRefreshActionHandler;", "Lru/ozon/app/android/actionHandlers/ugc/doubleDismiss/DoubleDismissActionHandler;", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "scrollPosition", "Li10/h$b;", "getScrollOneTimePostProcessing", "(Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;)Li10/h$b;", "", "", "parseScrollTypeParams", "(Ljava/util/Map;)Lru/ozon/uni/atoms/af/AtomAction$ScrollPosition;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoubleDismissAndRefreshActionHandler extends DoubleDismissActionHandler {

    @NotNull
    private final String actionId = "doubleDismissAndRefresh";

    private final h.b getScrollOneTimePostProcessing(AtomAction.ScrollPosition scrollPosition) {
        return Intrinsics.d(scrollPosition, AtomAction.ScrollPosition.Top.INSTANCE) ? new h.b(new a.C.C0000a(), null, 2) : new h.b((a.C) null, new l.a.b(0L, null, 3));
    }

    private final AtomAction.ScrollPosition parseScrollTypeParams(Map<String, String> map) {
        return Intrinsics.d(map.get("scrollPosition"), "top") ? AtomAction.ScrollPosition.Top.INSTANCE : AtomAction.ScrollPosition.None.INSTANCE;
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
        if (action instanceof AtomAction.Click) {
            processDoubleDismiss(handlerRefs);
            C4911f container = handlerRefs.getRefs().getContainer();
            AtomAction.Click click = (AtomAction.Click) action;
            String link = click.getLink();
            Map<String, String> params = click.getParams();
            ComposerExtKt.sendRefreshToTargetFragment$default(container, link, getScrollOneTimePostProcessing(params != null ? parseScrollTypeParams(params) : null), null, null, 12, null);
        }
    }
}
