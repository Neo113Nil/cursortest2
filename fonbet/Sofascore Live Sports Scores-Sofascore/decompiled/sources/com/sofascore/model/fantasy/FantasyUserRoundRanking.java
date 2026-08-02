package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010!¨\u00063"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserRoundRanking;", "", "", "rank", "totalTeams", "", "leagueName", "", "isGlobal", "previousRank", "<init>", "(IILjava/lang/String;ZLjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;ZLjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyUserRoundRanking;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "()Ljava/lang/Integer;", "copy", "(IILjava/lang/String;ZLjava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyUserRoundRanking;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getRank", "getTotalTeams", "Ljava/lang/String;", "getLeagueName", "Z", "Ljava/lang/Integer;", "getPreviousRank", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyUserRoundRanking {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isGlobal;

    @NotNull
    private final String leagueName;

    @Nullable
    private final Integer previousRank;
    private final int rank;
    private final int totalTeams;

    public /* synthetic */ FantasyUserRoundRanking(int i, int i2, int i3, String str, boolean z, Integer num, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, FantasyUserRoundRanking$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rank = i2;
        this.totalTeams = i3;
        this.leagueName = str;
        this.isGlobal = z;
        this.previousRank = num;
    }

    public static /* synthetic */ FantasyUserRoundRanking copy$default(FantasyUserRoundRanking fantasyUserRoundRanking, int i, int i2, String str, boolean z, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fantasyUserRoundRanking.rank;
        }
        if ((i3 & 2) != 0) {
            i2 = fantasyUserRoundRanking.totalTeams;
        }
        if ((i3 & 4) != 0) {
            str = fantasyUserRoundRanking.leagueName;
        }
        if ((i3 & 8) != 0) {
            z = fantasyUserRoundRanking.isGlobal;
        }
        if ((i3 & 16) != 0) {
            num = fantasyUserRoundRanking.previousRank;
        }
        Integer num2 = num;
        String str2 = str;
        return fantasyUserRoundRanking.copy(i, i2, str2, z, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyUserRoundRanking self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.rank, serialDesc);
        output.u(1, self.totalTeams, serialDesc);
        output.y(serialDesc, 2, self.leagueName);
        output.x(serialDesc, 3, self.isGlobal);
        output.h(serialDesc, 4, a7a.a, self.previousRank);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalTeams() {
        return this.totalTeams;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsGlobal() {
        return this.isGlobal;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPreviousRank() {
        return this.previousRank;
    }

    @NotNull
    public final FantasyUserRoundRanking copy(int rank, int totalTeams, @NotNull String leagueName, boolean isGlobal, @Nullable Integer previousRank) {
        leagueName.getClass();
        return new FantasyUserRoundRanking(rank, totalTeams, leagueName, isGlobal, previousRank);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyUserRoundRanking)) {
            return false;
        }
        FantasyUserRoundRanking fantasyUserRoundRanking = (FantasyUserRoundRanking) other;
        return this.rank == fantasyUserRoundRanking.rank && this.totalTeams == fantasyUserRoundRanking.totalTeams && Intrinsics.c(this.leagueName, fantasyUserRoundRanking.leagueName) && this.isGlobal == fantasyUserRoundRanking.isGlobal && Intrinsics.c(this.previousRank, fantasyUserRoundRanking.previousRank);
    }

    @NotNull
    public final String getLeagueName() {
        return this.leagueName;
    }

    @Nullable
    public final Integer getPreviousRank() {
        return this.previousRank;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getTotalTeams() {
        return this.totalTeams;
    }

    public int hashCode() {
        int e = dmi.e(dmi.c(wv8.a(this.totalTeams, Integer.hashCode(this.rank) * 31, 31), 31, this.leagueName), 31, this.isGlobal);
        Integer num = this.previousRank;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final boolean isGlobal() {
        return this.isGlobal;
    }

    @NotNull
    public String toString() {
        int i = this.rank;
        int i2 = this.totalTeams;
        String str = this.leagueName;
        boolean z = this.isGlobal;
        Integer num = this.previousRank;
        StringBuilder s = lnb.s(i, i2, "FantasyUserRoundRanking(rank=", ", totalTeams=", ", leagueName=");
        dmi.w(s, str, ", isGlobal=", z, ", previousRank=");
        return vxd.n(s, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserRoundRanking$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyUserRoundRanking;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyUserRoundRanking$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyUserRoundRanking(int i, int i2, @NotNull String str, boolean z, @Nullable Integer num) {
        str.getClass();
        this.rank = i;
        this.totalTeams = i2;
        this.leagueName = str;
        this.isGlobal = z;
        this.previousRank = num;
    }
}
