package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.b6h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/IdsDataSourceRemoteDto;", "", "contentIds", "", "", "orderType", "Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;", "advancedOrderType", "Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;", "<init>", "(Ljava/util/List;Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;)V", "getContentIds", "()Ljava/util/List;", "getOrderType", "()Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;", "getAdvancedOrderType", "()Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IdsDataSourceRemoteDto {
    public static final int $stable = 8;

    @b6h("advancedOrderType")
    @Nullable
    private final AdvancedOrderTypeRemoteDto advancedOrderType;

    @b6h("contentIds")
    @NotNull
    private final List<String> contentIds;

    @b6h("orderType")
    @Nullable
    private final OrderTypeRemoteDto orderType;

    public IdsDataSourceRemoteDto(@NotNull List<String> list, @Nullable OrderTypeRemoteDto orderTypeRemoteDto, @Nullable AdvancedOrderTypeRemoteDto advancedOrderTypeRemoteDto) {
        list.getClass();
        this.contentIds = list;
        this.orderType = orderTypeRemoteDto;
        this.advancedOrderType = advancedOrderTypeRemoteDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdsDataSourceRemoteDto copy$default(IdsDataSourceRemoteDto idsDataSourceRemoteDto, List list, OrderTypeRemoteDto orderTypeRemoteDto, AdvancedOrderTypeRemoteDto advancedOrderTypeRemoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = idsDataSourceRemoteDto.contentIds;
        }
        if ((i & 2) != 0) {
            orderTypeRemoteDto = idsDataSourceRemoteDto.orderType;
        }
        if ((i & 4) != 0) {
            advancedOrderTypeRemoteDto = idsDataSourceRemoteDto.advancedOrderType;
        }
        return idsDataSourceRemoteDto.copy(list, orderTypeRemoteDto, advancedOrderTypeRemoteDto);
    }

    @NotNull
    public final List<String> component1() {
        return this.contentIds;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final OrderTypeRemoteDto getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final AdvancedOrderTypeRemoteDto getAdvancedOrderType() {
        return this.advancedOrderType;
    }

    @NotNull
    public final IdsDataSourceRemoteDto copy(@NotNull List<String> contentIds, @Nullable OrderTypeRemoteDto orderType, @Nullable AdvancedOrderTypeRemoteDto advancedOrderType) {
        contentIds.getClass();
        return new IdsDataSourceRemoteDto(contentIds, orderType, advancedOrderType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdsDataSourceRemoteDto)) {
            return false;
        }
        IdsDataSourceRemoteDto idsDataSourceRemoteDto = (IdsDataSourceRemoteDto) other;
        return Intrinsics.c(this.contentIds, idsDataSourceRemoteDto.contentIds) && this.orderType == idsDataSourceRemoteDto.orderType && this.advancedOrderType == idsDataSourceRemoteDto.advancedOrderType;
    }

    @Nullable
    public final AdvancedOrderTypeRemoteDto getAdvancedOrderType() {
        return this.advancedOrderType;
    }

    @NotNull
    public final List<String> getContentIds() {
        return this.contentIds;
    }

    @Nullable
    public final OrderTypeRemoteDto getOrderType() {
        return this.orderType;
    }

    public int hashCode() {
        int hashCode = this.contentIds.hashCode() * 31;
        OrderTypeRemoteDto orderTypeRemoteDto = this.orderType;
        int hashCode2 = (hashCode + (orderTypeRemoteDto == null ? 0 : orderTypeRemoteDto.hashCode())) * 31;
        AdvancedOrderTypeRemoteDto advancedOrderTypeRemoteDto = this.advancedOrderType;
        return hashCode2 + (advancedOrderTypeRemoteDto != null ? advancedOrderTypeRemoteDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IdsDataSourceRemoteDto(contentIds=" + this.contentIds + ", orderType=" + this.orderType + ", advancedOrderType=" + this.advancedOrderType + ')';
    }
}
