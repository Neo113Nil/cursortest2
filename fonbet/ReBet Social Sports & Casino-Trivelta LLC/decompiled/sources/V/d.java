package V;

import X.l;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final l a(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        LayoutNode l10 = lVar.l();
        while (true) {
            LayoutNode t10 = l10.t();
            if ((t10 != null ? t10.getLookaheadRoot() : null) == null) {
                l y10 = l10.getOuterCoordinator$ui_release().y();
                Intrinsics.checkNotNull(y10);
                return y10;
            }
            LayoutNode t11 = l10.t();
            LayoutNode lookaheadRoot = t11 != null ? t11.getLookaheadRoot() : null;
            Intrinsics.checkNotNull(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                l10 = l10.t();
                Intrinsics.checkNotNull(l10);
            } else {
                LayoutNode t12 = l10.t();
                Intrinsics.checkNotNull(t12);
                l10 = t12.getLookaheadRoot();
                Intrinsics.checkNotNull(l10);
            }
        }
    }
}
