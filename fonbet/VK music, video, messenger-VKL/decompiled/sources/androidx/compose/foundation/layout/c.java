package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.apx;
import xsna.cp10;
import xsna.dp10;
import xsna.dt1;
import xsna.ep10;
import xsna.epx;
import xsna.izs;
import xsna.jgp;
import xsna.npg0;
import xsna.o6j;
import xsna.p490;
import xsna.r490;
import xsna.s6j;
import xsna.tra0;
import xsna.zo10;
import xsna.zox;

/* compiled from: Column.kt */
/* loaded from: classes11.dex */
public final class c implements cp10, npg0 {
    public final a.n a;
    public final dt1.b b;

    public c(a.n nVar, dt1.b bVar) {
        this.a = nVar;
        this.b = bVar;
    }

    @Override // xsna.npg0
    public final long a(int i, int i2, int i3, boolean z) {
        c cVar = b.a;
        return !z ? s6j.a(0, i3, i, i2) : o6j.a.a(0, i3, i, i2);
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        return r490.i(this, o6j.j(j), o6j.k(j), o6j.h(j), o6j.i(j), ep10Var.r0(this.a.a()), ep10Var, list, new tra0[list.size()], 0, list.size(), null, 0);
    }

    @Override // xsna.cp10
    public final int c(apx apxVar, List<? extends zox> list, int i) {
        int r0 = apxVar.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            zox zoxVar = list.get(i4);
            float q = p490.q(p490.o(zoxVar));
            int Z = zoxVar.Z(i);
            if (q == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += Z;
            } else if (q > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += q;
                i2 = Math.max(i2, Math.round(Z / q));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    @Override // xsna.npg0
    public final int d(tra0 tra0Var) {
        return tra0Var.b;
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
        int r0 = apxVar.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * r0, i);
        List<? extends zox> list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            zox zoxVar = list.get(i3);
            float q = p490.q(p490.o(zoxVar));
            if (q == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int min2 = Math.min(zoxVar.Z(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, zoxVar.l0(min2));
            } else if (q > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += q;
            }
        }
        int round = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            zox zoxVar2 = list.get(i4);
            float q2 = p490.q(p490.o(zoxVar2));
            if (q2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i2 = Math.max(i2, zoxVar2.l0(round != Integer.MAX_VALUE ? Math.round(round * q2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
    }

    @Override // xsna.cp10
    public final int f(apx apxVar, List<? extends zox> list, int i) {
        int r0 = apxVar.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            zox zoxVar = list.get(i4);
            float q = p490.q(p490.o(zoxVar));
            int j0 = zoxVar.j0(i);
            if (q == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += j0;
            } else if (q > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += q;
                i2 = Math.max(i2, Math.round(j0 / q));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    @Override // xsna.cp10
    public final int g(apx apxVar, List<? extends zox> list, int i) {
        int r0 = apxVar.r0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * r0, i);
        List<? extends zox> list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            zox zoxVar = list.get(i3);
            float q = p490.q(p490.o(zoxVar));
            if (q == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int min2 = Math.min(zoxVar.Z(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, zoxVar.M(min2));
            } else if (q > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += q;
            }
        }
        int round = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            zox zoxVar2 = list.get(i4);
            float q2 = p490.q(p490.o(zoxVar2));
            if (q2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i2 = Math.max(i2, zoxVar2.M(round != Integer.MAX_VALUE ? Math.round(round * q2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // xsna.npg0
    public final int h(tra0 tra0Var) {
        return tra0Var.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // xsna.npg0
    public final void i(int i, int[] iArr, int[] iArr2, ep10 ep10Var) {
        this.a.c(ep10Var, i, iArr, iArr2);
    }

    @Override // xsna.npg0
    public final dp10 j(final tra0[] tra0VarArr, final ep10 ep10Var, final int i, final int[] iArr, int i2, final int i3, int[] iArr2, int i4, int i5, int i6) {
        return ep10Var.Q(i3, i2, jgp.b, new izs() { // from class: xsna.o9g
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tra0.a aVar = (tra0.a) obj;
                tra0[] tra0VarArr2 = tra0VarArr;
                int length = tra0VarArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    tra0 tra0Var = tra0VarArr2[i7];
                    int i9 = i8 + 1;
                    Object c = tra0Var.c();
                    opg0 opg0Var = c instanceof opg0 ? (opg0) c : null;
                    LayoutDirection layoutDirection = ep10Var.getLayoutDirection();
                    ejk ejkVar = opg0Var != null ? opg0Var.c : null;
                    int i10 = i3;
                    aVar.q(tra0Var, ejkVar != null ? ejkVar.a(i10, tra0Var.b, layoutDirection, tra0Var, i) : this.b.a(tra0Var.b, i10, layoutDirection), iArr[i8], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i7++;
                    i8 = i9;
                }
                return s3q0.a;
            }
        });
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
