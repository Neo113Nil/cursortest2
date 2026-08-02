package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.BaseballRoleSerializer;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/sofascore/model/network/response/EventUmpireItem;", "", "Lcom/sofascore/model/network/response/Umpire;", "umpire", "Lcom/sofascore/model/mvvm/model/BaseballRole;", "assignment", "<init>", "(Lcom/sofascore/model/network/response/Umpire;Lcom/sofascore/model/mvvm/model/BaseballRole;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/Umpire;Lcom/sofascore/model/mvvm/model/BaseballRole;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/EventUmpireItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/network/response/Umpire;", "component2", "()Lcom/sofascore/model/mvvm/model/BaseballRole;", "copy", "(Lcom/sofascore/model/network/response/Umpire;Lcom/sofascore/model/mvvm/model/BaseballRole;)Lcom/sofascore/model/network/response/EventUmpireItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/network/response/Umpire;", "getUmpire", "Lcom/sofascore/model/mvvm/model/BaseballRole;", "getAssignment", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventUmpireItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final BaseballRole assignment;

    @NotNull
    private final Umpire umpire;

    public /* synthetic */ EventUmpireItem(int i, Umpire umpire, BaseballRole baseballRole, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, EventUmpireItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.umpire = umpire;
        this.assignment = baseballRole;
    }

    public static /* synthetic */ EventUmpireItem copy$default(EventUmpireItem eventUmpireItem, Umpire umpire, BaseballRole baseballRole, int i, Object obj) {
        if ((i & 1) != 0) {
            umpire = eventUmpireItem.umpire;
        }
        if ((i & 2) != 0) {
            baseballRole = eventUmpireItem.assignment;
        }
        return eventUmpireItem.copy(umpire, baseballRole);
    }

    public static final /* synthetic */ void write$Self$model_release(EventUmpireItem self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Umpire$$serializer.INSTANCE, self.umpire);
        output.h(serialDesc, 1, BaseballRoleSerializer.INSTANCE, self.assignment);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Umpire getUmpire() {
        return this.umpire;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BaseballRole getAssignment() {
        return this.assignment;
    }

    @NotNull
    public final EventUmpireItem copy(@NotNull Umpire umpire, @Nullable BaseballRole assignment) {
        umpire.getClass();
        return new EventUmpireItem(umpire, assignment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventUmpireItem)) {
            return false;
        }
        EventUmpireItem eventUmpireItem = (EventUmpireItem) other;
        return Intrinsics.c(this.umpire, eventUmpireItem.umpire) && this.assignment == eventUmpireItem.assignment;
    }

    @Nullable
    public final BaseballRole getAssignment() {
        return this.assignment;
    }

    @NotNull
    public final Umpire getUmpire() {
        return this.umpire;
    }

    public int hashCode() {
        int hashCode = this.umpire.hashCode() * 31;
        BaseballRole baseballRole = this.assignment;
        return hashCode + (baseballRole == null ? 0 : baseballRole.hashCode());
    }

    @NotNull
    public String toString() {
        return "EventUmpireItem(umpire=" + this.umpire + ", assignment=" + this.assignment + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/EventUmpireItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/EventUmpireItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventUmpireItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventUmpireItem(@NotNull Umpire umpire, @Nullable BaseballRole baseballRole) {
        umpire.getClass();
        this.umpire = umpire;
        this.assignment = baseballRole;
    }
}
