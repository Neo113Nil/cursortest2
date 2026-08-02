package ru.ozon.app.android.storefront.core.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.R$layout;
import ru.ozon.uni.android.uikit.appearance.text.StrikethroughTextView;

/* loaded from: classes2.dex */
public final class ViewSocialSmallProductBinding implements a {

    @NonNull
    public final AppCompatImageView iconView;

    @NonNull
    public final AppCompatImageView imageView;

    @NonNull
    public final StrikethroughTextView priceOriginalView;

    @NonNull
    public final TextView priceView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout socialSmallProduct;

    private ViewSocialSmallProductBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull StrikethroughTextView strikethroughTextView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.iconView = appCompatImageView;
        this.imageView = appCompatImageView2;
        this.priceOriginalView = strikethroughTextView;
        this.priceView = textView;
        this.socialSmallProduct = constraintLayout2;
    }

    @NonNull
    public static ViewSocialSmallProductBinding bind(@NonNull View view) {
        int i11 = R$id.iconView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.imageView;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView2 != null) {
                i11 = R$id.priceOriginalView;
                StrikethroughTextView strikethroughTextView = (StrikethroughTextView) C2548q.d(i11, view);
                if (strikethroughTextView != null) {
                    i11 = R$id.priceView;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new ViewSocialSmallProductBinding(constraintLayout, appCompatImageView, appCompatImageView2, strikethroughTextView, textView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewSocialSmallProductBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_social_small_product, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
