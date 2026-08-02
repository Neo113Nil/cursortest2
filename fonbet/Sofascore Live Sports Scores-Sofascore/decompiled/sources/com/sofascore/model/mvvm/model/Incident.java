package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.IncidentSerializer;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse$$serializer;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment$$serializer;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeySuspension;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeySuspension$$serializer;
import defpackage.a70;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.joa;
import defpackage.oea;
import defpackage.ph0;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.us9;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = IncidentSerializer.class)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 D2\u00020\u0001:\f9:;<=>?@ABCDB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010+\u001a\u00020,¢\u0006\u0002\u0010-J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010+\u001a\u00020,¢\u0006\u0002\u0010.J\u0017\u0010 \u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010+\u001a\u00020,¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\u000fJ\u000f\u00104\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007J\u0014\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0082\u0004J\n\u00108\u001a\u00020\u0005H\u0096\u0080\u0004R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0007R\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u00100\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u00103\u0082\u0001\u000bEFGHIJKLMNO¨\u0006P"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident;", "Ljava/io/Serializable;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "incidentType", "", "getIncidentType", "()Ljava/lang/String;", "isHome", "", "()Ljava/lang/Boolean;", "time", "getTime", "addedTime", "getAddedTime", "reversedPeriodTime", "getReversedPeriodTime", "reversedPeriodTimeSeconds", "getReversedPeriodTimeSeconds", "periodTimeSeconds", "getPeriodTimeSeconds", "timeSeconds", "getTimeSeconds", "homeScore", "getHomeScore", "awayScore", "getAwayScore", "footballPassingNetworkAction", "", "Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "getFootballPassingNetworkAction", "()Ljava/util/List;", "shouldReverseTeams", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "side", "Lcom/sofascore/model/mvvm/model/TeamSides;", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Boolean;", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "isOnBench", SearchResponseKt.SPORT_ENTITY, "getSport", "setSport", "(Ljava/lang/String;)V", "getPlayerId", "equals", "other", "", "hashCode", "UnknownIncident", "CardIncident", "GoalIncident", "InjuryTimeIncident", "PeriodIncident", "OvertimeBreakIncident", "PenaltyShotIncident", "SubstitutionIncident", "VarDecisionIncident", "SuspensionIncident", "CricketIncident", "Companion", "Lcom/sofascore/model/mvvm/model/Incident$CardIncident;", "Lcom/sofascore/model/mvvm/model/Incident$CricketIncident;", "Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;", "Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident;", "Lcom/sofascore/model/mvvm/model/Incident$OvertimeBreakIncident;", "Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident;", "Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident;", "Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;", "Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident;", "Lcom/sofascore/model/mvvm/model/Incident$UnknownIncident;", "Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Incident implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<FootballPassingNetworkSegment> footballPassingNetworkAction;
    private boolean shouldReverseTeams;

    @Nullable
    private String sport;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b6\b\u0007\u0018\u0000 n2\u00020\u0001:\u0002noBÝ\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)Bë\u0002\b\u0010\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010.J\u001a\u00101\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bF\u0010@R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bH\u0010ER\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bI\u0010ER\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bJ\u0010@R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bK\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bL\u0010@R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bM\u0010@R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bN\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bO\u0010@R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bP\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bQ\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bR\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bV\u0010UR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bW\u0010UR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bX\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010Y\u001a\u0004\b\\\u0010[R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010Y\u001a\u0004\b]\u0010[R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010a\u001a\u0004\bb\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010C\u001a\u0004\bc\u0010ER\u001c\u0010 \u001a\u0004\u0018\u00010\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010S\u001a\u0004\b \u0010UR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010>\u001a\u0004\bd\u0010@R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010>\u001a\u0004\be\u0010@R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010>\u001a\u0004\bf\u0010@R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\bg\u0010@R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010>\u001a\u0004\bh\u0010@R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010>\u001a\u0004\bi\u0010@R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\bj\u0010@R\u0011\u0010m\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$CricketIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "id", "", "incidentType", "time", "incidentClass", "incidentClassLabel", "incidentClassColor", "inningNumber", "over", "superOver", IncidentKt.TYPE_BALL, "runs", "angle", "length", "totalRuns", "score", "", PenaltyShotIncident.PENALTY_SHOT_SCORED, "wicket", PenaltyShotIncident.PENALTY_SHOT_MISSED, "zone", "Lcom/sofascore/model/mvvm/model/Player;", "batsman", "dismissedBatsman", "bowler", "Lcom/sofascore/model/mvvm/model/BallDetails;", "ballDetails", "battingTeamId", "commentary", "isHome", "addedTime", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "homeScore", "awayScore", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/BallDetails;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/BallDetails;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$CricketIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "getTime", "getIncidentClass", "getIncidentClassLabel", "getIncidentClassColor", "getInningNumber", "getOver", "getSuperOver", "getBall", "getRuns", "getAngle", "getLength", "getTotalRuns", "getScore", "Ljava/lang/Boolean;", "getScored", "()Ljava/lang/Boolean;", "getWicket", "getMissed", "getZone", "Lcom/sofascore/model/mvvm/model/Player;", "getBatsman", "()Lcom/sofascore/model/mvvm/model/Player;", "getDismissedBatsman", "getBowler", "Lcom/sofascore/model/mvvm/model/BallDetails;", "getBallDetails", "()Lcom/sofascore/model/mvvm/model/BallDetails;", "I", "getBattingTeamId", "getCommentary", "getAddedTime", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "getHomeScore", "getAwayScore", "getWillBeRepeated", "()Z", "willBeRepeated", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CricketIncident extends Incident {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final String ERROR_CLASS_NO_BALL = "NB";

        @NotNull
        private static final String ERROR_CLASS_WIDE = "WD";

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer angle;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer ball;

        @Nullable
        private final BallDetails ballDetails;

        @Nullable
        private final Player batsman;
        private final int battingTeamId;

        @Nullable
        private final Player bowler;

        @Nullable
        private final String commentary;

        @Nullable
        private final Player dismissedBatsman;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @Nullable
        private final String incidentClassColor;

        @Nullable
        private final String incidentClassLabel;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Integer inningNumber;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final Integer length;

        @Nullable
        private final Boolean missed;

        @Nullable
        private final Integer over;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer runs;

        @Nullable
        private final String score;

        @Nullable
        private final Boolean scored;

        @Nullable
        private final Integer superOver;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        @Nullable
        private final Integer totalRuns;

        @Nullable
        private final Boolean wicket;

        @Nullable
        private final String zone;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ CricketIncident(int i, int i2, Integer num, String str, Integer num2, String str2, String str3, String str4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, Player player, Player player2, Player player3, BallDetails ballDetails, int i3, String str7, Boolean bool4, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, t5h t5hVar) {
            super(r4);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (33554431 != (i & 33554431)) {
                oea.y(new int[]{i, i2}, new int[]{33554431, 0}, Incident$CricketIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = num;
            this.incidentType = str;
            this.time = num2;
            this.incidentClass = str2;
            this.incidentClassLabel = str3;
            this.incidentClassColor = str4;
            this.inningNumber = num3;
            this.over = num4;
            this.superOver = num5;
            this.ball = num6;
            this.runs = num7;
            this.angle = num8;
            this.length = num9;
            this.totalRuns = num10;
            this.score = str5;
            this.scored = bool;
            this.wicket = bool2;
            this.missed = bool3;
            this.zone = str6;
            this.batsman = player;
            this.dismissedBatsman = player2;
            this.bowler = player3;
            this.ballDetails = ballDetails;
            this.battingTeamId = i3;
            this.commentary = str7;
            if ((33554432 & i) == 0) {
                this.isHome = null;
            } else {
                this.isHome = bool4;
            }
            if ((67108864 & i) == 0) {
                this.addedTime = null;
            } else {
                this.addedTime = num11;
            }
            if ((134217728 & i) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num12;
            }
            if ((268435456 & i) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num13;
            }
            if ((536870912 & i) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num14;
            }
            if ((1073741824 & i) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num15;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.homeScore = null;
            } else {
                this.homeScore = num16;
            }
            if ((i2 & 1) == 0) {
                this.awayScore = null;
            } else {
                this.awayScore = num17;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(CricketIncident self, wf3 output, SerialDescriptor serialDesc) {
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.getId());
            output.y(serialDesc, 1, self.getIncidentType());
            output.h(serialDesc, 2, a7aVar, self.getTime());
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 3, uhiVar, self.incidentClass);
            output.h(serialDesc, 4, uhiVar, self.incidentClassLabel);
            output.h(serialDesc, 5, uhiVar, self.incidentClassColor);
            output.h(serialDesc, 6, a7aVar, self.inningNumber);
            output.h(serialDesc, 7, a7aVar, self.over);
            output.h(serialDesc, 8, a7aVar, self.superOver);
            output.h(serialDesc, 9, a7aVar, self.ball);
            output.h(serialDesc, 10, a7aVar, self.runs);
            output.h(serialDesc, 11, a7aVar, self.angle);
            output.h(serialDesc, 12, a7aVar, self.length);
            output.h(serialDesc, 13, a7aVar, self.totalRuns);
            output.h(serialDesc, 14, uhiVar, self.score);
            gz1 gz1Var = gz1.a;
            output.h(serialDesc, 15, gz1Var, self.scored);
            output.h(serialDesc, 16, gz1Var, self.wicket);
            output.h(serialDesc, 17, gz1Var, self.missed);
            output.h(serialDesc, 18, uhiVar, self.zone);
            Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
            output.h(serialDesc, 19, player$$serializer, self.batsman);
            output.h(serialDesc, 20, player$$serializer, self.dismissedBatsman);
            output.h(serialDesc, 21, player$$serializer, self.bowler);
            output.h(serialDesc, 22, BallDetails$$serializer.INSTANCE, self.ballDetails);
            output.u(23, self.battingTeamId, serialDesc);
            output.h(serialDesc, 24, uhiVar, self.commentary);
            if (output.o(serialDesc) || self.getIsHome() != null) {
                output.h(serialDesc, 25, gz1Var, self.getIsHome());
            }
            if (output.o(serialDesc) || self.getAddedTime() != null) {
                output.h(serialDesc, 26, a7aVar, self.getAddedTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 27, a7aVar, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 28, a7aVar, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 29, a7aVar, self.getPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 30, a7aVar, self.getTimeSeconds());
            }
            if (output.o(serialDesc) || self.getHomeScore() != null) {
                output.h(serialDesc, 31, a7aVar, self.getHomeScore());
            }
            if (!output.o(serialDesc) && self.getAwayScore() == null) {
                return;
            }
            output.h(serialDesc, 32, a7aVar, self.getAwayScore());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!CricketIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            CricketIncident cricketIncident = (CricketIncident) other;
            return Intrinsics.c(getIncidentType(), cricketIncident.getIncidentType()) && Intrinsics.c(this.incidentClass, cricketIncident.incidentClass) && this.battingTeamId == cricketIncident.battingTeamId && Intrinsics.c(this.inningNumber, cricketIncident.inningNumber) && Intrinsics.c(this.over, cricketIncident.over) && Intrinsics.c(this.ball, cricketIncident.ball) && Intrinsics.c(this.runs, cricketIncident.runs) && Intrinsics.c(this.angle, cricketIncident.angle) && Intrinsics.c(this.length, cricketIncident.length) && Intrinsics.c(this.totalRuns, cricketIncident.totalRuns) && Intrinsics.c(this.score, cricketIncident.score) && Intrinsics.c(this.batsman, cricketIncident.batsman) && Intrinsics.c(this.bowler, cricketIncident.bowler) && Intrinsics.c(this.ballDetails, cricketIncident.ballDetails);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Nullable
        public final Integer getAngle() {
            return this.angle;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Nullable
        public final Integer getBall() {
            return this.ball;
        }

        @Nullable
        public final BallDetails getBallDetails() {
            return this.ballDetails;
        }

        @Nullable
        public final Player getBatsman() {
            return this.batsman;
        }

        public final int getBattingTeamId() {
            return this.battingTeamId;
        }

        @Nullable
        public final Player getBowler() {
            return this.bowler;
        }

        @Nullable
        public final String getCommentary() {
            return this.commentary;
        }

        @Nullable
        public final Player getDismissedBatsman() {
            return this.dismissedBatsman;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Nullable
        public final String getIncidentClassColor() {
            return this.incidentClassColor;
        }

        @Nullable
        public final String getIncidentClassLabel() {
            return this.incidentClassLabel;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Nullable
        public final Integer getInningNumber() {
            return this.inningNumber;
        }

        @Nullable
        public final Integer getLength() {
            return this.length;
        }

        @Nullable
        public final Boolean getMissed() {
            return this.missed;
        }

        @Nullable
        public final Integer getOver() {
            return this.over;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Nullable
        public final Integer getRuns() {
            return this.runs;
        }

        @Nullable
        public final String getScore() {
            return this.score;
        }

        @Nullable
        public final Boolean getScored() {
            return this.scored;
        }

        @Nullable
        public final Integer getSuperOver() {
            return this.superOver;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Nullable
        public final Integer getTotalRuns() {
            return this.totalRuns;
        }

        @Nullable
        public final Boolean getWicket() {
            return this.wicket;
        }

        public final boolean getWillBeRepeated() {
            return Intrinsics.c(this.incidentClass, ERROR_CLASS_WIDE) || Intrinsics.c(this.incidentClass, ERROR_CLASS_NO_BALL);
        }

        @Nullable
        public final String getZone() {
            return this.zone;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = (getIncidentType().hashCode() + (super.hashCode() * 31)) * 31;
            String str = this.incidentClass;
            int a = wv8.a(this.battingTeamId, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
            Integer num = this.inningNumber;
            int hashCode2 = (a + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 31;
            Integer num2 = this.over;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 31;
            Integer num3 = this.ball;
            int hashCode4 = (hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 31;
            Integer num4 = this.runs;
            int hashCode5 = (hashCode4 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 31;
            Integer num5 = this.angle;
            int hashCode6 = (hashCode5 + (num5 != null ? Integer.hashCode(num5.intValue()) : 0)) * 31;
            Integer num6 = this.length;
            int hashCode7 = (hashCode6 + (num6 != null ? Integer.hashCode(num6.intValue()) : 0)) * 31;
            Integer num7 = this.totalRuns;
            int hashCode8 = (hashCode7 + (num7 != null ? Integer.hashCode(num7.intValue()) : 0)) * 31;
            String str2 = this.score;
            int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Player player = this.batsman;
            int hashCode10 = (hashCode9 + (player != null ? player.hashCode() : 0)) * 31;
            Player player2 = this.bowler;
            int hashCode11 = (hashCode10 + (player2 != null ? player2.hashCode() : 0)) * 31;
            BallDetails ballDetails = this.ballDetails;
            return hashCode11 + (ballDetails != null ? ballDetails.hashCode() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CricketIncident(@Nullable Integer num, @NotNull String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable String str5, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str6, @Nullable Player player, @Nullable Player player2, @Nullable Player player3, @Nullable BallDetails ballDetails, int i, @Nullable String str7, @Nullable Boolean bool4, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17) {
            super(null);
            str.getClass();
            this.id = num;
            this.incidentType = str;
            this.time = num2;
            this.incidentClass = str2;
            this.incidentClassLabel = str3;
            this.incidentClassColor = str4;
            this.inningNumber = num3;
            this.over = num4;
            this.superOver = num5;
            this.ball = num6;
            this.runs = num7;
            this.angle = num8;
            this.length = num9;
            this.totalRuns = num10;
            this.score = str5;
            this.scored = bool;
            this.wicket = bool2;
            this.missed = bool3;
            this.zone = str6;
            this.batsman = player;
            this.dismissedBatsman = player2;
            this.bowler = player3;
            this.ballDetails = ballDetails;
            this.battingTeamId = i;
            this.commentary = str7;
            this.isHome = bool4;
            this.addedTime = num11;
            this.reversedPeriodTime = num12;
            this.reversedPeriodTimeSeconds = num13;
            this.periodTimeSeconds = num14;
            this.timeSeconds = num15;
            this.homeScore = num16;
            this.awayScore = num17;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$CricketIncident$Companion;", "", "<init>", "()V", "ERROR_CLASS_WIDE", "", "ERROR_CLASS_NO_BALL", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$CricketIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$CricketIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ CricketIncident(Integer num, String str, Integer num2, String str2, String str3, String str4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, Player player, Player player2, Player player3, BallDetails ballDetails, int i, String str7, Boolean bool4, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, num2, str2, str3, str4, num3, num4, num5, num6, num7, num8, num9, num10, str5, bool, bool2, bool3, str6, player, player2, player3, ballDetails, i, str7, (i2 & 33554432) != 0 ? null : bool4, (i2 & 67108864) != 0 ? null : num11, (i2 & 134217728) != 0 ? null : num12, (i2 & 268435456) != 0 ? null : num13, (i2 & 536870912) != 0 ? null : num14, (i2 & 1073741824) != 0 ? null : num15, (i2 & Integer.MIN_VALUE) != 0 ? null : num16, (i3 & 1) != 0 ? null : num17);
        }
    }

    public /* synthetic */ Incident(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Integer getAwayScore$default(Incident incident, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getAwayScore");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return incident.getAwayScore(teamSides);
    }

    public static /* synthetic */ Integer getHomeScore$default(Incident incident, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getHomeScore");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return incident.getHomeScore(teamSides);
    }

    public static /* synthetic */ Boolean isHome$default(Incident incident, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: isHome");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return incident.isHome(teamSides);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        Incident incident = (Incident) other;
        return Intrinsics.c(getId(), incident.getId()) && Intrinsics.c(getIncidentType(), incident.getIncidentType()) && Intrinsics.c(getIsHome(), incident.getIsHome()) && Intrinsics.c(getTime(), incident.getTime()) && Intrinsics.c(getAddedTime(), incident.getAddedTime()) && Intrinsics.c(this.sport, incident.sport);
    }

    @Nullable
    public abstract Integer getAddedTime();

    @Nullable
    public abstract Integer getAwayScore();

    @Nullable
    public final Integer getAwayScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? getHomeScore() : getAwayScore();
    }

    @Nullable
    public List<FootballPassingNetworkSegment> getFootballPassingNetworkAction() {
        return this.footballPassingNetworkAction;
    }

    @Nullable
    public abstract Integer getHomeScore();

    @Nullable
    public final Integer getHomeScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? getAwayScore() : getHomeScore();
    }

    @Nullable
    public abstract Integer getId();

    @NotNull
    public abstract String getIncidentType();

    @Nullable
    public abstract Integer getPeriodTimeSeconds();

    @Nullable
    public Integer getPlayerId() {
        return null;
    }

    @Nullable
    public abstract Integer getReversedPeriodTime();

    @Nullable
    public abstract Integer getReversedPeriodTimeSeconds();

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    @Nullable
    public final String getSport() {
        return this.sport;
    }

    @Nullable
    public abstract Integer getTime();

    @Nullable
    public abstract Integer getTimeSeconds();

    public int hashCode() {
        Integer id = getId();
        int hashCode = (getIncidentType().hashCode() + ((id != null ? id.intValue() : 0) * 31)) * 31;
        Boolean isHome = getIsHome();
        int hashCode2 = (hashCode + (isHome != null ? Boolean.hashCode(isHome.booleanValue()) : 0)) * 31;
        Integer time = getTime();
        int intValue = (hashCode2 + (time != null ? time.intValue() : 0)) * 31;
        Integer addedTime = getAddedTime();
        int intValue2 = (intValue + (addedTime != null ? addedTime.intValue() : 0)) * 31;
        String str = this.sport;
        return intValue2 + (str != null ? str.hashCode() : 0);
    }

    @Nullable
    /* renamed from: isHome */
    public abstract Boolean getIsHome();

    @Nullable
    public final Boolean isHome(@NotNull TeamSides side) {
        side.getClass();
        Boolean isHome = getIsHome();
        if (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) {
            isHome = null;
        }
        if (isHome != null) {
            return isHome;
        }
        if (getIsHome() != null) {
            return Boolean.valueOf(!r3.booleanValue());
        }
        return null;
    }

    public final boolean isOnBench() {
        Integer time = getTime();
        return time != null && time.intValue() == -5;
    }

    public abstract void setId(@Nullable Integer num);

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    public final void setSport(@Nullable String str) {
        this.sport = str;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b$\b\u0007\u0018\u0000 L2\u00020\u0001:\u0002LMBÇ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aBÏ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0011\u0010(\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010)\"\u0004\b2\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b\u0007\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b9\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b:\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b>\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b?\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\bC\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\bD\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\bE\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\bF\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\bG\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\bH\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\bI\u0010)R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\bJ\u0010)R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\bK\u0010)¨\u0006N"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$CardIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "id", "", "incidentType", "", "isHome", "time", "addedTime", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "playerName", "reason", "Lcom/sofascore/model/mvvm/model/Manager;", SearchResponseKt.MANAGER_ENTITY, "incidentClass", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "homeScore", "awayScore", "benchTime", "benchAddedTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$CardIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getPlayerId", "()Ljava/lang/Integer;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTime", "getAddedTime", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "getPlayerName", "getReason", "Lcom/sofascore/model/mvvm/model/Manager;", "getManager", "()Lcom/sofascore/model/mvvm/model/Manager;", "getIncidentClass", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "getHomeScore", "getAwayScore", "getBenchTime", "getBenchAddedTime", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardIncident extends Incident {

        @NotNull
        public static final String CARD_RED = "red";

        @NotNull
        public static final String CARD_YELLOW = "yellow";

        @NotNull
        public static final String CARD_YELLOW_RED = "yellowRed";

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer benchAddedTime;

        @Nullable
        private final Integer benchTime;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @NotNull
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final Manager manager;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Player player;

        @Nullable
        private final String playerName;

        @Nullable
        private final String reason;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ CardIncident(int i, Integer num, String str, Boolean bool, Integer num2, Integer num3, Player player, String str2, String str3, Manager manager, String str4, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
                oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, Incident$CardIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.player = player;
            this.playerName = str2;
            this.reason = str3;
            this.manager = manager;
            this.incidentClass = str4;
            if ((i & 1024) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num4;
            }
            if ((i & a.o) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num5;
            }
            if ((i & 4096) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num6;
            }
            if ((i & 8192) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num7;
            }
            if ((i & 16384) == 0) {
                this.homeScore = null;
            } else {
                this.homeScore = num8;
            }
            if ((32768 & i) == 0) {
                this.awayScore = null;
            } else {
                this.awayScore = num9;
            }
            if ((65536 & i) == 0) {
                this.benchTime = null;
            } else {
                this.benchTime = num10;
            }
            if ((i & 131072) == 0) {
                this.benchAddedTime = null;
            } else {
                this.benchAddedTime = num11;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(CardIncident self, wf3 output, SerialDescriptor serialDesc) {
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.getId());
            output.y(serialDesc, 1, self.getIncidentType());
            output.h(serialDesc, 2, gz1.a, self.getIsHome());
            output.h(serialDesc, 3, a7aVar, self.getTime());
            output.h(serialDesc, 4, a7aVar, self.getAddedTime());
            output.h(serialDesc, 5, Player$$serializer.INSTANCE, self.player);
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 6, uhiVar, self.playerName);
            output.h(serialDesc, 7, uhiVar, self.reason);
            output.h(serialDesc, 8, Manager$$serializer.INSTANCE, self.manager);
            output.y(serialDesc, 9, self.incidentClass);
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 10, a7aVar, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 11, a7aVar, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 12, a7aVar, self.getPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 13, a7aVar, self.getTimeSeconds());
            }
            if (output.o(serialDesc) || self.getHomeScore() != null) {
                output.h(serialDesc, 14, a7aVar, self.getHomeScore());
            }
            if (output.o(serialDesc) || self.getAwayScore() != null) {
                output.h(serialDesc, 15, a7aVar, self.getAwayScore());
            }
            if (output.o(serialDesc) || self.benchTime != null) {
                output.h(serialDesc, 16, a7aVar, self.benchTime);
            }
            if (!output.o(serialDesc) && self.benchAddedTime == null) {
                return;
            }
            output.h(serialDesc, 17, a7aVar, self.benchAddedTime);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!CardIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            CardIncident cardIncident = (CardIncident) other;
            return Intrinsics.c(this.player, cardIncident.player) && Intrinsics.c(this.playerName, cardIncident.playerName) && Intrinsics.c(this.reason, cardIncident.reason) && Intrinsics.c(this.manager, cardIncident.manager) && Intrinsics.c(this.incidentClass, cardIncident.incidentClass) && Intrinsics.c(this.benchTime, cardIncident.benchTime) && Intrinsics.c(this.benchAddedTime, cardIncident.benchAddedTime);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Nullable
        public final Integer getBenchAddedTime() {
            return this.benchAddedTime;
        }

        @Nullable
        public final Integer getBenchTime() {
            return this.benchTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @NotNull
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Nullable
        public final Manager getManager() {
            return this.manager;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Nullable
        public final Player getPlayer() {
            return this.player;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPlayerId() {
            Player player = this.player;
            if (player != null) {
                return Integer.valueOf(player.getId());
            }
            return null;
        }

        @Nullable
        public final String getPlayerName() {
            return this.playerName;
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Player player = this.player;
            int hashCode2 = (hashCode + (player != null ? player.hashCode() : 0)) * 31;
            String str = this.playerName;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.reason;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Manager manager = this.manager;
            int c = dmi.c((hashCode4 + (manager != null ? manager.hashCode() : 0)) * 31, 31, this.incidentClass);
            Integer num = this.benchTime;
            int intValue = (c + (num != null ? num.intValue() : 0)) * 31;
            Integer num2 = this.benchAddedTime;
            return intValue + (num2 != null ? num2.intValue() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$CardIncident$Companion;", "", "<init>", "()V", "CARD_RED", "", "CARD_YELLOW", "CARD_YELLOW_RED", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$CardIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$CardIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardIncident(@Nullable Integer num, @NotNull String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Player player, @Nullable String str2, @Nullable String str3, @Nullable Manager manager, @NotNull String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11) {
            super(null);
            str.getClass();
            str4.getClass();
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.player = player;
            this.playerName = str2;
            this.reason = str3;
            this.manager = manager;
            this.incidentClass = str4;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            this.periodTimeSeconds = num6;
            this.timeSeconds = num7;
            this.homeScore = num8;
            this.awayScore = num9;
            this.benchTime = num10;
            this.benchAddedTime = num11;
        }

        public /* synthetic */ CardIncident(Integer num, String str, Boolean bool, Integer num2, Integer num3, Player player, String str2, String str3, Manager manager, String str4, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, bool, num2, num3, player, str2, str3, manager, str4, (i & 1024) != 0 ? null : num4, (i & a.o) != 0 ? null : num5, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) != 0 ? null : num8, (32768 & i) != 0 ? null : num9, (65536 & i) != 0 ? null : num10, (i & 131072) != 0 ? null : num11);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0002^_B\u0083\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"Ba\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010#B/\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010$B\u0091\u0002\b\u0010\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b!\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010*\"\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\b\u0007\u0010BR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\bC\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bD\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bE\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bF\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bG\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bH\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bI\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bJ\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\bN\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bO\u0010MR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bP\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bQ\u0010MR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\bR\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bS\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bW\u0010@R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\b[\u0010*R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b\\\u0010*R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b]\u0010*¨\u0006`"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "id", "", "incidentType", "", "isHome", "time", "addedTime", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "homeScore", "awayScore", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "playerName", "assist1", "assist1Name", "assist2", "assist2Name", "reason", "Lcom/sofascore/model/mvvm/model/Manager;", SearchResponseKt.MANAGER_ENTITY, "incidentClass", "", "Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "footballPassingNetworkAction", "seasonCount", "assist1SeasonCount", "assist2SeasonCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "getPlayerId", "()Ljava/lang/Integer;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTime", "getAddedTime", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "getHomeScore", "getAwayScore", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "getPlayerName", "getAssist1", "getAssist1Name", "getAssist2", "getAssist2Name", "getReason", "Lcom/sofascore/model/mvvm/model/Manager;", "getManager", "()Lcom/sofascore/model/mvvm/model/Manager;", "getIncidentClass", "Ljava/util/List;", "getFootballPassingNetworkAction", "()Ljava/util/List;", "getSeasonCount", "getAssist1SeasonCount", "getAssist2SeasonCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GoalIncident extends Incident {

        @NotNull
        public static final String TYPE_ACCUMULATED_PENALTY = "accumulatedPenalty";

        @NotNull
        public static final String TYPE_BEHIND = "behind";

        @NotNull
        public static final String TYPE_DEF_TWO_POINT_CONV = "defTwoPointConversion";

        @NotNull
        public static final String TYPE_EMPTY_NET = "emptynet";

        @NotNull
        public static final String TYPE_EXTRA_POINT = "extraPoint";

        @NotNull
        public static final String TYPE_FIELD_GOAL = "fieldGoal";

        @NotNull
        public static final String TYPE_FOUR_POINT = "fourPoints";

        @NotNull
        public static final String TYPE_GOAL = "goal";

        @NotNull
        public static final String TYPE_GOALKEEPER = "goalkeeper";

        @NotNull
        public static final String TYPE_ONE_POINT = "onePoint";

        @NotNull
        public static final String TYPE_OWN_GOAL = "ownGoal";

        @NotNull
        public static final String TYPE_PENALTY = "penalty";

        @NotNull
        public static final String TYPE_PENALTY_TRY = "penaltyTry";

        @NotNull
        public static final String TYPE_POWER_PLAY = "powerplay";

        @NotNull
        public static final String TYPE_REGULAR = "regular";

        @NotNull
        public static final String TYPE_ROUGE = "rouge";

        @NotNull
        public static final String TYPE_SAFETY = "safety";

        @NotNull
        public static final String TYPE_SHORT_HANDED = "shorthanded";

        @NotNull
        public static final String TYPE_TEMPORARY = "temporary";

        @NotNull
        public static final String TYPE_THREE_POINT = "threePoints";

        @NotNull
        public static final String TYPE_TOUCHDOWN = "touchdown";

        @NotNull
        public static final String TYPE_TRY = "try";

        @NotNull
        public static final String TYPE_TWO_POINT = "twoPoints";

        @NotNull
        public static final String TYPE_TWO_POINT_CONV = "twoPointConversion";

        @NotNull
        public static final String TYPE_VOLLEYBALL_ACE = "ace";

        @NotNull
        public static final String TYPE_VOLLEYBALL_BLOCK = "block";

        @NotNull
        public static final String TYPE_VOLLEYBALL_ERROR = "opponentError";

        @NotNull
        public static final String TYPE_VOLLEYBALL_SPIKE = "spike";

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Player assist1;

        @Nullable
        private final String assist1Name;

        @Nullable
        private final Integer assist1SeasonCount;

        @Nullable
        private final Player assist2;

        @Nullable
        private final String assist2Name;

        @Nullable
        private final Integer assist2SeasonCount;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final List<FootballPassingNetworkSegment> footballPassingNetworkAction;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final Manager manager;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Player player;

        @Nullable
        private final String playerName;

        @Nullable
        private final String reason;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer seasonCount;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new us9(2)), null, null, null};

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ GoalIncident(int i, Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Player player, String str2, Player player2, String str3, Player player3, String str4, String str5, Manager manager, String str6, List list, Integer num10, Integer num11, Integer num12, t5h t5hVar) {
            super(r2);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (2097023 != (i & 2097023)) {
                oea.z(i, 2097023, Incident$GoalIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            if ((i & 128) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num6;
            }
            this.timeSeconds = num7;
            this.homeScore = num8;
            this.awayScore = num9;
            this.player = player;
            this.playerName = str2;
            this.assist1 = player2;
            this.assist1Name = str3;
            this.assist2 = player3;
            this.assist2Name = str4;
            this.reason = str5;
            this.manager = manager;
            this.incidentClass = str6;
            this.footballPassingNetworkAction = list;
            if ((2097152 & i) == 0) {
                this.seasonCount = null;
            } else {
                this.seasonCount = num10;
            }
            if ((4194304 & i) == 0) {
                this.assist1SeasonCount = null;
            } else {
                this.assist1SeasonCount = num11;
            }
            if ((i & 8388608) == 0) {
                this.assist2SeasonCount = null;
            } else {
                this.assist2SeasonCount = num12;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new xg0(FootballPassingNetworkSegment$$serializer.INSTANCE, 0);
        }

        public static final /* synthetic */ void write$Self$model_release(GoalIncident self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.getId());
            output.y(serialDesc, 1, self.getIncidentType());
            output.h(serialDesc, 2, gz1.a, self.getIsHome());
            output.h(serialDesc, 3, a7aVar, self.getTime());
            output.h(serialDesc, 4, a7aVar, self.getAddedTime());
            output.h(serialDesc, 5, a7aVar, self.getReversedPeriodTime());
            output.h(serialDesc, 6, a7aVar, self.getReversedPeriodTimeSeconds());
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 7, a7aVar, self.getPeriodTimeSeconds());
            }
            output.h(serialDesc, 8, a7aVar, self.getTimeSeconds());
            output.h(serialDesc, 9, a7aVar, self.getHomeScore());
            output.h(serialDesc, 10, a7aVar, self.getAwayScore());
            Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
            output.h(serialDesc, 11, player$$serializer, self.player);
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 12, uhiVar, self.playerName);
            output.h(serialDesc, 13, player$$serializer, self.assist1);
            output.h(serialDesc, 14, uhiVar, self.assist1Name);
            output.h(serialDesc, 15, player$$serializer, self.assist2);
            output.h(serialDesc, 16, uhiVar, self.assist2Name);
            output.h(serialDesc, 17, uhiVar, self.reason);
            output.h(serialDesc, 18, Manager$$serializer.INSTANCE, self.manager);
            output.h(serialDesc, 19, uhiVar, self.incidentClass);
            output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.getFootballPassingNetworkAction());
            if (output.o(serialDesc) || self.seasonCount != null) {
                output.h(serialDesc, 21, a7aVar, self.seasonCount);
            }
            if (output.o(serialDesc) || self.assist1SeasonCount != null) {
                output.h(serialDesc, 22, a7aVar, self.assist1SeasonCount);
            }
            if (!output.o(serialDesc) && self.assist2SeasonCount == null) {
                return;
            }
            output.h(serialDesc, 23, a7aVar, self.assist2SeasonCount);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!GoalIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            GoalIncident goalIncident = (GoalIncident) other;
            return Intrinsics.c(getHomeScore(), goalIncident.getHomeScore()) && Intrinsics.c(getAwayScore(), goalIncident.getAwayScore()) && Intrinsics.c(this.player, goalIncident.player) && Intrinsics.c(this.playerName, goalIncident.playerName) && Intrinsics.c(this.assist1, goalIncident.assist1) && Intrinsics.c(this.assist1Name, goalIncident.assist1Name) && Intrinsics.c(this.assist2, goalIncident.assist2) && Intrinsics.c(this.assist2Name, goalIncident.assist2Name) && Intrinsics.c(this.reason, goalIncident.reason) && Intrinsics.c(this.manager, goalIncident.manager) && Intrinsics.c(this.incidentClass, goalIncident.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Nullable
        public final Player getAssist1() {
            return this.assist1;
        }

        @Nullable
        public final String getAssist1Name() {
            return this.assist1Name;
        }

        @Nullable
        public final Integer getAssist1SeasonCount() {
            return this.assist1SeasonCount;
        }

        @Nullable
        public final Player getAssist2() {
            return this.assist2;
        }

        @Nullable
        public final String getAssist2Name() {
            return this.assist2Name;
        }

        @Nullable
        public final Integer getAssist2SeasonCount() {
            return this.assist2SeasonCount;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public List<FootballPassingNetworkSegment> getFootballPassingNetworkAction() {
            return this.footballPassingNetworkAction;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Nullable
        public final Manager getManager() {
            return this.manager;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Nullable
        public final Player getPlayer() {
            return this.player;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPlayerId() {
            Player player = this.player;
            if (player != null) {
                return Integer.valueOf(player.getId());
            }
            return null;
        }

        @Nullable
        public final String getPlayerName() {
            return this.playerName;
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Nullable
        public final Integer getSeasonCount() {
            return this.seasonCount;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Integer homeScore = getHomeScore();
            int intValue = (hashCode + (homeScore != null ? homeScore.intValue() : 0)) * 31;
            Integer awayScore = getAwayScore();
            int intValue2 = (intValue + (awayScore != null ? awayScore.intValue() : 0)) * 31;
            Player player = this.player;
            int hashCode2 = (intValue2 + (player != null ? player.hashCode() : 0)) * 31;
            String str = this.playerName;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            Player player2 = this.assist1;
            int hashCode4 = (hashCode3 + (player2 != null ? player2.hashCode() : 0)) * 31;
            String str2 = this.assist1Name;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Player player3 = this.assist2;
            int hashCode6 = (hashCode5 + (player3 != null ? player3.hashCode() : 0)) * 31;
            String str3 = this.assist2Name;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.reason;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Manager manager = this.manager;
            int hashCode9 = (hashCode8 + (manager != null ? manager.hashCode() : 0)) * 31;
            String str5 = this.incidentClass;
            return hashCode9 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$GoalIncident$Companion;", "", "<init>", "()V", "TYPE_GOAL", "", "TYPE_REGULAR", "TYPE_PENALTY", "TYPE_OWN_GOAL", "TYPE_TOUCHDOWN", "TYPE_EXTRA_POINT", "TYPE_TWO_POINT_CONV", "TYPE_DEF_TWO_POINT_CONV", "TYPE_FIELD_GOAL", "TYPE_SAFETY", "TYPE_ROUGE", "TYPE_ONE_POINT", "TYPE_TWO_POINT", "TYPE_THREE_POINT", "TYPE_FOUR_POINT", "TYPE_TRY", "TYPE_PENALTY_TRY", "TYPE_BEHIND", "TYPE_ACCUMULATED_PENALTY", "TYPE_POWER_PLAY", "TYPE_SHORT_HANDED", "TYPE_EMPTY_NET", "TYPE_GOALKEEPER", "TYPE_TEMPORARY", "TYPE_VOLLEYBALL_SPIKE", "TYPE_VOLLEYBALL_ACE", "TYPE_VOLLEYBALL_BLOCK", "TYPE_VOLLEYBALL_ERROR", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$GoalIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalIncident(@Nullable Integer num, @NotNull String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Player player, @Nullable String str2, @Nullable Player player2, @Nullable String str3, @Nullable Player player3, @Nullable String str4, @Nullable String str5, @Nullable Manager manager, @Nullable String str6, @Nullable List<FootballPassingNetworkSegment> list, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12) {
            super(null);
            str.getClass();
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            this.periodTimeSeconds = num6;
            this.timeSeconds = num7;
            this.homeScore = num8;
            this.awayScore = num9;
            this.player = player;
            this.playerName = str2;
            this.assist1 = player2;
            this.assist1Name = str3;
            this.assist2 = player3;
            this.assist2Name = str4;
            this.reason = str5;
            this.manager = manager;
            this.incidentClass = str6;
            this.footballPassingNetworkAction = list;
            this.seasonCount = num10;
            this.assist1SeasonCount = num11;
            this.assist2SeasonCount = num12;
        }

        public /* synthetic */ GoalIncident(Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Player player, String str2, Player player2, String str3, Player player3, String str4, String str5, Manager manager, String str6, List list, Integer num10, Integer num11, Integer num12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, bool, num2, num3, num4, num5, (i & 128) != 0 ? null : num6, num7, num8, num9, player, str2, player2, str3, player3, str4, str5, manager, str6, list, (2097152 & i) != 0 ? null : num10, (4194304 & i) != 0 ? null : num11, (i & 8388608) != 0 ? null : num12);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GoalIncident(@NotNull String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable Player player, @Nullable Player player2, @Nullable Player player3, @Nullable Integer num2, @Nullable Integer num3) {
            this((Integer) 0, str, bool, num, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, num2, num3, player, (String) null, player2, (String) null, player3, (String) null, (String) null, (Manager) null, str2, (List) null, (Integer) null, (Integer) null, (Integer) null, 14680064, (DefaultConstructorMarker) null);
            str.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GoalIncident(@NotNull String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2) {
            this(str, bool, num, str2, null, null, null, null, null);
            str.getClass();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=<B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b\u0005\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b2\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00105R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b6\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b7\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b8\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b9\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b:\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b;\u0010.¨\u0006>"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "incidentType", "", "isHome", "", "time", "addedTime", "length", "incidentClass", "id", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "homeScore", "awayScore", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getTime", "()Ljava/lang/Integer;", "getAddedTime", "I", "getLength", "getIncidentClass", "getId", "setId", "(Ljava/lang/Integer;)V", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "getHomeScore", "getAwayScore", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InjuryTimeIncident extends Incident {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;
        private final int length;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ InjuryTimeIncident(int i, String str, Boolean bool, Integer num, Integer num2, int i2, String str2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (63 != (i & 63)) {
                oea.z(i, 63, Incident$InjuryTimeIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.incidentType = str;
            this.isHome = bool;
            this.time = num;
            this.addedTime = num2;
            this.length = i2;
            this.incidentClass = str2;
            if ((i & 64) == 0) {
                this.id = null;
            } else {
                this.id = num3;
            }
            if ((i & 128) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num4;
            }
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num5;
            }
            if ((i & 512) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num6;
            }
            if ((i & 1024) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num7;
            }
            if ((i & a.o) == 0) {
                this.homeScore = null;
            } else {
                this.homeScore = num8;
            }
            if ((i & 4096) == 0) {
                this.awayScore = null;
            } else {
                this.awayScore = num9;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(InjuryTimeIncident self, wf3 output, SerialDescriptor serialDesc) {
            output.y(serialDesc, 0, self.getIncidentType());
            output.h(serialDesc, 1, gz1.a, self.getIsHome());
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 2, a7aVar, self.getTime());
            output.h(serialDesc, 3, a7aVar, self.getAddedTime());
            output.u(4, self.length, serialDesc);
            output.h(serialDesc, 5, uhi.a, self.incidentClass);
            if (output.o(serialDesc) || self.getId() != null) {
                output.h(serialDesc, 6, a7aVar, self.getId());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 7, a7aVar, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 8, a7aVar, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 9, a7aVar, self.getPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 10, a7aVar, self.getTimeSeconds());
            }
            if (output.o(serialDesc) || self.getHomeScore() != null) {
                output.h(serialDesc, 11, a7aVar, self.getHomeScore());
            }
            if (!output.o(serialDesc) && self.getAwayScore() == null) {
                return;
            }
            output.h(serialDesc, 12, a7aVar, self.getAwayScore());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!InjuryTimeIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            InjuryTimeIncident injuryTimeIncident = (InjuryTimeIncident) other;
            return this.length == injuryTimeIncident.length && Intrinsics.c(this.incidentClass, injuryTimeIncident.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        public final int getLength() {
            return this.length;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = ((super.hashCode() * 31) + this.length) * 31;
            String str = this.incidentClass;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$InjuryTimeIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InjuryTimeIncident(@NotNull String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, int i, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
            super(null);
            str.getClass();
            this.incidentType = str;
            this.isHome = bool;
            this.time = num;
            this.addedTime = num2;
            this.length = i;
            this.incidentClass = str2;
            this.id = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            this.periodTimeSeconds = num6;
            this.timeSeconds = num7;
            this.homeScore = num8;
            this.awayScore = num9;
        }

        public /* synthetic */ InjuryTimeIncident(String str, Boolean bool, Integer num, Integer num2, int i, String str2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, num, num2, i, str2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : num4, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num5, (i2 & 512) != 0 ? null : num6, (i2 & 1024) != 0 ? null : num7, (i2 & a.o) != 0 ? null : num8, (i2 & 4096) != 0 ? null : num9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002?>B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014B¥\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b0\u0010/R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b1\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b2\u0010/R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b3\u0010*R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b\f\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b6\u0010*R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010-\u001a\u0004\b7\u0010/\"\u0004\b8\u00109R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b:\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b;\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b<\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b=\u0010/¨\u0006@"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$OvertimeBreakIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "incidentType", "", "isHome", "", "time", "addedTime", "homeScore", "awayScore", "text", "isLive", "incidentClass", "id", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$OvertimeBreakIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getTime", "()Ljava/lang/Integer;", "getAddedTime", "getHomeScore", "getAwayScore", "getText", "Z", "()Z", "getIncidentClass", "getId", "setId", "(Ljava/lang/Integer;)V", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OvertimeBreakIncident extends Incident {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;
        private final boolean isLive;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @NotNull
        private final String text;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ OvertimeBreakIncident(int i, String str, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str2, boolean z, String str3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (511 != (i & 511)) {
                oea.z(i, 511, Incident$OvertimeBreakIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.incidentType = str;
            this.isHome = bool;
            this.time = num;
            this.addedTime = num2;
            this.homeScore = num3;
            this.awayScore = num4;
            this.text = str2;
            this.isLive = z;
            this.incidentClass = str3;
            if ((i & 512) == 0) {
                this.id = null;
            } else {
                this.id = num5;
            }
            if ((i & 1024) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num6;
            }
            if ((i & a.o) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num7;
            }
            if ((i & 4096) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num8;
            }
            if ((i & 8192) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num9;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(OvertimeBreakIncident self, wf3 output, SerialDescriptor serialDesc) {
            output.y(serialDesc, 0, self.getIncidentType());
            output.h(serialDesc, 1, gz1.a, self.getIsHome());
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 2, a7aVar, self.getTime());
            output.h(serialDesc, 3, a7aVar, self.getAddedTime());
            output.h(serialDesc, 4, a7aVar, self.getHomeScore());
            output.h(serialDesc, 5, a7aVar, self.getAwayScore());
            output.y(serialDesc, 6, self.text);
            output.x(serialDesc, 7, self.isLive);
            output.h(serialDesc, 8, uhi.a, self.incidentClass);
            if (output.o(serialDesc) || self.getId() != null) {
                output.h(serialDesc, 9, a7aVar, self.getId());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 10, a7aVar, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 11, a7aVar, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 12, a7aVar, self.getPeriodTimeSeconds());
            }
            if (!output.o(serialDesc) && self.getTimeSeconds() == null) {
                return;
            }
            output.h(serialDesc, 13, a7aVar, self.getTimeSeconds());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!OvertimeBreakIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            OvertimeBreakIncident overtimeBreakIncident = (OvertimeBreakIncident) other;
            return Intrinsics.c(getHomeScore(), overtimeBreakIncident.getHomeScore()) && Intrinsics.c(getAwayScore(), overtimeBreakIncident.getAwayScore()) && Intrinsics.c(this.text, overtimeBreakIncident.text) && this.isLive == overtimeBreakIncident.isLive && Intrinsics.c(this.incidentClass, overtimeBreakIncident.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Integer homeScore = getHomeScore();
            int intValue = (hashCode + (homeScore != null ? homeScore.intValue() : 0)) * 31;
            Integer awayScore = getAwayScore();
            int e = dmi.e(dmi.c((intValue + (awayScore != null ? awayScore.intValue() : 0)) * 31, 31, this.text), 31, this.isLive);
            String str = this.incidentClass;
            return e + (str != null ? str.hashCode() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        /* renamed from: isLive, reason: from getter */
        public final boolean getIsLive() {
            return this.isLive;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$OvertimeBreakIncident$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$OvertimeBreakIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$OvertimeBreakIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OvertimeBreakIncident(@NotNull String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @NotNull String str2, boolean z, @Nullable String str3, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
            super(null);
            str.getClass();
            str2.getClass();
            this.incidentType = str;
            this.isHome = bool;
            this.time = num;
            this.addedTime = num2;
            this.homeScore = num3;
            this.awayScore = num4;
            this.text = str2;
            this.isLive = z;
            this.incidentClass = str3;
            this.id = num5;
            this.reversedPeriodTime = num6;
            this.reversedPeriodTimeSeconds = num7;
            this.periodTimeSeconds = num8;
            this.timeSeconds = num9;
        }

        public /* synthetic */ OvertimeBreakIncident(String str, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str2, boolean z, String str3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, num, num2, num3, num4, str2, z, str3, (i & 512) != 0 ? null : num5, (i & 1024) != 0 ? null : num6, (i & a.o) != 0 ? null : num7, (i & 4096) != 0 ? null : num8, (i & 8192) != 0 ? null : num9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b'\b\u0007\u0018\u0000 R2\u00020\u0001:\u0002RSBÏ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dBß\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010,\"\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b\u0007\u0010;R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b<\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b=\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b>\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b?\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bC\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bD\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\bE\u0010,R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\bF\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bJ\u0010IR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\bN\u0010,R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\bO\u0010,R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\bP\u0010,R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\bQ\u0010,¨\u0006T"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "id", "", "incidentType", "", "isHome", "time", "addedTime", "homeScore", "awayScore", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "playerName", "description", "sequence", "incidentClass", "Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;", "penaltyHistory", "goalkeeperPenaltyHistory", "", "Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "footballPassingNetworkAction", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getPlayerId", "()Ljava/lang/Integer;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTime", "getAddedTime", "getHomeScore", "getAwayScore", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "getPlayerName", "getDescription", "getSequence", "getIncidentClass", "Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;", "getPenaltyHistory", "()Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;", "getGoalkeeperPenaltyHistory", "Ljava/util/List;", "getFootballPassingNetworkAction", "()Ljava/util/List;", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PenaltyShotIncident extends Incident {

        @NotNull
        public static final String PENALTY_SHOT_AWARDED = "awarded";

        @NotNull
        public static final String PENALTY_SHOT_MISSED = "missed";

        @NotNull
        public static final String PENALTY_SHOT_SCORED = "scored";

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final String description;

        @Nullable
        private final List<FootballPassingNetworkSegment> footballPassingNetworkAction;

        @Nullable
        private final PlayerPenaltyHistoryResponse goalkeeperPenaltyHistory;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @NotNull
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final PlayerPenaltyHistoryResponse penaltyHistory;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Player player;

        @Nullable
        private final String playerName;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer sequence;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new us9(3)), null, null, null, null};

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ PenaltyShotIncident(int i, Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Player player, String str2, String str3, Integer num6, String str4, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2, List list, Integer num7, Integer num8, Integer num9, Integer num10, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (32767 != (i & 32767)) {
                oea.z(i, 32767, Incident$PenaltyShotIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.homeScore = num4;
            this.awayScore = num5;
            this.player = player;
            this.playerName = str2;
            this.description = str3;
            this.sequence = num6;
            this.incidentClass = str4;
            this.penaltyHistory = playerPenaltyHistoryResponse;
            this.goalkeeperPenaltyHistory = playerPenaltyHistoryResponse2;
            this.footballPassingNetworkAction = list;
            if ((32768 & i) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num7;
            }
            if ((65536 & i) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num8;
            }
            if ((131072 & i) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num9;
            }
            if ((i & 262144) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new xg0(FootballPassingNetworkSegment$$serializer.INSTANCE, 0);
        }

        public static final /* synthetic */ void write$Self$model_release(PenaltyShotIncident self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.getId());
            output.y(serialDesc, 1, self.getIncidentType());
            output.h(serialDesc, 2, gz1.a, self.getIsHome());
            output.h(serialDesc, 3, a7aVar, self.getTime());
            output.h(serialDesc, 4, a7aVar, self.getAddedTime());
            output.h(serialDesc, 5, a7aVar, self.getHomeScore());
            output.h(serialDesc, 6, a7aVar, self.getAwayScore());
            output.h(serialDesc, 7, Player$$serializer.INSTANCE, self.player);
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 8, uhiVar, self.playerName);
            output.h(serialDesc, 9, uhiVar, self.description);
            output.h(serialDesc, 10, a7aVar, self.sequence);
            output.y(serialDesc, 11, self.incidentClass);
            PlayerPenaltyHistoryResponse$$serializer playerPenaltyHistoryResponse$$serializer = PlayerPenaltyHistoryResponse$$serializer.INSTANCE;
            output.h(serialDesc, 12, playerPenaltyHistoryResponse$$serializer, self.penaltyHistory);
            output.h(serialDesc, 13, playerPenaltyHistoryResponse$$serializer, self.goalkeeperPenaltyHistory);
            output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.getFootballPassingNetworkAction());
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 15, a7aVar, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 16, a7aVar, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 17, a7aVar, self.getPeriodTimeSeconds());
            }
            if (!output.o(serialDesc) && self.getTimeSeconds() == null) {
                return;
            }
            output.h(serialDesc, 18, a7aVar, self.getTimeSeconds());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!PenaltyShotIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            PenaltyShotIncident penaltyShotIncident = (PenaltyShotIncident) other;
            return Intrinsics.c(getHomeScore(), penaltyShotIncident.getHomeScore()) && Intrinsics.c(getAwayScore(), penaltyShotIncident.getAwayScore()) && Intrinsics.c(this.player, penaltyShotIncident.player) && Intrinsics.c(this.playerName, penaltyShotIncident.playerName) && Intrinsics.c(this.description, penaltyShotIncident.description) && Intrinsics.c(this.sequence, penaltyShotIncident.sequence) && Intrinsics.c(this.incidentClass, penaltyShotIncident.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public List<FootballPassingNetworkSegment> getFootballPassingNetworkAction() {
            return this.footballPassingNetworkAction;
        }

        @Nullable
        public final PlayerPenaltyHistoryResponse getGoalkeeperPenaltyHistory() {
            return this.goalkeeperPenaltyHistory;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @NotNull
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Nullable
        public final PlayerPenaltyHistoryResponse getPenaltyHistory() {
            return this.penaltyHistory;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Nullable
        public final Player getPlayer() {
            return this.player;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPlayerId() {
            Player player = this.player;
            if (player != null) {
                return Integer.valueOf(player.getId());
            }
            return null;
        }

        @Nullable
        public final String getPlayerName() {
            return this.playerName;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Nullable
        public final Integer getSequence() {
            return this.sequence;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Integer homeScore = getHomeScore();
            int intValue = (hashCode + (homeScore != null ? homeScore.intValue() : 0)) * 31;
            Integer awayScore = getAwayScore();
            int intValue2 = (intValue + (awayScore != null ? awayScore.intValue() : 0)) * 31;
            Player player = this.player;
            int hashCode2 = (intValue2 + (player != null ? player.hashCode() : 0)) * 31;
            String str = this.playerName;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num = this.sequence;
            return this.incidentClass.hashCode() + ((hashCode4 + (num != null ? num.intValue() : 0)) * 31);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident$Companion;", "", "<init>", "()V", "PENALTY_SHOT_SCORED", "", "PENALTY_SHOT_MISSED", "PENALTY_SHOT_AWARDED", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$PenaltyShotIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$PenaltyShotIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PenaltyShotIncident(@Nullable Integer num, @NotNull String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Player player, @Nullable String str2, @Nullable String str3, @Nullable Integer num6, @NotNull String str4, @Nullable PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, @Nullable PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2, @Nullable List<FootballPassingNetworkSegment> list, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10) {
            super(null);
            str.getClass();
            str4.getClass();
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.homeScore = num4;
            this.awayScore = num5;
            this.player = player;
            this.playerName = str2;
            this.description = str3;
            this.sequence = num6;
            this.incidentClass = str4;
            this.penaltyHistory = playerPenaltyHistoryResponse;
            this.goalkeeperPenaltyHistory = playerPenaltyHistoryResponse2;
            this.footballPassingNetworkAction = list;
            this.reversedPeriodTime = num7;
            this.reversedPeriodTimeSeconds = num8;
            this.periodTimeSeconds = num9;
            this.timeSeconds = num10;
        }

        public /* synthetic */ PenaltyShotIncident(Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Player player, String str2, String str3, Integer num6, String str4, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2, List list, Integer num7, Integer num8, Integer num9, Integer num10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, bool, num2, num3, num4, num5, player, str2, str3, num6, str4, playerPenaltyHistoryResponse, playerPenaltyHistoryResponse2, list, (i & 32768) != 0 ? null : num7, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : num8, (i & 131072) != 0 ? null : num9, (i & 262144) != 0 ? null : num10);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0007\u0018\u0000 @2\u00020\u0001:\u0002A@B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B¯\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b3\u00100R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b4\u0010+R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b\f\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b7\u0010+R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010.\u001a\u0004\b8\u00100\"\u0004\b9\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b;\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b<\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b=\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b>\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b?\u0010+¨\u0006B"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "incidentType", "", "isHome", "", "time", "addedTime", "homeScore", "awayScore", "text", "isLive", "incidentClass", "id", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "period", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getTime", "()Ljava/lang/Integer;", "getAddedTime", "getHomeScore", "getAwayScore", "getText", "Z", "()Z", "getIncidentClass", "getId", "setId", "(Ljava/lang/Integer;)V", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "getPeriod", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PeriodIncident extends Incident {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;
        private final boolean isLive;

        @Nullable
        private final String period;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @NotNull
        private final String text;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ PeriodIncident(int i, String str, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str2, boolean z, String str3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str4, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (16895 != (i & 16895)) {
                oea.z(i, 16895, Incident$PeriodIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.incidentType = str;
            this.isHome = bool;
            this.time = num;
            this.addedTime = num2;
            this.homeScore = num3;
            this.awayScore = num4;
            this.text = str2;
            this.isLive = z;
            this.incidentClass = str3;
            if ((i & 512) == 0) {
                this.id = null;
            } else {
                this.id = num5;
            }
            if ((i & 1024) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num6;
            }
            if ((i & a.o) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num7;
            }
            if ((i & 4096) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num8;
            }
            if ((i & 8192) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num9;
            }
            this.period = str4;
        }

        public static final /* synthetic */ void write$Self$model_release(PeriodIncident self, wf3 output, SerialDescriptor serialDesc) {
            output.y(serialDesc, 0, self.getIncidentType());
            output.h(serialDesc, 1, gz1.a, self.getIsHome());
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 2, a7aVar, self.getTime());
            output.h(serialDesc, 3, a7aVar, self.getAddedTime());
            output.h(serialDesc, 4, a7aVar, self.getHomeScore());
            output.h(serialDesc, 5, a7aVar, self.getAwayScore());
            output.y(serialDesc, 6, self.text);
            output.x(serialDesc, 7, self.isLive);
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 8, uhiVar, self.incidentClass);
            if (output.o(serialDesc) || self.getId() != null) {
                output.h(serialDesc, 9, a7aVar, self.getId());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 10, a7aVar, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 11, a7aVar, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 12, a7aVar, self.getPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 13, a7aVar, self.getTimeSeconds());
            }
            output.h(serialDesc, 14, uhiVar, self.period);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!PeriodIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            PeriodIncident periodIncident = (PeriodIncident) other;
            return Intrinsics.c(getHomeScore(), periodIncident.getHomeScore()) && Intrinsics.c(getAwayScore(), periodIncident.getAwayScore()) && Intrinsics.c(this.text, periodIncident.text) && this.isLive == periodIncident.isLive && Intrinsics.c(this.incidentClass, periodIncident.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Nullable
        public final String getPeriod() {
            return this.period;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Integer homeScore = getHomeScore();
            int intValue = (hashCode + (homeScore != null ? homeScore.intValue() : 0)) * 31;
            Integer awayScore = getAwayScore();
            int e = dmi.e(dmi.c((intValue + (awayScore != null ? awayScore.intValue() : 0)) * 31, 31, this.text), 31, this.isLive);
            String str = this.incidentClass;
            return e + (str != null ? str.hashCode() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        /* renamed from: isLive, reason: from getter */
        public final boolean getIsLive() {
            return this.isLive;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$PeriodIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeriodIncident(@NotNull String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @NotNull String str2, boolean z, @Nullable String str3, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable String str4) {
            super(null);
            str.getClass();
            str2.getClass();
            this.incidentType = str;
            this.isHome = bool;
            this.time = num;
            this.addedTime = num2;
            this.homeScore = num3;
            this.awayScore = num4;
            this.text = str2;
            this.isLive = z;
            this.incidentClass = str3;
            this.id = num5;
            this.reversedPeriodTime = num6;
            this.reversedPeriodTimeSeconds = num7;
            this.periodTimeSeconds = num8;
            this.timeSeconds = num9;
            this.period = str4;
        }

        public /* synthetic */ PeriodIncident(String str, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str2, boolean z, String str3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, num, num2, num3, num4, str2, z, str3, (i & 512) != 0 ? null : num5, (i & 1024) != 0 ? null : num6, (i & a.o) != 0 ? null : num7, (i & 4096) != 0 ? null : num8, (i & 8192) != 0 ? null : num9, str4);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b#\b\u0007\u0018\u0000 I2\u00020\u0001:\u0002JIBµ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018BÃ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010'\"\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b\u0007\u00106R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b7\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b8\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b9\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b:\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b;\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b?\u0010>R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\bC\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\bD\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bE\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\bF\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\bG\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\bH\u0010'¨\u0006K"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "id", "", "incidentType", "", "isHome", "time", "addedTime", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "Lcom/sofascore/model/mvvm/model/Player;", "playerIn", "playerOut", "injury", "playerNameIn", "playerNameOut", "incidentClass", "timeSeconds", "homeScore", "awayScore", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getPlayerId", "()Ljava/lang/Integer;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTime", "getAddedTime", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayerIn", "()Lcom/sofascore/model/mvvm/model/Player;", "getPlayerOut", "Z", "getInjury", "()Z", "getPlayerNameIn", "getPlayerNameOut", "getIncidentClass", "getTimeSeconds", "getHomeScore", "getAwayScore", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SubstitutionIncident extends Incident {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @NotNull
        private final String incidentType;
        private final boolean injury;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Player playerIn;

        @Nullable
        private final String playerNameIn;

        @Nullable
        private final String playerNameOut;

        @Nullable
        private final Player playerOut;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ SubstitutionIncident(int i, Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Player player, Player player2, boolean z, String str2, String str3, String str4, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (16255 != (i & 16255)) {
                oea.z(i, 16255, Incident$SubstitutionIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            if ((i & 128) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num6;
            }
            this.playerIn = player;
            this.playerOut = player2;
            this.injury = z;
            this.playerNameIn = str2;
            this.playerNameOut = str3;
            this.incidentClass = str4;
            if ((i & 16384) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num7;
            }
            if ((32768 & i) == 0) {
                this.homeScore = null;
            } else {
                this.homeScore = num8;
            }
            if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
                this.awayScore = null;
            } else {
                this.awayScore = num9;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(SubstitutionIncident self, wf3 output, SerialDescriptor serialDesc) {
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.getId());
            output.y(serialDesc, 1, self.getIncidentType());
            output.h(serialDesc, 2, gz1.a, self.getIsHome());
            output.h(serialDesc, 3, a7aVar, self.getTime());
            output.h(serialDesc, 4, a7aVar, self.getAddedTime());
            output.h(serialDesc, 5, a7aVar, self.getReversedPeriodTime());
            output.h(serialDesc, 6, a7aVar, self.getReversedPeriodTimeSeconds());
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 7, a7aVar, self.getPeriodTimeSeconds());
            }
            Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
            output.h(serialDesc, 8, player$$serializer, self.playerIn);
            output.h(serialDesc, 9, player$$serializer, self.playerOut);
            output.x(serialDesc, 10, self.injury);
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 11, uhiVar, self.playerNameIn);
            output.h(serialDesc, 12, uhiVar, self.playerNameOut);
            output.h(serialDesc, 13, uhiVar, self.incidentClass);
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 14, a7aVar, self.getTimeSeconds());
            }
            if (output.o(serialDesc) || self.getHomeScore() != null) {
                output.h(serialDesc, 15, a7aVar, self.getHomeScore());
            }
            if (!output.o(serialDesc) && self.getAwayScore() == null) {
                return;
            }
            output.h(serialDesc, 16, a7aVar, self.getAwayScore());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!SubstitutionIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            SubstitutionIncident substitutionIncident = (SubstitutionIncident) other;
            return Intrinsics.c(this.playerIn, substitutionIncident.playerIn) && Intrinsics.c(this.playerOut, substitutionIncident.playerOut) && this.injury == substitutionIncident.injury && Intrinsics.c(this.playerNameIn, substitutionIncident.playerNameIn) && Intrinsics.c(this.playerNameOut, substitutionIncident.playerNameOut) && Intrinsics.c(this.incidentClass, substitutionIncident.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        public final boolean getInjury() {
            return this.injury;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPlayerId() {
            int id;
            Player player = this.playerIn;
            if (player != null) {
                id = player.getId();
            } else {
                Player player2 = this.playerOut;
                if (player2 == null) {
                    return null;
                }
                id = player2.getId();
            }
            return Integer.valueOf(id);
        }

        @Nullable
        public final Player getPlayerIn() {
            return this.playerIn;
        }

        @Nullable
        public final String getPlayerNameIn() {
            return this.playerNameIn;
        }

        @Nullable
        public final String getPlayerNameOut() {
            return this.playerNameOut;
        }

        @Nullable
        public final Player getPlayerOut() {
            return this.playerOut;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Player player = this.playerIn;
            int hashCode2 = (hashCode + (player != null ? player.hashCode() : 0)) * 31;
            Player player2 = this.playerOut;
            int e = dmi.e((hashCode2 + (player2 != null ? player2.hashCode() : 0)) * 31, 31, this.injury);
            String str = this.playerNameIn;
            int hashCode3 = (e + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.playerNameOut;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.incidentClass;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$SubstitutionIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubstitutionIncident(@Nullable Integer num, @NotNull String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Player player, @Nullable Player player2, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
            super(null);
            str.getClass();
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            this.periodTimeSeconds = num6;
            this.playerIn = player;
            this.playerOut = player2;
            this.injury = z;
            this.playerNameIn = str2;
            this.playerNameOut = str3;
            this.incidentClass = str4;
            this.timeSeconds = num7;
            this.homeScore = num8;
            this.awayScore = num9;
        }

        public /* synthetic */ SubstitutionIncident(Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Player player, Player player2, boolean z, String str2, String str3, String str4, Integer num7, Integer num8, Integer num9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, bool, num2, num3, num4, num5, (i & 128) != 0 ? null : num6, player, player2, z, str2, str3, str4, (i & 16384) != 0 ? null : num7, (32768 & i) != 0 ? null : num8, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : num9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b%\b\u0007\u0018\u0000 N2\u00020\u0001:\u0002NOBÍ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bBÙ\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010*\"\u0004\b3\u00104R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b\u0007\u00109R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b:\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b;\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b<\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b=\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b>\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\bB\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\bC\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\bD\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\bE\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\bI\u0010AR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\bJ\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\bK\u0010*R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\bL\u0010*R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\bM\u0010*¨\u0006P"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "id", "", "incidentType", "", "isHome", "time", "addedTime", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "playerName", "reason", IronSourceConstants.EVENTS_DURATION, "incidentClass", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;", "iceHockeyPenaltyType", "suspensionServedByPlayer", "suspensionDrawnByPlayer", "timeSeconds", "homeScore", "awayScore", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getPlayerId", "()Ljava/lang/Integer;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTime", "getAddedTime", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "getPlayerName", "getReason", "getDuration", "getIncidentClass", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;", "getIceHockeyPenaltyType", "()Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;", "getSuspensionServedByPlayer", "getSuspensionDrawnByPlayer", "getTimeSeconds", "getHomeScore", "getAwayScore", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SuspensionIncident extends Incident {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String TWO_MINUTES = "twoMinutes";

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer duration;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private final HockeySuspension iceHockeyPenaltyType;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Player player;

        @Nullable
        private final String playerName;

        @Nullable
        private final String reason;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Player suspensionDrawnByPlayer;

        @Nullable
        private final Player suspensionServedByPlayer;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ SuspensionIncident(int i, Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Player player, String str2, String str3, Integer num7, String str4, HockeySuspension hockeySuspension, Player player2, Player player3, Integer num8, Integer num9, Integer num10, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (32639 != (i & 32639)) {
                oea.z(i, 32639, Incident$SuspensionIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            if ((i & 128) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num6;
            }
            this.player = player;
            this.playerName = str2;
            this.reason = str3;
            this.duration = num7;
            this.incidentClass = str4;
            this.iceHockeyPenaltyType = hockeySuspension;
            this.suspensionServedByPlayer = player2;
            if ((32768 & i) == 0) {
                this.suspensionDrawnByPlayer = null;
            } else {
                this.suspensionDrawnByPlayer = player3;
            }
            if ((65536 & i) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num8;
            }
            if ((131072 & i) == 0) {
                this.homeScore = null;
            } else {
                this.homeScore = num9;
            }
            if ((i & 262144) == 0) {
                this.awayScore = null;
            } else {
                this.awayScore = num10;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(SuspensionIncident self, wf3 output, SerialDescriptor serialDesc) {
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.getId());
            output.y(serialDesc, 1, self.getIncidentType());
            output.h(serialDesc, 2, gz1.a, self.getIsHome());
            output.h(serialDesc, 3, a7aVar, self.getTime());
            output.h(serialDesc, 4, a7aVar, self.getAddedTime());
            output.h(serialDesc, 5, a7aVar, self.getReversedPeriodTime());
            output.h(serialDesc, 6, a7aVar, self.getReversedPeriodTimeSeconds());
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 7, a7aVar, self.getPeriodTimeSeconds());
            }
            Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
            output.h(serialDesc, 8, player$$serializer, self.player);
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 9, uhiVar, self.playerName);
            output.h(serialDesc, 10, uhiVar, self.reason);
            output.h(serialDesc, 11, a7aVar, self.duration);
            output.h(serialDesc, 12, uhiVar, self.incidentClass);
            output.h(serialDesc, 13, HockeySuspension$$serializer.INSTANCE, self.iceHockeyPenaltyType);
            output.h(serialDesc, 14, player$$serializer, self.suspensionServedByPlayer);
            if (output.o(serialDesc) || self.suspensionDrawnByPlayer != null) {
                output.h(serialDesc, 15, player$$serializer, self.suspensionDrawnByPlayer);
            }
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 16, a7aVar, self.getTimeSeconds());
            }
            if (output.o(serialDesc) || self.getHomeScore() != null) {
                output.h(serialDesc, 17, a7aVar, self.getHomeScore());
            }
            if (!output.o(serialDesc) && self.getAwayScore() == null) {
                return;
            }
            output.h(serialDesc, 18, a7aVar, self.getAwayScore());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!SuspensionIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            SuspensionIncident suspensionIncident = (SuspensionIncident) other;
            if (Intrinsics.c(this.player, suspensionIncident.player) && Intrinsics.c(this.reason, suspensionIncident.reason) && Intrinsics.c(this.duration, suspensionIncident.duration) && Intrinsics.c(this.incidentClass, suspensionIncident.incidentClass) && Intrinsics.c(this.iceHockeyPenaltyType, suspensionIncident.iceHockeyPenaltyType) && Intrinsics.c(this.suspensionServedByPlayer, suspensionIncident.suspensionServedByPlayer)) {
                return Intrinsics.c(this.suspensionDrawnByPlayer, suspensionIncident.suspensionDrawnByPlayer);
            }
            return false;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Nullable
        public final Integer getDuration() {
            return this.duration;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Nullable
        public final HockeySuspension getIceHockeyPenaltyType() {
            return this.iceHockeyPenaltyType;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Nullable
        public final Player getPlayer() {
            return this.player;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPlayerId() {
            Player player = this.player;
            if (player != null) {
                return Integer.valueOf(player.getId());
            }
            return null;
        }

        @Nullable
        public final String getPlayerName() {
            return this.playerName;
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Nullable
        public final Player getSuspensionDrawnByPlayer() {
            return this.suspensionDrawnByPlayer;
        }

        @Nullable
        public final Player getSuspensionServedByPlayer() {
            return this.suspensionServedByPlayer;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Player player = this.player;
            int hashCode2 = (hashCode + (player != null ? player.hashCode() : 0)) * 31;
            String str = this.reason;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.duration;
            int intValue = (hashCode3 + (num != null ? num.intValue() : 0)) * 31;
            String str2 = this.incidentClass;
            int hashCode4 = (intValue + (str2 != null ? str2.hashCode() : 0)) * 31;
            HockeySuspension hockeySuspension = this.iceHockeyPenaltyType;
            int hashCode5 = (hashCode4 + (hockeySuspension != null ? hockeySuspension.hashCode() : 0)) * 31;
            Player player2 = this.suspensionServedByPlayer;
            int hashCode6 = (hashCode5 + (player2 != null ? player2.hashCode() : 0)) * 31;
            Player player3 = this.suspensionDrawnByPlayer;
            return hashCode6 + (player3 != null ? player3.hashCode() : 0);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident$Companion;", "", "<init>", "()V", "TWO_MINUTES", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$SuspensionIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$SuspensionIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuspensionIncident(@Nullable Integer num, @NotNull String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Player player, @Nullable String str2, @Nullable String str3, @Nullable Integer num7, @Nullable String str4, @Nullable HockeySuspension hockeySuspension, @Nullable Player player2, @Nullable Player player3, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10) {
            super(null);
            str.getClass();
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            this.periodTimeSeconds = num6;
            this.player = player;
            this.playerName = str2;
            this.reason = str3;
            this.duration = num7;
            this.incidentClass = str4;
            this.iceHockeyPenaltyType = hockeySuspension;
            this.suspensionServedByPlayer = player2;
            this.suspensionDrawnByPlayer = player3;
            this.timeSeconds = num8;
            this.homeScore = num9;
            this.awayScore = num10;
        }

        public /* synthetic */ SuspensionIncident(Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Player player, String str2, String str3, Integer num7, String str4, HockeySuspension hockeySuspension, Player player2, Player player3, Integer num8, Integer num9, Integer num10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, bool, num2, num3, num4, num5, (i & 128) != 0 ? null : num6, player, str2, str3, num7, str4, hockeySuspension, player2, (32768 & i) != 0 ? null : player3, (65536 & i) != 0 ? null : num8, (131072 & i) != 0 ? null : num9, (i & 262144) != 0 ? null : num10);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 12\u00020\u0001:\u000221B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b\u0007\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b*\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b+\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b,\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b-\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b/\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b0\u0010$¨\u00063"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$UnknownIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "incidentType", "", "id", "", "isHome", "time", "addedTime", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "homeScore", "awayScore", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$UnknownIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTime", "getAddedTime", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "getHomeScore", "getAwayScore", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnknownIncident extends Incident {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        public /* synthetic */ UnknownIncident(int i, String str, Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
            super(null);
            this.incidentType = (i & 1) == 0 ? "unknown" : str;
            if ((i & 2) == 0) {
                this.id = null;
            } else {
                this.id = num;
            }
            if ((i & 4) == 0) {
                this.isHome = null;
            } else {
                this.isHome = bool;
            }
            if ((i & 8) == 0) {
                this.time = null;
            } else {
                this.time = num2;
            }
            if ((i & 16) == 0) {
                this.addedTime = null;
            } else {
                this.addedTime = num3;
            }
            if ((i & 32) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num4;
            }
            if ((i & 64) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num5;
            }
            if ((i & 128) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num6;
            }
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num7;
            }
            if ((i & 512) == 0) {
                this.homeScore = null;
            } else {
                this.homeScore = num8;
            }
            if ((i & 1024) == 0) {
                this.awayScore = null;
            } else {
                this.awayScore = num9;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(UnknownIncident self, wf3 output, SerialDescriptor serialDesc) {
            if (output.o(serialDesc) || !Intrinsics.c(self.getIncidentType(), "unknown")) {
                output.y(serialDesc, 0, self.getIncidentType());
            }
            if (output.o(serialDesc) || self.getId() != null) {
                output.h(serialDesc, 1, a7a.a, self.getId());
            }
            if (output.o(serialDesc) || self.getIsHome() != null) {
                output.h(serialDesc, 2, gz1.a, self.getIsHome());
            }
            if (output.o(serialDesc) || self.getTime() != null) {
                output.h(serialDesc, 3, a7a.a, self.getTime());
            }
            if (output.o(serialDesc) || self.getAddedTime() != null) {
                output.h(serialDesc, 4, a7a.a, self.getAddedTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 5, a7a.a, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 6, a7a.a, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 7, a7a.a, self.getPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 8, a7a.a, self.getTimeSeconds());
            }
            if (output.o(serialDesc) || self.getHomeScore() != null) {
                output.h(serialDesc, 9, a7a.a, self.getHomeScore());
            }
            if (!output.o(serialDesc) && self.getAwayScore() == null) {
                return;
            }
            output.h(serialDesc, 10, a7a.a, self.getAwayScore());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$UnknownIncident$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$UnknownIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$UnknownIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public UnknownIncident() {
            this((String) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownIncident(@NotNull String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
            super(null);
            str.getClass();
            this.incidentType = str;
            this.id = num;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            this.periodTimeSeconds = num6;
            this.timeSeconds = num7;
            this.homeScore = num8;
            this.awayScore = num9;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ UnknownIncident(java.lang.String r2, java.lang.Integer r3, java.lang.Boolean r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r1 = this;
                r14 = r13 & 1
                if (r14 == 0) goto L6
                java.lang.String r2 = "unknown"
            L6:
                r14 = r13 & 2
                r0 = 0
                if (r14 == 0) goto Lc
                r3 = r0
            Lc:
                r14 = r13 & 4
                if (r14 == 0) goto L11
                r4 = r0
            L11:
                r14 = r13 & 8
                if (r14 == 0) goto L16
                r5 = r0
            L16:
                r14 = r13 & 16
                if (r14 == 0) goto L1b
                r6 = r0
            L1b:
                r14 = r13 & 32
                if (r14 == 0) goto L20
                r7 = r0
            L20:
                r14 = r13 & 64
                if (r14 == 0) goto L25
                r8 = r0
            L25:
                r14 = r13 & 128(0x80, float:1.8E-43)
                if (r14 == 0) goto L2a
                r9 = r0
            L2a:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L2f
                r10 = r0
            L2f:
                r14 = r13 & 512(0x200, float:7.17E-43)
                if (r14 == 0) goto L34
                r11 = r0
            L34:
                r13 = r13 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L45
                r14 = r0
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L51
            L45:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L51:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sofascore.model.mvvm.model.Incident.UnknownIncident.<init>(java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b!\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002DEB\u009b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B¥\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010$\"\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b\u0007\u00103R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b4\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b5\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b<\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b=\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b>\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b?\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b@\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\bA\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\bB\u0010$R\u0011\u0010C\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bC\u0010;¨\u0006F"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident;", "Lcom/sofascore/model/mvvm/model/Incident;", "", "id", "", "incidentType", "", "isHome", "time", "addedTime", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "confirmed", "incidentClass", "reversedPeriodTime", "reversedPeriodTimeSeconds", "periodTimeSeconds", "timeSeconds", "homeScore", "awayScore", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getPlayerId", "()Ljava/lang/Integer;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getIncidentType", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTime", "getAddedTime", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "Z", "getConfirmed", "()Z", "getIncidentClass", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getPeriodTimeSeconds", "getTimeSeconds", "getHomeScore", "getAwayScore", "isDecisionInProgress", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VarDecisionIncident extends Incident {

        @NotNull
        public static final String CARD_UPGRADE = "cardUpgrade";

        @NotNull
        public static final String GOAL_AWARDED = "goalAwarded";

        @NotNull
        public static final String GOAL_NOT_AWARDED = "goalNotAwarded";

        @NotNull
        public static final String PENALTY_AWARDED = "penaltyAwarded";

        @NotNull
        public static final String PENALTY_NOT_AWARDED = "penaltyNotAwarded";

        @NotNull
        public static final String RED_CARD_GIVEN = "redCardGiven";

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer awayScore;
        private final boolean confirmed;

        @Nullable
        private final Integer homeScore;

        @Nullable
        private Integer id;

        @Nullable
        private final String incidentClass;

        @NotNull
        private final String incidentType;

        @Nullable
        private final Boolean isHome;

        @Nullable
        private final Integer periodTimeSeconds;

        @Nullable
        private final Player player;

        @Nullable
        private final Integer reversedPeriodTime;

        @Nullable
        private final Integer reversedPeriodTimeSeconds;

        @Nullable
        private final Integer time;

        @Nullable
        private final Integer timeSeconds;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String IN_PROGRESS_GOAL = "vip_for_goal";

        @NotNull
        public static final String IN_PROGRESS_PENALTY = "vip_for_penalty";

        @NotNull
        public static final String IN_PROGRESS_RED_CARD = "vip_for_red_card";

        @NotNull
        public static final String IN_PROGRESS_NO_GOAL = "vip_for_no_goal";

        @NotNull
        public static final String IN_PROGRESS_NO_PENALTY = "vip_for_no_penalty";

        @NotNull
        public static final String IN_PROGRESS_NO_RED_CARD = "vip_for_no_red_card";

        @NotNull
        public static final String IN_PROGRESS_UNKNOWN = "vip_for_unknown";

        @NotNull
        private static final Set<String> IN_PROGRESS_TYPES = ph0.a0(new String[]{IN_PROGRESS_GOAL, IN_PROGRESS_PENALTY, IN_PROGRESS_RED_CARD, IN_PROGRESS_NO_GOAL, IN_PROGRESS_NO_PENALTY, IN_PROGRESS_NO_RED_CARD, IN_PROGRESS_UNKNOWN});

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ VarDecisionIncident(int i, Integer num, String str, Boolean bool, Integer num2, Integer num3, Player player, boolean z, String str2, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
            super(r1);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (255 != (i & 255)) {
                oea.z(i, 255, Incident$VarDecisionIncident$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.player = player;
            this.confirmed = z;
            this.incidentClass = str2;
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                this.reversedPeriodTime = null;
            } else {
                this.reversedPeriodTime = num4;
            }
            if ((i & 512) == 0) {
                this.reversedPeriodTimeSeconds = null;
            } else {
                this.reversedPeriodTimeSeconds = num5;
            }
            if ((i & 1024) == 0) {
                this.periodTimeSeconds = null;
            } else {
                this.periodTimeSeconds = num6;
            }
            if ((i & a.o) == 0) {
                this.timeSeconds = null;
            } else {
                this.timeSeconds = num7;
            }
            if ((i & 4096) == 0) {
                this.homeScore = null;
            } else {
                this.homeScore = num8;
            }
            if ((i & 8192) == 0) {
                this.awayScore = null;
            } else {
                this.awayScore = num9;
            }
        }

        public static final /* synthetic */ void write$Self$model_release(VarDecisionIncident self, wf3 output, SerialDescriptor serialDesc) {
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.getId());
            output.y(serialDesc, 1, self.getIncidentType());
            output.h(serialDesc, 2, gz1.a, self.getIsHome());
            output.h(serialDesc, 3, a7aVar, self.getTime());
            output.h(serialDesc, 4, a7aVar, self.getAddedTime());
            output.h(serialDesc, 5, Player$$serializer.INSTANCE, self.player);
            output.x(serialDesc, 6, self.confirmed);
            output.h(serialDesc, 7, uhi.a, self.incidentClass);
            if (output.o(serialDesc) || self.getReversedPeriodTime() != null) {
                output.h(serialDesc, 8, a7aVar, self.getReversedPeriodTime());
            }
            if (output.o(serialDesc) || self.getReversedPeriodTimeSeconds() != null) {
                output.h(serialDesc, 9, a7aVar, self.getReversedPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getPeriodTimeSeconds() != null) {
                output.h(serialDesc, 10, a7aVar, self.getPeriodTimeSeconds());
            }
            if (output.o(serialDesc) || self.getTimeSeconds() != null) {
                output.h(serialDesc, 11, a7aVar, self.getTimeSeconds());
            }
            if (output.o(serialDesc) || self.getHomeScore() != null) {
                output.h(serialDesc, 12, a7aVar, self.getHomeScore());
            }
            if (!output.o(serialDesc) && self.getAwayScore() == null) {
                return;
            }
            output.h(serialDesc, 13, a7aVar, self.getAwayScore());
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!VarDecisionIncident.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            other.getClass();
            VarDecisionIncident varDecisionIncident = (VarDecisionIncident) other;
            return Intrinsics.c(this.player, varDecisionIncident.player) && this.confirmed == varDecisionIncident.confirmed && Intrinsics.c(this.incidentClass, varDecisionIncident.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAddedTime() {
            return this.addedTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getAwayScore() {
            return this.awayScore;
        }

        public final boolean getConfirmed() {
            return this.confirmed;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getHomeScore() {
            return this.homeScore;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getIncidentClass() {
            return this.incidentClass;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @NotNull
        public String getIncidentType() {
            return this.incidentType;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPeriodTimeSeconds() {
            return this.periodTimeSeconds;
        }

        @Nullable
        public final Player getPlayer() {
            return this.player;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getPlayerId() {
            Player player = this.player;
            if (player != null) {
                return Integer.valueOf(player.getId());
            }
            return null;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTime() {
            return this.reversedPeriodTime;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getReversedPeriodTimeSeconds() {
            return this.reversedPeriodTimeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTime() {
            return this.time;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        public Integer getTimeSeconds() {
            return this.timeSeconds;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Player player = this.player;
            int e = dmi.e((hashCode + (player != null ? player.hashCode() : 0)) * 31, 31, this.confirmed);
            String str = this.incidentClass;
            return e + (str != null ? str.hashCode() : 0);
        }

        public final boolean isDecisionInProgress() {
            return CollectionsKt.R(IN_PROGRESS_TYPES, this.incidentClass);
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        @Nullable
        /* renamed from: isHome, reason: from getter */
        public Boolean getIsHome() {
            return this.isHome;
        }

        @Override // com.sofascore.model.mvvm.model.Incident
        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident$Companion;", "", "<init>", "()V", "GOAL_AWARDED", "", "GOAL_NOT_AWARDED", "PENALTY_AWARDED", "PENALTY_NOT_AWARDED", "RED_CARD_GIVEN", "CARD_UPGRADE", "IN_PROGRESS_GOAL", "IN_PROGRESS_PENALTY", "IN_PROGRESS_RED_CARD", "IN_PROGRESS_NO_GOAL", "IN_PROGRESS_NO_PENALTY", "IN_PROGRESS_NO_RED_CARD", "IN_PROGRESS_UNKNOWN", "IN_PROGRESS_TYPES", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Incident$VarDecisionIncident$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VarDecisionIncident(@Nullable Integer num, @NotNull String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Player player, boolean z, @Nullable String str2, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
            super(null);
            str.getClass();
            this.id = num;
            this.incidentType = str;
            this.isHome = bool;
            this.time = num2;
            this.addedTime = num3;
            this.player = player;
            this.confirmed = z;
            this.incidentClass = str2;
            this.reversedPeriodTime = num4;
            this.reversedPeriodTimeSeconds = num5;
            this.periodTimeSeconds = num6;
            this.timeSeconds = num7;
            this.homeScore = num8;
            this.awayScore = num9;
        }

        public /* synthetic */ VarDecisionIncident(Integer num, String str, Boolean bool, Integer num2, Integer num3, Player player, boolean z, String str2, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, bool, num2, num3, player, z, str2, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num4, (i & 512) != 0 ? null : num5, (i & 1024) != 0 ? null : num6, (i & a.o) != 0 ? null : num7, (i & 4096) != 0 ? null : num8, (i & 8192) != 0 ? null : num9);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Incident$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Incident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return IncidentSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private Incident() {
    }
}
