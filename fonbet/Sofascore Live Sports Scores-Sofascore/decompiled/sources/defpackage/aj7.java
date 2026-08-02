package defpackage;

import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class aj7 implements iw8 {
    public static final aj7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        aj7 aj7Var = new aj7();
        a = aj7Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo", aj7Var, 7);
        uyeVar.j("fixtures", false);
        uyeVar.j("price", false);
        uyeVar.j("averagePoints", false);
        uyeVar.j("expectedPoints", false);
        uyeVar.j("upcomingFixtureTime", false);
        uyeVar.j("upcomingFixture", false);
        uyeVar.j("singleRoundFixture", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        ed7 ed7Var = ed7.a;
        KSerializer W = l98.W(ed7Var);
        KSerializer W2 = l98.W(ed7Var);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, uhiVar, uhiVar, uhiVar, uhiVar, W, W2};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = null;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.n(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.n(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.n(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) b.i(serialDescriptor, 5, ed7.a, fantasyPlayerFixtureUiModel);
                    i |= 32;
                    break;
                case 6:
                    fantasyPlayerFixtureUiModel2 = (FantasyPlayerFixtureUiModel) b.i(serialDescriptor, 6, ed7.a, fantasyPlayerFixtureUiModel2);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FantasyRoundPlayerInfo(i, str, str2, str3, str4, str5, fantasyPlayerFixtureUiModel, fantasyPlayerFixtureUiModel2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyRoundPlayerInfo fantasyRoundPlayerInfo = (FantasyRoundPlayerInfo) obj;
        encoder.getClass();
        fantasyRoundPlayerInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.y(serialDescriptor, 0, fantasyRoundPlayerInfo.a);
        b.y(serialDescriptor, 1, fantasyRoundPlayerInfo.b);
        b.y(serialDescriptor, 2, fantasyRoundPlayerInfo.c);
        b.y(serialDescriptor, 3, fantasyRoundPlayerInfo.d);
        b.y(serialDescriptor, 4, fantasyRoundPlayerInfo.e);
        ed7 ed7Var = ed7.a;
        b.h(serialDescriptor, 5, ed7Var, fantasyRoundPlayerInfo.f);
        b.h(serialDescriptor, 6, ed7Var, fantasyRoundPlayerInfo.g);
        b.c(serialDescriptor);
    }
}
