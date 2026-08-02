package com.sofascore.model.fantasy;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JJ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010 ¨\u00065"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupEntry;", "", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;", "matchup", "", "homeUserId", "awayUserId", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;", "homeStanding", "awayStanding", "<init>", "(Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/fantasy/FantasyLeagueMatchup;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeagueMatchupEntry;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;", "component5", "copy", "(Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;)Lcom/sofascore/model/fantasy/FantasyLeagueMatchupEntry;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;", "getMatchup", "Ljava/lang/String;", "getHomeUserId", "getAwayUserId", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupStanding;", "getHomeStanding", "getAwayStanding", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeagueMatchupEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final FantasyLeagueMatchupStanding awayStanding;

    @Nullable
    private final String awayUserId;

    @Nullable
    private final FantasyLeagueMatchupStanding homeStanding;

    @Nullable
    private final String homeUserId;

    @NotNull
    private final FantasyLeagueMatchup matchup;

    public /* synthetic */ FantasyLeagueMatchupEntry(int i, FantasyLeagueMatchup fantasyLeagueMatchup, String str, String str2, FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding, FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding2, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, FantasyLeagueMatchupEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.matchup = fantasyLeagueMatchup;
        this.homeUserId = str;
        this.awayUserId = str2;
        this.homeStanding = fantasyLeagueMatchupStanding;
        this.awayStanding = fantasyLeagueMatchupStanding2;
    }

    public static /* synthetic */ FantasyLeagueMatchupEntry copy$default(FantasyLeagueMatchupEntry fantasyLeagueMatchupEntry, FantasyLeagueMatchup fantasyLeagueMatchup, String str, String str2, FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding, FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding2, int i, Object obj) {
        if ((i & 1) != 0) {
            fantasyLeagueMatchup = fantasyLeagueMatchupEntry.matchup;
        }
        if ((i & 2) != 0) {
            str = fantasyLeagueMatchupEntry.homeUserId;
        }
        if ((i & 4) != 0) {
            str2 = fantasyLeagueMatchupEntry.awayUserId;
        }
        if ((i & 8) != 0) {
            fantasyLeagueMatchupStanding = fantasyLeagueMatchupEntry.homeStanding;
        }
        if ((i & 16) != 0) {
            fantasyLeagueMatchupStanding2 = fantasyLeagueMatchupEntry.awayStanding;
        }
        FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding3 = fantasyLeagueMatchupStanding2;
        String str3 = str2;
        return fantasyLeagueMatchupEntry.copy(fantasyLeagueMatchup, str, str3, fantasyLeagueMatchupStanding, fantasyLeagueMatchupStanding3);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeagueMatchupEntry self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, FantasyLeagueMatchup$$serializer.INSTANCE, self.matchup);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.homeUserId);
        output.h(serialDesc, 2, uhiVar, self.awayUserId);
        FantasyLeagueMatchupStanding$$serializer fantasyLeagueMatchupStanding$$serializer = FantasyLeagueMatchupStanding$$serializer.INSTANCE;
        output.h(serialDesc, 3, fantasyLeagueMatchupStanding$$serializer, self.homeStanding);
        output.h(serialDesc, 4, fantasyLeagueMatchupStanding$$serializer, self.awayStanding);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FantasyLeagueMatchup getMatchup() {
        return this.matchup;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getHomeUserId() {
        return this.homeUserId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAwayUserId() {
        return this.awayUserId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final FantasyLeagueMatchupStanding getHomeStanding() {
        return this.homeStanding;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final FantasyLeagueMatchupStanding getAwayStanding() {
        return this.awayStanding;
    }

    @NotNull
    public final FantasyLeagueMatchupEntry copy(@NotNull FantasyLeagueMatchup matchup, @Nullable String homeUserId, @Nullable String awayUserId, @Nullable FantasyLeagueMatchupStanding homeStanding, @Nullable FantasyLeagueMatchupStanding awayStanding) {
        matchup.getClass();
        return new FantasyLeagueMatchupEntry(matchup, homeUserId, awayUserId, homeStanding, awayStanding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeagueMatchupEntry)) {
            return false;
        }
        FantasyLeagueMatchupEntry fantasyLeagueMatchupEntry = (FantasyLeagueMatchupEntry) other;
        return Intrinsics.c(this.matchup, fantasyLeagueMatchupEntry.matchup) && Intrinsics.c(this.homeUserId, fantasyLeagueMatchupEntry.homeUserId) && Intrinsics.c(this.awayUserId, fantasyLeagueMatchupEntry.awayUserId) && Intrinsics.c(this.homeStanding, fantasyLeagueMatchupEntry.homeStanding) && Intrinsics.c(this.awayStanding, fantasyLeagueMatchupEntry.awayStanding);
    }

    @Nullable
    public final FantasyLeagueMatchupStanding getAwayStanding() {
        return this.awayStanding;
    }

    @Nullable
    public final String getAwayUserId() {
        return this.awayUserId;
    }

    @Nullable
    public final FantasyLeagueMatchupStanding getHomeStanding() {
        return this.homeStanding;
    }

    @Nullable
    public final String getHomeUserId() {
        return this.homeUserId;
    }

    @NotNull
    public final FantasyLeagueMatchup getMatchup() {
        return this.matchup;
    }

    public int hashCode() {
        int hashCode = this.matchup.hashCode() * 31;
        String str = this.homeUserId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayUserId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding = this.homeStanding;
        int hashCode4 = (hashCode3 + (fantasyLeagueMatchupStanding == null ? 0 : fantasyLeagueMatchupStanding.hashCode())) * 31;
        FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding2 = this.awayStanding;
        return hashCode4 + (fantasyLeagueMatchupStanding2 != null ? fantasyLeagueMatchupStanding2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FantasyLeagueMatchupEntry(matchup=" + this.matchup + ", homeUserId=" + this.homeUserId + ", awayUserId=" + this.awayUserId + ", homeStanding=" + this.homeStanding + ", awayStanding=" + this.awayStanding + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupEntry;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeagueMatchupEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeagueMatchupEntry(@NotNull FantasyLeagueMatchup fantasyLeagueMatchup, @Nullable String str, @Nullable String str2, @Nullable FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding, @Nullable FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding2) {
        fantasyLeagueMatchup.getClass();
        this.matchup = fantasyLeagueMatchup;
        this.homeUserId = str;
        this.awayUserId = str2;
        this.homeStanding = fantasyLeagueMatchupStanding;
        this.awayStanding = fantasyLeagueMatchupStanding2;
    }
}
