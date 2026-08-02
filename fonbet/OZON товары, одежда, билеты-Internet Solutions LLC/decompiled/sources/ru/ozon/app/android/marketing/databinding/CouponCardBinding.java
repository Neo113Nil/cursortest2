package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.common.coupon.AdultProductPreview;

/* loaded from: classes12.dex */
public final class CouponCardBinding implements a {

    @NonNull
    public final TextView actionBtn;

    @NonNull
    public final TextView conditionsTv;

    @NonNull
    public final ImageView couponAppliedIv;

    @NonNull
    public final ImageView couponImageIv;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final ImageView pointsIv;

    @NonNull
    public final AdultProductPreview previewFirst;

    @NonNull
    public final AdultProductPreview previewSecond;

    @NonNull
    public final AdultProductPreview previewThird;

    @NonNull
    public final Barrier productsBarrier;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView titleTv;

    private CouponCardBinding(@NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull AdultProductPreview adultProductPreview, @NonNull AdultProductPreview adultProductPreview2, @NonNull AdultProductPreview adultProductPreview3, @NonNull Barrier barrier, @NonNull TextView textView4) {
        this.rootView = view;
        this.actionBtn = textView;
        this.conditionsTv = textView2;
        this.couponAppliedIv = imageView;
        this.couponImageIv = imageView2;
        this.descriptionTv = textView3;
        this.pointsIv = imageView3;
        this.previewFirst = adultProductPreview;
        this.previewSecond = adultProductPreview2;
        this.previewThird = adultProductPreview3;
        this.productsBarrier = barrier;
        this.titleTv = textView4;
    }

    @NonNull
    public static CouponCardBinding bind(@NonNull View view) {
        int i11 = R$id.actionBtn;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.conditionsTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                i11 = R$id.couponAppliedIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.couponImageIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        i11 = R$id.descriptionTv;
                        TextView textView3 = (TextView) C2548q.d(i11, view);
                        if (textView3 != null) {
                            i11 = R$id.pointsIv;
                            ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                            if (imageView3 != null) {
                                i11 = R$id.previewFirst;
                                AdultProductPreview adultProductPreview = (AdultProductPreview) C2548q.d(i11, view);
                                if (adultProductPreview != null) {
                                    i11 = R$id.previewSecond;
                                    AdultProductPreview adultProductPreview2 = (AdultProductPreview) C2548q.d(i11, view);
                                    if (adultProductPreview2 != null) {
                                        i11 = R$id.previewThird;
                                        AdultProductPreview adultProductPreview3 = (AdultProductPreview) C2548q.d(i11, view);
                                        if (adultProductPreview3 != null) {
                                            i11 = R$id.productsBarrier;
                                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                                            if (barrier != null) {
                                                i11 = R$id.titleTv;
                                                TextView textView4 = (TextView) C2548q.d(i11, view);
                                                if (textView4 != null) {
                                                    return new CouponCardBinding(view, textView, textView2, imageView, imageView2, textView3, imageView3, adultProductPreview, adultProductPreview2, adultProductPreview3, barrier, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
