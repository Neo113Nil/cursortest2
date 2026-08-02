package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wcf {
    public final Uri a;
    public final sei b;
    public final l2a c;
    public final cdf d;
    public final r0a e;
    public volatile boolean g;
    public long i;
    public we4 j;
    public gpg k;
    public boolean l;
    public final /* synthetic */ cdf m;
    public final b78 f = new b78();
    public boolean h = true;

    public wcf(cdf cdfVar, Uri uri, qe4 qe4Var, l2a l2aVar, cdf cdfVar2, r0a r0aVar) {
        this.m = cdfVar;
        this.a = uri;
        this.b = new sei(qe4Var);
        this.c = l2aVar;
        this.d = cdfVar2;
        this.e = r0aVar;
        kfb.a.getAndIncrement();
        this.j = a(0L);
    }

    public final we4 a(long j) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = cdf.L;
        Uri uri = this.a;
        qx9.v(uri, "The uri must be set.");
        return new we4(uri, 1, null, map2, j, -1L, 6);
    }

    public final void b() {
        qe4 qe4Var;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.g) {
            try {
                long j = this.f.a;
                we4 a = a(j);
                this.j = a;
                long k = this.b.k(a);
                if (k != -1) {
                    k += j;
                    cdf cdfVar = this.m;
                    cdfVar.o.post(new rcf(cdfVar, 2));
                }
                long j2 = k;
                this.m.q = IcyHeaders.a(this.b.a.getResponseHeaders());
                sei seiVar = this.b;
                IcyHeaders icyHeaders = this.m.q;
                if (icyHeaders == null || (i = icyHeaders.f) == -1) {
                    qe4Var = seiVar;
                } else {
                    qe4Var = new oq9(seiVar, i, this);
                    gpg p = this.m.p(new adf(0, true));
                    this.k = p;
                    p.a(cdf.M);
                }
                this.c.x(qe4Var, this.a, this.b.a.getResponseHeaders(), j, j2, this.d);
                if (this.m.q != null) {
                    kl6 kl6Var = (kl6) this.c.c;
                    if (kl6Var instanceof vwc) {
                        ((vwc) kl6Var).p = true;
                    }
                }
                if (this.h) {
                    l2a l2aVar = this.c;
                    long j3 = this.i;
                    kl6 kl6Var2 = (kl6) l2aVar.c;
                    kl6Var2.getClass();
                    kl6Var2.seek(j, j3);
                    this.h = false;
                }
                while (i2 == 0 && !this.g) {
                    try {
                        r0a r0aVar = this.e;
                        synchronized (r0aVar) {
                            while (!r0aVar.b) {
                                r0aVar.wait();
                            }
                        }
                        l2a l2aVar2 = this.c;
                        b78 b78Var = this.f;
                        kl6 kl6Var3 = (kl6) l2aVar2.c;
                        kl6Var3.getClass();
                        ap4 ap4Var = (ap4) l2aVar2.d;
                        ap4Var.getClass();
                        i2 = kl6Var3.b(ap4Var, b78Var);
                        ap4 ap4Var2 = (ap4) this.c.d;
                        long j4 = ap4Var2 != null ? ap4Var2.d : -1L;
                        if (j4 > this.m.i + j) {
                            this.e.i();
                            cdf cdfVar2 = this.m;
                            cdfVar2.o.post(cdfVar2.n);
                            j = j4;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    ap4 ap4Var3 = (ap4) this.c.d;
                    if ((ap4Var3 != null ? ap4Var3.d : -1L) != -1) {
                        this.f.a = ap4Var3 != null ? ap4Var3.d : -1L;
                    }
                }
                sei seiVar2 = this.b;
                if (seiVar2 != null) {
                    try {
                        seiVar2.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th) {
                if (i2 != 1) {
                    ap4 ap4Var4 = (ap4) this.c.d;
                    if ((ap4Var4 != null ? ap4Var4.d : -1L) != -1) {
                        this.f.a = ap4Var4 != null ? ap4Var4.d : -1L;
                    }
                }
                sei seiVar3 = this.b;
                if (seiVar3 != null) {
                    try {
                        seiVar3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }
}
