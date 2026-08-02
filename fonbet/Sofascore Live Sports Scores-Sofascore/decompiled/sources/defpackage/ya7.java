package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ya7 implements iw8 {
    public static final ya7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ya7 ya7Var = new ya7();
        a = ya7Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.onboarding.FantasyOnboardingRootNavigation.SelectReplacement", ya7Var, 4);
        uyeVar.j("competitionId", false);
        uyeVar.j("roundId", false);
        uyeVar.j("position", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(uhi.a);
        KSerializer W2 = l98.W(cj7.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, W, W2};
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
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                i3 = b.l(serialDescriptor, 1);
                i |= 2;
            } else if (o == 2) {
                str = (String) b.i(serialDescriptor, 2, uhi.a, str);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) b.i(serialDescriptor, 3, cj7.a, fantasyRoundPlayerUiModel);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ab7(i, i2, i3, str, fantasyRoundPlayerUiModel);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ab7 ab7Var = (ab7) obj;
        encoder.getClass();
        ab7Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, ab7Var.a, serialDescriptor);
        b.u(1, ab7Var.b, serialDescriptor);
        b.h(serialDescriptor, 2, uhi.a, ab7Var.c);
        b.h(serialDescriptor, 3, cj7.a, ab7Var.d);
        b.c(serialDescriptor);
    }
}
