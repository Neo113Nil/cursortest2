package com.sofascore.model.newNetwork;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJp\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001c¨\u0006:"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticAction;", "", "Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "kicks", "punches", "strikes", "significantStrikes", "submissions", "takedowns", "time", "transitions", "<init>", "(Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/MmaStatisticAction;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lcom/sofascore/model/newNetwork/MmaStatisticArea;)Lcom/sofascore/model/newNetwork/MmaStatisticAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "getKicks", "getPunches", "getStrikes", "getSignificantStrikes", "getSubmissions", "getTakedowns", "getTime", "getTransitions", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MmaStatisticAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final MmaStatisticArea kicks;

    @Nullable
    private final MmaStatisticArea punches;

    @Nullable
    private final MmaStatisticArea significantStrikes;

    @Nullable
    private final MmaStatisticArea strikes;

    @Nullable
    private final MmaStatisticArea submissions;

    @Nullable
    private final MmaStatisticArea takedowns;

    @Nullable
    private final MmaStatisticArea time;

    @Nullable
    private final MmaStatisticArea transitions;

    public /* synthetic */ MmaStatisticAction(int i, MmaStatisticArea mmaStatisticArea, MmaStatisticArea mmaStatisticArea2, MmaStatisticArea mmaStatisticArea3, MmaStatisticArea mmaStatisticArea4, MmaStatisticArea mmaStatisticArea5, MmaStatisticArea mmaStatisticArea6, MmaStatisticArea mmaStatisticArea7, MmaStatisticArea mmaStatisticArea8, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, MmaStatisticAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.kicks = mmaStatisticArea;
        this.punches = mmaStatisticArea2;
        this.strikes = mmaStatisticArea3;
        this.significantStrikes = mmaStatisticArea4;
        this.submissions = mmaStatisticArea5;
        this.takedowns = mmaStatisticArea6;
        this.time = mmaStatisticArea7;
        this.transitions = mmaStatisticArea8;
    }

    public static /* synthetic */ MmaStatisticAction copy$default(MmaStatisticAction mmaStatisticAction, MmaStatisticArea mmaStatisticArea, MmaStatisticArea mmaStatisticArea2, MmaStatisticArea mmaStatisticArea3, MmaStatisticArea mmaStatisticArea4, MmaStatisticArea mmaStatisticArea5, MmaStatisticArea mmaStatisticArea6, MmaStatisticArea mmaStatisticArea7, MmaStatisticArea mmaStatisticArea8, int i, Object obj) {
        if ((i & 1) != 0) {
            mmaStatisticArea = mmaStatisticAction.kicks;
        }
        if ((i & 2) != 0) {
            mmaStatisticArea2 = mmaStatisticAction.punches;
        }
        if ((i & 4) != 0) {
            mmaStatisticArea3 = mmaStatisticAction.strikes;
        }
        if ((i & 8) != 0) {
            mmaStatisticArea4 = mmaStatisticAction.significantStrikes;
        }
        if ((i & 16) != 0) {
            mmaStatisticArea5 = mmaStatisticAction.submissions;
        }
        if ((i & 32) != 0) {
            mmaStatisticArea6 = mmaStatisticAction.takedowns;
        }
        if ((i & 64) != 0) {
            mmaStatisticArea7 = mmaStatisticAction.time;
        }
        if ((i & 128) != 0) {
            mmaStatisticArea8 = mmaStatisticAction.transitions;
        }
        MmaStatisticArea mmaStatisticArea9 = mmaStatisticArea7;
        MmaStatisticArea mmaStatisticArea10 = mmaStatisticArea8;
        MmaStatisticArea mmaStatisticArea11 = mmaStatisticArea5;
        MmaStatisticArea mmaStatisticArea12 = mmaStatisticArea6;
        return mmaStatisticAction.copy(mmaStatisticArea, mmaStatisticArea2, mmaStatisticArea3, mmaStatisticArea4, mmaStatisticArea11, mmaStatisticArea12, mmaStatisticArea9, mmaStatisticArea10);
    }

    public static final /* synthetic */ void write$Self$model_release(MmaStatisticAction self, wf3 output, SerialDescriptor serialDesc) {
        MmaStatisticArea$$serializer mmaStatisticArea$$serializer = MmaStatisticArea$$serializer.INSTANCE;
        output.h(serialDesc, 0, mmaStatisticArea$$serializer, self.kicks);
        output.h(serialDesc, 1, mmaStatisticArea$$serializer, self.punches);
        output.h(serialDesc, 2, mmaStatisticArea$$serializer, self.strikes);
        output.h(serialDesc, 3, mmaStatisticArea$$serializer, self.significantStrikes);
        output.h(serialDesc, 4, mmaStatisticArea$$serializer, self.submissions);
        output.h(serialDesc, 5, mmaStatisticArea$$serializer, self.takedowns);
        output.h(serialDesc, 6, mmaStatisticArea$$serializer, self.time);
        output.h(serialDesc, 7, mmaStatisticArea$$serializer, self.transitions);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final MmaStatisticArea getKicks() {
        return this.kicks;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final MmaStatisticArea getPunches() {
        return this.punches;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final MmaStatisticArea getStrikes() {
        return this.strikes;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final MmaStatisticArea getSignificantStrikes() {
        return this.significantStrikes;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final MmaStatisticArea getSubmissions() {
        return this.submissions;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final MmaStatisticArea getTakedowns() {
        return this.takedowns;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final MmaStatisticArea getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final MmaStatisticArea getTransitions() {
        return this.transitions;
    }

    @NotNull
    public final MmaStatisticAction copy(@Nullable MmaStatisticArea kicks, @Nullable MmaStatisticArea punches, @Nullable MmaStatisticArea strikes, @Nullable MmaStatisticArea significantStrikes, @Nullable MmaStatisticArea submissions, @Nullable MmaStatisticArea takedowns, @Nullable MmaStatisticArea time, @Nullable MmaStatisticArea transitions) {
        return new MmaStatisticAction(kicks, punches, strikes, significantStrikes, submissions, takedowns, time, transitions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MmaStatisticAction)) {
            return false;
        }
        MmaStatisticAction mmaStatisticAction = (MmaStatisticAction) other;
        return Intrinsics.c(this.kicks, mmaStatisticAction.kicks) && Intrinsics.c(this.punches, mmaStatisticAction.punches) && Intrinsics.c(this.strikes, mmaStatisticAction.strikes) && Intrinsics.c(this.significantStrikes, mmaStatisticAction.significantStrikes) && Intrinsics.c(this.submissions, mmaStatisticAction.submissions) && Intrinsics.c(this.takedowns, mmaStatisticAction.takedowns) && Intrinsics.c(this.time, mmaStatisticAction.time) && Intrinsics.c(this.transitions, mmaStatisticAction.transitions);
    }

    @Nullable
    public final MmaStatisticArea getKicks() {
        return this.kicks;
    }

    @Nullable
    public final MmaStatisticArea getPunches() {
        return this.punches;
    }

    @Nullable
    public final MmaStatisticArea getSignificantStrikes() {
        return this.significantStrikes;
    }

    @Nullable
    public final MmaStatisticArea getStrikes() {
        return this.strikes;
    }

    @Nullable
    public final MmaStatisticArea getSubmissions() {
        return this.submissions;
    }

    @Nullable
    public final MmaStatisticArea getTakedowns() {
        return this.takedowns;
    }

    @Nullable
    public final MmaStatisticArea getTime() {
        return this.time;
    }

    @Nullable
    public final MmaStatisticArea getTransitions() {
        return this.transitions;
    }

    public int hashCode() {
        MmaStatisticArea mmaStatisticArea = this.kicks;
        int hashCode = (mmaStatisticArea == null ? 0 : mmaStatisticArea.hashCode()) * 31;
        MmaStatisticArea mmaStatisticArea2 = this.punches;
        int hashCode2 = (hashCode + (mmaStatisticArea2 == null ? 0 : mmaStatisticArea2.hashCode())) * 31;
        MmaStatisticArea mmaStatisticArea3 = this.strikes;
        int hashCode3 = (hashCode2 + (mmaStatisticArea3 == null ? 0 : mmaStatisticArea3.hashCode())) * 31;
        MmaStatisticArea mmaStatisticArea4 = this.significantStrikes;
        int hashCode4 = (hashCode3 + (mmaStatisticArea4 == null ? 0 : mmaStatisticArea4.hashCode())) * 31;
        MmaStatisticArea mmaStatisticArea5 = this.submissions;
        int hashCode5 = (hashCode4 + (mmaStatisticArea5 == null ? 0 : mmaStatisticArea5.hashCode())) * 31;
        MmaStatisticArea mmaStatisticArea6 = this.takedowns;
        int hashCode6 = (hashCode5 + (mmaStatisticArea6 == null ? 0 : mmaStatisticArea6.hashCode())) * 31;
        MmaStatisticArea mmaStatisticArea7 = this.time;
        int hashCode7 = (hashCode6 + (mmaStatisticArea7 == null ? 0 : mmaStatisticArea7.hashCode())) * 31;
        MmaStatisticArea mmaStatisticArea8 = this.transitions;
        return hashCode7 + (mmaStatisticArea8 != null ? mmaStatisticArea8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MmaStatisticAction(kicks=" + this.kicks + ", punches=" + this.punches + ", strikes=" + this.strikes + ", significantStrikes=" + this.significantStrikes + ", submissions=" + this.submissions + ", takedowns=" + this.takedowns + ", time=" + this.time + ", transitions=" + this.transitions + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/MmaStatisticAction;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MmaStatisticAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MmaStatisticAction(@Nullable MmaStatisticArea mmaStatisticArea, @Nullable MmaStatisticArea mmaStatisticArea2, @Nullable MmaStatisticArea mmaStatisticArea3, @Nullable MmaStatisticArea mmaStatisticArea4, @Nullable MmaStatisticArea mmaStatisticArea5, @Nullable MmaStatisticArea mmaStatisticArea6, @Nullable MmaStatisticArea mmaStatisticArea7, @Nullable MmaStatisticArea mmaStatisticArea8) {
        this.kicks = mmaStatisticArea;
        this.punches = mmaStatisticArea2;
        this.strikes = mmaStatisticArea3;
        this.significantStrikes = mmaStatisticArea4;
        this.submissions = mmaStatisticArea5;
        this.takedowns = mmaStatisticArea6;
        this.time = mmaStatisticArea7;
        this.transitions = mmaStatisticArea8;
    }
}
