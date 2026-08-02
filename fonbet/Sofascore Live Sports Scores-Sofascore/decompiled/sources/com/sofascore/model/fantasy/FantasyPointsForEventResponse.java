package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.c88;
import defpackage.dmi;
import defpackage.joa;
import defpackage.l98;
import defpackage.m97;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&JZ\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010 R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010&¨\u0006;"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPointsForEventResponse;", "", "", "competitionId", "", "eventStatusType", "", "", "playerScores", "", "Lcom/sofascore/model/fantasy/FantasyPlayerEventStatistics;", "playerStatistics", "Lcom/sofascore/model/fantasy/FantasyLeagueConfig;", "config", "<init>", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/sofascore/model/fantasy/FantasyLeagueConfig;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/sofascore/model/fantasy/FantasyLeagueConfig;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPointsForEventResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "component5", "()Lcom/sofascore/model/fantasy/FantasyLeagueConfig;", "copy", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/sofascore/model/fantasy/FantasyLeagueConfig;)Lcom/sofascore/model/fantasy/FantasyPointsForEventResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCompetitionId", "Ljava/lang/String;", "getEventStatusType", "Ljava/util/Map;", "getPlayerScores", "Ljava/util/List;", "getPlayerStatistics", "Lcom/sofascore/model/fantasy/FantasyLeagueConfig;", "getConfig", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPointsForEventResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int competitionId;

    @Nullable
    private final FantasyLeagueConfig config;

    @NotNull
    private final String eventStatusType;

    @NotNull
    private final Map<Integer, Float> playerScores;

    @Nullable
    private final List<FantasyPlayerEventStatistics> playerStatistics;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new m97(26)), ypa.a(ysaVar, new m97(27)), null};
    }

    public /* synthetic */ FantasyPointsForEventResponse(int i, int i2, String str, Map map, List list, FantasyLeagueConfig fantasyLeagueConfig, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, FantasyPointsForEventResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.competitionId = i2;
        this.eventStatusType = str;
        this.playerScores = map;
        this.playerStatistics = list;
        this.config = fantasyLeagueConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new q79(a7a.a, l98.W(c88.a), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(FantasyPlayerEventStatistics$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ FantasyPointsForEventResponse copy$default(FantasyPointsForEventResponse fantasyPointsForEventResponse, int i, String str, Map map, List list, FantasyLeagueConfig fantasyLeagueConfig, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyPointsForEventResponse.competitionId;
        }
        if ((i2 & 2) != 0) {
            str = fantasyPointsForEventResponse.eventStatusType;
        }
        if ((i2 & 4) != 0) {
            map = fantasyPointsForEventResponse.playerScores;
        }
        if ((i2 & 8) != 0) {
            list = fantasyPointsForEventResponse.playerStatistics;
        }
        if ((i2 & 16) != 0) {
            fantasyLeagueConfig = fantasyPointsForEventResponse.config;
        }
        FantasyLeagueConfig fantasyLeagueConfig2 = fantasyLeagueConfig;
        Map map2 = map;
        return fantasyPointsForEventResponse.copy(i, str, map2, list, fantasyLeagueConfig2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPointsForEventResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.competitionId, serialDesc);
        output.y(serialDesc, 1, self.eventStatusType);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.playerScores);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.playerStatistics);
        output.h(serialDesc, 4, FantasyLeagueConfig$$serializer.INSTANCE, self.config);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCompetitionId() {
        return this.competitionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEventStatusType() {
        return this.eventStatusType;
    }

    @NotNull
    public final Map<Integer, Float> component3() {
        return this.playerScores;
    }

    @Nullable
    public final List<FantasyPlayerEventStatistics> component4() {
        return this.playerStatistics;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final FantasyLeagueConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final FantasyPointsForEventResponse copy(int competitionId, @NotNull String eventStatusType, @NotNull Map<Integer, Float> playerScores, @Nullable List<FantasyPlayerEventStatistics> playerStatistics, @Nullable FantasyLeagueConfig config) {
        eventStatusType.getClass();
        playerScores.getClass();
        return new FantasyPointsForEventResponse(competitionId, eventStatusType, playerScores, playerStatistics, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPointsForEventResponse)) {
            return false;
        }
        FantasyPointsForEventResponse fantasyPointsForEventResponse = (FantasyPointsForEventResponse) other;
        return this.competitionId == fantasyPointsForEventResponse.competitionId && Intrinsics.c(this.eventStatusType, fantasyPointsForEventResponse.eventStatusType) && Intrinsics.c(this.playerScores, fantasyPointsForEventResponse.playerScores) && Intrinsics.c(this.playerStatistics, fantasyPointsForEventResponse.playerStatistics) && Intrinsics.c(this.config, fantasyPointsForEventResponse.config);
    }

    public final int getCompetitionId() {
        return this.competitionId;
    }

    @Nullable
    public final FantasyLeagueConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final String getEventStatusType() {
        return this.eventStatusType;
    }

    @NotNull
    public final Map<Integer, Float> getPlayerScores() {
        return this.playerScores;
    }

    @Nullable
    public final List<FantasyPlayerEventStatistics> getPlayerStatistics() {
        return this.playerStatistics;
    }

    public int hashCode() {
        int g = dmi.g(this.playerScores, dmi.c(Integer.hashCode(this.competitionId) * 31, 31, this.eventStatusType), 31);
        List<FantasyPlayerEventStatistics> list = this.playerStatistics;
        int hashCode = (g + (list == null ? 0 : list.hashCode())) * 31;
        FantasyLeagueConfig fantasyLeagueConfig = this.config;
        return hashCode + (fantasyLeagueConfig != null ? fantasyLeagueConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.competitionId;
        String str = this.eventStatusType;
        Map<Integer, Float> map = this.playerScores;
        List<FantasyPlayerEventStatistics> list = this.playerStatistics;
        FantasyLeagueConfig fantasyLeagueConfig = this.config;
        StringBuilder t = dmi.t(i, "FantasyPointsForEventResponse(competitionId=", ", eventStatusType=", str, ", playerScores=");
        t.append(map);
        t.append(", playerStatistics=");
        t.append(list);
        t.append(", config=");
        t.append(fantasyLeagueConfig);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPointsForEventResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPointsForEventResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPointsForEventResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPointsForEventResponse(int i, @NotNull String str, @NotNull Map<Integer, Float> map, @Nullable List<FantasyPlayerEventStatistics> list, @Nullable FantasyLeagueConfig fantasyLeagueConfig) {
        str.getClass();
        map.getClass();
        this.competitionId = i;
        this.eventStatusType = str;
        this.playerScores = map;
        this.playerStatistics = list;
        this.config = fantasyLeagueConfig;
    }
}
