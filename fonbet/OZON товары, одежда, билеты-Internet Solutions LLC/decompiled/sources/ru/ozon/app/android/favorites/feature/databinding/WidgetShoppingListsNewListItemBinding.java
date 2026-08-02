package ru.ozon.app.android.favorites.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.feature.R$id;

/* loaded from: classes12.dex */
public final class WidgetShoppingListsNewListItemBinding implements a {

    @NonNull
    public final View addImageBackgroundView;

    @NonNull
    public final View addImageOverlayView;

    @NonNull
    public final ImageView addIv;

    @NonNull
    public final TextView addTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetShoppingListsNewListItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.addImageBackgroundView = view;
        this.addImageOverlayView = view2;
        this.addIv = imageView;
        this.addTitle = textView;
    }

    @NonNull
    public static WidgetShoppingListsNewListItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.addImageBackgroundView;
        View d12 = C2548q.d(i11, view);
        if (d12 != null && (d11 = C2548q.d((i11 = R$id.addImageOverlayView), view)) != null) {
            i11 = R$id.addIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.addTitle;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetShoppingListsNewListItemBinding((ConstraintLayout) view, d12, d11, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
