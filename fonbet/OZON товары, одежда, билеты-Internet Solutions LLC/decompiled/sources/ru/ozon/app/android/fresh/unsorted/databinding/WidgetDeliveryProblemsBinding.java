package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetDeliveryProblemsBinding implements a {

    @NonNull
    public final LinearLayout deliveryProblemsContainer;

    @NonNull
    public final ImageView deliveryProblemsImageView;

    @NonNull
    public final TextAtomView deliveryProblemsTextView;

    @NonNull
    private final LinearLayout rootView;

    private WidgetDeliveryProblemsBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.deliveryProblemsContainer = linearLayout2;
        this.deliveryProblemsImageView = imageView;
        this.deliveryProblemsTextView = textAtomView;
    }

    @NonNull
    public static WidgetDeliveryProblemsBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.deliveryProblemsImageView;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.deliveryProblemsTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new WidgetDeliveryProblemsBinding(linearLayout, linearLayout, imageView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
