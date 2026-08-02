package com.sofascore.model.newNetwork.statistics.season.player;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class HandballPlayerSeasonStatistics$$serializer implements iw8 {

    @NotNull
    public static final HandballPlayerSeasonStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HandballPlayerSeasonStatistics$$serializer handballPlayerSeasonStatistics$$serializer = new HandballPlayerSeasonStatistics$$serializer();
        INSTANCE = handballPlayerSeasonStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.HandballPlayerSeasonStatistics", handballPlayerSeasonStatistics$$serializer, 42);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("appearances", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("saves", false);
        uyeVar.j("twoMinutePenalties", false);
        uyeVar.j("technicalFaults", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("gkShots", false);
        uyeVar.j("gk7mGoals", false);
        uyeVar.j("gk7mShots", false);
        uyeVar.j("gk6mSaves", false);
        uyeVar.j("gk6mShots", false);
        uyeVar.j("gkPivotSaves", false);
        uyeVar.j("gkPivotShots", false);
        uyeVar.j("gk9mSaves", false);
        uyeVar.j("gk9mShots", false);
        uyeVar.j("gkBreakthroughSaves", false);
        uyeVar.j("gkBreakthroughShots", false);
        uyeVar.j("gkFastbreakGoals", false);
        uyeVar.j("gkFastbreakShots", false);
        uyeVar.j("shotsTaken", false);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("goals7m", false);
        uyeVar.j("shots7m", false);
        uyeVar.j("goals6m", false);
        uyeVar.j("shots6m", false);
        uyeVar.j("goals9m", false);
        uyeVar.j("shots9m", false);
        uyeVar.j("breakthroughGoals", false);
        uyeVar.j("breakthroughShots", false);
        uyeVar.j("pivotGoals", false);
        uyeVar.j("pivotShots", false);
        uyeVar.j("fastbreakGoals", false);
        uyeVar.j("fastbreakShots", false);
        uyeVar.j("steals", false);
        uyeVar.j("blockedShots", false);
        uyeVar.j("gk7mSaves", false);
        uyeVar.j("gkFastbreakSaves", false);
        uyeVar.j("shootingEfficiencyPercentage", false);
        uyeVar.j("goalkeeperEfficiencyPercentage", false);
        descriptor = uyeVar;
    }

    private HandballPlayerSeasonStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, uhi.a, W, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final HandballPlayerSeasonStatistics deserialize(@NotNull Decoder decoder) {
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
        int i3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        int i4 = 0;
        Integer num16 = null;
        Integer num17 = null;
        Double d = null;
        Double d2 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        boolean z = true;
        int i5 = 0;
        String str = null;
        Integer num21 = null;
        Double d3 = null;
        Integer num22 = null;
        Integer num23 = null;
        Integer num24 = null;
        Integer num25 = null;
        Integer num26 = null;
        Integer num27 = null;
        Integer num28 = null;
        Integer num29 = null;
        Integer num30 = null;
        Integer num31 = null;
        int i6 = 0;
        Integer num32 = null;
        Integer num33 = null;
        Integer num34 = null;
        Integer num35 = null;
        Integer num36 = null;
        Integer num37 = null;
        Integer num38 = null;
        Integer num39 = null;
        Integer num40 = null;
        Integer num41 = null;
        Integer num42 = null;
        Integer num43 = null;
        Integer num44 = null;
        Integer num45 = null;
        Integer num46 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num10;
                    num2 = num18;
                    num3 = num19;
                    i = i6;
                    num4 = num32;
                    num5 = num11;
                    Unit unit = Unit.a;
                    z = false;
                    num11 = num5;
                    num32 = num4;
                    i6 = i;
                    num18 = num2;
                    num19 = num3;
                    num10 = num;
                case 0:
                    num = num10;
                    num2 = num18;
                    num3 = num19;
                    int i7 = i6;
                    num4 = num32;
                    num5 = num11;
                    int l = b.l(serialDescriptor, 0);
                    i = i7 | 1;
                    Unit unit2 = Unit.a;
                    i5 = l;
                    num11 = num5;
                    num32 = num4;
                    i6 = i;
                    num18 = num2;
                    num19 = num3;
                    num10 = num;
                case 1:
                    num = num10;
                    num2 = num18;
                    num3 = num19;
                    int i8 = i6;
                    num4 = num32;
                    String n = b.n(serialDescriptor, 1);
                    i = i8 | 2;
                    Unit unit3 = Unit.a;
                    str = n;
                    num11 = num11;
                    num32 = num4;
                    i6 = i;
                    num18 = num2;
                    num19 = num3;
                    num10 = num;
                case 2:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i9 = i6;
                    Integer num47 = num32;
                    Integer num48 = num11;
                    Integer num49 = (Integer) b.i(serialDescriptor, 2, a7a.a, num21);
                    int i10 = i9 | 4;
                    Unit unit4 = Unit.a;
                    i6 = i10;
                    num11 = num48;
                    num32 = num47;
                    num21 = num49;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 3:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i11 = i6;
                    Integer num50 = num32;
                    Integer num51 = num11;
                    Double d4 = (Double) b.i(serialDescriptor, 3, h75.a, d3);
                    int i12 = i11 | 8;
                    Unit unit5 = Unit.a;
                    i6 = i12;
                    num11 = num51;
                    num32 = num50;
                    d3 = d4;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 4:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i13 = i6;
                    Integer num52 = num32;
                    Integer num53 = num11;
                    Integer num54 = (Integer) b.i(serialDescriptor, 4, a7a.a, num22);
                    int i14 = i13 | 16;
                    Unit unit6 = Unit.a;
                    i6 = i14;
                    num11 = num53;
                    num32 = num52;
                    num22 = num54;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 5:
                    num = num10;
                    num7 = num18;
                    num3 = num19;
                    int i15 = i6;
                    num8 = num32;
                    num9 = num11;
                    Integer num55 = (Integer) b.i(serialDescriptor, 5, a7a.a, num23);
                    i2 = i15 | 32;
                    Unit unit7 = Unit.a;
                    num23 = num55;
                    num11 = num9;
                    num18 = num7;
                    num32 = num8;
                    i6 = i2;
                    num19 = num3;
                    num10 = num;
                case 6:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i16 = i6;
                    Integer num56 = num32;
                    Integer num57 = num11;
                    Integer num58 = (Integer) b.i(serialDescriptor, 6, a7a.a, num24);
                    int i17 = i16 | 64;
                    Unit unit8 = Unit.a;
                    i6 = i17;
                    num11 = num57;
                    num32 = num56;
                    num24 = num58;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 7:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i18 = i6;
                    Integer num59 = num32;
                    Integer num60 = num11;
                    Integer num61 = (Integer) b.i(serialDescriptor, 7, a7a.a, num25);
                    int i19 = i18 | 128;
                    Unit unit9 = Unit.a;
                    i6 = i19;
                    num11 = num60;
                    num32 = num59;
                    num25 = num61;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 8:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i20 = i6;
                    Integer num62 = num32;
                    Integer num63 = num11;
                    Integer num64 = (Integer) b.i(serialDescriptor, 8, a7a.a, num26);
                    int i21 = i20 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    i6 = i21;
                    num11 = num63;
                    num32 = num62;
                    num26 = num64;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 9:
                    num = num10;
                    num7 = num18;
                    num3 = num19;
                    int i22 = i6;
                    num8 = num32;
                    num9 = num11;
                    Integer num65 = (Integer) b.i(serialDescriptor, 9, a7a.a, num27);
                    i2 = i22 | 512;
                    Unit unit11 = Unit.a;
                    num27 = num65;
                    num11 = num9;
                    num18 = num7;
                    num32 = num8;
                    i6 = i2;
                    num19 = num3;
                    num10 = num;
                case 10:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i23 = i6;
                    Integer num66 = num32;
                    Integer num67 = num11;
                    Integer num68 = (Integer) b.i(serialDescriptor, 10, a7a.a, num28);
                    int i24 = i23 | 1024;
                    Unit unit12 = Unit.a;
                    i6 = i24;
                    num11 = num67;
                    num32 = num66;
                    num28 = num68;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 11:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i25 = i6;
                    Integer num69 = num32;
                    Integer num70 = num11;
                    Integer num71 = (Integer) b.i(serialDescriptor, 11, a7a.a, num29);
                    int i26 = i25 | a.o;
                    Unit unit13 = Unit.a;
                    i6 = i26;
                    num11 = num70;
                    num32 = num69;
                    num29 = num71;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 12:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    int i27 = i6;
                    Integer num72 = num32;
                    Integer num73 = num11;
                    Integer num74 = (Integer) b.i(serialDescriptor, 12, a7a.a, num30);
                    int i28 = i27 | 4096;
                    Unit unit14 = Unit.a;
                    i6 = i28;
                    num11 = num73;
                    num32 = num72;
                    num30 = num74;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 13:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num75 = num32;
                    Integer num76 = (Integer) b.i(serialDescriptor, 13, a7a.a, num31);
                    Unit unit15 = Unit.a;
                    i6 |= 8192;
                    num11 = num11;
                    num32 = num75;
                    num31 = num76;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 14:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num77 = (Integer) b.i(serialDescriptor, 14, a7a.a, num32);
                    i3 = i6 | 16384;
                    Unit unit16 = Unit.a;
                    num32 = num77;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 15:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num78 = (Integer) b.i(serialDescriptor, 15, a7a.a, num33);
                    i3 = i6 | 32768;
                    Unit unit17 = Unit.a;
                    num33 = num78;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 16:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num79 = (Integer) b.i(serialDescriptor, 16, a7a.a, num34);
                    int i29 = i6 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    i6 = i29;
                    num34 = num79;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 17:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num80 = (Integer) b.i(serialDescriptor, 17, a7a.a, num35);
                    Unit unit19 = Unit.a;
                    i6 |= 131072;
                    num35 = num80;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 18:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num81 = (Integer) b.i(serialDescriptor, 18, a7a.a, num36);
                    i3 = i6 | 262144;
                    Unit unit20 = Unit.a;
                    num36 = num81;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 19:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num82 = (Integer) b.i(serialDescriptor, 19, a7a.a, num37);
                    i3 = i6 | 524288;
                    Unit unit21 = Unit.a;
                    num37 = num82;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 20:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num83 = (Integer) b.i(serialDescriptor, 20, a7a.a, num38);
                    i3 = i6 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    num38 = num83;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 21:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num84 = (Integer) b.i(serialDescriptor, 21, a7a.a, num39);
                    i3 = i6 | 2097152;
                    Unit unit23 = Unit.a;
                    num39 = num84;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 22:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num85 = (Integer) b.i(serialDescriptor, 22, a7a.a, num40);
                    i3 = i6 | 4194304;
                    Unit unit24 = Unit.a;
                    num40 = num85;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 23:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num86 = (Integer) b.i(serialDescriptor, 23, a7a.a, num41);
                    i3 = i6 | 8388608;
                    Unit unit25 = Unit.a;
                    num41 = num86;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 24:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num87 = (Integer) b.i(serialDescriptor, 24, a7a.a, num42);
                    i3 = i6 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit26 = Unit.a;
                    num42 = num87;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 25:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num88 = (Integer) b.i(serialDescriptor, 25, a7a.a, num43);
                    i3 = i6 | 33554432;
                    Unit unit27 = Unit.a;
                    num43 = num88;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 26:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num89 = (Integer) b.i(serialDescriptor, 26, a7a.a, num44);
                    i3 = i6 | 67108864;
                    Unit unit28 = Unit.a;
                    num44 = num89;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 27:
                    num = num10;
                    num6 = num18;
                    num3 = num19;
                    Integer num90 = (Integer) b.i(serialDescriptor, 27, a7a.a, num45);
                    i3 = i6 | 134217728;
                    Unit unit29 = Unit.a;
                    num45 = num90;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 28:
                    num = num10;
                    num3 = num19;
                    num6 = num18;
                    Integer num91 = (Integer) b.i(serialDescriptor, 28, a7a.a, num46);
                    i3 = i6 | 268435456;
                    Unit unit30 = Unit.a;
                    num46 = num91;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 29:
                    num = num10;
                    num3 = num19;
                    num18 = (Integer) b.i(serialDescriptor, 29, a7a.a, num18);
                    Unit unit31 = Unit.a;
                    i6 |= 536870912;
                    num19 = num3;
                    num10 = num;
                case 30:
                    num6 = num18;
                    num = num10;
                    Integer num92 = (Integer) b.i(serialDescriptor, 30, a7a.a, num19);
                    Unit unit32 = Unit.a;
                    i6 |= 1073741824;
                    num3 = num92;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 31:
                    num6 = num18;
                    num3 = num19;
                    num20 = (Integer) b.i(serialDescriptor, 31, a7a.a, num20);
                    i3 = i6 | Integer.MIN_VALUE;
                    Unit unit33 = Unit.a;
                    num = num10;
                    i6 = i3;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 32:
                    num6 = num18;
                    num3 = num19;
                    num14 = (Integer) b.i(serialDescriptor, 32, a7a.a, num14);
                    i4 |= 1;
                    Unit unit34 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 33:
                    num6 = num18;
                    num3 = num19;
                    num12 = (Integer) b.i(serialDescriptor, 33, a7a.a, num12);
                    i4 |= 2;
                    Unit unit342 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 34:
                    num6 = num18;
                    num3 = num19;
                    num11 = (Integer) b.i(serialDescriptor, 34, a7a.a, num11);
                    i4 |= 4;
                    Unit unit3422 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 35:
                    num6 = num18;
                    num3 = num19;
                    num10 = (Integer) b.i(serialDescriptor, 35, a7a.a, num10);
                    i4 |= 8;
                    Unit unit34222 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 36:
                    num6 = num18;
                    num3 = num19;
                    num13 = (Integer) b.i(serialDescriptor, 36, a7a.a, num13);
                    i4 |= 16;
                    Unit unit342222 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 37:
                    num6 = num18;
                    num3 = num19;
                    num16 = (Integer) b.i(serialDescriptor, 37, a7a.a, num16);
                    i4 |= 32;
                    Unit unit3422222 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 38:
                    num6 = num18;
                    num3 = num19;
                    num17 = (Integer) b.i(serialDescriptor, 38, a7a.a, num17);
                    i4 |= 64;
                    Unit unit34222222 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 39:
                    num6 = num18;
                    num3 = num19;
                    num15 = (Integer) b.i(serialDescriptor, 39, a7a.a, num15);
                    i4 |= 128;
                    Unit unit342222222 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 40:
                    num6 = num18;
                    num3 = num19;
                    d = (Double) b.i(serialDescriptor, 40, h75.a, d);
                    i4 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit3422222222 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                case 41:
                    num6 = num18;
                    num3 = num19;
                    d2 = (Double) b.i(serialDescriptor, 41, h75.a, d2);
                    i4 |= 512;
                    Unit unit34222222222 = Unit.a;
                    num = num10;
                    num18 = num6;
                    num19 = num3;
                    num10 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num93 = num10;
        int i30 = i6;
        Integer num94 = num32;
        Integer num95 = num11;
        Integer num96 = num21;
        b.c(serialDescriptor);
        Double d5 = d2;
        return new HandballPlayerSeasonStatistics(i30, i4, i5, str, num96, d3, num22, num23, num24, num25, num26, num27, num28, num29, num30, num31, num94, num33, num34, num35, num36, num37, num38, num39, num40, num41, num42, num43, num44, num45, num46, num18, num19, num20, num14, num12, num95, num93, num13, num16, num17, num15, d, d5, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull HandballPlayerSeasonStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        HandballPlayerSeasonStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
