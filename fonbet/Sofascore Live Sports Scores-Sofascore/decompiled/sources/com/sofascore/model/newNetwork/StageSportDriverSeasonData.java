package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageSeason$$serializer;
import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.b1i;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002.-BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/sofascore/model/newNetwork/StageSportDriverSeasonData;", "", "Lcom/sofascore/model/mvvm/model/StageSeason;", "stage", "Lcom/sofascore/model/mvvm/model/Team;", "parentTeam", "", "position", "victories", "racesStarted", "podiums", "polePositions", "", "updatedAtTimestamp", "<init>", "(Lcom/sofascore/model/mvvm/model/StageSeason;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/StageSeason;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageSportDriverSeasonData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/StageSeason;", "getStage", "()Lcom/sofascore/model/mvvm/model/StageSeason;", "Lcom/sofascore/model/mvvm/model/Team;", "getParentTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "getVictories", "getRacesStarted", "getPodiums", "getPolePositions", "Ljava/lang/Long;", "getUpdatedAtTimestamp", "()Ljava/lang/Long;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageSportDriverSeasonData {

    @Nullable
    private final Team parentTeam;

    @Nullable
    private final Integer podiums;

    @Nullable
    private final Integer polePositions;

    @Nullable
    private final Integer position;

    @Nullable
    private final Integer racesStarted;

    @NotNull
    private final StageSeason stage;

    @Nullable
    private final Long updatedAtTimestamp;

    @Nullable
    private final Integer victories;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new b1i(18)), null, null, null, null, null, null};

    public /* synthetic */ StageSportDriverSeasonData(int i, StageSeason stageSeason, Team team, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, StageSportDriverSeasonData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stage = stageSeason;
        this.parentTeam = team;
        this.position = num;
        this.victories = num2;
        this.racesStarted = num3;
        this.podiums = num4;
        this.polePositions = num5;
        this.updatedAtTimestamp = l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self$model_release(StageSportDriverSeasonData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, StageSeason$$serializer.INSTANCE, self.stage);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.parentTeam);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.position);
        output.h(serialDesc, 3, a7aVar, self.victories);
        output.h(serialDesc, 4, a7aVar, self.racesStarted);
        output.h(serialDesc, 5, a7aVar, self.podiums);
        output.h(serialDesc, 6, a7aVar, self.polePositions);
        output.h(serialDesc, 7, lkb.a, self.updatedAtTimestamp);
    }

    @Nullable
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    @Nullable
    public final Integer getPodiums() {
        return this.podiums;
    }

    @Nullable
    public final Integer getPolePositions() {
        return this.polePositions;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final Integer getRacesStarted() {
        return this.racesStarted;
    }

    @NotNull
    public final StageSeason getStage() {
        return this.stage;
    }

    @Nullable
    public final Long getUpdatedAtTimestamp() {
        return this.updatedAtTimestamp;
    }

    @Nullable
    public final Integer getVictories() {
        return this.victories;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageSportDriverSeasonData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageSportDriverSeasonData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageSportDriverSeasonData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageSportDriverSeasonData(@NotNull StageSeason stageSeason, @Nullable Team team, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Long l) {
        stageSeason.getClass();
        this.stage = stageSeason;
        this.parentTeam = team;
        this.position = num;
        this.victories = num2;
        this.racesStarted = num3;
        this.podiums = num4;
        this.polePositions = num5;
        this.updatedAtTimestamp = l;
    }
}
