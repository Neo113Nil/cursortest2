package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l8g implements k1c, g8g {
    public final lg0 a;
    public final lv1 b;

    public l8g(lg0 lg0Var, lv1 lv1Var) {
        this.a = lg0Var;
        this.b = lv1Var;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
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
            int G = g1cVar.G(i);
            if (E == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += G;
            } else if (E > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += E;
                i2 = Math.max(i2, Math.round(G / E));
            }
        }
        return ((list.size() - 1) * e0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.g8g
    public final void b(int i, int[] iArr, int[] iArr2, m1c m1cVar) {
        this.a.j(m1cVar, i, iArr, m1cVar.getLayoutDirection(), iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g8g
    public final l1c c(qhe[] qheVarArr, m1c m1cVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return m1c.G0(m1cVar, i2, i3, new i16(qheVarArr, this, i3, i, iArr, 1));
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        return aba.C(this, an3.j(j), an3.i(j), an3.h(j), an3.g(j), m1cVar.e0(this.a.e()), m1cVar, list, new qhe[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.g8g
    public final int e(qhe qheVar) {
        return qheVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8g)) {
            return false;
        }
        l8g l8gVar = (l8g) obj;
        return Intrinsics.c(this.a, l8gVar.a) && Intrinsics.c(this.b, l8gVar.b);
    }

    @Override // defpackage.g8g
    public final int f(qhe qheVar) {
        return qheVar.a;
    }

    @Override // defpackage.g8g
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? cn3.a(i, i2, 0, i3) : pco.E(i, i2, 0, i3);
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
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
            int B = g1cVar.B(i);
            if (E == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 += B;
            } else if (E > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f += E;
                i2 = Math.max(i2, Math.round(B / E));
            }
        }
        return ((list.size() - 1) * e0) + Math.round(i2 * f) + i3;
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
        int min = Math.min((list.size() - 1) * e0, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            g1c g1cVar = (g1c) list.get(i3);
            float E = yaa.E(yaa.B(g1cVar));
            if (E == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int min2 = Math.min(g1cVar.G(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, g1cVar.b(min2));
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
                i2 = Math.max(i2, g1cVar2.b(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
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
                int min2 = Math.min(g1cVar.G(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, g1cVar.s(min2));
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
                i2 = Math.max(i2, g1cVar2.s(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
