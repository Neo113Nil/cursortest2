package ru.ozon.app.android.web.zoomWebView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u001a\u0010\u001e\u001a\u00020\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bR\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/web/zoomWebView/NestedScaleScrollView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "zoomEndedCallback", "Lkotlin/Function1;", "", "", "horizontalScrollingEndedCallback", "touchSlop", "initialX", "", "initialY", "horizontalScrollDetected", "verticalScrollDetected", AppMeasurementSdk.ConditionalUserProperty.VALUE, "twoFingers", "setTwoFingers", "(Z)V", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "setZoomEndedCallback", "callback", "setHorizontalScrollingEndedCallback", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NestedScaleScrollView extends NestedScrollView {
    private boolean horizontalScrollDetected;
    private Function1<? super Boolean, Unit> horizontalScrollingEndedCallback;
    private float initialX;
    private float initialY;
    private final int touchSlop;
    private boolean twoFingers;
    private boolean verticalScrollDetected;
    private Function1<? super Boolean, Unit> zoomEndedCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedScaleScrollView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setTwoFingers(boolean z11) {
        if (this.twoFingers == z11) {
            return;
        }
        this.twoFingers = z11;
        Function1<? super Boolean, Unit> function1 = this.zoomEndedCallback;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(!z11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r0 != 3) goto L46;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        setTwoFingers(event.getPointerCount() == 2);
        if (this.twoFingers) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.horizontalScrollDetected && !this.verticalScrollDetected) {
                        float abs = Math.abs(event.getX() - this.initialX);
                        float abs2 = Math.abs(event.getY() - this.initialY);
                        int i11 = this.touchSlop;
                        if (abs > i11 || abs2 > i11) {
                            boolean z11 = abs > abs2;
                            this.horizontalScrollDetected = z11;
                            this.verticalScrollDetected = !z11;
                            if (z11) {
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                Function1<? super Boolean, Unit> function1 = this.horizontalScrollingEndedCallback;
                                if (function1 != null) {
                                    function1.invoke(Boolean.FALSE);
                                }
                            }
                        }
                    }
                }
            }
            if (this.horizontalScrollDetected) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                Function1<? super Boolean, Unit> function12 = this.horizontalScrollingEndedCallback;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
            }
            this.horizontalScrollDetected = false;
            this.verticalScrollDetected = false;
            this.initialX = 0.0f;
            this.initialY = 0.0f;
        } else {
            this.initialX = event.getX();
            this.initialY = event.getY();
            this.horizontalScrollDetected = false;
            this.verticalScrollDetected = false;
        }
        if (this.horizontalScrollDetected) {
            return false;
        }
        return super.onInterceptTouchEvent(event);
    }

    public final void setHorizontalScrollingEndedCallback(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.horizontalScrollingEndedCallback = callback;
    }

    public final void setZoomEndedCallback(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.zoomEndedCallback = callback;
    }

    public /* synthetic */ NestedScaleScrollView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScaleScrollView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
