package com.sofascore.model.fantasy;

import com.sofascore.model.mvvm.model.Team;
import defpackage.au6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ<\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b,\u0010\u001a¨\u0006/"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyFilterOptions;", "", "", "Lcom/sofascore/model/mvvm/model/Team;", "teams", "Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;", "prices", "", "positions", "<init>", "(Ljava/util/List;Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyFilterOptions;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;", "component3", "copy", "(Ljava/util/List;Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;Ljava/util/List;)Lcom/sofascore/model/fantasy/FantasyFilterOptions;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTeams", "Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;", "getPrices", "getPositions", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyFilterOptions {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<String> positions;

    @Nullable
    private final FantasyPriceFilterConfig prices;

    @NotNull
    private final List<Team> teams;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new au6(11)), null, ypa.a(ysaVar, new au6(12))};
    }

    public /* synthetic */ FantasyFilterOptions(int i, List list, FantasyPriceFilterConfig fantasyPriceFilterConfig, List list2, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyFilterOptions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.teams = list;
        this.prices = fantasyPriceFilterConfig;
        this.positions = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(uhi.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyFilterOptions copy$default(FantasyFilterOptions fantasyFilterOptions, List list, FantasyPriceFilterConfig fantasyPriceFilterConfig, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasyFilterOptions.teams;
        }
        if ((i & 2) != 0) {
            fantasyPriceFilterConfig = fantasyFilterOptions.prices;
        }
        if ((i & 4) != 0) {
            list2 = fantasyFilterOptions.positions;
        }
        return fantasyFilterOptions.copy(list, fantasyPriceFilterConfig, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyFilterOptions self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.teams);
        output.h(serialDesc, 1, FantasyPriceFilterConfig$$serializer.INSTANCE, self.prices);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.positions);
    }

    @NotNull
    public final List<Team> component1() {
        return this.teams;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final FantasyPriceFilterConfig getPrices() {
        return this.prices;
    }

    @NotNull
    public final List<String> component3() {
        return this.positions;
    }

    @NotNull
    public final FantasyFilterOptions copy(@NotNull List<Team> teams, @Nullable FantasyPriceFilterConfig prices, @NotNull List<String> positions) {
        teams.getClass();
        positions.getClass();
        return new FantasyFilterOptions(teams, prices, positions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyFilterOptions)) {
            return false;
        }
        FantasyFilterOptions fantasyFilterOptions = (FantasyFilterOptions) other;
        return Intrinsics.c(this.teams, fantasyFilterOptions.teams) && Intrinsics.c(this.prices, fantasyFilterOptions.prices) && Intrinsics.c(this.positions, fantasyFilterOptions.positions);
    }

    @NotNull
    public final List<String> getPositions() {
        return this.positions;
    }

    @Nullable
    public final FantasyPriceFilterConfig getPrices() {
        return this.prices;
    }

    @NotNull
    public final List<Team> getTeams() {
        return this.teams;
    }

    public int hashCode() {
        int hashCode = this.teams.hashCode() * 31;
        FantasyPriceFilterConfig fantasyPriceFilterConfig = this.prices;
        return this.positions.hashCode() + ((hashCode + (fantasyPriceFilterConfig == null ? 0 : fantasyPriceFilterConfig.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        List<Team> list = this.teams;
        FantasyPriceFilterConfig fantasyPriceFilterConfig = this.prices;
        List<String> list2 = this.positions;
        StringBuilder sb = new StringBuilder("FantasyFilterOptions(teams=");
        sb.append(list);
        sb.append(", prices=");
        sb.append(fantasyPriceFilterConfig);
        sb.append(", positions=");
        return mz1.p(sb, list2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyFilterOptions$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyFilterOptions;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyFilterOptions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyFilterOptions(@NotNull List<Team> list, @Nullable FantasyPriceFilterConfig fantasyPriceFilterConfig, @NotNull List<String> list2) {
        list.getClass();
        list2.getClass();
        this.teams = list;
        this.prices = fantasyPriceFilterConfig;
        this.positions = list2;
    }
}
