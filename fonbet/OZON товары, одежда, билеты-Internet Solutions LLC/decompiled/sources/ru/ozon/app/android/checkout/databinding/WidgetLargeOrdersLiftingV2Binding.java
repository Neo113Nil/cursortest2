package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetLargeOrdersLiftingV2Binding implements a {

    @NonNull
    public final ButtonV3View largeOrdersLiftingCancelBtn;

    @NonNull
    public final VerticalAtomsLayout largeOrdersLiftingCellsContainer;

    @NonNull
    public final ButtonV3View largeOrdersLiftingConfirmBtn;

    @NonNull
    public final Image largeOrdersLiftingIV;

    @NonNull
    public final TextAtomV2View largeOrdersLiftingSubtitleTAV;

    @NonNull
    public final TextFieldCellView largeOrdersLiftingTF;

    @NonNull
    public final TextAtomV2View largeOrdersLiftingTitleTAV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetLargeOrdersLiftingV2Binding(@NonNull LinearLayout linearLayout, @NonNull ButtonV3View buttonV3View, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull ButtonV3View buttonV3View2, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View, @NonNull TextFieldCellView textFieldCellView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.largeOrdersLiftingCancelBtn = buttonV3View;
        this.largeOrdersLiftingCellsContainer = verticalAtomsLayout;
        this.largeOrdersLiftingConfirmBtn = buttonV3View2;
        this.largeOrdersLiftingIV = image;
        this.largeOrdersLiftingSubtitleTAV = textAtomV2View;
        this.largeOrdersLiftingTF = textFieldCellView;
        this.largeOrdersLiftingTitleTAV = textAtomV2View2;
    }

    @NonNull
    public static WidgetLargeOrdersLiftingV2Binding bind(@NonNull View view) {
        int i11 = R$id.largeOrdersLiftingCancelBtn;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.largeOrdersLiftingCellsContainer;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.largeOrdersLiftingConfirmBtn;
                ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View2 != null) {
                    i11 = R$id.largeOrdersLiftingIV;
                    Image image = (Image) C2548q.d(i11, view);
                    if (image != null) {
                        i11 = R$id.largeOrdersLiftingSubtitleTAV;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.largeOrdersLiftingTF;
                            TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
                            if (textFieldCellView != null) {
                                i11 = R$id.largeOrdersLiftingTitleTAV;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View2 != null) {
                                    return new WidgetLargeOrdersLiftingV2Binding((LinearLayout) view, buttonV3View, verticalAtomsLayout, buttonV3View2, image, textAtomV2View, textFieldCellView, textAtomV2View2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
