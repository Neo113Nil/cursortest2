package io.sentry;

import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l6 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f16610a;

    /* renamed from: b, reason: collision with root package name */
    public Date f16611b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f16612c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16613d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16614e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f16615f;

    /* renamed from: g, reason: collision with root package name */
    public k6 f16616g;

    /* renamed from: h, reason: collision with root package name */
    public Long f16617h;

    /* renamed from: i, reason: collision with root package name */
    public Double f16618i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public String f16619k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16620l;

    /* renamed from: m, reason: collision with root package name */
    public final String f16621m;

    /* renamed from: n, reason: collision with root package name */
    public String f16622n;

    /* renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f16623o = new io.sentry.util.a();

    /* renamed from: p, reason: collision with root package name */
    public ConcurrentHashMap f16624p;

    public l6(k6 k6Var, Date date, Date date2, int i5, String str, String str2, Boolean bool, Long l6, Double d10, String str3, String str4, String str5, String str6, String str7) {
        this.f16616g = k6Var;
        this.f16610a = date;
        this.f16611b = date2;
        this.f16612c = new AtomicInteger(i5);
        this.f16613d = str;
        this.f16614e = str2;
        this.f16615f = bool;
        this.f16617h = l6;
        this.f16618i = d10;
        this.j = str3;
        this.f16619k = str4;
        this.f16620l = str5;
        this.f16621m = str6;
        this.f16622n = str7;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l6 clone() {
        return new l6(this.f16616g, this.f16610a, this.f16611b, this.f16612c.get(), this.f16613d, this.f16614e, this.f16615f, this.f16617h, this.f16618i, this.j, this.f16619k, this.f16620l, this.f16621m, this.f16622n);
    }

    public final void b(Date date) {
        r a7 = this.f16623o.a();
        try {
            this.f16615f = null;
            if (this.f16616g == k6.Ok) {
                this.f16616g = k6.Exited;
            }
            if (date != null) {
                this.f16611b = date;
            } else {
                this.f16611b = com.google.android.play.core.appupdate.b.n();
            }
            if (this.f16611b != null) {
                this.f16618i = Double.valueOf(Math.abs(r6.getTime() - this.f16610a.getTime()) / 1000.0d);
                long time = this.f16611b.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f16617h = Long.valueOf(time);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Date c() {
        Date date = this.f16610a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public final boolean d(k6 k6Var, String str, boolean z5, String str2) {
        boolean z7;
        r a7 = this.f16623o.a();
        boolean z10 = true;
        if (k6Var != null) {
            try {
                this.f16616g = k6Var;
                z7 = true;
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            z7 = false;
        }
        if (str != null) {
            this.f16619k = str;
            z7 = true;
        }
        if (z5) {
            this.f16612c.addAndGet(1);
            z7 = true;
        }
        if (str2 != null) {
            this.f16622n = str2;
        } else {
            z10 = z7;
        }
        if (z10) {
            this.f16615f = null;
            Date n9 = com.google.android.play.core.appupdate.b.n();
            this.f16611b = n9;
            if (n9 != null) {
                long time = n9.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f16617h = Long.valueOf(time);
            }
        }
        a7.close();
        return z10;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        String str = this.f16614e;
        if (str != null) {
            aVar.u("sid");
            aVar.K(str);
        }
        String str2 = this.f16613d;
        if (str2 != null) {
            aVar.u("did");
            aVar.K(str2);
        }
        if (this.f16615f != null) {
            aVar.u("init");
            aVar.I(this.f16615f);
        }
        aVar.u("started");
        aVar.H(iLogger, this.f16610a);
        aVar.u(PredictionTable.statusColumn);
        aVar.H(iLogger, this.f16616g.name().toLowerCase(Locale.ROOT));
        if (this.f16617h != null) {
            aVar.u("seq");
            aVar.J(this.f16617h);
        }
        aVar.u("errors");
        aVar.G(this.f16612c.intValue());
        if (this.f16618i != null) {
            aVar.u("duration");
            aVar.J(this.f16618i);
        }
        if (this.f16611b != null) {
            aVar.u("timestamp");
            aVar.H(iLogger, this.f16611b);
        }
        if (this.f16622n != null) {
            aVar.u("abnormal_mechanism");
            aVar.H(iLogger, this.f16622n);
        }
        aVar.u("attrs");
        aVar.j();
        aVar.u("release");
        aVar.H(iLogger, this.f16621m);
        String str3 = this.f16620l;
        if (str3 != null) {
            aVar.u("environment");
            aVar.H(iLogger, str3);
        }
        String str4 = this.j;
        if (str4 != null) {
            aVar.u("ip_address");
            aVar.H(iLogger, str4);
        }
        if (this.f16619k != null) {
            aVar.u("user_agent");
            aVar.H(iLogger, this.f16619k);
        }
        aVar.o();
        ConcurrentHashMap concurrentHashMap = this.f16624p;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16624p, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
