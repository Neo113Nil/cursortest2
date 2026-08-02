package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010 R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001a¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceLap;", "Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceEntry;", "", "lap", "position", "", "tyreType", "", "visitedPitStop", "out", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;ZZ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/String;ZZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceLap;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "copy", "(ILjava/lang/Integer;Ljava/lang/String;ZZ)Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceLap;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getLap", "Ljava/lang/Integer;", "getPosition", "Ljava/lang/String;", "getTyreType", "Z", "getVisitedPitStop", "getOut", "getEntry", "entry", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageDriverPerformanceRaceLap implements StageDriverPerformanceRaceEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int lap;
    private final boolean out;

    @Nullable
    private final Integer position;

    @Nullable
    private final String tyreType;
    private final boolean visitedPitStop;

    public /* synthetic */ StageDriverPerformanceRaceLap(int i, int i2, Integer num, String str, boolean z, boolean z2, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, StageDriverPerformanceRaceLap$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.lap = i2;
        this.position = num;
        this.tyreType = str;
        if ((i & 8) == 0) {
            this.visitedPitStop = false;
        } else {
            this.visitedPitStop = z;
        }
        if ((i & 16) == 0) {
            this.out = false;
        } else {
            this.out = z2;
        }
    }

    public static /* synthetic */ StageDriverPerformanceRaceLap copy$default(StageDriverPerformanceRaceLap stageDriverPerformanceRaceLap, int i, Integer num, String str, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stageDriverPerformanceRaceLap.lap;
        }
        if ((i2 & 2) != 0) {
            num = stageDriverPerformanceRaceLap.position;
        }
        if ((i2 & 4) != 0) {
            str = stageDriverPerformanceRaceLap.tyreType;
        }
        if ((i2 & 8) != 0) {
            z = stageDriverPerformanceRaceLap.visitedPitStop;
        }
        if ((i2 & 16) != 0) {
            z2 = stageDriverPerformanceRaceLap.out;
        }
        boolean z3 = z2;
        String str2 = str;
        return stageDriverPerformanceRaceLap.copy(i, num, str2, z, z3);
    }

    public static final /* synthetic */ void write$Self$model_release(StageDriverPerformanceRaceLap self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.lap, serialDesc);
        output.h(serialDesc, 1, a7a.a, self.getPosition());
        output.h(serialDesc, 2, uhi.a, self.tyreType);
        if (output.o(serialDesc) || self.visitedPitStop) {
            output.x(serialDesc, 3, self.visitedPitStop);
        }
        if (output.o(serialDesc) || self.getOut()) {
            output.x(serialDesc, 4, self.getOut());
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getLap() {
        return this.lap;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTyreType() {
        return this.tyreType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getVisitedPitStop() {
        return this.visitedPitStop;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOut() {
        return this.out;
    }

    @NotNull
    public final StageDriverPerformanceRaceLap copy(int lap, @Nullable Integer position, @Nullable String tyreType, boolean visitedPitStop, boolean out) {
        return new StageDriverPerformanceRaceLap(lap, position, tyreType, visitedPitStop, out);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageDriverPerformanceRaceLap)) {
            return false;
        }
        StageDriverPerformanceRaceLap stageDriverPerformanceRaceLap = (StageDriverPerformanceRaceLap) other;
        return this.lap == stageDriverPerformanceRaceLap.lap && Intrinsics.c(this.position, stageDriverPerformanceRaceLap.position) && Intrinsics.c(this.tyreType, stageDriverPerformanceRaceLap.tyreType) && this.visitedPitStop == stageDriverPerformanceRaceLap.visitedPitStop && this.out == stageDriverPerformanceRaceLap.out;
    }

    @Override // com.sofascore.model.newNetwork.StageDriverPerformanceRaceEntry
    public int getEntry() {
        return this.lap;
    }

    public final int getLap() {
        return this.lap;
    }

    @Override // com.sofascore.model.newNetwork.StageDriverPerformanceRaceEntry
    public boolean getOut() {
        return this.out;
    }

    @Override // com.sofascore.model.newNetwork.StageDriverPerformanceRaceEntry
    @Nullable
    public Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final String getTyreType() {
        return this.tyreType;
    }

    public final boolean getVisitedPitStop() {
        return this.visitedPitStop;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.lap) * 31;
        Integer num = this.position;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.tyreType;
        return Boolean.hashCode(this.out) + dmi.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.visitedPitStop);
    }

    @NotNull
    public String toString() {
        int i = this.lap;
        Integer num = this.position;
        String str = this.tyreType;
        boolean z = this.visitedPitStop;
        boolean z2 = this.out;
        StringBuilder r = fc6.r("StageDriverPerformanceRaceLap(lap=", ", position=", ", tyreType=", num, i);
        dmi.w(r, str, ", visitedPitStop=", z, ", out=");
        return wt3.p(r, z2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceLap$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceLap;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageDriverPerformanceRaceLap$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageDriverPerformanceRaceLap(int i, @Nullable Integer num, @Nullable String str, boolean z, boolean z2) {
        this.lap = i;
        this.position = num;
        this.tyreType = str;
        this.visitedPitStop = z;
        this.out = z2;
    }

    public /* synthetic */ StageDriverPerformanceRaceLap(int i, Integer num, String str, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }
}
