package ru.ozon.app.android.tabbar.ui.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u001aJ\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/tabbar/ui/behavior/FragmentContainerBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroidx/fragment/app/FragmentContainerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "fragmentContainer", "Landroid/view/View;", "tabsView", "", "updateBottomOffset", "(Landroidx/fragment/app/FragmentContainerView;Landroid/view/View;)Z", "", "updateViewOnMeasure", "(Landroid/view/View;Landroid/view/View;)V", "dependency", "", "getChildBottomOffset", "(Landroid/view/View;)I", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "layoutDependsOn", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/fragment/app/FragmentContainerView;Landroid/view/View;)Z", "parentWidthMeasureSpec", "widthUsed", "parentHeightMeasureSpec", "heightUsed", "onMeasureChild", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/fragment/app/FragmentContainerView;IIII)Z", "layoutDirection", "onLayoutChild", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/fragment/app/FragmentContainerView;I)Z", "onDependentViewChanged", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "handler", "setExternalOffsetHandler", "(Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;)V", "isFirstMeasure", "Z", "externalOffsetHandler", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "Lru/ozon/app/android/tabbar/ui/behavior/TabNavigationLayoutStrategy;", "layoutStrategy", "Lru/ozon/app/android/tabbar/ui/behavior/TabNavigationLayoutStrategy;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FragmentContainerBehavior extends CoordinatorLayout.c<FragmentContainerView> {
    private ExternalOffsetHandler externalOffsetHandler;
    private boolean isFirstMeasure;

    @NotNull
    private TabNavigationLayoutStrategy layoutStrategy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isFirstMeasure = true;
        this.layoutStrategy = new TabNavigationInternalLayoutStrategy();
    }

    private final int getChildBottomOffset(View dependency) {
        if (dependency == null || dependency.getVisibility() != 0) {
            return 0;
        }
        OzonBottomNavigationView ozonBottomNavigationView = dependency instanceof OzonBottomNavigationView ? (OzonBottomNavigationView) dependency : null;
        return ozonBottomNavigationView != null ? ozonBottomNavigationView.getFakeTabBarHeight() : dependency.getMeasuredHeight() - ((int) Math.ceil(dependency.getTranslationY()));
    }

    private final boolean updateBottomOffset(FragmentContainerView fragmentContainer, View tabsView) {
        return this.layoutStrategy.updateBottomOffset(fragmentContainer, getChildBottomOffset(tabsView));
    }

    private final void updateViewOnMeasure(View fragmentContainer, View tabsView) {
        this.layoutStrategy.updateBottomOffset(fragmentContainer, getChildBottomOffset(tabsView));
    }

    public final void setExternalOffsetHandler(@NotNull ExternalOffsetHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.externalOffsetHandler = handler;
        this.layoutStrategy = new TabNavigationExternalLayoutStrategy(handler);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull FragmentContainerView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency instanceof OzonBottomNavigationView;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull FragmentContainerView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return updateBottomOffset(child, dependency);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull FragmentContainerView child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        List<View> dependencies = parent.getDependencies(child);
        Intrinsics.checkNotNullExpressionValue(dependencies, "getDependencies(...)");
        View view = (View) C7714v.M(dependencies);
        if (view == null) {
            return false;
        }
        updateBottomOffset(child, view);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@NotNull CoordinatorLayout parent, @NotNull FragmentContainerView child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.isFirstMeasure) {
            this.isFirstMeasure = false;
            View findViewById = parent.findViewById(R$id.bottomNavigation);
            Intrinsics.f(findViewById);
            updateViewOnMeasure(child, findViewById);
        }
        return super.onMeasureChild(parent, (CoordinatorLayout) child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }
}
