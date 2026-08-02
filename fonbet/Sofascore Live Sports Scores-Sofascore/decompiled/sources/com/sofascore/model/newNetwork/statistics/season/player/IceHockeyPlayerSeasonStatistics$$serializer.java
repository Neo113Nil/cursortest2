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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class IceHockeyPlayerSeasonStatistics$$serializer implements iw8 {

    @NotNull
    public static final IceHockeyPlayerSeasonStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        IceHockeyPlayerSeasonStatistics$$serializer iceHockeyPlayerSeasonStatistics$$serializer = new IceHockeyPlayerSeasonStatistics$$serializer();
        INSTANCE = iceHockeyPlayerSeasonStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.IceHockeyPlayerSeasonStatistics", iceHockeyPlayerSeasonStatistics$$serializer, 52);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("appearances", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("assists", false);
        uyeVar.j("blocked", false);
        uyeVar.j("evenSaves", false);
        uyeVar.j("evenSavePercentage", false);
        uyeVar.j("evenShots", false);
        uyeVar.j("evenGoals", false);
        uyeVar.j("evenAssists", false);
        uyeVar.j("evenPoints", false);
        uyeVar.j("evenTimeOnIce", false);
        uyeVar.j("faceOffPercentage", false);
        uyeVar.j("faceOffTaken", false);
        uyeVar.j("faceOffWins", false);
        uyeVar.j("gameWinningGoals", false);
        uyeVar.j("gamesStarted", false);
        uyeVar.j("goals", false);
        uyeVar.j("goalsAgainst", false);
        uyeVar.j("goalsAgainstAverage", false);
        uyeVar.j("hits", false);
        uyeVar.j("overTimeGoals", false);
        uyeVar.j("penaltyMinutes", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("points", false);
        uyeVar.j("powerPlayGoals", false);
        uyeVar.j("powerPlayPoints", false);
        uyeVar.j("powerPlayAssists", false);
        uyeVar.j("powerPlaySaves", false);
        uyeVar.j("powerPlayShots", false);
        uyeVar.j("powerPlayTimeOnIce", false);
        uyeVar.j("powerPlaySavePercentage", false);
        uyeVar.j("savePercentage", false);
        uyeVar.j("saves", false);
        uyeVar.j("shortHandedGoals", false);
        uyeVar.j("shortHandedPoints", false);
        uyeVar.j("shortHandedAssists", false);
        uyeVar.j("shortHandedSaves", false);
        uyeVar.j("shortHandedShots", false);
        uyeVar.j("shortHandedTimeOnIce", false);
        uyeVar.j("shortHandedSavePercentage", false);
        uyeVar.j("shots", false);
        uyeVar.j("shotsAgainst", false);
        uyeVar.j("shotPercentage", false);
        uyeVar.j("shutouts", false);
        uyeVar.j("losses", false);
        uyeVar.j("overTimeLosses", false);
        uyeVar.j("shifts", false);
        uyeVar.j("takeaways", false);
        uyeVar.j("timeOnIce", false);
        uyeVar.j("wins", false);
        descriptor = uyeVar;
    }

    private IceHockeyPlayerSeasonStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, uhi.a, W, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final IceHockeyPlayerSeasonStatistics deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        int i;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        int i3 = 0;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Double d = null;
        Integer num17 = null;
        Integer num18 = null;
        Double d2 = null;
        boolean z = true;
        int i4 = 0;
        String str = null;
        Integer num19 = null;
        Double d3 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Double d4 = null;
        Integer num23 = null;
        Integer num24 = null;
        Integer num25 = null;
        Integer num26 = null;
        Integer num27 = null;
        Double d5 = null;
        int i5 = 0;
        Integer num28 = null;
        Integer num29 = null;
        Integer num30 = null;
        Integer num31 = null;
        Integer num32 = null;
        Integer num33 = null;
        Double d6 = null;
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
        Double d7 = null;
        Double d8 = null;
        Integer num45 = null;
        Integer num46 = null;
        Integer num47 = null;
        Integer num48 = null;
        Integer num49 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    i = i5;
                    num4 = num28;
                    num5 = num9;
                    Unit unit = Unit.a;
                    z = false;
                    num9 = num5;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 0:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i6 = i5;
                    num4 = num28;
                    num5 = num9;
                    int l = b.l(serialDescriptor, 0);
                    i = i6 | 1;
                    Unit unit2 = Unit.a;
                    i4 = l;
                    num9 = num5;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 1:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i7 = i5;
                    num4 = num28;
                    String n = b.n(serialDescriptor, 1);
                    i = i7 | 2;
                    Unit unit3 = Unit.a;
                    str = n;
                    num9 = num9;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 2:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i8 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num50 = (Integer) b.i(serialDescriptor, 2, a7a.a, num19);
                    i = i8 | 4;
                    Unit unit4 = Unit.a;
                    num19 = num50;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 3:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i9 = i5;
                    num4 = num28;
                    num6 = num9;
                    Double d9 = (Double) b.i(serialDescriptor, 3, h75.a, d3);
                    i = i9 | 8;
                    Unit unit5 = Unit.a;
                    d3 = d9;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 4:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i10 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num51 = (Integer) b.i(serialDescriptor, 4, a7a.a, num20);
                    i = i10 | 16;
                    Unit unit6 = Unit.a;
                    num20 = num51;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 5:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i11 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num52 = (Integer) b.i(serialDescriptor, 5, a7a.a, num21);
                    i = i11 | 32;
                    Unit unit7 = Unit.a;
                    num21 = num52;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 6:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i12 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num53 = (Integer) b.i(serialDescriptor, 6, a7a.a, num22);
                    i = i12 | 64;
                    Unit unit8 = Unit.a;
                    num22 = num53;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 7:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i13 = i5;
                    num4 = num28;
                    num6 = num9;
                    Double d10 = (Double) b.i(serialDescriptor, 7, h75.a, d4);
                    i = i13 | 128;
                    Unit unit9 = Unit.a;
                    d4 = d10;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 8:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i14 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num54 = (Integer) b.i(serialDescriptor, 8, a7a.a, num23);
                    i = i14 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    num23 = num54;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 9:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i15 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num55 = (Integer) b.i(serialDescriptor, 9, a7a.a, num24);
                    i = i15 | 512;
                    Unit unit11 = Unit.a;
                    num24 = num55;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 10:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i16 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num56 = (Integer) b.i(serialDescriptor, 10, a7a.a, num25);
                    i = i16 | 1024;
                    Unit unit12 = Unit.a;
                    num25 = num56;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 11:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i17 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num57 = (Integer) b.i(serialDescriptor, 11, a7a.a, num26);
                    i = i17 | a.o;
                    Unit unit13 = Unit.a;
                    num26 = num57;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 12:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i18 = i5;
                    num4 = num28;
                    num6 = num9;
                    Integer num58 = (Integer) b.i(serialDescriptor, 12, a7a.a, num27);
                    i = i18 | 4096;
                    Unit unit14 = Unit.a;
                    num27 = num58;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 13:
                    num = num8;
                    num2 = num13;
                    num3 = num16;
                    int i19 = i5;
                    num4 = num28;
                    num6 = num9;
                    Double d11 = (Double) b.i(serialDescriptor, 13, h75.a, d5);
                    i = i19 | 8192;
                    Unit unit15 = Unit.a;
                    d5 = d11;
                    num9 = num6;
                    num28 = num4;
                    i5 = i;
                    num13 = num2;
                    num16 = num3;
                    num8 = num;
                case 14:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num59 = (Integer) b.i(serialDescriptor, 14, a7a.a, num28);
                    Unit unit16 = Unit.a;
                    i5 |= 16384;
                    num28 = num59;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 15:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num60 = (Integer) b.i(serialDescriptor, 15, a7a.a, num29);
                    i2 = i5 | 32768;
                    Unit unit17 = Unit.a;
                    num29 = num60;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 16:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num61 = (Integer) b.i(serialDescriptor, 16, a7a.a, num30);
                    i2 = i5 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num30 = num61;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 17:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num62 = (Integer) b.i(serialDescriptor, 17, a7a.a, num31);
                    i2 = i5 | 131072;
                    Unit unit19 = Unit.a;
                    num31 = num62;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 18:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num63 = (Integer) b.i(serialDescriptor, 18, a7a.a, num32);
                    i2 = i5 | 262144;
                    Unit unit20 = Unit.a;
                    num32 = num63;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 19:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num64 = (Integer) b.i(serialDescriptor, 19, a7a.a, num33);
                    i2 = i5 | 524288;
                    Unit unit21 = Unit.a;
                    num33 = num64;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 20:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Double d12 = (Double) b.i(serialDescriptor, 20, h75.a, d6);
                    i2 = i5 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    d6 = d12;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 21:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num65 = (Integer) b.i(serialDescriptor, 21, a7a.a, num34);
                    i2 = i5 | 2097152;
                    Unit unit23 = Unit.a;
                    num34 = num65;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 22:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num66 = (Integer) b.i(serialDescriptor, 22, a7a.a, num35);
                    i2 = i5 | 4194304;
                    Unit unit24 = Unit.a;
                    num35 = num66;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 23:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num67 = (Integer) b.i(serialDescriptor, 23, a7a.a, num36);
                    i2 = i5 | 8388608;
                    Unit unit25 = Unit.a;
                    num36 = num67;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 24:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num68 = (Integer) b.i(serialDescriptor, 24, a7a.a, num37);
                    i2 = i5 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit26 = Unit.a;
                    num37 = num68;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 25:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num69 = (Integer) b.i(serialDescriptor, 25, a7a.a, num38);
                    i2 = i5 | 33554432;
                    Unit unit27 = Unit.a;
                    num38 = num69;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 26:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num70 = (Integer) b.i(serialDescriptor, 26, a7a.a, num39);
                    Unit unit28 = Unit.a;
                    i5 |= 67108864;
                    num39 = num70;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 27:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num71 = (Integer) b.i(serialDescriptor, 27, a7a.a, num40);
                    Unit unit29 = Unit.a;
                    i5 |= 134217728;
                    num40 = num71;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 28:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num72 = (Integer) b.i(serialDescriptor, 28, a7a.a, num41);
                    i2 = i5 | 268435456;
                    Unit unit30 = Unit.a;
                    num41 = num72;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 29:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num73 = (Integer) b.i(serialDescriptor, 29, a7a.a, num42);
                    i2 = i5 | 536870912;
                    Unit unit31 = Unit.a;
                    num42 = num73;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 30:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num74 = (Integer) b.i(serialDescriptor, 30, a7a.a, num43);
                    i2 = i5 | 1073741824;
                    Unit unit32 = Unit.a;
                    num43 = num74;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 31:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num75 = (Integer) b.i(serialDescriptor, 31, a7a.a, num44);
                    i2 = i5 | Integer.MIN_VALUE;
                    Unit unit33 = Unit.a;
                    num44 = num75;
                    i5 = i2;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 32:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Double d13 = (Double) b.i(serialDescriptor, 32, h75.a, d7);
                    i3 |= 1;
                    Unit unit34 = Unit.a;
                    d7 = d13;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 33:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Double d14 = (Double) b.i(serialDescriptor, 33, h75.a, d8);
                    i3 |= 2;
                    Unit unit35 = Unit.a;
                    d8 = d14;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 34:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num76 = (Integer) b.i(serialDescriptor, 34, a7a.a, num45);
                    i3 |= 4;
                    Unit unit36 = Unit.a;
                    num45 = num76;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 35:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num77 = (Integer) b.i(serialDescriptor, 35, a7a.a, num46);
                    i3 |= 8;
                    Unit unit37 = Unit.a;
                    num46 = num77;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 36:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num78 = (Integer) b.i(serialDescriptor, 36, a7a.a, num47);
                    i3 |= 16;
                    Unit unit38 = Unit.a;
                    num47 = num78;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 37:
                    num = num8;
                    num7 = num13;
                    num3 = num16;
                    Integer num79 = (Integer) b.i(serialDescriptor, 37, a7a.a, num48);
                    i3 |= 32;
                    Unit unit39 = Unit.a;
                    num48 = num79;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 38:
                    num = num8;
                    num3 = num16;
                    num7 = num13;
                    Integer num80 = (Integer) b.i(serialDescriptor, 38, a7a.a, num49);
                    i3 |= 64;
                    Unit unit40 = Unit.a;
                    num49 = num80;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 39:
                    num = num8;
                    num3 = num16;
                    num13 = (Integer) b.i(serialDescriptor, 39, a7a.a, num13);
                    i3 |= 128;
                    Unit unit41 = Unit.a;
                    num16 = num3;
                    num8 = num;
                case 40:
                    num7 = num13;
                    num = num8;
                    Integer num81 = (Integer) b.i(serialDescriptor, 40, a7a.a, num16);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit42 = Unit.a;
                    num3 = num81;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 41:
                    num7 = num13;
                    num3 = num16;
                    d = (Double) b.i(serialDescriptor, 41, h75.a, d);
                    i3 |= 512;
                    Unit unit43 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 42:
                    num7 = num13;
                    num3 = num16;
                    num17 = (Integer) b.i(serialDescriptor, 42, a7a.a, num17);
                    i3 |= 1024;
                    Unit unit432 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 43:
                    num7 = num13;
                    num3 = num16;
                    num18 = (Integer) b.i(serialDescriptor, 43, a7a.a, num18);
                    i3 |= a.o;
                    Unit unit4322 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 44:
                    num7 = num13;
                    num3 = num16;
                    d2 = (Double) b.i(serialDescriptor, 44, h75.a, d2);
                    i3 |= 4096;
                    Unit unit43222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 45:
                    num7 = num13;
                    num3 = num16;
                    num12 = (Integer) b.i(serialDescriptor, 45, a7a.a, num12);
                    i3 |= 8192;
                    Unit unit432222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 46:
                    num7 = num13;
                    num3 = num16;
                    num10 = (Integer) b.i(serialDescriptor, 46, a7a.a, num10);
                    i3 |= 16384;
                    Unit unit4322222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 47:
                    num7 = num13;
                    num3 = num16;
                    num9 = (Integer) b.i(serialDescriptor, 47, a7a.a, num9);
                    i3 |= 32768;
                    Unit unit43222222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 48:
                    num7 = num13;
                    num3 = num16;
                    num8 = (Integer) b.i(serialDescriptor, 48, a7a.a, num8);
                    i3 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit432222222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 49:
                    num7 = num13;
                    num3 = num16;
                    num11 = (Integer) b.i(serialDescriptor, 49, a7a.a, num11);
                    i3 |= 131072;
                    Unit unit4322222222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 50:
                    num7 = num13;
                    num3 = num16;
                    num14 = (Integer) b.i(serialDescriptor, 50, a7a.a, num14);
                    i3 |= 262144;
                    Unit unit43222222222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                case 51:
                    num7 = num13;
                    num3 = num16;
                    num15 = (Integer) b.i(serialDescriptor, 51, a7a.a, num15);
                    i3 |= 524288;
                    Unit unit432222222222 = Unit.a;
                    num = num8;
                    num13 = num7;
                    num16 = num3;
                    num8 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num82 = num8;
        int i20 = i5;
        Integer num83 = num28;
        Integer num84 = num9;
        Integer num85 = num19;
        b.c(serialDescriptor);
        return new IceHockeyPlayerSeasonStatistics(i20, i3, i4, str, num85, d3, num20, num21, num22, d4, num23, num24, num25, num26, num27, d5, num83, num29, num30, num31, num32, num33, d6, num34, num35, num36, num37, num38, num39, num40, num41, num42, num43, num44, d7, d8, num45, num46, num47, num48, num49, num13, num16, d, num17, num18, d2, num12, num10, num84, num82, num11, num14, num15, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull IceHockeyPlayerSeasonStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        IceHockeyPlayerSeasonStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
