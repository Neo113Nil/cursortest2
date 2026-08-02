package ru.ozon.app.android.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.filterWidgets.curtain.CurtainNavBarLabelTextView;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;

/* loaded from: classes11.dex */
public final class WidgetCurtainNavBarBinding implements a {

    @NonNull
    public final ImageView actionDrawableIv;

    @NonNull
    public final ImageView actionLeftIv;

    @NonNull
    public final TextView actionLeftTv;

    @NonNull
    public final ImageView actionRightIv;

    @NonNull
    public final TextView actionRightTv;

    @NonNull
    public final SmallBorderlessButtonWithIconView buttonLeftIv;

    @NonNull
    public final SmallBorderlessButtonWithIconView buttonRightIv;

    @NonNull
    public final ConstraintLayout curtainNavBarContainer;

    @NonNull
    public final Barrier endBarrier;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Barrier startBarrier;

    @NonNull
    public final CurtainNavBarLabelTextView subTitleTv;

    @NonNull
    public final CurtainNavBarLabelTextView titleTv;

    private WidgetCurtainNavBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView, @NonNull SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView2, @NonNull ConstraintLayout constraintLayout2, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull CurtainNavBarLabelTextView curtainNavBarLabelTextView, @NonNull CurtainNavBarLabelTextView curtainNavBarLabelTextView2) {
        this.rootView = constraintLayout;
        this.actionDrawableIv = imageView;
        this.actionLeftIv = imageView2;
        this.actionLeftTv = textView;
        this.actionRightIv = imageView3;
        this.actionRightTv = textView2;
        this.buttonLeftIv = smallBorderlessButtonWithIconView;
        this.buttonRightIv = smallBorderlessButtonWithIconView2;
        this.curtainNavBarContainer = constraintLayout2;
        this.endBarrier = barrier;
        this.startBarrier = barrier2;
        this.subTitleTv = curtainNavBarLabelTextView;
        this.titleTv = curtainNavBarLabelTextView2;
    }

    @NonNull
    public static WidgetCurtainNavBarBinding bind(@NonNull View view) {
        int i11 = R$id.actionDrawableIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.actionLeftIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.actionLeftTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.actionRightIv;
                    ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                    if (imageView3 != null) {
                        i11 = R$id.actionRightTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.buttonLeftIv;
                            SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView = (SmallBorderlessButtonWithIconView) C2548q.d(i11, view);
                            if (smallBorderlessButtonWithIconView != null) {
                                i11 = R$id.buttonRightIv;
                                SmallBorderlessButtonWithIconView smallBorderlessButtonWithIconView2 = (SmallBorderlessButtonWithIconView) C2548q.d(i11, view);
                                if (smallBorderlessButtonWithIconView2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i11 = R$id.endBarrier;
                                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                                    if (barrier != null) {
                                        i11 = R$id.startBarrier;
                                        Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                        if (barrier2 != null) {
                                            i11 = R$id.subTitleTv;
                                            CurtainNavBarLabelTextView curtainNavBarLabelTextView = (CurtainNavBarLabelTextView) C2548q.d(i11, view);
                                            if (curtainNavBarLabelTextView != null) {
                                                i11 = R$id.titleTv;
                                                CurtainNavBarLabelTextView curtainNavBarLabelTextView2 = (CurtainNavBarLabelTextView) C2548q.d(i11, view);
                                                if (curtainNavBarLabelTextView2 != null) {
                                                    return new WidgetCurtainNavBarBinding(constraintLayout, imageView, imageView2, textView, imageView3, textView2, smallBorderlessButtonWithIconView, smallBorderlessButtonWithIconView2, constraintLayout, barrier, barrier2, curtainNavBarLabelTextView, curtainNavBarLabelTextView2);
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
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
