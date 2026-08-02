package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001bR\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0017¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceStage;", "Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceEntry;", "", "stage", "position", "", "out", "<init>", "(ILjava/lang/Integer;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceStage;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "copy", "(ILjava/lang/Integer;Z)Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceStage;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getStage", "Ljava/lang/Integer;", "getPosition", "Z", "getOut", "getEntry", "entry", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageDriverPerformanceRaceStage implements StageDriverPerformanceRaceEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean out;

    @Nullable
    private final Integer position;
    private final int stage;

    public /* synthetic */ StageDriverPerformanceRaceStage(int i, int i2, Integer num, boolean z, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, StageDriverPerformanceRaceStage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stage = i2;
        this.position = num;
        if ((i & 4) == 0) {
            this.out = false;
        } else {
            this.out = z;
        }
    }

    public static /* synthetic */ StageDriverPerformanceRaceStage copy$default(StageDriverPerformanceRaceStage stageDriverPerformanceRaceStage, int i, Integer num, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stageDriverPerformanceRaceStage.stage;
        }
        if ((i2 & 2) != 0) {
            num = stageDriverPerformanceRaceStage.position;
        }
        if ((i2 & 4) != 0) {
            z = stageDriverPerformanceRaceStage.out;
        }
        return stageDriverPerformanceRaceStage.copy(i, num, z);
    }

    public static final /* synthetic */ void write$Self$model_release(StageDriverPerformanceRaceStage self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.stage, serialDesc);
        output.h(serialDesc, 1, a7a.a, self.getPosition());
        if (output.o(serialDesc) || self.getOut()) {
            output.x(serialDesc, 2, self.getOut());
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getStage() {
        return this.stage;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOut() {
        return this.out;
    }

    @NotNull
    public final StageDriverPerformanceRaceStage copy(int stage, @Nullable Integer position, boolean out) {
        return new StageDriverPerformanceRaceStage(stage, position, out);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageDriverPerformanceRaceStage)) {
            return false;
        }
        StageDriverPerformanceRaceStage stageDriverPerformanceRaceStage = (StageDriverPerformanceRaceStage) other;
        return this.stage == stageDriverPerformanceRaceStage.stage && Intrinsics.c(this.position, stageDriverPerformanceRaceStage.position) && this.out == stageDriverPerformanceRaceStage.out;
    }

    @Override // com.sofascore.model.newNetwork.StageDriverPerformanceRaceEntry
    public int getEntry() {
        return this.stage;
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

    public final int getStage() {
        return this.stage;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.stage) * 31;
        Integer num = this.position;
        return Boolean.hashCode(this.out) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.stage;
        Integer num = this.position;
        return wt3.p(fc6.r("StageDriverPerformanceRaceStage(stage=", ", position=", ", out=", num, i), this.out, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceStage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceStage;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageDriverPerformanceRaceStage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageDriverPerformanceRaceStage(int i, @Nullable Integer num, boolean z) {
        this.stage = i;
        this.position = num;
        this.out = z;
    }

    public /* synthetic */ StageDriverPerformanceRaceStage(int i, Integer num, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, (i2 & 4) != 0 ? false : z);
    }
}
