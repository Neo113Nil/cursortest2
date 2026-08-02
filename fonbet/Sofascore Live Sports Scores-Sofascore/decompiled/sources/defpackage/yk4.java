package defpackage;

import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yk4 implements KSerializer {
    public static final yk4 a = new yk4();
    public static final joa b = ypa.a(ysa.b, new wc4(7));

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        uf3 b2 = decoder.b(descriptor);
        boolean z = false;
        int i = 0;
        while (true) {
            yk4 yk4Var = a;
            int o = b2.o(yk4Var.getDescriptor());
            if (o == -1) {
                Unit unit = Unit.a;
                b2.c(descriptor);
                if (z) {
                    return new mk4(i);
                }
                throw new rkc("days", getDescriptor().h());
            }
            if (o != 0) {
                u6h.T(o);
                throw null;
            }
            i = b2.l(yk4Var.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mk4 mk4Var = (mk4) obj;
        encoder.getClass();
        mk4Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        wf3 b2 = encoder.b(descriptor);
        b2.u(0, mk4Var.b, a.getDescriptor());
        b2.c(descriptor);
    }
}
