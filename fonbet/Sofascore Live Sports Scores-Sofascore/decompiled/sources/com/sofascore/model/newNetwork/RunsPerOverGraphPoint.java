package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/sofascore/model/newNetwork/RunsPerOverGraphPoint;", "", "", "over", "runs", "", "wickets", "<init>", "(FFLjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IFFLjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/RunsPerOverGraphPoint;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()F", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(FFLjava/lang/Integer;)Lcom/sofascore/model/newNetwork/RunsPerOverGraphPoint;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getOver", "getRuns", "Ljava/lang/Integer;", "getWickets", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RunsPerOverGraphPoint {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float over;
    private final float runs;

    @Nullable
    private final Integer wickets;

    public /* synthetic */ RunsPerOverGraphPoint(int i, float f, float f2, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, RunsPerOverGraphPoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.over = f;
        this.runs = f2;
        this.wickets = num;
    }

    public static /* synthetic */ RunsPerOverGraphPoint copy$default(RunsPerOverGraphPoint runsPerOverGraphPoint, float f, float f2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            f = runsPerOverGraphPoint.over;
        }
        if ((i & 2) != 0) {
            f2 = runsPerOverGraphPoint.runs;
        }
        if ((i & 4) != 0) {
            num = runsPerOverGraphPoint.wickets;
        }
        return runsPerOverGraphPoint.copy(f, f2, num);
    }

    public static final /* synthetic */ void write$Self$model_release(RunsPerOverGraphPoint self, wf3 output, SerialDescriptor serialDesc) {
        output.t(serialDesc, 0, self.over);
        output.t(serialDesc, 1, self.runs);
        output.h(serialDesc, 2, a7a.a, self.wickets);
    }

    /* renamed from: component1, reason: from getter */
    public final float getOver() {
        return this.over;
    }

    /* renamed from: component2, reason: from getter */
    public final float getRuns() {
        return this.runs;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getWickets() {
        return this.wickets;
    }

    @NotNull
    public final RunsPerOverGraphPoint copy(float over, float runs, @Nullable Integer wickets) {
        return new RunsPerOverGraphPoint(over, runs, wickets);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunsPerOverGraphPoint)) {
            return false;
        }
        RunsPerOverGraphPoint runsPerOverGraphPoint = (RunsPerOverGraphPoint) other;
        return Float.compare(this.over, runsPerOverGraphPoint.over) == 0 && Float.compare(this.runs, runsPerOverGraphPoint.runs) == 0 && Intrinsics.c(this.wickets, runsPerOverGraphPoint.wickets);
    }

    public final float getOver() {
        return this.over;
    }

    public final float getRuns() {
        return this.runs;
    }

    @Nullable
    public final Integer getWickets() {
        return this.wickets;
    }

    public int hashCode() {
        int a = fc6.a(this.runs, Float.hashCode(this.over) * 31, 31);
        Integer num = this.wickets;
        return a + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        float f = this.over;
        float f2 = this.runs;
        Integer num = this.wickets;
        StringBuilder sb = new StringBuilder("RunsPerOverGraphPoint(over=");
        sb.append(f);
        sb.append(", runs=");
        sb.append(f2);
        sb.append(", wickets=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/RunsPerOverGraphPoint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/RunsPerOverGraphPoint;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RunsPerOverGraphPoint$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RunsPerOverGraphPoint(float f, float f2, @Nullable Integer num) {
        this.over = f;
        this.runs = f2;
        this.wickets = num;
    }
}
