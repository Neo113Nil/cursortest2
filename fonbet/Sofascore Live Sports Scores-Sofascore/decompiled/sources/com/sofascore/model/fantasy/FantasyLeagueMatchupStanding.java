package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB=\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010\u0019¨\u0006."}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;", "", "", "rank", "wins", "draws", "losses", "<init>", "(Ljava/lang/Integer;III)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/Integer;III)Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getRank", "I", "getWins", "getDraws", "getLosses", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeagueMatchupStanding {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int draws;
    private final int losses;

    @Nullable
    private final Integer rank;
    private final int wins;

    public /* synthetic */ FantasyLeagueMatchupStanding(int i, Integer num, int i2, int i3, int i4, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FantasyLeagueMatchupStanding$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rank = num;
        this.wins = i2;
        this.draws = i3;
        this.losses = i4;
    }

    public static /* synthetic */ FantasyLeagueMatchupStanding copy$default(FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding, Integer num, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = fantasyLeagueMatchupStanding.rank;
        }
        if ((i4 & 2) != 0) {
            i = fantasyLeagueMatchupStanding.wins;
        }
        if ((i4 & 4) != 0) {
            i2 = fantasyLeagueMatchupStanding.draws;
        }
        if ((i4 & 8) != 0) {
            i3 = fantasyLeagueMatchupStanding.losses;
        }
        return fantasyLeagueMatchupStanding.copy(num, i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeagueMatchupStanding self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, a7a.a, self.rank);
        output.u(1, self.wins, serialDesc);
        output.u(2, self.draws, serialDesc);
        output.u(3, self.losses, serialDesc);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWins() {
        return this.wins;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDraws() {
        return this.draws;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLosses() {
        return this.losses;
    }

    @NotNull
    public final FantasyLeagueMatchupStanding copy(@Nullable Integer rank, int wins, int draws, int losses) {
        return new FantasyLeagueMatchupStanding(rank, wins, draws, losses);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeagueMatchupStanding)) {
            return false;
        }
        FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding = (FantasyLeagueMatchupStanding) other;
        return Intrinsics.c(this.rank, fantasyLeagueMatchupStanding.rank) && this.wins == fantasyLeagueMatchupStanding.wins && this.draws == fantasyLeagueMatchupStanding.draws && this.losses == fantasyLeagueMatchupStanding.losses;
    }

    public final int getDraws() {
        return this.draws;
    }

    public final int getLosses() {
        return this.losses;
    }

    @Nullable
    public final Integer getRank() {
        return this.rank;
    }

    public final int getWins() {
        return this.wins;
    }

    public int hashCode() {
        Integer num = this.rank;
        return Integer.hashCode(this.losses) + wv8.a(this.draws, wv8.a(this.wins, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        Integer num = this.rank;
        int i = this.wins;
        int i2 = this.draws;
        int i3 = this.losses;
        StringBuilder sb = new StringBuilder("FantasyLeagueMatchupStanding(rank=");
        sb.append(num);
        sb.append(", wins=");
        sb.append(i);
        sb.append(", draws=");
        return me4.i(sb, i2, ", losses=", i3, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeagueMatchupStanding$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeagueMatchupStanding(@Nullable Integer num, int i, int i2, int i3) {
        this.rank = num;
        this.wins = i;
        this.draws = i2;
        this.losses = i3;
    }
}
