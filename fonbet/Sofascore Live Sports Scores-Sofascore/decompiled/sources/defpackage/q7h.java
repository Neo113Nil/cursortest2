package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7h implements iw8 {
    public static final q7h a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q7h q7hVar = new q7h();
        a = q7hVar;
        uye uyeVar = new uye("com.google.firebase.sessions.SessionData", q7hVar, 3);
        uyeVar.j("sessionDetails", false);
        uyeVar.j("backgroundTime", true);
        uyeVar.j("processDataMap", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v7h.a, l98.W(vgj.a), l98.W((KSerializer) s7h.d[2].getValue())};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = s7h.d;
        boolean z = true;
        int i = 0;
        x7h x7hVar = null;
        ygj ygjVar = null;
        Map map = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                x7hVar = (x7h) b.w(serialDescriptor, 0, v7h.a, x7hVar);
                i |= 1;
            } else if (o == 1) {
                ygjVar = (ygj) b.i(serialDescriptor, 1, vgj.a, ygjVar);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                map = (Map) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new s7h(i, x7hVar, ygjVar, map);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s7h s7hVar = (s7h) obj;
        encoder.getClass();
        s7hVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = s7h.d;
        v7h v7hVar = v7h.a;
        x7h x7hVar = s7hVar.a;
        Map map = s7hVar.c;
        ygj ygjVar = s7hVar.b;
        b.f(serialDescriptor, 0, v7hVar, x7hVar);
        if (b.o(serialDescriptor) || ygjVar != null) {
            b.h(serialDescriptor, 1, vgj.a, ygjVar);
        }
        if (b.o(serialDescriptor) || map != null) {
            b.h(serialDescriptor, 2, (KSerializer) joaVarArr[2].getValue(), map);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
