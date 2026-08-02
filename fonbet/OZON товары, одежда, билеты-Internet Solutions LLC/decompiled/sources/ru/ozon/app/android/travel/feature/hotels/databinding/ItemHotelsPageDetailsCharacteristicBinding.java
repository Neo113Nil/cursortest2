package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;

/* loaded from: classes4.dex */
public final class ItemHotelsPageDetailsCharacteristicBinding implements a {

    @NonNull
    public final AppCompatTextView characteristicNameTv;

    @NonNull
    public final AppCompatTextView characteristicValueTv;

    @NonNull
    public final Guideline guideline;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View space;

    @NonNull
    public final AppCompatImageView strokeIv;

    private ItemHotelsPageDetailsCharacteristicBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull Guideline guideline, @NonNull View view, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.characteristicNameTv = appCompatTextView;
        this.characteristicValueTv = appCompatTextView2;
        this.guideline = guideline;
        this.space = view;
        this.strokeIv = appCompatImageView;
    }

    @NonNull
    public static ItemHotelsPageDetailsCharacteristicBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.characteristicNameTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.characteristicValueTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                i11 = R$id.guideline;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null && (d11 = C2548q.d((i11 = R$id.space), view)) != null) {
                    i11 = R$id.strokeIv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        return new ItemHotelsPageDetailsCharacteristicBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2, guideline, d11, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsPageDetailsCharacteristicBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_page_details_characteristic, viewGroup, false);
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
