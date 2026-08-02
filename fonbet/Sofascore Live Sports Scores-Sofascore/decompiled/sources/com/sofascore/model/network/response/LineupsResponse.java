package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Lineups$$serializer;
import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.a7a;
import defpackage.ila;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002STB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u007f\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\n\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010>\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\"\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010:\u001a\u0004\bE\u0010 \"\u0004\bF\u0010GR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010:\u001a\u0004\bM\u0010 \"\u0004\bN\u0010GR\u0011\u0010P\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bO\u0010 R\u0011\u0010R\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bQ\u0010 ¨\u0006U"}, d2 = {"Lcom/sofascore/model/network/response/LineupsResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "Ljava/io/Serializable;", "", "confirmed", "Lcom/sofascore/model/mvvm/model/Lineups;", "home", "away", "", "statisticalVersion", "<init>", "(ZLcom/sofascore/model/mvvm/model/Lineups;Lcom/sofascore/model/mvvm/model/Lineups;Ljava/lang/Integer;)V", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "", "firstTeamAverageRating", "secondTeamAverageRating", "pregameRatingShown", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "avgRatingVersion", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;ZLcom/sofascore/model/mvvm/model/Lineups;Lcom/sofascore/model/mvvm/model/Lineups;Ljava/lang/Integer;DDZLcom/sofascore/model/network/response/TeamAverageRatingVersion;ZLt5h;)V", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomeLineups", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/mvvm/model/Lineups;", "getAwayLineups", "component1", "()Z", "copy", "(ZLcom/sofascore/model/mvvm/model/Lineups;Lcom/sofascore/model/mvvm/model/Lineups;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/LineupsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component2", "()Lcom/sofascore/model/mvvm/model/Lineups;", "component3", "component4", "()Ljava/lang/Integer;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/LineupsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Z", "getConfirmed", "Lcom/sofascore/model/mvvm/model/Lineups;", "Ljava/lang/Integer;", "D", "getFirstTeamAverageRating", "()D", "setFirstTeamAverageRating", "(D)V", "getSecondTeamAverageRating", "setSecondTeamAverageRating", "getPregameRatingShown", "setPregameRatingShown", "(Z)V", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "getAvgRatingVersion", "()Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "setAvgRatingVersion", "(Lcom/sofascore/model/network/response/TeamAverageRatingVersion;)V", "getShouldReverseTeams", "setShouldReverseTeams", "getHasRatingComponents", "hasRatingComponents", "getHasAdvancedStatistics", "hasAdvancedStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LineupsResponse extends AbstractNetworkResponse implements Serializable {
    private static final int VERSION_WITH_ADVANCED_STATISTICS = 2;
    private static final int VERSION_WITH_BREAKDOWN = 3;

    @NotNull
    private TeamAverageRatingVersion avgRatingVersion;

    @NotNull
    private final Lineups away;
    private final boolean confirmed;
    private double firstTeamAverageRating;

    @NotNull
    private final Lineups home;
    private boolean pregameRatingShown;
    private double secondTeamAverageRating;
    private boolean shouldReverseTeams;

    @Nullable
    private final Integer statisticalVersion;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new ila(25)), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LineupsResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, boolean z, Lineups lineups, Lineups lineups2, Integer num, double d, double d2, boolean z2, TeamAverageRatingVersion teamAverageRatingVersion, boolean z3, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, LineupsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.confirmed = z;
        this.home = lineups;
        this.away = lineups2;
        this.statisticalVersion = num;
        if ((i & 64) == 0) {
            this.firstTeamAverageRating = 0.0d;
        } else {
            this.firstTeamAverageRating = d;
        }
        if ((i & 128) == 0) {
            this.secondTeamAverageRating = 0.0d;
        } else {
            this.secondTeamAverageRating = d2;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.pregameRatingShown = false;
        } else {
            this.pregameRatingShown = z2;
        }
        if ((i & 512) == 0) {
            this.avgRatingVersion = TeamAverageRatingVersion.ORIGINAL;
        } else {
            this.avgRatingVersion = teamAverageRatingVersion;
        }
        if ((i & 1024) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return TeamAverageRatingVersion.INSTANCE.serializer();
    }

    /* renamed from: component2, reason: from getter */
    private final Lineups getHome() {
        return this.home;
    }

    /* renamed from: component3, reason: from getter */
    private final Lineups getAway() {
        return this.away;
    }

    /* renamed from: component4, reason: from getter */
    private final Integer getStatisticalVersion() {
        return this.statisticalVersion;
    }

    public static /* synthetic */ LineupsResponse copy$default(LineupsResponse lineupsResponse, boolean z, Lineups lineups, Lineups lineups2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = lineupsResponse.confirmed;
        }
        if ((i & 2) != 0) {
            lineups = lineupsResponse.home;
        }
        if ((i & 4) != 0) {
            lineups2 = lineupsResponse.away;
        }
        if ((i & 8) != 0) {
            num = lineupsResponse.statisticalVersion;
        }
        return lineupsResponse.copy(z, lineups, lineups2, num);
    }

    public static /* synthetic */ Lineups getAwayLineups$default(LineupsResponse lineupsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return lineupsResponse.getAwayLineups(teamSides);
    }

    public static /* synthetic */ Lineups getHomeLineups$default(LineupsResponse lineupsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return lineupsResponse.getHomeLineups(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(LineupsResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.x(serialDesc, 2, self.confirmed);
        Lineups$$serializer lineups$$serializer = Lineups$$serializer.INSTANCE;
        output.f(serialDesc, 3, lineups$$serializer, self.home);
        output.f(serialDesc, 4, lineups$$serializer, self.away);
        output.h(serialDesc, 5, a7a.a, self.statisticalVersion);
        if (output.o(serialDesc) || Double.compare(self.firstTeamAverageRating, 0.0d) != 0) {
            output.D(serialDesc, 6, self.firstTeamAverageRating);
        }
        if (output.o(serialDesc) || Double.compare(self.secondTeamAverageRating, 0.0d) != 0) {
            output.D(serialDesc, 7, self.secondTeamAverageRating);
        }
        if (output.o(serialDesc) || self.pregameRatingShown) {
            output.x(serialDesc, 8, self.pregameRatingShown);
        }
        if (output.o(serialDesc) || self.avgRatingVersion != TeamAverageRatingVersion.ORIGINAL) {
            output.f(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.avgRatingVersion);
        }
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 10, self.shouldReverseTeams);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    @NotNull
    public final LineupsResponse copy(boolean confirmed, @NotNull Lineups home, @NotNull Lineups away, @Nullable Integer statisticalVersion) {
        home.getClass();
        away.getClass();
        return new LineupsResponse(confirmed, home, away, statisticalVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineupsResponse)) {
            return false;
        }
        LineupsResponse lineupsResponse = (LineupsResponse) other;
        return this.confirmed == lineupsResponse.confirmed && Intrinsics.c(this.home, lineupsResponse.home) && Intrinsics.c(this.away, lineupsResponse.away) && Intrinsics.c(this.statisticalVersion, lineupsResponse.statisticalVersion);
    }

    @NotNull
    public final TeamAverageRatingVersion getAvgRatingVersion() {
        return this.avgRatingVersion;
    }

    @NotNull
    public final Lineups getAwayLineups(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.home : this.away;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final double getFirstTeamAverageRating() {
        return this.firstTeamAverageRating;
    }

    public final boolean getHasAdvancedStatistics() {
        Integer num = this.statisticalVersion;
        return (num != null ? num.intValue() : 0) >= 2;
    }

    public final boolean getHasRatingComponents() {
        Integer num = this.statisticalVersion;
        return (num != null ? num.intValue() : 0) >= 3;
    }

    @NotNull
    public final Lineups getHomeLineups(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.away : this.home;
    }

    public final boolean getPregameRatingShown() {
        return this.pregameRatingShown;
    }

    public final double getSecondTeamAverageRating() {
        return this.secondTeamAverageRating;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        int hashCode = (this.away.hashCode() + ((this.home.hashCode() + (Boolean.hashCode(this.confirmed) * 31)) * 31)) * 31;
        Integer num = this.statisticalVersion;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setAvgRatingVersion(@NotNull TeamAverageRatingVersion teamAverageRatingVersion) {
        teamAverageRatingVersion.getClass();
        this.avgRatingVersion = teamAverageRatingVersion;
    }

    public final void setFirstTeamAverageRating(double d) {
        this.firstTeamAverageRating = d;
    }

    public final void setPregameRatingShown(boolean z) {
        this.pregameRatingShown = z;
    }

    public final void setSecondTeamAverageRating(double d) {
        this.secondTeamAverageRating = d;
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        return "LineupsResponse(confirmed=" + this.confirmed + ", home=" + this.home + ", away=" + this.away + ", statisticalVersion=" + this.statisticalVersion + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sofascore/model/network/response/LineupsResponse$Companion;", "", "<init>", "()V", "VERSION_WITH_ADVANCED_STATISTICS", "", "VERSION_WITH_BREAKDOWN", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/LineupsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LineupsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LineupsResponse(boolean z, @NotNull Lineups lineups, @NotNull Lineups lineups2, @Nullable Integer num) {
        super((HeadResponse) null, (HeadResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        lineups.getClass();
        lineups2.getClass();
        this.confirmed = z;
        this.home = lineups;
        this.away = lineups2;
        this.statisticalVersion = num;
        this.avgRatingVersion = TeamAverageRatingVersion.ORIGINAL;
    }
}
