package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data;

import De.C2859b;
import G.g;
import Ih.a;
import Kk.C3532b;
import Ql.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003-./B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "", "searchInput", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$SearchInputDTO;", "categories", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$CategoryDTO;", "selectButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addDocumentButton", "emptyState", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "isSelectedPassengerUnsuitable", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$SearchInputDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;ZLjava/util/Map;)V", "getSearchInput", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$SearchInputDTO;", "getCategories", "()Ljava/util/List;", "getSelectButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddDocumentButton", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "SearchInputDTO", "CategoryDTO", "PassengerV3DTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersDirectoryV3DTO {

    @NotNull
    private final ButtonV3DTO addDocumentButton;

    @NotNull
    private final List<CategoryDTO> categories;
    private final EmptyStateV2DTO emptyState;
    private final boolean isSelectedPassengerUnsuitable;
    private final SearchInputDTO searchInput;
    private final ButtonV3DTO selectButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$PassengerV3DTO;", "", "id", "", "passenger", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getId", "()Ljava/lang/String;", "getPassenger", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerV3DTO {

        @NotNull
        private final String id;

        @NotNull
        private final CellDTO passenger;

        public PassengerV3DTO(@NotNull String id2, @NotNull CellDTO passenger) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(passenger, "passenger");
            this.id = id2;
            this.passenger = passenger;
        }

        public static /* synthetic */ PassengerV3DTO copy$default(PassengerV3DTO passengerV3DTO, String str, CellDTO cellDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = passengerV3DTO.id;
            }
            if ((i11 & 2) != 0) {
                cellDTO = passengerV3DTO.passenger;
            }
            return passengerV3DTO.copy(str, cellDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getPassenger() {
            return this.passenger;
        }

        @NotNull
        public final PassengerV3DTO copy(@NotNull String id2, @NotNull CellDTO passenger) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(passenger, "passenger");
            return new PassengerV3DTO(id2, passenger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerV3DTO)) {
                return false;
            }
            PassengerV3DTO passengerV3DTO = (PassengerV3DTO) other;
            return Intrinsics.d(this.id, passengerV3DTO.id) && Intrinsics.d(this.passenger, passengerV3DTO.passenger);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final CellDTO getPassenger() {
            return this.passenger;
        }

        public int hashCode() {
            return this.passenger.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PassengerV3DTO(id=" + this.id + ", passenger=" + this.passenger + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$SearchInputDTO;", "", HammersV3BodyDTO.PLACEHOLDER, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getPlaceholder", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchInputDTO {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String placeholder;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public SearchInputDTO(@NotNull String placeholder, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(action, "action");
            this.placeholder = placeholder;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchInputDTO copy$default(SearchInputDTO searchInputDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = searchInputDTO.placeholder;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = searchInputDTO.action;
            }
            if ((i11 & 4) != 0) {
                map = searchInputDTO.trackingInfo;
            }
            return searchInputDTO.copy(str, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final SearchInputDTO copy(@NotNull String placeholder, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(action, "action");
            return new SearchInputDTO(placeholder, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchInputDTO)) {
                return false;
            }
            SearchInputDTO searchInputDTO = (SearchInputDTO) other;
            return Intrinsics.d(this.placeholder, searchInputDTO.placeholder) && Intrinsics.d(this.action, searchInputDTO.action) && Intrinsics.d(this.trackingInfo, searchInputDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.placeholder.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.placeholder;
            AtomActionDTO atomActionDTO = this.action;
            return P.f(c.c("SearchInputDTO(placeholder=", str, ", action=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    public PassengersDirectoryV3DTO(SearchInputDTO searchInputDTO, @NotNull List<CategoryDTO> categories, ButtonV3DTO buttonV3DTO, @NotNull ButtonV3DTO addDocumentButton, EmptyStateV2DTO emptyStateV2DTO, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(addDocumentButton, "addDocumentButton");
        this.searchInput = searchInputDTO;
        this.categories = categories;
        this.selectButton = buttonV3DTO;
        this.addDocumentButton = addDocumentButton;
        this.emptyState = emptyStateV2DTO;
        this.isSelectedPassengerUnsuitable = z11;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PassengersDirectoryV3DTO copy$default(PassengersDirectoryV3DTO passengersDirectoryV3DTO, SearchInputDTO searchInputDTO, List list, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, EmptyStateV2DTO emptyStateV2DTO, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            searchInputDTO = passengersDirectoryV3DTO.searchInput;
        }
        if ((i11 & 2) != 0) {
            list = passengersDirectoryV3DTO.categories;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = passengersDirectoryV3DTO.selectButton;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO2 = passengersDirectoryV3DTO.addDocumentButton;
        }
        if ((i11 & 16) != 0) {
            emptyStateV2DTO = passengersDirectoryV3DTO.emptyState;
        }
        if ((i11 & 32) != 0) {
            z11 = passengersDirectoryV3DTO.isSelectedPassengerUnsuitable;
        }
        if ((i11 & 64) != 0) {
            map = passengersDirectoryV3DTO.trackingInfo;
        }
        boolean z12 = z11;
        Map map2 = map;
        EmptyStateV2DTO emptyStateV2DTO2 = emptyStateV2DTO;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        return passengersDirectoryV3DTO.copy(searchInputDTO, list, buttonV3DTO3, buttonV3DTO2, emptyStateV2DTO2, z12, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchInputDTO getSearchInput() {
        return this.searchInput;
    }

    @NotNull
    public final List<CategoryDTO> component2() {
        return this.categories;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getSelectButton() {
        return this.selectButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getAddDocumentButton() {
        return this.addDocumentButton;
    }

    /* renamed from: component5, reason: from getter */
    public final EmptyStateV2DTO getEmptyState() {
        return this.emptyState;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSelectedPassengerUnsuitable() {
        return this.isSelectedPassengerUnsuitable;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final PassengersDirectoryV3DTO copy(SearchInputDTO searchInput, @NotNull List<CategoryDTO> categories, ButtonV3DTO selectButton, @NotNull ButtonV3DTO addDocumentButton, EmptyStateV2DTO emptyState, boolean isSelectedPassengerUnsuitable, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(addDocumentButton, "addDocumentButton");
        return new PassengersDirectoryV3DTO(searchInput, categories, selectButton, addDocumentButton, emptyState, isSelectedPassengerUnsuitable, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersDirectoryV3DTO)) {
            return false;
        }
        PassengersDirectoryV3DTO passengersDirectoryV3DTO = (PassengersDirectoryV3DTO) other;
        return Intrinsics.d(this.searchInput, passengersDirectoryV3DTO.searchInput) && Intrinsics.d(this.categories, passengersDirectoryV3DTO.categories) && Intrinsics.d(this.selectButton, passengersDirectoryV3DTO.selectButton) && Intrinsics.d(this.addDocumentButton, passengersDirectoryV3DTO.addDocumentButton) && Intrinsics.d(this.emptyState, passengersDirectoryV3DTO.emptyState) && this.isSelectedPassengerUnsuitable == passengersDirectoryV3DTO.isSelectedPassengerUnsuitable && Intrinsics.d(this.trackingInfo, passengersDirectoryV3DTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getAddDocumentButton() {
        return this.addDocumentButton;
    }

    @NotNull
    public final List<CategoryDTO> getCategories() {
        return this.categories;
    }

    public final EmptyStateV2DTO getEmptyState() {
        return this.emptyState;
    }

    public final SearchInputDTO getSearchInput() {
        return this.searchInput;
    }

    public final ButtonV3DTO getSelectButton() {
        return this.selectButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        SearchInputDTO searchInputDTO = this.searchInput;
        int b11 = g.b((searchInputDTO == null ? 0 : searchInputDTO.hashCode()) * 31, 31, this.categories);
        ButtonV3DTO buttonV3DTO = this.selectButton;
        int c11 = C2859b.c(this.addDocumentButton, (b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
        EmptyStateV2DTO emptyStateV2DTO = this.emptyState;
        int a11 = C3532b.a((c11 + (emptyStateV2DTO == null ? 0 : emptyStateV2DTO.hashCode())) * 31, 31, this.isSelectedPassengerUnsuitable);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isSelectedPassengerUnsuitable() {
        return this.isSelectedPassengerUnsuitable;
    }

    @NotNull
    public String toString() {
        SearchInputDTO searchInputDTO = this.searchInput;
        List<CategoryDTO> list = this.categories;
        ButtonV3DTO buttonV3DTO = this.selectButton;
        ButtonV3DTO buttonV3DTO2 = this.addDocumentButton;
        EmptyStateV2DTO emptyStateV2DTO = this.emptyState;
        boolean z11 = this.isSelectedPassengerUnsuitable;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PassengersDirectoryV3DTO(searchInput=");
        sb2.append(searchInputDTO);
        sb2.append(", categories=");
        sb2.append(list);
        sb2.append(", selectButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", addDocumentButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(", emptyState=");
        sb2.append(emptyStateV2DTO);
        sb2.append(", isSelectedPassengerUnsuitable=");
        sb2.append(z11);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$CategoryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "passengers", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$PassengerV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPassengers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategoryDTO {

        @NotNull
        private final List<PassengerV3DTO> passengers;
        private final TextDTO title;

        public CategoryDTO(TextDTO textDTO, @NotNull List<PassengerV3DTO> passengers) {
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            this.title = textDTO;
            this.passengers = passengers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CategoryDTO copy$default(CategoryDTO categoryDTO, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = categoryDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = categoryDTO.passengers;
            }
            return categoryDTO.copy(textDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final List<PassengerV3DTO> component2() {
            return this.passengers;
        }

        @NotNull
        public final CategoryDTO copy(TextDTO title, @NotNull List<PassengerV3DTO> passengers) {
            Intrinsics.checkNotNullParameter(passengers, "passengers");
            return new CategoryDTO(title, passengers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CategoryDTO)) {
                return false;
            }
            CategoryDTO categoryDTO = (CategoryDTO) other;
            return Intrinsics.d(this.title, categoryDTO.title) && Intrinsics.d(this.passengers, categoryDTO.passengers);
        }

        @NotNull
        public final List<PassengerV3DTO> getPassengers() {
            return this.passengers;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return this.passengers.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "CategoryDTO(title=" + this.title + ", passengers=" + this.passengers + ")";
        }

        public CategoryDTO(TextDTO textDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, (i11 & 2) != 0 ? K.f71697a : list);
        }
    }

    public PassengersDirectoryV3DTO(SearchInputDTO searchInputDTO, List list, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, EmptyStateV2DTO emptyStateV2DTO, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(searchInputDTO, (i11 & 2) != 0 ? K.f71697a : list, buttonV3DTO, buttonV3DTO2, emptyStateV2DTO, (i11 & 32) != 0 ? false : z11, map);
    }
}
