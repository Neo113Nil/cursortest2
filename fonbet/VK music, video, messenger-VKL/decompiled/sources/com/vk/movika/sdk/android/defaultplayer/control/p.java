package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.base.model.LayoutParams;
import com.vk.movika.sdk.base.model.props.AreaProps;
import com.vk.movika.sdk.base.model.props.ButtonProps;
import com.vk.movika.sdk.base.model.props.TextProps;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an10;
import xsna.drm0;
import xsna.fpf0;
import xsna.p5j;
import xsna.qcy;

/* loaded from: classes3.dex */
public class p extends h {
    public final com.vk.movika.sdk.android.defaultplayer.utils.c A;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c B;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c C;
    public final ValueAnimator D;
    public final Path E;
    public boolean F;
    public float G;
    public final boolean o;
    public final TextPaint p;
    public final Paint q;
    public int r;
    public int s;
    public List<String> t;
    public int u;
    public ButtonProps v;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c w;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c x;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c y;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c z;
    public static final /* synthetic */ qcy<Object>[] H = {new MutablePropertyReference1Impl(p.class, "typeface", "getTypeface()Landroid/graphics/Typeface;", 0), p5j.a(0, p.class, "fallbackTextColor", "getFallbackTextColor()Ljava/lang/String;", fpf0.a), new MutablePropertyReference1Impl(p.class, "fallbackTextAlpha", "getFallbackTextAlpha()D", 0), new MutablePropertyReference1Impl(p.class, "fallbackTextSize", "getFallbackTextSize()D", 0), new MutablePropertyReference1Impl(p.class, "fallbackTextHorizontalGravity", "getFallbackTextHorizontalGravity()Lcom/vk/movika/sdk/base/model/props/TextProps$GravityHorizontal;", 0), new MutablePropertyReference1Impl(p.class, "fallbackTextVerticalGravity", "getFallbackTextVerticalGravity()Lcom/vk/movika/sdk/base/model/props/TextProps$GravityVertical;", 0), new MutablePropertyReference1Impl(p.class, NotificationCompat.CATEGORY_PROGRESS, "getProgress()F", 0)};
    public static final a Companion = new a();
    public static final TextProps.GravityHorizontal I = TextProps.GravityHorizontal.CENTER;
    public static final TextProps.GravityVertical J = TextProps.GravityVertical.CENTER;

