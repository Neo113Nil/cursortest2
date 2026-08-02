package ru.ozon.app.android.travel.molecules.dto.stepListWithScaleMolecule;

import B0.C2454a;
import C.o0;
import G.g;
import N3.C3660k;
import Ns.b;
import Pk0.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO;", "", "backgroundColor", "", "paddingLeft", "", "paddingRight", "steps", "", "Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO$StepDTO;", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "getBackgroundColor", "()Ljava/lang/String;", "getPaddingLeft", "()I", "getPaddingRight", "getSteps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "StepDTO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StepListWithScaleMoleculeDTO {
    private final String backgroundColor;
    private final int paddingLeft;
    private final int paddingRight;

    @NotNull
    private final List<StepDTO> steps;

    public StepListWithScaleMoleculeDTO(String str, int i11, int i12, @NotNull List<StepDTO> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.backgroundColor = str;
        this.paddingLeft = i11;
        this.paddingRight = i12;
        this.steps = steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StepListWithScaleMoleculeDTO copy$default(StepListWithScaleMoleculeDTO stepListWithScaleMoleculeDTO, String str, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stepListWithScaleMoleculeDTO.backgroundColor;
        }
        if ((i13 & 2) != 0) {
            i11 = stepListWithScaleMoleculeDTO.paddingLeft;
        }
        if ((i13 & 4) != 0) {
            i12 = stepListWithScaleMoleculeDTO.paddingRight;
        }
        if ((i13 & 8) != 0) {
            list = stepListWithScaleMoleculeDTO.steps;
        }
        return stepListWithScaleMoleculeDTO.copy(str, i11, i12, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPaddingRight() {
        return this.paddingRight;
    }

    @NotNull
    public final List<StepDTO> component4() {
        return this.steps;
    }

    @NotNull
    public final StepListWithScaleMoleculeDTO copy(String backgroundColor, int paddingLeft, int paddingRight, @NotNull List<StepDTO> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new StepListWithScaleMoleculeDTO(backgroundColor, paddingLeft, paddingRight, steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepListWithScaleMoleculeDTO)) {
            return false;
        }
        StepListWithScaleMoleculeDTO stepListWithScaleMoleculeDTO = (StepListWithScaleMoleculeDTO) other;
        return Intrinsics.d(this.backgroundColor, stepListWithScaleMoleculeDTO.backgroundColor) && this.paddingLeft == stepListWithScaleMoleculeDTO.paddingLeft && this.paddingRight == stepListWithScaleMoleculeDTO.paddingRight && Intrinsics.d(this.steps, stepListWithScaleMoleculeDTO.steps);
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
    public final List<StepDTO> getSteps() {
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
        List<StepDTO> list = this.steps;
        StringBuilder c11 = C3660k.c(i11, "StepListWithScaleMoleculeDTO(backgroundColor=", str, ", paddingLeft=", ", paddingRight=");
        c11.append(i12);
        c11.append(", steps=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO$StepDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "marginBottom", "", "indicatorColor", "", "scaleColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILjava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getMarginBottom", "()I", "getIndicatorColor", "()Ljava/lang/String;", "getScaleColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StepDTO {

        @NotNull
        private final TextDTO description;

        @NotNull
        private final String indicatorColor;
        private final int marginBottom;

        @NotNull
        private final String scaleColor;

        @NotNull
        private final TextDTO title;

        public StepDTO(@NotNull TextDTO title, @NotNull TextDTO description, int i11, @NotNull String indicatorColor, @NotNull String scaleColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(indicatorColor, "indicatorColor");
            Intrinsics.checkNotNullParameter(scaleColor, "scaleColor");
            this.title = title;
            this.description = description;
            this.marginBottom = i11;
            this.indicatorColor = indicatorColor;
            this.scaleColor = scaleColor;
        }

        public static /* synthetic */ StepDTO copy$default(StepDTO stepDTO, TextDTO textDTO, TextDTO textDTO2, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textDTO = stepDTO.title;
            }
            if ((i12 & 2) != 0) {
                textDTO2 = stepDTO.description;
            }
            if ((i12 & 4) != 0) {
                i11 = stepDTO.marginBottom;
            }
            if ((i12 & 8) != 0) {
                str = stepDTO.indicatorColor;
            }
            if ((i12 & 16) != 0) {
                str2 = stepDTO.scaleColor;
            }
            String str3 = str2;
            int i13 = i11;
            return stepDTO.copy(textDTO, textDTO2, i13, str, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMarginBottom() {
            return this.marginBottom;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getIndicatorColor() {
            return this.indicatorColor;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getScaleColor() {
            return this.scaleColor;
        }

        @NotNull
        public final StepDTO copy(@NotNull TextDTO title, @NotNull TextDTO description, int marginBottom, @NotNull String indicatorColor, @NotNull String scaleColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(indicatorColor, "indicatorColor");
            Intrinsics.checkNotNullParameter(scaleColor, "scaleColor");
            return new StepDTO(title, description, marginBottom, indicatorColor, scaleColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepDTO)) {
                return false;
            }
            StepDTO stepDTO = (StepDTO) other;
            return Intrinsics.d(this.title, stepDTO.title) && Intrinsics.d(this.description, stepDTO.description) && this.marginBottom == stepDTO.marginBottom && Intrinsics.d(this.indicatorColor, stepDTO.indicatorColor) && Intrinsics.d(this.scaleColor, stepDTO.scaleColor);
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final String getIndicatorColor() {
            return this.indicatorColor;
        }

        public final int getMarginBottom() {
            return this.marginBottom;
        }

        @NotNull
        public final String getScaleColor() {
            return this.scaleColor;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.scaleColor.hashCode() + g.a(C2454a.a(this.marginBottom, b.a(this.description, this.title.hashCode() * 31, 31), 31), 31, this.indicatorColor);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.description;
            int i11 = this.marginBottom;
            String str = this.indicatorColor;
            String str2 = this.scaleColor;
            StringBuilder g10 = D3.g.g("StepDTO(title=", textDTO, ", description=", textDTO2, ", marginBottom=");
            i.c(i11, ", indicatorColor=", str, ", scaleColor=", g10);
            return o0.c(g10, str2, ")");
        }

        public /* synthetic */ StepDTO(TextDTO textDTO, TextDTO textDTO2, int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, (i12 & 4) != 0 ? 0 : i11, str, str2);
        }
    }

    public /* synthetic */ StepListWithScaleMoleculeDTO(String str, int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, list);
    }
}
