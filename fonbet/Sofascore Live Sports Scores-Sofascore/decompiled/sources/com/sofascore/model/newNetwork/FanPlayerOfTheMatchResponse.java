package com.sofascore.model.newNetwork;

import defpackage.dmi;
import defpackage.ec6;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fBe\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000b\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&JN\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b<\u0010&¨\u0006?"}, d2 = {"Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;", "status", "", "totalVotes", "", "Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchOption;", "options", "openTimestamp", "closeTimestamp", "<init>", "(Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;JLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;JLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;", "component2", "()J", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;JLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;", "getStatus", "J", "getTotalVotes", "Ljava/util/List;", "getOptions", "Ljava/lang/Long;", "getOpenTimestamp", "getCloseTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FanPlayerOfTheMatchResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long closeTimestamp;

    @Nullable
    private final Long openTimestamp;

    @NotNull
    private final List<FanPlayerOfTheMatchOption> options;

    @Nullable
    private final FanPlayerOfTheMatchStatus status;
    private final long totalVotes;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new ec6(22)), null, ypa.a(ysaVar, new ec6(23)), null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FanPlayerOfTheMatchResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, FanPlayerOfTheMatchStatus fanPlayerOfTheMatchStatus, long j, List list, Long l, Long l2, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (24 != (i & 24)) {
            oea.z(i, 24, FanPlayerOfTheMatchResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.status = null;
        } else {
            this.status = fanPlayerOfTheMatchStatus;
        }
        this.totalVotes = j;
        this.options = list;
        if ((i & 32) == 0) {
            this.openTimestamp = null;
        } else {
            this.openTimestamp = l;
        }
        if ((i & 64) == 0) {
            this.closeTimestamp = null;
        } else {
            this.closeTimestamp = l2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return FanPlayerOfTheMatchStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(FanPlayerOfTheMatchOption$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ FanPlayerOfTheMatchResponse copy$default(FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse, FanPlayerOfTheMatchStatus fanPlayerOfTheMatchStatus, long j, List list, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            fanPlayerOfTheMatchStatus = fanPlayerOfTheMatchResponse.status;
        }
        if ((i & 2) != 0) {
            j = fanPlayerOfTheMatchResponse.totalVotes;
        }
        if ((i & 4) != 0) {
            list = fanPlayerOfTheMatchResponse.options;
        }
        if ((i & 8) != 0) {
            l = fanPlayerOfTheMatchResponse.openTimestamp;
        }
        if ((i & 16) != 0) {
            l2 = fanPlayerOfTheMatchResponse.closeTimestamp;
        }
        Long l3 = l2;
        List list2 = list;
        return fanPlayerOfTheMatchResponse.copy(fanPlayerOfTheMatchStatus, j, list2, l, l3);
    }

    public static final /* synthetic */ void write$Self$model_release(FanPlayerOfTheMatchResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || self.status != null) {
            output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.status);
        }
        output.E(serialDesc, 3, self.totalVotes);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.options);
        if (output.o(serialDesc) || self.openTimestamp != null) {
            output.h(serialDesc, 5, lkb.a, self.openTimestamp);
        }
        if (!output.o(serialDesc) && self.closeTimestamp == null) {
            return;
        }
        output.h(serialDesc, 6, lkb.a, self.closeTimestamp);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final FanPlayerOfTheMatchStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalVotes() {
        return this.totalVotes;
    }

    @NotNull
    public final List<FanPlayerOfTheMatchOption> component3() {
        return this.options;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getOpenTimestamp() {
        return this.openTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getCloseTimestamp() {
        return this.closeTimestamp;
    }

    @NotNull
    public final FanPlayerOfTheMatchResponse copy(@Nullable FanPlayerOfTheMatchStatus status, long totalVotes, @NotNull List<FanPlayerOfTheMatchOption> options, @Nullable Long openTimestamp, @Nullable Long closeTimestamp) {
        options.getClass();
        return new FanPlayerOfTheMatchResponse(status, totalVotes, options, openTimestamp, closeTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FanPlayerOfTheMatchResponse)) {
            return false;
        }
        FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse = (FanPlayerOfTheMatchResponse) other;
        return this.status == fanPlayerOfTheMatchResponse.status && this.totalVotes == fanPlayerOfTheMatchResponse.totalVotes && Intrinsics.c(this.options, fanPlayerOfTheMatchResponse.options) && Intrinsics.c(this.openTimestamp, fanPlayerOfTheMatchResponse.openTimestamp) && Intrinsics.c(this.closeTimestamp, fanPlayerOfTheMatchResponse.closeTimestamp);
    }

    @Nullable
    public final Long getCloseTimestamp() {
        return this.closeTimestamp;
    }

    @Nullable
    public final Long getOpenTimestamp() {
        return this.openTimestamp;
    }

    @NotNull
    public final List<FanPlayerOfTheMatchOption> getOptions() {
        return this.options;
    }

    @Nullable
    public final FanPlayerOfTheMatchStatus getStatus() {
        return this.status;
    }

    public final long getTotalVotes() {
        return this.totalVotes;
    }

    public int hashCode() {
        FanPlayerOfTheMatchStatus fanPlayerOfTheMatchStatus = this.status;
        int d = dmi.d(ljg.c((fanPlayerOfTheMatchStatus == null ? 0 : fanPlayerOfTheMatchStatus.hashCode()) * 31, 31, this.totalVotes), 31, this.options);
        Long l = this.openTimestamp;
        int hashCode = (d + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.closeTimestamp;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FanPlayerOfTheMatchResponse(status=" + this.status + ", totalVotes=" + this.totalVotes + ", options=" + this.options + ", openTimestamp=" + this.openTimestamp + ", closeTimestamp=" + this.closeTimestamp + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FanPlayerOfTheMatchResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FanPlayerOfTheMatchResponse(@Nullable FanPlayerOfTheMatchStatus fanPlayerOfTheMatchStatus, long j, @NotNull List<FanPlayerOfTheMatchOption> list, @Nullable Long l, @Nullable Long l2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.status = fanPlayerOfTheMatchStatus;
        this.totalVotes = j;
        this.options = list;
        this.openTimestamp = l;
        this.closeTimestamp = l2;
    }

    public /* synthetic */ FanPlayerOfTheMatchResponse(FanPlayerOfTheMatchStatus fanPlayerOfTheMatchStatus, long j, List list, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fanPlayerOfTheMatchStatus, j, list, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2);
    }
}
