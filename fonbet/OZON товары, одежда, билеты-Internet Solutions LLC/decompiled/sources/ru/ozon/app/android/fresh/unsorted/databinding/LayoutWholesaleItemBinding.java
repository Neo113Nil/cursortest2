package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class LayoutWholesaleItemBinding implements a {

    @NonNull
    public final ButtonV3View button;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TitleSubtitleCellView title;

    private LayoutWholesaleItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull View view, @NonNull TitleSubtitleCellView titleSubtitleCellView) {
        this.rootView = constraintLayout;
        this.button = buttonV3View;
        this.separator = view;
        this.title = titleSubtitleCellView;
    }

    @NonNull
    public static LayoutWholesaleItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
            i11 = R$id.title;
            TitleSubtitleCellView titleSubtitleCellView = (TitleSubtitleCellView) C2548q.d(i11, view);
            if (titleSubtitleCellView != null) {
                return new LayoutWholesaleItemBinding((ConstraintLayout) view, buttonV3View, d11, titleSubtitleCellView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static LayoutWholesaleItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.layout_wholesale_item, viewGroup, false);
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
