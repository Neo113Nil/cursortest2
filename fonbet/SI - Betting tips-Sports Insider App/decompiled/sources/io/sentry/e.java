package io.sentry;

import com.sports.insider.data.repository.room.live.LiveTable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Date;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements c2, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Long f16330a;

    /* renamed from: b, reason: collision with root package name */
    public Date f16331b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f16332c;

    /* renamed from: d, reason: collision with root package name */
    public String f16333d;

    /* renamed from: e, reason: collision with root package name */
    public String f16334e;

    /* renamed from: f, reason: collision with root package name */
    public ConcurrentHashMap f16335f;

    /* renamed from: g, reason: collision with root package name */
    public String f16336g;

    /* renamed from: h, reason: collision with root package name */
    public String f16337h;

    /* renamed from: i, reason: collision with root package name */
    public b5 f16338i;
    public ConcurrentHashMap j;

    public e(Date date) {
        this.f16335f = new ConcurrentHashMap();
        this.f16332c = Long.valueOf(System.nanoTime());
        this.f16331b = date;
        this.f16330a = null;
    }

    public static boolean a(e eVar, e eVar2) {
        return eVar.b().getTime() == eVar2.b().getTime() && y4.a.s(eVar.f16333d, eVar2.f16333d) && y4.a.s(eVar.f16334e, eVar2.f16334e) && y4.a.s(eVar.f16336g, eVar2.f16336g) && y4.a.s(eVar.f16337h, eVar2.f16337h) && eVar.f16338i == eVar2.f16338i;
    }

    public final Date b() {
        Date date = this.f16331b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l6 = this.f16330a;
        if (l6 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date o3 = com.google.android.play.core.appupdate.b.o(l6.longValue());
        this.f16331b = o3;
        return o3;
    }

    public final void c(Object obj, String str) {
        if (obj == null) {
            this.f16335f.remove(str);
        } else {
            this.f16335f.put(str, obj);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16332c.compareTo(((e) obj).f16332c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return "http".equals(this.f16334e) ? a(this, eVar) && y4.a.s(this.f16335f.get("status_code"), eVar.f16335f.get("status_code")) && y4.a.s(this.f16335f.get("url"), eVar.f16335f.get("url")) && y4.a.s(this.f16335f.get("method"), eVar.f16335f.get("method")) && y4.a.s(this.f16335f.get("http.fragment"), eVar.f16335f.get("http.fragment")) && y4.a.s(this.f16335f.get("http.query"), eVar.f16335f.get("http.query")) : a(this, eVar);
    }

    public final int hashCode() {
        return "http".equals(this.f16334e) ? Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.f16333d, this.f16334e, this.f16336g, this.f16337h, this.f16338i, this.f16335f.get("status_code"), this.f16335f.get("url"), this.f16335f.get("method"), this.f16335f.get("http.fragment"), this.f16335f.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.f16333d, this.f16334e, this.f16336g, this.f16337h, this.f16338i});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("timestamp");
        aVar.H(iLogger, b());
        if (this.f16333d != null) {
            aVar.u(LiveTable.messageColumn);
            aVar.K(this.f16333d);
        }
        if (this.f16334e != null) {
            aVar.u("type");
            aVar.K(this.f16334e);
        }
        aVar.u("data");
        aVar.H(iLogger, this.f16335f);
        if (this.f16336g != null) {
            aVar.u("category");
            aVar.K(this.f16336g);
        }
        if (this.f16337h != null) {
            aVar.u("origin");
            aVar.K(this.f16337h);
        }
        if (this.f16338i != null) {
            aVar.u("level");
            aVar.H(iLogger, this.f16338i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.j, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }

    public e(long j) {
        this.f16335f = new ConcurrentHashMap();
        this.f16332c = Long.valueOf(System.nanoTime());
        this.f16330a = Long.valueOf(j);
        this.f16331b = null;
    }

    public e(e eVar) {
        this.f16335f = new ConcurrentHashMap();
        this.f16332c = Long.valueOf(System.nanoTime());
        this.f16331b = eVar.f16331b;
        this.f16330a = eVar.f16330a;
        this.f16333d = eVar.f16333d;
        this.f16334e = eVar.f16334e;
        this.f16336g = eVar.f16336g;
        this.f16337h = eVar.f16337h;
        ConcurrentHashMap A = com.google.android.play.core.appupdate.b.A(eVar.f16335f);
        if (A != null) {
            this.f16335f = A;
        }
        this.j = com.google.android.play.core.appupdate.b.A(eVar.j);
        this.f16338i = eVar.f16338i;
    }

    public e() {
        this(System.currentTimeMillis());
    }

    public e(String str) {
        this();
        this.f16333d = str;
    }
}
