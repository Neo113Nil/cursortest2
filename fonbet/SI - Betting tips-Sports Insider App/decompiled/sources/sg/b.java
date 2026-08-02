package sg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b implements og.a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        og.d dVar = (og.d) this;
        qg.g d10 = dVar.d();
        rg.a w10 = decoder.w(d10);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object obj = null;
        while (true) {
            int z5 = w10.z(dVar.d());
            if (z5 == -1) {
                if (obj != null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    w10.g(d10);
                    return obj;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
            }
            if (z5 == 0) {
                objectRef.element = w10.o(dVar.d(), z5);
            } else {
                if (z5 != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) objectRef.element;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb2.append(str);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(z5);
                    throw new og.f(sb2.toString());
                }
                T t3 = objectRef.element;
                if (t3 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objectRef.element = t3;
                obj = w10.u(dVar.d(), z5, k2.x.n(this, w10, (String) t3), null);
            }
        }
    }

    @Override // og.a
    public final void c(ug.s encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        og.a o3 = k2.x.o(this, encoder, value);
        og.d dVar = (og.d) this;
        qg.g d10 = dVar.d();
        ug.s a7 = encoder.a(d10);
        a7.s(dVar.d(), 0, o3.d().a());
        qg.g d11 = dVar.d();
        Intrinsics.checkNotNull(o3, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        a7.o(d11, 1, o3, value);
        a7.t(d10);
    }
}
