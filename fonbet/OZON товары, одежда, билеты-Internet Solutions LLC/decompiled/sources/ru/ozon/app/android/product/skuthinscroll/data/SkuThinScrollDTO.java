package ru.ozon.app.android.product.skuthinscroll.data;

import G.g;
import HY.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;", "items", "", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO;", "width", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "sharedData", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO$SharedData;", "<init>", "(Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;Ljava/util/List;Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO$SharedData;)V", "getHeader", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;", "getItems", "()Ljava/util/List;", "getWidth", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getSharedData", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO$SharedData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "SharedData", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SkuThinScrollDTO {
    private final SkuThinScrollHeaderDTO header;

    @NotNull
    private final List<SkuThinScrollItemDTO> items;
    private final SharedData sharedData;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final SkuThinScrollWidth width;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO$SharedData;", "", "blurItemInfo", "", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "<init>", "(Ljava/util/Map;)V", "getBlurItemInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SharedData {
        private final Map<String, BlurMoleculeContentDTO> blurItemInfo;

        public SharedData(Map<String, BlurMoleculeContentDTO> map) {
            this.blurItemInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharedData copy$default(SharedData sharedData, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = sharedData.blurItemInfo;
            }
            return sharedData.copy(map);
        }

        public final Map<String, BlurMoleculeContentDTO> component1() {
            return this.blurItemInfo;
        }

        @NotNull
        public final SharedData copy(Map<String, BlurMoleculeContentDTO> blurItemInfo) {
            return new SharedData(blurItemInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SharedData) && Intrinsics.d(this.blurItemInfo, ((SharedData) other).blurItemInfo);
        }

        public final Map<String, BlurMoleculeContentDTO> getBlurItemInfo() {
            return this.blurItemInfo;
        }

        public int hashCode() {
            Map<String, BlurMoleculeContentDTO> map = this.blurItemInfo;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("SharedData(blurItemInfo=", ")", this.blurItemInfo);
        }
    }

    public SkuThinScrollDTO(SkuThinScrollHeaderDTO skuThinScrollHeaderDTO, @NotNull List<SkuThinScrollItemDTO> items, SkuThinScrollWidth skuThinScrollWidth, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = skuThinScrollHeaderDTO;
        this.items = items;
        this.width = skuThinScrollWidth;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.sharedData = sharedData;
    }

    public static /* synthetic */ SkuThinScrollDTO copy$default(SkuThinScrollDTO skuThinScrollDTO, SkuThinScrollHeaderDTO skuThinScrollHeaderDTO, List list, SkuThinScrollWidth skuThinScrollWidth, Map map, TestInfo testInfo, SharedData sharedData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            skuThinScrollHeaderDTO = skuThinScrollDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = skuThinScrollDTO.items;
        }
        if ((i11 & 4) != 0) {
            skuThinScrollWidth = skuThinScrollDTO.width;
        }
        if ((i11 & 8) != 0) {
            map = skuThinScrollDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            testInfo = skuThinScrollDTO.testInfo;
        }
        if ((i11 & 32) != 0) {
            sharedData = skuThinScrollDTO.sharedData;
        }
        TestInfo testInfo2 = testInfo;
        SharedData sharedData2 = sharedData;
        return skuThinScrollDTO.copy(skuThinScrollHeaderDTO, list, skuThinScrollWidth, map, testInfo2, sharedData2);
    }

    /* renamed from: component1, reason: from getter */
    public final SkuThinScrollHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<SkuThinScrollItemDTO> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final SkuThinScrollWidth getWidth() {
        return this.width;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final SharedData getSharedData() {
        return this.sharedData;
    }

    @NotNull
    public final SkuThinScrollDTO copy(SkuThinScrollHeaderDTO header, @NotNull List<SkuThinScrollItemDTO> items, SkuThinScrollWidth width, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new SkuThinScrollDTO(header, items, width, trackingInfo, testInfo, sharedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuThinScrollDTO)) {
            return false;
        }
        SkuThinScrollDTO skuThinScrollDTO = (SkuThinScrollDTO) other;
        return Intrinsics.d(this.header, skuThinScrollDTO.header) && Intrinsics.d(this.items, skuThinScrollDTO.items) && this.width == skuThinScrollDTO.width && Intrinsics.d(this.trackingInfo, skuThinScrollDTO.trackingInfo) && Intrinsics.d(this.testInfo, skuThinScrollDTO.testInfo) && Intrinsics.d(this.sharedData, skuThinScrollDTO.sharedData);
    }

    public final SkuThinScrollHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<SkuThinScrollItemDTO> getItems() {
        return this.items;
    }

    public final SharedData getSharedData() {
        return this.sharedData;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final SkuThinScrollWidth getWidth() {
        return this.width;
    }

    public int hashCode() {
        SkuThinScrollHeaderDTO skuThinScrollHeaderDTO = this.header;
        int b11 = g.b((skuThinScrollHeaderDTO == null ? 0 : skuThinScrollHeaderDTO.hashCode()) * 31, 31, this.items);
        SkuThinScrollWidth skuThinScrollWidth = this.width;
        int hashCode = (b11 + (skuThinScrollWidth == null ? 0 : skuThinScrollWidth.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        SharedData sharedData = this.sharedData;
        return hashCode3 + (sharedData != null ? sharedData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SkuThinScrollDTO(header=" + this.header + ", items=" + this.items + ", width=" + this.width + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ", sharedData=" + this.sharedData + ")";
    }
}
