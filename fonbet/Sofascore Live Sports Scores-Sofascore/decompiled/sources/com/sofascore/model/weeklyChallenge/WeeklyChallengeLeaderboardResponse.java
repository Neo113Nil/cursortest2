package com.sofascore.model.weeklyChallenge;

import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.g0l;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000b\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#JH\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010#J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b8\u0010#¨\u0006;"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeaderboardResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;", "league", "", "Lcom/sofascore/model/weeklyChallenge/WeeklyLeaderboardUser;", "rankings", "", "promotionZoneUsers", "demotionZoneUsers", "neutralZoneUsers", "<init>", "(Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;Ljava/util/List;III)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;Ljava/util/List;IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeaderboardResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "component5", "copy", "(Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;Ljava/util/List;III)Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeaderboardResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;", "getLeague", "Ljava/util/List;", "getRankings", "I", "getPromotionZoneUsers", "getDemotionZoneUsers", "getNeutralZoneUsers", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WeeklyChallengeLeaderboardResponse extends NetworkResponse {
    private final int demotionZoneUsers;

    @NotNull
    private final ActiveWeeklyLeague league;
    private final int neutralZoneUsers;
    private final int promotionZoneUsers;

    @NotNull
    private final List<WeeklyLeaderboardUser> rankings;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new g0l(9)), null, null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WeeklyChallengeLeaderboardResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, ActiveWeeklyLeague activeWeeklyLeague, List list, int i2, int i3, int i4, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (124 != (i & Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, WeeklyChallengeLeaderboardResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.league = activeWeeklyLeague;
        this.rankings = list;
        this.promotionZoneUsers = i2;
        this.demotionZoneUsers = i3;
        this.neutralZoneUsers = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(WeeklyLeaderboardUser$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ WeeklyChallengeLeaderboardResponse copy$default(WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse, ActiveWeeklyLeague activeWeeklyLeague, List list, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            activeWeeklyLeague = weeklyChallengeLeaderboardResponse.league;
        }
        if ((i4 & 2) != 0) {
            list = weeklyChallengeLeaderboardResponse.rankings;
        }
        if ((i4 & 4) != 0) {
            i = weeklyChallengeLeaderboardResponse.promotionZoneUsers;
        }
        if ((i4 & 8) != 0) {
            i2 = weeklyChallengeLeaderboardResponse.demotionZoneUsers;
        }
        if ((i4 & 16) != 0) {
            i3 = weeklyChallengeLeaderboardResponse.neutralZoneUsers;
        }
        int i5 = i3;
        int i6 = i;
        return weeklyChallengeLeaderboardResponse.copy(activeWeeklyLeague, list, i6, i2, i5);
    }

    public static final /* synthetic */ void write$Self$model_release(WeeklyChallengeLeaderboardResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, ActiveWeeklyLeague$$serializer.INSTANCE, self.league);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.rankings);
        output.u(4, self.promotionZoneUsers, serialDesc);
        output.u(5, self.demotionZoneUsers, serialDesc);
        output.u(6, self.neutralZoneUsers, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActiveWeeklyLeague getLeague() {
        return this.league;
    }

    @NotNull
    public final List<WeeklyLeaderboardUser> component2() {
        return this.rankings;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPromotionZoneUsers() {
        return this.promotionZoneUsers;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDemotionZoneUsers() {
        return this.demotionZoneUsers;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNeutralZoneUsers() {
        return this.neutralZoneUsers;
    }

    @NotNull
    public final WeeklyChallengeLeaderboardResponse copy(@NotNull ActiveWeeklyLeague league, @NotNull List<WeeklyLeaderboardUser> rankings, int promotionZoneUsers, int demotionZoneUsers, int neutralZoneUsers) {
        league.getClass();
        rankings.getClass();
        return new WeeklyChallengeLeaderboardResponse(league, rankings, promotionZoneUsers, demotionZoneUsers, neutralZoneUsers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyChallengeLeaderboardResponse)) {
            return false;
        }
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) other;
        return Intrinsics.c(this.league, weeklyChallengeLeaderboardResponse.league) && Intrinsics.c(this.rankings, weeklyChallengeLeaderboardResponse.rankings) && this.promotionZoneUsers == weeklyChallengeLeaderboardResponse.promotionZoneUsers && this.demotionZoneUsers == weeklyChallengeLeaderboardResponse.demotionZoneUsers && this.neutralZoneUsers == weeklyChallengeLeaderboardResponse.neutralZoneUsers;
    }

    public final int getDemotionZoneUsers() {
        return this.demotionZoneUsers;
    }

    @NotNull
    public final ActiveWeeklyLeague getLeague() {
        return this.league;
    }

    public final int getNeutralZoneUsers() {
        return this.neutralZoneUsers;
    }

    public final int getPromotionZoneUsers() {
        return this.promotionZoneUsers;
    }

    @NotNull
    public final List<WeeklyLeaderboardUser> getRankings() {
        return this.rankings;
    }

    public int hashCode() {
        return Integer.hashCode(this.neutralZoneUsers) + wv8.a(this.demotionZoneUsers, wv8.a(this.promotionZoneUsers, dmi.d(this.league.hashCode() * 31, 31, this.rankings), 31), 31);
    }

    @NotNull
    public String toString() {
        ActiveWeeklyLeague activeWeeklyLeague = this.league;
        List<WeeklyLeaderboardUser> list = this.rankings;
        int i = this.promotionZoneUsers;
        int i2 = this.demotionZoneUsers;
        int i3 = this.neutralZoneUsers;
        StringBuilder sb = new StringBuilder("WeeklyChallengeLeaderboardResponse(league=");
        sb.append(activeWeeklyLeague);
        sb.append(", rankings=");
        sb.append(list);
        sb.append(", promotionZoneUsers=");
        me4.q(sb, i, ", demotionZoneUsers=", i2, ", neutralZoneUsers=");
        return fc6.h(i3, ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeaderboardResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeaderboardResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WeeklyChallengeLeaderboardResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WeeklyChallengeLeaderboardResponse(@NotNull ActiveWeeklyLeague activeWeeklyLeague, @NotNull List<WeeklyLeaderboardUser> list, int i, int i2, int i3) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        activeWeeklyLeague.getClass();
        list.getClass();
        this.league = activeWeeklyLeague;
        this.rankings = list;
        this.promotionZoneUsers = i;
        this.demotionZoneUsers = i2;
        this.neutralZoneUsers = i3;
    }
}
