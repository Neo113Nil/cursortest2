package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ht4 extends View implements bhj {
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

    public ht4(Context context) {
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
        this.t = a(f, -50);
        int a = a(f, 4);
        int a2 = a(f, 26);
        int a3 = a(f, 4);
        int a4 = a(f, 12);
        int a5 = a(f, 0);
        int a6 = a(f, 16);
        this.l = a;
        this.m = a2;
        this.n = 0;
        this.o = a3;
        this.p = a4;
        this.q = a5;
        this.r = a6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.k = null;
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new wb3(this, 13);
        this.s = (Math.max(a5, Math.max(a4, a6)) + 1) / 2;
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new s2(this, 6));
        this.J = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f, int i) {
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
        return lik.r(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.b.width() <= 0 || this.J == C.TIME_UNSET) {
            return 0L;
        }
        return (this.d.width() * this.J) / r0.width();
    }

    public final boolean b(long j) {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long i = lik.i(j3 + j, 0L, j2);
        if (i == j3) {
            return false;
        }
        if (this.H) {
            f(i);
        } else {
            c(i);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            cji cjiVar = ((vii) it.next()).a;
            cjiVar.n0 = true;
            TextView textView = cjiVar.D;
            if (textView != null) {
                textView.setText(lik.r(cjiVar.F, cjiVar.G, j));
            }
            cjiVar.a.f();
        }
    }

    public final void d(boolean z) {
        zke zkeVar;
        int g;
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
            vii viiVar = (vii) it.next();
            long j = this.I;
            cji cjiVar = viiVar.a;
            cjiVar.n0 = false;
            if (!z && (zkeVar = cjiVar.h0) != null) {
                ug6 ug6Var = (ug6) zkeVar;
                lij j2 = ug6Var.j();
                if (cjiVar.m0 && !j2.p()) {
                    int o = j2.o();
                    g = 0;
                    while (true) {
                        long F = lik.F(j2.m(g, cjiVar.I, 0L).l);
                        if (j < F) {
                            break;
                        }
                        if (g == o - 1) {
                            j = F;
                            break;
                        } else {
                            j -= F;
                            g++;
                        }
                    }
                } else {
                    g = ug6Var.g();
                }
                ug6Var.T();
                ug6Var.C(j, g, false);
                cjiVar.m();
            }
            cjiVar.a.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
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

    public final void f(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            cji cjiVar = ((vii) it.next()).a;
            TextView textView = cjiVar.D;
            if (textView != null) {
                textView.setText(lik.r(cjiVar.F, cjiVar.G, j));
            }
        }
    }

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
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((rect.width() * lik.i(jArr[i8], 0L, this.J)) / this.J)) - i6)) + rect.left, centerY, r3 + i5, i, zArr[i8] ? this.i : this.h);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.J > 0) {
            int h = lik.h(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                canvas2.drawCircle(h, centerY2, (int) ((((this.H || isFocused()) ? this.r : isEnabled() ? this.p : this.q) * this.F) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.F)) / 2;
                drawable.setBounds(h - intrinsicWidth, centerY2 - intrinsicHeight, h + intrinsicWidth, centerY2 + intrinsicHeight);
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
        d(false);
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
        if (lik.a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
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
                        if (b(positionIncrement)) {
                            wb3 wb3Var = this.w;
                            removeCallbacks(wb3Var);
                            postDelayed(wb3Var, 1000L);
                            break;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                        }
                        break;
                }
                return true;
            }
            if (this.H) {
                d(false);
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
        if (lik.a >= 29 && ((rect = this.D) == null || rect.width() != i7 || this.D.height() != i8)) {
            Rect rect3 = new Rect(0, 0, i7, i8);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
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
        if (drawable == null || lik.a < 23 || !drawable.setLayoutDirection(i)) {
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
                                rect2.right = lik.h(wt3.f(i, i3, 3, i3), rect.left, rect.right);
                            } else {
                                this.C = i;
                                rect2.right = lik.h(i, rect.left, rect.right);
                            }
                            f(getScrubberPosition());
                            e();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.H) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                int i4 = i;
                if (this.a.contains(i4, i2)) {
                    rect2.right = lik.h(i4, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
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
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
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

    public void setBufferedPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        e();
    }

    public void setDuration(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (this.H && j == C.TIME_UNSET) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.H || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        qx9.r(i > 0);
        this.A = i;
        this.B = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j) {
        qx9.r(j > 0);
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

    public void setPosition(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        setContentDescription(getProgressText());
        e();
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
