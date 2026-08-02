package ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data;

import B90.C2619v;
import Co.a;
import Fm.C3051a;
import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001>B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0091\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "price", "Lru/ozon/uni/atoms/data/price/Price;", "priceSubtitle", "imageURL", "", "backgroundImageColor", "serviceAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "disclosureIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "details", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO$DetailDTO;", "emptyState", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPriceSubtitle", "getImageURL", "()Ljava/lang/String;", "getBackgroundImageColor", "getServiceAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDisclosureIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTrackingInfo", "()Ljava/util/Map;", "getDetails", "()Ljava/util/List;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "DetailDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalServiceCardDTO {
    public static final int $stable = 8;
    private final String backgroundImageColor;

    @NotNull
    private final List<DetailDTO> details;

    @NotNull
    private final Icon disclosureIcon;
    private final EmptyStateDTO emptyState;

    @NotNull
    private final String imageURL;

    @NotNull
    private final Price price;

    @NotNull
    private final TextAtom priceSubtitle;

    @NotNull
    private final AtomActionDTO serviceAction;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO$DetailDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "content", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailDTO {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom content;

        @NotNull
        private final TextAtom title;

        public DetailDTO(@NotNull TextAtom title, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.content = textAtom;
        }

        public static /* synthetic */ DetailDTO copy$default(DetailDTO detailDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = detailDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = detailDTO.content;
            }
            return detailDTO.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getContent() {
            return this.content;
        }

        @NotNull
        public final DetailDTO copy(@NotNull TextAtom title, TextAtom content) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new DetailDTO(title, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DetailDTO)) {
                return false;
            }
            DetailDTO detailDTO = (DetailDTO) other;
            return Intrinsics.d(this.title, detailDTO.title) && Intrinsics.d(this.content, detailDTO.content);
        }

        public final TextAtom getContent() {
            return this.content;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.content;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return a.a("DetailDTO(title=", this.title, ", content=", this.content, ")");
        }
    }

    public AdditionalServiceCardDTO(@NotNull TextAtom title, TextAtom textAtom, @NotNull Price price, @NotNull TextAtom priceSubtitle, @NotNull String imageURL, String str, @NotNull AtomActionDTO serviceAction, @NotNull Icon disclosureIcon, Map<String, TokenizedTrackingInfo> map, @NotNull List<DetailDTO> details, EmptyStateDTO emptyStateDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceSubtitle, "priceSubtitle");
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(serviceAction, "serviceAction");
        Intrinsics.checkNotNullParameter(disclosureIcon, "disclosureIcon");
        Intrinsics.checkNotNullParameter(details, "details");
        this.title = title;
        this.subtitle = textAtom;
        this.price = price;
        this.priceSubtitle = priceSubtitle;
        this.imageURL = imageURL;
        this.backgroundImageColor = str;
        this.serviceAction = serviceAction;
        this.disclosureIcon = disclosureIcon;
        this.trackingInfo = map;
        this.details = details;
        this.emptyState = emptyStateDTO;
    }

    public static /* synthetic */ AdditionalServiceCardDTO copy$default(AdditionalServiceCardDTO additionalServiceCardDTO, TextAtom textAtom, TextAtom textAtom2, Price price, TextAtom textAtom3, String str, String str2, AtomActionDTO atomActionDTO, Icon icon, Map map, List list, EmptyStateDTO emptyStateDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = additionalServiceCardDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = additionalServiceCardDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            price = additionalServiceCardDTO.price;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = additionalServiceCardDTO.priceSubtitle;
        }
        if ((i11 & 16) != 0) {
            str = additionalServiceCardDTO.imageURL;
        }
        if ((i11 & 32) != 0) {
            str2 = additionalServiceCardDTO.backgroundImageColor;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = additionalServiceCardDTO.serviceAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            icon = additionalServiceCardDTO.disclosureIcon;
        }
        if ((i11 & 256) != 0) {
            map = additionalServiceCardDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list = additionalServiceCardDTO.details;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            emptyStateDTO = additionalServiceCardDTO.emptyState;
        }
        List list2 = list;
        EmptyStateDTO emptyStateDTO2 = emptyStateDTO;
        Icon icon2 = icon;
        Map map2 = map;
        String str3 = str2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str4 = str;
        Price price2 = price;
        return additionalServiceCardDTO.copy(textAtom, textAtom2, price2, textAtom3, str4, str3, atomActionDTO2, icon2, map2, list2, emptyStateDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<DetailDTO> component10() {
        return this.details;
    }

    /* renamed from: component11, reason: from getter */
    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getPriceSubtitle() {
        return this.priceSubtitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundImageColor() {
        return this.backgroundImageColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getServiceAction() {
        return this.serviceAction;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Icon getDisclosureIcon() {
        return this.disclosureIcon;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final AdditionalServiceCardDTO copy(@NotNull TextAtom title, TextAtom subtitle, @NotNull Price price, @NotNull TextAtom priceSubtitle, @NotNull String imageURL, String backgroundImageColor, @NotNull AtomActionDTO serviceAction, @NotNull Icon disclosureIcon, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<DetailDTO> details, EmptyStateDTO emptyState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceSubtitle, "priceSubtitle");
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(serviceAction, "serviceAction");
        Intrinsics.checkNotNullParameter(disclosureIcon, "disclosureIcon");
        Intrinsics.checkNotNullParameter(details, "details");
        return new AdditionalServiceCardDTO(title, subtitle, price, priceSubtitle, imageURL, backgroundImageColor, serviceAction, disclosureIcon, trackingInfo, details, emptyState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServiceCardDTO)) {
            return false;
        }
        AdditionalServiceCardDTO additionalServiceCardDTO = (AdditionalServiceCardDTO) other;
        return Intrinsics.d(this.title, additionalServiceCardDTO.title) && Intrinsics.d(this.subtitle, additionalServiceCardDTO.subtitle) && Intrinsics.d(this.price, additionalServiceCardDTO.price) && Intrinsics.d(this.priceSubtitle, additionalServiceCardDTO.priceSubtitle) && Intrinsics.d(this.imageURL, additionalServiceCardDTO.imageURL) && Intrinsics.d(this.backgroundImageColor, additionalServiceCardDTO.backgroundImageColor) && Intrinsics.d(this.serviceAction, additionalServiceCardDTO.serviceAction) && Intrinsics.d(this.disclosureIcon, additionalServiceCardDTO.disclosureIcon) && Intrinsics.d(this.trackingInfo, additionalServiceCardDTO.trackingInfo) && Intrinsics.d(this.details, additionalServiceCardDTO.details) && Intrinsics.d(this.emptyState, additionalServiceCardDTO.emptyState);
    }

    public final String getBackgroundImageColor() {
        return this.backgroundImageColor;
    }

    @NotNull
    public final List<DetailDTO> getDetails() {
        return this.details;
    }

    @NotNull
    public final Icon getDisclosureIcon() {
        return this.disclosureIcon;
    }

    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    public final TextAtom getPriceSubtitle() {
        return this.priceSubtitle;
    }

    @NotNull
    public final AtomActionDTO getServiceAction() {
        return this.serviceAction;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.subtitle;
        int a11 = g.a(C2619v.b(C3051a.a(this.price, (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31, this.priceSubtitle), 31, this.imageURL);
        String str = this.backgroundImageColor;
        int a12 = Lc.a.a(this.disclosureIcon, Ih.a.b(this.serviceAction, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int b11 = g.b((a12 + (map == null ? 0 : map.hashCode())) * 31, 31, this.details);
        EmptyStateDTO emptyStateDTO = this.emptyState;
        return b11 + (emptyStateDTO != null ? emptyStateDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        Price price = this.price;
        TextAtom textAtom3 = this.priceSubtitle;
        String str = this.imageURL;
        String str2 = this.backgroundImageColor;
        AtomActionDTO atomActionDTO = this.serviceAction;
        Icon icon = this.disclosureIcon;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<DetailDTO> list = this.details;
        EmptyStateDTO emptyStateDTO = this.emptyState;
        StringBuilder a11 = HY.a.a("AdditionalServiceCardDTO(title=", textAtom, ", subtitle=", textAtom2, ", price=");
        a11.append(price);
        a11.append(", priceSubtitle=");
        a11.append(textAtom3);
        a11.append(", imageURL=");
        Nh.a.h(a11, str, ", backgroundImageColor=", str2, ", serviceAction=");
        a11.append(atomActionDTO);
        a11.append(", disclosureIcon=");
        a11.append(icon);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(", details=");
        a11.append(list);
        a11.append(", emptyState=");
        a11.append(emptyStateDTO);
        a11.append(")");
        return a11.toString();
    }

    public AdditionalServiceCardDTO(TextAtom textAtom, TextAtom textAtom2, Price price, TextAtom textAtom3, String str, String str2, AtomActionDTO atomActionDTO, Icon icon, Map map, List list, EmptyStateDTO emptyStateDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, price, textAtom3, str, str2, atomActionDTO, icon, map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? K.f71697a : list, emptyStateDTO);
    }
}
