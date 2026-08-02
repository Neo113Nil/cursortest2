package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;

/* loaded from: classes12.dex */
public final class WidgetExpressNavigationSliderV2ItemBinding implements a {

    @NonNull
    public final ImageView adultEyeLogoIv;

    @NonNull
    public final AspectRatioImageView backgroundIv;

    @NonNull
    public final CardView cardView;

    @NonNull
    public final TextView nameTv;

    @NonNull
    public final View overlayView;

    @NonNull
    public final Guideline rightIndent;

    @NonNull
    private final FrameLayout rootView;

    private WidgetExpressNavigationSliderV2ItemBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull AspectRatioImageView aspectRatioImageView, @NonNull CardView cardView, @NonNull TextView textView, @NonNull View view, @NonNull Guideline guideline) {
        this.rootView = frameLayout;
        this.adultEyeLogoIv = imageView;
        this.backgroundIv = aspectRatioImageView;
        this.cardView = cardView;
        this.nameTv = textView;
        this.overlayView = view;
        this.rightIndent = guideline;
    }

    @NonNull
    public static WidgetExpressNavigationSliderV2ItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.adultEyeLogoIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.backgroundIv;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) C2548q.d(i11, view);
            if (aspectRatioImageView != null) {
                i11 = R$id.cardView;
                CardView cardView = (CardView) C2548q.d(i11, view);
                if (cardView != null) {
                    i11 = R$id.nameTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null && (d11 = C2548q.d((i11 = R$id.overlayView), view)) != null) {
                        i11 = R$id.rightIndent;
                        Guideline guideline = (Guideline) C2548q.d(i11, view);
                        if (guideline != null) {
                            return new WidgetExpressNavigationSliderV2ItemBinding((FrameLayout) view, imageView, aspectRatioImageView, cardView, textView, d11, guideline);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
