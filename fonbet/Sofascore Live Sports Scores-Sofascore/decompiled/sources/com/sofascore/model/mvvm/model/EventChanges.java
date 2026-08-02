package com.sofascore.model.mvvm.model;

import defpackage.joa;
import defpackage.oea;
import defpackage.qt5;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001bJ\r\u0010!\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\u001bJ\u0015\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010\u000fJ\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J,\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010$¨\u00064"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventChanges;", "Ljava/io/Serializable;", "", "", "changes", "", "changeTimestamp", "<init>", "(Ljava/util/List;J)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;JLt5h;)V", "component1", "()Ljava/util/List;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/EventChanges;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "isStatus", "()Z", "isHomeScore", "isAwayScore", "isHomePeriod", "isAwayPeriod", "isHomePoint", "isAwayPoint", "getChanges", "component2", "()J", "copy", "(Ljava/util/List;J)Lcom/sofascore/model/mvvm/model/EventChanges;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "J", "getChangeTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventChanges implements Serializable {
    private final long changeTimestamp;

    @Nullable
    private final List<String> changes;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new qt5(1)), null};

    public /* synthetic */ EventChanges(int i, List list, long j, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, EventChanges$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.changes = list;
        this.changeTimestamp = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(uhi.a, 0);
    }

    private final List<String> component1() {
        return this.changes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventChanges copy$default(EventChanges eventChanges, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventChanges.changes;
        }
        if ((i & 2) != 0) {
            j = eventChanges.changeTimestamp;
        }
        return eventChanges.copy(list, j);
    }

    public static final /* synthetic */ void write$Self$model_release(EventChanges self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.changes);
        output.E(serialDesc, 1, self.changeTimestamp);
    }

    /* renamed from: component2, reason: from getter */
    public final long getChangeTimestamp() {
        return this.changeTimestamp;
    }

    @NotNull
    public final EventChanges copy(@Nullable List<String> changes, long changeTimestamp) {
        return new EventChanges(changes, changeTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventChanges)) {
            return false;
        }
        EventChanges eventChanges = (EventChanges) other;
        return Intrinsics.c(this.changes, eventChanges.changes) && this.changeTimestamp == eventChanges.changeTimestamp;
    }

    public final long getChangeTimestamp() {
        return this.changeTimestamp;
    }

    @Nullable
    public final List<String> getChanges() {
        return this.changes;
    }

    public int hashCode() {
        List<String> list = this.changes;
        return Long.hashCode(this.changeTimestamp) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final boolean isAwayPeriod() {
        List<String> list = this.changes;
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (StringsKt.J(str, "awayScore.period", false) && !StringsKt.J(str, "TieBreak", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isAwayPoint() {
        List<String> list = this.changes;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.J((String) it.next(), "awayScore.point", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isAwayScore() {
        List<String> list = this.changes;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.J((String) it.next(), "awayScore.display", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isHomePeriod() {
        List<String> list = this.changes;
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (StringsKt.J(str, "homeScore.period", false) && !StringsKt.J(str, "TieBreak", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isHomePoint() {
        List<String> list = this.changes;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.J((String) it.next(), "homeScore.point", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isHomeScore() {
        List<String> list = this.changes;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.J((String) it.next(), "homeScore.display", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isStatus() {
        List<String> list = this.changes;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.J((String) it.next(), "status", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "EventChanges(changes=" + this.changes + ", changeTimestamp=" + this.changeTimestamp + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventChanges$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/EventChanges;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventChanges$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventChanges(@Nullable List<String> list, long j) {
        this.changes = list;
        this.changeTimestamp = j;
    }
}
