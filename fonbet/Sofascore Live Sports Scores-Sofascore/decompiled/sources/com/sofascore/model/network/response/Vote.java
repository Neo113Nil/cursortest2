package com.sofascore.model.network.response;

import defpackage.a7a;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010(R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010%\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010(R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/sofascore/model/network/response/Vote;", "Ljava/io/Serializable;", "", "vote1", "vote2", "voteX", "<init>", "(IILjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/Vote;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(IILjava/lang/Integer;)Lcom/sofascore/model/network/response/Vote;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVote1", "setVote1", "(I)V", "getVote2", "setVote2", "Ljava/lang/Integer;", "getVoteX", "setVoteX", "(Ljava/lang/Integer;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Vote implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int vote1;
    private int vote2;

    @Nullable
    private Integer voteX;

    public /* synthetic */ Vote(int i, int i2, int i3, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, Vote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.vote1 = i2;
        this.vote2 = i3;
        this.voteX = num;
    }

    public static /* synthetic */ Vote copy$default(Vote vote, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = vote.vote1;
        }
        if ((i3 & 2) != 0) {
            i2 = vote.vote2;
        }
        if ((i3 & 4) != 0) {
            num = vote.voteX;
        }
        return vote.copy(i, i2, num);
    }

    public static final /* synthetic */ void write$Self$model_release(Vote self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.vote1, serialDesc);
        output.u(1, self.vote2, serialDesc);
        output.h(serialDesc, 2, a7a.a, self.voteX);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVote1() {
        return this.vote1;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVote2() {
        return this.vote2;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getVoteX() {
        return this.voteX;
    }

    @NotNull
    public final Vote copy(int vote1, int vote2, @Nullable Integer voteX) {
        return new Vote(vote1, vote2, voteX);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vote)) {
            return false;
        }
        Vote vote = (Vote) other;
        return this.vote1 == vote.vote1 && this.vote2 == vote.vote2 && Intrinsics.c(this.voteX, vote.voteX);
    }

    public final int getVote1() {
        return this.vote1;
    }

    public final int getVote2() {
        return this.vote2;
    }

    @Nullable
    public final Integer getVoteX() {
        return this.voteX;
    }

    public int hashCode() {
        int a = wv8.a(this.vote2, Integer.hashCode(this.vote1) * 31, 31);
        Integer num = this.voteX;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final void setVote1(int i) {
        this.vote1 = i;
    }

    public final void setVote2(int i) {
        this.vote2 = i;
    }

    public final void setVoteX(@Nullable Integer num) {
        this.voteX = num;
    }

    @NotNull
    public String toString() {
        int i = this.vote1;
        int i2 = this.vote2;
        return vxd.n(lnb.s(i, i2, "Vote(vote1=", ", vote2=", ", voteX="), this.voteX, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/Vote$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/Vote;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    public Vote(int i, int i2, @Nullable Integer num) {
        this.vote1 = i;
        this.vote2 = i2;
        this.voteX = num;
    }
}
