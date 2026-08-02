package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006BK\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0005\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010!\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/sofascore/model/newNetwork/EventBestPlayersResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/newNetwork/EventBestPlayer;", "bestHomeTeamPlayer", "bestAwayTeamPlayer", "<init>", "(Lcom/sofascore/model/newNetwork/EventBestPlayer;Lcom/sofascore/model/newNetwork/EventBestPlayer;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/newNetwork/EventBestPlayer;Lcom/sofascore/model/newNetwork/EventBestPlayer;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventBestPlayersResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomeBestPlayer", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/newNetwork/EventBestPlayer;", "getAwayBestPlayer", "hasAdditionalStats", "()Z", "Lcom/sofascore/model/newNetwork/EventBestPlayer;", "Z", "getShouldReverseTeams", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventBestPlayersResponse extends NetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EventBestPlayer bestAwayTeamPlayer;

    @NotNull
    private final EventBestPlayer bestHomeTeamPlayer;
    private boolean shouldReverseTeams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventBestPlayersResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, EventBestPlayer eventBestPlayer, EventBestPlayer eventBestPlayer2, boolean z, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, EventBestPlayersResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.bestHomeTeamPlayer = eventBestPlayer;
        this.bestAwayTeamPlayer = eventBestPlayer2;
        if ((i & 16) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    public static /* synthetic */ EventBestPlayer getAwayBestPlayer$default(EventBestPlayersResponse eventBestPlayersResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventBestPlayersResponse.getAwayBestPlayer(teamSides);
    }

    public static /* synthetic */ EventBestPlayer getHomeBestPlayer$default(EventBestPlayersResponse eventBestPlayersResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventBestPlayersResponse.getHomeBestPlayer(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(EventBestPlayersResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        EventBestPlayer$$serializer eventBestPlayer$$serializer = EventBestPlayer$$serializer.INSTANCE;
        output.f(serialDesc, 2, eventBestPlayer$$serializer, self.bestHomeTeamPlayer);
        output.f(serialDesc, 3, eventBestPlayer$$serializer, self.bestAwayTeamPlayer);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 4, self.shouldReverseTeams);
        }
    }

    @NotNull
    public final EventBestPlayer getAwayBestPlayer(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.bestHomeTeamPlayer : this.bestAwayTeamPlayer;
    }

    @NotNull
    public final EventBestPlayer getHomeBestPlayer(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.bestAwayTeamPlayer : this.bestHomeTeamPlayer;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public final boolean hasAdditionalStats() {
        return (this.bestHomeTeamPlayer.getAdditionalStatistics() == null || this.bestAwayTeamPlayer.getAdditionalStatistics() == null) ? false : true;
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventBestPlayersResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventBestPlayersResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventBestPlayersResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventBestPlayersResponse(@NotNull EventBestPlayer eventBestPlayer, @NotNull EventBestPlayer eventBestPlayer2) {
        super((HeadResponse) null, (ErrorResponse) null, 3, (DefaultConstructorMarker) null);
        eventBestPlayer.getClass();
        eventBestPlayer2.getClass();
        this.bestHomeTeamPlayer = eventBestPlayer;
        this.bestAwayTeamPlayer = eventBestPlayer2;
    }
}
