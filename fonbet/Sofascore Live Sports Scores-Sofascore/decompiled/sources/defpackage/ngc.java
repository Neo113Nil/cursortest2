package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ngc implements w6c, u6c {
    public final w6c[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public u6c f;
    public qsj g;
    public w6c[] h;
    public kg3 i;

    public ngc(tnf tnfVar, long[] jArr, w6c... w6cVarArr) {
        this.a = w6cVarArr;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        this.i = new kg3(vvfVar, vvfVar);
        this.c = new IdentityHashMap();
        this.h = new w6c[0];
        this.b = new boolean[w6cVarArr.length];
        for (int i = 0; i < w6cVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new ohj(w6cVarArr[i], j);
            }
        }
    }

    @Override // defpackage.w6c
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[nh6VarArr.length];
        int[] iArr3 = new int[nh6VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = nh6VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            jpg jpgVar = jpgVarArr[i2];
            Integer num = jpgVar == null ? null : (Integer) identityHashMap.get(jpgVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            nh6 nh6Var = nh6VarArr[i2];
            if (nh6Var != null) {
                String str = nh6Var.getTrackGroup().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = nh6VarArr.length;
        jpg[] jpgVarArr2 = new jpg[length2];
        jpg[] jpgVarArr3 = new jpg[nh6VarArr.length];
        nh6[] nh6VarArr2 = new nh6[nh6VarArr.length];
        w6c[] w6cVarArr = this.a;
        ArrayList arrayList = new ArrayList(w6cVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < w6cVarArr.length) {
            int i4 = i;
            while (i4 < nh6VarArr.length) {
                jpgVarArr3[i4] = iArr2[i4] == i3 ? jpgVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    nh6 nh6Var2 = nh6VarArr[i4];
                    nh6Var2.getClass();
                    iArr = iArr2;
                    osj osjVar = (osj) this.e.get(nh6Var2.getTrackGroup());
                    osjVar.getClass();
                    nh6VarArr2[i4] = new jgc(nh6Var2, osjVar);
                } else {
                    iArr = iArr2;
                    nh6VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            w6c[] w6cVarArr2 = w6cVarArr;
            int i5 = i3;
            long a = w6cVarArr2[i3].a(nh6VarArr2, zArr, jpgVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = a;
            } else if (a != j2) {
                a70.r("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < nh6VarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    jpg jpgVar2 = jpgVarArr3[i6];
                    jpgVar2.getClass();
                    jpgVarArr2[i6] = jpgVarArr3[i6];
                    identityHashMap.put(jpgVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    z1a.E(jpgVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(w6cVarArr2[i5]);
            }
            i3 = i5 + 1;
            w6cVarArr = w6cVarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(jpgVarArr2, i7, jpgVarArr, i7, length2);
        this.h = (w6c[]) arrayList.toArray(new w6c[i7]);
        this.i = new kg3(arrayList, w3a.S(arrayList, new m72(16)));
        return j2;
    }

    @Override // defpackage.y4h
    public final void b(a5h a5hVar) {
        u6c u6cVar = this.f;
        u6cVar.getClass();
        u6cVar.b(this);
    }

    @Override // defpackage.w6c
    public final long c(long j, d0h d0hVar) {
        w6c[] w6cVarArr = this.h;
        return (w6cVarArr.length > 0 ? w6cVarArr[0] : this.a[0]).c(j, d0hVar);
    }

    @Override // defpackage.u6c
    public final void d(w6c w6cVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(w6cVar);
        if (arrayList.isEmpty()) {
            w6c[] w6cVarArr = this.a;
            int i = 0;
            for (w6c w6cVar2 : w6cVarArr) {
                i += w6cVar2.getTrackGroups().a;
            }
            osj[] osjVarArr = new osj[i];
            int i2 = 0;
            for (int i3 = 0; i3 < w6cVarArr.length; i3++) {
                qsj trackGroups = w6cVarArr[i3].getTrackGroups();
                int i4 = trackGroups.a;
                int i5 = 0;
                while (i5 < i4) {
                    osj a = trackGroups.a(i5);
                    int i6 = a.a;
                    b[] bVarArr = new b[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        b bVar = a.d[i7];
                        qm8 a2 = bVar.a();
                        String str = bVar.m;
                        w6c[] w6cVarArr2 = w6cVarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = bVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        a2.a = sb.toString();
                        if (str != null) {
                            a2.l = i3 + ":" + str;
                        }
                        bVarArr[i7] = new b(a2);
                        i7++;
                        w6cVarArr = w6cVarArr2;
                    }
                    w6c[] w6cVarArr3 = w6cVarArr;
                    osj osjVar = new osj(i3 + ":" + a.b, bVarArr);
                    this.e.put(osjVar, a);
                    osjVarArr[i2] = osjVar;
                    i5++;
                    i2++;
                    w6cVarArr = w6cVarArr3;
                }
            }
            this.g = new qsj(osjVarArr);
            u6c u6cVar = this.f;
            u6cVar.getClass();
            u6cVar.d(this);
        }
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
        for (w6c w6cVar : this.h) {
            w6cVar.discardBuffer(j, z);
        }
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        this.f = u6cVar;
        ArrayList arrayList = this.d;
        w6c[] w6cVarArr = this.a;
        Collections.addAll(arrayList, w6cVarArr);
        for (w6c w6cVar : w6cVarArr) {
            w6cVar.f(this, j);
        }
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.g(mgbVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w6c) arrayList.get(i)).g(mgbVar);
        }
        return false;
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        return this.i.getBufferedPositionUs();
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        return this.i.getNextLoadPositionUs();
    }

    @Override // defpackage.w6c
    public final qsj getTrackGroups() {
        qsj qsjVar = this.g;
        qsjVar.getClass();
        return qsjVar;
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return this.i.isLoading();
    }

    @Override // defpackage.w6c
    public final void maybeThrowPrepareError() {
        for (w6c w6cVar : this.a) {
            w6cVar.maybeThrowPrepareError();
        }
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        long j;
        w6c w6cVar;
        w6c[] w6cVarArr = this.h;
        int length = w6cVarArr.length;
        long j2 = C.TIME_UNSET;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            w6c w6cVar2 = w6cVarArr[i];
            long readDiscontinuity = w6cVar2.readDiscontinuity();
            if (readDiscontinuity == j2) {
                j = j2;
                if (j3 != j && w6cVar2.seekToUs(j3) != j3) {
                    a70.r("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                w6c[] w6cVarArr2 = this.h;
                int length2 = w6cVarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (w6cVar = w6cVarArr2[i2]) == w6cVar2) {
                        break;
                    }
                    if (w6cVar.seekToUs(readDiscontinuity) != readDiscontinuity) {
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

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        this.i.reevaluateBuffer(j);
    }

    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        long seekToUs = this.h[0].seekToUs(j);
        int i = 1;
        while (true) {
            w6c[] w6cVarArr = this.h;
            if (i >= w6cVarArr.length) {
                return seekToUs;
            }
            if (w6cVarArr[i].seekToUs(seekToUs) != seekToUs) {
                a70.r("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }
}
