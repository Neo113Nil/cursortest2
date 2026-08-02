package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s7d implements KSerializer {
    public final m5h a = aik.u("androidx.navigation.runtime.NavKey", new SerialDescriptor[0], new a7d(7));

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        m5h m5hVar = this.a;
        uf3 b = decoder.b(m5hVar);
        Object w = b.w(m5hVar, b.o(m5hVar), sha.R(duf.a.getOrCreateKotlinClass(Class.forName(b.n(m5hVar, b.o(m5hVar))))), null);
        w.getClass();
        r7d r7dVar = (r7d) w;
        b.c(m5hVar);
        return r7dVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r7d r7dVar = (r7d) obj;
        m5h m5hVar = this.a;
        wf3 b = encoder.b(m5hVar);
        b.y(m5hVar, 0, r7dVar.getClass().getName());
        b.f(m5hVar, 1, sha.R(duf.a.getOrCreateKotlinClass(r7dVar.getClass())), r7dVar);
        b.c(m5hVar);
    }
}
