package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import com.sofascore.model.player.PlayerEventIncidents;
import com.sofascore.model.player.PlayerEventIncidents$$serializer;
import defpackage.a7a;
import defpackage.joa;
import defpackage.oea;
import defpackage.ogb;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bBk\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"¨\u0006&"}, d2 = {"Lcom/sofascore/model/newNetwork/ManagerEventsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/mvvm/model/Event;", "events", "", "", "managedTeamMap", "Lcom/sofascore/model/player/PlayerEventIncidents;", "incidentsMap", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ManagerEventsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getEvents", "()Ljava/util/List;", "Ljava/util/Map;", "getManagedTeamMap", "()Ljava/util/Map;", "getIncidentsMap", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManagerEventsResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Event> events;

    @NotNull
    private final Map<Integer, PlayerEventIncidents> incidentsMap;

    @NotNull
    private final Map<Integer, Integer> managedTeamMap;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new ogb(20)), ypa.a(ysaVar, new ogb(21)), ypa.a(ysaVar, new ogb(22))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ManagerEventsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, Map map, Map map2, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (28 != (i & 28)) {
            oea.z(i, 28, ManagerEventsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.events = list;
        this.managedTeamMap = map;
        this.incidentsMap = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventSerializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        a7a a7aVar = a7a.a;
        return new q79(a7aVar, a7aVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new q79(a7a.a, PlayerEventIncidents$$serializer.INSTANCE, 1);
    }

    public static final /* synthetic */ void write$Self$model_release(ManagerEventsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.events);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.managedTeamMap);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.incidentsMap);
    }

    @NotNull
    public final List<Event> getEvents() {
        return this.events;
    }

    @NotNull
    public final Map<Integer, PlayerEventIncidents> getIncidentsMap() {
        return this.incidentsMap;
    }

    @NotNull
    public final Map<Integer, Integer> getManagedTeamMap() {
        return this.managedTeamMap;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ManagerEventsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ManagerEventsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ManagerEventsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ManagerEventsResponse(@NotNull List<? extends Event> list, @NotNull Map<Integer, Integer> map, @NotNull Map<Integer, PlayerEventIncidents> map2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        map.getClass();
        map2.getClass();
        this.events = list;
        this.managedTeamMap = map;
        this.incidentsMap = map2;
    }
}
