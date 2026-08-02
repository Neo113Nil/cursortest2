package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/PowerRankingsGraphData;", "", "Lcom/sofascore/model/mvvm/model/Event;", "event", "", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "position", "roundType", "<init>", "(Lcom/sofascore/model/mvvm/model/Event;IILjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Event;IILjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PowerRankingsGraphData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Event;", "component2", "()I", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/mvvm/model/Event;IILjava/lang/Integer;)Lcom/sofascore/model/newNetwork/PowerRankingsGraphData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "I", "getRound", "getPosition", "Ljava/lang/Integer;", "getRoundType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PowerRankingsGraphData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Event event;
    private final int position;
    private final int round;

    @Nullable
    private final Integer roundType;

    public /* synthetic */ PowerRankingsGraphData(int i, Event event, int i2, int i3, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, PowerRankingsGraphData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = event;
        this.round = i2;
        this.position = i3;
        if ((i & 8) == 0) {
            this.roundType = null;
        } else {
            this.roundType = num;
        }
    }

    public static /* synthetic */ PowerRankingsGraphData copy$default(PowerRankingsGraphData powerRankingsGraphData, Event event, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            event = powerRankingsGraphData.event;
        }
        if ((i3 & 2) != 0) {
            i = powerRankingsGraphData.round;
        }
        if ((i3 & 4) != 0) {
            i2 = powerRankingsGraphData.position;
        }
        if ((i3 & 8) != 0) {
            num = powerRankingsGraphData.roundType;
        }
        return powerRankingsGraphData.copy(event, i, i2, num);
    }

    public static final /* synthetic */ void write$Self$model_release(PowerRankingsGraphData self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, EventSerializer.INSTANCE, self.event);
        output.u(1, self.round, serialDesc);
        output.u(2, self.position, serialDesc);
        if (!output.o(serialDesc) && self.roundType == null) {
            return;
        }
        output.h(serialDesc, 3, a7a.a, self.roundType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRound() {
        return this.round;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getRoundType() {
        return this.roundType;
    }

    @NotNull
    public final PowerRankingsGraphData copy(@NotNull Event event, int round, int position, @Nullable Integer roundType) {
        event.getClass();
        return new PowerRankingsGraphData(event, round, position, roundType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PowerRankingsGraphData)) {
            return false;
        }
        PowerRankingsGraphData powerRankingsGraphData = (PowerRankingsGraphData) other;
        return Intrinsics.c(this.event, powerRankingsGraphData.event) && this.round == powerRankingsGraphData.round && this.position == powerRankingsGraphData.position && Intrinsics.c(this.roundType, powerRankingsGraphData.roundType);
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getRound() {
        return this.round;
    }

    @Nullable
    public final Integer getRoundType() {
        return this.roundType;
    }

    public int hashCode() {
        int a = wv8.a(this.position, wv8.a(this.round, this.event.hashCode() * 31, 31), 31);
        Integer num = this.roundType;
        return a + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "PowerRankingsGraphData(event=" + this.event + ", round=" + this.round + ", position=" + this.position + ", roundType=" + this.roundType + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PowerRankingsGraphData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PowerRankingsGraphData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PowerRankingsGraphData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PowerRankingsGraphData(@NotNull Event event, int i, int i2, @Nullable Integer num) {
        event.getClass();
        this.event = event;
        this.round = i;
        this.position = i2;
        this.roundType = num;
    }

    public /* synthetic */ PowerRankingsGraphData(Event event, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(event, i, i2, (i3 & 8) != 0 ? null : num);
    }
}
