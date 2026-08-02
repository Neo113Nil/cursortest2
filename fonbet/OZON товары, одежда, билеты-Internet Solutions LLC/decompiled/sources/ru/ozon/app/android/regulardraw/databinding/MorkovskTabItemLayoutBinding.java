package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$layout;
import ru.ozon.app.android.regulardraw.ui.OutlinedTextView;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorView;

/* loaded from: classes13.dex */
public final class MorkovskTabItemLayoutBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatImageView tabBgImageView;

    @NonNull
    public final ConstraintLayout tabCL;

    @NonNull
    public final AppCompatImageView tabImageView;

    @NonNull
    public final IndicatorView tabIndicatorView;

    @NonNull
    public final OutlinedTextView tabTitleTv;

    private MorkovskTabItemLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView2, @NonNull IndicatorView indicatorView, @NonNull OutlinedTextView outlinedTextView) {
        this.rootView = constraintLayout;
        this.tabBgImageView = appCompatImageView;
        this.tabCL = constraintLayout2;
        this.tabImageView = appCompatImageView2;
        this.tabIndicatorView = indicatorView;
        this.tabTitleTv = outlinedTextView;
    }

    @NonNull
    public static MorkovskTabItemLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.tabBgImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.tabImageView;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView2 != null) {
                i11 = R$id.tabIndicatorView;
                IndicatorView indicatorView = (IndicatorView) C2548q.d(i11, view);
                if (indicatorView != null) {
                    i11 = R$id.tabTitleTv;
                    OutlinedTextView outlinedTextView = (OutlinedTextView) C2548q.d(i11, view);
                    if (outlinedTextView != null) {
                        return new MorkovskTabItemLayoutBinding(constraintLayout, appCompatImageView, constraintLayout, appCompatImageView2, indicatorView, outlinedTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MorkovskTabItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.morkovsk_tab_item_layout, viewGroup, false);
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
