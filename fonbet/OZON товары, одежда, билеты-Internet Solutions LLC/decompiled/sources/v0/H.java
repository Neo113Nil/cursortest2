package v0;

import S0.C3956f1;
import S0.C3987u0;
import org.jetbrains.annotations.NotNull;
import x0.C10577F;
import x0.C10621z;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3987u0 f101462a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3987u0 f101463b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f101464c;

    /* renamed from: d, reason: collision with root package name */
    private Object f101465d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10577F f101466e;

    public H(int i11, int i12) {
        this.f101462a = C3956f1.a(i11);
        this.f101463b = C3956f1.a(i12);
        this.f101466e = new C10577F(i11, 30, 100);
    }

    private final void e(int i11, int i12) {
        if (i11 < 0.0f) {
            throw new IllegalArgumentException(P4.f.c("Index should be non-negative (", i11, ')').toString());
        }
        this.f101462a.d(i11);
        this.f101466e.b(i11);
        this.f101463b.d(i12);
    }

    public final int a() {
        return this.f101462a.getIntValue();
    }

    @NotNull
    public final C10577F b() {
        return this.f101466e;
    }

    public final int c() {
        return this.f101463b.getIntValue();
    }

    public final void d(int i11, int i12) {
        e(i11, i12);
        this.f101465d = null;
    }

    public final void f(@NotNull C10157B c10157b) {
        C10158C o11 = c10157b.o();
        this.f101465d = o11 != null ? o11.getKey() : null;
        if (this.f101464c || c10157b.d() > 0) {
            this.f101464c = true;
            int p11 = c10157b.p();
            if (p11 < 0.0f) {
                throw new IllegalStateException(P4.f.c("scrollOffset should be non-negative (", p11, ')').toString());
            }
            C10158C o12 = c10157b.o();
            e(o12 != null ? o12.getIndex() : 0, p11);
        }
    }

    public final void g(int i11) {
        if (i11 < 0.0f) {
            throw new IllegalStateException(P4.f.c("scrollOffset should be non-negative (", i11, ')').toString());
        }
        this.f101463b.d(i11);
    }

    public final int h(@NotNull o oVar, int i11) {
        int a11 = C10621z.a(i11, this.f101465d, oVar);
        if (i11 != a11) {
            this.f101462a.d(a11);
            this.f101466e.b(i11);
        }
        return a11;
    }
}
