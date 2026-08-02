package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.h75;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vak;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,Jv\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bA\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bB\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bC\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010,¨\u0006H"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance;", "", "Lcom/sofascore/model/mvvm/model/Event;", "event", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "points", "rebounds", "assists", "steals", "blocks", "", CampaignEx.JSON_KEY_STAR, "<init>", "(Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Event;", "component2", "()Lcom/sofascore/model/mvvm/model/Player;", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Double;", "copy", "(Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Ljava/lang/Integer;", "getPoints", "getRebounds", "getAssists", "getSteals", "getBlocks", "Ljava/lang/Double;", "getRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentRecapPlayerPerformance {

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blocks;

    @NotNull
    private final Event event;

    @NotNull
    private final Player player;

    @Nullable
    private final Integer points;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer rebounds;

    @Nullable
    private final Integer steals;

    @NotNull
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new vak(11)), null, null, null, null, null, null};

    public /* synthetic */ UniqueTournamentRecapPlayerPerformance(int i, Event event, Player player, Team team, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Double d, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, UniqueTournamentRecapPlayerPerformance$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = event;
        this.player = player;
        this.team = team;
        this.points = num;
        this.rebounds = num2;
        this.assists = num3;
        this.steals = num4;
        this.blocks = num5;
        this.rating = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ UniqueTournamentRecapPlayerPerformance copy$default(UniqueTournamentRecapPlayerPerformance uniqueTournamentRecapPlayerPerformance, Event event, Player player, Team team, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            event = uniqueTournamentRecapPlayerPerformance.event;
        }
        if ((i & 2) != 0) {
            player = uniqueTournamentRecapPlayerPerformance.player;
        }
        if ((i & 4) != 0) {
            team = uniqueTournamentRecapPlayerPerformance.team;
        }
        if ((i & 8) != 0) {
            num = uniqueTournamentRecapPlayerPerformance.points;
        }
        if ((i & 16) != 0) {
            num2 = uniqueTournamentRecapPlayerPerformance.rebounds;
        }
        if ((i & 32) != 0) {
            num3 = uniqueTournamentRecapPlayerPerformance.assists;
        }
        if ((i & 64) != 0) {
            num4 = uniqueTournamentRecapPlayerPerformance.steals;
        }
        if ((i & 128) != 0) {
            num5 = uniqueTournamentRecapPlayerPerformance.blocks;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            d = uniqueTournamentRecapPlayerPerformance.rating;
        }
        Integer num6 = num5;
        Double d2 = d;
        Integer num7 = num3;
        Integer num8 = num4;
        Integer num9 = num2;
        Team team2 = team;
        return uniqueTournamentRecapPlayerPerformance.copy(event, player, team2, num, num9, num7, num8, num6, d2);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentRecapPlayerPerformance self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, EventSerializer.INSTANCE, self.event);
        output.f(serialDesc, 1, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.team);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.points);
        output.h(serialDesc, 4, a7aVar, self.rebounds);
        output.h(serialDesc, 5, a7aVar, self.assists);
        output.h(serialDesc, 6, a7aVar, self.steals);
        output.h(serialDesc, 7, a7aVar, self.blocks);
        output.h(serialDesc, 8, h75.a, self.rating);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @NotNull
    public final UniqueTournamentRecapPlayerPerformance copy(@NotNull Event event, @NotNull Player player, @NotNull Team team, @Nullable Integer points, @Nullable Integer rebounds, @Nullable Integer assists, @Nullable Integer steals, @Nullable Integer blocks, @Nullable Double rating) {
        event.getClass();
        player.getClass();
        team.getClass();
        return new UniqueTournamentRecapPlayerPerformance(event, player, team, points, rebounds, assists, steals, blocks, rating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentRecapPlayerPerformance)) {
            return false;
        }
        UniqueTournamentRecapPlayerPerformance uniqueTournamentRecapPlayerPerformance = (UniqueTournamentRecapPlayerPerformance) other;
        return Intrinsics.c(this.event, uniqueTournamentRecapPlayerPerformance.event) && Intrinsics.c(this.player, uniqueTournamentRecapPlayerPerformance.player) && Intrinsics.c(this.team, uniqueTournamentRecapPlayerPerformance.team) && Intrinsics.c(this.points, uniqueTournamentRecapPlayerPerformance.points) && Intrinsics.c(this.rebounds, uniqueTournamentRecapPlayerPerformance.rebounds) && Intrinsics.c(this.assists, uniqueTournamentRecapPlayerPerformance.assists) && Intrinsics.c(this.steals, uniqueTournamentRecapPlayerPerformance.steals) && Intrinsics.c(this.blocks, uniqueTournamentRecapPlayerPerformance.blocks) && Intrinsics.c(this.rating, uniqueTournamentRecapPlayerPerformance.rating);
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBlocks() {
        return this.blocks;
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int b = fc6.b((this.player.hashCode() + (this.event.hashCode() * 31)) * 31, 31, this.team);
        Integer num = this.points;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rebounds;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.assists;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.steals;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.blocks;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d = this.rating;
        return hashCode5 + (d != null ? d.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Event event = this.event;
        Player player = this.player;
        Team team = this.team;
        Integer num = this.points;
        Integer num2 = this.rebounds;
        Integer num3 = this.assists;
        Integer num4 = this.steals;
        Integer num5 = this.blocks;
        Double d = this.rating;
        StringBuilder sb = new StringBuilder("UniqueTournamentRecapPlayerPerformance(event=");
        sb.append(event);
        sb.append(", player=");
        sb.append(player);
        sb.append(", team=");
        sb.append(team);
        sb.append(", points=");
        sb.append(num);
        sb.append(", rebounds=");
        vxd.r(num2, num3, ", assists=", ", steals=", sb);
        vxd.r(num4, num5, ", blocks=", ", rating=", sb);
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentRecapPlayerPerformance$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentRecapPlayerPerformance(@NotNull Event event, @NotNull Player player, @NotNull Team team, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Double d) {
        event.getClass();
        player.getClass();
        team.getClass();
        this.event = event;
        this.player = player;
        this.team = team;
        this.points = num;
        this.rebounds = num2;
        this.assists = num3;
        this.steals = num4;
        this.blocks = num5;
        this.rating = d;
    }
}
