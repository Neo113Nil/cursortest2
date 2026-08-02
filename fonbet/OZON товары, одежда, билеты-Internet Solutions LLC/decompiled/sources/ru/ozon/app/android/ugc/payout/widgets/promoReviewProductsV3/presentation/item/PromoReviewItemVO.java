package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import Ak.C2436a;
import B90.C2616s;
import G.g;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003EFGBu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", DynamicElementDTO.TIMER, "", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$PointVO;", "points", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "reviewButton", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "pointsCell", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "topPaddingCell", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightBottomIcon", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;", "getProduct", "()Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "getTimer", "()Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getReviewButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPointsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/Integer;", "getTopPaddingCell", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightBottomIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "ProductVO", "TimerVO", "PointVO", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoReviewItemVO implements c {
    private final AtomAction action;

    @NotNull
    private final String backgroundColor;
    private final long id;
    private final List<PointVO> points;
    private final CellDTO pointsCell;

    @NotNull
    private final ProductVO product;
    private final ButtonV3DTO reviewButton;
    private final IconDTO rightBottomIcon;
    private final TimerVO timer;
    private final t tokenizedEvent;
    private final Integer topPaddingCell;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$PointVO;", "", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icons", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointVO {

        @NotNull
        private final List<IconDTO> icons;

        @NotNull
        private final TextDTO title;

        public PointVO(@NotNull List<IconDTO> icons, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(icons, "icons");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icons = icons;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointVO)) {
                return false;
            }
            PointVO pointVO = (PointVO) other;
            return Intrinsics.d(this.icons, pointVO.icons) && Intrinsics.d(this.title, pointVO.title);
        }

        @NotNull
        public final List<IconDTO> getIcons() {
            return this.icons;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.icons.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PointVO(icons=" + this.icons + ", title=" + this.title + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductVO {
        private final AtomAction action;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;

        public ProductVO(@NotNull ImageDTO image, @NotNull TextDTO title, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.title = title;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductVO)) {
                return false;
            }
            ProductVO productVO = (ProductVO) other;
            return Intrinsics.d(this.image, productVO.image) && Intrinsics.d(this.title, productVO.title) && Intrinsics.d(this.action, productVO.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.image.hashCode() * 31, 31);
            AtomAction atomAction = this.action;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            return B6.b.b(C2616s.d("ProductVO(image=", imageDTO, ", title=", textDTO, ", action="), this.action, ")");
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", DynamicElementDTO.TIMER, "Lorg/joda/time/DateTime;", "serverTime", "startTime", "endTime", "", "timeDelta", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JLjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimer", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lorg/joda/time/DateTime;", "getServerTime", "()Lorg/joda/time/DateTime;", "getStartTime", "getEndTime", "J", "getTimeDelta", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerVO {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final CornerRadius cornerRadius;

        @NotNull
        private final DateTime endTime;

        @NotNull
        private final DateTime serverTime;

        @NotNull
        private final DateTime startTime;
        private final long timeDelta;

        @NotNull
        private final TextDTO timer;

        public TimerVO(@NotNull TextDTO timer, @NotNull DateTime serverTime, @NotNull DateTime startTime, @NotNull DateTime endTime, long j11, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            Intrinsics.checkNotNullParameter(serverTime, "serverTime");
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.timer = timer;
            this.serverTime = serverTime;
            this.startTime = startTime;
            this.endTime = endTime;
            this.timeDelta = j11;
            this.backgroundColor = backgroundColor;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ TimerVO copy$default(TimerVO timerVO, TextDTO textDTO, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, long j11, String str, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = timerVO.timer;
            }
            if ((i11 & 2) != 0) {
                dateTime = timerVO.serverTime;
            }
            if ((i11 & 4) != 0) {
                dateTime2 = timerVO.startTime;
            }
            if ((i11 & 8) != 0) {
                dateTime3 = timerVO.endTime;
            }
            if ((i11 & 16) != 0) {
                j11 = timerVO.timeDelta;
            }
            if ((i11 & 32) != 0) {
                str = timerVO.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                cornerRadius = timerVO.cornerRadius;
            }
            long j12 = j11;
            DateTime dateTime4 = dateTime2;
            DateTime dateTime5 = dateTime3;
            return timerVO.copy(textDTO, dateTime, dateTime4, dateTime5, j12, str, cornerRadius);
        }

        @NotNull
        public final TimerVO copy(@NotNull TextDTO timer, @NotNull DateTime serverTime, @NotNull DateTime startTime, @NotNull DateTime endTime, long timeDelta, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            Intrinsics.checkNotNullParameter(serverTime, "serverTime");
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new TimerVO(timer, serverTime, startTime, endTime, timeDelta, backgroundColor, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerVO)) {
                return false;
            }
            TimerVO timerVO = (TimerVO) other;
            return Intrinsics.d(this.timer, timerVO.timer) && Intrinsics.d(this.serverTime, timerVO.serverTime) && Intrinsics.d(this.startTime, timerVO.startTime) && Intrinsics.d(this.endTime, timerVO.endTime) && this.timeDelta == timerVO.timeDelta && Intrinsics.d(this.backgroundColor, timerVO.backgroundColor) && this.cornerRadius == timerVO.cornerRadius;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final DateTime getEndTime() {
            return this.endTime;
        }

        public final long getTimeDelta() {
            return this.timeDelta;
        }

        @NotNull
        public final TextDTO getTimer() {
            return this.timer;
        }

        public int hashCode() {
            return this.cornerRadius.hashCode() + g.a(Pk0.c.a(GR.b.a(this.endTime, GR.b.a(this.startTime, GR.b.a(this.serverTime, this.timer.hashCode() * 31, 31), 31), 31), 31, this.timeDelta), 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            return "TimerVO(timer=" + this.timer + ", serverTime=" + this.serverTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", timeDelta=" + this.timeDelta + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ")";
        }
    }

    public PromoReviewItemVO(long j11, @NotNull String backgroundColor, @NotNull ProductVO product, TimerVO timerVO, List<PointVO> list, ButtonV3DTO buttonV3DTO, CellDTO cellDTO, AtomAction atomAction, t tVar, Integer num, IconDTO iconDTO) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(product, "product");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.product = product;
        this.timer = timerVO;
        this.points = list;
        this.reviewButton = buttonV3DTO;
        this.pointsCell = cellDTO;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.topPaddingCell = num;
        this.rightBottomIcon = iconDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoReviewItemVO)) {
            return false;
        }
        PromoReviewItemVO promoReviewItemVO = (PromoReviewItemVO) other;
        return this.id == promoReviewItemVO.id && Intrinsics.d(this.backgroundColor, promoReviewItemVO.backgroundColor) && Intrinsics.d(this.product, promoReviewItemVO.product) && Intrinsics.d(this.timer, promoReviewItemVO.timer) && Intrinsics.d(this.points, promoReviewItemVO.points) && Intrinsics.d(this.reviewButton, promoReviewItemVO.reviewButton) && Intrinsics.d(this.pointsCell, promoReviewItemVO.pointsCell) && Intrinsics.d(this.action, promoReviewItemVO.action) && Intrinsics.d(this.tokenizedEvent, promoReviewItemVO.tokenizedEvent) && Intrinsics.d(this.topPaddingCell, promoReviewItemVO.topPaddingCell) && Intrinsics.d(this.rightBottomIcon, promoReviewItemVO.rightBottomIcon);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<PointVO> getPoints() {
        return this.points;
    }

    public final CellDTO getPointsCell() {
        return this.pointsCell;
    }

    @NotNull
    public final ProductVO getProduct() {
        return this.product;
    }

    public final ButtonV3DTO getReviewButton() {
        return this.reviewButton;
    }

    public final IconDTO getRightBottomIcon() {
        return this.rightBottomIcon;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TimerVO getTimer() {
        return this.timer;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Integer getTopPaddingCell() {
        return this.topPaddingCell;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.product.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor)) * 31;
        TimerVO timerVO = this.timer;
        int hashCode2 = (hashCode + (timerVO == null ? 0 : timerVO.hashCode())) * 31;
        List<PointVO> list = this.points;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.reviewButton;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        CellDTO cellDTO = this.pointsCell;
        int hashCode5 = (hashCode4 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Integer num = this.topPaddingCell;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        IconDTO iconDTO = this.rightBottomIcon;
        return hashCode8 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        ProductVO productVO = this.product;
        TimerVO timerVO = this.timer;
        List<PointVO> list = this.points;
        ButtonV3DTO buttonV3DTO = this.reviewButton;
        CellDTO cellDTO = this.pointsCell;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        Integer num = this.topPaddingCell;
        IconDTO iconDTO = this.rightBottomIcon;
        StringBuilder c11 = C2436a.c(j11, "PromoReviewItemVO(id=", ", backgroundColor=", str);
        c11.append(", product=");
        c11.append(productVO);
        c11.append(", timer=");
        c11.append(timerVO);
        c11.append(", points=");
        c11.append(list);
        c11.append(", reviewButton=");
        c11.append(buttonV3DTO);
        c11.append(", pointsCell=");
        c11.append(cellDTO);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", topPaddingCell=");
        c11.append(num);
        c11.append(", rightBottomIcon=");
        c11.append(iconDTO);
        c11.append(")");
        return c11.toString();
    }
}
