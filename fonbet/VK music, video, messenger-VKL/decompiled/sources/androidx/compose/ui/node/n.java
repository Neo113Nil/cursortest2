package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.apx;
import xsna.ci50;
import xsna.fp10;

/* compiled from: MeasureScopeWithLayoutNode.kt */
/* loaded from: classes11.dex */
public final class n {

    /* compiled from: MeasureScopeWithLayoutNode.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ArrayList a(apx apxVar) {
        LayoutNode o1 = ((fp10) apxVar).o1();
        boolean b = b(o1);
        List<LayoutNode> C = o1.C();
        ci50.a aVar = (ci50.a) C;
        ArrayList arrayList = new ArrayList(aVar.b.d);
        int size = C.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = (LayoutNode) aVar.get(i);
            arrayList.add(b ? layoutNode.z() : layoutNode.A());
        }
        return arrayList;
    }

    public static final boolean b(LayoutNode layoutNode) {
        int i = a.$EnumSwitchMapping$0[layoutNode.H.d.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LayoutNode I = layoutNode.I();
        if (I != null) {
            return b(I);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
