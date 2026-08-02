package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7h implements iw8 {
    public static final m7h a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m7h m7hVar = new m7h();
        a = m7hVar;
        uye uyeVar = new uye("com.google.firebase.sessions.settings.SessionConfigs", m7hVar, 5);
        uyeVar.j("sessionsEnabled", false);
        uyeVar.j("sessionSamplingRate", false);
        uyeVar.j("sessionTimeoutSeconds", false);
        uyeVar.j("cacheDurationSeconds", false);
        uyeVar.j("cacheUpdatedTimeSeconds", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(gz1.a);
        KSerializer W2 = l98.W(h75.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{W, W2, l98.W(a7aVar), l98.W(a7aVar), l98.W(lkb.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                bool = (Boolean) b.i(serialDescriptor, 0, gz1.a, bool);
                i |= 1;
            } else if (o == 1) {
                d = (Double) b.i(serialDescriptor, 1, h75.a, d);
                i |= 2;
            } else if (o == 2) {
                num = (Integer) b.i(serialDescriptor, 2, a7a.a, num);
                i |= 4;
            } else if (o == 3) {
                num2 = (Integer) b.i(serialDescriptor, 3, a7a.a, num2);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                l = (Long) b.i(serialDescriptor, 4, lkb.a, l);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new o7h(i, bool, d, num, num2, l);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o7h o7hVar = (o7h) obj;
        encoder.getClass();
        o7hVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.h(serialDescriptor, 0, gz1.a, o7hVar.a);
        b.h(serialDescriptor, 1, h75.a, o7hVar.b);
        a7a a7aVar = a7a.a;
        b.h(serialDescriptor, 2, a7aVar, o7hVar.c);
        b.h(serialDescriptor, 3, a7aVar, o7hVar.d);
        b.h(serialDescriptor, 4, lkb.a, o7hVar.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
