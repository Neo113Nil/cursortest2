package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class WidgetProductVariantBinding implements a {

    @NonNull
    public final TextAtomV2View changeVariantTAV;

    @NonNull
    public final TextAtomV2View productDescriptionTAV;

    @NonNull
    public final ShapeableImageView productIv;

    @NonNull
    public final TextAtomV2View productNameTAV;

    @NonNull
    public final ConstraintLayout productVariantWidget;

    @NonNull
    public final FrameLayout productVariantWidgetRoot;

    @NonNull
    private final FrameLayout rootView;

    private WidgetProductVariantBinding(@NonNull FrameLayout frameLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull ShapeableImageView shapeableImageView, @NonNull TextAtomV2View textAtomV2View3, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.changeVariantTAV = textAtomV2View;
        this.productDescriptionTAV = textAtomV2View2;
        this.productIv = shapeableImageView;
        this.productNameTAV = textAtomV2View3;
        this.productVariantWidget = constraintLayout;
        this.productVariantWidgetRoot = frameLayout2;
    }

    @NonNull
    public static WidgetProductVariantBinding bind(@NonNull View view) {
        int i11 = R$id.changeVariantTAV;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.productDescriptionTAV;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                i11 = R$id.productIv;
                ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                if (shapeableImageView != null) {
                    i11 = R$id.productNameTAV;
                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View3 != null) {
                        i11 = R$id.productVariantWidget;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                        if (constraintLayout != null) {
                            FrameLayout frameLayout = (FrameLayout) view;
                            return new WidgetProductVariantBinding(frameLayout, textAtomV2View, textAtomV2View2, shapeableImageView, textAtomV2View3, constraintLayout, frameLayout);
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
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
