package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import c8.C5766e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b \b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001?Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0096\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b3\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b4\u0010)R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b>\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "inputKey", "validateOnlyKey", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "input", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "submitButton", "description", "agreementText", "", "areInputVariantsVisible", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "inputVariants", "", "previousSelectedTagPosition", "selectedTagPosition", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getInputKey", "getValidateOnlyKey", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "getInput", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDescription", "getAgreementText", "Z", "getAreInputVariantsVisible", "()Z", "Ljava/util/List;", "getInputVariants", "()Ljava/util/List;", "Ljava/lang/Integer;", "getPreviousSelectedTagPosition", "()Ljava/lang/Integer;", "getSelectedTagPosition", "InputVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelPersonalAccountReplenishmentVO implements c {
    private final TextAtom agreementText;
    private final boolean areInputVariantsVisible;
    private final TextAtom description;
    private final long id;

    @NotNull
    private final InputVO input;

    @NotNull
    private final String inputKey;

    @NotNull
    private final List<TagV3Atom.TagAtom> inputVariants;
    private final Integer previousSelectedTagPosition;
    private final Integer selectedTagPosition;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final String validateOnlyKey;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJZ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "", "areErrorsVisible", "errors", "", "digitsLimit", "charsLimit", "cursorPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getPlaceholder", "Z", "getAreErrorsVisible", "()Z", "getErrors", "Ljava/lang/Integer;", "getDigitsLimit", "()Ljava/lang/Integer;", "getCharsLimit", "I", "getCursorPosition", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputVO {
        private final boolean areErrorsVisible;
        private final Integer charsLimit;
        private final int cursorPosition;
        private final Integer digitsLimit;

        @NotNull
        private final String errors;

        @NotNull
        private final String placeholder;

        @NotNull
        private final String value;

        public InputVO(@NotNull String value, @NotNull String placeholder, boolean z11, @NotNull String errors, Integer num, Integer num2, int i11) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.value = value;
            this.placeholder = placeholder;
            this.areErrorsVisible = z11;
            this.errors = errors;
            this.digitsLimit = num;
            this.charsLimit = num2;
            this.cursorPosition = i11;
        }

        public static /* synthetic */ InputVO copy$default(InputVO inputVO, String str, String str2, boolean z11, String str3, Integer num, Integer num2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inputVO.value;
            }
            if ((i12 & 2) != 0) {
                str2 = inputVO.placeholder;
            }
            if ((i12 & 4) != 0) {
                z11 = inputVO.areErrorsVisible;
            }
            if ((i12 & 8) != 0) {
                str3 = inputVO.errors;
            }
            if ((i12 & 16) != 0) {
                num = inputVO.digitsLimit;
            }
            if ((i12 & 32) != 0) {
                num2 = inputVO.charsLimit;
            }
            if ((i12 & 64) != 0) {
                i11 = inputVO.cursorPosition;
            }
            Integer num3 = num2;
            int i13 = i11;
            Integer num4 = num;
            boolean z12 = z11;
            return inputVO.copy(str, str2, z12, str3, num4, num3, i13);
        }

        @NotNull
        public final InputVO copy(@NotNull String value, @NotNull String placeholder, boolean areErrorsVisible, @NotNull String errors, Integer digitsLimit, Integer charsLimit, int cursorPosition) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errors, "errors");
            return new InputVO(value, placeholder, areErrorsVisible, errors, digitsLimit, charsLimit, cursorPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputVO)) {
                return false;
            }
            InputVO inputVO = (InputVO) other;
            return Intrinsics.d(this.value, inputVO.value) && Intrinsics.d(this.placeholder, inputVO.placeholder) && this.areErrorsVisible == inputVO.areErrorsVisible && Intrinsics.d(this.errors, inputVO.errors) && Intrinsics.d(this.digitsLimit, inputVO.digitsLimit) && Intrinsics.d(this.charsLimit, inputVO.charsLimit) && this.cursorPosition == inputVO.cursorPosition;
        }

        public final boolean getAreErrorsVisible() {
            return this.areErrorsVisible;
        }

        public final int getCursorPosition() {
            return this.cursorPosition;
        }

        public final Integer getDigitsLimit() {
            return this.digitsLimit;
        }

        @NotNull
        public final String getErrors() {
            return this.errors;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = g.a(C3532b.a(g.a(this.value.hashCode() * 31, 31, this.placeholder), 31, this.areErrorsVisible), 31, this.errors);
            Integer num = this.digitsLimit;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.charsLimit;
            return Integer.hashCode(this.cursorPosition) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.placeholder;
            boolean z11 = this.areErrorsVisible;
            String str3 = this.errors;
            Integer num = this.digitsLimit;
            Integer num2 = this.charsLimit;
            int i11 = this.cursorPosition;
            StringBuilder d11 = C3660k.d("InputVO(value=", str, ", placeholder=", str2, ", areErrorsVisible=");
            C5766e.a(", errors=", str3, ", digitsLimit=", d11, z11);
            Ef0.c.e(d11, num, ", charsLimit=", num2, ", cursorPosition=");
            return b.e(i11, ")", d11);
        }
    }

    public TravelPersonalAccountReplenishmentVO(long j11, @NotNull TextAtom title, @NotNull String inputKey, @NotNull String validateOnlyKey, @NotNull InputVO input, @NotNull ButtonV3Atom.LargeButton submitButton, TextAtom textAtom, TextAtom textAtom2, boolean z11, @NotNull List<TagV3Atom.TagAtom> inputVariants, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputKey, "inputKey");
        Intrinsics.checkNotNullParameter(validateOnlyKey, "validateOnlyKey");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(inputVariants, "inputVariants");
        this.id = j11;
        this.title = title;
        this.inputKey = inputKey;
        this.validateOnlyKey = validateOnlyKey;
        this.input = input;
        this.submitButton = submitButton;
        this.description = textAtom;
        this.agreementText = textAtom2;
        this.areInputVariantsVisible = z11;
        this.inputVariants = inputVariants;
        this.previousSelectedTagPosition = num;
        this.selectedTagPosition = num2;
    }

    @NotNull
    public final TravelPersonalAccountReplenishmentVO copy(long id2, @NotNull TextAtom title, @NotNull String inputKey, @NotNull String validateOnlyKey, @NotNull InputVO input, @NotNull ButtonV3Atom.LargeButton submitButton, TextAtom description, TextAtom agreementText, boolean areInputVariantsVisible, @NotNull List<TagV3Atom.TagAtom> inputVariants, Integer previousSelectedTagPosition, Integer selectedTagPosition) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputKey, "inputKey");
        Intrinsics.checkNotNullParameter(validateOnlyKey, "validateOnlyKey");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(inputVariants, "inputVariants");
        return new TravelPersonalAccountReplenishmentVO(id2, title, inputKey, validateOnlyKey, input, submitButton, description, agreementText, areInputVariantsVisible, inputVariants, previousSelectedTagPosition, selectedTagPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPersonalAccountReplenishmentVO)) {
            return false;
        }
        TravelPersonalAccountReplenishmentVO travelPersonalAccountReplenishmentVO = (TravelPersonalAccountReplenishmentVO) other;
        return this.id == travelPersonalAccountReplenishmentVO.id && Intrinsics.d(this.title, travelPersonalAccountReplenishmentVO.title) && Intrinsics.d(this.inputKey, travelPersonalAccountReplenishmentVO.inputKey) && Intrinsics.d(this.validateOnlyKey, travelPersonalAccountReplenishmentVO.validateOnlyKey) && Intrinsics.d(this.input, travelPersonalAccountReplenishmentVO.input) && Intrinsics.d(this.submitButton, travelPersonalAccountReplenishmentVO.submitButton) && Intrinsics.d(this.description, travelPersonalAccountReplenishmentVO.description) && Intrinsics.d(this.agreementText, travelPersonalAccountReplenishmentVO.agreementText) && this.areInputVariantsVisible == travelPersonalAccountReplenishmentVO.areInputVariantsVisible && Intrinsics.d(this.inputVariants, travelPersonalAccountReplenishmentVO.inputVariants) && Intrinsics.d(this.previousSelectedTagPosition, travelPersonalAccountReplenishmentVO.previousSelectedTagPosition) && Intrinsics.d(this.selectedTagPosition, travelPersonalAccountReplenishmentVO.selectedTagPosition);
    }

    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    public final boolean getAreInputVariantsVisible() {
        return this.areInputVariantsVisible;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InputVO getInput() {
        return this.input;
    }

    @NotNull
    public final String getInputKey() {
        return this.inputKey;
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> getInputVariants() {
        return this.inputVariants;
    }

    public final Integer getPreviousSelectedTagPosition() {
        return this.previousSelectedTagPosition;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSelectedTagPosition() {
        return this.selectedTagPosition;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final String getValidateOnlyKey() {
        return this.validateOnlyKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Tl.b.a(this.submitButton, (this.input.hashCode() + g.a(g.a(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.inputKey), 31, this.validateOnlyKey)) * 31, 31);
        TextAtom textAtom = this.description;
        int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.agreementText;
        int b11 = g.b(C3532b.a((hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31, 31, this.areInputVariantsVisible), 31, this.inputVariants);
        Integer num = this.previousSelectedTagPosition;
        int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedTagPosition;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        String str = this.inputKey;
        String str2 = this.validateOnlyKey;
        InputVO inputVO = this.input;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        TextAtom textAtom2 = this.description;
        TextAtom textAtom3 = this.agreementText;
        boolean z11 = this.areInputVariantsVisible;
        List<TagV3Atom.TagAtom> list = this.inputVariants;
        Integer num = this.previousSelectedTagPosition;
        Integer num2 = this.selectedTagPosition;
        StringBuilder c11 = C2639a.c("TravelPersonalAccountReplenishmentVO(id=", j11, ", title=", textAtom);
        a.h(c11, ", inputKey=", str, ", validateOnlyKey=", str2);
        c11.append(", input=");
        c11.append(inputVO);
        c11.append(", submitButton=");
        c11.append(largeButton);
        C2639a.e(", description=", ", agreementText=", c11, textAtom2, textAtom3);
        c11.append(", areInputVariantsVisible=");
        c11.append(z11);
        c11.append(", inputVariants=");
        c11.append(list);
        c11.append(", previousSelectedTagPosition=");
        c11.append(num);
        c11.append(", selectedTagPosition=");
        c11.append(num2);
        c11.append(")");
        return c11.toString();
    }
}
