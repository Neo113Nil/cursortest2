package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vak;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentWinner;", "", "", "id", "year", "Lcom/sofascore/model/mvvm/model/Team;", "team", "<init>", "(IILcom/sofascore/model/mvvm/model/Team;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/mvvm/model/Team;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentWinner;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "copy", "(IILcom/sofascore/model/mvvm/model/Team;)Lcom/sofascore/model/newNetwork/UniqueTournamentWinner;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getYear", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentWinner {
    private final int id;

    @NotNull
    private final Team team;
    private final int year;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new vak(19))};

    public /* synthetic */ UniqueTournamentWinner(int i, int i2, int i3, Team team, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, UniqueTournamentWinner$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.year = i3;
        this.team = team;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ UniqueTournamentWinner copy$default(UniqueTournamentWinner uniqueTournamentWinner, int i, int i2, Team team, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = uniqueTournamentWinner.id;
        }
        if ((i3 & 2) != 0) {
            i2 = uniqueTournamentWinner.year;
        }
        if ((i3 & 4) != 0) {
            team = uniqueTournamentWinner.team;
        }
        return uniqueTournamentWinner.copy(i, i2, team);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentWinner self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.u(1, self.year, serialDesc);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.team);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final UniqueTournamentWinner copy(int id, int year, @NotNull Team team) {
        team.getClass();
        return new UniqueTournamentWinner(id, year, team);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentWinner)) {
            return false;
        }
        UniqueTournamentWinner uniqueTournamentWinner = (UniqueTournamentWinner) other;
        return this.id == uniqueTournamentWinner.id && this.year == uniqueTournamentWinner.year && Intrinsics.c(this.team, uniqueTournamentWinner.team);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.team.hashCode() + wv8.a(this.year, Integer.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.year;
        Team team = this.team;
        StringBuilder s = lnb.s(i, i2, "UniqueTournamentWinner(id=", ", year=", ", team=");
        s.append(team);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentWinner$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentWinner;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentWinner$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentWinner(int i, int i2, @NotNull Team team) {
        team.getClass();
        this.id = i;
        this.year = i2;
        this.team = team;
    }
}
