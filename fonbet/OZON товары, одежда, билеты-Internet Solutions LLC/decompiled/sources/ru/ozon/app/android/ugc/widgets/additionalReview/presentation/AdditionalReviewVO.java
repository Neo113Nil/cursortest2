package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import C.o0;
import G.g;
import N3.C3660k;
import Ns.b;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.additionalReview.data.AdditionalReviewDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003/01BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Bonus;", "bonus", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Product;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Rating;", "rating", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(JLru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Bonus;Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Product;Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Rating;LWZ/t;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Bonus;", "getBonus", "()Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Bonus;", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Product;", "getProduct", "()Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Product;", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Rating;", "getRating", "()Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Rating;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Bonus", "Product", "Rating", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdditionalReviewVO implements c {
    private final Bonus bonus;

    @NotNull
    private final CornerRadius cornerRadius;
    private final long id;

    @NotNull
    private final Product product;

    @NotNull
    private final Rating rating;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Bonus;", "", "", "icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "backgroundColor", "iconTint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "getTitleColor", "getBackgroundColor", "getIconTint", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bonus {
        private final String backgroundColor;

        @NotNull
        private final String icon;
        private final String iconTint;

        @NotNull
        private final String title;
        private final String titleColor;

        public Bonus(@NotNull String icon, @NotNull String title, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.titleColor = str;
            this.backgroundColor = str2;
            this.iconTint = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bonus)) {
                return false;
            }
            Bonus bonus = (Bonus) other;
            return Intrinsics.d(this.icon, bonus.icon) && Intrinsics.d(this.title, bonus.title) && Intrinsics.d(this.titleColor, bonus.titleColor) && Intrinsics.d(this.backgroundColor, bonus.backgroundColor) && Intrinsics.d(this.iconTint, bonus.iconTint);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTint() {
            return this.iconTint;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            int a11 = g.a(this.icon.hashCode() * 31, 31, this.title);
            String str = this.titleColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconTint;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.title;
            String str3 = this.titleColor;
            String str4 = this.backgroundColor;
            String str5 = this.iconTint;
            StringBuilder d11 = C3660k.d("Bonus(icon=", str, ", title=", str2, ", titleColor=");
            Nh.a.h(d11, str3, ", backgroundColor=", str4, ", iconTint=");
            return o0.c(d11, str5, ")");
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Product;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageAtom", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;
        private final long id;

        @NotNull
        private final ImageDTO imageAtom;

        @NotNull
        private final TextDTO name;

        public Product(long j11, @NotNull TextDTO name, @NotNull ImageDTO imageAtom, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
            this.id = j11;
            this.name = name;
            this.imageAtom = imageAtom;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return this.id == product.id && Intrinsics.d(this.name, product.name) && Intrinsics.d(this.imageAtom, product.imageAtom) && Intrinsics.d(this.action, product.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getImageAtom() {
            return this.imageAtom;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public int hashCode() {
            int b11 = Nh.a.b(this.imageAtom, b.a(this.name, Long.hashCode(this.id) * 31, 31), 31);
            AtomAction atomAction = this.action;
            return b11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.name;
            ImageDTO imageDTO = this.imageAtom;
            AtomAction atomAction = this.action;
            StringBuilder b11 = TY.a.b("Product(id=", j11, ", name=", textDTO);
            b11.append(", imageAtom=");
            b11.append(imageDTO);
            b11.append(", action=");
            b11.append(atomAction);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO$Rating;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating$Star;", "stars", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getStars", "()Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rating {

        @NotNull
        private final List<AdditionalReviewDTO.Rating.Star> stars;

        @NotNull
        private final TextDTO text;

        public Rating(@NotNull TextDTO text, @NotNull List<AdditionalReviewDTO.Rating.Star> stars) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(stars, "stars");
            this.text = text;
            this.stars = stars;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) other;
            return Intrinsics.d(this.text, rating.text) && Intrinsics.d(this.stars, rating.stars);
        }

        @NotNull
        public final List<AdditionalReviewDTO.Rating.Star> getStars() {
            return this.stars;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.stars.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Rating(text=" + this.text + ", stars=" + this.stars + ")";
        }
    }

    public AdditionalReviewVO(long j11, Bonus bonus, @NotNull Product product, @NotNull Rating rating, t tVar, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.id = j11;
        this.bonus = bonus;
        this.product = product;
        this.rating = rating;
        this.viewEvent = tVar;
        this.cornerRadius = cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalReviewVO)) {
            return false;
        }
        AdditionalReviewVO additionalReviewVO = (AdditionalReviewVO) other;
        return this.id == additionalReviewVO.id && Intrinsics.d(this.bonus, additionalReviewVO.bonus) && Intrinsics.d(this.product, additionalReviewVO.product) && Intrinsics.d(this.rating, additionalReviewVO.rating) && Intrinsics.d(this.viewEvent, additionalReviewVO.viewEvent) && this.cornerRadius == additionalReviewVO.cornerRadius;
    }

    public final Bonus getBonus() {
        return this.bonus;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Product getProduct() {
        return this.product;
    }

    @NotNull
    public final Rating getRating() {
        return this.rating;
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
        int hashCode = Long.hashCode(this.id) * 31;
        Bonus bonus = this.bonus;
        int hashCode2 = (this.rating.hashCode() + ((this.product.hashCode() + ((hashCode + (bonus == null ? 0 : bonus.hashCode())) * 31)) * 31)) * 31;
        t tVar = this.viewEvent;
        return this.cornerRadius.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AdditionalReviewVO(id=" + this.id + ", bonus=" + this.bonus + ", product=" + this.product + ", rating=" + this.rating + ", viewEvent=" + this.viewEvent + ", cornerRadius=" + this.cornerRadius + ")";
    }
}
