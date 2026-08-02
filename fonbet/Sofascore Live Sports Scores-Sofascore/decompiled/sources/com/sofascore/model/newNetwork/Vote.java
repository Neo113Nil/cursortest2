package com.sofascore.model.newNetwork;

import com.ironsource.Y1;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsChoice$$serializer;
import defpackage.c88;
import defpackage.dmi;
import defpackage.hz8;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.pxk;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)JT\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!\"\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010)¨\u0006C"}, d2 = {"Lcom/sofascore/model/newNetwork/Vote;", "", "Lcom/sofascore/model/database/VoteType;", "voteType", "", "vote", "Lcom/sofascore/model/odds/OddsChoice;", "odds", "Lcom/sofascore/model/newNetwork/VoteResult;", "correct", "", "score", "", "weeklyChallengeBonusDateTimestamp", "<init>", "(Lcom/sofascore/model/database/VoteType;Ljava/lang/String;Lcom/sofascore/model/odds/OddsChoice;Lcom/sofascore/model/newNetwork/VoteResult;Ljava/lang/Float;Ljava/lang/Long;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/database/VoteType;Ljava/lang/String;Lcom/sofascore/model/odds/OddsChoice;Lcom/sofascore/model/newNetwork/VoteResult;Ljava/lang/Float;Ljava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/Vote;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/database/VoteType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/odds/OddsChoice;", "component4", "()Lcom/sofascore/model/newNetwork/VoteResult;", "component5", "()Ljava/lang/Float;", "component6", "()Ljava/lang/Long;", "copy", "(Lcom/sofascore/model/database/VoteType;Ljava/lang/String;Lcom/sofascore/model/odds/OddsChoice;Lcom/sofascore/model/newNetwork/VoteResult;Ljava/lang/Float;Ljava/lang/Long;)Lcom/sofascore/model/newNetwork/Vote;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/database/VoteType;", "getVoteType", "Ljava/lang/String;", "getVote", "setVote", "(Ljava/lang/String;)V", "Lcom/sofascore/model/odds/OddsChoice;", "getOdds", "Lcom/sofascore/model/newNetwork/VoteResult;", "getCorrect", "Ljava/lang/Float;", "getScore", "Ljava/lang/Long;", "getWeeklyChallengeBonusDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Vote {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final VoteResult correct;

    @Nullable
    private final OddsChoice odds;

    @Nullable
    private final Float score;

    @NotNull
    private String vote;

    @Nullable
    private final VoteType voteType;

    @Nullable
    private final Long weeklyChallengeBonusDateTimestamp;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new pxk(20)), null, null, ypa.a(ysaVar, new pxk(21)), null, null};
    }

    public /* synthetic */ Vote(int i, VoteType voteType, String str, OddsChoice oddsChoice, VoteResult voteResult, Float f, Long l, t5h t5hVar) {
        if (55 != (i & 55)) {
            oea.z(i, 55, Vote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.voteType = voteType;
        this.vote = str;
        this.odds = oddsChoice;
        if ((i & 8) == 0) {
            this.correct = VoteResult.UNKNOWN;
        } else {
            this.correct = voteResult;
        }
        this.score = f;
        this.weeklyChallengeBonusDateTimestamp = l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoteType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return hz8.F("com.sofascore.model.newNetwork.VoteResult", VoteResult.values(), new String[]{"1", "0", Y1.f}, new Annotation[][]{null, null, null});
    }

    public static /* synthetic */ Vote copy$default(Vote vote, VoteType voteType, String str, OddsChoice oddsChoice, VoteResult voteResult, Float f, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            voteType = vote.voteType;
        }
        if ((i & 2) != 0) {
            str = vote.vote;
        }
        if ((i & 4) != 0) {
            oddsChoice = vote.odds;
        }
        if ((i & 8) != 0) {
            voteResult = vote.correct;
        }
        if ((i & 16) != 0) {
            f = vote.score;
        }
        if ((i & 32) != 0) {
            l = vote.weeklyChallengeBonusDateTimestamp;
        }
        Float f2 = f;
        Long l2 = l;
        return vote.copy(voteType, str, oddsChoice, voteResult, f2, l2);
    }

    public static final /* synthetic */ void write$Self$model_release(Vote self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.voteType);
        output.y(serialDesc, 1, self.vote);
        output.h(serialDesc, 2, OddsChoice$$serializer.INSTANCE, self.odds);
        if (output.o(serialDesc) || self.correct != VoteResult.UNKNOWN) {
            output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.correct);
        }
        output.h(serialDesc, 4, c88.a, self.score);
        output.h(serialDesc, 5, lkb.a, self.weeklyChallengeBonusDateTimestamp);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final VoteType getVoteType() {
        return this.voteType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVote() {
        return this.vote;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final OddsChoice getOdds() {
        return this.odds;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final VoteResult getCorrect() {
        return this.correct;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getWeeklyChallengeBonusDateTimestamp() {
        return this.weeklyChallengeBonusDateTimestamp;
    }

    @NotNull
    public final Vote copy(@Nullable VoteType voteType, @NotNull String vote, @Nullable OddsChoice odds, @NotNull VoteResult correct, @Nullable Float score, @Nullable Long weeklyChallengeBonusDateTimestamp) {
        vote.getClass();
        correct.getClass();
        return new Vote(voteType, vote, odds, correct, score, weeklyChallengeBonusDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vote)) {
            return false;
        }
        Vote vote = (Vote) other;
        return this.voteType == vote.voteType && Intrinsics.c(this.vote, vote.vote) && Intrinsics.c(this.odds, vote.odds) && this.correct == vote.correct && Intrinsics.c(this.score, vote.score) && Intrinsics.c(this.weeklyChallengeBonusDateTimestamp, vote.weeklyChallengeBonusDateTimestamp);
    }

    @NotNull
    public final VoteResult getCorrect() {
        return this.correct;
    }

    @Nullable
    public final OddsChoice getOdds() {
        return this.odds;
    }

    @Nullable
    public final Float getScore() {
        return this.score;
    }

    @NotNull
    public final String getVote() {
        return this.vote;
    }

    @Nullable
    public final VoteType getVoteType() {
        return this.voteType;
    }

    @Nullable
    public final Long getWeeklyChallengeBonusDateTimestamp() {
        return this.weeklyChallengeBonusDateTimestamp;
    }

    public int hashCode() {
        VoteType voteType = this.voteType;
        int c = dmi.c((voteType == null ? 0 : voteType.hashCode()) * 31, 31, this.vote);
        OddsChoice oddsChoice = this.odds;
        int hashCode = (this.correct.hashCode() + ((c + (oddsChoice == null ? 0 : oddsChoice.hashCode())) * 31)) * 31;
        Float f = this.score;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Long l = this.weeklyChallengeBonusDateTimestamp;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final void setVote(@NotNull String str) {
        str.getClass();
        this.vote = str;
    }

    @NotNull
    public String toString() {
        return "Vote(voteType=" + this.voteType + ", vote=" + this.vote + ", odds=" + this.odds + ", correct=" + this.correct + ", score=" + this.score + ", weeklyChallengeBonusDateTimestamp=" + this.weeklyChallengeBonusDateTimestamp + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/Vote$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/Vote;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Vote$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Vote(@Nullable VoteType voteType, @NotNull String str, @Nullable OddsChoice oddsChoice, @NotNull VoteResult voteResult, @Nullable Float f, @Nullable Long l) {
        str.getClass();
        voteResult.getClass();
        this.voteType = voteType;
        this.vote = str;
        this.odds = oddsChoice;
        this.correct = voteResult;
        this.score = f;
        this.weeklyChallengeBonusDateTimestamp = l;
    }

    public /* synthetic */ Vote(VoteType voteType, String str, OddsChoice oddsChoice, VoteResult voteResult, Float f, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(voteType, str, oddsChoice, (i & 8) != 0 ? VoteResult.UNKNOWN : voteResult, f, l);
    }
}
