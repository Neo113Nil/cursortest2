package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.joa;
import defpackage.oea;
import defpackage.qt5;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB{\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\n\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\"JP\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b6\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b7\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b8\u0010\"R$\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00104\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010;R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00104\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010;¨\u0006@"}, d2 = {"Lcom/sofascore/model/newNetwork/EventGraphResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/EventGraphData;", "graphPoints", "", "periodTime", "periodCount", "overtimeLength", "overtimeCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "halfTimeCount", "fullTimeCount", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventGraphResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/EventGraphResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGraphPoints", "Ljava/lang/Integer;", "getPeriodTime", "getPeriodCount", "getOvertimeLength", "getOvertimeCount", "getHalfTimeCount", "setHalfTimeCount", "(Ljava/lang/Integer;)V", "getFullTimeCount", "setFullTimeCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventGraphResponse extends NetworkResponse {

    @Nullable
    private Integer fullTimeCount;

    @NotNull
    private final List<EventGraphData> graphPoints;

    @Nullable
    private Integer halfTimeCount;

    @Nullable
    private final Integer overtimeCount;

    @Nullable
    private final Integer overtimeLength;

    @Nullable
    private final Integer periodCount;

    @Nullable
    private final Integer periodTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new qt5(5)), null, null, null, null, null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventGraphResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (124 != (i & Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, EventGraphResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.graphPoints = list;
        this.periodTime = num;
        this.periodCount = num2;
        this.overtimeLength = num3;
        this.overtimeCount = num4;
        if ((i & 128) == 0) {
            this.halfTimeCount = null;
        } else {
            this.halfTimeCount = num5;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.fullTimeCount = null;
        } else {
            this.fullTimeCount = num6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventGraphData$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ EventGraphResponse copy$default(EventGraphResponse eventGraphResponse, List list, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventGraphResponse.graphPoints;
        }
        if ((i & 2) != 0) {
            num = eventGraphResponse.periodTime;
        }
        if ((i & 4) != 0) {
            num2 = eventGraphResponse.periodCount;
        }
        if ((i & 8) != 0) {
            num3 = eventGraphResponse.overtimeLength;
        }
        if ((i & 16) != 0) {
            num4 = eventGraphResponse.overtimeCount;
        }
        Integer num5 = num4;
        Integer num6 = num2;
        return eventGraphResponse.copy(list, num, num6, num3, num5);
    }

    public static final /* synthetic */ void write$Self$model_release(EventGraphResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        output.f(serialDesc, 2, (KSerializer) $childSerializers[2].getValue(), self.graphPoints);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.periodTime);
        output.h(serialDesc, 4, a7aVar, self.periodCount);
        output.h(serialDesc, 5, a7aVar, self.overtimeLength);
        output.h(serialDesc, 6, a7aVar, self.overtimeCount);
        if (output.o(serialDesc) || self.halfTimeCount != null) {
            output.h(serialDesc, 7, a7aVar, self.halfTimeCount);
        }
        if (!output.o(serialDesc) && self.fullTimeCount == null) {
            return;
        }
        output.h(serialDesc, 8, a7aVar, self.fullTimeCount);
    }

    @NotNull
    public final List<EventGraphData> component1() {
        return this.graphPoints;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPeriodTime() {
        return this.periodTime;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPeriodCount() {
        return this.periodCount;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getOvertimeLength() {
        return this.overtimeLength;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getOvertimeCount() {
        return this.overtimeCount;
    }

    @NotNull
    public final EventGraphResponse copy(@NotNull List<EventGraphData> graphPoints, @Nullable Integer periodTime, @Nullable Integer periodCount, @Nullable Integer overtimeLength, @Nullable Integer overtimeCount) {
        graphPoints.getClass();
        return new EventGraphResponse(graphPoints, periodTime, periodCount, overtimeLength, overtimeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventGraphResponse)) {
            return false;
        }
        EventGraphResponse eventGraphResponse = (EventGraphResponse) other;
        return Intrinsics.c(this.graphPoints, eventGraphResponse.graphPoints) && Intrinsics.c(this.periodTime, eventGraphResponse.periodTime) && Intrinsics.c(this.periodCount, eventGraphResponse.periodCount) && Intrinsics.c(this.overtimeLength, eventGraphResponse.overtimeLength) && Intrinsics.c(this.overtimeCount, eventGraphResponse.overtimeCount);
    }

    @Nullable
    public final Integer getFullTimeCount() {
        return this.fullTimeCount;
    }

    @NotNull
    public final List<EventGraphData> getGraphPoints() {
        return this.graphPoints;
    }

    @Nullable
    public final Integer getHalfTimeCount() {
        return this.halfTimeCount;
    }

    @Nullable
    public final Integer getOvertimeCount() {
        return this.overtimeCount;
    }

    @Nullable
    public final Integer getOvertimeLength() {
        return this.overtimeLength;
    }

    @Nullable
    public final Integer getPeriodCount() {
        return this.periodCount;
    }

    @Nullable
    public final Integer getPeriodTime() {
        return this.periodTime;
    }

    public int hashCode() {
        int hashCode = this.graphPoints.hashCode() * 31;
        Integer num = this.periodTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.periodCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.overtimeLength;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.overtimeCount;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setFullTimeCount(@Nullable Integer num) {
        this.fullTimeCount = num;
    }

    public final void setHalfTimeCount(@Nullable Integer num) {
        this.halfTimeCount = num;
    }

    @NotNull
    public String toString() {
        List<EventGraphData> list = this.graphPoints;
        Integer num = this.periodTime;
        Integer num2 = this.periodCount;
        Integer num3 = this.overtimeLength;
        Integer num4 = this.overtimeCount;
        StringBuilder sb = new StringBuilder("EventGraphResponse(graphPoints=");
        sb.append(list);
        sb.append(", periodTime=");
        sb.append(num);
        sb.append(", periodCount=");
        vxd.r(num2, num3, ", overtimeLength=", ", overtimeCount=", sb);
        return vxd.n(sb, num4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventGraphResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventGraphResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventGraphResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventGraphResponse(@NotNull List<EventGraphData> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.graphPoints = list;
        this.periodTime = num;
        this.periodCount = num2;
        this.overtimeLength = num3;
        this.overtimeCount = num4;
    }
}
