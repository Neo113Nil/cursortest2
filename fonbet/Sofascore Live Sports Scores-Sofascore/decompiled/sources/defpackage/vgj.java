package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vgj implements iw8 {
    public static final vgj a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        vgj vgjVar = new vgj();
        a = vgjVar;
        uye uyeVar = new uye("com.google.firebase.sessions.Time", vgjVar, 3);
        uyeVar.j("ms", false);
        uyeVar.j("us", true);
        uyeVar.j("seconds", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        lkb lkbVar = lkb.a;
        return new KSerializer[]{lkbVar, lkbVar, lkbVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                j = b.g(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                j2 = b.g(serialDescriptor, 1);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                j3 = b.g(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ygj(i, j, j2, j3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ygj ygjVar = (ygj) obj;
        encoder.getClass();
        ygjVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        long j = ygjVar.a;
        long j2 = ygjVar.c;
        long j3 = ygjVar.b;
        b.E(serialDescriptor, 0, j);
        if (b.o(serialDescriptor) || j3 != j * 1000) {
            b.E(serialDescriptor, 1, j3);
        }
        if (b.o(serialDescriptor) || j2 != j / 1000) {
            b.E(serialDescriptor, 2, j2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
