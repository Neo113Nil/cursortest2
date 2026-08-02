package ru.ozon.composer.ui.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o10.C8631b;
import org.jetbrains.annotations.NotNull;
import p10.InterfaceC8831a;
import ru.ozon.app.android.R;
import v10.C10183a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/composer/ui/behavior/StickyViewBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Lp10/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickyViewBehavior<V extends View> extends CoordinatorLayout.c<V> implements InterfaceC8831a {

    /* renamed from: a, reason: collision with root package name */
    private float f94822a;

    /* renamed from: b, reason: collision with root package name */
    private int f94823b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f94824c;

    /* renamed from: d, reason: collision with root package name */
    private View f94825d;

    /* renamed from: e, reason: collision with root package name */
    private C8631b f94826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyViewBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f94824c = true;
    }

    @Override // p10.InterfaceC8831a
    public final void a(@NotNull C8631b appBarSizeProvider) {
        Intrinsics.checkNotNullParameter(appBarSizeProvider, "appBarSizeProvider");
        this.f94826e = appBarSizeProvider;
        View view = this.f94825d;
        if (view != null) {
            view.setY(this.f94822a + appBarSizeProvider.a() + this.f94823b);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency.getId() == R.id.appBarAbl || dependency.getId() == R.id.topContainer;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        int id2 = dependency.getId();
        if (id2 == R.id.appBarAbl) {
            this.f94822a = dependency.getY();
            dependency.getMeasuredHeight();
            View view = this.f94825d;
            if (view != null) {
                view.setY(this.f94822a + (this.f94826e != null ? r5.a() : 0) + this.f94823b);
                return true;
            }
        } else {
            if (id2 != R.id.topContainer) {
                return false;
            }
            this.f94823b = dependency.getMeasuredHeight();
            View view2 = this.f94825d;
            if (view2 != null) {
                view2.setY(this.f94822a + (this.f94826e != null ? r5.a() : 0) + this.f94823b);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull V child, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f94824c) {
            this.f94824c = false;
            this.f94825d = child;
            AppBarLayout a11 = C10183a.a(parent);
            this.f94822a = a11 != null ? a11.getY() : 0.0f;
            this.f94823b = C10183a.o(parent).getMeasuredHeight();
            View view = this.f94825d;
            if (view != null) {
                view.setTop((int) (this.f94822a + (this.f94826e != null ? r2.a() : 0) + this.f94823b));
            }
        }
        return super.onLayoutChild(parent, child, i11);
    }
}
