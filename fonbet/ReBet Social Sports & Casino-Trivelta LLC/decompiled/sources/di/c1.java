package di;

import Zh.InterfaceC1900a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c1 implements ci.e, ci.c {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f45352b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f45353c;

    public static final Object L(c1 c1Var, InterfaceC1900a interfaceC1900a, Object obj) {
        return (interfaceC1900a.getDescriptor().b() || c1Var.G()) ? c1Var.N(interfaceC1900a, obj) : c1Var.n();
    }

    public static final Object M(c1 c1Var, InterfaceC1900a interfaceC1900a, Object obj) {
        return c1Var.N(interfaceC1900a, obj);
    }

    @Override // ci.e
    public final char A() {
        return Q(c0());
    }

    @Override // ci.c
    public final double B(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return R(a0(descriptor, i10));
    }

    @Override // ci.c
    public final Object C(bi.f descriptor, int i10, final InterfaceC1900a deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return e0(a0(descriptor, i10), new Function0() { // from class: di.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object L10;
                L10 = c1.L(c1.this, deserializer, obj);
                return L10;
            }
        });
    }

    @Override // ci.c
    public final short D(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return X(a0(descriptor, i10));
    }

    @Override // ci.e
    public final String E() {
        return Y(c0());
    }

    @Override // ci.c
    public final int F(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return V(a0(descriptor, i10));
    }

    @Override // ci.e
    public abstract Object H(InterfaceC1900a interfaceC1900a);

    @Override // ci.e
    public final byte I() {
        return P(c0());
    }

    public Object N(InterfaceC1900a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return H(deserializer);
    }

    public abstract boolean O(Object obj);

    public abstract byte P(Object obj);

    public abstract char Q(Object obj);

    public abstract double R(Object obj);

    public abstract int S(Object obj, bi.f fVar);

    public abstract float T(Object obj);

    public ci.e U(Object obj, bi.f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        d0(obj);
        return this;
    }

    public abstract int V(Object obj);

    public abstract long W(Object obj);

    public abstract short X(Object obj);

    public abstract String Y(Object obj);

    public final Object Z() {
        return CollectionsKt.lastOrNull((List) this.f45352b);
    }

    public abstract Object a0(bi.f fVar, int i10);

    public final ArrayList b0() {
        return this.f45352b;
    }

    public final Object c0() {
        ArrayList arrayList = this.f45352b;
        Object remove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.f45353c = true;
        return remove;
    }

    public final void d0(Object obj) {
        this.f45352b.add(obj);
    }

    public final Object e0(Object obj, Function0 function0) {
        d0(obj);
        Object invoke = function0.invoke();
        if (!this.f45353c) {
            c0();
        }
        this.f45353c = false;
        return invoke;
    }

    @Override // ci.e
    public final int f(bi.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return S(c0(), enumDescriptor);
    }

    @Override // ci.c
    public final long g(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return W(a0(descriptor, i10));
    }

    @Override // ci.c
    public int h(bi.f fVar) {
        return super.h(fVar);
    }

    @Override // ci.c
    public final Object i(bi.f descriptor, int i10, final InterfaceC1900a deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return e0(a0(descriptor, i10), new Function0() { // from class: di.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object M10;
                M10 = c1.M(c1.this, deserializer, obj);
                return M10;
            }
        });
    }

    @Override // ci.e
    public final int k() {
        return V(c0());
    }

    @Override // ci.c
    public final byte l(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(a0(descriptor, i10));
    }

    @Override // ci.c
    public final ci.e m(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return U(a0(descriptor, i10), descriptor.g(i10));
    }

    @Override // ci.e
    public final Void n() {
        return null;
    }

    @Override // ci.c
    public final float o(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return T(a0(descriptor, i10));
    }

    @Override // ci.e
    public final long p() {
        return W(c0());
    }

    @Override // ci.c
    public boolean q() {
        return super.q();
    }

    @Override // ci.c
    public final char r(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Q(a0(descriptor, i10));
    }

    @Override // ci.c
    public final String s(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Y(a0(descriptor, i10));
    }

    @Override // ci.c
    public final boolean t(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return O(a0(descriptor, i10));
    }

    @Override // ci.e
    public final short v() {
        return X(c0());
    }

    @Override // ci.e
    public final float w() {
        return T(c0());
    }

    @Override // ci.e
    public final double x() {
        return R(c0());
    }

    @Override // ci.e
    public ci.e y(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return U(c0(), descriptor);
    }

    @Override // ci.e
    public final boolean z() {
        return O(c0());
    }
}
