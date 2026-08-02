package com.sofascore.model.newNetwork;

import defpackage.a7a;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;", "", "", "home", "away", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getHome", "getAway", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiInsightsTennisWinningProbability {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer away;

    @Nullable
    private final Integer home;

    public /* synthetic */ AiInsightsTennisWinningProbability(int i, Integer num, Integer num2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, AiInsightsTennisWinningProbability$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.home = num;
        this.away = num2;
    }

    public static /* synthetic */ AiInsightsTennisWinningProbability copy$default(AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aiInsightsTennisWinningProbability.home;
        }
        if ((i & 2) != 0) {
            num2 = aiInsightsTennisWinningProbability.away;
        }
        return aiInsightsTennisWinningProbability.copy(num, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(AiInsightsTennisWinningProbability self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.home);
        output.h(serialDesc, 1, a7aVar, self.away);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getHome() {
        return this.home;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAway() {
        return this.away;
    }

    @NotNull
    public final AiInsightsTennisWinningProbability copy(@Nullable Integer home, @Nullable Integer away) {
        return new AiInsightsTennisWinningProbability(home, away);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInsightsTennisWinningProbability)) {
            return false;
        }
        AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability = (AiInsightsTennisWinningProbability) other;
        return Intrinsics.c(this.home, aiInsightsTennisWinningProbability.home) && Intrinsics.c(this.away, aiInsightsTennisWinningProbability.away);
    }

    @Nullable
    public final Integer getAway() {
        return this.away;
    }

    @Nullable
    public final Integer getHome() {
        return this.home;
    }

    public int hashCode() {
        Integer num = this.home;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.away;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AiInsightsTennisWinningProbability(home=" + this.home + ", away=" + this.away + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AiInsightsTennisWinningProbability$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiInsightsTennisWinningProbability(@Nullable Integer num, @Nullable Integer num2) {
        this.home = num;
        this.away = num2;
    }
}
