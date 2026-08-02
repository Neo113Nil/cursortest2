package com.sofascore.model.buzzer;

import defpackage.dmi;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;", "", "", "roundName", "roundSlug", "", "id", "", "createdAtTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;IJ)Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRoundName", "getRoundSlug", "I", "getId", "J", "getCreatedAtTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamOfTheWeekRoundBuzzer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long createdAtTimestamp;
    private final int id;

    @NotNull
    private final String roundName;

    @NotNull
    private final String roundSlug;

    public /* synthetic */ TeamOfTheWeekRoundBuzzer(int i, String str, String str2, int i2, long j, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, TeamOfTheWeekRoundBuzzer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.roundName = str;
        this.roundSlug = str2;
        this.id = i2;
        this.createdAtTimestamp = j;
    }

    public static /* synthetic */ TeamOfTheWeekRoundBuzzer copy$default(TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = teamOfTheWeekRoundBuzzer.roundName;
        }
        if ((i2 & 2) != 0) {
            str2 = teamOfTheWeekRoundBuzzer.roundSlug;
        }
        if ((i2 & 4) != 0) {
            i = teamOfTheWeekRoundBuzzer.id;
        }
        if ((i2 & 8) != 0) {
            j = teamOfTheWeekRoundBuzzer.createdAtTimestamp;
        }
        int i3 = i;
        return teamOfTheWeekRoundBuzzer.copy(str, str2, i3, j);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamOfTheWeekRoundBuzzer self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.roundName);
        output.y(serialDesc, 1, self.roundSlug);
        output.u(2, self.id, serialDesc);
        output.E(serialDesc, 3, self.createdAtTimestamp);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRoundName() {
        return this.roundName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRoundSlug() {
        return this.roundSlug;
    }

    /* renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @NotNull
    public final TeamOfTheWeekRoundBuzzer copy(@NotNull String roundName, @NotNull String roundSlug, int id, long createdAtTimestamp) {
        roundName.getClass();
        roundSlug.getClass();
        return new TeamOfTheWeekRoundBuzzer(roundName, roundSlug, id, createdAtTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamOfTheWeekRoundBuzzer)) {
            return false;
        }
        TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer = (TeamOfTheWeekRoundBuzzer) other;
        return Intrinsics.c(this.roundName, teamOfTheWeekRoundBuzzer.roundName) && Intrinsics.c(this.roundSlug, teamOfTheWeekRoundBuzzer.roundSlug) && this.id == teamOfTheWeekRoundBuzzer.id && this.createdAtTimestamp == teamOfTheWeekRoundBuzzer.createdAtTimestamp;
    }

    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getRoundName() {
        return this.roundName;
    }

    @NotNull
    public final String getRoundSlug() {
        return this.roundSlug;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAtTimestamp) + wv8.a(this.id, dmi.c(this.roundName.hashCode() * 31, 31, this.roundSlug), 31);
    }

    @NotNull
    public String toString() {
        String str = this.roundName;
        String str2 = this.roundSlug;
        int i = this.id;
        long j = this.createdAtTimestamp;
        StringBuilder s = mz1.s("TeamOfTheWeekRoundBuzzer(roundName=", str, ", roundSlug=", str2, ", id=");
        s.append(i);
        s.append(", createdAtTimestamp=");
        s.append(j);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamOfTheWeekRoundBuzzer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamOfTheWeekRoundBuzzer(@NotNull String str, @NotNull String str2, int i, long j) {
        str.getClass();
        str2.getClass();
        this.roundName = str;
        this.roundSlug = str2;
        this.id = i;
        this.createdAtTimestamp = j;
    }
}
