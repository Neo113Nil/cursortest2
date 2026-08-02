package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wk extends fg3 {
    public static final scc A = new scc(new Object());
    public final rvb k;
    public final q5c l;
    public final qcc m;
    public final hr9 n;
    public final bh o;
    public final xe4 p;
    public final Object q;
    public final Handler r;
    public final iij s;
    public final boolean t;
    public final ArrayList u;
    public vk v;
    public mij w;
    public kg x;
    public uk[][] y;
    public Handler z;

    public wk(vcc vccVar, xe4 xe4Var, Object obj, qcc qccVar, hr9 hr9Var, bh bhVar) {
        this.k = new rvb(vccVar, true);
        v5c v5cVar = vccVar.a().b;
        v5cVar.getClass();
        this.l = v5cVar.c;
        this.m = qccVar;
        this.n = hr9Var;
        this.o = bhVar;
        this.p = xe4Var;
        this.q = obj;
        this.t = true;
        this.r = new Handler(Looper.getMainLooper());
        this.s = new iij();
        this.y = new uk[0][];
        this.u = new ArrayList();
        int[] supportedTypes = qccVar.getSupportedTypes();
        hr9Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i : supportedTypes) {
            if (i == 0) {
                arrayList.add(MimeTypes.APPLICATION_MPD);
            } else if (i == 2) {
                arrayList.add(MimeTypes.APPLICATION_M3U8);
            } else if (i == 4) {
                arrayList.addAll(Arrays.asList(MimeTypes.VIDEO_MP4, "video/webm", MimeTypes.VIDEO_H263, MimeTypes.AUDIO_MP4, MimeTypes.AUDIO_MPEG));
            }
        }
        hr9Var.k = Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.vcc
    public final h6c a() {
        return this.k.a();
    }

    @Override // defpackage.vcc
    public final void b(h6c h6cVar) {
        this.k.b(h6cVar);
    }

    @Override // defpackage.vcc
    public final w6c c(scc sccVar, l2a l2aVar, long j) {
        kg kgVar = this.x;
        kgVar.getClass();
        if (kgVar.b > 0) {
            boolean b = sccVar.b();
            int i = sccVar.b;
            if (b) {
                int i2 = sccVar.c;
                uk[][] ukVarArr = this.y;
                uk[] ukVarArr2 = ukVarArr[i];
                if (ukVarArr2.length <= i2) {
                    ukVarArr[i] = (uk[]) Arrays.copyOf(ukVarArr2, i2 + 1);
                }
                uk ukVar = this.y[i][i2];
                if (ukVar == null) {
                    ukVar = new uk(this, sccVar, Long.MIN_VALUE);
                    this.y[i][i2] = ukVar;
                    this.u.add(ukVar);
                    x();
                }
                lvb lvbVar = new lvb(sccVar, l2aVar, j);
                ukVar.b.add(lvbVar);
                vcc vccVar = ukVar.d;
                if (vccVar != null) {
                    lvbVar.i(vccVar);
                    wk wkVar = ukVar.f;
                    h6c h6cVar = ukVar.c;
                    h6cVar.getClass();
                    lvbVar.g = new f4a(8, wkVar, h6cVar);
                }
                mij mijVar = ukVar.e;
                if (mijVar != null) {
                    lvbVar.e(new scc(mijVar.l(0), sccVar.d));
                }
                return lvbVar;
            }
        }
        lvb lvbVar2 = new lvb(sccVar, l2aVar, j);
        lvbVar2.i(this.k);
        lvbVar2.e(sccVar);
        return lvbVar2;
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
        boolean z = w6cVar instanceof ny2;
        lvb lvbVar = (lvb) (z ? ((ny2) w6cVar).a : w6cVar);
        scc sccVar = lvbVar.a;
        boolean b = sccVar.b();
        int i = sccVar.c;
        int i2 = sccVar.b;
        if (!b) {
            lvbVar.h();
            return;
        }
        uk ukVar = this.y[i2][i];
        ukVar.getClass();
        ArrayList arrayList = ukVar.b;
        arrayList.remove(w6cVar);
        if (z) {
            w6cVar = ((ny2) w6cVar).a;
        }
        ((lvb) w6cVar).h();
        if (arrayList.isEmpty()) {
            if (ukVar.d != null) {
                dg3 dg3Var = (dg3) ukVar.f.h.remove(ukVar.a);
                dg3Var.getClass();
                b51 b51Var = (b51) dg3Var.a;
                b51Var.o(dg3Var.b);
                bg3 bg3Var = dg3Var.c;
                b51Var.r(bg3Var);
                b51Var.q(bg3Var);
            }
            this.y[i2][i] = null;
            this.u.remove(ukVar);
        }
    }

    @Override // defpackage.b51
    public final void m(tn4 tn4Var) {
        this.j = tn4Var;
        this.i = nik.q(null);
        Handler q = nik.q(null);
        this.z = q;
        vk vkVar = new vk(this, q);
        this.v = vkVar;
        rvb rvbVar = this.k;
        this.w = rvbVar.o;
        w(A, rvbVar);
        this.r.post(new sk(this, vkVar, 1));
    }

    @Override // defpackage.fg3, defpackage.b51
    public final void p() {
        super.p();
        vk vkVar = this.v;
        vkVar.getClass();
        this.v = null;
        this.z = null;
        vkVar.b = true;
        vkVar.a.removeCallbacksAndMessages(null);
        this.w = null;
        this.x = null;
        this.y = new uk[0][];
        this.r.post(new sk(this, vkVar, 0));
    }

    @Override // defpackage.fg3
    public final scc s(Object obj, scc sccVar) {
        scc sccVar2 = (scc) obj;
        return sccVar2.b() ? sccVar2 : sccVar;
    }

    @Override // defpackage.fg3
    public final void v(Object obj, b51 b51Var, mij mijVar) {
        scc sccVar = (scc) obj;
        if (!sccVar.b()) {
            z1a.s(mijVar.h() == 1);
            this.w = mijVar;
            this.r.post(new tk(this, mijVar));
            if (this.t) {
                y();
                return;
            }
            return;
        }
        uk ukVar = this.y[sccVar.b][sccVar.c];
        ukVar.getClass();
        ArrayList arrayList = ukVar.b;
        z1a.s(mijVar.h() == 1);
        if (ukVar.e == null) {
            Object l = mijVar.l(0);
            for (int i = 0; i < arrayList.size(); i++) {
                w6c w6cVar = (w6c) arrayList.get(i);
                if (w6cVar instanceof ny2) {
                    w6cVar = ((ny2) w6cVar).a;
                }
                lvb lvbVar = (lvb) w6cVar;
                lvbVar.e(new scc(l, lvbVar.a.d));
            }
        }
        ukVar.e = mijVar;
        y();
    }

    public final void x() {
        h6c h6cVar;
        kg kgVar = this.x;
        if (kgVar == null) {
            return;
        }
        for (int i = 0; i < this.y.length; i++) {
            int i2 = 0;
            while (true) {
                uk[] ukVarArr = this.y[i];
                if (i2 < ukVarArr.length) {
                    uk ukVar = ukVarArr[i2];
                    hg b = kgVar.b(i);
                    if (ukVar != null) {
                        ArrayList arrayList = ukVar.b;
                        if (ukVar.d == null) {
                            h6c[] h6cVarArr = b.e;
                            if (i2 < h6cVarArr.length && (h6cVar = h6cVarArr[i2]) != null) {
                                q5c q5cVar = this.l;
                                if (q5cVar != null) {
                                    h5c a = h6cVar.a();
                                    a.e = q5cVar.a();
                                    h6cVar = a.a();
                                }
                                vcc a2 = this.m.a(h6cVar);
                                wk wkVar = ukVar.f;
                                ukVar.d = a2;
                                ukVar.c = h6cVar;
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    w6c w6cVar = (w6c) arrayList.get(i3);
                                    if (w6cVar instanceof ny2) {
                                        w6cVar = ((ny2) w6cVar).a;
                                    }
                                    lvb lvbVar = (lvb) w6cVar;
                                    lvbVar.i(a2);
                                    lvbVar.g = new f4a(8, wkVar, h6cVar);
                                }
                                wkVar.w(ukVar.a, a2);
                            }
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public final void y() {
        uk ukVar;
        mij mijVar = this.w;
        kg kgVar = this.x;
        if (kgVar == null) {
            return;
        }
        int i = kgVar.b;
        if (mijVar == null) {
            return;
        }
        if (i == 0) {
            n(mijVar);
            return;
        }
        kgVar.a();
        int length = this.y.length;
        long[][] jArr = new long[length][];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            uk[][] ukVarArr = this.y;
            if (i3 >= ukVarArr.length) {
                break;
            }
            int length2 = ukVarArr[i3].length;
            jArr[i3] = new long[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                if (kgVar.b(i3).g.length > i4) {
                    long j = kgVar.b(i3).g[i4];
                }
                uk[] ukVarArr2 = this.y[i3];
                int length3 = ukVarArr2.length;
                long j2 = C.TIME_UNSET;
                if (length3 <= i4 || (ukVar = ukVarArr2[i4]) == null) {
                    jArr[i3][i4] = -9223372036854775807L;
                } else {
                    long[] jArr2 = jArr[i3];
                    mij mijVar2 = ukVar.e;
                    if (mijVar2 != null) {
                        j2 = mijVar2.f(0, ukVar.f.s, false).d;
                    }
                    jArr2[i4] = j2;
                }
            }
            i3++;
        }
        z1a.s(length == i);
        hg[] hgVarArr = kgVar.f;
        hg[] hgVarArr2 = (hg[]) nik.V(hgVarArr, hgVarArr.length);
        while (true) {
            int i5 = kgVar.e;
            if (i2 >= i - i5) {
                this.x = new kg(kgVar.a, hgVarArr2, kgVar.c, kgVar.d, i5);
                n(new qye(mijVar, this.x));
                return;
            }
            hg hgVar = hgVarArr2[i2];
            long[] jArr3 = jArr[i5 + i2];
            hgVar.getClass();
            int length4 = jArr3.length;
            h6c[] h6cVarArr = hgVar.e;
            if (length4 < h6cVarArr.length) {
                jArr3 = hg.a(jArr3, h6cVarArr.length);
            } else if (hgVar.b != -1 && jArr3.length > h6cVarArr.length) {
                jArr3 = Arrays.copyOf(jArr3, h6cVarArr.length);
            }
            hgVarArr2[i2] = new hg(hgVar.a, hgVar.b, hgVar.c, hgVar.f, hgVar.e, jArr3, hgVar.h, hgVar.i);
            i2++;
        }
    }
}
