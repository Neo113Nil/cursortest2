package ru.ozon.app.android.common.ui.productselectormobile.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.ui.productselectormobile.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetProductSelectorMobileBinding implements a {

    @NonNull
    public final SmallButtonView actionButtonView;

    @NonNull
    public final LinearLayout buttonsLl;

    @NonNull
    public final ConstraintLayout productSelectorCl;

    @NonNull
    public final FrameLayout productSelectorFl;

    @NonNull
    public final SmallButtonView resetButtonView;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ImageView selectorImageIv;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final HorizontalFlexAtomsLayout tagsFal;

    @NonNull
    public final TextView tagsTitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetProductSelectorMobileBinding(@NonNull FrameLayout frameLayout, @NonNull SmallButtonView smallButtonView, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout2, @NonNull SmallButtonView smallButtonView2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = frameLayout;
        this.actionButtonView = smallButtonView;
        this.buttonsLl = linearLayout;
        this.productSelectorCl = constraintLayout;
        this.productSelectorFl = frameLayout2;
        this.resetButtonView = smallButtonView2;
        this.selectorImageIv = imageView;
        this.subtitleTv = textView;
        this.tagsFal = horizontalFlexAtomsLayout;
        this.tagsTitleTv = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static WidgetProductSelectorMobileBinding bind(@NonNull View view) {
        int i11 = R$id.actionButtonView;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.buttonsLl;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.productSelectorCl;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = R$id.resetButtonView;
                    SmallButtonView smallButtonView2 = (SmallButtonView) C2548q.d(i11, view);
                    if (smallButtonView2 != null) {
                        i11 = R$id.selectorImageIv;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.subtitleTv;
                            TextView textView = (TextView) C2548q.d(i11, view);
                            if (textView != null) {
                                i11 = R$id.tagsFal;
                                HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                                if (horizontalFlexAtomsLayout != null) {
                                    i11 = R$id.tagsTitleTv;
                                    TextView textView2 = (TextView) C2548q.d(i11, view);
                                    if (textView2 != null) {
                                        i11 = R$id.titleTv;
                                        TextView textView3 = (TextView) C2548q.d(i11, view);
                                        if (textView3 != null) {
                                            return new WidgetProductSelectorMobileBinding(frameLayout, smallButtonView, linearLayout, constraintLayout, frameLayout, smallButtonView2, imageView, textView, horizontalFlexAtomsLayout, textView2, textView3);
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
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
