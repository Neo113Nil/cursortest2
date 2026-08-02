package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u23 implements k1c, g8g {
    public final pg0 a;
    public final fo b;

    public u23(pg0 pg0Var, fo foVar) {
        this.a = pg0Var;
        this.b = foVar;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        int e0 = l9aVar.e0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * e0, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            g1c g1cVar = (g1c) list.get(i3);
            float E = yaa.E(yaa.B(g1cVar));
            if (E == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int min2 = Math.min(g1cVar.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, g1cVar.G(min2));
            } else if (E > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += E;
            }
        }
        int round = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            g1c g1cVar2 = (g1c) list.get(i4);
            float E2 = yaa.E(yaa.B(g1cVar2));
            if (E2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i2 = Math.max(i2, g1cVar2.G(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.g8g
    public final void b(int i, int[] iArr, int[] iArr2, m1c m1cVar) {
        this.a.b(m1cVar, i, iArr, iArr2);
    }

    @Override // defpackage.g8g
    public final l1c c(qhe[] qheVarArr, m1c m1cVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return m1c.G0(m1cVar, i3, i2, new f12(qheVarArr, this, i3, i, m1cVar, iArr));
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        return aba.C(this, an3.i(j), an3.j(j), an3.g(j), an3.h(j), m1cVar.e0(this.a.e()), m1cVar, list, new qhe[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.g8g
    public final int e(qhe qheVar) {
        return qheVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u23)) {
            return false;
        }
        u23 u23Var = (u23) obj;
        return this.a.equals(u23Var.a) && Intrinsics.c(this.b, u23Var.b);
    }

    @Override // defpackage.g8g
    public final int f(qhe qheVar) {
        return qheVar.b;
    }

    @Override // defpackage.g8g
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? cn3.a(0, i3, i, i2) : pco.D(0, i3, i, i2);
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        int e0 = l9aVar.e0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * e0, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            g1c g1cVar = (g1c) list.get(i3);
            float E = yaa.E(yaa.B(g1cVar));
            if (E == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int min2 = Math.min(g1cVar.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, g1cVar.B(min2));
            } else if (E > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += E;
            }
        }
        int round = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            g1c g1cVar2 = (g1c) list.get(i4);
            float E2 = yaa.E(yaa.B(g1cVar2));
            if (E2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i2 = Math.max(i2, g1cVar2.B(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        int e0 = l9aVar.e0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            g1c g1cVar = (g1c) list.get(i4);
            float E = yaa.E(yaa.B(g1cVar));
            int b = g1cVar.b(i);
            if (E == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += b;
            } else if (E > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += E;
                i2 = Math.max(i2, Math.round(b / E));
            }
        }
        return ((list.size() - 1) * e0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        int e0 = l9aVar.e0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            g1c g1cVar = (g1c) list.get(i4);
            float E = yaa.E(yaa.B(g1cVar));
            int s = g1cVar.s(i);
            if (E == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += s;
            } else if (E > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += E;
                i2 = Math.max(i2, Math.round(s / E));
            }
        }
        return ((list.size() - 1) * e0) + Math.round(i2 * f) + i3;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
