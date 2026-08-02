package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.C4094gc;
import com.mbridge.msdk.thrid.okhttp.r;
import defpackage.a70;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.yhk;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y {
    final s a;
    final String b;
    final r c;
    final z d;
    final Map<Class<?>, Object> e;
    private volatile c f;

    public y(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.e);
    }

    public String a(String str) {
        return this.c.b(str);
    }

    public c b() {
        c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        c a2 = c.a(this.c);
        this.f = a2;
        return a2;
    }

    public r c() {
        return this.c;
    }

    public boolean d() {
        return this.a.h();
    }

    public String e() {
        return this.b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tags=");
        return dmi.s(sb, this.e, '}');
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        s a;
        String b;
        r.a c;
        z d;
        Map<Class<?>, Object> e;

        public a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.e = map;
            this.a = yVar.a;
            this.b = yVar.b;
            this.d = yVar.d;
            this.e = yVar.e.isEmpty() ? map : new LinkedHashMap<>(yVar.e);
            this.c = yVar.c.a();
        }

        public a a(String str, z zVar) {
            if (str == null) {
                yhk.s("method == null");
                return null;
            }
            if (str.length() == 0) {
                a70.p("method.length() == 0");
                return null;
            }
            if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                a70.p(lnb.o("method ", str, " must not have a request body."));
                return null;
            }
            if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                a70.p(lnb.o("method ", str, " must have a request body."));
                return null;
            }
            this.b = str;
            this.d = zVar;
            return this;
        }

        public a b(String str) {
            if (str != null) {
                return a(s.b(str.regionMatches(true, 0, "ws:", 0, 3) ? "http:".concat(str.substring(3)) : str.regionMatches(true, 0, "wss:", 0, 4) ? "https:".concat(str.substring(4)) : str));
            }
            yhk.s("url == null");
            return null;
        }

        public a c() {
            return a(C4094gc.a, (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a(C4094gc.b, zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a() {
            this.e = Collections.EMPTY_MAP;
            this.b = C4094gc.a;
            this.c = new r.a();
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.c.b(str);
            return this;
        }

        public a a(r rVar) {
            this.c = rVar.a();
            return this;
        }

        public a b(String str, String str2) {
            this.c.c(str, str2);
            return this;
        }

        public a a(c cVar) {
            String cVar2 = cVar.toString();
            return cVar2.isEmpty() ? a("Cache-Control") : b("Cache-Control", cVar2);
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.d);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a a(z zVar) {
            return a("DELETE", zVar);
        }

        public a a(s sVar) {
            if (sVar != null) {
                this.a = sVar;
                return this;
            }
            yhk.s("url == null");
            return null;
        }

        public y a() {
            if (this.a != null) {
                return new y(this);
            }
            a70.r("url == null");
            return null;
        }
    }

    public z a() {
        return this.d;
    }
}
