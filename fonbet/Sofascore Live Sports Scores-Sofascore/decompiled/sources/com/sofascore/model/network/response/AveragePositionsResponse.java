package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Incident$SubstitutionIncident$$serializer;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.tv0;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tBg\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\b\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J@\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b \u0010$R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b\"\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010$R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/sofascore/model/network/response/AveragePositionsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/network/response/AverageLineupsItem;", "home", "away", "Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;", "substitutions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/AveragePositionsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHome", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/util/List;", "getAway", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/network/response/AveragePositionsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSubstitutions", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AveragePositionsResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<AverageLineupsItem> away;

    @NotNull
    private final List<AverageLineupsItem> home;
    private boolean shouldReverseTeams;

    @NotNull
    private final List<Incident.SubstitutionIncident> substitutions;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new tv0(1)), ypa.a(ysaVar, new tv0(2)), ypa.a(ysaVar, new tv0(3)), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AveragePositionsResponse(int i, com.sofascore.model.newNetwork.HeadResponse headResponse, ErrorResponse errorResponse, List list, List list2, List list3, boolean z, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (28 != (i & 28)) {
            oea.z(i, 28, AveragePositionsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.home = list;
        this.away = list2;
        this.substitutions = list3;
        if ((i & 32) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(AverageLineupsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(AverageLineupsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(Incident$SubstitutionIncident$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AveragePositionsResponse copy$default(AveragePositionsResponse averagePositionsResponse, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = averagePositionsResponse.home;
        }
        if ((i & 2) != 0) {
            list2 = averagePositionsResponse.away;
        }
        if ((i & 4) != 0) {
            list3 = averagePositionsResponse.substitutions;
        }
        return averagePositionsResponse.copy(list, list2, list3);
    }

    public static /* synthetic */ List getAway$default(AveragePositionsResponse averagePositionsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return averagePositionsResponse.getAway(teamSides);
    }

    public static /* synthetic */ List getHome$default(AveragePositionsResponse averagePositionsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return averagePositionsResponse.getHome(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(AveragePositionsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.home);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.away);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.substitutions);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 5, self.shouldReverseTeams);
        }
    }

    @NotNull
    public final List<AverageLineupsItem> component1() {
        return this.home;
    }

    @NotNull
    public final List<AverageLineupsItem> component2() {
        return this.away;
    }

    @NotNull
    public final List<Incident.SubstitutionIncident> component3() {
        return this.substitutions;
    }

    @NotNull
    public final AveragePositionsResponse copy(@NotNull List<AverageLineupsItem> home, @NotNull List<AverageLineupsItem> away, @NotNull List<Incident.SubstitutionIncident> substitutions) {
        home.getClass();
        away.getClass();
        substitutions.getClass();
        return new AveragePositionsResponse(home, away, substitutions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AveragePositionsResponse)) {
            return false;
        }
        AveragePositionsResponse averagePositionsResponse = (AveragePositionsResponse) other;
        return Intrinsics.c(this.home, averagePositionsResponse.home) && Intrinsics.c(this.away, averagePositionsResponse.away) && Intrinsics.c(this.substitutions, averagePositionsResponse.substitutions);
    }

    @NotNull
    public final List<AverageLineupsItem> getAway(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.home : this.away;
    }

    @NotNull
    public final List<AverageLineupsItem> getHome(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.away : this.home;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    @NotNull
    public final List<Incident.SubstitutionIncident> getSubstitutions() {
        return this.substitutions;
    }

    public int hashCode() {
        return this.substitutions.hashCode() + dmi.d(this.home.hashCode() * 31, 31, this.away);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        List<AverageLineupsItem> list = this.home;
        List<AverageLineupsItem> list2 = this.away;
        return mz1.p(fc6.s("AveragePositionsResponse(home=", ", away=", ", substitutions=", list, list2), this.substitutions, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/AveragePositionsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/AveragePositionsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AveragePositionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @NotNull
    public final List<AverageLineupsItem> getAway() {
        return this.away;
    }

    @NotNull
    public final List<AverageLineupsItem> getHome() {
        return this.home;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AveragePositionsResponse(@NotNull List<AverageLineupsItem> list, @NotNull List<AverageLineupsItem> list2, @NotNull List<Incident.SubstitutionIncident> list3) {
        super((com.sofascore.model.newNetwork.HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.home = list;
        this.away = list2;
        this.substitutions = list3;
    }
}
