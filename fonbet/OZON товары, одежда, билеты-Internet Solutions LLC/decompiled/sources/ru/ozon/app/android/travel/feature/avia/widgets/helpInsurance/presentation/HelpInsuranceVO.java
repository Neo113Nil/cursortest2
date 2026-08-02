package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import De.C2860c;
import G.g;
import HY.a;
import Kk.C3532b;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000512345BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b0\u0010\u001a¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$CaseVO;", "cases", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$TabVO;", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "closeButton", "", "selectedCaseInd", "firstSelectedPosition", "lastSelectedPosition", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;III)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;III)Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getCases", "()Ljava/util/List;", "getTabs", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCloseButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "I", "getSelectedCaseInd", "getFirstSelectedPosition", "getLastSelectedPosition", "CaseVO", "StepVO", "TabVO", "WarningVO", "IconVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HelpInsuranceVO implements c {

    @NotNull
    private final List<CaseVO> cases;

    @NotNull
    private final ButtonV3Atom.LargeButton closeButton;
    private final int firstSelectedPosition;
    private final long id;
    private final int lastSelectedPosition;
    private final int selectedCaseInd;

    @NotNull
    private final List<TabVO> tabs;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$CaseVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$StepVO;", "instructions", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$WarningVO;", "warning", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$WarningVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getInstructions", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$WarningVO;", "getWarning", "()Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$WarningVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CaseVO {

        @NotNull
        private final List<StepVO> instructions;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;
        private final WarningVO warning;

        public CaseVO(@NotNull TextAtom title, TextAtom textAtom, @NotNull List<StepVO> instructions, WarningVO warningVO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            this.title = title;
            this.subtitle = textAtom;
            this.instructions = instructions;
            this.warning = warningVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CaseVO)) {
                return false;
            }
            CaseVO caseVO = (CaseVO) other;
            return Intrinsics.d(this.title, caseVO.title) && Intrinsics.d(this.subtitle, caseVO.subtitle) && Intrinsics.d(this.instructions, caseVO.instructions) && Intrinsics.d(this.warning, caseVO.warning);
        }

        @NotNull
        public final List<StepVO> getInstructions() {
            return this.instructions;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final WarningVO getWarning() {
            return this.warning;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            int b11 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.instructions);
            WarningVO warningVO = this.warning;
            return b11 + (warningVO != null ? warningVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            List<StepVO> list = this.instructions;
            WarningVO warningVO = this.warning;
            StringBuilder a11 = a.a("CaseVO(title=", textAtom, ", subtitle=", textAtom2, ", instructions=");
            a11.append(list);
            a11.append(", warning=");
            a11.append(warningVO);
            a11.append(")");
            return a11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;", "", "", "image", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Ljava/lang/Integer;", "getTintColor", "()Ljava/lang/Integer;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconVO {

        @NotNull
        private final String image;
        private final Integer tintColor;

        public IconVO(@NotNull String image, Integer num) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.tintColor = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconVO)) {
                return false;
            }
            IconVO iconVO = (IconVO) other;
            return Intrinsics.d(this.image, iconVO.image) && Intrinsics.d(this.tintColor, iconVO.tintColor);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Integer getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            Integer num = this.tintColor;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "IconVO(image=" + this.image + ", tintColor=" + this.tintColor + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$StepVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StepVO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom description;
        private final long id;

        @NotNull
        private final TextAtom title;

        public StepVO(long j11, @NotNull TextAtom title, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.id = j11;
            this.title = title;
            this.description = description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepVO)) {
                return false;
            }
            StepVO stepVO = (StepVO) other;
            return this.id == stepVO.id && Intrinsics.d(this.title, stepVO.title) && Intrinsics.d(this.description, stepVO.description);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.description.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.description;
            StringBuilder c11 = C2639a.c("StepVO(id=", j11, ", title=", textAtom);
            c11.append(", description=");
            c11.append(textAtom2);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010!\"\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\f\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$TabVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSelected", "", "iconSelectedTintColor", "", "textSelectedTintColor", "isIconVisible", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;", "tabIcon", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;ZILjava/lang/String;ZLru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;ZILjava/lang/String;ZLru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;)Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$TabVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "setSelected", "(Z)V", "I", "getIconSelectedTintColor", "Ljava/lang/String;", "getTextSelectedTintColor", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;", "getTabIcon", "()Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabVO {
        private final int iconSelectedTintColor;
        private final long id;
        private final boolean isIconVisible;
        private boolean isSelected;
        private final IconVO tabIcon;

        @NotNull
        private final String textSelectedTintColor;

        @NotNull
        private final TextAtom title;

        public TabVO(long j11, @NotNull TextAtom title, boolean z11, int i11, @NotNull String textSelectedTintColor, boolean z12, IconVO iconVO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(textSelectedTintColor, "textSelectedTintColor");
            this.id = j11;
            this.title = title;
            this.isSelected = z11;
            this.iconSelectedTintColor = i11;
            this.textSelectedTintColor = textSelectedTintColor;
            this.isIconVisible = z12;
            this.tabIcon = iconVO;
        }

        public static /* synthetic */ TabVO copy$default(TabVO tabVO, long j11, TextAtom textAtom, boolean z11, int i11, String str, boolean z12, IconVO iconVO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j11 = tabVO.id;
            }
            long j12 = j11;
            if ((i12 & 2) != 0) {
                textAtom = tabVO.title;
            }
            TextAtom textAtom2 = textAtom;
            if ((i12 & 4) != 0) {
                z11 = tabVO.isSelected;
            }
            boolean z13 = z11;
            if ((i12 & 8) != 0) {
                i11 = tabVO.iconSelectedTintColor;
            }
            int i13 = i11;
            if ((i12 & 16) != 0) {
                str = tabVO.textSelectedTintColor;
            }
            return tabVO.copy(j12, textAtom2, z13, i13, str, (i12 & 32) != 0 ? tabVO.isIconVisible : z12, (i12 & 64) != 0 ? tabVO.tabIcon : iconVO);
        }

        @NotNull
        public final TabVO copy(long id2, @NotNull TextAtom title, boolean isSelected, int iconSelectedTintColor, @NotNull String textSelectedTintColor, boolean isIconVisible, IconVO tabIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(textSelectedTintColor, "textSelectedTintColor");
            return new TabVO(id2, title, isSelected, iconSelectedTintColor, textSelectedTintColor, isIconVisible, tabIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabVO)) {
                return false;
            }
            TabVO tabVO = (TabVO) other;
            return this.id == tabVO.id && Intrinsics.d(this.title, tabVO.title) && this.isSelected == tabVO.isSelected && this.iconSelectedTintColor == tabVO.iconSelectedTintColor && Intrinsics.d(this.textSelectedTintColor, tabVO.textSelectedTintColor) && this.isIconVisible == tabVO.isIconVisible && Intrinsics.d(this.tabIcon, tabVO.tabIcon);
        }

        public final int getIconSelectedTintColor() {
            return this.iconSelectedTintColor;
        }

        public final long getId() {
            return this.id;
        }

        public final IconVO getTabIcon() {
            return this.tabIcon;
        }

        @NotNull
        public final String getTextSelectedTintColor() {
            return this.textSelectedTintColor;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(C2454a.a(this.iconSelectedTintColor, C3532b.a(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.isSelected), 31), 31, this.textSelectedTintColor), 31, this.isIconVisible);
            IconVO iconVO = this.tabIcon;
            return a11 + (iconVO == null ? 0 : iconVO.hashCode());
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.title;
            boolean z11 = this.isSelected;
            int i11 = this.iconSelectedTintColor;
            String str = this.textSelectedTintColor;
            boolean z12 = this.isIconVisible;
            IconVO iconVO = this.tabIcon;
            StringBuilder c11 = C2639a.c("TabVO(id=", j11, ", title=", textAtom);
            c11.append(", isSelected=");
            c11.append(z11);
            c11.append(", iconSelectedTintColor=");
            c11.append(i11);
            D40.a.g(", textSelectedTintColor=", str, ", isIconVisible=", c11, z12);
            c11.append(", tabIcon=");
            c11.append(iconVO);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$WarningVO;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;", "getIcon", "()Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$IconVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WarningVO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final IconVO icon;

        @NotNull
        private final TextAtom title;

        public WarningVO(@NotNull IconVO icon, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WarningVO)) {
                return false;
            }
            WarningVO warningVO = (WarningVO) other;
            return Intrinsics.d(this.icon, warningVO.icon) && Intrinsics.d(this.title, warningVO.title);
        }

        @NotNull
        public final IconVO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "WarningVO(icon=" + this.icon + ", title=" + this.title + ")";
        }
    }

    public HelpInsuranceVO(long j11, @NotNull TextAtom title, @NotNull List<CaseVO> cases, @NotNull List<TabVO> tabs, @NotNull ButtonV3Atom.LargeButton closeButton, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cases, "cases");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.id = j11;
        this.title = title;
        this.cases = cases;
        this.tabs = tabs;
        this.closeButton = closeButton;
        this.selectedCaseInd = i11;
        this.firstSelectedPosition = i12;
        this.lastSelectedPosition = i13;
    }

    public static /* synthetic */ HelpInsuranceVO copy$default(HelpInsuranceVO helpInsuranceVO, long j11, TextAtom textAtom, List list, List list2, ButtonV3Atom.LargeButton largeButton, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j11 = helpInsuranceVO.id;
        }
        long j12 = j11;
        if ((i14 & 2) != 0) {
            textAtom = helpInsuranceVO.title;
        }
        TextAtom textAtom2 = textAtom;
        if ((i14 & 4) != 0) {
            list = helpInsuranceVO.cases;
        }
        List list3 = list;
        if ((i14 & 8) != 0) {
            list2 = helpInsuranceVO.tabs;
        }
        return helpInsuranceVO.copy(j12, textAtom2, list3, list2, (i14 & 16) != 0 ? helpInsuranceVO.closeButton : largeButton, (i14 & 32) != 0 ? helpInsuranceVO.selectedCaseInd : i11, (i14 & 64) != 0 ? helpInsuranceVO.firstSelectedPosition : i12, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? helpInsuranceVO.lastSelectedPosition : i13);
    }

    @NotNull
    public final HelpInsuranceVO copy(long id2, @NotNull TextAtom title, @NotNull List<CaseVO> cases, @NotNull List<TabVO> tabs, @NotNull ButtonV3Atom.LargeButton closeButton, int selectedCaseInd, int firstSelectedPosition, int lastSelectedPosition) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cases, "cases");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new HelpInsuranceVO(id2, title, cases, tabs, closeButton, selectedCaseInd, firstSelectedPosition, lastSelectedPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpInsuranceVO)) {
            return false;
        }
        HelpInsuranceVO helpInsuranceVO = (HelpInsuranceVO) other;
        return this.id == helpInsuranceVO.id && Intrinsics.d(this.title, helpInsuranceVO.title) && Intrinsics.d(this.cases, helpInsuranceVO.cases) && Intrinsics.d(this.tabs, helpInsuranceVO.tabs) && Intrinsics.d(this.closeButton, helpInsuranceVO.closeButton) && this.selectedCaseInd == helpInsuranceVO.selectedCaseInd && this.firstSelectedPosition == helpInsuranceVO.firstSelectedPosition && this.lastSelectedPosition == helpInsuranceVO.lastSelectedPosition;
    }

    @NotNull
    public final List<CaseVO> getCases() {
        return this.cases;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getCloseButton() {
        return this.closeButton;
    }

    public final int getFirstSelectedPosition() {
        return this.firstSelectedPosition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLastSelectedPosition() {
        return this.lastSelectedPosition;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedCaseInd() {
        return this.selectedCaseInd;
    }

    @NotNull
    public final List<TabVO> getTabs() {
        return this.tabs;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSelectedPosition) + C2454a.a(this.firstSelectedPosition, C2454a.a(this.selectedCaseInd, b.a(this.closeButton, g.b(g.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.cases), 31, this.tabs), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<CaseVO> list = this.cases;
        List<TabVO> list2 = this.tabs;
        ButtonV3Atom.LargeButton largeButton = this.closeButton;
        int i11 = this.selectedCaseInd;
        int i12 = this.firstSelectedPosition;
        int i13 = this.lastSelectedPosition;
        StringBuilder c11 = C2639a.c("HelpInsuranceVO(id=", j11, ", title=", textAtom);
        C2860c.g(", cases=", ", tabs=", c11, list, list2);
        c11.append(", closeButton=");
        c11.append(largeButton);
        c11.append(", selectedCaseInd=");
        c11.append(i11);
        A0.c(i12, i13, ", firstSelectedPosition=", ", lastSelectedPosition=", c11);
        c11.append(")");
        return c11.toString();
    }
}
