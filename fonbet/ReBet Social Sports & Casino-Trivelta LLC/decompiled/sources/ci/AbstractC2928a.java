package ci;

import Zh.InterfaceC1900a;
import Zh.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: ci.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2928a implements e, c {
    @Override // ci.e
    public char A() {
        Object K10 = K();
        Intrinsics.checkNotNull(K10, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) K10).charValue();
    }

    @Override // ci.c
    public final double B(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return x();
    }

    @Override // ci.c
    public final Object C(bi.f descriptor, int i10, InterfaceC1900a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || G()) ? J(deserializer, obj) : n();
    }

    @Override // ci.c
    public final short D(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return v();
    }

    @Override // ci.e
    public String E() {
        Object K10 = K();
        Intrinsics.checkNotNull(K10, "null cannot be cast to non-null type kotlin.String");
        return (String) K10;
    }

    @Override // ci.c
    public final int F(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k();
    }

    @Override // ci.e
    public boolean G() {
        return true;
    }

    @Override // ci.e
    public Object H(InterfaceC1900a interfaceC1900a) {
        return super.H(interfaceC1900a);
    }

    @Override // ci.e
    public abstract byte I();

    public Object J(InterfaceC1900a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return H(deserializer);
    }

    public Object K() {
        throw new o(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // ci.c
    public void b(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // ci.e
    public c c(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // ci.e
    public int f(bi.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object K10 = K();
        Intrinsics.checkNotNull(K10, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) K10).intValue();
    }

    @Override // ci.c
    public final long g(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p();
    }

    @Override // ci.c
    public int h(bi.f fVar) {
        return super.h(fVar);
    }

    @Override // ci.c
    public Object i(bi.f descriptor, int i10, InterfaceC1900a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return J(deserializer, obj);
    }

    @Override // ci.e
    public abstract int k();

    @Override // ci.c
    public final byte l(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return I();
    }

    @Override // ci.c
    public e m(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return y(descriptor.g(i10));
    }

    @Override // ci.e
    public Void n() {
        return null;
    }

    @Override // ci.c
    public final float o(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return w();
    }

    @Override // ci.e
    public abstract long p();

    @Override // ci.c
    public boolean q() {
        return super.q();
    }

    @Override // ci.c
    public final char r(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return A();
    }

    @Override // ci.c
    public final String s(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E();
    }

    @Override // ci.c
    public final boolean t(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return z();
    }

    @Override // ci.e
    public abstract short v();

    @Override // ci.e
    public float w() {
        Object K10 = K();
        Intrinsics.checkNotNull(K10, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) K10).floatValue();
    }

    @Override // ci.e
    public double x() {
        Object K10 = K();
        Intrinsics.checkNotNull(K10, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) K10).doubleValue();
    }

    @Override // ci.e
    public e y(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // ci.e
    public boolean z() {
        Object K10 = K();
        Intrinsics.checkNotNull(K10, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) K10).booleanValue();
    }
}
