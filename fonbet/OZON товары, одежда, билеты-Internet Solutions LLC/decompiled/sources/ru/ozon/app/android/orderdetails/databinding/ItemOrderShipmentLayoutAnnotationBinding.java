package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutAnnotationBinding implements a {

    @NonNull
    public final RecyclerView buttonsRv;

    @NonNull
    public final ConstraintLayout cardContainerCl;

    @NonNull
    public final CardView cardCv;

    @NonNull
    public final FrameLayout containerFl;

    @NonNull
    public final HorizontalFlexAtomsLayout flexBoxButtons;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView textTv;

    private ItemOrderShipmentLayoutAnnotationBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull FrameLayout frameLayout2, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.buttonsRv = recyclerView;
        this.cardContainerCl = constraintLayout;
        this.cardCv = cardView;
        this.containerFl = frameLayout2;
        this.flexBoxButtons = horizontalFlexAtomsLayout;
        this.iconIv = imageView;
        this.textTv = textView;
    }

    @NonNull
    public static ItemOrderShipmentLayoutAnnotationBinding bind(@NonNull View view) {
        int i11 = R$id.buttonsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.cardContainerCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.cardCv;
                CardView cardView = (CardView) C2548q.d(i11, view);
                if (cardView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = R$id.flexBoxButtons;
                    HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                    if (horizontalFlexAtomsLayout != null) {
                        i11 = R$id.iconIv;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.textTv;
                            TextView textView = (TextView) C2548q.d(i11, view);
                            if (textView != null) {
                                return new ItemOrderShipmentLayoutAnnotationBinding(frameLayout, recyclerView, constraintLayout, cardView, frameLayout, horizontalFlexAtomsLayout, imageView, textView);
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
