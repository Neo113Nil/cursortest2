package ru.ozon.app.android.ui.switchingbutton.delegates;

import WZ.t;
import a00.C4911f;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ResponseRedirectAction;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonAction;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonActionKt;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0018\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonComposerActionWithRedirectDelegate;", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonActionDelegate;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "switchingButtonStateStorage", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;)V", "Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "switchingButtonAction", "", "processAction", "(Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)V", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "", "redirectLink", "redirect", "(Lru/ozon/app/android/composer/ComposerNavigator;Ljava/lang/String;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/uni/android/flashbar/model/Restriction;", "message", "showRestriction", "(La00/f;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "showError", "(La00/f;)V", "", "canHandle", "(Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)Z", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "", "actionIds", "Ljava/util/List;", "getActionIds", "()Ljava/util/List;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonComposerActionWithRedirectDelegate extends SwitchingButtonActionDelegate {

    @NotNull
    private final List<String> actionIds;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final SwitchingButtonStateStorage switchingButtonStateStorage;

    public SwitchingButtonComposerActionWithRedirectDelegate(@NotNull ActionV2Repository actionV2Repository, @NotNull SwitchingButtonStateStorage switchingButtonStateStorage) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(switchingButtonStateStorage, "switchingButtonStateStorage");
        this.actionV2Repository = actionV2Repository;
        this.switchingButtonStateStorage = switchingButtonStateStorage;
        this.actionIds = C7714v.a0("composerActionWithRedirect");
    }

    private final void processAction(SwitchingButtonAction switchingButtonAction) {
        LinkedHashMap linkedHashMap;
        AtomAction action = switchingButtonAction.getAction();
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            String actionName = composerAction.getActionName();
            Map<String, String> params = composerAction.getParams();
            if (params != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    if (!Intrinsics.d(entry.getKey(), "NOT_NEED_PRE_PROCESS_ACTION_PARAMS_ID")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            ActionV2Request actionV2Request = new ActionV2Request(linkedHashMap, actionName, false, 4, null);
            C4911f container = getRefs().getContainer();
            t extractTokenizedEvent = SwitchingButtonActionKt.extractTokenizedEvent(switchingButtonAction);
            Bc.t g10 = ((extractTokenizedEvent != null || switchingButtonAction.getTrackingData() == null) ? this.actionV2Repository.callAction(actionV2Request, ResponseRedirectAction.class) : this.actionV2Repository.callActionWithTracking(actionV2Request, switchingButtonAction.getTrackingData(), ResponseRedirectAction.class)).g(C8125a.a());
            Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
            RxExtKt.subscribe(g10, container.g(), new SwitchingButtonComposerActionWithRedirectDelegate$processAction$1(this, switchingButtonAction, extractTokenizedEvent, container), new SwitchingButtonComposerActionWithRedirectDelegate$processAction$2(this, switchingButtonAction, container));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void redirect(ComposerNavigator navigator, String redirectLink) {
        if (redirectLink != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, redirectLink, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRestriction(C4911f container, Restriction message) {
        ViewGroup rootView;
        if (message == null || (rootView = ContextExtKt.getRootView(container.a())) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(message), container.g(), null, null, null, null, null, 248, null);
    }

    @Override // ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonActionDelegate
    public boolean canHandle(@NotNull SwitchingButtonAction switchingButtonAction) {
        Intrinsics.checkNotNullParameter(switchingButtonAction, "switchingButtonAction");
        if (!(switchingButtonAction.getAction() instanceof AtomAction.ComposerAction) || !C7714v.A(getActionIds(), ((AtomAction.ComposerAction) switchingButtonAction.getAction()).getId())) {
            return false;
        }
        processAction(switchingButtonAction);
        return true;
    }

    @NotNull
    protected List<String> getActionIds() {
        return this.actionIds;
    }
}
