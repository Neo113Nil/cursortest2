package com.vk.clips.design.view.seek;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.sdk.design.R$styleable;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.an10;
import xsna.e3m;
import xsna.iah0;
import xsna.iut0;
import xsna.kc30;
import xsna.m33;

/* compiled from: ClipsSeekBar.kt */
/* loaded from: classes16.dex */
public final class ClipsSeekBar extends View {
    public static final int t = iah0.a(400);
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final float e;
    public Drawable f;
    public final int g;
    public final int h;
    public final int i;
    public final kc30 j;
    public int k;
    public float l;
    public a m;
    public b n;
    public float o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s;

    /* compiled from: ClipsSeekBar.kt */
    public interface a {
        void a(float f);
    }

    /* compiled from: ClipsSeekBar.kt */
    public interface b {
        void a();

        void b();
    }

    public ClipsSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getSlideArea() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final void setCurrentValue(float f) {
        this.l = Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
        int b2 = (int) ((an10.b(r5 * ((int) r0)) / ((float) Math.pow(10.0f, 2))) * 100.0f);
        String quantityString = getResources().getQuantityString(R.plurals.clips_seekbar_percent, b2, Integer.valueOf(b2));
        setContentDescription(quantityString);
        iut0.t(this, quantityString);
    }

    public final void a(float f, boolean z) {
        a aVar;
        setCurrentValue(f);
        if (z && (aVar = this.m) != null) {
            aVar.a(this.l);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float slideArea;
        float slideArea2;
        Drawable drawable;
        super.onDraw(canvas);
        boolean isEnabled = isEnabled();
        Paint paint = this.c;
        if (isEnabled) {
            paint.setColor(getResources().getColor(this.q, null));
        } else {
            paint.setColor(-9342604);
        }
        int color = getResources().getColor(this.r, null);
        Paint paint2 = this.d;
        paint2.setColor(color);
        float paddingLeft = getPaddingLeft();
        int height = canvas.getHeight() / 2;
        int i = this.h;
        canvas.drawRect(paddingLeft, height - (i / 2), canvas.getWidth() - getPaddingRight(), (i / 2) + (canvas.getHeight() / 2), this.b);
        float paddingLeft2 = getPaddingLeft();
        float slideArea3 = getSlideArea();
        float f3 = this.e;
        canvas.drawCircle((slideArea3 * f3) + paddingLeft2, canvas.getHeight() / 2, this.i / 2, paint);
        float f4 = this.l;
        if (f4 < f3) {
            slideArea = (getSlideArea() * this.l) + getPaddingLeft();
            slideArea2 = (getSlideArea() * f3) + getPaddingLeft();
        } else {
            if (f4 <= f3) {
                f = 0.0f;
                f2 = 0.0f;
                if (f != f2) {
                    canvas.drawRect(f, (canvas.getHeight() / 2) - (i / 2), f2, (i / 2) + (canvas.getHeight() / 2), paint);
                }
                drawable = this.f;
                int i2 = this.g;
                if (drawable != null) {
                    canvas.drawCircle((getSlideArea() * this.l) + getPaddingLeft(), canvas.getHeight() / 2, i2 / 2, paint2);
                    return;
                }
                int slideArea4 = (int) ((getSlideArea() * this.l) + getPaddingLeft());
                int height2 = canvas.getHeight() / 2;
                float f5 = slideArea4;
                float f6 = height2;
                this.f.setBounds((int) (f5 - (i2 / 1.3f)), (int) (f6 - (i2 / 1.3f)), (int) ((i2 / 1.3f) + f5), (int) ((i2 / 1.3f) + f6));
                this.f.draw(canvas);
                return;
            }
            slideArea = (getSlideArea() * f3) + getPaddingLeft();
            slideArea2 = (getSlideArea() * this.l) + getPaddingLeft();
        }
        f = slideArea;
        f2 = slideArea2;
        if (f != f2) {
        }
        drawable = this.f;
        int i22 = this.g;
        if (drawable != null) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.p) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = t;
            if (size > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = this.s;
            rect.set(0, 0, i, i2);
            setSystemGestureExclusionRects(Collections.singletonList(rect));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!isEnabled()) {
            invalidate();
            return false;
        }
        int action = motionEvent.getAction();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (action == 0) {
            this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            b bVar = this.n;
            if (bVar != null) {
                bVar.a();
            }
        } else if (action == 1 || action == 3) {
            a aVar = this.m;
            if (aVar != null) {
                aVar.a(this.l);
            }
            b bVar2 = this.n;
            if (bVar2 != null) {
                bVar2.b();
            }
        }
        ViewParent parent2 = getParent();
        while (true) {
            if (parent2 == null) {
                break;
            }
            if (parent2 instanceof ViewPager) {
                ((ViewPager) parent2).requestDisallowInterceptTouchEvent(true);
                break;
            }
            parent2 = parent2.getParent();
        }
        kc30 kc30Var = this.j;
        kc30Var.getClass();
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            kc30Var.c = motionEvent.getPointerCount();
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                f += motionEvent.getX(i);
            }
            kc30Var.b = f / pointerCount;
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount2; i2++) {
                motionEvent.getY(i2);
            }
            kc30Var.d = System.currentTimeMillis();
            return true;
        }
        if (action2 != 2) {
            return true;
        }
        int pointerCount3 = motionEvent.getPointerCount();
        float f2 = 0.0f;
        for (int i3 = 0; i3 < pointerCount3; i3++) {
            f2 += motionEvent.getX(i3);
        }
        float f3 = f2 / pointerCount3;
        int pointerCount4 = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount4; i4++) {
            motionEvent.getY(i4);
        }
        int pointerCount5 = motionEvent.getPointerCount();
        if (System.currentTimeMillis() - kc30Var.d > 0) {
            ClipsSeekBar clipsSeekBar = kc30Var.a;
            if (kc30Var.c == pointerCount5) {
                float abs = Math.abs(f3 - kc30Var.b) + clipsSeekBar.o;
                clipsSeekBar.o = abs;
                if (abs > clipsSeekBar.k && (parent = clipsSeekBar.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                float slideArea = ((int) (((int) (clipsSeekBar.l * clipsSeekBar.getSlideArea())) + r4)) / clipsSeekBar.getSlideArea();
                if (slideArea >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && slideArea <= 1.0f) {
                    clipsSeekBar.setCurrentValue(slideArea);
                    clipsSeekBar.invalidate();
                    a aVar2 = clipsSeekBar.m;
                    if (aVar2 != null) {
                        aVar2.a(clipsSeekBar.l);
                    }
                }
            }
        }
        kc30Var.b = f3;
        kc30Var.c = pointerCount5;
        return true;
    }

    public final void setIgnoreMovementThreshold(int i) {
        this.k = i;
    }

    public final void setLimitWidth(boolean z) {
        this.p = z;
    }

    public final void setOnSeekBarChangeListener(a aVar) {
        this.m = aVar;
    }

    public final void setSelectedColor(int i) {
        this.q = i;
        this.c.setColor(getResources().getColor(i, null));
    }

    public final void setStateListener(b bVar) {
        this.n = bVar;
    }

    public final void setThumbColor(int i) {
        this.r = i;
        this.d.setColor(getResources().getColor(i, null));
    }

    public final void setThumbDrawable(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        this.f = m33.a(i, context);
    }

    public final void setValue(float f) {
        a(f, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        this.d = new Paint(1);
        float f = 16;
        this.g = iah0.a(f);
        float f2 = 2;
        this.h = iah0.a(f2);
        this.i = iah0.a(f2);
        this.k = iah0.a(0);
        this.p = true;
        this.q = R.color.vk_white;
        this.r = R.color.vk_blue_400;
        this.s = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        float f3 = obtainStyledAttributes.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, iah0.a(f2));
        this.g = obtainStyledAttributes.getDimensionPixelSize(4, iah0.a(f));
        obtainStyledAttributes.recycle();
        this.e = f3;
        setClickable(true);
        this.j = new kc30(this);
        if (resourceId != 0) {
            paint.setColor(context.getColor(resourceId));
        } else if (z) {
            paint.setColor(1056964608);
        } else {
            paint.setColor(1056964608);
        }
    }
}
