package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q6c {
    public static final q6c D = new q6c(new o6c());
    public final CharSequence A;
    public final Integer B;
    public final hv9 C;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Uri i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Boolean m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final CharSequence u;
    public final CharSequence v;
    public final CharSequence w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        wt3.s(0, 1, 2, 3, 4);
        wt3.s(5, 6, 8, 9, 10);
        wt3.s(11, 12, 13, 14, 15);
        wt3.s(16, 17, 18, 19, 20);
        wt3.s(21, 22, 23, 24, 25);
        wt3.s(26, 27, 28, 29, 30);
        wt3.s(31, 32, 33, 34, 1000);
    }

    public q6c(o6c o6cVar) {
        Boolean bool = o6cVar.m;
        Integer num = o6cVar.l;
        Integer num2 = o6cVar.A;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = o6cVar.a;
        this.b = o6cVar.b;
        this.c = o6cVar.c;
        this.d = o6cVar.d;
        this.e = o6cVar.e;
        this.f = o6cVar.f;
        this.g = o6cVar.g;
        this.h = o6cVar.h;
        this.i = o6cVar.i;
        this.j = o6cVar.j;
        this.k = o6cVar.k;
        this.l = num;
        this.m = bool;
        Integer num3 = o6cVar.n;
        this.n = num3;
        this.o = num3;
        this.p = o6cVar.o;
        this.q = o6cVar.p;
        this.r = o6cVar.q;
        this.s = o6cVar.r;
        this.t = o6cVar.s;
        this.u = o6cVar.t;
        this.v = o6cVar.u;
        this.w = o6cVar.v;
        this.x = o6cVar.w;
        this.y = o6cVar.x;
        this.z = o6cVar.y;
        this.A = o6cVar.z;
        this.B = num2;
        this.C = o6cVar.B;
    }

    public final o6c a() {
        o6c o6cVar = new o6c();
        o6cVar.a = this.a;
        o6cVar.b = this.b;
        o6cVar.c = this.c;
        o6cVar.d = this.d;
        o6cVar.e = this.e;
        o6cVar.f = this.f;
        o6cVar.g = this.g;
        o6cVar.h = this.h;
        o6cVar.i = this.i;
        o6cVar.j = this.j;
        o6cVar.k = this.k;
        o6cVar.l = this.l;
        o6cVar.m = this.m;
        o6cVar.n = this.o;
        o6cVar.o = this.p;
        o6cVar.p = this.q;
        o6cVar.q = this.r;
        o6cVar.r = this.s;
        o6cVar.s = this.t;
        o6cVar.t = this.u;
        o6cVar.u = this.v;
        o6cVar.v = this.w;
        o6cVar.w = this.x;
        o6cVar.x = this.y;
        o6cVar.y = this.z;
        o6cVar.z = this.A;
        o6cVar.A = this.B;
        o6cVar.B = this.C;
        return o6cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q6c.class != obj.getClass()) {
            return false;
        }
        q6c q6cVar = (q6c) obj;
        return TextUtils.equals(this.a, q6cVar.a) && TextUtils.equals(this.b, q6cVar.b) && TextUtils.equals(this.c, q6cVar.c) && TextUtils.equals(this.d, q6cVar.d) && TextUtils.equals(null, null) && TextUtils.equals(this.e, q6cVar.e) && TextUtils.equals(this.f, q6cVar.f) && Arrays.equals(this.g, q6cVar.g) && Objects.equals(this.h, q6cVar.h) && Objects.equals(this.i, q6cVar.i) && Objects.equals(this.j, q6cVar.j) && Objects.equals(this.k, q6cVar.k) && Objects.equals(this.l, q6cVar.l) && Objects.equals(this.m, q6cVar.m) && Objects.equals(this.o, q6cVar.o) && Objects.equals(this.p, q6cVar.p) && Objects.equals(this.q, q6cVar.q) && Objects.equals(this.r, q6cVar.r) && Objects.equals(this.s, q6cVar.s) && Objects.equals(this.t, q6cVar.t) && TextUtils.equals(this.u, q6cVar.u) && TextUtils.equals(this.v, q6cVar.v) && TextUtils.equals(this.w, q6cVar.w) && Objects.equals(this.x, q6cVar.x) && Objects.equals(this.y, q6cVar.y) && TextUtils.equals(this.z, q6cVar.z) && TextUtils.equals(null, null) && TextUtils.equals(this.A, q6cVar.A) && Objects.equals(this.B, q6cVar.B) && Objects.equals(this.C, q6cVar.C);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, this.e, this.f, null, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i, this.j, this.k, this.l, this.m, null, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, null, this.A, this.B, true, this.C);
    }
}
