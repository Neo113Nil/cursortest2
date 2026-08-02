package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.model.newNetwork.CareerHistory$$serializer;
import defpackage.joa;
import defpackage.oea;
import defpackage.ogb;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/sofascore/model/mvvm/model/ManagerData;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Manager;", SearchResponseKt.MANAGER_ENTITY, "", "Lcom/sofascore/model/newNetwork/CareerHistory;", "careerHistory", "<init>", "(Lcom/sofascore/model/mvvm/model/Manager;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Manager;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/ManagerData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Manager;", "component2", "()Ljava/util/List;", "copy", "(Lcom/sofascore/model/mvvm/model/Manager;Ljava/util/List;)Lcom/sofascore/model/mvvm/model/ManagerData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Manager;", "getManager", "Ljava/util/List;", "getCareerHistory", "setCareerHistory", "(Ljava/util/List;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ManagerData implements Serializable {

    @NotNull
    private List<CareerHistory> careerHistory;

    @NotNull
    private final Manager manager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new ogb(19))};

    public /* synthetic */ ManagerData(int i, Manager manager, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ManagerData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.manager = manager;
        this.careerHistory = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(CareerHistory$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManagerData copy$default(ManagerData managerData, Manager manager, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            manager = managerData.manager;
        }
        if ((i & 2) != 0) {
            list = managerData.careerHistory;
        }
        return managerData.copy(manager, list);
    }

    public static final /* synthetic */ void write$Self$model_release(ManagerData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Manager$$serializer.INSTANCE, self.manager);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.careerHistory);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Manager getManager() {
        return this.manager;
    }

    @NotNull
    public final List<CareerHistory> component2() {
        return this.careerHistory;
    }

    @NotNull
    public final ManagerData copy(@NotNull Manager manager, @NotNull List<CareerHistory> careerHistory) {
        manager.getClass();
        careerHistory.getClass();
        return new ManagerData(manager, careerHistory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagerData)) {
            return false;
        }
        ManagerData managerData = (ManagerData) other;
        return Intrinsics.c(this.manager, managerData.manager) && Intrinsics.c(this.careerHistory, managerData.careerHistory);
    }

    @NotNull
    public final List<CareerHistory> getCareerHistory() {
        return this.careerHistory;
    }

    @NotNull
    public final Manager getManager() {
        return this.manager;
    }

    public int hashCode() {
        return this.careerHistory.hashCode() + (this.manager.hashCode() * 31);
    }

    public final void setCareerHistory(@NotNull List<CareerHistory> list) {
        list.getClass();
        this.careerHistory = list;
    }

    @NotNull
    public String toString() {
        return "ManagerData(manager=" + this.manager + ", careerHistory=" + this.careerHistory + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/ManagerData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/ManagerData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ManagerData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ManagerData(@NotNull Manager manager, @NotNull List<CareerHistory> list) {
        manager.getClass();
        list.getClass();
        this.manager = manager;
        this.careerHistory = list;
    }
}
