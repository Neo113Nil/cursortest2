package ru.ozon.app.android.travel.feature.avia.widgets.stepper.presentation;

import B0.C2454a;
import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/stepper/presentation/StepperVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "", "stepColors", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "stepWidth", "", "hideStepper", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getStepColors", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getStepWidth", "Z", "getHideStepper", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StepperVO implements c {
    private final boolean hideStepper;
    private final long id;

    @NotNull
    private final List<Integer> stepColors;
    private final int stepWidth;
    private final TextDTO title;

    public StepperVO(long j11, @NotNull List<Integer> stepColors, TextDTO textDTO, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(stepColors, "stepColors");
        this.id = j11;
        this.stepColors = stepColors;
        this.title = textDTO;
        this.stepWidth = i11;
        this.hideStepper = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepperVO)) {
            return false;
        }
        StepperVO stepperVO = (StepperVO) other;
        return this.id == stepperVO.id && Intrinsics.d(this.stepColors, stepperVO.stepColors) && Intrinsics.d(this.title, stepperVO.title) && this.stepWidth == stepperVO.stepWidth && this.hideStepper == stepperVO.hideStepper;
    }

    public final boolean getHideStepper() {
        return this.hideStepper;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<Integer> getStepColors() {
        return this.stepColors;
    }

    public final int getStepWidth() {
        return this.stepWidth;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.stepColors);
        TextDTO textDTO = this.title;
        return Boolean.hashCode(this.hideStepper) + C2454a.a(this.stepWidth, (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Integer> list = this.stepColors;
        TextDTO textDTO = this.title;
        int i11 = this.stepWidth;
        boolean z11 = this.hideStepper;
        StringBuilder b11 = b.b(j11, "StepperVO(id=", ", stepColors=", list);
        b11.append(", title=");
        b11.append(textDTO);
        b11.append(", stepWidth=");
        b11.append(i11);
        return Bi.b.f(b11, ", hideStepper=", z11, ")");
    }
}
