package ru.ozon.app.android.ugc.widgets.productsforreview.presentation;

import D40.a;
import G.g;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00015BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b\n\u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "", "rateDeeplink", "", "isFirst", "isLast", "Lru/ozon/uni/atoms/af/AtomAction;", "productTapAction", "Lru/ozon/uni/atoms/af/AtomAction$Move;", "rateTapAction", "LWZ/t;", "viewEvent", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;", "hideButton", "<init>", "(JLru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO;Ljava/lang/String;ZZLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction$Move;LWZ/t;Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO;", "getProduct", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO;", "Ljava/lang/String;", "getRateDeeplink", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getProductTapAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/af/AtomAction$Move;", "getRateTapAction", "()Lru/ozon/uni/atoms/af/AtomAction$Move;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;", "getHideButton", "()Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;", "HideButtonVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductForReviewVO implements c {
    private final HideButtonVO hideButton;
    private final long id;
    private final boolean isFirst;
    private final boolean isLast;

    @NotNull
    private final ReviewProductVO product;
    private final AtomAction productTapAction;

    @NotNull
    private final String rateDeeplink;

    @NotNull
    private final AtomAction.Move rateTapAction;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductForReviewVO$HideButtonVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleWidth", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getTitleWidth", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideButtonVO {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO title;
        private final int titleWidth;

        public HideButtonVO(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO title, int i11) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(title, "title");
            this.iconButton = iconButton;
            this.title = title;
            this.titleWidth = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideButtonVO)) {
                return false;
            }
            HideButtonVO hideButtonVO = (HideButtonVO) other;
            return Intrinsics.d(this.iconButton, hideButtonVO.iconButton) && Intrinsics.d(this.title, hideButtonVO.title) && this.titleWidth == hideButtonVO.titleWidth;
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final int getTitleWidth() {
            return this.titleWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.titleWidth) + b.a(this.title, this.iconButton.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            TextDTO textDTO = this.title;
            int i11 = this.titleWidth;
            StringBuilder sb2 = new StringBuilder("HideButtonVO(iconButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", titleWidth=");
            return K00.b.e(i11, ")", sb2);
        }
    }

    public ProductForReviewVO(long j11, @NotNull ReviewProductVO product, @NotNull String rateDeeplink, boolean z11, boolean z12, AtomAction atomAction, @NotNull AtomAction.Move rateTapAction, t tVar, HideButtonVO hideButtonVO) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(rateDeeplink, "rateDeeplink");
        Intrinsics.checkNotNullParameter(rateTapAction, "rateTapAction");
        this.id = j11;
        this.product = product;
        this.rateDeeplink = rateDeeplink;
        this.isFirst = z11;
        this.isLast = z12;
        this.productTapAction = atomAction;
        this.rateTapAction = rateTapAction;
        this.viewEvent = tVar;
        this.hideButton = hideButtonVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductForReviewVO)) {
            return false;
        }
        ProductForReviewVO productForReviewVO = (ProductForReviewVO) other;
        return this.id == productForReviewVO.id && Intrinsics.d(this.product, productForReviewVO.product) && Intrinsics.d(this.rateDeeplink, productForReviewVO.rateDeeplink) && this.isFirst == productForReviewVO.isFirst && this.isLast == productForReviewVO.isLast && Intrinsics.d(this.productTapAction, productForReviewVO.productTapAction) && Intrinsics.d(this.rateTapAction, productForReviewVO.rateTapAction) && Intrinsics.d(this.viewEvent, productForReviewVO.viewEvent) && Intrinsics.d(this.hideButton, productForReviewVO.hideButton);
    }

    public final HideButtonVO getHideButton() {
        return this.hideButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ReviewProductVO getProduct() {
        return this.product;
    }

    public final AtomAction getProductTapAction() {
        return this.productTapAction;
    }

    @NotNull
    public final String getRateDeeplink() {
        return this.rateDeeplink;
    }

    @NotNull
    public final AtomAction.Move getRateTapAction() {
        return this.rateTapAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a(g.a((this.product.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.rateDeeplink), 31, this.isFirst), 31, this.isLast);
        AtomAction atomAction = this.productTapAction;
        int hashCode = (this.rateTapAction.hashCode() + ((a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31)) * 31;
        t tVar = this.viewEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        HideButtonVO hideButtonVO = this.hideButton;
        return hashCode2 + (hideButtonVO != null ? hideButtonVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ReviewProductVO reviewProductVO = this.product;
        String str = this.rateDeeplink;
        boolean z11 = this.isFirst;
        boolean z12 = this.isLast;
        AtomAction atomAction = this.productTapAction;
        AtomAction.Move move = this.rateTapAction;
        t tVar = this.viewEvent;
        HideButtonVO hideButtonVO = this.hideButton;
        StringBuilder sb2 = new StringBuilder("ProductForReviewVO(id=");
        sb2.append(j11);
        sb2.append(", product=");
        sb2.append(reviewProductVO);
        a.g(", rateDeeplink=", str, ", isFirst=", sb2, z11);
        sb2.append(", isLast=");
        sb2.append(z12);
        sb2.append(", productTapAction=");
        sb2.append(atomAction);
        sb2.append(", rateTapAction=");
        sb2.append(move);
        sb2.append(", viewEvent=");
        sb2.append(tVar);
        sb2.append(", hideButton=");
        sb2.append(hideButtonVO);
        sb2.append(")");
        return sb2.toString();
    }
}
