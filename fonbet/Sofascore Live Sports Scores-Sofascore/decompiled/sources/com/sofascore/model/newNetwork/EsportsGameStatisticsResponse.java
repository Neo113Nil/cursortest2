package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006BK\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0005\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J$\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/sofascore/model/newNetwork/EsportsGameStatisticsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "homeStatistics", "awayStatistics", "<init>", "(Lcom/sofascore/model/newNetwork/EsportsGameStatistics;Lcom/sofascore/model/newNetwork/EsportsGameStatistics;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/newNetwork/EsportsGameStatistics;Lcom/sofascore/model/newNetwork/EsportsGameStatistics;ZLt5h;)V", "component1", "()Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "component2", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EsportsGameStatisticsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHome", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "getAway", "copy", "(Lcom/sofascore/model/newNetwork/EsportsGameStatistics;Lcom/sofascore/model/newNetwork/EsportsGameStatistics;)Lcom/sofascore/model/newNetwork/EsportsGameStatisticsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EsportsGameStatisticsResponse extends NetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EsportsGameStatistics awayStatistics;

    @NotNull
    private final EsportsGameStatistics homeStatistics;
    private boolean shouldReverseTeams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EsportsGameStatisticsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, EsportsGameStatistics esportsGameStatistics, EsportsGameStatistics esportsGameStatistics2, boolean z, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, EsportsGameStatisticsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeStatistics = esportsGameStatistics;
        this.awayStatistics = esportsGameStatistics2;
        if ((i & 16) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final EsportsGameStatistics getHomeStatistics() {
        return this.homeStatistics;
    }

    /* renamed from: component2, reason: from getter */
    private final EsportsGameStatistics getAwayStatistics() {
        return this.awayStatistics;
    }

    public static /* synthetic */ EsportsGameStatisticsResponse copy$default(EsportsGameStatisticsResponse esportsGameStatisticsResponse, EsportsGameStatistics esportsGameStatistics, EsportsGameStatistics esportsGameStatistics2, int i, Object obj) {
        if ((i & 1) != 0) {
            esportsGameStatistics = esportsGameStatisticsResponse.homeStatistics;
        }
        if ((i & 2) != 0) {
            esportsGameStatistics2 = esportsGameStatisticsResponse.awayStatistics;
        }
        return esportsGameStatisticsResponse.copy(esportsGameStatistics, esportsGameStatistics2);
    }

    public static /* synthetic */ EsportsGameStatistics getAway$default(EsportsGameStatisticsResponse esportsGameStatisticsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return esportsGameStatisticsResponse.getAway(teamSides);
    }

    public static /* synthetic */ EsportsGameStatistics getHome$default(EsportsGameStatisticsResponse esportsGameStatisticsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return esportsGameStatisticsResponse.getHome(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(EsportsGameStatisticsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        EsportsGameStatistics$$serializer esportsGameStatistics$$serializer = EsportsGameStatistics$$serializer.INSTANCE;
        output.f(serialDesc, 2, esportsGameStatistics$$serializer, self.homeStatistics);
        output.f(serialDesc, 3, esportsGameStatistics$$serializer, self.awayStatistics);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 4, self.shouldReverseTeams);
        }
    }

    @NotNull
    public final EsportsGameStatisticsResponse copy(@NotNull EsportsGameStatistics homeStatistics, @NotNull EsportsGameStatistics awayStatistics) {
        homeStatistics.getClass();
        awayStatistics.getClass();
        return new EsportsGameStatisticsResponse(homeStatistics, awayStatistics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsportsGameStatisticsResponse)) {
            return false;
        }
        EsportsGameStatisticsResponse esportsGameStatisticsResponse = (EsportsGameStatisticsResponse) other;
        return Intrinsics.c(this.homeStatistics, esportsGameStatisticsResponse.homeStatistics) && Intrinsics.c(this.awayStatistics, esportsGameStatisticsResponse.awayStatistics);
    }

    @NotNull
    public final EsportsGameStatistics getAway(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeStatistics : this.awayStatistics;
    }

    @NotNull
    public final EsportsGameStatistics getHome(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayStatistics : this.homeStatistics;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        return this.awayStatistics.hashCode() + (this.homeStatistics.hashCode() * 31);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        return "EsportsGameStatisticsResponse(homeStatistics=" + this.homeStatistics + ", awayStatistics=" + this.awayStatistics + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EsportsGameStatisticsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EsportsGameStatisticsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EsportsGameStatisticsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsportsGameStatisticsResponse(@NotNull EsportsGameStatistics esportsGameStatistics, @NotNull EsportsGameStatistics esportsGameStatistics2) {
        super((HeadResponse) null, (ErrorResponse) null, 3, (DefaultConstructorMarker) null);
        esportsGameStatistics.getClass();
        esportsGameStatistics2.getClass();
        this.homeStatistics = esportsGameStatistics;
        this.awayStatistics = esportsGameStatistics2;
    }
}
