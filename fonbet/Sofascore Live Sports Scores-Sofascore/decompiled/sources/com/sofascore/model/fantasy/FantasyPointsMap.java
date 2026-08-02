package com.sofascore.model.fantasy;

import defpackage.h75;
import defpackage.joa;
import defpackage.m97;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ>\u0010\u001d\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPointsMap;", "", "", "", "", "points", "minValue", "maxValue", "<init>", "(Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPointsMap;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/Double;", "component3", "copy", "(Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/fantasy/FantasyPointsMap;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getPoints", "Ljava/lang/Double;", "getMinValue", "getMaxValue", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPointsMap {

    @Nullable
    private final Double maxValue;

    @Nullable
    private final Double minValue;

    @NotNull
    private final Map<String, Double> points;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new m97(28)), null, null};

    public /* synthetic */ FantasyPointsMap(int i, Map map, Double d, Double d2, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyPointsMap$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = map;
        this.minValue = d;
        this.maxValue = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new q79(uhi.a, h75.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyPointsMap copy$default(FantasyPointsMap fantasyPointsMap, Map map, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fantasyPointsMap.points;
        }
        if ((i & 2) != 0) {
            d = fantasyPointsMap.minValue;
        }
        if ((i & 4) != 0) {
            d2 = fantasyPointsMap.maxValue;
        }
        return fantasyPointsMap.copy(map, d, d2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPointsMap self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.points);
        h75 h75Var = h75.a;
        output.h(serialDesc, 1, h75Var, self.minValue);
        output.h(serialDesc, 2, h75Var, self.maxValue);
    }

    @NotNull
    public final Map<String, Double> component1() {
        return this.points;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getMinValue() {
        return this.minValue;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getMaxValue() {
        return this.maxValue;
    }

    @NotNull
    public final FantasyPointsMap copy(@NotNull Map<String, Double> points, @Nullable Double minValue, @Nullable Double maxValue) {
        points.getClass();
        return new FantasyPointsMap(points, minValue, maxValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPointsMap)) {
            return false;
        }
        FantasyPointsMap fantasyPointsMap = (FantasyPointsMap) other;
        return Intrinsics.c(this.points, fantasyPointsMap.points) && Intrinsics.c(this.minValue, fantasyPointsMap.minValue) && Intrinsics.c(this.maxValue, fantasyPointsMap.maxValue);
    }

    @Nullable
    public final Double getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    public final Double getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final Map<String, Double> getPoints() {
        return this.points;
    }

    public int hashCode() {
        int hashCode = this.points.hashCode() * 31;
        Double d = this.minValue;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.maxValue;
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FantasyPointsMap(points=" + this.points + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPointsMap$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPointsMap;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPointsMap$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPointsMap(@NotNull Map<String, Double> map, @Nullable Double d, @Nullable Double d2) {
        map.getClass();
        this.points = map;
        this.minValue = d;
        this.maxValue = d2;
    }
}
