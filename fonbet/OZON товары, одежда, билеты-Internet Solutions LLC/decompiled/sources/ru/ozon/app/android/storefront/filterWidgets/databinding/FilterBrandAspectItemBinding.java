package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.icon.IconView;

/* loaded from: classes2.dex */
public final class FilterBrandAspectItemBinding implements a {

    @NonNull
    public final AspectView aspectContainer;

    @NonNull
    public final IconView brandIv;

    @NonNull
    public final AppCompatTextView brandTitle;

    @NonNull
    private final AspectView rootView;

    private FilterBrandAspectItemBinding(@NonNull AspectView aspectView, @NonNull AspectView aspectView2, @NonNull IconView iconView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = aspectView;
        this.aspectContainer = aspectView2;
        this.brandIv = iconView;
        this.brandTitle = appCompatTextView;
    }

    @NonNull
    public static FilterBrandAspectItemBinding bind(@NonNull View view) {
        AspectView aspectView = (AspectView) view;
        int i11 = R$id.brandIv;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.brandTitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new FilterBrandAspectItemBinding(aspectView, aspectView, iconView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FilterBrandAspectItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.filter_brand_aspect_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public AspectView getConstraintLayout() {
        return this.rootView;
    }
}
