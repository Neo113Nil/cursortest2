package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation;

import B90.C2619v;
import Bl.C2639a;
import Bl.b;
import G.g;
import J0.C3349u1;
import Kk.C3532b;
import Ve.C4598rp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003)*+B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isSearchInputVisible", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "search", "isSelectedPassengerUnsuitable", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerV2VO;", "passengers", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "emptyState", "<init>", "(JZLru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;ZLjava/util/List;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "getSearch", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "getEmptyState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "PassengerListItem", "PassengerV2VO", "StubV2VO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersDirectoryV2VO implements c {

    @NotNull
    private final StubV2VO emptyState;
    private final long id;
    private final boolean isSearchInputVisible;
    private final boolean isSelectedPassengerUnsuitable;

    @NotNull
    private final List<PassengerV2VO> passengers;
    private final CommonInputVO.TextCommonInputVO search;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerListItem;", "", "<init>", "()V", "id", "", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerV2VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PassengerListItem {
        public /* synthetic */ PassengerListItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract long getId();

        private PassengerListItem() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010\u0010¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerV2VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerListItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "fullName", "personalInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "additionalActions", "", "searchInKeys", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFullName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPersonalInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getAdditionalActions", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Ljava/lang/String;", "getSearchInKeys", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerV2VO extends PassengerListItem {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final ButtonV3Atom.SmallIconButton additionalActions;

        @NotNull
        private final TextAtom fullName;
        private final long id;

        @NotNull
        private final TextAtom personalInfo;

        @NotNull
        private final String searchInKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassengerV2VO(long j11, @NotNull TextAtom fullName, @NotNull TextAtom personalInfo, @NotNull AtomAction action, @NotNull ButtonV3Atom.SmallIconButton additionalActions, @NotNull String searchInKeys) {
            super(null);
            Intrinsics.checkNotNullParameter(fullName, "fullName");
            Intrinsics.checkNotNullParameter(personalInfo, "personalInfo");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(additionalActions, "additionalActions");
            Intrinsics.checkNotNullParameter(searchInKeys, "searchInKeys");
            this.id = j11;
            this.fullName = fullName;
            this.personalInfo = personalInfo;
            this.action = action;
            this.additionalActions = additionalActions;
            this.searchInKeys = searchInKeys;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerV2VO)) {
                return false;
            }
            PassengerV2VO passengerV2VO = (PassengerV2VO) other;
            return this.id == passengerV2VO.id && Intrinsics.d(this.fullName, passengerV2VO.fullName) && Intrinsics.d(this.personalInfo, passengerV2VO.personalInfo) && Intrinsics.d(this.action, passengerV2VO.action) && Intrinsics.d(this.additionalActions, passengerV2VO.additionalActions) && Intrinsics.d(this.searchInKeys, passengerV2VO.searchInKeys);
        }

        @NotNull
        public final AtomAction getAction() {
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

        @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2VO.PassengerListItem
        public long getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getPersonalInfo() {
            return this.personalInfo;
        }

        @NotNull
        public final String getSearchInKeys() {
            return this.searchInKeys;
        }

        public int hashCode() {
            return this.searchInKeys.hashCode() + C3349u1.d(this.additionalActions, C4598rp.a(this.action, C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.fullName), 31, this.personalInfo), 31), 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.fullName;
            TextAtom textAtom2 = this.personalInfo;
            AtomAction atomAction = this.action;
            ButtonV3Atom.SmallIconButton smallIconButton = this.additionalActions;
            String str = this.searchInKeys;
            StringBuilder c11 = C2639a.c("PassengerV2VO(id=", j11, ", fullName=", textAtom);
            c11.append(", personalInfo=");
            c11.append(textAtom2);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", additionalActions=");
            c11.append(smallIconButton);
            c11.append(", searchInKeys=");
            c11.append(str);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerListItem;", "", "id", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "image", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "explanation", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "resetSearch", "<init>", "(JLru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getExplanation", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getResetSearch", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StubV2VO extends PassengerListItem {

        @NotNull
        private final TextAtom explanation;

        @NotNull
        private final TextAtom header;
        private final long id;

        @NotNull
        private final ThemeImageV1DTO image;
        private final LinkButtonVO resetSearch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StubV2VO(long j11, @NotNull ThemeImageV1DTO image, @NotNull TextAtom header, @NotNull TextAtom explanation, LinkButtonVO linkButtonVO) {
            super(null);
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.id = j11;
            this.image = image;
            this.header = header;
            this.explanation = explanation;
            this.resetSearch = linkButtonVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StubV2VO)) {
                return false;
            }
            StubV2VO stubV2VO = (StubV2VO) other;
            return this.id == stubV2VO.id && Intrinsics.d(this.image, stubV2VO.image) && Intrinsics.d(this.header, stubV2VO.header) && Intrinsics.d(this.explanation, stubV2VO.explanation) && Intrinsics.d(this.resetSearch, stubV2VO.resetSearch);
        }

        @NotNull
        public final TextAtom getExplanation() {
            return this.explanation;
        }

        @NotNull
        public final TextAtom getHeader() {
            return this.header;
        }

        @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2VO.PassengerListItem
        public long getId() {
            return this.id;
        }

        @NotNull
        public final ThemeImageV1DTO getImage() {
            return this.image;
        }

        public final LinkButtonVO getResetSearch() {
            return this.resetSearch;
        }

        public int hashCode() {
            int b11 = C2619v.b(C2619v.b((this.image.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.header), 31, this.explanation);
            LinkButtonVO linkButtonVO = this.resetSearch;
            return b11 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            ThemeImageV1DTO themeImageV1DTO = this.image;
            TextAtom textAtom = this.header;
            TextAtom textAtom2 = this.explanation;
            LinkButtonVO linkButtonVO = this.resetSearch;
            StringBuilder sb2 = new StringBuilder("StubV2VO(id=");
            sb2.append(j11);
            sb2.append(", image=");
            sb2.append(themeImageV1DTO);
            C2639a.e(", header=", ", explanation=", sb2, textAtom, textAtom2);
            sb2.append(", resetSearch=");
            sb2.append(linkButtonVO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public PassengersDirectoryV2VO(long j11, boolean z11, CommonInputVO.TextCommonInputVO textCommonInputVO, boolean z12, @NotNull List<PassengerV2VO> passengers, @NotNull StubV2VO emptyState) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        this.id = j11;
        this.isSearchInputVisible = z11;
        this.search = textCommonInputVO;
        this.isSelectedPassengerUnsuitable = z12;
        this.passengers = passengers;
        this.emptyState = emptyState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersDirectoryV2VO)) {
            return false;
        }
        PassengersDirectoryV2VO passengersDirectoryV2VO = (PassengersDirectoryV2VO) other;
        return this.id == passengersDirectoryV2VO.id && this.isSearchInputVisible == passengersDirectoryV2VO.isSearchInputVisible && Intrinsics.d(this.search, passengersDirectoryV2VO.search) && this.isSelectedPassengerUnsuitable == passengersDirectoryV2VO.isSelectedPassengerUnsuitable && Intrinsics.d(this.passengers, passengersDirectoryV2VO.passengers) && Intrinsics.d(this.emptyState, passengersDirectoryV2VO.emptyState);
    }

    @NotNull
    public final StubV2VO getEmptyState() {
        return this.emptyState;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PassengerV2VO> getPassengers() {
        return this.passengers;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CommonInputVO.TextCommonInputVO getSearch() {
        return this.search;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(Long.hashCode(this.id) * 31, 31, this.isSearchInputVisible);
        CommonInputVO.TextCommonInputVO textCommonInputVO = this.search;
        return this.emptyState.hashCode() + g.b(C3532b.a((a11 + (textCommonInputVO == null ? 0 : textCommonInputVO.hashCode())) * 31, 31, this.isSelectedPassengerUnsuitable), 31, this.passengers);
    }

    /* renamed from: isSearchInputVisible, reason: from getter */
    public final boolean getIsSearchInputVisible() {
        return this.isSearchInputVisible;
    }

    /* renamed from: isSelectedPassengerUnsuitable, reason: from getter */
    public final boolean getIsSelectedPassengerUnsuitable() {
        return this.isSelectedPassengerUnsuitable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isSearchInputVisible;
        CommonInputVO.TextCommonInputVO textCommonInputVO = this.search;
        boolean z12 = this.isSelectedPassengerUnsuitable;
        List<PassengerV2VO> list = this.passengers;
        StubV2VO stubV2VO = this.emptyState;
        StringBuilder c11 = b.c(j11, "PassengersDirectoryV2VO(id=", ", isSearchInputVisible=", z11);
        c11.append(", search=");
        c11.append(textCommonInputVO);
        c11.append(", isSelectedPassengerUnsuitable=");
        c11.append(z12);
        c11.append(", passengers=");
        c11.append(list);
        c11.append(", emptyState=");
        c11.append(stubV2VO);
        c11.append(")");
        return c11.toString();
    }
}
