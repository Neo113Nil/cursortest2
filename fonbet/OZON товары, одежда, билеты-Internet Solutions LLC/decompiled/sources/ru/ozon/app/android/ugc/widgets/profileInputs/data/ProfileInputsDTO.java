package ru.ozon.app.android.ugc.widgets.profileInputs.data;

import B0.C2454a;
import De.C2859b;
import Ek.a;
import I0.C3173b;
import N3.C3660k;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO;", "", "inputField", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getInputField", "()Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "InputField", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileInputsDTO {
    public static final int $stable = 8;

    @NotNull
    private final InputField inputField;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "bottomValue", "minCount", "", "maxCount", "emptyError", "countError", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getBottomValue", "getMinCount", "()I", "getMaxCount", "getEmptyError", "getCountError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputField {
        public static final int $stable = 8;
        private final String bottomValue;
        private final String countError;
        private final String emptyError;
        private final int maxCount;
        private final int minCount;
        private String value;

        public InputField(String str, String str2, int i11, int i12, String str3, String str4) {
            this.value = str;
            this.bottomValue = str2;
            this.minCount = i11;
            this.maxCount = i12;
            this.emptyError = str3;
            this.countError = str4;
        }

        public static /* synthetic */ InputField copy$default(InputField inputField, String str, String str2, int i11, int i12, String str3, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = inputField.value;
            }
            if ((i13 & 2) != 0) {
                str2 = inputField.bottomValue;
            }
            if ((i13 & 4) != 0) {
                i11 = inputField.minCount;
            }
            if ((i13 & 8) != 0) {
                i12 = inputField.maxCount;
            }
            if ((i13 & 16) != 0) {
                str3 = inputField.emptyError;
            }
            if ((i13 & 32) != 0) {
                str4 = inputField.countError;
            }
            String str5 = str3;
            String str6 = str4;
            return inputField.copy(str, str2, i11, i12, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBottomValue() {
            return this.bottomValue;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinCount() {
            return this.minCount;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxCount() {
            return this.maxCount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEmptyError() {
            return this.emptyError;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCountError() {
            return this.countError;
        }

        @NotNull
        public final InputField copy(String value, String bottomValue, int minCount, int maxCount, String emptyError, String countError) {
            return new InputField(value, bottomValue, minCount, maxCount, emptyError, countError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputField)) {
                return false;
            }
            InputField inputField = (InputField) other;
            return Intrinsics.d(this.value, inputField.value) && Intrinsics.d(this.bottomValue, inputField.bottomValue) && this.minCount == inputField.minCount && this.maxCount == inputField.maxCount && Intrinsics.d(this.emptyError, inputField.emptyError) && Intrinsics.d(this.countError, inputField.countError);
        }

        public final String getBottomValue() {
            return this.bottomValue;
        }

        public final String getCountError() {
            return this.countError;
        }

        public final String getEmptyError() {
            return this.emptyError;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final int getMinCount() {
            return this.minCount;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bottomValue;
            int a11 = C2454a.a(this.maxCount, C2454a.a(this.minCount, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
            String str3 = this.emptyError;
            int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.countError;
            return hashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        public final void setValue(String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.bottomValue;
            int i11 = this.minCount;
            int i12 = this.maxCount;
            String str3 = this.emptyError;
            String str4 = this.countError;
            StringBuilder d11 = C3660k.d("InputField(value=", str, ", bottomValue=", str2, ", minCount=");
            a.f(i11, i12, ", maxCount=", ", emptyError=", d11);
            return C3173b.c(d11, str3, ", countError=", str4, ")");
        }
    }

    public ProfileInputsDTO(@NotNull InputField inputField, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.inputField = inputField;
        this.submitButton = submitButton;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileInputsDTO copy$default(ProfileInputsDTO profileInputsDTO, InputField inputField, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            inputField = profileInputsDTO.inputField;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = profileInputsDTO.submitButton;
        }
        if ((i11 & 4) != 0) {
            map = profileInputsDTO.trackingInfo;
        }
        return profileInputsDTO.copy(inputField, buttonV3DTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputField getInputField() {
        return this.inputField;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProfileInputsDTO copy(@NotNull InputField inputField, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new ProfileInputsDTO(inputField, submitButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileInputsDTO)) {
            return false;
        }
        ProfileInputsDTO profileInputsDTO = (ProfileInputsDTO) other;
        return Intrinsics.d(this.inputField, profileInputsDTO.inputField) && Intrinsics.d(this.submitButton, profileInputsDTO.submitButton) && Intrinsics.d(this.trackingInfo, profileInputsDTO.trackingInfo);
    }

    @NotNull
    public final InputField getInputField() {
        return this.inputField;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.submitButton, this.inputField.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        InputField inputField = this.inputField;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProfileInputsDTO(inputField=");
        sb2.append(inputField);
        sb2.append(", submitButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
