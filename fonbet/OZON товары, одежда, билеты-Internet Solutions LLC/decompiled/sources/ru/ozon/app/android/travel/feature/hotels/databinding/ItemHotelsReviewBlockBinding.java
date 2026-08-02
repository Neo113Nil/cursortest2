package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemHotelsReviewBlockBinding implements a {

    @NonNull
    public final AppCompatTextView hotelsReviewBlockTextTv;

    @NonNull
    public final TextAtomView hotelsReviewBlockTitleTav;

    @NonNull
    private final LinearLayout rootView;

    private ItemHotelsReviewBlockBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.hotelsReviewBlockTextTv = appCompatTextView;
        this.hotelsReviewBlockTitleTav = textAtomView;
    }

    @NonNull
    public static ItemHotelsReviewBlockBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsReviewBlockTextTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.hotelsReviewBlockTitleTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ItemHotelsReviewBlockBinding((LinearLayout) view, appCompatTextView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsReviewBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_review_block, viewGroup, false);
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
