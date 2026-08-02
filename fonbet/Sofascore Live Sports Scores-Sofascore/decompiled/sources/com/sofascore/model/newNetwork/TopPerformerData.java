package com.sofascore.model.newNetwork;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.eej;
import defpackage.fc6;
import defpackage.h75;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/TopPerformerData;", "", "Lcom/sofascore/model/mvvm/model/Event;", "event", "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", CampaignEx.JSON_KEY_STAR, "<init>", "(Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TopPerformerData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Event;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Lcom/sofascore/model/mvvm/model/Player;", "component4", "()Ljava/lang/Double;", "copy", "(Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;)Lcom/sofascore/model/newNetwork/TopPerformerData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/Double;", "getRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TopPerformerData {

    @NotNull
    private final Event event;

    @NotNull
    private final Player player;

    @Nullable
    private final Double rating;

    @NotNull
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new eej(9)), null, null};

    public /* synthetic */ TopPerformerData(int i, Event event, Team team, Player player, Double d, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, TopPerformerData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = event;
        this.team = team;
        this.player = player;
        this.rating = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ TopPerformerData copy$default(TopPerformerData topPerformerData, Event event, Team team, Player player, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            event = topPerformerData.event;
        }
        if ((i & 2) != 0) {
            team = topPerformerData.team;
        }
        if ((i & 4) != 0) {
            player = topPerformerData.player;
        }
        if ((i & 8) != 0) {
            d = topPerformerData.rating;
        }
        return topPerformerData.copy(event, team, player, d);
    }

    public static final /* synthetic */ void write$Self$model_release(TopPerformerData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, EventSerializer.INSTANCE, self.event);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.f(serialDesc, 2, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 3, h75.a, self.rating);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @NotNull
    public final TopPerformerData copy(@NotNull Event event, @NotNull Team team, @NotNull Player player, @Nullable Double rating) {
        event.getClass();
        team.getClass();
        player.getClass();
        return new TopPerformerData(event, team, player, rating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopPerformerData)) {
            return false;
        }
        TopPerformerData topPerformerData = (TopPerformerData) other;
        return Intrinsics.c(this.event, topPerformerData.event) && Intrinsics.c(this.team, topPerformerData.team) && Intrinsics.c(this.player, topPerformerData.player) && Intrinsics.c(this.rating, topPerformerData.rating);
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
    public final Double getRating() {
        return this.rating;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int hashCode = (this.player.hashCode() + fc6.b(this.event.hashCode() * 31, 31, this.team)) * 31;
        Double d = this.rating;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    @NotNull
    public String toString() {
        return "TopPerformerData(event=" + this.event + ", team=" + this.team + ", player=" + this.player + ", rating=" + this.rating + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TopPerformerData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TopPerformerData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TopPerformerData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TopPerformerData(@NotNull Event event, @NotNull Team team, @NotNull Player player, @Nullable Double d) {
        event.getClass();
        team.getClass();
        player.getClass();
        this.event = event;
        this.team = team;
        this.player = player;
        this.rating = d;
    }
}
