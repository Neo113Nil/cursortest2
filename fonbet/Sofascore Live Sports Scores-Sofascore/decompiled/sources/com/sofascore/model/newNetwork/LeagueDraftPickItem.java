package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.ila;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJh\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b;\u0010\"R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b<\u0010\u001e¨\u0006?"}, d2 = {"Lcom/sofascore/model/newNetwork/LeagueDraftPickItem;", "", "", "pickInRound", "overallPick", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/newNetwork/DraftProspect;", "prospect", "", "tradeSequence", "tradedFromTeam", "id", "<init>", "(IIILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/DraftProspect;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/DraftProspect;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/LeagueDraftPickItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/Team;", "component5", "()Lcom/sofascore/model/newNetwork/DraftProspect;", "component6", "()Ljava/lang/String;", "component7", "component8", "copy", "(IIILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/DraftProspect;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;I)Lcom/sofascore/model/newNetwork/LeagueDraftPickItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPickInRound", "getOverallPick", "getRound", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/newNetwork/DraftProspect;", "getProspect", "Ljava/lang/String;", "getTradeSequence", "getTradedFromTeam", "getId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LeagueDraftPickItem {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int id;
    private final int overallPick;
    private final int pickInRound;

    @Nullable
    private final DraftProspect prospect;
    private final int round;

    @Nullable
    private final Team team;

    @Nullable
    private final String tradeSequence;

    @Nullable
    private final Team tradedFromTeam;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new ila(2)), null, null, ypa.a(ysaVar, new ila(3)), null};
    }

    public /* synthetic */ LeagueDraftPickItem(int i, int i2, int i3, int i4, Team team, DraftProspect draftProspect, String str, Team team2, int i5, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, LeagueDraftPickItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pickInRound = i2;
        this.overallPick = i3;
        this.round = i4;
        this.team = team;
        this.prospect = draftProspect;
        this.tradeSequence = str;
        this.tradedFromTeam = team2;
        this.id = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ LeagueDraftPickItem copy$default(LeagueDraftPickItem leagueDraftPickItem, int i, int i2, int i3, Team team, DraftProspect draftProspect, String str, Team team2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = leagueDraftPickItem.pickInRound;
        }
        if ((i5 & 2) != 0) {
            i2 = leagueDraftPickItem.overallPick;
        }
        if ((i5 & 4) != 0) {
            i3 = leagueDraftPickItem.round;
        }
        if ((i5 & 8) != 0) {
            team = leagueDraftPickItem.team;
        }
        if ((i5 & 16) != 0) {
            draftProspect = leagueDraftPickItem.prospect;
        }
        if ((i5 & 32) != 0) {
            str = leagueDraftPickItem.tradeSequence;
        }
        if ((i5 & 64) != 0) {
            team2 = leagueDraftPickItem.tradedFromTeam;
        }
        if ((i5 & 128) != 0) {
            i4 = leagueDraftPickItem.id;
        }
        Team team3 = team2;
        int i6 = i4;
        DraftProspect draftProspect2 = draftProspect;
        String str2 = str;
        return leagueDraftPickItem.copy(i, i2, i3, team, draftProspect2, str2, team3, i6);
    }

    public static final /* synthetic */ void write$Self$model_release(LeagueDraftPickItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.pickInRound, serialDesc);
        output.u(1, self.overallPick, serialDesc);
        output.u(2, self.round, serialDesc);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.team);
        output.h(serialDesc, 4, DraftProspect$$serializer.INSTANCE, self.prospect);
        output.h(serialDesc, 5, uhi.a, self.tradeSequence);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.tradedFromTeam);
        output.u(7, self.id, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPickInRound() {
        return this.pickInRound;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOverallPick() {
        return this.overallPick;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRound() {
        return this.round;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final DraftProspect getProspect() {
        return this.prospect;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTradeSequence() {
        return this.tradeSequence;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Team getTradedFromTeam() {
        return this.tradedFromTeam;
    }

    /* renamed from: component8, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final LeagueDraftPickItem copy(int pickInRound, int overallPick, int round, @Nullable Team team, @Nullable DraftProspect prospect, @Nullable String tradeSequence, @Nullable Team tradedFromTeam, int id) {
        return new LeagueDraftPickItem(pickInRound, overallPick, round, team, prospect, tradeSequence, tradedFromTeam, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeagueDraftPickItem)) {
            return false;
        }
        LeagueDraftPickItem leagueDraftPickItem = (LeagueDraftPickItem) other;
        return this.pickInRound == leagueDraftPickItem.pickInRound && this.overallPick == leagueDraftPickItem.overallPick && this.round == leagueDraftPickItem.round && Intrinsics.c(this.team, leagueDraftPickItem.team) && Intrinsics.c(this.prospect, leagueDraftPickItem.prospect) && Intrinsics.c(this.tradeSequence, leagueDraftPickItem.tradeSequence) && Intrinsics.c(this.tradedFromTeam, leagueDraftPickItem.tradedFromTeam) && this.id == leagueDraftPickItem.id;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOverallPick() {
        return this.overallPick;
    }

    public final int getPickInRound() {
        return this.pickInRound;
    }

    @Nullable
    public final DraftProspect getProspect() {
        return this.prospect;
    }

    public final int getRound() {
        return this.round;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final String getTradeSequence() {
        return this.tradeSequence;
    }

    @Nullable
    public final Team getTradedFromTeam() {
        return this.tradedFromTeam;
    }

    public int hashCode() {
        int a = wv8.a(this.round, wv8.a(this.overallPick, Integer.hashCode(this.pickInRound) * 31, 31), 31);
        Team team = this.team;
        int hashCode = (a + (team == null ? 0 : team.hashCode())) * 31;
        DraftProspect draftProspect = this.prospect;
        int hashCode2 = (hashCode + (draftProspect == null ? 0 : draftProspect.hashCode())) * 31;
        String str = this.tradeSequence;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Team team2 = this.tradedFromTeam;
        return Integer.hashCode(this.id) + ((hashCode3 + (team2 != null ? team2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.pickInRound;
        int i2 = this.overallPick;
        int i3 = this.round;
        Team team = this.team;
        DraftProspect draftProspect = this.prospect;
        String str = this.tradeSequence;
        Team team2 = this.tradedFromTeam;
        int i4 = this.id;
        StringBuilder s = lnb.s(i, i2, "LeagueDraftPickItem(pickInRound=", ", overallPick=", ", round=");
        s.append(i3);
        s.append(", team=");
        s.append(team);
        s.append(", prospect=");
        s.append(draftProspect);
        s.append(", tradeSequence=");
        s.append(str);
        s.append(", tradedFromTeam=");
        s.append(team2);
        s.append(", id=");
        s.append(i4);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/LeagueDraftPickItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/LeagueDraftPickItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LeagueDraftPickItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LeagueDraftPickItem(int i, int i2, int i3, @Nullable Team team, @Nullable DraftProspect draftProspect, @Nullable String str, @Nullable Team team2, int i4) {
        this.pickInRound = i;
        this.overallPick = i2;
        this.round = i3;
        this.team = team;
        this.prospect = draftProspect;
        this.tradeSequence = str;
        this.tradedFromTeam = team2;
        this.id = i4;
    }
}
