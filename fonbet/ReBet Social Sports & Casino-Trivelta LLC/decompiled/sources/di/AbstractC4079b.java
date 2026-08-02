package di;

import Zh.InterfaceC1900a;
import Zh.InterfaceC1901b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;

/* renamed from: di.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4079b implements InterfaceC1901b {
    public final Object c(ci.c cVar) {
        return ci.c.u(cVar, getDescriptor(), 1, Zh.h.a(this, cVar, cVar.s(getDescriptor(), 0)), null, 8, null);
    }

    public InterfaceC1900a d(ci.c decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.a().e(f(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // Zh.InterfaceC1900a
    public final Object deserialize(ci.e decoder) {
        Object obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bi.f descriptor = getDescriptor();
        ci.c c10 = decoder.c(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (c10.q()) {
            obj = c(c10);
        } else {
            Object obj2 = null;
            while (true) {
                int e10 = c10.e(getDescriptor());
                if (e10 != -1) {
                    if (e10 == 0) {
                        objectRef.element = c10.s(getDescriptor(), e10);
                    } else {
                        if (e10 != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) objectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(e10);
                            throw new Zh.o(sb2.toString());
                        }
                        T t10 = objectRef.element;
                        if (t10 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        objectRef.element = t10;
                        obj2 = ci.c.u(c10, getDescriptor(), e10, Zh.h.a(this, c10, (String) t10), null, 8, null);
                    }
                } else {
                    if (obj2 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    obj = obj2;
                }
            }
        }
        c10.b(descriptor);
        return obj;
    }

    public Zh.p e(ci.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.a().f(f(), value);
    }

    public abstract KClass f();

    @Override // Zh.p
    public final void serialize(ci.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Zh.p b10 = Zh.h.b(this, encoder, value);
        bi.f descriptor = getDescriptor();
        ci.d c10 = encoder.c(descriptor);
        c10.G(getDescriptor(), 0, b10.getDescriptor().h());
        bi.f descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        c10.B(descriptor2, 1, b10, value);
        c10.b(descriptor);
    }
}
