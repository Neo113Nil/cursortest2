package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetCommonBarcodeBinding implements a {

    @NonNull
    public final ConstraintLayout barcodeCl;

    @NonNull
    public final ShapeableImageView barcodeIv;

    @NonNull
    public final Barrier barrierHeader;

    @NonNull
    public final TextView codeTv;

    @NonNull
    public final TextAtomView descriptionTav;

    @NonNull
    public final ImageView expandBarcodeIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetCommonBarcodeBinding(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull Barrier barrier, @NonNull TextView textView, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.barcodeCl = constraintLayout;
        this.barcodeIv = shapeableImageView;
        this.barrierHeader = barrier;
        this.codeTv = textView;
        this.descriptionTav = textAtomView;
        this.expandBarcodeIv = imageView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetCommonBarcodeBinding bind(@NonNull View view) {
        int i11 = R$id.barcodeCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.barcodeIv;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
            if (shapeableImageView != null) {
                i11 = R$id.barrierHeader;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.codeTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.descriptionTav;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.expandBarcodeIv;
                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                            if (imageView != null) {
                                i11 = R$id.titleTv;
                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                if (textView2 != null) {
                                    return new WidgetCommonBarcodeBinding((FrameLayout) view, constraintLayout, shapeableImageView, barrier, textView, textAtomView, imageView, textView2);
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
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
