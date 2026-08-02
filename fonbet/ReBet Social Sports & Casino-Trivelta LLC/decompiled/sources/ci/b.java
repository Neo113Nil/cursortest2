package ci;

import Zh.o;
import Zh.p;
import di.C4113s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public abstract class b implements f, d {
    @Override // ci.f
    public void A() {
        super.A();
    }

    @Override // ci.d
    public void B(bi.f descriptor, int i10, p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (I(descriptor, i10)) {
            i(serializer, obj);
        }
    }

    @Override // ci.d
    public void C(bi.f descriptor, int i10, p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (I(descriptor, i10)) {
            q(serializer, obj);
        }
    }

    @Override // ci.f
    public void E(int i10) {
        J(Integer.valueOf(i10));
    }

    @Override // ci.d
    public final void F(bi.f descriptor, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            w(z10);
        }
    }

    @Override // ci.d
    public final void G(bi.f descriptor, int i10, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (I(descriptor, i10)) {
            H(value);
        }
    }

    @Override // ci.f
    public void H(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        J(value);
    }

    public boolean I(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    public void J(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new o("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // ci.d
    public void b(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // ci.f
    public d c(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // ci.d
    public final void e(bi.f descriptor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            s(j10);
        }
    }

    @Override // ci.d
    public final void f(bi.f descriptor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            E(i11);
        }
    }

    @Override // ci.f
    public void g(double d10) {
        J(Double.valueOf(d10));
    }

    @Override // ci.f
    public void h(byte b10) {
        J(Byte.valueOf(b10));
    }

    @Override // ci.f
    public void i(p pVar, Object obj) {
        super.i(pVar, obj);
    }

    @Override // ci.f
    public d j(bi.f fVar, int i10) {
        return super.j(fVar, i10);
    }

    @Override // ci.d
    public final void k(bi.f descriptor, int i10, double d10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            g(d10);
        }
    }

    @Override // ci.d
    public final void l(bi.f descriptor, int i10, char c10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            z(c10);
        }
    }

    @Override // ci.d
    public boolean m(bi.f fVar, int i10) {
        return super.m(fVar, i10);
    }

    @Override // ci.d
    public final void n(bi.f descriptor, int i10, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            h(b10);
        }
    }

    @Override // ci.f
    public void o(bi.f enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    @Override // ci.d
    public final void p(bi.f descriptor, int i10, float f10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            y(f10);
        }
    }

    @Override // ci.f
    public void q(p pVar, Object obj) {
        super.q(pVar, obj);
    }

    @Override // ci.d
    public final f r(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return I(descriptor, i10) ? t(descriptor.g(i10)) : C4113s0.f45410a;
    }

    @Override // ci.f
    public void s(long j10) {
        J(Long.valueOf(j10));
    }

    @Override // ci.f
    public f t(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // ci.f
    public void u() {
        throw new o("'null' is not supported by default");
    }

    @Override // ci.f
    public void v(short s10) {
        J(Short.valueOf(s10));
    }

    @Override // ci.f
    public void w(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    @Override // ci.d
    public final void x(bi.f descriptor, int i10, short s10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (I(descriptor, i10)) {
            v(s10);
        }
    }

    @Override // ci.f
    public void y(float f10) {
        J(Float.valueOf(f10));
    }

    @Override // ci.f
    public void z(char c10) {
        J(Character.valueOf(c10));
    }
}
