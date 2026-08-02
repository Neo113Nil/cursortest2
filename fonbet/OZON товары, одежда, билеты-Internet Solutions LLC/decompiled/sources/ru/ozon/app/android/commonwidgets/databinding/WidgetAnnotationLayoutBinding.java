package ru.ozon.app.android.commonwidgets.databinding;

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
import ru.ozon.app.android.commonwidgets.R$id;

/* loaded from: classes11.dex */
public final class WidgetAnnotationLayoutBinding implements a {

    @NonNull
    public final RecyclerView buttonsRv;

    @NonNull
    public final ConstraintLayout cardContainerCl;

    @NonNull
    public final CardView cardCv;

    @NonNull
    public final FrameLayout containerFl;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView textTv;

    private WidgetAnnotationLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.buttonsRv = recyclerView;
        this.cardContainerCl = constraintLayout;
        this.cardCv = cardView;
        this.containerFl = frameLayout2;
        this.iconIv = imageView;
        this.textTv = textView;
    }

    @NonNull
    public static WidgetAnnotationLayoutBinding bind(@NonNull View view) {
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
                    i11 = R$id.iconIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.textTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            return new WidgetAnnotationLayoutBinding(frameLayout, recyclerView, constraintLayout, cardView, frameLayout, imageView, textView);
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
