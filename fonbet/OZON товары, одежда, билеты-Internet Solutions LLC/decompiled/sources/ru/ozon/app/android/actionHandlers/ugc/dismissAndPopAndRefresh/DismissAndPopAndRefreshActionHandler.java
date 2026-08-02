package ru.ozon.app.android.actionHandlers.ugc.dismissAndPopAndRefresh;

import Sh.a;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/dismissAndPopAndRefresh/DismissAndPopAndRefreshActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "setRefreshObservedPageResult", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DismissAndPopAndRefreshActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "dismissAndPopAndRefresh";

    private final void setRefreshObservedPageResult(CustomActionHandler.HandlerReferences handlerRefs) {
        G supportFragmentManager;
        r a11 = handlerRefs.getRefs().getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.m1(d.a(), "refresh_after_dismiss_and_pop_key");
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        ComponentCallbacksC5392m parentFragment;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            setRefreshObservedPageResult(handlerRefs);
            ComponentCallbacksC5392m b11 = a.b(handlerRefs);
            if (b11 == null || (parentFragment = b11.getParentFragment()) == null) {
                return;
            }
            BottomSheetComposerFragment bottomSheetComposerFragment = parentFragment instanceof BottomSheetComposerFragment ? (BottomSheetComposerFragment) parentFragment : null;
            if (bottomSheetComposerFragment != null) {
                bottomSheetComposerFragment.dismiss();
            }
            ComponentCallbacksC5392m parentFragment2 = parentFragment.getParentFragment();
            C9011c c9011c = parentFragment2 instanceof C9011c ? (C9011c) parentFragment2 : null;
            if (c9011c != null) {
                c9011c.close();
            } else {
                parentFragment.getParentFragmentManager().P0();
            }
        }
    }
}
