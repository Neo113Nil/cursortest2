package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import kotlin.NoWhenBranchMatchedException;
import xsna.m200;
import xsna.o6j;
import xsna.shy;
import xsna.tra0;
import xsna.y8x;
import xsna.zo10;
import xsna.zox;

/* compiled from: FlowLayoutOverflow.kt */
/* loaded from: classes11.dex */
public final class f {
    public final FlowLayoutOverflow.OverflowType a;
    public zo10 b;
    public tra0 c;
    public zo10 d;
    public tra0 e;
    public y8x f;
    public y8x g;

    /* compiled from: FlowLayoutOverflow.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(FlowLayoutOverflow.OverflowType overflowType) {
        this.a = overflowType;
    }

    public final y8x a(int i, int i2, boolean z) {
        int i3 = a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 == 3) {
            if (z) {
                return this.f;
            }
            return null;
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return this.f;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.g;
    }

    public final void b(zox zoxVar, zox zoxVar2, long j) {
        long g = m200.g(j, LayoutOrientation.Horizontal);
        if (zoxVar != null) {
            int h = o6j.h(g);
            int i = e.a;
            int M = zoxVar.M(h);
            this.f = new y8x(y8x.a(M, zoxVar.j0(M)));
            this.b = zoxVar instanceof zo10 ? (zo10) zoxVar : null;
            this.c = null;
        }
        if (zoxVar2 != null) {
            int h2 = o6j.h(g);
            int i2 = e.a;
            int M2 = zoxVar2.M(h2);
            this.g = new y8x(y8x.a(M2, zoxVar2.j0(M2)));
            this.d = zoxVar2 instanceof zo10 ? (zo10) zoxVar2 : null;
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
