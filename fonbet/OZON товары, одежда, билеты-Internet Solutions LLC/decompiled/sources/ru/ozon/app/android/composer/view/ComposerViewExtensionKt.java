package ru.ozon.app.android.composer.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import v10.C10183a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\n\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\b*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\n\u001a\u0011\u0010\u001c\u001a\u00020\u0015*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u0017\u001a\u0013\u0010\u001d\u001a\u00020\u0015*\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\u0004\u0018\u00010$*\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroid/view/View;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "composerSwipeRefresh", "(Landroid/view/View;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerViewOrNull", "Landroid/view/ViewGroup;", "composerProgressBar", "(Landroid/view/View;)Landroid/view/ViewGroup;", "Lcom/google/android/material/appbar/AppBarLayout;", "composerAppbar", "(Landroid/view/View;)Lcom/google/android/material/appbar/AppBarLayout;", "Landroidx/appcompat/widget/Toolbar;", "composerToolbar", "(Landroid/view/View;)Landroidx/appcompat/widget/Toolbar;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "composerCoordinatorLayout", "(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "composerContainer", "Landroid/widget/LinearLayout;", "composerTopContainer", "(Landroid/view/View;)Landroid/widget/LinearLayout;", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "composerScreenStateView", "(Landroid/view/View;)Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "composerStickyContainer", "composerBottomContainer", "internalComposerBottomContainer", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "composerCollapsingToolbar", "(Landroid/view/View;)Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "composerExpandedContainer", "(Landroid/view/View;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/composer/ui/behavior/ComposerListBehavior;", "composerListBehavior", "(Landroid/view/View;)Lru/ozon/composer/ui/behavior/ComposerListBehavior;", "", "aboveBottomWidgets", "composerNotificationBottomAnchor", "(Landroid/view/View;Z)Landroid/view/View;", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerViewExtensionKt {
    public static final AppBarLayout composerAppbar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.a(view);
    }

    @NotNull
    public static final LinearLayout composerBottomContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.c(view);
    }

    public static final CollapsingToolbarLayout composerCollapsingToolbar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.d(view);
    }

    @NotNull
    public static final ViewGroup composerContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.e(view);
    }

    public static final CoordinatorLayout composerCoordinatorLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.f(view);
    }

    public static final ConstraintLayout composerExpandedContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.expandedContainer);
        if (findViewById instanceof ConstraintLayout) {
            return (ConstraintLayout) findViewById;
        }
        return null;
    }

    public static final ComposerListBehavior composerListBehavior(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.g(view);
    }

    public static final View composerNotificationBottomAnchor(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return null;
    }

    public static final ViewGroup composerProgressBar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.h(view);
    }

    @NotNull
    public static final RecyclerView composerRecyclerView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.i(view);
    }

    public static final RecyclerView composerRecyclerViewOrNull(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.j(view);
    }

    public static final PageIssueStateView composerScreenStateView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.k(view);
    }

    public static final ViewGroup composerStickyContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.l(view);
    }

    public static final SwipeRefreshLayout composerSwipeRefresh(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.m(view);
    }

    public static final Toolbar composerToolbar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.n(view);
    }

    @NotNull
    public static final LinearLayout composerTopContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.o(view);
    }

    @NotNull
    public static final LinearLayout internalComposerBottomContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C10183a.c(view);
    }
}
