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
public final class ItemUwidgetHeaderBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout uWidgetHeaderCl;

    @NonNull
    public final ImageView uWidgetHeaderDisclosureIv;

    @NonNull
    public final TextView uWidgetHeaderSubTitleTv;

    @NonNull
    public final TextView uWidgetHeaderTitleTv;

    private ItemUwidgetHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.uWidgetHeaderCl = constraintLayout2;
        this.uWidgetHeaderDisclosureIv = imageView;
        this.uWidgetHeaderSubTitleTv = textView;
        this.uWidgetHeaderTitleTv = textView2;
    }

    @NonNull
    public static ItemUwidgetHeaderBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.uWidgetHeaderDisclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.uWidgetHeaderSubTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.uWidgetHeaderTitleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new ItemUwidgetHeaderBinding(constraintLayout, constraintLayout, imageView, textView, textView2);
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
