package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/LabelsDataSourceRemoteDto;", "", "labelsFilterExpression", "", "labelsPriority", "maxItems", "", "orderType", "Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;", "advancedOrderType", "Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;)V", "getLabelsFilterExpression", "()Ljava/lang/String;", "getLabelsPriority", "getMaxItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderType", "()Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;", "getAdvancedOrderType", "()Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;)Lcom/blaze/blazesdk/widgets/models/LabelsDataSourceRemoteDto;", "equals", "", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LabelsDataSourceRemoteDto {
    public static final int $stable = 0;

    @b6h("advancedOrderType")
    @Nullable
    private final AdvancedOrderTypeRemoteDto advancedOrderType;

    @b6h("labelsFilterExpression")
    @NotNull
    private final String labelsFilterExpression;

    @b6h("labelsPriority")
    @Nullable
    private final String labelsPriority;

    @b6h("maxItems")
    @Nullable
    private final Integer maxItems;

    @b6h("orderType")
    @Nullable
    private final OrderTypeRemoteDto orderType;

    public LabelsDataSourceRemoteDto(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable OrderTypeRemoteDto orderTypeRemoteDto, @Nullable AdvancedOrderTypeRemoteDto advancedOrderTypeRemoteDto) {
        str.getClass();
        this.labelsFilterExpression = str;
        this.labelsPriority = str2;
        this.maxItems = num;
        this.orderType = orderTypeRemoteDto;
        this.advancedOrderType = advancedOrderTypeRemoteDto;
    }

    public static /* synthetic */ LabelsDataSourceRemoteDto copy$default(LabelsDataSourceRemoteDto labelsDataSourceRemoteDto, String str, String str2, Integer num, OrderTypeRemoteDto orderTypeRemoteDto, AdvancedOrderTypeRemoteDto advancedOrderTypeRemoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = labelsDataSourceRemoteDto.labelsFilterExpression;
        }
        if ((i & 2) != 0) {
            str2 = labelsDataSourceRemoteDto.labelsPriority;
        }
        if ((i & 4) != 0) {
            num = labelsDataSourceRemoteDto.maxItems;
        }
        if ((i & 8) != 0) {
            orderTypeRemoteDto = labelsDataSourceRemoteDto.orderType;
        }
        if ((i & 16) != 0) {
            advancedOrderTypeRemoteDto = labelsDataSourceRemoteDto.advancedOrderType;
        }
        AdvancedOrderTypeRemoteDto advancedOrderTypeRemoteDto2 = advancedOrderTypeRemoteDto;
        Integer num2 = num;
        return labelsDataSourceRemoteDto.copy(str, str2, num2, orderTypeRemoteDto, advancedOrderTypeRemoteDto2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabelsFilterExpression() {
        return this.labelsFilterExpression;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLabelsPriority() {
        return this.labelsPriority;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getMaxItems() {
        return this.maxItems;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final OrderTypeRemoteDto getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AdvancedOrderTypeRemoteDto getAdvancedOrderType() {
        return this.advancedOrderType;
    }

    @NotNull
    public final LabelsDataSourceRemoteDto copy(@NotNull String labelsFilterExpression, @Nullable String labelsPriority, @Nullable Integer maxItems, @Nullable OrderTypeRemoteDto orderType, @Nullable AdvancedOrderTypeRemoteDto advancedOrderType) {
        labelsFilterExpression.getClass();
        return new LabelsDataSourceRemoteDto(labelsFilterExpression, labelsPriority, maxItems, orderType, advancedOrderType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelsDataSourceRemoteDto)) {
            return false;
        }
        LabelsDataSourceRemoteDto labelsDataSourceRemoteDto = (LabelsDataSourceRemoteDto) other;
        return Intrinsics.c(this.labelsFilterExpression, labelsDataSourceRemoteDto.labelsFilterExpression) && Intrinsics.c(this.labelsPriority, labelsDataSourceRemoteDto.labelsPriority) && Intrinsics.c(this.maxItems, labelsDataSourceRemoteDto.maxItems) && this.orderType == labelsDataSourceRemoteDto.orderType && this.advancedOrderType == labelsDataSourceRemoteDto.advancedOrderType;
    }

    @Nullable
    public final AdvancedOrderTypeRemoteDto getAdvancedOrderType() {
        return this.advancedOrderType;
    }

    @NotNull
    public final String getLabelsFilterExpression() {
        return this.labelsFilterExpression;
    }

    @Nullable
    public final String getLabelsPriority() {
        return this.labelsPriority;
    }

    @Nullable
    public final Integer getMaxItems() {
        return this.maxItems;
    }

    @Nullable
    public final OrderTypeRemoteDto getOrderType() {
        return this.orderType;
    }

    public int hashCode() {
        int hashCode = this.labelsFilterExpression.hashCode() * 31;
        String str = this.labelsPriority;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxItems;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        OrderTypeRemoteDto orderTypeRemoteDto = this.orderType;
        int hashCode4 = (hashCode3 + (orderTypeRemoteDto == null ? 0 : orderTypeRemoteDto.hashCode())) * 31;
        AdvancedOrderTypeRemoteDto advancedOrderTypeRemoteDto = this.advancedOrderType;
        return hashCode4 + (advancedOrderTypeRemoteDto != null ? advancedOrderTypeRemoteDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LabelsDataSourceRemoteDto(labelsFilterExpression=" + this.labelsFilterExpression + ", labelsPriority=" + this.labelsPriority + ", maxItems=" + this.maxItems + ", orderType=" + this.orderType + ", advancedOrderType=" + this.advancedOrderType + ')';
    }
}
