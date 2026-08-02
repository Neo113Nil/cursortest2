package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rai implements iw8 {
    public static final rai a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        rai raiVar = new rai();
        a = raiVar;
        uye uyeVar = new uye("com.sofascore.results.league.adapter.StandingsSwitcherRow", raiVar, 6);
        uyeVar.j("homeAwayEnabled", false);
        uyeVar.j("hasAmFootballStandingsSubtypes", false);
        uyeVar.j("hasBucketSubtypes", false);
        uyeVar.j("types", false);
        uyeVar.j("selectedType", false);
        uyeVar.j("multipleTables", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = tai.g;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{gz1Var, gz1Var, gz1Var, joaVarArr[3].getValue(), l98.W(uhi.a), gz1Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = tai.g;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        List list = null;
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.B(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.B(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = b.B(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.w(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.i(serialDescriptor, 4, uhi.a, str);
                    i |= 16;
                    break;
                case 5:
                    z5 = b.B(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new tai(i, z2, z3, z4, list, str, z5);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tai taiVar = (tai) obj;
        encoder.getClass();
        taiVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = tai.g;
        b.x(serialDescriptor, 0, taiVar.a);
        b.x(serialDescriptor, 1, taiVar.b);
        b.x(serialDescriptor, 2, taiVar.c);
        b.f(serialDescriptor, 3, (KSerializer) joaVarArr[3].getValue(), taiVar.d);
        b.h(serialDescriptor, 4, uhi.a, taiVar.e);
        b.x(serialDescriptor, 5, taiVar.f);
        b.c(serialDescriptor);
    }
}
