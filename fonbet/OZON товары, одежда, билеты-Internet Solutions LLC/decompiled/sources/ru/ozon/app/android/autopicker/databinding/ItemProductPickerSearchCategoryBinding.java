package ru.ozon.app.android.autopicker.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.autopicker.R$id;
import ru.ozon.app.android.autopicker.R$layout;

/* loaded from: classes11.dex */
public final class ItemProductPickerSearchCategoryBinding implements a {

    @NonNull
    public final ImageView arrowIv;

    @NonNull
    public final ConstraintLayout clCategory;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemProductPickerSearchCategoryBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.arrowIv = imageView;
        this.clCategory = constraintLayout2;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemProductPickerSearchCategoryBinding bind(@NonNull View view) {
        int i11 = R$id.arrowIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i12, view);
            if (textView != null) {
                return new ItemProductPickerSearchCategoryBinding(constraintLayout, imageView, constraintLayout, textView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemProductPickerSearchCategoryBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_product_picker_search_category, viewGroup, false);
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
