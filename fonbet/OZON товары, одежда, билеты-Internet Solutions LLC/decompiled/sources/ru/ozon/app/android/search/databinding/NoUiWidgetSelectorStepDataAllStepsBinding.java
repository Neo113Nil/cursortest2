package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes13.dex */
public final class NoUiWidgetSelectorStepDataAllStepsBinding implements a {

    @NonNull
    public final RecyclerView allStepCells;

    @NonNull
    public final LargeButtonView allStepsActionButton;

    @NonNull
    public final FrameLayout allStepsActionButtonContainer;

    @NonNull
    public final ConstraintLayout allStepsContainer;

    @NonNull
    public final Guideline appbarGuideline;

    @NonNull
    public final LargeBorderlessButtonView clearAllStepButton;

    @NonNull
    public final LargeBorderlessButtonView closeAllStepButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final MaterialProgressBar stepProgressBar;

    @NonNull
    public final FrameLayout stepProgressContaienr;

    @NonNull
    public final TextView title;

    private NoUiWidgetSelectorStepDataAllStepsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull LargeButtonView largeButtonView, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull LargeBorderlessButtonView largeBorderlessButtonView2, @NonNull MaterialProgressBar materialProgressBar, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.allStepCells = recyclerView;
        this.allStepsActionButton = largeButtonView;
        this.allStepsActionButtonContainer = frameLayout;
        this.allStepsContainer = constraintLayout2;
        this.appbarGuideline = guideline;
        this.clearAllStepButton = largeBorderlessButtonView;
        this.closeAllStepButton = largeBorderlessButtonView2;
        this.stepProgressBar = materialProgressBar;
        this.stepProgressContaienr = frameLayout2;
        this.title = textView;
    }

    @NonNull
    public static NoUiWidgetSelectorStepDataAllStepsBinding bind(@NonNull View view) {
        int i11 = R$id.allStepCells;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.allStepsActionButton;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                i11 = R$id.allStepsActionButtonContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.appbarGuideline;
                    Guideline guideline = (Guideline) C2548q.d(i11, view);
                    if (guideline != null) {
                        i11 = R$id.clearAllStepButton;
                        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
                        if (largeBorderlessButtonView != null) {
                            i11 = R$id.closeAllStepButton;
                            LargeBorderlessButtonView largeBorderlessButtonView2 = (LargeBorderlessButtonView) C2548q.d(i11, view);
                            if (largeBorderlessButtonView2 != null) {
                                i11 = R$id.stepProgressBar;
                                MaterialProgressBar materialProgressBar = (MaterialProgressBar) C2548q.d(i11, view);
                                if (materialProgressBar != null) {
                                    i11 = R$id.stepProgressContaienr;
                                    FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                                    if (frameLayout2 != null) {
                                        i11 = R$id.title;
                                        TextView textView = (TextView) C2548q.d(i11, view);
                                        if (textView != null) {
                                            return new NoUiWidgetSelectorStepDataAllStepsBinding(constraintLayout, recyclerView, largeButtonView, frameLayout, constraintLayout, guideline, largeBorderlessButtonView, largeBorderlessButtonView2, materialProgressBar, frameLayout2, textView);
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
