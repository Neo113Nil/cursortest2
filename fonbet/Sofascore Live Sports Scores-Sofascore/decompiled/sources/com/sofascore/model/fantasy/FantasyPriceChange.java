package com.sofascore.model.fantasy;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPriceChange;", "", "Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;", "reason", "", "priceChange", "<init>", "(Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;F)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/fantasy/FantasyPriceChangeReason;FLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPriceChange;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;", "component2", "()F", "copy", "(Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;F)Lcom/sofascore/model/fantasy/FantasyPriceChange;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;", "getReason", "F", "getPriceChange", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPriceChange {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float priceChange;

    @NotNull
    private final FantasyPriceChangeReason reason;

    public /* synthetic */ FantasyPriceChange(int i, FantasyPriceChangeReason fantasyPriceChangeReason, float f, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyPriceChange$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.reason = fantasyPriceChangeReason;
        this.priceChange = f;
    }

    public static /* synthetic */ FantasyPriceChange copy$default(FantasyPriceChange fantasyPriceChange, FantasyPriceChangeReason fantasyPriceChangeReason, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            fantasyPriceChangeReason = fantasyPriceChange.reason;
        }
        if ((i & 2) != 0) {
            f = fantasyPriceChange.priceChange;
        }
        return fantasyPriceChange.copy(fantasyPriceChangeReason, f);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPriceChange self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, FantasyPriceChangeReasonSerializer.INSTANCE, self.reason);
        output.t(serialDesc, 1, self.priceChange);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FantasyPriceChangeReason getReason() {
        return this.reason;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPriceChange() {
        return this.priceChange;
    }

    @NotNull
    public final FantasyPriceChange copy(@NotNull FantasyPriceChangeReason reason, float priceChange) {
        reason.getClass();
        return new FantasyPriceChange(reason, priceChange);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPriceChange)) {
            return false;
        }
        FantasyPriceChange fantasyPriceChange = (FantasyPriceChange) other;
        return this.reason == fantasyPriceChange.reason && Float.compare(this.priceChange, fantasyPriceChange.priceChange) == 0;
    }

    public final float getPriceChange() {
        return this.priceChange;
    }

    @NotNull
    public final FantasyPriceChangeReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Float.hashCode(this.priceChange) + (this.reason.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FantasyPriceChange(reason=" + this.reason + ", priceChange=" + this.priceChange + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPriceChange$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPriceChange;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPriceChange$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPriceChange(@NotNull FantasyPriceChangeReason fantasyPriceChangeReason, float f) {
        fantasyPriceChangeReason.getClass();
        this.reason = fantasyPriceChangeReason;
        this.priceChange = f;
    }
}
