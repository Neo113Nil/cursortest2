package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.view;

import BQ.a;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;", "", "elevation", "<init>", "(F)V", "Lcom/google/android/material/appbar/AppBarLayout;", "dependency", "", "distanceToChild", "(Lcom/google/android/material/appbar/AppBarLayout;)I", "child", "", "invalidateChildMaxHeight", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "layoutDirection", "", "onLayoutChild", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;I)Z", "Landroid/view/View;", "layoutDependsOn", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;Landroid/view/View;)Z", "onDependentViewChanged", "onDependentViewRemoved", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;Landroid/view/View;)V", "F", "childMaxHeight", "I", "offsetAlpha", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangeListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormBarBehavior extends CoordinatorLayout.c<SearchFormBarView> {
    private int childMaxHeight;
    private final float elevation;
    private float offsetAlpha;

    @NotNull
    private final AppBarLayout.f offsetChangeListener = new a(this, 0);

    public SearchFormBarBehavior(float f7) {
        this.elevation = f7;
    }

    private final int distanceToChild(AppBarLayout dependency) {
        return Math.max(0, dependency.getBottom() - (dependency.getHeight() - dependency.k()));
    }

    private final void invalidateChildMaxHeight(SearchFormBarView child) {
        this.childMaxHeight = Math.max(this.childMaxHeight, child.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offsetChangeListener$lambda$0(SearchFormBarBehavior searchFormBarBehavior, AppBarLayout appBarLayout, int i11) {
        searchFormBarBehavior.offsetAlpha = -(appBarLayout.getY() / appBarLayout.k());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull SearchFormBarView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency instanceof AppBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull SearchFormBarView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        invalidateChildMaxHeight(child);
        int distanceToChild = distanceToChild((AppBarLayout) dependency);
        if (distanceToChild > (this.childMaxHeight / 2) - UiExtKt.toPx(12)) {
            if (child.getHeight() > 0) {
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                ((ViewGroup.MarginLayoutParams) fVar).height = 0;
                child.setLayoutParams(fVar);
            }
            return false;
        }
        child.setVisibility(0);
        int i11 = this.childMaxHeight;
        int min = Math.min(i11, i11 - distanceToChild);
        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.f fVar2 = (CoordinatorLayout.f) layoutParams2;
        ((ViewGroup.MarginLayoutParams) fVar2).height = min;
        child.setLayoutParams(fVar2);
        int i12 = this.childMaxHeight;
        if (i12 <= 0) {
            return true;
        }
        child.setTranslationZ((min / i12) * this.elevation);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDependentViewRemoved(@NotNull CoordinatorLayout parent, @NotNull SearchFormBarView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        super.onDependentViewRemoved(parent, (CoordinatorLayout) child, dependency);
        AppBarLayout appBarLayout = dependency instanceof AppBarLayout ? (AppBarLayout) dependency : null;
        if (appBarLayout != null) {
            appBarLayout.q(this.offsetChangeListener);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull SearchFormBarView child, int layoutDirection) {
        KeyEvent.Callback callback;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Iterator<View> it = ViewGroupExtKt.children(parent).iterator();
        while (true) {
            if (!it.hasNext()) {
                callback = null;
                break;
            }
            callback = it.next();
            if (((View) callback) instanceof AppBarLayout) {
                break;
            }
        }
        AppBarLayout appBarLayout = callback instanceof AppBarLayout ? (AppBarLayout) callback : null;
        invalidateChildMaxHeight(child);
        if (appBarLayout != null) {
            child.setY(appBarLayout.getBottom());
            if (distanceToChild(appBarLayout) > this.childMaxHeight) {
                child.setVisibility(4);
            }
            appBarLayout.d(this.offsetChangeListener);
        }
        return appBarLayout == null;
    }
}
