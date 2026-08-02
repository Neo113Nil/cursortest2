package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.fn0;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t2e;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010\u001eR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00103\u001a\u0004\b4\u0010!\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/sofascore/model/mvvm/model/PerformanceGraphData;", "Ljava/io/Serializable;", "", "week", "position", "", "timeframeStart", "timeframeEnd", "", "Lcom/sofascore/model/mvvm/model/Event;", "events", "<init>", "(IIJJLjava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIJJLjava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/PerformanceGraphData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()J", "component4", "component5", "()Ljava/util/List;", "copy", "(IIJJLjava/util/List;)Lcom/sofascore/model/mvvm/model/PerformanceGraphData;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWeek", "getPosition", "J", "getTimeframeStart", "getTimeframeEnd", "Ljava/util/List;", "getEvents", "setEvents", "(Ljava/util/List;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PerformanceGraphData implements Serializable {

    @NotNull
    private List<? extends Event> events;
    private final int position;
    private final long timeframeEnd;
    private final long timeframeStart;
    private final int week;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new t2e(10))};

    public /* synthetic */ PerformanceGraphData(int i, int i2, int i3, long j, long j2, List list, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, PerformanceGraphData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.week = i2;
        this.position = i3;
        this.timeframeStart = j;
        this.timeframeEnd = j2;
        this.events = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventSerializer.INSTANCE, 0);
    }

    public static /* synthetic */ PerformanceGraphData copy$default(PerformanceGraphData performanceGraphData, int i, int i2, long j, long j2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = performanceGraphData.week;
        }
        if ((i3 & 2) != 0) {
            i2 = performanceGraphData.position;
        }
        if ((i3 & 4) != 0) {
            j = performanceGraphData.timeframeStart;
        }
        if ((i3 & 8) != 0) {
            j2 = performanceGraphData.timeframeEnd;
        }
        if ((i3 & 16) != 0) {
            list = performanceGraphData.events;
        }
        List list2 = list;
        long j3 = j2;
        return performanceGraphData.copy(i, i2, j, j3, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(PerformanceGraphData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.week, serialDesc);
        output.u(1, self.position, serialDesc);
        output.E(serialDesc, 2, self.timeframeStart);
        output.E(serialDesc, 3, self.timeframeEnd);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.events);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWeek() {
        return this.week;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeframeStart() {
        return this.timeframeStart;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimeframeEnd() {
        return this.timeframeEnd;
    }

    @NotNull
    public final List<Event> component5() {
        return this.events;
    }

    @NotNull
    public final PerformanceGraphData copy(int week, int position, long timeframeStart, long timeframeEnd, @NotNull List<? extends Event> events) {
        events.getClass();
        return new PerformanceGraphData(week, position, timeframeStart, timeframeEnd, events);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformanceGraphData)) {
            return false;
        }
        PerformanceGraphData performanceGraphData = (PerformanceGraphData) other;
        return this.week == performanceGraphData.week && this.position == performanceGraphData.position && this.timeframeStart == performanceGraphData.timeframeStart && this.timeframeEnd == performanceGraphData.timeframeEnd && Intrinsics.c(this.events, performanceGraphData.events);
    }

    @NotNull
    public final List<Event> getEvents() {
        return this.events;
    }

    public final int getPosition() {
        return this.position;
    }

    public final long getTimeframeEnd() {
        return this.timeframeEnd;
    }

    public final long getTimeframeStart() {
        return this.timeframeStart;
    }

    public final int getWeek() {
        return this.week;
    }

    public int hashCode() {
        return this.events.hashCode() + ljg.c(ljg.c(wv8.a(this.position, Integer.hashCode(this.week) * 31, 31), 31, this.timeframeStart), 31, this.timeframeEnd);
    }

    public final void setEvents(@NotNull List<? extends Event> list) {
        list.getClass();
        this.events = list;
    }

    @NotNull
    public String toString() {
        int i = this.week;
        int i2 = this.position;
        long j = this.timeframeStart;
        long j2 = this.timeframeEnd;
        List<? extends Event> list = this.events;
        StringBuilder s = lnb.s(i, i2, "PerformanceGraphData(week=", ", position=", ", timeframeStart=");
        s.append(j);
        fn0.t(j2, ", timeframeEnd=", ", events=", s);
        return mz1.p(s, list, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/PerformanceGraphData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/PerformanceGraphData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PerformanceGraphData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PerformanceGraphData(int i, int i2, long j, long j2, @NotNull List<? extends Event> list) {
        list.getClass();
        this.week = i;
        this.position = i2;
        this.timeframeStart = j;
        this.timeframeEnd = j2;
        this.events = list;
    }
}
