package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.u9i;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002-,B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/sofascore/model/mvvm/model/StandingsFormEvent;", "Ljava/io/Serializable;", "", "winnerCode", "Lcom/sofascore/model/mvvm/model/Team;", "homeTeam", "awayTeam", "", "startTimestamp", "Lcom/sofascore/model/mvvm/model/Status;", "status", "Lcom/sofascore/model/mvvm/model/Tournament;", "tournament", "<init>", "(Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;JLcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Tournament;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;JLcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Tournament;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StandingsFormEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getWinnerCode", "()Ljava/lang/Integer;", "Lcom/sofascore/model/mvvm/model/Team;", "getHomeTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "getAwayTeam", "J", "getStartTimestamp", "()J", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "()Lcom/sofascore/model/mvvm/model/Status;", "Lcom/sofascore/model/mvvm/model/Tournament;", "getTournament", "()Lcom/sofascore/model/mvvm/model/Tournament;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StandingsFormEvent implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Team awayTeam;

    @NotNull
    private final Team homeTeam;
    private final long startTimestamp;

    @NotNull
    private final Status status;

    @NotNull
    private final Tournament tournament;

    @Nullable
    private final Integer winnerCode;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new u9i(6)), ypa.a(ysaVar, new u9i(7)), null, null, null};
    }

    public /* synthetic */ StandingsFormEvent(int i, Integer num, Team team, Team team2, long j, Status status, Tournament tournament, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, StandingsFormEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.winnerCode = num;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.startTimestamp = j;
        this.status = status;
        this.tournament = tournament;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self$model_release(StandingsFormEvent self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, a7a.a, self.winnerCode);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.homeTeam);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.awayTeam);
        output.E(serialDesc, 3, self.startTimestamp);
        output.f(serialDesc, 4, Status$$serializer.INSTANCE, self.status);
        output.f(serialDesc, 5, Tournament$$serializer.INSTANCE, self.tournament);
    }

    @NotNull
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final Tournament getTournament() {
        return this.tournament;
    }

    @Nullable
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StandingsFormEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StandingsFormEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StandingsFormEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StandingsFormEvent(@Nullable Integer num, @NotNull Team team, @NotNull Team team2, long j, @NotNull Status status, @NotNull Tournament tournament) {
        team.getClass();
        team2.getClass();
        status.getClass();
        tournament.getClass();
        this.winnerCode = num;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.startTimestamp = j;
        this.status = status;
        this.tournament = tournament;
    }
}
