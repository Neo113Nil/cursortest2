package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class QrCodeViewBinding implements a {

    @NonNull
    public final ImageView finQrImageView;

    @NonNull
    public final ConstraintLayout finQrRoot;

    @NonNull
    public final TextAtomView finQrSubtitle;

    @NonNull
    private final ConstraintLayout rootView;

    private QrCodeViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.finQrImageView = imageView;
        this.finQrRoot = constraintLayout2;
        this.finQrSubtitle = textAtomView;
    }

    @NonNull
    public static QrCodeViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_qr_image_view;
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_qr_image_view, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.fin_qr_subtitle, view);
            if (textAtomView != null) {
                return new QrCodeViewBinding(constraintLayout, imageView, constraintLayout, textAtomView);
            }
            i11 = R.id.fin_qr_subtitle;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static QrCodeViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrCodeViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.qr_code_view, viewGroup, false);
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
