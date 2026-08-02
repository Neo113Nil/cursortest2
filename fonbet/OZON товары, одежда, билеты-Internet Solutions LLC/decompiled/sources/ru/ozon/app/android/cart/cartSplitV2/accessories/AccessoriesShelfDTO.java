package ru.ozon.app.android.cart.cartSplitV2.accessories;

import G.g;
import Pk0.h;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesShelfDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesHeaderDTO;", "items", "", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemDTO;", "width", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemWidth;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesHeaderDTO;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemWidth;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getHeader", "()Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesHeaderDTO;", "getItems", "()Ljava/util/List;", "getWidth", "()Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemWidth;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AccessoriesShelfDTO {
    public static final int $stable = 8;
    private final AccessoriesHeaderDTO header;

    @NotNull
    private final List<AccessoriesItemDTO> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final AccessoriesItemWidth width;

    public AccessoriesShelfDTO(AccessoriesHeaderDTO accessoriesHeaderDTO, @NotNull List<AccessoriesItemDTO> items, AccessoriesItemWidth accessoriesItemWidth, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = accessoriesHeaderDTO;
        this.items = items;
        this.width = accessoriesItemWidth;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ AccessoriesShelfDTO copy$default(AccessoriesShelfDTO accessoriesShelfDTO, AccessoriesHeaderDTO accessoriesHeaderDTO, List list, AccessoriesItemWidth accessoriesItemWidth, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accessoriesHeaderDTO = accessoriesShelfDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = accessoriesShelfDTO.items;
        }
        if ((i11 & 4) != 0) {
            accessoriesItemWidth = accessoriesShelfDTO.width;
        }
        if ((i11 & 8) != 0) {
            map = accessoriesShelfDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            testInfo = accessoriesShelfDTO.testInfo;
        }
        TestInfo testInfo2 = testInfo;
        AccessoriesItemWidth accessoriesItemWidth2 = accessoriesItemWidth;
        return accessoriesShelfDTO.copy(accessoriesHeaderDTO, list, accessoriesItemWidth2, map, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final AccessoriesHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<AccessoriesItemDTO> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final AccessoriesItemWidth getWidth() {
        return this.width;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final AccessoriesShelfDTO copy(AccessoriesHeaderDTO header, @NotNull List<AccessoriesItemDTO> items, AccessoriesItemWidth width, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AccessoriesShelfDTO(header, items, width, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoriesShelfDTO)) {
            return false;
        }
        AccessoriesShelfDTO accessoriesShelfDTO = (AccessoriesShelfDTO) other;
        return Intrinsics.d(this.header, accessoriesShelfDTO.header) && Intrinsics.d(this.items, accessoriesShelfDTO.items) && this.width == accessoriesShelfDTO.width && Intrinsics.d(this.trackingInfo, accessoriesShelfDTO.trackingInfo) && Intrinsics.d(this.testInfo, accessoriesShelfDTO.testInfo);
    }

    public final AccessoriesHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<AccessoriesItemDTO> getItems() {
        return this.items;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final AccessoriesItemWidth getWidth() {
        return this.width;
    }

    public int hashCode() {
        AccessoriesHeaderDTO accessoriesHeaderDTO = this.header;
        int b11 = g.b((accessoriesHeaderDTO == null ? 0 : accessoriesHeaderDTO.hashCode()) * 31, 31, this.items);
        AccessoriesItemWidth accessoriesItemWidth = this.width;
        int hashCode = (b11 + (accessoriesItemWidth == null ? 0 : accessoriesItemWidth.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AccessoriesHeaderDTO accessoriesHeaderDTO = this.header;
        List<AccessoriesItemDTO> list = this.items;
        AccessoriesItemWidth accessoriesItemWidth = this.width;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("AccessoriesShelfDTO(header=");
        sb2.append(accessoriesHeaderDTO);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", width=");
        sb2.append(accessoriesItemWidth);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }
}
