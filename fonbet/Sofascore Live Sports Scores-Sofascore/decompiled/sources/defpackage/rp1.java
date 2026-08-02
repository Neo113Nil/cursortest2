package defpackage;

import com.sofascore.results.fantasy.ui.model.BasicTournamentInfo;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class rp1 implements iw8 {
    public static final rp1 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        rp1 rp1Var = new rp1();
        a = rp1Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.ui.model.BasicTournamentInfo", rp1Var, 3);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("categoryId", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, uhi.a, a7aVar};
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
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                str = b.n(serialDescriptor, 1);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                i3 = b.l(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new BasicTournamentInfo(i, i2, i3, str);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BasicTournamentInfo basicTournamentInfo = (BasicTournamentInfo) obj;
        encoder.getClass();
        basicTournamentInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, basicTournamentInfo.a, serialDescriptor);
        b.y(serialDescriptor, 1, basicTournamentInfo.b);
        b.u(2, basicTournamentInfo.c, serialDescriptor);
        b.c(serialDescriptor);
    }
}
