package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0002`_BÁ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aB×\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u0010&J\u0012\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b3\u0010$J\u0012\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u0010$J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010$Jð\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b8\u0010\"J\u0010\u00109\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b9\u0010 J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bO\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bP\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bQ\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bR\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bS\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bT\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bU\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bV\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bW\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bX\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bY\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bZ\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\b[\u0010$R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\b\\\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010L\u001a\u0004\b]\u0010$R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\b^\u0010$¨\u0006a"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "sets", "pointsTotal", "breakPoints", "blockPoints", "serves", "serveErrors", "aces", "receptionsTotal", "receptionErrors", "receptionWin", "receptionPerf", "attacksTotal", "attackErrors", "attacksBlocked", "attackPoints", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getSets", "getPointsTotal", "getBreakPoints", "getBlockPoints", "getServes", "getServeErrors", "getAces", "getReceptionsTotal", "getReceptionErrors", "getReceptionWin", "getReceptionPerf", "getAttacksTotal", "getAttackErrors", "getAttacksBlocked", "getAttackPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VolleyballPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer aces;

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer attackErrors;

    @Nullable
    private final Integer attackPoints;

    @Nullable
    private final Integer attacksBlocked;

    @Nullable
    private final Integer attacksTotal;

    @Nullable
    private final Integer blockPoints;

    @Nullable
    private final Integer breakPoints;
    private final int id;

    @Nullable
    private final Integer pointsTotal;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer receptionErrors;

    @Nullable
    private final Double receptionPerf;

    @Nullable
    private final Integer receptionWin;

    @Nullable
    private final Integer receptionsTotal;

    @Nullable
    private final Integer serveErrors;

    @Nullable
    private final Integer serves;

    @Nullable
    private final Integer sets;

    @NotNull
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VolleyballPlayerSeasonStatistics(int i, int i2, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Double d2, Integer num12, Integer num13, Integer num14, Integer num15, t5h t5hVar) {
        super(i, t5hVar);
        if (524287 != (i & 524287)) {
            oea.z(i, 524287, VolleyballPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.sets = num2;
        this.pointsTotal = num3;
        this.breakPoints = num4;
        this.blockPoints = num5;
        this.serves = num6;
        this.serveErrors = num7;
        this.aces = num8;
        this.receptionsTotal = num9;
        this.receptionErrors = num10;
        this.receptionWin = num11;
        this.receptionPerf = d2;
        this.attacksTotal = num12;
        this.attackErrors = num13;
        this.attacksBlocked = num14;
        this.attackPoints = num15;
    }

    public static /* synthetic */ VolleyballPlayerSeasonStatistics copy$default(VolleyballPlayerSeasonStatistics volleyballPlayerSeasonStatistics, int i, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Double d2, Integer num12, Integer num13, Integer num14, Integer num15, int i2, Object obj) {
        Integer num16;
        Integer num17;
        int i3 = (i2 & 1) != 0 ? volleyballPlayerSeasonStatistics.id : i;
        String str2 = (i2 & 2) != 0 ? volleyballPlayerSeasonStatistics.type : str;
        Integer num18 = (i2 & 4) != 0 ? volleyballPlayerSeasonStatistics.appearances : num;
        Double d3 = (i2 & 8) != 0 ? volleyballPlayerSeasonStatistics.rating : d;
        Integer num19 = (i2 & 16) != 0 ? volleyballPlayerSeasonStatistics.sets : num2;
        Integer num20 = (i2 & 32) != 0 ? volleyballPlayerSeasonStatistics.pointsTotal : num3;
        Integer num21 = (i2 & 64) != 0 ? volleyballPlayerSeasonStatistics.breakPoints : num4;
        Integer num22 = (i2 & 128) != 0 ? volleyballPlayerSeasonStatistics.blockPoints : num5;
        Integer num23 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? volleyballPlayerSeasonStatistics.serves : num6;
        Integer num24 = (i2 & 512) != 0 ? volleyballPlayerSeasonStatistics.serveErrors : num7;
        Integer num25 = (i2 & 1024) != 0 ? volleyballPlayerSeasonStatistics.aces : num8;
        Integer num26 = (i2 & a.o) != 0 ? volleyballPlayerSeasonStatistics.receptionsTotal : num9;
        Integer num27 = (i2 & 4096) != 0 ? volleyballPlayerSeasonStatistics.receptionErrors : num10;
        Integer num28 = (i2 & 8192) != 0 ? volleyballPlayerSeasonStatistics.receptionWin : num11;
        int i4 = i3;
        Double d4 = (i2 & 16384) != 0 ? volleyballPlayerSeasonStatistics.receptionPerf : d2;
        Integer num29 = (i2 & 32768) != 0 ? volleyballPlayerSeasonStatistics.attacksTotal : num12;
        Integer num30 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? volleyballPlayerSeasonStatistics.attackErrors : num13;
        Integer num31 = (i2 & 131072) != 0 ? volleyballPlayerSeasonStatistics.attacksBlocked : num14;
        if ((i2 & 262144) != 0) {
            num17 = num31;
            num16 = volleyballPlayerSeasonStatistics.attackPoints;
        } else {
            num16 = num15;
            num17 = num31;
        }
        return volleyballPlayerSeasonStatistics.copy(i4, str2, num18, d3, num19, num20, num21, num22, num23, num24, num25, num26, num27, num28, d4, num29, num30, num17, num16);
    }

    public static final /* synthetic */ void write$Self$model_release(VolleyballPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.getRating());
        output.h(serialDesc, 4, a7aVar, self.sets);
        output.h(serialDesc, 5, a7aVar, self.pointsTotal);
        output.h(serialDesc, 6, a7aVar, self.breakPoints);
        output.h(serialDesc, 7, a7aVar, self.blockPoints);
        output.h(serialDesc, 8, a7aVar, self.serves);
        output.h(serialDesc, 9, a7aVar, self.serveErrors);
        output.h(serialDesc, 10, a7aVar, self.aces);
        output.h(serialDesc, 11, a7aVar, self.receptionsTotal);
        output.h(serialDesc, 12, a7aVar, self.receptionErrors);
        output.h(serialDesc, 13, a7aVar, self.receptionWin);
        output.h(serialDesc, 14, h75Var, self.receptionPerf);
        output.h(serialDesc, 15, a7aVar, self.attacksTotal);
        output.h(serialDesc, 16, a7aVar, self.attackErrors);
        output.h(serialDesc, 17, a7aVar, self.attacksBlocked);
        output.h(serialDesc, 18, a7aVar, self.attackPoints);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getServeErrors() {
        return this.serveErrors;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getReceptionsTotal() {
        return this.receptionsTotal;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getReceptionErrors() {
        return this.receptionErrors;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getReceptionWin() {
        return this.receptionWin;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getReceptionPerf() {
        return this.receptionPerf;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getAttacksTotal() {
        return this.attacksTotal;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getAttackErrors() {
        return this.attackErrors;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getAttacksBlocked() {
        return this.attacksBlocked;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getAttackPoints() {
        return this.attackPoints;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getSets() {
        return this.sets;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getBreakPoints() {
        return this.breakPoints;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getServes() {
        return this.serves;
    }

    @NotNull
    public final VolleyballPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Integer sets, @Nullable Integer pointsTotal, @Nullable Integer breakPoints, @Nullable Integer blockPoints, @Nullable Integer serves, @Nullable Integer serveErrors, @Nullable Integer aces, @Nullable Integer receptionsTotal, @Nullable Integer receptionErrors, @Nullable Integer receptionWin, @Nullable Double receptionPerf, @Nullable Integer attacksTotal, @Nullable Integer attackErrors, @Nullable Integer attacksBlocked, @Nullable Integer attackPoints) {
        type.getClass();
        return new VolleyballPlayerSeasonStatistics(id, type, appearances, rating, sets, pointsTotal, breakPoints, blockPoints, serves, serveErrors, aces, receptionsTotal, receptionErrors, receptionWin, receptionPerf, attacksTotal, attackErrors, attacksBlocked, attackPoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolleyballPlayerSeasonStatistics)) {
            return false;
        }
        VolleyballPlayerSeasonStatistics volleyballPlayerSeasonStatistics = (VolleyballPlayerSeasonStatistics) other;
        return this.id == volleyballPlayerSeasonStatistics.id && Intrinsics.c(this.type, volleyballPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, volleyballPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, volleyballPlayerSeasonStatistics.rating) && Intrinsics.c(this.sets, volleyballPlayerSeasonStatistics.sets) && Intrinsics.c(this.pointsTotal, volleyballPlayerSeasonStatistics.pointsTotal) && Intrinsics.c(this.breakPoints, volleyballPlayerSeasonStatistics.breakPoints) && Intrinsics.c(this.blockPoints, volleyballPlayerSeasonStatistics.blockPoints) && Intrinsics.c(this.serves, volleyballPlayerSeasonStatistics.serves) && Intrinsics.c(this.serveErrors, volleyballPlayerSeasonStatistics.serveErrors) && Intrinsics.c(this.aces, volleyballPlayerSeasonStatistics.aces) && Intrinsics.c(this.receptionsTotal, volleyballPlayerSeasonStatistics.receptionsTotal) && Intrinsics.c(this.receptionErrors, volleyballPlayerSeasonStatistics.receptionErrors) && Intrinsics.c(this.receptionWin, volleyballPlayerSeasonStatistics.receptionWin) && Intrinsics.c(this.receptionPerf, volleyballPlayerSeasonStatistics.receptionPerf) && Intrinsics.c(this.attacksTotal, volleyballPlayerSeasonStatistics.attacksTotal) && Intrinsics.c(this.attackErrors, volleyballPlayerSeasonStatistics.attackErrors) && Intrinsics.c(this.attacksBlocked, volleyballPlayerSeasonStatistics.attacksBlocked) && Intrinsics.c(this.attackPoints, volleyballPlayerSeasonStatistics.attackPoints);
    }

    @Nullable
    public final Integer getAces() {
        return this.aces;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Integer getAttackErrors() {
        return this.attackErrors;
    }

    @Nullable
    public final Integer getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    public final Integer getAttacksBlocked() {
        return this.attacksBlocked;
    }

    @Nullable
    public final Integer getAttacksTotal() {
        return this.attacksTotal;
    }

    @Nullable
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    public final Integer getBreakPoints() {
        return this.breakPoints;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getReceptionErrors() {
        return this.receptionErrors;
    }

    @Nullable
    public final Double getReceptionPerf() {
        return this.receptionPerf;
    }

    @Nullable
    public final Integer getReceptionWin() {
        return this.receptionWin;
    }

    @Nullable
    public final Integer getReceptionsTotal() {
        return this.receptionsTotal;
    }

    @Nullable
    public final Integer getServeErrors() {
        return this.serveErrors;
    }

    @Nullable
    public final Integer getServes() {
        return this.serves;
    }

    @Nullable
    public final Integer getSets() {
        return this.sets;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.appearances;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.sets;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pointsTotal;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.breakPoints;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.blockPoints;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.serves;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.serveErrors;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.aces;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.receptionsTotal;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.receptionErrors;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.receptionWin;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Double d2 = this.receptionPerf;
        int hashCode13 = (hashCode12 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num12 = this.attacksTotal;
        int hashCode14 = (hashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.attackErrors;
        int hashCode15 = (hashCode14 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.attacksBlocked;
        int hashCode16 = (hashCode15 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.attackPoints;
        return hashCode16 + (num15 != null ? num15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Integer num2 = this.sets;
        Integer num3 = this.pointsTotal;
        Integer num4 = this.breakPoints;
        Integer num5 = this.blockPoints;
        Integer num6 = this.serves;
        Integer num7 = this.serveErrors;
        Integer num8 = this.aces;
        Integer num9 = this.receptionsTotal;
        Integer num10 = this.receptionErrors;
        Integer num11 = this.receptionWin;
        Double d2 = this.receptionPerf;
        Integer num12 = this.attacksTotal;
        Integer num13 = this.attackErrors;
        Integer num14 = this.attacksBlocked;
        Integer num15 = this.attackPoints;
        StringBuilder t = dmi.t(i, "VolleyballPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", sets=", t);
        vxd.r(num2, num3, ", pointsTotal=", ", breakPoints=", t);
        vxd.r(num4, num5, ", blockPoints=", ", serves=", t);
        vxd.r(num6, num7, ", serveErrors=", ", aces=", t);
        vxd.r(num8, num9, ", receptionsTotal=", ", receptionErrors=", t);
        vxd.r(num10, num11, ", receptionWin=", ", receptionPerf=", t);
        mz1.x(d2, num12, ", attacksTotal=", ", attackErrors=", t);
        vxd.r(num13, num14, ", attacksBlocked=", ", attackPoints=", t);
        return vxd.n(t, num15, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VolleyballPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VolleyballPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Double d2, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.sets = num2;
        this.pointsTotal = num3;
        this.breakPoints = num4;
        this.blockPoints = num5;
        this.serves = num6;
        this.serveErrors = num7;
        this.aces = num8;
        this.receptionsTotal = num9;
        this.receptionErrors = num10;
        this.receptionWin = num11;
        this.receptionPerf = d2;
        this.attacksTotal = num12;
        this.attackErrors = num13;
        this.attacksBlocked = num14;
        this.attackPoints = num15;
    }
}
