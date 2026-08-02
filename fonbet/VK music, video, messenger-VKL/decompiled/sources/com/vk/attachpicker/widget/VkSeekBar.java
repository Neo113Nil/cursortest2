package com.vk.attachpicker.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.appfeature.attachpicker.R$styleable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;
import xsna.l960;
import xsna.m33;
import xsna.mc30;
import xsna.p870;

/* loaded from: classes15.dex */
public class VkSeekBar extends View implements mc30.a {
    public static final int q = iah0.a(400);
    public final int b;
    public final Paint c;
    public final Paint d;
    public final float e;
    public Drawable f;
    public final int g;
    public final int h;
    public final int i;
    public final mc30 j;
    public int k;
    public float l;
    public a m;
    public b n;
    public float o;
    public boolean p;

    public interface a {
    }

    public interface b {
    }

    public VkSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.g = iah0.a(16);
        float f = 2;
        this.h = iah0.a(f);
        this.i = iah0.a(f);
        this.k = iah0.a(0);
        this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.p = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
        float f2 = obtainStyledAttributes.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getResourceId(3, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, R.color.picker_blue);
        int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.recycle();
        this.e = f2;
        this.j = new mc30(this);
        if (resourceId2 != 0) {
            paint.setColor(context.getColor(resourceId2));
        } else if (z) {
            paint.setColor(1056964608);
        } else {
            paint.setColor(1056964608);
        }
        int color = context.getColor(resourceId);
        this.b = color;
        paint2.setColor(color);
    }

    private int getSlideArea() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final void a() {
        a aVar = this.m;
        if (aVar != null) {
            float f = this.l;
            ViewerToolbar viewerToolbar = (ViewerToolbar) ((l960) aVar).c;
            int i = viewerToolbar.m;
            if (i > 0) {
                viewerToolbar.j.setText(ViewerToolbar.a((int) (f * i)));
            }
        }
    }

    @Override // xsna.mc30.a
    public final void b(float f, float f2) {
        ViewParent parent;
        float abs = Math.abs(f) + this.o;
        this.o = abs;
        if (abs > this.k && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        float slideArea = ((int) (((int) (this.l * getSlideArea())) + f)) / getSlideArea();
        if (slideArea < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || slideArea > 1.0f) {
            return;
        }
        this.l = slideArea;
        invalidate();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fe  */
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
        Paint paint = this.d;
        if (isEnabled) {
            paint.setColor(this.b);
        } else {
            paint.setColor(-9342604);
        }
        float paddingLeft = getPaddingLeft();
        int height = canvas.getHeight() / 2;
        int i = this.h;
        canvas.drawRect(paddingLeft, height - (i / 2), canvas.getWidth() - getPaddingRight(), (i / 2) + (canvas.getHeight() / 2), this.c);
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
                    canvas.drawCircle((getSlideArea() * this.l) + getPaddingLeft(), canvas.getHeight() / 2, i2 / 2, paint);
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
            int i3 = q;
            if (size > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            invalidate();
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            b bVar = this.n;
            if (bVar != null) {
                d dVar = (d) bVar;
                ViewerToolbar viewerToolbar = dVar.b;
                dVar.a = System.currentTimeMillis();
                p870.f().d(6, viewerToolbar.l, null);
            }
        } else if (action == 1 || action == 3) {
            a();
            b bVar2 = this.n;
            if (bVar2 != null) {
                float f = this.l;
                d dVar2 = (d) bVar2;
                ViewerToolbar viewerToolbar2 = dVar2.b;
                if (System.currentTimeMillis() - dVar2.a > 0) {
                    p870.f().d(8, viewerToolbar2.l, Float.valueOf(f));
                }
                p870.f().d(7, viewerToolbar2.l, null);
            }
        }
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewPager) {
                parent.requestDisallowInterceptTouchEvent(true);
                break;
            }
            parent = parent.getParent();
        }
        this.j.a(motionEvent);
        return true;
    }

    public void setIgnoreMovementThreshold(int i) {
        this.k = i;
    }

    public void setLimitWidth(boolean z) {
        this.p = z;
    }

    public void setOnSeekBarChangeListener(a aVar) {
        this.m = aVar;
    }

    public void setStateListener(b bVar) {
        this.n = bVar;
    }

    public void setThumbDrawable(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        this.f = m33.a(i, context);
    }

    public void setValue(float f) {
        this.l = Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
        a();
        invalidate();
    }
}
