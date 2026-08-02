package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard;

import Ak.C2436a;
import B0.C2454a;
import B90.C2618u;
import Ek.a;
import Fj.c;
import G.g;
import J0.P;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001:\u0003567Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "", "", "id", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Gallery;", "gallery", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favoriteButton", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "contentList", "", "contentMargins", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;", "settings", "<init>", "(JLru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Gallery;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Gallery;", "getGallery", "()Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Gallery;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Ljava/util/List;", "getContentList", "()Ljava/util/List;", "getContentMargins", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;", "getSettings", "()Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;", "CardSettings", "Gallery", "Image", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShelfCardVO {
    private final AtomAction action;

    @NotNull
    private final List<AtomDTO> contentList;

    @NotNull
    private final List<Integer> contentMargins;
    private final FavoriteProductModel favoriteButton;

    @NotNull
    private final Gallery gallery;
    private final long id;

    @NotNull
    private final CardSettings settings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b%\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b'\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b(\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b)\u0010\u0014¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;", "", "", "cardCornerRadius", "", "cardMiddleMargin", "span", "galleryAspectRatio", "galleryWidth", "galleryTopMargin", "galleryHorizontalMargin", "contentBottomMargin", "contentHorizontalMargin", "cardBottomMargin", "<init>", "(FIILjava/lang/Float;Ljava/lang/Integer;IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getCardCornerRadius", "()F", "I", "getCardMiddleMargin", "getSpan", "Ljava/lang/Float;", "getGalleryAspectRatio", "()Ljava/lang/Float;", "Ljava/lang/Integer;", "getGalleryWidth", "()Ljava/lang/Integer;", "getGalleryTopMargin", "getGalleryHorizontalMargin", "getContentBottomMargin", "getContentHorizontalMargin", "getCardBottomMargin", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardSettings {
        private final int cardBottomMargin;
        private final float cardCornerRadius;
        private final int cardMiddleMargin;
        private final int contentBottomMargin;
        private final int contentHorizontalMargin;
        private final Float galleryAspectRatio;
        private final int galleryHorizontalMargin;
        private final int galleryTopMargin;
        private final Integer galleryWidth;
        private final int span;

        public CardSettings(float f7, int i11, int i12, Float f11, Integer num, int i13, int i14, int i15, int i16, int i17) {
            this.cardCornerRadius = f7;
            this.cardMiddleMargin = i11;
            this.span = i12;
            this.galleryAspectRatio = f11;
            this.galleryWidth = num;
            this.galleryTopMargin = i13;
            this.galleryHorizontalMargin = i14;
            this.contentBottomMargin = i15;
            this.contentHorizontalMargin = i16;
            this.cardBottomMargin = i17;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardSettings)) {
                return false;
            }
            CardSettings cardSettings = (CardSettings) other;
            return Float.compare(this.cardCornerRadius, cardSettings.cardCornerRadius) == 0 && this.cardMiddleMargin == cardSettings.cardMiddleMargin && this.span == cardSettings.span && Intrinsics.d(this.galleryAspectRatio, cardSettings.galleryAspectRatio) && Intrinsics.d(this.galleryWidth, cardSettings.galleryWidth) && this.galleryTopMargin == cardSettings.galleryTopMargin && this.galleryHorizontalMargin == cardSettings.galleryHorizontalMargin && this.contentBottomMargin == cardSettings.contentBottomMargin && this.contentHorizontalMargin == cardSettings.contentHorizontalMargin && this.cardBottomMargin == cardSettings.cardBottomMargin;
        }

        public final int getCardBottomMargin() {
            return this.cardBottomMargin;
        }

        public final float getCardCornerRadius() {
            return this.cardCornerRadius;
        }

        public final int getContentBottomMargin() {
            return this.contentBottomMargin;
        }

        public final int getContentHorizontalMargin() {
            return this.contentHorizontalMargin;
        }

        public final Float getGalleryAspectRatio() {
            return this.galleryAspectRatio;
        }

        public final int getGalleryHorizontalMargin() {
            return this.galleryHorizontalMargin;
        }

        public final int getGalleryTopMargin() {
            return this.galleryTopMargin;
        }

        public final Integer getGalleryWidth() {
            return this.galleryWidth;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.span, C2454a.a(this.cardMiddleMargin, Float.hashCode(this.cardCornerRadius) * 31, 31), 31);
            Float f7 = this.galleryAspectRatio;
            int hashCode = (a11 + (f7 == null ? 0 : f7.hashCode())) * 31;
            Integer num = this.galleryWidth;
            return Integer.hashCode(this.cardBottomMargin) + C2454a.a(this.contentHorizontalMargin, C2454a.a(this.contentBottomMargin, C2454a.a(this.galleryHorizontalMargin, C2454a.a(this.galleryTopMargin, (hashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            float f7 = this.cardCornerRadius;
            int i11 = this.cardMiddleMargin;
            int i12 = this.span;
            Float f11 = this.galleryAspectRatio;
            Integer num = this.galleryWidth;
            int i13 = this.galleryTopMargin;
            int i14 = this.galleryHorizontalMargin;
            int i15 = this.contentBottomMargin;
            int i16 = this.contentHorizontalMargin;
            int i17 = this.cardBottomMargin;
            StringBuilder sb2 = new StringBuilder("CardSettings(cardCornerRadius=");
            sb2.append(f7);
            sb2.append(", cardMiddleMargin=");
            sb2.append(i11);
            sb2.append(", span=");
            sb2.append(i12);
            sb2.append(", galleryAspectRatio=");
            sb2.append(f11);
            sb2.append(", galleryWidth=");
            sb2.append(num);
            sb2.append(", galleryTopMargin=");
            sb2.append(i13);
            sb2.append(", galleryHorizontalMargin=");
            a.f(i14, i15, ", contentBottomMargin=", ", contentHorizontalMargin=", sb2);
            return P.a(i16, i17, ", cardBottomMargin=", ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Gallery;", "", "", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Image;", "images", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topBadges", "bottomBadges", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getTopBadges", "getBottomBadges", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gallery {

        @NotNull
        private final List<BadgeDTO> bottomBadges;

        @NotNull
        private final List<Image> images;

        @NotNull
        private final List<BadgeDTO> topBadges;

        public Gallery(@NotNull List<Image> images, @NotNull List<BadgeDTO> topBadges, @NotNull List<BadgeDTO> bottomBadges) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(topBadges, "topBadges");
            Intrinsics.checkNotNullParameter(bottomBadges, "bottomBadges");
            this.images = images;
            this.topBadges = topBadges;
            this.bottomBadges = bottomBadges;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gallery)) {
                return false;
            }
            Gallery gallery = (Gallery) other;
            return Intrinsics.d(this.images, gallery.images) && Intrinsics.d(this.topBadges, gallery.topBadges) && Intrinsics.d(this.bottomBadges, gallery.bottomBadges);
        }

        @NotNull
        public final List<BadgeDTO> getBottomBadges() {
            return this.bottomBadges;
        }

        @NotNull
        public final List<Image> getImages() {
            return this.images;
        }

        @NotNull
        public final List<BadgeDTO> getTopBadges() {
            return this.topBadges;
        }

        public int hashCode() {
            return this.bottomBadges.hashCode() + g.b(this.images.hashCode() * 31, 31, this.topBadges);
        }

        @NotNull
        public String toString() {
            List<Image> list = this.images;
            List<BadgeDTO> list2 = this.topBadges;
            return C2618u.h(c.d("Gallery(images=", list, ", topBadges=", ", bottomBadges=", list2), this.bottomBadges, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Image;", "", "", "id", "", ImagesContract.URL, "", "cornerRadius", "<init>", "(JLjava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUrl", "F", "getCornerRadius", "()F", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        private final float cornerRadius;
        private final long id;

        @NotNull
        private final String url;

        public Image(long j11, @NotNull String url, float f7) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.id = j11;
            this.url = url;
            this.cornerRadius = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return this.id == image.id && Intrinsics.d(this.url, image.url) && Float.compare(this.cornerRadius, image.cornerRadius) == 0;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return Float.hashCode(this.cornerRadius) + g.a(Long.hashCode(this.id) * 31, 31, this.url);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.url;
            float f7 = this.cornerRadius;
            StringBuilder c11 = C2436a.c(j11, "Image(id=", ", url=", str);
            c11.append(", cornerRadius=");
            c11.append(f7);
            c11.append(")");
            return c11.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShelfCardVO(long j11, @NotNull Gallery gallery, FavoriteProductModel favoriteProductModel, @NotNull List<? extends AtomDTO> contentList, @NotNull List<Integer> contentMargins, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, @NotNull CardSettings settings) {
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        Intrinsics.checkNotNullParameter(contentMargins, "contentMargins");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.id = j11;
        this.gallery = gallery;
        this.favoriteButton = favoriteProductModel;
        this.contentList = contentList;
        this.contentMargins = contentMargins;
        this.action = atomAction;
        this.trackingInfo = map;
        this.settings = settings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShelfCardVO)) {
            return false;
        }
        ShelfCardVO shelfCardVO = (ShelfCardVO) other;
        return this.id == shelfCardVO.id && Intrinsics.d(this.gallery, shelfCardVO.gallery) && Intrinsics.d(this.favoriteButton, shelfCardVO.favoriteButton) && Intrinsics.d(this.contentList, shelfCardVO.contentList) && Intrinsics.d(this.contentMargins, shelfCardVO.contentMargins) && Intrinsics.d(this.action, shelfCardVO.action) && Intrinsics.d(this.trackingInfo, shelfCardVO.trackingInfo) && Intrinsics.d(this.settings, shelfCardVO.settings);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final List<AtomDTO> getContentList() {
        return this.contentList;
    }

    @NotNull
    public final List<Integer> getContentMargins() {
        return this.contentMargins;
    }

    public final FavoriteProductModel getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final Gallery getGallery() {
        return this.gallery;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final CardSettings getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.gallery.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        FavoriteProductModel favoriteProductModel = this.favoriteButton;
        int b11 = g.b(g.b((hashCode + (favoriteProductModel == null ? 0 : favoriteProductModel.hashCode())) * 31, 31, this.contentList), 31, this.contentMargins);
        AtomAction atomAction = this.action;
        int hashCode2 = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.settings.hashCode() + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ShelfCardVO(id=" + this.id + ", gallery=" + this.gallery + ", favoriteButton=" + this.favoriteButton + ", contentList=" + this.contentList + ", contentMargins=" + this.contentMargins + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", settings=" + this.settings + ")";
    }
}
