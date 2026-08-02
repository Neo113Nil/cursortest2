package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q1k implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;
    public final KSerializer c;
    public final m5h d;

    public q1k(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
        this.d = aik.u("kotlin.Triple", new SerialDescriptor[0], new qdj(this, 9));
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        m5h m5hVar = this.d;
        uf3 b = decoder.b(m5hVar);
        Object obj = fcp.j;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int o = b.o(m5hVar);
            if (o == -1) {
                b.c(m5hVar);
                if (obj2 == obj) {
                    throw new v5h("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new v5h("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new n1k(obj2, obj3, obj4);
                }
                throw new v5h("Element 'third' is missing");
            }
            if (o == 0) {
                obj2 = b.w(m5hVar, 0, this.a, null);
            } else if (o == 1) {
                obj3 = b.w(m5hVar, 1, this.b, null);
            } else {
                if (o != 2) {
                    throw new v5h(ljg.j(o, "Unexpected index "));
                }
                obj4 = b.w(m5hVar, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n1k n1kVar = (n1k) obj;
        encoder.getClass();
        n1kVar.getClass();
        m5h m5hVar = this.d;
        wf3 b = encoder.b(m5hVar);
        b.f(m5hVar, 0, this.a, n1kVar.a);
        b.f(m5hVar, 1, this.b, n1kVar.b);
        b.f(m5hVar, 2, this.c, n1kVar.c);
        b.c(m5hVar);
    }
}
