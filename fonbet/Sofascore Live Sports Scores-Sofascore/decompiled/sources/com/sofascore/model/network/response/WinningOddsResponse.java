package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.TeamSides;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006BK\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J(\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/sofascore/model/network/response/WinningOddsResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "Lcom/sofascore/model/network/response/Odds;", "home", "away", "<init>", "(Lcom/sofascore/model/network/response/Odds;Lcom/sofascore/model/network/response/Odds;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/Odds;Lcom/sofascore/model/network/response/Odds;ZLt5h;)V", "component1", "()Lcom/sofascore/model/network/response/Odds;", "component2", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/WinningOddsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHome", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/network/response/Odds;", "getAway", "copy", "(Lcom/sofascore/model/network/response/Odds;Lcom/sofascore/model/network/response/Odds;)Lcom/sofascore/model/network/response/WinningOddsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/network/response/Odds;", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WinningOddsResponse extends AbstractNetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Odds away;

    @Nullable
    private final Odds home;
    private boolean shouldReverseTeams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinningOddsResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, Odds odds, Odds odds2, boolean z, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, WinningOddsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.home = odds;
        this.away = odds2;
        if ((i & 16) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Odds getHome() {
        return this.home;
    }

    /* renamed from: component2, reason: from getter */
    private final Odds getAway() {
        return this.away;
    }

    public static /* synthetic */ WinningOddsResponse copy$default(WinningOddsResponse winningOddsResponse, Odds odds, Odds odds2, int i, Object obj) {
        if ((i & 1) != 0) {
            odds = winningOddsResponse.home;
        }
        if ((i & 2) != 0) {
            odds2 = winningOddsResponse.away;
        }
        return winningOddsResponse.copy(odds, odds2);
    }

    public static /* synthetic */ Odds getAway$default(WinningOddsResponse winningOddsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return winningOddsResponse.getAway(teamSides);
    }

    public static /* synthetic */ Odds getHome$default(WinningOddsResponse winningOddsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return winningOddsResponse.getHome(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(WinningOddsResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        Odds$$serializer odds$$serializer = Odds$$serializer.INSTANCE;
        output.h(serialDesc, 2, odds$$serializer, self.home);
        output.h(serialDesc, 3, odds$$serializer, self.away);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 4, self.shouldReverseTeams);
        }
    }

    @NotNull
    public final WinningOddsResponse copy(@Nullable Odds home, @Nullable Odds away) {
        return new WinningOddsResponse(home, away);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WinningOddsResponse)) {
            return false;
        }
        WinningOddsResponse winningOddsResponse = (WinningOddsResponse) other;
        return Intrinsics.c(this.home, winningOddsResponse.home) && Intrinsics.c(this.away, winningOddsResponse.away);
    }

    @Nullable
    public final Odds getAway(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.home : this.away;
    }

    @Nullable
    public final Odds getHome(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.away : this.home;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        Odds odds = this.home;
        int hashCode = (odds == null ? 0 : odds.hashCode()) * 31;
        Odds odds2 = this.away;
        return hashCode + (odds2 != null ? odds2.hashCode() : 0);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        return "WinningOddsResponse(home=" + this.home + ", away=" + this.away + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/WinningOddsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/WinningOddsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WinningOddsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WinningOddsResponse(@Nullable Odds odds, @Nullable Odds odds2) {
        super((HeadResponse) null, (HeadResponse) null, 3, (DefaultConstructorMarker) null);
        this.home = odds;
        this.away = odds2;
    }
}
