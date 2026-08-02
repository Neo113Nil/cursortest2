package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wr3 implements iw8 {
    public static final wr3 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        wr3 wr3Var = new wr3();
        a = wr3Var;
        uye uyeVar = new uye("com.sofascore.results.profile.contributionScreen.ContributionLog", wr3Var, 4);
        uyeVar.j("descriptionRes", false);
        uyeVar.j("colorRes", false);
        uyeVar.j("drawableRes", false);
        uyeVar.j("statusTextRes", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, l98.W(a7aVar), a7aVar, l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                num = (Integer) b.i(serialDescriptor, 1, a7a.a, num);
                i |= 2;
            } else if (o == 2) {
                i3 = b.l(serialDescriptor, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                num2 = (Integer) b.i(serialDescriptor, 3, a7a.a, num2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new yr3(i, i2, i3, num, num2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yr3 yr3Var = (yr3) obj;
        encoder.getClass();
        yr3Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, yr3Var.a, serialDescriptor);
        a7a a7aVar = a7a.a;
        b.h(serialDescriptor, 1, a7aVar, yr3Var.b);
        b.u(2, yr3Var.c, serialDescriptor);
        b.h(serialDescriptor, 3, a7aVar, yr3Var.d);
        b.c(serialDescriptor);
    }
}
