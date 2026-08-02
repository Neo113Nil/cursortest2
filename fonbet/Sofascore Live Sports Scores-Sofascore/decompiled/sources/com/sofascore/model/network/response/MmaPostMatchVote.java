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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010%R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/sofascore/model/network/response/MmaPostMatchVote;", "Ljava/io/Serializable;", "", "vote1", "vote2", "<init>", "(II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/MmaPostMatchVote;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/sofascore/model/network/response/MmaPostMatchVote;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVote1", "setVote1", "(I)V", "getVote2", "setVote2", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MmaPostMatchVote implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int vote1;
    private int vote2;

    public /* synthetic */ MmaPostMatchVote(int i, int i2, int i3, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, MmaPostMatchVote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.vote1 = i2;
        this.vote2 = i3;
    }

    public static /* synthetic */ MmaPostMatchVote copy$default(MmaPostMatchVote mmaPostMatchVote, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mmaPostMatchVote.vote1;
        }
        if ((i3 & 2) != 0) {
            i2 = mmaPostMatchVote.vote2;
        }
        return mmaPostMatchVote.copy(i, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(MmaPostMatchVote self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.vote1, serialDesc);
        output.u(1, self.vote2, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVote1() {
        return this.vote1;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVote2() {
        return this.vote2;
    }

    @NotNull
    public final MmaPostMatchVote copy(int vote1, int vote2) {
        return new MmaPostMatchVote(vote1, vote2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MmaPostMatchVote)) {
            return false;
        }
        MmaPostMatchVote mmaPostMatchVote = (MmaPostMatchVote) other;
        return this.vote1 == mmaPostMatchVote.vote1 && this.vote2 == mmaPostMatchVote.vote2;
    }

    public final int getVote1() {
        return this.vote1;
    }

    public final int getVote2() {
        return this.vote2;
    }

    public int hashCode() {
        return Integer.hashCode(this.vote2) + (Integer.hashCode(this.vote1) * 31);
    }

    public final void setVote1(int i) {
        this.vote1 = i;
    }

    public final void setVote2(int i) {
        this.vote2 = i;
    }

    @NotNull
    public String toString() {
        return lnb.j(this.vote1, this.vote2, "MmaPostMatchVote(vote1=", ", vote2=", ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/MmaPostMatchVote$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/MmaPostMatchVote;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MmaPostMatchVote$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MmaPostMatchVote(int i, int i2) {
        this.vote1 = i;
        this.vote2 = i2;
    }
}
