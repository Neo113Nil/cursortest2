package ru.ozon.app.android.favorites.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes12.dex */
public final class WidgetShoppingListsListItemBinding implements a {

    @NonNull
    public final View listImageBackgroundView;

    @NonNull
    public final View listImageOverlayView;

    @NonNull
    public final ImageView listIv;

    @NonNull
    public final SmallIconButtonView optionsButtonHolder;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetShoppingListsListItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.listImageBackgroundView = view;
        this.listImageOverlayView = view2;
        this.listIv = imageView;
        this.optionsButtonHolder = smallIconButtonView;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetShoppingListsListItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.listImageBackgroundView;
        View d12 = C2548q.d(i11, view);
        if (d12 != null && (d11 = C2548q.d((i11 = R$id.listImageOverlayView), view)) != null) {
            i11 = R$id.listIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.optionsButtonHolder;
                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                if (smallIconButtonView != null) {
                    i11 = R$id.subtitleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.titleTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            return new WidgetShoppingListsListItemBinding((ConstraintLayout) view, d12, d11, imageView, smallIconButtonView, textView, textView2);
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
