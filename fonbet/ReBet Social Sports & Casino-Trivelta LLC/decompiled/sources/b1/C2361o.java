package b1;

import e1.AbstractC4134a;
import e1.Z;
import java.util.Objects;

/* renamed from: b1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2361o {

    /* renamed from: e, reason: collision with root package name */
    public static final C2361o f24616e = new b(0).e();

    /* renamed from: f, reason: collision with root package name */
    public static final String f24617f = Z.K0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f24618g = Z.K0(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24619h = Z.K0(2);

    /* renamed from: i, reason: collision with root package name */
    public static final String f24620i = Z.K0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f24621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24622b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24623c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24624d;

    /* renamed from: b1.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f24625a;

        /* renamed from: b, reason: collision with root package name */
        public int f24626b;

        /* renamed from: c, reason: collision with root package name */
        public int f24627c;

        /* renamed from: d, reason: collision with root package name */
        public String f24628d;

        public b(int i10) {
            this.f24625a = i10;
        }

        public C2361o e() {
            AbstractC4134a.a(this.f24626b <= this.f24627c);
            return new C2361o(this);
        }

        public b f(int i10) {
            this.f24627c = i10;
            return this;
        }

        public b g(int i10) {
            this.f24626b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2361o)) {
            return false;
        }
        C2361o c2361o = (C2361o) obj;
        return this.f24621a == c2361o.f24621a && this.f24622b == c2361o.f24622b && this.f24623c == c2361o.f24623c && Objects.equals(this.f24624d, c2361o.f24624d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f24621a) * 31) + this.f24622b) * 31) + this.f24623c) * 31;
        String str = this.f24624d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public C2361o(b bVar) {
        this.f24621a = bVar.f24625a;
        this.f24622b = bVar.f24626b;
        this.f24623c = bVar.f24627c;
        this.f24624d = bVar.f24628d;
    }
}
