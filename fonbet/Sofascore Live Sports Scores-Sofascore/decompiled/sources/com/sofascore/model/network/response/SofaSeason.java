package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.b7h;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBg\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0082\u0001\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b@\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bE\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010*¨\u0006P"}, d2 = {"Lcom/sofascore/model/network/response/SofaSeason;", "", "", "", "monthStats", "Lcom/sofascore/model/mvvm/model/Sport;", "sports", "Lcom/sofascore/model/network/response/SeasonEventData;", "eventsData", "Lcom/sofascore/model/network/response/SeasonPlayersData;", "playersData", "Lcom/sofascore/model/mvvm/model/Team;", "teams", "Lcom/sofascore/model/network/response/SkillRadar;", "skillRadar", "Lcom/sofascore/model/network/response/SeasonTorneoData;", "torneoView", "", "predictorVotesCount", "", "contributorTopOnePercent", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/network/response/SeasonEventData;Lcom/sofascore/model/network/response/SeasonPlayersData;Ljava/util/List;Lcom/sofascore/model/network/response/SkillRadar;Lcom/sofascore/model/network/response/SeasonTorneoData;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lcom/sofascore/model/network/response/SeasonEventData;Lcom/sofascore/model/network/response/SeasonPlayersData;Ljava/util/List;Lcom/sofascore/model/network/response/SkillRadar;Lcom/sofascore/model/network/response/SeasonTorneoData;Ljava/lang/Integer;Ljava/lang/Boolean;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/sofascore/model/network/response/SeasonEventData;", "component4", "()Lcom/sofascore/model/network/response/SeasonPlayersData;", "component5", "component6", "()Lcom/sofascore/model/network/response/SkillRadar;", "component7", "()Lcom/sofascore/model/network/response/SeasonTorneoData;", "component8", "()Ljava/lang/Integer;", "component9", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/network/response/SeasonEventData;Lcom/sofascore/model/network/response/SeasonPlayersData;Ljava/util/List;Lcom/sofascore/model/network/response/SkillRadar;Lcom/sofascore/model/network/response/SeasonTorneoData;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/sofascore/model/network/response/SofaSeason;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/SofaSeason;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getMonthStats", "getSports", "Lcom/sofascore/model/network/response/SeasonEventData;", "getEventsData", "Lcom/sofascore/model/network/response/SeasonPlayersData;", "getPlayersData", "getTeams", "Lcom/sofascore/model/network/response/SkillRadar;", "getSkillRadar", "Lcom/sofascore/model/network/response/SeasonTorneoData;", "getTorneoView", "Ljava/lang/Integer;", "getPredictorVotesCount", "Ljava/lang/Boolean;", "getContributorTopOnePercent", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SofaSeason {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean contributorTopOnePercent;

    @NotNull
    private final SeasonEventData eventsData;

    @NotNull
    private final List<Double> monthStats;

    @NotNull
    private final SeasonPlayersData playersData;

    @Nullable
    private final Integer predictorVotesCount;

    @NotNull
    private final SkillRadar skillRadar;

    @NotNull
    private final List<Sport> sports;

    @NotNull
    private final List<Team> teams;

    @Nullable
    private final SeasonTorneoData torneoView;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new b7h(23)), ypa.a(ysaVar, new b7h(24)), null, null, ypa.a(ysaVar, new b7h(25)), null, null, null, null};
    }

    public SofaSeason(@NotNull List<Double> list, @NotNull List<Sport> list2, @NotNull SeasonEventData seasonEventData, @NotNull SeasonPlayersData seasonPlayersData, @NotNull List<Team> list3, @NotNull SkillRadar skillRadar, @Nullable SeasonTorneoData seasonTorneoData, @Nullable Integer num, @Nullable Boolean bool) {
        list.getClass();
        list2.getClass();
        seasonEventData.getClass();
        seasonPlayersData.getClass();
        list3.getClass();
        skillRadar.getClass();
        this.monthStats = list;
        this.sports = list2;
        this.eventsData = seasonEventData;
        this.playersData = seasonPlayersData;
        this.teams = list3;
        this.skillRadar = skillRadar;
        this.torneoView = seasonTorneoData;
        this.predictorVotesCount = num;
        this.contributorTopOnePercent = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(h75.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Sport$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    public static /* synthetic */ SofaSeason copy$default(SofaSeason sofaSeason, List list, List list2, SeasonEventData seasonEventData, SeasonPlayersData seasonPlayersData, List list3, SkillRadar skillRadar, SeasonTorneoData seasonTorneoData, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sofaSeason.monthStats;
        }
        if ((i & 2) != 0) {
            list2 = sofaSeason.sports;
        }
        if ((i & 4) != 0) {
            seasonEventData = sofaSeason.eventsData;
        }
        if ((i & 8) != 0) {
            seasonPlayersData = sofaSeason.playersData;
        }
        if ((i & 16) != 0) {
            list3 = sofaSeason.teams;
        }
        if ((i & 32) != 0) {
            skillRadar = sofaSeason.skillRadar;
        }
        if ((i & 64) != 0) {
            seasonTorneoData = sofaSeason.torneoView;
        }
        if ((i & 128) != 0) {
            num = sofaSeason.predictorVotesCount;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            bool = sofaSeason.contributorTopOnePercent;
        }
        Integer num2 = num;
        Boolean bool2 = bool;
        SkillRadar skillRadar2 = skillRadar;
        SeasonTorneoData seasonTorneoData2 = seasonTorneoData;
        List list4 = list3;
        SeasonEventData seasonEventData2 = seasonEventData;
        return sofaSeason.copy(list, list2, seasonEventData2, seasonPlayersData, list4, skillRadar2, seasonTorneoData2, num2, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(SofaSeason self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.monthStats);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.sports);
        output.f(serialDesc, 2, SeasonEventData$$serializer.INSTANCE, self.eventsData);
        output.f(serialDesc, 3, SeasonPlayersData$$serializer.INSTANCE, self.playersData);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.teams);
        output.f(serialDesc, 5, SkillRadar$$serializer.INSTANCE, self.skillRadar);
        output.h(serialDesc, 6, SeasonTorneoData$$serializer.INSTANCE, self.torneoView);
        output.h(serialDesc, 7, a7a.a, self.predictorVotesCount);
        output.h(serialDesc, 8, gz1.a, self.contributorTopOnePercent);
    }

    @NotNull
    public final List<Double> component1() {
        return this.monthStats;
    }

    @NotNull
    public final List<Sport> component2() {
        return this.sports;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SeasonEventData getEventsData() {
        return this.eventsData;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SeasonPlayersData getPlayersData() {
        return this.playersData;
    }

    @NotNull
    public final List<Team> component5() {
        return this.teams;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final SkillRadar getSkillRadar() {
        return this.skillRadar;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final SeasonTorneoData getTorneoView() {
        return this.torneoView;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getPredictorVotesCount() {
        return this.predictorVotesCount;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getContributorTopOnePercent() {
        return this.contributorTopOnePercent;
    }

    @NotNull
    public final SofaSeason copy(@NotNull List<Double> monthStats, @NotNull List<Sport> sports, @NotNull SeasonEventData eventsData, @NotNull SeasonPlayersData playersData, @NotNull List<Team> teams, @NotNull SkillRadar skillRadar, @Nullable SeasonTorneoData torneoView, @Nullable Integer predictorVotesCount, @Nullable Boolean contributorTopOnePercent) {
        monthStats.getClass();
        sports.getClass();
        eventsData.getClass();
        playersData.getClass();
        teams.getClass();
        skillRadar.getClass();
        return new SofaSeason(monthStats, sports, eventsData, playersData, teams, skillRadar, torneoView, predictorVotesCount, contributorTopOnePercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SofaSeason)) {
            return false;
        }
        SofaSeason sofaSeason = (SofaSeason) other;
        return Intrinsics.c(this.monthStats, sofaSeason.monthStats) && Intrinsics.c(this.sports, sofaSeason.sports) && Intrinsics.c(this.eventsData, sofaSeason.eventsData) && Intrinsics.c(this.playersData, sofaSeason.playersData) && Intrinsics.c(this.teams, sofaSeason.teams) && Intrinsics.c(this.skillRadar, sofaSeason.skillRadar) && Intrinsics.c(this.torneoView, sofaSeason.torneoView) && Intrinsics.c(this.predictorVotesCount, sofaSeason.predictorVotesCount) && Intrinsics.c(this.contributorTopOnePercent, sofaSeason.contributorTopOnePercent);
    }

    @Nullable
    public final Boolean getContributorTopOnePercent() {
        return this.contributorTopOnePercent;
    }

    @NotNull
    public final SeasonEventData getEventsData() {
        return this.eventsData;
    }

    @NotNull
    public final List<Double> getMonthStats() {
        return this.monthStats;
    }

    @NotNull
    public final SeasonPlayersData getPlayersData() {
        return this.playersData;
    }

    @Nullable
    public final Integer getPredictorVotesCount() {
        return this.predictorVotesCount;
    }

    @NotNull
    public final SkillRadar getSkillRadar() {
        return this.skillRadar;
    }

    @NotNull
    public final List<Sport> getSports() {
        return this.sports;
    }

    @NotNull
    public final List<Team> getTeams() {
        return this.teams;
    }

    @Nullable
    public final SeasonTorneoData getTorneoView() {
        return this.torneoView;
    }

    public int hashCode() {
        int hashCode = (this.skillRadar.hashCode() + dmi.d((this.playersData.hashCode() + ((this.eventsData.hashCode() + dmi.d(this.monthStats.hashCode() * 31, 31, this.sports)) * 31)) * 31, 31, this.teams)) * 31;
        SeasonTorneoData seasonTorneoData = this.torneoView;
        int hashCode2 = (hashCode + (seasonTorneoData == null ? 0 : seasonTorneoData.hashCode())) * 31;
        Integer num = this.predictorVotesCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.contributorTopOnePercent;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Double> list = this.monthStats;
        List<Sport> list2 = this.sports;
        SeasonEventData seasonEventData = this.eventsData;
        SeasonPlayersData seasonPlayersData = this.playersData;
        List<Team> list3 = this.teams;
        SkillRadar skillRadar = this.skillRadar;
        SeasonTorneoData seasonTorneoData = this.torneoView;
        Integer num = this.predictorVotesCount;
        Boolean bool = this.contributorTopOnePercent;
        StringBuilder s = fc6.s("SofaSeason(monthStats=", ", sports=", ", eventsData=", list, list2);
        s.append(seasonEventData);
        s.append(", playersData=");
        s.append(seasonPlayersData);
        s.append(", teams=");
        s.append(list3);
        s.append(", skillRadar=");
        s.append(skillRadar);
        s.append(", torneoView=");
        s.append(seasonTorneoData);
        s.append(", predictorVotesCount=");
        s.append(num);
        s.append(", contributorTopOnePercent=");
        s.append(bool);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/SofaSeason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/SofaSeason;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SofaSeason$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SofaSeason(int i, List list, List list2, SeasonEventData seasonEventData, SeasonPlayersData seasonPlayersData, List list3, SkillRadar skillRadar, SeasonTorneoData seasonTorneoData, Integer num, Boolean bool, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, SofaSeason$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.monthStats = list;
        this.sports = list2;
        this.eventsData = seasonEventData;
        this.playersData = seasonPlayersData;
        this.teams = list3;
        this.skillRadar = skillRadar;
        this.torneoView = seasonTorneoData;
        this.predictorVotesCount = num;
        this.contributorTopOnePercent = bool;
    }
}
