package com.sofascore.model.newNetwork;

import com.ironsource.C4227o2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.bxi;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJT\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010\u001d¨\u0006<"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer;", "", "", "id", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/mvvm/model/Event;", "event", "", CampaignEx.JSON_KEY_STAR, C4227o2.u, "<init>", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/Player;", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "component4", "()Lcom/sofascore/model/mvvm/model/Event;", "component5", "()Ljava/lang/String;", "component6", "copy", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;I)Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Ljava/lang/String;", "getRating", "getOrder", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamOfTheWeekPlayer {

    @Nullable
    private final Event event;
    private final int id;
    private final int order;

    @Nullable
    private final Player player;

    @Nullable
    private final String rating;

    @Nullable
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new bxi(5)), null, null, null};

    public /* synthetic */ TeamOfTheWeekPlayer(int i, int i2, Player player, Team team, Event event, String str, int i3, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, TeamOfTheWeekPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.player = player;
        this.team = team;
        this.event = event;
        this.rating = str;
        this.order = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ TeamOfTheWeekPlayer copy$default(TeamOfTheWeekPlayer teamOfTheWeekPlayer, int i, Player player, Team team, Event event, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = teamOfTheWeekPlayer.id;
        }
        if ((i3 & 2) != 0) {
            player = teamOfTheWeekPlayer.player;
        }
        if ((i3 & 4) != 0) {
            team = teamOfTheWeekPlayer.team;
        }
        if ((i3 & 8) != 0) {
            event = teamOfTheWeekPlayer.event;
        }
        if ((i3 & 16) != 0) {
            str = teamOfTheWeekPlayer.rating;
        }
        if ((i3 & 32) != 0) {
            i2 = teamOfTheWeekPlayer.order;
        }
        String str2 = str;
        int i4 = i2;
        return teamOfTheWeekPlayer.copy(i, player, team, event, str2, i4);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamOfTheWeekPlayer self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.h(serialDesc, 1, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.team);
        output.h(serialDesc, 3, EventSerializer.INSTANCE, self.event);
        output.h(serialDesc, 4, uhi.a, self.rating);
        output.u(5, self.order, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRating() {
        return this.rating;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final TeamOfTheWeekPlayer copy(int id, @Nullable Player player, @Nullable Team team, @Nullable Event event, @Nullable String rating, int order) {
        return new TeamOfTheWeekPlayer(id, player, team, event, rating, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamOfTheWeekPlayer)) {
            return false;
        }
        TeamOfTheWeekPlayer teamOfTheWeekPlayer = (TeamOfTheWeekPlayer) other;
        return this.id == teamOfTheWeekPlayer.id && Intrinsics.c(this.player, teamOfTheWeekPlayer.player) && Intrinsics.c(this.team, teamOfTheWeekPlayer.team) && Intrinsics.c(this.event, teamOfTheWeekPlayer.event) && Intrinsics.c(this.rating, teamOfTheWeekPlayer.rating) && this.order == teamOfTheWeekPlayer.order;
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final String getRating() {
        return this.rating;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Player player = this.player;
        int hashCode2 = (hashCode + (player == null ? 0 : player.hashCode())) * 31;
        Team team = this.team;
        int hashCode3 = (hashCode2 + (team == null ? 0 : team.hashCode())) * 31;
        Event event = this.event;
        int hashCode4 = (hashCode3 + (event == null ? 0 : event.hashCode())) * 31;
        String str = this.rating;
        return Integer.hashCode(this.order) + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TeamOfTheWeekPlayer(id=" + this.id + ", player=" + this.player + ", team=" + this.team + ", event=" + this.event + ", rating=" + this.rating + ", order=" + this.order + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamOfTheWeekPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamOfTheWeekPlayer(int i, @Nullable Player player, @Nullable Team team, @Nullable Event event, @Nullable String str, int i2) {
        this.id = i;
        this.player = player;
        this.team = team;
        this.event = event;
        this.rating = str;
        this.order = i2;
    }
}
