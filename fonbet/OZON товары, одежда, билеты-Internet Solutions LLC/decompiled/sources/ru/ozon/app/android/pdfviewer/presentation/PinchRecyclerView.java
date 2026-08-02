package ru.ozon.app.android.pdfviewer.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0002 !B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PinchRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "lastScaleTime", "", "scaleFactor", "", "firstTouchX", "firstTouchY", "lastTouchX", "lastTouchY", "maxHeight", "maxWidth", "posX", "posY", "onTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "Companion", "ScaleListener", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinchRecyclerView extends RecyclerView {
    private float firstTouchX;
    private float firstTouchY;
    private long lastScaleTime;
    private float lastTouchX;
    private float lastTouchY;
    private float maxHeight;
    private float maxWidth;
    private float posX;
    private float posY;
    private ScaleGestureDetector scaleDetector;
    private float scaleFactor;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PinchRecyclerView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "<init>", "(Lru/ozon/app/android/pdfviewer/presentation/PinchRecyclerView;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            PinchRecyclerView.this.lastScaleTime = System.currentTimeMillis();
            float scaleFactor = detector.getScaleFactor();
            PinchRecyclerView pinchRecyclerView = PinchRecyclerView.this;
            pinchRecyclerView.scaleFactor = Math.max(1.0f, Math.min(pinchRecyclerView.scaleFactor * scaleFactor, 3.0f));
            PinchRecyclerView.this.maxWidth = r1.getWidth() - (PinchRecyclerView.this.scaleFactor * PinchRecyclerView.this.getWidth());
            PinchRecyclerView.this.maxHeight = r1.getHeight() - (PinchRecyclerView.this.scaleFactor * PinchRecyclerView.this.getHeight());
            if (PinchRecyclerView.this.scaleFactor <= 1.0f || PinchRecyclerView.this.scaleFactor >= 3.0f) {
                return false;
            }
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f7 = focusX - PinchRecyclerView.this.posX;
            float f11 = focusY - PinchRecyclerView.this.posY;
            float f12 = (f7 * scaleFactor) - f7;
            float f13 = (scaleFactor * f11) - f11;
            PinchRecyclerView.this.posX -= f12;
            PinchRecyclerView.this.posY -= f13;
            PinchRecyclerView.this.invalidate();
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinchRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        if (this.scaleFactor == 1.0f) {
            this.posX = 0.0f;
            this.posY = 0.0f;
        }
        canvas.translate(this.posX, this.posY);
        float f7 = this.scaleFactor;
        canvas.scale(f7, f7);
        super.dispatchDraw(canvas);
        canvas.restore();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r4 < r1) goto L26;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        super.onTouchEvent(ev);
        ScaleGestureDetector scaleGestureDetector = this.scaleDetector;
        if (scaleGestureDetector == null) {
            Intrinsics.n("scaleDetector");
            throw null;
        }
        scaleGestureDetector.onTouchEvent(ev);
        int action = ev.getAction() & 255;
        if (action == 0) {
            float rawX = ev.getRawX();
            this.lastTouchX = rawX;
            this.firstTouchX = rawX;
            float rawY = ev.getRawY();
            this.lastTouchY = rawY;
            this.firstTouchY = rawY;
        } else if (action == 2) {
            float rawX2 = ev.getRawX();
            float rawY2 = ev.getRawY();
            boolean z11 = System.currentTimeMillis() - this.lastScaleTime < 100;
            ScaleGestureDetector scaleGestureDetector2 = this.scaleDetector;
            if (scaleGestureDetector2 == null) {
                Intrinsics.n("scaleDetector");
                throw null;
            }
            if (!scaleGestureDetector2.isInProgress() && !z11) {
                float f7 = (rawX2 - this.lastTouchX) + this.posX;
                this.posX = f7;
                float f11 = (rawY2 - this.lastTouchY) + this.posY;
                this.posY = f11;
                float f12 = 0.0f;
                if (f7 > 0.0f) {
                    f7 = 0.0f;
                } else {
                    float f13 = this.maxWidth;
                    if (f7 < f13) {
                        f7 = f13;
                    }
                }
                this.posX = f7;
                if (f11 <= 0.0f) {
                    f12 = this.maxHeight;
                }
                f11 = f12;
                this.posY = f11;
                invalidate();
            }
            this.lastTouchX = rawX2;
            this.lastTouchY = rawY2;
        }
        return true;
    }

    public /* synthetic */ PinchRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinchRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scaleFactor = 1.0f;
        if (isInEditMode()) {
            return;
        }
        this.scaleDetector = new ScaleGestureDetector(context, new ScaleListener());
    }
}
