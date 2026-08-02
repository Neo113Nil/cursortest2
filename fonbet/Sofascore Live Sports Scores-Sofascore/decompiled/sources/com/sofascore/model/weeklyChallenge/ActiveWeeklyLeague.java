package com.sofascore.model.weeklyChallenge;

import defpackage.fn0;
import defpackage.ljg;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;", "", "", "title", "", "level", "", "startDateTimestamp", "endDateTimestamp", "<init>", "(Ljava/lang/String;IJJ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;IJJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()J", "component4", "copy", "(Ljava/lang/String;IJJ)Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getLevel", "J", "getStartDateTimestamp", "getEndDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ActiveWeeklyLeague {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long endDateTimestamp;
    private final int level;
    private final long startDateTimestamp;

    @NotNull
    private final String title;

    public /* synthetic */ ActiveWeeklyLeague(int i, String str, int i2, long j, long j2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, ActiveWeeklyLeague$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.level = i2;
        this.startDateTimestamp = j;
        this.endDateTimestamp = j2;
    }

    public static /* synthetic */ ActiveWeeklyLeague copy$default(ActiveWeeklyLeague activeWeeklyLeague, String str, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = activeWeeklyLeague.title;
        }
        if ((i2 & 2) != 0) {
            i = activeWeeklyLeague.level;
        }
        if ((i2 & 4) != 0) {
            j = activeWeeklyLeague.startDateTimestamp;
        }
        if ((i2 & 8) != 0) {
            j2 = activeWeeklyLeague.endDateTimestamp;
        }
        long j3 = j2;
        return activeWeeklyLeague.copy(str, i, j, j3);
    }

    public static final /* synthetic */ void write$Self$model_release(ActiveWeeklyLeague self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.title);
        output.u(1, self.level, serialDesc);
        output.E(serialDesc, 2, self.startDateTimestamp);
        output.E(serialDesc, 3, self.endDateTimestamp);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    @NotNull
    public final ActiveWeeklyLeague copy(@NotNull String title, int level, long startDateTimestamp, long endDateTimestamp) {
        title.getClass();
        return new ActiveWeeklyLeague(title, level, startDateTimestamp, endDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveWeeklyLeague)) {
            return false;
        }
        ActiveWeeklyLeague activeWeeklyLeague = (ActiveWeeklyLeague) other;
        return Intrinsics.c(this.title, activeWeeklyLeague.title) && this.level == activeWeeklyLeague.level && this.startDateTimestamp == activeWeeklyLeague.startDateTimestamp && this.endDateTimestamp == activeWeeklyLeague.endDateTimestamp;
    }

    public final long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Long.hashCode(this.endDateTimestamp) + ljg.c(wv8.a(this.level, this.title.hashCode() * 31, 31), 31, this.startDateTimestamp);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i = this.level;
        long j = this.startDateTimestamp;
        long j2 = this.endDateTimestamp;
        StringBuilder q = mz1.q(i, "ActiveWeeklyLeague(title=", str, ", level=", ", startDateTimestamp=");
        q.append(j);
        return fn0.l(j2, ", endDateTimestamp=", ")", q);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/weeklyChallenge/ActiveWeeklyLeague;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ActiveWeeklyLeague$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ActiveWeeklyLeague(@NotNull String str, int i, long j, long j2) {
        str.getClass();
        this.title = str;
        this.level = i;
        this.startDateTimestamp = j;
        this.endDateTimestamp = j2;
    }
}
