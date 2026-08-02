package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data;

import G.g;
import HY.a;
import J.d;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "categories", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO$CategoryDTO;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "agreement", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getCategories", "()Ljava/util/List;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAgreement", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "CategoryDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersMatcherV2DTO {
    private final TextAtom agreement;

    @NotNull
    private final List<CategoryDTO> categories;
    private final ButtonV3Atom.LargeButton largeButton;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO$CategoryDTO;", "", "categoryTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "passengerCells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getCategoryTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPassengerCells", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategoryDTO {

        @NotNull
        private final TextAtom categoryTitle;

        @NotNull
        private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> passengerCells;

        public CategoryDTO(@NotNull TextAtom categoryTitle, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> passengerCells) {
            Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
            Intrinsics.checkNotNullParameter(passengerCells, "passengerCells");
            this.categoryTitle = categoryTitle;
            this.passengerCells = passengerCells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CategoryDTO copy$default(CategoryDTO categoryDTO, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = categoryDTO.categoryTitle;
            }
            if ((i11 & 2) != 0) {
                list = categoryDTO.passengerCells;
            }
            return categoryDTO.copy(textAtom, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getCategoryTitle() {
            return this.categoryTitle;
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> component2() {
            return this.passengerCells;
        }

        @NotNull
        public final CategoryDTO copy(@NotNull TextAtom categoryTitle, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> passengerCells) {
            Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
            Intrinsics.checkNotNullParameter(passengerCells, "passengerCells");
            return new CategoryDTO(categoryTitle, passengerCells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CategoryDTO)) {
                return false;
            }
            CategoryDTO categoryDTO = (CategoryDTO) other;
            return Intrinsics.d(this.categoryTitle, categoryDTO.categoryTitle) && Intrinsics.d(this.passengerCells, categoryDTO.passengerCells);
        }

        @NotNull
        public final TextAtom getCategoryTitle() {
            return this.categoryTitle;
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> getPassengerCells() {
            return this.passengerCells;
        }

        public int hashCode() {
            return this.passengerCells.hashCode() + (this.categoryTitle.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("CategoryDTO(categoryTitle=", this.categoryTitle, ", passengerCells=", this.passengerCells, ")");
        }
    }

    public PassengersMatcherV2DTO(@NotNull TextAtom title, TextAtom textAtom, @NotNull List<CategoryDTO> categories, ButtonV3Atom.LargeButton largeButton, TextAtom textAtom2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.title = title;
        this.subtitle = textAtom;
        this.categories = categories;
        this.largeButton = largeButton;
        this.agreement = textAtom2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PassengersMatcherV2DTO copy$default(PassengersMatcherV2DTO passengersMatcherV2DTO, TextAtom textAtom, TextAtom textAtom2, List list, ButtonV3Atom.LargeButton largeButton, TextAtom textAtom3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = passengersMatcherV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = passengersMatcherV2DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = passengersMatcherV2DTO.categories;
        }
        if ((i11 & 8) != 0) {
            largeButton = passengersMatcherV2DTO.largeButton;
        }
        if ((i11 & 16) != 0) {
            textAtom3 = passengersMatcherV2DTO.agreement;
        }
        if ((i11 & 32) != 0) {
            map = passengersMatcherV2DTO.trackingInfo;
        }
        TextAtom textAtom4 = textAtom3;
        Map map2 = map;
        return passengersMatcherV2DTO.copy(textAtom, textAtom2, list, largeButton, textAtom4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<CategoryDTO> component3() {
        return this.categories;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getAgreement() {
        return this.agreement;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final PassengersMatcherV2DTO copy(@NotNull TextAtom title, TextAtom subtitle, @NotNull List<CategoryDTO> categories, ButtonV3Atom.LargeButton largeButton, TextAtom agreement, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new PassengersMatcherV2DTO(title, subtitle, categories, largeButton, agreement, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersMatcherV2DTO)) {
            return false;
        }
        PassengersMatcherV2DTO passengersMatcherV2DTO = (PassengersMatcherV2DTO) other;
        return Intrinsics.d(this.title, passengersMatcherV2DTO.title) && Intrinsics.d(this.subtitle, passengersMatcherV2DTO.subtitle) && Intrinsics.d(this.categories, passengersMatcherV2DTO.categories) && Intrinsics.d(this.largeButton, passengersMatcherV2DTO.largeButton) && Intrinsics.d(this.agreement, passengersMatcherV2DTO.agreement) && Intrinsics.d(this.trackingInfo, passengersMatcherV2DTO.trackingInfo);
    }

    public final TextAtom getAgreement() {
        return this.agreement;
    }

    @NotNull
    public final List<CategoryDTO> getCategories() {
        return this.categories;
    }

    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
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
        int b11 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.categories);
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        int hashCode2 = (b11 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        TextAtom textAtom2 = this.agreement;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<CategoryDTO> list = this.categories;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        TextAtom textAtom3 = this.agreement;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("PassengersMatcherV2DTO(title=", textAtom, ", subtitle=", textAtom2, ", categories=");
        a11.append(list);
        a11.append(", largeButton=");
        a11.append(largeButton);
        a11.append(", agreement=");
        a11.append(textAtom3);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(")");
        return a11.toString();
    }
}
