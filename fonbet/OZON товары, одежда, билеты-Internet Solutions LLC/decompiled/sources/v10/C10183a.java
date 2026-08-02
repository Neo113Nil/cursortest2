package v10;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;

/* renamed from: v10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10183a {
    public static final AppBarLayout a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.appBarAbl);
        if (findViewById instanceof AppBarLayout) {
            return (AppBarLayout) findViewById;
        }
        return null;
    }

    public static final View b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.findViewById(R.id.bottomBorder);
    }

    @NotNull
    public static final LinearLayout c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.bottomContainer);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }

    public static final CollapsingToolbarLayout d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.collapsingTl);
        if (findViewById instanceof CollapsingToolbarLayout) {
            return (CollapsingToolbarLayout) findViewById;
        }
        return null;
    }

    @NotNull
    public static final ViewGroup e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.composerRootCl);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) findViewById;
    }

    public static final CoordinatorLayout f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.composerRootCl);
        if (findViewById instanceof CoordinatorLayout) {
            return (CoordinatorLayout) findViewById;
        }
        return null;
    }

    public static final ComposerListBehavior g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View m11 = m(view);
        if (m11 == null) {
            m11 = j(view);
        }
        ViewGroup.LayoutParams layoutParams = m11 != null ? m11.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c c11 = fVar != null ? fVar.c() : null;
        if (c11 instanceof ComposerListBehavior) {
            return (ComposerListBehavior) c11;
        }
        return null;
    }

    public static final ViewGroup h(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.progressBar);
        if (findViewById instanceof ViewGroup) {
            return (ViewGroup) findViewById;
        }
        return null;
    }

    @NotNull
    public static final RecyclerView i(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.listRv);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        return (RecyclerView) findViewById;
    }

    public static final RecyclerView j(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.listRv);
        if (findViewById instanceof RecyclerView) {
            return (RecyclerView) findViewById;
        }
        return null;
    }

    public static final PageIssueStateView k(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.screenStateView);
        if (findViewById instanceof PageIssueStateView) {
            return (PageIssueStateView) findViewById;
        }
        return null;
    }

    public static final ViewGroup l(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.stickyPlaceholder);
        if (findViewById instanceof ViewGroup) {
            return (ViewGroup) findViewById;
        }
        return null;
    }

    public static final SwipeRefreshLayout m(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.swipeRefreshLayout);
        if (findViewById instanceof SwipeRefreshLayout) {
            return (SwipeRefreshLayout) findViewById;
        }
        return null;
    }

    public static final Toolbar n(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.toolbarTb);
        if (findViewById instanceof Toolbar) {
            return (Toolbar) findViewById;
        }
        return null;
    }

    @NotNull
    public static final LinearLayout o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findViewById = view.findViewById(R.id.topContainer);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }
}
