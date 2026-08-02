package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.dy4;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BasketballTopTeamsStatistics$$serializer implements iw8 {

    @NotNull
    public static final BasketballTopTeamsStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketballTopTeamsStatistics$$serializer basketballTopTeamsStatistics$$serializer = new BasketballTopTeamsStatistics$$serializer();
        INSTANCE = basketballTopTeamsStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics", basketballTopTeamsStatistics$$serializer, 23);
        uyeVar.j("points", false);
        uyeVar.j("pointsAgainst", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("fieldGoalsPercentage", false);
        uyeVar.j("fieldGoalsPercentageAgainst", false);
        uyeVar.j("freeThrowsPercentage", false);
        uyeVar.j("threePointsPercentage", false);
        uyeVar.j("threePointsPercentageAgainst", false);
        uyeVar.j("threePointsMade", false);
        uyeVar.j("fastbreakPoints", false);
        uyeVar.j("assists", false);
        uyeVar.j("rebounds", false);
        uyeVar.j("defensiveRebounds", false);
        uyeVar.j("offensiveRebounds", false);
        uyeVar.j("steals", false);
        uyeVar.j("turnovers", false);
        uyeVar.j("blocks", false);
        uyeVar.j("trueShootingPercentage", false);
        uyeVar.j("effectiveFieldGoalPercentage", false);
        uyeVar.j("pace", false);
        uyeVar.j("offensiveRating", false);
        uyeVar.j("defensiveRating", false);
        uyeVar.j("netRating", false);
        descriptor = uyeVar;
    }

    private BasketballTopTeamsStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = BasketballTopTeamsStatistics.$childSerializers;
        return new KSerializer[]{l98.W((KSerializer) joaVarArr[0].getValue()), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W((KSerializer) joaVarArr[2].getValue()), l98.W((KSerializer) joaVarArr[3].getValue()), l98.W((KSerializer) joaVarArr[4].getValue()), l98.W((KSerializer) joaVarArr[5].getValue()), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W((KSerializer) joaVarArr[8].getValue()), l98.W((KSerializer) joaVarArr[9].getValue()), l98.W((KSerializer) joaVarArr[10].getValue()), l98.W((KSerializer) joaVarArr[11].getValue()), l98.W((KSerializer) joaVarArr[12].getValue()), l98.W((KSerializer) joaVarArr[13].getValue()), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W((KSerializer) joaVarArr[15].getValue()), l98.W((KSerializer) joaVarArr[16].getValue()), l98.W((KSerializer) joaVarArr[17].getValue()), l98.W((KSerializer) joaVarArr[18].getValue()), l98.W((KSerializer) joaVarArr[19].getValue()), l98.W((KSerializer) joaVarArr[20].getValue()), l98.W((KSerializer) joaVarArr[21].getValue()), l98.W((KSerializer) joaVarArr[22].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BasketballTopTeamsStatistics deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        List list;
        List list2;
        List list3;
        List list4;
        int i;
        List list5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = BasketballTopTeamsStatistics.$childSerializers;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        List list11 = null;
        int i2 = 0;
        List list12 = null;
        List list13 = null;
        List list14 = null;
        List list15 = null;
        List list16 = null;
        List list17 = null;
        List list18 = null;
        int i3 = 1;
        boolean z = true;
        List list19 = null;
        List list20 = null;
        List list21 = null;
        List list22 = null;
        List list23 = null;
        List list24 = null;
        List list25 = null;
        List list26 = null;
        List list27 = null;
        List list28 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    list5 = list8;
                    z = false;
                    list7 = list7;
                    i3 = 1;
                    list19 = list19;
                    list8 = list5;
                case 0:
                    list = list6;
                    i2 |= 1;
                    list20 = list20;
                    list7 = list7;
                    list8 = list8;
                    i3 = 1;
                    list19 = (List) b.i(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), list19);
                    list6 = list;
                case 1:
                    List list29 = list7;
                    list5 = list8;
                    int i4 = i3;
                    list20 = (List) b.i(serialDescriptor, i4, (dy4) joaVarArr[i3].getValue(), list20);
                    i2 |= 2;
                    list21 = list21;
                    list7 = list29;
                    list6 = list6;
                    i3 = i4;
                    list8 = list5;
                case 2:
                    list = list6;
                    list2 = list7;
                    list3 = list8;
                    list21 = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list21);
                    i2 |= 4;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 3:
                    list = list6;
                    list2 = list7;
                    list3 = list8;
                    list22 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list22);
                    i2 |= 8;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 4:
                    list = list6;
                    list2 = list7;
                    list3 = list8;
                    list23 = (List) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list23);
                    i2 |= 16;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 5:
                    list = list6;
                    list2 = list7;
                    list3 = list8;
                    list24 = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list24);
                    i2 |= 32;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 6:
                    list = list6;
                    list2 = list7;
                    list3 = list8;
                    list25 = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list25);
                    i2 |= 64;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 7:
                    list = list6;
                    list2 = list7;
                    list3 = list8;
                    list26 = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), list26);
                    i2 |= 128;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 8:
                    list = list6;
                    list2 = list7;
                    list3 = list8;
                    list27 = (List) b.i(serialDescriptor, 8, (dy4) joaVarArr[8].getValue(), list27);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 9:
                    list = list6;
                    list3 = list8;
                    list2 = list7;
                    list28 = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), list28);
                    i2 |= 512;
                    list7 = list2;
                    list8 = list3;
                    list6 = list;
                case 10:
                    list3 = list8;
                    list = list6;
                    list7 = (List) b.i(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), list7);
                    i2 |= 1024;
                    list8 = list3;
                    list6 = list;
                case 11:
                    list5 = list8;
                    list6 = (List) b.i(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), list6);
                    i2 |= a.o;
                    list7 = list7;
                    list8 = list5;
                case 12:
                    list = list6;
                    list4 = list7;
                    list10 = (List) b.i(serialDescriptor, 12, (dy4) joaVarArr[12].getValue(), list10);
                    i2 |= 4096;
                    list7 = list4;
                    list6 = list;
                case 13:
                    list = list6;
                    list4 = list7;
                    list12 = (List) b.i(serialDescriptor, 13, (dy4) joaVarArr[13].getValue(), list12);
                    i2 |= 8192;
                    list7 = list4;
                    list6 = list;
                case 14:
                    list = list6;
                    list4 = list7;
                    list13 = (List) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), list13);
                    i2 |= 16384;
                    list7 = list4;
                    list6 = list;
                case 15:
                    list = list6;
                    list4 = list7;
                    list14 = (List) b.i(serialDescriptor, 15, (dy4) joaVarArr[15].getValue(), list14);
                    i = 32768;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                case 16:
                    list = list6;
                    list4 = list7;
                    list15 = (List) b.i(serialDescriptor, 16, (dy4) joaVarArr[16].getValue(), list15);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                case 17:
                    list = list6;
                    list4 = list7;
                    list16 = (List) b.i(serialDescriptor, 17, (dy4) joaVarArr[17].getValue(), list16);
                    i = 131072;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                case 18:
                    list = list6;
                    list4 = list7;
                    list17 = (List) b.i(serialDescriptor, 18, (dy4) joaVarArr[18].getValue(), list17);
                    i = 262144;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                case 19:
                    list = list6;
                    list4 = list7;
                    list18 = (List) b.i(serialDescriptor, 19, (dy4) joaVarArr[19].getValue(), list18);
                    i = 524288;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                case 20:
                    list = list6;
                    list4 = list7;
                    list11 = (List) b.i(serialDescriptor, 20, (dy4) joaVarArr[20].getValue(), list11);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                case 21:
                    list = list6;
                    list4 = list7;
                    list9 = (List) b.i(serialDescriptor, 21, (dy4) joaVarArr[21].getValue(), list9);
                    i = 2097152;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                case 22:
                    list4 = list7;
                    list = list6;
                    list8 = (List) b.i(serialDescriptor, 22, (dy4) joaVarArr[22].getValue(), list8);
                    i = 4194304;
                    i2 |= i;
                    list7 = list4;
                    list6 = list;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        List list30 = list7;
        List list31 = list8;
        List list32 = list19;
        List list33 = list20;
        List list34 = list21;
        b.c(serialDescriptor);
        List list35 = list28;
        List list36 = list18;
        return new BasketballTopTeamsStatistics(i2, list32, list33, list34, list22, list23, list24, list25, list26, list27, list35, list30, list6, list10, list12, list13, list14, list15, list16, list17, list36, list11, list9, list31, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketballTopTeamsStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BasketballTopTeamsStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
