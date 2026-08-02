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
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RugbyTopTeamsStatistics$$serializer implements iw8 {

    @NotNull
    public static final RugbyTopTeamsStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RugbyTopTeamsStatistics$$serializer rugbyTopTeamsStatistics$$serializer = new RugbyTopTeamsStatistics$$serializer();
        INSTANCE = rugbyTopTeamsStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics", rugbyTopTeamsStatistics$$serializer, 34);
        uyeVar.j("points", false);
        uyeVar.j("tries", false);
        uyeVar.j("penaltyTries", false);
        uyeVar.j("penaltyGoals", false);
        uyeVar.j("conversions", false);
        uyeVar.j("dropGoals", false);
        uyeVar.j("scrumsWon", false);
        uyeVar.j("lineoutsWon", false);
        uyeVar.j("passesSuccessful", false);
        uyeVar.j("offloads", false);
        uyeVar.j("carries", false);
        uyeVar.j("cleanBreaks", false);
        uyeVar.j("defendersBeaten", false);
        uyeVar.j("metresMade", false);
        uyeVar.j("handlingError", false);
        uyeVar.j("carriesCrossedGainLine", false);
        uyeVar.j("carriesNotMadeGainLine", false);
        uyeVar.j("kickMetres", false);
        uyeVar.j("kickFromHand", false);
        uyeVar.j("postContactMetres", false);
        uyeVar.j("tackles", false);
        uyeVar.j("dominantTackles", false);
        uyeVar.j("penDefs", false);
        uyeVar.j("penOffs", false);
        uyeVar.j("rucksWon", false);
        uyeVar.j("ruckArrival", false);
        uyeVar.j("ruckArrivalAttack", false);
        uyeVar.j("ruckArrivalDefence", false);
        uyeVar.j("ruckSpeed03", false);
        uyeVar.j("ruckSpeed36", false);
        uyeVar.j("ruckSpeed6Plus", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        uyeVar.j("penaltyGoalsConceded", false);
        descriptor = uyeVar;
    }

    private RugbyTopTeamsStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = RugbyTopTeamsStatistics.$childSerializers;
        return new KSerializer[]{l98.W((KSerializer) joaVarArr[0].getValue()), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W((KSerializer) joaVarArr[2].getValue()), l98.W((KSerializer) joaVarArr[3].getValue()), l98.W((KSerializer) joaVarArr[4].getValue()), l98.W((KSerializer) joaVarArr[5].getValue()), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W((KSerializer) joaVarArr[8].getValue()), l98.W((KSerializer) joaVarArr[9].getValue()), l98.W((KSerializer) joaVarArr[10].getValue()), l98.W((KSerializer) joaVarArr[11].getValue()), l98.W((KSerializer) joaVarArr[12].getValue()), l98.W((KSerializer) joaVarArr[13].getValue()), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W((KSerializer) joaVarArr[15].getValue()), l98.W((KSerializer) joaVarArr[16].getValue()), l98.W((KSerializer) joaVarArr[17].getValue()), l98.W((KSerializer) joaVarArr[18].getValue()), l98.W((KSerializer) joaVarArr[19].getValue()), l98.W((KSerializer) joaVarArr[20].getValue()), l98.W((KSerializer) joaVarArr[21].getValue()), l98.W((KSerializer) joaVarArr[22].getValue()), l98.W((KSerializer) joaVarArr[23].getValue()), l98.W((KSerializer) joaVarArr[24].getValue()), l98.W((KSerializer) joaVarArr[25].getValue()), l98.W((KSerializer) joaVarArr[26].getValue()), l98.W((KSerializer) joaVarArr[27].getValue()), l98.W((KSerializer) joaVarArr[28].getValue()), l98.W((KSerializer) joaVarArr[29].getValue()), l98.W((KSerializer) joaVarArr[30].getValue()), l98.W((KSerializer) joaVarArr[31].getValue()), l98.W((KSerializer) joaVarArr[32].getValue()), l98.W((KSerializer) joaVarArr[33].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RugbyTopTeamsStatistics deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        List list;
        List list2;
        List list3;
        List list4;
        int i;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        int i2;
        List list11;
        int i3;
        List list12;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = RugbyTopTeamsStatistics.$childSerializers;
        int i6 = 0;
        List list13 = null;
        List list14 = null;
        List list15 = null;
        List list16 = null;
        List list17 = null;
        List list18 = null;
        List list19 = null;
        List list20 = null;
        List list21 = null;
        List list22 = null;
        List list23 = null;
        List list24 = null;
        List list25 = null;
        List list26 = null;
        int i7 = 1;
        int i8 = 0;
        List list27 = null;
        List list28 = null;
        List list29 = null;
        List list30 = null;
        List list31 = null;
        List list32 = null;
        List list33 = null;
        List list34 = null;
        List list35 = null;
        List list36 = null;
        List list37 = null;
        List list38 = null;
        List list39 = null;
        List list40 = null;
        int i9 = 0;
        List list41 = null;
        List list42 = null;
        List list43 = null;
        List list44 = null;
        List list45 = null;
        List list46 = null;
        while (i7 != 0) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    int i10 = i9;
                    list = list13;
                    list2 = list15;
                    list3 = list16;
                    list4 = list28;
                    i = i6;
                    Unit unit = Unit.a;
                    list27 = list27;
                    list14 = list14;
                    i9 = i10;
                    i7 = i;
                    list13 = list;
                    list5 = list4;
                    list16 = list3;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 0:
                    list = list13;
                    list2 = list15;
                    list3 = list16;
                    list4 = list28;
                    int i11 = i9;
                    i = i6;
                    List list47 = (List) b.i(serialDescriptor, i, (dy4) joaVarArr[i6].getValue(), list27);
                    Unit unit2 = Unit.a;
                    i9 = i11 | 1;
                    list14 = list14;
                    list27 = list47;
                    list13 = list;
                    list5 = list4;
                    list16 = list3;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 1:
                    list6 = list13;
                    list2 = list15;
                    List list48 = list16;
                    int i12 = i9;
                    List list49 = (List) b.i(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), list28);
                    Unit unit3 = Unit.a;
                    list29 = list29;
                    list14 = list14;
                    list16 = list48;
                    list5 = list49;
                    i9 = i12 | 2;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 2:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i13 = i9;
                    List list50 = list14;
                    List list51 = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list29);
                    int i14 = i13 | 4;
                    Unit unit4 = Unit.a;
                    i9 = i14;
                    list14 = list50;
                    i = i6;
                    list29 = list51;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 3:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i15 = i9;
                    List list52 = list14;
                    List list53 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list30);
                    int i16 = i15 | 8;
                    Unit unit5 = Unit.a;
                    i9 = i16;
                    list14 = list52;
                    i = i6;
                    list30 = list53;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 4:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i17 = i9;
                    List list54 = list14;
                    List list55 = (List) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list31);
                    int i18 = i17 | 16;
                    Unit unit6 = Unit.a;
                    i9 = i18;
                    list14 = list54;
                    i = i6;
                    list31 = list55;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 5:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i19 = i9;
                    List list56 = list14;
                    List list57 = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list32);
                    int i20 = i19 | 32;
                    Unit unit7 = Unit.a;
                    i9 = i20;
                    list14 = list56;
                    i = i6;
                    list32 = list57;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 6:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i21 = i9;
                    List list58 = list14;
                    List list59 = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list33);
                    int i22 = i21 | 64;
                    Unit unit8 = Unit.a;
                    i9 = i22;
                    list14 = list58;
                    i = i6;
                    list33 = list59;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 7:
                    list7 = list13;
                    list2 = list15;
                    list9 = list16;
                    int i23 = i9;
                    list10 = list14;
                    List list60 = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), list34);
                    i2 = i23 | 128;
                    Unit unit9 = Unit.a;
                    i = i6;
                    list34 = list60;
                    list5 = list28;
                    list14 = list10;
                    list16 = list9;
                    i9 = i2;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 8:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i24 = i9;
                    List list61 = list14;
                    List list62 = (List) b.i(serialDescriptor, 8, (dy4) joaVarArr[8].getValue(), list35);
                    int i25 = i24 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    i9 = i25;
                    list14 = list61;
                    i = i6;
                    list35 = list62;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 9:
                    list7 = list13;
                    list2 = list15;
                    list9 = list16;
                    int i26 = i9;
                    list10 = list14;
                    List list63 = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), list36);
                    i2 = i26 | 512;
                    Unit unit11 = Unit.a;
                    i = i6;
                    list36 = list63;
                    list5 = list28;
                    list14 = list10;
                    list16 = list9;
                    i9 = i2;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 10:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i27 = i9;
                    List list64 = list14;
                    List list65 = (List) b.i(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), list37);
                    int i28 = i27 | 1024;
                    Unit unit12 = Unit.a;
                    i9 = i28;
                    list14 = list64;
                    i = i6;
                    list37 = list65;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 11:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i29 = i9;
                    List list66 = list14;
                    List list67 = (List) b.i(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), list38);
                    int i30 = i29 | a.o;
                    Unit unit13 = Unit.a;
                    i9 = i30;
                    list14 = list66;
                    i = i6;
                    list38 = list67;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 12:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i31 = i9;
                    List list68 = list14;
                    List list69 = (List) b.i(serialDescriptor, 12, (dy4) joaVarArr[12].getValue(), list39);
                    int i32 = i31 | 4096;
                    Unit unit14 = Unit.a;
                    i9 = i32;
                    list14 = list68;
                    i = i6;
                    list39 = list69;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 13:
                    list7 = list13;
                    list2 = list15;
                    list8 = list16;
                    int i33 = i9;
                    List list70 = list14;
                    List list71 = (List) b.i(serialDescriptor, 13, (dy4) joaVarArr[13].getValue(), list40);
                    int i34 = i33 | 8192;
                    Unit unit15 = Unit.a;
                    i9 = i34;
                    list14 = list70;
                    i = i6;
                    list40 = list71;
                    list5 = list28;
                    list16 = list8;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 14:
                    list6 = list13;
                    list2 = list15;
                    list11 = list16;
                    List list72 = (List) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), list41);
                    i3 = i9 | 16384;
                    Unit unit16 = Unit.a;
                    list41 = list72;
                    i9 = i3;
                    list5 = list28;
                    list16 = list11;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 15:
                    list6 = list13;
                    list2 = list15;
                    list11 = list16;
                    List list73 = (List) b.i(serialDescriptor, 15, (dy4) joaVarArr[15].getValue(), list42);
                    i3 = i9 | 32768;
                    Unit unit17 = Unit.a;
                    list42 = list73;
                    i9 = i3;
                    list5 = list28;
                    list16 = list11;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 16:
                    list6 = list13;
                    list2 = list15;
                    list11 = list16;
                    List list74 = (List) b.i(serialDescriptor, 16, (dy4) joaVarArr[16].getValue(), list43);
                    i3 = i9 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    list43 = list74;
                    i9 = i3;
                    list5 = list28;
                    list16 = list11;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 17:
                    list6 = list13;
                    list2 = list15;
                    list11 = list16;
                    List list75 = (List) b.i(serialDescriptor, 17, (dy4) joaVarArr[17].getValue(), list44);
                    i3 = i9 | 131072;
                    Unit unit19 = Unit.a;
                    list44 = list75;
                    i9 = i3;
                    list5 = list28;
                    list16 = list11;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 18:
                    list6 = list13;
                    list2 = list15;
                    list11 = list16;
                    List list76 = (List) b.i(serialDescriptor, 18, (dy4) joaVarArr[18].getValue(), list45);
                    i3 = i9 | 262144;
                    Unit unit20 = Unit.a;
                    list45 = list76;
                    i9 = i3;
                    list5 = list28;
                    list16 = list11;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 19:
                    list6 = list13;
                    list2 = list15;
                    list11 = list16;
                    List list77 = (List) b.i(serialDescriptor, 19, (dy4) joaVarArr[19].getValue(), list46);
                    i3 = i9 | 524288;
                    Unit unit21 = Unit.a;
                    list46 = list77;
                    i9 = i3;
                    list5 = list28;
                    list16 = list11;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 20:
                    list7 = list13;
                    list2 = list15;
                    list16 = (List) b.i(serialDescriptor, 20, (dy4) joaVarArr[20].getValue(), list16);
                    int i35 = i9 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    i = i6;
                    i9 = i35;
                    list5 = list28;
                    list13 = list7;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 21:
                    list11 = list16;
                    list6 = list13;
                    List list78 = (List) b.i(serialDescriptor, 21, (dy4) joaVarArr[21].getValue(), list15);
                    Unit unit23 = Unit.a;
                    i9 |= 2097152;
                    list2 = list78;
                    list5 = list28;
                    list16 = list11;
                    list13 = list6;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 22:
                    list2 = list15;
                    list12 = list16;
                    list14 = (List) b.i(serialDescriptor, 22, (dy4) joaVarArr[22].getValue(), list14);
                    i4 = 4194304;
                    Unit unit24 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 23:
                    list2 = list15;
                    list12 = list16;
                    list13 = (List) b.i(serialDescriptor, 23, (dy4) joaVarArr[23].getValue(), list13);
                    i4 = 8388608;
                    Unit unit242 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 24:
                    list2 = list15;
                    list12 = list16;
                    list17 = (List) b.i(serialDescriptor, 24, (dy4) joaVarArr[24].getValue(), list17);
                    i4 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit2422 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 25:
                    list2 = list15;
                    list12 = list16;
                    list20 = (List) b.i(serialDescriptor, 25, (dy4) joaVarArr[25].getValue(), list20);
                    i4 = 33554432;
                    Unit unit24222 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 26:
                    list2 = list15;
                    list12 = list16;
                    list21 = (List) b.i(serialDescriptor, 26, (dy4) joaVarArr[26].getValue(), list21);
                    i4 = 67108864;
                    Unit unit242222 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 27:
                    list2 = list15;
                    list12 = list16;
                    list19 = (List) b.i(serialDescriptor, 27, (dy4) joaVarArr[27].getValue(), list19);
                    i4 = 134217728;
                    Unit unit2422222 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 28:
                    list2 = list15;
                    list12 = list16;
                    list22 = (List) b.i(serialDescriptor, 28, (dy4) joaVarArr[28].getValue(), list22);
                    i4 = 268435456;
                    Unit unit24222222 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 29:
                    list2 = list15;
                    list12 = list16;
                    list23 = (List) b.i(serialDescriptor, 29, (dy4) joaVarArr[29].getValue(), list23);
                    i4 = 536870912;
                    Unit unit242222222 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 30:
                    list2 = list15;
                    list12 = list16;
                    list24 = (List) b.i(serialDescriptor, 30, (dy4) joaVarArr[30].getValue(), list24);
                    i4 = 1073741824;
                    Unit unit2422222222 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 31:
                    list2 = list15;
                    list12 = list16;
                    list25 = (List) b.i(serialDescriptor, 31, (dy4) joaVarArr[31].getValue(), list25);
                    i4 = Integer.MIN_VALUE;
                    Unit unit24222222222 = Unit.a;
                    i9 |= i4;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 32:
                    list2 = list15;
                    list12 = list16;
                    list26 = (List) b.i(serialDescriptor, 32, (dy4) joaVarArr[32].getValue(), list26);
                    i5 = i8 | 1;
                    Unit unit25 = Unit.a;
                    i8 = i5;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                case 33:
                    list12 = list16;
                    list2 = list15;
                    list18 = (List) b.i(serialDescriptor, 33, (dy4) joaVarArr[33].getValue(), list18);
                    i5 = i8 | 2;
                    Unit unit252 = Unit.a;
                    i8 = i5;
                    list5 = list28;
                    list16 = list12;
                    i = i6;
                    i6 = i;
                    list28 = list5;
                    list15 = list2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        int i36 = i9;
        List list79 = list14;
        List list80 = list15;
        List list81 = list16;
        List list82 = list28;
        List list83 = list29;
        b.c(serialDescriptor);
        List list84 = list25;
        List list85 = list31;
        List list86 = list41;
        List list87 = list20;
        int i37 = i8;
        List list88 = list36;
        List list89 = list46;
        List list90 = list24;
        List list91 = list26;
        return new RugbyTopTeamsStatistics(i36, i37, list27, list82, list83, list30, list85, list32, list33, list34, list35, list88, list37, list38, list39, list40, list86, list42, list43, list44, list45, list89, list81, list80, list79, list13, list17, list87, list21, list19, list22, list23, list90, list84, list91, list18, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RugbyTopTeamsStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RugbyTopTeamsStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
