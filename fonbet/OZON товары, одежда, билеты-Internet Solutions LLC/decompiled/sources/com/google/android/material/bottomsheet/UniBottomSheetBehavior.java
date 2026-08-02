package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/material/bottomsheet/UniBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class UniBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f58049a;

    /* renamed from: b, reason: collision with root package name */
    private int f58050b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniBottomSheetBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private static boolean b(View view) {
        Iterable<View> children;
        if (view.canScrollVertically(-1)) {
            return true;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupExtKt.children(viewGroup)) == null) {
            return false;
        }
        if ((children instanceof Collection) && ((Collection) children).isEmpty()) {
            return false;
        }
        Iterator<View> it = children.iterator();
        while (it.hasNext()) {
            if (b(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(CoordinatorLayout coordinatorLayout, View view, int i11, int i12) {
        C5314e0 c5314e0;
        if (!coordinatorLayout.isPointInChildBounds(view, i11, i12)) {
            return false;
        }
        if (view.getVisibility() == 0 && view.isClickable()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        Iterator<View> it = C5316f0.b((ViewGroup) view).iterator();
        do {
            c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return false;
            }
        } while (!c(coordinatorLayout, (View) c5314e0.next(), i11, i12));
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull MotionEvent event) {
        boolean z11;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z12 = this.touchingScrollingChild;
        int i11 = this.activePointerId;
        super.onInterceptTouchEvent(parent, child, event);
        this.touchingScrollingChild = z12;
        this.activePointerId = i11;
        boolean z13 = false;
        if (!child.isShown() || !isDraggable()) {
            this.f58049a = true;
            return false;
        }
        P2.b bVar = this.viewDragHelper;
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.touchingScrollingChild = false;
                this.activePointerId = -1;
                if (this.f58049a) {
                    this.f58049a = false;
                    return false;
                }
            }
            z11 = false;
        } else {
            int x11 = (int) event.getX();
            this.f58050b = (int) event.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && parent.isPointInChildBounds(view, x11, this.f58050b) && b(view)) {
                    int i12 = this.f58050b;
                    ViewParent parent2 = view.getParent();
                    ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    View view2 = view;
                    ViewGroup viewGroup2 = viewGroup;
                    loop0: while (viewGroup2 != null && viewGroup2 != parent) {
                        ViewParent parent3 = view2.getParent();
                        z11 = z13;
                        ViewGroup viewGroup3 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                        if (viewGroup3 != null) {
                            int childCount = viewGroup3.getChildCount();
                            for (int indexOfChild = viewGroup3.indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                                if (c(parent, C5316f0.a(viewGroup3, indexOfChild), x11, i12)) {
                                    break loop0;
                                }
                            }
                        }
                        ViewParent parent4 = viewGroup2.getParent();
                        view2 = viewGroup2;
                        viewGroup2 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
                        z13 = z11;
                    }
                    z11 = z13;
                    this.activePointerId = event.getPointerId(event.getActionIndex());
                    this.touchingScrollingChild = true;
                    this.f58049a = (this.activePointerId == -1 || parent.isPointInChildBounds(child, x11, this.f58050b)) ? z11 : true;
                }
            }
            z11 = false;
            this.f58049a = (this.activePointerId == -1 || parent.isPointInChildBounds(child, x11, this.f58050b)) ? z11 : true;
        }
        if (this.f58049a || bVar == null || !bVar.s(event)) {
            WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
            View view3 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f58049a || this.state == 1 || parent.isPointInChildBounds(view3, (int) event.getX(), (int) event.getY()) || bVar == null || Math.abs(this.f58050b - event.getY()) <= bVar.k()) {
                return z11;
            }
        }
        return true;
    }
}
