package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdpoldwidgets.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetCaptionBinding implements a {

    @NonNull
    public final ImageView chevronIv;

    @NonNull
    public final ImageView pdpCaptionImageIv;

    @NonNull
    public final TextView pdpCaptionTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpWidgetCaptionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.chevronIv = imageView;
        this.pdpCaptionImageIv = imageView2;
        this.pdpCaptionTitleTv = textView;
    }

    @NonNull
    public static PdpWidgetCaptionBinding bind(@NonNull View view) {
        int i11 = R$id.chevronIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.pdpCaptionImageIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.pdpCaptionTitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new PdpWidgetCaptionBinding((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
