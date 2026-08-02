package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.a7a;
import defpackage.bxe;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b&\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010-JT\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u0014J\u0010\u00101\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010+R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b\u000b\u0010-R\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/sofascore/model/newNetwork/PointPP;", "Ljava/io/Serializable;", "", "homePoint", "awayPoint", "", "pointDescription", "Lcom/sofascore/model/newNetwork/PointType;", "homePointType", "awayPointType", "", "isHome", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/PointType;Lcom/sofascore/model/newNetwork/PointType;Ljava/lang/Boolean;)V", "seen0", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/PointType;Lcom/sofascore/model/newNetwork/PointType;Ljava/lang/Boolean;ZLt5h;)V", "component1", "()Ljava/lang/String;", "component2", "component4", "()Lcom/sofascore/model/newNetwork/PointType;", "component5", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PointPP;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomePoint", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/String;", "getAwayPoint", "getHomePointType", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/newNetwork/PointType;", "getAwayPointType", "component3", "()Ljava/lang/Integer;", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/PointType;Lcom/sofascore/model/newNetwork/PointType;Ljava/lang/Boolean;)Lcom/sofascore/model/newNetwork/PointPP;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Ljava/lang/Integer;", "getPointDescription", "Lcom/sofascore/model/newNetwork/PointType;", "Ljava/lang/Boolean;", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PointPP implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String awayPoint;

    @Nullable
    private final PointType awayPointType;

    @NotNull
    private final String homePoint;

    @Nullable
    private final PointType homePointType;

    @Nullable
    private final Boolean isHome;

    @Nullable
    private final Integer pointDescription;
    private boolean shouldReverseTeams;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new bxe(13)), ypa.a(ysaVar, new bxe(14)), null, null};
    }

    public /* synthetic */ PointPP(int i, String str, String str2, Integer num, PointType pointType, PointType pointType2, Boolean bool, boolean z, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, PointPP$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homePoint = str;
        this.awayPoint = str2;
        this.pointDescription = num;
        this.homePointType = pointType;
        this.awayPointType = pointType2;
        this.isHome = bool;
        if ((i & 64) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return PointType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return PointType.INSTANCE.serializer();
    }

    /* renamed from: component1, reason: from getter */
    private final String getHomePoint() {
        return this.homePoint;
    }

    /* renamed from: component2, reason: from getter */
    private final String getAwayPoint() {
        return this.awayPoint;
    }

    /* renamed from: component4, reason: from getter */
    private final PointType getHomePointType() {
        return this.homePointType;
    }

    /* renamed from: component5, reason: from getter */
    private final PointType getAwayPointType() {
        return this.awayPointType;
    }

    public static /* synthetic */ PointPP copy$default(PointPP pointPP, String str, String str2, Integer num, PointType pointType, PointType pointType2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pointPP.homePoint;
        }
        if ((i & 2) != 0) {
            str2 = pointPP.awayPoint;
        }
        if ((i & 4) != 0) {
            num = pointPP.pointDescription;
        }
        if ((i & 8) != 0) {
            pointType = pointPP.homePointType;
        }
        if ((i & 16) != 0) {
            pointType2 = pointPP.awayPointType;
        }
        if ((i & 32) != 0) {
            bool = pointPP.isHome;
        }
        PointType pointType3 = pointType2;
        Boolean bool2 = bool;
        return pointPP.copy(str, str2, num, pointType, pointType3, bool2);
    }

    public static /* synthetic */ String getAwayPoint$default(PointPP pointPP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return pointPP.getAwayPoint(teamSides);
    }

    public static /* synthetic */ PointType getAwayPointType$default(PointPP pointPP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return pointPP.getAwayPointType(teamSides);
    }

    public static /* synthetic */ String getHomePoint$default(PointPP pointPP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return pointPP.getHomePoint(teamSides);
    }

    public static /* synthetic */ PointType getHomePointType$default(PointPP pointPP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return pointPP.getHomePointType(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(PointPP self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.homePoint);
        output.y(serialDesc, 1, self.awayPoint);
        output.h(serialDesc, 2, a7a.a, self.pointDescription);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.homePointType);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.awayPointType);
        output.h(serialDesc, 5, gz1.a, self.isHome);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 6, self.shouldReverseTeams);
        }
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPointDescription() {
        return this.pointDescription;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsHome() {
        return this.isHome;
    }

    @NotNull
    public final PointPP copy(@NotNull String homePoint, @NotNull String awayPoint, @Nullable Integer pointDescription, @Nullable PointType homePointType, @Nullable PointType awayPointType, @Nullable Boolean isHome) {
        homePoint.getClass();
        awayPoint.getClass();
        return new PointPP(homePoint, awayPoint, pointDescription, homePointType, awayPointType, isHome);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointPP)) {
            return false;
        }
        PointPP pointPP = (PointPP) other;
        return Intrinsics.c(this.homePoint, pointPP.homePoint) && Intrinsics.c(this.awayPoint, pointPP.awayPoint) && Intrinsics.c(this.pointDescription, pointPP.pointDescription) && this.homePointType == pointPP.homePointType && this.awayPointType == pointPP.awayPointType && Intrinsics.c(this.isHome, pointPP.isHome);
    }

    @NotNull
    public final String getAwayPoint(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homePoint : this.awayPoint;
    }

    @Nullable
    public final PointType getAwayPointType(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homePointType : this.awayPointType;
    }

    @NotNull
    public final String getHomePoint(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayPoint : this.homePoint;
    }

    @Nullable
    public final PointType getHomePointType(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayPointType : this.homePointType;
    }

    @Nullable
    public final Integer getPointDescription() {
        return this.pointDescription;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        int c = dmi.c(this.homePoint.hashCode() * 31, 31, this.awayPoint);
        Integer num = this.pointDescription;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        PointType pointType = this.homePointType;
        int hashCode2 = (hashCode + (pointType == null ? 0 : pointType.hashCode())) * 31;
        PointType pointType2 = this.awayPointType;
        int hashCode3 = (hashCode2 + (pointType2 == null ? 0 : pointType2.hashCode())) * 31;
        Boolean bool = this.isHome;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isHome() {
        return this.isHome;
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        String str = this.homePoint;
        String str2 = this.awayPoint;
        Integer num = this.pointDescription;
        PointType pointType = this.homePointType;
        PointType pointType2 = this.awayPointType;
        Boolean bool = this.isHome;
        StringBuilder s = mz1.s("PointPP(homePoint=", str, ", awayPoint=", str2, ", pointDescription=");
        s.append(num);
        s.append(", homePointType=");
        s.append(pointType);
        s.append(", awayPointType=");
        s.append(pointType2);
        s.append(", isHome=");
        s.append(bool);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PointPP$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PointPP;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PointPP$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PointPP(@NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable PointType pointType, @Nullable PointType pointType2, @Nullable Boolean bool) {
        str.getClass();
        str2.getClass();
        this.homePoint = str;
        this.awayPoint = str2;
        this.pointDescription = num;
        this.homePointType = pointType;
        this.awayPointType = pointType2;
        this.isHome = bool;
    }
}
