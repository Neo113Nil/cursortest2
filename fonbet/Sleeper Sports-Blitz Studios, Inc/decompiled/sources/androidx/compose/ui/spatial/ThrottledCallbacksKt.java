package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;

/* compiled from: ThrottledCallbacks.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"rectInfoFor", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "windowSize", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "rectInfoFor-Dg36KO4", "(Landroidx/compose/ui/node/DelegatableNode;JJJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m8021rectInfoForDg36KO4(DelegatableNode delegatableNode, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        NodeCoordinator m7602requireCoordinator64DMado = DelegatableNodeKt.m7602requireCoordinator64DMado(delegatableNode, NodeKind.m7748constructorimpl(2));
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!requireLayoutNode.isPlaced()) {
            return null;
        }
        if (requireLayoutNode.getOuterCoordinator$ui_release() != m7602requireCoordinator64DMado) {
            long m8920constructorimpl = IntOffset.m8920constructorimpl(j);
            float m8926getXimpl = IntOffset.m8926getXimpl(m8920constructorimpl);
            float m8927getYimpl = IntOffset.m8927getYimpl(m8920constructorimpl);
            long m5763constructorimpl = Offset.m5763constructorimpl((Float.floatToRawIntBits(m8926getXimpl) << 32) | (Float.floatToRawIntBits(m8927getYimpl) & 4294967295L));
            long mo7465getSizeYbymL2g = m7602requireCoordinator64DMado.getCoordinates().mo7465getSizeYbymL2g();
            return new RelativeLayoutBounds(IntOffsetKt.m8943roundk4lQ0M(requireLayoutNode.getOuterCoordinator$ui_release().getCoordinates().mo7466localPositionOfR5De75A(m7602requireCoordinator64DMado, m5763constructorimpl)), IntOffset.m8920constructorimpl(((IntOffset.m8926getXimpl(r0) + ((int) (mo7465getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m8927getYimpl(r0) + ((int) (mo7465getSizeYbymL2g & 4294967295L))) & 4294967295L)), j3, j4, j5, fArr, delegatableNode, null);
        }
        return new RelativeLayoutBounds(j, j2, j3, j4, j5, fArr, delegatableNode, null);
    }
}
