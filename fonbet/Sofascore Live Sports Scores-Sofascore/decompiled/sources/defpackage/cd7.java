package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cd7 implements iw8 {
    public static final cd7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        cd7 cd7Var = new cd7();
        a = cd7Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData", cd7Var, 3);
        uyeVar.j("missingType", false);
        uyeVar.j("missingReason", false);
        uyeVar.j("playerFixtureStatus", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = FantasyPlayerFixtureData.d;
        return new KSerializer[]{l98.W((KSerializer) joaVarArr[0].getValue()), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W((KSerializer) joaVarArr[2].getValue())};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerFixtureData.d;
        boolean z = true;
        int i = 0;
        sd7 sd7Var = null;
        rd7 rd7Var = null;
        ad7 ad7Var = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                sd7Var = (sd7) b.i(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), sd7Var);
                i |= 1;
            } else if (o == 1) {
                rd7Var = (rd7) b.i(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), rd7Var);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                ad7Var = (ad7) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), ad7Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new FantasyPlayerFixtureData(i, sd7Var, rd7Var, ad7Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyPlayerFixtureData fantasyPlayerFixtureData = (FantasyPlayerFixtureData) obj;
        encoder.getClass();
        fantasyPlayerFixtureData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerFixtureData.d;
        b.h(serialDescriptor, 0, (KSerializer) joaVarArr[0].getValue(), fantasyPlayerFixtureData.a);
        b.h(serialDescriptor, 1, (KSerializer) joaVarArr[1].getValue(), fantasyPlayerFixtureData.b);
        b.h(serialDescriptor, 2, (KSerializer) joaVarArr[2].getValue(), fantasyPlayerFixtureData.c);
        b.c(serialDescriptor);
    }
}
