package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.data;

import B90.C2619v;
import Ih.a;
import J.d;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "offers", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferDTO$OfferDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOffers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OfferDTO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServicesOfferDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<OfferDTO> offers;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferDTO$OfferDTO;", "", "offerIconLink", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "offerTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "offerSubtitle", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "directIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getOfferIconLink", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getOfferTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOfferSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getDirectIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OfferDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final Badge badge;
        private final Icon directIcon;

        @NotNull
        private final ThemeImageV1DTO offerIconLink;
        private final TextAtom offerSubtitle;

        @NotNull
        private final TextAtom offerTitle;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public OfferDTO(@NotNull ThemeImageV1DTO offerIconLink, @NotNull TextAtom offerTitle, TextAtom textAtom, Badge badge, Icon icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(offerIconLink, "offerIconLink");
            Intrinsics.checkNotNullParameter(offerTitle, "offerTitle");
            Intrinsics.checkNotNullParameter(action, "action");
            this.offerIconLink = offerIconLink;
            this.offerTitle = offerTitle;
            this.offerSubtitle = textAtom;
            this.badge = badge;
            this.directIcon = icon;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ OfferDTO copy$default(OfferDTO offerDTO, ThemeImageV1DTO themeImageV1DTO, TextAtom textAtom, TextAtom textAtom2, Badge badge, Icon icon, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                themeImageV1DTO = offerDTO.offerIconLink;
            }
            if ((i11 & 2) != 0) {
                textAtom = offerDTO.offerTitle;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = offerDTO.offerSubtitle;
            }
            if ((i11 & 8) != 0) {
                badge = offerDTO.badge;
            }
            if ((i11 & 16) != 0) {
                icon = offerDTO.directIcon;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = offerDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = offerDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            Icon icon2 = icon;
            TextAtom textAtom3 = textAtom2;
            return offerDTO.copy(themeImageV1DTO, textAtom, textAtom3, badge, icon2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ThemeImageV1DTO getOfferIconLink() {
            return this.offerIconLink;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getOfferTitle() {
            return this.offerTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getOfferSubtitle() {
            return this.offerSubtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component5, reason: from getter */
        public final Icon getDirectIcon() {
            return this.directIcon;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final OfferDTO copy(@NotNull ThemeImageV1DTO offerIconLink, @NotNull TextAtom offerTitle, TextAtom offerSubtitle, Badge badge, Icon directIcon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(offerIconLink, "offerIconLink");
            Intrinsics.checkNotNullParameter(offerTitle, "offerTitle");
            Intrinsics.checkNotNullParameter(action, "action");
            return new OfferDTO(offerIconLink, offerTitle, offerSubtitle, badge, directIcon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfferDTO)) {
                return false;
            }
            OfferDTO offerDTO = (OfferDTO) other;
            return Intrinsics.d(this.offerIconLink, offerDTO.offerIconLink) && Intrinsics.d(this.offerTitle, offerDTO.offerTitle) && Intrinsics.d(this.offerSubtitle, offerDTO.offerSubtitle) && Intrinsics.d(this.badge, offerDTO.badge) && Intrinsics.d(this.directIcon, offerDTO.directIcon) && Intrinsics.d(this.action, offerDTO.action) && Intrinsics.d(this.trackingInfo, offerDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final Icon getDirectIcon() {
            return this.directIcon;
        }

        @NotNull
        public final ThemeImageV1DTO getOfferIconLink() {
            return this.offerIconLink;
        }

        public final TextAtom getOfferSubtitle() {
            return this.offerSubtitle;
        }

        @NotNull
        public final TextAtom getOfferTitle() {
            return this.offerTitle;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.offerIconLink.hashCode() * 31, 31, this.offerTitle);
            TextAtom textAtom = this.offerSubtitle;
            int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Badge badge = this.badge;
            int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
            Icon icon = this.directIcon;
            int b12 = a.b(this.action, (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b12 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ThemeImageV1DTO themeImageV1DTO = this.offerIconLink;
            TextAtom textAtom = this.offerTitle;
            TextAtom textAtom2 = this.offerSubtitle;
            Badge badge = this.badge;
            Icon icon = this.directIcon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("OfferDTO(offerIconLink=");
            sb2.append(themeImageV1DTO);
            sb2.append(", offerTitle=");
            sb2.append(textAtom);
            sb2.append(", offerSubtitle=");
            sb2.append(textAtom2);
            sb2.append(", badge=");
            sb2.append(badge);
            sb2.append(", directIcon=");
            sb2.append(icon);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public AdditionalServicesOfferDTO(@NotNull TextAtom title, @NotNull List<OfferDTO> offers) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(offers, "offers");
        this.title = title;
        this.offers = offers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdditionalServicesOfferDTO copy$default(AdditionalServicesOfferDTO additionalServicesOfferDTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = additionalServicesOfferDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = additionalServicesOfferDTO.offers;
        }
        return additionalServicesOfferDTO.copy(textAtom, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<OfferDTO> component2() {
        return this.offers;
    }

    @NotNull
    public final AdditionalServicesOfferDTO copy(@NotNull TextAtom title, @NotNull List<OfferDTO> offers) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(offers, "offers");
        return new AdditionalServicesOfferDTO(title, offers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesOfferDTO)) {
            return false;
        }
        AdditionalServicesOfferDTO additionalServicesOfferDTO = (AdditionalServicesOfferDTO) other;
        return Intrinsics.d(this.title, additionalServicesOfferDTO.title) && Intrinsics.d(this.offers, additionalServicesOfferDTO.offers);
    }

    @NotNull
    public final List<OfferDTO> getOffers() {
        return this.offers;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.offers.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return d.c("AdditionalServicesOfferDTO(title=", this.title, ", offers=", this.offers, ")");
    }
}
