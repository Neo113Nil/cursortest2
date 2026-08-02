package ru.ozon.android.notificationbar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/notificationbar/view/NotificationBarContainerView;", "Landroid/widget/FrameLayout;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationBarContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private float f92027a;

    /* renamed from: b, reason: collision with root package name */
    private float f92028b;

    /* renamed from: c, reason: collision with root package name */
    private VelocityTracker f92029c;

    /* renamed from: d, reason: collision with root package name */
    private final int f92030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationBarContainerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledMinimumFlingVelocity();
        this.f92030d = viewConfiguration.getScaledTouchSlop();
        setContentDescription("notification");
    }

    /* renamed from: a, reason: from getter */
    public final float getF92027a() {
        return this.f92027a;
    }

    public final void b(float f7) {
        this.f92027a = f7;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked == 2 && Math.abs(this.f92028b - event.getRawY()) > ((float) this.f92030d);
        }
        this.f92028b = event.getRawY();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setTranslationY(Math.min(event.getRawY() - this.f92028b, 0.0f) + this.f92027a);
                    if (this.f92029c == null) {
                        this.f92029c = VelocityTracker.obtain();
                    }
                    VelocityTracker velocityTracker = this.f92029c;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(event);
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f92027a - getTranslationY() <= getHeight() / 2 && getTranslationY() < this.f92027a) {
                VelocityTracker velocityTracker2 = this.f92029c;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker3 = this.f92029c;
                if ((velocityTracker3 != null ? velocityTracker3.getYVelocity() : 0.0f) < ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) {
                    animate().translationY(this.f92027a).setDuration(100L).setInterpolator(new LinearInterpolator()).start();
                }
            }
            VelocityTracker velocityTracker4 = this.f92029c;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.f92029c = null;
        } else {
            this.f92028b = event.getRawY();
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f92029c = obtain;
            if (obtain != null) {
                obtain.addMovement(event);
            }
        }
        return true;
    }
}
