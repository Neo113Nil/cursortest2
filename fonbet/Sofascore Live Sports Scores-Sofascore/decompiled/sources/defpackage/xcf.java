package defpackage;

import android.net.Uri;
import com.mbridge.msdk.foundation.download.Command;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xcf implements yfb {
    public final Uri a;
    public final tei b;
    public final hcc c;
    public final ddf d;
    public final yh3 e;
    public volatile boolean g;
    public long i;
    public xe4 j;
    public vsj k;
    public boolean l;
    public final /* synthetic */ ddf m;
    public final b78 f = new b78();
    public boolean h = true;

    public xcf(ddf ddfVar, Uri uri, re4 re4Var, hcc hccVar, ddf ddfVar2, yh3 yh3Var) {
        this.m = ddfVar;
        this.a = uri;
        this.b = new tei(re4Var);
        this.c = hccVar;
        this.d = ddfVar2;
        this.e = yh3Var;
        lfb.g.getAndIncrement();
        this.j = a(0L, null);
    }

    public final xe4 a(long j, String str) {
        Map map = ddf.S;
        if (str != null && !str.startsWith("W/")) {
            b10 d = lv9.d();
            d.B(map.entrySet());
            d.A("If-Range", str);
            map = d.c(false);
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.m.i;
        Uri uri = this.a;
        z1a.y(uri, "The uri must be set.");
        return new xe4(uri, 0L, 1, null, map, j, -1L, str2, 6);
    }

    @Override // defpackage.yfb
    public final void cancelLoad() {
        this.g = true;
    }

    @Override // defpackage.yfb
    public final void load() {
        re4 re4Var;
        ll6 ll6Var;
        int i;
        int i2 = 0;
        String str = null;
        while (i2 == 0 && !this.g) {
            try {
                long j = this.f.a;
                xe4 a = a(j, str);
                this.j = a;
                long b = this.b.b(a);
                if (this.g) {
                    if (i2 != 1 && this.c.Q() != -1) {
                        this.f.a = this.c.Q();
                    }
                    qx9.w(this.b);
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get(Command.HTTP_HEADER_ETAG);
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (b != -1) {
                    b += j;
                    ddf ddfVar = this.m;
                    ddfVar.r.post(new scf(ddfVar, 0));
                }
                long j2 = b;
                this.m.t = sq9.a(this.b.a.getResponseHeaders());
                tei teiVar = this.b;
                sq9 sq9Var = this.m.t;
                if (sq9Var == null || (i = sq9Var.f) == -1) {
                    re4Var = teiVar;
                } else {
                    re4Var = new pq9(teiVar, i, this);
                    vsj q = this.m.q(new bdf(0, true));
                    this.k = q;
                    q.d(ddf.T);
                }
                this.c.R(re4Var, this.a, this.b.a.getResponseHeaders(), j, j2, this.d);
                if (this.m.t != null && (ll6Var = (ll6) this.c.c) != null) {
                    ll6 c = ll6Var.c();
                    if (c instanceof wwc) {
                        ((wwc) c).s = true;
                    }
                }
                if (this.h) {
                    hcc hccVar = this.c;
                    long j3 = this.i;
                    ll6 ll6Var2 = (ll6) hccVar.c;
                    ll6Var2.getClass();
                    ll6Var2.seek(j, j3);
                    this.h = false;
                }
                while (i2 == 0 && !this.g) {
                    try {
                        yh3 yh3Var = this.e;
                        synchronized (yh3Var) {
                            while (!yh3Var.b) {
                                yh3Var.a.getClass();
                                yh3Var.wait();
                            }
                        }
                        hcc hccVar2 = this.c;
                        b78 b78Var = this.f;
                        ll6 ll6Var3 = (ll6) hccVar2.c;
                        ll6Var3.getClass();
                        bp4 bp4Var = (bp4) hccVar2.d;
                        bp4Var.getClass();
                        i2 = ll6Var3.b(bp4Var, b78Var);
                        long Q = this.c.Q();
                        if (Q > this.m.j + j) {
                            yh3 yh3Var2 = this.e;
                            synchronized (yh3Var2) {
                                yh3Var2.b = false;
                            }
                            ddf ddfVar2 = this.m;
                            ddfVar2.r.post(ddfVar2.q);
                            j = Q;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.c.Q() != -1) {
                    this.f.a = this.c.Q();
                }
                qx9.w(this.b);
            } catch (Throwable th) {
                if (i2 != 1 && this.c.Q() != -1) {
                    this.f.a = this.c.Q();
                }
                qx9.w(this.b);
                throw th;
            }
        }
    }
}
