package ru.ozon.app.android.checkoutcomposer.sbp.search.data;

import B0.A0;
import B90.C2618u;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u000212B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003Jm\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO;", "", "searchBar", "Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SearchBar;", "closeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "sectionHeader", "Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SectionHeader;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "emptyText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "elements", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SearchBar;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SectionHeader;Lru/ozon/uni/android/flashbar/model/Restriction;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;Ljava/util/List;)V", "getSearchBar", "()Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SearchBar;", "getCloseButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSectionHeader", "()Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SectionHeader;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "getEmptyText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTrackingInfo", "()Ljava/util/Map;", "getElements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SectionHeader", "SearchBar", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchBankListDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.SmallIconButton closeButton;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle> elements;
    private final TextAtom emptyText;
    private final Restriction restriction;
    private final SearchBar searchBar;
    private final SectionHeader sectionHeader;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SearchBar;", "", HammersV3BodyDTO.PLACEHOLDER, "", "<init>", "(Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SectionHeader;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionHeader {
        public static final int $stable = TextAtom.$stable;
        private final String backgroundColor;

        @NotNull
        private final TextAtom text;

        public SectionHeader(@NotNull TextAtom text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.backgroundColor = str;
        }

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, TextAtom textAtom, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = sectionHeader.text;
            }
            if ((i11 & 2) != 0) {
                str = sectionHeader.backgroundColor;
            }
            return sectionHeader.copy(textAtom, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final SectionHeader copy(@NotNull TextAtom text, String backgroundColor) {
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
        public final TextAtom getText() {
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

    /* JADX WARN: Multi-variable type inference failed */
    public SearchBankListDTO(SearchBar searchBar, ButtonV3Atom.SmallIconButton smallIconButton, SectionHeader sectionHeader, Restriction restriction, TextAtom textAtom, Map<String, TokenizedTrackingInfo> map, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleDefault", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle32Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle40Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle48Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends CellAtom.CellAtomWithSubtitle> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.searchBar = searchBar;
        this.closeButton = smallIconButton;
        this.sectionHeader = sectionHeader;
        this.restriction = restriction;
        this.emptyText = textAtom;
        this.trackingInfo = map;
        this.elements = elements;
    }

    public static /* synthetic */ SearchBankListDTO copy$default(SearchBankListDTO searchBankListDTO, SearchBar searchBar, ButtonV3Atom.SmallIconButton smallIconButton, SectionHeader sectionHeader, Restriction restriction, TextAtom textAtom, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            searchBar = searchBankListDTO.searchBar;
        }
        if ((i11 & 2) != 0) {
            smallIconButton = searchBankListDTO.closeButton;
        }
        if ((i11 & 4) != 0) {
            sectionHeader = searchBankListDTO.sectionHeader;
        }
        if ((i11 & 8) != 0) {
            restriction = searchBankListDTO.restriction;
        }
        if ((i11 & 16) != 0) {
            textAtom = searchBankListDTO.emptyText;
        }
        if ((i11 & 32) != 0) {
            map = searchBankListDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            list = searchBankListDTO.elements;
        }
        Map map2 = map;
        List list2 = list;
        TextAtom textAtom2 = textAtom;
        SectionHeader sectionHeader2 = sectionHeader;
        return searchBankListDTO.copy(searchBar, smallIconButton, sectionHeader2, restriction, textAtom2, map2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchBar getSearchBar() {
        return this.searchBar;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component3, reason: from getter */
    public final SectionHeader getSectionHeader() {
        return this.sectionHeader;
    }

    /* renamed from: component4, reason: from getter */
    public final Restriction getRestriction() {
        return this.restriction;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getEmptyText() {
        return this.emptyText;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle> component7() {
        return this.elements;
    }

    @NotNull
    public final SearchBankListDTO copy(SearchBar searchBar, ButtonV3Atom.SmallIconButton closeButton, SectionHeader sectionHeader, Restriction restriction, TextAtom emptyText, Map<String, TokenizedTrackingInfo> trackingInfo, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitleDefault", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle32Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle40Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.class), @ProtoOneOfSignature(name = "cellWithSubtitle48Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends CellAtom.CellAtomWithSubtitle> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new SearchBankListDTO(searchBar, closeButton, sectionHeader, restriction, emptyText, trackingInfo, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBankListDTO)) {
            return false;
        }
        SearchBankListDTO searchBankListDTO = (SearchBankListDTO) other;
        return Intrinsics.d(this.searchBar, searchBankListDTO.searchBar) && Intrinsics.d(this.closeButton, searchBankListDTO.closeButton) && Intrinsics.d(this.sectionHeader, searchBankListDTO.sectionHeader) && Intrinsics.d(this.restriction, searchBankListDTO.restriction) && Intrinsics.d(this.emptyText, searchBankListDTO.emptyText) && Intrinsics.d(this.trackingInfo, searchBankListDTO.trackingInfo) && Intrinsics.d(this.elements, searchBankListDTO.elements);
    }

    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle> getElements() {
        return this.elements;
    }

    public final TextAtom getEmptyText() {
        return this.emptyText;
    }

    public final Restriction getRestriction() {
        return this.restriction;
    }

    public final SearchBar getSearchBar() {
        return this.searchBar;
    }

    public final SectionHeader getSectionHeader() {
        return this.sectionHeader;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        SearchBar searchBar = this.searchBar;
        int hashCode = (searchBar == null ? 0 : searchBar.hashCode()) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.closeButton;
        int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        SectionHeader sectionHeader = this.sectionHeader;
        int hashCode3 = (hashCode2 + (sectionHeader == null ? 0 : sectionHeader.hashCode())) * 31;
        Restriction restriction = this.restriction;
        int hashCode4 = (hashCode3 + (restriction == null ? 0 : restriction.hashCode())) * 31;
        TextAtom textAtom = this.emptyText;
        int hashCode5 = (hashCode4 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.elements.hashCode() + ((hashCode5 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        SearchBar searchBar = this.searchBar;
        ButtonV3Atom.SmallIconButton smallIconButton = this.closeButton;
        SectionHeader sectionHeader = this.sectionHeader;
        Restriction restriction = this.restriction;
        TextAtom textAtom = this.emptyText;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<CellAtom.CellAtomWithSubtitle> list = this.elements;
        StringBuilder sb2 = new StringBuilder("SearchBankListDTO(searchBar=");
        sb2.append(searchBar);
        sb2.append(", closeButton=");
        sb2.append(smallIconButton);
        sb2.append(", sectionHeader=");
        sb2.append(sectionHeader);
        sb2.append(", restriction=");
        sb2.append(restriction);
        sb2.append(", emptyText=");
        sb2.append(textAtom);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", elements=");
        return C2618u.h(sb2, list, ")");
    }
}
