package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.internal.http.d;
import com.mbridge.msdk.thrid.okhttp.internal.http.e;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.chromium.base.TimeUtils;

/* compiled from: CacheStrategy.java */
/* loaded from: classes14.dex */
public final class b {
    public final y a;
    public final a0 b;

    public b(y yVar, a0 a0Var) {
        this.a = yVar;
        this.b = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.h().b() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(a0 a0Var, y yVar) {
        int k = a0Var.k();
        if (k != 200 && k != 410 && k != 414 && k != 501 && k != 203 && k != 204) {
            if (k != 307) {
                if (k != 308 && k != 404 && k != 405) {
                    switch (k) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (a0Var.b("Expires") == null) {
                if (a0Var.h().d() == -1) {
                    if (!a0Var.h().c()) {
                    }
                }
            }
        }
        return (a0Var.h().i() || yVar.b().i()) ? false : true;
    }

    /* compiled from: CacheStrategy.java */
    public static class a {
        final long a;
        final y b;
        final a0 c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l;

        public a(long j, y yVar, a0 a0Var) {
            this.l = -1;
            this.a = j;
            this.b = yVar;
            this.c = a0Var;
            if (a0Var != null) {
                this.i = a0Var.t();
                this.j = a0Var.r();
                r m = a0Var.m();
                int b = m.b();
                for (int i = 0; i < b; i++) {
                    String a = m.a(i);
                    String b2 = m.b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.d = d.a(b2);
                        this.e = b2;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.h = d.a(b2);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f = d.a(b2);
                        this.g = b2;
                    } else if (Command.HTTP_HEADER_ETAG.equalsIgnoreCase(a)) {
                        this.k = b2;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.l = e.a(b2, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.d;
            long max = date != null ? Math.max(0L, this.j - date.getTime()) : 0L;
            int i = this.l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.j;
            return max + (j - this.i) + (this.a - j);
        }

        private long b() {
            if (this.c.h().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            if (this.h != null) {
                Date date = this.d;
                long time = this.h.getTime() - (date != null ? date.getTime() : this.j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f != null && this.c.s().g().k() == null) {
                Date date2 = this.d;
                long time2 = (date2 != null ? date2.getTime() : this.i) - this.f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private b d() {
            String str;
            if (this.c == null) {
                return new b(this.b, null);
            }
            if (this.b.d() && this.c.l() == null) {
                return new b(this.b, null);
            }
            if (!b.a(this.c, this.b)) {
                return new b(this.b, null);
            }
            com.mbridge.msdk.thrid.okhttp.c b = this.b.b();
            if (b.h() || a(this.b)) {
                return new b(this.b, null);
            }
            com.mbridge.msdk.thrid.okhttp.c h = this.c.h();
            long a = a();
            long b2 = b();
            if (b.d() != -1) {
                b2 = Math.min(b2, TimeUnit.SECONDS.toMillis(b.d()));
            }
            long j = 0;
            long millis = b.f() != -1 ? TimeUnit.SECONDS.toMillis(b.f()) : 0L;
            if (!h.g() && b.e() != -1) {
                j = TimeUnit.SECONDS.toMillis(b.e());
            }
            if (!h.h()) {
                long j2 = millis + a;
                if (j2 < j + b2) {
                    a0.a p = this.c.p();
                    if (j2 >= b2) {
                        p.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > TimeUtils.MILLISECONDS_PER_DAY && e()) {
                        p.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new b(null, p.a());
                }
            }
            String str2 = this.k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f != null) {
                    str2 = this.g;
                } else {
                    if (this.d == null) {
                        return new b(this.b, null);
                    }
                    str2 = this.e;
                }
                str = "If-Modified-Since";
            }
            r.a a2 = this.b.c().a();
            com.mbridge.msdk.thrid.okhttp.internal.a.a.a(a2, str, str2);
            return new b(this.b.f().a(a2.a()).a(), this.c);
        }

        private boolean e() {
            return this.c.h().d() == -1 && this.h == null;
        }

        public b c() {
            b d = d();
            return (d.a == null || !this.b.b().j()) ? d : new b(null, null);
        }

        private static boolean a(y yVar) {
            return (yVar.a("If-Modified-Since") == null && yVar.a("If-None-Match") == null) ? false : true;
        }
    }
}
