package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tc9 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final hv9 l;
    public final hv9 m;
    public final vvf n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public tc9(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        z1a.s((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = hv9.v(arrayList2);
        this.m = hv9.v(arrayList3);
        this.n = hv9.D(new m39(1), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc9)) {
            return false;
        }
        tc9 tc9Var = (tc9) obj;
        return this.d == tc9Var.d && this.e == tc9Var.e && this.f == tc9Var.f && this.g == tc9Var.g && this.i == tc9Var.i && this.j == tc9Var.j && this.k == tc9Var.k && this.o == tc9Var.o && this.r == tc9Var.r && this.s == tc9Var.s && this.a.equals(tc9Var.a) && Objects.equals(this.b, tc9Var.b) && Objects.equals(this.c, tc9Var.c) && this.h.equals(tc9Var.h) && Objects.equals(this.l, tc9Var.l) && Objects.equals(this.m, tc9Var.m) && Objects.equals(this.n, tc9Var.n) && Objects.equals(this.p, tc9Var.p) && Objects.equals(this.q, tc9Var.q) && Objects.equals(this.t, tc9Var.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
