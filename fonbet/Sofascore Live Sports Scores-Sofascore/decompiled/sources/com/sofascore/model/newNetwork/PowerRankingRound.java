package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Round$$serializer;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006)"}, d2 = {"Lcom/sofascore/model/newNetwork/PowerRankingRound;", "", "Lcom/sofascore/model/mvvm/model/Round;", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "", "id", "<init>", "(Lcom/sofascore/model/mvvm/model/Round;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Round;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PowerRankingRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Round;", "component2", "()I", "copy", "(Lcom/sofascore/model/mvvm/model/Round;I)Lcom/sofascore/model/newNetwork/PowerRankingRound;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Round;", "getRound", "I", "getId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PowerRankingRound {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int id;

    @NotNull
    private final Round round;

    public /* synthetic */ PowerRankingRound(int i, Round round, int i2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, PowerRankingRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.round = round;
        this.id = i2;
    }

    public static /* synthetic */ PowerRankingRound copy$default(PowerRankingRound powerRankingRound, Round round, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            round = powerRankingRound.round;
        }
        if ((i2 & 2) != 0) {
            i = powerRankingRound.id;
        }
        return powerRankingRound.copy(round, i);
    }

    public static final /* synthetic */ void write$Self$model_release(PowerRankingRound self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Round$$serializer.INSTANCE, self.round);
        output.u(1, self.id, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Round getRound() {
        return this.round;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final PowerRankingRound copy(@NotNull Round round, int id) {
        round.getClass();
        return new PowerRankingRound(round, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PowerRankingRound)) {
            return false;
        }
        PowerRankingRound powerRankingRound = (PowerRankingRound) other;
        return Intrinsics.c(this.round, powerRankingRound.round) && this.id == powerRankingRound.id;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Round getRound() {
        return this.round;
    }

    public int hashCode() {
        return Integer.hashCode(this.id) + (this.round.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PowerRankingRound(round=" + this.round + ", id=" + this.id + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PowerRankingRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PowerRankingRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PowerRankingRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PowerRankingRound(@NotNull Round round, int i) {
        round.getClass();
        this.round = round;
        this.id = i;
    }
}
