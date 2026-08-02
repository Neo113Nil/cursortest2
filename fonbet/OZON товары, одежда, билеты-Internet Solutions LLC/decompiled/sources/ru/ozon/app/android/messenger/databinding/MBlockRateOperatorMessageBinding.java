package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

/* loaded from: classes12.dex */
public final class MBlockRateOperatorMessageBinding implements a {

    @NonNull
    public final FrameLayout rateOperatorMsgRootFl;

    @NonNull
    public final LinearLayout rateOperatorRatingLl;

    @NonNull
    public final TextView rateOperatorRatingTitleTv;

    @NonNull
    public final VectorRatingBar rateOperatorRatingVrb;

    @NonNull
    public final LinearLayout rateOperatorSuccessCl;

    @NonNull
    public final ImageView rateOperatorSuccessIV;

    @NonNull
    public final TextView rateOperatorSuccessTitleTV;

    @NonNull
    private final FrameLayout rootView;

    private MBlockRateOperatorMessageBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull VectorRatingBar vectorRatingBar, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.rateOperatorMsgRootFl = frameLayout2;
        this.rateOperatorRatingLl = linearLayout;
        this.rateOperatorRatingTitleTv = textView;
        this.rateOperatorRatingVrb = vectorRatingBar;
        this.rateOperatorSuccessCl = linearLayout2;
        this.rateOperatorSuccessIV = imageView;
        this.rateOperatorSuccessTitleTV = textView2;
    }

    @NonNull
    public static MBlockRateOperatorMessageBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.rateOperatorRatingLl;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.rateOperatorRatingTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.rateOperatorRatingVrb;
                VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
                if (vectorRatingBar != null) {
                    i11 = R$id.rateOperatorSuccessCl;
                    LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout2 != null) {
                        i11 = R$id.rateOperatorSuccessIV;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.rateOperatorSuccessTitleTV;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                return new MBlockRateOperatorMessageBinding(frameLayout, frameLayout, linearLayout, textView, vectorRatingBar, linearLayout2, imageView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockRateOperatorMessageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_rate_operator_message, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
