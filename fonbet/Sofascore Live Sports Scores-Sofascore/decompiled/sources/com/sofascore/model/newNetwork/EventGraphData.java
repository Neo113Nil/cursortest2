package com.sofascore.model.newNetwork;

import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/sofascore/model/newNetwork/EventGraphData;", "Ljava/io/Serializable;", "", "minute", U3.i.X, "<init>", "(DD)V", "", "seen0", "incidentIndex", "Lt5h;", "serializationConstructorMarker", "(IDDILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventGraphData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()D", "component2", "copy", "(DD)Lcom/sofascore/model/newNetwork/EventGraphData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getMinute", "getValue", "I", "getIncidentIndex", "setIncidentIndex", "(I)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventGraphData implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int incidentIndex;
    private final double minute;
    private final double value;

    public /* synthetic */ EventGraphData(int i, double d, double d2, int i2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, EventGraphData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.minute = d;
        this.value = d2;
        if ((i & 4) == 0) {
            this.incidentIndex = 0;
        } else {
            this.incidentIndex = i2;
        }
    }

    public static /* synthetic */ EventGraphData copy$default(EventGraphData eventGraphData, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = eventGraphData.minute;
        }
        if ((i & 2) != 0) {
            d2 = eventGraphData.value;
        }
        return eventGraphData.copy(d, d2);
    }

    public static final /* synthetic */ void write$Self$model_release(EventGraphData self, wf3 output, SerialDescriptor serialDesc) {
        output.D(serialDesc, 0, self.minute);
        output.D(serialDesc, 1, self.value);
        if (!output.o(serialDesc) && self.incidentIndex == 0) {
            return;
        }
        output.u(2, self.incidentIndex, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMinute() {
        return this.minute;
    }

    /* renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @NotNull
    public final EventGraphData copy(double minute, double value) {
        return new EventGraphData(minute, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventGraphData)) {
            return false;
        }
        EventGraphData eventGraphData = (EventGraphData) other;
        return Double.compare(this.minute, eventGraphData.minute) == 0 && Double.compare(this.value, eventGraphData.value) == 0;
    }

    public final int getIncidentIndex() {
        return this.incidentIndex;
    }

    public final double getMinute() {
        return this.minute;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Double.hashCode(this.value) + (Double.hashCode(this.minute) * 31);
    }

    public final void setIncidentIndex(int i) {
        this.incidentIndex = i;
    }

    @NotNull
    public String toString() {
        return "EventGraphData(minute=" + this.minute + ", value=" + this.value + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventGraphData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventGraphData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventGraphData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventGraphData(double d, double d2) {
        this.minute = d;
        this.value = d2;
    }
}
