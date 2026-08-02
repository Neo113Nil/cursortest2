package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class WidgetRateItemsV2ReviewsItemBinding implements a {

    @NonNull
    public final IconView icon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetRateItemsV2ReviewsItemBinding(@NonNull LinearLayout linearLayout, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.icon = iconView;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetRateItemsV2ReviewsItemBinding bind(@NonNull View view) {
        int i11 = R$id.icon;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.title;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetRateItemsV2ReviewsItemBinding((LinearLayout) view, iconView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetRateItemsV2ReviewsItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetRateItemsV2ReviewsItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_rate_items_v2_reviews_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
