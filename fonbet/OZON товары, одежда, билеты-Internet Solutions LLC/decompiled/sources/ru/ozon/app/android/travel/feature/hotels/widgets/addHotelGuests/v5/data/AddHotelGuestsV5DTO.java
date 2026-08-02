package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data;

import Co.a;
import G.g;
import Kk.C3532b;
import Kk.c;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "rooms", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$RoomDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getRooms", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "RoomDTO", "GuestFormDTO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddHotelGuestsV5DTO implements TrackingInfoHolder {
    public static final int $stable = 8;

    @NotNull
    private final List<RoomDTO> rooms;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$GuestFormDTO;", "", "guestId", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "optionalGuestTitlePostfix", "removeOptionalGuestButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "inputs", "", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "isFormVisible", "", "isOptionalForm", "selectEmployeeButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Ljava/util/List;ZZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getGuestId", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getOptionalGuestTitlePostfix", "getRemoveOptionalGuestButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getInputs", "()Ljava/util/List;", "()Z", "getSelectEmployeeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GuestFormDTO {
        public static final int $stable = 8;
        private final String guestId;

        @NotNull
        private final List<CommonInputDTO> inputs;
        private final boolean isFormVisible;
        private final boolean isOptionalForm;
        private final TextDTO optionalGuestTitlePostfix;
        private final LinkButtonDTO removeOptionalGuestButton;
        private final ButtonV3DTO selectEmployeeButton;
        private final TextDTO title;

        public GuestFormDTO(String str, TextDTO textDTO, TextDTO textDTO2, LinkButtonDTO linkButtonDTO, @NotNull List<CommonInputDTO> inputs, boolean z11, boolean z12, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.guestId = str;
            this.title = textDTO;
            this.optionalGuestTitlePostfix = textDTO2;
            this.removeOptionalGuestButton = linkButtonDTO;
            this.inputs = inputs;
            this.isFormVisible = z11;
            this.isOptionalForm = z12;
            this.selectEmployeeButton = buttonV3DTO;
        }

        public static /* synthetic */ GuestFormDTO copy$default(GuestFormDTO guestFormDTO, String str, TextDTO textDTO, TextDTO textDTO2, LinkButtonDTO linkButtonDTO, List list, boolean z11, boolean z12, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = guestFormDTO.guestId;
            }
            if ((i11 & 2) != 0) {
                textDTO = guestFormDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = guestFormDTO.optionalGuestTitlePostfix;
            }
            if ((i11 & 8) != 0) {
                linkButtonDTO = guestFormDTO.removeOptionalGuestButton;
            }
            if ((i11 & 16) != 0) {
                list = guestFormDTO.inputs;
            }
            if ((i11 & 32) != 0) {
                z11 = guestFormDTO.isFormVisible;
            }
            if ((i11 & 64) != 0) {
                z12 = guestFormDTO.isOptionalForm;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                buttonV3DTO = guestFormDTO.selectEmployeeButton;
            }
            boolean z13 = z12;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            List list2 = list;
            boolean z14 = z11;
            return guestFormDTO.copy(str, textDTO, textDTO2, linkButtonDTO, list2, z14, z13, buttonV3DTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getGuestId() {
            return this.guestId;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getOptionalGuestTitlePostfix() {
            return this.optionalGuestTitlePostfix;
        }

        /* renamed from: component4, reason: from getter */
        public final LinkButtonDTO getRemoveOptionalGuestButton() {
            return this.removeOptionalGuestButton;
        }

        @NotNull
        public final List<CommonInputDTO> component5() {
            return this.inputs;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFormVisible() {
            return this.isFormVisible;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsOptionalForm() {
            return this.isOptionalForm;
        }

        /* renamed from: component8, reason: from getter */
        public final ButtonV3DTO getSelectEmployeeButton() {
            return this.selectEmployeeButton;
        }

        @NotNull
        public final GuestFormDTO copy(String guestId, TextDTO title, TextDTO optionalGuestTitlePostfix, LinkButtonDTO removeOptionalGuestButton, @NotNull List<CommonInputDTO> inputs, boolean isFormVisible, boolean isOptionalForm, ButtonV3DTO selectEmployeeButton) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new GuestFormDTO(guestId, title, optionalGuestTitlePostfix, removeOptionalGuestButton, inputs, isFormVisible, isOptionalForm, selectEmployeeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GuestFormDTO)) {
                return false;
            }
            GuestFormDTO guestFormDTO = (GuestFormDTO) other;
            return Intrinsics.d(this.guestId, guestFormDTO.guestId) && Intrinsics.d(this.title, guestFormDTO.title) && Intrinsics.d(this.optionalGuestTitlePostfix, guestFormDTO.optionalGuestTitlePostfix) && Intrinsics.d(this.removeOptionalGuestButton, guestFormDTO.removeOptionalGuestButton) && Intrinsics.d(this.inputs, guestFormDTO.inputs) && this.isFormVisible == guestFormDTO.isFormVisible && this.isOptionalForm == guestFormDTO.isOptionalForm && Intrinsics.d(this.selectEmployeeButton, guestFormDTO.selectEmployeeButton);
        }

        public final String getGuestId() {
            return this.guestId;
        }

        @NotNull
        public final List<CommonInputDTO> getInputs() {
            return this.inputs;
        }

        public final TextDTO getOptionalGuestTitlePostfix() {
            return this.optionalGuestTitlePostfix;
        }

        public final LinkButtonDTO getRemoveOptionalGuestButton() {
            return this.removeOptionalGuestButton;
        }

        public final ButtonV3DTO getSelectEmployeeButton() {
            return this.selectEmployeeButton;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.guestId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.optionalGuestTitlePostfix;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            LinkButtonDTO linkButtonDTO = this.removeOptionalGuestButton;
            int a11 = C3532b.a(C3532b.a(g.b((hashCode3 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31, 31, this.inputs), 31, this.isFormVisible), 31, this.isOptionalForm);
            ButtonV3DTO buttonV3DTO = this.selectEmployeeButton;
            return a11 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        public final boolean isFormVisible() {
            return this.isFormVisible;
        }

        public final boolean isOptionalForm() {
            return this.isOptionalForm;
        }

        @NotNull
        public String toString() {
            String str = this.guestId;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.optionalGuestTitlePostfix;
            LinkButtonDTO linkButtonDTO = this.removeOptionalGuestButton;
            List<CommonInputDTO> list = this.inputs;
            boolean z11 = this.isFormVisible;
            boolean z12 = this.isOptionalForm;
            ButtonV3DTO buttonV3DTO = this.selectEmployeeButton;
            StringBuilder b11 = a.b("GuestFormDTO(guestId=", textDTO, str, ", title=", ", optionalGuestTitlePostfix=");
            b11.append(textDTO2);
            b11.append(", removeOptionalGuestButton=");
            b11.append(linkButtonDTO);
            b11.append(", inputs=");
            b11.append(list);
            b11.append(", isFormVisible=");
            b11.append(z11);
            b11.append(", isOptionalForm=");
            b11.append(z12);
            b11.append(", selectEmployeeButton=");
            b11.append(buttonV3DTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$RoomDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "forms", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$GuestFormDTO;", "addGuestButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getForms", "()Ljava/util/List;", "getAddGuestButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoomDTO {
        public static final int $stable = 8;
        private final LinkButtonDTO addGuestButton;
        private final DisclaimerAtom disclaimer;

        @NotNull
        private final List<GuestFormDTO> forms;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public RoomDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<GuestFormDTO> forms, LinkButtonDTO linkButtonDTO, DisclaimerAtom disclaimerAtom) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(forms, "forms");
            this.title = title;
            this.subtitle = subtitle;
            this.forms = forms;
            this.addGuestButton = linkButtonDTO;
            this.disclaimer = disclaimerAtom;
        }

        public static /* synthetic */ RoomDTO copy$default(RoomDTO roomDTO, TextDTO textDTO, TextDTO textDTO2, List list, LinkButtonDTO linkButtonDTO, DisclaimerAtom disclaimerAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = roomDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = roomDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = roomDTO.forms;
            }
            if ((i11 & 8) != 0) {
                linkButtonDTO = roomDTO.addGuestButton;
            }
            if ((i11 & 16) != 0) {
                disclaimerAtom = roomDTO.disclaimer;
            }
            DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
            List list2 = list;
            return roomDTO.copy(textDTO, textDTO2, list2, linkButtonDTO, disclaimerAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final List<GuestFormDTO> component3() {
            return this.forms;
        }

        /* renamed from: component4, reason: from getter */
        public final LinkButtonDTO getAddGuestButton() {
            return this.addGuestButton;
        }

        /* renamed from: component5, reason: from getter */
        public final DisclaimerAtom getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final RoomDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<GuestFormDTO> forms, LinkButtonDTO addGuestButton, DisclaimerAtom disclaimer) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(forms, "forms");
            return new RoomDTO(title, subtitle, forms, addGuestButton, disclaimer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoomDTO)) {
                return false;
            }
            RoomDTO roomDTO = (RoomDTO) other;
            return Intrinsics.d(this.title, roomDTO.title) && Intrinsics.d(this.subtitle, roomDTO.subtitle) && Intrinsics.d(this.forms, roomDTO.forms) && Intrinsics.d(this.addGuestButton, roomDTO.addGuestButton) && Intrinsics.d(this.disclaimer, roomDTO.disclaimer);
        }

        public final LinkButtonDTO getAddGuestButton() {
            return this.addGuestButton;
        }

        public final DisclaimerAtom getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final List<GuestFormDTO> getForms() {
            return this.forms;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = g.b(b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.forms);
            LinkButtonDTO linkButtonDTO = this.addGuestButton;
            int hashCode = (b11 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31;
            DisclaimerAtom disclaimerAtom = this.disclaimer;
            return hashCode + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            List<GuestFormDTO> list = this.forms;
            LinkButtonDTO linkButtonDTO = this.addGuestButton;
            DisclaimerAtom disclaimerAtom = this.disclaimer;
            StringBuilder g10 = D3.g.g("RoomDTO(title=", textDTO, ", subtitle=", textDTO2, ", forms=");
            g10.append(list);
            g10.append(", addGuestButton=");
            g10.append(linkButtonDTO);
            g10.append(", disclaimer=");
            g10.append(disclaimerAtom);
            g10.append(")");
            return g10.toString();
        }
    }

    public AddHotelGuestsV5DTO(@NotNull List<RoomDTO> rooms, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        this.rooms = rooms;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddHotelGuestsV5DTO copy$default(AddHotelGuestsV5DTO addHotelGuestsV5DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addHotelGuestsV5DTO.rooms;
        }
        if ((i11 & 2) != 0) {
            map = addHotelGuestsV5DTO.trackingInfo;
        }
        return addHotelGuestsV5DTO.copy(list, map);
    }

    @NotNull
    public final List<RoomDTO> component1() {
        return this.rooms;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddHotelGuestsV5DTO copy(@NotNull List<RoomDTO> rooms, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        return new AddHotelGuestsV5DTO(rooms, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddHotelGuestsV5DTO)) {
            return false;
        }
        AddHotelGuestsV5DTO addHotelGuestsV5DTO = (AddHotelGuestsV5DTO) other;
        return Intrinsics.d(this.rooms, addHotelGuestsV5DTO.rooms) && Intrinsics.d(this.trackingInfo, addHotelGuestsV5DTO.trackingInfo);
    }

    @NotNull
    public final List<RoomDTO> getRooms() {
        return this.rooms;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.rooms.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("AddHotelGuestsV5DTO(rooms=", ", trackingInfo=", ")", this.rooms, this.trackingInfo);
    }
}
