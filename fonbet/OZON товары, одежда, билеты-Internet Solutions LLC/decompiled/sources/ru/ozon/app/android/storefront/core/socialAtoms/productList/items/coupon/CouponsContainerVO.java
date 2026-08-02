package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ViewSize;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponsContainerVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponVO;", "coupons", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "viewSize", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCoupons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "getViewSize", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CouponsContainerVO implements ProductListItemVO {
    private final AtomActionDTO action;

    @NotNull
    private final List<CouponVO> coupons;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final ViewSize viewSize;

    public CouponsContainerVO(@NotNull List<CouponVO> coupons, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, @NotNull ViewSize viewSize) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        Intrinsics.checkNotNullParameter(viewSize, "viewSize");
        this.coupons = coupons;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.viewSize = viewSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponsContainerVO)) {
            return false;
        }
        CouponsContainerVO couponsContainerVO = (CouponsContainerVO) other;
        return Intrinsics.d(this.coupons, couponsContainerVO.coupons) && Intrinsics.d(this.action, couponsContainerVO.action) && Intrinsics.d(this.trackingInfo, couponsContainerVO.trackingInfo) && Intrinsics.d(this.testInfo, couponsContainerVO.testInfo) && this.viewSize == couponsContainerVO.viewSize;
    }

    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO
    public AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final List<CouponVO> getCoupons() {
        return this.coupons;
    }

    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.coupons.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return this.viewSize.hashCode() + ((hashCode3 + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "CouponsContainerVO(coupons=" + this.coupons + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ", viewSize=" + this.viewSize + ")";
    }

    public /* synthetic */ CouponsContainerVO(List list, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, ViewSize viewSize, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? ViewSize.LARGE : viewSize);
    }
}
