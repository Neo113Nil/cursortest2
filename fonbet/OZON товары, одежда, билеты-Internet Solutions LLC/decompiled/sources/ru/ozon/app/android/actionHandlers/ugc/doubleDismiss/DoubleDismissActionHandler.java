package ru.ozon.app.android.actionHandlers.ugc.doubleDismiss;

import NZ.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/doubleDismiss/DoubleDismissActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processDoubleDismiss", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DoubleDismissActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "doubleDismiss";

    protected final void processDoubleDismiss(@NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        ComposerReferences refs = handlerRefs.getRefs();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        int i11 = 0;
        while (i11 < 2) {
            if (parentFragment instanceof C9011c) {
                ((C9011c) parentFragment).close();
            } else if (parentFragment instanceof DialogInterfaceOnCancelListenerC5390k) {
                ((DialogInterfaceOnCancelListenerC5390k) parentFragment).dismiss();
            } else if (parentFragment instanceof d) {
                d dVar = (d) parentFragment;
                if (dVar.canHandleBackStack()) {
                    dVar.getChildFragmentManager().P0();
                } else {
                    dVar.getParentFragmentManager().P0();
                }
            } else {
                refs.getNavigator().popBackStack();
            }
            i11++;
            parentFragment = parentFragment != null ? parentFragment.getParentFragment() : null;
        }
    }
}
