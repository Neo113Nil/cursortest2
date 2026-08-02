package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.android.defaultplayer.control.s;
import com.vk.movika.sdk.base.model.LayoutParams;
import com.vk.movika.sdk.base.model.props.AreaProps;
import com.vk.movika.sdk.base.model.props.BackgroundProps;
import com.vk.movika.sdk.base.model.props.BorderProps;
import com.vk.movika.sdk.base.model.props.ShapeProps;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.epx;
import xsna.fpf0;
import xsna.p5j;
import xsna.qcy;
import xsna.swe0;
import xsna.x9;

/* loaded from: classes3.dex */
public class h extends View {
    public boolean b;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c c;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c d;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c e;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c f;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c g;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c h;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c i;
    public final Paint j;
    public final Path k;
    public q l;
    public s.c m;
    public static final /* synthetic */ qcy<Object>[] n = {new MutablePropertyReference1Impl(h.class, "controlLayoutParams", "getControlLayoutParams()Lcom/vk/movika/sdk/base/model/LayoutParams;", 0), p5j.a(0, h.class, "drawFakeFocus", "getDrawFakeFocus()Z", fpf0.a), new MutablePropertyReference1Impl(h.class, "areaProps", "getAreaProps()Lcom/vk/movika/sdk/base/model/props/AreaProps;", 0), new MutablePropertyReference1Impl(h.class, "fallbackBackgroundColor", "getFallbackBackgroundColor()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(h.class, "fallbackBackgroundAlpha", "getFallbackBackgroundAlpha()D", 0), new MutablePropertyReference1Impl(h.class, "fallbackBorderColor", "getFallbackBorderColor()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(h.class, "fallbackBorderAlpha", "getFallbackBorderAlpha()D", 0)};
    public static final a Companion = new a();

    public static final class a {
    }

    public h(Context context) {
        super(context);
        this.b = true;
        this.c = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, null, 14);
        this.d = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Boolean.FALSE, null, 14);
        this.e = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, null, 14);
        this.f = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#ffffff", null, 14);
        Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.g = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, valueOf, null, 14);
        this.h = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#000000", null, 14);
        this.i = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, valueOf, null, 14);
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.STROKE);
        this.j = c;
        this.k = new Path();
    }

    public final AreaProps getAreaProps() {
        qcy<Object> qcyVar = n[2];
        return (AreaProps) this.e.b;
    }

    public LayoutParams getControlLayoutParams() {
        qcy<Object> qcyVar = n[0];
        return (LayoutParams) this.c.b;
    }

    public final boolean getDrawFakeFocus() {
        qcy<Object> qcyVar = n[1];
        return ((Boolean) this.d.b).booleanValue();
    }

    public final double getFallbackBackgroundAlpha() {
        qcy<Object> qcyVar = n[4];
        return ((Number) this.g.b).doubleValue();
    }

    public final String getFallbackBackgroundColor() {
        qcy<Object> qcyVar = n[3];
        return (String) this.f.b;
    }

    public final double getFallbackBorderAlpha() {
        qcy<Object> qcyVar = n[6];
        return ((Number) this.i.b).doubleValue();
    }

    public final String getFallbackBorderColor() {
        qcy<Object> qcyVar = n[5];
        return (String) this.h.b;
    }

    public final boolean getInteractionEnabled() {
        return this.b;
    }

    public final q getOnTapListener() {
        return this.l;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String fallbackBackgroundColor;
        ShapeProps shapeProps;
        Double d;
        Double d2;
        AreaProps areaProps = getAreaProps();
        BorderProps borderProps = null;
        ShapeProps shapeProps2 = areaProps != null ? areaProps.b : null;
        ShapeProps.Type type = shapeProps2 != null ? shapeProps2.b : null;
        ShapeProps.Type type2 = ShapeProps.Type.RECTANGLE;
        Path path = this.k;
        if (type != type2 || (d2 = shapeProps2.c) == null || d2.doubleValue() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            path.reset();
            path.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), Path.Direction.CW);
        } else {
            float min = (float) Math.min(com.vk.movika.sdk.android.defaultplayer.utils.b.a(getControlLayoutParams(), this, shapeProps2.c.doubleValue()), Math.min(getWidth(), getHeight()) / 2.0d);
            float width = getWidth();
            float height = getHeight();
            path.reset();
            path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, min, min, Path.Direction.CW);
        }
        canvas.clipPath(path);
        AreaProps areaProps2 = getAreaProps();
        BackgroundProps backgroundProps = areaProps2 != null ? areaProps2.a : null;
        if (backgroundProps == null || (fallbackBackgroundColor = backgroundProps.c) == null) {
            fallbackBackgroundColor = getFallbackBackgroundColor();
        }
        canvas.drawColor(com.vk.movika.sdk.android.defaultplayer.utils.a.a(fallbackBackgroundColor, Double.valueOf((backgroundProps == null || (d = backgroundProps.d) == null) ? getFallbackBackgroundAlpha() : d.doubleValue())));
        AreaProps areaProps3 = getAreaProps();
        if (areaProps3 != null && (shapeProps = areaProps3.b) != null) {
            borderProps = shapeProps.a;
        }
        if (borderProps != null) {
            Double d3 = borderProps.a;
            if (epx.b(d3, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) || d3 == null) {
                return;
            }
            Double d4 = borderProps.c;
            double doubleValue = d4 != null ? d4.doubleValue() : getFallbackBorderAlpha();
            String str = borderProps.b;
            if (str == null) {
                str = getFallbackBorderColor();
            }
            float a2 = (float) (com.vk.movika.sdk.android.defaultplayer.utils.b.a(getControlLayoutParams(), this, d3.doubleValue()) * 2.0d);
            Paint paint = this.j;
            paint.setStrokeWidth(a2);
            paint.setColor((getDrawFakeFocus() || isFocused()) ? Color.parseColor("#FFFFFF") : com.vk.movika.sdk.android.defaultplayer.utils.a.a(str, Double.valueOf(doubleValue)));
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q qVar;
        ValueAnimator valueAnimator;
        q qVar2;
        ValueAnimator valueAnimator2;
        int i = 0;
        if (hasOnClickListeners() && this.b && getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            s.c cVar = null;
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                LayoutParams controlLayoutParams = getControlLayoutParams();
                if (controlLayoutParams != null) {
                    q qVar3 = this.l;
                    if (qVar3 != null) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        s sVar = (s) qVar3;
                        float f = sVar.c;
                        Double d = controlLayoutParams.a;
                        float f2 = swe0.f((float) (((d != null ? d.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * sVar.getWidth()) + x), f, sVar.getWidth() - f);
                        Double d2 = controlLayoutParams.b;
                        s.c cVar2 = new s.c(f2, swe0.f((float) (((d2 != null ? d2.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * sVar.getHeight()) + y), f, sVar.getHeight() - f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        Paint paint = new Paint();
                        paint.setColor(16777215);
                        paint.setAlpha(40);
                        Paint paint2 = new Paint();
                        paint2.setColor(16777215);
                        paint2.setAlpha(142);
                        paint2.setStyle(Paint.Style.STROKE);
                        s.b bVar = new s.b(ofFloat, paint, paint2);
                        sVar.b.put(cVar2, bVar);
                        ofFloat.setDuration(100L);
                        ofFloat.addUpdateListener(new r(i, bVar, sVar));
                        ofFloat.start();
                        cVar = cVar2;
                    }
                    this.m = cVar;
                }
                animate().alpha(0.5f).setDuration(100L);
                return true;
            }
            if (valueOf != null && valueOf.intValue() == 1) {
                s.c cVar3 = this.m;
                if (cVar3 != null && (qVar2 = this.l) != null) {
                    s sVar2 = (s) qVar2;
                    s.b bVar2 = (s.b) sVar2.b.get(cVar3);
                    if (bVar2 != null && (valueAnimator2 = bVar2.a) != null) {
                        valueAnimator2.reverse();
                        valueAnimator2.addListener(new t(sVar2, cVar3, valueAnimator2));
                    }
                }
                this.m = null;
                animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L);
                return performClick();
            }
            if (valueOf != null && valueOf.intValue() == 3) {
                s.c cVar4 = this.m;
                if (cVar4 != null && (qVar = this.l) != null) {
                    s sVar3 = (s) qVar;
                    s.b bVar3 = (s.b) sVar3.b.remove(cVar4);
                    if (bVar3 != null && (valueAnimator = bVar3.a) != null) {
                        valueAnimator.cancel();
                        valueAnimator.removeAllListeners();
                        sVar3.invalidate();
                    }
                }
                this.m = null;
                setAlpha(1.0f);
                return true;
            }
        }
        return false;
    }

    public final void setAreaProps(AreaProps areaProps) {
        qcy<Object> qcyVar = n[2];
        this.e.c(areaProps);
    }

    public void setControlLayoutParams(LayoutParams layoutParams) {
        qcy<Object> qcyVar = n[0];
        this.c.c(layoutParams);
    }

    public final void setDrawFakeFocus(boolean z) {
        qcy<Object> qcyVar = n[1];
        this.d.c(Boolean.valueOf(z));
    }

    public final void setFallbackBackgroundAlpha(double d) {
        qcy<Object> qcyVar = n[4];
        this.g.c(Double.valueOf(d));
    }

    public final void setFallbackBackgroundColor(String str) {
        qcy<Object> qcyVar = n[3];
        this.f.c(str);
    }

    public final void setFallbackBorderAlpha(double d) {
        qcy<Object> qcyVar = n[6];
        this.i.c(Double.valueOf(d));
    }

    public final void setFallbackBorderColor(String str) {
        qcy<Object> qcyVar = n[5];
        this.h.c(str);
    }

    public final void setInteractionEnabled(boolean z) {
        this.b = z;
    }

    public final void setOnTapListener(q qVar) {
        this.l = qVar;
    }

    public h(Context context, int i) {
        super(context, null);
        this.b = true;
        this.c = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, null, 14);
        this.d = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Boolean.FALSE, null, 14);
        this.e = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, null, 14);
        this.f = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#ffffff", null, 14);
        Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.g = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, valueOf, null, 14);
        this.h = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#000000", null, 14);
        this.i = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, valueOf, null, 14);
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.STROKE);
        this.j = c;
        this.k = new Path();
    }
}
