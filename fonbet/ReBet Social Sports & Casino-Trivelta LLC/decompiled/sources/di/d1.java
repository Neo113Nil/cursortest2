package di;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d1 implements ci.f, ci.d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f45355a = new ArrayList();

    private final boolean I(bi.f fVar, int i10) {
        Z(X(fVar, i10));
        return true;
    }

    @Override // ci.d
    public void B(bi.f descriptor, int i10, Zh.p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (I(descriptor, i10)) {
            i(serializer, obj);
        }
    }

    @Override // ci.d
    public void C(bi.f descriptor, int i10, Zh.p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (I(descriptor, i10)) {
            q(serializer, obj);
        }
    }

    @Override // ci.f
    public final void E(int i10) {
        Q(Y(), i10);
    }

    @Override // ci.d
    public final void F(bi.f descriptor, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        J(X(descriptor, i10), z10);
    }

    @Override // ci.d
    public final void G(bi.f descriptor, int i10, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        T(X(descriptor, i10), value);
    }

    @Override // ci.f
    public final void H(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T(Y(), value);
    }

    public abstract void J(Object obj, boolean z10);

    public abstract void K(Object obj, byte b10);

    public abstract void L(Object obj, char c10);

    public abstract void M(Object obj, double d10);

    public abstract void N(Object obj, bi.f fVar, int i10);

    public abstract void O(Object obj, float f10);

    public ci.f P(Object obj, bi.f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        Z(obj);
        return this;
    }

    public abstract void Q(Object obj, int i10);

    public abstract void R(Object obj, long j10);

    public abstract void S(Object obj, short s10);

    public abstract void T(Object obj, String str);

    public abstract void U(bi.f fVar);

    public final Object V() {
        return CollectionsKt.last((List) this.f45355a);
    }

    public final Object W() {
        return CollectionsKt.lastOrNull((List) this.f45355a);
    }

    public abstract Object X(bi.f fVar, int i10);

    public final Object Y() {
        if (this.f45355a.isEmpty()) {
            throw new Zh.o("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f45355a;
        return arrayList.remove(CollectionsKt.getLastIndex(arrayList));
    }

    public final void Z(Object obj) {
        this.f45355a.add(obj);
    }

    @Override // ci.d
    public final void b(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f45355a.isEmpty()) {
            Y();
        }
        U(descriptor);
    }

    @Override // ci.d
    public final void e(bi.f descriptor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        R(X(descriptor, i10), j10);
    }

    @Override // ci.d
    public final void f(bi.f descriptor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Q(X(descriptor, i10), i11);
    }

    @Override // ci.f
    public final void g(double d10) {
        M(Y(), d10);
    }

    @Override // ci.f
    public final void h(byte b10) {
        K(Y(), b10);
    }

    @Override // ci.f
    public abstract void i(Zh.p pVar, Object obj);

    @Override // ci.f
    public ci.d j(bi.f fVar, int i10) {
        return super.j(fVar, i10);
    }

    @Override // ci.d
    public final void k(bi.f descriptor, int i10, double d10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        M(X(descriptor, i10), d10);
    }

    @Override // ci.d
    public final void l(bi.f descriptor, int i10, char c10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        L(X(descriptor, i10), c10);
    }

    @Override // ci.d
    public final void n(bi.f descriptor, int i10, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        K(X(descriptor, i10), b10);
    }

    @Override // ci.f
    public final void o(bi.f enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        N(Y(), enumDescriptor, i10);
    }

    @Override // ci.d
    public final void p(bi.f descriptor, int i10, float f10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        O(X(descriptor, i10), f10);
    }

    @Override // ci.f
    public void q(Zh.p pVar, Object obj) {
        super.q(pVar, obj);
    }

    @Override // ci.d
    public final ci.f r(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(X(descriptor, i10), descriptor.g(i10));
    }

    @Override // ci.f
    public final void s(long j10) {
        R(Y(), j10);
    }

    @Override // ci.f
    public ci.f t(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // ci.f
    public final void v(short s10) {
        S(Y(), s10);
    }

    @Override // ci.f
    public final void w(boolean z10) {
        J(Y(), z10);
    }

    @Override // ci.d
    public final void x(bi.f descriptor, int i10, short s10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        S(X(descriptor, i10), s10);
    }

    @Override // ci.f
    public final void y(float f10) {
        O(Y(), f10);
    }

    @Override // ci.f
    public final void z(char c10) {
        L(Y(), c10);
    }
}
