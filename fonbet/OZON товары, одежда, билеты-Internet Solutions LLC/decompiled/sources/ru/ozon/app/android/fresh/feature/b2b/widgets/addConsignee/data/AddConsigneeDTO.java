package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data;

import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003&'(B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO;", "", "description", "Lru/ozon/uni/atoms/data/text/TextDTO;", "kppField", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;", "requisitesCells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "additionalFields", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$AdditionalFields;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$AdditionalFields;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getKppField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;", "getRequisitesCells", "()Ljava/util/List;", "getAdditionalFields", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$AdditionalFields;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AdditionalFields", "InputField", "InputFieldErrors", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddConsigneeDTO {
    public static final int $stable = 8;
    private final AdditionalFields additionalFields;
    private final ButtonV3DTO button;

    @NotNull
    private final TextDTO description;

    @NotNull
    private final InputField kppField;
    private final List<CellDTO> requisitesCells;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$AdditionalFields;", "", "branchNameField", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;", "addressField", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;)V", "getBranchNameField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;", "getAddressField", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalFields {
        public static final int $stable = 0;

        @NotNull
        private final InputField addressField;

        @NotNull
        private final InputField branchNameField;

        public AdditionalFields(@NotNull InputField branchNameField, @NotNull InputField addressField) {
            Intrinsics.checkNotNullParameter(branchNameField, "branchNameField");
            Intrinsics.checkNotNullParameter(addressField, "addressField");
            this.branchNameField = branchNameField;
            this.addressField = addressField;
        }

        public static /* synthetic */ AdditionalFields copy$default(AdditionalFields additionalFields, InputField inputField, InputField inputField2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                inputField = additionalFields.branchNameField;
            }
            if ((i11 & 2) != 0) {
                inputField2 = additionalFields.addressField;
            }
            return additionalFields.copy(inputField, inputField2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InputField getBranchNameField() {
            return this.branchNameField;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final InputField getAddressField() {
            return this.addressField;
        }

        @NotNull
        public final AdditionalFields copy(@NotNull InputField branchNameField, @NotNull InputField addressField) {
            Intrinsics.checkNotNullParameter(branchNameField, "branchNameField");
            Intrinsics.checkNotNullParameter(addressField, "addressField");
            return new AdditionalFields(branchNameField, addressField);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalFields)) {
                return false;
            }
            AdditionalFields additionalFields = (AdditionalFields) other;
            return Intrinsics.d(this.branchNameField, additionalFields.branchNameField) && Intrinsics.d(this.addressField, additionalFields.addressField);
        }

        @NotNull
        public final InputField getAddressField() {
            return this.addressField;
        }

        @NotNull
        public final InputField getBranchNameField() {
            return this.branchNameField;
        }

        public int hashCode() {
            return this.addressField.hashCode() + (this.branchNameField.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AdditionalFields(branchNameField=" + this.branchNameField + ", addressField=" + this.addressField + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "inputFieldErrors", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputFieldErrors;", "isDisabled", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputFieldErrors;ZLru/ozon/uni/atoms/data/AtomActionDTO;)V", "getName", "()Ljava/lang/String;", "getValue", "getPlaceholder", "getInputFieldErrors", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputFieldErrors;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputField {
        public static final int $stable = 0;
        private final AtomActionDTO action;

        @NotNull
        private final InputFieldErrors inputFieldErrors;
        private final boolean isDisabled;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;
        private final String value;

        public InputField(@NotNull String name, String str, @NotNull String placeholder, @NotNull InputFieldErrors inputFieldErrors, boolean z11, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(inputFieldErrors, "inputFieldErrors");
            this.name = name;
            this.value = str;
            this.placeholder = placeholder;
            this.inputFieldErrors = inputFieldErrors;
            this.isDisabled = z11;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ InputField copy$default(InputField inputField, String str, String str2, String str3, InputFieldErrors inputFieldErrors, boolean z11, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputField.name;
            }
            if ((i11 & 2) != 0) {
                str2 = inputField.value;
            }
            if ((i11 & 4) != 0) {
                str3 = inputField.placeholder;
            }
            if ((i11 & 8) != 0) {
                inputFieldErrors = inputField.inputFieldErrors;
            }
            if ((i11 & 16) != 0) {
                z11 = inputField.isDisabled;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = inputField.action;
            }
            boolean z12 = z11;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return inputField.copy(str, str2, str3, inputFieldErrors, z12, atomActionDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final InputFieldErrors getInputFieldErrors() {
            return this.inputFieldErrors;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final InputField copy(@NotNull String name, String value, @NotNull String placeholder, @NotNull InputFieldErrors inputFieldErrors, boolean isDisabled, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(inputFieldErrors, "inputFieldErrors");
            return new InputField(name, value, placeholder, inputFieldErrors, isDisabled, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputField)) {
                return false;
            }
            InputField inputField = (InputField) other;
            return Intrinsics.d(this.name, inputField.name) && Intrinsics.d(this.value, inputField.value) && Intrinsics.d(this.placeholder, inputField.placeholder) && Intrinsics.d(this.inputFieldErrors, inputField.inputFieldErrors) && this.isDisabled == inputField.isDisabled && Intrinsics.d(this.action, inputField.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final InputFieldErrors getInputFieldErrors() {
            return this.inputFieldErrors;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.value;
            int a11 = C3532b.a((this.inputFieldErrors.hashCode() + g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.placeholder)) * 31, 31, this.isDisabled);
            AtomActionDTO atomActionDTO = this.action;
            return a11 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        public final boolean isDisabled() {
            return this.isDisabled;
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.value;
            String str3 = this.placeholder;
            InputFieldErrors inputFieldErrors = this.inputFieldErrors;
            boolean z11 = this.isDisabled;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder d11 = C3660k.d("InputField(name=", str, ", value=", str2, ", placeholder=");
            d11.append(str3);
            d11.append(", inputFieldErrors=");
            d11.append(inputFieldErrors);
            d11.append(", isDisabled=");
            d11.append(z11);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputFieldErrors;", "", "emptyFieldError", "", "incorrectFieldError", "anotherFieldError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmptyFieldError", "()Ljava/lang/String;", "getIncorrectFieldError", "getAnotherFieldError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputFieldErrors {
        public static final int $stable = 0;
        private final String anotherFieldError;

        @NotNull
        private final String emptyFieldError;
        private final String incorrectFieldError;

        public InputFieldErrors(@NotNull String emptyFieldError, String str, String str2) {
            Intrinsics.checkNotNullParameter(emptyFieldError, "emptyFieldError");
            this.emptyFieldError = emptyFieldError;
            this.incorrectFieldError = str;
            this.anotherFieldError = str2;
        }

        public static /* synthetic */ InputFieldErrors copy$default(InputFieldErrors inputFieldErrors, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputFieldErrors.emptyFieldError;
            }
            if ((i11 & 2) != 0) {
                str2 = inputFieldErrors.incorrectFieldError;
            }
            if ((i11 & 4) != 0) {
                str3 = inputFieldErrors.anotherFieldError;
            }
            return inputFieldErrors.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getEmptyFieldError() {
            return this.emptyFieldError;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIncorrectFieldError() {
            return this.incorrectFieldError;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnotherFieldError() {
            return this.anotherFieldError;
        }

        @NotNull
        public final InputFieldErrors copy(@NotNull String emptyFieldError, String incorrectFieldError, String anotherFieldError) {
            Intrinsics.checkNotNullParameter(emptyFieldError, "emptyFieldError");
            return new InputFieldErrors(emptyFieldError, incorrectFieldError, anotherFieldError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputFieldErrors)) {
                return false;
            }
            InputFieldErrors inputFieldErrors = (InputFieldErrors) other;
            return Intrinsics.d(this.emptyFieldError, inputFieldErrors.emptyFieldError) && Intrinsics.d(this.incorrectFieldError, inputFieldErrors.incorrectFieldError) && Intrinsics.d(this.anotherFieldError, inputFieldErrors.anotherFieldError);
        }

        public final String getAnotherFieldError() {
            return this.anotherFieldError;
        }

        @NotNull
        public final String getEmptyFieldError() {
            return this.emptyFieldError;
        }

        public final String getIncorrectFieldError() {
            return this.incorrectFieldError;
        }

        public int hashCode() {
            int hashCode = this.emptyFieldError.hashCode() * 31;
            String str = this.incorrectFieldError;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.anotherFieldError;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.emptyFieldError;
            String str2 = this.incorrectFieldError;
            return o0.c(C3660k.d("InputFieldErrors(emptyFieldError=", str, ", incorrectFieldError=", str2, ", anotherFieldError="), this.anotherFieldError, ")");
        }
    }

    public AddConsigneeDTO(@NotNull TextDTO description, @NotNull InputField kppField, List<CellDTO> list, AdditionalFields additionalFields, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(kppField, "kppField");
        this.description = description;
        this.kppField = kppField;
        this.requisitesCells = list;
        this.additionalFields = additionalFields;
        this.button = buttonV3DTO;
    }

    public static /* synthetic */ AddConsigneeDTO copy$default(AddConsigneeDTO addConsigneeDTO, TextDTO textDTO, InputField inputField, List list, AdditionalFields additionalFields, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = addConsigneeDTO.description;
        }
        if ((i11 & 2) != 0) {
            inputField = addConsigneeDTO.kppField;
        }
        if ((i11 & 4) != 0) {
            list = addConsigneeDTO.requisitesCells;
        }
        if ((i11 & 8) != 0) {
            additionalFields = addConsigneeDTO.additionalFields;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = addConsigneeDTO.button;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        List list2 = list;
        return addConsigneeDTO.copy(textDTO, inputField, list2, additionalFields, buttonV3DTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InputField getKppField() {
        return this.kppField;
    }

    public final List<CellDTO> component3() {
        return this.requisitesCells;
    }

    /* renamed from: component4, reason: from getter */
    public final AdditionalFields getAdditionalFields() {
        return this.additionalFields;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final AddConsigneeDTO copy(@NotNull TextDTO description, @NotNull InputField kppField, List<CellDTO> requisitesCells, AdditionalFields additionalFields, ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(kppField, "kppField");
        return new AddConsigneeDTO(description, kppField, requisitesCells, additionalFields, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddConsigneeDTO)) {
            return false;
        }
        AddConsigneeDTO addConsigneeDTO = (AddConsigneeDTO) other;
        return Intrinsics.d(this.description, addConsigneeDTO.description) && Intrinsics.d(this.kppField, addConsigneeDTO.kppField) && Intrinsics.d(this.requisitesCells, addConsigneeDTO.requisitesCells) && Intrinsics.d(this.additionalFields, addConsigneeDTO.additionalFields) && Intrinsics.d(this.button, addConsigneeDTO.button);
    }

    public final AdditionalFields getAdditionalFields() {
        return this.additionalFields;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final InputField getKppField() {
        return this.kppField;
    }

    public final List<CellDTO> getRequisitesCells() {
        return this.requisitesCells;
    }

    public int hashCode() {
        int hashCode = (this.kppField.hashCode() + (this.description.hashCode() * 31)) * 31;
        List<CellDTO> list = this.requisitesCells;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AdditionalFields additionalFields = this.additionalFields;
        int hashCode3 = (hashCode2 + (additionalFields == null ? 0 : additionalFields.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        return hashCode3 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddConsigneeDTO(description=" + this.description + ", kppField=" + this.kppField + ", requisitesCells=" + this.requisitesCells + ", additionalFields=" + this.additionalFields + ", button=" + this.button + ")";
    }
}
