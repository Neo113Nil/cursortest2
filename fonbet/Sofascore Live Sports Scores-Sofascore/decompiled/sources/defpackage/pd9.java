package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pd9 implements vfb, agb, a5h, pl6, fpg {
    public static final Set Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public b F;
    public b G;
    public boolean H;
    public qsj I;
    public Set J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public boolean V;
    public long W;
    public DrmInitData X;
    public pc9 Y;
    public final String a;
    public final int b;
    public final j0l c;
    public final oc9 d;
    public final l2a e;
    public final b f;
    public final kc5 g;
    public final cc5 h;
    public final it7 i;
    public final x6k j;
    public final b10 k;
    public final int l;
    public final yih m;
    public final ArrayList n;
    public final List o;
    public final md9 p;
    public final md9 q;
    public final Handler r;
    public final ArrayList s;
    public final Map t;
    public mu2 u;
    public od9[] v;
    public int[] w;
    public final HashSet x;
    public final SparseIntArray y;
    public nd9 z;

    /* JADX WARN: Type inference failed for: r3v13, types: [md9] */
    /* JADX WARN: Type inference failed for: r3v14, types: [md9] */
    public pd9(String str, int i, j0l j0lVar, oc9 oc9Var, Map map, l2a l2aVar, long j, b bVar, kc5 kc5Var, cc5 cc5Var, it7 it7Var, b10 b10Var, int i2, irb irbVar) {
        this.a = str;
        this.b = i;
        this.c = j0lVar;
        this.d = oc9Var;
        this.t = map;
        this.e = l2aVar;
        this.f = bVar;
        this.g = kc5Var;
        this.h = cc5Var;
        this.i = it7Var;
        this.k = b10Var;
        this.l = i2;
        final int i3 = 1;
        this.j = irbVar != null ? new x6k(irbVar, i3) : new x6k("Loader:HlsSampleStreamWrapper");
        yih yihVar = new yih(4);
        yihVar.c = null;
        final int i4 = 0;
        yihVar.b = false;
        yihVar.d = null;
        this.m = yihVar;
        this.w = new int[0];
        Set set = Z;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new od9[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        this.p = new Runnable(this) { // from class: md9
            public final /* synthetic */ pd9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i4;
                pd9 pd9Var = this.b;
                switch (i5) {
                    case 0:
                        pd9Var.t();
                        break;
                    default:
                        for (od9 od9Var : pd9Var.v) {
                            od9Var.I(pd9Var.U);
                        }
                        pd9Var.C = true;
                        pd9Var.t();
                        break;
                }
            }
        };
        this.q = new Runnable(this) { // from class: md9
            public final /* synthetic */ pd9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i3;
                pd9 pd9Var = this.b;
                switch (i5) {
                    case 0:
                        pd9Var.t();
                        break;
                    default:
                        for (od9 od9Var : pd9Var.v) {
                            od9Var.I(pd9Var.U);
                        }
                        pd9Var.C = true;
                        pd9Var.t();
                        break;
                }
            }
        };
        this.r = nik.q(null);
        this.P = j;
        this.Q = j;
        this.U = Long.MIN_VALUE;
    }

    public static q35 j(int i, int i2) {
        tgj.d0("Unmapped track with id " + i + " of type " + i2);
        return new q35();
    }

    public static b n(b bVar, b bVar2, boolean z) {
        String c;
        if (bVar == null) {
            return bVar2;
        }
        String str = bVar.k;
        String str2 = bVar2.o;
        int i = sjc.i(str2);
        if (nik.w(i, str) == 1) {
            c = nik.x(str, i);
            str2 = sjc.e(c);
        } else {
            c = sjc.c(str, str2);
        }
        qm8 a = bVar2.a();
        a.a = bVar.a;
        a.b = bVar.b;
        a.c = hv9.v(bVar.c);
        a.d = bVar.d;
        a.e = bVar.e;
        a.f = bVar.f;
        a.h = z ? bVar.h : -1;
        a.i = z ? bVar.i : -1;
        a.j = c;
        if (i == 2) {
            a.u = bVar.v;
            a.v = bVar.w;
            a.y = bVar.z;
        }
        if (str2 != null) {
            a.n = sjc.p(str2);
        }
        int i2 = bVar.G;
        if (i2 != -1 && i == 1) {
            a.F = i2;
        }
        ric ricVar = bVar.l;
        if (ricVar != null) {
            ric ricVar2 = bVar2.l;
            if (ricVar2 != null) {
                ricVar = ricVar2.b(ricVar);
            }
            a.k = ricVar;
        }
        return new b(a);
    }

    public static int q(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.vfb
    public final void b(yfb yfbVar, long j, long j2, boolean z) {
        mu2 mu2Var = (mu2) yfbVar;
        this.u = null;
        long j3 = mu2Var.a;
        xe4 xe4Var = mu2Var.b;
        tei teiVar = mu2Var.i;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        this.i.getClass();
        this.k.u(lfbVar, mu2Var.c, this.b, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h);
        if (z) {
            return;
        }
        if (s() || this.E == 0) {
            w();
        }
        if (this.E > 0) {
            this.c.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vfb
    public final void d(yfb yfbVar, long j, long j2) {
        mu2 mu2Var = (mu2) yfbVar;
        this.u = null;
        if (mu2Var instanceof kc9) {
            kc9 kc9Var = (kc9) mu2Var;
            byte[] bArr = kc9Var.j;
            oc9 oc9Var = this.d;
            oc9Var.m = bArr;
            dad dadVar = oc9Var.j;
            Uri uri = kc9Var.b.a;
            byte[] bArr2 = kc9Var.l;
            bArr2.getClass();
            we2 we2Var = (we2) dadVar.b;
            uri.getClass();
        }
        long j3 = mu2Var.a;
        xe4 xe4Var = mu2Var.b;
        tei teiVar = mu2Var.i;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        this.i.getClass();
        this.k.v(lfbVar, mu2Var.c, this.b, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h);
        if (this.D) {
            this.c.b(this);
            return;
        }
        lgb lgbVar = new lgb();
        lgbVar.a = this.P;
        g(new mgb(lgbVar));
    }

    @Override // defpackage.fpg
    public final void e() {
        this.r.post(this.p);
    }

    @Override // defpackage.pl6
    public final void endTracks() {
        this.V = true;
        this.r.post(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04a5  */
    @Override // defpackage.a5h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(mgb mgbVar) {
        long max;
        long j;
        List list;
        long j2;
        int a;
        mgb mgbVar2;
        we2 we2Var;
        long j3;
        oc9 oc9Var;
        boolean z;
        Uri c;
        long j4;
        long j5;
        long j6;
        pc9 pc9Var;
        oc9 oc9Var2;
        nc9 f;
        long j7;
        boolean z2;
        yih yihVar;
        boolean z3;
        pp4 pp4Var;
        we2 we2Var2;
        byte[] bArr;
        x6k x6kVar;
        boolean z4;
        byte[] bArr2;
        re4 re4Var;
        wc9 wc9Var;
        cse cseVar;
        xe4 xe4Var;
        re4 re4Var2;
        boolean z5;
        xq9 xq9Var;
        j9e j9eVar;
        n72 n72Var;
        djj djjVar;
        byte[] bArr3;
        re4 re4Var3;
        String str;
        boolean z6;
        sp4 sp4Var;
        if (!this.T) {
            x6k x6kVar2 = this.j;
            if (!x6kVar2.l() && !x6kVar2.c()) {
                if (s()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.Q;
                    for (od9 od9Var : this.v) {
                        od9Var.t = this.Q;
                    }
                    list = list2;
                    j = max;
                } else {
                    pc9 p = p();
                    boolean z7 = p.H;
                    long j8 = p.g;
                    if (z7 && p.f()) {
                        long j9 = p.K;
                        max = j9 != C.TIME_UNSET ? j8 + j9 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.P, j8);
                    }
                    long j10 = this.P;
                    boolean z8 = this.C;
                    List list3 = this.o;
                    if (z8) {
                        for (od9 od9Var2 : this.v) {
                            j10 = Math.max(j10, od9Var2.s());
                        }
                    }
                    j = j10;
                    list = list3;
                }
                yih yihVar2 = this.m;
                yihVar2.c = null;
                yihVar2.b = false;
                yihVar2.d = null;
                boolean z9 = this.D || !list.isEmpty();
                oc9 oc9Var3 = this.d;
                we2 we2Var3 = (we2) oc9Var3.j.b;
                kd9[] kd9VarArr = oc9Var3.e;
                tp4 tp4Var = oc9Var3.g;
                pc9 pc9Var2 = list.isEmpty() ? null : (pc9) jca.H(list);
                if (pc9Var2 == null) {
                    j2 = -9223372036854775807L;
                    a = -1;
                    we2Var = we2Var3;
                    mgbVar2 = mgbVar;
                } else {
                    j2 = -9223372036854775807L;
                    a = oc9Var3.h.a(pc9Var2.d);
                    mgbVar2 = mgbVar;
                    we2Var = we2Var3;
                }
                long j11 = mgbVar2.a;
                long j12 = max - j11;
                long j13 = oc9Var3.s;
                long j14 = j13 != j2 ? j13 - j11 : j2;
                if (pc9Var2 == null || oc9Var3.q) {
                    j3 = j14;
                    oc9Var = oc9Var3;
                } else {
                    oc9Var = oc9Var3;
                    j3 = j14;
                    long j15 = pc9Var2.h - pc9Var2.g;
                    j12 = Math.max(0L, j12 - j15);
                    if (j3 != j2) {
                        j3 = Math.max(0L, j3 - j15);
                    }
                }
                k2c[] b = oc9Var.b(pc9Var2, max);
                if (a != -1) {
                    nh6 nh6Var = oc9Var.r;
                    if (nh6Var.d(nh6Var.indexOf(a), SystemClock.elapsedRealtime())) {
                        z = true;
                        long j16 = max;
                        pc9 pc9Var3 = pc9Var2;
                        oc9Var.r.h(j11, j12, j3, list, b);
                        int selectedIndexInTrackGroup = oc9Var.r.getSelectedIndexInTrackGroup();
                        boolean z10 = a == selectedIndexInTrackGroup;
                        c = kd9VarArr[selectedIndexInTrackGroup].c();
                        if (tp4Var.h(c)) {
                            yihVar2.d = c;
                            oc9Var.p = c;
                            x6kVar = x6kVar2;
                            yihVar = yihVar2;
                        } else {
                            zc9 c2 = tp4Var.c(true, c);
                            c2.getClass();
                            long j17 = c2.h;
                            oc9Var.q = c2.c;
                            if (c2.o) {
                                j4 = j17;
                                j5 = j2;
                            } else {
                                j4 = j17;
                                j5 = (j4 + c2.u) - tp4Var.s;
                            }
                            oc9Var.s = j5;
                            long j18 = j4 - tp4Var.s;
                            we2 we2Var4 = we2Var;
                            oc9 oc9Var4 = oc9Var;
                            Pair e = oc9Var4.e(pc9Var3, z10, c2, j18, j16);
                            boolean z11 = z;
                            long longValue = ((Long) e.first).longValue();
                            int intValue = ((Integer) e.second).intValue();
                            if (!z10 || z11 || pc9Var3 == null) {
                                j6 = j18;
                            } else {
                                j6 = j18;
                                if (longValue < c2.k || ((f = oc9.f(c2, longValue, intValue)) != null && j6 + ((xc9) f.d).e < j)) {
                                    c = kd9VarArr[a].c();
                                    c2 = tp4Var.c(true, c);
                                    c2.getClass();
                                    long j19 = c2.h - tp4Var.s;
                                    Pair e2 = oc9Var4.e(pc9Var3, false, c2, j19, j16);
                                    pc9Var = pc9Var3;
                                    long longValue2 = ((Long) e2.first).longValue();
                                    intValue = ((Integer) e2.second).intValue();
                                    selectedIndexInTrackGroup = a;
                                    j6 = j19;
                                    oc9Var2 = oc9Var4;
                                    longValue = longValue2;
                                    String str2 = c2.a;
                                    boolean z12 = c2.c;
                                    j7 = c2.k;
                                    hv9 hv9Var = c2.r;
                                    if (selectedIndexInTrackGroup == a) {
                                        if (a != -1) {
                                            Uri c3 = kd9VarArr[a].c();
                                            sp4 sp4Var2 = (sp4) tp4Var.d.get(c3);
                                            if (sp4Var2 != null) {
                                                rp4 rp4Var = (rp4) wv8.g(sp4Var2.b, c3, c3);
                                                rp4Var.getClass();
                                                rp4Var.l = false;
                                            }
                                        }
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    if (longValue >= j7) {
                                        oc9Var2.n = new xt1();
                                        x6kVar = x6kVar2;
                                        yihVar = yihVar2;
                                    } else {
                                        nc9 f2 = oc9.f(c2, longValue, intValue);
                                        if (f2 == null) {
                                            if (c2.o) {
                                                yihVar = yihVar2;
                                                if (z9 || hv9Var.isEmpty()) {
                                                    yihVar.b = z2;
                                                } else {
                                                    f2 = new nc9((xc9) jca.H(hv9Var), (j7 + hv9Var.size()) - 1, -1);
                                                }
                                            } else {
                                                yihVar = yihVar2;
                                                yihVar.d = c;
                                                oc9Var2.p = c;
                                            }
                                            x6kVar = x6kVar2;
                                        } else {
                                            yihVar = yihVar2;
                                        }
                                        boolean z13 = f2.b;
                                        xc9 xc9Var = (xc9) f2.d;
                                        oc9Var2.p = null;
                                        SystemClock.elapsedRealtime();
                                        wc9 wc9Var2 = xc9Var.b;
                                        long j20 = xc9Var.e;
                                        Uri L = (wc9Var2 == null || (str = wc9Var2.g) == null) ? null : tba.L(str2, str);
                                        kc9 g = oc9Var2.g(L, selectedIndexInTrackGroup, true);
                                        yihVar.c = g;
                                        if (g == null) {
                                            String str3 = xc9Var.g;
                                            Uri L2 = str3 == null ? null : tba.L(str2, str3);
                                            kc9 g2 = oc9Var2.g(L2, selectedIndexInTrackGroup, false);
                                            yihVar.c = g2;
                                            if (g2 == null) {
                                                boolean z14 = xc9Var instanceof uc9 ? ((uc9) xc9Var).l || (f2.a == 0 && z12) : z12;
                                                if (pc9Var == null) {
                                                    AtomicInteger atomicInteger = pc9.M;
                                                } else if (!c.equals(pc9Var.m) || !pc9Var.H) {
                                                    long j21 = j6 + j20;
                                                    if (!z14 || j21 < j16) {
                                                        z3 = true;
                                                        if (z3 || !z13) {
                                                            pp4 pp4Var2 = oc9Var2.a;
                                                            re4 re4Var4 = oc9Var2.b;
                                                            b bVar = oc9Var2.f[selectedIndexInTrackGroup];
                                                            List list4 = oc9Var2.i;
                                                            int selectionReason = oc9Var2.r.getSelectionReason();
                                                            Object selectionData = oc9Var2.r.getSelectionData();
                                                            boolean z15 = oc9Var2.l;
                                                            bka bkaVar = oc9Var2.d;
                                                            if (L2 != null) {
                                                                pp4Var = pp4Var2;
                                                                we2Var2 = we2Var4;
                                                                bArr = null;
                                                            } else {
                                                                pp4Var = pp4Var2;
                                                                we2Var2 = we2Var4;
                                                                bArr = (byte[]) we2Var2.get(L2);
                                                            }
                                                            byte[] bArr4 = L != null ? null : (byte[]) we2Var2.get(L);
                                                            cse cseVar2 = oc9Var2.k;
                                                            AtomicInteger atomicInteger2 = pc9.M;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri L3 = tba.L(str2, xc9Var.a);
                                                            x6kVar = x6kVar2;
                                                            long j22 = xc9Var.i;
                                                            long j23 = xc9Var.j;
                                                            int i = !z13 ? 8 : 0;
                                                            z1a.y(L3, "The uri must be set.");
                                                            xe4 xe4Var2 = new xe4(L3, 0L, 1, null, map, j22, j23, null, i);
                                                            z4 = bArr == null;
                                                            if (z4) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str4 = xc9Var.h;
                                                                str4.getClass();
                                                                bArr2 = pc9.d(str4);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                re4Var = new nl(re4Var4, bArr, bArr2);
                                                            } else {
                                                                re4Var = re4Var4;
                                                            }
                                                            wc9Var = xc9Var.b;
                                                            if (wc9Var == null) {
                                                                boolean z16 = bArr4 != null;
                                                                if (z16) {
                                                                    String str5 = wc9Var.h;
                                                                    str5.getClass();
                                                                    bArr3 = pc9.d(str5);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z17 = z16;
                                                                Uri L4 = tba.L(str2, wc9Var.a);
                                                                cseVar = cseVar2;
                                                                long j24 = wc9Var.i;
                                                                long j25 = wc9Var.j;
                                                                z1a.y(L4, "The uri must be set.");
                                                                xe4 xe4Var3 = new xe4(L4, 0L, 1, null, map, j24, j25, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    re4Var3 = new nl(re4Var4, bArr4, bArr3);
                                                                } else {
                                                                    re4Var3 = re4Var4;
                                                                }
                                                                re4Var2 = re4Var3;
                                                                z5 = z17;
                                                                xe4Var = xe4Var3;
                                                            } else {
                                                                cseVar = cseVar2;
                                                                xe4Var = null;
                                                                re4Var2 = null;
                                                                z5 = false;
                                                            }
                                                            long j26 = j6 + j20;
                                                            long j27 = j26 + xc9Var.c;
                                                            int i2 = c2.j + xc9Var.d;
                                                            if (pc9Var == null) {
                                                                xe4 xe4Var4 = pc9Var.q;
                                                                boolean z18 = xe4Var == xe4Var4 || (xe4Var != null && xe4Var4 != null && xe4Var.a.equals(xe4Var4.a) && xe4Var.f == xe4Var4.f);
                                                                boolean z19 = c.equals(pc9Var.m) && pc9Var.H;
                                                                xq9Var = pc9Var.y;
                                                                j9eVar = pc9Var.z;
                                                                n72Var = (z18 && z19 && !pc9Var.J && pc9Var.l == i2) ? pc9Var.C : null;
                                                            } else {
                                                                xq9Var = new xq9(null);
                                                                j9eVar = new j9e(10);
                                                                n72Var = null;
                                                            }
                                                            xq9 xq9Var2 = xq9Var;
                                                            j9e j9eVar2 = j9eVar;
                                                            long j28 = f2.c;
                                                            int i3 = f2.a;
                                                            boolean z20 = !z13;
                                                            boolean z21 = xc9Var.k;
                                                            SparseArray sparseArray = (SparseArray) bkaVar.b;
                                                            djjVar = (djj) sparseArray.get(i2);
                                                            if (djjVar == null) {
                                                                djjVar = new djj(9223372036854775806L);
                                                                sparseArray.put(i2, djjVar);
                                                            }
                                                            yihVar.c = new pc9(pp4Var, re4Var, xe4Var2, bVar, z4, re4Var2, xe4Var, z5, c, list4, selectionReason, selectionData, j26, j27, j28, i3, z20, i2, z21, z15, djjVar, xc9Var.f, n72Var, xq9Var2, j9eVar2, z3, z14, cseVar);
                                                        }
                                                    }
                                                }
                                                z3 = false;
                                                if (z3) {
                                                }
                                                pp4 pp4Var22 = oc9Var2.a;
                                                re4 re4Var42 = oc9Var2.b;
                                                b bVar2 = oc9Var2.f[selectedIndexInTrackGroup];
                                                List list42 = oc9Var2.i;
                                                int selectionReason2 = oc9Var2.r.getSelectionReason();
                                                Object selectionData2 = oc9Var2.r.getSelectionData();
                                                boolean z152 = oc9Var2.l;
                                                bka bkaVar2 = oc9Var2.d;
                                                if (L2 != null) {
                                                }
                                                if (L != null) {
                                                }
                                                cse cseVar22 = oc9Var2.k;
                                                AtomicInteger atomicInteger22 = pc9.M;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri L32 = tba.L(str2, xc9Var.a);
                                                x6kVar = x6kVar2;
                                                long j222 = xc9Var.i;
                                                long j232 = xc9Var.j;
                                                if (!z13) {
                                                }
                                                z1a.y(L32, "The uri must be set.");
                                                xe4 xe4Var22 = new xe4(L32, 0L, 1, null, map2, j222, j232, null, i);
                                                if (bArr == null) {
                                                }
                                                if (z4) {
                                                }
                                                if (bArr == null) {
                                                }
                                                wc9Var = xc9Var.b;
                                                if (wc9Var == null) {
                                                }
                                                long j262 = j6 + j20;
                                                long j272 = j262 + xc9Var.c;
                                                int i22 = c2.j + xc9Var.d;
                                                if (pc9Var == null) {
                                                }
                                                xq9 xq9Var22 = xq9Var;
                                                j9e j9eVar22 = j9eVar;
                                                long j282 = f2.c;
                                                int i32 = f2.a;
                                                boolean z202 = !z13;
                                                boolean z212 = xc9Var.k;
                                                SparseArray sparseArray2 = (SparseArray) bkaVar2.b;
                                                djjVar = (djj) sparseArray2.get(i22);
                                                if (djjVar == null) {
                                                }
                                                yihVar.c = new pc9(pp4Var, re4Var, xe4Var22, bVar2, z4, re4Var2, xe4Var, z5, c, list42, selectionReason2, selectionData2, j262, j272, j282, i32, z202, i22, z212, z152, djjVar, xc9Var.f, n72Var, xq9Var22, j9eVar22, z3, z14, cseVar);
                                            }
                                        }
                                        x6kVar = x6kVar2;
                                    }
                                }
                            }
                            pc9Var = pc9Var3;
                            oc9Var2 = oc9Var4;
                            String str22 = c2.a;
                            boolean z122 = c2.c;
                            j7 = c2.k;
                            hv9 hv9Var2 = c2.r;
                            if (selectedIndexInTrackGroup == a) {
                            }
                            if (longValue >= j7) {
                            }
                        }
                        z6 = yihVar.b;
                        mu2 mu2Var = (mu2) yihVar.c;
                        Uri uri = (Uri) yihVar.d;
                        if (!z6) {
                            this.Q = j2;
                            this.T = true;
                            return true;
                        }
                        if (mu2Var == null) {
                            if (uri == null || (sp4Var = (sp4) ((qc9) this.c.b).b.d.get(uri)) == null) {
                                return false;
                            }
                            sp4Var.d(true, uri);
                            return false;
                        }
                        if (mu2Var instanceof pc9) {
                            pc9 pc9Var4 = (pc9) mu2Var;
                            ArrayList arrayList = this.n;
                            if (!arrayList.isEmpty()) {
                                if (!p().f()) {
                                    o(arrayList.size() - 1);
                                }
                                if (pc9Var4.n && pc9Var4.L) {
                                    int size = arrayList.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            break;
                                        }
                                        long j29 = ((pc9) arrayList.get(size)).g;
                                        long j30 = pc9Var4.g;
                                        if (j29 < j30) {
                                            break;
                                        }
                                        if (j29 == j30 && i(size)) {
                                            o(size);
                                            pc9Var4.L = false;
                                            break;
                                        }
                                        size--;
                                    }
                                }
                            }
                            this.Y = pc9Var4;
                            this.F = pc9Var4.d;
                            this.Q = C.TIME_UNSET;
                            arrayList.add(pc9Var4);
                            zu9 s = hv9.s();
                            for (od9 od9Var3 : this.v) {
                                s.c(Integer.valueOf(od9Var3.q + od9Var3.p));
                            }
                            vvf g3 = s.g();
                            pc9Var4.D = this;
                            pc9Var4.I = g3;
                            for (od9 od9Var4 : this.v) {
                                od9Var4.getClass();
                                od9Var4.E = pc9Var4.k;
                                if (pc9Var4.L) {
                                    od9Var4.I = true;
                                }
                            }
                        }
                        this.u = mu2Var;
                        x6kVar.y(mu2Var, this, this.i.n(mu2Var.c));
                        return true;
                    }
                }
                z = false;
                long j162 = max;
                pc9 pc9Var32 = pc9Var2;
                oc9Var.r.h(j11, j12, j3, list, b);
                int selectedIndexInTrackGroup2 = oc9Var.r.getSelectedIndexInTrackGroup();
                if (a == selectedIndexInTrackGroup2) {
                }
                c = kd9VarArr[selectedIndexInTrackGroup2].c();
                if (tp4Var.h(c)) {
                }
                z6 = yihVar.b;
                mu2 mu2Var2 = (mu2) yihVar.c;
                Uri uri2 = (Uri) yihVar.d;
                if (!z6) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.Q;
        }
        long j = this.P;
        pc9 p = p();
        if (!p.H) {
            ArrayList arrayList = this.n;
            p = arrayList.size() > 1 ? (pc9) mz1.h(arrayList, 2) : null;
        }
        if (p != null) {
            j = Math.max(j, p.h);
        }
        if (this.C) {
            for (od9 od9Var : this.v) {
                j = Math.max(j, od9Var.r());
            }
        }
        return j;
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        if (s()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return p().h;
    }

    public final void h() {
        z1a.E(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    public final boolean i(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 >= arrayList.size()) {
                pc9 pc9Var = (pc9) arrayList.get(i);
                for (int i3 = 0; i3 < this.v.length; i3++) {
                    if (this.v[i3].u() > pc9Var.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (((pc9) arrayList.get(i2)).L) {
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return this.j.l();
    }

    public final qsj k(osj[] osjVarArr) {
        for (int i = 0; i < osjVarArr.length; i++) {
            osj osjVar = osjVarArr[i];
            b[] bVarArr = new b[osjVar.a];
            for (int i2 = 0; i2 < osjVar.a; i2++) {
                b bVar = osjVar.d[i2];
                int e = this.g.e(bVar);
                qm8 a = bVar.a();
                a.O = e;
                bVarArr[i2] = new b(a);
            }
            osjVarArr[i] = new osj(osjVar.b, bVarArr);
        }
        return new qsj(osjVarArr);
    }

    @Override // defpackage.vfb
    public final void l(yfb yfbVar, long j, long j2, int i) {
        lfb lfbVar;
        mu2 mu2Var = (mu2) yfbVar;
        if (i == 0) {
            long j3 = mu2Var.a;
            lfbVar = new lfb(mu2Var.b, j);
        } else {
            long j4 = mu2Var.a;
            xe4 xe4Var = mu2Var.b;
            tei teiVar = mu2Var.i;
            lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        }
        this.k.y(lfbVar, mu2Var.c, this.b, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, i);
    }

    public final void o(int i) {
        ArrayList arrayList;
        z1a.E(!this.j.l());
        while (true) {
            arrayList = this.n;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (i(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = p().h;
        pc9 pc9Var = (pc9) arrayList.get(i);
        nik.Y(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.v.length; i2++) {
            this.v[i2].n(pc9Var.e(i2));
        }
        if (arrayList.isEmpty()) {
            this.Q = this.P;
        } else {
            ((pc9) jca.H(arrayList)).J = true;
        }
        this.T = false;
        this.k.F(this.A, pc9Var.g, j);
    }

    @Override // defpackage.agb
    public final void onLoaderReleased() {
        for (od9 od9Var : this.v) {
            od9Var.F(true);
            xb5 xb5Var = od9Var.h;
            if (xb5Var != null) {
                xb5Var.d(od9Var.e);
                od9Var.h = null;
                od9Var.g = null;
            }
        }
    }

    public final pc9 p() {
        return (pc9) mz1.h(this.n, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    @Override // defpackage.vfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r5a r(yfb yfbVar, long j, long j2, IOException iOException, int i) {
        boolean a;
        boolean z;
        int indexOf;
        r5a r5aVar;
        boolean b;
        int i2;
        mu2 mu2Var = (mu2) yfbVar;
        boolean z2 = mu2Var instanceof pc9;
        if (z2 && !((pc9) mu2Var).f() && (iOException instanceof si9) && ((i2 = ((si9) iOException).c) == 410 || i2 == 404)) {
            return x6k.e;
        }
        long j3 = mu2Var.i.b;
        xe4 xe4Var = mu2Var.b;
        tei teiVar = mu2Var.i;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, j3);
        nik.h0(mu2Var.g);
        nik.h0(mu2Var.h);
        yz1 yz1Var = new yz1(iOException, i, 7);
        boolean z3 = mu2Var instanceof pc9;
        oc9 oc9Var = this.d;
        jfb a2 = z3 ? oc9Var.a(((pc9) mu2Var).m) : new jfb(1, 0, oc9Var.r.length(), oc9Var.d(SystemClock.elapsedRealtime()));
        this.i.getClass();
        r5a j4 = it7.j(a2, yz1Var);
        if (j4 != null) {
            int i3 = j4.a;
            long j5 = j4.b;
            if (i3 != 1) {
                if (i3 != 2) {
                    a70.r(ljg.j(i3, "Invalid fallback selection type: "));
                    return null;
                }
                int a3 = oc9Var.h.a(mu2Var.d);
                if (a3 != -1 && (indexOf = oc9Var.r.indexOf(a3)) != -1) {
                    a = oc9Var.r.g(indexOf, j5);
                    z = a;
                }
            } else if (z3) {
                tp4 tp4Var = oc9Var.g;
                Uri uri = ((pc9) mu2Var).m;
                sp4 sp4Var = (sp4) tp4Var.d.get(uri);
                a = sp4Var != null ? sp4Var.a(uri, j5) : false;
                z = a;
            }
            if (z) {
                long o = it7.o(yz1Var);
                r5aVar = o != C.TIME_UNSET ? new r5a(o, 0, false) : x6k.g;
            } else {
                if (z2 && j3 == 0) {
                    ArrayList arrayList = this.n;
                    z1a.E(((pc9) arrayList.remove(arrayList.size() - 1)) == mu2Var);
                    if (arrayList.isEmpty()) {
                        this.Q = this.P;
                    } else {
                        ((pc9) jca.H(arrayList)).J = true;
                    }
                }
                r5aVar = x6k.f;
            }
            r5a r5aVar2 = r5aVar;
            b = r5aVar2.b();
            this.k.w(lfbVar, mu2Var.c, this.b, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
            if (!b) {
                this.u = null;
            }
            if (z) {
                if (!this.D) {
                    lgb lgbVar = new lgb();
                    lgbVar.a = this.P;
                    g(new mgb(lgbVar));
                    return r5aVar2;
                }
                this.c.b(this);
            }
            return r5aVar2;
        }
        z = false;
        if (z) {
        }
        r5a r5aVar22 = r5aVar;
        b = r5aVar22.b();
        this.k.w(lfbVar, mu2Var.c, this.b, mu2Var.d, mu2Var.e, mu2Var.f, mu2Var.g, mu2Var.h, iOException, !b);
        if (!b) {
        }
        if (z) {
        }
        return r5aVar22;
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        x6k x6kVar = this.j;
        if (x6kVar.c() || s()) {
            return;
        }
        boolean l = x6kVar.l();
        boolean z = false;
        int i = 0;
        z = false;
        oc9 oc9Var = this.d;
        List list = this.o;
        if (l) {
            this.u.getClass();
            if (oc9Var.n == null ? oc9Var.r.f(j, this.u, list) : false) {
                x6kVar.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && oc9Var.c((pc9) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            o(size);
        }
        int size2 = (oc9Var.n != null || oc9Var.r.length() < 2) ? list.size() : oc9Var.r.evaluateQueueSize(j, list);
        if (size2 < this.n.size()) {
            o(size2);
        }
        if (this.C && this.U != Long.MIN_VALUE) {
            boolean z2 = true;
            while (true) {
                od9[] od9VarArr = this.v;
                if (i >= od9VarArr.length) {
                    break;
                }
                if (this.N[i] && (this.O[i] || !this.M)) {
                    z2 &= od9VarArr[i].y();
                }
                i++;
            }
            z = z2;
        }
        if (z) {
            this.T = true;
        }
    }

    public final boolean s() {
        return this.Q != C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        int i;
        if (!this.H && this.K == null && this.C) {
            int i2 = 0;
            for (od9 od9Var : this.v) {
                if (od9Var.x() == null) {
                    return;
                }
            }
            qsj qsjVar = this.I;
            if (qsjVar != null) {
                int i3 = qsjVar.a;
                int[] iArr = new int[i3];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        od9[] od9VarArr = this.v;
                        if (i5 < od9VarArr.length) {
                            b x = od9VarArr[i5].x();
                            x.getClass();
                            b bVar = this.I.a(i4).d[0];
                            String str = x.o;
                            String str2 = bVar.o;
                            int i6 = sjc.i(str);
                            if (i6 == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) || x.L == bVar.L) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            } else if (i6 == sjc.i(str2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.K[i4] = i5;
                }
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((ld9) it.next()).a();
                }
                return;
            }
            int length = this.v.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                b x2 = this.v[i7].x();
                x2.getClass();
                String str3 = x2.o;
                if (sjc.o(str3)) {
                    i10 = 2;
                } else if (!sjc.k(str3)) {
                    i10 = sjc.n(str3) ? 3 : -2;
                }
                if (q(i10) > q(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            osj osjVar = this.d.h;
            int i11 = osjVar.a;
            this.L = -1;
            this.K = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.K[i12] = i12;
            }
            osj[] osjVarArr = new osj[length];
            int i13 = 0;
            while (i13 < length) {
                b x3 = this.v[i13].x();
                x3.getClass();
                b bVar2 = this.f;
                String str4 = this.a;
                if (i13 == i8) {
                    b[] bVarArr = new b[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        b bVar3 = osjVar.d[i14];
                        if (i9 == 1 && bVar2 != null) {
                            bVar3 = bVar3.d(bVar2);
                        }
                        bVarArr[i14] = i11 == 1 ? x3.d(bVar3) : n(bVar3, x3, true);
                    }
                    osjVarArr[i13] = new osj(str4, bVarArr);
                    this.L = i13;
                    i = 0;
                } else {
                    if (i9 != 2 || !sjc.k(x3.o)) {
                        bVar2 = null;
                    }
                    StringBuilder r = mz1.r(str4, ":muxed:");
                    r.append(i13 < i8 ? i13 : i13 - 1);
                    String sb = r.toString();
                    i = 0;
                    qm8 a = n(bVar2, x3, false).a();
                    a.l = str4;
                    osjVarArr[i13] = new osj(sb, new b(a));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.I = k(osjVarArr);
            z1a.E(this.J == null ? 1 : i15);
            this.J = Collections.EMPTY_SET;
            this.D = true;
            this.c.s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [od9[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [od9[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [vsj] */
    /* JADX WARN: Type inference failed for: r5v4, types: [hpg, od9] */
    /* JADX WARN: Type inference failed for: r5v6, types: [q35] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.pl6
    /* renamed from: track */
    public final vsj mo2track(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = Z;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            z1a.s(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                r5 = this.w[i3] == i ? this.v[i3] : j(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.v;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    r5 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (r5 == 0) {
            if (this.V) {
                return j(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new od9(this.e, this.g, this.h, this.t);
            r5.t = this.P;
            if (z) {
                r5.K = this.X;
                r5.B = true;
            }
            long j = this.W;
            if (r5.H != j) {
                r5.H = j;
                r5.B = true;
            }
            if (this.Y != null) {
                r5.E = r6.k;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.w, i5);
            this.w = copyOf;
            copyOf[length] = i;
            od9[] od9VarArr = this.v;
            String str = nik.a;
            ?? copyOf2 = Arrays.copyOf(od9VarArr, od9VarArr.length + 1);
            copyOf2[od9VarArr.length] = r5;
            this.v = (od9[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.O, i5);
            this.O = copyOf3;
            copyOf3[length] = z;
            this.M |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (q(i2) > q(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.N = Arrays.copyOf(this.N, i5);
        }
        if (i2 != 5) {
            return r5;
        }
        nd9 nd9Var = this.z;
        if (nd9Var != null) {
            return nd9Var;
        }
        nd9 nd9Var2 = new nd9(r5, this.l);
        this.z = nd9Var2;
        return nd9Var2;
    }

    public final void u() {
        this.j.maybeThrowError();
        oc9 oc9Var = this.d;
        xt1 xt1Var = oc9Var.n;
        if (xt1Var != null) {
            throw xt1Var;
        }
        Uri uri = oc9Var.o;
        if (uri == null || !uri.equals(oc9Var.p)) {
            return;
        }
        oc9Var.g.j(oc9Var.o);
    }

    public final void v(osj[] osjVarArr, int... iArr) {
        this.I = k(osjVarArr);
        this.J = new HashSet();
        for (int i : iArr) {
            this.J.add(this.I.a(i));
        }
        this.L = 0;
        this.r.post(new yp8(this.c, 2));
        this.D = true;
    }

    public final void w() {
        for (od9 od9Var : this.v) {
            od9Var.F(this.R);
        }
        this.R = false;
    }

    public final boolean x(long j, boolean z) {
        pc9 pc9Var;
        int i;
        boolean H;
        this.P = j;
        if (s()) {
            this.Q = j;
            return true;
        }
        boolean z2 = this.d.q;
        ArrayList arrayList = this.n;
        if (z2) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                pc9Var = (pc9) arrayList.get(i2);
                if (pc9Var.g == j) {
                    break;
                }
            }
        }
        pc9Var = null;
        if (this.C && !z && !arrayList.isEmpty()) {
            int length = this.v.length;
            for (0; i < length; i + 1) {
                od9 od9Var = this.v[i];
                if (pc9Var != null) {
                    H = od9Var.G(pc9Var.e(i));
                } else {
                    long nextLoadPositionUs = getNextLoadPositionUs();
                    H = od9Var.H(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
                }
                i = (H || (!this.O[i] && this.M)) ? i + 1 : 0;
            }
            return false;
        }
        this.Q = j;
        this.T = false;
        arrayList.clear();
        x6k x6kVar = this.j;
        if (!x6kVar.l()) {
            x6kVar.d = null;
            w();
            return true;
        }
        if (this.C) {
            for (od9 od9Var2 : this.v) {
                od9Var2.k();
            }
        }
        x6kVar.a();
        return true;
    }

    @Override // defpackage.pl6
    public final void m(b0h b0hVar) {
    }
}
