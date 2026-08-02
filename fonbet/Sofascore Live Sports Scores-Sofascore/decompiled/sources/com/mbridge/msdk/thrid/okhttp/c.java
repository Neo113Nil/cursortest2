package com.mbridge.msdk.thrid.okhttp;

import defpackage.a70;
import defpackage.ljg;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public static final c n = new a().b().a();
    public static final c o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    String m;

    public c(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.f;
        this.k = aVar.g;
        this.l = aVar.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(r rVar) {
        int i;
        int i2;
        String str;
        r rVar2 = rVar;
        int b = rVar2.b();
        int i3 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < b) {
            String a2 = rVar2.a(i3);
            String b2 = rVar2.b(i3);
            if (a2.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = b2;
                    for (i = 0; i < b2.length(); i = i2) {
                        int a3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(b2, i, "=,;");
                        String trim = b2.substring(i, a3).trim();
                        if (a3 == b2.length() || b2.charAt(a3) == ',' || b2.charAt(a3) == ';') {
                            i2 = a3 + 1;
                            str = null;
                        } else {
                            int b3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.b(b2, a3 + 1);
                            if (b3 >= b2.length() || b2.charAt(b3) != '\"') {
                                i2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(b2, b3, ",;");
                                str = b2.substring(b3, i2).trim();
                            } else {
                                int i8 = b3 + 1;
                                int a4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(b2, i8, "\"");
                                str = b2.substring(i8, a4);
                                i2 = a4 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(trim)) {
                                i4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(trim)) {
                                i5 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(str, -1);
                            } else if ("private".equalsIgnoreCase(trim)) {
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(trim)) {
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(trim)) {
                                i6 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(trim)) {
                                i7 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(trim)) {
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(trim)) {
                                z9 = true;
                            }
                        }
                    }
                    i3++;
                    rVar2 = rVar;
                }
            } else if (!a2.equalsIgnoreCase("Pragma")) {
                i3++;
                rVar2 = rVar;
            }
            z = false;
            while (i < b2.length()) {
            }
            i3++;
            rVar2 = rVar;
        }
        return new c(z2, z3, i4, i5, z4, z5, z6, i6, i7, z7, z8, z9, !z ? null : str2);
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.a;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return this.j;
    }

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        String a2 = a();
        this.m = a2;
        return a2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        boolean a;
        boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;
        boolean h;

        public a a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                a70.p(ljg.j(i, "maxStale < 0: "));
                return null;
            }
            long seconds = timeUnit.toSeconds(i);
            this.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c() {
            this.f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        if (this.c != -1) {
            sb.append("max-age=");
            sb.append(this.c);
            sb.append(", ");
        }
        if (this.d != -1) {
            sb.append("s-maxage=");
            sb.append(this.d);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        if (this.h != -1) {
            sb.append("max-stale=");
            sb.append(this.h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}
