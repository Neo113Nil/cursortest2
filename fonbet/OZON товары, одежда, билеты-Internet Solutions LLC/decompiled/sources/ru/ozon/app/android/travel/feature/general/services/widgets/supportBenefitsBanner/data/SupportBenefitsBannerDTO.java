package ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.data;

import D3.g;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "leftCard", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO$CardItemDTO;", "rightCard", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO$CardItemDTO;Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO$CardItemDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLeftCard", "()Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO$CardItemDTO;", "getRightCard", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CardItemDTO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportBenefitsBannerDTO {
    public static final int $stable = 8;

    @NotNull
    private final CardItemDTO leftCard;

    @NotNull
    private final CardItemDTO rightCard;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO$CardItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardItemDTO {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;
        private final BadgeDTO badge;
        private final CommonControlSettings common;
        private final ImageDTO image;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public CardItemDTO(@NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, ImageDTO imageDTO, CommonControlSettings commonControlSettings, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.subtitle = textDTO;
            this.badge = badgeDTO;
            this.image = imageDTO;
            this.common = commonControlSettings;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ CardItemDTO copy$default(CardItemDTO cardItemDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, ImageDTO imageDTO, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = cardItemDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = cardItemDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = cardItemDTO.badge;
            }
            if ((i11 & 8) != 0) {
                imageDTO = cardItemDTO.image;
            }
            if ((i11 & 16) != 0) {
                commonControlSettings = cardItemDTO.common;
            }
            if ((i11 & 32) != 0) {
                str = cardItemDTO.backgroundColor;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            String str2 = str;
            return cardItemDTO.copy(textDTO, textDTO2, badgeDTO, imageDTO, commonControlSettings2, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CardItemDTO copy(@NotNull TextDTO title, TextDTO subtitle, BadgeDTO badge, ImageDTO image, CommonControlSettings common, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new CardItemDTO(title, subtitle, badge, image, common, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardItemDTO)) {
                return false;
            }
            CardItemDTO cardItemDTO = (CardItemDTO) other;
            return Intrinsics.d(this.title, cardItemDTO.title) && Intrinsics.d(this.subtitle, cardItemDTO.subtitle) && Intrinsics.d(this.badge, cardItemDTO.badge) && Intrinsics.d(this.image, cardItemDTO.image) && Intrinsics.d(this.common, cardItemDTO.common) && Intrinsics.d(this.backgroundColor, cardItemDTO.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            ImageDTO imageDTO = this.image;
            int hashCode4 = (hashCode3 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return this.backgroundColor.hashCode() + ((hashCode4 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            ImageDTO imageDTO = this.image;
            CommonControlSettings commonControlSettings = this.common;
            String str = this.backgroundColor;
            StringBuilder g10 = g.g("CardItemDTO(title=", textDTO, ", subtitle=", textDTO2, ", badge=");
            g10.append(badgeDTO);
            g10.append(", image=");
            g10.append(imageDTO);
            g10.append(", common=");
            g10.append(commonControlSettings);
            g10.append(", backgroundColor=");
            g10.append(str);
            g10.append(")");
            return g10.toString();
        }
    }

    public SupportBenefitsBannerDTO(@NotNull TextDTO title, @NotNull CardItemDTO leftCard, @NotNull CardItemDTO rightCard, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        Intrinsics.checkNotNullParameter(rightCard, "rightCard");
        this.title = title;
        this.leftCard = leftCard;
        this.rightCard = rightCard;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportBenefitsBannerDTO copy$default(SupportBenefitsBannerDTO supportBenefitsBannerDTO, TextDTO textDTO, CardItemDTO cardItemDTO, CardItemDTO cardItemDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = supportBenefitsBannerDTO.title;
        }
        if ((i11 & 2) != 0) {
            cardItemDTO = supportBenefitsBannerDTO.leftCard;
        }
        if ((i11 & 4) != 0) {
            cardItemDTO2 = supportBenefitsBannerDTO.rightCard;
        }
        if ((i11 & 8) != 0) {
            map = supportBenefitsBannerDTO.trackingInfo;
        }
        return supportBenefitsBannerDTO.copy(textDTO, cardItemDTO, cardItemDTO2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CardItemDTO getLeftCard() {
        return this.leftCard;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CardItemDTO getRightCard() {
        return this.rightCard;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final SupportBenefitsBannerDTO copy(@NotNull TextDTO title, @NotNull CardItemDTO leftCard, @NotNull CardItemDTO rightCard, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        Intrinsics.checkNotNullParameter(rightCard, "rightCard");
        return new SupportBenefitsBannerDTO(title, leftCard, rightCard, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportBenefitsBannerDTO)) {
            return false;
        }
        SupportBenefitsBannerDTO supportBenefitsBannerDTO = (SupportBenefitsBannerDTO) other;
        return Intrinsics.d(this.title, supportBenefitsBannerDTO.title) && Intrinsics.d(this.leftCard, supportBenefitsBannerDTO.leftCard) && Intrinsics.d(this.rightCard, supportBenefitsBannerDTO.rightCard) && Intrinsics.d(this.trackingInfo, supportBenefitsBannerDTO.trackingInfo);
    }

    @NotNull
    public final CardItemDTO getLeftCard() {
        return this.leftCard;
    }

    @NotNull
    public final CardItemDTO getRightCard() {
        return this.rightCard;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.rightCard.hashCode() + ((this.leftCard.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "SupportBenefitsBannerDTO(title=" + this.title + ", leftCard=" + this.leftCard + ", rightCard=" + this.rightCard + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
