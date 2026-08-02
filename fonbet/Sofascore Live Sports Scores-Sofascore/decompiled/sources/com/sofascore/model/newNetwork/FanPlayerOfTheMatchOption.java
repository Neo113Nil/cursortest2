package com.sofascore.model.newNetwork;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.ec6;
import defpackage.fc6;
import defpackage.h75;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010 ¨\u00066"}, d2 = {"Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchOption;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", CampaignEx.JSON_KEY_STAR, "", "votes", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Double;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Double;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchOption;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Ljava/lang/Double;", "component4", "()I", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Double;I)Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchOption;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Ljava/lang/Double;", "getRating", "I", "getVotes", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FanPlayerOfTheMatchOption implements Serializable {

    @NotNull
    private final Player player;

    @Nullable
    private final Double rating;

    @NotNull
    private final Team team;
    private final int votes;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new ec6(21)), null, null};

    public /* synthetic */ FanPlayerOfTheMatchOption(int i, Player player, Team team, Double d, int i2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FanPlayerOfTheMatchOption$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.team = team;
        this.rating = d;
        this.votes = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ FanPlayerOfTheMatchOption copy$default(FanPlayerOfTheMatchOption fanPlayerOfTheMatchOption, Player player, Team team, Double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            player = fanPlayerOfTheMatchOption.player;
        }
        if ((i2 & 2) != 0) {
            team = fanPlayerOfTheMatchOption.team;
        }
        if ((i2 & 4) != 0) {
            d = fanPlayerOfTheMatchOption.rating;
        }
        if ((i2 & 8) != 0) {
            i = fanPlayerOfTheMatchOption.votes;
        }
        return fanPlayerOfTheMatchOption.copy(player, team, d, i);
    }

    public static final /* synthetic */ void write$Self$model_release(FanPlayerOfTheMatchOption self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.h(serialDesc, 2, h75.a, self.rating);
        output.u(3, self.votes, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVotes() {
        return this.votes;
    }

    @NotNull
    public final FanPlayerOfTheMatchOption copy(@NotNull Player player, @NotNull Team team, @Nullable Double rating, int votes) {
        player.getClass();
        team.getClass();
        return new FanPlayerOfTheMatchOption(player, team, rating, votes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FanPlayerOfTheMatchOption)) {
            return false;
        }
        FanPlayerOfTheMatchOption fanPlayerOfTheMatchOption = (FanPlayerOfTheMatchOption) other;
        return Intrinsics.c(this.player, fanPlayerOfTheMatchOption.player) && Intrinsics.c(this.team, fanPlayerOfTheMatchOption.team) && Intrinsics.c(this.rating, fanPlayerOfTheMatchOption.rating) && this.votes == fanPlayerOfTheMatchOption.votes;
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

    public final int getVotes() {
        return this.votes;
    }

    public int hashCode() {
        int b = fc6.b(this.player.hashCode() * 31, 31, this.team);
        Double d = this.rating;
        return Integer.hashCode(this.votes) + ((b + (d == null ? 0 : d.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "FanPlayerOfTheMatchOption(player=" + this.player + ", team=" + this.team + ", rating=" + this.rating + ", votes=" + this.votes + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchOption$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchOption;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FanPlayerOfTheMatchOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FanPlayerOfTheMatchOption(@NotNull Player player, @NotNull Team team, @Nullable Double d, int i) {
        player.getClass();
        team.getClass();
        this.player = player;
        this.team = team;
        this.rating = d;
        this.votes = i;
    }
}
