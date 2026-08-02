package uZ;

import EZ.g;
import EZ.i;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: uZ.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9989a extends i<Object> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    private static void a(g gVar) {
        DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k;
        List<ComponentCallbacksC5392m> r02 = gVar.getFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        Iterator it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                dialogInterfaceOnCancelListenerC5390k = 0;
                break;
            } else {
                dialogInterfaceOnCancelListenerC5390k = it.next();
                if (((ComponentCallbacksC5392m) dialogInterfaceOnCancelListenerC5390k) instanceof DialogInterfaceOnCancelListenerC5390k) {
                    break;
                }
            }
        }
        DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k2 = dialogInterfaceOnCancelListenerC5390k instanceof DialogInterfaceOnCancelListenerC5390k ? dialogInterfaceOnCancelListenerC5390k : null;
        if (dialogInterfaceOnCancelListenerC5390k2 == null) {
            return;
        }
        dialogInterfaceOnCancelListenerC5390k2.dismiss();
    }

    @Override // EZ.a
    public final void navigate(@NotNull g navigator, @NotNull EZ.e<Object> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        a(navigator);
    }

    @Override // EZ.a
    public final void navigateForResult(@NotNull g navigator, @NotNull EZ.e<Object> response, int i11) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        a(navigator);
    }
}
