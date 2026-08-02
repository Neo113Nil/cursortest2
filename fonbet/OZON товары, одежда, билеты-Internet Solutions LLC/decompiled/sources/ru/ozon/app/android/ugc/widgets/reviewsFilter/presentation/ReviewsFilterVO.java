package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation;

import G.g;
import Lh.b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "filters", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "LWZ/t;", "tokenizedEvent", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(JLjava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;LWZ/t;Landroid/os/Parcelable;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;LWZ/t;Landroid/os/Parcelable;)Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "ReviewsFilterItemVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsFilterVO implements c {

    @NotNull
    private final List<ReviewsFilterItemVO> filters;
    private final long id;
    private final Parcelable layoutManagerState;
    private final OnBoardingDTO onboarding;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "", "<init>", "()V", "id", "", "getId", "()J", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Title", "Image", "Item", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Image;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Item;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Title;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ReviewsFilterItemVO {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Image;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "", "id", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "<init>", "(JLru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProduct", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends ReviewsFilterItemVO {
            public static final int $stable = ProductMediaDTO.$stable | AspectDTO.$stable;

            @NotNull
            private final AspectDTO aspect;
            private final long id;

            @NotNull
            private final ProductMediaDTO product;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(long j11, @NotNull AspectDTO aspect, @NotNull ProductMediaDTO product) {
                super(null);
                Intrinsics.checkNotNullParameter(aspect, "aspect");
                Intrinsics.checkNotNullParameter(product, "product");
                this.id = j11;
                this.aspect = aspect;
                this.product = product;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return this.id == image.id && Intrinsics.d(this.aspect, image.aspect) && Intrinsics.d(this.product, image.product);
            }

            @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO
            @NotNull
            public AspectDTO getAspect() {
                return this.aspect;
            }

            @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO
            public long getId() {
                return this.id;
            }

            @NotNull
            public final ProductMediaDTO getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode() + ((this.aspect.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                return "Image(id=" + this.id + ", aspect=" + this.aspect + ", product=" + this.product + ")";
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Item;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "", "id", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(JLru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProduct", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Item extends ReviewsFilterItemVO {
            public static final int $stable = ProductMediaDTO.$stable | AspectDTO.$stable;

            @NotNull
            private final AspectDTO aspect;
            private final long id;
            private final ProductMediaDTO product;
            private final TextDTO title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Item(long j11, @NotNull AspectDTO aspect, ProductMediaDTO productMediaDTO, TextDTO textDTO) {
                super(null);
                Intrinsics.checkNotNullParameter(aspect, "aspect");
                this.id = j11;
                this.aspect = aspect;
                this.product = productMediaDTO;
                this.title = textDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return this.id == item.id && Intrinsics.d(this.aspect, item.aspect) && Intrinsics.d(this.product, item.product) && Intrinsics.d(this.title, item.title);
            }

            @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO
            @NotNull
            public AspectDTO getAspect() {
                return this.aspect;
            }

            @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO
            public long getId() {
                return this.id;
            }

            public final ProductMediaDTO getProduct() {
                return this.product;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = (this.aspect.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
                ProductMediaDTO productMediaDTO = this.product;
                int hashCode2 = (hashCode + (productMediaDTO == null ? 0 : productMediaDTO.hashCode())) * 31;
                TextDTO textDTO = this.title;
                return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Item(id=" + this.id + ", aspect=" + this.aspect + ", product=" + this.product + ", title=" + this.title + ")";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Title;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "", "id", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(JLru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Title extends ReviewsFilterItemVO {
            public static final int $stable = AspectDTO.$stable;

            @NotNull
            private final AspectDTO aspect;
            private final long id;

            @NotNull
            private final TextDTO title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Title(long j11, @NotNull AspectDTO aspect, @NotNull TextDTO title) {
                super(null);
                Intrinsics.checkNotNullParameter(aspect, "aspect");
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = j11;
                this.aspect = aspect;
                this.title = title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Title)) {
                    return false;
                }
                Title title = (Title) other;
                return this.id == title.id && Intrinsics.d(this.aspect, title.aspect) && Intrinsics.d(this.title, title.title);
            }

            @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO
            @NotNull
            public AspectDTO getAspect() {
                return this.aspect;
            }

            @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO
            public long getId() {
                return this.id;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode() + ((this.aspect.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                return "Title(id=" + this.id + ", aspect=" + this.aspect + ", title=" + this.title + ")";
            }
        }

        public /* synthetic */ ReviewsFilterItemVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract AspectDTO getAspect();

        public abstract long getId();

        private ReviewsFilterItemVO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewsFilterVO(long j11, @NotNull List<? extends ReviewsFilterItemVO> filters, OnBoardingDTO onBoardingDTO, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.id = j11;
        this.filters = filters;
        this.onboarding = onBoardingDTO;
        this.tokenizedEvent = tVar;
        this.layoutManagerState = parcelable;
    }

    public static /* synthetic */ ReviewsFilterVO copy$default(ReviewsFilterVO reviewsFilterVO, long j11, List list, OnBoardingDTO onBoardingDTO, t tVar, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = reviewsFilterVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = reviewsFilterVO.filters;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            onBoardingDTO = reviewsFilterVO.onboarding;
        }
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        if ((i11 & 8) != 0) {
            tVar = reviewsFilterVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 16) != 0) {
            parcelable = reviewsFilterVO.layoutManagerState;
        }
        return reviewsFilterVO.copy(j12, list2, onBoardingDTO2, tVar2, parcelable);
    }

    @NotNull
    public final ReviewsFilterVO copy(long id2, @NotNull List<? extends ReviewsFilterItemVO> filters, OnBoardingDTO onboarding, t tokenizedEvent, Parcelable layoutManagerState) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new ReviewsFilterVO(id2, filters, onboarding, tokenizedEvent, layoutManagerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsFilterVO)) {
            return false;
        }
        ReviewsFilterVO reviewsFilterVO = (ReviewsFilterVO) other;
        return this.id == reviewsFilterVO.id && Intrinsics.d(this.filters, reviewsFilterVO.filters) && Intrinsics.d(this.onboarding, reviewsFilterVO.onboarding) && Intrinsics.d(this.tokenizedEvent, reviewsFilterVO.tokenizedEvent) && Intrinsics.d(this.layoutManagerState, reviewsFilterVO.layoutManagerState);
    }

    @NotNull
    public final List<ReviewsFilterItemVO> getFilters() {
        return this.filters;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.filters);
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode = (b11 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.layoutManagerState;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ReviewsFilterItemVO> list = this.filters;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.layoutManagerState;
        StringBuilder b11 = b.b(j11, "ReviewsFilterVO(id=", ", filters=", list);
        b11.append(", onboarding=");
        b11.append(onBoardingDTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", layoutManagerState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }
}
