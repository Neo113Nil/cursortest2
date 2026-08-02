package ru.ozon.app.android.account.orders.clicktodeliverymodal.data;

import Bi.b;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u0011HÆ\u0003Jg\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006/"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/DeliveryDTO;", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "images", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "index", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;I)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getImages", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final List<ImageDTO> images;
    private final transient int index;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public DeliveryDTO(String str, @NotNull CornerRadius cornerRadius, @NotNull CellDTO cell, @NotNull List<ImageDTO> images, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, int i11) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(images, "images");
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.cell = cell;
        this.images = images;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.index = i11;
    }

    public static /* synthetic */ DeliveryDTO copy$default(DeliveryDTO deliveryDTO, String str, CornerRadius cornerRadius, CellDTO cellDTO, List list, Map map, TestInfo testInfo, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliveryDTO.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            cornerRadius = deliveryDTO.cornerRadius;
        }
        if ((i12 & 4) != 0) {
            cellDTO = deliveryDTO.cell;
        }
        if ((i12 & 8) != 0) {
            list = deliveryDTO.images;
        }
        if ((i12 & 16) != 0) {
            map = deliveryDTO.trackingInfo;
        }
        if ((i12 & 32) != 0) {
            testInfo = deliveryDTO.testInfo;
        }
        if ((i12 & 64) != 0) {
            i11 = deliveryDTO.index;
        }
        TestInfo testInfo2 = testInfo;
        int i13 = i11;
        Map map2 = map;
        CellDTO cellDTO2 = cellDTO;
        return deliveryDTO.copy(str, cornerRadius, cellDTO2, list, map2, testInfo2, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final List<ImageDTO> component4() {
        return this.images;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final DeliveryDTO copy(String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull CellDTO cell, @NotNull List<ImageDTO> images, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, int index) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(images, "images");
        return new DeliveryDTO(backgroundColor, cornerRadius, cell, images, trackingInfo, testInfo, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDTO)) {
            return false;
        }
        DeliveryDTO deliveryDTO = (DeliveryDTO) other;
        return Intrinsics.d(this.backgroundColor, deliveryDTO.backgroundColor) && this.cornerRadius == deliveryDTO.cornerRadius && Intrinsics.d(this.cell, deliveryDTO.cell) && Intrinsics.d(this.images, deliveryDTO.images) && Intrinsics.d(this.trackingInfo, deliveryDTO.trackingInfo) && Intrinsics.d(this.testInfo, deliveryDTO.testInfo) && this.index == deliveryDTO.index;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final List<ImageDTO> getImages() {
        return this.images;
    }

    public final int getIndex() {
        return this.index;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int b11 = g.b(b.c(this.cell, Tl.b.b(this.cornerRadius, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.images);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return Integer.hashCode(this.index) + ((hashCode + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        CellDTO cellDTO = this.cell;
        List<ImageDTO> list = this.images;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        int i11 = this.index;
        StringBuilder sb2 = new StringBuilder("DeliveryDTO(backgroundColor=");
        sb2.append(str);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", images=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", index=");
        return K00.b.e(i11, ")", sb2);
    }

    public /* synthetic */ DeliveryDTO(String str, CornerRadius cornerRadius, CellDTO cellDTO, List list, Map map, TestInfo testInfo, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, cellDTO, list, map, testInfo, (i12 & 64) != 0 ? 0 : i11);
    }
}
