package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ie7 implements iw8 {
    public static final ie7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ie7 ie7Var = new ie7();
        a = ie7Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel", ie7Var, 27);
        uyeVar.j("id", false);
        uyeVar.j("playerId", false);
        uyeVar.j("teamId", false);
        uyeVar.j("teamName", false);
        uyeVar.j("teamNameCode", false);
        uyeVar.j("name", false);
        uyeVar.j("shortName", false);
        uyeVar.j("lastName", false);
        uyeVar.j("position", false);
        uyeVar.j("averagePoints", false);
        uyeVar.j("price", false);
        uyeVar.j("priceValue", false);
        uyeVar.j("ownedPercentage", false);
        uyeVar.j("form", false);
        uyeVar.j("totalPoints", false);
        uyeVar.j("totalPlayersInPosition", false);
        uyeVar.j("averagePointsRank", false);
        uyeVar.j("totalPointsRank", false);
        uyeVar.j("formRank", false);
        uyeVar.j("ownedRank", false);
        uyeVar.j("formValue", false);
        uyeVar.j("totalPointsValue", false);
        uyeVar.j("averagePointsValue", false);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("averageRating", false);
        uyeVar.j("averageRatingRank", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = FantasyPlayerUiModel.B;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, uhiVar, uhiVar, uhiVar, l98.W(uhiVar), l98.W(uhiVar), joaVarArr[8].getValue(), uhiVar, uhiVar, l98.W(c88Var), l98.W(c88Var), uhiVar, uhiVar, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(c88Var), l98.W(a7aVar), l98.W(c88Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(c88Var), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        Float f;
        int i;
        int i2;
        Integer num;
        Integer num2;
        Float f2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerUiModel.B;
        Integer num3 = null;
        Float f3 = null;
        Integer num4 = null;
        Float f4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i3 = 0;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Float f5 = null;
        Integer num10 = null;
        Float f6 = null;
        Integer num11 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        int i5 = 0;
        int i6 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        rz6 rz6Var = null;
        Float f7 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num4;
                    z = false;
                    f3 = f3;
                    num4 = num;
                case 0:
                    num2 = num3;
                    f2 = f3;
                    num = num4;
                    i4 = b.l(serialDescriptor, 0);
                    i3 |= 1;
                    f3 = f2;
                    num3 = num2;
                    num4 = num;
                case 1:
                    num2 = num3;
                    num = num4;
                    i5 = b.l(serialDescriptor, 1);
                    i3 |= 2;
                    num3 = num2;
                    num4 = num;
                case 2:
                    num2 = num3;
                    num = num4;
                    i6 = b.l(serialDescriptor, 2);
                    i3 |= 4;
                    num3 = num2;
                    num4 = num;
                case 3:
                    num2 = num3;
                    num = num4;
                    str5 = b.n(serialDescriptor, 3);
                    i3 |= 8;
                    num3 = num2;
                    num4 = num;
                case 4:
                    num2 = num3;
                    num = num4;
                    str6 = b.n(serialDescriptor, 4);
                    i3 |= 16;
                    num3 = num2;
                    num4 = num;
                case 5:
                    num2 = num3;
                    num = num4;
                    str7 = b.n(serialDescriptor, 5);
                    i3 |= 32;
                    num3 = num2;
                    num4 = num;
                case 6:
                    num2 = num3;
                    f2 = f3;
                    num = num4;
                    str8 = (String) b.i(serialDescriptor, 6, uhi.a, str8);
                    i3 |= 64;
                    f3 = f2;
                    num3 = num2;
                    num4 = num;
                case 7:
                    num2 = num3;
                    f2 = f3;
                    num = num4;
                    str9 = (String) b.i(serialDescriptor, 7, uhi.a, str9);
                    i3 |= 128;
                    f3 = f2;
                    num3 = num2;
                    num4 = num;
                case 8:
                    num2 = num3;
                    f2 = f3;
                    num = num4;
                    rz6Var = (rz6) b.w(serialDescriptor, 8, (dy4) joaVarArr[8].getValue(), rz6Var);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    f3 = f2;
                    num3 = num2;
                    num4 = num;
                case 9:
                    num2 = num3;
                    num = num4;
                    str = b.n(serialDescriptor, 9);
                    i3 |= 512;
                    num3 = num2;
                    num4 = num;
                case 10:
                    num2 = num3;
                    num = num4;
                    str2 = b.n(serialDescriptor, 10);
                    i3 |= 1024;
                    num3 = num2;
                    num4 = num;
                case 11:
                    num2 = num3;
                    num = num4;
                    f2 = f3;
                    f7 = (Float) b.i(serialDescriptor, 11, c88.a, f7);
                    i3 |= a.o;
                    f3 = f2;
                    num3 = num2;
                    num4 = num;
                case 12:
                    num2 = num3;
                    num = num4;
                    f3 = (Float) b.i(serialDescriptor, 12, c88.a, f3);
                    i3 |= 4096;
                    num3 = num2;
                    num4 = num;
                case 13:
                    f = f3;
                    str3 = b.n(serialDescriptor, 13);
                    i3 |= 8192;
                    f3 = f;
                case 14:
                    f = f3;
                    str4 = b.n(serialDescriptor, 14);
                    i3 |= 16384;
                    f3 = f;
                case 15:
                    f = f3;
                    i = i3;
                    num3 = (Integer) b.i(serialDescriptor, 15, a7a.a, num3);
                    i2 = 32768;
                    i3 = i | i2;
                    f3 = f;
                case 16:
                    f = f3;
                    i = i3;
                    num5 = (Integer) b.i(serialDescriptor, 16, a7a.a, num5);
                    i2 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i3 = i | i2;
                    f3 = f;
                case 17:
                    f = f3;
                    i = i3;
                    num7 = (Integer) b.i(serialDescriptor, 17, a7a.a, num7);
                    i2 = 131072;
                    i3 = i | i2;
                    f3 = f;
                case 18:
                    f = f3;
                    i = i3;
                    num8 = (Integer) b.i(serialDescriptor, 18, a7a.a, num8);
                    i2 = 262144;
                    i3 = i | i2;
                    f3 = f;
                case 19:
                    f = f3;
                    i = i3;
                    num9 = (Integer) b.i(serialDescriptor, 19, a7a.a, num9);
                    i2 = 524288;
                    i3 = i | i2;
                    f3 = f;
                case 20:
                    f = f3;
                    i = i3;
                    f5 = (Float) b.i(serialDescriptor, 20, c88.a, f5);
                    i2 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i3 = i | i2;
                    f3 = f;
                case 21:
                    f = f3;
                    i = i3;
                    num10 = (Integer) b.i(serialDescriptor, 21, a7a.a, num10);
                    i2 = 2097152;
                    i3 = i | i2;
                    f3 = f;
                case 22:
                    f = f3;
                    i = i3;
                    f6 = (Float) b.i(serialDescriptor, 22, c88.a, f6);
                    i2 = 4194304;
                    i3 = i | i2;
                    f3 = f;
                case 23:
                    f = f3;
                    i = i3;
                    num11 = (Integer) b.i(serialDescriptor, 23, a7a.a, num11);
                    i2 = 8388608;
                    i3 = i | i2;
                    f3 = f;
                case 24:
                    f = f3;
                    i = i3;
                    num6 = (Integer) b.i(serialDescriptor, 24, a7a.a, num6);
                    i2 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i3 = i | i2;
                    f3 = f;
                case 25:
                    f = f3;
                    i = i3;
                    f4 = (Float) b.i(serialDescriptor, 25, c88.a, f4);
                    i2 = 33554432;
                    i3 = i | i2;
                    f3 = f;
                case 26:
                    f = f3;
                    i = i3;
                    num4 = (Integer) b.i(serialDescriptor, 26, a7a.a, num4);
                    i2 = 67108864;
                    i3 = i | i2;
                    f3 = f;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Float f8 = f3;
        Integer num12 = num4;
        String str10 = str8;
        b.c(serialDescriptor);
        Float f9 = f5;
        String str11 = str9;
        rz6 rz6Var2 = rz6Var;
        Integer num13 = num10;
        Float f10 = f6;
        return new FantasyPlayerUiModel(i3, i4, i5, i6, str5, str6, str7, str10, str11, rz6Var2, str, str2, f7, f8, str3, str4, num3, num5, num7, num8, num9, f9, num13, f10, num11, num6, f4, num12);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyPlayerUiModel fantasyPlayerUiModel = (FantasyPlayerUiModel) obj;
        encoder.getClass();
        fantasyPlayerUiModel.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerUiModel.B;
        b.u(0, fantasyPlayerUiModel.a, serialDescriptor);
        b.u(1, fantasyPlayerUiModel.b, serialDescriptor);
        b.u(2, fantasyPlayerUiModel.c, serialDescriptor);
        b.y(serialDescriptor, 3, fantasyPlayerUiModel.d);
        b.y(serialDescriptor, 4, fantasyPlayerUiModel.e);
        b.y(serialDescriptor, 5, fantasyPlayerUiModel.f);
        uhi uhiVar = uhi.a;
        b.h(serialDescriptor, 6, uhiVar, fantasyPlayerUiModel.g);
        b.h(serialDescriptor, 7, uhiVar, fantasyPlayerUiModel.h);
        b.f(serialDescriptor, 8, (KSerializer) joaVarArr[8].getValue(), fantasyPlayerUiModel.i);
        b.y(serialDescriptor, 9, fantasyPlayerUiModel.j);
        b.y(serialDescriptor, 10, fantasyPlayerUiModel.k);
        c88 c88Var = c88.a;
        b.h(serialDescriptor, 11, c88Var, fantasyPlayerUiModel.l);
        b.h(serialDescriptor, 12, c88Var, fantasyPlayerUiModel.m);
        b.y(serialDescriptor, 13, fantasyPlayerUiModel.n);
        b.y(serialDescriptor, 14, fantasyPlayerUiModel.o);
        a7a a7aVar = a7a.a;
        b.h(serialDescriptor, 15, a7aVar, fantasyPlayerUiModel.p);
        b.h(serialDescriptor, 16, a7aVar, fantasyPlayerUiModel.q);
        b.h(serialDescriptor, 17, a7aVar, fantasyPlayerUiModel.r);
        b.h(serialDescriptor, 18, a7aVar, fantasyPlayerUiModel.s);
        b.h(serialDescriptor, 19, a7aVar, fantasyPlayerUiModel.t);
        b.h(serialDescriptor, 20, c88Var, fantasyPlayerUiModel.u);
        b.h(serialDescriptor, 21, a7aVar, fantasyPlayerUiModel.v);
        b.h(serialDescriptor, 22, c88Var, fantasyPlayerUiModel.w);
        b.h(serialDescriptor, 23, a7aVar, fantasyPlayerUiModel.x);
        b.h(serialDescriptor, 24, a7aVar, fantasyPlayerUiModel.y);
        b.h(serialDescriptor, 25, c88Var, fantasyPlayerUiModel.z);
        b.h(serialDescriptor, 26, a7aVar, fantasyPlayerUiModel.A);
        b.c(serialDescriptor);
    }
}
