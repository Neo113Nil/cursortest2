package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data;

import B90.C2618u;
import N3.C3660k;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u000201BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J]\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO;", "", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "receiveEmailToggle", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "emailTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "emailInput", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Input;", "submitEmailButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "addEmailInputButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "emails", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Email;", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/util/List;)V", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getReceiveEmailToggle", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "getEmailTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getEmailInput", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Input;", "getSubmitEmailButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAddEmailInputButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getEmails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Input", "Email", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TravelDocumentsToEmailDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.SmallBorderlessButton addEmailInputButton;

    @NotNull
    private final DisclaimerAtom annotation;
    private final Input emailInput;
    private final TextAtom emailTitle;

    @NotNull
    private final List<Email> emails;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle receiveEmailToggle;
    private final ButtonV3Atom.LargeButton submitEmailButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Email;", "", Scopes.EMAIL, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "removeEmailButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getEmail", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRemoveEmailButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Email {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable | TextAtom.$stable;

        @NotNull
        private final TextAtom email;

        @NotNull
        private final ButtonV3Atom.SmallIconButton removeEmailButton;

        public Email(@NotNull TextAtom email, @NotNull ButtonV3Atom.SmallIconButton removeEmailButton) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(removeEmailButton, "removeEmailButton");
            this.email = email;
            this.removeEmailButton = removeEmailButton;
        }

        public static /* synthetic */ Email copy$default(Email email, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = email.email;
            }
            if ((i11 & 2) != 0) {
                smallIconButton = email.removeEmailButton;
            }
            return email.copy(textAtom, smallIconButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getEmail() {
            return this.email;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getRemoveEmailButton() {
            return this.removeEmailButton;
        }

        @NotNull
        public final Email copy(@NotNull TextAtom email, @NotNull ButtonV3Atom.SmallIconButton removeEmailButton) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(removeEmailButton, "removeEmailButton");
            return new Email(email, removeEmailButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.d(this.email, email.email) && Intrinsics.d(this.removeEmailButton, email.removeEmailButton);
        }

        @NotNull
        public final TextAtom getEmail() {
            return this.email;
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getRemoveEmailButton() {
            return this.removeEmailButton;
        }

        public int hashCode() {
            return this.removeEmailButton.hashCode() + (this.email.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Email(email=" + this.email + ", removeEmailButton=" + this.removeEmailButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", HammersV3BodyDTO.PLACEHOLDER, "errors", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getValue", "()Ljava/lang/String;", "getPlaceholder", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 8;
        private final List<String> errors;
        private final String placeholder;
        private final String value;

        public Input(String str, String str2, List<String> list) {
            this.value = str;
            this.placeholder = str2;
            this.errors = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Input copy$default(Input input, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.value;
            }
            if ((i11 & 2) != 0) {
                str2 = input.placeholder;
            }
            if ((i11 & 4) != 0) {
                list = input.errors;
            }
            return input.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final List<String> component3() {
            return this.errors;
        }

        @NotNull
        public final Input copy(String value, String placeholder, List<String> errors) {
            return new Input(value, placeholder, errors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.value, input.value) && Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.errors, input.errors);
        }

        public final List<String> getErrors() {
            return this.errors;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeholder;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.errors;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.placeholder;
            return C2618u.h(C3660k.d("Input(value=", str, ", placeholder=", str2, ", errors="), this.errors, ")");
        }
    }

    public TravelDocumentsToEmailDTO(@NotNull DisclaimerAtom annotation, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle receiveEmailToggle, TextAtom textAtom, Input input, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, @NotNull List<Email> emails) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(receiveEmailToggle, "receiveEmailToggle");
        Intrinsics.checkNotNullParameter(emails, "emails");
        this.annotation = annotation;
        this.receiveEmailToggle = receiveEmailToggle;
        this.emailTitle = textAtom;
        this.emailInput = input;
        this.submitEmailButton = largeButton;
        this.addEmailInputButton = smallBorderlessButton;
        this.emails = emails;
    }

    public static /* synthetic */ TravelDocumentsToEmailDTO copy$default(TravelDocumentsToEmailDTO travelDocumentsToEmailDTO, DisclaimerAtom disclaimerAtom, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, TextAtom textAtom, Input input, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerAtom = travelDocumentsToEmailDTO.annotation;
        }
        if ((i11 & 2) != 0) {
            cellWithSubtitleToggle = travelDocumentsToEmailDTO.receiveEmailToggle;
        }
        if ((i11 & 4) != 0) {
            textAtom = travelDocumentsToEmailDTO.emailTitle;
        }
        if ((i11 & 8) != 0) {
            input = travelDocumentsToEmailDTO.emailInput;
        }
        if ((i11 & 16) != 0) {
            largeButton = travelDocumentsToEmailDTO.submitEmailButton;
        }
        if ((i11 & 32) != 0) {
            smallBorderlessButton = travelDocumentsToEmailDTO.addEmailInputButton;
        }
        if ((i11 & 64) != 0) {
            list = travelDocumentsToEmailDTO.emails;
        }
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
        List list2 = list;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        TextAtom textAtom2 = textAtom;
        return travelDocumentsToEmailDTO.copy(disclaimerAtom, cellWithSubtitleToggle, textAtom2, input, largeButton2, smallBorderlessButton2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getReceiveEmailToggle() {
        return this.receiveEmailToggle;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getEmailTitle() {
        return this.emailTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Input getEmailInput() {
        return this.emailInput;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getSubmitEmailButton() {
        return this.submitEmailButton;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getAddEmailInputButton() {
        return this.addEmailInputButton;
    }

    @NotNull
    public final List<Email> component7() {
        return this.emails;
    }

    @NotNull
    public final TravelDocumentsToEmailDTO copy(@NotNull DisclaimerAtom annotation, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle receiveEmailToggle, TextAtom emailTitle, Input emailInput, ButtonV3Atom.LargeButton submitEmailButton, ButtonV3Atom.SmallBorderlessButton addEmailInputButton, @NotNull List<Email> emails) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(receiveEmailToggle, "receiveEmailToggle");
        Intrinsics.checkNotNullParameter(emails, "emails");
        return new TravelDocumentsToEmailDTO(annotation, receiveEmailToggle, emailTitle, emailInput, submitEmailButton, addEmailInputButton, emails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelDocumentsToEmailDTO)) {
            return false;
        }
        TravelDocumentsToEmailDTO travelDocumentsToEmailDTO = (TravelDocumentsToEmailDTO) other;
        return Intrinsics.d(this.annotation, travelDocumentsToEmailDTO.annotation) && Intrinsics.d(this.receiveEmailToggle, travelDocumentsToEmailDTO.receiveEmailToggle) && Intrinsics.d(this.emailTitle, travelDocumentsToEmailDTO.emailTitle) && Intrinsics.d(this.emailInput, travelDocumentsToEmailDTO.emailInput) && Intrinsics.d(this.submitEmailButton, travelDocumentsToEmailDTO.submitEmailButton) && Intrinsics.d(this.addEmailInputButton, travelDocumentsToEmailDTO.addEmailInputButton) && Intrinsics.d(this.emails, travelDocumentsToEmailDTO.emails);
    }

    public final ButtonV3Atom.SmallBorderlessButton getAddEmailInputButton() {
        return this.addEmailInputButton;
    }

    @NotNull
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final Input getEmailInput() {
        return this.emailInput;
    }

    public final TextAtom getEmailTitle() {
        return this.emailTitle;
    }

    @NotNull
    public final List<Email> getEmails() {
        return this.emails;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getReceiveEmailToggle() {
        return this.receiveEmailToggle;
    }

    public final ButtonV3Atom.LargeButton getSubmitEmailButton() {
        return this.submitEmailButton;
    }

    public int hashCode() {
        int hashCode = (this.receiveEmailToggle.hashCode() + (this.annotation.hashCode() * 31)) * 31;
        TextAtom textAtom = this.emailTitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Input input = this.emailInput;
        int hashCode3 = (hashCode2 + (input == null ? 0 : input.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.submitEmailButton;
        int hashCode4 = (hashCode3 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.addEmailInputButton;
        return this.emails.hashCode() + ((hashCode4 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        DisclaimerAtom disclaimerAtom = this.annotation;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = this.receiveEmailToggle;
        TextAtom textAtom = this.emailTitle;
        Input input = this.emailInput;
        ButtonV3Atom.LargeButton largeButton = this.submitEmailButton;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.addEmailInputButton;
        List<Email> list = this.emails;
        StringBuilder sb2 = new StringBuilder("TravelDocumentsToEmailDTO(annotation=");
        sb2.append(disclaimerAtom);
        sb2.append(", receiveEmailToggle=");
        sb2.append(cellWithSubtitleToggle);
        sb2.append(", emailTitle=");
        sb2.append(textAtom);
        sb2.append(", emailInput=");
        sb2.append(input);
        sb2.append(", submitEmailButton=");
        sb2.append(largeButton);
        sb2.append(", addEmailInputButton=");
        sb2.append(smallBorderlessButton);
        sb2.append(", emails=");
        return C2618u.h(sb2, list, ")");
    }

    public TravelDocumentsToEmailDTO(DisclaimerAtom disclaimerAtom, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, TextAtom textAtom, Input input, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(disclaimerAtom, cellWithSubtitleToggle, textAtom, input, largeButton, smallBorderlessButton, (i11 & 64) != 0 ? K.f71697a : list);
    }
}
