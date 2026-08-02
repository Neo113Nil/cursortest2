package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class it4 extends View implements chj {
    public int A;
    public long B;
    public int C;
    public Rect D;
    public final ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Drawable k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final wb3 w;
    public final CopyOnWriteArraySet x;
    public final Point y;
    public final float z;

    public it4(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = c(f, -50);
        int c = c(f, 4);
        int c2 = c(f, 26);
        int c3 = c(f, 4);
        int c4 = c(f, 12);
        int c5 = c(f, 0);
        int c6 = c(f, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zjf.b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.k = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    c2 = Math.max(drawable.getMinimumHeight(), c2);
                }
                this.l = obtainStyledAttributes.getDimensionPixelSize(3, c);
                this.m = obtainStyledAttributes.getDimensionPixelSize(12, c2);
                this.n = obtainStyledAttributes.getInt(2, 0);
                this.o = obtainStyledAttributes.getDimensionPixelSize(1, c3);
                c4 = obtainStyledAttributes.getDimensionPixelSize(11, c4);
                this.p = c4;
                c5 = obtainStyledAttributes.getDimensionPixelSize(8, c5);
                this.q = c5;
                c6 = obtainStyledAttributes.getDimensionPixelSize(9, c6);
                this.r = c6;
                int i = obtainStyledAttributes.getInt(6, -1);
                int i2 = obtainStyledAttributes.getInt(7, -1);
                int i3 = obtainStyledAttributes.getInt(4, -855638017);
                int i4 = obtainStyledAttributes.getInt(13, 872415231);
                int i5 = obtainStyledAttributes.getInt(0, -1291845888);
                int i6 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.l = c;
            this.m = c2;
            this.n = 0;
            this.o = c3;
            this.p = c4;
            this.q = c5;
            this.r = c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new wb3(this, 14);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.s = (Math.max(c5, Math.max(c4, c6)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new s2(this, 7));
        this.J = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j2 = this.J;
        if (j2 == C.TIME_UNSET) {
            return 0L;
        }
        return j2 / this.A;
    }

    private String getProgressText() {
        return nik.G(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.b.width() <= 0 || this.J == C.TIME_UNSET) {
            return 0L;
        }
        return (this.d.width() * this.J) / r0.width();
    }

    @Override // defpackage.chj
    public final void a(long[] jArr, boolean[] zArr, int i) {
        z1a.s(i == 0 || !(jArr == null || zArr == null));
        this.M = i;
        this.N = jArr;
        this.O = zArr;
        g();
    }

    @Override // defpackage.chj
    public final void b(ahj ahjVar) {
        ahjVar.getClass();
        this.x.add(ahjVar);
    }

    public final boolean d(long j) {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long k = nik.k(j3 + j, 0L, j2);
        if (k == j3) {
            return false;
        }
        if (this.H) {
            h(k);
        } else {
            e(k);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((ahj) it.next()).a(this, j);
        }
    }

    public final void f(boolean z) {
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((ahj) it.next()).b(this, this.I, z);
        }
    }

    public final void g() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.L) / this.J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.J)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    @Override // defpackage.chj
    public long getPreferredUpdateDelay() {
        int width = (int) (this.b.width() / this.z);
        if (width == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.J;
        if (j == 0 || j == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j / width;
    }

    public final void h(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((ahj) it.next()).c(this, j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i = centerY + height;
        long j = this.J;
        Paint paint = this.g;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, centerY, rect.right, i, paint);
        } else {
            Rect rect3 = this.c;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int max = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (max < i4) {
                canvas.drawRect(max, centerY, i4, i, paint);
            }
            int max2 = Math.max(i2, rect2.right);
            if (i3 > max2) {
                canvas.drawRect(max2, centerY, i3, i, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i, this.e);
            }
            if (this.M != 0) {
                long[] jArr = this.N;
                jArr.getClass();
                boolean[] zArr = this.O;
                zArr.getClass();
                int i5 = this.o;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.M) {
                    int i9 = i8;
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((rect.width() * nik.k(jArr[i8], 0L, this.J)) / this.J)) - i6)) + rect.left, centerY, r3 + i5, i, zArr[i8] ? this.i : this.h);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.J > 0) {
            int j2 = nik.j(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                canvas2.drawCircle(j2, centerY2, (int) ((((this.H || isFocused()) ? this.r : isEnabled() ? this.p : this.q) * this.F) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.F)) / 2;
                drawable.setBounds(j2 - intrinsicWidth, centerY2 - intrinsicHeight, j2 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.H || z) {
            return;
        }
        f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (d(positionIncrement)) {
                            wb3 wb3Var = this.w;
                            removeCallbacks(wb3Var);
                            postDelayed(wb3Var, 1000L);
                            break;
                        }
                        break;
                    case 22:
                        if (d(positionIncrement)) {
                        }
                        break;
                }
                return true;
            }
            if (this.H) {
                f(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Rect rect;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.G ? 0 : this.s;
        int i10 = this.n;
        int i11 = this.l;
        int i12 = this.m;
        if (i10 == 1) {
            i5 = (i8 - getPaddingBottom()) - i12;
            i6 = ((i8 - getPaddingBottom()) - i11) - Math.max(i9 - (i11 / 2), 0);
        } else {
            i5 = (i8 - i12) / 2;
            i6 = (i8 - i11) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, i5, paddingRight, i12 + i5);
        this.b.set(rect2.left + i9, i6, rect2.right - i9, i11 + i6);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.D) == null || rect.width() != i7 || this.D.height() != i8)) {
            Rect rect3 = new Rect(0, 0, i7, i8);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.J > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.y;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.b;
            Rect rect2 = this.d;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.H) {
                            if (i2 < this.t) {
                                int i3 = this.C;
                                rect2.right = nik.j(wt3.f(i, i3, 3, i3), rect.left, rect.right);
                            } else {
                                this.C = i;
                                rect2.right = nik.j(i, rect.left, rect.right);
                            }
                            h(getScrubberPosition());
                            g();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.H) {
                    f(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                int i4 = i;
                if (this.a.contains(i4, i2)) {
                    rect2.right = nik.j(i4, rect.left, rect.right);
                    e(getScrubberPosition());
                    g();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.h.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    @Override // defpackage.chj
    public void setBufferedPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        g();
    }

    @Override // defpackage.chj
    public void setDuration(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (this.H && j == C.TIME_UNSET) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, defpackage.chj
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.H || z) {
            return;
        }
        f(true);
    }

    public void setKeyCountIncrement(int i) {
        z1a.s(i > 0);
        this.A = i;
        this.B = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j) {
        z1a.s(j > 0);
        this.A = -1;
        this.B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    @Override // defpackage.chj
    public void setPosition(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i) {
        this.j.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.g.setColor(i);
        invalidate(this.a);
    }
}
