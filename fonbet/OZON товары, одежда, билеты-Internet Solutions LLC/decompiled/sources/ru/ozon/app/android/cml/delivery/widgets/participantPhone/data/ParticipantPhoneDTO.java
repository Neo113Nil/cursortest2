package ru.ozon.app.android.cml.delivery.widgets.participantPhone.data;

import Ak.b;
import G.g;
import I1.w;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "phoneInput", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO$PhoneInputDTO;", "phoneCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "contactCell", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO$PhoneInputDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPhoneInput", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO$PhoneInputDTO;", "getPhoneCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getContactCell", "getTrackingInfo", "()Ljava/util/Map;", "PhoneInputDTO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParticipantPhoneDTO {

    @NotNull
    private final String backgroundColor;
    private final CellDTO contactCell;
    private final CellDTO phoneCell;

    @NotNull
    private final PhoneInputDTO phoneInput;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO$PhoneInputDTO;", "", "label", "", "countryFlagUrl", "countryCode", "additionalCountryCodes", "", "phoneMask", "errorMessage", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getLabel", "()Ljava/lang/String;", "getCountryFlagUrl", "getCountryCode", "getAdditionalCountryCodes", "()Ljava/util/List;", "getPhoneMask", "getErrorMessage", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhoneInputDTO {
        private final List<String> additionalCountryCodes;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final String countryCode;

        @NotNull
        private final String countryFlagUrl;
        private final String errorMessage;

        @NotNull
        private final String label;

        @NotNull
        private final String phoneMask;

        public PhoneInputDTO(@NotNull String label, @NotNull String countryFlagUrl, @NotNull String countryCode, List<String> list, @NotNull String phoneMask, String str, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(countryFlagUrl, "countryFlagUrl");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(phoneMask, "phoneMask");
            Intrinsics.checkNotNullParameter(common, "common");
            this.label = label;
            this.countryFlagUrl = countryFlagUrl;
            this.countryCode = countryCode;
            this.additionalCountryCodes = list;
            this.phoneMask = phoneMask;
            this.errorMessage = str;
            this.common = common;
        }

        public static /* synthetic */ PhoneInputDTO copy$default(PhoneInputDTO phoneInputDTO, String str, String str2, String str3, List list, String str4, String str5, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = phoneInputDTO.label;
            }
            if ((i11 & 2) != 0) {
                str2 = phoneInputDTO.countryFlagUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = phoneInputDTO.countryCode;
            }
            if ((i11 & 8) != 0) {
                list = phoneInputDTO.additionalCountryCodes;
            }
            if ((i11 & 16) != 0) {
                str4 = phoneInputDTO.phoneMask;
            }
            if ((i11 & 32) != 0) {
                str5 = phoneInputDTO.errorMessage;
            }
            if ((i11 & 64) != 0) {
                commonControlSettings = phoneInputDTO.common;
            }
            String str6 = str5;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            String str7 = str4;
            String str8 = str3;
            return phoneInputDTO.copy(str, str2, str8, list, str7, str6, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCountryFlagUrl() {
            return this.countryFlagUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final List<String> component4() {
            return this.additionalCountryCodes;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getPhoneMask() {
            return this.phoneMask;
        }

        /* renamed from: component6, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final PhoneInputDTO copy(@NotNull String label, @NotNull String countryFlagUrl, @NotNull String countryCode, List<String> additionalCountryCodes, @NotNull String phoneMask, String errorMessage, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(countryFlagUrl, "countryFlagUrl");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(phoneMask, "phoneMask");
            Intrinsics.checkNotNullParameter(common, "common");
            return new PhoneInputDTO(label, countryFlagUrl, countryCode, additionalCountryCodes, phoneMask, errorMessage, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhoneInputDTO)) {
                return false;
            }
            PhoneInputDTO phoneInputDTO = (PhoneInputDTO) other;
            return Intrinsics.d(this.label, phoneInputDTO.label) && Intrinsics.d(this.countryFlagUrl, phoneInputDTO.countryFlagUrl) && Intrinsics.d(this.countryCode, phoneInputDTO.countryCode) && Intrinsics.d(this.additionalCountryCodes, phoneInputDTO.additionalCountryCodes) && Intrinsics.d(this.phoneMask, phoneInputDTO.phoneMask) && Intrinsics.d(this.errorMessage, phoneInputDTO.errorMessage) && Intrinsics.d(this.common, phoneInputDTO.common);
        }

        public final List<String> getAdditionalCountryCodes() {
            return this.additionalCountryCodes;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final String getCountryFlagUrl() {
            return this.countryFlagUrl;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getPhoneMask() {
            return this.phoneMask;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.label.hashCode() * 31, 31, this.countryFlagUrl), 31, this.countryCode);
            List<String> list = this.additionalCountryCodes;
            int a12 = g.a((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.phoneMask);
            String str = this.errorMessage;
            return this.common.hashCode() + ((a12 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.countryFlagUrl;
            String str3 = this.countryCode;
            List<String> list = this.additionalCountryCodes;
            String str4 = this.phoneMask;
            String str5 = this.errorMessage;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder d11 = C3660k.d("PhoneInputDTO(label=", str, ", countryFlagUrl=", str2, ", countryCode=");
            w.d(str3, ", additionalCountryCodes=", ", phoneMask=", d11, list);
            a.h(d11, str4, ", errorMessage=", str5, ", common=");
            return b.g(d11, commonControlSettings, ")");
        }
    }

    public ParticipantPhoneDTO(@NotNull String backgroundColor, @NotNull TextDTO title, @NotNull PhoneInputDTO phoneInput, CellDTO cellDTO, CellDTO cellDTO2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(phoneInput, "phoneInput");
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.phoneInput = phoneInput;
        this.phoneCell = cellDTO;
        this.contactCell = cellDTO2;
        this.trackingInfo = map;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CellDTO getContactCell() {
        return this.contactCell;
    }

    public final CellDTO getPhoneCell() {
        return this.phoneCell;
    }

    @NotNull
    public final PhoneInputDTO getPhoneInput() {
        return this.phoneInput;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }
}
