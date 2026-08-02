package com.sofascore.model.newNetwork.statistics;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.BaseballPitchType;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dy4;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/BaseballPitch.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/BaseballPitch;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/BaseballPitch;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/BaseballPitch;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BaseballPitch$$serializer implements iw8 {

    @NotNull
    public static final BaseballPitch$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BaseballPitch$$serializer baseballPitch$$serializer = new BaseballPitch$$serializer();
        INSTANCE = baseballPitch$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.BaseballPitch", baseballPitch$$serializer, 23);
        uyeVar.j("pitcher", false);
        uyeVar.j("pitcherTeam", false);
        uyeVar.j("hitter", false);
        uyeVar.j("hitterTeam", false);
        uyeVar.j("pitchCode", false);
        uyeVar.j("pitchDescription", false);
        uyeVar.j("type", false);
        uyeVar.j("pitchSpeed", false);
        uyeVar.j("outcome", false);
        uyeVar.j("pitchCount", false);
        uyeVar.j("pitchX", false);
        uyeVar.j("pitchY", false);
        uyeVar.j("mlbX", true);
        uyeVar.j("mlbY", true);
        uyeVar.j("mlbHitCordX", true);
        uyeVar.j("mlbHitCordY", true);
        uyeVar.j("mlbZone", true);
        uyeVar.j("balls", false);
        uyeVar.j("strikes", false);
        uyeVar.j("outs", false);
        uyeVar.j("pitcherHand", false);
        uyeVar.j("hitterHand", false);
        uyeVar.j("runners", false);
        descriptor = uyeVar;
    }

    private BaseballPitch$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = BaseballPitch.$childSerializers;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        KSerializer W = l98.W(player$$serializer);
        KSerializer W2 = l98.W((KSerializer) joaVarArr[1].getValue());
        KSerializer W3 = l98.W(player$$serializer);
        KSerializer W4 = l98.W((KSerializer) joaVarArr[3].getValue());
        KSerializer W5 = l98.W((KSerializer) joaVarArr[4].getValue());
        uhi uhiVar = uhi.a;
        KSerializer W6 = l98.W(uhiVar);
        KSerializer W7 = l98.W(uhiVar);
        KSerializer W8 = l98.W(h75.a);
        KSerializer W9 = l98.W((KSerializer) joaVarArr[8].getValue());
        a7a a7aVar = a7a.a;
        KSerializer W10 = l98.W(a7aVar);
        KSerializer W11 = l98.W(a7aVar);
        KSerializer W12 = l98.W(a7aVar);
        c88 c88Var = c88.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, W7, W8, W9, W10, W11, W12, l98.W(c88Var), l98.W(c88Var), l98.W(c88Var), l98.W(c88Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W((KSerializer) joaVarArr[20].getValue()), l98.W((KSerializer) joaVarArr[21].getValue()), l98.W((KSerializer) joaVarArr[22].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BaseballPitch deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Integer num;
        Integer num2;
        List list;
        Integer num3;
        int i;
        List list2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = BaseballPitch.$childSerializers;
        Integer num4 = null;
        Integer num5 = null;
        List list3 = null;
        PlayerHand playerHand = null;
        Float f = null;
        PlayerHand playerHand2 = null;
        int i2 = 0;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        int i3 = 1;
        boolean z = true;
        Player player = null;
        Team team = null;
        Player player2 = null;
        Team team2 = null;
        BaseballPitchType baseballPitchType = null;
        String str = null;
        String str2 = null;
        Double d = null;
        BaseballActionOutcome baseballActionOutcome = null;
        Integer num10 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    list2 = list3;
                    z = false;
                    num5 = num5;
                    i3 = 1;
                    player = player;
                    list3 = list2;
                case 0:
                    num = num4;
                    i2 |= 1;
                    team = team;
                    num5 = num5;
                    list3 = list3;
                    i3 = 1;
                    player = (Player) b.i(serialDescriptor, 0, Player$$serializer.INSTANCE, player);
                    num4 = num;
                case 1:
                    Integer num11 = num5;
                    list2 = list3;
                    int i4 = i3;
                    team = (Team) b.i(serialDescriptor, i4, (dy4) joaVarArr[i3].getValue(), team);
                    i2 |= 2;
                    player2 = player2;
                    num5 = num11;
                    num4 = num4;
                    i3 = i4;
                    list3 = list2;
                case 2:
                    num = num4;
                    num2 = num5;
                    list = list3;
                    player2 = (Player) b.i(serialDescriptor, 2, Player$$serializer.INSTANCE, player2);
                    i2 |= 4;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 3:
                    num = num4;
                    num2 = num5;
                    list = list3;
                    team2 = (Team) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), team2);
                    i2 |= 8;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 4:
                    num = num4;
                    num2 = num5;
                    list = list3;
                    baseballPitchType = (BaseballPitchType) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), baseballPitchType);
                    i2 |= 16;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 5:
                    num = num4;
                    num2 = num5;
                    list = list3;
                    str = (String) b.i(serialDescriptor, 5, uhi.a, str);
                    i2 |= 32;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 6:
                    num = num4;
                    num2 = num5;
                    list = list3;
                    str2 = (String) b.i(serialDescriptor, 6, uhi.a, str2);
                    i2 |= 64;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 7:
                    num = num4;
                    num2 = num5;
                    list = list3;
                    d = (Double) b.i(serialDescriptor, 7, h75.a, d);
                    i2 |= 128;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 8:
                    num = num4;
                    num2 = num5;
                    list = list3;
                    baseballActionOutcome = (BaseballActionOutcome) b.i(serialDescriptor, 8, (dy4) joaVarArr[8].getValue(), baseballActionOutcome);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 9:
                    num = num4;
                    list = list3;
                    num2 = num5;
                    num10 = (Integer) b.i(serialDescriptor, 9, a7a.a, num10);
                    i2 |= 512;
                    num5 = num2;
                    list3 = list;
                    num4 = num;
                case 10:
                    list = list3;
                    num = num4;
                    num5 = (Integer) b.i(serialDescriptor, 10, a7a.a, num5);
                    i2 |= 1024;
                    list3 = list;
                    num4 = num;
                case 11:
                    list2 = list3;
                    num4 = (Integer) b.i(serialDescriptor, 11, a7a.a, num4);
                    i2 |= a.o;
                    num5 = num5;
                    list3 = list2;
                case 12:
                    num = num4;
                    num3 = num5;
                    f = (Float) b.i(serialDescriptor, 12, c88.a, f);
                    i2 |= 4096;
                    num5 = num3;
                    num4 = num;
                case 13:
                    num = num4;
                    num3 = num5;
                    f2 = (Float) b.i(serialDescriptor, 13, c88.a, f2);
                    i2 |= 8192;
                    num5 = num3;
                    num4 = num;
                case 14:
                    num = num4;
                    num3 = num5;
                    f3 = (Float) b.i(serialDescriptor, 14, c88.a, f3);
                    i2 |= 16384;
                    num5 = num3;
                    num4 = num;
                case 15:
                    num = num4;
                    num3 = num5;
                    f4 = (Float) b.i(serialDescriptor, 15, c88.a, f4);
                    i = 32768;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                case 16:
                    num = num4;
                    num3 = num5;
                    num6 = (Integer) b.i(serialDescriptor, 16, a7a.a, num6);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                case 17:
                    num = num4;
                    num3 = num5;
                    num7 = (Integer) b.i(serialDescriptor, 17, a7a.a, num7);
                    i = 131072;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                case 18:
                    num = num4;
                    num3 = num5;
                    num8 = (Integer) b.i(serialDescriptor, 18, a7a.a, num8);
                    i = 262144;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                case 19:
                    num = num4;
                    num3 = num5;
                    num9 = (Integer) b.i(serialDescriptor, 19, a7a.a, num9);
                    i = 524288;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                case 20:
                    num = num4;
                    num3 = num5;
                    playerHand2 = (PlayerHand) b.i(serialDescriptor, 20, (dy4) joaVarArr[20].getValue(), playerHand2);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                case 21:
                    num = num4;
                    num3 = num5;
                    playerHand = (PlayerHand) b.i(serialDescriptor, 21, (dy4) joaVarArr[21].getValue(), playerHand);
                    i = 2097152;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                case 22:
                    num3 = num5;
                    num = num4;
                    list3 = (List) b.i(serialDescriptor, 22, (dy4) joaVarArr[22].getValue(), list3);
                    i = 4194304;
                    i2 |= i;
                    num5 = num3;
                    num4 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num12 = num5;
        List list4 = list3;
        Player player3 = player;
        Team team3 = team;
        Player player4 = player2;
        b.c(serialDescriptor);
        Integer num13 = num10;
        Integer num14 = num9;
        return new BaseballPitch(i2, player3, team3, player4, team2, baseballPitchType, str, str2, d, baseballActionOutcome, num13, num12, num4, f, f2, f3, f4, num6, num7, num8, num14, playerHand2, playerHand, list4, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BaseballPitch value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BaseballPitch.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
