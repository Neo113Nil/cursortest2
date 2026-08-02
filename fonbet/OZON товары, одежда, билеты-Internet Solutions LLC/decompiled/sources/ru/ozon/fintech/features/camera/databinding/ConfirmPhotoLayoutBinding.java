package ru.ozon.fintech.features.camera.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;

/* loaded from: classes3.dex */
public final class ConfirmPhotoLayoutBinding implements a {

    @NonNull
    public final Guideline bottomGuideline;

    @NonNull
    public final FinLargeButtonView confirmButton;

    @NonNull
    public final ConstraintLayout confirmContainer;

    @NonNull
    public final TextView confirmTitle;

    @NonNull
    public final ImageView ivCloseCameraConfirm;

    @NonNull
    public final ImageView photoView;

    @NonNull
    public final FinLargeButtonView retakeButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Guideline topGuideline;

    private ConfirmPhotoLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull FinLargeButtonView finLargeButtonView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull FinLargeButtonView finLargeButtonView2, @NonNull Guideline guideline2) {
        this.rootView = constraintLayout;
        this.bottomGuideline = guideline;
        this.confirmButton = finLargeButtonView;
        this.confirmContainer = constraintLayout2;
        this.confirmTitle = textView;
        this.ivCloseCameraConfirm = imageView;
        this.photoView = imageView2;
        this.retakeButton = finLargeButtonView2;
        this.topGuideline = guideline2;
    }

    @NonNull
    public static ConfirmPhotoLayoutBinding bind(@NonNull View view) {
        int i11 = R.id.bottom_guideline;
        Guideline guideline = (Guideline) C2548q.d(R.id.bottom_guideline, view);
        if (guideline != null) {
            i11 = R.id.confirm_button;
            FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.confirm_button, view);
            if (finLargeButtonView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R.id.confirm_title;
                TextView textView = (TextView) C2548q.d(R.id.confirm_title, view);
                if (textView != null) {
                    i11 = R.id.iv_close_camera_confirm;
                    ImageView imageView = (ImageView) C2548q.d(R.id.iv_close_camera_confirm, view);
                    if (imageView != null) {
                        i11 = R.id.photo_view;
                        ImageView imageView2 = (ImageView) C2548q.d(R.id.photo_view, view);
                        if (imageView2 != null) {
                            i11 = R.id.retake_button;
                            FinLargeButtonView finLargeButtonView2 = (FinLargeButtonView) C2548q.d(R.id.retake_button, view);
                            if (finLargeButtonView2 != null) {
                                i11 = R.id.top_guideline;
                                Guideline guideline2 = (Guideline) C2548q.d(R.id.top_guideline, view);
                                if (guideline2 != null) {
                                    return new ConfirmPhotoLayoutBinding(constraintLayout, guideline, finLargeButtonView, constraintLayout, textView, imageView, imageView2, finLargeButtonView2, guideline2);
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
    public static ConfirmPhotoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ConfirmPhotoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.confirm_photo_layout, viewGroup, false);
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
