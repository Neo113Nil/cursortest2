package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import defpackage.a7a;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.tv0;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0003GHFBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBG\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0010B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0011B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000e\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ~\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001aR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b@\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bA\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bB\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bC\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bD\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bE\u0010\u0018¨\u0006I"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "Ljava/io/Serializable;", "", "inning", "Lcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;", "inningHalf", "", "basesCovered", "ballCount", "strikeCount", "outCount", "errors", "hits", "runs", "<init>", "(ILcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;ILcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;Ljava/lang/Integer;)V", "(ILcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "mockId", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/BaseballInningInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getInning", "Lcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;", "getInningHalf", "Ljava/util/List;", "getBasesCovered", "Ljava/lang/Integer;", "getBallCount", "getStrikeCount", "getOutCount", "getErrors", "getHits", "getRuns", "getMockId", "Companion", "InningHalf", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballInningInfo implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer ballCount;

    @Nullable
    private final List<Integer> basesCovered;

    @Nullable
    private final Integer errors;

    @Nullable
    private final Integer hits;
    private final int inning;

    @NotNull
    private final InningHalf inningHalf;
    private final int mockId;

    @Nullable
    private final Integer outCount;

    @Nullable
    private final Integer runs;

    @Nullable
    private final Integer strikeCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballInningInfo$InningHalf;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Bottom", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InningHalf {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ InningHalf[] $VALUES;

        @q5h("T")
        public static final InningHalf Top = new InningHalf("Top", 0);

        @q5h("B")
        public static final InningHalf Bottom = new InningHalf("Bottom", 1);

        private static final /* synthetic */ InningHalf[] $values() {
            return new InningHalf[]{Top, Bottom};
        }

        static {
            InningHalf[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private InningHalf(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static InningHalf valueOf(String str) {
            return (InningHalf) Enum.valueOf(InningHalf.class, str);
        }

        public static InningHalf[] values() {
            return (InningHalf[]) $VALUES.clone();
        }
    }

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new tv0(23)), ypa.a(ysaVar, new tv0(24)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ BaseballInningInfo(int i, int i2, InningHalf inningHalf, List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i3, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, BaseballInningInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.inning = i2;
        this.inningHalf = inningHalf;
        this.basesCovered = list;
        this.ballCount = num;
        this.strikeCount = num2;
        this.outCount = num3;
        this.errors = num4;
        this.hits = num5;
        this.runs = num6;
        if ((i & 512) == 0) {
            this.mockId = i2 + (inningHalf == InningHalf.Top ? 1000 : 2000);
        } else {
            this.mockId = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.mvvm.model.BaseballInningInfo.InningHalf", InningHalf.values(), new String[]{"T", "B"}, new Annotation[][]{null, null});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    public static /* synthetic */ BaseballInningInfo copy$default(BaseballInningInfo baseballInningInfo, int i, InningHalf inningHalf, List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = baseballInningInfo.inning;
        }
        if ((i2 & 2) != 0) {
            inningHalf = baseballInningInfo.inningHalf;
        }
        if ((i2 & 4) != 0) {
            list = baseballInningInfo.basesCovered;
        }
        if ((i2 & 8) != 0) {
            num = baseballInningInfo.ballCount;
        }
        if ((i2 & 16) != 0) {
            num2 = baseballInningInfo.strikeCount;
        }
        if ((i2 & 32) != 0) {
            num3 = baseballInningInfo.outCount;
        }
        if ((i2 & 64) != 0) {
            num4 = baseballInningInfo.errors;
        }
        if ((i2 & 128) != 0) {
            num5 = baseballInningInfo.hits;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num6 = baseballInningInfo.runs;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        Integer num9 = num3;
        Integer num10 = num4;
        Integer num11 = num2;
        List list2 = list;
        return baseballInningInfo.copy(i, inningHalf, list2, num, num11, num9, num10, num7, num8);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballInningInfo self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.inning, serialDesc);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.inningHalf);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.basesCovered);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.ballCount);
        output.h(serialDesc, 4, a7aVar, self.strikeCount);
        output.h(serialDesc, 5, a7aVar, self.outCount);
        output.h(serialDesc, 6, a7aVar, self.errors);
        output.h(serialDesc, 7, a7aVar, self.hits);
        output.h(serialDesc, 8, a7aVar, self.runs);
        if (!output.o(serialDesc)) {
            if (self.mockId == self.inning + (self.inningHalf == InningHalf.Top ? 1000 : 2000)) {
                return;
            }
        }
        output.u(9, self.mockId, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInning() {
        return this.inning;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InningHalf getInningHalf() {
        return this.inningHalf;
    }

    @Nullable
    public final List<Integer> component3() {
        return this.basesCovered;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getBallCount() {
        return this.ballCount;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getStrikeCount() {
        return this.strikeCount;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getOutCount() {
        return this.outCount;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getErrors() {
        return this.errors;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getHits() {
        return this.hits;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getRuns() {
        return this.runs;
    }

    @NotNull
    public final BaseballInningInfo copy(int inning, @NotNull InningHalf inningHalf, @Nullable List<Integer> basesCovered, @Nullable Integer ballCount, @Nullable Integer strikeCount, @Nullable Integer outCount, @Nullable Integer errors, @Nullable Integer hits, @Nullable Integer runs) {
        inningHalf.getClass();
        return new BaseballInningInfo(inning, inningHalf, basesCovered, ballCount, strikeCount, outCount, errors, hits, runs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballInningInfo)) {
            return false;
        }
        BaseballInningInfo baseballInningInfo = (BaseballInningInfo) other;
        return this.inning == baseballInningInfo.inning && this.inningHalf == baseballInningInfo.inningHalf && Intrinsics.c(this.basesCovered, baseballInningInfo.basesCovered) && Intrinsics.c(this.ballCount, baseballInningInfo.ballCount) && Intrinsics.c(this.strikeCount, baseballInningInfo.strikeCount) && Intrinsics.c(this.outCount, baseballInningInfo.outCount) && Intrinsics.c(this.errors, baseballInningInfo.errors) && Intrinsics.c(this.hits, baseballInningInfo.hits) && Intrinsics.c(this.runs, baseballInningInfo.runs);
    }

    @Nullable
    public final Integer getBallCount() {
        return this.ballCount;
    }

    @Nullable
    public final List<Integer> getBasesCovered() {
        return this.basesCovered;
    }

    @Nullable
    public final Integer getErrors() {
        return this.errors;
    }

    @Nullable
    public final Integer getHits() {
        return this.hits;
    }

    public final int getInning() {
        return this.inning;
    }

    @NotNull
    public final InningHalf getInningHalf() {
        return this.inningHalf;
    }

    public final int getMockId() {
        return this.mockId;
    }

    @Nullable
    public final Integer getOutCount() {
        return this.outCount;
    }

    @Nullable
    public final Integer getRuns() {
        return this.runs;
    }

    @Nullable
    public final Integer getStrikeCount() {
        return this.strikeCount;
    }

    public int hashCode() {
        int hashCode = (this.inningHalf.hashCode() + (Integer.hashCode(this.inning) * 31)) * 31;
        List<Integer> list = this.basesCovered;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.ballCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.strikeCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.outCount;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.errors;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.hits;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.runs;
        return hashCode7 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.inning;
        InningHalf inningHalf = this.inningHalf;
        List<Integer> list = this.basesCovered;
        Integer num = this.ballCount;
        Integer num2 = this.strikeCount;
        Integer num3 = this.outCount;
        Integer num4 = this.errors;
        Integer num5 = this.hits;
        Integer num6 = this.runs;
        StringBuilder sb = new StringBuilder("BaseballInningInfo(inning=");
        sb.append(i);
        sb.append(", inningHalf=");
        sb.append(inningHalf);
        sb.append(", basesCovered=");
        sb.append(list);
        sb.append(", ballCount=");
        sb.append(num);
        sb.append(", strikeCount=");
        vxd.r(num2, num3, ", outCount=", ", errors=", sb);
        vxd.r(num4, num5, ", hits=", ", runs=", sb);
        return vxd.n(sb, num6, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballInningInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballInningInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballInningInfo(int i, @NotNull InningHalf inningHalf, @Nullable List<Integer> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        inningHalf.getClass();
        this.inning = i;
        this.inningHalf = inningHalf;
        this.basesCovered = list;
        this.ballCount = num;
        this.strikeCount = num2;
        this.outCount = num3;
        this.errors = num4;
        this.hits = num5;
        this.runs = num6;
        this.mockId = i + (inningHalf == InningHalf.Top ? 1000 : 2000);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseballInningInfo(@Nullable List<Integer> list, @Nullable Integer num, @Nullable Integer num2, int i, @NotNull InningHalf inningHalf, @Nullable Integer num3) {
        this(i, inningHalf, list, num, num2, num3, null, null, null);
        inningHalf.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseballInningInfo(int i, @NotNull InningHalf inningHalf, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this(i, inningHalf, null, null, null, null, num3, num2, num);
        inningHalf.getClass();
    }
}
