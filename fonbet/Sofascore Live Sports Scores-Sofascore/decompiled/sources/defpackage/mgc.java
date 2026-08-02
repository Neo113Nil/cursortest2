package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mgc implements v6c, t6c {
    public final v6c[] a;
    public t6c e;
    public psj f;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public j0l h = new j0l(new z4h[0], 13);
    public final IdentityHashMap b = new IdentityHashMap();
    public v6c[] g = new v6c[0];

    public mgc(q1f q1fVar, long[] jArr, v6c... v6cVarArr) {
        this.a = v6cVarArr;
        for (int i = 0; i < v6cVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new kgc(v6cVarArr[i], j);
            }
        }
    }

    @Override // defpackage.v6c
    public final long a(long j, c0h c0hVar) {
        v6c[] v6cVarArr = this.g;
        return (v6cVarArr.length > 0 ? v6cVarArr[0] : this.a[0]).a(j, c0hVar);
    }

    @Override // defpackage.t6c
    public final void b(z4h z4hVar) {
        t6c t6cVar = this.e;
        t6cVar.getClass();
        t6cVar.b(this);
    }

    @Override // defpackage.v6c
    public final long c(mh6[] mh6VarArr, boolean[] zArr, ipg[] ipgVarArr, boolean[] zArr2, long j) {
        HashMap hashMap;
        IdentityHashMap identityHashMap;
        v6c[] v6cVarArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[mh6VarArr.length];
        int[] iArr4 = new int[mh6VarArr.length];
        int i = 0;
        while (true) {
            int length = mh6VarArr.length;
            hashMap = this.d;
            identityHashMap = this.b;
            v6cVarArr = this.a;
            if (i >= length) {
                break;
            }
            ipg ipgVar = ipgVarArr[i];
            Integer num = ipgVar == null ? null : (Integer) identityHashMap.get(ipgVar);
            iArr3[i] = num == null ? -1 : num.intValue();
            iArr4[i] = -1;
            mh6 mh6Var = mh6VarArr[i];
            if (mh6Var != null) {
                nsj nsjVar = (nsj) hashMap.get(mh6Var.getTrackGroup());
                nsjVar.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 >= v6cVarArr.length) {
                        break;
                    }
                    int indexOf = v6cVarArr[i2].getTrackGroups().b.indexOf(nsjVar);
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    if (indexOf != -1) {
                        iArr4[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = mh6VarArr.length;
        ipg[] ipgVarArr2 = new ipg[length2];
        ipg[] ipgVarArr3 = new ipg[mh6VarArr.length];
        mh6[] mh6VarArr2 = new mh6[mh6VarArr.length];
        ArrayList arrayList = new ArrayList(v6cVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < v6cVarArr.length) {
            int i4 = 0;
            while (i4 < mh6VarArr.length) {
                ipgVarArr3[i4] = iArr3[i4] == i3 ? ipgVarArr[i4] : null;
                if (iArr4[i4] == i3) {
                    mh6 mh6Var2 = mh6VarArr[i4];
                    mh6Var2.getClass();
                    iArr = iArr3;
                    nsj nsjVar2 = (nsj) hashMap.get(mh6Var2.getTrackGroup());
                    nsjVar2.getClass();
                    iArr2 = iArr4;
                    mh6VarArr2[i4] = new igc(mh6Var2, nsjVar2);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    mh6VarArr2[i4] = null;
                }
                i4++;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr4;
            ArrayList arrayList2 = arrayList;
            ipg[] ipgVarArr4 = ipgVarArr3;
            int i5 = i3;
            long c = v6cVarArr[i3].c(mh6VarArr2, zArr, ipgVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = c;
            } else if (c != j2) {
                a70.r("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < mh6VarArr.length; i6++) {
                if (iArr6[i6] == i5) {
                    ipg ipgVar2 = ipgVarArr4[i6];
                    ipgVar2.getClass();
                    ipgVarArr2[i6] = ipgVarArr4[i6];
                    identityHashMap.put(ipgVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr5[i6] == i5) {
                    qx9.t(ipgVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(v6cVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            ipgVarArr3 = ipgVarArr4;
            iArr3 = iArr5;
            iArr4 = iArr6;
        }
        System.arraycopy(ipgVarArr2, 0, ipgVarArr, 0, length2);
        v6c[] v6cVarArr2 = (v6c[]) arrayList.toArray(new v6c[0]);
        this.g = v6cVarArr2;
        this.h = new j0l(v6cVarArr2, 13);
        return j2;
    }

    @Override // defpackage.z4h
    public final boolean continueLoading(long j) {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return this.h.continueLoading(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v6c) arrayList.get(i)).continueLoading(j);
        }
        return false;
    }

    @Override // defpackage.t6c
    public final void d(v6c v6cVar) {
        ArrayList arrayList = this.c;
        arrayList.remove(v6cVar);
        if (arrayList.isEmpty()) {
            v6c[] v6cVarArr = this.a;
            int i = 0;
            for (v6c v6cVar2 : v6cVarArr) {
                i += v6cVar2.getTrackGroups().a;
            }
            nsj[] nsjVarArr = new nsj[i];
            int i2 = 0;
            for (int i3 = 0; i3 < v6cVarArr.length; i3++) {
                psj trackGroups = v6cVarArr[i3].getTrackGroups();
                int i4 = trackGroups.a;
                int i5 = 0;
                while (i5 < i4) {
                    nsj a = trackGroups.a(i5);
                    nsj nsjVar = new nsj(i3 + ":" + a.b, a.d);
                    this.d.put(nsjVar, a);
                    nsjVarArr[i2] = nsjVar;
                    i5++;
                    i2++;
                }
            }
            this.f = new psj(nsjVarArr);
            t6c t6cVar = this.e;
            t6cVar.getClass();
            t6cVar.d(this);
        }
    }

    @Override // defpackage.v6c
    public final void e(long j) {
        for (v6c v6cVar : this.g) {
            v6cVar.e(j);
        }
    }

    @Override // defpackage.v6c
    public final void g(t6c t6cVar, long j) {
        this.e = t6cVar;
        ArrayList arrayList = this.c;
        v6c[] v6cVarArr = this.a;
        Collections.addAll(arrayList, v6cVarArr);
        for (v6c v6cVar : v6cVarArr) {
            v6cVar.g(this, j);
        }
    }

    @Override // defpackage.z4h
    public final long getBufferedPositionUs() {
        return this.h.getBufferedPositionUs();
    }

    @Override // defpackage.z4h
    public final long getNextLoadPositionUs() {
        return this.h.getNextLoadPositionUs();
    }

    @Override // defpackage.v6c
    public final psj getTrackGroups() {
        psj psjVar = this.f;
        psjVar.getClass();
        return psjVar;
    }

    @Override // defpackage.z4h
    public final boolean isLoading() {
        return this.h.isLoading();
    }

    @Override // defpackage.v6c
    public final void maybeThrowPrepareError() {
        for (v6c v6cVar : this.a) {
            v6cVar.maybeThrowPrepareError();
        }
    }

    @Override // defpackage.v6c
    public final long readDiscontinuity() {
        long j;
        v6c v6cVar;
        v6c[] v6cVarArr = this.g;
        int length = v6cVarArr.length;
        long j2 = C.TIME_UNSET;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            v6c v6cVar2 = v6cVarArr[i];
            long readDiscontinuity = v6cVar2.readDiscontinuity();
            if (readDiscontinuity == j2) {
                j = j2;
                if (j3 != j && v6cVar2.seekToUs(j3) != j3) {
                    a70.r("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                v6c[] v6cVarArr2 = this.g;
                int length2 = v6cVarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (v6cVar = v6cVarArr2[i2]) == v6cVar2) {
                        break;
                    }
                    if (v6cVar.seekToUs(readDiscontinuity) != readDiscontinuity) {
                        a70.r("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = readDiscontinuity;
            } else {
                j = j2;
                if (readDiscontinuity != j3) {
                    a70.r("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.z4h
    public final void reevaluateBuffer(long j) {
        this.h.reevaluateBuffer(j);
    }

    @Override // defpackage.v6c
    public final long seekToUs(long j) {
        long seekToUs = this.g[0].seekToUs(j);
        int i = 1;
        while (true) {
            v6c[] v6cVarArr = this.g;
            if (i >= v6cVarArr.length) {
                return seekToUs;
            }
            if (v6cVarArr[i].seekToUs(seekToUs) != seekToUs) {
                a70.r("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }
}
