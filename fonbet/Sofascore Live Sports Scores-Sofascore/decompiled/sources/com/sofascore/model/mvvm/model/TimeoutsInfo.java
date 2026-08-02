package com.sofascore.model.mvvm.model;

import defpackage.lnb;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u000fJ:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u000fJ\u001a\u0010*\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u000f¨\u00062"}, d2 = {"Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "Ljava/io/Serializable;", "", "homeTimeoutsRemaining", "awayTimeoutsRemaining", "Lcom/sofascore/model/mvvm/model/ActiveTimeout;", "activeTimeout", "totalTimeouts", "<init>", "(IILcom/sofascore/model/mvvm/model/ActiveTimeout;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/mvvm/model/ActiveTimeout;ILt5h;)V", "component1", "()I", "component2", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TimeoutsInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "shouldReverseTeams", "getHomeTimeoutsRemaining", "(Z)I", "getAwayTimeoutsRemaining", "component3", "()Lcom/sofascore/model/mvvm/model/ActiveTimeout;", "component4", "copy", "(IILcom/sofascore/model/mvvm/model/ActiveTimeout;I)Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "Lcom/sofascore/model/mvvm/model/ActiveTimeout;", "getActiveTimeout", "getTotalTimeouts", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimeoutsInfo implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final ActiveTimeout activeTimeout;
    private final int awayTimeoutsRemaining;
    private final int homeTimeoutsRemaining;
    private final int totalTimeouts;

    public /* synthetic */ TimeoutsInfo(int i, int i2, int i3, ActiveTimeout activeTimeout, int i4, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, TimeoutsInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeTimeoutsRemaining = i2;
        this.awayTimeoutsRemaining = i3;
        this.activeTimeout = activeTimeout;
        this.totalTimeouts = i4;
    }

    /* renamed from: component1, reason: from getter */
    private final int getHomeTimeoutsRemaining() {
        return this.homeTimeoutsRemaining;
    }

    /* renamed from: component2, reason: from getter */
    private final int getAwayTimeoutsRemaining() {
        return this.awayTimeoutsRemaining;
    }

    public static /* synthetic */ TimeoutsInfo copy$default(TimeoutsInfo timeoutsInfo, int i, int i2, ActiveTimeout activeTimeout, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = timeoutsInfo.homeTimeoutsRemaining;
        }
        if ((i4 & 2) != 0) {
            i2 = timeoutsInfo.awayTimeoutsRemaining;
        }
        if ((i4 & 4) != 0) {
            activeTimeout = timeoutsInfo.activeTimeout;
        }
        if ((i4 & 8) != 0) {
            i3 = timeoutsInfo.totalTimeouts;
        }
        return timeoutsInfo.copy(i, i2, activeTimeout, i3);
    }

    public static final /* synthetic */ void write$Self$model_release(TimeoutsInfo self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.homeTimeoutsRemaining, serialDesc);
        output.u(1, self.awayTimeoutsRemaining, serialDesc);
        output.h(serialDesc, 2, ActiveTimeout$$serializer.INSTANCE, self.activeTimeout);
        output.u(3, self.totalTimeouts, serialDesc);
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ActiveTimeout getActiveTimeout() {
        return this.activeTimeout;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalTimeouts() {
        return this.totalTimeouts;
    }

    @NotNull
    public final TimeoutsInfo copy(int homeTimeoutsRemaining, int awayTimeoutsRemaining, @Nullable ActiveTimeout activeTimeout, int totalTimeouts) {
        return new TimeoutsInfo(homeTimeoutsRemaining, awayTimeoutsRemaining, activeTimeout, totalTimeouts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutsInfo)) {
            return false;
        }
        TimeoutsInfo timeoutsInfo = (TimeoutsInfo) other;
        return this.homeTimeoutsRemaining == timeoutsInfo.homeTimeoutsRemaining && this.awayTimeoutsRemaining == timeoutsInfo.awayTimeoutsRemaining && Intrinsics.c(this.activeTimeout, timeoutsInfo.activeTimeout) && this.totalTimeouts == timeoutsInfo.totalTimeouts;
    }

    @Nullable
    public final ActiveTimeout getActiveTimeout() {
        return this.activeTimeout;
    }

    public final int getAwayTimeoutsRemaining(boolean shouldReverseTeams) {
        return shouldReverseTeams ? this.homeTimeoutsRemaining : this.awayTimeoutsRemaining;
    }

    public final int getHomeTimeoutsRemaining(boolean shouldReverseTeams) {
        return shouldReverseTeams ? this.awayTimeoutsRemaining : this.homeTimeoutsRemaining;
    }

    public final int getTotalTimeouts() {
        return this.totalTimeouts;
    }

    public int hashCode() {
        int a = wv8.a(this.awayTimeoutsRemaining, Integer.hashCode(this.homeTimeoutsRemaining) * 31, 31);
        ActiveTimeout activeTimeout = this.activeTimeout;
        return Integer.hashCode(this.totalTimeouts) + ((a + (activeTimeout == null ? 0 : activeTimeout.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.homeTimeoutsRemaining;
        int i2 = this.awayTimeoutsRemaining;
        ActiveTimeout activeTimeout = this.activeTimeout;
        int i3 = this.totalTimeouts;
        StringBuilder s = lnb.s(i, i2, "TimeoutsInfo(homeTimeoutsRemaining=", ", awayTimeoutsRemaining=", ", activeTimeout=");
        s.append(activeTimeout);
        s.append(", totalTimeouts=");
        s.append(i3);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TimeoutsInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TimeoutsInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TimeoutsInfo(int i, int i2, @Nullable ActiveTimeout activeTimeout, int i3) {
        this.homeTimeoutsRemaining = i;
        this.awayTimeoutsRemaining = i2;
        this.activeTimeout = activeTimeout;
        this.totalTimeouts = i3;
    }
}
