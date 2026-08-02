package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Stage$$serializer;
import defpackage.a7a;
import defpackage.fn0;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.ljg;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.s8f;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010#J¢\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b1\u0010'J\u0010\u00102\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\b\u0005\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bG\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bH\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010)R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bO\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bP\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bQ\u0010#¨\u0006T"}, d2 = {"Lcom/sofascore/model/newNetwork/RaceDetailsResponse;", "", "Lcom/sofascore/model/mvvm/model/Stage;", "stage", "", "isLive", "", "points", "", "position", "gridPosition", "number", "", "fastestLapTime", "", "updatedAtTimestamp", "", "Lcom/sofascore/model/newNetwork/RaceDriverResults;", "driverResults", "didNotStart", "didNotFinish", "disqualified", "<init>", "(Lcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Lcom/sofascore/model/mvvm/model/Stage;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Double;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Ljava/lang/String;", "component8", "()J", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "copy", "(Lcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/RaceDetailsResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/RaceDetailsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Stage;", "getStage", "Ljava/lang/Boolean;", "Ljava/lang/Double;", "getPoints", "Ljava/lang/Integer;", "getPosition", "getGridPosition", "getNumber", "Ljava/lang/String;", "getFastestLapTime", "J", "getUpdatedAtTimestamp", "Ljava/util/List;", "getDriverResults", "getDidNotStart", "getDidNotFinish", "getDisqualified", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RaceDetailsResponse {

    @Nullable
    private final Integer didNotFinish;

    @Nullable
    private final Integer didNotStart;

    @Nullable
    private final Integer disqualified;

    @Nullable
    private final List<RaceDriverResults> driverResults;

    @Nullable
    private final String fastestLapTime;

    @Nullable
    private final Integer gridPosition;

    @Nullable
    private final Boolean isLive;

    @Nullable
    private final Integer number;

    @Nullable
    private final Double points;

    @Nullable
    private final Integer position;

    @NotNull
    private final Stage stage;
    private final long updatedAtTimestamp;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, ypa.a(ysa.b, new s8f(17)), null, null, null};

    public /* synthetic */ RaceDetailsResponse(int i, Stage stage, Boolean bool, Double d, Integer num, Integer num2, Integer num3, String str, long j, List list, Integer num4, Integer num5, Integer num6, t5h t5hVar) {
        if (4095 != (i & 4095)) {
            oea.z(i, 4095, RaceDetailsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stage = stage;
        this.isLive = bool;
        this.points = d;
        this.position = num;
        this.gridPosition = num2;
        this.number = num3;
        this.fastestLapTime = str;
        this.updatedAtTimestamp = j;
        this.driverResults = list;
        this.didNotStart = num4;
        this.didNotFinish = num5;
        this.disqualified = num6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(RaceDriverResults$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ RaceDetailsResponse copy$default(RaceDetailsResponse raceDetailsResponse, Stage stage, Boolean bool, Double d, Integer num, Integer num2, Integer num3, String str, long j, List list, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            stage = raceDetailsResponse.stage;
        }
        return raceDetailsResponse.copy(stage, (i & 2) != 0 ? raceDetailsResponse.isLive : bool, (i & 4) != 0 ? raceDetailsResponse.points : d, (i & 8) != 0 ? raceDetailsResponse.position : num, (i & 16) != 0 ? raceDetailsResponse.gridPosition : num2, (i & 32) != 0 ? raceDetailsResponse.number : num3, (i & 64) != 0 ? raceDetailsResponse.fastestLapTime : str, (i & 128) != 0 ? raceDetailsResponse.updatedAtTimestamp : j, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? raceDetailsResponse.driverResults : list, (i & 512) != 0 ? raceDetailsResponse.didNotStart : num4, (i & 1024) != 0 ? raceDetailsResponse.didNotFinish : num5, (i & a.o) != 0 ? raceDetailsResponse.disqualified : num6);
    }

    public static final /* synthetic */ void write$Self$model_release(RaceDetailsResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Stage$$serializer.INSTANCE, self.stage);
        output.h(serialDesc, 1, gz1.a, self.isLive);
        output.h(serialDesc, 2, h75.a, self.points);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.position);
        output.h(serialDesc, 4, a7aVar, self.gridPosition);
        output.h(serialDesc, 5, a7aVar, self.number);
        output.h(serialDesc, 6, uhi.a, self.fastestLapTime);
        output.E(serialDesc, 7, self.updatedAtTimestamp);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.driverResults);
        output.h(serialDesc, 9, a7aVar, self.didNotStart);
        output.h(serialDesc, 10, a7aVar, self.didNotFinish);
        output.h(serialDesc, 11, a7aVar, self.disqualified);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Stage getStage() {
        return this.stage;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getDidNotStart() {
        return this.didNotStart;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getDidNotFinish() {
        return this.didNotFinish;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getDisqualified() {
        return this.disqualified;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsLive() {
        return this.isLive;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getGridPosition() {
        return this.gridPosition;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getFastestLapTime() {
        return this.fastestLapTime;
    }

    /* renamed from: component8, reason: from getter */
    public final long getUpdatedAtTimestamp() {
        return this.updatedAtTimestamp;
    }

    @Nullable
    public final List<RaceDriverResults> component9() {
        return this.driverResults;
    }

    @NotNull
    public final RaceDetailsResponse copy(@NotNull Stage stage, @Nullable Boolean isLive, @Nullable Double points, @Nullable Integer position, @Nullable Integer gridPosition, @Nullable Integer number, @Nullable String fastestLapTime, long updatedAtTimestamp, @Nullable List<RaceDriverResults> driverResults, @Nullable Integer didNotStart, @Nullable Integer didNotFinish, @Nullable Integer disqualified) {
        stage.getClass();
        return new RaceDetailsResponse(stage, isLive, points, position, gridPosition, number, fastestLapTime, updatedAtTimestamp, driverResults, didNotStart, didNotFinish, disqualified);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RaceDetailsResponse)) {
            return false;
        }
        RaceDetailsResponse raceDetailsResponse = (RaceDetailsResponse) other;
        return Intrinsics.c(this.stage, raceDetailsResponse.stage) && Intrinsics.c(this.isLive, raceDetailsResponse.isLive) && Intrinsics.c(this.points, raceDetailsResponse.points) && Intrinsics.c(this.position, raceDetailsResponse.position) && Intrinsics.c(this.gridPosition, raceDetailsResponse.gridPosition) && Intrinsics.c(this.number, raceDetailsResponse.number) && Intrinsics.c(this.fastestLapTime, raceDetailsResponse.fastestLapTime) && this.updatedAtTimestamp == raceDetailsResponse.updatedAtTimestamp && Intrinsics.c(this.driverResults, raceDetailsResponse.driverResults) && Intrinsics.c(this.didNotStart, raceDetailsResponse.didNotStart) && Intrinsics.c(this.didNotFinish, raceDetailsResponse.didNotFinish) && Intrinsics.c(this.disqualified, raceDetailsResponse.disqualified);
    }

    @Nullable
    public final Integer getDidNotFinish() {
        return this.didNotFinish;
    }

    @Nullable
    public final Integer getDidNotStart() {
        return this.didNotStart;
    }

    @Nullable
    public final Integer getDisqualified() {
        return this.disqualified;
    }

    @Nullable
    public final List<RaceDriverResults> getDriverResults() {
        return this.driverResults;
    }

    @Nullable
    public final String getFastestLapTime() {
        return this.fastestLapTime;
    }

    @Nullable
    public final Integer getGridPosition() {
        return this.gridPosition;
    }

    @Nullable
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    public final Double getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @NotNull
    public final Stage getStage() {
        return this.stage;
    }

    public final long getUpdatedAtTimestamp() {
        return this.updatedAtTimestamp;
    }

    public int hashCode() {
        int hashCode = this.stage.hashCode() * 31;
        Boolean bool = this.isLive;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.points;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.position;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.gridPosition;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.number;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.fastestLapTime;
        int c = ljg.c((hashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.updatedAtTimestamp);
        List<RaceDriverResults> list = this.driverResults;
        int hashCode7 = (c + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.didNotStart;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.didNotFinish;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.disqualified;
        return hashCode9 + (num6 != null ? num6.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLive() {
        return this.isLive;
    }

    @NotNull
    public String toString() {
        Stage stage = this.stage;
        Boolean bool = this.isLive;
        Double d = this.points;
        Integer num = this.position;
        Integer num2 = this.gridPosition;
        Integer num3 = this.number;
        String str = this.fastestLapTime;
        long j = this.updatedAtTimestamp;
        List<RaceDriverResults> list = this.driverResults;
        Integer num4 = this.didNotStart;
        Integer num5 = this.didNotFinish;
        Integer num6 = this.disqualified;
        StringBuilder sb = new StringBuilder("RaceDetailsResponse(stage=");
        sb.append(stage);
        sb.append(", isLive=");
        sb.append(bool);
        sb.append(", points=");
        mz1.x(d, num, ", position=", ", gridPosition=", sb);
        vxd.r(num2, num3, ", number=", ", fastestLapTime=", sb);
        i.n(j, str, ", updatedAtTimestamp=", sb);
        sb.append(", driverResults=");
        sb.append(list);
        sb.append(", didNotStart=");
        sb.append(num4);
        fn0.w(num5, num6, ", didNotFinish=", ", disqualified=", sb);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/RaceDetailsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/RaceDetailsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RaceDetailsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RaceDetailsResponse(@NotNull Stage stage, @Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, long j, @Nullable List<RaceDriverResults> list, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        stage.getClass();
        this.stage = stage;
        this.isLive = bool;
        this.points = d;
        this.position = num;
        this.gridPosition = num2;
        this.number = num3;
        this.fastestLapTime = str;
        this.updatedAtTimestamp = j;
        this.driverResults = list;
        this.didNotStart = num4;
        this.didNotFinish = num5;
        this.disqualified = num6;
    }
}
