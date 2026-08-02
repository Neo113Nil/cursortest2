package defpackage;

import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.Tournament$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cbi implements iw8 {
    public static final cbi a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        cbi cbiVar = new cbi();
        a = cbiVar;
        uye uyeVar = new uye("com.sofascore.results.league.adapter.StandingsTournamentRow", cbiVar, 6);
        uyeVar.j("tableId", false);
        uyeVar.j("tournament", false);
        uyeVar.j("name", false);
        uyeVar.j("isLive", false);
        uyeVar.j("isFirstItem", false);
        uyeVar.j("hasStandingsTracker", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7a.a, Tournament$$serializer.INSTANCE, uhi.a, gz1Var, gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Tournament tournament = null;
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    tournament = (Tournament) b.w(serialDescriptor, 1, Tournament$$serializer.INSTANCE, tournament);
                    i |= 2;
                    break;
                case 2:
                    str = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.B(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = b.B(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z4 = b.B(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ebi(i, i2, tournament, str, z2, z3, z4);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ebi ebiVar = (ebi) obj;
        encoder.getClass();
        ebiVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, ebiVar.a, serialDescriptor);
        b.f(serialDescriptor, 1, Tournament$$serializer.INSTANCE, ebiVar.b);
        b.y(serialDescriptor, 2, ebiVar.c);
        b.x(serialDescriptor, 3, ebiVar.d);
        b.x(serialDescriptor, 4, ebiVar.e);
        b.x(serialDescriptor, 5, ebiVar.f);
        b.c(serialDescriptor);
    }
}
