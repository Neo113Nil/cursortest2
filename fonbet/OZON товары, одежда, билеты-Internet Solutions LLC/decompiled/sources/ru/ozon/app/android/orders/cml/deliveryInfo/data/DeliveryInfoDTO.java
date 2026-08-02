package ru.ozon.app.android.orders.cml.deliveryInfo.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Ja\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "", "islandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "", "verticalPadding", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "cellList", "", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/List;)V", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "()Ljava/lang/String;", "getVerticalPadding", "()Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getCellList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryInfoDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<InfoCellDTO> cellList;
    private final CornerRadius islandCornerRadius;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final VerticalPadding verticalPadding;

    public DeliveryInfoDTO(CornerRadius cornerRadius, String str, VerticalPadding verticalPadding, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, @NotNull List<InfoCellDTO> cellList) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.islandCornerRadius = cornerRadius;
        this.backgroundColor = str;
        this.verticalPadding = verticalPadding;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.cellList = cellList;
    }

    public static /* synthetic */ DeliveryInfoDTO copy$default(DeliveryInfoDTO deliveryInfoDTO, CornerRadius cornerRadius, String str, VerticalPadding verticalPadding, Map map, TestInfo testInfo, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cornerRadius = deliveryInfoDTO.islandCornerRadius;
        }
        if ((i11 & 2) != 0) {
            str = deliveryInfoDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            verticalPadding = deliveryInfoDTO.verticalPadding;
        }
        if ((i11 & 8) != 0) {
            map = deliveryInfoDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            testInfo = deliveryInfoDTO.testInfo;
        }
        if ((i11 & 32) != 0) {
            list = deliveryInfoDTO.cellList;
        }
        TestInfo testInfo2 = testInfo;
        List list2 = list;
        return deliveryInfoDTO.copy(cornerRadius, str, verticalPadding, map, testInfo2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final List<InfoCellDTO> component6() {
        return this.cellList;
    }

    @NotNull
    public final DeliveryInfoDTO copy(CornerRadius islandCornerRadius, String backgroundColor, VerticalPadding verticalPadding, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, @NotNull List<InfoCellDTO> cellList) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        return new DeliveryInfoDTO(islandCornerRadius, backgroundColor, verticalPadding, trackingInfo, testInfo, cellList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryInfoDTO)) {
            return false;
        }
        DeliveryInfoDTO deliveryInfoDTO = (DeliveryInfoDTO) other;
        return this.islandCornerRadius == deliveryInfoDTO.islandCornerRadius && Intrinsics.d(this.backgroundColor, deliveryInfoDTO.backgroundColor) && Intrinsics.d(this.verticalPadding, deliveryInfoDTO.verticalPadding) && Intrinsics.d(this.trackingInfo, deliveryInfoDTO.trackingInfo) && Intrinsics.d(this.testInfo, deliveryInfoDTO.testInfo) && Intrinsics.d(this.cellList, deliveryInfoDTO.cellList);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<InfoCellDTO> getCellList() {
        return this.cellList;
    }

    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
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
        CornerRadius cornerRadius = this.islandCornerRadius;
        int hashCode = (cornerRadius == null ? 0 : cornerRadius.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        int hashCode3 = (hashCode2 + (verticalPadding == null ? 0 : verticalPadding.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return this.cellList.hashCode() + ((hashCode4 + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "DeliveryInfoDTO(islandCornerRadius=" + this.islandCornerRadius + ", backgroundColor=" + this.backgroundColor + ", verticalPadding=" + this.verticalPadding + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ", cellList=" + this.cellList + ")";
    }

    public /* synthetic */ DeliveryInfoDTO(CornerRadius cornerRadius, String str, VerticalPadding verticalPadding, Map map, TestInfo testInfo, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, str, verticalPadding, map, testInfo, list);
    }
}
