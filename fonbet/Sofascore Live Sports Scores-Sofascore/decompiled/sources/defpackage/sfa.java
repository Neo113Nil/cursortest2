package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sfa implements KSerializer {
    public static final sfa a = new sfa();
    public static final m5h b = aik.w("kotlinx.serialization.json.JsonElement", zze.g, new SerialDescriptor[0], new yo9(20));

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return ufa.j(decoder).j();
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b bVar = (b) obj;
        encoder.getClass();
        bVar.getClass();
        ufa.k(encoder);
        if (bVar instanceof d) {
            encoder.l(uga.a, bVar);
            return;
        }
        if (bVar instanceof c) {
            encoder.l(lga.a, bVar);
        } else if (bVar instanceof a) {
            encoder.l(dfa.a, bVar);
        } else {
            zzl.b();
        }
    }
}
