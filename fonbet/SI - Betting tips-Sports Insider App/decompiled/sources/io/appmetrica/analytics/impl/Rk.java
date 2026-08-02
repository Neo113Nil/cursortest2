package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Rk {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f12821a;

    /* renamed from: b, reason: collision with root package name */
    public final Qk f12822b;

    /* renamed from: c, reason: collision with root package name */
    public final W4 f12823c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0164g f12824d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0164g f12825e;

    /* renamed from: f, reason: collision with root package name */
    public Dk f12826f;

    /* renamed from: g, reason: collision with root package name */
    public int f12827g = 0;

    public Rk(X4 x42, Qk qk, W4 w42, C0201ha c0201ha, C0644z2 c0644z2) {
        this.f12821a = x42;
        this.f12823c = w42;
        this.f12824d = c0201ha;
        this.f12825e = c0644z2;
        this.f12822b = qk;
    }

    public final synchronized long a() {
        Dk dk;
        dk = this.f12826f;
        return dk == null ? 10000000000L : dk.f12156d - 1;
    }

    public final void b(Dk dk, P5 p52) {
        if (dk.f12159g && dk.f12156d > 0) {
            W4 w42 = this.f12823c;
            P5 a7 = P5.a(p52, EnumC0047bb.EVENT_TYPE_ALIVE);
            Tk tk = new Tk();
            tk.f12936a = dk.f12156d;
            tk.f12939d = dk.f12155c.f12276a;
            long andIncrement = dk.f12158f.getAndIncrement();
            Uk uk = dk.f12154b;
            uk.a(Uk.f12987g, Long.valueOf(dk.f12158f.get()));
            uk.b();
            tk.f12937b = andIncrement;
            tk.f12938c = TimeUnit.MILLISECONDS.toSeconds(Math.max(dk.f12161i - dk.f12157e, dk.j));
            w42.f13080a.f13154n.a(a7, tk);
            if (dk.f12159g) {
                dk.f12159g = false;
                Uk uk2 = dk.f12154b;
                uk2.a(Uk.f12989i, Boolean.FALSE);
                uk2.b();
            }
        }
        PublicLogger publicLogger = this.f12821a.f13153m;
        int ordinal = dk.f12155c.f12276a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (dk) {
            Uk uk3 = dk.f12154b;
            uk3.getClass();
            uk3.f12992c = new C0150fb();
            uk3.b();
            dk.f12160h = null;
        }
    }

    public final synchronized void c(P5 p52) {
        try {
            if (this.f12827g == 0) {
                Dk b10 = this.f12824d.b();
                if (a(b10, p52)) {
                    this.f12826f = b10;
                    this.f12827g = 3;
                } else {
                    Dk b11 = this.f12825e.b();
                    if (a(b11, p52)) {
                        this.f12826f = b11;
                        this.f12827g = 2;
                    } else {
                        this.f12826f = null;
                        this.f12827g = 1;
                    }
                }
            }
            int a7 = K7.a(this.f12827g);
            if (a7 == 0) {
                this.f12826f = a(p52);
            } else if (a7 == 1) {
                b(this.f12826f, p52);
                this.f12826f = a(p52);
            } else if (a7 == 2) {
                if (a(this.f12826f, p52)) {
                    Dk dk = this.f12826f;
                    long j = p52.f12735i;
                    dk.f12161i = j;
                    Uk uk = dk.f12154b;
                    uk.a(Uk.f12984d, Long.valueOf(j));
                    uk.b();
                } else {
                    this.f12826f = a(p52);
                }
            }
        } finally {
        }
    }

    public final Dk a(P5 p52) {
        this.f12821a.f13153m.info("Start foreground session", new Object[0]);
        long j = p52.f12735i;
        AbstractC0164g abstractC0164g = this.f12824d;
        Ek ek = new Ek(j, p52.j);
        abstractC0164g.getClass();
        Dk a7 = abstractC0164g.a(ek);
        this.f12827g = 3;
        ((C0273k5) this.f12821a.f13156p).e();
        W4 w42 = this.f12823c;
        w42.f13080a.f13154n.a(P5.a(p52, C0353na.I.i()), a(a7, j));
        return a7;
    }

    public static Tk a(Dk dk, long j) {
        Tk tk = new Tk();
        tk.f12936a = dk.f12156d;
        long andIncrement = dk.f12158f.getAndIncrement();
        Uk uk = dk.f12154b;
        uk.a(Uk.f12987g, Long.valueOf(dk.f12158f.get()));
        uk.b();
        tk.f12937b = andIncrement;
        Uk uk2 = dk.f12154b;
        long j6 = j - dk.f12157e;
        dk.j = j6;
        uk2.a(Uk.f12985e, Long.valueOf(j6));
        tk.f12938c = TimeUnit.MILLISECONDS.toSeconds(dk.j);
        tk.f12939d = dk.f12155c.f12276a;
        return tk;
    }

    public final synchronized Dk b(P5 p52) {
        try {
            if (this.f12827g == 0) {
                Dk b10 = this.f12824d.b();
                if (a(b10, p52)) {
                    this.f12826f = b10;
                    this.f12827g = 3;
                } else {
                    Dk b11 = this.f12825e.b();
                    if (a(b11, p52)) {
                        this.f12826f = b11;
                        this.f12827g = 2;
                    } else {
                        this.f12826f = null;
                        this.f12827g = 1;
                    }
                }
            }
            if (this.f12827g != 1 && !a(this.f12826f, p52)) {
                this.f12827g = 1;
                this.f12826f = null;
            }
            int a7 = K7.a(this.f12827g);
            if (a7 == 1) {
                Dk dk = this.f12826f;
                long j = p52.f12735i;
                dk.f12161i = j;
                Uk uk = dk.f12154b;
                uk.a(Uk.f12984d, Long.valueOf(j));
                uk.b();
                return this.f12826f;
            }
            if (a7 != 2) {
                this.f12821a.f13153m.info("Start background session", new Object[0]);
                this.f12827g = 2;
                long j6 = p52.f12735i;
                AbstractC0164g abstractC0164g = this.f12825e;
                Ek ek = new Ek(j6, p52.j);
                abstractC0164g.getClass();
                Dk a10 = abstractC0164g.a(ek);
                if (this.f12821a.f13159t.c()) {
                    W4 w42 = this.f12823c;
                    w42.f13080a.f13154n.a(P5.a(p52, C0353na.I.i()), a(a10, p52.f12735i));
                } else {
                    int i5 = p52.f12730d;
                    EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
                    if (i5 == 6145) {
                        W4 w43 = this.f12823c;
                        w43.f13080a.f13154n.a(p52, a(a10, j6));
                        W4 w44 = this.f12823c;
                        w44.f13080a.f13154n.a(P5.a(p52, C0353na.I.i()), a(a10, j6));
                    }
                }
                this.f12826f = a10;
                return a10;
            }
            return this.f12826f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Dk dk, P5 p52) {
        boolean z5;
        boolean z7;
        boolean z10;
        if (dk == null) {
            return false;
        }
        long j = p52.f12735i;
        boolean z11 = dk.f12156d >= 0;
        if (dk.f12160h == null) {
            synchronized (dk) {
                if (dk.f12160h == null) {
                    try {
                        String asString = dk.f12153a.f13146e.a(dk.f12156d, dk.f12155c.f12276a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            dk.f12160h = new Sk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Sk sk = dk.f12160h;
        if (sk != null) {
            C0285kh c0285kh = (C0285kh) dk.f12153a.f13151k.a();
            List f6 = kotlin.collections.u.f(Boolean.valueOf(TextUtils.equals(c0285kh.getAnalyticsSdkVersionName(), sk.f12882a)), Boolean.valueOf(TextUtils.equals(c0285kh.getAnalyticsSdkBuildNumber(), sk.f12883b)), Boolean.valueOf(TextUtils.equals(c0285kh.getAppVersion(), sk.f12884c)), Boolean.valueOf(TextUtils.equals(c0285kh.getAppBuildNumber(), sk.f12885d)), Boolean.valueOf(TextUtils.equals(c0285kh.getOsVersion(), sk.f12886e)), Boolean.valueOf(sk.f12887f == c0285kh.getOsApiLevel()), Boolean.valueOf(sk.f12888g == c0285kh.f14137r));
            if (f6 == null || !f6.isEmpty()) {
                Iterator it = f6.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z5 = true;
            long elapsedRealtime = dk.f12162k.elapsedRealtime();
            long j6 = dk.f12161i;
            z7 = elapsedRealtime >= j6;
            long j10 = j - j6;
            long j11 = j - dk.f12157e;
            if (!z7) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Gk gk = dk.f12155c;
                int i5 = ((C0285kh) dk.f12153a.f13151k.a()).f14127f;
                Integer num = gk.f12279d;
                if (num != null) {
                    i5 = num.intValue();
                }
                if (j10 < timeUnit.toMillis(i5) && j11 < timeUnit.toMillis(Hk.f12326a)) {
                    z10 = false;
                    if (!z11 && z5 && !z10) {
                        return true;
                    }
                    b(dk, p52);
                    return false;
                }
            }
            z10 = true;
            if (!z11) {
            }
            b(dk, p52);
            return false;
        }
        z5 = false;
        long elapsedRealtime2 = dk.f12162k.elapsedRealtime();
        long j62 = dk.f12161i;
        if (elapsedRealtime2 >= j62) {
        }
        long j102 = j - j62;
        long j112 = j - dk.f12157e;
        if (!z7) {
        }
        z10 = true;
        if (!z11) {
        }
        b(dk, p52);
        return false;
    }
}
