package com.sofascore.model.newNetwork;

import com.sofascore.model.database.VoteType;
import defpackage.gz1;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, d2 = {"Lcom/sofascore/model/newNetwork/EventVoteBody;", "Ljava/io/Serializable;", "", "vote", "", "type", "", "dailyBonus", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventVoteBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;ILjava/lang/Boolean;)Lcom/sofascore/model/newNetwork/EventVoteBody;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVote", "I", "getType", "Ljava/lang/Boolean;", "getDailyBonus", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventVoteBody implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean dailyBonus;
    private final int type;

    @NotNull
    private final String vote;

    public /* synthetic */ EventVoteBody(int i, String str, int i2, Boolean bool, t5h t5hVar) {
        if (5 != (i & 5)) {
            oea.z(i, 5, EventVoteBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.vote = str;
        if ((i & 2) == 0) {
            this.type = VoteType.WHO_WILL_WIN.getSerializedValue();
        } else {
            this.type = i2;
        }
        this.dailyBonus = bool;
    }

    public static /* synthetic */ EventVoteBody copy$default(EventVoteBody eventVoteBody, String str, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eventVoteBody.vote;
        }
        if ((i2 & 2) != 0) {
            i = eventVoteBody.type;
        }
        if ((i2 & 4) != 0) {
            bool = eventVoteBody.dailyBonus;
        }
        return eventVoteBody.copy(str, i, bool);
    }

    public static final /* synthetic */ void write$Self$model_release(EventVoteBody self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.vote);
        if (output.o(serialDesc) || self.type != VoteType.WHO_WILL_WIN.getSerializedValue()) {
            output.u(1, self.type, serialDesc);
        }
        output.h(serialDesc, 2, gz1.a, self.dailyBonus);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVote() {
        return this.vote;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getDailyBonus() {
        return this.dailyBonus;
    }

    @NotNull
    public final EventVoteBody copy(@NotNull String vote, int type, @Nullable Boolean dailyBonus) {
        vote.getClass();
        return new EventVoteBody(vote, type, dailyBonus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventVoteBody)) {
            return false;
        }
        EventVoteBody eventVoteBody = (EventVoteBody) other;
        return Intrinsics.c(this.vote, eventVoteBody.vote) && this.type == eventVoteBody.type && Intrinsics.c(this.dailyBonus, eventVoteBody.dailyBonus);
    }

    @Nullable
    public final Boolean getDailyBonus() {
        return this.dailyBonus;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getVote() {
        return this.vote;
    }

    public int hashCode() {
        int a = wv8.a(this.type, this.vote.hashCode() * 31, 31);
        Boolean bool = this.dailyBonus;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.vote;
        int i = this.type;
        Boolean bool = this.dailyBonus;
        StringBuilder q = mz1.q(i, "EventVoteBody(vote=", str, ", type=", ", dailyBonus=");
        q.append(bool);
        q.append(")");
        return q.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventVoteBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventVoteBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventVoteBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventVoteBody(@NotNull String str, int i, @Nullable Boolean bool) {
        str.getClass();
        this.vote = str;
        this.type = i;
        this.dailyBonus = bool;
    }

    public /* synthetic */ EventVoteBody(String str, int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? VoteType.WHO_WILL_WIN.getSerializedValue() : i, bool);
    }
}
