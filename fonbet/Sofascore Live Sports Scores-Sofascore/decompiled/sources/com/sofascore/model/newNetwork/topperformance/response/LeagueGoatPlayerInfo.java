package com.sofascore.model.newNetwork.topperformance.response;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.dmi;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerInfo;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "label", "", "voteCount", "sortOrder", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;II)Lcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/String;", "getLabel", "I", "getVoteCount", "getSortOrder", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LeagueGoatPlayerInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String label;

    @NotNull
    private final Player player;
    private final int sortOrder;
    private final int voteCount;

    public /* synthetic */ LeagueGoatPlayerInfo(int i, Player player, String str, int i2, int i3, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, LeagueGoatPlayerInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.label = str;
        this.voteCount = i2;
        this.sortOrder = i3;
    }

    public static /* synthetic */ LeagueGoatPlayerInfo copy$default(LeagueGoatPlayerInfo leagueGoatPlayerInfo, Player player, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            player = leagueGoatPlayerInfo.player;
        }
        if ((i3 & 2) != 0) {
            str = leagueGoatPlayerInfo.label;
        }
        if ((i3 & 4) != 0) {
            i = leagueGoatPlayerInfo.voteCount;
        }
        if ((i3 & 8) != 0) {
            i2 = leagueGoatPlayerInfo.sortOrder;
        }
        return leagueGoatPlayerInfo.copy(player, str, i, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(LeagueGoatPlayerInfo self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.y(serialDesc, 1, self.label);
        output.u(2, self.voteCount, serialDesc);
        output.u(3, self.sortOrder, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVoteCount() {
        return this.voteCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    @NotNull
    public final LeagueGoatPlayerInfo copy(@NotNull Player player, @NotNull String label, int voteCount, int sortOrder) {
        player.getClass();
        label.getClass();
        return new LeagueGoatPlayerInfo(player, label, voteCount, sortOrder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeagueGoatPlayerInfo)) {
            return false;
        }
        LeagueGoatPlayerInfo leagueGoatPlayerInfo = (LeagueGoatPlayerInfo) other;
        return Intrinsics.c(this.player, leagueGoatPlayerInfo.player) && Intrinsics.c(this.label, leagueGoatPlayerInfo.label) && this.voteCount == leagueGoatPlayerInfo.voteCount && this.sortOrder == leagueGoatPlayerInfo.sortOrder;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.sortOrder) + wv8.a(this.voteCount, dmi.c(this.player.hashCode() * 31, 31, this.label), 31);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        String str = this.label;
        int i = this.voteCount;
        int i2 = this.sortOrder;
        StringBuilder sb = new StringBuilder("LeagueGoatPlayerInfo(player=");
        sb.append(player);
        sb.append(", label=");
        sb.append(str);
        sb.append(", voteCount=");
        return me4.i(sb, i, ", sortOrder=", i2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LeagueGoatPlayerInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LeagueGoatPlayerInfo(@NotNull Player player, @NotNull String str, int i, int i2) {
        player.getClass();
        str.getClass();
        this.player = player;
        this.label = str;
        this.voteCount = i;
        this.sortOrder = i2;
    }
}
