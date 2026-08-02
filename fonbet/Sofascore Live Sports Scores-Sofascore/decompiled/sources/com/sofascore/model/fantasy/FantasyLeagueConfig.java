package com.sofascore.model.fantasy;

import defpackage.au6;
import defpackage.joa;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006*"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueConfig;", "", "", "id", "", "", "Lcom/sofascore/model/fantasy/FantasyPointsCalculatorItem;", "calculator", "<init>", "(ILjava/util/Map;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeagueConfig;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/Map;", "copy", "(ILjava/util/Map;)Lcom/sofascore/model/fantasy/FantasyLeagueConfig;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/Map;", "getCalculator", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeagueConfig {

    @Nullable
    private final Map<String, FantasyPointsCalculatorItem> calculator;
    private final int id;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new au6(21))};

    public /* synthetic */ FantasyLeagueConfig(int i, int i2, Map map, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyLeagueConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.calculator = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new q79(uhi.a, FantasyPointsCalculatorItem$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyLeagueConfig copy$default(FantasyLeagueConfig fantasyLeagueConfig, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyLeagueConfig.id;
        }
        if ((i2 & 2) != 0) {
            map = fantasyLeagueConfig.calculator;
        }
        return fantasyLeagueConfig.copy(i, map);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeagueConfig self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.calculator);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, FantasyPointsCalculatorItem> component2() {
        return this.calculator;
    }

    @NotNull
    public final FantasyLeagueConfig copy(int id, @Nullable Map<String, FantasyPointsCalculatorItem> calculator) {
        return new FantasyLeagueConfig(id, calculator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeagueConfig)) {
            return false;
        }
        FantasyLeagueConfig fantasyLeagueConfig = (FantasyLeagueConfig) other;
        return this.id == fantasyLeagueConfig.id && Intrinsics.c(this.calculator, fantasyLeagueConfig.calculator);
    }

    @Nullable
    public final Map<String, FantasyPointsCalculatorItem> getCalculator() {
        return this.calculator;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Map<String, FantasyPointsCalculatorItem> map = this.calculator;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "FantasyLeagueConfig(id=" + this.id + ", calculator=" + this.calculator + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueConfig;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeagueConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeagueConfig(int i, @Nullable Map<String, FantasyPointsCalculatorItem> map) {
        this.id = i;
        this.calculator = map;
    }
}
