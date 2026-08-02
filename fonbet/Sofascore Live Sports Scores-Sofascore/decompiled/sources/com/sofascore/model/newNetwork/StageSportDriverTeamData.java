package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageSeason$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.b1i;
import defpackage.joa;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,+B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/sofascore/model/newNetwork/StageSportDriverTeamData;", "", "Lcom/sofascore/model/mvvm/model/StageSeason;", "stage", "Lcom/sofascore/model/mvvm/model/Team;", "parentTeam", "", "victories", "racesStarted", "podiums", "polePositions", "", "yearsActive", "<init>", "(Lcom/sofascore/model/mvvm/model/StageSeason;Lcom/sofascore/model/mvvm/model/Team;IIIILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/StageSeason;Lcom/sofascore/model/mvvm/model/Team;IIIILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageSportDriverTeamData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/StageSeason;", "getStage", "()Lcom/sofascore/model/mvvm/model/StageSeason;", "Lcom/sofascore/model/mvvm/model/Team;", "getParentTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "I", "getVictories", "()I", "getRacesStarted", "getPodiums", "getPolePositions", "Ljava/lang/String;", "getYearsActive", "()Ljava/lang/String;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageSportDriverTeamData {

    @NotNull
    private final Team parentTeam;
    private final int podiums;
    private final int polePositions;
    private final int racesStarted;

    @NotNull
    private final StageSeason stage;
    private final int victories;

    @NotNull
    private final String yearsActive;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new b1i(19)), null, null, null, null, null};

    public /* synthetic */ StageSportDriverTeamData(int i, StageSeason stageSeason, Team team, int i2, int i3, int i4, int i5, String str, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, StageSportDriverTeamData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stage = stageSeason;
        this.parentTeam = team;
        this.victories = i2;
        this.racesStarted = i3;
        this.podiums = i4;
        this.polePositions = i5;
        this.yearsActive = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self$model_release(StageSportDriverTeamData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, StageSeason$$serializer.INSTANCE, self.stage);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.parentTeam);
        output.u(2, self.victories, serialDesc);
        output.u(3, self.racesStarted, serialDesc);
        output.u(4, self.podiums, serialDesc);
        output.u(5, self.polePositions, serialDesc);
        output.y(serialDesc, 6, self.yearsActive);
    }

    @NotNull
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    public final int getPodiums() {
        return this.podiums;
    }

    public final int getPolePositions() {
        return this.polePositions;
    }

    public final int getRacesStarted() {
        return this.racesStarted;
    }

    @NotNull
    public final StageSeason getStage() {
        return this.stage;
    }

    public final int getVictories() {
        return this.victories;
    }

    @NotNull
    public final String getYearsActive() {
        return this.yearsActive;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageSportDriverTeamData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageSportDriverTeamData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageSportDriverTeamData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageSportDriverTeamData(@NotNull StageSeason stageSeason, @NotNull Team team, int i, int i2, int i3, int i4, @NotNull String str) {
        stageSeason.getClass();
        team.getClass();
        str.getClass();
        this.stage = stageSeason;
        this.parentTeam = team;
        this.victories = i;
        this.racesStarted = i2;
        this.podiums = i3;
        this.polePositions = i4;
        this.yearsActive = str;
    }
}
