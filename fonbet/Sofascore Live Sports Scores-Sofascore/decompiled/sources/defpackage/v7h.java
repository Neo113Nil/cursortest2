package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v7h implements iw8 {
    public static final v7h a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v7h v7hVar = new v7h();
        a = v7hVar;
        uye uyeVar = new uye("com.google.firebase.sessions.SessionDetails", v7hVar, 4);
        uyeVar.j("sessionId", false);
        uyeVar.j("firstSessionId", false);
        uyeVar.j("sessionIndex", false);
        uyeVar.j("sessionStartTimestampUs", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, uhiVar, a7a.a, lkb.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b.n(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                str2 = b.n(serialDescriptor, 1);
                i |= 2;
            } else if (o == 2) {
                i2 = b.l(serialDescriptor, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                j = b.g(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new x7h(i, str, i2, str2, j);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x7h x7hVar = (x7h) obj;
        encoder.getClass();
        x7hVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.y(serialDescriptor, 0, x7hVar.a);
        b.y(serialDescriptor, 1, x7hVar.b);
        b.u(2, x7hVar.c, serialDescriptor);
        b.E(serialDescriptor, 3, x7hVar.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
