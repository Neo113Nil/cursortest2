package ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule;

import B0.C2454a;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Ns.b;
import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO;", "", "", "backgroundColor", "", "paddingLeft", "paddingRight", "", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO$StepVO;", "steps", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "I", "getPaddingLeft", "getPaddingRight", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "StepVO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StepListWithScaleMoleculeVO {
    private final String backgroundColor;
    private final int paddingLeft;
    private final int paddingRight;

    @NotNull
    private final List<StepVO> steps;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO$StepVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "marginBottom", "", "hornColor", "circleColor", "tailColor", "", "hasHorn", "hasTail", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getMarginBottom", "Ljava/lang/String;", "getHornColor", "getCircleColor", "getTailColor", "Z", "getHasHorn", "()Z", "getHasTail", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StepVO {

        @NotNull
        private final String circleColor;

        @NotNull
        private final TextDTO description;
        private final boolean hasHorn;
        private final boolean hasTail;

        @NotNull
        private final String hornColor;
        private final int id;
        private final int marginBottom;

        @NotNull
        private final String tailColor;

        @NotNull
        private final TextDTO title;

        public StepVO(int i11, @NotNull TextDTO title, @NotNull TextDTO description, int i12, @NotNull String hornColor, @NotNull String circleColor, @NotNull String tailColor, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(hornColor, "hornColor");
            Intrinsics.checkNotNullParameter(circleColor, "circleColor");
            Intrinsics.checkNotNullParameter(tailColor, "tailColor");
            this.id = i11;
            this.title = title;
            this.description = description;
            this.marginBottom = i12;
            this.hornColor = hornColor;
            this.circleColor = circleColor;
            this.tailColor = tailColor;
            this.hasHorn = z11;
            this.hasTail = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepVO)) {
                return false;
            }
            StepVO stepVO = (StepVO) other;
            return this.id == stepVO.id && Intrinsics.d(this.title, stepVO.title) && Intrinsics.d(this.description, stepVO.description) && this.marginBottom == stepVO.marginBottom && Intrinsics.d(this.hornColor, stepVO.hornColor) && Intrinsics.d(this.circleColor, stepVO.circleColor) && Intrinsics.d(this.tailColor, stepVO.tailColor) && this.hasHorn == stepVO.hasHorn && this.hasTail == stepVO.hasTail;
        }

        @NotNull
        public final String getCircleColor() {
            return this.circleColor;
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        public final boolean getHasHorn() {
            return this.hasHorn;
        }

        public final boolean getHasTail() {
            return this.hasTail;
        }

        @NotNull
        public final String getHornColor() {
            return this.hornColor;
        }

        public final int getId() {
            return this.id;
        }

        public final int getMarginBottom() {
            return this.marginBottom;
        }

        @NotNull
        public final String getTailColor() {
            return this.tailColor;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasTail) + C3532b.a(g.a(g.a(g.a(C2454a.a(this.marginBottom, b.a(this.description, b.a(this.title, Integer.hashCode(this.id) * 31, 31), 31), 31), 31, this.hornColor), 31, this.circleColor), 31, this.tailColor), 31, this.hasHorn);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.description;
            int i12 = this.marginBottom;
            String str = this.hornColor;
            String str2 = this.circleColor;
            String str3 = this.tailColor;
            boolean z11 = this.hasHorn;
            boolean z12 = this.hasTail;
            StringBuilder b11 = C4055a.b(textDTO, "StepVO(id=", ", title=", ", description=", i11);
            b11.append(textDTO2);
            b11.append(", marginBottom=");
            b11.append(i12);
            b11.append(", hornColor=");
            a.h(b11, str, ", circleColor=", str2, ", tailColor=");
            C2880a.c(str3, ", hasHorn=", ", hasTail=", b11, z11);
            return Pk0.a.a(")", b11, z12);
        }
    }

    public StepListWithScaleMoleculeVO(String str, int i11, int i12, @NotNull List<StepVO> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.backgroundColor = str;
        this.paddingLeft = i11;
        this.paddingRight = i12;
        this.steps = steps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepListWithScaleMoleculeVO)) {
            return false;
        }
        StepListWithScaleMoleculeVO stepListWithScaleMoleculeVO = (StepListWithScaleMoleculeVO) other;
        return Intrinsics.d(this.backgroundColor, stepListWithScaleMoleculeVO.backgroundColor) && this.paddingLeft == stepListWithScaleMoleculeVO.paddingLeft && this.paddingRight == stepListWithScaleMoleculeVO.paddingRight && Intrinsics.d(this.steps, stepListWithScaleMoleculeVO.steps);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    @NotNull
    public final List<StepVO> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        return this.steps.hashCode() + C2454a.a(this.paddingRight, C2454a.a(this.paddingLeft, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        int i11 = this.paddingLeft;
        int i12 = this.paddingRight;
        List<StepVO> list = this.steps;
        StringBuilder c11 = C3660k.c(i11, "StepListWithScaleMoleculeVO(backgroundColor=", str, ", paddingLeft=", ", paddingRight=");
        c11.append(i12);
        c11.append(", steps=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }
}
