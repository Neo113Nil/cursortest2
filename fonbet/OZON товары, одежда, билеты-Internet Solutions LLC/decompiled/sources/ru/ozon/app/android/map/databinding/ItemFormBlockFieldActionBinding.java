package ru.ozon.app.android.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.map.R$id;
import ru.ozon.app.android.map.R$layout;

/* loaded from: classes12.dex */
public final class ItemFormBlockFieldActionBinding implements a {

    @NonNull
    public final Guideline endGuideline;

    @NonNull
    public final View errorSeparatorV;

    @NonNull
    public final TextView errorTv;

    @NonNull
    public final FrameLayout fieldBackgroundFl;

    @NonNull
    public final TextView hintTv;

    @NonNull
    public final ImageView pickerIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Guideline startGuideline;

    @NonNull
    public final TextView titleTv;

    private ItemFormBlockFieldActionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull Guideline guideline2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.endGuideline = guideline;
        this.errorSeparatorV = view;
        this.errorTv = textView;
        this.fieldBackgroundFl = frameLayout;
        this.hintTv = textView2;
        this.pickerIv = imageView;
        this.startGuideline = guideline2;
        this.titleTv = textView3;
    }

    @NonNull
    public static ItemFormBlockFieldActionBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.endGuideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null && (d11 = C2548q.d((i11 = R$id.errorSeparatorV), view)) != null) {
            i11 = R$id.errorTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.fieldBackgroundFl;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    i11 = R$id.hintTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.pickerIv;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.startGuideline;
                            Guideline guideline2 = (Guideline) C2548q.d(i11, view);
                            if (guideline2 != null) {
                                i11 = R$id.titleTv;
                                TextView textView3 = (TextView) C2548q.d(i11, view);
                                if (textView3 != null) {
                                    return new ItemFormBlockFieldActionBinding((ConstraintLayout) view, guideline, d11, textView, frameLayout, textView2, imageView, guideline2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemFormBlockFieldActionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_form_block_field_action, viewGroup, false);
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
