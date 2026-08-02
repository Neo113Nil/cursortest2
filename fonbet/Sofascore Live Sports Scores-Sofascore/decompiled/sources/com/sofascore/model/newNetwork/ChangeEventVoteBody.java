package com.sofascore.model.newNetwork;

import com.sofascore.model.database.VoteType;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/sofascore/model/newNetwork/ChangeEventVoteBody;", "Ljava/io/Serializable;", "", "oldVote", "newVote", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ChangeEventVoteBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/sofascore/model/newNetwork/ChangeEventVoteBody;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOldVote", "getNewVote", "I", "getType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChangeEventVoteBody implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String newVote;

    @NotNull
    private final String oldVote;
    private final int type;

    public /* synthetic */ ChangeEventVoteBody(int i, String str, String str2, int i2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ChangeEventVoteBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.oldVote = str;
        this.newVote = str2;
        if ((i & 4) == 0) {
            this.type = VoteType.WHO_WILL_WIN.getSerializedValue();
        } else {
            this.type = i2;
        }
    }

    public static /* synthetic */ ChangeEventVoteBody copy$default(ChangeEventVoteBody changeEventVoteBody, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = changeEventVoteBody.oldVote;
        }
        if ((i2 & 2) != 0) {
            str2 = changeEventVoteBody.newVote;
        }
        if ((i2 & 4) != 0) {
            i = changeEventVoteBody.type;
        }
        return changeEventVoteBody.copy(str, str2, i);
    }

    public static final /* synthetic */ void write$Self$model_release(ChangeEventVoteBody self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.oldVote);
        output.y(serialDesc, 1, self.newVote);
        if (!output.o(serialDesc) && self.type == VoteType.WHO_WILL_WIN.getSerializedValue()) {
            return;
        }
        output.u(2, self.type, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOldVote() {
        return this.oldVote;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNewVote() {
        return this.newVote;
    }

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final ChangeEventVoteBody copy(@NotNull String oldVote, @NotNull String newVote, int type) {
        oldVote.getClass();
        newVote.getClass();
        return new ChangeEventVoteBody(oldVote, newVote, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeEventVoteBody)) {
            return false;
        }
        ChangeEventVoteBody changeEventVoteBody = (ChangeEventVoteBody) other;
        return Intrinsics.c(this.oldVote, changeEventVoteBody.oldVote) && Intrinsics.c(this.newVote, changeEventVoteBody.newVote) && this.type == changeEventVoteBody.type;
    }

    @NotNull
    public final String getNewVote() {
        return this.newVote;
    }

    @NotNull
    public final String getOldVote() {
        return this.oldVote;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.type) + dmi.c(this.oldVote.hashCode() * 31, 31, this.newVote);
    }

    @NotNull
    public String toString() {
        return fc6.h(this.type, ")", mz1.s("ChangeEventVoteBody(oldVote=", this.oldVote, ", newVote=", this.newVote, ", type="));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ChangeEventVoteBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ChangeEventVoteBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ChangeEventVoteBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChangeEventVoteBody(@NotNull String str, @NotNull String str2, int i) {
        str.getClass();
        str2.getClass();
        this.oldVote = str;
        this.newVote = str2;
        this.type = i;
    }

    public /* synthetic */ ChangeEventVoteBody(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? VoteType.WHO_WILL_WIN.getSerializedValue() : i);
    }
}
