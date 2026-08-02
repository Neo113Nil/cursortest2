package com.sofascore.model.newNetwork.newRankings;

import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.s8f;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/newRankings/Ranking;", "", "Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "rankingType", "", "Lcom/sofascore/model/newNetwork/newRankings/RankingRow;", "rankingRows", "<init>", "(Lcom/sofascore/model/newNetwork/newRankings/RankingType;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/newRankings/RankingType;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/newRankings/Ranking;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "component2", "()Ljava/util/List;", "copy", "(Lcom/sofascore/model/newNetwork/newRankings/RankingType;Ljava/util/List;)Lcom/sofascore/model/newNetwork/newRankings/Ranking;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "getRankingType", "Ljava/util/List;", "getRankingRows", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Ranking {

    @NotNull
    private final List<RankingRow> rankingRows;

    @NotNull
    private final RankingType rankingType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new s8f(19))};

    public /* synthetic */ Ranking(int i, RankingType rankingType, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, Ranking$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rankingType = rankingType;
        this.rankingRows = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(RankingRow$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ranking copy$default(Ranking ranking, RankingType rankingType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            rankingType = ranking.rankingType;
        }
        if ((i & 2) != 0) {
            list = ranking.rankingRows;
        }
        return ranking.copy(rankingType, list);
    }

    public static final /* synthetic */ void write$Self$model_release(Ranking self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, RankingType$$serializer.INSTANCE, self.rankingType);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.rankingRows);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RankingType getRankingType() {
        return this.rankingType;
    }

    @NotNull
    public final List<RankingRow> component2() {
        return this.rankingRows;
    }

    @NotNull
    public final Ranking copy(@NotNull RankingType rankingType, @NotNull List<RankingRow> rankingRows) {
        rankingType.getClass();
        rankingRows.getClass();
        return new Ranking(rankingType, rankingRows);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ranking)) {
            return false;
        }
        Ranking ranking = (Ranking) other;
        return Intrinsics.c(this.rankingType, ranking.rankingType) && Intrinsics.c(this.rankingRows, ranking.rankingRows);
    }

    @NotNull
    public final List<RankingRow> getRankingRows() {
        return this.rankingRows;
    }

    @NotNull
    public final RankingType getRankingType() {
        return this.rankingType;
    }

    public int hashCode() {
        return this.rankingRows.hashCode() + (this.rankingType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Ranking(rankingType=" + this.rankingType + ", rankingRows=" + this.rankingRows + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/newRankings/Ranking$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/newRankings/Ranking;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Ranking$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Ranking(@NotNull RankingType rankingType, @NotNull List<RankingRow> list) {
        rankingType.getClass();
        list.getClass();
        this.rankingType = rankingType;
        this.rankingRows = list;
    }
}
