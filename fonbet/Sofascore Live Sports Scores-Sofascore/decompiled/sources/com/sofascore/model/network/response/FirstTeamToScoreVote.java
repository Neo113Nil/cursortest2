package com.sofascore.model.network.response;

import defpackage.fc6;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010'R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010'R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010'¨\u0006."}, d2 = {"Lcom/sofascore/model/network/response/FirstTeamToScoreVote;", "Ljava/io/Serializable;", "", "voteHome", "voteNoGoal", "voteAway", "<init>", "(III)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/FirstTeamToScoreVote;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/sofascore/model/network/response/FirstTeamToScoreVote;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVoteHome", "setVoteHome", "(I)V", "getVoteNoGoal", "setVoteNoGoal", "getVoteAway", "setVoteAway", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FirstTeamToScoreVote implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int voteAway;
    private int voteHome;
    private int voteNoGoal;

    public /* synthetic */ FirstTeamToScoreVote(int i, int i2, int i3, int i4, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FirstTeamToScoreVote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.voteHome = i2;
        this.voteNoGoal = i3;
        this.voteAway = i4;
    }

    public static /* synthetic */ FirstTeamToScoreVote copy$default(FirstTeamToScoreVote firstTeamToScoreVote, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = firstTeamToScoreVote.voteHome;
        }
        if ((i4 & 2) != 0) {
            i2 = firstTeamToScoreVote.voteNoGoal;
        }
        if ((i4 & 4) != 0) {
            i3 = firstTeamToScoreVote.voteAway;
        }
        return firstTeamToScoreVote.copy(i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$model_release(FirstTeamToScoreVote self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.voteHome, serialDesc);
        output.u(1, self.voteNoGoal, serialDesc);
        output.u(2, self.voteAway, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVoteHome() {
        return this.voteHome;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVoteNoGoal() {
        return this.voteNoGoal;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVoteAway() {
        return this.voteAway;
    }

    @NotNull
    public final FirstTeamToScoreVote copy(int voteHome, int voteNoGoal, int voteAway) {
        return new FirstTeamToScoreVote(voteHome, voteNoGoal, voteAway);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstTeamToScoreVote)) {
            return false;
        }
        FirstTeamToScoreVote firstTeamToScoreVote = (FirstTeamToScoreVote) other;
        return this.voteHome == firstTeamToScoreVote.voteHome && this.voteNoGoal == firstTeamToScoreVote.voteNoGoal && this.voteAway == firstTeamToScoreVote.voteAway;
    }

    public final int getVoteAway() {
        return this.voteAway;
    }

    public final int getVoteHome() {
        return this.voteHome;
    }

    public final int getVoteNoGoal() {
        return this.voteNoGoal;
    }

    public int hashCode() {
        return Integer.hashCode(this.voteAway) + wv8.a(this.voteNoGoal, Integer.hashCode(this.voteHome) * 31, 31);
    }

    public final void setVoteAway(int i) {
        this.voteAway = i;
    }

    public final void setVoteHome(int i) {
        this.voteHome = i;
    }

    public final void setVoteNoGoal(int i) {
        this.voteNoGoal = i;
    }

    @NotNull
    public String toString() {
        return fc6.h(this.voteAway, ")", lnb.s(this.voteHome, this.voteNoGoal, "FirstTeamToScoreVote(voteHome=", ", voteNoGoal=", ", voteAway="));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/FirstTeamToScoreVote$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/FirstTeamToScoreVote;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FirstTeamToScoreVote$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FirstTeamToScoreVote(int i, int i2, int i3) {
        this.voteHome = i;
        this.voteNoGoal = i2;
        this.voteAway = i3;
    }
}
