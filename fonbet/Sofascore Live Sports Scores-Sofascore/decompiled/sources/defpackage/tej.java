package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tej implements iw8 {
    public static final tej a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        tej tejVar = new tej();
        a = tejVar;
        uye uyeVar = new uye("com.sofascore.results.event.scorecard.adapter.TextRow", tejVar, 2);
        uyeVar.j("title", false);
        uyeVar.j("text", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vej.c[0].getValue(), uhi.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = vej.c;
        boolean z = true;
        int i = 0;
        r9k r9kVar = null;
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                r9kVar = (r9k) b.w(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), r9kVar);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                str = b.n(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new vej(i, r9kVar, str);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vej vejVar = (vej) obj;
        encoder.getClass();
        vejVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.f(serialDescriptor, 0, (KSerializer) vej.c[0].getValue(), vejVar.a);
        b.y(serialDescriptor, 1, vejVar.b);
        b.c(serialDescriptor);
    }
}
