package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b\u0006\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b\u0007\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010$¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/TennisGrandSlamResult;", "", "", "year", "seasonId", "", "isLive", "isUpcoming", "", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "winner", "<init>", "(ILjava/lang/Integer;ZZLjava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;ZZLjava/lang/String;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TennisGrandSlamResult;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "component4", "component5", "()Ljava/lang/String;", "component6", "()Ljava/lang/Boolean;", "copy", "(ILjava/lang/Integer;ZZLjava/lang/String;Ljava/lang/Boolean;)Lcom/sofascore/model/newNetwork/TennisGrandSlamResult;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getYear", "Ljava/lang/Integer;", "getSeasonId", "Z", "Ljava/lang/String;", "getRound", "Ljava/lang/Boolean;", "getWinner", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TennisGrandSlamResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isLive;
    private final boolean isUpcoming;

    @Nullable
    private final String round;

    @Nullable
    private final Integer seasonId;

    @Nullable
    private final Boolean winner;
    private final int year;

    public /* synthetic */ TennisGrandSlamResult(int i, int i2, Integer num, boolean z, boolean z2, String str, Boolean bool, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, TennisGrandSlamResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.year = i2;
        this.seasonId = num;
        this.isLive = z;
        this.isUpcoming = z2;
        this.round = str;
        this.winner = bool;
    }

    public static /* synthetic */ TennisGrandSlamResult copy$default(TennisGrandSlamResult tennisGrandSlamResult, int i, Integer num, boolean z, boolean z2, String str, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tennisGrandSlamResult.year;
        }
        if ((i2 & 2) != 0) {
            num = tennisGrandSlamResult.seasonId;
        }
        if ((i2 & 4) != 0) {
            z = tennisGrandSlamResult.isLive;
        }
        if ((i2 & 8) != 0) {
            z2 = tennisGrandSlamResult.isUpcoming;
        }
        if ((i2 & 16) != 0) {
            str = tennisGrandSlamResult.round;
        }
        if ((i2 & 32) != 0) {
            bool = tennisGrandSlamResult.winner;
        }
        String str2 = str;
        Boolean bool2 = bool;
        return tennisGrandSlamResult.copy(i, num, z, z2, str2, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(TennisGrandSlamResult self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.year, serialDesc);
        output.h(serialDesc, 1, a7a.a, self.seasonId);
        output.x(serialDesc, 2, self.isLive);
        output.x(serialDesc, 3, self.isUpcoming);
        output.h(serialDesc, 4, uhi.a, self.round);
        output.h(serialDesc, 5, gz1.a, self.winner);
    }

    /* renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getSeasonId() {
        return this.seasonId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUpcoming() {
        return this.isUpcoming;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRound() {
        return this.round;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getWinner() {
        return this.winner;
    }

    @NotNull
    public final TennisGrandSlamResult copy(int year, @Nullable Integer seasonId, boolean isLive, boolean isUpcoming, @Nullable String round, @Nullable Boolean winner) {
        return new TennisGrandSlamResult(year, seasonId, isLive, isUpcoming, round, winner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TennisGrandSlamResult)) {
            return false;
        }
        TennisGrandSlamResult tennisGrandSlamResult = (TennisGrandSlamResult) other;
        return this.year == tennisGrandSlamResult.year && Intrinsics.c(this.seasonId, tennisGrandSlamResult.seasonId) && this.isLive == tennisGrandSlamResult.isLive && this.isUpcoming == tennisGrandSlamResult.isUpcoming && Intrinsics.c(this.round, tennisGrandSlamResult.round) && Intrinsics.c(this.winner, tennisGrandSlamResult.winner);
    }

    @Nullable
    public final String getRound() {
        return this.round;
    }

    @Nullable
    public final Integer getSeasonId() {
        return this.seasonId;
    }

    @Nullable
    public final Boolean getWinner() {
        return this.winner;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.year) * 31;
        Integer num = this.seasonId;
        int e = dmi.e(dmi.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isLive), 31, this.isUpcoming);
        String str = this.round;
        int hashCode2 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.winner;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isUpcoming() {
        return this.isUpcoming;
    }

    @NotNull
    public String toString() {
        int i = this.year;
        Integer num = this.seasonId;
        boolean z = this.isLive;
        boolean z2 = this.isUpcoming;
        String str = this.round;
        Boolean bool = this.winner;
        StringBuilder r = fc6.r("TennisGrandSlamResult(year=", ", seasonId=", ", isLive=", num, i);
        vxd.t(", isUpcoming=", ", round=", r, z, z2);
        r.append(str);
        r.append(", winner=");
        r.append(bool);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TennisGrandSlamResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TennisGrandSlamResult;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TennisGrandSlamResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TennisGrandSlamResult(int i, @Nullable Integer num, boolean z, boolean z2, @Nullable String str, @Nullable Boolean bool) {
        this.year = i;
        this.seasonId = num;
        this.isLive = z;
        this.isUpcoming = z2;
        this.round = str;
        this.winner = bool;
    }
}
