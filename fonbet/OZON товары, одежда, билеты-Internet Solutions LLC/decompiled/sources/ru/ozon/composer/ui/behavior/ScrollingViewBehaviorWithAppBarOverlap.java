package ru.ozon.composer.ui.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o10.C8631b;
import org.jetbrains.annotations.NotNull;
import p10.InterfaceC8831a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/composer/ui/behavior/ScrollingViewBehaviorWithAppBarOverlap;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Lp10/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ScrollingViewBehaviorWithAppBarOverlap extends AppBarLayout.ScrollingViewBehavior implements InterfaceC8831a {

    /* renamed from: g, reason: collision with root package name */
    private boolean f94819g;

    /* renamed from: h, reason: collision with root package name */
    private View f94820h;

    /* renamed from: i, reason: collision with root package name */
    private C8631b f94821i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingViewBehaviorWithAppBarOverlap(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f94819g = true;
    }

    private final void m(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i11 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        C8631b c8631b = this.f94821i;
        boolean z11 = i11 != (c8631b != null ? c8631b.b() : 0) * (-1);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        if (!z11 || marginLayoutParams2 == null) {
            return;
        }
        C8631b c8631b2 = this.f94821i;
        marginLayoutParams2.topMargin = (c8631b2 != null ? c8631b2.b() : 0) * (-1);
        view.setLayoutParams(marginLayoutParams2);
    }

    @Override // p10.InterfaceC8831a
    public final void a(@NotNull C8631b appBarSizeProvider) {
        Intrinsics.checkNotNullParameter(appBarSizeProvider, "appBarSizeProvider");
        this.f94821i = appBarSizeProvider;
        View view = this.f94820h;
        if (view != null) {
            m(view);
        }
    }

    @Override // com.google.android.material.appbar.j, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull View child, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        super.onLayoutChild(parent, child, i11);
        if (this.f94819g) {
            this.f94819g = false;
            this.f94820h = child;
        }
        m(child);
        return true;
    }
}
