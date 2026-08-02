package com.sofascore.model.buzzer;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Stage$$serializer;
import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.s8f;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001f¨\u00064"}, d2 = {"Lcom/sofascore/model/buzzer/Race;", "", "Lcom/sofascore/model/mvvm/model/Stage;", "stage", "", "leadingLap", "laps", "", "Lcom/sofascore/model/mvvm/model/Team;", "standings", "<init>", "(Lcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/buzzer/Race;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Stage;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/util/List;", "copy", "(Lcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/sofascore/model/buzzer/Race;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Stage;", "getStage", "Ljava/lang/Integer;", "getLeadingLap", "getLaps", "Ljava/util/List;", "getStandings", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Race {

    @Nullable
    private final Integer laps;

    @Nullable
    private final Integer leadingLap;

    @Nullable
    private final Stage stage;

    @Nullable
    private final List<Team> standings;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new s8f(16))};

    public /* synthetic */ Race(int i, Stage stage, Integer num, Integer num2, List list, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, Race$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stage = stage;
        this.leadingLap = num;
        this.laps = num2;
        this.standings = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Race copy$default(Race race, Stage stage, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stage = race.stage;
        }
        if ((i & 2) != 0) {
            num = race.leadingLap;
        }
        if ((i & 4) != 0) {
            num2 = race.laps;
        }
        if ((i & 8) != 0) {
            list = race.standings;
        }
        return race.copy(stage, num, num2, list);
    }

    public static final /* synthetic */ void write$Self$model_release(Race self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, Stage$$serializer.INSTANCE, self.stage);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.leadingLap);
        output.h(serialDesc, 2, a7aVar, self.laps);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.standings);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Stage getStage() {
        return this.stage;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getLeadingLap() {
        return this.leadingLap;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getLaps() {
        return this.laps;
    }

    @Nullable
    public final List<Team> component4() {
        return this.standings;
    }

    @NotNull
    public final Race copy(@Nullable Stage stage, @Nullable Integer leadingLap, @Nullable Integer laps, @Nullable List<Team> standings) {
        return new Race(stage, leadingLap, laps, standings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Race)) {
            return false;
        }
        Race race = (Race) other;
        return Intrinsics.c(this.stage, race.stage) && Intrinsics.c(this.leadingLap, race.leadingLap) && Intrinsics.c(this.laps, race.laps) && Intrinsics.c(this.standings, race.standings);
    }

    @Nullable
    public final Integer getLaps() {
        return this.laps;
    }

    @Nullable
    public final Integer getLeadingLap() {
        return this.leadingLap;
    }

    @Nullable
    public final Stage getStage() {
        return this.stage;
    }

    @Nullable
    public final List<Team> getStandings() {
        return this.standings;
    }

    public int hashCode() {
        Stage stage = this.stage;
        int hashCode = (stage == null ? 0 : stage.hashCode()) * 31;
        Integer num = this.leadingLap;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.laps;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Team> list = this.standings;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Race(stage=" + this.stage + ", leadingLap=" + this.leadingLap + ", laps=" + this.laps + ", standings=" + this.standings + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/buzzer/Race$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/buzzer/Race;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Race$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Race(@Nullable Stage stage, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Team> list) {
        this.stage = stage;
        this.leadingLap = num;
        this.laps = num2;
        this.standings = list;
    }
}
