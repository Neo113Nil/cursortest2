package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.cjl0;
import xsna.up;
import xsna.zr;

/* compiled from: Request.java */
/* loaded from: classes14.dex */
public final class y {
    final s a;
    final String b;
    final r c;
    final z d;
    final Map<Class<?>, Object> e;
    private volatile c f;

    /* compiled from: Request.java */
    public static class a {
        s a;
        String b;
        r.a c;
        z d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.EMPTY_MAP;
            this.b = "GET";
            this.c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.a = sVar;
            return this;
        }

        public a b(String str) {
            if (str != null) {
                return a(s.b(str.regionMatches(true, 0, "ws:", 0, 3) ? up.b(3, str, new StringBuilder("http:")) : str.regionMatches(true, 0, "wss:", 0, 4) ? up.b(4, str, new StringBuilder("https:")) : str));
            }
            throw new NullPointerException("url == null");
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.c.b(str);
            return this;
        }

        public a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.e = map;
            this.a = yVar.a;
            this.b = yVar.b;
            this.d = yVar.d;
            this.e = yVar.e.isEmpty() ? map : new LinkedHashMap<>(yVar.e);
            this.c = yVar.c.a();
        }

        public a a(r rVar) {
            this.c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String cVar2 = cVar.toString();
            return cVar2.isEmpty() ? a("Cache-Control") : b("Cache-Control", cVar2);
        }

        public a a(z zVar) {
            return a("DELETE", zVar);
        }

        public a a(String str, z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException(zr.a("method ", str, " must not have a request body."));
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException(zr.a("method ", str, " must have a request body."));
                    }
                    this.b = str;
                    this.d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a b(String str, String str2) {
            this.c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.d);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public y a() {
            if (this.a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

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
        return cjl0.a(sb, this.e, '}');
    }

    public z a() {
        return this.d;
    }
}
