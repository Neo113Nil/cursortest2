package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class IceHockeyTopStatsPerGameStatistics$$serializer implements iw8 {

    @NotNull
    public static final IceHockeyTopStatsPerGameStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        IceHockeyTopStatsPerGameStatistics$$serializer iceHockeyTopStatsPerGameStatistics$$serializer = new IceHockeyTopStatsPerGameStatistics$$serializer();
        INSTANCE = iceHockeyTopStatsPerGameStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopStatsPerGameStatistics", iceHockeyTopStatsPerGameStatistics$$serializer, 16);
        uyeVar.j("points", false);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("powerPlayGoals", false);
        uyeVar.j("shortHandedGoals", false);
        uyeVar.j("powerPlayAssists", false);
        uyeVar.j("shortHandedAssists", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("secondsPlayed", false);
        uyeVar.j("blocked", false);
        uyeVar.j("hits", false);
        uyeVar.j("penaltyMinutes", false);
        uyeVar.j("saves", false);
        uyeVar.j("evenSaves", false);
        uyeVar.j("powerPlaySaves", false);
        uyeVar.j("shortHandedSaves", false);
        descriptor = uyeVar;
    }

    private IceHockeyTopStatsPerGameStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = IceHockeyTopStatsPerGameStatistics.$childSerializers;
        return new KSerializer[]{l98.W((KSerializer) joaVarArr[0].getValue()), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W((KSerializer) joaVarArr[2].getValue()), l98.W((KSerializer) joaVarArr[3].getValue()), l98.W((KSerializer) joaVarArr[4].getValue()), l98.W((KSerializer) joaVarArr[5].getValue()), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W((KSerializer) joaVarArr[8].getValue()), l98.W((KSerializer) joaVarArr[9].getValue()), l98.W((KSerializer) joaVarArr[10].getValue()), l98.W((KSerializer) joaVarArr[11].getValue()), l98.W((KSerializer) joaVarArr[12].getValue()), l98.W((KSerializer) joaVarArr[13].getValue()), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W((KSerializer) joaVarArr[15].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final IceHockeyTopStatsPerGameStatistics deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = IceHockeyTopStatsPerGameStatistics.$childSerializers;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        List list11 = null;
        List list12 = null;
        int i = 0;
        List list13 = null;
        List list14 = null;
        List list15 = null;
        List list16 = null;
        List list17 = null;
        List list18 = null;
        List list19 = null;
        int i2 = 1;
        boolean z = true;
        List list20 = null;
        List list21 = null;
        List list22 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    list4 = list7;
                    list5 = list17;
                    list6 = list20;
                    z = false;
                    list8 = list8;
                    list17 = list5;
                    i2 = 1;
                    list20 = list6;
                    list7 = list4;
                case 0:
                    list4 = list7;
                    list5 = list17;
                    list6 = (List) b.i(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), list20);
                    i |= 1;
                    list8 = list8;
                    list16 = list16;
                    list17 = list5;
                    i2 = 1;
                    list20 = list6;
                    list7 = list4;
                case 1:
                    list4 = list7;
                    List list23 = list17;
                    int i3 = i2;
                    list21 = (List) b.i(serialDescriptor, i3, (dy4) joaVarArr[i2].getValue(), list21);
                    i |= 2;
                    list22 = list22;
                    list16 = list16;
                    list17 = list23;
                    i2 = i3;
                    list7 = list4;
                case 2:
                    list = list7;
                    list2 = list17;
                    list22 = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list22);
                    i |= 4;
                    list16 = list16;
                    list7 = list;
                    list17 = list2;
                case 3:
                    list = list7;
                    list2 = list17;
                    list16 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list16);
                    i |= 8;
                    list7 = list;
                    list17 = list2;
                case 4:
                    list4 = list7;
                    list17 = (List) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list17);
                    i |= 16;
                    list16 = list16;
                    list7 = list4;
                case 5:
                    list3 = list16;
                    list2 = list17;
                    list18 = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list18);
                    i |= 32;
                    list16 = list3;
                    list17 = list2;
                case 6:
                    list3 = list16;
                    list2 = list17;
                    list19 = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list19);
                    i |= 64;
                    list16 = list3;
                    list17 = list2;
                case 7:
                    list3 = list16;
                    list2 = list17;
                    list12 = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), list12);
                    i |= 128;
                    list16 = list3;
                    list17 = list2;
                case 8:
                    list3 = list16;
                    list2 = list17;
                    list10 = (List) b.i(serialDescriptor, 8, (dy4) joaVarArr[8].getValue(), list10);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    list16 = list3;
                    list17 = list2;
                case 9:
                    list3 = list16;
                    list2 = list17;
                    list9 = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), list9);
                    i |= 512;
                    list16 = list3;
                    list17 = list2;
                case 10:
                    list3 = list16;
                    list2 = list17;
                    list8 = (List) b.i(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), list8);
                    i |= 1024;
                    list16 = list3;
                    list17 = list2;
                case 11:
                    list3 = list16;
                    list2 = list17;
                    list7 = (List) b.i(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), list7);
                    i |= a.o;
                    list16 = list3;
                    list17 = list2;
                case 12:
                    list3 = list16;
                    list2 = list17;
                    list11 = (List) b.i(serialDescriptor, 12, (dy4) joaVarArr[12].getValue(), list11);
                    i |= 4096;
                    list16 = list3;
                    list17 = list2;
                case 13:
                    list3 = list16;
                    list2 = list17;
                    list13 = (List) b.i(serialDescriptor, 13, (dy4) joaVarArr[13].getValue(), list13);
                    i |= 8192;
                    list16 = list3;
                    list17 = list2;
                case 14:
                    list3 = list16;
                    list2 = list17;
                    list14 = (List) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), list14);
                    i |= 16384;
                    list16 = list3;
                    list17 = list2;
                case 15:
                    list3 = list16;
                    list2 = list17;
                    list15 = (List) b.i(serialDescriptor, 15, (dy4) joaVarArr[15].getValue(), list15);
                    i |= 32768;
                    list16 = list3;
                    list17 = list2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        List list24 = list7;
        List list25 = list17;
        b.c(serialDescriptor);
        return new IceHockeyTopStatsPerGameStatistics(i, list20, list21, list22, list16, list25, list18, list19, list12, list10, list9, list8, list24, list11, list13, list14, list15, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull IceHockeyTopStatsPerGameStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        IceHockeyTopStatsPerGameStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
