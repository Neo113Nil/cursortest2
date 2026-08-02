package ru.ozon.app.android.checkoutcomposer.splitDetailV2.data;

import Am.C2438a;
import B0.C2454a;
import B90.C2619v;
import H3.c;
import Ih.a;
import J.d;
import Sh.b;
import T7.P;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "horizontal", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType;", "vertical", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHorizontal", "()Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType;", "getVertical", "()Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "HorizontalType", "VerticalType", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SplitDetailV2DTO {
    public static final int $stable = 8;
    private final TextAtom header;
    private final HorizontalType horizontal;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final VerticalType vertical;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType;", "", "splits", "", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType$Split;", "<init>", "(Ljava/util/List;)V", "getSplits", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Split", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class HorizontalType {
        public static final int $stable = 8;

        @NotNull
        private final List<Split> splits;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType$Split;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "carousel", "", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType$Split$ProductImage;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCarousel", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ProductImage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Split {
            public static final int $stable = 8;

            @NotNull
            private final List<ProductImage> carousel;

            @NotNull
            private final TextAtom title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$HorizontalType$Split$ProductImage;", "", "image", "", "promoIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIconPosition", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;)V", "getImage", "()Ljava/lang/String;", "getPromoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ProductImage {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final String image;
                private final IconDTO promoIcon;
                private final PromoIconPosition promoIconPosition;

                public ProductImage(@NotNull String image, IconDTO iconDTO, PromoIconPosition promoIconPosition) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.image = image;
                    this.promoIcon = iconDTO;
                    this.promoIconPosition = promoIconPosition;
                }

                public static /* synthetic */ ProductImage copy$default(ProductImage productImage, String str, IconDTO iconDTO, PromoIconPosition promoIconPosition, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = productImage.image;
                    }
                    if ((i11 & 2) != 0) {
                        iconDTO = productImage.promoIcon;
                    }
                    if ((i11 & 4) != 0) {
                        promoIconPosition = productImage.promoIconPosition;
                    }
                    return productImage.copy(str, iconDTO, promoIconPosition);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                /* renamed from: component2, reason: from getter */
                public final IconDTO getPromoIcon() {
                    return this.promoIcon;
                }

                /* renamed from: component3, reason: from getter */
                public final PromoIconPosition getPromoIconPosition() {
                    return this.promoIconPosition;
                }

                @NotNull
                public final ProductImage copy(@NotNull String image, IconDTO promoIcon, PromoIconPosition promoIconPosition) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    return new ProductImage(image, promoIcon, promoIconPosition);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProductImage)) {
                        return false;
                    }
                    ProductImage productImage = (ProductImage) other;
                    return Intrinsics.d(this.image, productImage.image) && Intrinsics.d(this.promoIcon, productImage.promoIcon) && this.promoIconPosition == productImage.promoIconPosition;
                }

                @NotNull
                public final String getImage() {
                    return this.image;
                }

                public final IconDTO getPromoIcon() {
                    return this.promoIcon;
                }

                public final PromoIconPosition getPromoIconPosition() {
                    return this.promoIconPosition;
                }

                public int hashCode() {
                    int hashCode = this.image.hashCode() * 31;
                    IconDTO iconDTO = this.promoIcon;
                    int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                    PromoIconPosition promoIconPosition = this.promoIconPosition;
                    return hashCode2 + (promoIconPosition != null ? promoIconPosition.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "ProductImage(image=" + this.image + ", promoIcon=" + this.promoIcon + ", promoIconPosition=" + this.promoIconPosition + ")";
                }
            }

            public Split(@NotNull TextAtom title, @NotNull List<ProductImage> carousel) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(carousel, "carousel");
                this.title = title;
                this.carousel = carousel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Split copy$default(Split split, TextAtom textAtom, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = split.title;
                }
                if ((i11 & 2) != 0) {
                    list = split.carousel;
                }
                return split.copy(textAtom, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            public final List<ProductImage> component2() {
                return this.carousel;
            }

            @NotNull
            public final Split copy(@NotNull TextAtom title, @NotNull List<ProductImage> carousel) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(carousel, "carousel");
                return new Split(title, carousel);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Split)) {
                    return false;
                }
                Split split = (Split) other;
                return Intrinsics.d(this.title, split.title) && Intrinsics.d(this.carousel, split.carousel);
            }

            @NotNull
            public final List<ProductImage> getCarousel() {
                return this.carousel;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.carousel.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return d.c("Split(title=", this.title, ", carousel=", this.carousel, ")");
            }
        }

        public HorizontalType(@NotNull List<Split> splits) {
            Intrinsics.checkNotNullParameter(splits, "splits");
            this.splits = splits;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HorizontalType copy$default(HorizontalType horizontalType, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = horizontalType.splits;
            }
            return horizontalType.copy(list);
        }

        @NotNull
        public final List<Split> component1() {
            return this.splits;
        }

        @NotNull
        public final HorizontalType copy(@NotNull List<Split> splits) {
            Intrinsics.checkNotNullParameter(splits, "splits");
            return new HorizontalType(splits);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalType) && Intrinsics.d(this.splits, ((HorizontalType) other).splits);
        }

        @NotNull
        public final List<Split> getSplits() {
            return this.splits;
        }

        public int hashCode() {
            return this.splits.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("HorizontalType(splits=", ")", this.splits);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType;", "", "splits", "", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split;", "settings", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Settings;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Settings;)V", "getSplits", "()Ljava/util/List;", "getSettings", "()Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Settings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Split", "Settings", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class VerticalType {
        public static final int $stable = 8;
        private final Settings settings;

        @NotNull
        private final List<Split> splits;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Settings;", "", "topPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Settings {
            public static final int $stable = 0;
            private final CommonCellSettings.LayoutPadding topPadding;

            public Settings(CommonCellSettings.LayoutPadding layoutPadding) {
                this.topPadding = layoutPadding;
            }

            public static /* synthetic */ Settings copy$default(Settings settings, CommonCellSettings.LayoutPadding layoutPadding, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    layoutPadding = settings.topPadding;
                }
                return settings.copy(layoutPadding);
            }

            /* renamed from: component1, reason: from getter */
            public final CommonCellSettings.LayoutPadding getTopPadding() {
                return this.topPadding;
            }

            @NotNull
            public final Settings copy(CommonCellSettings.LayoutPadding topPadding) {
                return new Settings(topPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Settings) && this.topPadding == ((Settings) other).topPadding;
            }

            public final CommonCellSettings.LayoutPadding getTopPadding() {
                return this.topPadding;
            }

            public int hashCode() {
                CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
                if (layoutPadding == null) {
                    return 0;
                }
                return layoutPadding.hashCode();
            }

            @NotNull
            public String toString() {
                return "Settings(topPadding=" + this.topPadding + ")";
            }
        }

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0095\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006>"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split;", "", "image", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "premiumPrice", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "quantity", "pricePerItem", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "promoIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIconPosition", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "quantityControl", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split$QuantityControl;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split$QuantityControl;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPremiumPrice", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getQuantity", "getPricePerItem", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getPromoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "getQuantityControl", "()Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split$QuantityControl;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "QuantityControl", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Split {
            public static final int $stable = 8;
            private final DisclaimerAtom annotation;

            @NotNull
            private final String image;
            private final Price premiumPrice;
            private final Price price;
            private final TextAtom pricePerItem;
            private final IconDTO promoIcon;
            private final PromoIconPosition promoIconPosition;
            private final TextAtom quantity;
            private final QuantityControl quantityControl;

            @NotNull
            private final TextAtom title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003Jr\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split$QuantityControl;", "", "minimum", "", "maximum", "current", "debounceDelay", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "incrementTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "decrementTrackingInfo", "<init>", "(IIILjava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)V", "getMinimum", "()I", "getMaximum", "getCurrent", "getDebounceDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getIncrementTrackingInfo", "()Ljava/util/Map;", "getDecrementTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IIILjava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO$VerticalType$Split$QuantityControl;", "equals", "", "other", "hashCode", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class QuantityControl {
                public static final int $stable = 8;

                @NotNull
                private final AtomActionDTO action;
                private final int current;
                private final Integer debounceDelay;
                private final Map<String, TokenizedTrackingInfo> decrementTrackingInfo;
                private final Map<String, TokenizedTrackingInfo> incrementTrackingInfo;
                private final int maximum;
                private final int minimum;

                public QuantityControl(int i11, int i12, int i13, Integer num, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.minimum = i11;
                    this.maximum = i12;
                    this.current = i13;
                    this.debounceDelay = num;
                    this.action = action;
                    this.incrementTrackingInfo = map;
                    this.decrementTrackingInfo = map2;
                }

                public static /* synthetic */ QuantityControl copy$default(QuantityControl quantityControl, int i11, int i12, int i13, Integer num, AtomActionDTO atomActionDTO, Map map, Map map2, int i14, Object obj) {
                    if ((i14 & 1) != 0) {
                        i11 = quantityControl.minimum;
                    }
                    if ((i14 & 2) != 0) {
                        i12 = quantityControl.maximum;
                    }
                    if ((i14 & 4) != 0) {
                        i13 = quantityControl.current;
                    }
                    if ((i14 & 8) != 0) {
                        num = quantityControl.debounceDelay;
                    }
                    if ((i14 & 16) != 0) {
                        atomActionDTO = quantityControl.action;
                    }
                    if ((i14 & 32) != 0) {
                        map = quantityControl.incrementTrackingInfo;
                    }
                    if ((i14 & 64) != 0) {
                        map2 = quantityControl.decrementTrackingInfo;
                    }
                    Map map3 = map;
                    Map map4 = map2;
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    int i15 = i13;
                    return quantityControl.copy(i11, i12, i15, num, atomActionDTO2, map3, map4);
                }

                /* renamed from: component1, reason: from getter */
                public final int getMinimum() {
                    return this.minimum;
                }

                /* renamed from: component2, reason: from getter */
                public final int getMaximum() {
                    return this.maximum;
                }

                /* renamed from: component3, reason: from getter */
                public final int getCurrent() {
                    return this.current;
                }

                /* renamed from: component4, reason: from getter */
                public final Integer getDebounceDelay() {
                    return this.debounceDelay;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component6() {
                    return this.incrementTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> component7() {
                    return this.decrementTrackingInfo;
                }

                @NotNull
                public final QuantityControl copy(int minimum, int maximum, int current, Integer debounceDelay, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> incrementTrackingInfo, Map<String, TokenizedTrackingInfo> decrementTrackingInfo) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    return new QuantityControl(minimum, maximum, current, debounceDelay, action, incrementTrackingInfo, decrementTrackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof QuantityControl)) {
                        return false;
                    }
                    QuantityControl quantityControl = (QuantityControl) other;
                    return this.minimum == quantityControl.minimum && this.maximum == quantityControl.maximum && this.current == quantityControl.current && Intrinsics.d(this.debounceDelay, quantityControl.debounceDelay) && Intrinsics.d(this.action, quantityControl.action) && Intrinsics.d(this.incrementTrackingInfo, quantityControl.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, quantityControl.decrementTrackingInfo);
                }

                @NotNull
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final int getCurrent() {
                    return this.current;
                }

                public final Integer getDebounceDelay() {
                    return this.debounceDelay;
                }

                public final Map<String, TokenizedTrackingInfo> getDecrementTrackingInfo() {
                    return this.decrementTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> getIncrementTrackingInfo() {
                    return this.incrementTrackingInfo;
                }

                public final int getMaximum() {
                    return this.maximum;
                }

                public final int getMinimum() {
                    return this.minimum;
                }

                public int hashCode() {
                    int a11 = C2454a.a(this.current, C2454a.a(this.maximum, Integer.hashCode(this.minimum) * 31, 31), 31);
                    Integer num = this.debounceDelay;
                    int b11 = a.b(this.action, (a11 + (num == null ? 0 : num.hashCode())) * 31, 31);
                    Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
                    int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
                    return hashCode + (map2 != null ? map2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    int i11 = this.minimum;
                    int i12 = this.maximum;
                    int i13 = this.current;
                    Integer num = this.debounceDelay;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
                    Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
                    StringBuilder a11 = C2438a.a("QuantityControl(minimum=", i11, ", maximum=", ", current=", i12);
                    a11.append(i13);
                    a11.append(", debounceDelay=");
                    a11.append(num);
                    a11.append(", action=");
                    b.f(a11, atomActionDTO, ", incrementTrackingInfo=", map, ", decrementTrackingInfo=");
                    return P.f(a11, map2, ")");
                }
            }

            public Split(@NotNull String image, Price price, Price price2, @NotNull TextAtom title, TextAtom textAtom, TextAtom textAtom2, DisclaimerAtom disclaimerAtom, IconDTO iconDTO, PromoIconPosition promoIconPosition, QuantityControl quantityControl, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                this.image = image;
                this.price = price;
                this.premiumPrice = price2;
                this.title = title;
                this.quantity = textAtom;
                this.pricePerItem = textAtom2;
                this.annotation = disclaimerAtom;
                this.promoIcon = iconDTO;
                this.promoIconPosition = promoIconPosition;
                this.quantityControl = quantityControl;
                this.trackingInfo = map;
            }

            public static /* synthetic */ Split copy$default(Split split, String str, Price price, Price price2, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, DisclaimerAtom disclaimerAtom, IconDTO iconDTO, PromoIconPosition promoIconPosition, QuantityControl quantityControl, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = split.image;
                }
                if ((i11 & 2) != 0) {
                    price = split.price;
                }
                if ((i11 & 4) != 0) {
                    price2 = split.premiumPrice;
                }
                if ((i11 & 8) != 0) {
                    textAtom = split.title;
                }
                if ((i11 & 16) != 0) {
                    textAtom2 = split.quantity;
                }
                if ((i11 & 32) != 0) {
                    textAtom3 = split.pricePerItem;
                }
                if ((i11 & 64) != 0) {
                    disclaimerAtom = split.annotation;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    iconDTO = split.promoIcon;
                }
                if ((i11 & 256) != 0) {
                    promoIconPosition = split.promoIconPosition;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    quantityControl = split.quantityControl;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    map = split.trackingInfo;
                }
                QuantityControl quantityControl2 = quantityControl;
                Map map2 = map;
                IconDTO iconDTO2 = iconDTO;
                PromoIconPosition promoIconPosition2 = promoIconPosition;
                TextAtom textAtom4 = textAtom3;
                DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
                TextAtom textAtom5 = textAtom2;
                Price price3 = price2;
                return split.copy(str, price, price3, textAtom, textAtom5, textAtom4, disclaimerAtom2, iconDTO2, promoIconPosition2, quantityControl2, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component10, reason: from getter */
            public final QuantityControl getQuantityControl() {
                return this.quantityControl;
            }

            public final Map<String, TokenizedTrackingInfo> component11() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final Price getPrice() {
                return this.price;
            }

            /* renamed from: component3, reason: from getter */
            public final Price getPremiumPrice() {
                return this.premiumPrice;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component5, reason: from getter */
            public final TextAtom getQuantity() {
                return this.quantity;
            }

            /* renamed from: component6, reason: from getter */
            public final TextAtom getPricePerItem() {
                return this.pricePerItem;
            }

            /* renamed from: component7, reason: from getter */
            public final DisclaimerAtom getAnnotation() {
                return this.annotation;
            }

            /* renamed from: component8, reason: from getter */
            public final IconDTO getPromoIcon() {
                return this.promoIcon;
            }

            /* renamed from: component9, reason: from getter */
            public final PromoIconPosition getPromoIconPosition() {
                return this.promoIconPosition;
            }

            @NotNull
            public final Split copy(@NotNull String image, Price price, Price premiumPrice, @NotNull TextAtom title, TextAtom quantity, TextAtom pricePerItem, DisclaimerAtom annotation, IconDTO promoIcon, PromoIconPosition promoIconPosition, QuantityControl quantityControl, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                return new Split(image, price, premiumPrice, title, quantity, pricePerItem, annotation, promoIcon, promoIconPosition, quantityControl, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Split)) {
                    return false;
                }
                Split split = (Split) other;
                return Intrinsics.d(this.image, split.image) && Intrinsics.d(this.price, split.price) && Intrinsics.d(this.premiumPrice, split.premiumPrice) && Intrinsics.d(this.title, split.title) && Intrinsics.d(this.quantity, split.quantity) && Intrinsics.d(this.pricePerItem, split.pricePerItem) && Intrinsics.d(this.annotation, split.annotation) && Intrinsics.d(this.promoIcon, split.promoIcon) && this.promoIconPosition == split.promoIconPosition && Intrinsics.d(this.quantityControl, split.quantityControl) && Intrinsics.d(this.trackingInfo, split.trackingInfo);
            }

            public final DisclaimerAtom getAnnotation() {
                return this.annotation;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final Price getPremiumPrice() {
                return this.premiumPrice;
            }

            public final Price getPrice() {
                return this.price;
            }

            public final TextAtom getPricePerItem() {
                return this.pricePerItem;
            }

            public final IconDTO getPromoIcon() {
                return this.promoIcon;
            }

            public final PromoIconPosition getPromoIconPosition() {
                return this.promoIconPosition;
            }

            public final TextAtom getQuantity() {
                return this.quantity;
            }

            public final QuantityControl getQuantityControl() {
                return this.quantityControl;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                Price price = this.price;
                int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
                Price price2 = this.premiumPrice;
                int b11 = C2619v.b((hashCode2 + (price2 == null ? 0 : price2.hashCode())) * 31, 31, this.title);
                TextAtom textAtom = this.quantity;
                int hashCode3 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                TextAtom textAtom2 = this.pricePerItem;
                int hashCode4 = (hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
                DisclaimerAtom disclaimerAtom = this.annotation;
                int hashCode5 = (hashCode4 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
                IconDTO iconDTO = this.promoIcon;
                int hashCode6 = (hashCode5 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                PromoIconPosition promoIconPosition = this.promoIconPosition;
                int hashCode7 = (hashCode6 + (promoIconPosition == null ? 0 : promoIconPosition.hashCode())) * 31;
                QuantityControl quantityControl = this.quantityControl;
                int hashCode8 = (hashCode7 + (quantityControl == null ? 0 : quantityControl.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode8 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                Price price = this.price;
                Price price2 = this.premiumPrice;
                TextAtom textAtom = this.title;
                TextAtom textAtom2 = this.quantity;
                TextAtom textAtom3 = this.pricePerItem;
                DisclaimerAtom disclaimerAtom = this.annotation;
                IconDTO iconDTO = this.promoIcon;
                PromoIconPosition promoIconPosition = this.promoIconPosition;
                QuantityControl quantityControl = this.quantityControl;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("Split(image=");
                sb2.append(str);
                sb2.append(", price=");
                sb2.append(price);
                sb2.append(", premiumPrice=");
                sb2.append(price2);
                sb2.append(", title=");
                sb2.append(textAtom);
                sb2.append(", quantity=");
                C4636t5.c(", pricePerItem=", ", annotation=", sb2, textAtom2, textAtom3);
                sb2.append(disclaimerAtom);
                sb2.append(", promoIcon=");
                sb2.append(iconDTO);
                sb2.append(", promoIconPosition=");
                sb2.append(promoIconPosition);
                sb2.append(", quantityControl=");
                sb2.append(quantityControl);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        public VerticalType(@NotNull List<Split> splits, Settings settings) {
            Intrinsics.checkNotNullParameter(splits, "splits");
            this.splits = splits;
            this.settings = settings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VerticalType copy$default(VerticalType verticalType, List list, Settings settings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = verticalType.splits;
            }
            if ((i11 & 2) != 0) {
                settings = verticalType.settings;
            }
            return verticalType.copy(list, settings);
        }

        @NotNull
        public final List<Split> component1() {
            return this.splits;
        }

        /* renamed from: component2, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        @NotNull
        public final VerticalType copy(@NotNull List<Split> splits, Settings settings) {
            Intrinsics.checkNotNullParameter(splits, "splits");
            return new VerticalType(splits, settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalType)) {
                return false;
            }
            VerticalType verticalType = (VerticalType) other;
            return Intrinsics.d(this.splits, verticalType.splits) && Intrinsics.d(this.settings, verticalType.settings);
        }

        public final Settings getSettings() {
            return this.settings;
        }

        @NotNull
        public final List<Split> getSplits() {
            return this.splits;
        }

        public int hashCode() {
            int hashCode = this.splits.hashCode() * 31;
            Settings settings = this.settings;
            return hashCode + (settings == null ? 0 : settings.hashCode());
        }

        @NotNull
        public String toString() {
            return "VerticalType(splits=" + this.splits + ", settings=" + this.settings + ")";
        }
    }

    public SplitDetailV2DTO(TextAtom textAtom, HorizontalType horizontalType, VerticalType verticalType, Map<String, TokenizedTrackingInfo> map) {
        this.header = textAtom;
        this.horizontal = horizontalType;
        this.vertical = verticalType;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplitDetailV2DTO copy$default(SplitDetailV2DTO splitDetailV2DTO, TextAtom textAtom, HorizontalType horizontalType, VerticalType verticalType, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = splitDetailV2DTO.header;
        }
        if ((i11 & 2) != 0) {
            horizontalType = splitDetailV2DTO.horizontal;
        }
        if ((i11 & 4) != 0) {
            verticalType = splitDetailV2DTO.vertical;
        }
        if ((i11 & 8) != 0) {
            map = splitDetailV2DTO.trackingInfo;
        }
        return splitDetailV2DTO.copy(textAtom, horizontalType, verticalType, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final HorizontalType getHorizontal() {
        return this.horizontal;
    }

    /* renamed from: component3, reason: from getter */
    public final VerticalType getVertical() {
        return this.vertical;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final SplitDetailV2DTO copy(TextAtom header, HorizontalType horizontal, VerticalType vertical, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new SplitDetailV2DTO(header, horizontal, vertical, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitDetailV2DTO)) {
            return false;
        }
        SplitDetailV2DTO splitDetailV2DTO = (SplitDetailV2DTO) other;
        return Intrinsics.d(this.header, splitDetailV2DTO.header) && Intrinsics.d(this.horizontal, splitDetailV2DTO.horizontal) && Intrinsics.d(this.vertical, splitDetailV2DTO.vertical) && Intrinsics.d(this.trackingInfo, splitDetailV2DTO.trackingInfo);
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    public final HorizontalType getHorizontal() {
        return this.horizontal;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final VerticalType getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        TextAtom textAtom = this.header;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        HorizontalType horizontalType = this.horizontal;
        int hashCode2 = (hashCode + (horizontalType == null ? 0 : horizontalType.hashCode())) * 31;
        VerticalType verticalType = this.vertical;
        int hashCode3 = (hashCode2 + (verticalType == null ? 0 : verticalType.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SplitDetailV2DTO(header=" + this.header + ", horizontal=" + this.horizontal + ", vertical=" + this.vertical + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
