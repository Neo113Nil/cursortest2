package com.sofascore.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;
import defpackage.hug;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/sofascore/common/widget/ScrollInterceptorHorizontalScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/view/View$OnScrollChangeListener;", "l", "", "setOnScrollChangeListener", "(Landroid/view/View$OnScrollChangeListener;)V", "", "getCanDragToEnd", "()Z", "canDragToEnd", "getCanDragToStart", "canDragToStart", "", "getMaxScrollDistance", "()I", "maxScrollDistance", "hug", "common_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollInterceptorHorizontalScrollView extends HorizontalScrollView {
    public Point2D a;
    public final int b;
    public boolean c;
    public boolean d;
    public View.OnScrollChangeListener e;
    public final hug f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollInterceptorHorizontalScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = new Point2D(0, 0);
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = getCanDragToEnd();
        this.d = getCanDragToStart();
        this.f = new hug(this);
        setOverScrollMode(2);
    }

    private final boolean getCanDragToEnd() {
        return getScrollX() > 0;
    }

    private final boolean getCanDragToStart() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        int width = childAt.getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight());
        if (width <= 0) {
            width = 0;
        }
        return getScrollX() < width;
    }

    public final int getMaxScrollDistance() {
        int width;
        if (getChildCount() == 0 || (width = getChildAt(0).getWidth() - getWidth()) < 0) {
            return 0;
        }
        return width;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.c = getCanDragToEnd();
            this.d = getCanDragToStart();
            this.a = new Point2D(motionEvent.getX(), motionEvent.getY());
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            boolean z = true;
            if (action != 1) {
                if (action == 2) {
                    float abs = Math.abs(motionEvent.getX() - this.a.getX());
                    float abs2 = Math.abs(motionEvent.getY() - this.a.getY());
                    int i = this.b;
                    if (abs > abs2 && abs > i) {
                        float x = motionEvent.getX() - this.a.getX();
                        boolean z2 = this.c && x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        boolean z3 = this.d && x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        ViewParent parent = getParent();
                        if (!z2 && !z3) {
                            z = false;
                        }
                        parent.requestDisallowInterceptTouchEvent(z);
                    } else if (abs2 > abs && abs2 > i) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnScrollChangeListener(@Nullable View.OnScrollChangeListener l) {
        this.e = l;
        super.setOnScrollChangeListener(l);
    }
}
