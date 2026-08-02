package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.SearchResponseKt;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.GoalIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$GoalIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$GoalIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$GoalIncident$$serializer incident$GoalIncident$$serializer = new Incident$GoalIncident$$serializer();
        INSTANCE = incident$GoalIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.GoalIncident", incident$GoalIncident$$serializer, 24);
        uyeVar.j("id", false);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("reversedPeriodTime", false);
        uyeVar.j("reversedPeriodTimeSeconds", false);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j("timeSeconds", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("playerName", false);
        uyeVar.j("assist1", false);
        uyeVar.j("assist1Name", false);
        uyeVar.j("assist2", false);
        uyeVar.j("assist2Name", false);
        uyeVar.j("reason", false);
        uyeVar.j(SearchResponseKt.MANAGER_ENTITY, false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("footballPassingNetworkAction", false);
        uyeVar.j("seasonCount", true);
        uyeVar.j("assist1SeasonCount", true);
        uyeVar.j("assist2SeasonCount", true);
        descriptor = uyeVar;
    }

    private Incident$GoalIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Incident.GoalIncident.$childSerializers;
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        KSerializer W2 = l98.W(gz1.a);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(a7aVar);
        KSerializer W8 = l98.W(a7aVar);
        KSerializer W9 = l98.W(a7aVar);
        KSerializer W10 = l98.W(a7aVar);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        return new KSerializer[]{W, uhiVar, W2, W3, W4, W5, W6, W7, W8, W9, W10, l98.W(player$$serializer), l98.W(uhiVar), l98.W(player$$serializer), l98.W(uhiVar), l98.W(player$$serializer), l98.W(uhiVar), l98.W(uhiVar), l98.W(Manager$$serializer.INSTANCE), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[20].getValue()), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.GoalIncident deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Player player;
        String str;
        int i;
        Player player2;
        Integer num;
        Integer num2;
        Player player3;
        Integer num3;
        Player player4;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Incident.GoalIncident.$childSerializers;
        Player player5 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str3 = null;
        List list = null;
        int i2 = 0;
        String str4 = null;
        Player player6 = null;
        Player player7 = null;
        String str5 = null;
        String str6 = null;
        Manager manager = null;
        String str7 = null;
        boolean z = true;
        String str8 = null;
        Integer num7 = null;
        Boolean bool = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    player2 = player5;
                    num = num4;
                    num2 = num7;
                    z = false;
                    num4 = num;
                    num7 = num2;
                    player5 = player2;
                case 0:
                    player2 = player5;
                    num = num4;
                    num2 = (Integer) b.i(serialDescriptor, 0, a7a.a, num7);
                    i2 |= 1;
                    bool = bool;
                    str3 = str3;
                    num4 = num;
                    num7 = num2;
                    player5 = player2;
                case 1:
                    player3 = player5;
                    num3 = num4;
                    str8 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    player5 = player3;
                    num4 = num3;
                case 2:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    bool = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool);
                    i2 |= 4;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 3:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    num8 = (Integer) b.i(serialDescriptor, 3, a7a.a, num8);
                    i2 |= 8;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 4:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    num9 = (Integer) b.i(serialDescriptor, 4, a7a.a, num9);
                    i2 |= 16;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 5:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    num10 = (Integer) b.i(serialDescriptor, 5, a7a.a, num10);
                    i2 |= 32;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 6:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    num11 = (Integer) b.i(serialDescriptor, 6, a7a.a, num11);
                    i2 |= 64;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 7:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    num12 = (Integer) b.i(serialDescriptor, 7, a7a.a, num12);
                    i2 |= 128;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 8:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    num13 = (Integer) b.i(serialDescriptor, 8, a7a.a, num13);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 9:
                    player4 = player5;
                    num3 = num4;
                    str2 = str3;
                    num14 = (Integer) b.i(serialDescriptor, 9, a7a.a, num14);
                    i2 |= 512;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 10:
                    num3 = num4;
                    str2 = str3;
                    player4 = player5;
                    num15 = (Integer) b.i(serialDescriptor, 10, a7a.a, num15);
                    i2 |= 1024;
                    player5 = player4;
                    str3 = str2;
                    num4 = num3;
                case 11:
                    num3 = num4;
                    str2 = str3;
                    player5 = (Player) b.i(serialDescriptor, 11, Player$$serializer.INSTANCE, player5);
                    i2 |= a.o;
                    str3 = str2;
                    num4 = num3;
                case 12:
                    player3 = player5;
                    num3 = num4;
                    str3 = (String) b.i(serialDescriptor, 12, uhi.a, str3);
                    i2 |= 4096;
                    player5 = player3;
                    num4 = num3;
                case 13:
                    player = player5;
                    str = str3;
                    player6 = (Player) b.i(serialDescriptor, 13, Player$$serializer.INSTANCE, player6);
                    i2 |= 8192;
                    player5 = player;
                    str3 = str;
                case 14:
                    player = player5;
                    str = str3;
                    str4 = (String) b.i(serialDescriptor, 14, uhi.a, str4);
                    i2 |= 16384;
                    player5 = player;
                    str3 = str;
                case 15:
                    player = player5;
                    str = str3;
                    player7 = (Player) b.i(serialDescriptor, 15, Player$$serializer.INSTANCE, player7);
                    i = 32768;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 16:
                    player = player5;
                    str = str3;
                    str5 = (String) b.i(serialDescriptor, 16, uhi.a, str5);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 17:
                    player = player5;
                    str = str3;
                    str6 = (String) b.i(serialDescriptor, 17, uhi.a, str6);
                    i = 131072;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 18:
                    player = player5;
                    str = str3;
                    manager = (Manager) b.i(serialDescriptor, 18, Manager$$serializer.INSTANCE, manager);
                    i = 262144;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 19:
                    player = player5;
                    str = str3;
                    str7 = (String) b.i(serialDescriptor, 19, uhi.a, str7);
                    i = 524288;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 20:
                    player = player5;
                    str = str3;
                    list = (List) b.i(serialDescriptor, 20, (dy4) joaVarArr[20].getValue(), list);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 21:
                    player = player5;
                    str = str3;
                    num6 = (Integer) b.i(serialDescriptor, 21, a7a.a, num6);
                    i = 2097152;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 22:
                    player = player5;
                    str = str3;
                    num5 = (Integer) b.i(serialDescriptor, 22, a7a.a, num5);
                    i = 4194304;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                case 23:
                    player = player5;
                    str = str3;
                    num4 = (Integer) b.i(serialDescriptor, 23, a7a.a, num4);
                    i = 8388608;
                    i2 |= i;
                    player5 = player;
                    str3 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num16 = num4;
        Integer num17 = num7;
        Boolean bool2 = bool;
        b.c(serialDescriptor);
        Integer num18 = num14;
        String str9 = str7;
        Integer num19 = num11;
        String str10 = str5;
        return new Incident.GoalIncident(i2, num17, str8, bool2, num8, num9, num10, num19, num12, num13, num18, num15, player5, str3, player6, str4, player7, str10, str6, manager, str9, list, num6, num5, num16, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.GoalIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.GoalIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
