package spay.sdk.data.dto.response.paymentToken;

import D40.c;
import I0.C3173b;
import J8.b;
import N3.C3660k;
import Nh.a;
import Ve.C4452mn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0006\u0010\u0011¨\u0006'"}, d2 = {"Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "Landroid/os/Parcelable;", "actionCode", "", "isClientBlock", "", "confirmMethodFactor", "formParametersResponseBodyDto", "Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;)V", "getActionCode", "()Ljava/lang/String;", "getConfirmMethodFactor", "getFormParametersResponseBodyDto", "()Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;)Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "describeContents", "", "equals", "other", "", "hashCode", "toModel", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FormParametersResponseBodyDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FraudMonCheckResultResponseBodyDto implements DataDtoInterface<FraudMonCheckResult>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<FraudMonCheckResultResponseBodyDto> CREATOR = new Creator();

    @b("actionCode")
    private final String actionCode;

    @b("confirmMethodFactor")
    private final String confirmMethodFactor;

    @b("formParameters")
    private final FormParametersResponseBodyDto formParametersResponseBodyDto;

    @b("isClientBlock")
    private final Boolean isClientBlock;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudMonCheckResultResponseBodyDto> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FraudMonCheckResultResponseBodyDto createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FraudMonCheckResultResponseBodyDto(readString, valueOf, parcel.readString(), parcel.readInt() != 0 ? FormParametersResponseBodyDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FraudMonCheckResultResponseBodyDto[] newArray(int i11) {
            return new FraudMonCheckResultResponseBodyDto[i11];
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BU\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\b\u0010'\u001a\u00020\u0002H\u0016J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006."}, d2 = {"Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "Landroid/os/Parcelable;", CommentV3DTO.HEADER_FIELD_NAME, "", "text", "textDecline", "buttonConfirmText", "buttonDeclineText", "buttonInformText", "cybercabinetUrlAndroid", "cybercabinetUrlIOS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonConfirmText", "()Ljava/lang/String;", "getButtonDeclineText", "getButtonInformText", "getCybercabinetUrlAndroid", "getCybercabinetUrlIOS", "getHeader", "getText", "getTextDecline", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toModel", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FormParametersResponseBodyDto implements DataDtoInterface<FraudMonCheckResult.FormParameters>, Parcelable {

        @NotNull
        public static final Parcelable.Creator<FormParametersResponseBodyDto> CREATOR = new Creator();

        @b("buttonConfirmText")
        private final String buttonConfirmText;

        @b("buttonDeclineText")
        private final String buttonDeclineText;

        @b("buttonInformText")
        private final String buttonInformText;

        @b("cybercabinetUrlAndroid")
        private final String cybercabinetUrlAndroid;

        @b("cybercabinetUrlIOS")
        private final String cybercabinetUrlIOS;

        @b(CommentV3DTO.HEADER_FIELD_NAME)
        private final String header;

        @b("text")
        private final String text;

        @b("textDecline")
        private final String textDecline;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormParametersResponseBodyDto> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FormParametersResponseBodyDto createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FormParametersResponseBodyDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FormParametersResponseBodyDto[] newArray(int i11) {
                return new FormParametersResponseBodyDto[i11];
            }
        }

        public FormParametersResponseBodyDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.header = str;
            this.text = str2;
            this.textDecline = str3;
            this.buttonConfirmText = str4;
            this.buttonDeclineText = str5;
            this.buttonInformText = str6;
            this.cybercabinetUrlAndroid = str7;
            this.cybercabinetUrlIOS = str8;
        }

        public static /* synthetic */ FormParametersResponseBodyDto copy$default(FormParametersResponseBodyDto formParametersResponseBodyDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = formParametersResponseBodyDto.header;
            }
            if ((i11 & 2) != 0) {
                str2 = formParametersResponseBodyDto.text;
            }
            if ((i11 & 4) != 0) {
                str3 = formParametersResponseBodyDto.textDecline;
            }
            if ((i11 & 8) != 0) {
                str4 = formParametersResponseBodyDto.buttonConfirmText;
            }
            if ((i11 & 16) != 0) {
                str5 = formParametersResponseBodyDto.buttonDeclineText;
            }
            if ((i11 & 32) != 0) {
                str6 = formParametersResponseBodyDto.buttonInformText;
            }
            if ((i11 & 64) != 0) {
                str7 = formParametersResponseBodyDto.cybercabinetUrlAndroid;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str8 = formParametersResponseBodyDto.cybercabinetUrlIOS;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            return formParametersResponseBodyDto.copy(str, str2, str3, str4, str11, str12, str9, str10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTextDecline() {
            return this.textDecline;
        }

        /* renamed from: component4, reason: from getter */
        public final String getButtonConfirmText() {
            return this.buttonConfirmText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getButtonDeclineText() {
            return this.buttonDeclineText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getButtonInformText() {
            return this.buttonInformText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCybercabinetUrlAndroid() {
            return this.cybercabinetUrlAndroid;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCybercabinetUrlIOS() {
            return this.cybercabinetUrlIOS;
        }

        @NotNull
        public final FormParametersResponseBodyDto copy(String header, String text, String textDecline, String buttonConfirmText, String buttonDeclineText, String buttonInformText, String cybercabinetUrlAndroid, String cybercabinetUrlIOS) {
            return new FormParametersResponseBodyDto(header, text, textDecline, buttonConfirmText, buttonDeclineText, buttonInformText, cybercabinetUrlAndroid, cybercabinetUrlIOS);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormParametersResponseBodyDto)) {
                return false;
            }
            FormParametersResponseBodyDto formParametersResponseBodyDto = (FormParametersResponseBodyDto) other;
            return Intrinsics.d(this.header, formParametersResponseBodyDto.header) && Intrinsics.d(this.text, formParametersResponseBodyDto.text) && Intrinsics.d(this.textDecline, formParametersResponseBodyDto.textDecline) && Intrinsics.d(this.buttonConfirmText, formParametersResponseBodyDto.buttonConfirmText) && Intrinsics.d(this.buttonDeclineText, formParametersResponseBodyDto.buttonDeclineText) && Intrinsics.d(this.buttonInformText, formParametersResponseBodyDto.buttonInformText) && Intrinsics.d(this.cybercabinetUrlAndroid, formParametersResponseBodyDto.cybercabinetUrlAndroid) && Intrinsics.d(this.cybercabinetUrlIOS, formParametersResponseBodyDto.cybercabinetUrlIOS);
        }

        public final String getButtonConfirmText() {
            return this.buttonConfirmText;
        }

        public final String getButtonDeclineText() {
            return this.buttonDeclineText;
        }

        public final String getButtonInformText() {
            return this.buttonInformText;
        }

        public final String getCybercabinetUrlAndroid() {
            return this.cybercabinetUrlAndroid;
        }

        public final String getCybercabinetUrlIOS() {
            return this.cybercabinetUrlIOS;
        }

        public final String getHeader() {
            return this.header;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTextDecline() {
            return this.textDecline;
        }

        public int hashCode() {
            String str = this.header;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.textDecline;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonConfirmText;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeclineText;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.buttonInformText;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cybercabinetUrlAndroid;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.cybercabinetUrlIOS;
            return hashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.header;
            String str2 = this.text;
            String str3 = this.textDecline;
            String str4 = this.buttonConfirmText;
            String str5 = this.buttonDeclineText;
            String str6 = this.buttonInformText;
            String str7 = this.cybercabinetUrlAndroid;
            String str8 = this.cybercabinetUrlIOS;
            StringBuilder d11 = C3660k.d("FormParametersResponseBodyDto(header=", str, ", text=", str2, ", textDecline=");
            a.h(d11, str3, ", buttonConfirmText=", str4, ", buttonDeclineText=");
            a.h(d11, str5, ", buttonInformText=", str6, ", cybercabinetUrlAndroid=");
            return C3173b.c(d11, str7, ", cybercabinetUrlIOS=", str8, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.header);
            parcel.writeString(this.text);
            parcel.writeString(this.textDecline);
            parcel.writeString(this.buttonConfirmText);
            parcel.writeString(this.buttonDeclineText);
            parcel.writeString(this.buttonInformText);
            parcel.writeString(this.cybercabinetUrlAndroid);
            parcel.writeString(this.cybercabinetUrlIOS);
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public FraudMonCheckResult.FormParameters toModel() {
            return new FraudMonCheckResult.FormParameters(this.header, this.text, this.textDecline, this.buttonConfirmText, this.buttonDeclineText, this.buttonInformText, this.cybercabinetUrlAndroid, this.cybercabinetUrlIOS);
        }
    }

    public FraudMonCheckResultResponseBodyDto(String str, Boolean bool, String str2, FormParametersResponseBodyDto formParametersResponseBodyDto) {
        this.actionCode = str;
        this.isClientBlock = bool;
        this.confirmMethodFactor = str2;
        this.formParametersResponseBodyDto = formParametersResponseBodyDto;
    }

    public static /* synthetic */ FraudMonCheckResultResponseBodyDto copy$default(FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, String str, Boolean bool, String str2, FormParametersResponseBodyDto formParametersResponseBodyDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fraudMonCheckResultResponseBodyDto.actionCode;
        }
        if ((i11 & 2) != 0) {
            bool = fraudMonCheckResultResponseBodyDto.isClientBlock;
        }
        if ((i11 & 4) != 0) {
            str2 = fraudMonCheckResultResponseBodyDto.confirmMethodFactor;
        }
        if ((i11 & 8) != 0) {
            formParametersResponseBodyDto = fraudMonCheckResultResponseBodyDto.formParametersResponseBodyDto;
        }
        return fraudMonCheckResultResponseBodyDto.copy(str, bool, str2, formParametersResponseBodyDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActionCode() {
        return this.actionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsClientBlock() {
        return this.isClientBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    /* renamed from: component4, reason: from getter */
    public final FormParametersResponseBodyDto getFormParametersResponseBodyDto() {
        return this.formParametersResponseBodyDto;
    }

    @NotNull
    public final FraudMonCheckResultResponseBodyDto copy(String actionCode, Boolean isClientBlock, String confirmMethodFactor, FormParametersResponseBodyDto formParametersResponseBodyDto) {
        return new FraudMonCheckResultResponseBodyDto(actionCode, isClientBlock, confirmMethodFactor, formParametersResponseBodyDto);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudMonCheckResultResponseBodyDto)) {
            return false;
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = (FraudMonCheckResultResponseBodyDto) other;
        return Intrinsics.d(this.actionCode, fraudMonCheckResultResponseBodyDto.actionCode) && Intrinsics.d(this.isClientBlock, fraudMonCheckResultResponseBodyDto.isClientBlock) && Intrinsics.d(this.confirmMethodFactor, fraudMonCheckResultResponseBodyDto.confirmMethodFactor) && Intrinsics.d(this.formParametersResponseBodyDto, fraudMonCheckResultResponseBodyDto.formParametersResponseBodyDto);
    }

    public final String getActionCode() {
        return this.actionCode;
    }

    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    public final FormParametersResponseBodyDto getFormParametersResponseBodyDto() {
        return this.formParametersResponseBodyDto;
    }

    public int hashCode() {
        String str = this.actionCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isClientBlock;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.confirmMethodFactor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParametersResponseBodyDto;
        return hashCode3 + (formParametersResponseBodyDto != null ? formParametersResponseBodyDto.hashCode() : 0);
    }

    public final Boolean isClientBlock() {
        return this.isClientBlock;
    }

    @NotNull
    public String toString() {
        return "FraudMonCheckResultResponseBodyDto(actionCode=" + this.actionCode + ", isClientBlock=" + this.isClientBlock + ", confirmMethodFactor=" + this.confirmMethodFactor + ", formParametersResponseBodyDto=" + this.formParametersResponseBodyDto + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.actionCode);
        Boolean bool = this.isClientBlock;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            c.c(parcel, 1, bool);
        }
        parcel.writeString(this.confirmMethodFactor);
        FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParametersResponseBodyDto;
        if (formParametersResponseBodyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formParametersResponseBodyDto.writeToParcel(parcel, flags);
        }
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public FraudMonCheckResult toModel() {
        FraudMonCheckResult.FormParameters model;
        String str = this.actionCode;
        if (str == null) {
            throw new C4452mn("actionCode");
        }
        Boolean bool = this.isClientBlock;
        if (bool == null) {
            throw new C4452mn("isClientBlock");
        }
        boolean booleanValue = bool.booleanValue();
        String str2 = this.confirmMethodFactor;
        FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParametersResponseBodyDto;
        if (formParametersResponseBodyDto == null || (model = formParametersResponseBodyDto.toModel()) == null) {
            throw new C4452mn("formParametersResponseBodyDto");
        }
        return new FraudMonCheckResult(str, booleanValue, str2, model);
    }
}
