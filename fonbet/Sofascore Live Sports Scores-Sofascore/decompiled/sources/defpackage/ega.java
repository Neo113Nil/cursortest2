package defpackage;

import kotlin.text.StringsKt;
import kotlin.text.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ega implements KSerializer {
    public static final ega a = new ega();
    public static final g7f b = aik.g("kotlinx.serialization.json.JsonLiteral", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        mfa j = ufa.j(decoder);
        b j2 = j.j();
        if (j2 instanceof dga) {
            return (dga) j2;
        }
        throw new ofa(yfa.m(-1, mz1.k(duf.a, j2.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), null, null, j.d().a.l ? yfa.u(j2.toString(), -1).toString() : null));
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dga dgaVar = (dga) obj;
        encoder.getClass();
        dgaVar.getClass();
        ufa.k(encoder);
        boolean z = dgaVar.a;
        String str = dgaVar.c;
        if (z) {
            encoder.F(str);
            return;
        }
        SerialDescriptor serialDescriptor = dgaVar.b;
        if (serialDescriptor != null) {
            encoder.k(serialDescriptor).F(str);
            return;
        }
        Long k0 = StringsKt.k0(str);
        if (k0 != null) {
            encoder.m(k0.longValue());
            return;
        }
        e8k f = g.f(str);
        if (f != null) {
            long j = f.a;
            e8k.b.getClass();
            encoder.k(i8k.b).m(j);
            return;
        }
        Double f2 = kotlin.text.b.f(str);
        if (f2 != null) {
            encoder.e(f2.doubleValue());
            return;
        }
        Boolean j0 = StringsKt.j0(str);
        if (j0 != null) {
            encoder.s(j0.booleanValue());
        } else {
            encoder.F(str);
        }
    }
}
