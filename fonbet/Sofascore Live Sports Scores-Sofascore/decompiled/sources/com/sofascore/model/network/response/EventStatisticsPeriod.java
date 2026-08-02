package com.sofascore.model.network.response;

import defpackage.joa;
import defpackage.oea;
import defpackage.qt5;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/sofascore/model/network/response/EventStatisticsPeriod;", "Ljava/io/Serializable;", "", "period", "", "Lcom/sofascore/model/network/response/EventStatisticsGroup;", "groups", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/EventStatisticsPeriod;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/sofascore/model/network/response/EventStatisticsPeriod;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "Ljava/util/List;", "getGroups", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventStatisticsPeriod implements Serializable {

    @NotNull
    private final List<EventStatisticsGroup> groups;

    @NotNull
    private final String period;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new qt5(19))};

    public /* synthetic */ EventStatisticsPeriod(int i, String str, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, EventStatisticsPeriod$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.period = str;
        this.groups = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventStatisticsGroup$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventStatisticsPeriod copy$default(EventStatisticsPeriod eventStatisticsPeriod, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventStatisticsPeriod.period;
        }
        if ((i & 2) != 0) {
            list = eventStatisticsPeriod.groups;
        }
        return eventStatisticsPeriod.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$model_release(EventStatisticsPeriod self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.period);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.groups);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    @NotNull
    public final List<EventStatisticsGroup> component2() {
        return this.groups;
    }

    @NotNull
    public final EventStatisticsPeriod copy(@NotNull String period, @NotNull List<EventStatisticsGroup> groups) {
        period.getClass();
        groups.getClass();
        return new EventStatisticsPeriod(period, groups);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventStatisticsPeriod)) {
            return false;
        }
        EventStatisticsPeriod eventStatisticsPeriod = (EventStatisticsPeriod) other;
        return Intrinsics.c(this.period, eventStatisticsPeriod.period) && Intrinsics.c(this.groups, eventStatisticsPeriod.groups);
    }

    @NotNull
    public final List<EventStatisticsGroup> getGroups() {
        return this.groups;
    }

    @NotNull
    public final String getPeriod() {
        return this.period;
    }

    public int hashCode() {
        return this.groups.hashCode() + (this.period.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EventStatisticsPeriod(period=" + this.period + ", groups=" + this.groups + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/EventStatisticsPeriod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/EventStatisticsPeriod;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventStatisticsPeriod$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventStatisticsPeriod(@NotNull String str, @NotNull List<EventStatisticsGroup> list) {
        str.getClass();
        list.getClass();
        this.period = str;
        this.groups = list;
    }
}
