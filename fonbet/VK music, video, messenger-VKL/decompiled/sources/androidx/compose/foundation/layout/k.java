package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.apx;
import xsna.cp10;
import xsna.dp10;
import xsna.dt1;
import xsna.ep10;
import xsna.epx;
import xsna.jgp;
import xsna.npg0;
import xsna.o6j;
import xsna.p490;
import xsna.r490;
import xsna.rpg0;
import xsna.s6j;
import xsna.tra0;
import xsna.zo10;
import xsna.zox;

/* compiled from: Row.kt */
/* loaded from: classes11.dex */
public final class k implements cp10, npg0 {
    public final a.e a;
    public final dt1.c b;

    public k(a.e eVar, dt1.c cVar) {
        this.a = eVar;
        this.b = cVar;
    }

    @Override // xsna.npg0
    public final long a(int i, int i2, int i3, boolean z) {
        k kVar = j.a;
        return !z ? s6j.a(i, i2, 0, i3) : o6j.a.b(i, i2, 0, i3);
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        return r490.i(this, o6j.k(j), o6j.j(j), o6j.i(j), o6j.h(j), ep10Var.r0(this.a.a()), ep10Var, list, new tra0[list.size()], 0, list.size(), null, 0);
    }

    @Override // xsna.cp10
    public final int c(apx apxVar, List<? extends zox> list, int i) {
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
                int min2 = Math.min(zoxVar.l0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, zoxVar.Z(min2));
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
                i2 = Math.max(i2, zoxVar2.Z(round != Integer.MAX_VALUE ? Math.round(round * q2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // xsna.npg0
    public final int d(tra0 tra0Var) {
        return tra0Var.c;
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
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
            int l0 = zoxVar.l0(i);
            if (q == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += l0;
            } else if (q > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += q;
                i2 = Math.max(i2, Math.round(l0 / q));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b);
    }

    @Override // xsna.cp10
    public final int f(apx apxVar, List<? extends zox> list, int i) {
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
                int min2 = Math.min(zoxVar.l0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, zoxVar.j0(min2));
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
                i2 = Math.max(i2, zoxVar2.j0(round != Integer.MAX_VALUE ? Math.round(round * q2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // xsna.cp10
    public final int g(apx apxVar, List<? extends zox> list, int i) {
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
            int M = zoxVar.M(i);
            if (q == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += M;
            } else if (q > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += q;
                i2 = Math.max(i2, Math.round(M / q));
            }
        }
        return ((list.size() - 1) * r0) + Math.round(i2 * f) + i3;
    }

    @Override // xsna.npg0
    public final int h(tra0 tra0Var) {
        return tra0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // xsna.npg0
    public final void i(int i, int[] iArr, int[] iArr2, ep10 ep10Var) {
        this.a.b(ep10Var, i, iArr, ep10Var.getLayoutDirection(), iArr2);
    }

    @Override // xsna.npg0
    public final dp10 j(tra0[] tra0VarArr, ep10 ep10Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return ep10Var.Q(i2, i3, jgp.b, new rpg0(tra0VarArr, this, i3, i, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
