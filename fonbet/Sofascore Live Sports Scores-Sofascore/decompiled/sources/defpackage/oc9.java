package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oc9 {
    public final pp4 a;
    public final re4 b;
    public final re4 c;
    public final bka d;
    public final kd9[] e;
    public final b[] f;
    public final tp4 g;
    public final osj h;
    public final List i;
    public final cse k;
    public boolean l;
    public xt1 n;
    public Uri o;
    public Uri p;
    public boolean q;
    public nh6 r;
    public final dad j = new dad(24);
    public byte[] m = nik.b;
    public long s = C.TIME_UNSET;

    public oc9(pp4 pp4Var, tp4 tp4Var, kd9[] kd9VarArr, b[] bVarArr, dad dadVar, tn4 tn4Var, bka bkaVar, List list, cse cseVar) {
        this.a = pp4Var;
        this.g = tp4Var;
        this.e = kd9VarArr;
        this.f = bVarArr;
        this.d = bkaVar;
        this.i = list;
        this.k = cseVar;
        oe4 oe4Var = (oe4) dadVar.b;
        re4 createDataSource = oe4Var.createDataSource();
        this.b = createDataSource;
        if (tn4Var != null) {
            createDataSource.f(tn4Var);
        }
        this.c = oe4Var.createDataSource();
        this.h = new osj("", bVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < kd9VarArr.length; i++) {
            if ((bVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        osj osjVar = this.h;
        int[] O = jaa.O(arrayList);
        mc9 mc9Var = new mc9(osjVar, O);
        mc9Var.g = mc9Var.e(osjVar.d[O[0]]);
        this.r = mc9Var;
    }

    public static nc9 f(zc9 zc9Var, long j, int i) {
        long j2 = zc9Var.k;
        hv9 hv9Var = zc9Var.s;
        int i2 = (int) (j - j2);
        hv9 hv9Var2 = zc9Var.r;
        if (i2 == hv9Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < hv9Var.size()) {
                return new nc9((xc9) hv9Var.get(i), j, i);
            }
            return null;
        }
        wc9 wc9Var = (wc9) hv9Var2.get(i2);
        if (i == -1) {
            return new nc9(wc9Var, j, -1);
        }
        if (i < wc9Var.m.size()) {
            return new nc9((xc9) wc9Var.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < hv9Var2.size()) {
            return new nc9((xc9) hv9Var2.get(i3), j + 1, -1);
        }
        if (hv9Var.isEmpty()) {
            return null;
        }
        return new nc9((xc9) hv9Var.get(0), j + 1, 0);
    }

    public final jfb a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.g.d;
        sp4 sp4Var = (sp4) hashMap.get(uri);
        kd9 kd9Var = sp4Var != null ? sp4Var.a : null;
        kd9Var.getClass();
        HashMap hashMap2 = kd9Var.b;
        int size = hashMap2.size();
        cck it = vv9.t(hashMap2.values()).iterator();
        int i = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            sp4 sp4Var2 = (sp4) hashMap.get(uri2);
            if (sp4Var2 != null ? sp4Var2.c(uri2, elapsedRealtime) : false) {
                i++;
            }
        }
        return new jfb(size, i, this.r.length(), d(elapsedRealtime));
    }

    public final k2c[] b(pc9 pc9Var, long j) {
        List list;
        oc9 oc9Var = this;
        pc9 pc9Var2 = pc9Var;
        int a = pc9Var2 == null ? -1 : oc9Var.h.a(pc9Var2.d);
        int length = oc9Var.r.length();
        k2c[] k2cVarArr = new k2c[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int indexInTrackGroup = oc9Var.r.getIndexInTrackGroup(i);
            Uri c = oc9Var.e[indexInTrackGroup].c();
            tp4 tp4Var = oc9Var.g;
            if (tp4Var.h(c)) {
                zc9 c2 = tp4Var.c(z, c);
                c2.getClass();
                long j2 = c2.h - tp4Var.s;
                Pair e = oc9Var.e(pc9Var2, indexInTrackGroup != a ? true : z, c2, j2, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j3 = c2.k;
                hv9 hv9Var = c2.s;
                hv9 hv9Var2 = c2.r;
                int i2 = (int) (longValue - j3);
                if (i2 < 0 || hv9Var2.size() < i2) {
                    av9 av9Var = hv9.b;
                    list = vvf.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < hv9Var2.size()) {
                        if (intValue != -1) {
                            wc9 wc9Var = (wc9) hv9Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(wc9Var);
                            } else if (intValue < wc9Var.m.size()) {
                                hv9 hv9Var3 = wc9Var.m;
                                arrayList.addAll(hv9Var3.subList(intValue, hv9Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(hv9Var2.subList(i2, hv9Var2.size()));
                        intValue = 0;
                    }
                    if (c2.n != C.TIME_UNSET) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < hv9Var.size()) {
                            arrayList.addAll(hv9Var.subList(intValue, hv9Var.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                k2cVarArr[i] = new lc9(j2, list);
            } else {
                k2cVarArr[i] = k2c.x7;
            }
            i++;
            oc9Var = this;
            pc9Var2 = pc9Var;
            z = false;
        }
        return k2cVarArr;
    }

    public final int c(pc9 pc9Var) {
        int i = pc9Var.o;
        if (i == -1) {
            return 1;
        }
        zc9 c = this.g.c(false, pc9Var.m);
        c.getClass();
        hv9 hv9Var = c.r;
        int i2 = (int) (pc9Var.j - c.k);
        if (i2 < 0) {
            return 1;
        }
        hv9 hv9Var2 = i2 < hv9Var.size() ? ((wc9) hv9Var.get(i2)).m : c.s;
        if (i >= hv9Var2.size()) {
            return 2;
        }
        uc9 uc9Var = (uc9) hv9Var2.get(i);
        if (uc9Var.m) {
            return 0;
        }
        return Objects.equals(Uri.parse(tba.K(c.a, uc9Var.a)), pc9Var.b.a) ? 1 : 2;
    }

    public final int d(long j) {
        int i;
        nh6 nh6Var = this.r;
        int length = nh6Var.length();
        int i2 = 0;
        while (i < length) {
            int indexInTrackGroup = nh6Var.getIndexInTrackGroup(i);
            if (!nh6Var.d(i, j)) {
                i = this.g.g(this.e[indexInTrackGroup], j) ? 0 : i + 1;
            }
            i2++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da A[EDGE_INSN: B:58:0x00da->B:60:0x00da BREAK  A[LOOP:0: B:44:0x00ae->B:48:0x00d7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair e(pc9 pc9Var, boolean z, zc9 zc9Var, long j, long j2) {
        hv9 hv9Var;
        boolean z2 = true;
        if (pc9Var != null) {
            long j3 = pc9Var.j;
            int i = pc9Var.o;
            if (!z) {
                if (!pc9Var.H) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i));
                }
                if (i == -1) {
                    j3 = pc9Var.a();
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j4 = zc9Var.u;
        long j5 = zc9Var.k;
        hv9 hv9Var2 = zc9Var.s;
        hv9 hv9Var3 = zc9Var.r;
        long j6 = j + j4;
        long j7 = (pc9Var == null || this.q) ? j2 : pc9Var.g;
        if (!zc9Var.o && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + hv9Var3.size()), -1);
        }
        long j8 = j7 - j;
        Long valueOf = Long.valueOf(j8);
        tp4 tp4Var = this.g;
        int i2 = 0;
        if (tp4Var.r && pc9Var != null) {
            z2 = false;
        }
        int d = nik.d(hv9Var3, valueOf, z2);
        long j9 = d + j5;
        if (!tp4Var.r) {
            return new Pair(Long.valueOf(j9), -1);
        }
        if (d >= 0) {
            if (!hv9Var3.isEmpty()) {
                wc9 wc9Var = (wc9) hv9Var3.get(d);
                if (j8 < wc9Var.e + wc9Var.c) {
                    hv9Var = wc9Var.m;
                    while (true) {
                        if (i2 < hv9Var.size()) {
                            break;
                        }
                        uc9 uc9Var = (uc9) hv9Var.get(i2);
                        if (j8 >= uc9Var.e + uc9Var.c) {
                            i2++;
                        } else if (uc9Var.l) {
                            j9 += (hv9Var != hv9Var2 || hv9Var3.isEmpty()) ? 0L : 1L;
                            r3 = i2;
                        }
                    }
                }
            }
            hv9Var = hv9Var2;
            while (true) {
                if (i2 < hv9Var.size()) {
                }
                i2++;
            }
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kc9 g(Uri uri, int i, boolean z) {
        we2 we2Var = (we2) this.j.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) we2Var.remove(uri);
        if (bArr != null) {
            return null;
        }
        xe4 xe4Var = new xe4(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b bVar = this.f[i];
        int selectionReason = this.r.getSelectionReason();
        Object selectionData = this.r.getSelectionData();
        byte[] bArr2 = this.m;
        kc9 kc9Var = new kc9(this.c, xe4Var, 3, bVar, selectionReason, selectionData, C.TIME_UNSET, C.TIME_UNSET);
        if (bArr2 == null) {
            bArr2 = nik.b;
        }
        kc9Var.j = bArr2;
        return kc9Var;
    }
}
