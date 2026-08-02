package com.sofascore.model.newNetwork;

import defpackage.ljg;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001c¨\u0006/"}, d2 = {"Lcom/sofascore/model/newNetwork/UserPrediction;", "", "", "eventId", "", "eventStartTimestamp", "Lcom/sofascore/model/newNetwork/Votes;", "votes", "<init>", "(IJLcom/sofascore/model/newNetwork/Votes;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIJLcom/sofascore/model/newNetwork/Votes;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UserPrediction;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()J", "component3", "()Lcom/sofascore/model/newNetwork/Votes;", "copy", "(IJLcom/sofascore/model/newNetwork/Votes;)Lcom/sofascore/model/newNetwork/UserPrediction;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEventId", "J", "getEventStartTimestamp", "Lcom/sofascore/model/newNetwork/Votes;", "getVotes", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserPrediction {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int eventId;
    private final long eventStartTimestamp;

    @NotNull
    private final Votes votes;

    public /* synthetic */ UserPrediction(int i, int i2, long j, Votes votes, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, UserPrediction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = i2;
        this.eventStartTimestamp = j;
        this.votes = votes;
    }

    public static /* synthetic */ UserPrediction copy$default(UserPrediction userPrediction, int i, long j, Votes votes, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userPrediction.eventId;
        }
        if ((i2 & 2) != 0) {
            j = userPrediction.eventStartTimestamp;
        }
        if ((i2 & 4) != 0) {
            votes = userPrediction.votes;
        }
        return userPrediction.copy(i, j, votes);
    }

    public static final /* synthetic */ void write$Self$model_release(UserPrediction self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.eventId, serialDesc);
        output.E(serialDesc, 1, self.eventStartTimestamp);
        output.f(serialDesc, 2, Votes$$serializer.INSTANCE, self.votes);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEventStartTimestamp() {
        return this.eventStartTimestamp;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Votes getVotes() {
        return this.votes;
    }

    @NotNull
    public final UserPrediction copy(int eventId, long eventStartTimestamp, @NotNull Votes votes) {
        votes.getClass();
        return new UserPrediction(eventId, eventStartTimestamp, votes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPrediction)) {
            return false;
        }
        UserPrediction userPrediction = (UserPrediction) other;
        return this.eventId == userPrediction.eventId && this.eventStartTimestamp == userPrediction.eventStartTimestamp && Intrinsics.c(this.votes, userPrediction.votes);
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final long getEventStartTimestamp() {
        return this.eventStartTimestamp;
    }

    @NotNull
    public final Votes getVotes() {
        return this.votes;
    }

    public int hashCode() {
        return this.votes.hashCode() + ljg.c(Integer.hashCode(this.eventId) * 31, 31, this.eventStartTimestamp);
    }

    @NotNull
    public String toString() {
        return "UserPrediction(eventId=" + this.eventId + ", eventStartTimestamp=" + this.eventStartTimestamp + ", votes=" + this.votes + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UserPrediction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UserPrediction;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserPrediction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserPrediction(int i, long j, @NotNull Votes votes) {
        votes.getClass();
        this.eventId = i;
        this.eventStartTimestamp = j;
        this.votes = votes;
    }
}
