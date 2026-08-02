package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes11.dex */
public final class WidgetOrderGalleryPostingItemBinding implements a {

    @NonNull
    public final AppCompatImageView copyIcon;

    @NonNull
    public final ConstraintLayout descriptionContainer;

    @NonNull
    public final TextView descriptionTitleTv;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final LargeButtonView downloadActionLBV;

    @NonNull
    public final TextView hintTv;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final ImageView zoomIv;

    private WidgetOrderGalleryPostingItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LargeButtonView largeButtonView, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull ImageView imageView2) {
        this.rootView = constraintLayout;
        this.copyIcon = appCompatImageView;
        this.descriptionContainer = constraintLayout2;
        this.descriptionTitleTv = textView;
        this.descriptionTv = textView2;
        this.downloadActionLBV = largeButtonView;
        this.hintTv = textView3;
        this.imageIv = imageView;
        this.titleTv = textView4;
        this.zoomIv = imageView2;
    }

    @NonNull
    public static WidgetOrderGalleryPostingItemBinding bind(@NonNull View view) {
        int i11 = R$id.copyIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.descriptionContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.descriptionTitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.descriptionTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.downloadActionLBV;
                        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                        if (largeButtonView != null) {
                            i11 = R$id.hintTv;
                            TextView textView3 = (TextView) C2548q.d(i11, view);
                            if (textView3 != null) {
                                i11 = R$id.imageIv;
                                ImageView imageView = (ImageView) C2548q.d(i11, view);
                                if (imageView != null) {
                                    i11 = R$id.titleTv;
                                    TextView textView4 = (TextView) C2548q.d(i11, view);
                                    if (textView4 != null) {
                                        i11 = R$id.zoomIv;
                                        ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                                        if (imageView2 != null) {
                                            return new WidgetOrderGalleryPostingItemBinding((ConstraintLayout) view, appCompatImageView, constraintLayout, textView, textView2, largeButtonView, textView3, imageView, textView4, imageView2);
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

    @NonNull
    public static WidgetOrderGalleryPostingItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_order_gallery_posting_item, viewGroup, false);
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
