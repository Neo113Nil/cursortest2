package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.data;

import B90.C2619v;
import G.g;
import Ih.a;
import J0.C3349u1;
import Kk.C3532b;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001f B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO;", "", "search", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "emptyState", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;", "isSelectedPassengerUnsuitable", "", "passengers", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$PassengerV2DTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;ZLjava/util/List;)V", "getSearch", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "getEmptyState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;", "()Z", "getPassengers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "PassengerV2DTO", "StubDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersDirectoryV2DTO {

    @NotNull
    private final StubDTO emptyState;
    private final boolean isSelectedPassengerUnsuitable;

    @NotNull
    private final List<PassengerV2DTO> passengers;
    private final CommonInputDTO search;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$PassengerV2DTO;", "", "fullName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "personalInfo", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "additionalActions", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "searchInKeys", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/String;Ljava/util/Map;)V", "getFullName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPersonalInfo", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAdditionalActions", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSearchInKeys", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerV2DTO {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final ButtonV3Atom.SmallIconButton additionalActions;

        @NotNull
        private final TextAtom fullName;

        @NotNull
        private final TextAtom personalInfo;

        @NotNull
        private final String searchInKeys;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PassengerV2DTO(@NotNull TextAtom fullName, @NotNull TextAtom personalInfo, @NotNull AtomActionDTO action, @NotNull ButtonV3Atom.SmallIconButton additionalActions, @NotNull String searchInKeys, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(fullName, "fullName");
            Intrinsics.checkNotNullParameter(personalInfo, "personalInfo");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(additionalActions, "additionalActions");
            Intrinsics.checkNotNullParameter(searchInKeys, "searchInKeys");
            this.fullName = fullName;
            this.personalInfo = personalInfo;
            this.action = action;
            this.additionalActions = additionalActions;
            this.searchInKeys = searchInKeys;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PassengerV2DTO copy$default(PassengerV2DTO passengerV2DTO, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, ButtonV3Atom.SmallIconButton smallIconButton, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = passengerV2DTO.fullName;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = passengerV2DTO.personalInfo;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = passengerV2DTO.action;
            }
            if ((i11 & 8) != 0) {
                smallIconButton = passengerV2DTO.additionalActions;
            }
            if ((i11 & 16) != 0) {
                str = passengerV2DTO.searchInKeys;
            }
            if ((i11 & 32) != 0) {
                map = passengerV2DTO.trackingInfo;
            }
            String str2 = str;
            Map map2 = map;
            return passengerV2DTO.copy(textAtom, textAtom2, atomActionDTO, smallIconButton, str2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getFullName() {
            return this.fullName;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getPersonalInfo() {
            return this.personalInfo;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getAdditionalActions() {
            return this.additionalActions;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getSearchInKeys() {
            return this.searchInKeys;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final PassengerV2DTO copy(@NotNull TextAtom fullName, @NotNull TextAtom personalInfo, @NotNull AtomActionDTO action, @NotNull ButtonV3Atom.SmallIconButton additionalActions, @NotNull String searchInKeys, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(fullName, "fullName");
            Intrinsics.checkNotNullParameter(personalInfo, "personalInfo");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(additionalActions, "additionalActions");
            Intrinsics.checkNotNullParameter(searchInKeys, "searchInKeys");
            return new PassengerV2DTO(fullName, personalInfo, action, additionalActions, searchInKeys, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerV2DTO)) {
                return false;
            }
            PassengerV2DTO passengerV2DTO = (PassengerV2DTO) other;
            return Intrinsics.d(this.fullName, passengerV2DTO.fullName) && Intrinsics.d(this.personalInfo, passengerV2DTO.personalInfo) && Intrinsics.d(this.action, passengerV2DTO.action) && Intrinsics.d(this.additionalActions, passengerV2DTO.additionalActions) && Intrinsics.d(this.searchInKeys, passengerV2DTO.searchInKeys) && Intrinsics.d(this.trackingInfo, passengerV2DTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getAdditionalActions() {
            return this.additionalActions;
        }

        @NotNull
        public final TextAtom getFullName() {
            return this.fullName;
        }

        @NotNull
        public final TextAtom getPersonalInfo() {
            return this.personalInfo;
        }

        @NotNull
        public final String getSearchInKeys() {
            return this.searchInKeys;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(C3349u1.d(this.additionalActions, a.b(this.action, C2619v.b(this.fullName.hashCode() * 31, 31, this.personalInfo), 31), 31), 31, this.searchInKeys);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.fullName;
            TextAtom textAtom2 = this.personalInfo;
            AtomActionDTO atomActionDTO = this.action;
            ButtonV3Atom.SmallIconButton smallIconButton = this.additionalActions;
            String str = this.searchInKeys;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = HY.a.a("PassengerV2DTO(fullName=", textAtom, ", personalInfo=", textAtom2, ", action=");
            a11.append(atomActionDTO);
            a11.append(", additionalActions=");
            a11.append(smallIconButton);
            a11.append(", searchInKeys=");
            return C4070a.a(a11, str, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;", "", "image", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "explanation", "resetSearch", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;)V", "getImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getExplanation", "getResetSearch", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StubDTO {

        @NotNull
        private final TextAtom explanation;

        @NotNull
        private final TextAtom header;

        @NotNull
        private final ThemeImageV1DTO image;
        private final LinkButtonDTO resetSearch;

        public StubDTO(@NotNull ThemeImageV1DTO image, @NotNull TextAtom header, @NotNull TextAtom explanation, LinkButtonDTO linkButtonDTO) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.image = image;
            this.header = header;
            this.explanation = explanation;
            this.resetSearch = linkButtonDTO;
        }

        public static /* synthetic */ StubDTO copy$default(StubDTO stubDTO, ThemeImageV1DTO themeImageV1DTO, TextAtom textAtom, TextAtom textAtom2, LinkButtonDTO linkButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                themeImageV1DTO = stubDTO.image;
            }
            if ((i11 & 2) != 0) {
                textAtom = stubDTO.header;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = stubDTO.explanation;
            }
            if ((i11 & 8) != 0) {
                linkButtonDTO = stubDTO.resetSearch;
            }
            return stubDTO.copy(themeImageV1DTO, textAtom, textAtom2, linkButtonDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ThemeImageV1DTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getExplanation() {
            return this.explanation;
        }

        /* renamed from: component4, reason: from getter */
        public final LinkButtonDTO getResetSearch() {
            return this.resetSearch;
        }

        @NotNull
        public final StubDTO copy(@NotNull ThemeImageV1DTO image, @NotNull TextAtom header, @NotNull TextAtom explanation, LinkButtonDTO resetSearch) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            return new StubDTO(image, header, explanation, resetSearch);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StubDTO)) {
                return false;
            }
            StubDTO stubDTO = (StubDTO) other;
            return Intrinsics.d(this.image, stubDTO.image) && Intrinsics.d(this.header, stubDTO.header) && Intrinsics.d(this.explanation, stubDTO.explanation) && Intrinsics.d(this.resetSearch, stubDTO.resetSearch);
        }

        @NotNull
        public final TextAtom getExplanation() {
            return this.explanation;
        }

        @NotNull
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        public final ThemeImageV1DTO getImage() {
            return this.image;
        }

        public final LinkButtonDTO getResetSearch() {
            return this.resetSearch;
        }

        public int hashCode() {
            int b11 = C2619v.b(C2619v.b(this.image.hashCode() * 31, 31, this.header), 31, this.explanation);
            LinkButtonDTO linkButtonDTO = this.resetSearch;
            return b11 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "StubDTO(image=" + this.image + ", header=" + this.header + ", explanation=" + this.explanation + ", resetSearch=" + this.resetSearch + ")";
        }
    }

    public PassengersDirectoryV2DTO(CommonInputDTO commonInputDTO, @NotNull StubDTO emptyState, boolean z11, @NotNull List<PassengerV2DTO> passengers) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.search = commonInputDTO;
        this.emptyState = emptyState;
        this.isSelectedPassengerUnsuitable = z11;
        this.passengers = passengers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassengersDirectoryV2DTO copy$default(PassengersDirectoryV2DTO passengersDirectoryV2DTO, CommonInputDTO commonInputDTO, StubDTO stubDTO, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonInputDTO = passengersDirectoryV2DTO.search;
        }
        if ((i11 & 2) != 0) {
            stubDTO = passengersDirectoryV2DTO.emptyState;
        }
        if ((i11 & 4) != 0) {
            z11 = passengersDirectoryV2DTO.isSelectedPassengerUnsuitable;
        }
        if ((i11 & 8) != 0) {
            list = passengersDirectoryV2DTO.passengers;
        }
        return passengersDirectoryV2DTO.copy(commonInputDTO, stubDTO, z11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonInputDTO getSearch() {
        return this.search;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StubDTO getEmptyState() {
        return this.emptyState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelectedPassengerUnsuitable() {
        return this.isSelectedPassengerUnsuitable;
    }

    @NotNull
    public final List<PassengerV2DTO> component4() {
        return this.passengers;
    }

    @NotNull
    public final PassengersDirectoryV2DTO copy(CommonInputDTO search, @NotNull StubDTO emptyState, boolean isSelectedPassengerUnsuitable, @NotNull List<PassengerV2DTO> passengers) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        return new PassengersDirectoryV2DTO(search, emptyState, isSelectedPassengerUnsuitable, passengers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersDirectoryV2DTO)) {
            return false;
        }
        PassengersDirectoryV2DTO passengersDirectoryV2DTO = (PassengersDirectoryV2DTO) other;
        return Intrinsics.d(this.search, passengersDirectoryV2DTO.search) && Intrinsics.d(this.emptyState, passengersDirectoryV2DTO.emptyState) && this.isSelectedPassengerUnsuitable == passengersDirectoryV2DTO.isSelectedPassengerUnsuitable && Intrinsics.d(this.passengers, passengersDirectoryV2DTO.passengers);
    }

    @NotNull
    public final StubDTO getEmptyState() {
        return this.emptyState;
    }

    @NotNull
    public final List<PassengerV2DTO> getPassengers() {
        return this.passengers;
    }

    public final CommonInputDTO getSearch() {
        return this.search;
    }

    public int hashCode() {
        CommonInputDTO commonInputDTO = this.search;
        return this.passengers.hashCode() + C3532b.a((this.emptyState.hashCode() + ((commonInputDTO == null ? 0 : commonInputDTO.hashCode()) * 31)) * 31, 31, this.isSelectedPassengerUnsuitable);
    }

    public final boolean isSelectedPassengerUnsuitable() {
        return this.isSelectedPassengerUnsuitable;
    }

    @NotNull
    public String toString() {
        return "PassengersDirectoryV2DTO(search=" + this.search + ", emptyState=" + this.emptyState + ", isSelectedPassengerUnsuitable=" + this.isSelectedPassengerUnsuitable + ", passengers=" + this.passengers + ")";
    }

    public PassengersDirectoryV2DTO(CommonInputDTO commonInputDTO, StubDTO stubDTO, boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonInputDTO, stubDTO, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? K.f71697a : list);
    }
}
