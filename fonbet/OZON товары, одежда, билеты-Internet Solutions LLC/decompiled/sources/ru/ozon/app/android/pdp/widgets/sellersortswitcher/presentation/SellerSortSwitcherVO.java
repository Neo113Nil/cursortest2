package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation;

import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001 B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO$ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", DynamicElementDTO.TABS, "<init>", "(JLru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO$ProductVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO$ProductVO;", "getProduct", "()Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO$ProductVO;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "ProductVO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerSortSwitcherVO implements c {
    private final long id;
    private final ProductVO product;

    @NotNull
    private final List<TagV3Atom.TagAtom> tabs;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/SellerSortSwitcherVO$ProductVO;", "", "", "image", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductVO {
        public static final int $stable = OzonSpannableString.$stable;

        @NotNull
        private final String image;

        @NotNull
        private final OzonSpannableString title;

        public ProductVO(@NotNull String image, @NotNull OzonSpannableString title) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductVO)) {
                return false;
            }
            ProductVO productVO = (ProductVO) other;
            return Intrinsics.d(this.image, productVO.image) && Intrinsics.d(this.title, productVO.title);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.image.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ProductVO(image=" + this.image + ", title=" + ((Object) this.title) + ")";
        }
    }

    public SellerSortSwitcherVO(long j11, ProductVO productVO, @NotNull List<TagV3Atom.TagAtom> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.product = productVO;
        this.tabs = tabs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerSortSwitcherVO)) {
            return false;
        }
        SellerSortSwitcherVO sellerSortSwitcherVO = (SellerSortSwitcherVO) other;
        return this.id == sellerSortSwitcherVO.id && Intrinsics.d(this.product, sellerSortSwitcherVO.product) && Intrinsics.d(this.tabs, sellerSortSwitcherVO.tabs);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ProductVO getProduct() {
        return this.product;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> getTabs() {
        return this.tabs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ProductVO productVO = this.product;
        return this.tabs.hashCode() + ((hashCode + (productVO == null ? 0 : productVO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ProductVO productVO = this.product;
        List<TagV3Atom.TagAtom> list = this.tabs;
        StringBuilder sb2 = new StringBuilder("SellerSortSwitcherVO(id=");
        sb2.append(j11);
        sb2.append(", product=");
        sb2.append(productVO);
        return h.c(sb2, ", tabs=", list, ")");
    }
}
