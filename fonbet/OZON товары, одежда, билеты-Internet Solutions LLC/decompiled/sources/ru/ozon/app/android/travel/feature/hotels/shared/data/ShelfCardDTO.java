package ru.ozon.app.android.travel.feature.hotels.shared.data;

import B90.C2618u;
import Fj.c;
import G.g;
import Tl.b;
import Xc.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003&'(B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;", "", "gallery", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Gallery;", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "contentList", "", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$ContentItem;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "theme", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Theme;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Gallery;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Theme;)V", "getGallery", "()Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Gallery;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "getContentList", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTheme", "()Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Theme;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Gallery", "ContentItem", "Theme", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShelfCardDTO {
    public static final int $stable = 8;
    private final CommonControlSettings common;

    @NotNull
    private final List<ContentItem> contentList;
    private final FavoriteProductMoleculeV4 favoriteButton;

    @NotNull
    private final Gallery gallery;

    @EnumNullFallback
    private final Theme theme;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$ContentItem;", "", "gapBefore", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getGapBefore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$ContentItem;", "equals", "", "other", "hashCode", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem {
        public static final int $stable = PriceDTO.$stable;
        private final Integer gapBefore;
        private final PriceDTO price;
        private final TextDTO text;

        public ContentItem(Integer num, PriceDTO priceDTO, TextDTO textDTO) {
            this.gapBefore = num;
            this.price = priceDTO;
            this.text = textDTO;
        }

        public static /* synthetic */ ContentItem copy$default(ContentItem contentItem, Integer num, PriceDTO priceDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = contentItem.gapBefore;
            }
            if ((i11 & 2) != 0) {
                priceDTO = contentItem.price;
            }
            if ((i11 & 4) != 0) {
                textDTO = contentItem.text;
            }
            return contentItem.copy(num, priceDTO, textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getGapBefore() {
            return this.gapBefore;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final ContentItem copy(Integer gapBefore, PriceDTO price, TextDTO text) {
            return new ContentItem(gapBefore, price, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentItem)) {
                return false;
            }
            ContentItem contentItem = (ContentItem) other;
            return Intrinsics.d(this.gapBefore, contentItem.gapBefore) && Intrinsics.d(this.price, contentItem.price) && Intrinsics.d(this.text, contentItem.text);
        }

        public final Integer getGapBefore() {
            return this.gapBefore;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            Integer num = this.gapBefore;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            TextDTO textDTO = this.text;
            return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.gapBefore;
            PriceDTO priceDTO = this.price;
            TextDTO textDTO = this.text;
            StringBuilder sb2 = new StringBuilder("ContentItem(gapBefore=");
            sb2.append(num);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", text=");
            return b.e(sb2, textDTO, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_INVALID", "THEME_NO_BORDER", "THEME_BORDER", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        @i(name = "THEME_INVALID")
        public static final Theme THEME_INVALID = new Theme("THEME_INVALID", 0);

        @i(name = "THEME_NO_BORDER")
        public static final Theme THEME_NO_BORDER = new Theme("THEME_NO_BORDER", 1);

        @i(name = "THEME_BORDER")
        public static final Theme THEME_BORDER = new Theme("THEME_BORDER", 2);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{THEME_INVALID, THEME_NO_BORDER, THEME_BORDER};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Theme(String str, int i11) {
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    public ShelfCardDTO(@NotNull Gallery gallery, FavoriteProductMoleculeV4 favoriteProductMoleculeV4, @NotNull List<ContentItem> contentList, CommonControlSettings commonControlSettings, Theme theme) {
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        this.gallery = gallery;
        this.favoriteButton = favoriteProductMoleculeV4;
        this.contentList = contentList;
        this.common = commonControlSettings;
        this.theme = theme;
    }

    public static /* synthetic */ ShelfCardDTO copy$default(ShelfCardDTO shelfCardDTO, Gallery gallery, FavoriteProductMoleculeV4 favoriteProductMoleculeV4, List list, CommonControlSettings commonControlSettings, Theme theme, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gallery = shelfCardDTO.gallery;
        }
        if ((i11 & 2) != 0) {
            favoriteProductMoleculeV4 = shelfCardDTO.favoriteButton;
        }
        if ((i11 & 4) != 0) {
            list = shelfCardDTO.contentList;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = shelfCardDTO.common;
        }
        if ((i11 & 16) != 0) {
            theme = shelfCardDTO.theme;
        }
        Theme theme2 = theme;
        List list2 = list;
        return shelfCardDTO.copy(gallery, favoriteProductMoleculeV4, list2, commonControlSettings, theme2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Gallery getGallery() {
        return this.gallery;
    }

    /* renamed from: component2, reason: from getter */
    public final FavoriteProductMoleculeV4 getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final List<ContentItem> component3() {
        return this.contentList;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component5, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    @NotNull
    public final ShelfCardDTO copy(@NotNull Gallery gallery, FavoriteProductMoleculeV4 favoriteButton, @NotNull List<ContentItem> contentList, CommonControlSettings common, Theme theme) {
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        return new ShelfCardDTO(gallery, favoriteButton, contentList, common, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShelfCardDTO)) {
            return false;
        }
        ShelfCardDTO shelfCardDTO = (ShelfCardDTO) other;
        return Intrinsics.d(this.gallery, shelfCardDTO.gallery) && Intrinsics.d(this.favoriteButton, shelfCardDTO.favoriteButton) && Intrinsics.d(this.contentList, shelfCardDTO.contentList) && Intrinsics.d(this.common, shelfCardDTO.common) && this.theme == shelfCardDTO.theme;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final List<ContentItem> getContentList() {
        return this.contentList;
    }

    public final FavoriteProductMoleculeV4 getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final Gallery getGallery() {
        return this.gallery;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = this.gallery.hashCode() * 31;
        FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = this.favoriteButton;
        int b11 = g.b((hashCode + (favoriteProductMoleculeV4 == null ? 0 : favoriteProductMoleculeV4.hashCode())) * 31, 31, this.contentList);
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (b11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Theme theme = this.theme;
        return hashCode2 + (theme != null ? theme.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ShelfCardDTO(gallery=" + this.gallery + ", favoriteButton=" + this.favoriteButton + ", contentList=" + this.contentList + ", common=" + this.common + ", theme=" + this.theme + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Gallery;", "", "images", "", "", "topBadges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bottomBadges", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "getTopBadges", "getBottomBadges", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gallery {
        public static final int $stable = 8;

        @NotNull
        private final List<BadgeDTO> bottomBadges;

        @NotNull
        private final List<String> images;

        @NotNull
        private final List<BadgeDTO> topBadges;

        public Gallery(@NotNull List<String> images, @NotNull List<BadgeDTO> topBadges, @NotNull List<BadgeDTO> bottomBadges) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(topBadges, "topBadges");
            Intrinsics.checkNotNullParameter(bottomBadges, "bottomBadges");
            this.images = images;
            this.topBadges = topBadges;
            this.bottomBadges = bottomBadges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gallery copy$default(Gallery gallery, List list, List list2, List list3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = gallery.images;
            }
            if ((i11 & 2) != 0) {
                list2 = gallery.topBadges;
            }
            if ((i11 & 4) != 0) {
                list3 = gallery.bottomBadges;
            }
            return gallery.copy(list, list2, list3);
        }

        @NotNull
        public final List<String> component1() {
            return this.images;
        }

        @NotNull
        public final List<BadgeDTO> component2() {
            return this.topBadges;
        }

        @NotNull
        public final List<BadgeDTO> component3() {
            return this.bottomBadges;
        }

        @NotNull
        public final Gallery copy(@NotNull List<String> images, @NotNull List<BadgeDTO> topBadges, @NotNull List<BadgeDTO> bottomBadges) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(topBadges, "topBadges");
            Intrinsics.checkNotNullParameter(bottomBadges, "bottomBadges");
            return new Gallery(images, topBadges, bottomBadges);
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
        public final List<String> getImages() {
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
            List<String> list = this.images;
            List<BadgeDTO> list2 = this.topBadges;
            return C2618u.h(c.d("Gallery(images=", list, ", topBadges=", ", bottomBadges=", list2), this.bottomBadges, ")");
        }

        public Gallery(List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? K.f71697a : list2, (i11 & 4) != 0 ? K.f71697a : list3);
        }
    }

    public ShelfCardDTO(Gallery gallery, FavoriteProductMoleculeV4 favoriteProductMoleculeV4, List list, CommonControlSettings commonControlSettings, Theme theme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(gallery, favoriteProductMoleculeV4, (i11 & 4) != 0 ? K.f71697a : list, commonControlSettings, theme);
    }
}
