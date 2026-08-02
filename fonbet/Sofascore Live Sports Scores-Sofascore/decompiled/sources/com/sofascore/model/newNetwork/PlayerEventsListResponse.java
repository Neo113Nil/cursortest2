package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics$$serializer;
import com.sofascore.model.network.response.serializers.EventSerializer;
import com.sofascore.model.player.PlayerEventIncidents;
import com.sofascore.model.player.PlayerEventIncidents$$serializer;
import defpackage.a7a;
import defpackage.boe;
import defpackage.gz1;
import defpackage.joa;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002/.B\u007f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\t\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0010\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R3\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b,\u0010+R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerEventsListResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/mvvm/model/Event;", "events", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "playedForTeamMap", "", "Lcom/sofascore/model/player/PlayerEventIncidents;", "incidentsMap", "Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;", "statisticsMap", "", "onBenchMap", "<init>", "(Ljava/util/List;Ljava/util/HashMap;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/HashMap;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerEventsListResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getEvents", "()Ljava/util/List;", "Ljava/util/HashMap;", "getPlayedForTeamMap", "()Ljava/util/HashMap;", "Ljava/util/Map;", "getIncidentsMap", "()Ljava/util/Map;", "getStatisticsMap", "getOnBenchMap", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerEventsListResponse extends NetworkResponse {

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
    private final Map<Integer, Boolean> onBenchMap;

    @NotNull
    private final HashMap<Integer, Integer> playedForTeamMap;

    @NotNull
    private final Map<Integer, PlayerMatchesEventStatistics> statisticsMap;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new boe(8)), ypa.a(ysaVar, new boe(9)), ypa.a(ysaVar, new boe(10)), ypa.a(ysaVar, new boe(11)), ypa.a(ysaVar, new boe(12))};
    }

    public /* synthetic */ PlayerEventsListResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, HashMap hashMap, Map map, Map map2, Map map3, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if ((i & 4) == 0) {
            this.events = new ArrayList();
        } else {
            this.events = list;
        }
        if ((i & 8) == 0) {
            this.playedForTeamMap = new HashMap<>();
        } else {
            this.playedForTeamMap = hashMap;
        }
        if ((i & 16) == 0) {
            this.incidentsMap = new HashMap();
        } else {
            this.incidentsMap = map;
        }
        if ((i & 32) == 0) {
            this.statisticsMap = new HashMap();
        } else {
            this.statisticsMap = map2;
        }
        if ((i & 64) == 0) {
            this.onBenchMap = new HashMap();
        } else {
            this.onBenchMap = map3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventSerializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        a7a a7aVar = a7a.a;
        return new q79(a7aVar, a7aVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new q79(a7a.a, PlayerEventIncidents$$serializer.INSTANCE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new q79(a7a.a, PlayerMatchesEventStatistics$$serializer.INSTANCE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new q79(a7a.a, gz1.a, 1);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerEventsListResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || !Intrinsics.c(self.events, new ArrayList())) {
            output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.events);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.playedForTeamMap, new HashMap())) {
            output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.playedForTeamMap);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.incidentsMap, new HashMap())) {
            output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.incidentsMap);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.statisticsMap, new HashMap())) {
            output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.statisticsMap);
        }
        if (!output.o(serialDesc) && Intrinsics.c(self.onBenchMap, new HashMap())) {
            return;
        }
        output.f(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.onBenchMap);
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
    public final Map<Integer, Boolean> getOnBenchMap() {
        return this.onBenchMap;
    }

    @NotNull
    public final HashMap<Integer, Integer> getPlayedForTeamMap() {
        return this.playedForTeamMap;
    }

    @NotNull
    public final Map<Integer, PlayerMatchesEventStatistics> getStatisticsMap() {
        return this.statisticsMap;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerEventsListResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerEventsListResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerEventsListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerEventsListResponse() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerEventsListResponse(@NotNull List<? extends Event> list, @NotNull HashMap<Integer, Integer> hashMap, @NotNull Map<Integer, PlayerEventIncidents> map, @NotNull Map<Integer, PlayerMatchesEventStatistics> map2, @NotNull Map<Integer, Boolean> map3) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        hashMap.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.events = list;
        this.playedForTeamMap = hashMap;
        this.incidentsMap = map;
        this.statisticsMap = map2;
        this.onBenchMap = map3;
    }

    public /* synthetic */ PlayerEventsListResponse(List list, HashMap hashMap, Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new HashMap() : hashMap, (i & 4) != 0 ? new HashMap() : map, (i & 8) != 0 ? new HashMap() : map2, (i & 16) != 0 ? new HashMap() : map3);
    }
}
