package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.b;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tp4 implements vfb {
    public static final cp4 t = new cp4(2);
    public final dad a;
    public final hd9 b;
    public final it7 c;
    public b10 f;
    public x6k g;
    public Handler h;
    public ad9 i;
    public dd9 j;
    public s9e k;
    public hv9 l;
    public hv9 m;
    public hv9 n;
    public hv9 o;
    public Uri p;
    public zc9 q;
    public boolean r;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long s = C.TIME_UNSET;

    public tp4(dad dadVar, it7 it7Var, hd9 hd9Var) {
        this.a = dadVar;
        this.b = hd9Var;
        this.c = it7Var;
    }

    public final void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            kd9 kd9Var = (kd9) list.get(i);
            sp4 sp4Var = new sp4(this, kd9Var);
            cck it = vv9.t(kd9Var.b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), sp4Var);
            }
        }
    }

    @Override // defpackage.vfb
    public final void b(yfb yfbVar, long j, long j2, boolean z) {
        x9e x9eVar = (x9e) yfbVar;
        long j3 = x9eVar.a;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        this.c.getClass();
        this.f.u(lfbVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public final zc9 c(boolean z, Uri uri) {
        HashMap hashMap = this.d;
        sp4 sp4Var = (sp4) hashMap.get(uri);
        if (sp4Var == null) {
            return null;
        }
        zc9 b = sp4Var.b(uri);
        if (b != null && z) {
            i(uri);
            sp4 sp4Var2 = (sp4) hashMap.get(uri);
            sp4Var2.getClass();
            HashMap hashMap2 = sp4Var2.b;
            rp4 rp4Var = (rp4) wv8.g(hashMap2, uri, uri);
            rp4Var.getClass();
            if (!rp4Var.l) {
                rp4 rp4Var2 = (rp4) wv8.g(hashMap2, uri, uri);
                rp4Var2.getClass();
                rp4Var2.l = true;
                zc9 b2 = sp4Var2.b(uri);
                if (b2 != null && !b2.o) {
                    sp4Var2.d(true, uri);
                }
            }
        }
        return b;
    }

    @Override // defpackage.vfb
    public final void d(yfb yfbVar, long j, long j2) {
        dd9 dd9Var;
        x9e x9eVar = (x9e) yfbVar;
        ed9 ed9Var = (ed9) x9eVar.f;
        boolean z = ed9Var instanceof zc9;
        if (z) {
            String str = ed9Var.a;
            dd9 dd9Var2 = dd9.n;
            Uri parse = Uri.parse(str);
            qm8 qm8Var = new qm8();
            qm8Var.a = "0";
            qm8Var.m = sjc.p(MimeTypes.APPLICATION_M3U8);
            List singletonList = Collections.singletonList(new cd9(parse, new b(qm8Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            dd9Var = new dd9("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            dd9Var = (dd9) ed9Var;
        }
        this.j = dd9Var;
        try {
            this.l = kd9.b(dd9Var.e);
            this.m = kd9.a(dd9Var.f);
            this.n = kd9.a(dd9Var.g);
            this.o = kd9.a(dd9Var.h);
            this.p = ((kd9) this.l.get(0)).c();
            this.e.add(new qp4(this));
            a(this.l);
            a(this.m);
            a(this.n);
            a(this.o);
            xe4 xe4Var = x9eVar.b;
            tei teiVar = x9eVar.d;
            lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
            sp4 sp4Var = (sp4) this.d.get(this.p);
            sp4Var.getClass();
            if (z) {
                Uri uri = x9eVar.d.c;
                rp4 rp4Var = (rp4) wv8.g(sp4Var.b, uri, uri);
                rp4Var.getClass();
                rp4Var.f((zc9) ed9Var, lfbVar);
            } else {
                sp4Var.d(false, this.p);
            }
            this.c.getClass();
            this.f.v(lfbVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        } catch (s9e e) {
            this.k = e;
        }
    }

    public final hv9 e(int i) {
        if (i == 0) {
            return this.l;
        }
        if (i == 1) {
            return this.m;
        }
        if (i == 2) {
            return this.n;
        }
        if (i != 3) {
            return null;
        }
        return this.o;
    }

    public final Uri f(Uri uri) {
        vc9 vc9Var;
        zc9 zc9Var = this.q;
        if (zc9Var == null || !zc9Var.v.e || (vc9Var = (vc9) ((awf) zc9Var.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(vc9Var.b));
        int i = vc9Var.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final boolean g(kd9 kd9Var, long j) {
        sp4 sp4Var = (sp4) this.d.get(kd9Var.c());
        if (sp4Var == null) {
            return false;
        }
        Iterator it = sp4Var.b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((rp4) it.next()).i;
        }
        return z;
    }

    public final boolean h(Uri uri) {
        int i;
        sp4 sp4Var = (sp4) this.d.get(uri);
        if (sp4Var == null) {
            return false;
        }
        rp4 rp4Var = (rp4) wv8.g(sp4Var.b, uri, uri);
        rp4Var.getClass();
        if (rp4Var.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, nik.h0(rp4Var.e.u));
        zc9 zc9Var = rp4Var.e;
        return zc9Var.o || (i = zc9Var.d) == 2 || i == 1 || rp4Var.f + max > elapsedRealtime;
    }

    public final void i(Uri uri) {
        if (uri.equals(this.p)) {
            return;
        }
        List list = this.j.e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((cd9) list.get(i)).a)) {
                zc9 zc9Var = this.q;
                if (zc9Var == null || !zc9Var.o) {
                    this.p = uri;
                    sp4 sp4Var = (sp4) this.d.get(uri);
                    sp4Var.getClass();
                    zc9 b = sp4Var.b(uri);
                    if (b != null && b.o) {
                        this.q = b;
                        this.i.t(b);
                        return;
                    } else {
                        Uri f = f(uri);
                        rp4 rp4Var = (rp4) wv8.g(sp4Var.b, uri, uri);
                        rp4Var.getClass();
                        rp4Var.e(f);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void j(Uri uri) {
        sp4 sp4Var = (sp4) this.d.get(uri);
        if (sp4Var != null) {
            rp4 rp4Var = (rp4) wv8.g(sp4Var.b, uri, uri);
            rp4Var.getClass();
            rp4Var.c.maybeThrowError();
            IOException iOException = rp4Var.k;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.vfb
    public final void l(yfb yfbVar, long j, long j2, int i) {
        lfb lfbVar;
        x9e x9eVar = (x9e) yfbVar;
        if (i == 0) {
            long j3 = x9eVar.a;
            lfbVar = new lfb(x9eVar.b, j);
        } else {
            long j4 = x9eVar.a;
            xe4 xe4Var = x9eVar.b;
            tei teiVar = x9eVar.d;
            lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        }
        this.f.y(lfbVar, x9eVar.c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i);
    }

    @Override // defpackage.vfb
    public final r5a r(yfb yfbVar, long j, long j2, IOException iOException, int i) {
        long min;
        x9e x9eVar = (x9e) yfbVar;
        long j3 = x9eVar.a;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        int i2 = x9eVar.c;
        this.c.getClass();
        Throwable th = iOException;
        while (true) {
            if (th == null) {
                min = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((th instanceof s9e) || (th instanceof FileNotFoundException) || (th instanceof mi9) || (th instanceof cgb) || ((th instanceof te4) && ((te4) th).a == 2008)) {
                break;
            }
            th = th.getCause();
        }
        min = -9223372036854775807L;
        boolean z = min == C.TIME_UNSET;
        this.f.x(lfbVar, i2, iOException, z);
        return z ? x6k.g : new r5a(min, 0, false);
    }
}
