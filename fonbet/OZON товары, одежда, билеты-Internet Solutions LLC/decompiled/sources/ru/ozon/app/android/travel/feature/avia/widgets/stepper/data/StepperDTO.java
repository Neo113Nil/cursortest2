package ru.ozon.app.android.travel.feature.avia.widgets.stepper.data;

import Pk0.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/stepper/data/StepperDTO;", "", "backgroundColors", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "hideStepper", "", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getBackgroundColors", "()Ljava/util/List;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHideStepper", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StepperDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<String> backgroundColors;
    private final boolean hideStepper;
    private final TextDTO title;

    public StepperDTO(@NotNull List<String> backgroundColors, TextDTO textDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        this.backgroundColors = backgroundColors;
        this.title = textDTO;
        this.hideStepper = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StepperDTO copy$default(StepperDTO stepperDTO, List list, TextDTO textDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = stepperDTO.backgroundColors;
        }
        if ((i11 & 2) != 0) {
            textDTO = stepperDTO.title;
        }
        if ((i11 & 4) != 0) {
            z11 = stepperDTO.hideStepper;
        }
        return stepperDTO.copy(list, textDTO, z11);
    }

    @NotNull
    public final List<String> component1() {
        return this.backgroundColors;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHideStepper() {
        return this.hideStepper;
    }

    @NotNull
    public final StepperDTO copy(@NotNull List<String> backgroundColors, TextDTO title, boolean hideStepper) {
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        return new StepperDTO(backgroundColors, title, hideStepper);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepperDTO)) {
            return false;
        }
        StepperDTO stepperDTO = (StepperDTO) other;
        return Intrinsics.d(this.backgroundColors, stepperDTO.backgroundColors) && Intrinsics.d(this.title, stepperDTO.title) && this.hideStepper == stepperDTO.hideStepper;
    }

    @NotNull
    public final List<String> getBackgroundColors() {
        return this.backgroundColors;
    }

    public final boolean getHideStepper() {
        return this.hideStepper;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.backgroundColors.hashCode() * 31;
        TextDTO textDTO = this.title;
        return Boolean.hashCode(this.hideStepper) + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        List<String> list = this.backgroundColors;
        TextDTO textDTO = this.title;
        boolean z11 = this.hideStepper;
        StringBuilder sb2 = new StringBuilder("StepperDTO(backgroundColors=");
        sb2.append(list);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", hideStepper=");
        return a.a(")", sb2, z11);
    }

    public /* synthetic */ StepperDTO(List list, TextDTO textDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, textDTO, (i11 & 4) != 0 ? false : z11);
    }
}
