package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.orderdetails.R$id;

/* loaded from: classes13.dex */
public final class WidgetDateSelectorBinding implements a {

    @NonNull
    public final ImageView dateIconIv;

    @NonNull
    public final ConstraintLayout dateLl;

    @NonNull
    public final TextView dateTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    private WidgetDateSelectorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view) {
        this.rootView = constraintLayout;
        this.dateIconIv = imageView;
        this.dateLl = constraintLayout2;
        this.dateTitleTv = textView;
        this.separatorV = view;
    }

    @NonNull
    public static WidgetDateSelectorBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.dateIconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.dateTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                return new WidgetDateSelectorBinding(constraintLayout, imageView, constraintLayout, textView, d11);
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
