package ru.ozon.app.android.returns.creation.widgets.modal.presentation.decorator;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0012\u001a\u00020\u000f*\u00020\u0007H\u0002J\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/presentation/decorator/ReturnCreationModalAtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "<init>", "()V", "lastData", "Lru/ozon/uni/atoms/data/AtomDTO;", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "position", "", "last", "", "setTextMargins", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "setAnnotationMargins", "setButtonMargins", "setCellMargins", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationModalAtomDecorator implements VerticalAtomsDecorator {
    private AtomDTO lastData;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int TEXT_BOTTOM_OFFSET = ResourceExtKt.toPx(8);
    private static final int DISCLAIMER_OFFSET = ResourceExtKt.toPx(8);
    private static final int CELL_VERTICAL_OFFSET = ResourceExtKt.toPx(8);
    private static final int BUTTONS_OFFSET = ResourceExtKt.toPx(8);
    private static final int BUTTONS_VERTICAL_OFFSET = ResourceExtKt.toPx(16);
    private static final int HORIZONTAL_MARGIN = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/presentation/decorator/ReturnCreationModalAtomDecorator$Companion;", "", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void setAnnotationMargins(LinearLayout.LayoutParams layoutParams) {
        int i11 = DISCLAIMER_OFFSET;
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i11;
        int i12 = HORIZONTAL_MARGIN;
        layoutParams.setMarginStart(i12);
        layoutParams.setMarginEnd(i12);
    }

    private final void setButtonMargins(LinearLayout.LayoutParams layoutParams, boolean z11) {
        layoutParams.topMargin = this.lastData instanceof ButtonV3DTO ? 0 : BUTTONS_VERTICAL_OFFSET;
        layoutParams.bottomMargin = z11 ? BUTTONS_VERTICAL_OFFSET : BUTTONS_OFFSET;
        int i11 = HORIZONTAL_MARGIN;
        layoutParams.setMarginStart(i11);
        layoutParams.setMarginEnd(i11);
    }

    private final void setCellMargins(LinearLayout.LayoutParams layoutParams) {
        layoutParams.topMargin = this.lastData instanceof CellDTO ? CELL_VERTICAL_OFFSET : 0;
    }

    private final void setTextMargins(LinearLayout.LayoutParams layoutParams, TextDTO textDTO) {
        textDTO.setTagSupported(true);
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = TEXT_BOTTOM_OFFSET;
        int i11 = HORIZONTAL_MARGIN;
        layoutParams.setMarginStart(i11);
        layoutParams.setMarginEnd(i11);
    }

    @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
    public void decorate(@NotNull Canvas canvas, @NotNull Rect rect, int i11, boolean z11) {
        VerticalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
    }

    @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof TextDTO) {
            setTextMargins(lp, (TextDTO) data);
        } else if (data instanceof DisclaimerAtom) {
            setAnnotationMargins(lp);
        } else if (data instanceof ButtonV3DTO) {
            setButtonMargins(lp, last);
        } else if (data instanceof CellDTO) {
            setCellMargins(lp);
        }
        this.lastData = data;
        return lp;
    }
}
