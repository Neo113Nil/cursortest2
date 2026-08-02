package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.SearchResponseKt;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.CardIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$CardIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$CardIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$CardIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$CardIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$CardIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$CardIncident$$serializer incident$CardIncident$$serializer = new Incident$CardIncident$$serializer();
        INSTANCE = incident$CardIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.CardIncident", incident$CardIncident$$serializer, 18);
        uyeVar.j("id", false);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("playerName", false);
        uyeVar.j("reason", false);
        uyeVar.j(SearchResponseKt.MANAGER_ENTITY, false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("reversedPeriodTime", true);
        uyeVar.j("reversedPeriodTimeSeconds", true);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j("timeSeconds", true);
        uyeVar.j("homeScore", true);
        uyeVar.j("awayScore", true);
        uyeVar.j("benchTime", true);
        uyeVar.j("benchAddedTime", true);
        descriptor = uyeVar;
    }

    private Incident$CardIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, uhiVar, l98.W(gz1.a), l98.W(a7aVar), l98.W(a7aVar), l98.W(Player$$serializer.INSTANCE), l98.W(uhiVar), l98.W(uhiVar), l98.W(Manager$$serializer.INSTANCE), uhiVar, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.CardIncident deserialize(@NotNull Decoder decoder) {
        Integer num;
        Player player;
        int i;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Player player2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Manager manager = null;
        int i2 = 0;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Player player3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        String str4 = null;
        Integer num17 = null;
        Boolean bool = null;
        Integer num18 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num2 = num8;
                    num3 = num16;
                    num4 = num17;
                    z = false;
                    num8 = num2;
                    num17 = num4;
                    num16 = num3;
                case 0:
                    num2 = num8;
                    num3 = num16;
                    num4 = (Integer) b.i(serialDescriptor, 0, a7a.a, num17);
                    i2 |= 1;
                    bool = bool;
                    player3 = player3;
                    num8 = num2;
                    num17 = num4;
                    num16 = num3;
                case 1:
                    num5 = num8;
                    num6 = num16;
                    str4 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    num16 = num6;
                    num8 = num5;
                case 2:
                    num5 = num8;
                    num7 = num16;
                    player2 = player3;
                    bool = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool);
                    i2 |= 4;
                    num16 = num7;
                    player3 = player2;
                    num8 = num5;
                case 3:
                    num5 = num8;
                    player2 = player3;
                    num7 = num16;
                    num18 = (Integer) b.i(serialDescriptor, 3, a7a.a, num18);
                    i2 |= 8;
                    num16 = num7;
                    player3 = player2;
                    num8 = num5;
                case 4:
                    num5 = num8;
                    player2 = player3;
                    num16 = (Integer) b.i(serialDescriptor, 4, a7a.a, num16);
                    i2 |= 16;
                    player3 = player2;
                    num8 = num5;
                case 5:
                    num6 = num16;
                    num5 = num8;
                    player3 = (Player) b.i(serialDescriptor, 5, Player$$serializer.INSTANCE, player3);
                    i2 |= 32;
                    num16 = num6;
                    num8 = num5;
                case 6:
                    num = num16;
                    player = player3;
                    str = (String) b.i(serialDescriptor, 6, uhi.a, str);
                    i2 |= 64;
                    num16 = num;
                    player3 = player;
                case 7:
                    num = num16;
                    player = player3;
                    str2 = (String) b.i(serialDescriptor, 7, uhi.a, str2);
                    i2 |= 128;
                    num16 = num;
                    player3 = player;
                case 8:
                    num = num16;
                    player = player3;
                    manager = (Manager) b.i(serialDescriptor, 8, Manager$$serializer.INSTANCE, manager);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num16 = num;
                    player3 = player;
                case 9:
                    num3 = num16;
                    str3 = b.n(serialDescriptor, 9);
                    i2 |= 512;
                    num16 = num3;
                case 10:
                    num = num16;
                    player = player3;
                    num10 = (Integer) b.i(serialDescriptor, 10, a7a.a, num10);
                    i2 |= 1024;
                    num16 = num;
                    player3 = player;
                case 11:
                    num = num16;
                    player = player3;
                    num9 = (Integer) b.i(serialDescriptor, 11, a7a.a, num9);
                    i2 |= a.o;
                    num16 = num;
                    player3 = player;
                case 12:
                    num = num16;
                    player = player3;
                    num8 = (Integer) b.i(serialDescriptor, 12, a7a.a, num8);
                    i2 |= 4096;
                    num16 = num;
                    player3 = player;
                case 13:
                    num = num16;
                    player = player3;
                    num11 = (Integer) b.i(serialDescriptor, 13, a7a.a, num11);
                    i2 |= 8192;
                    num16 = num;
                    player3 = player;
                case 14:
                    num = num16;
                    player = player3;
                    num13 = (Integer) b.i(serialDescriptor, 14, a7a.a, num13);
                    i2 |= 16384;
                    num16 = num;
                    player3 = player;
                case 15:
                    num = num16;
                    player = player3;
                    num12 = (Integer) b.i(serialDescriptor, 15, a7a.a, num12);
                    i = 32768;
                    i2 |= i;
                    num16 = num;
                    player3 = player;
                case 16:
                    num = num16;
                    player = player3;
                    num14 = (Integer) b.i(serialDescriptor, 16, a7a.a, num14);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num16 = num;
                    player3 = player;
                case 17:
                    num = num16;
                    player = player3;
                    num15 = (Integer) b.i(serialDescriptor, 17, a7a.a, num15);
                    i = 131072;
                    i2 |= i;
                    num16 = num;
                    player3 = player;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num19 = num16;
        Player player4 = player3;
        Integer num20 = num17;
        Boolean bool2 = bool;
        b.c(serialDescriptor);
        Integer num21 = num15;
        return new Incident.CardIncident(i2, num20, str4, bool2, num18, num19, player4, str, str2, manager, str3, num10, num9, num8, num11, num13, num12, num14, num21, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.CardIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.CardIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
