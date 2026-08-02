package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetSearchSuggestionBinding implements a {

    @NonNull
    public final ImageView brandIv;

    @NonNull
    public final TextView breadcrumbsTv;

    @NonNull
    public final AppCompatImageView divider;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    public final View overlayView;

    @NonNull
    public final TextView priceTv;

    @NonNull
    public final ImageView productIv;

    @NonNull
    public final ImageView rocketIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final ImageView typeImageIv;

    private WidgetSearchSuggestionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView5) {
        this.rootView = constraintLayout;
        this.brandIv = imageView;
        this.breadcrumbsTv = textView;
        this.divider = appCompatImageView;
        this.imageIv = imageView2;
        this.overlayView = view;
        this.priceTv = textView2;
        this.productIv = imageView3;
        this.rocketIv = imageView4;
        this.subtitleTv = textView3;
        this.titleTv = textView4;
        this.typeImageIv = imageView5;
    }

    @NonNull
    public static WidgetSearchSuggestionBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.brandIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.breadcrumbsTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.divider;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.imageIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null && (d11 = C2548q.d((i11 = R$id.overlayView), view)) != null) {
                        i11 = R$id.priceTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.productIv;
                            ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                            if (imageView3 != null) {
                                i11 = R$id.rocketIv;
                                ImageView imageView4 = (ImageView) C2548q.d(i11, view);
                                if (imageView4 != null) {
                                    i11 = R$id.subtitleTv;
                                    TextView textView3 = (TextView) C2548q.d(i11, view);
                                    if (textView3 != null) {
                                        i11 = R$id.titleTv;
                                        TextView textView4 = (TextView) C2548q.d(i11, view);
                                        if (textView4 != null) {
                                            i11 = R$id.typeImageIv;
                                            ImageView imageView5 = (ImageView) C2548q.d(i11, view);
                                            if (imageView5 != null) {
                                                return new WidgetSearchSuggestionBinding((ConstraintLayout) view, imageView, textView, appCompatImageView, imageView2, d11, textView2, imageView3, imageView4, textView3, textView4, imageView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
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
