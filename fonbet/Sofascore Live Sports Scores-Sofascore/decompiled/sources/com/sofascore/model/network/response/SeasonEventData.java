package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.dtg;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ4\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/sofascore/model/network/response/SeasonEventData;", "", "", "Lcom/sofascore/model/mvvm/model/Event;", "events", "", "openCount", "attendedCount", "<init>", "(Ljava/util/List;II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/SeasonEventData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "copy", "(Ljava/util/List;II)Lcom/sofascore/model/network/response/SeasonEventData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents", "I", "getOpenCount", "getAttendedCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SeasonEventData {
    private final int attendedCount;

    @NotNull
    private final List<Event> events;
    private final int openCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new dtg(11)), null, null};

    public /* synthetic */ SeasonEventData(int i, List list, int i2, int i3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, SeasonEventData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.events = list;
        this.openCount = i2;
        this.attendedCount = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonEventData copy$default(SeasonEventData seasonEventData, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = seasonEventData.events;
        }
        if ((i3 & 2) != 0) {
            i = seasonEventData.openCount;
        }
        if ((i3 & 4) != 0) {
            i2 = seasonEventData.attendedCount;
        }
        return seasonEventData.copy(list, i, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(SeasonEventData self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.events);
        output.u(1, self.openCount, serialDesc);
        output.u(2, self.attendedCount, serialDesc);
    }

    @NotNull
    public final List<Event> component1() {
        return this.events;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOpenCount() {
        return this.openCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAttendedCount() {
        return this.attendedCount;
    }

    @NotNull
    public final SeasonEventData copy(@NotNull List<? extends Event> events, int openCount, int attendedCount) {
        events.getClass();
        return new SeasonEventData(events, openCount, attendedCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonEventData)) {
            return false;
        }
        SeasonEventData seasonEventData = (SeasonEventData) other;
        return Intrinsics.c(this.events, seasonEventData.events) && this.openCount == seasonEventData.openCount && this.attendedCount == seasonEventData.attendedCount;
    }

    public final int getAttendedCount() {
        return this.attendedCount;
    }

    @NotNull
    public final List<Event> getEvents() {
        return this.events;
    }

    public final int getOpenCount() {
        return this.openCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.attendedCount) + wv8.a(this.openCount, this.events.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<Event> list = this.events;
        int i = this.openCount;
        int i2 = this.attendedCount;
        StringBuilder sb = new StringBuilder("SeasonEventData(events=");
        sb.append(list);
        sb.append(", openCount=");
        sb.append(i);
        sb.append(", attendedCount=");
        return fc6.h(i2, ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/SeasonEventData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/SeasonEventData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SeasonEventData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeasonEventData(@NotNull List<? extends Event> list, int i, int i2) {
        list.getClass();
        this.events = list;
        this.openCount = i;
        this.attendedCount = i2;
    }
}
