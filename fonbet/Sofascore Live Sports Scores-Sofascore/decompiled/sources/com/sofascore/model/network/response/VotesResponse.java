package com.sofascore.model.network.response;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$¨\u0006;"}, d2 = {"Lcom/sofascore/model/network/response/VotesResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "Lcom/sofascore/model/network/response/Vote;", "vote", "Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;", "bothTeamsToScoreVote", "Lcom/sofascore/model/network/response/FirstTeamToScoreVote;", "firstTeamToScoreVote", "Lcom/sofascore/model/network/response/MmaPostMatchVote;", "whoShouldHaveWonVote", "<init>", "(Lcom/sofascore/model/network/response/Vote;Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;Lcom/sofascore/model/network/response/FirstTeamToScoreVote;Lcom/sofascore/model/network/response/MmaPostMatchVote;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/Vote;Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;Lcom/sofascore/model/network/response/FirstTeamToScoreVote;Lcom/sofascore/model/network/response/MmaPostMatchVote;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/VotesResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/network/response/Vote;", "component2", "()Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;", "component3", "()Lcom/sofascore/model/network/response/FirstTeamToScoreVote;", "component4", "()Lcom/sofascore/model/network/response/MmaPostMatchVote;", "copy", "(Lcom/sofascore/model/network/response/Vote;Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;Lcom/sofascore/model/network/response/FirstTeamToScoreVote;Lcom/sofascore/model/network/response/MmaPostMatchVote;)Lcom/sofascore/model/network/response/VotesResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/network/response/Vote;", "getVote", "Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;", "getBothTeamsToScoreVote", "Lcom/sofascore/model/network/response/FirstTeamToScoreVote;", "getFirstTeamToScoreVote", "Lcom/sofascore/model/network/response/MmaPostMatchVote;", "getWhoShouldHaveWonVote", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VotesResponse extends AbstractNetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final WillBothTeamsScoreVote bothTeamsToScoreVote;

    @NotNull
    private final FirstTeamToScoreVote firstTeamToScoreVote;

    @NotNull
    private final Vote vote;

    @Nullable
    private final MmaPostMatchVote whoShouldHaveWonVote;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VotesResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, Vote vote, WillBothTeamsScoreVote willBothTeamsScoreVote, FirstTeamToScoreVote firstTeamToScoreVote, MmaPostMatchVote mmaPostMatchVote, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, VotesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.vote = vote;
        this.bothTeamsToScoreVote = willBothTeamsScoreVote;
        this.firstTeamToScoreVote = firstTeamToScoreVote;
        this.whoShouldHaveWonVote = mmaPostMatchVote;
    }

    public static /* synthetic */ VotesResponse copy$default(VotesResponse votesResponse, Vote vote, WillBothTeamsScoreVote willBothTeamsScoreVote, FirstTeamToScoreVote firstTeamToScoreVote, MmaPostMatchVote mmaPostMatchVote, int i, Object obj) {
        if ((i & 1) != 0) {
            vote = votesResponse.vote;
        }
        if ((i & 2) != 0) {
            willBothTeamsScoreVote = votesResponse.bothTeamsToScoreVote;
        }
        if ((i & 4) != 0) {
            firstTeamToScoreVote = votesResponse.firstTeamToScoreVote;
        }
        if ((i & 8) != 0) {
            mmaPostMatchVote = votesResponse.whoShouldHaveWonVote;
        }
        return votesResponse.copy(vote, willBothTeamsScoreVote, firstTeamToScoreVote, mmaPostMatchVote);
    }

    public static final /* synthetic */ void write$Self$model_release(VotesResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        output.f(serialDesc, 2, Vote$$serializer.INSTANCE, self.vote);
        output.f(serialDesc, 3, WillBothTeamsScoreVote$$serializer.INSTANCE, self.bothTeamsToScoreVote);
        output.f(serialDesc, 4, FirstTeamToScoreVote$$serializer.INSTANCE, self.firstTeamToScoreVote);
        output.h(serialDesc, 5, MmaPostMatchVote$$serializer.INSTANCE, self.whoShouldHaveWonVote);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Vote getVote() {
        return this.vote;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WillBothTeamsScoreVote getBothTeamsToScoreVote() {
        return this.bothTeamsToScoreVote;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FirstTeamToScoreVote getFirstTeamToScoreVote() {
        return this.firstTeamToScoreVote;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final MmaPostMatchVote getWhoShouldHaveWonVote() {
        return this.whoShouldHaveWonVote;
    }

    @NotNull
    public final VotesResponse copy(@NotNull Vote vote, @NotNull WillBothTeamsScoreVote bothTeamsToScoreVote, @NotNull FirstTeamToScoreVote firstTeamToScoreVote, @Nullable MmaPostMatchVote whoShouldHaveWonVote) {
        vote.getClass();
        bothTeamsToScoreVote.getClass();
        firstTeamToScoreVote.getClass();
        return new VotesResponse(vote, bothTeamsToScoreVote, firstTeamToScoreVote, whoShouldHaveWonVote);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VotesResponse)) {
            return false;
        }
        VotesResponse votesResponse = (VotesResponse) other;
        return Intrinsics.c(this.vote, votesResponse.vote) && Intrinsics.c(this.bothTeamsToScoreVote, votesResponse.bothTeamsToScoreVote) && Intrinsics.c(this.firstTeamToScoreVote, votesResponse.firstTeamToScoreVote) && Intrinsics.c(this.whoShouldHaveWonVote, votesResponse.whoShouldHaveWonVote);
    }

    @NotNull
    public final WillBothTeamsScoreVote getBothTeamsToScoreVote() {
        return this.bothTeamsToScoreVote;
    }

    @NotNull
    public final FirstTeamToScoreVote getFirstTeamToScoreVote() {
        return this.firstTeamToScoreVote;
    }

    @NotNull
    public final Vote getVote() {
        return this.vote;
    }

    @Nullable
    public final MmaPostMatchVote getWhoShouldHaveWonVote() {
        return this.whoShouldHaveWonVote;
    }

    public int hashCode() {
        int hashCode = (this.firstTeamToScoreVote.hashCode() + ((this.bothTeamsToScoreVote.hashCode() + (this.vote.hashCode() * 31)) * 31)) * 31;
        MmaPostMatchVote mmaPostMatchVote = this.whoShouldHaveWonVote;
        return hashCode + (mmaPostMatchVote == null ? 0 : mmaPostMatchVote.hashCode());
    }

    @NotNull
    public String toString() {
        return "VotesResponse(vote=" + this.vote + ", bothTeamsToScoreVote=" + this.bothTeamsToScoreVote + ", firstTeamToScoreVote=" + this.firstTeamToScoreVote + ", whoShouldHaveWonVote=" + this.whoShouldHaveWonVote + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/VotesResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/VotesResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VotesResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VotesResponse(@NotNull Vote vote, @NotNull WillBothTeamsScoreVote willBothTeamsScoreVote, @NotNull FirstTeamToScoreVote firstTeamToScoreVote, @Nullable MmaPostMatchVote mmaPostMatchVote) {
        super((HeadResponse) null, (HeadResponse) null, 3, (DefaultConstructorMarker) null);
        vote.getClass();
        willBothTeamsScoreVote.getClass();
        firstTeamToScoreVote.getClass();
        this.vote = vote;
        this.bothTeamsToScoreVote = willBothTeamsScoreVote;
        this.firstTeamToScoreVote = firstTeamToScoreVote;
        this.whoShouldHaveWonVote = mmaPostMatchVote;
    }
}