    public static final class a {
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TextProps.GravityVertical.values().length];
            try {
                iArr[TextProps.GravityVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextProps.GravityVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextProps.GravityVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[TextProps.GravityHorizontal.values().length];
            try {
                iArr2[TextProps.GravityHorizontal.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TextProps.GravityHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TextProps.GravityHorizontal.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public p(Context context) {
        super(context);
        this.o = true;
        TextPaint textPaint = new TextPaint();
        textPaint.setElegantTextHeight(true);
        this.p = textPaint;
        Paint paint = new Paint();
        paint.setColor(11391999);
        this.q = paint;
        this.t = EmptyList.b;
        int i = 0;
        this.w = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, new l(this, i), 6);
        this.x = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#000000", null, 14);
        this.y = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Double.valueOf(1.0d), null, 14);
        this.z = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Double.valueOf(0.4d), null, 14);
        this.A = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, I, null, 14);
        this.B = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, J, null, 14);
        this.C = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, 14);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.D = ofFloat;
        this.E = new Path();
        setFallbackBackgroundColor("#ffffff");
        setFallbackBackgroundAlpha(1.0d);
        setFallbackBorderColor("#ff0000");
        setFallbackBorderAlpha(1.0d);
        ofFloat.addUpdateListener(new m(this, i));
    }

    public static final void b(p pVar, ValueAnimator valueAnimator) {
        pVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final int getFontHeight() {
        return this.r + this.s;
    }

    private final float getProgress() {
        qcy<Object> qcyVar = H[6];
        return ((Number) this.C.b).floatValue();
    }

    private final void setProgress(float f) {
        qcy<Object> qcyVar = H[6];
        this.C.c(Float.valueOf(f));
    }

    public void a(Canvas canvas) {
        Paint paint = this.q;
        paint.setAlpha((int) (255 * ((getProgress() * 0.24d) + 0.06d)));
        Path path = this.E;
        path.reset();
        if (this.F) {
            path.setLastPoint(getWidth(), getHeight());
            path.lineTo(getWidth() - (getWidth() * getProgress()), getHeight());
            path.lineTo(getWidth() - ((getWidth() * getProgress()) - (getHeight() * this.G)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.lineTo(getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            path.setLastPoint(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight());
            path.lineTo(getWidth() * getProgress(), getHeight());
            path.lineTo((getHeight() * this.G) + (getWidth() * getProgress()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    public final void c() {
        String fallbackTextColor;
        TextProps.GravityHorizontal fallbackTextHorizontalGravity;
        Paint.Align align;
        Double d;
        Double d2;
        ButtonProps buttonProps = this.v;
        TextProps textProps = buttonProps != null ? buttonProps.a : null;
        double fallbackTextSize = (textProps == null || (d2 = textProps.e) == null) ? getFallbackTextSize() * getHeight() : com.vk.movika.sdk.android.defaultplayer.utils.b.a(getControlLayoutParams(), this, d2.doubleValue());
        if (textProps == null || (fallbackTextColor = textProps.d) == null) {
            fallbackTextColor = getFallbackTextColor();
        }
        int a2 = com.vk.movika.sdk.android.defaultplayer.utils.a.a(fallbackTextColor, Double.valueOf((textProps == null || (d = textProps.f) == null) ? getFallbackTextAlpha() : d.doubleValue()));
        if (textProps == null || (fallbackTextHorizontalGravity = textProps.b) == null) {
            fallbackTextHorizontalGravity = getFallbackTextHorizontalGravity();
        }
        TextPaint textPaint = this.p;
        textPaint.setTextSize((float) fallbackTextSize);
        textPaint.setColor(a2);
        int i = b.b[fallbackTextHorizontalGravity.ordinal()];
        if (i == 1) {
            align = Paint.Align.LEFT;
        } else if (i == 2) {
            align = Paint.Align.CENTER;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            align = Paint.Align.RIGHT;
        }
        textPaint.setTextAlign(align);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        this.r = -an10.b(fontMetrics.ascent);
        int b2 = an10.b(fontMetrics.descent);
        this.s = b2;
        this.u = this.t.size() * (this.r + b2);
    }

    public boolean getAnimateOnEnable() {
        return this.o;
    }

    public final ButtonProps getButtonProps() {
        return this.v;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.h
    public LayoutParams getControlLayoutParams() {
        return super.getControlLayoutParams();
    }

    public final double getFallbackTextAlpha() {
        qcy<Object> qcyVar = H[2];
        return ((Number) this.y.b).doubleValue();
    }

    public final String getFallbackTextColor() {
        qcy<Object> qcyVar = H[1];
        return (String) this.x.b;
    }

    public final TextProps.GravityHorizontal getFallbackTextHorizontalGravity() {
        qcy<Object> qcyVar = H[4];
        return (TextProps.GravityHorizontal) this.A.b;
    }

    public final double getFallbackTextSize() {
        qcy<Object> qcyVar = H[3];
        return ((Number) this.z.b).doubleValue();
    }

    public final TextProps.GravityVertical getFallbackTextVerticalGravity() {
        qcy<Object> qcyVar = H[5];
        return (TextProps.GravityVertical) this.B.b;
    }

    public final Typeface getTypeface() {
        qcy<Object> qcyVar = H[0];
        return (Typeface) this.w.b;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.h, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        a(canvas);
        ButtonProps buttonProps = this.v;
        TextProps textProps = buttonProps != null ? buttonProps.a : null;
        if ((textProps != null ? textProps.a : null) == null || this.t.isEmpty()) {
            return;
        }
        TextProps.GravityHorizontal gravityHorizontal = textProps.b;
        if (gravityHorizontal == null) {
            gravityHorizontal = getFallbackTextHorizontalGravity();
        }
        TextProps.GravityVertical gravityVertical = textProps.c;
        if (gravityVertical == null) {
            gravityVertical = getFallbackTextVerticalGravity();
        }
        int i = b.b[gravityHorizontal.ordinal()];
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i == 1) {
            f = 0.0f;
        } else if (i == 2) {
            f = getWidth() / 2.0f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = getWidth();
        }
        int i2 = this.u;
        int i3 = b.a[gravityVertical.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                f2 = (getHeight() - i2) / 2.0f;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = getHeight() - i2;
            }
        }
        Iterator<T> it = this.t.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            canvas.drawText((String) it.next(), f, i4 + f2 + this.r, this.p);
            i4 += getFontHeight();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    public final void setButtonProps(ButtonProps buttonProps) {
        TextProps textProps;
        String str;
        this.v = buttonProps;
        setAreaProps(new AreaProps(buttonProps != null ? buttonProps.b : null, buttonProps != null ? buttonProps.c : null));
        this.t = (buttonProps == null || (textProps = buttonProps.a) == null || (str = textProps.a) == null) ? EmptyList.b : drm0.b0(str, new char[]{'\n'}, 0, 6);
        c();
        invalidate();
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.h
    public void setControlLayoutParams(LayoutParams layoutParams) {
        if ((layoutParams != null ? layoutParams.e : null) != null) {
            this.G = (float) Math.tan(layoutParams.e.doubleValue());
            this.F = Math.cos(layoutParams.e.doubleValue()) < ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        super.setControlLayoutParams(layoutParams);
    }

    public final void setFallbackTextAlpha(double d) {
        qcy<Object> qcyVar = H[2];
        this.y.c(Double.valueOf(d));
    }

    public final void setFallbackTextColor(String str) {
        qcy<Object> qcyVar = H[1];
        this.x.c(str);
    }

    public final void setFallbackTextHorizontalGravity(TextProps.GravityHorizontal gravityHorizontal) {
        qcy<Object> qcyVar = H[4];
        this.A.c(gravityHorizontal);
    }

    public final void setFallbackTextSize(double d) {
        qcy<Object> qcyVar = H[3];
        this.z.c(Double.valueOf(d));
    }

    public final void setFallbackTextVerticalGravity(TextProps.GravityVertical gravityVertical) {
        qcy<Object> qcyVar = H[5];
        this.B.c(gravityVertical);
    }

    public final void setTypeface(Typeface typeface) {
        qcy<Object> qcyVar = H[0];
        this.w.c(typeface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i) {
        super(context, 0);
        int i2 = 0;
        this.o = true;
        TextPaint textPaint = new TextPaint();
        textPaint.setElegantTextHeight(true);
        this.p = textPaint;
        Paint paint = new Paint();
        paint.setColor(11391999);
        this.q = paint;
        this.t = EmptyList.b;
        u uVar = (u) this;
        this.w = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, new n(uVar, i2), 6);
        this.x = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#000000", null, 14);
        this.y = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Double.valueOf(1.0d), null, 14);
        this.z = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Double.valueOf(0.4d), null, 14);
        this.A = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, I, null, 14);
        this.B = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, J, null, 14);
        this.C = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, 14);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.D = ofFloat;
        this.E = new Path();
        setFallbackBackgroundColor("#ffffff");
        setFallbackBackgroundAlpha(1.0d);
        setFallbackBorderColor("#ff0000");
        setFallbackBorderAlpha(1.0d);
        ofFloat.addUpdateListener(new o(uVar, i2));
    }
}
