package spay.sdk.domain.model.response.paymentToken.errorResponse;

import I0.C3173b;
import N3.C3660k;
import Nh.a;
import Ve.C4636t5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000f¨\u0006\""}, d2 = {"Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "Landroid/os/Parcelable;", "actionCode", "", "isClientBlock", "", "confirmMethodFactor", "formParameters", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "(Ljava/lang/String;ZLjava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;)V", "getActionCode", "()Ljava/lang/String;", "getConfirmMethodFactor", "getFormParameters", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FormParameters", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FraudMonCheckResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FraudMonCheckResult> CREATOR = new Creator();

    @NotNull
    private final String actionCode;
    private final String confirmMethodFactor;

    @NotNull
    private final FormParameters formParameters;
    private final boolean isClientBlock;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudMonCheckResult> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FraudMonCheckResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FraudMonCheckResult(parcel.readString(), parcel.readInt() != 0, parcel.readString(), FormParameters.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FraudMonCheckResult[] newArray(int i11) {
            return new FraudMonCheckResult[i11];
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006,"}, d2 = {"Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "Landroid/os/Parcelable;", CommentV3DTO.HEADER_FIELD_NAME, "", "text", "textDecline", "buttonConfirmText", "buttonDeclineText", "buttonInformText", "cybercabinetUrlAndroid", "cybercabinetUrlIOS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonConfirmText", "()Ljava/lang/String;", "getButtonDeclineText", "getButtonInformText", "getCybercabinetUrlAndroid", "getCybercabinetUrlIOS", "getHeader", "getText", "getTextDecline", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FormParameters implements Parcelable {
        private final String buttonConfirmText;
        private final String buttonDeclineText;
        private final String buttonInformText;
        private final String cybercabinetUrlAndroid;
        private final String cybercabinetUrlIOS;
        private final String header;
        private final String text;
        private final String textDecline;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<FormParameters> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters$Companion;", "", "()V", "empty", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final FormParameters empty() {
                return new FormParameters(null, null, null, null, null, null, null, null);
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormParameters> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FormParameters createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FormParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FormParameters[] newArray(int i11) {
                return new FormParameters[i11];
            }
        }

        public FormParameters(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.header = str;
            this.text = str2;
            this.textDecline = str3;
            this.buttonConfirmText = str4;
            this.buttonDeclineText = str5;
            this.buttonInformText = str6;
            this.cybercabinetUrlAndroid = str7;
            this.cybercabinetUrlIOS = str8;
        }

        public static /* synthetic */ FormParameters copy$default(FormParameters formParameters, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = formParameters.header;
            }
            if ((i11 & 2) != 0) {
                str2 = formParameters.text;
            }
            if ((i11 & 4) != 0) {
                str3 = formParameters.textDecline;
            }
            if ((i11 & 8) != 0) {
                str4 = formParameters.buttonConfirmText;
            }
            if ((i11 & 16) != 0) {
                str5 = formParameters.buttonDeclineText;
            }
            if ((i11 & 32) != 0) {
                str6 = formParameters.buttonInformText;
            }
            if ((i11 & 64) != 0) {
                str7 = formParameters.cybercabinetUrlAndroid;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str8 = formParameters.cybercabinetUrlIOS;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            return formParameters.copy(str, str2, str3, str4, str11, str12, str9, str10);
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
        public final FormParameters copy(String header, String text, String textDecline, String buttonConfirmText, String buttonDeclineText, String buttonInformText, String cybercabinetUrlAndroid, String cybercabinetUrlIOS) {
            return new FormParameters(header, text, textDecline, buttonConfirmText, buttonDeclineText, buttonInformText, cybercabinetUrlAndroid, cybercabinetUrlIOS);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormParameters)) {
                return false;
            }
            FormParameters formParameters = (FormParameters) other;
            return Intrinsics.d(this.header, formParameters.header) && Intrinsics.d(this.text, formParameters.text) && Intrinsics.d(this.textDecline, formParameters.textDecline) && Intrinsics.d(this.buttonConfirmText, formParameters.buttonConfirmText) && Intrinsics.d(this.buttonDeclineText, formParameters.buttonDeclineText) && Intrinsics.d(this.buttonInformText, formParameters.buttonInformText) && Intrinsics.d(this.cybercabinetUrlAndroid, formParameters.cybercabinetUrlAndroid) && Intrinsics.d(this.cybercabinetUrlIOS, formParameters.cybercabinetUrlIOS);
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
            StringBuilder d11 = C3660k.d("FormParameters(header=", str, ", text=", str2, ", textDecline=");
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
    }

    public FraudMonCheckResult(@NotNull String actionCode, boolean z11, String str, @NotNull FormParameters formParameters) {
        Intrinsics.checkNotNullParameter(actionCode, "actionCode");
        Intrinsics.checkNotNullParameter(formParameters, "formParameters");
        this.actionCode = actionCode;
        this.isClientBlock = z11;
        this.confirmMethodFactor = str;
        this.formParameters = formParameters;
    }

    public static /* synthetic */ FraudMonCheckResult copy$default(FraudMonCheckResult fraudMonCheckResult, String str, boolean z11, String str2, FormParameters formParameters, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fraudMonCheckResult.actionCode;
        }
        if ((i11 & 2) != 0) {
            z11 = fraudMonCheckResult.isClientBlock;
        }
        if ((i11 & 4) != 0) {
            str2 = fraudMonCheckResult.confirmMethodFactor;
        }
        if ((i11 & 8) != 0) {
            formParameters = fraudMonCheckResult.formParameters;
        }
        return fraudMonCheckResult.copy(str, z11, str2, formParameters);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getActionCode() {
        return this.actionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsClientBlock() {
        return this.isClientBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FormParameters getFormParameters() {
        return this.formParameters;
    }

    @NotNull
    public final FraudMonCheckResult copy(@NotNull String actionCode, boolean isClientBlock, String confirmMethodFactor, @NotNull FormParameters formParameters) {
        Intrinsics.checkNotNullParameter(actionCode, "actionCode");
        Intrinsics.checkNotNullParameter(formParameters, "formParameters");
        return new FraudMonCheckResult(actionCode, isClientBlock, confirmMethodFactor, formParameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudMonCheckResult)) {
            return false;
        }
        FraudMonCheckResult fraudMonCheckResult = (FraudMonCheckResult) other;
        return Intrinsics.d(this.actionCode, fraudMonCheckResult.actionCode) && this.isClientBlock == fraudMonCheckResult.isClientBlock && Intrinsics.d(this.confirmMethodFactor, fraudMonCheckResult.confirmMethodFactor) && Intrinsics.d(this.formParameters, fraudMonCheckResult.formParameters);
    }

    @NotNull
    public final String getActionCode() {
        return this.actionCode;
    }

    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    @NotNull
    public final FormParameters getFormParameters() {
        return this.formParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.actionCode.hashCode() * 31;
        boolean z11 = this.isClientBlock;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        String str = this.confirmMethodFactor;
        return this.formParameters.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isClientBlock() {
        return this.isClientBlock;
    }

    @NotNull
    public String toString() {
        String str = this.actionCode;
        boolean z11 = this.isClientBlock;
        String str2 = this.confirmMethodFactor;
        FormParameters formParameters = this.formParameters;
        StringBuilder b11 = C4636t5.b("FraudMonCheckResult(actionCode=", str, ", isClientBlock=", ", confirmMethodFactor=", z11);
        b11.append(str2);
        b11.append(", formParameters=");
        b11.append(formParameters);
        b11.append(")");
        return b11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.actionCode);
        parcel.writeInt(this.isClientBlock ? 1 : 0);
        parcel.writeString(this.confirmMethodFactor);
        this.formParameters.writeToParcel(parcel, flags);
    }
}
