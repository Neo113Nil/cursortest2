package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.fc6;
import defpackage.lnb;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0018¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/ManagerPerformance;", "Ljava/io/Serializable;", "", U3.i.l, "wins", "draws", "losses", "totalPoints", "<init>", "(IIIII)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIIIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ManagerPerformance;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Lcom/sofascore/model/newNetwork/ManagerPerformance;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotal", "getWins", "getDraws", "getLosses", "getTotalPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ManagerPerformance implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int draws;
    private final int losses;
    private final int total;
    private final int totalPoints;
    private final int wins;

    public /* synthetic */ ManagerPerformance(int i, int i2, int i3, int i4, int i5, int i6, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, ManagerPerformance$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.total = i2;
        this.wins = i3;
        this.draws = i4;
        this.losses = i5;
        this.totalPoints = i6;
    }

    public static /* synthetic */ ManagerPerformance copy$default(ManagerPerformance managerPerformance, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = managerPerformance.total;
        }
        if ((i6 & 2) != 0) {
            i2 = managerPerformance.wins;
        }
        if ((i6 & 4) != 0) {
            i3 = managerPerformance.draws;
        }
        if ((i6 & 8) != 0) {
            i4 = managerPerformance.losses;
        }
        if ((i6 & 16) != 0) {
            i5 = managerPerformance.totalPoints;
        }
        int i7 = i5;
        int i8 = i3;
        return managerPerformance.copy(i, i2, i8, i4, i7);
    }

    public static final /* synthetic */ void write$Self$model_release(ManagerPerformance self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.total, serialDesc);
        output.u(1, self.wins, serialDesc);
        output.u(2, self.draws, serialDesc);
        output.u(3, self.losses, serialDesc);
        output.u(4, self.totalPoints, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWins() {
        return this.wins;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDraws() {
        return this.draws;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLosses() {
        return this.losses;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalPoints() {
        return this.totalPoints;
    }

    @NotNull
    public final ManagerPerformance copy(int total, int wins, int draws, int losses, int totalPoints) {
        return new ManagerPerformance(total, wins, draws, losses, totalPoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagerPerformance)) {
            return false;
        }
        ManagerPerformance managerPerformance = (ManagerPerformance) other;
        return this.total == managerPerformance.total && this.wins == managerPerformance.wins && this.draws == managerPerformance.draws && this.losses == managerPerformance.losses && this.totalPoints == managerPerformance.totalPoints;
    }

    public final int getDraws() {
        return this.draws;
    }

    public final int getLosses() {
        return this.losses;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getTotalPoints() {
        return this.totalPoints;
    }

    public final int getWins() {
        return this.wins;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalPoints) + wv8.a(this.losses, wv8.a(this.draws, wv8.a(this.wins, Integer.hashCode(this.total) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.total;
        int i2 = this.wins;
        int i3 = this.draws;
        int i4 = this.losses;
        int i5 = this.totalPoints;
        StringBuilder s = lnb.s(i, i2, "ManagerPerformance(total=", ", wins=", ", draws=");
        me4.q(s, i3, ", losses=", i4, ", totalPoints=");
        return fc6.h(i5, ")", s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ManagerPerformance$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ManagerPerformance;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ManagerPerformance$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ManagerPerformance(int i, int i2, int i3, int i4, int i5) {
        this.total = i;
        this.wins = i2;
        this.draws = i3;
        this.losses = i4;
        this.totalPoints = i5;
    }
}
