package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wc4;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/DistinctEventSet;", "", "", "", "eventIds", "uniqueTournamentIds", "liveEvents", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/DistinctEventSet;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()I", "copy", "(Ljava/util/List;Ljava/util/List;I)Lcom/sofascore/model/newNetwork/DistinctEventSet;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEventIds", "getUniqueTournamentIds", "I", "getLiveEvents", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DistinctEventSet {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Integer> eventIds;
    private final int liveEvents;

    @NotNull
    private final List<Integer> uniqueTournamentIds;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new wc4(14)), ypa.a(ysaVar, new wc4(15)), null};
    }

    public /* synthetic */ DistinctEventSet(int i, List list, List list2, int i2, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, DistinctEventSet$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventIds = list;
        this.uniqueTournamentIds = list2;
        this.liveEvents = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistinctEventSet copy$default(DistinctEventSet distinctEventSet, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = distinctEventSet.eventIds;
        }
        if ((i2 & 2) != 0) {
            list2 = distinctEventSet.uniqueTournamentIds;
        }
        if ((i2 & 4) != 0) {
            i = distinctEventSet.liveEvents;
        }
        return distinctEventSet.copy(list, list2, i);
    }

    public static final /* synthetic */ void write$Self$model_release(DistinctEventSet self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.eventIds);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.uniqueTournamentIds);
        output.u(2, self.liveEvents, serialDesc);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.eventIds;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.uniqueTournamentIds;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLiveEvents() {
        return this.liveEvents;
    }

    @NotNull
    public final DistinctEventSet copy(@NotNull List<Integer> eventIds, @NotNull List<Integer> uniqueTournamentIds, int liveEvents) {
        eventIds.getClass();
        uniqueTournamentIds.getClass();
        return new DistinctEventSet(eventIds, uniqueTournamentIds, liveEvents);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistinctEventSet)) {
            return false;
        }
        DistinctEventSet distinctEventSet = (DistinctEventSet) other;
        return Intrinsics.c(this.eventIds, distinctEventSet.eventIds) && Intrinsics.c(this.uniqueTournamentIds, distinctEventSet.uniqueTournamentIds) && this.liveEvents == distinctEventSet.liveEvents;
    }

    @NotNull
    public final List<Integer> getEventIds() {
        return this.eventIds;
    }

    public final int getLiveEvents() {
        return this.liveEvents;
    }

    @NotNull
    public final List<Integer> getUniqueTournamentIds() {
        return this.uniqueTournamentIds;
    }

    public int hashCode() {
        return Integer.hashCode(this.liveEvents) + dmi.d(this.eventIds.hashCode() * 31, 31, this.uniqueTournamentIds);
    }

    @NotNull
    public String toString() {
        return fc6.h(this.liveEvents, ")", fc6.s("DistinctEventSet(eventIds=", ", uniqueTournamentIds=", ", liveEvents=", this.eventIds, this.uniqueTournamentIds));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/DistinctEventSet$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/DistinctEventSet;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DistinctEventSet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DistinctEventSet(@NotNull List<Integer> list, @NotNull List<Integer> list2, int i) {
        list.getClass();
        list2.getClass();
        this.eventIds = list;
        this.uniqueTournamentIds = list2;
        this.liveEvents = i;
    }
}
