package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.h;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import xsna.d7q;
import xsna.fxc0;
import xsna.fz5;
import xsna.gas;
import xsna.m0h0;
import xsna.o3i0;
import xsna.pfp0;
import xsna.pui;
import xsna.qfp0;
import xsna.qhz;

/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes12.dex */
public final class k implements h, h.a {
    public final h[] b;
    public final boolean[] c;
    public final IdentityHashMap<m0h0, Integer> d;
    public final fz5 e;
    public final ArrayList<h> f = new ArrayList<>();
    public final HashMap<pfp0, pfp0> g = new HashMap<>();

    @Nullable
    public h.a h;

    @Nullable
    public qfp0 i;
    public h[] j;
    public pui k;

    /* compiled from: MergingMediaPeriod.java */
    public static final class a extends gas {
        public final pfp0 b;

        public a(d7q d7qVar, pfp0 pfp0Var) {
            super(d7qVar);
            this.b = pfp0Var;
        }

        @Override // xsna.gas, xsna.wgp0
        public final int b(androidx.media3.common.a aVar) {
            return this.a.indexOf(this.b.a(aVar));
        }

        @Override // xsna.gas
        public final boolean equals(@Nullable Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }

        @Override // xsna.gas, xsna.wgp0
        public final androidx.media3.common.a getFormat(int i) {
            return this.b.d[this.a.getIndexInTrackGroup(i)];
        }

        @Override // xsna.gas, xsna.d7q
        public final androidx.media3.common.a getSelectedFormat() {
            return this.b.d[this.a.getSelectedIndexInTrackGroup()];
        }

        @Override // xsna.gas, xsna.wgp0
        public final pfp0 getTrackGroup() {
            return this.b;
        }

        @Override // xsna.gas
        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    public k(fz5 fz5Var, long[] jArr, h... hVarArr) {
        this.e = fz5Var;
        this.b = hVarArr;
        fz5Var.getClass();
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        this.k = new pui(gVar, gVar);
        this.d = new IdentityHashMap<>();
        this.j = new h[0];
        this.c = new boolean[hVarArr.length];
        for (int i = 0; i < hVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.c[i] = true;
                this.b[i] = new s(hVarArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        h[] hVarArr = this.j;
        return (hVarArr.length > 0 ? hVarArr[0] : this.b[0]).a(j, o3i0Var);
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void b(h hVar) {
        ArrayList<h> arrayList = this.f;
        arrayList.remove(hVar);
        if (arrayList.isEmpty()) {
            h[] hVarArr = this.b;
            int i = 0;
            for (h hVar2 : hVarArr) {
                i += hVar2.getTrackGroups().a;
            }
            pfp0[] pfp0VarArr = new pfp0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < hVarArr.length; i3++) {
                qfp0 trackGroups = hVarArr[i3].getTrackGroups();
                int i4 = trackGroups.a;
                int i5 = 0;
                while (i5 < i4) {
                    pfp0 a2 = trackGroups.a(i5);
                    int i6 = a2.a;
                    androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        androidx.media3.common.a aVar = a2.d[i7];
                        a.C0043a a3 = aVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        String str = aVar.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a3.a = sb.toString();
                        aVarArr[i7] = new androidx.media3.common.a(a3);
                    }
                    pfp0 pfp0Var = new pfp0(i3 + StringUtils.PROCESS_POSTFIX_DELIMITER + a2.b, aVarArr);
                    this.g.put(pfp0Var, a2);
                    pfp0VarArr[i2] = pfp0Var;
                    i5++;
                    i2++;
                }
            }
            this.i = new qfp0(pfp0VarArr);
            h.a aVar2 = this.h;
            aVar2.getClass();
            aVar2.b(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public final void d(h hVar) {
        h.a aVar = this.h;
        aVar.getClass();
        aVar.d(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        for (h hVar : this.j) {
            hVar.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        this.h = aVar;
        ArrayList<h> arrayList = this.f;
        h[] hVarArr = this.b;
        Collections.addAll(arrayList, hVarArr);
        for (h hVar : hVarArr) {
            hVar.e(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        return this.k.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        return this.k.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        qfp0 qfp0Var = this.i;
        qfp0Var.getClass();
        return qfp0Var;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap<m0h0, Integer> identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[d7qVarArr.length];
        int[] iArr3 = new int[d7qVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = d7qVarArr.length;
            identityHashMap = this.d;
            if (i2 >= length) {
                break;
            }
            m0h0 m0h0Var = m0h0VarArr[i2];
            Integer num = m0h0Var == null ? null : identityHashMap.get(m0h0Var);
            iArr2[i2] = num == null ? -1 : num.intValue();
            d7q d7qVar = d7qVarArr[i2];
            if (d7qVar != null) {
                String str = d7qVar.getTrackGroup().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = d7qVarArr.length;
        m0h0[] m0h0VarArr2 = new m0h0[length2];
        m0h0[] m0h0VarArr3 = new m0h0[d7qVarArr.length];
        d7q[] d7qVarArr2 = new d7q[d7qVarArr.length];
        h[] hVarArr = this.b;
        ArrayList arrayList = new ArrayList(hVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < hVarArr.length) {
            int i4 = i;
            while (i4 < d7qVarArr.length) {
                m0h0VarArr3[i4] = iArr2[i4] == i3 ? m0h0VarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    d7q d7qVar2 = d7qVarArr[i4];
                    d7qVar2.getClass();
                    iArr = iArr2;
                    pfp0 pfp0Var = this.g.get(d7qVar2.getTrackGroup());
                    pfp0Var.getClass();
                    d7qVarArr2[i4] = new a(d7qVar2, pfp0Var);
                } else {
                    iArr = iArr2;
                    d7qVarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            h[] hVarArr2 = hVarArr;
            int i5 = i3;
            long h = hVarArr2[i3].h(d7qVarArr2, zArr, m0h0VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = h;
            } else if (h != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < d7qVarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    m0h0 m0h0Var2 = m0h0VarArr3[i6];
                    m0h0Var2.getClass();
                    m0h0VarArr2[i6] = m0h0VarArr3[i6];
                    identityHashMap.put(m0h0Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    fxc0.z(m0h0VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(hVarArr2[i5]);
            }
            i3 = i5 + 1;
            hVarArr = hVarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(m0h0VarArr2, i7, m0h0VarArr, i7, length2);
        this.j = (h[]) arrayList.toArray(new h[i7]);
        AbstractList e = qhz.e(arrayList, new io.reactivex.rxjava3.subjects.c(26));
        this.e.getClass();
        this.k = new pui(arrayList, e);
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.k.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        ArrayList<h> arrayList = this.f;
        if (arrayList.isEmpty()) {
            return this.k.k(fVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).k(fVar);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        for (h hVar : this.b) {
            hVar.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (h hVar : this.j) {
            long readDiscontinuity = hVar.readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                if (j == C.TIME_UNSET) {
                    for (h hVar2 : this.j) {
                        if (hVar2 == hVar) {
                            break;
                        }
                        if (hVar2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = readDiscontinuity;
                } else if (readDiscontinuity != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != C.TIME_UNSET && hVar.seekToUs(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        this.k.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long seekToUs(long j) {
        long seekToUs = this.j[0].seekToUs(j);
        int i = 1;
        while (true) {
            h[] hVarArr = this.j;
            if (i >= hVarArr.length) {
                return seekToUs;
            }
            if (hVarArr[i].seekToUs(seekToUs) != seekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }
}
