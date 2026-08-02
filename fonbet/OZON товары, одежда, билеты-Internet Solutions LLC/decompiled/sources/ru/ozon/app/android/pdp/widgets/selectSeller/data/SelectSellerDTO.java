package ru.ozon.app.android.pdp.widgets.selectSeller.data;

import I0.C3173b;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00017Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/data/SelectSellerDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rating", "Lru/ozon/app/android/pdp/widgets/selectSeller/data/SelectSellerDTO$Rating;", "subtitle", "favoriteButton", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "chatButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "backgroundColor", "", "templateLink", "placeholderValue", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/selectSeller/data/SelectSellerDTO$Rating;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRating", "()Lru/ozon/app/android/pdp/widgets/selectSeller/data/SelectSellerDTO$Rating;", "getSubtitle", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "getChatButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBackgroundColor", "()Ljava/lang/String;", "getTemplateLink", "getPlaceholderValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "Rating", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectSellerDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final IconButtonV3DTO chatButton;
    private final CommonControlSettings common;
    private final SisBrandFavoriteButton favoriteButton;

    @NotNull
    private final IconDTO icon;
    private final String placeholderValue;
    private final Rating rating;
    private final TextDTO subtitle;
    private final String templateLink;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/data/SelectSellerDTO$Rating;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rating {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO title;

        public Rating(@NotNull IconDTO icon, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
        }

        public static /* synthetic */ Rating copy$default(Rating rating, IconDTO iconDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = rating.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = rating.title;
            }
            return rating.copy(iconDTO, textDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final Rating copy(@NotNull IconDTO icon, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Rating(icon, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) other;
            return Intrinsics.d(this.icon, rating.icon) && Intrinsics.d(this.title, rating.title);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Rating(icon=" + this.icon + ", title=" + this.title + ")";
        }
    }

    public SelectSellerDTO(@NotNull IconDTO icon, @NotNull TextDTO title, Rating rating, TextDTO textDTO, SisBrandFavoriteButton sisBrandFavoriteButton, IconButtonV3DTO iconButtonV3DTO, CommonControlSettings commonControlSettings, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.rating = rating;
        this.subtitle = textDTO;
        this.favoriteButton = sisBrandFavoriteButton;
        this.chatButton = iconButtonV3DTO;
        this.common = commonControlSettings;
        this.backgroundColor = str;
        this.templateLink = str2;
        this.placeholderValue = str3;
    }

    public static /* synthetic */ SelectSellerDTO copy$default(SelectSellerDTO selectSellerDTO, IconDTO iconDTO, TextDTO textDTO, Rating rating, TextDTO textDTO2, SisBrandFavoriteButton sisBrandFavoriteButton, IconButtonV3DTO iconButtonV3DTO, CommonControlSettings commonControlSettings, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = selectSellerDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = selectSellerDTO.title;
        }
        if ((i11 & 4) != 0) {
            rating = selectSellerDTO.rating;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = selectSellerDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            sisBrandFavoriteButton = selectSellerDTO.favoriteButton;
        }
        if ((i11 & 32) != 0) {
            iconButtonV3DTO = selectSellerDTO.chatButton;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = selectSellerDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = selectSellerDTO.backgroundColor;
        }
        if ((i11 & 256) != 0) {
            str2 = selectSellerDTO.templateLink;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str3 = selectSellerDTO.placeholderValue;
        }
        String str4 = str2;
        String str5 = str3;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str6 = str;
        SisBrandFavoriteButton sisBrandFavoriteButton2 = sisBrandFavoriteButton;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        return selectSellerDTO.copy(iconDTO, textDTO, rating, textDTO2, sisBrandFavoriteButton2, iconButtonV3DTO2, commonControlSettings2, str6, str4, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPlaceholderValue() {
        return this.placeholderValue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Rating getRating() {
        return this.rating;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    /* renamed from: component6, reason: from getter */
    public final IconButtonV3DTO getChatButton() {
        return this.chatButton;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTemplateLink() {
        return this.templateLink;
    }

    @NotNull
    public final SelectSellerDTO copy(@NotNull IconDTO icon, @NotNull TextDTO title, Rating rating, TextDTO subtitle, SisBrandFavoriteButton favoriteButton, IconButtonV3DTO chatButton, CommonControlSettings common, String backgroundColor, String templateLink, String placeholderValue) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        return new SelectSellerDTO(icon, title, rating, subtitle, favoriteButton, chatButton, common, backgroundColor, templateLink, placeholderValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectSellerDTO)) {
            return false;
        }
        SelectSellerDTO selectSellerDTO = (SelectSellerDTO) other;
        return Intrinsics.d(this.icon, selectSellerDTO.icon) && Intrinsics.d(this.title, selectSellerDTO.title) && Intrinsics.d(this.rating, selectSellerDTO.rating) && Intrinsics.d(this.subtitle, selectSellerDTO.subtitle) && Intrinsics.d(this.favoriteButton, selectSellerDTO.favoriteButton) && Intrinsics.d(this.chatButton, selectSellerDTO.chatButton) && Intrinsics.d(this.common, selectSellerDTO.common) && Intrinsics.d(this.backgroundColor, selectSellerDTO.backgroundColor) && Intrinsics.d(this.templateLink, selectSellerDTO.templateLink) && Intrinsics.d(this.placeholderValue, selectSellerDTO.placeholderValue);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconButtonV3DTO getChatButton() {
        return this.chatButton;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final String getPlaceholderValue() {
        return this.placeholderValue;
    }

    public final Rating getRating() {
        return this.rating;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final String getTemplateLink() {
        return this.templateLink;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
        Rating rating = this.rating;
        int hashCode = (a11 + (rating == null ? 0 : rating.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        int hashCode3 = (hashCode2 + (sisBrandFavoriteButton == null ? 0 : sisBrandFavoriteButton.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.chatButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode5 = (hashCode4 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.templateLink;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholderValue;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        Rating rating = this.rating;
        TextDTO textDTO2 = this.subtitle;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        IconButtonV3DTO iconButtonV3DTO = this.chatButton;
        CommonControlSettings commonControlSettings = this.common;
        String str = this.backgroundColor;
        String str2 = this.templateLink;
        String str3 = this.placeholderValue;
        StringBuilder i11 = Bi.b.i("SelectSellerDTO(icon=", ", title=", ", rating=", iconDTO, textDTO);
        i11.append(rating);
        i11.append(", subtitle=");
        i11.append(textDTO2);
        i11.append(", favoriteButton=");
        i11.append(sisBrandFavoriteButton);
        i11.append(", chatButton=");
        i11.append(iconButtonV3DTO);
        i11.append(", common=");
        i11.append(commonControlSettings);
        i11.append(", backgroundColor=");
        i11.append(str);
        i11.append(", templateLink=");
        return C3173b.c(i11, str2, ", placeholderValue=", str3, ")");
    }
}
