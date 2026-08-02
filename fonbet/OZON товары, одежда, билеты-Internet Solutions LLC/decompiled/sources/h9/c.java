package h9;

import o9.C8659a;
import o9.C8660b;
import o9.C8666h;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final C8666h f65103a;

    /* renamed from: b, reason: collision with root package name */
    private C8660b f65104b;

    public c(C8666h c8666h) {
        this.f65103a = c8666h;
    }

    public final C8660b a() throws m {
        if (this.f65104b == null) {
            this.f65104b = this.f65103a.e();
        }
        return this.f65104b;
    }

    public final C8659a b(int i11, C8659a c8659a) throws m {
        return this.f65103a.f(i11, c8659a);
    }

    public final int c() {
        return this.f65103a.a();
    }

    public final int d() {
        return this.f65103a.c();
    }

    public final boolean e() {
        return this.f65103a.b().e();
    }

    public final c f() {
        return new c(new C8666h(this.f65103a.b().f()));
    }

    public final String toString() {
        try {
            return a().toString();
        } catch (m unused) {
            return "";
        }
    }
}
