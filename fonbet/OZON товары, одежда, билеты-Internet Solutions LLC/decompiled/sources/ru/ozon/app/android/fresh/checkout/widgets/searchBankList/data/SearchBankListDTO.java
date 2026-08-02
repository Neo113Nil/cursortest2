package ru.ozon.app.android.fresh.checkout.widgets.searchBankList.data;

import B0.A0;
import GR.b;
import T7.P;
import Tl.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u000212BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003Ji\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO;", "", "searchBar", "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "sectionHeader", "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "emptyText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "elementsCell", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;)V", "getSearchBar", "()Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSectionHeader", "()Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;", "getRestriction", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getEmptyText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getElementsCell", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SectionHeader", "SearchBar", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchBankListDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconButtonV3DTO closeButton;
    private final List<CellDTO> elementsCell;
    private final TextDTO emptyText;
    private final NotificationDTO restriction;

    @NotNull
    private final SearchBar searchBar;

    @NotNull
    private final SectionHeader sectionHeader;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;", "", HammersV3BodyDTO.PLACEHOLDER, "", "<init>", "(Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchBar {
        public static final int $stable = 0;

        @NotNull
        private final String placeholder;

        public SearchBar(@NotNull String placeholder) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.placeholder = placeholder;
        }

        public static /* synthetic */ SearchBar copy$default(SearchBar searchBar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = searchBar.placeholder;
            }
            return searchBar.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final SearchBar copy(@NotNull String placeholder) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new SearchBar(placeholder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchBar) && Intrinsics.d(this.placeholder, ((SearchBar) other).placeholder);
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.placeholder.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("SearchBar(placeholder=", this.placeholder, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionHeader {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final TextDTO text;

        public SectionHeader(@NotNull TextDTO text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.backgroundColor = str;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, TextDTO textDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = sectionHeader.text;
            }
            if ((i11 & 2) != 0) {
                str = sectionHeader.backgroundColor;
            }
            return sectionHeader.copy(textDTO, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final SectionHeader copy(@NotNull TextDTO text, String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new SectionHeader(text, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionHeader)) {
                return false;
            }
            SectionHeader sectionHeader = (SectionHeader) other;
            return Intrinsics.d(this.text, sectionHeader.text) && Intrinsics.d(this.backgroundColor, sectionHeader.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "SectionHeader(text=" + this.text + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    public SearchBankListDTO(@NotNull SearchBar searchBar, @NotNull IconButtonV3DTO closeButton, @NotNull SectionHeader sectionHeader, NotificationDTO notificationDTO, TextDTO textDTO, List<CellDTO> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(searchBar, "searchBar");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(sectionHeader, "sectionHeader");
        this.searchBar = searchBar;
        this.closeButton = closeButton;
        this.sectionHeader = sectionHeader;
        this.restriction = notificationDTO;
        this.emptyText = textDTO;
        this.elementsCell = list;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SearchBankListDTO copy$default(SearchBankListDTO searchBankListDTO, SearchBar searchBar, IconButtonV3DTO iconButtonV3DTO, SectionHeader sectionHeader, NotificationDTO notificationDTO, TextDTO textDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            searchBar = searchBankListDTO.searchBar;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = searchBankListDTO.closeButton;
        }
        if ((i11 & 4) != 0) {
            sectionHeader = searchBankListDTO.sectionHeader;
        }
        if ((i11 & 8) != 0) {
            notificationDTO = searchBankListDTO.restriction;
        }
        if ((i11 & 16) != 0) {
            textDTO = searchBankListDTO.emptyText;
        }
        if ((i11 & 32) != 0) {
            list = searchBankListDTO.elementsCell;
        }
        if ((i11 & 64) != 0) {
            map = searchBankListDTO.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        TextDTO textDTO2 = textDTO;
        SectionHeader sectionHeader2 = sectionHeader;
        return searchBankListDTO.copy(searchBar, iconButtonV3DTO, sectionHeader2, notificationDTO, textDTO2, list2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SearchBar getSearchBar() {
        return this.searchBar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SectionHeader getSectionHeader() {
        return this.sectionHeader;
    }

    /* renamed from: component4, reason: from getter */
    public final NotificationDTO getRestriction() {
        return this.restriction;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getEmptyText() {
        return this.emptyText;
    }

    public final List<CellDTO> component6() {
        return this.elementsCell;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final SearchBankListDTO copy(@NotNull SearchBar searchBar, @NotNull IconButtonV3DTO closeButton, @NotNull SectionHeader sectionHeader, NotificationDTO restriction, TextDTO emptyText, List<CellDTO> elementsCell, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(searchBar, "searchBar");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(sectionHeader, "sectionHeader");
        return new SearchBankListDTO(searchBar, closeButton, sectionHeader, restriction, emptyText, elementsCell, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBankListDTO)) {
            return false;
        }
        SearchBankListDTO searchBankListDTO = (SearchBankListDTO) other;
        return Intrinsics.d(this.searchBar, searchBankListDTO.searchBar) && Intrinsics.d(this.closeButton, searchBankListDTO.closeButton) && Intrinsics.d(this.sectionHeader, searchBankListDTO.sectionHeader) && Intrinsics.d(this.restriction, searchBankListDTO.restriction) && Intrinsics.d(this.emptyText, searchBankListDTO.emptyText) && Intrinsics.d(this.elementsCell, searchBankListDTO.elementsCell) && Intrinsics.d(this.trackingInfo, searchBankListDTO.trackingInfo);
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final List<CellDTO> getElementsCell() {
        return this.elementsCell;
    }

    public final TextDTO getEmptyText() {
        return this.emptyText;
    }

    public final NotificationDTO getRestriction() {
        return this.restriction;
    }

    @NotNull
    public final SearchBar getSearchBar() {
        return this.searchBar;
    }

    @NotNull
    public final SectionHeader getSectionHeader() {
        return this.sectionHeader;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.sectionHeader.hashCode() + b.c(this.closeButton, this.searchBar.hashCode() * 31, 31)) * 31;
        NotificationDTO notificationDTO = this.restriction;
        int hashCode2 = (hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        TextDTO textDTO = this.emptyText;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<CellDTO> list = this.elementsCell;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SearchBar searchBar = this.searchBar;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        SectionHeader sectionHeader = this.sectionHeader;
        NotificationDTO notificationDTO = this.restriction;
        TextDTO textDTO = this.emptyText;
        List<CellDTO> list = this.elementsCell;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SearchBankListDTO(searchBar=");
        sb2.append(searchBar);
        sb2.append(", closeButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", sectionHeader=");
        sb2.append(sectionHeader);
        sb2.append(", restriction=");
        sb2.append(notificationDTO);
        sb2.append(", emptyText=");
        a.e(sb2, textDTO, ", elementsCell=", list, ", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
