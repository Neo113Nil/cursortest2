package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.domain;

import G.g;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003!\"#B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;", "items", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTrackingInfo", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "LWZ/t;", "getViewTrackingInfo", "()LWZ/t;", "ProductSplitVO", "ImagesPlacementType", "ImageVO", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutProductsVO implements c {
    private final long id;

    @NotNull
    private final List<ProductSplitVO> items;
    private final t viewTrackingInfo;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO;", "", "<init>", "()V", "CheckoutIconVO", "CheckoutProductMediaVO", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO$CheckoutIconVO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO$CheckoutProductMediaVO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ImageVO {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO$CheckoutIconVO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckoutIconVO extends ImageVO {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO icon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutIconVO(@NotNull IconDTO icon) {
                super(null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutIconVO) && Intrinsics.d(this.icon, ((CheckoutIconVO) other).icon);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            public int hashCode() {
                return this.icon.hashCode();
            }

            @NotNull
            public String toString() {
                return "CheckoutIconVO(icon=" + this.icon + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO$CheckoutProductMediaVO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "productMedia", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "getProductMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckoutProductMediaVO extends ImageVO {

            @NotNull
            private final ProductMediaVO productMedia;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutProductMediaVO(@NotNull ProductMediaVO productMedia) {
                super(null);
                Intrinsics.checkNotNullParameter(productMedia, "productMedia");
                this.productMedia = productMedia;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutProductMediaVO) && Intrinsics.d(this.productMedia, ((CheckoutProductMediaVO) other).productMedia);
            }

            @NotNull
            public final ProductMediaVO getProductMedia() {
                return this.productMedia;
            }

            public int hashCode() {
                return this.productMedia.hashCode();
            }

            @NotNull
            public String toString() {
                return "CheckoutProductMediaVO(productMedia=" + this.productMedia + ")";
            }
        }

        public /* synthetic */ ImageVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ImageVO() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_IMAGE", "TWO_IMAGES", "THREE_IMAGES", "THREE_IMAGES_ICON", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImagesPlacementType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ImagesPlacementType[] $VALUES;
        public static final ImagesPlacementType SINGLE_IMAGE = new ImagesPlacementType("SINGLE_IMAGE", 0);
        public static final ImagesPlacementType TWO_IMAGES = new ImagesPlacementType("TWO_IMAGES", 1);
        public static final ImagesPlacementType THREE_IMAGES = new ImagesPlacementType("THREE_IMAGES", 2);
        public static final ImagesPlacementType THREE_IMAGES_ICON = new ImagesPlacementType("THREE_IMAGES_ICON", 3);

        private static final /* synthetic */ ImagesPlacementType[] $values() {
            return new ImagesPlacementType[]{SINGLE_IMAGE, TWO_IMAGES, THREE_IMAGES, THREE_IMAGES_ICON};
        }

        static {
            ImagesPlacementType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ImagesPlacementType(String str, int i11) {
        }

        public static ImagesPlacementType valueOf(String str) {
            return (ImagesPlacementType) Enum.valueOf(ImagesPlacementType.class, str);
        }

        public static ImagesPlacementType[] values() {
            return (ImagesPlacementType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO;", "images", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;", "imagesPlacementType", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;", "getImagesPlacementType", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductSplitVO {
        private final AtomAction clickAction;

        @NotNull
        private final List<ImageVO> images;

        @NotNull
        private final ImagesPlacementType imagesPlacementType;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t trackingInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public ProductSplitVO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<? extends ImageVO> images, t tVar, AtomAction atomAction, @NotNull ImagesPlacementType imagesPlacementType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(imagesPlacementType, "imagesPlacementType");
            this.title = title;
            this.subtitle = subtitle;
            this.images = images;
            this.trackingInfo = tVar;
            this.clickAction = atomAction;
            this.imagesPlacementType = imagesPlacementType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductSplitVO)) {
                return false;
            }
            ProductSplitVO productSplitVO = (ProductSplitVO) other;
            return Intrinsics.d(this.title, productSplitVO.title) && Intrinsics.d(this.subtitle, productSplitVO.subtitle) && Intrinsics.d(this.images, productSplitVO.images) && Intrinsics.d(this.trackingInfo, productSplitVO.trackingInfo) && Intrinsics.d(this.clickAction, productSplitVO.clickAction) && this.imagesPlacementType == productSplitVO.imagesPlacementType;
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final List<ImageVO> getImages() {
            return this.images;
        }

        @NotNull
        public final ImagesPlacementType getImagesPlacementType() {
            return this.imagesPlacementType;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = g.b(Ns.b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.images);
            t tVar = this.trackingInfo;
            int hashCode = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            AtomAction atomAction = this.clickAction;
            return this.imagesPlacementType.hashCode() + ((hashCode + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            List<ImageVO> list = this.images;
            t tVar = this.trackingInfo;
            AtomAction atomAction = this.clickAction;
            ImagesPlacementType imagesPlacementType = this.imagesPlacementType;
            StringBuilder g10 = D3.g.g("ProductSplitVO(title=", textDTO, ", subtitle=", textDTO2, ", images=");
            g10.append(list);
            g10.append(", trackingInfo=");
            g10.append(tVar);
            g10.append(", clickAction=");
            g10.append(atomAction);
            g10.append(", imagesPlacementType=");
            g10.append(imagesPlacementType);
            g10.append(")");
            return g10.toString();
        }
    }

    public CheckoutProductsVO(long j11, @NotNull List<ProductSplitVO> items, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.viewTrackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutProductsVO)) {
            return false;
        }
        CheckoutProductsVO checkoutProductsVO = (CheckoutProductsVO) other;
        return this.id == checkoutProductsVO.id && Intrinsics.d(this.items, checkoutProductsVO.items) && Intrinsics.d(this.viewTrackingInfo, checkoutProductsVO.viewTrackingInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ProductSplitVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        t tVar = this.viewTrackingInfo;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ProductSplitVO> list = this.items;
        return Lh.a.b(Lh.b.b(j11, "CheckoutProductsVO(id=", ", items=", list), ", viewTrackingInfo=", this.viewTrackingInfo, ")");
    }
}
