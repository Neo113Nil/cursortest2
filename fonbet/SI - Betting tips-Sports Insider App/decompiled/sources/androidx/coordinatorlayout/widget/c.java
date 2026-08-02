package androidx.coordinatorlayout.widget;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.k2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {
    public static Object getTag(@NonNull View view) {
        return ((f) view.getLayoutParams()).f1244r;
    }

    public static void setTag(@NonNull View view, Object obj) {
        ((f) view.getLayoutParams()).f1244r = obj;
    }

    public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        return getScrimOpacity(coordinatorLayout, view) > 0.0f;
    }

    public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
        return false;
    }

    public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        return -16777216;
    }

    public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        return false;
    }

    public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        return false;
    }

    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
        return false;
    }

    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5, int i10, int i11, int i12) {
        return false;
    }

    public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, float f6, float f10, boolean z5) {
        return false;
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, float f6, float f10) {
        return false;
    }

    @Deprecated
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i5, int i10, @NonNull int[] iArr) {
    }

    @Deprecated
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i5, int i10, int i11, int i12) {
    }

    @Deprecated
    public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i5) {
    }

    public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z5) {
        return false;
    }

    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    @Deprecated
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i5) {
        return false;
    }

    @Deprecated
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
    }

    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return false;
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i5, int i10, @NonNull int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(coordinatorLayout, view, view2, i5, i10, iArr);
        }
    }

    @Deprecated
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i5, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(coordinatorLayout, view, view2, i5, i10, i11, i12);
        }
    }

    public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i5, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i5);
        }
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i5, int i10) {
        if (i10 == 0) {
            return onStartNestedScroll(coordinatorLayout, view, view2, view3, i5);
        }
        return false;
    }

    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i5) {
        if (i5 == 0) {
            onStopNestedScroll(coordinatorLayout, view, view2);
        }
    }

    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i5, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        onNestedScroll(coordinatorLayout, view, view2, i5, i10, i11, i12, i13);
    }

    public void onDetachedFromLayoutParams() {
    }

    public void onAttachedToLayoutParams(@NonNull f fVar) {
    }

    @NonNull
    public k2 onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull k2 k2Var) {
        return k2Var;
    }

    public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
    }

    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Parcelable parcelable) {
    }
}
