package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class do0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final an0 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public do0(co0 co0Var) {
        this.a = co0Var.a;
        this.b = co0Var.b;
        this.c = co0Var.c;
        this.d = co0Var.d;
        this.e = co0Var.e;
        this.f = co0Var.f;
        this.g = co0Var.g;
        this.h = co0Var.h;
        this.i = co0Var.i;
        this.j = co0Var.j;
        this.k = co0Var.k;
    }

    public final co0 a() {
        co0 co0Var = new co0();
        co0Var.a = this.a;
        co0Var.b = this.b;
        co0Var.c = this.c;
        co0Var.d = this.d;
        co0Var.e = this.e;
        co0Var.f = this.f;
        co0Var.g = this.g;
        co0Var.h = this.h;
        co0Var.i = this.i;
        co0Var.j = this.j;
        co0Var.k = this.k;
        return co0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || do0.class != obj.getClass()) {
            return false;
        }
        do0 do0Var = (do0) obj;
        return this.a == do0Var.a && this.b == do0Var.b && this.c == do0Var.c && this.d == do0Var.d && this.e == do0Var.e && this.f == do0Var.f && this.h == do0Var.h && this.i == do0Var.i && this.j == do0Var.j && this.k == do0Var.k && this.g.equals(do0Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
