package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$JP\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b5\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\b8\u0010$\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatisticsRowData;", "", "", "firstTeamColor", "secondTeamColor", "esportCategoryId", "Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;", "firstTeamData", "secondTeamData", "", "areRolesMatched", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;Z)V", "seen0", "hideDivider", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;ILcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;ZZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatisticsRowData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()I", "component4", "()Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;", "component5", "component6", "()Z", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;ILcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;Z)Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatisticsRowData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getFirstTeamColor", "getSecondTeamColor", "I", "getEsportCategoryId", "Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;", "getFirstTeamData", "getSecondTeamData", "Z", "getAreRolesMatched", "getHideDivider", "setHideDivider", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ESportsGamePlayerStatisticsRowData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean areRolesMatched;
    private final int esportCategoryId;

    @Nullable
    private final Integer firstTeamColor;

    @NotNull
    private final ESportsGamePlayerStatistics firstTeamData;
    private boolean hideDivider;

    @Nullable
    private final Integer secondTeamColor;

    @NotNull
    private final ESportsGamePlayerStatistics secondTeamData;

    public /* synthetic */ ESportsGamePlayerStatisticsRowData(int i, Integer num, Integer num2, int i2, ESportsGamePlayerStatistics eSportsGamePlayerStatistics, ESportsGamePlayerStatistics eSportsGamePlayerStatistics2, boolean z, boolean z2, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, ESportsGamePlayerStatisticsRowData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.firstTeamColor = num;
        this.secondTeamColor = num2;
        this.esportCategoryId = i2;
        this.firstTeamData = eSportsGamePlayerStatistics;
        this.secondTeamData = eSportsGamePlayerStatistics2;
        if ((i & 32) == 0) {
            this.areRolesMatched = false;
        } else {
            this.areRolesMatched = z;
        }
        if ((i & 64) == 0) {
            this.hideDivider = false;
        } else {
            this.hideDivider = z2;
        }
    }

    public static /* synthetic */ ESportsGamePlayerStatisticsRowData copy$default(ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData, Integer num, Integer num2, int i, ESportsGamePlayerStatistics eSportsGamePlayerStatistics, ESportsGamePlayerStatistics eSportsGamePlayerStatistics2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = eSportsGamePlayerStatisticsRowData.firstTeamColor;
        }
        if ((i2 & 2) != 0) {
            num2 = eSportsGamePlayerStatisticsRowData.secondTeamColor;
        }
        if ((i2 & 4) != 0) {
            i = eSportsGamePlayerStatisticsRowData.esportCategoryId;
        }
        if ((i2 & 8) != 0) {
            eSportsGamePlayerStatistics = eSportsGamePlayerStatisticsRowData.firstTeamData;
        }
        if ((i2 & 16) != 0) {
            eSportsGamePlayerStatistics2 = eSportsGamePlayerStatisticsRowData.secondTeamData;
        }
        if ((i2 & 32) != 0) {
            z = eSportsGamePlayerStatisticsRowData.areRolesMatched;
        }
        ESportsGamePlayerStatistics eSportsGamePlayerStatistics3 = eSportsGamePlayerStatistics2;
        boolean z2 = z;
        return eSportsGamePlayerStatisticsRowData.copy(num, num2, i, eSportsGamePlayerStatistics, eSportsGamePlayerStatistics3, z2);
    }

    public static final /* synthetic */ void write$Self$model_release(ESportsGamePlayerStatisticsRowData self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.firstTeamColor);
        output.h(serialDesc, 1, a7aVar, self.secondTeamColor);
        output.u(2, self.esportCategoryId, serialDesc);
        ESportsGamePlayerStatistics$$serializer eSportsGamePlayerStatistics$$serializer = ESportsGamePlayerStatistics$$serializer.INSTANCE;
        output.f(serialDesc, 3, eSportsGamePlayerStatistics$$serializer, self.firstTeamData);
        output.f(serialDesc, 4, eSportsGamePlayerStatistics$$serializer, self.secondTeamData);
        if (output.o(serialDesc) || self.areRolesMatched) {
            output.x(serialDesc, 5, self.areRolesMatched);
        }
        if (output.o(serialDesc) || self.hideDivider) {
            output.x(serialDesc, 6, self.hideDivider);
        }
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getFirstTeamColor() {
        return this.firstTeamColor;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getSecondTeamColor() {
        return this.secondTeamColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEsportCategoryId() {
        return this.esportCategoryId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ESportsGamePlayerStatistics getFirstTeamData() {
        return this.firstTeamData;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ESportsGamePlayerStatistics getSecondTeamData() {
        return this.secondTeamData;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAreRolesMatched() {
        return this.areRolesMatched;
    }

    @NotNull
    public final ESportsGamePlayerStatisticsRowData copy(@Nullable Integer firstTeamColor, @Nullable Integer secondTeamColor, int esportCategoryId, @NotNull ESportsGamePlayerStatistics firstTeamData, @NotNull ESportsGamePlayerStatistics secondTeamData, boolean areRolesMatched) {
        firstTeamData.getClass();
        secondTeamData.getClass();
        return new ESportsGamePlayerStatisticsRowData(firstTeamColor, secondTeamColor, esportCategoryId, firstTeamData, secondTeamData, areRolesMatched);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESportsGamePlayerStatisticsRowData)) {
            return false;
        }
        ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData = (ESportsGamePlayerStatisticsRowData) other;
        return Intrinsics.c(this.firstTeamColor, eSportsGamePlayerStatisticsRowData.firstTeamColor) && Intrinsics.c(this.secondTeamColor, eSportsGamePlayerStatisticsRowData.secondTeamColor) && this.esportCategoryId == eSportsGamePlayerStatisticsRowData.esportCategoryId && Intrinsics.c(this.firstTeamData, eSportsGamePlayerStatisticsRowData.firstTeamData) && Intrinsics.c(this.secondTeamData, eSportsGamePlayerStatisticsRowData.secondTeamData) && this.areRolesMatched == eSportsGamePlayerStatisticsRowData.areRolesMatched;
    }

    public final boolean getAreRolesMatched() {
        return this.areRolesMatched;
    }

    public final int getEsportCategoryId() {
        return this.esportCategoryId;
    }

    @Nullable
    public final Integer getFirstTeamColor() {
        return this.firstTeamColor;
    }

    @NotNull
    public final ESportsGamePlayerStatistics getFirstTeamData() {
        return this.firstTeamData;
    }

    public final boolean getHideDivider() {
        return this.hideDivider;
    }

    @Nullable
    public final Integer getSecondTeamColor() {
        return this.secondTeamColor;
    }

    @NotNull
    public final ESportsGamePlayerStatistics getSecondTeamData() {
        return this.secondTeamData;
    }

    public int hashCode() {
        Integer num = this.firstTeamColor;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.secondTeamColor;
        return Boolean.hashCode(this.areRolesMatched) + ((this.secondTeamData.hashCode() + ((this.firstTeamData.hashCode() + wv8.a(this.esportCategoryId, (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }

    public final void setHideDivider(boolean z) {
        this.hideDivider = z;
    }

    @NotNull
    public String toString() {
        Integer num = this.firstTeamColor;
        Integer num2 = this.secondTeamColor;
        int i = this.esportCategoryId;
        ESportsGamePlayerStatistics eSportsGamePlayerStatistics = this.firstTeamData;
        ESportsGamePlayerStatistics eSportsGamePlayerStatistics2 = this.secondTeamData;
        boolean z = this.areRolesMatched;
        StringBuilder k = wv8.k(num, "ESportsGamePlayerStatisticsRowData(firstTeamColor=", ", secondTeamColor=", ", esportCategoryId=", num2);
        k.append(i);
        k.append(", firstTeamData=");
        k.append(eSportsGamePlayerStatistics);
        k.append(", secondTeamData=");
        k.append(eSportsGamePlayerStatistics2);
        k.append(", areRolesMatched=");
        k.append(z);
        k.append(")");
        return k.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatisticsRowData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatisticsRowData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ESportsGamePlayerStatisticsRowData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ESportsGamePlayerStatisticsRowData(@Nullable Integer num, @Nullable Integer num2, int i, @NotNull ESportsGamePlayerStatistics eSportsGamePlayerStatistics, @NotNull ESportsGamePlayerStatistics eSportsGamePlayerStatistics2, boolean z) {
        eSportsGamePlayerStatistics.getClass();
        eSportsGamePlayerStatistics2.getClass();
        this.firstTeamColor = num;
        this.secondTeamColor = num2;
        this.esportCategoryId = i;
        this.firstTeamData = eSportsGamePlayerStatistics;
        this.secondTeamData = eSportsGamePlayerStatistics2;
        this.areRolesMatched = z;
    }

    public /* synthetic */ ESportsGamePlayerStatisticsRowData(Integer num, Integer num2, int i, ESportsGamePlayerStatistics eSportsGamePlayerStatistics, ESportsGamePlayerStatistics eSportsGamePlayerStatistics2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, i, eSportsGamePlayerStatistics, eSportsGamePlayerStatistics2, (i2 & 32) != 0 ? false : z);
    }
}
