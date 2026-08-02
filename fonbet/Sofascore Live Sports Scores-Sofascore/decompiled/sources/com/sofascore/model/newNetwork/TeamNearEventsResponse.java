package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006BC\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0005\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamNearEventsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/mvvm/model/Event;", "previousEvent", "nextEvent", "<init>", "(Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Event;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Event;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamNearEventsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Event;", "component2", "copy", "(Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Event;)Lcom/sofascore/model/newNetwork/TeamNearEventsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Event;", "getPreviousEvent", "getNextEvent", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamNearEventsResponse extends NetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Event nextEvent;

    @Nullable
    private final Event previousEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeamNearEventsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, Event event, Event event2, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, TeamNearEventsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.previousEvent = event;
        this.nextEvent = event2;
    }

    public static /* synthetic */ TeamNearEventsResponse copy$default(TeamNearEventsResponse teamNearEventsResponse, Event event, Event event2, int i, Object obj) {
        if ((i & 1) != 0) {
            event = teamNearEventsResponse.previousEvent;
        }
        if ((i & 2) != 0) {
            event2 = teamNearEventsResponse.nextEvent;
        }
        return teamNearEventsResponse.copy(event, event2);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamNearEventsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        EventSerializer eventSerializer = EventSerializer.INSTANCE;
        output.h(serialDesc, 2, eventSerializer, self.previousEvent);
        output.h(serialDesc, 3, eventSerializer, self.nextEvent);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Event getPreviousEvent() {
        return this.previousEvent;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Event getNextEvent() {
        return this.nextEvent;
    }

    @NotNull
    public final TeamNearEventsResponse copy(@Nullable Event previousEvent, @Nullable Event nextEvent) {
        return new TeamNearEventsResponse(previousEvent, nextEvent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamNearEventsResponse)) {
            return false;
        }
        TeamNearEventsResponse teamNearEventsResponse = (TeamNearEventsResponse) other;
        return Intrinsics.c(this.previousEvent, teamNearEventsResponse.previousEvent) && Intrinsics.c(this.nextEvent, teamNearEventsResponse.nextEvent);
    }

    @Nullable
    public final Event getNextEvent() {
        return this.nextEvent;
    }

    @Nullable
    public final Event getPreviousEvent() {
        return this.previousEvent;
    }

    public int hashCode() {
        Event event = this.previousEvent;
        int hashCode = (event == null ? 0 : event.hashCode()) * 31;
        Event event2 = this.nextEvent;
        return hashCode + (event2 != null ? event2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TeamNearEventsResponse(previousEvent=" + this.previousEvent + ", nextEvent=" + this.nextEvent + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamNearEventsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamNearEventsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamNearEventsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamNearEventsResponse(@Nullable Event event, @Nullable Event event2) {
        super((HeadResponse) null, (ErrorResponse) null, 3, (DefaultConstructorMarker) null);
        this.previousEvent = event;
        this.nextEvent = event2;
    }
}
