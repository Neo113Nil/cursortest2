package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.egi;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamAchievementsResponse;", "", "", "totalTrophies", "", "Lcom/sofascore/model/newNetwork/UniqueTournamentAchievements;", "achievements", "Lcom/sofascore/model/mvvm/model/Team;", "team", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Team;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Team;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamAchievementsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "copy", "(Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Team;)Lcom/sofascore/model/newNetwork/TeamAchievementsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getTotalTrophies", "Ljava/util/List;", "getAchievements", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamAchievementsResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<UniqueTournamentAchievements> achievements;

    @Nullable
    private final Team team;

    @Nullable
    private final Integer totalTrophies;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new egi(19)), ypa.a(ysaVar, new egi(20))};
    }

    public /* synthetic */ TeamAchievementsResponse(int i, Integer num, List list, Team team, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TeamAchievementsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.totalTrophies = num;
        this.achievements = list;
        this.team = team;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(UniqueTournamentAchievements$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamAchievementsResponse copy$default(TeamAchievementsResponse teamAchievementsResponse, Integer num, List list, Team team, int i, Object obj) {
        if ((i & 1) != 0) {
            num = teamAchievementsResponse.totalTrophies;
        }
        if ((i & 2) != 0) {
            list = teamAchievementsResponse.achievements;
        }
        if ((i & 4) != 0) {
            team = teamAchievementsResponse.team;
        }
        return teamAchievementsResponse.copy(num, list, team);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamAchievementsResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, a7a.a, self.totalTrophies);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.achievements);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.team);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getTotalTrophies() {
        return this.totalTrophies;
    }

    @Nullable
    public final List<UniqueTournamentAchievements> component2() {
        return this.achievements;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final TeamAchievementsResponse copy(@Nullable Integer totalTrophies, @Nullable List<UniqueTournamentAchievements> achievements, @Nullable Team team) {
        return new TeamAchievementsResponse(totalTrophies, achievements, team);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamAchievementsResponse)) {
            return false;
        }
        TeamAchievementsResponse teamAchievementsResponse = (TeamAchievementsResponse) other;
        return Intrinsics.c(this.totalTrophies, teamAchievementsResponse.totalTrophies) && Intrinsics.c(this.achievements, teamAchievementsResponse.achievements) && Intrinsics.c(this.team, teamAchievementsResponse.team);
    }

    @Nullable
    public final List<UniqueTournamentAchievements> getAchievements() {
        return this.achievements;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final Integer getTotalTrophies() {
        return this.totalTrophies;
    }

    public int hashCode() {
        Integer num = this.totalTrophies;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UniqueTournamentAchievements> list = this.achievements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Team team = this.team;
        return hashCode2 + (team != null ? team.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TeamAchievementsResponse(totalTrophies=" + this.totalTrophies + ", achievements=" + this.achievements + ", team=" + this.team + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamAchievementsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamAchievementsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamAchievementsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamAchievementsResponse(@Nullable Integer num, @Nullable List<UniqueTournamentAchievements> list, @Nullable Team team) {
        this.totalTrophies = num;
        this.achievements = list;
        this.team = team;
    }
}
