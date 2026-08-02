package com.sofascore.model.newNetwork;

import defpackage.dmi;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamUniqueTournament;", "Ljava/io/Serializable;", "", "id", "", "name", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "", "winner", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamUniqueTournament;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;Z)Lcom/sofascore/model/newNetwork/TeamUniqueTournament;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getRound", "Z", "getWinner", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamUniqueTournament implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int id;

    @NotNull
    private final String name;

    @Nullable
    private final String round;
    private final boolean winner;

    public /* synthetic */ TeamUniqueTournament(int i, int i2, String str, String str2, boolean z, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, TeamUniqueTournament$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.round = str2;
        this.winner = z;
    }

    public static /* synthetic */ TeamUniqueTournament copy$default(TeamUniqueTournament teamUniqueTournament, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teamUniqueTournament.id;
        }
        if ((i2 & 2) != 0) {
            str = teamUniqueTournament.name;
        }
        if ((i2 & 4) != 0) {
            str2 = teamUniqueTournament.round;
        }
        if ((i2 & 8) != 0) {
            z = teamUniqueTournament.winner;
        }
        return teamUniqueTournament.copy(i, str, str2, z);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamUniqueTournament self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.h(serialDesc, 2, uhi.a, self.round);
        output.x(serialDesc, 3, self.winner);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRound() {
        return this.round;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getWinner() {
        return this.winner;
    }

    @NotNull
    public final TeamUniqueTournament copy(int id, @NotNull String name, @Nullable String round, boolean winner) {
        name.getClass();
        return new TeamUniqueTournament(id, name, round, winner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamUniqueTournament)) {
            return false;
        }
        TeamUniqueTournament teamUniqueTournament = (TeamUniqueTournament) other;
        return this.id == teamUniqueTournament.id && Intrinsics.c(this.name, teamUniqueTournament.name) && Intrinsics.c(this.round, teamUniqueTournament.round) && this.winner == teamUniqueTournament.winner;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRound() {
        return this.round;
    }

    public final boolean getWinner() {
        return this.winner;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.round;
        return Boolean.hashCode(this.winner) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.round;
        boolean z = this.winner;
        StringBuilder t = dmi.t(i, "TeamUniqueTournament(id=", ", name=", str, ", round=");
        t.append(str2);
        t.append(", winner=");
        t.append(z);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamUniqueTournament$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamUniqueTournament;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamUniqueTournament$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamUniqueTournament(int i, @NotNull String str, @Nullable String str2, boolean z) {
        str.getClass();
        this.id = i;
        this.name = str;
        this.round = str2;
        this.winner = z;
    }
}
