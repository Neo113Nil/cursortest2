package com.sofascore.model.newNetwork.statistics.season.team;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.c88;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;", "", "", "rankTotal", "rankPerGame", "", U3.i.X, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Float;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getRankTotal", "getRankPerGame", "Ljava/lang/Float;", "getValue", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RankedStatistic {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer rankPerGame;

    @Nullable
    private final Integer rankTotal;

    @Nullable
    private final Float value;

    public /* synthetic */ RankedStatistic(int i, Integer num, Integer num2, Float f, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, RankedStatistic$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rankTotal = num;
        this.rankPerGame = num2;
        this.value = f;
    }

    public static /* synthetic */ RankedStatistic copy$default(RankedStatistic rankedStatistic, Integer num, Integer num2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rankedStatistic.rankTotal;
        }
        if ((i & 2) != 0) {
            num2 = rankedStatistic.rankPerGame;
        }
        if ((i & 4) != 0) {
            f = rankedStatistic.value;
        }
        return rankedStatistic.copy(num, num2, f);
    }

    public static final /* synthetic */ void write$Self$model_release(RankedStatistic self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.rankTotal);
        output.h(serialDesc, 1, a7aVar, self.rankPerGame);
        output.h(serialDesc, 2, c88.a, self.value);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getRankTotal() {
        return this.rankTotal;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getRankPerGame() {
        return this.rankPerGame;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getValue() {
        return this.value;
    }

    @NotNull
    public final RankedStatistic copy(@Nullable Integer rankTotal, @Nullable Integer rankPerGame, @Nullable Float value) {
        return new RankedStatistic(rankTotal, rankPerGame, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankedStatistic)) {
            return false;
        }
        RankedStatistic rankedStatistic = (RankedStatistic) other;
        return Intrinsics.c(this.rankTotal, rankedStatistic.rankTotal) && Intrinsics.c(this.rankPerGame, rankedStatistic.rankPerGame) && Intrinsics.c(this.value, rankedStatistic.value);
    }

    @Nullable
    public final Integer getRankPerGame() {
        return this.rankPerGame;
    }

    @Nullable
    public final Integer getRankTotal() {
        return this.rankTotal;
    }

    @Nullable
    public final Float getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.rankTotal;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.rankPerGame;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.value;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.rankTotal;
        Integer num2 = this.rankPerGame;
        Float f = this.value;
        StringBuilder k = wv8.k(num, "RankedStatistic(rankTotal=", ", rankPerGame=", ", value=", num2);
        k.append(f);
        k.append(")");
        return k.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/RankedStatistic;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RankedStatistic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RankedStatistic(@Nullable Integer num, @Nullable Integer num2, @Nullable Float f) {
        this.rankTotal = num;
        this.rankPerGame = num2;
        this.value = f;
    }
}
