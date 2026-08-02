package sg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class x0 extends o {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f23716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(og.a primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f23716b = new w0(primitiveSerializer.d());
    }

    @Override // sg.a, og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return i(decoder);
    }

    @Override // sg.o, og.a
    public final void c(ug.s encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int h10 = h(obj);
        w0 descriptor = this.f23716b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ug.s a7 = encoder.a(descriptor);
        o(a7, obj, h10);
        a7.t(descriptor);
    }

    @Override // og.a
    public final qg.g d() {
        return this.f23716b;
    }

    @Override // sg.a
    public final Object e() {
        return (v0) k(n());
    }

    @Override // sg.a
    public final int f(Object obj) {
        v0 v0Var = (v0) obj;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        return v0Var.d();
    }

    @Override // sg.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // sg.a
    public final Object l(Object obj) {
        v0 v0Var = (v0) obj;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        return v0Var.a();
    }

    @Override // sg.o
    public final void m(int i5, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((v0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(ug.s sVar, Object obj, int i5);
}
