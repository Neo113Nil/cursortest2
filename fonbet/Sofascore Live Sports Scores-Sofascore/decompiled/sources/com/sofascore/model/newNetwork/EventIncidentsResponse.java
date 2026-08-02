package com.sofascore.model.newNetwork;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.IncidentSerializer;
import com.sofascore.model.newNetwork.commentary.TeamShirtColors;
import com.sofascore.model.newNetwork.commentary.TeamShirtColors$$serializer;
import defpackage.joa;
import defpackage.oea;
import defpackage.ph0;
import defpackage.q5h;
import defpackage.qt5;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBc\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J8\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010'R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010<¨\u0006?"}, d2 = {"Lcom/sofascore/model/newNetwork/EventIncidentsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/mvvm/model/Incident;", "incidents", "Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;", "homeShirtColors", "awayShirtColors", "<init>", "(Ljava/util/List;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "", "", "sportsWithSuspensionIncidents", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Ljava/util/Set;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventIncidentsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", SearchResponseKt.SPORT_ENTITY, "Lcom/sofascore/model/mvvm/model/Event;", "event", "mapIncidents", "(Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Event;)Lcom/sofascore/model/newNetwork/EventIncidentsResponse;", "component1", "()Ljava/util/List;", "component2", "()Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;", "component3", "copy", "(Ljava/util/List;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;)Lcom/sofascore/model/newNetwork/EventIncidentsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIncidents", "Lcom/sofascore/model/newNetwork/commentary/TeamShirtColors;", "getHomeShirtColors", "getHomeShirtColors$annotations", "()V", "getAwayShirtColors", "getAwayShirtColors$annotations", "Ljava/util/Set;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventIncidentsResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final TeamShirtColors awayShirtColors;

    @Nullable
    private final TeamShirtColors homeShirtColors;

    @NotNull
    private final List<Incident> incidents;

    @NotNull
    private final Set<String> sportsWithSuspensionIncidents;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new qt5(8)), null, null, ypa.a(ysaVar, new qt5(9))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventIncidentsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, TeamShirtColors teamShirtColors, TeamShirtColors teamShirtColors2, Set set, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (28 != (i & 28)) {
            oea.z(i, 28, EventIncidentsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.incidents = list;
        this.homeShirtColors = teamShirtColors;
        this.awayShirtColors = teamShirtColors2;
        if ((i & 32) == 0) {
            this.sportsWithSuspensionIncidents = ph0.a0(new String[]{Sports.MINI_FOOTBALL, Sports.ICE_HOCKEY, Sports.HANDBALL});
        } else {
            this.sportsWithSuspensionIncidents = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(IncidentSerializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(uhi.a, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventIncidentsResponse copy$default(EventIncidentsResponse eventIncidentsResponse, List list, TeamShirtColors teamShirtColors, TeamShirtColors teamShirtColors2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventIncidentsResponse.incidents;
        }
        if ((i & 2) != 0) {
            teamShirtColors = eventIncidentsResponse.homeShirtColors;
        }
        if ((i & 4) != 0) {
            teamShirtColors2 = eventIncidentsResponse.awayShirtColors;
        }
        return eventIncidentsResponse.copy(list, teamShirtColors, teamShirtColors2);
    }

    public static /* synthetic */ EventIncidentsResponse mapIncidents$default(EventIncidentsResponse eventIncidentsResponse, String str, Event event, int i, Object obj) {
        if ((i & 2) != 0) {
            event = null;
        }
        return eventIncidentsResponse.mapIncidents(str, event);
    }

    public static final void write$Self$model_release(EventIncidentsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.incidents);
        TeamShirtColors$$serializer teamShirtColors$$serializer = TeamShirtColors$$serializer.INSTANCE;
        output.h(serialDesc, 3, teamShirtColors$$serializer, self.homeShirtColors);
        output.h(serialDesc, 4, teamShirtColors$$serializer, self.awayShirtColors);
        if (!output.o(serialDesc) && Intrinsics.c(self.sportsWithSuspensionIncidents, ph0.a0(new String[]{Sports.MINI_FOOTBALL, Sports.ICE_HOCKEY, Sports.HANDBALL}))) {
            return;
        }
        output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.sportsWithSuspensionIncidents);
    }

    @NotNull
    public final List<Incident> component1() {
        return this.incidents;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TeamShirtColors getHomeShirtColors() {
        return this.homeShirtColors;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final TeamShirtColors getAwayShirtColors() {
        return this.awayShirtColors;
    }

    @NotNull
    public final EventIncidentsResponse copy(@NotNull List<? extends Incident> incidents, @Nullable TeamShirtColors homeShirtColors, @Nullable TeamShirtColors awayShirtColors) {
        incidents.getClass();
        return new EventIncidentsResponse(incidents, homeShirtColors, awayShirtColors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventIncidentsResponse)) {
            return false;
        }
        EventIncidentsResponse eventIncidentsResponse = (EventIncidentsResponse) other;
        return Intrinsics.c(this.incidents, eventIncidentsResponse.incidents) && Intrinsics.c(this.homeShirtColors, eventIncidentsResponse.homeShirtColors) && Intrinsics.c(this.awayShirtColors, eventIncidentsResponse.awayShirtColors);
    }

    @Nullable
    public final TeamShirtColors getAwayShirtColors() {
        return this.awayShirtColors;
    }

    @Nullable
    public final TeamShirtColors getHomeShirtColors() {
        return this.homeShirtColors;
    }

    @NotNull
    public final List<Incident> getIncidents() {
        return this.incidents;
    }

    public int hashCode() {
        int hashCode = this.incidents.hashCode() * 31;
        TeamShirtColors teamShirtColors = this.homeShirtColors;
        int hashCode2 = (hashCode + (teamShirtColors == null ? 0 : teamShirtColors.hashCode())) * 31;
        TeamShirtColors teamShirtColors2 = this.awayShirtColors;
        return hashCode2 + (teamShirtColors2 != null ? teamShirtColors2.hashCode() : 0);
    }

    @NotNull
    public final EventIncidentsResponse mapIncidents(@NotNull String sport, @Nullable Event event) {
        sport.getClass();
        boolean shouldReverseTeams = event != null ? event.shouldReverseTeams() : false;
        List B0 = CollectionsKt.B0(this.incidents);
        ArrayList<Incident> arrayList = new ArrayList();
        for (Object obj : B0) {
            Incident incident = (Incident) obj;
            if (!(incident instanceof Incident.UnknownIncident) && (!(incident instanceof Incident.SuspensionIncident) || this.sportsWithSuspensionIncidents.contains(sport))) {
                arrayList.add(obj);
            }
        }
        int i = -1000;
        for (Incident incident2 : arrayList) {
            if ((incident2 instanceof Incident.PeriodIncident) || (incident2 instanceof Incident.InjuryTimeIncident)) {
                incident2.setId(Integer.valueOf(i));
                i++;
            }
            incident2.setSport(sport);
            incident2.setShouldReverseTeams(shouldReverseTeams);
        }
        return copy$default(this, CollectionsKt.B0(arrayList), null, null, 6, null);
    }

    @NotNull
    public String toString() {
        return "EventIncidentsResponse(incidents=" + this.incidents + ", homeShirtColors=" + this.homeShirtColors + ", awayShirtColors=" + this.awayShirtColors + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventIncidentsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventIncidentsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventIncidentsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("away")
    public static /* synthetic */ void getAwayShirtColors$annotations() {
    }

    @q5h("home")
    public static /* synthetic */ void getHomeShirtColors$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventIncidentsResponse(@NotNull List<? extends Incident> list, @Nullable TeamShirtColors teamShirtColors, @Nullable TeamShirtColors teamShirtColors2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.incidents = list;
        this.homeShirtColors = teamShirtColors;
        this.awayShirtColors = teamShirtColors2;
        this.sportsWithSuspensionIncidents = ph0.a0(new String[]{Sports.MINI_FOOTBALL, Sports.ICE_HOCKEY, Sports.HANDBALL});
    }
}
