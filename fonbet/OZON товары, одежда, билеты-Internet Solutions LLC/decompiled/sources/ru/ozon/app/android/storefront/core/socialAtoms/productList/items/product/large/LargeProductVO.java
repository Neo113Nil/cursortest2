package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large;

import G.g;
import N3.C3660k;
import Nh.a;
import Sh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ViewSize;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/large/LargeProductVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "", "image", "price", "originalPrice", "description", "icon", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "badge", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "viewSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getPrice", "getOriginalPrice", "getDescription", "getIcon", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "getBadge", "()Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "getViewSize", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LargeProductVO implements ProductListItemVO {
    private final AtomActionDTO action;
    private final SocialBadgeAtomDTO badge;

    @NotNull
    private final String description;
    private final String icon;

    @NotNull
    private final String image;
    private final String originalPrice;

    @NotNull
    private final String price;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final ViewSize viewSize;

    public LargeProductVO(@NotNull String image, @NotNull String price, String str, @NotNull String description, String str2, SocialBadgeAtomDTO socialBadgeAtomDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, @NotNull ViewSize viewSize) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(viewSize, "viewSize");
        this.image = image;
        this.price = price;
        this.originalPrice = str;
        this.description = description;
        this.icon = str2;
        this.badge = socialBadgeAtomDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.viewSize = viewSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LargeProductVO)) {
            return false;
        }
        LargeProductVO largeProductVO = (LargeProductVO) other;
        return Intrinsics.d(this.image, largeProductVO.image) && Intrinsics.d(this.price, largeProductVO.price) && Intrinsics.d(this.originalPrice, largeProductVO.originalPrice) && Intrinsics.d(this.description, largeProductVO.description) && Intrinsics.d(this.icon, largeProductVO.icon) && Intrinsics.d(this.badge, largeProductVO.badge) && Intrinsics.d(this.action, largeProductVO.action) && Intrinsics.d(this.trackingInfo, largeProductVO.trackingInfo) && Intrinsics.d(this.testInfo, largeProductVO.testInfo) && this.viewSize == largeProductVO.viewSize;
    }

    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO
    public AtomActionDTO getAction() {
        return this.action;
    }

    public final SocialBadgeAtomDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.image.hashCode() * 31, 31, this.price);
        String str = this.originalPrice;
        int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
        String str2 = this.icon;
        int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SocialBadgeAtomDTO socialBadgeAtomDTO = this.badge;
        int hashCode2 = (hashCode + (socialBadgeAtomDTO == null ? 0 : socialBadgeAtomDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return this.viewSize.hashCode() + ((hashCode4 + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.price;
        String str3 = this.originalPrice;
        String str4 = this.description;
        String str5 = this.icon;
        SocialBadgeAtomDTO socialBadgeAtomDTO = this.badge;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        ViewSize viewSize = this.viewSize;
        StringBuilder d11 = C3660k.d("LargeProductVO(image=", str, ", price=", str2, ", originalPrice=");
        a.h(d11, str3, ", description=", str4, ", icon=");
        d11.append(str5);
        d11.append(", badge=");
        d11.append(socialBadgeAtomDTO);
        d11.append(", action=");
        b.f(d11, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
        d11.append(testInfo);
        d11.append(", viewSize=");
        d11.append(viewSize);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ LargeProductVO(String str, String str2, String str3, String str4, String str5, SocialBadgeAtomDTO socialBadgeAtomDTO, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, ViewSize viewSize, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : socialBadgeAtomDTO, (i11 & 64) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map, (i11 & 256) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ViewSize.SMALL : viewSize);
    }
}
