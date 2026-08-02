package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class w2 implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // defpackage.dy4
    public Object deserialize(Decoder decoder) {
        decoder.getClass();
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        decoder.getClass();
        Object a = a();
        int b = b(a);
        uf3 b2 = decoder.b(getDescriptor());
        while (true) {
            int o = b2.o(getDescriptor());
            if (o == -1) {
                b2.c(getDescriptor());
                return h(a);
            }
            f(b2, o + b, a);
        }
    }

    public abstract void f(uf3 uf3Var, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
