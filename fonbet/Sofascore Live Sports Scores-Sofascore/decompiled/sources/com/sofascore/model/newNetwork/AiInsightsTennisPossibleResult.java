package com.sofascore.model.newNetwork;

import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsTennisPossibleResult;", "", "", "home", "away", "", "probability", "<init>", "(IID)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIDLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AiInsightsTennisPossibleResult;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()D", "copy", "(IID)Lcom/sofascore/model/newNetwork/AiInsightsTennisPossibleResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHome", "getAway", "D", "getProbability", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiInsightsTennisPossibleResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int away;
    private final int home;
    private final double probability;

    public /* synthetic */ AiInsightsTennisPossibleResult(int i, int i2, int i3, double d, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, AiInsightsTennisPossibleResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.home = i2;
        this.away = i3;
        this.probability = d;
    }

    public static /* synthetic */ AiInsightsTennisPossibleResult copy$default(AiInsightsTennisPossibleResult aiInsightsTennisPossibleResult, int i, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aiInsightsTennisPossibleResult.home;
        }
        if ((i3 & 2) != 0) {
            i2 = aiInsightsTennisPossibleResult.away;
        }
        if ((i3 & 4) != 0) {
            d = aiInsightsTennisPossibleResult.probability;
        }
        return aiInsightsTennisPossibleResult.copy(i, i2, d);
    }

    public static final /* synthetic */ void write$Self$model_release(AiInsightsTennisPossibleResult self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.home, serialDesc);
        output.u(1, self.away, serialDesc);
        output.D(serialDesc, 2, self.probability);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHome() {
        return this.home;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAway() {
        return this.away;
    }

    /* renamed from: component3, reason: from getter */
    public final double getProbability() {
        return this.probability;
    }

    @NotNull
    public final AiInsightsTennisPossibleResult copy(int home, int away, double probability) {
        return new AiInsightsTennisPossibleResult(home, away, probability);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInsightsTennisPossibleResult)) {
            return false;
        }
        AiInsightsTennisPossibleResult aiInsightsTennisPossibleResult = (AiInsightsTennisPossibleResult) other;
        return this.home == aiInsightsTennisPossibleResult.home && this.away == aiInsightsTennisPossibleResult.away && Double.compare(this.probability, aiInsightsTennisPossibleResult.probability) == 0;
    }

    public final int getAway() {
        return this.away;
    }

    public final int getHome() {
        return this.home;
    }

    public final double getProbability() {
        return this.probability;
    }

    public int hashCode() {
        return Double.hashCode(this.probability) + wv8.a(this.away, Integer.hashCode(this.home) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.home;
        int i2 = this.away;
        double d = this.probability;
        StringBuilder s = lnb.s(i, i2, "AiInsightsTennisPossibleResult(home=", ", away=", ", probability=");
        s.append(d);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsTennisPossibleResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AiInsightsTennisPossibleResult;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AiInsightsTennisPossibleResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiInsightsTennisPossibleResult(int i, int i2, double d) {
        this.home = i;
        this.away = i2;
        this.probability = d;
    }
}
