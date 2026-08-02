package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/EsportsGameStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/EsportsGameStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EsportsGameStatistics$$serializer implements iw8 {

    @NotNull
    public static final EsportsGameStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EsportsGameStatistics$$serializer esportsGameStatistics$$serializer = new EsportsGameStatistics$$serializer();
        INSTANCE = esportsGameStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.EsportsGameStatistics", esportsGameStatistics$$serializer, 22);
        uyeVar.j("head", true);
        uyeVar.j("error", true);
        uyeVar.j("bans", false);
        uyeVar.j("cloudDrakeKills", false);
        uyeVar.j("dragonKills", false);
        uyeVar.j("elderDrakeKills", false);
        uyeVar.j("goldEarned", false);
        uyeVar.j("heraldKilled", false);
        uyeVar.j("infernalDrakeKills", false);
        uyeVar.j("chemtechDrakeKills", false);
        uyeVar.j("hextechDrakeKills", false);
        uyeVar.j("inhibitorKills", false);
        uyeVar.j("kills", false);
        uyeVar.j("mountainDrakeKills", false);
        uyeVar.j("nashorKills", false);
        uyeVar.j("oceanDrakeKills", false);
        uyeVar.j("towerKills", false);
        uyeVar.j("barracksDestroyed", false);
        uyeVar.j("barracksRemaining", false);
        uyeVar.j("firstBlood", false);
        uyeVar.j("towersDestroyed", false);
        uyeVar.j("towersRemaining", false);
        descriptor = uyeVar;
    }

    private EsportsGameStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = EsportsGameStatistics.$childSerializers;
        KSerializer W = l98.W(HeadResponse$$serializer.INSTANCE);
        KSerializer W2 = l98.W(ErrorResponse$$serializer.INSTANCE);
        KSerializer W3 = l98.W((KSerializer) joaVarArr[2].getValue());
        a7a a7aVar = a7a.a;
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(a7aVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, W7, l98.W(gz1Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1Var), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EsportsGameStatistics deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        HeadResponse headResponse;
        Integer num4;
        Integer num5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = EsportsGameStatistics.$childSerializers;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        int i2 = 0;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Boolean bool = null;
        boolean z = true;
        HeadResponse headResponse2 = null;
        ErrorResponse errorResponse = null;
        List list = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        Boolean bool2 = null;
        Integer num22 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num3 = num6;
                    headResponse = headResponse2;
                    z = false;
                    num8 = num8;
                    headResponse2 = headResponse;
                    num6 = num3;
                case 0:
                    num3 = num6;
                    headResponse = (HeadResponse) b.i(serialDescriptor, 0, HeadResponse$$serializer.INSTANCE, headResponse2);
                    i2 |= 1;
                    errorResponse = errorResponse;
                    num8 = num8;
                    num7 = num7;
                    headResponse2 = headResponse;
                    num6 = num3;
                case 1:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    errorResponse = (ErrorResponse) b.i(serialDescriptor, 1, ErrorResponse$$serializer.INSTANCE, errorResponse);
                    i2 |= 2;
                    list = list;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 2:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    list = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list);
                    i2 |= 4;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 3:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    num18 = (Integer) b.i(serialDescriptor, 3, a7a.a, num18);
                    i2 |= 8;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 4:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    num19 = (Integer) b.i(serialDescriptor, 4, a7a.a, num19);
                    i2 |= 16;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 5:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    num20 = (Integer) b.i(serialDescriptor, 5, a7a.a, num20);
                    i2 |= 32;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 6:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    num21 = (Integer) b.i(serialDescriptor, 6, a7a.a, num21);
                    i2 |= 64;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 7:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    bool2 = (Boolean) b.i(serialDescriptor, 7, gz1.a, bool2);
                    i2 |= 128;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 8:
                    num3 = num6;
                    num4 = num7;
                    num5 = num8;
                    num22 = (Integer) b.i(serialDescriptor, 8, a7a.a, num22);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num8 = num5;
                    num7 = num4;
                    num6 = num3;
                case 9:
                    num3 = num6;
                    num4 = num7;
                    num8 = (Integer) b.i(serialDescriptor, 9, a7a.a, num8);
                    i2 |= 512;
                    num7 = num4;
                    num6 = num3;
                case 10:
                    num3 = num6;
                    num7 = (Integer) b.i(serialDescriptor, 10, a7a.a, num7);
                    i2 |= 1024;
                    num8 = num8;
                    num6 = num3;
                case 11:
                    num = num7;
                    num2 = num8;
                    num6 = (Integer) b.i(serialDescriptor, 11, a7a.a, num6);
                    i2 |= a.o;
                    num8 = num2;
                    num7 = num;
                case 12:
                    num = num7;
                    num2 = num8;
                    num10 = (Integer) b.i(serialDescriptor, 12, a7a.a, num10);
                    i2 |= 4096;
                    num8 = num2;
                    num7 = num;
                case 13:
                    num = num7;
                    num2 = num8;
                    num12 = (Integer) b.i(serialDescriptor, 13, a7a.a, num12);
                    i2 |= 8192;
                    num8 = num2;
                    num7 = num;
                case 14:
                    num = num7;
                    num2 = num8;
                    num13 = (Integer) b.i(serialDescriptor, 14, a7a.a, num13);
                    i2 |= 16384;
                    num8 = num2;
                    num7 = num;
                case 15:
                    num = num7;
                    num2 = num8;
                    num14 = (Integer) b.i(serialDescriptor, 15, a7a.a, num14);
                    i = 32768;
                    i2 |= i;
                    num8 = num2;
                    num7 = num;
                case 16:
                    num = num7;
                    num2 = num8;
                    num15 = (Integer) b.i(serialDescriptor, 16, a7a.a, num15);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num8 = num2;
                    num7 = num;
                case 17:
                    num = num7;
                    num2 = num8;
                    num16 = (Integer) b.i(serialDescriptor, 17, a7a.a, num16);
                    i = 131072;
                    i2 |= i;
                    num8 = num2;
                    num7 = num;
                case 18:
                    num = num7;
                    num2 = num8;
                    num17 = (Integer) b.i(serialDescriptor, 18, a7a.a, num17);
                    i = 262144;
                    i2 |= i;
                    num8 = num2;
                    num7 = num;
                case 19:
                    num = num7;
                    num2 = num8;
                    bool = (Boolean) b.i(serialDescriptor, 19, gz1.a, bool);
                    i = 524288;
                    i2 |= i;
                    num8 = num2;
                    num7 = num;
                case 20:
                    num = num7;
                    num2 = num8;
                    num11 = (Integer) b.i(serialDescriptor, 20, a7a.a, num11);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    num8 = num2;
                    num7 = num;
                case 21:
                    num2 = num8;
                    num = num7;
                    num9 = (Integer) b.i(serialDescriptor, 21, a7a.a, num9);
                    i = 2097152;
                    i2 |= i;
                    num8 = num2;
                    num7 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num23 = num6;
        Integer num24 = num8;
        HeadResponse headResponse3 = headResponse2;
        ErrorResponse errorResponse2 = errorResponse;
        List list2 = list;
        b.c(serialDescriptor);
        Boolean bool3 = bool;
        return new EsportsGameStatistics(i2, headResponse3, errorResponse2, list2, num18, num19, num20, num21, bool2, num22, num24, num7, num23, num10, num12, num13, num14, num15, num16, num17, bool3, num11, num9, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EsportsGameStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EsportsGameStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
