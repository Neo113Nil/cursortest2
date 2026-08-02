package com.sofascore.model.newNetwork;

import com.appsflyer.internal.i;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.lj8;
import defpackage.me4;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00045674BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBo\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJX\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001dR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b/\u0010\u001dR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b0\u0010\u001dR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001d¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;", "passes", "dribbles", "defensive", "ballCarries", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPasses", "getDribbles", "getDefensive", "getBallCarries", "getBallCarries$annotations", "()V", "Companion", "RatingBreakdownElement", "ActionType", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballEventPlayerRatingBreakdownResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<RatingBreakdownElement> ballCarries;

    @Nullable
    private final List<RatingBreakdownElement> defensive;

    @Nullable
    private final List<RatingBreakdownElement> dribbles;

    @Nullable
    private final List<RatingBreakdownElement> passes;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "Pass", "Cross", "Dribble", "Clearance", "Tackle", "BallRecovery", "Interception", "Block", "BallTouch", "BallCarry", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @q5h("pass")
        public static final ActionType Pass = new ActionType("Pass", 0);

        @q5h("cross")
        public static final ActionType Cross = new ActionType("Cross", 1);

        @q5h("dribble")
        public static final ActionType Dribble = new ActionType("Dribble", 2);

        @q5h("clearance")
        public static final ActionType Clearance = new ActionType("Clearance", 3);

        @q5h("tackle")
        public static final ActionType Tackle = new ActionType("Tackle", 4);

        @q5h("ball-recovery")
        public static final ActionType BallRecovery = new ActionType("BallRecovery", 5);

        @q5h("interception")
        public static final ActionType Interception = new ActionType("Interception", 6);

        @q5h("block")
        public static final ActionType Block = new ActionType("Block", 7);

        @q5h("ball-touch")
        public static final ActionType BallTouch = new ActionType("BallTouch", 8);

        @q5h("ball-carry")
        public static final ActionType BallCarry = new ActionType("BallCarry", 9);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{Pass, Cross, Dribble, Clearance, Tackle, BallRecovery, Interception, Block, BallTouch, BallCarry};
        }

        static {
            ActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private ActionType(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new lj8(3)), ypa.a(ysaVar, new lj8(4)), ypa.a(ysaVar, new lj8(5)), ypa.a(ysaVar, new lj8(6))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FootballEventPlayerRatingBreakdownResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, List list2, List list3, List list4, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, FootballEventPlayerRatingBreakdownResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.passes = list;
        this.dribbles = list2;
        this.defensive = list3;
        this.ballCarries = list4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FootballEventPlayerRatingBreakdownResponse copy$default(FootballEventPlayerRatingBreakdownResponse footballEventPlayerRatingBreakdownResponse, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = footballEventPlayerRatingBreakdownResponse.passes;
        }
        if ((i & 2) != 0) {
            list2 = footballEventPlayerRatingBreakdownResponse.dribbles;
        }
        if ((i & 4) != 0) {
            list3 = footballEventPlayerRatingBreakdownResponse.defensive;
        }
        if ((i & 8) != 0) {
            list4 = footballEventPlayerRatingBreakdownResponse.ballCarries;
        }
        return footballEventPlayerRatingBreakdownResponse.copy(list, list2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballEventPlayerRatingBreakdownResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.passes);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.dribbles);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.defensive);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.ballCarries);
    }

    @Nullable
    public final List<RatingBreakdownElement> component1() {
        return this.passes;
    }

    @Nullable
    public final List<RatingBreakdownElement> component2() {
        return this.dribbles;
    }

    @Nullable
    public final List<RatingBreakdownElement> component3() {
        return this.defensive;
    }

    @Nullable
    public final List<RatingBreakdownElement> component4() {
        return this.ballCarries;
    }

    @NotNull
    public final FootballEventPlayerRatingBreakdownResponse copy(@Nullable List<RatingBreakdownElement> passes, @Nullable List<RatingBreakdownElement> dribbles, @Nullable List<RatingBreakdownElement> defensive, @Nullable List<RatingBreakdownElement> ballCarries) {
        return new FootballEventPlayerRatingBreakdownResponse(passes, dribbles, defensive, ballCarries);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballEventPlayerRatingBreakdownResponse)) {
            return false;
        }
        FootballEventPlayerRatingBreakdownResponse footballEventPlayerRatingBreakdownResponse = (FootballEventPlayerRatingBreakdownResponse) other;
        return Intrinsics.c(this.passes, footballEventPlayerRatingBreakdownResponse.passes) && Intrinsics.c(this.dribbles, footballEventPlayerRatingBreakdownResponse.dribbles) && Intrinsics.c(this.defensive, footballEventPlayerRatingBreakdownResponse.defensive) && Intrinsics.c(this.ballCarries, footballEventPlayerRatingBreakdownResponse.ballCarries);
    }

    @Nullable
    public final List<RatingBreakdownElement> getBallCarries() {
        return this.ballCarries;
    }

    @Nullable
    public final List<RatingBreakdownElement> getDefensive() {
        return this.defensive;
    }

    @Nullable
    public final List<RatingBreakdownElement> getDribbles() {
        return this.dribbles;
    }

    @Nullable
    public final List<RatingBreakdownElement> getPasses() {
        return this.passes;
    }

    public int hashCode() {
        List<RatingBreakdownElement> list = this.passes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<RatingBreakdownElement> list2 = this.dribbles;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<RatingBreakdownElement> list3 = this.defensive;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<RatingBreakdownElement> list4 = this.ballCarries;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<RatingBreakdownElement> list = this.passes;
        List<RatingBreakdownElement> list2 = this.dribbles;
        return me4.j(fc6.s("FootballEventPlayerRatingBreakdownResponse(passes=", ", dribbles=", ", defensive=", list, list2), this.defensive, ", ballCarries=", this.ballCarries, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010#Jn\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b\n\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b:\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b\f\u0010#¨\u0006="}, d2 = {"Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;", "", "Lcom/sofascore/model/mvvm/model/Point2D;", "playerCoordinates", "passEndCoordinates", "Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$ActionType;", "eventActionType", "", "outcome", "keypass", "isAssist", "wasFouled", "isLongBall", "<init>", "(Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$ActionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$ActionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Point2D;", "component2", "component3", "()Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$ActionType;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "copy", "(Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$ActionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Point2D;", "getPlayerCoordinates", "getPassEndCoordinates", "Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$ActionType;", "getEventActionType", "Ljava/lang/Boolean;", "getOutcome", "getKeypass", "getWasFouled", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RatingBreakdownElement {

        @Nullable
        private final ActionType eventActionType;

        @Nullable
        private final Boolean isAssist;

        @Nullable
        private final Boolean isLongBall;

        @Nullable
        private final Boolean keypass;

        @Nullable
        private final Boolean outcome;

        @Nullable
        private final Point2D passEndCoordinates;

        @NotNull
        private final Point2D playerCoordinates;

        @Nullable
        private final Boolean wasFouled;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new lj8(7)), null, null, null, null, null};

        public /* synthetic */ RatingBreakdownElement(int i, Point2D point2D, Point2D point2D2, ActionType actionType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, t5h t5hVar) {
            if (251 != (i & 251)) {
                oea.z(i, 251, FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.playerCoordinates = point2D;
            this.passEndCoordinates = point2D2;
            if ((i & 4) == 0) {
                this.eventActionType = null;
            } else {
                this.eventActionType = actionType;
            }
            this.outcome = bool;
            this.keypass = bool2;
            this.isAssist = bool3;
            this.wasFouled = bool4;
            this.isLongBall = bool5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return hz8.F("com.sofascore.model.newNetwork.FootballEventPlayerRatingBreakdownResponse.ActionType", ActionType.values(), new String[]{"pass", "cross", "dribble", "clearance", "tackle", "ball-recovery", "interception", "block", "ball-touch", "ball-carry"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
        }

        public static /* synthetic */ RatingBreakdownElement copy$default(RatingBreakdownElement ratingBreakdownElement, Point2D point2D, Point2D point2D2, ActionType actionType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
            if ((i & 1) != 0) {
                point2D = ratingBreakdownElement.playerCoordinates;
            }
            if ((i & 2) != 0) {
                point2D2 = ratingBreakdownElement.passEndCoordinates;
            }
            if ((i & 4) != 0) {
                actionType = ratingBreakdownElement.eventActionType;
            }
            if ((i & 8) != 0) {
                bool = ratingBreakdownElement.outcome;
            }
            if ((i & 16) != 0) {
                bool2 = ratingBreakdownElement.keypass;
            }
            if ((i & 32) != 0) {
                bool3 = ratingBreakdownElement.isAssist;
            }
            if ((i & 64) != 0) {
                bool4 = ratingBreakdownElement.wasFouled;
            }
            if ((i & 128) != 0) {
                bool5 = ratingBreakdownElement.isLongBall;
            }
            Boolean bool6 = bool4;
            Boolean bool7 = bool5;
            Boolean bool8 = bool2;
            Boolean bool9 = bool3;
            return ratingBreakdownElement.copy(point2D, point2D2, actionType, bool, bool8, bool9, bool6, bool7);
        }

        public static final /* synthetic */ void write$Self$model_release(RatingBreakdownElement self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            Point2D$$serializer point2D$$serializer = Point2D$$serializer.INSTANCE;
            output.f(serialDesc, 0, point2D$$serializer, self.playerCoordinates);
            output.h(serialDesc, 1, point2D$$serializer, self.passEndCoordinates);
            if (output.o(serialDesc) || self.eventActionType != null) {
                output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.eventActionType);
            }
            gz1 gz1Var = gz1.a;
            output.h(serialDesc, 3, gz1Var, self.outcome);
            output.h(serialDesc, 4, gz1Var, self.keypass);
            output.h(serialDesc, 5, gz1Var, self.isAssist);
            output.h(serialDesc, 6, gz1Var, self.wasFouled);
            output.h(serialDesc, 7, gz1Var, self.isLongBall);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Point2D getPlayerCoordinates() {
            return this.playerCoordinates;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Point2D getPassEndCoordinates() {
            return this.passEndCoordinates;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final ActionType getEventActionType() {
            return this.eventActionType;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Boolean getOutcome() {
            return this.outcome;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Boolean getKeypass() {
            return this.keypass;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Boolean getIsAssist() {
            return this.isAssist;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Boolean getWasFouled() {
            return this.wasFouled;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final Boolean getIsLongBall() {
            return this.isLongBall;
        }

        @NotNull
        public final RatingBreakdownElement copy(@NotNull Point2D playerCoordinates, @Nullable Point2D passEndCoordinates, @Nullable ActionType eventActionType, @Nullable Boolean outcome, @Nullable Boolean keypass, @Nullable Boolean isAssist, @Nullable Boolean wasFouled, @Nullable Boolean isLongBall) {
            playerCoordinates.getClass();
            return new RatingBreakdownElement(playerCoordinates, passEndCoordinates, eventActionType, outcome, keypass, isAssist, wasFouled, isLongBall);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingBreakdownElement)) {
                return false;
            }
            RatingBreakdownElement ratingBreakdownElement = (RatingBreakdownElement) other;
            return Intrinsics.c(this.playerCoordinates, ratingBreakdownElement.playerCoordinates) && Intrinsics.c(this.passEndCoordinates, ratingBreakdownElement.passEndCoordinates) && this.eventActionType == ratingBreakdownElement.eventActionType && Intrinsics.c(this.outcome, ratingBreakdownElement.outcome) && Intrinsics.c(this.keypass, ratingBreakdownElement.keypass) && Intrinsics.c(this.isAssist, ratingBreakdownElement.isAssist) && Intrinsics.c(this.wasFouled, ratingBreakdownElement.wasFouled) && Intrinsics.c(this.isLongBall, ratingBreakdownElement.isLongBall);
        }

        @Nullable
        public final ActionType getEventActionType() {
            return this.eventActionType;
        }

        @Nullable
        public final Boolean getKeypass() {
            return this.keypass;
        }

        @Nullable
        public final Boolean getOutcome() {
            return this.outcome;
        }

        @Nullable
        public final Point2D getPassEndCoordinates() {
            return this.passEndCoordinates;
        }

        @NotNull
        public final Point2D getPlayerCoordinates() {
            return this.playerCoordinates;
        }

        @Nullable
        public final Boolean getWasFouled() {
            return this.wasFouled;
        }

        public int hashCode() {
            int hashCode = this.playerCoordinates.hashCode() * 31;
            Point2D point2D = this.passEndCoordinates;
            int hashCode2 = (hashCode + (point2D == null ? 0 : point2D.hashCode())) * 31;
            ActionType actionType = this.eventActionType;
            int hashCode3 = (hashCode2 + (actionType == null ? 0 : actionType.hashCode())) * 31;
            Boolean bool = this.outcome;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.keypass;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isAssist;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.wasFouled;
            int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isLongBall;
            return hashCode7 + (bool5 != null ? bool5.hashCode() : 0);
        }

        @Nullable
        public final Boolean isAssist() {
            return this.isAssist;
        }

        @Nullable
        public final Boolean isLongBall() {
            return this.isLongBall;
        }

        @NotNull
        public String toString() {
            Point2D point2D = this.playerCoordinates;
            Point2D point2D2 = this.passEndCoordinates;
            ActionType actionType = this.eventActionType;
            Boolean bool = this.outcome;
            Boolean bool2 = this.keypass;
            Boolean bool3 = this.isAssist;
            Boolean bool4 = this.wasFouled;
            Boolean bool5 = this.isLongBall;
            StringBuilder sb = new StringBuilder("RatingBreakdownElement(playerCoordinates=");
            sb.append(point2D);
            sb.append(", passEndCoordinates=");
            sb.append(point2D2);
            sb.append(", eventActionType=");
            sb.append(actionType);
            sb.append(", outcome=");
            sb.append(bool);
            sb.append(", keypass=");
            i.q(sb, bool2, ", isAssist=", bool3, ", wasFouled=");
            sb.append(bool4);
            sb.append(", isLongBall=");
            sb.append(bool5);
            sb.append(")");
            return sb.toString();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public RatingBreakdownElement(@NotNull Point2D point2D, @Nullable Point2D point2D2, @Nullable ActionType actionType, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5) {
            point2D.getClass();
            this.playerCoordinates = point2D;
            this.passEndCoordinates = point2D2;
            this.eventActionType = actionType;
            this.outcome = bool;
            this.keypass = bool2;
            this.isAssist = bool3;
            this.wasFouled = bool4;
            this.isLongBall = bool5;
        }

        public /* synthetic */ RatingBreakdownElement(Point2D point2D, Point2D point2D2, ActionType actionType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(point2D, point2D2, (i & 4) != 0 ? null : actionType, bool, bool2, bool3, bool4, bool5);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballEventPlayerRatingBreakdownResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("ball-carries")
    public static /* synthetic */ void getBallCarries$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FootballEventPlayerRatingBreakdownResponse(@Nullable List<RatingBreakdownElement> list, @Nullable List<RatingBreakdownElement> list2, @Nullable List<RatingBreakdownElement> list3, @Nullable List<RatingBreakdownElement> list4) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.passes = list;
        this.dribbles = list2;
        this.defensive = list3;
        this.ballCarries = list4;
    }
}
