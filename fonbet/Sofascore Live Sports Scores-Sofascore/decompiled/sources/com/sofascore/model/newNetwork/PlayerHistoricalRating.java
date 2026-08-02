package com.sofascore.model.newNetwork;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.boe;
import defpackage.fc6;
import defpackage.h75;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\f\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*JP\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010#J\u001a\u00102\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerHistoricalRating;", "", "", "eventId", "startTimestamp", "", CampaignEx.JSON_KEY_STAR, "Lcom/sofascore/model/mvvm/model/Team;", "opponent", "Lcom/sofascore/model/mvvm/model/Event;", "event", "", "isHome", "<init>", "(IILjava/lang/Double;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Event;Z)V", "seen0", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Double;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Event;ZZLt5h;)V", "component6", "()Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerHistoricalRating;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Z", "component1", "()I", "component2", "component3", "()Ljava/lang/Double;", "component4", "()Lcom/sofascore/model/mvvm/model/Team;", "component5", "()Lcom/sofascore/model/mvvm/model/Event;", "copy", "(IILjava/lang/Double;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Event;Z)Lcom/sofascore/model/newNetwork/PlayerHistoricalRating;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getEventId", "getStartTimestamp", "Ljava/lang/Double;", "getRating", "Lcom/sofascore/model/mvvm/model/Team;", "getOpponent", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Z", "getShouldReverseTeams", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerHistoricalRating {

    @Nullable
    private final Event event;
    private final int eventId;
    private final boolean isHome;

    @NotNull
    private final Team opponent;

    @Nullable
    private final Double rating;
    private boolean shouldReverseTeams;
    private final int startTimestamp;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new boe(15)), null, null, null};

    public /* synthetic */ PlayerHistoricalRating(int i, int i2, int i3, Double d, Team team, Event event, boolean z, boolean z2, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, PlayerHistoricalRating$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = i2;
        this.startTimestamp = i3;
        this.rating = d;
        this.opponent = team;
        this.event = event;
        this.isHome = z;
        if ((i & 64) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getIsHome() {
        return this.isHome;
    }

    public static /* synthetic */ PlayerHistoricalRating copy$default(PlayerHistoricalRating playerHistoricalRating, int i, int i2, Double d, Team team, Event event, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = playerHistoricalRating.eventId;
        }
        if ((i3 & 2) != 0) {
            i2 = playerHistoricalRating.startTimestamp;
        }
        if ((i3 & 4) != 0) {
            d = playerHistoricalRating.rating;
        }
        if ((i3 & 8) != 0) {
            team = playerHistoricalRating.opponent;
        }
        if ((i3 & 16) != 0) {
            event = playerHistoricalRating.event;
        }
        if ((i3 & 32) != 0) {
            z = playerHistoricalRating.isHome;
        }
        Event event2 = event;
        boolean z2 = z;
        return playerHistoricalRating.copy(i, i2, d, team, event2, z2);
    }

    public static /* synthetic */ boolean isHome$default(PlayerHistoricalRating playerHistoricalRating, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return playerHistoricalRating.isHome(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerHistoricalRating self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.eventId, serialDesc);
        output.u(1, self.startTimestamp, serialDesc);
        output.h(serialDesc, 2, h75.a, self.rating);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.opponent);
        output.h(serialDesc, 4, EventSerializer.INSTANCE, self.event);
        output.x(serialDesc, 5, self.isHome);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 6, self.shouldReverseTeams);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Team getOpponent() {
        return this.opponent;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @NotNull
    public final PlayerHistoricalRating copy(int eventId, int startTimestamp, @Nullable Double rating, @NotNull Team opponent, @Nullable Event event, boolean isHome) {
        opponent.getClass();
        return new PlayerHistoricalRating(eventId, startTimestamp, rating, opponent, event, isHome);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerHistoricalRating)) {
            return false;
        }
        PlayerHistoricalRating playerHistoricalRating = (PlayerHistoricalRating) other;
        return this.eventId == playerHistoricalRating.eventId && this.startTimestamp == playerHistoricalRating.startTimestamp && Intrinsics.c(this.rating, playerHistoricalRating.rating) && Intrinsics.c(this.opponent, playerHistoricalRating.opponent) && Intrinsics.c(this.event, playerHistoricalRating.event) && this.isHome == playerHistoricalRating.isHome;
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final Team getOpponent() {
        return this.opponent;
    }

    @Nullable
    public final Double getRating() {
        return this.rating;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public final int getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        int a = wv8.a(this.startTimestamp, Integer.hashCode(this.eventId) * 31, 31);
        Double d = this.rating;
        int b = fc6.b((a + (d == null ? 0 : d.hashCode())) * 31, 31, this.opponent);
        Event event = this.event;
        return Boolean.hashCode(this.isHome) + ((b + (event != null ? event.hashCode() : 0)) * 31);
    }

    public final boolean isHome(@NotNull TeamSides side) {
        side.getClass();
        Boolean valueOf = Boolean.valueOf(this.isHome);
        if (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.booleanValue() : !this.isHome;
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        int i = this.eventId;
        int i2 = this.startTimestamp;
        Double d = this.rating;
        Team team = this.opponent;
        Event event = this.event;
        boolean z = this.isHome;
        StringBuilder s = lnb.s(i, i2, "PlayerHistoricalRating(eventId=", ", startTimestamp=", ", rating=");
        s.append(d);
        s.append(", opponent=");
        s.append(team);
        s.append(", event=");
        s.append(event);
        s.append(", isHome=");
        s.append(z);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerHistoricalRating$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerHistoricalRating;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerHistoricalRating$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final boolean isHome() {
        return isHome$default(this, null, 1, null);
    }

    public PlayerHistoricalRating(int i, int i2, @Nullable Double d, @NotNull Team team, @Nullable Event event, boolean z) {
        team.getClass();
        this.eventId = i;
        this.startTimestamp = i2;
        this.rating = d;
        this.opponent = team;
        this.event = event;
        this.isHome = z;
    }
}
