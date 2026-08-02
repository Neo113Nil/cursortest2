package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.jf7;
import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUniqueTournamentCompetitionMapping;", "", "", "", "fantasyCompetitionMap", "<init>", "(Ljava/util/Map;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyUniqueTournamentCompetitionMapping;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/sofascore/model/fantasy/FantasyUniqueTournamentCompetitionMapping;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getFantasyCompetitionMap", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyUniqueTournamentCompetitionMapping {

    @NotNull
    private final Map<Integer, Integer> fantasyCompetitionMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new jf7(25))};

    public /* synthetic */ FantasyUniqueTournamentCompetitionMapping(int i, Map map, t5h t5hVar) {
        if (1 == (i & 1)) {
            this.fantasyCompetitionMap = map;
        } else {
            oea.z(i, 1, FantasyUniqueTournamentCompetitionMapping$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        a7a a7aVar = a7a.a;
        return new q79(a7aVar, a7aVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyUniqueTournamentCompetitionMapping copy$default(FantasyUniqueTournamentCompetitionMapping fantasyUniqueTournamentCompetitionMapping, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fantasyUniqueTournamentCompetitionMapping.fantasyCompetitionMap;
        }
        return fantasyUniqueTournamentCompetitionMapping.copy(map);
    }

    @NotNull
    public final Map<Integer, Integer> component1() {
        return this.fantasyCompetitionMap;
    }

    @NotNull
    public final FantasyUniqueTournamentCompetitionMapping copy(@NotNull Map<Integer, Integer> fantasyCompetitionMap) {
        fantasyCompetitionMap.getClass();
        return new FantasyUniqueTournamentCompetitionMapping(fantasyCompetitionMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FantasyUniqueTournamentCompetitionMapping) && Intrinsics.c(this.fantasyCompetitionMap, ((FantasyUniqueTournamentCompetitionMapping) other).fantasyCompetitionMap);
    }

    @NotNull
    public final Map<Integer, Integer> getFantasyCompetitionMap() {
        return this.fantasyCompetitionMap;
    }

    public int hashCode() {
        return this.fantasyCompetitionMap.hashCode();
    }

    @NotNull
    public String toString() {
        return "FantasyUniqueTournamentCompetitionMapping(fantasyCompetitionMap=" + this.fantasyCompetitionMap + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUniqueTournamentCompetitionMapping$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyUniqueTournamentCompetitionMapping;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyUniqueTournamentCompetitionMapping$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyUniqueTournamentCompetitionMapping(@NotNull Map<Integer, Integer> map) {
        map.getClass();
        this.fantasyCompetitionMap = map;
    }
}
