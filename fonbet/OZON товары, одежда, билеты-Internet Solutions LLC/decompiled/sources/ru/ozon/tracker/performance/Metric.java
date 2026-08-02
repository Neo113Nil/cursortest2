package ru.ozon.tracker.performance;

import Qj0.InterfaceC3892l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\nJ\u0010\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/tracker/performance/Metric;", "", "LQj0/l;", "type", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(LQj0/l;J)V", "", "getMetricName$tracker_sdk_release", "()Ljava/lang/String;", "getMetricName", "", "isStart$tracker_sdk_release", "()Z", "isStart", "isEnd$tracker_sdk_release", "isEnd", "isInterval$tracker_sdk_release", "isInterval", "other", "", "compareTo", "(Lru/ozon/tracker/performance/Metric;)I", "component1", "()LQj0/l;", "component2", "()J", "copy", "(LQj0/l;J)Lru/ozon/tracker/performance/Metric;", "toString", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "LQj0/l;", "getType", "J", "getValue", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Metric implements Comparable<Metric> {

    @NotNull
    private final InterfaceC3892l type;
    private final long value;

    public Metric(@NotNull InterfaceC3892l type, long j11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.value = j11;
    }

    public static /* synthetic */ Metric copy$default(Metric metric, InterfaceC3892l interfaceC3892l, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC3892l = metric.type;
        }
        if ((i11 & 2) != 0) {
            j11 = metric.value;
        }
        return metric.copy(interfaceC3892l, j11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InterfaceC3892l getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @NotNull
    public final Metric copy(@NotNull InterfaceC3892l type, long value) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Metric(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) other;
        return Intrinsics.d(this.type, metric.type) && this.value == metric.value;
    }

    @NotNull
    public final String getMetricName$tracker_sdk_release() {
        return this.type.getMetricName();
    }

    @NotNull
    public final InterfaceC3892l getType() {
        return this.type;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value) + (this.type.hashCode() * 31);
    }

    public final boolean isEnd$tracker_sdk_release() {
        return h.A(this.type.getName(), "_END", false);
    }

    public final boolean isInterval$tracker_sdk_release() {
        return this.type.getIsInterval();
    }

    public final boolean isStart$tracker_sdk_release() {
        return h.A(this.type.getName(), "_START", false);
    }

    @NotNull
    public String toString() {
        return "Metric(type=" + this.type + ", value=" + this.value + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Metric other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.type.getName().compareTo(other.type.getName());
    }
}
