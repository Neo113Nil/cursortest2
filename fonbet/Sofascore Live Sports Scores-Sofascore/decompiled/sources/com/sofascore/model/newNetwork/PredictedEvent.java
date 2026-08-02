package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.Y1;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Status$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsChoice$$serializer;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.bxe;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.hz8;
import defpackage.joa;
import defpackage.ljg;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 v2\u00020\u0001:\u0002wvB½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 BÛ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J\r\u0010%\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010(J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u0010,J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010,J\u0010\u00107\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010,J\u0010\u0010<\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b<\u0010&J\u0010\u0010=\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b?\u0010@Jì\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bC\u0010,J\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010(J\u001a\u0010F\u001a\u00020\u00182\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\bH\u0010,J\u0010\u0010I\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\bI\u0010,J'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bV\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010WR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010WR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\bX\u0010,R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010W\u001a\u0004\bY\u0010,R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010S\u001a\u0004\bZ\u0010(R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\b[\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\b]\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\b^\u00101R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\b_\u0010(R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\b`\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010W\u001a\u0004\ba\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bb\u0010,R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\bd\u00108R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010e\u001a\u0004\bf\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010W\u001a\u0004\bg\u0010,R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010h\u001a\u0004\bi\u0010&R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010j\u001a\u0004\bk\u0010>R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010l\u001a\u0004\bm\u0010@R\u0011\u0010q\u001a\u00020n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0011\u0010s\u001a\u00020n8F¢\u0006\u0006\u001a\u0004\br\u0010pR\u0011\u0010u\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bt\u0010(¨\u0006x"}, d2 = {"Lcom/sofascore/model/newNetwork/PredictedEvent;", "", "", "eventId", "", "startDateTimestamp", "", "homeTeamName", "awayTeamName", "homeNameCode", "awayNameCode", "homeTeamId", "awayTeamId", "homeTeamScore", "awayTeamScore", "homeTeamType", "awayTeamType", "homeTeamAlpha2", "awayTeamAlpha2", "Lcom/sofascore/model/newNetwork/VoteResult;", "correct", "Lcom/sofascore/model/odds/OddsChoice;", "odds", "sportSlug", "", "displayInverseHomeAwayTeams", "Lcom/sofascore/model/mvvm/model/Status;", "status", "", "Lcom/sofascore/model/newNetwork/Vote;", "votes", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/VoteResult;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/String;ZLcom/sofascore/model/mvvm/model/Status;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/VoteResult;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/String;ZLcom/sofascore/model/mvvm/model/Status;Ljava/util/List;Lt5h;)V", "shouldReverseTeams", "()Z", "component1", "()I", "component2", "()J", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/sofascore/model/newNetwork/VoteResult;", "component16", "()Lcom/sofascore/model/odds/OddsChoice;", "component17", "component18", "component19", "()Lcom/sofascore/model/mvvm/model/Status;", "component20", "()Ljava/util/List;", "copy", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/VoteResult;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/String;ZLcom/sofascore/model/mvvm/model/Status;Ljava/util/List;)Lcom/sofascore/model/newNetwork/PredictedEvent;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "component3", "component4", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PredictedEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getEventId", "J", "getStartDateTimestamp", "Ljava/lang/String;", "getHomeNameCode", "getAwayNameCode", "getHomeTeamId", "getAwayTeamId", "Ljava/lang/Integer;", "getHomeTeamScore", "getAwayTeamScore", "getHomeTeamType", "getAwayTeamType", "getHomeTeamAlpha2", "getAwayTeamAlpha2", "Lcom/sofascore/model/newNetwork/VoteResult;", "getCorrect", "Lcom/sofascore/model/odds/OddsChoice;", "getOdds", "getSportSlug", "Z", "getDisplayInverseHomeAwayTeams", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "Ljava/util/List;", "getVotes", "Lcom/sofascore/model/mvvm/model/Team;", "getHomeTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "homeTeam", "getAwayTeam", "awayTeam", "getId", "id", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PredictedEvent {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String awayNameCode;

    @Nullable
    private final String awayTeamAlpha2;
    private final int awayTeamId;

    @NotNull
    private final String awayTeamName;

    @Nullable
    private final Integer awayTeamScore;
    private final int awayTeamType;

    @NotNull
    private final VoteResult correct;
    private final boolean displayInverseHomeAwayTeams;
    private final int eventId;

    @NotNull
    private final String homeNameCode;

    @Nullable
    private final String homeTeamAlpha2;
    private final int homeTeamId;

    @NotNull
    private final String homeTeamName;

    @Nullable
    private final Integer homeTeamScore;
    private final int homeTeamType;

    @Nullable
    private final OddsChoice odds;

    @Nullable
    private final String sportSlug;
    private final long startDateTimestamp;

    @NotNull
    private final Status status;

    @Nullable
    private final List<Vote> votes;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new bxe(24)), null, null, null, null, ypa.a(ysaVar, new bxe(25))};
    }

    public /* synthetic */ PredictedEvent(int i, int i2, long j, String str, String str2, String str3, String str4, int i3, int i4, Integer num, Integer num2, int i5, int i6, String str5, String str6, VoteResult voteResult, OddsChoice oddsChoice, String str7, boolean z, Status status, List list, t5h t5hVar) {
        if (1032191 != (i & 1032191)) {
            oea.z(i, 1032191, PredictedEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = i2;
        this.startDateTimestamp = j;
        this.homeTeamName = str;
        this.awayTeamName = str2;
        this.homeNameCode = str3;
        this.awayNameCode = str4;
        this.homeTeamId = i3;
        this.awayTeamId = i4;
        this.homeTeamScore = num;
        this.awayTeamScore = num2;
        this.homeTeamType = i5;
        this.awayTeamType = i6;
        this.homeTeamAlpha2 = str5;
        this.awayTeamAlpha2 = str6;
        this.correct = (i & 16384) == 0 ? VoteResult.UNKNOWN : voteResult;
        this.odds = oddsChoice;
        this.sportSlug = str7;
        this.displayInverseHomeAwayTeams = z;
        this.status = status;
        this.votes = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.VoteResult", VoteResult.values(), new String[]{"1", "0", Y1.f}, new Annotation[][]{null, null, null});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Vote$$serializer.INSTANCE, 0);
    }

    /* renamed from: component3, reason: from getter */
    private final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* renamed from: component4, reason: from getter */
    private final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public static /* synthetic */ PredictedEvent copy$default(PredictedEvent predictedEvent, int i, long j, String str, String str2, String str3, String str4, int i2, int i3, Integer num, Integer num2, int i4, int i5, String str5, String str6, VoteResult voteResult, OddsChoice oddsChoice, String str7, boolean z, Status status, List list, int i6, Object obj) {
        List list2;
        Status status2;
        int i7 = (i6 & 1) != 0 ? predictedEvent.eventId : i;
        long j2 = (i6 & 2) != 0 ? predictedEvent.startDateTimestamp : j;
        String str8 = (i6 & 4) != 0 ? predictedEvent.homeTeamName : str;
        String str9 = (i6 & 8) != 0 ? predictedEvent.awayTeamName : str2;
        String str10 = (i6 & 16) != 0 ? predictedEvent.homeNameCode : str3;
        String str11 = (i6 & 32) != 0 ? predictedEvent.awayNameCode : str4;
        int i8 = (i6 & 64) != 0 ? predictedEvent.homeTeamId : i2;
        int i9 = (i6 & 128) != 0 ? predictedEvent.awayTeamId : i3;
        Integer num3 = (i6 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? predictedEvent.homeTeamScore : num;
        Integer num4 = (i6 & 512) != 0 ? predictedEvent.awayTeamScore : num2;
        int i10 = (i6 & 1024) != 0 ? predictedEvent.homeTeamType : i4;
        int i11 = (i6 & a.o) != 0 ? predictedEvent.awayTeamType : i5;
        String str12 = (i6 & 4096) != 0 ? predictedEvent.homeTeamAlpha2 : str5;
        int i12 = i7;
        String str13 = (i6 & 8192) != 0 ? predictedEvent.awayTeamAlpha2 : str6;
        VoteResult voteResult2 = (i6 & 16384) != 0 ? predictedEvent.correct : voteResult;
        OddsChoice oddsChoice2 = (i6 & 32768) != 0 ? predictedEvent.odds : oddsChoice;
        String str14 = (i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? predictedEvent.sportSlug : str7;
        boolean z2 = (i6 & 131072) != 0 ? predictedEvent.displayInverseHomeAwayTeams : z;
        Status status3 = (i6 & 262144) != 0 ? predictedEvent.status : status;
        if ((i6 & 524288) != 0) {
            status2 = status3;
            list2 = predictedEvent.votes;
        } else {
            list2 = list;
            status2 = status3;
        }
        return predictedEvent.copy(i12, j2, str8, str9, str10, str11, i8, i9, num3, num4, i10, i11, str12, str13, voteResult2, oddsChoice2, str14, z2, status2, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(PredictedEvent self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.eventId, serialDesc);
        output.E(serialDesc, 1, self.startDateTimestamp);
        output.y(serialDesc, 2, self.homeTeamName);
        output.y(serialDesc, 3, self.awayTeamName);
        output.y(serialDesc, 4, self.homeNameCode);
        output.y(serialDesc, 5, self.awayNameCode);
        output.u(6, self.homeTeamId, serialDesc);
        output.u(7, self.awayTeamId, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 8, a7aVar, self.homeTeamScore);
        output.h(serialDesc, 9, a7aVar, self.awayTeamScore);
        output.u(10, self.homeTeamType, serialDesc);
        output.u(11, self.awayTeamType, serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 12, uhiVar, self.homeTeamAlpha2);
        output.h(serialDesc, 13, uhiVar, self.awayTeamAlpha2);
        if (output.o(serialDesc) || self.correct != VoteResult.UNKNOWN) {
            output.f(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.correct);
        }
        output.h(serialDesc, 15, OddsChoice$$serializer.INSTANCE, self.odds);
        output.h(serialDesc, 16, uhiVar, self.sportSlug);
        output.x(serialDesc, 17, self.displayInverseHomeAwayTeams);
        output.f(serialDesc, 18, Status$$serializer.INSTANCE, self.status);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.votes);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAwayTeamScore() {
        return this.awayTeamScore;
    }

    /* renamed from: component11, reason: from getter */
    public final int getHomeTeamType() {
        return this.homeTeamType;
    }

    /* renamed from: component12, reason: from getter */
    public final int getAwayTeamType() {
        return this.awayTeamType;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getHomeTeamAlpha2() {
        return this.homeTeamAlpha2;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getAwayTeamAlpha2() {
        return this.awayTeamAlpha2;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final VoteResult getCorrect() {
        return this.correct;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final OddsChoice getOdds() {
        return this.odds;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getSportSlug() {
        return this.sportSlug;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getDisplayInverseHomeAwayTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Nullable
    public final List<Vote> component20() {
        return this.votes;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getHomeNameCode() {
        return this.homeNameCode;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAwayNameCode() {
        return this.awayNameCode;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getHomeTeamScore() {
        return this.homeTeamScore;
    }

    @NotNull
    public final PredictedEvent copy(int eventId, long startDateTimestamp, @NotNull String homeTeamName, @NotNull String awayTeamName, @NotNull String homeNameCode, @NotNull String awayNameCode, int homeTeamId, int awayTeamId, @Nullable Integer homeTeamScore, @Nullable Integer awayTeamScore, int homeTeamType, int awayTeamType, @Nullable String homeTeamAlpha2, @Nullable String awayTeamAlpha2, @NotNull VoteResult correct, @Nullable OddsChoice odds, @Nullable String sportSlug, boolean displayInverseHomeAwayTeams, @NotNull Status status, @Nullable List<Vote> votes) {
        homeTeamName.getClass();
        awayTeamName.getClass();
        homeNameCode.getClass();
        awayNameCode.getClass();
        correct.getClass();
        status.getClass();
        return new PredictedEvent(eventId, startDateTimestamp, homeTeamName, awayTeamName, homeNameCode, awayNameCode, homeTeamId, awayTeamId, homeTeamScore, awayTeamScore, homeTeamType, awayTeamType, homeTeamAlpha2, awayTeamAlpha2, correct, odds, sportSlug, displayInverseHomeAwayTeams, status, votes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictedEvent)) {
            return false;
        }
        PredictedEvent predictedEvent = (PredictedEvent) other;
        return this.eventId == predictedEvent.eventId && this.startDateTimestamp == predictedEvent.startDateTimestamp && Intrinsics.c(this.homeTeamName, predictedEvent.homeTeamName) && Intrinsics.c(this.awayTeamName, predictedEvent.awayTeamName) && Intrinsics.c(this.homeNameCode, predictedEvent.homeNameCode) && Intrinsics.c(this.awayNameCode, predictedEvent.awayNameCode) && this.homeTeamId == predictedEvent.homeTeamId && this.awayTeamId == predictedEvent.awayTeamId && Intrinsics.c(this.homeTeamScore, predictedEvent.homeTeamScore) && Intrinsics.c(this.awayTeamScore, predictedEvent.awayTeamScore) && this.homeTeamType == predictedEvent.homeTeamType && this.awayTeamType == predictedEvent.awayTeamType && Intrinsics.c(this.homeTeamAlpha2, predictedEvent.homeTeamAlpha2) && Intrinsics.c(this.awayTeamAlpha2, predictedEvent.awayTeamAlpha2) && this.correct == predictedEvent.correct && Intrinsics.c(this.odds, predictedEvent.odds) && Intrinsics.c(this.sportSlug, predictedEvent.sportSlug) && this.displayInverseHomeAwayTeams == predictedEvent.displayInverseHomeAwayTeams && Intrinsics.c(this.status, predictedEvent.status) && Intrinsics.c(this.votes, predictedEvent.votes);
    }

    @NotNull
    public final String getAwayNameCode() {
        return this.awayNameCode;
    }

    @NotNull
    public final Team getAwayTeam() {
        return new Team(this.awayTeamId, this.awayTeamName, this.awayTeamType, this.awayTeamAlpha2);
    }

    @Nullable
    public final String getAwayTeamAlpha2() {
        return this.awayTeamAlpha2;
    }

    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    public final Integer getAwayTeamScore() {
        return this.awayTeamScore;
    }

    public final int getAwayTeamType() {
        return this.awayTeamType;
    }

    @NotNull
    public final VoteResult getCorrect() {
        return this.correct;
    }

    public final boolean getDisplayInverseHomeAwayTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getHomeNameCode() {
        return this.homeNameCode;
    }

    @NotNull
    public final Team getHomeTeam() {
        return new Team(this.homeTeamId, this.homeTeamName, this.homeTeamType, this.homeTeamAlpha2);
    }

    @Nullable
    public final String getHomeTeamAlpha2() {
        return this.homeTeamAlpha2;
    }

    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    @Nullable
    public final Integer getHomeTeamScore() {
        return this.homeTeamScore;
    }

    public final int getHomeTeamType() {
        return this.homeTeamType;
    }

    public final int getId() {
        return this.eventId;
    }

    @Nullable
    public final OddsChoice getOdds() {
        return this.odds;
    }

    @Nullable
    public final String getSportSlug() {
        return this.sportSlug;
    }

    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final List<Vote> getVotes() {
        return this.votes;
    }

    public int hashCode() {
        int a = wv8.a(this.awayTeamId, wv8.a(this.homeTeamId, dmi.c(dmi.c(dmi.c(dmi.c(ljg.c(Integer.hashCode(this.eventId) * 31, 31, this.startDateTimestamp), 31, this.homeTeamName), 31, this.awayTeamName), 31, this.homeNameCode), 31, this.awayNameCode), 31), 31);
        Integer num = this.homeTeamScore;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.awayTeamScore;
        int a2 = wv8.a(this.awayTeamType, wv8.a(this.homeTeamType, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        String str = this.homeTeamAlpha2;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayTeamAlpha2;
        int hashCode3 = (this.correct.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        OddsChoice oddsChoice = this.odds;
        int hashCode4 = (hashCode3 + (oddsChoice == null ? 0 : oddsChoice.hashCode())) * 31;
        String str3 = this.sportSlug;
        int hashCode5 = (this.status.hashCode() + dmi.e((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.displayInverseHomeAwayTeams)) * 31;
        List<Vote> list = this.votes;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final boolean shouldReverseTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    @NotNull
    public String toString() {
        int i = this.eventId;
        long j = this.startDateTimestamp;
        String str = this.homeTeamName;
        String str2 = this.awayTeamName;
        String str3 = this.homeNameCode;
        String str4 = this.awayNameCode;
        int i2 = this.homeTeamId;
        int i3 = this.awayTeamId;
        Integer num = this.homeTeamScore;
        Integer num2 = this.awayTeamScore;
        int i4 = this.homeTeamType;
        int i5 = this.awayTeamType;
        String str5 = this.homeTeamAlpha2;
        String str6 = this.awayTeamAlpha2;
        VoteResult voteResult = this.correct;
        OddsChoice oddsChoice = this.odds;
        String str7 = this.sportSlug;
        boolean z = this.displayInverseHomeAwayTeams;
        Status status = this.status;
        List<Vote> list = this.votes;
        StringBuilder sb = new StringBuilder("PredictedEvent(eventId=");
        sb.append(i);
        sb.append(", startDateTimestamp=");
        sb.append(j);
        bf3.v(sb, ", homeTeamName=", str, ", awayTeamName=", str2);
        bf3.v(sb, ", homeNameCode=", str3, ", awayNameCode=", str4);
        me4.r(sb, ", homeTeamId=", i2, ", awayTeamId=", i3);
        fn0.w(num, num2, ", homeTeamScore=", ", awayTeamScore=", sb);
        me4.r(sb, ", homeTeamType=", i4, ", awayTeamType=", i5);
        bf3.v(sb, ", homeTeamAlpha2=", str5, ", awayTeamAlpha2=", str6);
        sb.append(", correct=");
        sb.append(voteResult);
        sb.append(", odds=");
        sb.append(oddsChoice);
        sb.append(", sportSlug=");
        sb.append(str7);
        sb.append(", displayInverseHomeAwayTeams=");
        sb.append(z);
        sb.append(", status=");
        sb.append(status);
        sb.append(", votes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PredictedEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PredictedEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PredictedEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PredictedEvent(int i, long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, int i3, @Nullable Integer num, @Nullable Integer num2, int i4, int i5, @Nullable String str5, @Nullable String str6, @NotNull VoteResult voteResult, @Nullable OddsChoice oddsChoice, @Nullable String str7, boolean z, @NotNull Status status, @Nullable List<Vote> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        voteResult.getClass();
        status.getClass();
        this.eventId = i;
        this.startDateTimestamp = j;
        this.homeTeamName = str;
        this.awayTeamName = str2;
        this.homeNameCode = str3;
        this.awayNameCode = str4;
        this.homeTeamId = i2;
        this.awayTeamId = i3;
        this.homeTeamScore = num;
        this.awayTeamScore = num2;
        this.homeTeamType = i4;
        this.awayTeamType = i5;
        this.homeTeamAlpha2 = str5;
        this.awayTeamAlpha2 = str6;
        this.correct = voteResult;
        this.odds = oddsChoice;
        this.sportSlug = str7;
        this.displayInverseHomeAwayTeams = z;
        this.status = status;
        this.votes = list;
    }

    public /* synthetic */ PredictedEvent(int i, long j, String str, String str2, String str3, String str4, int i2, int i3, Integer num, Integer num2, int i4, int i5, String str5, String str6, VoteResult voteResult, OddsChoice oddsChoice, String str7, boolean z, Status status, List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, str, str2, str3, str4, i2, i3, num, num2, i4, i5, str5, str6, (i6 & 16384) != 0 ? VoteResult.UNKNOWN : voteResult, oddsChoice, str7, z, status, list);
    }
}
