package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesView;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes13.dex */
public final class WidgetFeeBinding implements a {

    @NonNull
    public final ButtonV3View buttonV;

    @NonNull
    public final IconView copyIconIv;

    @NonNull
    public final View copyTextClickArea;

    @NonNull
    public final TextAtomV2View copyTextTav;

    @NonNull
    public final ImagesView firstRowRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImagesView secondRowRv;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetFeeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull IconView iconView, @NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull ImagesView imagesView, @NonNull ImagesView imagesView2, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.buttonV = buttonV3View;
        this.copyIconIv = iconView;
        this.copyTextClickArea = view;
        this.copyTextTav = textAtomV2View;
        this.firstRowRv = imagesView;
        this.secondRowRv = imagesView2;
        this.subtitleTav = textAtomV2View2;
        this.titleTav = textAtomV2View3;
    }

    @NonNull
    public static WidgetFeeBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.buttonV;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.copyIconIv;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null && (d11 = C2548q.d((i11 = R$id.copyTextClickArea), view)) != null) {
                i11 = R$id.copyTextTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.firstRowRv;
                    ImagesView imagesView = (ImagesView) C2548q.d(i11, view);
                    if (imagesView != null) {
                        i11 = R$id.secondRowRv;
                        ImagesView imagesView2 = (ImagesView) C2548q.d(i11, view);
                        if (imagesView2 != null) {
                            i11 = R$id.subtitleTav;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                i11 = R$id.titleTav;
                                TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View3 != null) {
                                    return new WidgetFeeBinding((ConstraintLayout) view, buttonV3View, iconView, d11, textAtomV2View, imagesView, imagesView2, textAtomV2View2, textAtomV2View3);
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
