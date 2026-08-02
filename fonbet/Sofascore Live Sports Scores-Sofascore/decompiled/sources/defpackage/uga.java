package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uga implements KSerializer {
    public static final uga a = new uga();
    public static final m5h b = aik.x("kotlinx.serialization.json.JsonPrimitive", d7f.n, new SerialDescriptor[0]);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        mfa j = ufa.j(decoder);
        b j2 = j.j();
        if (j2 instanceof d) {
            return (d) j2;
        }
        throw new ofa(yfa.m(-1, mz1.k(duf.a, j2.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), null, null, j.d().a.l ? yfa.u(j2.toString(), -1).toString() : null));
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        encoder.getClass();
        dVar.getClass();
        ufa.k(encoder);
        if (dVar instanceof JsonNull) {
            encoder.l(hga.a, JsonNull.INSTANCE);
        } else {
            encoder.l(ega.a, (dga) dVar);
        }
    }
}
