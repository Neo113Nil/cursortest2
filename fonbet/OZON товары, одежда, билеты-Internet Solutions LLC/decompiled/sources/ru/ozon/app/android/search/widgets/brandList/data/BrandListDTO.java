package ru.ozon.app.android.search.widgets.brandList.data;

import Hj.C3143a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004!\"#$B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO;", "", "navBar", "Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;", "favorites", "Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$Section;", "sections", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$Section;Ljava/util/List;Ljava/util/Map;)V", "getNavBar", "()Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;", "getFavorites", "()Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$Section;", "getSections", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "NavBar", "SearchBar", "Section", "WrappedCell", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BrandListDTO {
    public static final int $stable = 8;

    @NotNull
    private final Section favorites;
    private final NavBar navBar;
    private final List<Section> sections;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;", "", "searchBar", "Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$SearchBar;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$SearchBar;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getSearchBar", "()Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$SearchBar;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBar {
        public static final int $stable;
        private final IconButtonV3DTO closeButton;
        private final SearchBar searchBar;

        static {
            int i11 = IconButtonV3DTO.$stable;
            int i12 = IconDTO.$stable;
            $stable = i11 | i12 | i12;
        }

        public NavBar(SearchBar searchBar, IconButtonV3DTO iconButtonV3DTO) {
            this.searchBar = searchBar;
            this.closeButton = iconButtonV3DTO;
        }

        public static /* synthetic */ NavBar copy$default(NavBar navBar, SearchBar searchBar, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                searchBar = navBar.searchBar;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = navBar.closeButton;
            }
            return navBar.copy(searchBar, iconButtonV3DTO);
        }

        /* renamed from: component1, reason: from getter */
        public final SearchBar getSearchBar() {
            return this.searchBar;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final NavBar copy(SearchBar searchBar, IconButtonV3DTO closeButton) {
            return new NavBar(searchBar, closeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBar)) {
                return false;
            }
            NavBar navBar = (NavBar) other;
            return Intrinsics.d(this.searchBar, navBar.searchBar) && Intrinsics.d(this.closeButton, navBar.closeButton);
        }

        public final IconButtonV3DTO getCloseButton() {
            return this.closeButton;
        }

        public final SearchBar getSearchBar() {
            return this.searchBar;
        }

        public int hashCode() {
            SearchBar searchBar = this.searchBar;
            int hashCode = (searchBar == null ? 0 : searchBar.hashCode()) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.closeButton;
            return hashCode + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NavBar(searchBar=" + this.searchBar + ", closeButton=" + this.closeButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$SearchBar;", "", HammersV3BodyDTO.PLACEHOLDER, "", "searchIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "crossIcon", "backgroundColor", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getPlaceholder", "()Ljava/lang/String;", "getSearchIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCrossIcon", "getBackgroundColor", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchBar {
        public static final int $stable = IconDTO.$stable;
        private final String backgroundColor;
        private final CornerRadius cornerRadius;
        private final IconDTO crossIcon;

        @NotNull
        private final String placeholder;
        private final IconDTO searchIcon;

        public SearchBar(@NotNull String placeholder, IconDTO iconDTO, IconDTO iconDTO2, String str, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.placeholder = placeholder;
            this.searchIcon = iconDTO;
            this.crossIcon = iconDTO2;
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ SearchBar copy$default(SearchBar searchBar, String str, IconDTO iconDTO, IconDTO iconDTO2, String str2, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = searchBar.placeholder;
            }
            if ((i11 & 2) != 0) {
                iconDTO = searchBar.searchIcon;
            }
            if ((i11 & 4) != 0) {
                iconDTO2 = searchBar.crossIcon;
            }
            if ((i11 & 8) != 0) {
                str2 = searchBar.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                cornerRadius = searchBar.cornerRadius;
            }
            CornerRadius cornerRadius2 = cornerRadius;
            IconDTO iconDTO3 = iconDTO2;
            return searchBar.copy(str, iconDTO, iconDTO3, str2, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getSearchIcon() {
            return this.searchIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getCrossIcon() {
            return this.crossIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final SearchBar copy(@NotNull String placeholder, IconDTO searchIcon, IconDTO crossIcon, String backgroundColor, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new SearchBar(placeholder, searchIcon, crossIcon, backgroundColor, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchBar)) {
                return false;
            }
            SearchBar searchBar = (SearchBar) other;
            return Intrinsics.d(this.placeholder, searchBar.placeholder) && Intrinsics.d(this.searchIcon, searchBar.searchIcon) && Intrinsics.d(this.crossIcon, searchBar.crossIcon) && Intrinsics.d(this.backgroundColor, searchBar.backgroundColor) && this.cornerRadius == searchBar.cornerRadius;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final IconDTO getCrossIcon() {
            return this.crossIcon;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final IconDTO getSearchIcon() {
            return this.searchIcon;
        }

        public int hashCode() {
            int hashCode = this.placeholder.hashCode() * 31;
            IconDTO iconDTO = this.searchIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            IconDTO iconDTO2 = this.crossIcon;
            int hashCode3 = (hashCode2 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            return hashCode4 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SearchBar(placeholder=" + this.placeholder + ", searchIcon=" + this.searchIcon + ", crossIcon=" + this.crossIcon + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$Section;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "values", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Section {
        public static final int $stable = 8;
        private final TextDTO title;
        private final List<Object> values;

        public Section(TextDTO textDTO, @ProtoOneOfSignature(name = "cell", type = WrappedCell.class) @ProtoOneOf List<? extends Object> list) {
            this.title = textDTO;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Section copy$default(Section section, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = section.title;
            }
            if ((i11 & 2) != 0) {
                list = section.values;
            }
            return section.copy(textDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        public final List<Object> component2() {
            return this.values;
        }

        @NotNull
        public final Section copy(TextDTO title, @ProtoOneOfSignature(name = "cell", type = WrappedCell.class) @ProtoOneOf List<? extends Object> values) {
            return new Section(title, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.d(this.title, section.title) && Intrinsics.d(this.values, section.values);
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final List<Object> getValues() {
            return this.values;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            List<Object> list = this.values;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Section(title=" + this.title + ", values=" + this.values + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$WrappedCell;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "favoriteButton", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WrappedCell {
        public static final int $stable = 8;

        @NotNull
        private final CellDTO cell;
        private final SisBrandFavoriteButton favoriteButton;

        public WrappedCell(@NotNull CellDTO cell, SisBrandFavoriteButton sisBrandFavoriteButton) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.favoriteButton = sisBrandFavoriteButton;
        }

        public static /* synthetic */ WrappedCell copy$default(WrappedCell wrappedCell, CellDTO cellDTO, SisBrandFavoriteButton sisBrandFavoriteButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = wrappedCell.cell;
            }
            if ((i11 & 2) != 0) {
                sisBrandFavoriteButton = wrappedCell.favoriteButton;
            }
            return wrappedCell.copy(cellDTO, sisBrandFavoriteButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component2, reason: from getter */
        public final SisBrandFavoriteButton getFavoriteButton() {
            return this.favoriteButton;
        }

        @NotNull
        public final WrappedCell copy(@NotNull CellDTO cell, SisBrandFavoriteButton favoriteButton) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new WrappedCell(cell, favoriteButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WrappedCell)) {
                return false;
            }
            WrappedCell wrappedCell = (WrappedCell) other;
            return Intrinsics.d(this.cell, wrappedCell.cell) && Intrinsics.d(this.favoriteButton, wrappedCell.favoriteButton);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final SisBrandFavoriteButton getFavoriteButton() {
            return this.favoriteButton;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
            return hashCode + (sisBrandFavoriteButton == null ? 0 : sisBrandFavoriteButton.hashCode());
        }

        @NotNull
        public String toString() {
            return "WrappedCell(cell=" + this.cell + ", favoriteButton=" + this.favoriteButton + ")";
        }
    }

    public BrandListDTO(NavBar navBar, @NotNull Section favorites, List<Section> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        this.navBar = navBar;
        this.favorites = favorites;
        this.sections = list;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrandListDTO copy$default(BrandListDTO brandListDTO, NavBar navBar, Section section, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            navBar = brandListDTO.navBar;
        }
        if ((i11 & 2) != 0) {
            section = brandListDTO.favorites;
        }
        if ((i11 & 4) != 0) {
            list = brandListDTO.sections;
        }
        if ((i11 & 8) != 0) {
            map = brandListDTO.trackingInfo;
        }
        return brandListDTO.copy(navBar, section, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final NavBar getNavBar() {
        return this.navBar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Section getFavorites() {
        return this.favorites;
    }

    public final List<Section> component3() {
        return this.sections;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final BrandListDTO copy(NavBar navBar, @NotNull Section favorites, List<Section> sections, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        return new BrandListDTO(navBar, favorites, sections, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandListDTO)) {
            return false;
        }
        BrandListDTO brandListDTO = (BrandListDTO) other;
        return Intrinsics.d(this.navBar, brandListDTO.navBar) && Intrinsics.d(this.favorites, brandListDTO.favorites) && Intrinsics.d(this.sections, brandListDTO.sections) && Intrinsics.d(this.trackingInfo, brandListDTO.trackingInfo);
    }

    @NotNull
    public final Section getFavorites() {
        return this.favorites;
    }

    public final NavBar getNavBar() {
        return this.navBar;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        NavBar navBar = this.navBar;
        int hashCode = (this.favorites.hashCode() + ((navBar == null ? 0 : navBar.hashCode()) * 31)) * 31;
        List<Section> list = this.sections;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        NavBar navBar = this.navBar;
        Section section = this.favorites;
        List<Section> list = this.sections;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("BrandListDTO(navBar=");
        sb2.append(navBar);
        sb2.append(", favorites=");
        sb2.append(section);
        sb2.append(", sections=");
        return C3143a.h(sb2, list, ", trackingInfo=", map, ")");
    }
}
