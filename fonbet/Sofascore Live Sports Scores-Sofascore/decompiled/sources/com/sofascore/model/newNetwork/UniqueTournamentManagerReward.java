package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Manager$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.dmi;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vak;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JF\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006:"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentManagerReward;", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualReward;", "", "id", "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/mvvm/model/Manager;", SearchResponseKt.MANAGER_ENTITY, "", "name", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "type", "<init>", "(ILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentManagerReward;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Lcom/sofascore/model/mvvm/model/Manager;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "copy", "(ILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;)Lcom/sofascore/model/newNetwork/UniqueTournamentManagerReward;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/mvvm/model/Manager;", "getManager", "Ljava/lang/String;", "getName", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "getType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentManagerReward implements UniqueTournamentIndividualReward {
    private final int id;

    @NotNull
    private final Manager manager;

    @NotNull
    private final String name;

    @Nullable
    private final Team team;

    @Nullable
    private final UniqueTournamentIndividualAwardType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new vak(5)), null, null, null};

    public /* synthetic */ UniqueTournamentManagerReward(int i, int i2, Team team, Manager manager, String str, UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, UniqueTournamentManagerReward$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.team = team;
        this.manager = manager;
        this.name = str;
        this.type = uniqueTournamentIndividualAwardType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ UniqueTournamentManagerReward copy$default(UniqueTournamentManagerReward uniqueTournamentManagerReward, int i, Team team, Manager manager, String str, UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uniqueTournamentManagerReward.id;
        }
        if ((i2 & 2) != 0) {
            team = uniqueTournamentManagerReward.team;
        }
        if ((i2 & 4) != 0) {
            manager = uniqueTournamentManagerReward.manager;
        }
        if ((i2 & 8) != 0) {
            str = uniqueTournamentManagerReward.name;
        }
        if ((i2 & 16) != 0) {
            uniqueTournamentIndividualAwardType = uniqueTournamentManagerReward.type;
        }
        UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType2 = uniqueTournamentIndividualAwardType;
        Manager manager2 = manager;
        return uniqueTournamentManagerReward.copy(i, team, manager2, str, uniqueTournamentIndividualAwardType2);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentManagerReward self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.f(serialDesc, 2, Manager$$serializer.INSTANCE, self.manager);
        output.y(serialDesc, 3, self.getName());
        output.h(serialDesc, 4, UniqueTournamentIndividualAwardTypeSerializer.INSTANCE, self.getType());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Manager getManager() {
        return this.manager;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final UniqueTournamentIndividualAwardType getType() {
        return this.type;
    }

    @NotNull
    public final UniqueTournamentManagerReward copy(int id, @Nullable Team team, @NotNull Manager manager, @NotNull String name, @Nullable UniqueTournamentIndividualAwardType type) {
        manager.getClass();
        name.getClass();
        return new UniqueTournamentManagerReward(id, team, manager, name, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentManagerReward)) {
            return false;
        }
        UniqueTournamentManagerReward uniqueTournamentManagerReward = (UniqueTournamentManagerReward) other;
        return this.id == uniqueTournamentManagerReward.id && Intrinsics.c(this.team, uniqueTournamentManagerReward.team) && Intrinsics.c(this.manager, uniqueTournamentManagerReward.manager) && Intrinsics.c(this.name, uniqueTournamentManagerReward.name) && this.type == uniqueTournamentManagerReward.type;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Manager getManager() {
        return this.manager;
    }

    @Override // com.sofascore.model.newNetwork.UniqueTournamentIndividualReward
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Override // com.sofascore.model.newNetwork.UniqueTournamentIndividualReward
    @Nullable
    public UniqueTournamentIndividualAwardType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Team team = this.team;
        int c = dmi.c((this.manager.hashCode() + ((hashCode + (team == null ? 0 : team.hashCode())) * 31)) * 31, 31, this.name);
        UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType = this.type;
        return c + (uniqueTournamentIndividualAwardType != null ? uniqueTournamentIndividualAwardType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UniqueTournamentManagerReward(id=" + this.id + ", team=" + this.team + ", manager=" + this.manager + ", name=" + this.name + ", type=" + this.type + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentManagerReward$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentManagerReward;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentManagerReward$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentManagerReward(int i, @Nullable Team team, @NotNull Manager manager, @NotNull String str, @Nullable UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType) {
        manager.getClass();
        str.getClass();
        this.id = i;
        this.team = team;
        this.manager = manager;
        this.name = str;
        this.type = uniqueTournamentIndividualAwardType;
    }
}
