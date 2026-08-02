package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.o6j;
import xsna.tra0;
import xsna.y8x;
import xsna.zo10;

/* compiled from: FlowLayoutBuildingBlocks.kt */
/* loaded from: classes11.dex */
public final class d {
    public final int a;
    public final f b;
    public final long c;
    public final int d;
    public final int e;

    /* compiled from: FlowLayoutBuildingBlocks.kt */
    public static final class a {
        public final zo10 a;
        public final tra0 b;
        public final long c;
        public boolean d = true;

        public a(zo10 zo10Var, tra0 tra0Var, long j) {
            this.a = zo10Var;
            this.b = tra0Var;
            this.c = j;
        }
    }

    /* compiled from: FlowLayoutBuildingBlocks.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public d(int i, f fVar, long j, int i2, int i3) {
        this.a = i;
        this.b = fVar;
        this.c = j;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(b bVar, boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        zo10 zo10Var;
        y8x y8xVar;
        tra0 tra0Var;
        if (bVar.b) {
            f fVar = this.b;
            int i5 = f.a.$EnumSwitchMapping$0[fVar.a.ordinal()];
            boolean z2 = true;
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3 && i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    zo10Var = fVar.b;
                    y8xVar = fVar.f;
                    tra0Var = fVar.c;
                } else {
                    zo10Var = (i < -1 || i2 < 0) ? null : fVar.d;
                    y8xVar = fVar.g;
                    tra0Var = fVar.e;
                }
                if (zo10Var != null) {
                    aVar = new a(zo10Var, tra0Var, y8xVar.a);
                    if (aVar != null) {
                        if (i < 0 || (i4 != 0 && (i3 - ((int) (aVar.c >> 32)) < 0 || i4 >= this.a))) {
                            z2 = false;
                        }
                        aVar.d = z2;
                        return aVar;
                    }
                }
            }
            aVar = null;
            if (aVar != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b b(boolean z, int i, long j, y8x y8xVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        long j2;
        int i5 = i3 + i4;
        if (y8xVar == null) {
            return new b(true, true);
        }
        long j3 = y8xVar.a;
        f fVar = this.b;
        if (fVar.a != FlowLayoutOverflow.OverflowType.Visible && (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0)) {
            return new b(true, true);
        }
        int i6 = this.d;
        int i7 = this.e;
        long j4 = this.c;
        int i8 = this.a;
        if (i != 0) {
            if (i >= i8) {
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
            }
            return z2 ? new b(true, true) : new b(true, b(z, 0, y8x.a(o6j.i(j4), (((int) (j & j2)) - i7) - i4), new y8x(y8x.a(((int) (j3 >> 32)) - i6, (int) (j3 & j2))), i2 + 1, i5, 0, true, false).b);
        }
        j2 = 4294967295L;
        int i9 = (int) (j3 & j2);
        int max = Math.max(i4, i9) + i3;
        y8x a2 = z3 ? null : fVar.a(i2, max, z);
        if (a2 == null || (i + 1 < i8 && ((((int) (j >> 32)) - ((int) (j3 >> 32))) - i6) - ((int) (a2.a >> 32)) >= 0)) {
            return new b(false, false);
        }
        if (z3) {
            return new b(true, true);
        }
        boolean z4 = b(false, 0, y8x.a(o6j.i(j4), (((int) (j & j2)) - i7) - Math.max(i4, i9)), a2, i2 + 1, max, 0, true, true).b;
        return new b(z4, z4);
    }
}
