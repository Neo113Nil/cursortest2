package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes13.dex */
public final class NoUiWidgetSelectorConcreteStepDataBinding implements a {

    @NonNull
    public final Guideline appbarGuideline;

    @NonNull
    public final ImageView backButton;

    @NonNull
    public final LargeBorderlessButtonView closeAllStepButton;

    @NonNull
    public final LargeButtonView concreteStepActionButton;

    @NonNull
    public final FrameLayout concreteStepActionButtonContainer;

    @NonNull
    public final ConstraintLayout concreteStepWidget;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView stepItems;

    @NonNull
    public final MaterialProgressBar stepProgressBar;

    @NonNull
    public final FrameLayout stepProgressContaienr;

    @NonNull
    public final SearchView stepSearch;

    @NonNull
    public final TextView stepSubtitle;

    @NonNull
    public final TextView stepTitle;

    private NoUiWidgetSelectorConcreteStepDataBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull LargeButtonView largeButtonView, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull MaterialProgressBar materialProgressBar, @NonNull FrameLayout frameLayout2, @NonNull SearchView searchView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.appbarGuideline = guideline;
        this.backButton = imageView;
        this.closeAllStepButton = largeBorderlessButtonView;
        this.concreteStepActionButton = largeButtonView;
        this.concreteStepActionButtonContainer = frameLayout;
        this.concreteStepWidget = constraintLayout2;
        this.stepItems = recyclerView;
        this.stepProgressBar = materialProgressBar;
        this.stepProgressContaienr = frameLayout2;
        this.stepSearch = searchView;
        this.stepSubtitle = textView;
        this.stepTitle = textView2;
    }

    @NonNull
    public static NoUiWidgetSelectorConcreteStepDataBinding bind(@NonNull View view) {
        int i11 = R$id.appbarGuideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null) {
            i11 = R$id.backButton;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.closeAllStepButton;
                LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
                if (largeBorderlessButtonView != null) {
                    i11 = R$id.concreteStepActionButton;
                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                    if (largeButtonView != null) {
                        i11 = R$id.concreteStepActionButtonContainer;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.stepItems;
                            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                            if (recyclerView != null) {
                                i11 = R$id.stepProgressBar;
                                MaterialProgressBar materialProgressBar = (MaterialProgressBar) C2548q.d(i11, view);
                                if (materialProgressBar != null) {
                                    i11 = R$id.stepProgressContaienr;
                                    FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                                    if (frameLayout2 != null) {
                                        i11 = R$id.stepSearch;
                                        SearchView searchView = (SearchView) C2548q.d(i11, view);
                                        if (searchView != null) {
                                            i11 = R$id.stepSubtitle;
                                            TextView textView = (TextView) C2548q.d(i11, view);
                                            if (textView != null) {
                                                i11 = R$id.stepTitle;
                                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                                if (textView2 != null) {
                                                    return new NoUiWidgetSelectorConcreteStepDataBinding(constraintLayout, guideline, imageView, largeBorderlessButtonView, largeButtonView, frameLayout, constraintLayout, recyclerView, materialProgressBar, frameLayout2, searchView, textView, textView2);
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
