package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j81 implements iw8 {
    public static final j81 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j81 j81Var = new j81();
        a = j81Var;
        uye uyeVar = new uye("com.sofascore.results.event.commentary.baseball.BaseballCommentaryModalData", j81Var, 3);
        uyeVar.j("atBatInfo", false);
        uyeVar.j("pitches", false);
        uyeVar.j("showWinProbability", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nl0.a, l81.d[1].getValue(), gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = l81.d;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        pl0 pl0Var = null;
        gv9 gv9Var = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                pl0Var = (pl0) b.w(serialDescriptor, 0, nl0.a, pl0Var);
                i |= 1;
            } else if (o == 1) {
                gv9Var = (gv9) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), gv9Var);
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
        return new l81(i, pl0Var, gv9Var, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l81 l81Var = (l81) obj;
        encoder.getClass();
        l81Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = l81.d;
        b.f(serialDescriptor, 0, nl0.a, l81Var.a);
        b.f(serialDescriptor, 1, (KSerializer) joaVarArr[1].getValue(), l81Var.b);
        b.x(serialDescriptor, 2, l81Var.c);
        b.c(serialDescriptor);
    }
}
