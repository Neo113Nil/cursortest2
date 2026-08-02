package com.sofascore.model.newNetwork.statistics.season.player;

import com.ironsource.U3;
import defpackage.a7a;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J<\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b+\u0010\u0017¨\u0006."}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/HighlightedPlayerStatistic;", "", "", U3.i.X, "rankTotal", "rankPerGame", "rankPerSet", "<init>", "(Ljava/lang/Integer;IILjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;IILjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/HighlightedPlayerStatistic;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/Integer;IILjava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/player/HighlightedPlayerStatistic;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getValue", "I", "getRankTotal", "getRankPerGame", "getRankPerSet", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HighlightedPlayerStatistic {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int rankPerGame;

    @Nullable
    private final Integer rankPerSet;
    private final int rankTotal;

    @Nullable
    private final Integer value;

    public /* synthetic */ HighlightedPlayerStatistic(int i, Integer num, int i2, int i3, Integer num2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, HighlightedPlayerStatistic$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.value = num;
        this.rankTotal = i2;
        this.rankPerGame = i3;
        this.rankPerSet = num2;
    }

    public static /* synthetic */ HighlightedPlayerStatistic copy$default(HighlightedPlayerStatistic highlightedPlayerStatistic, Integer num, int i, int i2, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = highlightedPlayerStatistic.value;
        }
        if ((i3 & 2) != 0) {
            i = highlightedPlayerStatistic.rankTotal;
        }
        if ((i3 & 4) != 0) {
            i2 = highlightedPlayerStatistic.rankPerGame;
        }
        if ((i3 & 8) != 0) {
            num2 = highlightedPlayerStatistic.rankPerSet;
        }
        return highlightedPlayerStatistic.copy(num, i, i2, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(HighlightedPlayerStatistic self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.value);
        output.u(1, self.rankTotal, serialDesc);
        output.u(2, self.rankPerGame, serialDesc);
        output.h(serialDesc, 3, a7aVar, self.rankPerSet);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRankTotal() {
        return this.rankTotal;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRankPerGame() {
        return this.rankPerGame;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getRankPerSet() {
        return this.rankPerSet;
    }

    @NotNull
    public final HighlightedPlayerStatistic copy(@Nullable Integer value, int rankTotal, int rankPerGame, @Nullable Integer rankPerSet) {
        return new HighlightedPlayerStatistic(value, rankTotal, rankPerGame, rankPerSet);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightedPlayerStatistic)) {
            return false;
        }
        HighlightedPlayerStatistic highlightedPlayerStatistic = (HighlightedPlayerStatistic) other;
        return Intrinsics.c(this.value, highlightedPlayerStatistic.value) && this.rankTotal == highlightedPlayerStatistic.rankTotal && this.rankPerGame == highlightedPlayerStatistic.rankPerGame && Intrinsics.c(this.rankPerSet, highlightedPlayerStatistic.rankPerSet);
    }

    public final int getRankPerGame() {
        return this.rankPerGame;
    }

    @Nullable
    public final Integer getRankPerSet() {
        return this.rankPerSet;
    }

    public final int getRankTotal() {
        return this.rankTotal;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.value;
        int a = wv8.a(this.rankPerGame, wv8.a(this.rankTotal, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
        Integer num2 = this.rankPerSet;
        return a + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HighlightedPlayerStatistic(value=" + this.value + ", rankTotal=" + this.rankTotal + ", rankPerGame=" + this.rankPerGame + ", rankPerSet=" + this.rankPerSet + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/HighlightedPlayerStatistic$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/HighlightedPlayerStatistic;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HighlightedPlayerStatistic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HighlightedPlayerStatistic(@Nullable Integer num, int i, int i2, @Nullable Integer num2) {
        this.value = num;
        this.rankTotal = i;
        this.rankPerGame = i2;
        this.rankPerSet = num2;
    }
}
