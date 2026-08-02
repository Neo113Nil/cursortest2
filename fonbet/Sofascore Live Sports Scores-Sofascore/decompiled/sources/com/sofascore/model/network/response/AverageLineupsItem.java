package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001e¨\u00063"}, d2 = {"Lcom/sofascore/model/network/response/AverageLineupsItem;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "averageX", "averageY", "", "pointsCount", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;Ljava/lang/Double;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;Ljava/lang/Double;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/AverageLineupsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/lang/Double;", "component3", "component4", "()I", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;Ljava/lang/Double;I)Lcom/sofascore/model/network/response/AverageLineupsItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/Double;", "getAverageX", "getAverageY", "I", "getPointsCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AverageLineupsItem implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double averageX;

    @Nullable
    private final Double averageY;

    @NotNull
    private final Player player;
    private final int pointsCount;

    public /* synthetic */ AverageLineupsItem(int i, Player player, Double d, Double d2, int i2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, AverageLineupsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.averageX = d;
        this.averageY = d2;
        this.pointsCount = i2;
    }

    public static /* synthetic */ AverageLineupsItem copy$default(AverageLineupsItem averageLineupsItem, Player player, Double d, Double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            player = averageLineupsItem.player;
        }
        if ((i2 & 2) != 0) {
            d = averageLineupsItem.averageX;
        }
        if ((i2 & 4) != 0) {
            d2 = averageLineupsItem.averageY;
        }
        if ((i2 & 8) != 0) {
            i = averageLineupsItem.pointsCount;
        }
        return averageLineupsItem.copy(player, d, d2, i);
    }

    public static final /* synthetic */ void write$Self$model_release(AverageLineupsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        h75 h75Var = h75.a;
        output.h(serialDesc, 1, h75Var, self.averageX);
        output.h(serialDesc, 2, h75Var, self.averageY);
        output.u(3, self.pointsCount, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getAverageX() {
        return this.averageX;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getAverageY() {
        return this.averageY;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPointsCount() {
        return this.pointsCount;
    }

    @NotNull
    public final AverageLineupsItem copy(@NotNull Player player, @Nullable Double averageX, @Nullable Double averageY, int pointsCount) {
        player.getClass();
        return new AverageLineupsItem(player, averageX, averageY, pointsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AverageLineupsItem)) {
            return false;
        }
        AverageLineupsItem averageLineupsItem = (AverageLineupsItem) other;
        return Intrinsics.c(this.player, averageLineupsItem.player) && Intrinsics.c(this.averageX, averageLineupsItem.averageX) && Intrinsics.c(this.averageY, averageLineupsItem.averageY) && this.pointsCount == averageLineupsItem.pointsCount;
    }

    @Nullable
    public final Double getAverageX() {
        return this.averageX;
    }

    @Nullable
    public final Double getAverageY() {
        return this.averageY;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public final int getPointsCount() {
        return this.pointsCount;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        Double d = this.averageX;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.averageY;
        return Integer.hashCode(this.pointsCount) + ((hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AverageLineupsItem(player=" + this.player + ", averageX=" + this.averageX + ", averageY=" + this.averageY + ", pointsCount=" + this.pointsCount + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/AverageLineupsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/AverageLineupsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AverageLineupsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AverageLineupsItem(@NotNull Player player, @Nullable Double d, @Nullable Double d2, int i) {
        player.getClass();
        this.player = player;
        this.averageX = d;
        this.averageY = d2;
        this.pointsCount = i;
    }
}
