package androidx.media3.ui;

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
import androidx.media3.ui.l0;
import e1.AbstractC4134a;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements l0 {

    /* renamed from: A, reason: collision with root package name */
    public int f22112A;

    /* renamed from: B, reason: collision with root package name */
    public long f22113B;

    /* renamed from: C, reason: collision with root package name */
    public int f22114C;

    /* renamed from: D, reason: collision with root package name */
    public Rect f22115D;

    /* renamed from: E, reason: collision with root package name */
    public ValueAnimator f22116E;

    /* renamed from: F, reason: collision with root package name */
    public float f22117F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f22118G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f22119H;

    /* renamed from: I, reason: collision with root package name */
    public long f22120I;

    /* renamed from: J, reason: collision with root package name */
    public long f22121J;

    /* renamed from: K, reason: collision with root package name */
    public long f22122K;

    /* renamed from: L, reason: collision with root package name */
    public long f22123L;

    /* renamed from: O, reason: collision with root package name */
    public int f22124O;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f22125a;
    private long[] adGroupTimesMs;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f22126b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f22127c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f22128d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f22129e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f22130f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f22131g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f22132h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f22133i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f22134j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f22135k;

    /* renamed from: l, reason: collision with root package name */
    public final int f22136l;

    /* renamed from: m, reason: collision with root package name */
    public final int f22137m;

    /* renamed from: n, reason: collision with root package name */
    public final int f22138n;

    /* renamed from: o, reason: collision with root package name */
    public final int f22139o;

    /* renamed from: p, reason: collision with root package name */
    public final int f22140p;
    private boolean[] playedAdGroups;

    /* renamed from: q, reason: collision with root package name */
    public final int f22141q;

    /* renamed from: r, reason: collision with root package name */
    public final int f22142r;

    /* renamed from: s, reason: collision with root package name */
    public final int f22143s;

    /* renamed from: t, reason: collision with root package name */
    public final int f22144t;

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f22145u;

    /* renamed from: v, reason: collision with root package name */
    public final Formatter f22146v;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f22147w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f22148x;

    /* renamed from: y, reason: collision with root package name */
    public final Point f22149y;

    /* renamed from: z, reason: collision with root package name */
    public final float f22150z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void c(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.f22117F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f22125a);
    }

    public static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.f22113B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f22121J;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / this.f22112A;
    }

    private String getProgressText() {
        return e1.Z.u0(this.f22145u, this.f22146v, this.f22122K);
    }

    private long getScrubberPosition() {
        if (this.f22126b.width() <= 0 || this.f22121J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f22128d.width() * this.f22121J) / this.f22126b.width();
    }

    public static int l(float f10, int i10) {
        return (int) (i10 / f10);
    }

    public static boolean p(Drawable drawable, int i10) {
        return drawable.setLayoutDirection(i10);
    }

    @Override // androidx.media3.ui.l0
    public void a(l0.a aVar) {
        AbstractC4134a.e(aVar);
        this.f22148x.add(aVar);
    }

    @Override // androidx.media3.ui.l0
    public void b(long[] jArr, boolean[] zArr, int i10) {
        AbstractC4134a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f22124O = i10;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        v();
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    public final void f(Canvas canvas) {
        if (this.f22121J <= 0) {
            return;
        }
        Rect rect = this.f22128d;
        int o10 = e1.Z.o(rect.right, rect.left, this.f22126b.right);
        int centerY = this.f22128d.centerY();
        if (this.f22135k == null) {
            canvas.drawCircle(o10, centerY, (int) ((((this.f22119H || isFocused()) ? this.f22142r : isEnabled() ? this.f22140p : this.f22141q) * this.f22117F) / 2.0f), this.f22134j);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f22117F)) / 2;
        int intrinsicHeight = ((int) (this.f22135k.getIntrinsicHeight() * this.f22117F)) / 2;
        this.f22135k.setBounds(o10 - intrinsicWidth, centerY - intrinsicHeight, o10 + intrinsicWidth, centerY + intrinsicHeight);
        this.f22135k.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int height = this.f22126b.height();
        int centerY = this.f22126b.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.f22121J <= 0) {
            Rect rect = this.f22126b;
            canvas.drawRect(rect.left, centerY, rect.right, i10, this.f22131g);
            return;
        }
        Rect rect2 = this.f22127c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.f22126b.left, i12), this.f22128d.right);
        int i13 = this.f22126b.right;
        if (max < i13) {
            canvas.drawRect(max, centerY, i13, i10, this.f22131g);
        }
        int max2 = Math.max(i11, this.f22128d.right);
        if (i12 > max2) {
            canvas.drawRect(max2, centerY, i12, i10, this.f22130f);
        }
        if (this.f22128d.width() > 0) {
            Rect rect3 = this.f22128d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i10, this.f22129e);
        }
        if (this.f22124O == 0) {
            return;
        }
        long[] jArr = (long[]) AbstractC4134a.e(this.adGroupTimesMs);
        boolean[] zArr = (boolean[]) AbstractC4134a.e(this.playedAdGroups);
        int i14 = this.f22139o / 2;
        for (int i15 = 0; i15 < this.f22124O; i15++) {
            int width = ((int) ((this.f22126b.width() * e1.Z.p(jArr[i15], 0L, this.f22121J)) / this.f22121J)) - i14;
            Rect rect4 = this.f22126b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f22139o, Math.max(0, width)), centerY, r10 + this.f22139o, i10, zArr[i15] ? this.f22133i : this.f22132h);
        }
    }

    @Override // androidx.media3.ui.l0
    public long getPreferredUpdateDelay() {
        int l10 = l(this.f22150z, this.f22126b.width());
        if (l10 == 0) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j10 = this.f22121J;
        return (j10 == 0 || j10 == -9223372036854775807L) ? LongCompanionObject.MAX_VALUE : j10 / l10;
    }

    public void h(long j10) {
        if (this.f22116E.isStarted()) {
            this.f22116E.cancel();
        }
        this.f22116E.setFloatValues(this.f22117F, 0.0f);
        this.f22116E.setDuration(j10);
        this.f22116E.start();
    }

    public void i(boolean z10) {
        if (this.f22116E.isStarted()) {
            this.f22116E.cancel();
        }
        this.f22118G = z10;
        this.f22117F = 0.0f;
        invalidate(this.f22125a);
    }

    public final boolean j(float f10, float f11) {
        return this.f22125a.contains((int) f10, (int) f11);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22135k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void k(float f10) {
        Rect rect = this.f22128d;
        Rect rect2 = this.f22126b;
        rect.right = e1.Z.o((int) f10, rect2.left, rect2.right);
    }

    public final Point m(MotionEvent motionEvent) {
        this.f22149y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f22149y;
    }

    public final boolean n(long j10) {
        long j11 = this.f22121J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f22119H ? this.f22120I : this.f22122K;
        long p10 = e1.Z.p(j12 + j10, 0L, j11);
        if (p10 == j12) {
            return false;
        }
        if (this.f22119H) {
            x(p10);
        } else {
            t(p10);
        }
        v();
        return true;
    }

    public final boolean o(Drawable drawable) {
        return p(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f22119H || z10) {
            return;
        }
        u(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f22121J <= 0) {
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
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (n(positionIncrement)) {
                            removeCallbacks(this.f22147w);
                            postDelayed(this.f22147w, 1000L);
                            break;
                        }
                        break;
                    case 22:
                        if (n(positionIncrement)) {
                        }
                        break;
                }
                return true;
            }
            if (this.f22119H) {
                u(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.f22118G ? 0 : this.f22143s;
        if (this.f22138n == 1) {
            i14 = (i17 - getPaddingBottom()) - this.f22137m;
            int paddingBottom = i17 - getPaddingBottom();
            int i19 = this.f22136l;
            i15 = (paddingBottom - i19) - Math.max(i18 - (i19 / 2), 0);
        } else {
            i14 = (i17 - this.f22137m) / 2;
            i15 = (i17 - this.f22136l) / 2;
        }
        this.f22125a.set(paddingLeft, i14, paddingRight, this.f22137m + i14);
        Rect rect = this.f22126b;
        Rect rect2 = this.f22125a;
        rect.set(rect2.left + i18, i15, rect2.right - i18, this.f22136l + i15);
        if (Build.VERSION.SDK_INT >= 29) {
            q(i16, i17);
        }
        v();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f22137m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f22137m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        w();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f22135k;
        if (drawable == null || !p(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f22121J > 0) {
            Point m10 = m(motionEvent);
            int i10 = m10.x;
            int i11 = m10.y;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f22119H) {
                            if (i11 < this.f22144t) {
                                int i12 = this.f22114C;
                                k(i12 + ((i10 - i12) / 3));
                            } else {
                                this.f22114C = i10;
                                k(i10);
                            }
                            x(getScrubberPosition());
                            v();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.f22119H) {
                    u(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                float f10 = i10;
                if (j(f10, i11)) {
                    k(f10);
                    t(getScrubberPosition());
                    v();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f22121J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (n(-getPositionIncrement())) {
                u(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (n(getPositionIncrement())) {
                u(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public final void q(int i10, int i11) {
        Rect rect = this.f22115D;
        if (rect != null && rect.width() == i10 && this.f22115D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.f22115D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    public void r() {
        if (this.f22116E.isStarted()) {
            this.f22116E.cancel();
        }
        this.f22118G = false;
        this.f22117F = 1.0f;
        invalidate(this.f22125a);
    }

    public void s(long j10) {
        if (this.f22116E.isStarted()) {
            this.f22116E.cancel();
        }
        this.f22118G = false;
        this.f22116E.setFloatValues(this.f22117F, 1.0f);
        this.f22116E.setDuration(j10);
        this.f22116E.start();
    }

    public void setAdMarkerColor(int i10) {
        this.f22132h.setColor(i10);
        invalidate(this.f22125a);
    }

    public void setBufferedColor(int i10) {
        this.f22130f.setColor(i10);
        invalidate(this.f22125a);
    }

    @Override // androidx.media3.ui.l0
    public void setBufferedPosition(long j10) {
        if (this.f22123L == j10) {
            return;
        }
        this.f22123L = j10;
        v();
    }

    @Override // androidx.media3.ui.l0
    public void setDuration(long j10) {
        if (this.f22121J == j10) {
            return;
        }
        this.f22121J = j10;
        if (this.f22119H && j10 == -9223372036854775807L) {
            u(true);
        }
        v();
    }

    @Override // android.view.View, androidx.media3.ui.l0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f22119H || z10) {
            return;
        }
        u(true);
    }

    public void setKeyCountIncrement(int i10) {
        AbstractC4134a.a(i10 > 0);
        this.f22112A = i10;
        this.f22113B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        AbstractC4134a.a(j10 > 0);
        this.f22112A = -1;
        this.f22113B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f22133i.setColor(i10);
        invalidate(this.f22125a);
    }

    public void setPlayedColor(int i10) {
        this.f22129e.setColor(i10);
        invalidate(this.f22125a);
    }

    @Override // androidx.media3.ui.l0
    public void setPosition(long j10) {
        if (this.f22122K == j10) {
            return;
        }
        this.f22122K = j10;
        setContentDescription(getProgressText());
        v();
    }

    public void setScrubberColor(int i10) {
        this.f22134j.setColor(i10);
        invalidate(this.f22125a);
    }

    public void setUnplayedColor(int i10) {
        this.f22131g.setColor(i10);
        invalidate(this.f22125a);
    }

    public final void t(long j10) {
        this.f22120I = j10;
        this.f22119H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f22148x.iterator();
        while (it.hasNext()) {
            ((l0.a) it.next()).m(this, j10);
        }
    }

    public final void u(boolean z10) {
        removeCallbacks(this.f22147w);
        this.f22119H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f22148x.iterator();
        while (it.hasNext()) {
            ((l0.a) it.next()).O(this, this.f22120I, z10);
        }
    }

    public final void v() {
        this.f22127c.set(this.f22126b);
        this.f22128d.set(this.f22126b);
        long j10 = this.f22119H ? this.f22120I : this.f22122K;
        if (this.f22121J > 0) {
            int width = (int) ((this.f22126b.width() * this.f22123L) / this.f22121J);
            Rect rect = this.f22127c;
            Rect rect2 = this.f22126b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f22126b.width() * j10) / this.f22121J);
            Rect rect3 = this.f22128d;
            Rect rect4 = this.f22126b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f22127c;
            int i10 = this.f22126b.left;
            rect5.right = i10;
            this.f22128d.right = i10;
        }
        invalidate(this.f22125a);
    }

    public final void w() {
        Drawable drawable = this.f22135k;
        if (drawable != null && drawable.isStateful() && this.f22135k.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void x(long j10) {
        if (this.f22120I == j10) {
            return;
        }
        this.f22120I = j10;
        Iterator it = this.f22148x.iterator();
        while (it.hasNext()) {
            ((l0.a) it.next()).G(this, j10);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f22125a = new Rect();
        this.f22126b = new Rect();
        this.f22127c = new Rect();
        this.f22128d = new Rect();
        Paint paint = new Paint();
        this.f22129e = paint;
        Paint paint2 = new Paint();
        this.f22130f = paint2;
        Paint paint3 = new Paint();
        this.f22131g = paint3;
        Paint paint4 = new Paint();
        this.f22132h = paint4;
        Paint paint5 = new Paint();
        this.f22133i = paint5;
        Paint paint6 = new Paint();
        this.f22134j = paint6;
        paint6.setAntiAlias(true);
        this.f22148x = new CopyOnWriteArraySet();
        this.f22149y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f22150z = f10;
        this.f22144t = e(f10, -50);
        int e10 = e(f10, 4);
        int e11 = e(f10, 26);
        int e12 = e(f10, 4);
        int e13 = e(f10, 12);
        int e14 = e(f10, 0);
        int e15 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, d0.DefaultTimeBar, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(d0.f22437l);
                this.f22135k = drawable;
                if (drawable != null) {
                    o(drawable);
                    e11 = Math.max(drawable.getMinimumHeight(), e11);
                }
                this.f22136l = obtainStyledAttributes.getDimensionPixelSize(d0.f22427e, e10);
                this.f22137m = obtainStyledAttributes.getDimensionPixelSize(d0.f22439n, e11);
                this.f22138n = obtainStyledAttributes.getInt(d0.f22425d, 0);
                this.f22139o = obtainStyledAttributes.getDimensionPixelSize(d0.f22423c, e12);
                this.f22140p = obtainStyledAttributes.getDimensionPixelSize(d0.f22438m, e13);
                this.f22141q = obtainStyledAttributes.getDimensionPixelSize(d0.f22435j, e14);
                this.f22142r = obtainStyledAttributes.getDimensionPixelSize(d0.f22436k, e15);
                int i12 = obtainStyledAttributes.getInt(d0.f22433h, -1);
                int i13 = obtainStyledAttributes.getInt(d0.f22434i, -1);
                int i14 = obtainStyledAttributes.getInt(d0.f22429f, -855638017);
                int i15 = obtainStyledAttributes.getInt(d0.f22440o, 872415231);
                int i16 = obtainStyledAttributes.getInt(d0.f22421b, -1291845888);
                int i17 = obtainStyledAttributes.getInt(d0.f22431g, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f22136l = e10;
            this.f22137m = e11;
            this.f22138n = 0;
            this.f22139o = e12;
            this.f22140p = e13;
            this.f22141q = e14;
            this.f22142r = e15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f22135k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f22145u = sb2;
        this.f22146v = new Formatter(sb2, Locale.getDefault());
        this.f22147w = new Runnable() { // from class: androidx.media3.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.u(false);
            }
        };
        Drawable drawable2 = this.f22135k;
        if (drawable2 != null) {
            this.f22143s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22143s = (Math.max(this.f22141q, Math.max(this.f22140p, this.f22142r)) + 1) / 2;
        }
        this.f22117F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f22116E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.c(DefaultTimeBar.this, valueAnimator2);
            }
        });
        this.f22121J = -9223372036854775807L;
        this.f22113B = -9223372036854775807L;
        this.f22112A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
