package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeySuspension;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeySuspension$$serializer;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.SuspensionIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$SuspensionIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$SuspensionIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$SuspensionIncident$$serializer incident$SuspensionIncident$$serializer = new Incident$SuspensionIncident$$serializer();
        INSTANCE = incident$SuspensionIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.SuspensionIncident", incident$SuspensionIncident$$serializer, 19);
        uyeVar.j("id", false);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("reversedPeriodTime", false);
        uyeVar.j("reversedPeriodTimeSeconds", false);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("playerName", false);
        uyeVar.j("reason", false);
        uyeVar.j(IronSourceConstants.EVENTS_DURATION, false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("iceHockeyPenaltyType", false);
        uyeVar.j("suspensionServedByPlayer", false);
        uyeVar.j("suspensionDrawnByPlayer", true);
        uyeVar.j("timeSeconds", true);
        uyeVar.j("homeScore", true);
        uyeVar.j("awayScore", true);
        descriptor = uyeVar;
    }

    private Incident$SuspensionIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        KSerializer W2 = l98.W(gz1.a);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(a7aVar);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        return new KSerializer[]{W, uhiVar, W2, W3, W4, W5, W6, W7, l98.W(player$$serializer), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(HockeySuspension$$serializer.INSTANCE), l98.W(player$$serializer), l98.W(player$$serializer), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.SuspensionIncident deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Player player = null;
        int i2 = 0;
        Player player2 = null;
        HockeySuspension hockeySuspension = null;
        Player player3 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        boolean z = true;
        String str4 = null;
        Integer num16 = null;
        Boolean bool = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num3 = num10;
                    num4 = num14;
                    num5 = num16;
                    z = false;
                    num10 = num3;
                    num16 = num5;
                    num14 = num4;
                case 0:
                    num3 = num10;
                    num4 = num14;
                    num5 = (Integer) b.i(serialDescriptor, 0, a7a.a, num16);
                    i2 |= 1;
                    bool = bool;
                    num15 = num15;
                    num10 = num3;
                    num16 = num5;
                    num14 = num4;
                case 1:
                    num6 = num10;
                    num7 = num14;
                    str4 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    num14 = num7;
                    num10 = num6;
                case 2:
                    num6 = num10;
                    num8 = num14;
                    num9 = num15;
                    bool = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool);
                    i2 |= 4;
                    num14 = num8;
                    num15 = num9;
                    num10 = num6;
                case 3:
                    num6 = num10;
                    num8 = num14;
                    num9 = num15;
                    num17 = (Integer) b.i(serialDescriptor, 3, a7a.a, num17);
                    i2 |= 8;
                    num14 = num8;
                    num15 = num9;
                    num10 = num6;
                case 4:
                    num6 = num10;
                    num8 = num14;
                    num9 = num15;
                    num18 = (Integer) b.i(serialDescriptor, 4, a7a.a, num18);
                    i2 |= 16;
                    num14 = num8;
                    num15 = num9;
                    num10 = num6;
                case 5:
                    num6 = num10;
                    num9 = num15;
                    num8 = num14;
                    num19 = (Integer) b.i(serialDescriptor, 5, a7a.a, num19);
                    i2 |= 32;
                    num14 = num8;
                    num15 = num9;
                    num10 = num6;
                case 6:
                    num6 = num10;
                    num9 = num15;
                    num14 = (Integer) b.i(serialDescriptor, 6, a7a.a, num14);
                    i2 |= 64;
                    num15 = num9;
                    num10 = num6;
                case 7:
                    num7 = num14;
                    num6 = num10;
                    num15 = (Integer) b.i(serialDescriptor, 7, a7a.a, num15);
                    i2 |= 128;
                    num14 = num7;
                    num10 = num6;
                case 8:
                    num = num14;
                    num2 = num15;
                    player = (Player) b.i(serialDescriptor, 8, Player$$serializer.INSTANCE, player);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num14 = num;
                    num15 = num2;
                case 9:
                    num = num14;
                    num2 = num15;
                    str2 = (String) b.i(serialDescriptor, 9, uhi.a, str2);
                    i2 |= 512;
                    num14 = num;
                    num15 = num2;
                case 10:
                    num = num14;
                    num2 = num15;
                    str = (String) b.i(serialDescriptor, 10, uhi.a, str);
                    i2 |= 1024;
                    num14 = num;
                    num15 = num2;
                case 11:
                    num = num14;
                    num2 = num15;
                    num10 = (Integer) b.i(serialDescriptor, 11, a7a.a, num10);
                    i2 |= a.o;
                    num14 = num;
                    num15 = num2;
                case 12:
                    num = num14;
                    num2 = num15;
                    str3 = (String) b.i(serialDescriptor, 12, uhi.a, str3);
                    i2 |= 4096;
                    num14 = num;
                    num15 = num2;
                case 13:
                    num = num14;
                    num2 = num15;
                    hockeySuspension = (HockeySuspension) b.i(serialDescriptor, 13, HockeySuspension$$serializer.INSTANCE, hockeySuspension);
                    i2 |= 8192;
                    num14 = num;
                    num15 = num2;
                case 14:
                    num = num14;
                    num2 = num15;
                    player2 = (Player) b.i(serialDescriptor, 14, Player$$serializer.INSTANCE, player2);
                    i2 |= 16384;
                    num14 = num;
                    num15 = num2;
                case 15:
                    num = num14;
                    num2 = num15;
                    player3 = (Player) b.i(serialDescriptor, 15, Player$$serializer.INSTANCE, player3);
                    i = 32768;
                    i2 |= i;
                    num14 = num;
                    num15 = num2;
                case 16:
                    num = num14;
                    num2 = num15;
                    num11 = (Integer) b.i(serialDescriptor, 16, a7a.a, num11);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num14 = num;
                    num15 = num2;
                case 17:
                    num = num14;
                    num2 = num15;
                    num12 = (Integer) b.i(serialDescriptor, 17, a7a.a, num12);
                    i = 131072;
                    i2 |= i;
                    num14 = num;
                    num15 = num2;
                case 18:
                    num = num14;
                    num2 = num15;
                    num13 = (Integer) b.i(serialDescriptor, 18, a7a.a, num13);
                    i = 262144;
                    i2 |= i;
                    num14 = num;
                    num15 = num2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num20 = num14;
        Integer num21 = num15;
        Integer num22 = num16;
        Boolean bool2 = bool;
        b.c(serialDescriptor);
        Integer num23 = num11;
        return new Incident.SuspensionIncident(i2, num22, str4, bool2, num17, num18, num19, num20, num21, player, str2, str, num10, str3, hockeySuspension, player2, player3, num23, num12, num13, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.SuspensionIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.SuspensionIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
