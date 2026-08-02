package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.data;

import G.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.ProductMediaDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO;", "", "purchases", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Purchases;", "bonuses", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Bonuses;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Purchases;Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Bonuses;Ljava/util/Map;)V", "getPurchases", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Purchases;", "getBonuses", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Bonuses;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Purchases", "Bonuses", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProfileTilesDTO {
    public static final int $stable = 8;

    @NotNull
    private final Bonuses bonuses;

    @NotNull
    private final Purchases purchases;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Bonuses;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Ljava/lang/String;", "getBadges", "()Ljava/util/List;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bonuses {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<BadgeDTO> badges;
        private final CommonControlSettings common;
        private final CornerRadius cornerRadius;

        @NotNull
        private final String image;

        @NotNull
        private final TextDTO title;

        public Bonuses(@NotNull TextDTO title, @NotNull String image, @NotNull List<BadgeDTO> badges, CornerRadius cornerRadius, String str, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.title = title;
            this.image = image;
            this.badges = badges;
            this.cornerRadius = cornerRadius;
            this.backgroundColor = str;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ Bonuses copy$default(Bonuses bonuses, TextDTO textDTO, String str, List list, CornerRadius cornerRadius, String str2, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = bonuses.title;
            }
            if ((i11 & 2) != 0) {
                str = bonuses.image;
            }
            if ((i11 & 4) != 0) {
                list = bonuses.badges;
            }
            if ((i11 & 8) != 0) {
                cornerRadius = bonuses.cornerRadius;
            }
            if ((i11 & 16) != 0) {
                str2 = bonuses.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = bonuses.common;
            }
            String str3 = str2;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return bonuses.copy(textDTO, str, list, cornerRadius, str3, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final List<BadgeDTO> component3() {
            return this.badges;
        }

        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Bonuses copy(@NotNull TextDTO title, @NotNull String image, @NotNull List<BadgeDTO> badges, CornerRadius cornerRadius, String backgroundColor, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badges, "badges");
            return new Bonuses(title, image, badges, cornerRadius, backgroundColor, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bonuses)) {
                return false;
            }
            Bonuses bonuses = (Bonuses) other;
            return Intrinsics.d(this.title, bonuses.title) && Intrinsics.d(this.image, bonuses.image) && Intrinsics.d(this.badges, bonuses.badges) && this.cornerRadius == bonuses.cornerRadius && Intrinsics.d(this.backgroundColor, bonuses.backgroundColor) && Intrinsics.d(this.common, bonuses.common);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = g.b(g.a(this.title.hashCode() * 31, 31, this.image), 31, this.badges);
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode = (b11 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.image;
            List<BadgeDTO> list = this.badges;
            CornerRadius cornerRadius = this.cornerRadius;
            String str2 = this.backgroundColor;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder f7 = D3.g.f("Bonuses(title=", textDTO, ", image=", str, ", badges=");
            f7.append(list);
            f7.append(", cornerRadius=");
            f7.append(cornerRadius);
            f7.append(", backgroundColor=");
            f7.append(str2);
            f7.append(", common=");
            f7.append(commonControlSettings);
            f7.append(")");
            return f7.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/data/ProfileTilesDTO$Purchases;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "productMedia", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "", "tagButton", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getProductMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "()Ljava/lang/String;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Purchases {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final CommonControlSettings common;
        private final CornerRadius cornerRadius;

        @NotNull
        private final ProductMediaDTO productMedia;
        private final TagButtonDTO tagButton;

        @NotNull
        private final TextDTO title;

        public Purchases(@NotNull TextDTO title, @NotNull ProductMediaDTO productMedia, CornerRadius cornerRadius, String str, TagButtonDTO tagButtonDTO, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(productMedia, "productMedia");
            this.title = title;
            this.productMedia = productMedia;
            this.cornerRadius = cornerRadius;
            this.backgroundColor = str;
            this.tagButton = tagButtonDTO;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ Purchases copy$default(Purchases purchases, TextDTO textDTO, ProductMediaDTO productMediaDTO, CornerRadius cornerRadius, String str, TagButtonDTO tagButtonDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = purchases.title;
            }
            if ((i11 & 2) != 0) {
                productMediaDTO = purchases.productMedia;
            }
            if ((i11 & 4) != 0) {
                cornerRadius = purchases.cornerRadius;
            }
            if ((i11 & 8) != 0) {
                str = purchases.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                tagButtonDTO = purchases.tagButton;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = purchases.common;
            }
            TagButtonDTO tagButtonDTO2 = tagButtonDTO;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return purchases.copy(textDTO, productMediaDTO, cornerRadius, str, tagButtonDTO2, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProductMediaDTO getProductMedia() {
            return this.productMedia;
        }

        /* renamed from: component3, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Purchases copy(@NotNull TextDTO title, @NotNull ProductMediaDTO productMedia, CornerRadius cornerRadius, String backgroundColor, TagButtonDTO tagButton, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(productMedia, "productMedia");
            return new Purchases(title, productMedia, cornerRadius, backgroundColor, tagButton, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Purchases)) {
                return false;
            }
            Purchases purchases = (Purchases) other;
            return Intrinsics.d(this.title, purchases.title) && Intrinsics.d(this.productMedia, purchases.productMedia) && this.cornerRadius == purchases.cornerRadius && Intrinsics.d(this.backgroundColor, purchases.backgroundColor) && Intrinsics.d(this.tagButton, purchases.tagButton) && Intrinsics.d(this.common, purchases.common);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final ProductMediaDTO getProductMedia() {
            return this.productMedia;
        }

        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.productMedia.hashCode() + (this.title.hashCode() * 31)) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TagButtonDTO tagButtonDTO = this.tagButton;
            int hashCode4 = (hashCode3 + (tagButtonDTO == null ? 0 : tagButtonDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode4 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Purchases(title=" + this.title + ", productMedia=" + this.productMedia + ", cornerRadius=" + this.cornerRadius + ", backgroundColor=" + this.backgroundColor + ", tagButton=" + this.tagButton + ", common=" + this.common + ")";
        }
    }

    public ProfileTilesDTO(@NotNull Purchases purchases, @NotNull Bonuses bonuses, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        this.purchases = purchases;
        this.bonuses = bonuses;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileTilesDTO copy$default(ProfileTilesDTO profileTilesDTO, Purchases purchases, Bonuses bonuses, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            purchases = profileTilesDTO.purchases;
        }
        if ((i11 & 2) != 0) {
            bonuses = profileTilesDTO.bonuses;
        }
        if ((i11 & 4) != 0) {
            map = profileTilesDTO.trackingInfo;
        }
        return profileTilesDTO.copy(purchases, bonuses, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Purchases getPurchases() {
        return this.purchases;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Bonuses getBonuses() {
        return this.bonuses;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProfileTilesDTO copy(@NotNull Purchases purchases, @NotNull Bonuses bonuses, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        return new ProfileTilesDTO(purchases, bonuses, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileTilesDTO)) {
            return false;
        }
        ProfileTilesDTO profileTilesDTO = (ProfileTilesDTO) other;
        return Intrinsics.d(this.purchases, profileTilesDTO.purchases) && Intrinsics.d(this.bonuses, profileTilesDTO.bonuses) && Intrinsics.d(this.trackingInfo, profileTilesDTO.trackingInfo);
    }

    @NotNull
    public final Bonuses getBonuses() {
        return this.bonuses;
    }

    @NotNull
    public final Purchases getPurchases() {
        return this.purchases;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.bonuses.hashCode() + (this.purchases.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        Purchases purchases = this.purchases;
        Bonuses bonuses = this.bonuses;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProfileTilesDTO(purchases=");
        sb2.append(purchases);
        sb2.append(", bonuses=");
        sb2.append(bonuses);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
