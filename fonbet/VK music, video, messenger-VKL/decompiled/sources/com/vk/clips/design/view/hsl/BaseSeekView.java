package com.vk.clips.design.view.hsl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dn70;
import xsna.izs;
import xsna.qq2;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: BaseSeekView.kt */
/* loaded from: classes16.dex */
public abstract class BaseSeekView extends View implements ValueAnimator.AnimatorUpdateListener {
    public final float b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public ValueAnimator f;
    public izs<? super Float, s3q0> g;
    public float h;
    public Zone i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseSeekView.kt */
    public static final class Zone {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Zone[] $VALUES;
        public static final Zone None;
        public static final Zone Seek;
        public static final Zone Thumb;

        static {
            Zone zone = new Zone("Thumb", 0);
            Thumb = zone;
            Zone zone2 = new Zone("Seek", 1);
            Seek = zone2;
            Zone zone3 = new Zone("None", 2);
            None = zone3;
            Zone[] zoneArr = {zone, zone2, zone3};
            $VALUES = zoneArr;
            $ENTRIES = new asp(zoneArr);
        }

        public Zone() {
            throw null;
        }

        public static Zone valueOf(String str) {
            return (Zone) Enum.valueOf(Zone.class, str);
        }

        public static Zone[] values() {
            return (Zone[]) $VALUES.clone();
        }
    }

    /* compiled from: BaseSeekView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Zone.values().length];
            try {
                iArr[Zone.Thumb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Zone.Seek.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Zone.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseSeekView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b() {
        RectF rectF = this.d;
        float width = (rectF.width() * this.h) + rectF.left;
        float f = this.b;
        float f2 = width - (f / 2.0f);
        RectF rectF2 = this.e;
        rectF2.left = f2;
        rectF2.right = f2 + f;
    }

    public final void c(float f) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f = null;
        float f2 = this.h;
        if (f2 == f) {
            d(f, false);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(qq2.f);
        ofFloat.addUpdateListener(this);
        ofFloat.start();
        this.f = ofFloat;
    }

    public void d(float f, boolean z) {
        izs<? super Float, s3q0> izsVar;
        if (this.h == f) {
            return;
        }
        this.h = f;
        if (z && (izsVar = this.g) != null) {
            izsVar.invoke(Float.valueOf(f));
        }
        invalidate();
    }

    public final float getInternalValue() {
        return this.h;
    }

    public final izs<Float, s3q0> getOnSeekListener() {
        return this.g;
    }

    public final RectF getTrackBound() {
        return this.d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d(((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b();
        a();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.c;
        rectF.left = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        this.e.set(rectF);
        b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        int action = motionEvent.getAction();
        RectF rectF = this.d;
        if (action == 0) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            getParent().requestDisallowInterceptTouchEvent(true);
            RectF rectF2 = this.e;
            this.i = (rectF2.left > x || rectF2.right < x) ? (rectF.left > x || rectF.right < x) ? Zone.None : Zone.Seek : Zone.Thumb;
            return true;
        }
        if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.i = Zone.None;
            return false;
        }
        if (action == 2) {
            float f = rectF.left;
            float width = x <= f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : x >= rectF.right ? 1.0f : (x - f) / rectF.width();
            if (width > 0.49f && width < 0.51f) {
                width = 0.5f;
            }
            int i = a.$EnumSwitchMapping$0[this.i.ordinal()];
            if (i == 1 || i == 2) {
                d(width, true);
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public final void setInternalValue(float f) {
        this.h = f;
    }

    public final void setOnSeekListener(izs<? super Float, s3q0> izsVar) {
        this.g = izsVar;
    }

    public BaseSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = dn70.a() * 40.0f;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.i = Zone.None;
    }

    public void a() {
    }
}
