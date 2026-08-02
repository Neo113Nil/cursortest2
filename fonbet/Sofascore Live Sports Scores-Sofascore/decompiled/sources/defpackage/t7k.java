package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class t7k implements KSerializer {
    public static final t7k a = new t7k();
    public static final m3a b;

    static {
        ab2.a.getClass();
        b = o3a.a("kotlin.UByte", qb2.a);
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return new p7k(decoder.p(b).E());
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte b2 = ((p7k) obj).a;
        encoder.getClass();
        encoder.k(b).g(b2);
    }
}
