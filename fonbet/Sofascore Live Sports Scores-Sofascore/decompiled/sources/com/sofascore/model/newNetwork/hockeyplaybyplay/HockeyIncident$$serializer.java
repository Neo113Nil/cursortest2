package com.sofascore.model.newNetwork.hockeyplaybyplay;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class HockeyIncident$$serializer implements iw8 {

    @NotNull
    public static final HockeyIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HockeyIncident$$serializer hockeyIncident$$serializer = new HockeyIncident$$serializer();
        INSTANCE = hockeyIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident", hockeyIncident$$serializer, 24);
        uyeVar.j("id", false);
        uyeVar.j("text", false);
        uyeVar.j("type", false);
        uyeVar.j("goalType", false);
        uyeVar.j("periodName", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("reversedPeriodTimeSeconds", false);
        uyeVar.j(IronSourceConstants.EVENTS_DURATION, false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("penalizedPlayer", false);
        uyeVar.j("penaltyServedByPlayer", false);
        uyeVar.j("playerIn", false);
        uyeVar.j("penaltyDrawnByPlayer", false);
        uyeVar.j(Incident.GoalIncident.TYPE_GOALKEEPER, false);
        uyeVar.j("assist1", false);
        uyeVar.j("assist2", false);
        uyeVar.j("location", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("zone", false);
        uyeVar.j("strength", false);
        uyeVar.j("penaltyType", false);
        uyeVar.j("shouldReverseTeams", true);
        descriptor = uyeVar;
    }

    private HockeyIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(HockeyGoalTypeSerializer.INSTANCE);
        KSerializer W2 = l98.W(uhiVar);
        gz1 gz1Var = gz1.a;
        KSerializer W3 = l98.W(gz1Var);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        return new KSerializer[]{a7aVar, uhiVar, HockeyIncidentTypeSerializer.INSTANCE, W, W2, W3, W4, a7aVar, W5, l98.W(player$$serializer), l98.W(player$$serializer), l98.W(player$$serializer), l98.W(player$$serializer), l98.W(player$$serializer), l98.W(player$$serializer), l98.W(player$$serializer), l98.W(player$$serializer), l98.W(Point2D$$serializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar), l98.W(HockeyFaceOffZoneSerializer.INSTANCE), l98.W(HockeyPlayTypeSerializer.INSTANCE), l98.W(HockeySuspension$$serializer.INSTANCE), gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final HockeyIncident deserialize(@NotNull Decoder decoder) {
        Player player;
        HockeySuspension hockeySuspension;
        Player player2;
        Player player3;
        Player player4;
        Player player5;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Player player6 = null;
        Player player7 = null;
        HockeySuspension hockeySuspension2 = null;
        Player player8 = null;
        HockeyPlayType hockeyPlayType = null;
        int i2 = 0;
        Player player9 = null;
        Player player10 = null;
        Player player11 = null;
        Point2D point2D = null;
        Integer num = null;
        Integer num2 = null;
        HockeyFaceOffZone hockeyFaceOffZone = null;
        Player player12 = null;
        boolean z = true;
        int i3 = 0;
        String str = null;
        int i4 = 0;
        HockeyIncidentType hockeyIncidentType = null;
        HockeyGoalType hockeyGoalType = null;
        String str2 = null;
        Boolean bool = null;
        Integer num3 = null;
        Integer num4 = null;
        Player player13 = null;
        boolean z2 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    player = player7;
                    hockeySuspension = hockeySuspension2;
                    z = false;
                    player7 = player;
                    hockeySuspension2 = hockeySuspension;
                case 0:
                    player2 = player6;
                    player3 = player7;
                    hockeySuspension = hockeySuspension2;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 1:
                    player2 = player6;
                    hockeySuspension = hockeySuspension2;
                    str = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 2:
                    player2 = player6;
                    player3 = player7;
                    hockeySuspension = hockeySuspension2;
                    hockeyIncidentType = (HockeyIncidentType) b.w(serialDescriptor, 2, HockeyIncidentTypeSerializer.INSTANCE, hockeyIncidentType);
                    i2 |= 4;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 3:
                    player2 = player6;
                    player3 = player7;
                    hockeySuspension = hockeySuspension2;
                    hockeyGoalType = (HockeyGoalType) b.i(serialDescriptor, 3, HockeyGoalTypeSerializer.INSTANCE, hockeyGoalType);
                    i2 |= 8;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 4:
                    player2 = player6;
                    player3 = player7;
                    hockeySuspension = hockeySuspension2;
                    str2 = (String) b.i(serialDescriptor, 4, uhi.a, str2);
                    i2 |= 16;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 5:
                    player2 = player6;
                    player3 = player7;
                    hockeySuspension = hockeySuspension2;
                    bool = (Boolean) b.i(serialDescriptor, 5, gz1.a, bool);
                    i2 |= 32;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 6:
                    player2 = player6;
                    player3 = player7;
                    hockeySuspension = hockeySuspension2;
                    num3 = (Integer) b.i(serialDescriptor, 6, a7a.a, num3);
                    i2 |= 64;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 7:
                    player2 = player6;
                    hockeySuspension = hockeySuspension2;
                    i4 = b.l(serialDescriptor, 7);
                    i2 |= 128;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 8:
                    player2 = player6;
                    player3 = player7;
                    hockeySuspension = hockeySuspension2;
                    num4 = (Integer) b.i(serialDescriptor, 8, a7a.a, num4);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 9:
                    player2 = player6;
                    hockeySuspension = hockeySuspension2;
                    player3 = player7;
                    player13 = (Player) b.i(serialDescriptor, 9, Player$$serializer.INSTANCE, player13);
                    i2 |= 512;
                    player7 = player3;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 10:
                    hockeySuspension = hockeySuspension2;
                    player2 = player6;
                    player7 = (Player) b.i(serialDescriptor, 10, Player$$serializer.INSTANCE, player7);
                    i2 |= 1024;
                    player6 = player2;
                    hockeySuspension2 = hockeySuspension;
                case 11:
                    player = player7;
                    hockeySuspension = hockeySuspension2;
                    player6 = (Player) b.i(serialDescriptor, 11, Player$$serializer.INSTANCE, player6);
                    i2 |= a.o;
                    player7 = player;
                    hockeySuspension2 = hockeySuspension;
                case 12:
                    player4 = player6;
                    player5 = player7;
                    player8 = (Player) b.i(serialDescriptor, 12, Player$$serializer.INSTANCE, player8);
                    i2 |= 4096;
                    player7 = player5;
                    player6 = player4;
                case 13:
                    player4 = player6;
                    player5 = player7;
                    player9 = (Player) b.i(serialDescriptor, 13, Player$$serializer.INSTANCE, player9);
                    i2 |= 8192;
                    player7 = player5;
                    player6 = player4;
                case 14:
                    player4 = player6;
                    player5 = player7;
                    player10 = (Player) b.i(serialDescriptor, 14, Player$$serializer.INSTANCE, player10);
                    i2 |= 16384;
                    player7 = player5;
                    player6 = player4;
                case 15:
                    player4 = player6;
                    player5 = player7;
                    player12 = (Player) b.i(serialDescriptor, 15, Player$$serializer.INSTANCE, player12);
                    i = 32768;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 16:
                    player4 = player6;
                    player5 = player7;
                    player11 = (Player) b.i(serialDescriptor, 16, Player$$serializer.INSTANCE, player11);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 17:
                    player4 = player6;
                    player5 = player7;
                    point2D = (Point2D) b.i(serialDescriptor, 17, Point2D$$serializer.INSTANCE, point2D);
                    i = 131072;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 18:
                    player4 = player6;
                    player5 = player7;
                    num = (Integer) b.i(serialDescriptor, 18, a7a.a, num);
                    i = 262144;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 19:
                    player4 = player6;
                    player5 = player7;
                    num2 = (Integer) b.i(serialDescriptor, 19, a7a.a, num2);
                    i = 524288;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 20:
                    player4 = player6;
                    player5 = player7;
                    hockeyFaceOffZone = (HockeyFaceOffZone) b.i(serialDescriptor, 20, HockeyFaceOffZoneSerializer.INSTANCE, hockeyFaceOffZone);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 21:
                    player4 = player6;
                    player5 = player7;
                    hockeyPlayType = (HockeyPlayType) b.i(serialDescriptor, 21, HockeyPlayTypeSerializer.INSTANCE, hockeyPlayType);
                    i = 2097152;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 22:
                    player5 = player7;
                    player4 = player6;
                    hockeySuspension2 = (HockeySuspension) b.i(serialDescriptor, 22, HockeySuspension$$serializer.INSTANCE, hockeySuspension2);
                    i = 4194304;
                    i2 |= i;
                    player7 = player5;
                    player6 = player4;
                case 23:
                    z2 = b.B(serialDescriptor, 23);
                    i2 |= 8388608;
                    player7 = player7;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Player player14 = player7;
        HockeySuspension hockeySuspension3 = hockeySuspension2;
        HockeyIncidentType hockeyIncidentType2 = hockeyIncidentType;
        b.c(serialDescriptor);
        HockeyFaceOffZone hockeyFaceOffZone2 = hockeyFaceOffZone;
        Integer num5 = num3;
        Point2D point2D2 = point2D;
        Integer num6 = num4;
        Integer num7 = num;
        return new HockeyIncident(i2, i3, str, hockeyIncidentType2, hockeyGoalType, str2, bool, num5, i4, num6, player13, player14, player6, player8, player9, player10, player12, player11, point2D2, num7, num2, hockeyFaceOffZone2, hockeyPlayType, hockeySuspension3, z2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull HockeyIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        HockeyIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
