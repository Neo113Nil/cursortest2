package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemHelpInsuranceTabBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView tabIconIV;

    @NonNull
    public final TextAtomView tabTitleTAV;

    private ItemHelpInsuranceTabBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.tabIconIV = imageView;
        this.tabTitleTAV = textAtomView;
    }

    @NonNull
    public static ItemHelpInsuranceTabBinding bind(@NonNull View view) {
        int i11 = R$id.tabIconIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.tabTitleTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ItemHelpInsuranceTabBinding((LinearLayout) view, imageView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHelpInsuranceTabBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_help_insurance_tab, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
