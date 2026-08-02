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
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemHotelsPageDetailsFullServiceDetailBinding implements a {

    @NonNull
    public final AppCompatImageView iconHotelServiceIV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView setHotelServiceTAV;

    @NonNull
    public final TextAtomView titleHotelServiceTAV;

    private ItemHotelsPageDetailsFullServiceDetailBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.iconHotelServiceIV = appCompatImageView;
        this.setHotelServiceTAV = appCompatTextView;
        this.titleHotelServiceTAV = textAtomView;
    }

    @NonNull
    public static ItemHotelsPageDetailsFullServiceDetailBinding bind(@NonNull View view) {
        int i11 = R$id.iconHotelServiceIV;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.setHotelServiceTAV;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.titleHotelServiceTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new ItemHotelsPageDetailsFullServiceDetailBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsPageDetailsFullServiceDetailBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_page_details_full_service_detail, viewGroup, false);
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
