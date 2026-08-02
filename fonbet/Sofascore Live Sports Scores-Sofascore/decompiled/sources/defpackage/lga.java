package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lga implements KSerializer {
    public static final lga a = new lga();
    public static final kga b = kga.b;

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        ufa.j(decoder);
        l98.h0(phi.a);
        return new c((Map) l98.x(uhi.a, sfa.a).deserialize(decoder));
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        encoder.getClass();
        cVar.getClass();
        ufa.k(encoder);
        l98.h0(phi.a);
        l98.x(uhi.a, sfa.a).serialize(encoder, cVar);
    }
}
