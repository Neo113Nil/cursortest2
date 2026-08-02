package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hga implements KSerializer {
    public static final hga a = new hga();
    public static final m5h b = aik.x("kotlinx.serialization.json.JsonNull", p5h.f, new SerialDescriptor[0]);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        ufa.j(decoder);
        if (decoder.C()) {
            throw new ofa(yfa.m(-1, "Expected 'null' literal", null, null, null));
        }
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        ((JsonNull) obj).getClass();
        ufa.k(encoder);
        encoder.p();
    }
}
