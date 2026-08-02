package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data;

import B90.C2618u;
import N3.C3660k;
import Nh.a;
import Tl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "input", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO$InputDTO;", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "description", "agreementText", "inputVariants", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO$InputDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInput", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO$InputDTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDescription", "getAgreementText", "getInputVariants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelPersonalAccountReplenishmentDTO {
    public static final int $stable = 8;
    private final TextAtom agreementText;
    private final TextAtom description;

    @NotNull
    private final InputDTO input;

    @NotNull
    private final List<TagV3Atom.TagAtom> inputVariants;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;

    @NotNull
    private final TextAtom title;

    public TravelPersonalAccountReplenishmentDTO(@NotNull TextAtom title, @NotNull InputDTO input, @NotNull ButtonV3Atom.LargeButton submitButton, TextAtom textAtom, TextAtom textAtom2, @NotNull List<TagV3Atom.TagAtom> inputVariants) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(inputVariants, "inputVariants");
        this.title = title;
        this.input = input;
        this.submitButton = submitButton;
        this.description = textAtom;
        this.agreementText = textAtom2;
        this.inputVariants = inputVariants;
    }

    public static /* synthetic */ TravelPersonalAccountReplenishmentDTO copy$default(TravelPersonalAccountReplenishmentDTO travelPersonalAccountReplenishmentDTO, TextAtom textAtom, InputDTO inputDTO, ButtonV3Atom.LargeButton largeButton, TextAtom textAtom2, TextAtom textAtom3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelPersonalAccountReplenishmentDTO.title;
        }
        if ((i11 & 2) != 0) {
            inputDTO = travelPersonalAccountReplenishmentDTO.input;
        }
        if ((i11 & 4) != 0) {
            largeButton = travelPersonalAccountReplenishmentDTO.submitButton;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = travelPersonalAccountReplenishmentDTO.description;
        }
        if ((i11 & 16) != 0) {
            textAtom3 = travelPersonalAccountReplenishmentDTO.agreementText;
        }
        if ((i11 & 32) != 0) {
            list = travelPersonalAccountReplenishmentDTO.inputVariants;
        }
        TextAtom textAtom4 = textAtom3;
        List list2 = list;
        return travelPersonalAccountReplenishmentDTO.copy(textAtom, inputDTO, largeButton, textAtom2, textAtom4, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> component6() {
        return this.inputVariants;
    }

    @NotNull
    public final TravelPersonalAccountReplenishmentDTO copy(@NotNull TextAtom title, @NotNull InputDTO input, @NotNull ButtonV3Atom.LargeButton submitButton, TextAtom description, TextAtom agreementText, @NotNull List<TagV3Atom.TagAtom> inputVariants) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(inputVariants, "inputVariants");
        return new TravelPersonalAccountReplenishmentDTO(title, input, submitButton, description, agreementText, inputVariants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPersonalAccountReplenishmentDTO)) {
            return false;
        }
        TravelPersonalAccountReplenishmentDTO travelPersonalAccountReplenishmentDTO = (TravelPersonalAccountReplenishmentDTO) other;
        return Intrinsics.d(this.title, travelPersonalAccountReplenishmentDTO.title) && Intrinsics.d(this.input, travelPersonalAccountReplenishmentDTO.input) && Intrinsics.d(this.submitButton, travelPersonalAccountReplenishmentDTO.submitButton) && Intrinsics.d(this.description, travelPersonalAccountReplenishmentDTO.description) && Intrinsics.d(this.agreementText, travelPersonalAccountReplenishmentDTO.agreementText) && Intrinsics.d(this.inputVariants, travelPersonalAccountReplenishmentDTO.inputVariants);
    }

    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    public final InputDTO getInput() {
        return this.input;
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> getInputVariants() {
        return this.inputVariants;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.submitButton, (this.input.hashCode() + (this.title.hashCode() * 31)) * 31, 31);
        TextAtom textAtom = this.description;
        int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.agreementText;
        return this.inputVariants.hashCode() + ((hashCode + (textAtom2 != null ? textAtom2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TravelPersonalAccountReplenishmentDTO(title=" + this.title + ", input=" + this.input + ", submitButton=" + this.submitButton + ", description=" + this.description + ", agreementText=" + this.agreementText + ", inputVariants=" + this.inputVariants + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO$InputDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, FormPageDTO.Field.FIELD_TYPE_MASK, "errors", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValue", "getPlaceholder", "getMask", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<String> errors;
        private final String mask;

        @NotNull
        private final String name;
        private final String placeholder;
        private final String value;

        public InputDTO(@NotNull String name, String str, String str2, String str3, @NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.name = name;
            this.value = str;
            this.placeholder = str2;
            this.mask = str3;
            this.errors = errors;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.name;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.value;
            }
            if ((i11 & 4) != 0) {
                str3 = inputDTO.placeholder;
            }
            if ((i11 & 8) != 0) {
                str4 = inputDTO.mask;
            }
            if ((i11 & 16) != 0) {
                list = inputDTO.errors;
            }
            List list2 = list;
            String str5 = str3;
            return inputDTO.copy(str, str2, str5, str4, list2);
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

        /* renamed from: component3, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMask() {
            return this.mask;
        }

        @NotNull
        public final List<String> component5() {
            return this.errors;
        }

        @NotNull
        public final InputDTO copy(@NotNull String name, String value, String placeholder, String mask, @NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(errors, "errors");
            return new InputDTO(name, value, placeholder, mask, errors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.mask, inputDTO.mask) && Intrinsics.d(this.errors, inputDTO.errors);
        }

        @NotNull
        public final List<String> getErrors() {
            return this.errors;
        }

        public final String getMask() {
            return this.mask;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.value;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placeholder;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mask;
            return this.errors.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.value;
            String str3 = this.placeholder;
            String str4 = this.mask;
            List<String> list = this.errors;
            StringBuilder d11 = C3660k.d("InputDTO(name=", str, ", value=", str2, ", placeholder=");
            a.h(d11, str3, ", mask=", str4, ", errors=");
            return C2618u.h(d11, list, ")");
        }

        public InputDTO(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? K.f71697a : list);
        }
    }

    public TravelPersonalAccountReplenishmentDTO(TextAtom textAtom, InputDTO inputDTO, ButtonV3Atom.LargeButton largeButton, TextAtom textAtom2, TextAtom textAtom3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, inputDTO, largeButton, textAtom2, textAtom3, (i11 & 32) != 0 ? K.f71697a : list);
    }
}
