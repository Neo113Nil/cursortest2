package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.BaseballInningInfo$$serializer;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.statistics.PlayerHand;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nl0 implements iw8 {
    public static final nl0 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        nl0 nl0Var = new nl0();
        a = nl0Var;
        uye uyeVar = new uye("com.sofascore.results.event.commentary.baseball.AtBatInfo", nl0Var, 10);
        uyeVar.j("teamId", false);
        uyeVar.j("teamDisplayName", false);
        uyeVar.j("inningInfo", false);
        uyeVar.j("commentText", false);
        uyeVar.j("actionOutcome", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("hitterHand", false);
        uyeVar.j("winProbability", false);
        uyeVar.j("winProbabilityChange", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = pl0.k;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{a7aVar, uhiVar, BaseballInningInfo$$serializer.INSTANCE, uhiVar, joaVarArr[4].getValue(), a7aVar, a7aVar, l98.W((KSerializer) joaVarArr[7].getValue()), l98.W(c88Var), l98.W(c88Var)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr2 = pl0.k;
        Float f = null;
        Float f2 = null;
        boolean z = true;
        PlayerHand playerHand = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        BaseballInningInfo baseballInningInfo = null;
        String str2 = null;
        BaseballActionOutcome baseballActionOutcome = null;
        int i3 = 0;
        int i4 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    joaVarArr = joaVarArr2;
                    z = false;
                    break;
                case 0:
                    joaVarArr = joaVarArr2;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr = joaVarArr2;
                    str = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr = joaVarArr2;
                    baseballInningInfo = (BaseballInningInfo) b.w(serialDescriptor, 2, BaseballInningInfo$$serializer.INSTANCE, baseballInningInfo);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr = joaVarArr2;
                    str2 = b.n(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr = joaVarArr2;
                    baseballActionOutcome = (BaseballActionOutcome) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), baseballActionOutcome);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr = joaVarArr2;
                    i3 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr = joaVarArr2;
                    i4 = b.l(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr = joaVarArr2;
                    playerHand = (PlayerHand) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), playerHand);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr = joaVarArr2;
                    f2 = (Float) b.i(serialDescriptor, 8, c88.a, f2);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr = joaVarArr2;
                    f = (Float) b.i(serialDescriptor, 9, c88.a, f);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr2 = joaVarArr;
        }
        b.c(serialDescriptor);
        return new pl0(i, i2, str, baseballInningInfo, str2, baseballActionOutcome, i3, i4, playerHand, f2, f);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pl0 pl0Var = (pl0) obj;
        encoder.getClass();
        pl0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = pl0.k;
        b.u(0, pl0Var.a, serialDescriptor);
        b.y(serialDescriptor, 1, pl0Var.b);
        b.f(serialDescriptor, 2, BaseballInningInfo$$serializer.INSTANCE, pl0Var.c);
        b.y(serialDescriptor, 3, pl0Var.d);
        b.f(serialDescriptor, 4, (KSerializer) joaVarArr[4].getValue(), pl0Var.e);
        b.u(5, pl0Var.f, serialDescriptor);
        b.u(6, pl0Var.g, serialDescriptor);
        b.h(serialDescriptor, 7, (KSerializer) joaVarArr[7].getValue(), pl0Var.h);
        c88 c88Var = c88.a;
        b.h(serialDescriptor, 8, c88Var, pl0Var.i);
        b.h(serialDescriptor, 9, c88Var, pl0Var.j);
        b.c(serialDescriptor);
    }
}
