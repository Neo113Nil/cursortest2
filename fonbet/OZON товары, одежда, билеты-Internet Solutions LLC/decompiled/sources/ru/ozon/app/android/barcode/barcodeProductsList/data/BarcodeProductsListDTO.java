package ru.ozon.app.android.barcode.barcodeProductsList.data;

import G.g;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/data/BarcodeProductsListDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "items", "", "Lru/ozon/app/android/barcode/barcodeProductsList/data/ItemDTO;", "backgroundColor", "", "verticalPadding", "Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getItems", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getVerticalPadding", "()Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeProductsListDTO {
    private final String backgroundColor;

    @NotNull
    private final CellDTO header;

    @NotNull
    private final List<ItemDTO> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final VerticalPaddingDTO verticalPadding;

    public BarcodeProductsListDTO(@NotNull CellDTO header, @NotNull List<ItemDTO> items, String str, @NotNull VerticalPaddingDTO verticalPadding, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        this.header = header;
        this.items = items;
        this.backgroundColor = str;
        this.verticalPadding = verticalPadding;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ BarcodeProductsListDTO copy$default(BarcodeProductsListDTO barcodeProductsListDTO, CellDTO cellDTO, List list, String str, VerticalPaddingDTO verticalPaddingDTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = barcodeProductsListDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = barcodeProductsListDTO.items;
        }
        if ((i11 & 4) != 0) {
            str = barcodeProductsListDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            verticalPaddingDTO = barcodeProductsListDTO.verticalPadding;
        }
        if ((i11 & 16) != 0) {
            map = barcodeProductsListDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            testInfo = barcodeProductsListDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        return barcodeProductsListDTO.copy(cellDTO, list, str, verticalPaddingDTO, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<ItemDTO> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final VerticalPaddingDTO getVerticalPadding() {
        return this.verticalPadding;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final BarcodeProductsListDTO copy(@NotNull CellDTO header, @NotNull List<ItemDTO> items, String backgroundColor, @NotNull VerticalPaddingDTO verticalPadding, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        return new BarcodeProductsListDTO(header, items, backgroundColor, verticalPadding, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeProductsListDTO)) {
            return false;
        }
        BarcodeProductsListDTO barcodeProductsListDTO = (BarcodeProductsListDTO) other;
        return Intrinsics.d(this.header, barcodeProductsListDTO.header) && Intrinsics.d(this.items, barcodeProductsListDTO.items) && Intrinsics.d(this.backgroundColor, barcodeProductsListDTO.backgroundColor) && Intrinsics.d(this.verticalPadding, barcodeProductsListDTO.verticalPadding) && Intrinsics.d(this.trackingInfo, barcodeProductsListDTO.trackingInfo) && Intrinsics.d(this.testInfo, barcodeProductsListDTO.testInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getHeader() {
        return this.header;
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

    @NotNull
    public final VerticalPaddingDTO getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int b11 = g.b(this.header.hashCode() * 31, 31, this.items);
        String str = this.backgroundColor;
        int hashCode = (this.verticalPadding.hashCode() + ((b11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.header;
        List<ItemDTO> list = this.items;
        String str = this.backgroundColor;
        VerticalPaddingDTO verticalPaddingDTO = this.verticalPadding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("BarcodeProductsListDTO(header=");
        sb2.append(cellDTO);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", verticalPadding=");
        sb2.append(verticalPaddingDTO);
        sb2.append(", trackingInfo=");
        return b.b(", testInfo=", ")", sb2, map, testInfo);
    }
}
