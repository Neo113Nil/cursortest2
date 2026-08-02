package V;

import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {
    public static final a a(a aVar) {
        a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        a f10 = aVar.f();
        while (true) {
            a aVar3 = f10;
            aVar2 = aVar;
            aVar = aVar3;
            if (aVar == null) {
                break;
            }
            f10 = aVar.f();
        }
        NodeCoordinator nodeCoordinator = aVar2 instanceof NodeCoordinator ? (NodeCoordinator) aVar2 : null;
        if (nodeCoordinator == null) {
            return aVar2;
        }
        NodeCoordinator D10 = nodeCoordinator.D();
        while (true) {
            NodeCoordinator nodeCoordinator2 = D10;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            D10 = nodeCoordinator.D();
        }
    }
}
