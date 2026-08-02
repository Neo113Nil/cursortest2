package com.sofascore.model.mvvm.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import defpackage.fn0;
import defpackage.ljg;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0018¨\u0006/"}, d2 = {"Lcom/sofascore/model/mvvm/model/StatusTime;", "Ljava/io/Serializable;", "", "initial", InneractiveMediationNameConsts.MAX, "timestamp", "extra", "<init>", "(JJJJ)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJJJJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StatusTime;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "component4", "copy", "(JJJJ)Lcom/sofascore/model/mvvm/model/StatusTime;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getInitial", "getMax", "getTimestamp", "getExtra", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatusTime implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long extra;
    private final long initial;
    private final long max;
    private final long timestamp;

    public /* synthetic */ StatusTime(int i, long j, long j2, long j3, long j4, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, StatusTime$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.initial = j;
        this.max = j2;
        this.timestamp = j3;
        this.extra = j4;
    }

    public static /* synthetic */ StatusTime copy$default(StatusTime statusTime, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = statusTime.initial;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = statusTime.max;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = statusTime.timestamp;
        }
        return statusTime.copy(j5, j6, j3, (i & 8) != 0 ? statusTime.extra : j4);
    }

    public static final /* synthetic */ void write$Self$model_release(StatusTime self, wf3 output, SerialDescriptor serialDesc) {
        output.E(serialDesc, 0, self.initial);
        output.E(serialDesc, 1, self.max);
        output.E(serialDesc, 2, self.timestamp);
        output.E(serialDesc, 3, self.extra);
    }

    /* renamed from: component1, reason: from getter */
    public final long getInitial() {
        return this.initial;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMax() {
        return this.max;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final long getExtra() {
        return this.extra;
    }

    @NotNull
    public final StatusTime copy(long initial, long max, long timestamp, long extra) {
        return new StatusTime(initial, max, timestamp, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusTime)) {
            return false;
        }
        StatusTime statusTime = (StatusTime) other;
        return this.initial == statusTime.initial && this.max == statusTime.max && this.timestamp == statusTime.timestamp && this.extra == statusTime.extra;
    }

    public final long getExtra() {
        return this.extra;
    }

    public final long getInitial() {
        return this.initial;
    }

    public final long getMax() {
        return this.max;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.extra) + ljg.c(ljg.c(Long.hashCode(this.initial) * 31, 31, this.max), 31, this.timestamp);
    }

    @NotNull
    public String toString() {
        long j = this.initial;
        long j2 = this.max;
        long j3 = this.timestamp;
        long j4 = this.extra;
        StringBuilder o = ljg.o("StatusTime(initial=", j, ", max=");
        o.append(j2);
        fn0.t(j3, ", timestamp=", ", extra=", o);
        return lnb.l(j4, ")", o);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StatusTime$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StatusTime;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StatusTime$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StatusTime(long j, long j2, long j3, long j4) {
        this.initial = j;
        this.max = j2;
        this.timestamp = j3;
        this.extra = j4;
    }
}
