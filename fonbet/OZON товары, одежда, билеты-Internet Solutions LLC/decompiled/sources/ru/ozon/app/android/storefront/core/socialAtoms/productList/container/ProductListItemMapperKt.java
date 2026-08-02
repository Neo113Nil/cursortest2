package ru.ozon.app.android.storefront.core.socialAtoms.productList.container;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ViewSize;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.AllProductsVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon.CouponVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large.LargeProductVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.small.SmallProductVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.service.ServiceVO;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\f"}, d2 = {"toVo", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/AllProductsVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$AllProductsDTO;", "size", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "toVO", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$CouponDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/service/ServiceVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$ServiceDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$ProductDTO;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductListItemMapperKt {
    @NotNull
    public static final CouponVO toVO(@NotNull SocialProductListDTO.ProductListItemDTO.CouponDTO couponDTO) {
        Intrinsics.checkNotNullParameter(couponDTO, "<this>");
        return new CouponVO(couponDTO.getId(), couponDTO.getStackType(), couponDTO.getTitle(), couponDTO.getSubtitle(), couponDTO.getAction(), couponDTO.getTrackingInfo(), couponDTO.getTestInfo(), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @NotNull
    public static final AllProductsVO toVo(@NotNull SocialProductListDTO.ProductListItemDTO.AllProductsDTO allProductsDTO, @NotNull ViewSize size) {
        Intrinsics.checkNotNullParameter(allProductsDTO, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        ViewSize viewSize = ViewSize.LARGE;
        return size == viewSize ? new AllProductsVO(allProductsDTO.getTitle(), allProductsDTO.getProductsCount(), viewSize, allProductsDTO.getAction(), allProductsDTO.getTrackingInfo(), allProductsDTO.getTestInfo()) : new AllProductsVO(allProductsDTO.getShortTitle(), allProductsDTO.getProductsCount(), ViewSize.SMALL, allProductsDTO.getAction(), allProductsDTO.getTrackingInfo(), allProductsDTO.getTestInfo());
    }

    @NotNull
    public static final ServiceVO toVO(@NotNull SocialProductListDTO.ProductListItemDTO.ServiceDTO serviceDTO, @NotNull ViewSize size) {
        Intrinsics.checkNotNullParameter(serviceDTO, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        return new ServiceVO(serviceDTO.getImage(), serviceDTO.getTitle(), serviceDTO.getDescription(), size, serviceDTO.getAction(), serviceDTO.getTrackingInfo(), serviceDTO.getTestInfo());
    }

    @NotNull
    public static final ProductListItemVO toVo(@NotNull SocialProductListDTO.ProductListItemDTO.ProductDTO productDTO, @NotNull ViewSize size) {
        Intrinsics.checkNotNullParameter(productDTO, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        if (size == ViewSize.LARGE) {
            return new LargeProductVO(productDTO.getImage(), productDTO.getPrice(), productDTO.getOriginalPrice(), productDTO.getDescription(), productDTO.getIcon(), productDTO.getBadge(), productDTO.getAction(), productDTO.getTrackingInfo(), productDTO.getTestInfo(), null, UserVerificationMethods.USER_VERIFY_NONE, null);
        }
        return new SmallProductVO(productDTO.getImage(), productDTO.getPrice(), productDTO.getOriginalPrice(), productDTO.getIcon(), productDTO.getAction(), productDTO.getTrackingInfo(), productDTO.getTestInfo(), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }
}
