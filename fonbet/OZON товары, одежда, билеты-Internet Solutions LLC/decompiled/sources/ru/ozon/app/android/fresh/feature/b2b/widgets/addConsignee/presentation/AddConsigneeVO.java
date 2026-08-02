package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Ns.b;
import TY.a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003567BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "kppField", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "requisitesCells", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$AdditionalFields;", "additionalFields", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$AdditionalFields;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "getKppField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "Ljava/util/List;", "getRequisitesCells", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$AdditionalFields;", "getAdditionalFields", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$AdditionalFields;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "AdditionalFields", "InputField", "InputFieldErrors", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddConsigneeVO implements c {
    private final AdditionalFields additionalFields;
    private final ButtonV3DTO button;

    @NotNull
    private final TextDTO description;
    private final long id;

    @NotNull
    private final InputField kppField;
    private final List<CellDTO> requisitesCells;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$AdditionalFields;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "branchNameField", "addressField", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "getBranchNameField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "getAddressField", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalFields {
        public static final int $stable = AtomAction.$stable;

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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputFieldErrors;", "inputFieldErrors", "", "isDisabled", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputFieldErrors;ZLru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputFieldErrors;ZLru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "getPlaceholder", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputFieldErrors;", "getInputFieldErrors", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputFieldErrors;", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputField {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        @NotNull
        private final InputFieldErrors inputFieldErrors;
        private final boolean isDisabled;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;
        private final String value;

        public InputField(@NotNull String name, String str, @NotNull String placeholder, @NotNull InputFieldErrors inputFieldErrors, boolean z11, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(inputFieldErrors, "inputFieldErrors");
            this.name = name;
            this.value = str;
            this.placeholder = placeholder;
            this.inputFieldErrors = inputFieldErrors;
            this.isDisabled = z11;
            this.action = atomAction;
        }

        public static /* synthetic */ InputField copy$default(InputField inputField, String str, String str2, String str3, InputFieldErrors inputFieldErrors, boolean z11, AtomAction atomAction, int i11, Object obj) {
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
                atomAction = inputField.action;
            }
            boolean z12 = z11;
            AtomAction atomAction2 = atomAction;
            return inputField.copy(str, str2, str3, inputFieldErrors, z12, atomAction2);
        }

        @NotNull
        public final InputField copy(@NotNull String name, String value, @NotNull String placeholder, @NotNull InputFieldErrors inputFieldErrors, boolean isDisabled, AtomAction action) {
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
            AtomAction atomAction = this.action;
            return a11 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        /* renamed from: isDisabled, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.value;
            String str3 = this.placeholder;
            InputFieldErrors inputFieldErrors = this.inputFieldErrors;
            boolean z11 = this.isDisabled;
            AtomAction atomAction = this.action;
            StringBuilder d11 = C3660k.d("InputField(name=", str, ", value=", str2, ", placeholder=");
            d11.append(str3);
            d11.append(", inputFieldErrors=");
            d11.append(inputFieldErrors);
            d11.append(", isDisabled=");
            d11.append(z11);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputFieldErrors;", "", "", "emptyFieldError", "incorrectFieldError", "anotherFieldError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmptyFieldError", "getIncorrectFieldError", "getAnotherFieldError", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputFieldErrors {
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

    public AddConsigneeVO(long j11, @NotNull TextDTO description, @NotNull InputField kppField, List<CellDTO> list, AdditionalFields additionalFields, ButtonV3DTO buttonV3DTO, t tVar) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(kppField, "kppField");
        this.id = j11;
        this.description = description;
        this.kppField = kppField;
        this.requisitesCells = list;
        this.additionalFields = additionalFields;
        this.button = buttonV3DTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddConsigneeVO)) {
            return false;
        }
        AddConsigneeVO addConsigneeVO = (AddConsigneeVO) other;
        return this.id == addConsigneeVO.id && Intrinsics.d(this.description, addConsigneeVO.description) && Intrinsics.d(this.kppField, addConsigneeVO.kppField) && Intrinsics.d(this.requisitesCells, addConsigneeVO.requisitesCells) && Intrinsics.d(this.additionalFields, addConsigneeVO.additionalFields) && Intrinsics.d(this.button, addConsigneeVO.button) && Intrinsics.d(this.tokenizedEvent, addConsigneeVO.tokenizedEvent);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InputField getKppField() {
        return this.kppField;
    }

    public final List<CellDTO> getRequisitesCells() {
        return this.requisitesCells;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.kppField.hashCode() + b.a(this.description, Long.hashCode(this.id) * 31, 31)) * 31;
        List<CellDTO> list = this.requisitesCells;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AdditionalFields additionalFields = this.additionalFields;
        int hashCode3 = (hashCode2 + (additionalFields == null ? 0 : additionalFields.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.description;
        InputField inputField = this.kppField;
        List<CellDTO> list = this.requisitesCells;
        AdditionalFields additionalFields = this.additionalFields;
        ButtonV3DTO buttonV3DTO = this.button;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("AddConsigneeVO(id=", j11, ", description=", textDTO);
        b11.append(", kppField=");
        b11.append(inputField);
        b11.append(", requisitesCells=");
        b11.append(list);
        b11.append(", additionalFields=");
        b11.append(additionalFields);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
