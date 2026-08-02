package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts;

import G.g;
import N3.C3660k;
import Ns.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ViewSize;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/AllProductsVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "productsCount", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "viewSize", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getProductsCount", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "getViewSize", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AllProductsVO implements ProductListItemVO {
    private final AtomActionDTO action;

    @NotNull
    private final String productsCount;
    private final TestInfo testInfo;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final ViewSize viewSize;

    public AllProductsVO(@NotNull String title, @NotNull String productsCount, @NotNull ViewSize viewSize, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(productsCount, "productsCount");
        Intrinsics.checkNotNullParameter(viewSize, "viewSize");
        this.title = title;
        this.productsCount = productsCount;
        this.viewSize = viewSize;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllProductsVO)) {
            return false;
        }
        AllProductsVO allProductsVO = (AllProductsVO) other;
        return Intrinsics.d(this.title, allProductsVO.title) && Intrinsics.d(this.productsCount, allProductsVO.productsCount) && this.viewSize == allProductsVO.viewSize && Intrinsics.d(this.action, allProductsVO.action) && Intrinsics.d(this.trackingInfo, allProductsVO.trackingInfo) && Intrinsics.d(this.testInfo, allProductsVO.testInfo);
    }

    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO
    public AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getProductsCount() {
        return this.productsCount;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public ViewSize getViewSize() {
        return this.viewSize;
    }

    public int hashCode() {
        int hashCode = (this.viewSize.hashCode() + g.a(this.title.hashCode() * 31, 31, this.productsCount)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.productsCount;
        ViewSize viewSize = this.viewSize;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder d11 = C3660k.d("AllProductsVO(title=", str, ", productsCount=", str2, ", viewSize=");
        d11.append(viewSize);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", trackingInfo=");
        return b.b(", testInfo=", ")", d11, map, testInfo);
    }
}
