package com.sofascore.model.fantasy;

import com.ironsource.U3;
import defpackage.fc6;
import defpackage.h75;
import defpackage.joa;
import defpackage.m97;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBU\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u0004\u0018\u00010\u0007*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J1\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u001e\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b1\u0010\u0015Jj\u00102\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010.R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@¨\u0006D"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPointsCalculatorItem;", "", "", "Lcom/sofascore/model/fantasy/FantasyPointsMap;", "pointLevels", "", "", "", "points", "modifier", "valueThreshold", "totalThreshold", "pctThreshold", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "component4", "()Ljava/lang/Double;", "component5", "component6", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPointsCalculatorItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "position", "getPointsForPosition", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;", U3.i.X, U3.i.l, "pct", "getPointsForValue", "(DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)D", "Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;", "fantasyStatistic", "calculatePoints", "(Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;Ljava/lang/String;)I", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "component3", "copy", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/fantasy/FantasyPointsCalculatorItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPointLevels", "Ljava/util/Map;", "getPoints", "Ljava/lang/Double;", "getModifier", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPointsCalculatorItem {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double modifier;

    @Nullable
    private final Double pctThreshold;

    @Nullable
    private final List<FantasyPointsMap> pointLevels;

    @Nullable
    private final Map<String, Double> points;

    @Nullable
    private final Double totalThreshold;

    @Nullable
    private final Double valueThreshold;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new m97(24)), ypa.a(ysaVar, new m97(25)), null, null, null, null};
    }

    public /* synthetic */ FantasyPointsCalculatorItem(int i, List list, Map map, Double d, Double d2, Double d3, Double d4, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, FantasyPointsCalculatorItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pointLevels = list;
        this.points = map;
        this.modifier = d;
        this.valueThreshold = d2;
        this.totalThreshold = d3;
        this.pctThreshold = d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyPointsMap$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new q79(uhi.a, h75.a, 1);
    }

    /* renamed from: component4, reason: from getter */
    private final Double getValueThreshold() {
        return this.valueThreshold;
    }

    /* renamed from: component5, reason: from getter */
    private final Double getTotalThreshold() {
        return this.totalThreshold;
    }

    /* renamed from: component6, reason: from getter */
    private final Double getPctThreshold() {
        return this.pctThreshold;
    }

    public static /* synthetic */ FantasyPointsCalculatorItem copy$default(FantasyPointsCalculatorItem fantasyPointsCalculatorItem, List list, Map map, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasyPointsCalculatorItem.pointLevels;
        }
        if ((i & 2) != 0) {
            map = fantasyPointsCalculatorItem.points;
        }
        if ((i & 4) != 0) {
            d = fantasyPointsCalculatorItem.modifier;
        }
        if ((i & 8) != 0) {
            d2 = fantasyPointsCalculatorItem.valueThreshold;
        }
        if ((i & 16) != 0) {
            d3 = fantasyPointsCalculatorItem.totalThreshold;
        }
        if ((i & 32) != 0) {
            d4 = fantasyPointsCalculatorItem.pctThreshold;
        }
        Double d5 = d3;
        Double d6 = d4;
        return fantasyPointsCalculatorItem.copy(list, map, d, d2, d5, d6);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPointsCalculatorItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.pointLevels);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.points);
        h75 h75Var = h75.a;
        output.h(serialDesc, 2, h75Var, self.modifier);
        output.h(serialDesc, 3, h75Var, self.valueThreshold);
        output.h(serialDesc, 4, h75Var, self.totalThreshold);
        output.h(serialDesc, 5, h75Var, self.pctThreshold);
    }

    public final int calculatePoints(@NotNull FantasyPlayerStatistic fantasyStatistic, @NotNull String position) {
        Double f;
        Double d;
        Double d2;
        fantasyStatistic.getClass();
        position.getClass();
        if (StringsKt.J(fantasyStatistic.getValue(), "/", false) && StringsKt.J(fantasyStatistic.getValue(), "%", false)) {
            List Y = StringsKt.Y(fantasyStatistic.getValue(), new char[]{'/', '(', '%'});
            f = b.f((String) Y.get(0));
            Double f2 = b.f((String) Y.get(1));
            d2 = b.f((String) Y.get(2));
            d = f2;
        } else {
            f = b.f(fantasyStatistic.getValue());
            d = null;
            d2 = null;
        }
        if (f != null) {
            return (int) getPointsForValue(f.doubleValue(), d, d2, position);
        }
        return 0;
    }

    @Nullable
    public final List<FantasyPointsMap> component1() {
        return this.pointLevels;
    }

    @Nullable
    public final Map<String, Double> component2() {
        return this.points;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getModifier() {
        return this.modifier;
    }

    @NotNull
    public final FantasyPointsCalculatorItem copy(@Nullable List<FantasyPointsMap> pointLevels, @Nullable Map<String, Double> points, @Nullable Double modifier, @Nullable Double valueThreshold, @Nullable Double totalThreshold, @Nullable Double pctThreshold) {
        return new FantasyPointsCalculatorItem(pointLevels, points, modifier, valueThreshold, totalThreshold, pctThreshold);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPointsCalculatorItem)) {
            return false;
        }
        FantasyPointsCalculatorItem fantasyPointsCalculatorItem = (FantasyPointsCalculatorItem) other;
        return Intrinsics.c(this.pointLevels, fantasyPointsCalculatorItem.pointLevels) && Intrinsics.c(this.points, fantasyPointsCalculatorItem.points) && Intrinsics.c(this.modifier, fantasyPointsCalculatorItem.modifier) && Intrinsics.c(this.valueThreshold, fantasyPointsCalculatorItem.valueThreshold) && Intrinsics.c(this.totalThreshold, fantasyPointsCalculatorItem.totalThreshold) && Intrinsics.c(this.pctThreshold, fantasyPointsCalculatorItem.pctThreshold);
    }

    @Nullable
    public final Double getModifier() {
        return this.modifier;
    }

    @Nullable
    public final List<FantasyPointsMap> getPointLevels() {
        return this.pointLevels;
    }

    @Nullable
    public final Map<String, Double> getPoints() {
        return this.points;
    }

    @Nullable
    public final Double getPointsForPosition(@NotNull Map<String, Double> map, @NotNull String str) {
        map.getClass();
        str.getClass();
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return map.get(upperCase);
    }

    public final double getPointsForValue(double value, @Nullable Double total, @Nullable Double pct, @NotNull String position) {
        Object obj;
        Map<String, Double> points;
        Double pointsForPosition;
        position.getClass();
        Double d = this.valueThreshold;
        if (d != null && value < d.doubleValue()) {
            return 0.0d;
        }
        if (this.totalThreshold != null) {
            if ((total != null ? total.doubleValue() : 0.0d) < this.totalThreshold.doubleValue()) {
                return 0.0d;
            }
        }
        if (this.pctThreshold != null) {
            if ((pct != null ? pct.doubleValue() : 0.0d) < this.pctThreshold.doubleValue()) {
                return 0.0d;
            }
        }
        List<FantasyPointsMap> list = this.pointLevels;
        if (list == null) {
            Map<String, Double> map = this.points;
            if (map != null) {
                Double pointsForPosition2 = getPointsForPosition(map, position);
                r1 = pointsForPosition2 != null ? pointsForPosition2.doubleValue() : 0.0d;
                if (this.valueThreshold == null && this.totalThreshold == null && this.pctThreshold == null) {
                    Double d2 = this.modifier;
                    return Math.floor(value / (d2 != null ? d2.doubleValue() : 1.0d)) * r1;
                }
            }
            return r1;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            FantasyPointsMap fantasyPointsMap = (FantasyPointsMap) obj;
            Double minValue = fantasyPointsMap.getMinValue();
            Double maxValue = fantasyPointsMap.getMaxValue();
            if (value >= (minValue != null ? minValue.doubleValue() : Double.MIN_VALUE)) {
                if (value < (maxValue != null ? maxValue.doubleValue() : Double.MAX_VALUE)) {
                    break;
                }
            }
        }
        FantasyPointsMap fantasyPointsMap2 = (FantasyPointsMap) obj;
        if (fantasyPointsMap2 == null || (points = fantasyPointsMap2.getPoints()) == null || (pointsForPosition = getPointsForPosition(points, position)) == null) {
            return 0.0d;
        }
        return pointsForPosition.doubleValue();
    }

    public int hashCode() {
        List<FantasyPointsMap> list = this.pointLevels;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, Double> map = this.points;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Double d = this.modifier;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.valueThreshold;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.totalThreshold;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.pctThreshold;
        return hashCode5 + (d4 != null ? d4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<FantasyPointsMap> list = this.pointLevels;
        Map<String, Double> map = this.points;
        Double d = this.modifier;
        Double d2 = this.valueThreshold;
        Double d3 = this.totalThreshold;
        Double d4 = this.pctThreshold;
        StringBuilder sb = new StringBuilder("FantasyPointsCalculatorItem(pointLevels=");
        sb.append(list);
        sb.append(", points=");
        sb.append(map);
        sb.append(", modifier=");
        fc6.A(sb, d, ", valueThreshold=", d2, ", totalThreshold=");
        sb.append(d3);
        sb.append(", pctThreshold=");
        sb.append(d4);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPointsCalculatorItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPointsCalculatorItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPointsCalculatorItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPointsCalculatorItem(@Nullable List<FantasyPointsMap> list, @Nullable Map<String, Double> map, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4) {
        this.pointLevels = list;
        this.points = map;
        this.modifier = d;
        this.valueThreshold = d2;
        this.totalThreshold = d3;
        this.pctThreshold = d4;
    }
}
