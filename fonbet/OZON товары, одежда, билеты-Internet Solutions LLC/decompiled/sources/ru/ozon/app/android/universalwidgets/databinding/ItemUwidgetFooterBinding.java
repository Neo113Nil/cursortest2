package ru.ozon.app.android.universalwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.universalwidgets.R$id;

/* loaded from: classes2.dex */
public final class ItemUwidgetFooterBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout uWidgetFooterCl;

    @NonNull
    public final ImageView uWidgetFooterDisclosureIv;

    @NonNull
    public final TextView uWidgetFooterTitleTv;

    private ItemUwidgetFooterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.uWidgetFooterCl = constraintLayout2;
        this.uWidgetFooterDisclosureIv = imageView;
        this.uWidgetFooterTitleTv = textView;
    }

    @NonNull
    public static ItemUwidgetFooterBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.uWidgetFooterDisclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.uWidgetFooterTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemUwidgetFooterBinding(constraintLayout, constraintLayout, imageView, textView);
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
