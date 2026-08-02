package ru.ozon.app.android.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.map.R$id;
import ru.ozon.app.android.map.R$layout;

/* loaded from: classes12.dex */
public final class ItemSelectorSheetOptionBinding implements a {

    @NonNull
    public final View checkboxV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private ItemSelectorSheetOptionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.checkboxV = view;
        this.subTitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static ItemSelectorSheetOptionBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.subTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new ItemSelectorSheetOptionBinding((ConstraintLayout) view, d11, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemSelectorSheetOptionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_selector_sheet_option, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
