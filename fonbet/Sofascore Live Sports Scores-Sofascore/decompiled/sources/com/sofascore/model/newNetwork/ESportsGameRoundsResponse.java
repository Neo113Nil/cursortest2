package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.ag5;
import defpackage.fc6;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBc\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\t\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 JJ\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010 ¨\u00066"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGameRoundsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/ESportRound;", "normaltimeRounds", "overtimeRounds", "", "overtimeChunkSize", "roundsInAHalf", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ESportsGameRoundsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/ESportsGameRoundsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getNormaltimeRounds", "getOvertimeRounds", "Ljava/lang/Integer;", "getOvertimeChunkSize", "getRoundsInAHalf", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ESportsGameRoundsResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ESportRound> normaltimeRounds;

    @Nullable
    private final Integer overtimeChunkSize;

    @Nullable
    private final List<ESportRound> overtimeRounds;

    @Nullable
    private final Integer roundsInAHalf;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new ag5(9)), ypa.a(ysaVar, new ag5(10)), null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ESportsGameRoundsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, List list2, Integer num, Integer num2, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, ESportsGameRoundsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.normaltimeRounds = list;
        this.overtimeRounds = list2;
        this.overtimeChunkSize = num;
        this.roundsInAHalf = num2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(ESportRound$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(ESportRound$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ESportsGameRoundsResponse copy$default(ESportsGameRoundsResponse eSportsGameRoundsResponse, List list, List list2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eSportsGameRoundsResponse.normaltimeRounds;
        }
        if ((i & 2) != 0) {
            list2 = eSportsGameRoundsResponse.overtimeRounds;
        }
        if ((i & 4) != 0) {
            num = eSportsGameRoundsResponse.overtimeChunkSize;
        }
        if ((i & 8) != 0) {
            num2 = eSportsGameRoundsResponse.roundsInAHalf;
        }
        return eSportsGameRoundsResponse.copy(list, list2, num, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(ESportsGameRoundsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.normaltimeRounds);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.overtimeRounds);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.overtimeChunkSize);
        output.h(serialDesc, 5, a7aVar, self.roundsInAHalf);
    }

    @NotNull
    public final List<ESportRound> component1() {
        return this.normaltimeRounds;
    }

    @Nullable
    public final List<ESportRound> component2() {
        return this.overtimeRounds;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getOvertimeChunkSize() {
        return this.overtimeChunkSize;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getRoundsInAHalf() {
        return this.roundsInAHalf;
    }

    @NotNull
    public final ESportsGameRoundsResponse copy(@NotNull List<ESportRound> normaltimeRounds, @Nullable List<ESportRound> overtimeRounds, @Nullable Integer overtimeChunkSize, @Nullable Integer roundsInAHalf) {
        normaltimeRounds.getClass();
        return new ESportsGameRoundsResponse(normaltimeRounds, overtimeRounds, overtimeChunkSize, roundsInAHalf);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESportsGameRoundsResponse)) {
            return false;
        }
        ESportsGameRoundsResponse eSportsGameRoundsResponse = (ESportsGameRoundsResponse) other;
        return Intrinsics.c(this.normaltimeRounds, eSportsGameRoundsResponse.normaltimeRounds) && Intrinsics.c(this.overtimeRounds, eSportsGameRoundsResponse.overtimeRounds) && Intrinsics.c(this.overtimeChunkSize, eSportsGameRoundsResponse.overtimeChunkSize) && Intrinsics.c(this.roundsInAHalf, eSportsGameRoundsResponse.roundsInAHalf);
    }

    @NotNull
    public final List<ESportRound> getNormaltimeRounds() {
        return this.normaltimeRounds;
    }

    @Nullable
    public final Integer getOvertimeChunkSize() {
        return this.overtimeChunkSize;
    }

    @Nullable
    public final List<ESportRound> getOvertimeRounds() {
        return this.overtimeRounds;
    }

    @Nullable
    public final Integer getRoundsInAHalf() {
        return this.roundsInAHalf;
    }

    public int hashCode() {
        int hashCode = this.normaltimeRounds.hashCode() * 31;
        List<ESportRound> list = this.overtimeRounds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.overtimeChunkSize;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.roundsInAHalf;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return fc6.l(this.overtimeChunkSize, this.roundsInAHalf, ", roundsInAHalf=", ")", fc6.s("ESportsGameRoundsResponse(normaltimeRounds=", ", overtimeRounds=", ", overtimeChunkSize=", this.normaltimeRounds, this.overtimeRounds));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGameRoundsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ESportsGameRoundsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ESportsGameRoundsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ESportsGameRoundsResponse(@NotNull List<ESportRound> list, @Nullable List<ESportRound> list2, @Nullable Integer num, @Nullable Integer num2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.normaltimeRounds = list;
        this.overtimeRounds = list2;
        this.overtimeChunkSize = num;
        this.roundsInAHalf = num2;
    }
}
