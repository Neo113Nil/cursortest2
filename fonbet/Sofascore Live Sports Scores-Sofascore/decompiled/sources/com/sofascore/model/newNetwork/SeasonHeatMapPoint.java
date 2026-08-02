package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/sofascore/model/newNetwork/SeasonHeatMapPoint;", "", "", "x", "y", "", "count", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/SeasonHeatMapPoint;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/SeasonHeatMapPoint;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getX", "getY", "Ljava/lang/Integer;", "getCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SeasonHeatMapPoint {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer count;

    @Nullable
    private final Double x;

    @Nullable
    private final Double y;

    public /* synthetic */ SeasonHeatMapPoint(int i, Double d, Double d2, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, SeasonHeatMapPoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.x = d;
        this.y = d2;
        this.count = num;
    }

    public static /* synthetic */ SeasonHeatMapPoint copy$default(SeasonHeatMapPoint seasonHeatMapPoint, Double d, Double d2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            d = seasonHeatMapPoint.x;
        }
        if ((i & 2) != 0) {
            d2 = seasonHeatMapPoint.y;
        }
        if ((i & 4) != 0) {
            num = seasonHeatMapPoint.count;
        }
        return seasonHeatMapPoint.copy(d, d2, num);
    }

    public static final /* synthetic */ void write$Self$model_release(SeasonHeatMapPoint self, wf3 output, SerialDescriptor serialDesc) {
        h75 h75Var = h75.a;
        output.h(serialDesc, 0, h75Var, self.x);
        output.h(serialDesc, 1, h75Var, self.y);
        output.h(serialDesc, 2, a7a.a, self.count);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getX() {
        return this.x;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getY() {
        return this.y;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @NotNull
    public final SeasonHeatMapPoint copy(@Nullable Double x, @Nullable Double y, @Nullable Integer count) {
        return new SeasonHeatMapPoint(x, y, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonHeatMapPoint)) {
            return false;
        }
        SeasonHeatMapPoint seasonHeatMapPoint = (SeasonHeatMapPoint) other;
        return Intrinsics.c(this.x, seasonHeatMapPoint.x) && Intrinsics.c(this.y, seasonHeatMapPoint.y) && Intrinsics.c(this.count, seasonHeatMapPoint.count);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Double getX() {
        return this.x;
    }

    @Nullable
    public final Double getY() {
        return this.y;
    }

    public int hashCode() {
        Double d = this.x;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.y;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.count;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Double d = this.x;
        Double d2 = this.y;
        Integer num = this.count;
        StringBuilder sb = new StringBuilder("SeasonHeatMapPoint(x=");
        sb.append(d);
        sb.append(", y=");
        sb.append(d2);
        sb.append(", count=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/SeasonHeatMapPoint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/SeasonHeatMapPoint;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SeasonHeatMapPoint$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SeasonHeatMapPoint(@Nullable Double d, @Nullable Double d2, @Nullable Integer num) {
        this.x = d;
        this.y = d2;
        this.count = num;
    }
}
