package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.h75;
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
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/RugbyTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/RugbyTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/RugbyTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/RugbyTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RugbyTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final RugbyTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RugbyTopPlayersStatisticsItem$$serializer rugbyTopPlayersStatisticsItem$$serializer = new RugbyTopPlayersStatisticsItem$$serializer();
        INSTANCE = rugbyTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.RugbyTopPlayersStatisticsItem", rugbyTopPlayersStatisticsItem$$serializer, 34);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("points", false);
        uyeVar.j("tries", false);
        uyeVar.j("carries", false);
        uyeVar.j("penaltyGoals", false);
        uyeVar.j("conversions", false);
        uyeVar.j("dropGoals", false);
        uyeVar.j("passesSuccessful", false);
        uyeVar.j("offloads", false);
        uyeVar.j("cleanBreaks", false);
        uyeVar.j("defendersBeaten", false);
        uyeVar.j("metresMade", false);
        uyeVar.j("handlingError", false);
        uyeVar.j("carriesCrossedGainLine", false);
        uyeVar.j("carriesNotMadeGainLine", false);
        uyeVar.j("postContactMetres", false);
        uyeVar.j("tryAssist", false);
        uyeVar.j("tackles", false);
        uyeVar.j("dominantTackles", false);
        uyeVar.j("penDefs", false);
        uyeVar.j("penOffs", false);
        uyeVar.j("lineoutsToOwnPlayer", false);
        uyeVar.j("lineoutsWon", false);
        uyeVar.j("lineoutWonSteal", false);
        uyeVar.j("kickMetres", false);
        uyeVar.j("kicksFromHand", false);
        uyeVar.j("ruckArrival", false);
        uyeVar.j("ruckArrivalAttack", false);
        uyeVar.j("ruckArrivalDefence", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        descriptor = uyeVar;
    }

    private RugbyTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, l98.W(a7aVar), uhi.a, l98.W(h75.a), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RugbyTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        int i;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        int i2;
        Integer num10;
        Integer num11;
        Integer num12;
        int i3;
        Integer num13;
        Integer num14;
        int i4;
        int i5;
        int i6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
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
        Integer num25 = null;
        Integer num26 = null;
        Integer num27 = null;
        Integer num28 = null;
        boolean z = true;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        Integer num29 = null;
        Double d = null;
        Integer num30 = null;
        Integer num31 = null;
        Integer num32 = null;
        Integer num33 = null;
        Integer num34 = null;
        Integer num35 = null;
        Integer num36 = null;
        Integer num37 = null;
        Integer num38 = null;
        Integer num39 = null;
        int i9 = 0;
        Integer num40 = null;
        Integer num41 = null;
        Integer num42 = null;
        Integer num43 = null;
        Integer num44 = null;
        Integer num45 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num15;
                    num2 = num17;
                    num3 = num19;
                    i = i9;
                    num4 = num40;
                    num5 = num16;
                    Unit unit = Unit.a;
                    z = false;
                    num6 = num4;
                    num19 = num3;
                    i9 = i;
                    num17 = num2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 0:
                    num = num15;
                    num2 = num17;
                    num3 = num19;
                    Integer num46 = num29;
                    int i10 = i9;
                    num4 = num40;
                    num5 = num16;
                    i8 = b.l(serialDescriptor, 0);
                    i = i10 | 1;
                    Unit unit2 = Unit.a;
                    num29 = num46;
                    num6 = num4;
                    num19 = num3;
                    i9 = i;
                    num17 = num2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 1:
                    num = num15;
                    num2 = num17;
                    Integer num47 = num19;
                    int i11 = i9;
                    Integer num48 = num40;
                    num5 = num16;
                    Integer num49 = (Integer) b.i(serialDescriptor, 1, a7a.a, num29);
                    i = i11 | 2;
                    Unit unit3 = Unit.a;
                    num29 = num49;
                    d = d;
                    num6 = num48;
                    num19 = num47;
                    i9 = i;
                    num17 = num2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 2:
                    num = num15;
                    num2 = num17;
                    Integer num50 = num19;
                    int i12 = i9;
                    Integer num51 = num40;
                    num5 = num16;
                    String n = b.n(serialDescriptor, 2);
                    i = i12 | 4;
                    Unit unit4 = Unit.a;
                    str = n;
                    num6 = num51;
                    num19 = num50;
                    i9 = i;
                    num17 = num2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 3:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i13 = i9;
                    num9 = num40;
                    num5 = num16;
                    Double d2 = (Double) b.i(serialDescriptor, 3, h75.a, d);
                    i2 = i13 | 8;
                    Unit unit5 = Unit.a;
                    d = d2;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 4:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i14 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num52 = (Integer) b.i(serialDescriptor, 4, a7a.a, num30);
                    i2 = i14 | 16;
                    Unit unit6 = Unit.a;
                    num30 = num52;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 5:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i15 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num53 = (Integer) b.i(serialDescriptor, 5, a7a.a, num31);
                    i2 = i15 | 32;
                    Unit unit7 = Unit.a;
                    num31 = num53;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 6:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i16 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num54 = (Integer) b.i(serialDescriptor, 6, a7a.a, num32);
                    i2 = i16 | 64;
                    Unit unit8 = Unit.a;
                    num32 = num54;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 7:
                    num = num15;
                    num10 = num17;
                    num11 = num19;
                    int i17 = i9;
                    num12 = num40;
                    num5 = num16;
                    Integer num55 = (Integer) b.i(serialDescriptor, 7, a7a.a, num33);
                    i3 = i17 | 128;
                    Unit unit9 = Unit.a;
                    num33 = num55;
                    num6 = num12;
                    num19 = num11;
                    num17 = num10;
                    i9 = i3;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 8:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i18 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num56 = (Integer) b.i(serialDescriptor, 8, a7a.a, num34);
                    i2 = i18 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    num34 = num56;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 9:
                    num = num15;
                    num10 = num17;
                    num11 = num19;
                    int i19 = i9;
                    num12 = num40;
                    num5 = num16;
                    Integer num57 = (Integer) b.i(serialDescriptor, 9, a7a.a, num35);
                    i3 = i19 | 512;
                    Unit unit11 = Unit.a;
                    num35 = num57;
                    num6 = num12;
                    num19 = num11;
                    num17 = num10;
                    i9 = i3;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 10:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i20 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num58 = (Integer) b.i(serialDescriptor, 10, a7a.a, num36);
                    i2 = i20 | 1024;
                    Unit unit12 = Unit.a;
                    num36 = num58;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 11:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i21 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num59 = (Integer) b.i(serialDescriptor, 11, a7a.a, num37);
                    i2 = i21 | a.o;
                    Unit unit13 = Unit.a;
                    num37 = num59;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 12:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i22 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num60 = (Integer) b.i(serialDescriptor, 12, a7a.a, num38);
                    i2 = i22 | 4096;
                    Unit unit14 = Unit.a;
                    num38 = num60;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 13:
                    num = num15;
                    num7 = num17;
                    num8 = num19;
                    int i23 = i9;
                    num9 = num40;
                    num5 = num16;
                    Integer num61 = (Integer) b.i(serialDescriptor, 13, a7a.a, num39);
                    i2 = i23 | 8192;
                    Unit unit15 = Unit.a;
                    num39 = num61;
                    num6 = num9;
                    num19 = num8;
                    num17 = num7;
                    i9 = i2;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 14:
                    num = num15;
                    Integer num62 = num19;
                    Integer num63 = (Integer) b.i(serialDescriptor, 14, a7a.a, num40);
                    Unit unit16 = Unit.a;
                    num6 = num63;
                    num5 = num16;
                    i9 |= 16384;
                    num19 = num62;
                    num17 = num17;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 15:
                    num = num15;
                    num13 = num17;
                    num14 = num19;
                    Integer num64 = (Integer) b.i(serialDescriptor, 15, a7a.a, num41);
                    i4 = i9 | 32768;
                    Unit unit17 = Unit.a;
                    num41 = num64;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 16:
                    num = num15;
                    num13 = num17;
                    num14 = num19;
                    Integer num65 = (Integer) b.i(serialDescriptor, 16, a7a.a, num42);
                    i4 = i9 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num42 = num65;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 17:
                    num = num15;
                    num13 = num17;
                    num14 = num19;
                    Integer num66 = (Integer) b.i(serialDescriptor, 17, a7a.a, num43);
                    i4 = i9 | 131072;
                    Unit unit19 = Unit.a;
                    num43 = num66;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 18:
                    num = num15;
                    num13 = num17;
                    num14 = num19;
                    Integer num67 = (Integer) b.i(serialDescriptor, 18, a7a.a, num44);
                    i4 = i9 | 262144;
                    Unit unit20 = Unit.a;
                    num44 = num67;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 19:
                    num = num15;
                    num13 = num17;
                    num14 = num19;
                    Integer num68 = (Integer) b.i(serialDescriptor, 19, a7a.a, num45);
                    i4 = i9 | 524288;
                    Unit unit21 = Unit.a;
                    num45 = num68;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 20:
                    num = num15;
                    num13 = num17;
                    num19 = (Integer) b.i(serialDescriptor, 20, a7a.a, num19);
                    int i24 = i9 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    i9 = i24;
                    num6 = num40;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 21:
                    Integer num69 = num19;
                    num = num15;
                    num17 = (Integer) b.i(serialDescriptor, 21, a7a.a, num17);
                    Unit unit23 = Unit.a;
                    i9 |= 2097152;
                    num6 = num40;
                    num19 = num69;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 22:
                    num13 = num17;
                    num14 = num19;
                    num16 = (Integer) b.i(serialDescriptor, 22, a7a.a, num16);
                    i5 = 4194304;
                    i4 = i9 | i5;
                    Unit unit24 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 23:
                    num13 = num17;
                    num14 = num19;
                    num15 = (Integer) b.i(serialDescriptor, 23, a7a.a, num15);
                    i5 = 8388608;
                    i4 = i9 | i5;
                    Unit unit242 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 24:
                    num13 = num17;
                    num14 = num19;
                    num18 = (Integer) b.i(serialDescriptor, 24, a7a.a, num18);
                    i5 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i4 = i9 | i5;
                    Unit unit2422 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 25:
                    num13 = num17;
                    num14 = num19;
                    num21 = (Integer) b.i(serialDescriptor, 25, a7a.a, num21);
                    i5 = 33554432;
                    i4 = i9 | i5;
                    Unit unit24222 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 26:
                    num13 = num17;
                    num14 = num19;
                    num22 = (Integer) b.i(serialDescriptor, 26, a7a.a, num22);
                    i5 = 67108864;
                    i4 = i9 | i5;
                    Unit unit242222 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 27:
                    num13 = num17;
                    num14 = num19;
                    num20 = (Integer) b.i(serialDescriptor, 27, a7a.a, num20);
                    i5 = 134217728;
                    i4 = i9 | i5;
                    Unit unit2422222 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 28:
                    num13 = num17;
                    num14 = num19;
                    num24 = (Integer) b.i(serialDescriptor, 28, a7a.a, num24);
                    i5 = 268435456;
                    i4 = i9 | i5;
                    Unit unit24222222 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 29:
                    num13 = num17;
                    num14 = num19;
                    num23 = (Integer) b.i(serialDescriptor, 29, a7a.a, num23);
                    i5 = 536870912;
                    i4 = i9 | i5;
                    Unit unit242222222 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 30:
                    num13 = num17;
                    num14 = num19;
                    num25 = (Integer) b.i(serialDescriptor, 30, a7a.a, num25);
                    i5 = 1073741824;
                    i4 = i9 | i5;
                    Unit unit2422222222 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 31:
                    num13 = num17;
                    num14 = num19;
                    num26 = (Integer) b.i(serialDescriptor, 31, a7a.a, num26);
                    i5 = Integer.MIN_VALUE;
                    i4 = i9 | i5;
                    Unit unit24222222222 = Unit.a;
                    num = num15;
                    i9 = i4;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 32:
                    num13 = num17;
                    num14 = num19;
                    num27 = (Integer) b.i(serialDescriptor, 32, a7a.a, num27);
                    i6 = i7 | 1;
                    Unit unit25 = Unit.a;
                    num = num15;
                    i7 = i6;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                case 33:
                    num14 = num19;
                    num13 = num17;
                    num28 = (Integer) b.i(serialDescriptor, 33, a7a.a, num28);
                    i6 = i7 | 2;
                    Unit unit252 = Unit.a;
                    num = num15;
                    i7 = i6;
                    num6 = num40;
                    num19 = num14;
                    num17 = num13;
                    num5 = num16;
                    num16 = num5;
                    num15 = num;
                    num40 = num6;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num70 = num15;
        Integer num71 = num17;
        Integer num72 = num19;
        int i25 = i9;
        b.c(serialDescriptor);
        Integer num73 = num27;
        return new RugbyTopPlayersStatisticsItem(i25, i7, i8, num29, str, d, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39, num40, num41, num42, num43, num44, num45, num72, num71, num16, num70, num18, num21, num22, num20, num24, num23, num25, num26, num73, num28, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RugbyTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RugbyTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
