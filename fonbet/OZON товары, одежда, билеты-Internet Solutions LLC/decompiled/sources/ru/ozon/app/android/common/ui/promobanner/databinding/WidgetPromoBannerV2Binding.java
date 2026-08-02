package ru.ozon.app.android.common.ui.promobanner.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.common.ui.promobanner.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetPromoBannerV2Binding implements a {

    @NonNull
    public final View anchor;

    @NonNull
    public final ImageView backgroundIv;

    @NonNull
    public final ConstraintLayout bannerCL;

    @NonNull
    public final FrameLayout bannerWrapper;

    @NonNull
    public final SingleAtom bottomActionSA;

    @NonNull
    public final Guideline bottomGuideline;

    @NonNull
    public final SingleAtom descriptionSAL;

    @NonNull
    public final Barrier rightBarrier;

    @NonNull
    public final ImageView rightIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final Barrier titleBarrier;

    @NonNull
    public final SingleAtom titleSA;

    @NonNull
    public final SingleAtom topRightActionSA;

    @NonNull
    public final Guideline verticalGuideline;

    private WidgetPromoBannerV2Binding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout2, @NonNull SingleAtom singleAtom, @NonNull Guideline guideline, @NonNull SingleAtom singleAtom2, @NonNull Barrier barrier, @NonNull ImageView imageView2, @NonNull Barrier barrier2, @NonNull SingleAtom singleAtom3, @NonNull SingleAtom singleAtom4, @NonNull Guideline guideline2) {
        this.rootView = frameLayout;
        this.anchor = view;
        this.backgroundIv = imageView;
        this.bannerCL = constraintLayout;
        this.bannerWrapper = frameLayout2;
        this.bottomActionSA = singleAtom;
        this.bottomGuideline = guideline;
        this.descriptionSAL = singleAtom2;
        this.rightBarrier = barrier;
        this.rightIv = imageView2;
        this.titleBarrier = barrier2;
        this.titleSA = singleAtom3;
        this.topRightActionSA = singleAtom4;
        this.verticalGuideline = guideline2;
    }

    @NonNull
    public static WidgetPromoBannerV2Binding bind(@NonNull View view) {
        int i11 = R$id.anchor;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.backgroundIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.bannerCL;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = R$id.bottomActionSA;
                    SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                    if (singleAtom != null) {
                        i11 = R$id.bottomGuideline;
                        Guideline guideline = (Guideline) C2548q.d(i11, view);
                        if (guideline != null) {
                            i11 = R$id.descriptionSAL;
                            SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                            if (singleAtom2 != null) {
                                i11 = R$id.rightBarrier;
                                Barrier barrier = (Barrier) C2548q.d(i11, view);
                                if (barrier != null) {
                                    i11 = R$id.rightIv;
                                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                                    if (imageView2 != null) {
                                        i11 = R$id.titleBarrier;
                                        Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                        if (barrier2 != null) {
                                            i11 = R$id.titleSA;
                                            SingleAtom singleAtom3 = (SingleAtom) C2548q.d(i11, view);
                                            if (singleAtom3 != null) {
                                                i11 = R$id.topRightActionSA;
                                                SingleAtom singleAtom4 = (SingleAtom) C2548q.d(i11, view);
                                                if (singleAtom4 != null) {
                                                    i11 = R$id.verticalGuideline;
                                                    Guideline guideline2 = (Guideline) C2548q.d(i11, view);
                                                    if (guideline2 != null) {
                                                        return new WidgetPromoBannerV2Binding(frameLayout, d11, imageView, constraintLayout, frameLayout, singleAtom, guideline, singleAtom2, barrier, imageView2, barrier2, singleAtom3, singleAtom4, guideline2);
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
