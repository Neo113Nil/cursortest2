package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Stage$$serializer;
import defpackage.b1i;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/StageRaceResult;", "", "Lcom/sofascore/model/mvvm/model/Stage;", "stage", "", "Lcom/sofascore/model/newNetwork/StageTeamPlacement;", "results", "<init>", "(Lcom/sofascore/model/mvvm/model/Stage;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Stage;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageRaceResult;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Stage;", "component2", "()Ljava/util/List;", "copy", "(Lcom/sofascore/model/mvvm/model/Stage;Ljava/util/List;)Lcom/sofascore/model/newNetwork/StageRaceResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Stage;", "getStage", "Ljava/util/List;", "getResults", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageRaceResult {

    @NotNull
    private final List<StageTeamPlacement> results;

    @Nullable
    private final Stage stage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new b1i(14))};

    public /* synthetic */ StageRaceResult(int i, Stage stage, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, StageRaceResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stage = stage;
        this.results = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(StageTeamPlacement$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StageRaceResult copy$default(StageRaceResult stageRaceResult, Stage stage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stage = stageRaceResult.stage;
        }
        if ((i & 2) != 0) {
            list = stageRaceResult.results;
        }
        return stageRaceResult.copy(stage, list);
    }

    public static final /* synthetic */ void write$Self$model_release(StageRaceResult self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, Stage$$serializer.INSTANCE, self.stage);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.results);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Stage getStage() {
        return this.stage;
    }

    @NotNull
    public final List<StageTeamPlacement> component2() {
        return this.results;
    }

    @NotNull
    public final StageRaceResult copy(@Nullable Stage stage, @NotNull List<StageTeamPlacement> results) {
        results.getClass();
        return new StageRaceResult(stage, results);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageRaceResult)) {
            return false;
        }
        StageRaceResult stageRaceResult = (StageRaceResult) other;
        return Intrinsics.c(this.stage, stageRaceResult.stage) && Intrinsics.c(this.results, stageRaceResult.results);
    }

    @NotNull
    public final List<StageTeamPlacement> getResults() {
        return this.results;
    }

    @Nullable
    public final Stage getStage() {
        return this.stage;
    }

    public int hashCode() {
        Stage stage = this.stage;
        return this.results.hashCode() + ((stage == null ? 0 : stage.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "StageRaceResult(stage=" + this.stage + ", results=" + this.results + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageRaceResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageRaceResult;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageRaceResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageRaceResult(@Nullable Stage stage, @NotNull List<StageTeamPlacement> list) {
        list.getClass();
        this.stage = stage;
        this.results = list;
    }
}
