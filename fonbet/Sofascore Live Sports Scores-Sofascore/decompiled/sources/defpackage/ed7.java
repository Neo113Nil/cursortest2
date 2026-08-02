package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ed7 implements iw8 {
    public static final ed7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ed7 ed7Var = new ed7();
        a = ed7Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel", ed7Var, 23);
        uyeVar.j("eventId", false);
        uyeVar.j("homeTeamId", false);
        uyeVar.j("awayTeamId", false);
        uyeVar.j("roundId", false);
        uyeVar.j("roundName", false);
        uyeVar.j("roundSequence", false);
        uyeVar.j("opponentId", false);
        uyeVar.j("opponentNamecode", false);
        uyeVar.j("type", false);
        uyeVar.j("points", false);
        uyeVar.j("expectedPoints", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("eventStatus", false);
        uyeVar.j("locationType", false);
        uyeVar.j("fixtureDifficulty", false);
        uyeVar.j("winnerCode", false);
        uyeVar.j("playerTeamSide", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("missingType", false);
        uyeVar.j("missingReason", false);
        uyeVar.j("playerFixtureStatus", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = FantasyPlayerFixtureUiModel.x;
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(c88.a);
        KSerializer W6 = l98.W(h75.a);
        KSerializer W7 = l98.W((KSerializer) joaVarArr[14].getValue());
        KSerializer W8 = l98.W((KSerializer) joaVarArr[15].getValue());
        KSerializer W9 = l98.W(a7aVar);
        KSerializer W10 = l98.W(a7aVar);
        KSerializer W11 = l98.W(a7aVar);
        KSerializer W12 = l98.W(a7aVar);
        KSerializer W13 = l98.W((KSerializer) joaVarArr[20].getValue());
        KSerializer W14 = l98.W((KSerializer) joaVarArr[21].getValue());
        KSerializer W15 = l98.W((KSerializer) joaVarArr[22].getValue());
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, W, W2, W3, uhiVar, a7aVar, a7aVar, uhiVar, uhiVar, W4, W5, W6, lkb.a, uhiVar, W7, W8, W9, W10, W11, W12, W13, W14, W15};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        int i;
        Integer num5;
        Integer num6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerFixtureUiModel.x;
        long j = 0;
        Integer num7 = null;
        o68 o68Var = null;
        p68 p68Var = null;
        Double d = null;
        Integer num8 = null;
        Integer num9 = null;
        Float f = null;
        int i2 = 0;
        Integer num10 = null;
        rd7 rd7Var = null;
        ad7 ad7Var = null;
        Integer num11 = null;
        Integer num12 = null;
        sd7 sd7Var = null;
        int i3 = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        int i4 = 0;
        String str4 = null;
        int i5 = 0;
        Integer num13 = null;
        Integer num14 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num7;
                    num2 = num9;
                    num3 = num11;
                    z = false;
                    num11 = num3;
                    num7 = num;
                    num9 = num2;
                case 0:
                    num = num7;
                    num2 = num9;
                    num3 = num11;
                    i4 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    num11 = num3;
                    num7 = num;
                    num9 = num2;
                case 1:
                    num = num7;
                    num2 = num9;
                    num3 = num11;
                    num13 = (Integer) b.i(serialDescriptor, 1, a7a.a, num13);
                    i2 |= 2;
                    num14 = num14;
                    num11 = num3;
                    num7 = num;
                    num9 = num2;
                case 2:
                    num = num7;
                    num2 = num9;
                    num3 = num11;
                    num14 = (Integer) b.i(serialDescriptor, 2, a7a.a, num14);
                    i2 |= 4;
                    num11 = num3;
                    num7 = num;
                    num9 = num2;
                case 3:
                    num = num7;
                    num2 = num9;
                    num11 = (Integer) b.i(serialDescriptor, 3, a7a.a, num11);
                    i2 |= 8;
                    num7 = num;
                    num9 = num2;
                case 4:
                    num5 = num7;
                    num6 = num9;
                    str4 = b.n(serialDescriptor, 4);
                    i2 |= 16;
                    num9 = num6;
                    num7 = num5;
                case 5:
                    num5 = num7;
                    num6 = num9;
                    i5 = b.l(serialDescriptor, 5);
                    i2 |= 32;
                    num9 = num6;
                    num7 = num5;
                case 6:
                    num5 = num7;
                    num6 = num9;
                    i3 = b.l(serialDescriptor, 6);
                    i2 |= 64;
                    num9 = num6;
                    num7 = num5;
                case 7:
                    num5 = num7;
                    num6 = num9;
                    str = b.n(serialDescriptor, 7);
                    i2 |= 128;
                    num9 = num6;
                    num7 = num5;
                case 8:
                    num5 = num7;
                    num6 = num9;
                    str2 = b.n(serialDescriptor, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num9 = num6;
                    num7 = num5;
                case 9:
                    num5 = num7;
                    num9 = (Integer) b.i(serialDescriptor, 9, a7a.a, num9);
                    i2 |= 512;
                    num11 = num11;
                    num7 = num5;
                case 10:
                    num2 = num9;
                    num4 = num11;
                    f = (Float) b.i(serialDescriptor, 10, c88.a, f);
                    i2 |= 1024;
                    num11 = num4;
                    num9 = num2;
                case 11:
                    num2 = num9;
                    num4 = num11;
                    d = (Double) b.i(serialDescriptor, 11, h75.a, d);
                    i2 |= a.o;
                    num11 = num4;
                    num9 = num2;
                case 12:
                    num2 = num9;
                    j = b.g(serialDescriptor, 12);
                    i2 |= 4096;
                    num9 = num2;
                case 13:
                    num2 = num9;
                    str3 = b.n(serialDescriptor, 13);
                    i2 |= 8192;
                    num9 = num2;
                case 14:
                    num2 = num9;
                    num4 = num11;
                    p68Var = (p68) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), p68Var);
                    i2 |= 16384;
                    num11 = num4;
                    num9 = num2;
                case 15:
                    num2 = num9;
                    num4 = num11;
                    o68Var = (o68) b.i(serialDescriptor, 15, (dy4) joaVarArr[15].getValue(), o68Var);
                    i = 32768;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                case 16:
                    num2 = num9;
                    num4 = num11;
                    num7 = (Integer) b.i(serialDescriptor, 16, a7a.a, num7);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                case 17:
                    num2 = num9;
                    num4 = num11;
                    num8 = (Integer) b.i(serialDescriptor, 17, a7a.a, num8);
                    i = 131072;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                case 18:
                    num2 = num9;
                    num4 = num11;
                    num10 = (Integer) b.i(serialDescriptor, 18, a7a.a, num10);
                    i = 262144;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                case 19:
                    num2 = num9;
                    num4 = num11;
                    num12 = (Integer) b.i(serialDescriptor, 19, a7a.a, num12);
                    i = 524288;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                case 20:
                    num2 = num9;
                    num4 = num11;
                    sd7Var = (sd7) b.i(serialDescriptor, 20, (dy4) joaVarArr[20].getValue(), sd7Var);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                case 21:
                    num2 = num9;
                    num4 = num11;
                    rd7Var = (rd7) b.i(serialDescriptor, 21, (dy4) joaVarArr[21].getValue(), rd7Var);
                    i = 2097152;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                case 22:
                    num4 = num11;
                    num2 = num9;
                    ad7Var = (ad7) b.i(serialDescriptor, 22, (dy4) joaVarArr[22].getValue(), ad7Var);
                    i = 4194304;
                    i2 |= i;
                    num11 = num4;
                    num9 = num2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num15 = num9;
        Integer num16 = num11;
        Integer num17 = num13;
        Integer num18 = num14;
        b.c(serialDescriptor);
        return new FantasyPlayerFixtureUiModel(i2, i4, num17, num18, num16, str4, i5, i3, str, str2, num15, f, d, j, str3, p68Var, o68Var, num7, num8, num10, num12, sd7Var, rd7Var, ad7Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj;
        encoder.getClass();
        fantasyPlayerFixtureUiModel.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerFixtureUiModel.x;
        b.u(0, fantasyPlayerFixtureUiModel.a, serialDescriptor);
        a7a a7aVar = a7a.a;
        b.h(serialDescriptor, 1, a7aVar, fantasyPlayerFixtureUiModel.b);
        b.h(serialDescriptor, 2, a7aVar, fantasyPlayerFixtureUiModel.c);
        b.h(serialDescriptor, 3, a7aVar, fantasyPlayerFixtureUiModel.d);
        b.y(serialDescriptor, 4, fantasyPlayerFixtureUiModel.e);
        b.u(5, fantasyPlayerFixtureUiModel.f, serialDescriptor);
        b.u(6, fantasyPlayerFixtureUiModel.g, serialDescriptor);
        b.y(serialDescriptor, 7, fantasyPlayerFixtureUiModel.h);
        b.y(serialDescriptor, 8, fantasyPlayerFixtureUiModel.i);
        b.h(serialDescriptor, 9, a7aVar, fantasyPlayerFixtureUiModel.j);
        b.h(serialDescriptor, 10, c88.a, fantasyPlayerFixtureUiModel.k);
        b.h(serialDescriptor, 11, h75.a, fantasyPlayerFixtureUiModel.l);
        b.E(serialDescriptor, 12, fantasyPlayerFixtureUiModel.m);
        b.y(serialDescriptor, 13, fantasyPlayerFixtureUiModel.n);
        b.h(serialDescriptor, 14, (KSerializer) joaVarArr[14].getValue(), fantasyPlayerFixtureUiModel.o);
        b.h(serialDescriptor, 15, (KSerializer) joaVarArr[15].getValue(), fantasyPlayerFixtureUiModel.p);
        b.h(serialDescriptor, 16, a7aVar, fantasyPlayerFixtureUiModel.q);
        b.h(serialDescriptor, 17, a7aVar, fantasyPlayerFixtureUiModel.r);
        b.h(serialDescriptor, 18, a7aVar, fantasyPlayerFixtureUiModel.s);
        b.h(serialDescriptor, 19, a7aVar, fantasyPlayerFixtureUiModel.t);
        b.h(serialDescriptor, 20, (KSerializer) joaVarArr[20].getValue(), fantasyPlayerFixtureUiModel.u);
        b.h(serialDescriptor, 21, (KSerializer) joaVarArr[21].getValue(), fantasyPlayerFixtureUiModel.v);
        b.h(serialDescriptor, 22, (KSerializer) joaVarArr[22].getValue(), fantasyPlayerFixtureUiModel.w);
        b.c(serialDescriptor);
    }
}
