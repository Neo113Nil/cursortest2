package com.sofascore.model.newNetwork;

import defpackage.dmi;
import defpackage.egi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J@\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u0019¨\u0006-"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamEventShotmapWrapper;", "", "", "Lcom/sofascore/model/newNetwork/SeasonShotAction;", "firstTeamShotmap", "secondTeamShotmap", "Lcom/sofascore/model/newNetwork/ShotActionArea;", "shotActionAreas", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamEventShotmapWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/TeamEventShotmapWrapper;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFirstTeamShotmap", "getSecondTeamShotmap", "getShotActionAreas", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamEventShotmapWrapper {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<SeasonShotAction> firstTeamShotmap;

    @NotNull
    private final List<SeasonShotAction> secondTeamShotmap;

    @NotNull
    private final List<ShotActionArea> shotActionAreas;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new egi(26)), ypa.a(ysaVar, new egi(27)), ypa.a(ysaVar, new egi(28))};
    }

    public /* synthetic */ TeamEventShotmapWrapper(int i, List list, List list2, List list3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TeamEventShotmapWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.firstTeamShotmap = list;
        this.secondTeamShotmap = list2;
        this.shotActionAreas = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(SeasonShotAction$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(SeasonShotAction$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(ShotActionArea$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamEventShotmapWrapper copy$default(TeamEventShotmapWrapper teamEventShotmapWrapper, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = teamEventShotmapWrapper.firstTeamShotmap;
        }
        if ((i & 2) != 0) {
            list2 = teamEventShotmapWrapper.secondTeamShotmap;
        }
        if ((i & 4) != 0) {
            list3 = teamEventShotmapWrapper.shotActionAreas;
        }
        return teamEventShotmapWrapper.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamEventShotmapWrapper self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.firstTeamShotmap);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.secondTeamShotmap);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.shotActionAreas);
    }

    @NotNull
    public final List<SeasonShotAction> component1() {
        return this.firstTeamShotmap;
    }

    @NotNull
    public final List<SeasonShotAction> component2() {
        return this.secondTeamShotmap;
    }

    @NotNull
    public final List<ShotActionArea> component3() {
        return this.shotActionAreas;
    }

    @NotNull
    public final TeamEventShotmapWrapper copy(@NotNull List<SeasonShotAction> firstTeamShotmap, @NotNull List<SeasonShotAction> secondTeamShotmap, @NotNull List<ShotActionArea> shotActionAreas) {
        firstTeamShotmap.getClass();
        secondTeamShotmap.getClass();
        shotActionAreas.getClass();
        return new TeamEventShotmapWrapper(firstTeamShotmap, secondTeamShotmap, shotActionAreas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamEventShotmapWrapper)) {
            return false;
        }
        TeamEventShotmapWrapper teamEventShotmapWrapper = (TeamEventShotmapWrapper) other;
        return Intrinsics.c(this.firstTeamShotmap, teamEventShotmapWrapper.firstTeamShotmap) && Intrinsics.c(this.secondTeamShotmap, teamEventShotmapWrapper.secondTeamShotmap) && Intrinsics.c(this.shotActionAreas, teamEventShotmapWrapper.shotActionAreas);
    }

    @NotNull
    public final List<SeasonShotAction> getFirstTeamShotmap() {
        return this.firstTeamShotmap;
    }

    @NotNull
    public final List<SeasonShotAction> getSecondTeamShotmap() {
        return this.secondTeamShotmap;
    }

    @NotNull
    public final List<ShotActionArea> getShotActionAreas() {
        return this.shotActionAreas;
    }

    public int hashCode() {
        return this.shotActionAreas.hashCode() + dmi.d(this.firstTeamShotmap.hashCode() * 31, 31, this.secondTeamShotmap);
    }

    @NotNull
    public String toString() {
        List<SeasonShotAction> list = this.firstTeamShotmap;
        List<SeasonShotAction> list2 = this.secondTeamShotmap;
        return mz1.p(fc6.s("TeamEventShotmapWrapper(firstTeamShotmap=", ", secondTeamShotmap=", ", shotActionAreas=", list, list2), this.shotActionAreas, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamEventShotmapWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamEventShotmapWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamEventShotmapWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamEventShotmapWrapper(@NotNull List<SeasonShotAction> list, @NotNull List<SeasonShotAction> list2, @NotNull List<ShotActionArea> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.firstTeamShotmap = list;
        this.secondTeamShotmap = list2;
        this.shotActionAreas = list3;
    }
}
