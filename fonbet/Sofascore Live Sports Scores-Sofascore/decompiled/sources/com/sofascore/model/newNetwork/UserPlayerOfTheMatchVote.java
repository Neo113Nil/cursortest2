package com.sofascore.model.newNetwork;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006)"}, d2 = {"Lcom/sofascore/model/newNetwork/UserPlayerOfTheMatchVote;", "", "", "playerId", "", "startDateTimestamp", "<init>", "(IJ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UserPlayerOfTheMatchVote;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()J", "copy", "(IJ)Lcom/sofascore/model/newNetwork/UserPlayerOfTheMatchVote;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPlayerId", "J", "getStartDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserPlayerOfTheMatchVote {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int playerId;
    private final long startDateTimestamp;

    public /* synthetic */ UserPlayerOfTheMatchVote(int i, int i2, long j, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, UserPlayerOfTheMatchVote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.playerId = i2;
        this.startDateTimestamp = j;
    }

    public static /* synthetic */ UserPlayerOfTheMatchVote copy$default(UserPlayerOfTheMatchVote userPlayerOfTheMatchVote, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userPlayerOfTheMatchVote.playerId;
        }
        if ((i2 & 2) != 0) {
            j = userPlayerOfTheMatchVote.startDateTimestamp;
        }
        return userPlayerOfTheMatchVote.copy(i, j);
    }

    public static final /* synthetic */ void write$Self$model_release(UserPlayerOfTheMatchVote self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.playerId, serialDesc);
        output.E(serialDesc, 1, self.startDateTimestamp);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final UserPlayerOfTheMatchVote copy(int playerId, long startDateTimestamp) {
        return new UserPlayerOfTheMatchVote(playerId, startDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPlayerOfTheMatchVote)) {
            return false;
        }
        UserPlayerOfTheMatchVote userPlayerOfTheMatchVote = (UserPlayerOfTheMatchVote) other;
        return this.playerId == userPlayerOfTheMatchVote.playerId && this.startDateTimestamp == userPlayerOfTheMatchVote.startDateTimestamp;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.startDateTimestamp) + (Integer.hashCode(this.playerId) * 31);
    }

    @NotNull
    public String toString() {
        return "UserPlayerOfTheMatchVote(playerId=" + this.playerId + ", startDateTimestamp=" + this.startDateTimestamp + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UserPlayerOfTheMatchVote$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UserPlayerOfTheMatchVote;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserPlayerOfTheMatchVote$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserPlayerOfTheMatchVote(int i, long j) {
        this.playerId = i;
        this.startDateTimestamp = j;
    }
}
