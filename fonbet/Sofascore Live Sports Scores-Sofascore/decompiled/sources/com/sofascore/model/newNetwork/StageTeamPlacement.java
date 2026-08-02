package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJL\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001f¨\u00064"}, d2 = {"Lcom/sofascore/model/newNetwork/StageTeamPlacement;", "", "", "teamId", "position", "", "points", "", "status", "gap", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageTeamPlacement;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Double;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/StageTeamPlacement;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getTeamId", "getPosition", "Ljava/lang/Double;", "getPoints", "Ljava/lang/String;", "getStatus", "getGap", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageTeamPlacement {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String gap;

    @Nullable
    private final Double points;

    @Nullable
    private final Integer position;

    @Nullable
    private final String status;

    @Nullable
    private final Integer teamId;

    public /* synthetic */ StageTeamPlacement(int i, Integer num, Integer num2, Double d, String str, String str2, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, StageTeamPlacement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.teamId = num;
        this.position = num2;
        this.points = d;
        this.status = str;
        this.gap = str2;
    }

    public static /* synthetic */ StageTeamPlacement copy$default(StageTeamPlacement stageTeamPlacement, Integer num, Integer num2, Double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = stageTeamPlacement.teamId;
        }
        if ((i & 2) != 0) {
            num2 = stageTeamPlacement.position;
        }
        if ((i & 4) != 0) {
            d = stageTeamPlacement.points;
        }
        if ((i & 8) != 0) {
            str = stageTeamPlacement.status;
        }
        if ((i & 16) != 0) {
            str2 = stageTeamPlacement.gap;
        }
        String str3 = str2;
        Double d2 = d;
        return stageTeamPlacement.copy(num, num2, d2, str, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(StageTeamPlacement self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.teamId);
        output.h(serialDesc, 1, a7aVar, self.position);
        output.h(serialDesc, 2, h75.a, self.points);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 3, uhiVar, self.status);
        output.h(serialDesc, 4, uhiVar, self.gap);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getTeamId() {
        return this.teamId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getGap() {
        return this.gap;
    }

    @NotNull
    public final StageTeamPlacement copy(@Nullable Integer teamId, @Nullable Integer position, @Nullable Double points, @Nullable String status, @Nullable String gap) {
        return new StageTeamPlacement(teamId, position, points, status, gap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageTeamPlacement)) {
            return false;
        }
        StageTeamPlacement stageTeamPlacement = (StageTeamPlacement) other;
        return Intrinsics.c(this.teamId, stageTeamPlacement.teamId) && Intrinsics.c(this.position, stageTeamPlacement.position) && Intrinsics.c(this.points, stageTeamPlacement.points) && Intrinsics.c(this.status, stageTeamPlacement.status) && Intrinsics.c(this.gap, stageTeamPlacement.gap);
    }

    @Nullable
    public final String getGap() {
        return this.gap;
    }

    @Nullable
    public final Double getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getTeamId() {
        return this.teamId;
    }

    public int hashCode() {
        Integer num = this.teamId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.position;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.points;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.status;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gap;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.teamId;
        Integer num2 = this.position;
        Double d = this.points;
        String str = this.status;
        String str2 = this.gap;
        StringBuilder k = wv8.k(num, "StageTeamPlacement(teamId=", ", position=", ", points=", num2);
        k.append(d);
        k.append(", status=");
        k.append(str);
        k.append(", gap=");
        return mz1.o(k, str2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageTeamPlacement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageTeamPlacement;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageTeamPlacement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageTeamPlacement(@Nullable Integer num, @Nullable Integer num2, @Nullable Double d, @Nullable String str, @Nullable String str2) {
        this.teamId = num;
        this.position = num2;
        this.points = d;
        this.status = str;
        this.gap = str2;
    }
}
