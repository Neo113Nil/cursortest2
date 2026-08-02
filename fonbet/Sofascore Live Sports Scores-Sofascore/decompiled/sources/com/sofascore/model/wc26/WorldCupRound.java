package com.sofascore.model.wc26;

import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lcom/sofascore/model/wc26/WorldCupRound;", "", "", "startTimestamp", "endTimestamp", "", "normalizedRoundDuration", "<init>", "(JJF)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJJFLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/wc26/WorldCupRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()F", "copy", "(JJF)Lcom/sofascore/model/wc26/WorldCupRound;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getStartTimestamp", "getEndTimestamp", "F", "getNormalizedRoundDuration", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WorldCupRound {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long endTimestamp;
    private final float normalizedRoundDuration;
    private final long startTimestamp;

    public /* synthetic */ WorldCupRound(int i, long j, long j2, float f, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, WorldCupRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.startTimestamp = j;
        this.endTimestamp = j2;
        this.normalizedRoundDuration = f;
    }

    public static /* synthetic */ WorldCupRound copy$default(WorldCupRound worldCupRound, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = worldCupRound.startTimestamp;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = worldCupRound.endTimestamp;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = worldCupRound.normalizedRoundDuration;
        }
        return worldCupRound.copy(j3, j4, f);
    }

    public static final /* synthetic */ void write$Self$model_release(WorldCupRound self, wf3 output, SerialDescriptor serialDesc) {
        output.E(serialDesc, 0, self.startTimestamp);
        output.E(serialDesc, 1, self.endTimestamp);
        output.t(serialDesc, 2, self.normalizedRoundDuration);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final float getNormalizedRoundDuration() {
        return this.normalizedRoundDuration;
    }

    @NotNull
    public final WorldCupRound copy(long startTimestamp, long endTimestamp, float normalizedRoundDuration) {
        return new WorldCupRound(startTimestamp, endTimestamp, normalizedRoundDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCupRound)) {
            return false;
        }
        WorldCupRound worldCupRound = (WorldCupRound) other;
        return this.startTimestamp == worldCupRound.startTimestamp && this.endTimestamp == worldCupRound.endTimestamp && Float.compare(this.normalizedRoundDuration, worldCupRound.normalizedRoundDuration) == 0;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final float getNormalizedRoundDuration() {
        return this.normalizedRoundDuration;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        return Float.hashCode(this.normalizedRoundDuration) + ljg.c(Long.hashCode(this.startTimestamp) * 31, 31, this.endTimestamp);
    }

    @NotNull
    public String toString() {
        long j = this.startTimestamp;
        long j2 = this.endTimestamp;
        float f = this.normalizedRoundDuration;
        StringBuilder o = ljg.o("WorldCupRound(startTimestamp=", j, ", endTimestamp=");
        o.append(j2);
        o.append(", normalizedRoundDuration=");
        o.append(f);
        o.append(")");
        return o.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/wc26/WorldCupRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/wc26/WorldCupRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WorldCupRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WorldCupRound(long j, long j2, float f) {
        this.startTimestamp = j;
        this.endTimestamp = j2;
        this.normalizedRoundDuration = f;
    }
}
