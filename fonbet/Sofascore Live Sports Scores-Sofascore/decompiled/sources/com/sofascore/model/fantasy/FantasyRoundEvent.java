package com.sofascore.model.fantasy;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.mz1;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundEvent;", "", "Lcom/sofascore/model/mvvm/model/Event;", "event", "", "sequence", "", "roundName", "<init>", "(Lcom/sofascore/model/mvvm/model/Event;ILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Event;ILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyRoundEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Event;", "component2", "()I", "component3", "()Ljava/lang/String;", "copy", "(Lcom/sofascore/model/mvvm/model/Event;ILjava/lang/String;)Lcom/sofascore/model/fantasy/FantasyRoundEvent;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "I", "getSequence", "Ljava/lang/String;", "getRoundName", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRoundEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Event event;

    @NotNull
    private final String roundName;
    private final int sequence;

    public /* synthetic */ FantasyRoundEvent(int i, Event event, int i2, String str, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyRoundEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = event;
        this.sequence = i2;
        this.roundName = str;
    }

    public static /* synthetic */ FantasyRoundEvent copy$default(FantasyRoundEvent fantasyRoundEvent, Event event, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            event = fantasyRoundEvent.event;
        }
        if ((i2 & 2) != 0) {
            i = fantasyRoundEvent.sequence;
        }
        if ((i2 & 4) != 0) {
            str = fantasyRoundEvent.roundName;
        }
        return fantasyRoundEvent.copy(event, i, str);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyRoundEvent self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, EventSerializer.INSTANCE, self.event);
        output.u(1, self.sequence, serialDesc);
        output.y(serialDesc, 2, self.roundName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSequence() {
        return this.sequence;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRoundName() {
        return this.roundName;
    }

    @NotNull
    public final FantasyRoundEvent copy(@NotNull Event event, int sequence, @NotNull String roundName) {
        event.getClass();
        roundName.getClass();
        return new FantasyRoundEvent(event, sequence, roundName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyRoundEvent)) {
            return false;
        }
        FantasyRoundEvent fantasyRoundEvent = (FantasyRoundEvent) other;
        return Intrinsics.c(this.event, fantasyRoundEvent.event) && this.sequence == fantasyRoundEvent.sequence && Intrinsics.c(this.roundName, fantasyRoundEvent.roundName);
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    @NotNull
    public final String getRoundName() {
        return this.roundName;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        return this.roundName.hashCode() + wv8.a(this.sequence, this.event.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        Event event = this.event;
        int i = this.sequence;
        String str = this.roundName;
        StringBuilder sb = new StringBuilder("FantasyRoundEvent(event=");
        sb.append(event);
        sb.append(", sequence=");
        sb.append(i);
        sb.append(", roundName=");
        return mz1.o(sb, str, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyRoundEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyRoundEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyRoundEvent(@NotNull Event event, int i, @NotNull String str) {
        event.getClass();
        str.getClass();
        this.event = event;
        this.sequence = i;
        this.roundName = str;
    }
}
