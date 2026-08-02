package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.pdp.R$id;

/* loaded from: classes13.dex */
public final class WidgetSellerSortSwitcherBinding implements a {

    @NonNull
    public final ImageView productIv;

    @NonNull
    public final TextView productTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final HorizontalAtomsLayout tagsHal;

    private WidgetSellerSortSwitcherBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull HorizontalAtomsLayout horizontalAtomsLayout) {
        this.rootView = constraintLayout;
        this.productIv = imageView;
        this.productTitleTv = textView;
        this.tagsHal = horizontalAtomsLayout;
    }

    @NonNull
    public static WidgetSellerSortSwitcherBinding bind(@NonNull View view) {
        int i11 = R$id.productIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.productTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.tagsHal;
                HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
                if (horizontalAtomsLayout != null) {
                    return new WidgetSellerSortSwitcherBinding((ConstraintLayout) view, imageView, textView, horizontalAtomsLayout);
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
