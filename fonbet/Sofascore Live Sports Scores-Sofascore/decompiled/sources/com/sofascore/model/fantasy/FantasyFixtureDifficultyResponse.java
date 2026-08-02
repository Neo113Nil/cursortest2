package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.au6;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\u00070\u0007¢\u0006\u0004\b\u000b\u0010\fBc\b\u0010\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\u0007\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ.\u0010\u001d\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\u00070\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022&\b\u0002\u0010\n\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\u00070\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001bR5\u0010\n\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\u00070\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyFixtureDifficultyResponse;", "", "", "Lcom/sofascore/model/fantasy/BasicTeam;", "teams", "Lcom/sofascore/model/fantasy/FantasyRound;", "rounds", "", "", "Lcom/sofascore/model/fantasy/FantasyFixtureFDRView;", "fixtureDifficulties", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyFixtureDifficultyResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lcom/sofascore/model/fantasy/FantasyFixtureDifficultyResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTeams", "getRounds", "Ljava/util/Map;", "getFixtureDifficulties", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyFixtureDifficultyResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<Integer, Map<Integer, List<FantasyFixtureFDRView>>> fixtureDifficulties;

    @NotNull
    private final List<FantasyRound> rounds;

    @NotNull
    private final List<BasicTeam> teams;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new au6(13)), ypa.a(ysaVar, new au6(14)), ypa.a(ysaVar, new au6(15))};
    }

    public /* synthetic */ FantasyFixtureDifficultyResponse(int i, List list, List list2, Map map, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyFixtureDifficultyResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.teams = list;
        this.rounds = list2;
        this.fixtureDifficulties = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(BasicTeam$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(FantasyRound$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        a7a a7aVar = a7a.a;
        return new q79(a7aVar, new q79(a7aVar, new xg0(FantasyFixtureFDRView$$serializer.INSTANCE, 0), 1), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyFixtureDifficultyResponse copy$default(FantasyFixtureDifficultyResponse fantasyFixtureDifficultyResponse, List list, List list2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasyFixtureDifficultyResponse.teams;
        }
        if ((i & 2) != 0) {
            list2 = fantasyFixtureDifficultyResponse.rounds;
        }
        if ((i & 4) != 0) {
            map = fantasyFixtureDifficultyResponse.fixtureDifficulties;
        }
        return fantasyFixtureDifficultyResponse.copy(list, list2, map);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyFixtureDifficultyResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.teams);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.rounds);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.fixtureDifficulties);
    }

    @NotNull
    public final List<BasicTeam> component1() {
        return this.teams;
    }

    @NotNull
    public final List<FantasyRound> component2() {
        return this.rounds;
    }

    @NotNull
    public final Map<Integer, Map<Integer, List<FantasyFixtureFDRView>>> component3() {
        return this.fixtureDifficulties;
    }

    @NotNull
    public final FantasyFixtureDifficultyResponse copy(@NotNull List<BasicTeam> teams, @NotNull List<FantasyRound> rounds, @NotNull Map<Integer, ? extends Map<Integer, ? extends List<FantasyFixtureFDRView>>> fixtureDifficulties) {
        teams.getClass();
        rounds.getClass();
        fixtureDifficulties.getClass();
        return new FantasyFixtureDifficultyResponse(teams, rounds, fixtureDifficulties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyFixtureDifficultyResponse)) {
            return false;
        }
        FantasyFixtureDifficultyResponse fantasyFixtureDifficultyResponse = (FantasyFixtureDifficultyResponse) other;
        return Intrinsics.c(this.teams, fantasyFixtureDifficultyResponse.teams) && Intrinsics.c(this.rounds, fantasyFixtureDifficultyResponse.rounds) && Intrinsics.c(this.fixtureDifficulties, fantasyFixtureDifficultyResponse.fixtureDifficulties);
    }

    @NotNull
    public final Map<Integer, Map<Integer, List<FantasyFixtureFDRView>>> getFixtureDifficulties() {
        return this.fixtureDifficulties;
    }

    @NotNull
    public final List<FantasyRound> getRounds() {
        return this.rounds;
    }

    @NotNull
    public final List<BasicTeam> getTeams() {
        return this.teams;
    }

    public int hashCode() {
        return this.fixtureDifficulties.hashCode() + dmi.d(this.teams.hashCode() * 31, 31, this.rounds);
    }

    @NotNull
    public String toString() {
        List<BasicTeam> list = this.teams;
        List<FantasyRound> list2 = this.rounds;
        Map<Integer, Map<Integer, List<FantasyFixtureFDRView>>> map = this.fixtureDifficulties;
        StringBuilder s = fc6.s("FantasyFixtureDifficultyResponse(teams=", ", rounds=", ", fixtureDifficulties=", list, list2);
        s.append(map);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyFixtureDifficultyResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyFixtureDifficultyResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyFixtureDifficultyResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FantasyFixtureDifficultyResponse(@NotNull List<BasicTeam> list, @NotNull List<FantasyRound> list2, @NotNull Map<Integer, ? extends Map<Integer, ? extends List<FantasyFixtureFDRView>>> map) {
        list.getClass();
        list2.getClass();
        map.getClass();
        this.teams = list;
        this.rounds = list2;
        this.fixtureDifficulties = map;
    }
}
