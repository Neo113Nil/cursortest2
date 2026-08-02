package ru.ozon.uni.android.notificationbar.view;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003&'(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006)"}, d2 = {"Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView$DismissDirectionalCallback;", "dismissCallback", "Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView$DismissDirectionalCallback;", "getDismissCallback$uni_release", "()Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView$DismissDirectionalCallback;", "setDismissCallback$uni_release", "(Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView$DismissDirectionalCallback;)V", "", "originalTranslationY", "F", "getOriginalTranslationY$uni_release", "()F", "setOriginalTranslationY$uni_release", "(F)V", "downX", "downY", "Landroid/view/VelocityTracker;", "velocityTracker", "Landroid/view/VelocityTracker;", "minimumFlingVelocity", "I", "touchSlop", "Companion", "DismissDirectionalCallback", "DismissDirection", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBarContainerView extends FrameLayout {
    private DismissDirectionalCallback dismissCallback;
    private float downX;
    private float downY;
    private final int minimumFlingVelocity;
    private float originalTranslationY;
    private final int touchSlop;
    private VelocityTracker velocityTracker;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView$DismissDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "LEFT", "RIGHT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissDirection {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DismissDirection[] $VALUES;
        public static final DismissDirection UP = new DismissDirection("UP", 0);
        public static final DismissDirection LEFT = new DismissDirection("LEFT", 1);
        public static final DismissDirection RIGHT = new DismissDirection("RIGHT", 2);

        private static final /* synthetic */ DismissDirection[] $values() {
            return new DismissDirection[]{UP, LEFT, RIGHT};
        }

        static {
            DismissDirection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DismissDirection(String str, int i11) {
        }

        public static DismissDirection valueOf(String str) {
            return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
        }

        public static DismissDirection[] values() {
            return (DismissDirection[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView$DismissDirectionalCallback;", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DismissDirectionalCallback {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationBarContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: getOriginalTranslationY$uni_release, reason: from getter */
    public final float getOriginalTranslationY() {
        return this.originalTranslationY;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                return false;
            }
            return Math.abs(event.getRawX() - this.downX) > ((float) this.touchSlop) || Math.abs(event.getRawY() - this.downY) > ((float) this.touchSlop);
        }
        this.downX = event.getRawX();
        this.downY = event.getRawY();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 != 3) goto L75;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    float rawX = event.getRawX() - this.downX;
                    float rawY = event.getRawY() - this.downY;
                    if (Math.abs(rawX) > Math.abs(rawY)) {
                        setTranslationX(rawX);
                    } else {
                        setTranslationY(Math.min(rawY, 0.0f) + this.originalTranslationY);
                    }
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    VelocityTracker velocityTracker = this.velocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(event);
                        return true;
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            float rawX2 = event.getRawX() - this.downX;
            if (Math.abs(rawX2) > Math.abs(event.getRawY() - this.downY)) {
                if (Math.abs(rawX2) > getWidth() / 3) {
                    DismissDirection dismissDirection = rawX2 > 0.0f ? DismissDirection.RIGHT : DismissDirection.LEFT;
                    DismissDirectionalCallback dismissDirectionalCallback = this.dismissCallback;
                    if (dismissDirectionalCallback != null) {
                        ((Gk0.b) dismissDirectionalCallback).b(dismissDirection);
                    }
                } else {
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker3 = this.velocityTracker;
                    float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                    if (Math.abs(xVelocity) >= ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) {
                        DismissDirection dismissDirection2 = xVelocity > 0.0f ? DismissDirection.RIGHT : DismissDirection.LEFT;
                        DismissDirectionalCallback dismissDirectionalCallback2 = this.dismissCallback;
                        if (dismissDirectionalCallback2 != null) {
                            ((Gk0.b) dismissDirectionalCallback2).b(dismissDirection2);
                        }
                    } else {
                        animate().translationX(0.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).start();
                    }
                }
            } else if (this.originalTranslationY - getTranslationY() > getHeight() / 2) {
                DismissDirectionalCallback dismissDirectionalCallback3 = this.dismissCallback;
                if (dismissDirectionalCallback3 != null) {
                    ((Gk0.b) dismissDirectionalCallback3).b(DismissDirection.UP);
                }
            } else if (getTranslationY() < this.originalTranslationY) {
                VelocityTracker velocityTracker4 = this.velocityTracker;
                if (velocityTracker4 != null) {
                    velocityTracker4.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker5 = this.velocityTracker;
                if ((velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f) >= ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) {
                    DismissDirectionalCallback dismissDirectionalCallback4 = this.dismissCallback;
                    if (dismissDirectionalCallback4 != null) {
                        ((Gk0.b) dismissDirectionalCallback4).b(DismissDirection.UP);
                    }
                } else {
                    animate().translationY(this.originalTranslationY).setDuration(100L).setInterpolator(new LinearInterpolator()).start();
                }
            }
            VelocityTracker velocityTracker6 = this.velocityTracker;
            if (velocityTracker6 != null) {
                velocityTracker6.recycle();
            }
            this.velocityTracker = null;
            return true;
        }
        this.downX = event.getRawX();
        this.downY = event.getRawY();
        VelocityTracker obtain = VelocityTracker.obtain();
        this.velocityTracker = obtain;
        if (obtain != null) {
            obtain.addMovement(event);
        }
        return true;
    }

    public final void setDismissCallback$uni_release(DismissDirectionalCallback dismissDirectionalCallback) {
        this.dismissCallback = dismissDirectionalCallback;
    }

    public final void setOriginalTranslationY$uni_release(float f7) {
        this.originalTranslationY = f7;
    }

    public /* synthetic */ NotificationBarContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationBarContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.minimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        setContentDescription("notification");
    }
}
