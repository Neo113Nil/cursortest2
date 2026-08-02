package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes13.dex */
public final class ReturnCreationModalBinding implements a {

    @NonNull
    public final VerticalAtomsLayout atomsVal;

    @NonNull
    public final HorizontalAtomsLayout buttonsHal;

    @NonNull
    public final Image image;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View titleTav;

    private ReturnCreationModalBinding(@NonNull LinearLayout linearLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.atomsVal = verticalAtomsLayout;
        this.buttonsHal = horizontalAtomsLayout;
        this.image = image;
        this.titleTav = textAtomV2View;
    }

    @NonNull
    public static ReturnCreationModalBinding bind(@NonNull View view) {
        int i11 = R$id.atomsVal;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.buttonsHal;
            HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
            if (horizontalAtomsLayout != null) {
                i11 = R$id.image;
                Image image = (Image) C2548q.d(i11, view);
                if (image != null) {
                    i11 = R$id.titleTav;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        return new ReturnCreationModalBinding((LinearLayout) view, verticalAtomsLayout, horizontalAtomsLayout, image, textAtomV2View);
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
