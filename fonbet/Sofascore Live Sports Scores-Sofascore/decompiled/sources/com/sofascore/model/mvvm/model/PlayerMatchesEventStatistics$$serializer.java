package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.h75;
import defpackage.iw8;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/PlayerMatchesEventStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PlayerMatchesEventStatistics$$serializer implements iw8 {

    @NotNull
    public static final PlayerMatchesEventStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PlayerMatchesEventStatistics$$serializer playerMatchesEventStatistics$$serializer = new PlayerMatchesEventStatistics$$serializer();
        INSTANCE = playerMatchesEventStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics", playerMatchesEventStatistics$$serializer, 33);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("points", true);
        uyeVar.j("rebounds", true);
        uyeVar.j("assists", true);
        uyeVar.j("steals", true);
        uyeVar.j("blocks", true);
        uyeVar.j("pointsTotal", true);
        uyeVar.j("attackPoints", true);
        uyeVar.j("blockPoints", true);
        uyeVar.j("aces", true);
        uyeVar.j("battingAtBats", true);
        uyeVar.j("battingRuns", true);
        uyeVar.j("battingHits", true);
        uyeVar.j("battingRbi", true);
        uyeVar.j("battingHomeRuns", true);
        uyeVar.j("battingBaseOnBalls", true);
        uyeVar.j("battingStrikeOuts", true);
        uyeVar.j("battingAverageToDate", true);
        uyeVar.j("battingOnBasePercentageToDate", true);
        uyeVar.j("battingSluggingPercentageToDate", true);
        uyeVar.j("battingOpsToDate", true);
        uyeVar.j("battingGamesPlayed", true);
        uyeVar.j("pitchingInningsPitched", true);
        uyeVar.j("pitchingEarnedRunsAverageToDate", true);
        uyeVar.j("pitchingHitsAllowed", true);
        uyeVar.j("pitchingRuns", true);
        uyeVar.j("pitchingEarnedRuns", true);
        uyeVar.j("pitchingBaseOnBalls", true);
        uyeVar.j("pitchingStrikeOuts", true);
        uyeVar.j("pitchingHomeRuns", true);
        uyeVar.j("pitchingPitchesThrown", true);
        uyeVar.j("pitchingStrikes", true);
        uyeVar.j("pitchingWhipToDate", true);
        descriptor = uyeVar;
    }

    private PlayerMatchesEventStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        h75 h75Var = h75.a;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{h75Var, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, h75Var, h75Var, h75Var, h75Var, a7aVar, h75Var, h75Var, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, h75Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PlayerMatchesEventStatistics deserialize(@NotNull Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    Unit unit = Unit.a;
                    z = false;
                case 0:
                    double D = b.D(serialDescriptor, 0);
                    i2 |= 1;
                    Unit unit2 = Unit.a;
                    d = D;
                case 1:
                    i4 = b.l(serialDescriptor, 1);
                    i2 |= 2;
                    Unit unit3 = Unit.a;
                case 2:
                    i5 = b.l(serialDescriptor, 2);
                    i2 |= 4;
                    Unit unit32 = Unit.a;
                case 3:
                    i6 = b.l(serialDescriptor, 3);
                    i2 |= 8;
                    Unit unit322 = Unit.a;
                case 4:
                    i7 = b.l(serialDescriptor, 4);
                    i2 |= 16;
                    Unit unit3222 = Unit.a;
                case 5:
                    i8 = b.l(serialDescriptor, 5);
                    i2 |= 32;
                    Unit unit32222 = Unit.a;
                case 6:
                    i9 = b.l(serialDescriptor, 6);
                    i2 |= 64;
                    Unit unit322222 = Unit.a;
                case 7:
                    i10 = b.l(serialDescriptor, 7);
                    i2 |= 128;
                    Unit unit3222222 = Unit.a;
                case 8:
                    i11 = b.l(serialDescriptor, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit32222222 = Unit.a;
                case 9:
                    i12 = b.l(serialDescriptor, 9);
                    i2 |= 512;
                    Unit unit322222222 = Unit.a;
                case 10:
                    i13 = b.l(serialDescriptor, 10);
                    i2 |= 1024;
                    Unit unit3222222222 = Unit.a;
                case 11:
                    i14 = b.l(serialDescriptor, 11);
                    i2 |= a.o;
                    Unit unit32222222222 = Unit.a;
                case 12:
                    i15 = b.l(serialDescriptor, 12);
                    i2 |= 4096;
                    Unit unit322222222222 = Unit.a;
                case 13:
                    i16 = b.l(serialDescriptor, 13);
                    i2 |= 8192;
                    Unit unit3222222222222 = Unit.a;
                case 14:
                    i17 = b.l(serialDescriptor, 14);
                    i2 |= 16384;
                    Unit unit32222222222222 = Unit.a;
                case 15:
                    i18 = b.l(serialDescriptor, 15);
                    i = 32768;
                    i2 |= i;
                    Unit unit322222222222222 = Unit.a;
                case 16:
                    i19 = b.l(serialDescriptor, 16);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    Unit unit3222222222222222 = Unit.a;
                case 17:
                    double D2 = b.D(serialDescriptor, 17);
                    i2 |= 131072;
                    Unit unit4 = Unit.a;
                    d2 = D2;
                case 18:
                    double D3 = b.D(serialDescriptor, 18);
                    i2 |= 262144;
                    Unit unit5 = Unit.a;
                    d3 = D3;
                case 19:
                    double D4 = b.D(serialDescriptor, 19);
                    i2 |= 524288;
                    Unit unit6 = Unit.a;
                    d4 = D4;
                case 20:
                    double D5 = b.D(serialDescriptor, 20);
                    i2 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit7 = Unit.a;
                    d5 = D5;
                case 21:
                    i20 = b.l(serialDescriptor, 21);
                    i = 2097152;
                    i2 |= i;
                    Unit unit32222222222222222 = Unit.a;
                case 22:
                    double D6 = b.D(serialDescriptor, 22);
                    i2 |= 4194304;
                    Unit unit8 = Unit.a;
                    d6 = D6;
                case 23:
                    double D7 = b.D(serialDescriptor, 23);
                    i2 |= 8388608;
                    Unit unit9 = Unit.a;
                    d7 = D7;
                case 24:
                    i21 = b.l(serialDescriptor, 24);
                    i = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i2 |= i;
                    Unit unit322222222222222222 = Unit.a;
                case 25:
                    i22 = b.l(serialDescriptor, 25);
                    i = 33554432;
                    i2 |= i;
                    Unit unit3222222222222222222 = Unit.a;
                case 26:
                    i23 = b.l(serialDescriptor, 26);
                    i = 67108864;
                    i2 |= i;
                    Unit unit32222222222222222222 = Unit.a;
                case 27:
                    i24 = b.l(serialDescriptor, 27);
                    i = 134217728;
                    i2 |= i;
                    Unit unit322222222222222222222 = Unit.a;
                case 28:
                    i25 = b.l(serialDescriptor, 28);
                    i = 268435456;
                    i2 |= i;
                    Unit unit3222222222222222222222 = Unit.a;
                case 29:
                    i26 = b.l(serialDescriptor, 29);
                    i = 536870912;
                    i2 |= i;
                    Unit unit32222222222222222222222 = Unit.a;
                case 30:
                    i27 = b.l(serialDescriptor, 30);
                    i = 1073741824;
                    i2 |= i;
                    Unit unit322222222222222222222222 = Unit.a;
                case 31:
                    i28 = b.l(serialDescriptor, 31);
                    i = Integer.MIN_VALUE;
                    i2 |= i;
                    Unit unit3222222222222222222222222 = Unit.a;
                case 32:
                    double D8 = b.D(serialDescriptor, 32);
                    Unit unit10 = Unit.a;
                    i3 = 1;
                    d8 = D8;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlayerMatchesEventStatistics(i2, i3, d, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, d2, d3, d4, d5, i20, d6, d7, i21, i22, i23, i24, i25, i26, i27, i28, d8, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PlayerMatchesEventStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PlayerMatchesEventStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
