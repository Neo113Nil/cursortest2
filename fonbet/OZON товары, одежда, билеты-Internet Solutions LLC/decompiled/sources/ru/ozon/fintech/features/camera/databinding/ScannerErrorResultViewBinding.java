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
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;

/* loaded from: classes3.dex */
public final class ScannerErrorResultViewBinding implements a {

    @NonNull
    public final FinLargeButtonView btnReply;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvTitle;

    private ScannerErrorResultViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.btnReply = finLargeButtonView;
        this.ivClose = imageView;
        this.ivTitle = imageView2;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ScannerErrorResultViewBinding bind(@NonNull View view) {
        int i11 = R.id.btn_reply;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.btn_reply, view);
        if (finLargeButtonView != null) {
            i11 = R.id.iv_close;
            ImageView imageView = (ImageView) C2548q.d(R.id.iv_close, view);
            if (imageView != null) {
                i11 = R.id.iv_title;
                ImageView imageView2 = (ImageView) C2548q.d(R.id.iv_title, view);
                if (imageView2 != null) {
                    i11 = R.id.tv_description;
                    TextView textView = (TextView) C2548q.d(R.id.tv_description, view);
                    if (textView != null) {
                        i11 = R.id.tv_title;
                        TextView textView2 = (TextView) C2548q.d(R.id.tv_title, view);
                        if (textView2 != null) {
                            return new ScannerErrorResultViewBinding((ConstraintLayout) view, finLargeButtonView, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ScannerErrorResultViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ScannerErrorResultViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.scanner_error_result_view, viewGroup, false);
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
