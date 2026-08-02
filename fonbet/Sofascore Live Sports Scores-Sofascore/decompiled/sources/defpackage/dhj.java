package defpackage;

import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dhj implements KSerializer {
    public static final dhj a = new dhj();
    public static final joa b = ypa.a(ysa.b, new eej(3));

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        uf3 b2 = decoder.b(descriptor);
        long j = 0;
        boolean z = false;
        while (true) {
            dhj dhjVar = a;
            int o = b2.o(dhjVar.getDescriptor());
            if (o == -1) {
                Unit unit = Unit.a;
                b2.c(descriptor);
                if (z) {
                    return new qk4(j);
                }
                throw new rkc("nanoseconds", getDescriptor().h());
            }
            if (o != 0) {
                u6h.T(o);
                throw null;
            }
            j = b2.g(dhjVar.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qk4 qk4Var = (qk4) obj;
        encoder.getClass();
        qk4Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        wf3 b2 = encoder.b(descriptor);
        b2.E(a.getDescriptor(), 0, qk4Var.b);
        b2.c(descriptor);
    }
}
