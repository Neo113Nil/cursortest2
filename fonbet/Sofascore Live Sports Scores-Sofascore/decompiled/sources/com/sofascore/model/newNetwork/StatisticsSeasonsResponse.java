package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.u9i;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u000210B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0006\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBg\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0006\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0006\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JJ\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0006\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001eR7\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0006\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Ljava/io/Serializable;", "", "Lcom/sofascore/model/newNetwork/UniqueTournamentSeasons;", "uniqueTournamentSeasons", "", "", "", "typesMap", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getUniqueTournamentSeasons", "Ljava/util/Map;", "getTypesMap", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatisticsSeasonsResponse extends NetworkResponse implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Map<Integer, Map<Integer, List<String>>> typesMap;

    @NotNull
    private final List<UniqueTournamentSeasons> uniqueTournamentSeasons;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new u9i(25)), ypa.a(ysaVar, new u9i(26))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatisticsSeasonsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, Map map, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, StatisticsSeasonsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uniqueTournamentSeasons = list;
        this.typesMap = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(UniqueTournamentSeasons$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        a7a a7aVar = a7a.a;
        return new q79(a7aVar, new q79(a7aVar, new xg0(uhi.a, 0), 1), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatisticsSeasonsResponse copy$default(StatisticsSeasonsResponse statisticsSeasonsResponse, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = statisticsSeasonsResponse.uniqueTournamentSeasons;
        }
        if ((i & 2) != 0) {
            map = statisticsSeasonsResponse.typesMap;
        }
        return statisticsSeasonsResponse.copy(list, map);
    }

    public static final /* synthetic */ void write$Self$model_release(StatisticsSeasonsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.uniqueTournamentSeasons);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.typesMap);
    }

    @NotNull
    public final List<UniqueTournamentSeasons> component1() {
        return this.uniqueTournamentSeasons;
    }

    @Nullable
    public final Map<Integer, Map<Integer, List<String>>> component2() {
        return this.typesMap;
    }

    @NotNull
    public final StatisticsSeasonsResponse copy(@NotNull List<UniqueTournamentSeasons> uniqueTournamentSeasons, @Nullable Map<Integer, ? extends Map<Integer, ? extends List<String>>> typesMap) {
        uniqueTournamentSeasons.getClass();
        return new StatisticsSeasonsResponse(uniqueTournamentSeasons, typesMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsSeasonsResponse)) {
            return false;
        }
        StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) other;
        return Intrinsics.c(this.uniqueTournamentSeasons, statisticsSeasonsResponse.uniqueTournamentSeasons) && Intrinsics.c(this.typesMap, statisticsSeasonsResponse.typesMap);
    }

    @Nullable
    public final Map<Integer, Map<Integer, List<String>>> getTypesMap() {
        return this.typesMap;
    }

    @NotNull
    public final List<UniqueTournamentSeasons> getUniqueTournamentSeasons() {
        return this.uniqueTournamentSeasons;
    }

    public int hashCode() {
        int hashCode = this.uniqueTournamentSeasons.hashCode() * 31;
        Map<Integer, Map<Integer, List<String>>> map = this.typesMap;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "StatisticsSeasonsResponse(uniqueTournamentSeasons=" + this.uniqueTournamentSeasons + ", typesMap=" + this.typesMap + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StatisticsSeasonsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StatisticsSeasonsResponse(@NotNull List<UniqueTournamentSeasons> list, @Nullable Map<Integer, ? extends Map<Integer, ? extends List<String>>> map) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.uniqueTournamentSeasons = list;
        this.typesMap = map;
    }
}
