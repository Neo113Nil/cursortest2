package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.eej;
import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;", "", "", "Lcom/sofascore/model/newNetwork/DistinctEventSet;", "eventSets", "", "", "", "timezones", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEventSets", "Ljava/util/Map;", "getTimezones", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimezoneEventsInfo {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<DistinctEventSet> eventSets;

    @NotNull
    private final Map<String, Integer> timezones;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new eej(4)), ypa.a(ysaVar, new eej(5))};
    }

    public /* synthetic */ TimezoneEventsInfo(int i, List list, Map map, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, TimezoneEventsInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventSets = list;
        this.timezones = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(DistinctEventSet$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new q79(uhi.a, a7a.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimezoneEventsInfo copy$default(TimezoneEventsInfo timezoneEventsInfo, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = timezoneEventsInfo.eventSets;
        }
        if ((i & 2) != 0) {
            map = timezoneEventsInfo.timezones;
        }
        return timezoneEventsInfo.copy(list, map);
    }

    public static final /* synthetic */ void write$Self$model_release(TimezoneEventsInfo self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.eventSets);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.timezones);
    }

    @NotNull
    public final List<DistinctEventSet> component1() {
        return this.eventSets;
    }

    @NotNull
    public final Map<String, Integer> component2() {
        return this.timezones;
    }

    @NotNull
    public final TimezoneEventsInfo copy(@NotNull List<DistinctEventSet> eventSets, @NotNull Map<String, Integer> timezones) {
        eventSets.getClass();
        timezones.getClass();
        return new TimezoneEventsInfo(eventSets, timezones);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimezoneEventsInfo)) {
            return false;
        }
        TimezoneEventsInfo timezoneEventsInfo = (TimezoneEventsInfo) other;
        return Intrinsics.c(this.eventSets, timezoneEventsInfo.eventSets) && Intrinsics.c(this.timezones, timezoneEventsInfo.timezones);
    }

    @NotNull
    public final List<DistinctEventSet> getEventSets() {
        return this.eventSets;
    }

    @NotNull
    public final Map<String, Integer> getTimezones() {
        return this.timezones;
    }

    public int hashCode() {
        return this.timezones.hashCode() + (this.eventSets.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TimezoneEventsInfo(eventSets=" + this.eventSets + ", timezones=" + this.timezones + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TimezoneEventsInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TimezoneEventsInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TimezoneEventsInfo(@NotNull List<DistinctEventSet> list, @NotNull Map<String, Integer> map) {
        list.getClass();
        map.getClass();
        this.eventSets = list;
        this.timezones = map;
    }
}
