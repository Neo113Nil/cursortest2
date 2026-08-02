package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import B0.C2454a;
import D3.h;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Pk0.f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.RegistrationDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.ViewType;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "requisites", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI;", "fields", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;", "banner", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTO", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getRequisites", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;", "getBanner", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonV3DTO", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "FieldVI", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RegistrationVI implements c {
    private final RegistrationDTO.Banner banner;

    @NotNull
    private final ButtonV3DTO buttonV3DTO;

    @NotNull
    private final List<FieldVI> fields;
    private final long id;
    private final CellDTO requisites;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;", "input", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "checkbox", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;", "getInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCheckbox", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "InputVI", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FieldVI {
        public static final int $stable = CellDTO.$stable;
        private final CellDTO checkbox;
        private final InputVI input;
        private final TextDTO subtitle;
        private final TextDTO title;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u000f\u0010$R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "caption", "", "required", "readOnly", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;", "lexemes", "", "minLength", "maxLength", "isAddress", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "viewType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "keyboardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;IIZLru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "getPlaceholder", "getCaption", "Z", "getRequired", "()Z", "getReadOnly", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;", "getLexemes", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;", "I", "getMinLength", "getMaxLength", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "getViewType", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getKeyboardType", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InputVI {
            private final String caption;
            private final boolean isAddress;

            @NotNull
            private final OzonTextInputLayoutModel.KeyboardType keyboardType;
            private final RegistrationDTO.FieldDTO.InputDTO.Errors lexemes;
            private final int maxLength;
            private final int minLength;

            @NotNull
            private final String name;

            @NotNull
            private final String placeholder;
            private final boolean readOnly;
            private final boolean required;
            private final String value;

            @NotNull
            private final ViewType viewType;

            public InputVI(@NotNull String name, String str, @NotNull String placeholder, String str2, boolean z11, boolean z12, RegistrationDTO.FieldDTO.InputDTO.Errors errors, int i11, int i12, boolean z13, @NotNull ViewType viewType, @NotNull OzonTextInputLayoutModel.KeyboardType keyboardType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                this.name = name;
                this.value = str;
                this.placeholder = placeholder;
                this.caption = str2;
                this.required = z11;
                this.readOnly = z12;
                this.lexemes = errors;
                this.minLength = i11;
                this.maxLength = i12;
                this.isAddress = z13;
                this.viewType = viewType;
                this.keyboardType = keyboardType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InputVI)) {
                    return false;
                }
                InputVI inputVI = (InputVI) other;
                return Intrinsics.d(this.name, inputVI.name) && Intrinsics.d(this.value, inputVI.value) && Intrinsics.d(this.placeholder, inputVI.placeholder) && Intrinsics.d(this.caption, inputVI.caption) && this.required == inputVI.required && this.readOnly == inputVI.readOnly && Intrinsics.d(this.lexemes, inputVI.lexemes) && this.minLength == inputVI.minLength && this.maxLength == inputVI.maxLength && this.isAddress == inputVI.isAddress && this.viewType == inputVI.viewType && this.keyboardType == inputVI.keyboardType;
            }

            public final String getCaption() {
                return this.caption;
            }

            @NotNull
            public final OzonTextInputLayoutModel.KeyboardType getKeyboardType() {
                return this.keyboardType;
            }

            public final RegistrationDTO.FieldDTO.InputDTO.Errors getLexemes() {
                return this.lexemes;
            }

            public final int getMaxLength() {
                return this.maxLength;
            }

            public final int getMinLength() {
                return this.minLength;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final boolean getReadOnly() {
                return this.readOnly;
            }

            public final boolean getRequired() {
                return this.required;
            }

            public final String getValue() {
                return this.value;
            }

            @NotNull
            public final ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.value;
                int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.placeholder);
                String str2 = this.caption;
                int a12 = C3532b.a(C3532b.a((a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.required), 31, this.readOnly);
                RegistrationDTO.FieldDTO.InputDTO.Errors errors = this.lexemes;
                return this.keyboardType.hashCode() + ((this.viewType.hashCode() + C3532b.a(C2454a.a(this.maxLength, C2454a.a(this.minLength, (a12 + (errors != null ? errors.hashCode() : 0)) * 31, 31), 31), 31, this.isAddress)) * 31);
            }

            /* renamed from: isAddress, reason: from getter */
            public final boolean getIsAddress() {
                return this.isAddress;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.value;
                String str3 = this.placeholder;
                String str4 = this.caption;
                boolean z11 = this.required;
                boolean z12 = this.readOnly;
                RegistrationDTO.FieldDTO.InputDTO.Errors errors = this.lexemes;
                int i11 = this.minLength;
                int i12 = this.maxLength;
                boolean z13 = this.isAddress;
                ViewType viewType = this.viewType;
                OzonTextInputLayoutModel.KeyboardType keyboardType = this.keyboardType;
                StringBuilder d11 = C3660k.d("InputVI(name=", str, ", value=", str2, ", placeholder=");
                a.h(d11, str3, ", caption=", str4, ", required=");
                f.c(", readOnly=", ", lexemes=", d11, z11, z12);
                d11.append(errors);
                d11.append(", minLength=");
                d11.append(i11);
                d11.append(", maxLength=");
                Ql.c.d(d11, i12, ", isAddress=", z13, ", viewType=");
                d11.append(viewType);
                d11.append(", keyboardType=");
                d11.append(keyboardType);
                d11.append(")");
                return d11.toString();
            }
        }

        public FieldVI(TextDTO textDTO, TextDTO textDTO2, InputVI inputVI, CellDTO cellDTO) {
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.input = inputVI;
            this.checkbox = cellDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldVI)) {
                return false;
            }
            FieldVI fieldVI = (FieldVI) other;
            return Intrinsics.d(this.title, fieldVI.title) && Intrinsics.d(this.subtitle, fieldVI.subtitle) && Intrinsics.d(this.input, fieldVI.input) && Intrinsics.d(this.checkbox, fieldVI.checkbox);
        }

        public final CellDTO getCheckbox() {
            return this.checkbox;
        }

        public final InputVI getInput() {
            return this.input;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            InputVI inputVI = this.input;
            int hashCode3 = (hashCode2 + (inputVI == null ? 0 : inputVI.hashCode())) * 31;
            CellDTO cellDTO = this.checkbox;
            return hashCode3 + (cellDTO != null ? cellDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            InputVI inputVI = this.input;
            CellDTO cellDTO = this.checkbox;
            StringBuilder g10 = D3.g.g("FieldVI(title=", textDTO, ", subtitle=", textDTO2, ", input=");
            g10.append(inputVI);
            g10.append(", checkbox=");
            g10.append(cellDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public RegistrationVI(long j11, CellDTO cellDTO, @NotNull List<FieldVI> fields, RegistrationDTO.Banner banner, @NotNull ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(buttonV3DTO, "buttonV3DTO");
        this.id = j11;
        this.requisites = cellDTO;
        this.fields = fields;
        this.banner = banner;
        this.buttonV3DTO = buttonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationVI)) {
            return false;
        }
        RegistrationVI registrationVI = (RegistrationVI) other;
        return this.id == registrationVI.id && Intrinsics.d(this.requisites, registrationVI.requisites) && Intrinsics.d(this.fields, registrationVI.fields) && Intrinsics.d(this.banner, registrationVI.banner) && Intrinsics.d(this.buttonV3DTO, registrationVI.buttonV3DTO);
    }

    public final RegistrationDTO.Banner getBanner() {
        return this.banner;
    }

    @NotNull
    public final ButtonV3DTO getButtonV3DTO() {
        return this.buttonV3DTO;
    }

    @NotNull
    public final List<FieldVI> getFields() {
        return this.fields;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CellDTO getRequisites() {
        return this.requisites;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        CellDTO cellDTO = this.requisites;
        int b11 = g.b((hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31, this.fields);
        RegistrationDTO.Banner banner = this.banner;
        return this.buttonV3DTO.hashCode() + ((b11 + (banner != null ? banner.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.requisites;
        List<FieldVI> list = this.fields;
        RegistrationDTO.Banner banner = this.banner;
        ButtonV3DTO buttonV3DTO = this.buttonV3DTO;
        StringBuilder e11 = h.e("RegistrationVI(id=", j11, ", requisites=", cellDTO);
        e11.append(", fields=");
        e11.append(list);
        e11.append(", banner=");
        e11.append(banner);
        e11.append(", buttonV3DTO=");
        e11.append(buttonV3DTO);
        e11.append(")");
        return e11.toString();
    }
}
