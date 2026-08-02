package defpackage;

import com.sofascore.model.mvvm.model.Partnership;
import com.sofascore.model.mvvm.model.Partnership$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dae implements iw8 {
    public static final dae a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        dae daeVar = new dae();
        a = daeVar;
        uye uyeVar = new uye("com.sofascore.results.event.scorecard.adapter.PartnershipRow", daeVar, 3);
        uyeVar.j("position", false);
        uyeVar.j("partnership", false);
        uyeVar.j("isLastItemInGroup", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a7a.a, Partnership$$serializer.INSTANCE, gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        Partnership partnership = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                partnership = (Partnership) b.w(serialDescriptor, 1, Partnership$$serializer.INSTANCE, partnership);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                z2 = b.B(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new fae(i, i2, partnership, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fae faeVar = (fae) obj;
        encoder.getClass();
        faeVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, faeVar.a, serialDescriptor);
        b.f(serialDescriptor, 1, Partnership$$serializer.INSTANCE, faeVar.b);
        if (b.o(serialDescriptor) || faeVar.c) {
            b.x(serialDescriptor, 2, faeVar.c);
        }
        b.c(serialDescriptor);
    }
}
