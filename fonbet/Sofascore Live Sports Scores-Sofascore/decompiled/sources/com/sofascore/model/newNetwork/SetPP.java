package com.sofascore.model.newNetwork;

import defpackage.b7h;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\\\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b5\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010%R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/sofascore/model/newNetwork/SetPP;", "Ljava/io/Serializable;", "", "set", "", "Lcom/sofascore/model/newNetwork/GamePP;", "games", "Lcom/sofascore/model/newNetwork/LegPP;", "legs", "Lcom/sofascore/model/newNetwork/PointPP;", "points", "Lcom/sofascore/model/newNetwork/ScorePP;", "score", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/newNetwork/ScorePP;)V", "seen0", "", "expanded", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/newNetwork/ScorePP;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/SetPP;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lcom/sofascore/model/newNetwork/ScorePP;", "copy", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/newNetwork/ScorePP;)Lcom/sofascore/model/newNetwork/SetPP;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSet", "Ljava/util/List;", "getGames", "getLegs", "getPoints", "Lcom/sofascore/model/newNetwork/ScorePP;", "getScore", "Z", "getExpanded", "()Z", "setExpanded", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SetPP implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean expanded;

    @Nullable
    private final List<GamePP> games;

    @Nullable
    private final List<LegPP> legs;

    @Nullable
    private final List<PointPP> points;

    @Nullable
    private final ScorePP score;
    private final int set;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new b7h(11)), ypa.a(ysaVar, new b7h(12)), ypa.a(ysaVar, new b7h(13)), null, null};
    }

    public /* synthetic */ SetPP(int i, int i2, List list, List list2, List list3, ScorePP scorePP, boolean z, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, SetPP$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.set = i2;
        this.games = list;
        this.legs = list2;
        this.points = list3;
        this.score = scorePP;
        if ((i & 32) == 0) {
            this.expanded = false;
        } else {
            this.expanded = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(GamePP$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(LegPP$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(PointPP$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ SetPP copy$default(SetPP setPP, int i, List list, List list2, List list3, ScorePP scorePP, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = setPP.set;
        }
        if ((i2 & 2) != 0) {
            list = setPP.games;
        }
        if ((i2 & 4) != 0) {
            list2 = setPP.legs;
        }
        if ((i2 & 8) != 0) {
            list3 = setPP.points;
        }
        if ((i2 & 16) != 0) {
            scorePP = setPP.score;
        }
        ScorePP scorePP2 = scorePP;
        List list4 = list2;
        return setPP.copy(i, list, list4, list3, scorePP2);
    }

    public static final /* synthetic */ void write$Self$model_release(SetPP self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.set, serialDesc);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.games);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.legs);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.points);
        output.h(serialDesc, 4, ScorePP$$serializer.INSTANCE, self.score);
        if (output.o(serialDesc) || self.expanded) {
            output.x(serialDesc, 5, self.expanded);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getSet() {
        return this.set;
    }

    @Nullable
    public final List<GamePP> component2() {
        return this.games;
    }

    @Nullable
    public final List<LegPP> component3() {
        return this.legs;
    }

    @Nullable
    public final List<PointPP> component4() {
        return this.points;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ScorePP getScore() {
        return this.score;
    }

    @NotNull
    public final SetPP copy(int set, @Nullable List<GamePP> games, @Nullable List<LegPP> legs, @Nullable List<PointPP> points, @Nullable ScorePP score) {
        return new SetPP(set, games, legs, points, score);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetPP)) {
            return false;
        }
        SetPP setPP = (SetPP) other;
        return this.set == setPP.set && Intrinsics.c(this.games, setPP.games) && Intrinsics.c(this.legs, setPP.legs) && Intrinsics.c(this.points, setPP.points) && Intrinsics.c(this.score, setPP.score);
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    @Nullable
    public final List<GamePP> getGames() {
        return this.games;
    }

    @Nullable
    public final List<LegPP> getLegs() {
        return this.legs;
    }

    @Nullable
    public final List<PointPP> getPoints() {
        return this.points;
    }

    @Nullable
    public final ScorePP getScore() {
        return this.score;
    }

    public final int getSet() {
        return this.set;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.set) * 31;
        List<GamePP> list = this.games;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<LegPP> list2 = this.legs;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PointPP> list3 = this.points;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ScorePP scorePP = this.score;
        return hashCode4 + (scorePP != null ? scorePP.hashCode() : 0);
    }

    public final void setExpanded(boolean z) {
        this.expanded = z;
    }

    @NotNull
    public String toString() {
        int i = this.set;
        List<GamePP> list = this.games;
        List<LegPP> list2 = this.legs;
        List<PointPP> list3 = this.points;
        ScorePP scorePP = this.score;
        StringBuilder sb = new StringBuilder("SetPP(set=");
        sb.append(i);
        sb.append(", games=");
        sb.append(list);
        sb.append(", legs=");
        vxd.w(sb, list2, ", points=", list3, ", score=");
        sb.append(scorePP);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/SetPP$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/SetPP;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SetPP$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SetPP(int i, @Nullable List<GamePP> list, @Nullable List<LegPP> list2, @Nullable List<PointPP> list3, @Nullable ScorePP scorePP) {
        this.set = i;
        this.games = list;
        this.legs = list2;
        this.points = list3;
        this.score = scorePP;
    }
}
