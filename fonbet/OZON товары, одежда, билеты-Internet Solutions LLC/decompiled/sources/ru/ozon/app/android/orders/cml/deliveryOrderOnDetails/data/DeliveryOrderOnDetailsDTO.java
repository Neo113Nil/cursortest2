package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/DeliveryOrderOnDetailsDTO;", "", "items", "", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/ItemDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "verticalPadding", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "<init>", "(Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getVerticalPadding", "()Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryOrderOnDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ItemDTO> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final VerticalPadding verticalPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryOrderOnDetailsDTO(@NotNull List<? extends ItemDTO> items, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.verticalPadding = verticalPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryOrderOnDetailsDTO copy$default(DeliveryOrderOnDetailsDTO deliveryOrderOnDetailsDTO, List list, Map map, TestInfo testInfo, VerticalPadding verticalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deliveryOrderOnDetailsDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = deliveryOrderOnDetailsDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            testInfo = deliveryOrderOnDetailsDTO.testInfo;
        }
        if ((i11 & 8) != 0) {
            verticalPadding = deliveryOrderOnDetailsDTO.verticalPadding;
        }
        return deliveryOrderOnDetailsDTO.copy(list, map, testInfo, verticalPadding);
    }

    @NotNull
    public final List<ItemDTO> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @NotNull
    public final DeliveryOrderOnDetailsDTO copy(@NotNull List<? extends ItemDTO> items, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new DeliveryOrderOnDetailsDTO(items, trackingInfo, testInfo, verticalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderOnDetailsDTO)) {
            return false;
        }
        DeliveryOrderOnDetailsDTO deliveryOrderOnDetailsDTO = (DeliveryOrderOnDetailsDTO) other;
        return Intrinsics.d(this.items, deliveryOrderOnDetailsDTO.items) && Intrinsics.d(this.trackingInfo, deliveryOrderOnDetailsDTO.trackingInfo) && Intrinsics.d(this.testInfo, deliveryOrderOnDetailsDTO.testInfo) && Intrinsics.d(this.verticalPadding, deliveryOrderOnDetailsDTO.verticalPadding);
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode3 + (verticalPadding != null ? verticalPadding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryOrderOnDetailsDTO(items=" + this.items + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ", verticalPadding=" + this.verticalPadding + ")";
    }
}
