package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.m0;
import b1.AbstractC2346O;
import b1.P;
import e1.Z;
import java.util.Arrays;
import java.util.Objects;
import m1.k1;

/* loaded from: classes.dex */
public abstract class B extends F {

    /* renamed from: c, reason: collision with root package name */
    public a f21905c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f21906a;

        /* renamed from: b, reason: collision with root package name */
        public final int[][][] f21907b;

        /* renamed from: c, reason: collision with root package name */
        public final m0 f21908c;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final String[] rendererNames;
        private final m0[] rendererTrackGroups;
        private final int[] rendererTrackTypes;

        public a(String[] strArr, int[] iArr, m0[] m0VarArr, int[] iArr2, int[][][] iArr3, m0 m0Var) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = m0VarArr;
            this.f21907b = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.f21908c = m0Var;
            this.f21906a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.rendererTrackGroups[i10].b(i11).f24395a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.rendererTrackGroups[i10].b(i11).a(iArr[i12]).f20543o;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !Objects.equals(str, str2);
                }
                i13 = Math.min(i13, androidx.media3.exoplayer.q.q(this.f21907b[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.rendererMixedMimeTypeAdaptiveSupports[i10]) : i13;
        }

        public int c(int i10, int i11, int i12) {
            return this.f21907b[i10][i11][i12];
        }

        public int d() {
            return this.f21906a;
        }

        public int e(int i10) {
            return this.rendererTrackTypes[i10];
        }

        public m0 f(int i10) {
            return this.rendererTrackGroups[i10];
        }

        public int g(int i10, int i11, int i12) {
            return androidx.media3.exoplayer.q.Q(c(i10, i11, i12));
        }

        public m0 h() {
            return this.f21908c;
        }
    }

    public static int n(androidx.media3.exoplayer.q[] qVarArr, P p10, int[] iArr, boolean z10) {
        int length = qVarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < qVarArr.length; i11++) {
            androidx.media3.exoplayer.q qVar = qVarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < p10.f24395a; i13++) {
                i12 = Math.max(i12, androidx.media3.exoplayer.q.Q(qVar.a(p10.a(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    public static int[] p(androidx.media3.exoplayer.q qVar, P p10) {
        int[] iArr = new int[p10.f24395a];
        for (int i10 = 0; i10 < p10.f24395a; i10++) {
            iArr[i10] = qVar.a(p10.a(i10));
        }
        return iArr;
    }

    public static int[] q(androidx.media3.exoplayer.q[] qVarArr) {
        int length = qVarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = qVarArr[i10].K();
        }
        return iArr;
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    public final void i(Object obj) {
        this.f21905c = (a) obj;
    }

    @Override // androidx.media3.exoplayer.trackselection.F
    public final G k(androidx.media3.exoplayer.q[] qVarArr, m0 m0Var, D.b bVar, AbstractC2346O abstractC2346O) {
        int[] iArr = new int[qVarArr.length + 1];
        int length = qVarArr.length + 1;
        P[][] pArr = new P[length][];
        int[][][] iArr2 = new int[qVarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = m0Var.f21832a;
            pArr[i10] = new P[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] q10 = q(qVarArr);
        for (int i12 = 0; i12 < m0Var.f21832a; i12++) {
            P b10 = m0Var.b(i12);
            int n10 = n(qVarArr, b10, iArr, b10.f24397c == 5);
            int[] p10 = n10 == qVarArr.length ? new int[b10.f24395a] : p(qVarArr[n10], b10);
            int i13 = iArr[n10];
            pArr[n10][i13] = b10;
            iArr2[n10][i13] = p10;
            iArr[n10] = i13 + 1;
        }
        m0[] m0VarArr = new m0[qVarArr.length];
        String[] strArr = new String[qVarArr.length];
        int[] iArr3 = new int[qVarArr.length];
        for (int i14 = 0; i14 < qVarArr.length; i14++) {
            int i15 = iArr[i14];
            m0VarArr[i14] = new m0((P[]) Z.g1(pArr[i14], i15));
            iArr2[i14] = (int[][]) Z.g1(iArr2[i14], i15);
            strArr[i14] = qVarArr[i14].getName();
            iArr3[i14] = qVarArr[i14].f();
        }
        a aVar = new a(strArr, iArr3, m0VarArr, q10, iArr2, new m0((P[]) Z.g1(pArr[qVarArr.length], iArr[qVarArr.length])));
        Pair r10 = r(aVar, iArr2, q10, bVar, abstractC2346O);
        return new G((k1[]) r10.first, (y[]) r10.second, E.a(aVar, (C[]) r10.second), aVar);
    }

    public final a o() {
        return this.f21905c;
    }

    public abstract Pair r(a aVar, int[][][] iArr, int[] iArr2, D.b bVar, AbstractC2346O abstractC2346O);
}
