package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.c88;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.h75;
import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002mlBÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eBß\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010$J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0012\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b:\u0010*J\u0012\u0010;\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b=\u0010>Jö\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010$J\u0010\u0010B\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bB\u0010(J\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FJ'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bS\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\bX\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bY\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bZ\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\b[\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\b\\\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\b^\u00101R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\b_\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\b`\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010V\u001a\u0004\ba\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bb\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bc\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bd\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010e\u001a\u0004\bf\u00109R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bg\u0010*R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010h\u001a\u0004\bi\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010j\u001a\u0004\bk\u0010>¨\u0006n"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerFixture;", "", "", "locationType", "Lcom/sofascore/model/fantasy/BasicTeam;", "team", "", "eventId", "homeTeamId", "awayTeamId", "missingType", "missingReason", "missingDescription", "playerFixtureStatus", "", "eventStartTimestamp", "eventStatusType", "fixtureDifficulty", "winnerCode", "playerTeamSide", "homeScore", "awayScore", "Lcom/sofascore/model/fantasy/FantasyRound;", "fantasyRound", "score", "", CampaignEx.JSON_KEY_STAR, "", "expectedPoints", "<init>", "(Ljava/lang/String;Lcom/sofascore/model/fantasy/BasicTeam;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Float;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sofascore/model/fantasy/BasicTeam;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Float;Lt5h;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sofascore/model/fantasy/BasicTeam;", "component3", "()I", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "component10", "()J", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/sofascore/model/fantasy/FantasyRound;", "component18", "component19", "()Ljava/lang/Double;", "component20", "()Ljava/lang/Float;", "copy", "(Ljava/lang/String;Lcom/sofascore/model/fantasy/BasicTeam;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Float;)Lcom/sofascore/model/fantasy/FantasyPlayerFixture;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPlayerFixture;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getLocationType", "Lcom/sofascore/model/fantasy/BasicTeam;", "getTeam", "I", "getEventId", "Ljava/lang/Integer;", "getHomeTeamId", "getAwayTeamId", "getMissingType", "getMissingReason", "getMissingDescription", "getPlayerFixtureStatus", "J", "getEventStartTimestamp", "getEventStatusType", "getFixtureDifficulty", "getWinnerCode", "getPlayerTeamSide", "getHomeScore", "getAwayScore", "Lcom/sofascore/model/fantasy/FantasyRound;", "getFantasyRound", "getScore", "Ljava/lang/Double;", "getRating", "Ljava/lang/Float;", "getExpectedPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerFixture {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer awayScore;

    @Nullable
    private final Integer awayTeamId;
    private final int eventId;
    private final long eventStartTimestamp;

    @NotNull
    private final String eventStatusType;

    @Nullable
    private final Float expectedPoints;

    @Nullable
    private final FantasyRound fantasyRound;

    @Nullable
    private final String fixtureDifficulty;

    @Nullable
    private final Integer homeScore;

    @Nullable
    private final Integer homeTeamId;

    @NotNull
    private final String locationType;

    @Nullable
    private final String missingDescription;

    @Nullable
    private final Integer missingReason;

    @Nullable
    private final String missingType;

    @Nullable
    private final String playerFixtureStatus;

    @Nullable
    private final Integer playerTeamSide;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer score;

    @NotNull
    private final BasicTeam team;

    @Nullable
    private final Integer winnerCode;

    public /* synthetic */ FantasyPlayerFixture(int i, String str, BasicTeam basicTeam, int i2, Integer num, Integer num2, String str2, Integer num3, String str3, String str4, long j, String str5, String str6, Integer num4, Integer num5, Integer num6, Integer num7, FantasyRound fantasyRound, Integer num8, Double d, Float f, t5h t5hVar) {
        if (1048575 != (i & 1048575)) {
            oea.z(i, 1048575, FantasyPlayerFixture$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.locationType = str;
        this.team = basicTeam;
        this.eventId = i2;
        this.homeTeamId = num;
        this.awayTeamId = num2;
        this.missingType = str2;
        this.missingReason = num3;
        this.missingDescription = str3;
        this.playerFixtureStatus = str4;
        this.eventStartTimestamp = j;
        this.eventStatusType = str5;
        this.fixtureDifficulty = str6;
        this.winnerCode = num4;
        this.playerTeamSide = num5;
        this.homeScore = num6;
        this.awayScore = num7;
        this.fantasyRound = fantasyRound;
        this.score = num8;
        this.rating = d;
        this.expectedPoints = f;
    }

    public static /* synthetic */ FantasyPlayerFixture copy$default(FantasyPlayerFixture fantasyPlayerFixture, String str, BasicTeam basicTeam, int i, Integer num, Integer num2, String str2, Integer num3, String str3, String str4, long j, String str5, String str6, Integer num4, Integer num5, Integer num6, Integer num7, FantasyRound fantasyRound, Integer num8, Double d, Float f, int i2, Object obj) {
        Float f2;
        Double d2;
        String str7 = (i2 & 1) != 0 ? fantasyPlayerFixture.locationType : str;
        BasicTeam basicTeam2 = (i2 & 2) != 0 ? fantasyPlayerFixture.team : basicTeam;
        int i3 = (i2 & 4) != 0 ? fantasyPlayerFixture.eventId : i;
        Integer num9 = (i2 & 8) != 0 ? fantasyPlayerFixture.homeTeamId : num;
        Integer num10 = (i2 & 16) != 0 ? fantasyPlayerFixture.awayTeamId : num2;
        String str8 = (i2 & 32) != 0 ? fantasyPlayerFixture.missingType : str2;
        Integer num11 = (i2 & 64) != 0 ? fantasyPlayerFixture.missingReason : num3;
        String str9 = (i2 & 128) != 0 ? fantasyPlayerFixture.missingDescription : str3;
        String str10 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? fantasyPlayerFixture.playerFixtureStatus : str4;
        long j2 = (i2 & 512) != 0 ? fantasyPlayerFixture.eventStartTimestamp : j;
        String str11 = (i2 & 1024) != 0 ? fantasyPlayerFixture.eventStatusType : str5;
        String str12 = (i2 & a.o) != 0 ? fantasyPlayerFixture.fixtureDifficulty : str6;
        Integer num12 = (i2 & 4096) != 0 ? fantasyPlayerFixture.winnerCode : num4;
        String str13 = str7;
        Integer num13 = (i2 & 8192) != 0 ? fantasyPlayerFixture.playerTeamSide : num5;
        Integer num14 = (i2 & 16384) != 0 ? fantasyPlayerFixture.homeScore : num6;
        Integer num15 = (i2 & 32768) != 0 ? fantasyPlayerFixture.awayScore : num7;
        FantasyRound fantasyRound2 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? fantasyPlayerFixture.fantasyRound : fantasyRound;
        Integer num16 = (i2 & 131072) != 0 ? fantasyPlayerFixture.score : num8;
        Double d3 = (i2 & 262144) != 0 ? fantasyPlayerFixture.rating : d;
        if ((i2 & 524288) != 0) {
            d2 = d3;
            f2 = fantasyPlayerFixture.expectedPoints;
        } else {
            f2 = f;
            d2 = d3;
        }
        return fantasyPlayerFixture.copy(str13, basicTeam2, i3, num9, num10, str8, num11, str9, str10, j2, str11, str12, num12, num13, num14, num15, fantasyRound2, num16, d2, f2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPlayerFixture self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.locationType);
        output.f(serialDesc, 1, BasicTeam$$serializer.INSTANCE, self.team);
        output.u(2, self.eventId, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.homeTeamId);
        output.h(serialDesc, 4, a7aVar, self.awayTeamId);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 5, uhiVar, self.missingType);
        output.h(serialDesc, 6, a7aVar, self.missingReason);
        output.h(serialDesc, 7, uhiVar, self.missingDescription);
        output.h(serialDesc, 8, uhiVar, self.playerFixtureStatus);
        output.E(serialDesc, 9, self.eventStartTimestamp);
        output.y(serialDesc, 10, self.eventStatusType);
        output.h(serialDesc, 11, uhiVar, self.fixtureDifficulty);
        output.h(serialDesc, 12, a7aVar, self.winnerCode);
        output.h(serialDesc, 13, a7aVar, self.playerTeamSide);
        output.h(serialDesc, 14, a7aVar, self.homeScore);
        output.h(serialDesc, 15, a7aVar, self.awayScore);
        output.h(serialDesc, 16, FantasyRound$$serializer.INSTANCE, self.fantasyRound);
        output.h(serialDesc, 17, a7aVar, self.score);
        output.h(serialDesc, 18, h75.a, self.rating);
        output.h(serialDesc, 19, c88.a, self.expectedPoints);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLocationType() {
        return this.locationType;
    }

    /* renamed from: component10, reason: from getter */
    public final long getEventStartTimestamp() {
        return this.eventStartTimestamp;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getEventStatusType() {
        return this.eventStatusType;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getFixtureDifficulty() {
        return this.fixtureDifficulty;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getPlayerTeamSide() {
        return this.playerTeamSide;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getHomeScore() {
        return this.homeScore;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getAwayScore() {
        return this.awayScore;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final FantasyRound getFantasyRound() {
        return this.fantasyRound;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BasicTeam getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Float getExpectedPoints() {
        return this.expectedPoints;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getHomeTeamId() {
        return this.homeTeamId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMissingType() {
        return this.missingType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getMissingReason() {
        return this.missingReason;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getMissingDescription() {
        return this.missingDescription;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getPlayerFixtureStatus() {
        return this.playerFixtureStatus;
    }

    @NotNull
    public final FantasyPlayerFixture copy(@NotNull String locationType, @NotNull BasicTeam team, int eventId, @Nullable Integer homeTeamId, @Nullable Integer awayTeamId, @Nullable String missingType, @Nullable Integer missingReason, @Nullable String missingDescription, @Nullable String playerFixtureStatus, long eventStartTimestamp, @NotNull String eventStatusType, @Nullable String fixtureDifficulty, @Nullable Integer winnerCode, @Nullable Integer playerTeamSide, @Nullable Integer homeScore, @Nullable Integer awayScore, @Nullable FantasyRound fantasyRound, @Nullable Integer score, @Nullable Double rating, @Nullable Float expectedPoints) {
        locationType.getClass();
        team.getClass();
        eventStatusType.getClass();
        return new FantasyPlayerFixture(locationType, team, eventId, homeTeamId, awayTeamId, missingType, missingReason, missingDescription, playerFixtureStatus, eventStartTimestamp, eventStatusType, fixtureDifficulty, winnerCode, playerTeamSide, homeScore, awayScore, fantasyRound, score, rating, expectedPoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPlayerFixture)) {
            return false;
        }
        FantasyPlayerFixture fantasyPlayerFixture = (FantasyPlayerFixture) other;
        return Intrinsics.c(this.locationType, fantasyPlayerFixture.locationType) && Intrinsics.c(this.team, fantasyPlayerFixture.team) && this.eventId == fantasyPlayerFixture.eventId && Intrinsics.c(this.homeTeamId, fantasyPlayerFixture.homeTeamId) && Intrinsics.c(this.awayTeamId, fantasyPlayerFixture.awayTeamId) && Intrinsics.c(this.missingType, fantasyPlayerFixture.missingType) && Intrinsics.c(this.missingReason, fantasyPlayerFixture.missingReason) && Intrinsics.c(this.missingDescription, fantasyPlayerFixture.missingDescription) && Intrinsics.c(this.playerFixtureStatus, fantasyPlayerFixture.playerFixtureStatus) && this.eventStartTimestamp == fantasyPlayerFixture.eventStartTimestamp && Intrinsics.c(this.eventStatusType, fantasyPlayerFixture.eventStatusType) && Intrinsics.c(this.fixtureDifficulty, fantasyPlayerFixture.fixtureDifficulty) && Intrinsics.c(this.winnerCode, fantasyPlayerFixture.winnerCode) && Intrinsics.c(this.playerTeamSide, fantasyPlayerFixture.playerTeamSide) && Intrinsics.c(this.homeScore, fantasyPlayerFixture.homeScore) && Intrinsics.c(this.awayScore, fantasyPlayerFixture.awayScore) && Intrinsics.c(this.fantasyRound, fantasyPlayerFixture.fantasyRound) && Intrinsics.c(this.score, fantasyPlayerFixture.score) && Intrinsics.c(this.rating, fantasyPlayerFixture.rating) && Intrinsics.c(this.expectedPoints, fantasyPlayerFixture.expectedPoints);
    }

    @Nullable
    public final Integer getAwayScore() {
        return this.awayScore;
    }

    @Nullable
    public final Integer getAwayTeamId() {
        return this.awayTeamId;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final long getEventStartTimestamp() {
        return this.eventStartTimestamp;
    }

    @NotNull
    public final String getEventStatusType() {
        return this.eventStatusType;
    }

    @Nullable
    public final Float getExpectedPoints() {
        return this.expectedPoints;
    }

    @Nullable
    public final FantasyRound getFantasyRound() {
        return this.fantasyRound;
    }

    @Nullable
    public final String getFixtureDifficulty() {
        return this.fixtureDifficulty;
    }

    @Nullable
    public final Integer getHomeScore() {
        return this.homeScore;
    }

    @Nullable
    public final Integer getHomeTeamId() {
        return this.homeTeamId;
    }

    @NotNull
    public final String getLocationType() {
        return this.locationType;
    }

    @Nullable
    public final String getMissingDescription() {
        return this.missingDescription;
    }

    @Nullable
    public final Integer getMissingReason() {
        return this.missingReason;
    }

    @Nullable
    public final String getMissingType() {
        return this.missingType;
    }

    @Nullable
    public final String getPlayerFixtureStatus() {
        return this.playerFixtureStatus;
    }

    @Nullable
    public final Integer getPlayerTeamSide() {
        return this.playerTeamSide;
    }

    @Nullable
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @NotNull
    public final BasicTeam getTeam() {
        return this.team;
    }

    @Nullable
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    public int hashCode() {
        int a = wv8.a(this.eventId, (this.team.hashCode() + (this.locationType.hashCode() * 31)) * 31, 31);
        Integer num = this.homeTeamId;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.awayTeamId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.missingType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.missingReason;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.missingDescription;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.playerFixtureStatus;
        int c = dmi.c(ljg.c((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.eventStartTimestamp), 31, this.eventStatusType);
        String str4 = this.fixtureDifficulty;
        int hashCode6 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.winnerCode;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.playerTeamSide;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.homeScore;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.awayScore;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        FantasyRound fantasyRound = this.fantasyRound;
        int hashCode11 = (hashCode10 + (fantasyRound == null ? 0 : fantasyRound.hashCode())) * 31;
        Integer num8 = this.score;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Double d = this.rating;
        int hashCode13 = (hashCode12 + (d == null ? 0 : d.hashCode())) * 31;
        Float f = this.expectedPoints;
        return hashCode13 + (f != null ? f.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.locationType;
        BasicTeam basicTeam = this.team;
        int i = this.eventId;
        Integer num = this.homeTeamId;
        Integer num2 = this.awayTeamId;
        String str2 = this.missingType;
        Integer num3 = this.missingReason;
        String str3 = this.missingDescription;
        String str4 = this.playerFixtureStatus;
        long j = this.eventStartTimestamp;
        String str5 = this.eventStatusType;
        String str6 = this.fixtureDifficulty;
        Integer num4 = this.winnerCode;
        Integer num5 = this.playerTeamSide;
        Integer num6 = this.homeScore;
        Integer num7 = this.awayScore;
        FantasyRound fantasyRound = this.fantasyRound;
        Integer num8 = this.score;
        Double d = this.rating;
        Float f = this.expectedPoints;
        StringBuilder sb = new StringBuilder("FantasyPlayerFixture(locationType=");
        sb.append(str);
        sb.append(", team=");
        sb.append(basicTeam);
        sb.append(", eventId=");
        sb.append(i);
        sb.append(", homeTeamId=");
        sb.append(num);
        sb.append(", awayTeamId=");
        vxd.s(num2, ", missingType=", str2, ", missingReason=", sb);
        vxd.s(num3, ", missingDescription=", str3, ", playerFixtureStatus=", sb);
        i.n(j, str4, ", eventStartTimestamp=", sb);
        bf3.v(sb, ", eventStatusType=", str5, ", fixtureDifficulty=", str6);
        fn0.w(num4, num5, ", winnerCode=", ", playerTeamSide=", sb);
        fn0.w(num6, num7, ", homeScore=", ", awayScore=", sb);
        sb.append(", fantasyRound=");
        sb.append(fantasyRound);
        sb.append(", score=");
        sb.append(num8);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", expectedPoints=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerFixture$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPlayerFixture;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPlayerFixture$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPlayerFixture(@NotNull String str, @NotNull BasicTeam basicTeam, int i, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable Integer num3, @Nullable String str3, @Nullable String str4, long j, @NotNull String str5, @Nullable String str6, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable FantasyRound fantasyRound, @Nullable Integer num8, @Nullable Double d, @Nullable Float f) {
        str.getClass();
        basicTeam.getClass();
        str5.getClass();
        this.locationType = str;
        this.team = basicTeam;
        this.eventId = i;
        this.homeTeamId = num;
        this.awayTeamId = num2;
        this.missingType = str2;
        this.missingReason = num3;
        this.missingDescription = str3;
        this.playerFixtureStatus = str4;
        this.eventStartTimestamp = j;
        this.eventStatusType = str5;
        this.fixtureDifficulty = str6;
        this.winnerCode = num4;
        this.playerTeamSide = num5;
        this.homeScore = num6;
        this.awayScore = num7;
        this.fantasyRound = fantasyRound;
        this.score = num8;
        this.rating = d;
        this.expectedPoints = f;
    }
}
