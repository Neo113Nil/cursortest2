package com.sofascore.model.newNetwork.statistics.season.team;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.gz1;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class TennisTeamSeasonStatistics$$serializer implements iw8 {

    @NotNull
    public static final TennisTeamSeasonStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TennisTeamSeasonStatistics$$serializer tennisTeamSeasonStatistics$$serializer = new TennisTeamSeasonStatistics$$serializer();
        INSTANCE = tennisTeamSeasonStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics", tennisTeamSeasonStatistics$$serializer, 23);
        uyeVar.j("matches", false);
        uyeVar.j("wins", false);
        uyeVar.j("awardedMatches", false);
        uyeVar.j("aces", false);
        uyeVar.j("breakPointsScored", false);
        uyeVar.j("breakPointsTotal", false);
        uyeVar.j("opponentBreakPointsScored", false);
        uyeVar.j("opponentBreakPointsTotal", false);
        uyeVar.j("firstServePointsScored", false);
        uyeVar.j("firstServePointsTotal", false);
        uyeVar.j("firstServeTotal", false);
        uyeVar.j("secondServePointsScored", false);
        uyeVar.j("secondServePointsTotal", false);
        uyeVar.j("secondServeTotal", false);
        uyeVar.j("tiebreakLosses", false);
        uyeVar.j("tiebreaksWon", false);
        uyeVar.j("totalServeAttempts", false);
        uyeVar.j("doubleFaults", false);
        uyeVar.j("groundType", false);
        uyeVar.j("tournamentsWon", false);
        uyeVar.j("tournamentsPlayed", false);
        uyeVar.j("placementRoundName", true);
        uyeVar.j("placementIsWinner", true);
        descriptor = uyeVar;
    }

    private TennisTeamSeasonStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(a7aVar);
        KSerializer W8 = l98.W(a7aVar);
        KSerializer W9 = l98.W(a7aVar);
        KSerializer W10 = l98.W(a7aVar);
        KSerializer W11 = l98.W(a7aVar);
        KSerializer W12 = l98.W(a7aVar);
        KSerializer W13 = l98.W(a7aVar);
        KSerializer W14 = l98.W(a7aVar);
        KSerializer W15 = l98.W(a7aVar);
        KSerializer W16 = l98.W(a7aVar);
        KSerializer W17 = l98.W(a7aVar);
        KSerializer W18 = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, W7, W8, W9, W10, W11, W12, W13, W14, W15, W16, W17, W18, l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(gz1.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final TennisTeamSeasonStatistics deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        int i;
        Boolean bool;
        Integer num3;
        Integer num4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num5 = null;
        Integer num6 = null;
        Boolean bool2 = null;
        Integer num7 = null;
        String str = null;
        int i2 = 0;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        String str2 = null;
        Integer num13 = null;
        Integer num14 = null;
        boolean z = true;
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
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    bool = bool2;
                    z = false;
                    num6 = num6;
                    num15 = num15;
                    bool2 = bool;
                case 0:
                    num = num5;
                    i2 |= 1;
                    num16 = num16;
                    num6 = num6;
                    bool2 = bool2;
                    num15 = (Integer) b.i(serialDescriptor, 0, a7a.a, num15);
                    num5 = num;
                case 1:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num16 = (Integer) b.i(serialDescriptor, 1, a7a.a, num16);
                    i2 |= 2;
                    num17 = num17;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 2:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num17 = (Integer) b.i(serialDescriptor, 2, a7a.a, num17);
                    i2 |= 4;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 3:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num18 = (Integer) b.i(serialDescriptor, 3, a7a.a, num18);
                    i2 |= 8;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 4:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num19 = (Integer) b.i(serialDescriptor, 4, a7a.a, num19);
                    i2 |= 16;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 5:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num20 = (Integer) b.i(serialDescriptor, 5, a7a.a, num20);
                    i2 |= 32;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 6:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num21 = (Integer) b.i(serialDescriptor, 6, a7a.a, num21);
                    i2 |= 64;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 7:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num22 = (Integer) b.i(serialDescriptor, 7, a7a.a, num22);
                    i2 |= 128;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 8:
                    num3 = num5;
                    num4 = num6;
                    bool = bool2;
                    num23 = (Integer) b.i(serialDescriptor, 8, a7a.a, num23);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 9:
                    num3 = num5;
                    bool = bool2;
                    num4 = num6;
                    num24 = (Integer) b.i(serialDescriptor, 9, a7a.a, num24);
                    i2 |= 512;
                    num6 = num4;
                    num5 = num3;
                    bool2 = bool;
                case 10:
                    bool = bool2;
                    num3 = num5;
                    num6 = (Integer) b.i(serialDescriptor, 10, a7a.a, num6);
                    i2 |= 1024;
                    num5 = num3;
                    bool2 = bool;
                case 11:
                    bool = bool2;
                    num5 = (Integer) b.i(serialDescriptor, 11, a7a.a, num5);
                    i2 |= a.o;
                    num6 = num6;
                    bool2 = bool;
                case 12:
                    num = num5;
                    num2 = num6;
                    num7 = (Integer) b.i(serialDescriptor, 12, a7a.a, num7);
                    i2 |= 4096;
                    num6 = num2;
                    num5 = num;
                case 13:
                    num = num5;
                    num2 = num6;
                    num8 = (Integer) b.i(serialDescriptor, 13, a7a.a, num8);
                    i2 |= 8192;
                    num6 = num2;
                    num5 = num;
                case 14:
                    num = num5;
                    num2 = num6;
                    num9 = (Integer) b.i(serialDescriptor, 14, a7a.a, num9);
                    i2 |= 16384;
                    num6 = num2;
                    num5 = num;
                case 15:
                    num = num5;
                    num2 = num6;
                    num10 = (Integer) b.i(serialDescriptor, 15, a7a.a, num10);
                    i = 32768;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 16:
                    num = num5;
                    num2 = num6;
                    num11 = (Integer) b.i(serialDescriptor, 16, a7a.a, num11);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 17:
                    num = num5;
                    num2 = num6;
                    num12 = (Integer) b.i(serialDescriptor, 17, a7a.a, num12);
                    i = 131072;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 18:
                    num = num5;
                    num2 = num6;
                    str2 = (String) b.i(serialDescriptor, 18, uhi.a, str2);
                    i = 262144;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 19:
                    num = num5;
                    num2 = num6;
                    num13 = (Integer) b.i(serialDescriptor, 19, a7a.a, num13);
                    i = 524288;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 20:
                    num = num5;
                    num2 = num6;
                    num14 = (Integer) b.i(serialDescriptor, 20, a7a.a, num14);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 21:
                    num = num5;
                    num2 = num6;
                    str = (String) b.i(serialDescriptor, 21, uhi.a, str);
                    i = 2097152;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 22:
                    num2 = num6;
                    num = num5;
                    bool2 = (Boolean) b.i(serialDescriptor, 22, gz1.a, bool2);
                    i = 4194304;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num25 = num6;
        Boolean bool3 = bool2;
        Integer num26 = num15;
        Integer num27 = num16;
        Integer num28 = num17;
        b.c(serialDescriptor);
        Integer num29 = num24;
        Integer num30 = num13;
        return new TennisTeamSeasonStatistics(i2, num26, num27, num28, num18, num19, num20, num21, num22, num23, num29, num25, num5, num7, num8, num9, num10, num11, num12, str2, num30, num14, str, bool3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull TennisTeamSeasonStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        TennisTeamSeasonStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
