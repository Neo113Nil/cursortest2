package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Incident;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.SubstitutionIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$SubstitutionIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$SubstitutionIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$SubstitutionIncident$$serializer incident$SubstitutionIncident$$serializer = new Incident$SubstitutionIncident$$serializer();
        INSTANCE = incident$SubstitutionIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.SubstitutionIncident", incident$SubstitutionIncident$$serializer, 17);
        uyeVar.j("id", false);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("reversedPeriodTime", false);
        uyeVar.j("reversedPeriodTimeSeconds", false);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j("playerIn", false);
        uyeVar.j("playerOut", false);
        uyeVar.j("injury", false);
        uyeVar.j("playerNameIn", false);
        uyeVar.j("playerNameOut", false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("timeSeconds", true);
        uyeVar.j("homeScore", true);
        uyeVar.j("awayScore", true);
        descriptor = uyeVar;
    }

    private Incident$SubstitutionIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        gz1 gz1Var = gz1.a;
        KSerializer W2 = l98.W(gz1Var);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(a7aVar);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        return new KSerializer[]{W, uhiVar, W2, W3, W4, W5, W6, W7, l98.W(player$$serializer), l98.W(player$$serializer), gz1Var, l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.SubstitutionIncident deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        int i;
        String str;
        Integer num3;
        Integer num4;
        String str2;
        Integer num5;
        Integer num6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        String str3 = null;
        String str4 = null;
        Player player = null;
        String str5 = null;
        Player player2 = null;
        int i2 = 0;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        boolean z = true;
        boolean z2 = false;
        String str6 = null;
        Integer num15 = null;
        Boolean bool = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str3;
                    num3 = num10;
                    num4 = num15;
                    z = false;
                    str3 = str;
                    num15 = num4;
                    num10 = num3;
                case 0:
                    str = str3;
                    num3 = num10;
                    num4 = (Integer) b.i(serialDescriptor, 0, a7a.a, num15);
                    i2 |= 1;
                    bool = bool;
                    num11 = num11;
                    str3 = str;
                    num15 = num4;
                    num10 = num3;
                case 1:
                    str2 = str3;
                    num5 = num10;
                    str6 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    num10 = num5;
                    str3 = str2;
                case 2:
                    str2 = str3;
                    num6 = num11;
                    bool = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool);
                    i2 |= 4;
                    num10 = num10;
                    num11 = num6;
                    str3 = str2;
                case 3:
                    str2 = str3;
                    num6 = num11;
                    num10 = (Integer) b.i(serialDescriptor, 3, a7a.a, num10);
                    i2 |= 8;
                    num11 = num6;
                    str3 = str2;
                case 4:
                    num5 = num10;
                    str2 = str3;
                    num11 = (Integer) b.i(serialDescriptor, 4, a7a.a, num11);
                    i2 |= 16;
                    num10 = num5;
                    str3 = str2;
                case 5:
                    num = num10;
                    num2 = num11;
                    num12 = (Integer) b.i(serialDescriptor, 5, a7a.a, num12);
                    i2 |= 32;
                    num10 = num;
                    num11 = num2;
                case 6:
                    num = num10;
                    num2 = num11;
                    num13 = (Integer) b.i(serialDescriptor, 6, a7a.a, num13);
                    i2 |= 64;
                    num10 = num;
                    num11 = num2;
                case 7:
                    num = num10;
                    num2 = num11;
                    num14 = (Integer) b.i(serialDescriptor, 7, a7a.a, num14);
                    i2 |= 128;
                    num10 = num;
                    num11 = num2;
                case 8:
                    num = num10;
                    num2 = num11;
                    player2 = (Player) b.i(serialDescriptor, 8, Player$$serializer.INSTANCE, player2);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num10 = num;
                    num11 = num2;
                case 9:
                    num = num10;
                    num2 = num11;
                    player = (Player) b.i(serialDescriptor, 9, Player$$serializer.INSTANCE, player);
                    i2 |= 512;
                    num10 = num;
                    num11 = num2;
                case 10:
                    num3 = num10;
                    z2 = b.B(serialDescriptor, 10);
                    i2 |= 1024;
                    num10 = num3;
                case 11:
                    num = num10;
                    num2 = num11;
                    str4 = (String) b.i(serialDescriptor, 11, uhi.a, str4);
                    i2 |= a.o;
                    num10 = num;
                    num11 = num2;
                case 12:
                    num = num10;
                    num2 = num11;
                    str3 = (String) b.i(serialDescriptor, 12, uhi.a, str3);
                    i2 |= 4096;
                    num10 = num;
                    num11 = num2;
                case 13:
                    num = num10;
                    num2 = num11;
                    str5 = (String) b.i(serialDescriptor, 13, uhi.a, str5);
                    i2 |= 8192;
                    num10 = num;
                    num11 = num2;
                case 14:
                    num = num10;
                    num2 = num11;
                    num8 = (Integer) b.i(serialDescriptor, 14, a7a.a, num8);
                    i2 |= 16384;
                    num10 = num;
                    num11 = num2;
                case 15:
                    num = num10;
                    num2 = num11;
                    num7 = (Integer) b.i(serialDescriptor, 15, a7a.a, num7);
                    i = 32768;
                    i2 |= i;
                    num10 = num;
                    num11 = num2;
                case 16:
                    num = num10;
                    num2 = num11;
                    num9 = (Integer) b.i(serialDescriptor, 16, a7a.a, num9);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num10 = num;
                    num11 = num2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num16 = num10;
        Integer num17 = num11;
        Integer num18 = num15;
        Boolean bool2 = bool;
        b.c(serialDescriptor);
        return new Incident.SubstitutionIncident(i2, num18, str6, bool2, num16, num17, num12, num13, num14, player2, player, z2, str4, str3, str5, num8, num7, num9, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.SubstitutionIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.SubstitutionIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
