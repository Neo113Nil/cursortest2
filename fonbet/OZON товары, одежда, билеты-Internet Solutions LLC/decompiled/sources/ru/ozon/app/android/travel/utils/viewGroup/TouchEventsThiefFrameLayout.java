package ru.ozon.app.android.travel.utils.viewGroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/GestureDetector$OnGestureListener;", "provideGestureListener", "()Landroid/view/GestureDetector$OnGestureListener;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "onTouchEvent", "", "onAttachedToWindow", "()V", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "isThiefActivated", "Z", "()Z", "setThiefActivated", "(Z)V", "isTouchEventOneTimePassEnabled", "setTouchEventOneTimePassEnabled", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TouchEventsThiefFrameLayout extends FrameLayout {
    private GestureDetector gestureDetector;
    private boolean isThiefActivated;
    private boolean isTouchEventOneTimePassEnabled;

    public /* synthetic */ TouchEventsThiefFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final GestureDetector.OnGestureListener provideGestureListener() {
        return new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.travel.utils.viewGroup.TouchEventsThiefFrameLayout$provideGestureListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (!TouchEventsThiefFrameLayout.this.getIsTouchEventOneTimePassEnabled()) {
                    TouchEventsThiefFrameLayout.this.performClick();
                    return true;
                }
                TouchEventsThiefFrameLayout.this.setTouchEventOneTimePassEnabled(false);
                View childAt = TouchEventsThiefFrameLayout.this.getChildAt(0);
                if (childAt == null) {
                    return true;
                }
                childAt.performClick();
                return true;
            }
        };
    }

    /* renamed from: isTouchEventOneTimePassEnabled, reason: from getter */
    public final boolean getIsTouchEventOneTimePassEnabled() {
        return this.isTouchEventOneTimePassEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.gestureDetector == null) {
            this.gestureDetector = new GestureDetector(getContext(), provideGestureListener());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.isThiefActivated;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null) {
            return true;
        }
        gestureDetector.onTouchEvent(event);
        return true;
    }

    public final void setThiefActivated(boolean z11) {
        this.isThiefActivated = z11;
    }

    public final void setTouchEventOneTimePassEnabled(boolean z11) {
        this.isTouchEventOneTimePassEnabled = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchEventsThiefFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
