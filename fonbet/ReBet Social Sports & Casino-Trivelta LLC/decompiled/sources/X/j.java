package X;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final e0.d f13360a = e0.f.b(1.0f, 0.0f, 2, null);

    public static final androidx.compose.ui.node.d b(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        androidx.compose.ui.node.d owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
