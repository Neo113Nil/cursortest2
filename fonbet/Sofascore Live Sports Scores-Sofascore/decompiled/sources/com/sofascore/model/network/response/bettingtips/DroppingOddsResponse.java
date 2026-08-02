package com.sofascore.model.network.response.bettingtips;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.bettingtips.DroppingOdds;
import com.sofascore.model.mvvm.model.bettingtips.DroppingOdds$$serializer;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wc4;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006-"}, d2 = {"Lcom/sofascore/model/network/response/bettingtips/DroppingOddsResponse;", "", "", "Lcom/sofascore/model/mvvm/model/Event;", "events", "", "", "Lcom/sofascore/model/mvvm/model/bettingtips/DroppingOdds;", "oddsMap", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/bettingtips/DroppingOddsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/sofascore/model/network/response/bettingtips/DroppingOddsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents", "Ljava/util/Map;", "getOddsMap", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DroppingOddsResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Event> events;

    @NotNull
    private final Map<Integer, DroppingOdds> oddsMap;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new wc4(26)), ypa.a(ysaVar, new wc4(27))};
    }

    public /* synthetic */ DroppingOddsResponse(int i, List list, Map map, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, DroppingOddsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.events = list;
        this.oddsMap = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventSerializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new q79(a7a.a, DroppingOdds$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DroppingOddsResponse copy$default(DroppingOddsResponse droppingOddsResponse, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = droppingOddsResponse.events;
        }
        if ((i & 2) != 0) {
            map = droppingOddsResponse.oddsMap;
        }
        return droppingOddsResponse.copy(list, map);
    }

    public static final /* synthetic */ void write$Self$model_release(DroppingOddsResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.events);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.oddsMap);
    }

    @NotNull
    public final List<Event> component1() {
        return this.events;
    }

    @NotNull
    public final Map<Integer, DroppingOdds> component2() {
        return this.oddsMap;
    }

    @NotNull
    public final DroppingOddsResponse copy(@NotNull List<? extends Event> events, @NotNull Map<Integer, DroppingOdds> oddsMap) {
        events.getClass();
        oddsMap.getClass();
        return new DroppingOddsResponse(events, oddsMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DroppingOddsResponse)) {
            return false;
        }
        DroppingOddsResponse droppingOddsResponse = (DroppingOddsResponse) other;
        return Intrinsics.c(this.events, droppingOddsResponse.events) && Intrinsics.c(this.oddsMap, droppingOddsResponse.oddsMap);
    }

    @NotNull
    public final List<Event> getEvents() {
        return this.events;
    }

    @NotNull
    public final Map<Integer, DroppingOdds> getOddsMap() {
        return this.oddsMap;
    }

    public int hashCode() {
        return this.oddsMap.hashCode() + (this.events.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DroppingOddsResponse(events=" + this.events + ", oddsMap=" + this.oddsMap + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/bettingtips/DroppingOddsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/bettingtips/DroppingOddsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DroppingOddsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DroppingOddsResponse(@NotNull List<? extends Event> list, @NotNull Map<Integer, DroppingOdds> map) {
        list.getClass();
        map.getClass();
        this.events = list;
        this.oddsMap = map;
    }
}
