package x0;

import B1.k0;
import S0.C3956f1;
import S0.C3987u0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import c1.AbstractC5715f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import x0.C10583L;

/* renamed from: x0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10578G implements k0, k0.a, C10583L.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f104673a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10583L f104674b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3987u0 f104675c = C3956f1.a(-1);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3987u0 f104676d = C3956f1.a(0);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f104677e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f104678f;

    public C10578G(Object obj, @NotNull C10583L c10583l) {
        C3991w0 f7;
        C3991w0 f11;
        this.f104673a = obj;
        this.f104674b = c10583l;
        f7 = n1.f(null, D1.f25195a);
        this.f104677e = f7;
        f11 = n1.f(null, D1.f25195a);
        this.f104678f = f11;
    }

    @Override // B1.k0
    @NotNull
    public final k0.a a() {
        C3987u0 c3987u0 = this.f104676d;
        if (c3987u0.getIntValue() == 0) {
            this.f104674b.b(this);
            k0 k0Var = (k0) this.f104678f.getValue();
            this.f104677e.setValue(k0Var != null ? k0Var.a() : null);
        }
        c3987u0.d(c3987u0.getIntValue() + 1);
        return this;
    }

    public final void b() {
        int intValue = this.f104676d.getIntValue();
        for (int i11 = 0; i11 < intValue; i11++) {
            release();
        }
    }

    public final void c(int i11) {
        this.f104675c.d(i11);
    }

    public final void d(k0 k0Var) {
        C3991w0 c3991w0 = this.f104677e;
        C3991w0 c3991w02 = this.f104678f;
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            if (k0Var != ((k0) c3991w02.getValue())) {
                c3991w02.setValue(k0Var);
                if (this.f104676d.getIntValue() > 0) {
                    k0.a aVar = (k0.a) c3991w0.getValue();
                    if (aVar != null) {
                        aVar.release();
                    }
                    c3991w0.setValue(k0Var != null ? k0Var.a() : null);
                }
            }
            Unit unit = Unit.f71690a;
            AbstractC5715f.a.d(a11, b11, h11);
        } catch (Throwable th2) {
            AbstractC5715f.a.d(a11, b11, h11);
            throw th2;
        }
    }

    @Override // x0.C10583L.a
    public final int getIndex() {
        return this.f104675c.getIntValue();
    }

    @Override // x0.C10583L.a
    public final Object getKey() {
        return this.f104673a;
    }

    @Override // B1.k0.a
    public final void release() {
        C3987u0 c3987u0 = this.f104676d;
        if (c3987u0.getIntValue() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c3987u0.d(c3987u0.getIntValue() - 1);
        if (c3987u0.getIntValue() == 0) {
            this.f104674b.c(this);
            C3991w0 c3991w0 = this.f104677e;
            k0.a aVar = (k0.a) c3991w0.getValue();
            if (aVar != null) {
                aVar.release();
            }
            c3991w0.setValue(null);
        }
    }
}
