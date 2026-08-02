package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.PenaltyShotIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$PenaltyShotIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$PenaltyShotIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$PenaltyShotIncident$$serializer incident$PenaltyShotIncident$$serializer = new Incident$PenaltyShotIncident$$serializer();
        INSTANCE = incident$PenaltyShotIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.PenaltyShotIncident", incident$PenaltyShotIncident$$serializer, 19);
        uyeVar.j("id", false);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("playerName", false);
        uyeVar.j("description", false);
        uyeVar.j("sequence", false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("penaltyHistory", false);
        uyeVar.j("goalkeeperPenaltyHistory", false);
        uyeVar.j("footballPassingNetworkAction", false);
        uyeVar.j("reversedPeriodTime", true);
        uyeVar.j("reversedPeriodTimeSeconds", true);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j("timeSeconds", true);
        descriptor = uyeVar;
    }

    private Incident$PenaltyShotIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Incident.PenaltyShotIncident.$childSerializers;
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        KSerializer W2 = l98.W(gz1.a);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(Player$$serializer.INSTANCE);
        KSerializer W8 = l98.W(uhiVar);
        KSerializer W9 = l98.W(uhiVar);
        KSerializer W10 = l98.W(a7aVar);
        PlayerPenaltyHistoryResponse$$serializer playerPenaltyHistoryResponse$$serializer = PlayerPenaltyHistoryResponse$$serializer.INSTANCE;
        return new KSerializer[]{W, uhiVar, W2, W3, W4, W5, W6, W7, W8, W9, W10, uhiVar, l98.W(playerPenaltyHistoryResponse$$serializer), l98.W(playerPenaltyHistoryResponse$$serializer), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.PenaltyShotIncident deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Integer num;
        Integer num2;
        int i;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse;
        Integer num3;
        Integer num4;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2;
        Integer num5;
        Integer num6;
        Integer num7;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Incident.PenaltyShotIncident.$childSerializers;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse3 = null;
        Integer num8 = null;
        String str = null;
        String str2 = null;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse4 = null;
        Player player = null;
        int i2 = 0;
        Integer num9 = null;
        List list = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        boolean z = true;
        String str3 = null;
        String str4 = null;
        Integer num15 = null;
        Boolean bool = null;
        Integer num16 = null;
        Integer num17 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    playerPenaltyHistoryResponse = playerPenaltyHistoryResponse3;
                    num3 = num13;
                    num4 = num15;
                    z = false;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse;
                    num15 = num4;
                    num13 = num3;
                case 0:
                    playerPenaltyHistoryResponse = playerPenaltyHistoryResponse3;
                    num3 = num13;
                    num4 = (Integer) b.i(serialDescriptor, 0, a7a.a, num15);
                    i2 |= 1;
                    bool = bool;
                    num14 = num14;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse;
                    num15 = num4;
                    num13 = num3;
                case 1:
                    playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse3;
                    num5 = num13;
                    str3 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    num13 = num5;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse2;
                case 2:
                    playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse3;
                    num6 = num13;
                    num7 = num14;
                    bool = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool);
                    i2 |= 4;
                    num13 = num6;
                    num14 = num7;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse2;
                case 3:
                    playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse3;
                    num6 = num13;
                    num7 = num14;
                    num16 = (Integer) b.i(serialDescriptor, 3, a7a.a, num16);
                    i2 |= 8;
                    num13 = num6;
                    num14 = num7;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse2;
                case 4:
                    playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse3;
                    num7 = num14;
                    num6 = num13;
                    num17 = (Integer) b.i(serialDescriptor, 4, a7a.a, num17);
                    i2 |= 16;
                    num13 = num6;
                    num14 = num7;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse2;
                case 5:
                    playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse3;
                    num7 = num14;
                    num13 = (Integer) b.i(serialDescriptor, 5, a7a.a, num13);
                    i2 |= 32;
                    num14 = num7;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse2;
                case 6:
                    num5 = num13;
                    playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse3;
                    num14 = (Integer) b.i(serialDescriptor, 6, a7a.a, num14);
                    i2 |= 64;
                    num13 = num5;
                    playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse2;
                case 7:
                    num = num13;
                    num2 = num14;
                    player = (Player) b.i(serialDescriptor, 7, Player$$serializer.INSTANCE, player);
                    i2 |= 128;
                    num13 = num;
                    num14 = num2;
                case 8:
                    num = num13;
                    num2 = num14;
                    str2 = (String) b.i(serialDescriptor, 8, uhi.a, str2);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num13 = num;
                    num14 = num2;
                case 9:
                    num = num13;
                    num2 = num14;
                    str = (String) b.i(serialDescriptor, 9, uhi.a, str);
                    i2 |= 512;
                    num13 = num;
                    num14 = num2;
                case 10:
                    num = num13;
                    num2 = num14;
                    num8 = (Integer) b.i(serialDescriptor, 10, a7a.a, num8);
                    i2 |= 1024;
                    num13 = num;
                    num14 = num2;
                case 11:
                    num3 = num13;
                    str4 = b.n(serialDescriptor, 11);
                    i2 |= a.o;
                    num13 = num3;
                case 12:
                    num = num13;
                    num2 = num14;
                    playerPenaltyHistoryResponse3 = (PlayerPenaltyHistoryResponse) b.i(serialDescriptor, 12, PlayerPenaltyHistoryResponse$$serializer.INSTANCE, playerPenaltyHistoryResponse3);
                    i2 |= 4096;
                    num13 = num;
                    num14 = num2;
                case 13:
                    num = num13;
                    num2 = num14;
                    playerPenaltyHistoryResponse4 = (PlayerPenaltyHistoryResponse) b.i(serialDescriptor, 13, PlayerPenaltyHistoryResponse$$serializer.INSTANCE, playerPenaltyHistoryResponse4);
                    i2 |= 8192;
                    num13 = num;
                    num14 = num2;
                case 14:
                    num = num13;
                    num2 = num14;
                    list = (List) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), list);
                    i2 |= 16384;
                    num13 = num;
                    num14 = num2;
                case 15:
                    num = num13;
                    num2 = num14;
                    num9 = (Integer) b.i(serialDescriptor, 15, a7a.a, num9);
                    i = 32768;
                    i2 |= i;
                    num13 = num;
                    num14 = num2;
                case 16:
                    num = num13;
                    num2 = num14;
                    num10 = (Integer) b.i(serialDescriptor, 16, a7a.a, num10);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num13 = num;
                    num14 = num2;
                case 17:
                    num = num13;
                    num2 = num14;
                    num11 = (Integer) b.i(serialDescriptor, 17, a7a.a, num11);
                    i = 131072;
                    i2 |= i;
                    num13 = num;
                    num14 = num2;
                case 18:
                    num = num13;
                    num2 = num14;
                    num12 = (Integer) b.i(serialDescriptor, 18, a7a.a, num12);
                    i = 262144;
                    i2 |= i;
                    num13 = num;
                    num14 = num2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num18 = num13;
        Integer num19 = num14;
        Integer num20 = num15;
        Boolean bool2 = bool;
        b.c(serialDescriptor);
        Integer num21 = num11;
        return new Incident.PenaltyShotIncident(i2, num20, str3, bool2, num16, num17, num18, num19, player, str2, str, num8, str4, playerPenaltyHistoryResponse3, playerPenaltyHistoryResponse4, list, num9, num10, num21, num12, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.PenaltyShotIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.PenaltyShotIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
