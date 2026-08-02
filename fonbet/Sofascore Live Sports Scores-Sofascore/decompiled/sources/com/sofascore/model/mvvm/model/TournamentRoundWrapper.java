package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.w1l;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0084\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0018J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b?\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b@\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bE\u0010#R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010&R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bH\u0010&¨\u0006K"}, d2 = {"Lcom/sofascore/model/mvvm/model/TournamentRoundWrapper;", "", "", "id", "", "totwType", "totwPeriodName", "tournamentId", "roundName", "roundSlug", "", "hasTotw", "", "dateFrom", "dateTo", "createdAtTimestamp", "startDateTimestamp", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;JJ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;JJLt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Z", "component8", "()Ljava/lang/Long;", "component9", "component10", "()J", "component11", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;JJ)Lcom/sofascore/model/mvvm/model/TournamentRoundWrapper;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TournamentRoundWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getTotwType", "getTotwPeriodName", "Ljava/lang/Integer;", "getTournamentId", "getRoundName", "getRoundSlug", "Z", "getHasTotw", "Ljava/lang/Long;", "getDateFrom", "getDateTo", "J", "getCreatedAtTimestamp", "getStartDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TournamentRoundWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long createdAtTimestamp;

    @Nullable
    private final Long dateFrom;

    @Nullable
    private final Long dateTo;
    private final boolean hasTotw;
    private final int id;

    @NotNull
    private final String roundName;

    @NotNull
    private final String roundSlug;
    private final long startDateTimestamp;

    @NotNull
    private final String totwPeriodName;

    @NotNull
    private final String totwType;

    @Nullable
    private final Integer tournamentId;

    public /* synthetic */ TournamentRoundWrapper(int i, int i2, String str, String str2, Integer num, String str3, String str4, boolean z, Long l, Long l2, long j, long j2, t5h t5hVar) {
        if (2047 != (i & 2047)) {
            oea.z(i, 2047, TournamentRoundWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.totwType = str;
        this.totwPeriodName = str2;
        this.tournamentId = num;
        this.roundName = str3;
        this.roundSlug = str4;
        this.hasTotw = z;
        this.dateFrom = l;
        this.dateTo = l2;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = j2;
    }

    public static final /* synthetic */ void write$Self$model_release(TournamentRoundWrapper self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.totwType);
        output.y(serialDesc, 2, self.totwPeriodName);
        output.h(serialDesc, 3, a7a.a, self.tournamentId);
        output.y(serialDesc, 4, self.roundName);
        output.y(serialDesc, 5, self.roundSlug);
        output.x(serialDesc, 6, self.hasTotw);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 7, lkbVar, self.dateFrom);
        output.h(serialDesc, 8, lkbVar, self.dateTo);
        output.E(serialDesc, 9, self.createdAtTimestamp);
        output.E(serialDesc, 10, self.startDateTimestamp);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    /* renamed from: component11, reason: from getter */
    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTotwType() {
        return this.totwType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTotwPeriodName() {
        return this.totwPeriodName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTournamentId() {
        return this.tournamentId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRoundName() {
        return this.roundName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRoundSlug() {
        return this.roundSlug;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasTotw() {
        return this.hasTotw;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Long getDateFrom() {
        return this.dateFrom;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getDateTo() {
        return this.dateTo;
    }

    @NotNull
    public final TournamentRoundWrapper copy(int id, @NotNull String totwType, @NotNull String totwPeriodName, @Nullable Integer tournamentId, @NotNull String roundName, @NotNull String roundSlug, boolean hasTotw, @Nullable Long dateFrom, @Nullable Long dateTo, long createdAtTimestamp, long startDateTimestamp) {
        totwType.getClass();
        totwPeriodName.getClass();
        roundName.getClass();
        roundSlug.getClass();
        return new TournamentRoundWrapper(id, totwType, totwPeriodName, tournamentId, roundName, roundSlug, hasTotw, dateFrom, dateTo, createdAtTimestamp, startDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentRoundWrapper)) {
            return false;
        }
        TournamentRoundWrapper tournamentRoundWrapper = (TournamentRoundWrapper) other;
        return this.id == tournamentRoundWrapper.id && Intrinsics.c(this.totwType, tournamentRoundWrapper.totwType) && Intrinsics.c(this.totwPeriodName, tournamentRoundWrapper.totwPeriodName) && Intrinsics.c(this.tournamentId, tournamentRoundWrapper.tournamentId) && Intrinsics.c(this.roundName, tournamentRoundWrapper.roundName) && Intrinsics.c(this.roundSlug, tournamentRoundWrapper.roundSlug) && this.hasTotw == tournamentRoundWrapper.hasTotw && Intrinsics.c(this.dateFrom, tournamentRoundWrapper.dateFrom) && Intrinsics.c(this.dateTo, tournamentRoundWrapper.dateTo) && this.createdAtTimestamp == tournamentRoundWrapper.createdAtTimestamp && this.startDateTimestamp == tournamentRoundWrapper.startDateTimestamp;
    }

    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    public final Long getDateFrom() {
        return this.dateFrom;
    }

    @Nullable
    public final Long getDateTo() {
        return this.dateTo;
    }

    public final boolean getHasTotw() {
        return this.hasTotw;
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

    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final String getTotwPeriodName() {
        return this.totwPeriodName;
    }

    @NotNull
    public final String getTotwType() {
        return this.totwType;
    }

    @Nullable
    public final Integer getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.totwType), 31, this.totwPeriodName);
        Integer num = this.tournamentId;
        int e = dmi.e(dmi.c(dmi.c((c + (num == null ? 0 : num.hashCode())) * 31, 31, this.roundName), 31, this.roundSlug), 31, this.hasTotw);
        Long l = this.dateFrom;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.dateTo;
        return Long.hashCode(this.startDateTimestamp) + ljg.c((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.createdAtTimestamp);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.totwType;
        String str2 = this.totwPeriodName;
        Integer num = this.tournamentId;
        String str3 = this.roundName;
        String str4 = this.roundSlug;
        boolean z = this.hasTotw;
        Long l = this.dateFrom;
        Long l2 = this.dateTo;
        long j = this.createdAtTimestamp;
        long j2 = this.startDateTimestamp;
        StringBuilder t = dmi.t(i, "TournamentRoundWrapper(id=", ", totwType=", str, ", totwPeriodName=");
        me4.o(num, str2, ", tournamentId=", ", roundName=", t);
        bf3.v(t, str3, ", roundSlug=", str4, ", hasTotw=");
        t.append(z);
        t.append(", dateFrom=");
        t.append(l);
        t.append(", dateTo=");
        t.append(l2);
        t.append(", createdAtTimestamp=");
        t.append(j);
        return fn0.l(j2, ", startDateTimestamp=", ")", t);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TournamentRoundWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TournamentRoundWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TournamentRoundWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TournamentRoundWrapper(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num, @NotNull String str3, @NotNull String str4, boolean z, @Nullable Long l, @Nullable Long l2, long j, long j2) {
        w1l.y(str, str2, str3, str4);
        this.id = i;
        this.totwType = str;
        this.totwPeriodName = str2;
        this.tournamentId = num;
        this.roundName = str3;
        this.roundSlug = str4;
        this.hasTotw = z;
        this.dateFrom = l;
        this.dateTo = l2;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = j2;
    }
}
