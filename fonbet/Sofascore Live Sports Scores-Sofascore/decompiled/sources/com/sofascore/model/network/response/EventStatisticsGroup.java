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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/sofascore/model/network/response/EventStatisticsGroup;", "Ljava/io/Serializable;", "", "groupName", "", "Lcom/sofascore/model/network/response/EventStatisticsItem;", "statisticsItems", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/EventStatisticsGroup;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/sofascore/model/network/response/EventStatisticsGroup;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGroupName", "Ljava/util/List;", "getStatisticsItems", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventStatisticsGroup implements Serializable {

    @NotNull
    private final String groupName;

    @NotNull
    private final List<EventStatisticsItem> statisticsItems;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new qt5(16))};

    public /* synthetic */ EventStatisticsGroup(int i, String str, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, EventStatisticsGroup$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.groupName = str;
        this.statisticsItems = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventStatisticsItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventStatisticsGroup copy$default(EventStatisticsGroup eventStatisticsGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventStatisticsGroup.groupName;
        }
        if ((i & 2) != 0) {
            list = eventStatisticsGroup.statisticsItems;
        }
        return eventStatisticsGroup.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$model_release(EventStatisticsGroup self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.groupName);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.statisticsItems);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final List<EventStatisticsItem> component2() {
        return this.statisticsItems;
    }

    @NotNull
    public final EventStatisticsGroup copy(@NotNull String groupName, @NotNull List<EventStatisticsItem> statisticsItems) {
        groupName.getClass();
        statisticsItems.getClass();
        return new EventStatisticsGroup(groupName, statisticsItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventStatisticsGroup)) {
            return false;
        }
        EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) other;
        return Intrinsics.c(this.groupName, eventStatisticsGroup.groupName) && Intrinsics.c(this.statisticsItems, eventStatisticsGroup.statisticsItems);
    }

    @NotNull
    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final List<EventStatisticsItem> getStatisticsItems() {
        return this.statisticsItems;
    }

    public int hashCode() {
        return this.statisticsItems.hashCode() + (this.groupName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EventStatisticsGroup(groupName=" + this.groupName + ", statisticsItems=" + this.statisticsItems + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/EventStatisticsGroup$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/EventStatisticsGroup;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventStatisticsGroup$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventStatisticsGroup(@NotNull String str, @NotNull List<EventStatisticsItem> list) {
        str.getClass();
        list.getClass();
        this.groupName = str;
        this.statisticsItems = list;
    }
}
