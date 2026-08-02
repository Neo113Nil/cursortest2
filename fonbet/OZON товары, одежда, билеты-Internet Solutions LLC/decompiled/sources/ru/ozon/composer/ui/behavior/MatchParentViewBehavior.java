package ru.ozon.composer.ui.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/composer/ui/behavior/MatchParentViewBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MatchParentViewBehavior<V extends View> extends CoordinatorLayout.c<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchParentViewBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(@NotNull CoordinatorLayout parent, @NotNull V child, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (parent.getMeasuredHeight() <= 0) {
            return super.onMeasureChild(parent, child, i11, i12, i13, i14);
        }
        child.measure(i11, View.MeasureSpec.makeMeasureSpec(Math.max(parent.getHeight(), child.getMinimumHeight()), 1073741824));
        return true;
    }
}
