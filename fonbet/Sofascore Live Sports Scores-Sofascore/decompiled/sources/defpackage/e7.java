package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class e7 implements KSerializer {
    public dy4 a(uf3 uf3Var, String str) {
        p5c a = uf3Var.a();
        KClass c = c();
        a.getClass();
        c.getClass();
        Map map = (Map) ((Map) a.e).get(c);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = ((Map) a.f).get(c);
        Function1 function1 = i5k.f(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (dy4) function1.invoke(str);
        }
        return null;
    }

    public KSerializer b(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        return encoder.a().i(c(), obj);
    }

    public abstract KClass c();

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        uf3 b = decoder.b(descriptor);
        fsf fsfVar = new fsf();
        Object obj = null;
        while (true) {
            int o = b.o(getDescriptor());
            if (o == -1) {
                if (obj != null) {
                    b.c(descriptor);
                    return obj;
                }
                hg6.e((String) fsfVar.a, "Polymorphic value has not been read for class ");
                return null;
            }
            if (o != 0) {
                Object obj2 = fsfVar.a;
                if (o != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) obj2;
                    if (str == null) {
                        str = "unknown class";
                    }
                    throw new v5h(bf3.h(o, str, "\n Expected 0, 1 or DECODE_DONE(-1), but found ", sb));
                }
                if (obj2 == null) {
                    a70.p("Cannot read polymorphic value before its type token");
                    return null;
                }
                fsfVar.a = obj2;
                obj = b.w(getDescriptor(), o, mha.m(this, b, (String) obj2), null);
            } else {
                fsfVar.a = b.n(getDescriptor(), o);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        KSerializer n = mha.n(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        wf3 b = encoder.b(descriptor);
        b.y(getDescriptor(), 0, n.getDescriptor().h());
        b.f(getDescriptor(), 1, n, obj);
        b.c(descriptor);
    }
}
