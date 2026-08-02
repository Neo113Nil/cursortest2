package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RugbyTopTeamsStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final RugbyTopTeamsStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RugbyTopTeamsStatisticsItem$$serializer rugbyTopTeamsStatisticsItem$$serializer = new RugbyTopTeamsStatisticsItem$$serializer();
        INSTANCE = rugbyTopTeamsStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topTeams.items.RugbyTopTeamsStatisticsItem", rugbyTopTeamsStatisticsItem$$serializer, 36);
        uyeVar.j("id", false);
        uyeVar.j("matches", false);
        uyeVar.j("points", false);
        uyeVar.j("tries", false);
        uyeVar.j("carries", false);
        uyeVar.j("penaltyTries", false);
        uyeVar.j("penaltyGoals", false);
        uyeVar.j("conversions", false);
        uyeVar.j("dropGoals", false);
        uyeVar.j("scrumsWon", false);
        uyeVar.j("lineoutsWon", false);
        uyeVar.j("passesSuccessful", false);
        uyeVar.j("offloads", false);
        uyeVar.j("cleanBreaks", false);
        uyeVar.j("defendersBeaten", false);
        uyeVar.j("metresMade", false);
        uyeVar.j("handlingError", false);
        uyeVar.j("carriesCrossedGainLine", false);
        uyeVar.j("carriesNotMadeGainLine", false);
        uyeVar.j("postContactMetres", false);
        uyeVar.j("tackles", false);
        uyeVar.j("dominantTackles", false);
        uyeVar.j("penDefs", false);
        uyeVar.j("penOffs", false);
        uyeVar.j("kickMetres", false);
        uyeVar.j("kickFromHand", false);
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

    private RugbyTopTeamsStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RugbyTopTeamsStatisticsItem deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        int i;
        Integer num7;
        Integer num8;
        Integer num9;
        int i2;
        Integer num10;
        int i3;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Integer num24 = null;
        boolean z = true;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        Integer num25 = null;
        Integer num26 = null;
        Integer num27 = null;
        Integer num28 = null;
        Integer num29 = null;
        Integer num30 = null;
        Integer num31 = null;
        Integer num32 = null;
        Integer num33 = null;
        Integer num34 = null;
        Integer num35 = null;
        Integer num36 = null;
        int i9 = 0;
        Integer num37 = null;
        Integer num38 = null;
        Integer num39 = null;
        Integer num40 = null;
        Integer num41 = null;
        Integer num42 = null;
        Integer num43 = null;
        Integer num44 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    Integer num45 = num37;
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    Unit unit = Unit.a;
                    num30 = num30;
                    num14 = num14;
                    num37 = num45;
                    i9 = i9;
                    z = false;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 0:
                    Integer num46 = num37;
                    num = num11;
                    Integer num47 = num12;
                    num3 = num13;
                    Integer num48 = num25;
                    int l = b.l(serialDescriptor, 0);
                    Unit unit2 = Unit.a;
                    num25 = num48;
                    num30 = num30;
                    num14 = num14;
                    num12 = num47;
                    num37 = num46;
                    i9 |= 1;
                    i7 = l;
                    num11 = num;
                    num13 = num3;
                case 1:
                    Integer num49 = num37;
                    num = num11;
                    num3 = num13;
                    int l2 = b.l(serialDescriptor, 1);
                    Unit unit3 = Unit.a;
                    i8 = l2;
                    num30 = num30;
                    num14 = num14;
                    num12 = num12;
                    num37 = num49;
                    i9 |= 2;
                    num11 = num;
                    num13 = num3;
                case 2:
                    Integer num50 = num37;
                    num4 = num14;
                    num5 = num30;
                    int i10 = i9;
                    num6 = num50;
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    Integer num51 = (Integer) b.i(serialDescriptor, 2, a7a.a, num25);
                    i = i10 | 4;
                    Unit unit4 = Unit.a;
                    num25 = num51;
                    num30 = num5;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 3:
                    Integer num52 = num37;
                    num4 = num14;
                    num5 = num30;
                    int i11 = i9;
                    num6 = num52;
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    Integer num53 = (Integer) b.i(serialDescriptor, 3, a7a.a, num26);
                    i = i11 | 8;
                    Unit unit5 = Unit.a;
                    num26 = num53;
                    num30 = num5;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 4:
                    Integer num54 = num37;
                    num4 = num14;
                    num5 = num30;
                    int i12 = i9;
                    num6 = num54;
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    Integer num55 = (Integer) b.i(serialDescriptor, 4, a7a.a, num27);
                    i = i12 | 16;
                    Unit unit6 = Unit.a;
                    num27 = num55;
                    num30 = num5;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 5:
                    Integer num56 = num37;
                    num4 = num14;
                    num5 = num30;
                    int i13 = i9;
                    num6 = num56;
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    Integer num57 = (Integer) b.i(serialDescriptor, 5, a7a.a, num28);
                    i = i13 | 32;
                    Unit unit7 = Unit.a;
                    num28 = num57;
                    num30 = num5;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 6:
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    int i14 = i9;
                    num6 = num37;
                    num4 = num14;
                    num5 = num30;
                    Integer num58 = (Integer) b.i(serialDescriptor, 6, a7a.a, num29);
                    i = i14 | 64;
                    Unit unit8 = Unit.a;
                    num29 = num58;
                    num30 = num5;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 7:
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    int i15 = i9;
                    num6 = num37;
                    num4 = num14;
                    Integer num59 = (Integer) b.i(serialDescriptor, 7, a7a.a, num30);
                    i = i15 | 128;
                    Unit unit9 = Unit.a;
                    num30 = num59;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 8:
                    num = num11;
                    num7 = num12;
                    num3 = num13;
                    int i16 = i9;
                    num8 = num37;
                    num9 = num14;
                    Integer num60 = (Integer) b.i(serialDescriptor, 8, a7a.a, num31);
                    i2 = i16 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    num31 = num60;
                    num14 = num9;
                    num12 = num7;
                    num37 = num8;
                    i9 = i2;
                    num11 = num;
                    num13 = num3;
                case 9:
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    int i17 = i9;
                    num6 = num37;
                    num4 = num14;
                    Integer num61 = (Integer) b.i(serialDescriptor, 9, a7a.a, num32);
                    i = i17 | 512;
                    Unit unit11 = Unit.a;
                    num32 = num61;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 10:
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    int i18 = i9;
                    num6 = num37;
                    num4 = num14;
                    Integer num62 = (Integer) b.i(serialDescriptor, 10, a7a.a, num33);
                    i = i18 | 1024;
                    Unit unit12 = Unit.a;
                    num33 = num62;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 11:
                    num = num11;
                    num7 = num12;
                    num3 = num13;
                    int i19 = i9;
                    num8 = num37;
                    num9 = num14;
                    Integer num63 = (Integer) b.i(serialDescriptor, 11, a7a.a, num34);
                    i2 = i19 | a.o;
                    Unit unit13 = Unit.a;
                    num34 = num63;
                    num14 = num9;
                    num12 = num7;
                    num37 = num8;
                    i9 = i2;
                    num11 = num;
                    num13 = num3;
                case 12:
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    int i20 = i9;
                    num6 = num37;
                    num4 = num14;
                    Integer num64 = (Integer) b.i(serialDescriptor, 12, a7a.a, num35);
                    i = i20 | 4096;
                    Unit unit14 = Unit.a;
                    num35 = num64;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 13:
                    num = num11;
                    num2 = num12;
                    num3 = num13;
                    int i21 = i9;
                    num6 = num37;
                    num4 = num14;
                    Integer num65 = (Integer) b.i(serialDescriptor, 13, a7a.a, num36);
                    i = i21 | 8192;
                    Unit unit15 = Unit.a;
                    num36 = num65;
                    num14 = num4;
                    num37 = num6;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                    num13 = num3;
                case 14:
                    num = num11;
                    num10 = num12;
                    num3 = num13;
                    Integer num66 = (Integer) b.i(serialDescriptor, 14, a7a.a, num37);
                    i3 = i9 | 16384;
                    Unit unit16 = Unit.a;
                    num37 = num66;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 15:
                    num = num11;
                    num10 = num12;
                    num3 = num13;
                    Integer num67 = (Integer) b.i(serialDescriptor, 15, a7a.a, num38);
                    i3 = i9 | 32768;
                    Unit unit17 = Unit.a;
                    num38 = num67;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 16:
                    num = num11;
                    num10 = num12;
                    num3 = num13;
                    Integer num68 = (Integer) b.i(serialDescriptor, 16, a7a.a, num39);
                    i3 = i9 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num39 = num68;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 17:
                    num = num11;
                    num10 = num12;
                    num3 = num13;
                    Integer num69 = (Integer) b.i(serialDescriptor, 17, a7a.a, num40);
                    i3 = i9 | 131072;
                    Unit unit19 = Unit.a;
                    num40 = num69;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 18:
                    num = num11;
                    num10 = num12;
                    num3 = num13;
                    Integer num70 = (Integer) b.i(serialDescriptor, 18, a7a.a, num41);
                    i3 = i9 | 262144;
                    Unit unit20 = Unit.a;
                    num41 = num70;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 19:
                    num = num11;
                    num10 = num12;
                    num3 = num13;
                    Integer num71 = (Integer) b.i(serialDescriptor, 19, a7a.a, num42);
                    i3 = i9 | 524288;
                    Unit unit21 = Unit.a;
                    num42 = num71;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 20:
                    num = num11;
                    num10 = num12;
                    num3 = num13;
                    Integer num72 = (Integer) b.i(serialDescriptor, 20, a7a.a, num43);
                    i3 = i9 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    num43 = num72;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 21:
                    num = num11;
                    num3 = num13;
                    num10 = num12;
                    Integer num73 = (Integer) b.i(serialDescriptor, 21, a7a.a, num44);
                    Unit unit23 = Unit.a;
                    i9 |= 2097152;
                    num44 = num73;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 22:
                    num3 = num13;
                    num = num11;
                    num12 = (Integer) b.i(serialDescriptor, 22, a7a.a, num12);
                    Unit unit24 = Unit.a;
                    i9 |= 4194304;
                    num11 = num;
                    num13 = num3;
                case 23:
                    num10 = num12;
                    num3 = num13;
                    Integer num74 = (Integer) b.i(serialDescriptor, 23, a7a.a, num11);
                    i3 = i9 | 8388608;
                    Unit unit25 = Unit.a;
                    num = num74;
                    i9 = i3;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 24:
                    num = num11;
                    num10 = num12;
                    num14 = (Integer) b.i(serialDescriptor, 24, a7a.a, num14);
                    i4 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit26 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 25:
                    num = num11;
                    num10 = num12;
                    num17 = (Integer) b.i(serialDescriptor, 25, a7a.a, num17);
                    i4 = 33554432;
                    Unit unit262 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 26:
                    num = num11;
                    num10 = num12;
                    num18 = (Integer) b.i(serialDescriptor, 26, a7a.a, num18);
                    i4 = 67108864;
                    Unit unit2622 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 27:
                    num = num11;
                    num10 = num12;
                    num16 = (Integer) b.i(serialDescriptor, 27, a7a.a, num16);
                    i4 = 134217728;
                    Unit unit26222 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 28:
                    num = num11;
                    num10 = num12;
                    num19 = (Integer) b.i(serialDescriptor, 28, a7a.a, num19);
                    i4 = 268435456;
                    Unit unit262222 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 29:
                    num = num11;
                    num10 = num12;
                    num20 = (Integer) b.i(serialDescriptor, 29, a7a.a, num20);
                    i4 = 536870912;
                    Unit unit2622222 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 30:
                    num = num11;
                    num10 = num12;
                    num21 = (Integer) b.i(serialDescriptor, 30, a7a.a, num21);
                    i4 = 1073741824;
                    Unit unit26222222 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 31:
                    num = num11;
                    num10 = num12;
                    num22 = (Integer) b.i(serialDescriptor, 31, a7a.a, num22);
                    i4 = Integer.MIN_VALUE;
                    Unit unit262222222 = Unit.a;
                    i9 |= i4;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 32:
                    num = num11;
                    num10 = num12;
                    num23 = (Integer) b.i(serialDescriptor, 32, a7a.a, num23);
                    i5 = i6 | 1;
                    Unit unit27 = Unit.a;
                    i6 = i5;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 33:
                    num = num11;
                    num10 = num12;
                    num24 = (Integer) b.i(serialDescriptor, 33, a7a.a, num24);
                    i5 = i6 | 2;
                    Unit unit272 = Unit.a;
                    i6 = i5;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 34:
                    num = num11;
                    num10 = num12;
                    num15 = (Integer) b.i(serialDescriptor, 34, a7a.a, num15);
                    i5 = i6 | 4;
                    Unit unit2722 = Unit.a;
                    i6 = i5;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                case 35:
                    num10 = num12;
                    num = num11;
                    num13 = (Integer) b.i(serialDescriptor, 35, a7a.a, num13);
                    i5 = i6 | 8;
                    Unit unit27222 = Unit.a;
                    i6 = i5;
                    num3 = num13;
                    num12 = num10;
                    num11 = num;
                    num13 = num3;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num75 = num37;
        Integer num76 = num14;
        Integer num77 = num30;
        Integer num78 = num12;
        Integer num79 = num25;
        b.c(serialDescriptor);
        Integer num80 = num40;
        Integer num81 = num19;
        int i22 = i8;
        Integer num82 = num34;
        Integer num83 = num44;
        Integer num84 = num23;
        Integer num85 = num28;
        Integer num86 = num38;
        Integer num87 = num18;
        Integer num88 = num17;
        return new RugbyTopTeamsStatisticsItem(i9, i6, i7, i22, num79, num26, num27, num85, num29, num77, num31, num32, num33, num82, num35, num36, num75, num86, num39, num80, num41, num42, num43, num83, num78, num11, num76, num88, num87, num16, num81, num20, num21, num22, num84, num24, num15, num13, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RugbyTopTeamsStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RugbyTopTeamsStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
