package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class so4 implements kc5 {
    public final UUID b;
    public final hg6 c;
    public final l2a d;
    public final HashMap e;
    public final int[] f;
    public final boolean g;
    public final z41 h;
    public final it7 i;
    public final sz8 j;
    public final long k;
    public final ArrayList l;
    public final Set m;
    public final Set n;
    public int o;
    public rf6 p;
    public oo4 q;
    public oo4 r;
    public Looper s;
    public Handler t;
    public byte[] u;
    public cse v;
    public volatile gl0 w;

    public so4(UUID uuid, l2a l2aVar, HashMap hashMap, int[] iArr, boolean z, it7 it7Var) {
        uuid.getClass();
        z1a.r("Use C.CLEARKEY_UUID instead", !yc2.b.equals(uuid));
        this.b = uuid;
        this.c = pr8.d;
        this.d = l2aVar;
        this.e = hashMap;
        this.f = iArr;
        this.g = z;
        this.i = it7Var;
        this.h = new z41(28);
        this.j = new sz8(this, 20);
        this.l = new ArrayList();
        this.m = Collections.newSetFromMap(new IdentityHashMap());
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.k = 300000L;
    }

    public static boolean g(oo4 oo4Var) {
        oo4Var.m();
        if (oo4Var.p != 1) {
            return false;
        }
        wb5 error = oo4Var.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || tgj.R(cause);
    }

    public static ArrayList j(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.d);
        for (int i = 0; i < drmInitData.d; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.a[i];
            if ((schemeData.a(uuid) || (yc2.c.equals(uuid) && schemeData.a(yc2.b))) && (schemeData.e != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kc5
    public final void a() {
        rf6 td5Var;
        l(true);
        int i = this.o;
        this.o = i + 1;
        if (i != 0) {
            return;
        }
        if (this.p == null) {
            UUID uuid = this.b;
            this.c.getClass();
            try {
                try {
                    td5Var = new pr8(uuid);
                } catch (cdk unused) {
                    tgj.z("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    td5Var = new td5();
                }
                this.p = td5Var;
                td5Var.a(new de0(this, 14));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new cdk(e);
            } catch (Exception e2) {
                throw new cdk(e2);
            }
        }
        if (this.k == C.TIME_UNSET) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((oo4) arrayList.get(i2)).e(null);
            i2++;
        }
    }

    @Override // defpackage.kc5
    public final ic5 b(cc5 cc5Var, b bVar) {
        z1a.E(this.o > 0);
        this.s.getClass();
        ro4 ro4Var = new ro4(this, cc5Var);
        Handler handler = this.t;
        handler.getClass();
        handler.post(new mc3(19, ro4Var, bVar));
        return ro4Var;
    }

    @Override // defpackage.kc5
    public final void c(Looper looper, cse cseVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.s;
                if (looper2 == null) {
                    this.s = looper;
                    this.t = new Handler(looper);
                } else {
                    z1a.E(looper2 == looper);
                    this.t.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v = cseVar;
    }

    @Override // defpackage.kc5
    public final xb5 d(cc5 cc5Var, b bVar) {
        l(false);
        z1a.E(this.o > 0);
        this.s.getClass();
        return f(this.s, cc5Var, bVar, true);
    }

    @Override // defpackage.kc5
    public final int e(b bVar) {
        l(false);
        rf6 rf6Var = this.p;
        rf6Var.getClass();
        int b = rf6Var.b();
        DrmInitData drmInitData = bVar.s;
        if (drmInitData == null) {
            int i = sjc.i(bVar.o);
            int i2 = 0;
            while (true) {
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return 0;
            }
        } else if (this.u == null) {
            UUID uuid = this.b;
            if (j(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.d == 1 && drmInitData.a[0].a(yc2.b)) {
                    tgj.d0("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = drmInitData.c;
            if (str != null && !C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbcs.equals(str) && (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str))) {
                return 1;
            }
        }
        return b;
    }

    public final xb5 f(Looper looper, cc5 cc5Var, b bVar, boolean z) {
        if (this.w == null) {
            this.w = new gl0(this, looper, 3);
        }
        DrmInitData drmInitData = bVar.s;
        int i = 0;
        ArrayList arrayList = null;
        if (drmInitData != null) {
            if (this.u == null) {
                arrayList = j(drmInitData, this.b, false);
                if (arrayList.isEmpty()) {
                    qo4 qo4Var = new qo4("Media does not support uuid: " + this.b);
                    tgj.A("DRM error", qo4Var);
                    if (cc5Var != null) {
                        cc5Var.d(qo4Var);
                    }
                    return new hq5(new wb5(AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE, qo4Var));
                }
            }
            oo4 oo4Var = this.r;
            if (oo4Var != null) {
                oo4Var.e(cc5Var);
                return oo4Var;
            }
            oo4 i2 = i(arrayList, false, cc5Var, z);
            this.r = i2;
            this.l.add(i2);
            return i2;
        }
        int i3 = sjc.i(bVar.o);
        rf6 rf6Var = this.p;
        rf6Var.getClass();
        if (rf6Var.b() != 2 || !nr8.c) {
            int[] iArr = this.f;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == i3) {
                    break;
                }
                i++;
            }
            if (i != -1 && rf6Var.b() != 1) {
                oo4 oo4Var2 = this.q;
                if (oo4Var2 == null) {
                    av9 av9Var = hv9.b;
                    oo4 i4 = i(vvf.e, true, null, z);
                    this.l.add(i4);
                    this.q = i4;
                } else {
                    oo4Var2.e(null);
                }
                return this.q;
            }
        }
        return null;
    }

    public final oo4 h(List list, boolean z, cc5 cc5Var) {
        this.p.getClass();
        boolean z2 = this.g | z;
        rf6 rf6Var = this.p;
        byte[] bArr = this.u;
        Looper looper = this.s;
        looper.getClass();
        cse cseVar = this.v;
        cseVar.getClass();
        oo4 oo4Var = new oo4(this.b, rf6Var, this.h, this.j, list, z2, z, bArr, this.e, this.d, looper, this.i, cseVar);
        oo4Var.e(cc5Var);
        if (this.k != C.TIME_UNSET) {
            oo4Var.e(null);
        }
        return oo4Var;
    }

    public final oo4 i(List list, boolean z, cc5 cc5Var, boolean z2) {
        oo4 h = h(list, z, cc5Var);
        boolean g = g(h);
        long j = this.k;
        Set set = this.n;
        if (g && !set.isEmpty()) {
            cck it = vv9.t(set).iterator();
            while (it.hasNext()) {
                ((xb5) it.next()).d(null);
            }
            h.d(cc5Var);
            if (j != C.TIME_UNSET) {
                h.d(null);
            }
            h = h(list, z, cc5Var);
        }
        if (g(h) && z2) {
            Set set2 = this.m;
            if (!set2.isEmpty()) {
                cck it2 = vv9.t(set2).iterator();
                while (it2.hasNext()) {
                    ((ro4) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    cck it3 = vv9.t(set).iterator();
                    while (it3.hasNext()) {
                        ((xb5) it3.next()).d(null);
                    }
                }
                h.d(cc5Var);
                if (j != C.TIME_UNSET) {
                    h.d(null);
                }
                return h(list, z, cc5Var);
            }
        }
        return h;
    }

    public final void k() {
        if (this.p != null && this.o == 0 && this.l.isEmpty() && this.m.isEmpty()) {
            rf6 rf6Var = this.p;
            rf6Var.getClass();
            rf6Var.release();
            this.p = null;
        }
    }

    public final void l(boolean z) {
        if (z && this.s == null) {
            tgj.e0("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.s;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            tgj.e0("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.kc5
    public final void release() {
        l(true);
        int i = this.o - 1;
        this.o = i;
        if (i != 0) {
            return;
        }
        if (this.k != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((oo4) arrayList.get(i2)).d(null);
            }
        }
        cck it = vv9.t(this.m).iterator();
        while (it.hasNext()) {
            ((ro4) it.next()).release();
        }
        k();
    }
}
