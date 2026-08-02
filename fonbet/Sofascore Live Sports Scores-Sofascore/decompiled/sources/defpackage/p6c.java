package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p6c implements i72 {
    public static final p6c G = new p6c(new n6c());
    public static final i3c H = new i3c(6);
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Bundle F;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final wnn h;
    public final wnn i;
    public final byte[] j;
    public final Integer k;
    public final Uri l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Boolean p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final CharSequence z;

    public p6c(n6c n6cVar) {
        this.a = n6cVar.a;
        this.b = n6cVar.b;
        this.c = n6cVar.c;
        this.d = n6cVar.d;
        this.e = n6cVar.e;
        this.f = n6cVar.f;
        this.g = n6cVar.g;
        this.h = n6cVar.h;
        this.i = n6cVar.i;
        this.j = n6cVar.j;
        this.k = n6cVar.k;
        this.l = n6cVar.l;
        this.m = n6cVar.m;
        this.n = n6cVar.n;
        this.o = n6cVar.o;
        this.p = n6cVar.p;
        Integer num = n6cVar.q;
        this.q = num;
        this.r = num;
        this.s = n6cVar.r;
        this.t = n6cVar.s;
        this.u = n6cVar.t;
        this.v = n6cVar.u;
        this.w = n6cVar.v;
        this.x = n6cVar.w;
        this.y = n6cVar.x;
        this.z = n6cVar.y;
        this.A = n6cVar.z;
        this.B = n6cVar.A;
        this.C = n6cVar.B;
        this.D = n6cVar.C;
        this.E = n6cVar.D;
        this.F = n6cVar.E;
    }

    public final n6c a() {
        n6c n6cVar = new n6c();
        n6cVar.a = this.a;
        n6cVar.b = this.b;
        n6cVar.c = this.c;
        n6cVar.d = this.d;
        n6cVar.e = this.e;
        n6cVar.f = this.f;
        n6cVar.g = this.g;
        n6cVar.h = this.h;
        n6cVar.i = this.i;
        n6cVar.j = this.j;
        n6cVar.k = this.k;
        n6cVar.l = this.l;
        n6cVar.m = this.m;
        n6cVar.n = this.n;
        n6cVar.o = this.o;
        n6cVar.p = this.p;
        n6cVar.q = this.r;
        n6cVar.r = this.s;
        n6cVar.s = this.t;
        n6cVar.t = this.u;
        n6cVar.u = this.v;
        n6cVar.v = this.w;
        n6cVar.w = this.x;
        n6cVar.x = this.y;
        n6cVar.y = this.z;
        n6cVar.z = this.A;
        n6cVar.A = this.B;
        n6cVar.B = this.C;
        n6cVar.C = this.D;
        n6cVar.D = this.E;
        n6cVar.E = this.F;
        return n6cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p6c.class == obj.getClass()) {
            p6c p6cVar = (p6c) obj;
            if (lik.a(this.a, p6cVar.a) && lik.a(this.b, p6cVar.b) && lik.a(this.c, p6cVar.c) && lik.a(this.d, p6cVar.d) && lik.a(this.e, p6cVar.e) && lik.a(this.f, p6cVar.f) && lik.a(this.g, p6cVar.g) && lik.a(this.h, p6cVar.h) && lik.a(this.i, p6cVar.i) && Arrays.equals(this.j, p6cVar.j) && lik.a(this.k, p6cVar.k) && lik.a(this.l, p6cVar.l) && lik.a(this.m, p6cVar.m) && lik.a(this.n, p6cVar.n) && lik.a(this.o, p6cVar.o) && lik.a(this.p, p6cVar.p) && lik.a(this.r, p6cVar.r) && lik.a(this.s, p6cVar.s) && lik.a(this.t, p6cVar.t) && lik.a(this.u, p6cVar.u) && lik.a(this.v, p6cVar.v) && lik.a(this.w, p6cVar.w) && lik.a(this.x, p6cVar.x) && lik.a(this.y, p6cVar.y) && lik.a(this.z, p6cVar.z) && lik.a(this.A, p6cVar.A) && lik.a(this.B, p6cVar.B) && lik.a(this.C, p6cVar.C) && lik.a(this.D, p6cVar.D) && lik.a(this.E, p6cVar.E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Integer.valueOf(Arrays.hashCode(this.j)), this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E});
    }
}
