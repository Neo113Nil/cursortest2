package di;

import Zh.InterfaceC1901b;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class P0 extends AbstractC4120w {

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f45319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(InterfaceC1901b primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f45319b = new O0(primitiveSerializer.getDescriptor());
    }

    @Override // di.AbstractC4077a, Zh.InterfaceC1900a
    public final Object deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return g(decoder, null);
    }

    @Override // di.AbstractC4077a
    public final Iterator e(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // di.AbstractC4120w, Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public final bi.f getDescriptor() {
        return this.f45319b;
    }

    @Override // di.AbstractC4077a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final N0 b() {
        return (N0) l(s());
    }

    @Override // di.AbstractC4077a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int c(N0 n02) {
        Intrinsics.checkNotNullParameter(n02, "<this>");
        return n02.d();
    }

    @Override // di.AbstractC4077a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void d(N0 n02, int i10) {
        Intrinsics.checkNotNullParameter(n02, "<this>");
        n02.b(i10);
    }

    public abstract Object s();

    @Override // di.AbstractC4120w, Zh.p
    public final void serialize(ci.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int f10 = f(obj);
        bi.f fVar = this.f45319b;
        ci.d j10 = encoder.j(fVar, f10);
        v(j10, obj, f10);
        j10.b(fVar);
    }

    @Override // di.AbstractC4120w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void o(N0 n02, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(n02, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // di.AbstractC4077a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final Object m(N0 n02) {
        Intrinsics.checkNotNullParameter(n02, "<this>");
        return n02.a();
    }

    public abstract void v(ci.d dVar, Object obj, int i10);
}
