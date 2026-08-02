package com.sofascore.model.network.response;

import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010%R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;", "Ljava/io/Serializable;", "", "voteYes", "voteNo", "<init>", "(II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVoteYes", "setVoteYes", "(I)V", "getVoteNo", "setVoteNo", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WillBothTeamsScoreVote implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int voteNo;
    private int voteYes;

    public /* synthetic */ WillBothTeamsScoreVote(int i, int i2, int i3, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, WillBothTeamsScoreVote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.voteYes = i2;
        this.voteNo = i3;
    }

    public static /* synthetic */ WillBothTeamsScoreVote copy$default(WillBothTeamsScoreVote willBothTeamsScoreVote, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = willBothTeamsScoreVote.voteYes;
        }
        if ((i3 & 2) != 0) {
            i2 = willBothTeamsScoreVote.voteNo;
        }
        return willBothTeamsScoreVote.copy(i, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(WillBothTeamsScoreVote self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.voteYes, serialDesc);
        output.u(1, self.voteNo, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVoteYes() {
        return this.voteYes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVoteNo() {
        return this.voteNo;
    }

    @NotNull
    public final WillBothTeamsScoreVote copy(int voteYes, int voteNo) {
        return new WillBothTeamsScoreVote(voteYes, voteNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WillBothTeamsScoreVote)) {
            return false;
        }
        WillBothTeamsScoreVote willBothTeamsScoreVote = (WillBothTeamsScoreVote) other;
        return this.voteYes == willBothTeamsScoreVote.voteYes && this.voteNo == willBothTeamsScoreVote.voteNo;
    }

    public final int getVoteNo() {
        return this.voteNo;
    }

    public final int getVoteYes() {
        return this.voteYes;
    }

    public int hashCode() {
        return Integer.hashCode(this.voteNo) + (Integer.hashCode(this.voteYes) * 31);
    }

    public final void setVoteNo(int i) {
        this.voteNo = i;
    }

    public final void setVoteYes(int i) {
        this.voteYes = i;
    }

    @NotNull
    public String toString() {
        return lnb.j(this.voteYes, this.voteNo, "WillBothTeamsScoreVote(voteYes=", ", voteNo=", ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/WillBothTeamsScoreVote$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/WillBothTeamsScoreVote;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WillBothTeamsScoreVote$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WillBothTeamsScoreVote(int i, int i2) {
        this.voteYes = i;
        this.voteNo = i2;
    }
}
