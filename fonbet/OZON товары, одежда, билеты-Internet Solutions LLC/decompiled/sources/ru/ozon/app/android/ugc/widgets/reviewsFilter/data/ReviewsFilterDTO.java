package ru.ozon.app.android.ugc.widgets.reviewsFilter.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO;", "", "filters", "", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterItemDTO;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;)V", "getFilters", "()Ljava/util/List;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ReviewsFilterItemDTO", "ReviewsFilterContentDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsFilterDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ReviewsFilterItemDTO> filters;
    private final OnBoardingDTO onboarding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterContentDTO;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getProduct", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewsFilterContentDTO {
        public static final int $stable = ProductMediaDTO.$stable;
        private final ProductMediaDTO product;
        private final TextDTO title;

        public ReviewsFilterContentDTO(ProductMediaDTO productMediaDTO, TextDTO textDTO) {
            this.product = productMediaDTO;
            this.title = textDTO;
        }

        public static /* synthetic */ ReviewsFilterContentDTO copy$default(ReviewsFilterContentDTO reviewsFilterContentDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productMediaDTO = reviewsFilterContentDTO.product;
            }
            if ((i11 & 2) != 0) {
                textDTO = reviewsFilterContentDTO.title;
            }
            return reviewsFilterContentDTO.copy(productMediaDTO, textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final ProductMediaDTO getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final ReviewsFilterContentDTO copy(ProductMediaDTO product, TextDTO title) {
            return new ReviewsFilterContentDTO(product, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewsFilterContentDTO)) {
                return false;
            }
            ReviewsFilterContentDTO reviewsFilterContentDTO = (ReviewsFilterContentDTO) other;
            return Intrinsics.d(this.product, reviewsFilterContentDTO.product) && Intrinsics.d(this.title, reviewsFilterContentDTO.title);
        }

        public final ProductMediaDTO getProduct() {
            return this.product;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            ProductMediaDTO productMediaDTO = this.product;
            int hashCode = (productMediaDTO == null ? 0 : productMediaDTO.hashCode()) * 31;
            TextDTO textDTO = this.title;
            return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReviewsFilterContentDTO(product=" + this.product + ", title=" + this.title + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterItemDTO;", "", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "content", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterContentDTO;", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterContentDTO;)V", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getContent", "()Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterContentDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewsFilterItemDTO {
        public static final int $stable = ProductMediaDTO.$stable | AspectDTO.$stable;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final ReviewsFilterContentDTO content;

        public ReviewsFilterItemDTO(@NotNull AspectDTO aspect, @NotNull ReviewsFilterContentDTO content) {
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            Intrinsics.checkNotNullParameter(content, "content");
            this.aspect = aspect;
            this.content = content;
        }

        public static /* synthetic */ ReviewsFilterItemDTO copy$default(ReviewsFilterItemDTO reviewsFilterItemDTO, AspectDTO aspectDTO, ReviewsFilterContentDTO reviewsFilterContentDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = reviewsFilterItemDTO.aspect;
            }
            if ((i11 & 2) != 0) {
                reviewsFilterContentDTO = reviewsFilterItemDTO.content;
            }
            return reviewsFilterItemDTO.copy(aspectDTO, reviewsFilterContentDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ReviewsFilterContentDTO getContent() {
            return this.content;
        }

        @NotNull
        public final ReviewsFilterItemDTO copy(@NotNull AspectDTO aspect, @NotNull ReviewsFilterContentDTO content) {
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            Intrinsics.checkNotNullParameter(content, "content");
            return new ReviewsFilterItemDTO(aspect, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewsFilterItemDTO)) {
                return false;
            }
            ReviewsFilterItemDTO reviewsFilterItemDTO = (ReviewsFilterItemDTO) other;
            return Intrinsics.d(this.aspect, reviewsFilterItemDTO.aspect) && Intrinsics.d(this.content, reviewsFilterItemDTO.content);
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final ReviewsFilterContentDTO getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode() + (this.aspect.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ReviewsFilterItemDTO(aspect=" + this.aspect + ", content=" + this.content + ")";
        }
    }

    public ReviewsFilterDTO(@NotNull List<ReviewsFilterItemDTO> filters, OnBoardingDTO onBoardingDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.filters = filters;
        this.onboarding = onBoardingDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewsFilterDTO copy$default(ReviewsFilterDTO reviewsFilterDTO, List list, OnBoardingDTO onBoardingDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewsFilterDTO.filters;
        }
        if ((i11 & 2) != 0) {
            onBoardingDTO = reviewsFilterDTO.onboarding;
        }
        if ((i11 & 4) != 0) {
            map = reviewsFilterDTO.trackingInfo;
        }
        return reviewsFilterDTO.copy(list, onBoardingDTO, map);
    }

    @NotNull
    public final List<ReviewsFilterItemDTO> component1() {
        return this.filters;
    }

    /* renamed from: component2, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewsFilterDTO copy(@NotNull List<ReviewsFilterItemDTO> filters, OnBoardingDTO onboarding, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new ReviewsFilterDTO(filters, onboarding, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsFilterDTO)) {
            return false;
        }
        ReviewsFilterDTO reviewsFilterDTO = (ReviewsFilterDTO) other;
        return Intrinsics.d(this.filters, reviewsFilterDTO.filters) && Intrinsics.d(this.onboarding, reviewsFilterDTO.onboarding) && Intrinsics.d(this.trackingInfo, reviewsFilterDTO.trackingInfo);
    }

    @NotNull
    public final List<ReviewsFilterItemDTO> getFilters() {
        return this.filters;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.filters.hashCode() * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ReviewsFilterItemDTO> list = this.filters;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ReviewsFilterDTO(filters=");
        sb2.append(list);
        sb2.append(", onboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
