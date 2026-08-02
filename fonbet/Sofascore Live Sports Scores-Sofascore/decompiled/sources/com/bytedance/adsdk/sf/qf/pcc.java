package com.bytedance.adsdk.sf.qf;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.sf.qf;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc<T> {
    private float dax;
    private int gbb;
    public final Interpolator gm;
    private int hc;
    private float jr;
    public PointF kj;
    public final Interpolator oo;
    private final qf ork;
    public final T pcc;
    public Float qf;
    public T sf;
    private float tmg;
    private float vh;
    public final Interpolator vj;
    public PointF vy;
    public final float wh;

    public pcc(T t) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = null;
        this.pcc = t;
        this.sf = t;
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.wh = Float.MIN_VALUE;
        this.qf = Float.valueOf(Float.MAX_VALUE);
    }

    public float gm() {
        qf qfVar = this.ork;
        if (qfVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.jr;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float wh = (this.wh - qfVar.wh()) / this.ork.nac();
        this.jr = wh;
        return wh;
    }

    public int kj() {
        int i = this.hc;
        if (i != 784923401) {
            return i;
        }
        int intValue = ((Integer) this.pcc).intValue();
        this.hc = intValue;
        return intValue;
    }

    public float oo() {
        if (this.ork == null) {
            return 1.0f;
        }
        float f = this.dax;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.qf == null) {
            this.dax = 1.0f;
            return 1.0f;
        }
        float floatValue = ((this.qf.floatValue() - this.wh) / this.ork.nac()) + gm();
        this.dax = floatValue;
        return floatValue;
    }

    public boolean pcc(float f) {
        return f >= gm() && f < oo();
    }

    public float qf() {
        float f = this.tmg;
        if (f != -3987645.8f) {
            return f;
        }
        float floatValue = ((Float) this.sf).floatValue();
        this.tmg = floatValue;
        return floatValue;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.pcc + ", endValue=" + this.sf + ", startFrame=" + this.wh + ", endFrame=" + this.qf + ", interpolator=" + this.gm + '}';
    }

    public boolean vj() {
        return this.gm == null && this.oo == null && this.vj == null;
    }

    public int vy() {
        int i = this.gbb;
        if (i != 784923401) {
            return i;
        }
        int intValue = ((Integer) this.sf).intValue();
        this.gbb = intValue;
        return intValue;
    }

    public float wh() {
        float f = this.vh;
        if (f != -3987645.8f) {
            return f;
        }
        float floatValue = ((Float) this.pcc).floatValue();
        this.vh = floatValue;
        return floatValue;
    }

    public pcc<T> pcc(T t, T t2) {
        return new pcc<>(t, t2);
    }

    public pcc(qf qfVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = qfVar;
        this.pcc = t;
        this.sf = t2;
        this.gm = null;
        this.oo = interpolator;
        this.vj = interpolator2;
        this.wh = f;
        this.qf = f2;
    }

    public pcc(qf qfVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = qfVar;
        this.pcc = t;
        this.sf = t2;
        this.gm = interpolator;
        this.oo = interpolator2;
        this.vj = interpolator3;
        this.wh = f;
        this.qf = f2;
    }

    public pcc(qf qfVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = qfVar;
        this.pcc = t;
        this.sf = t2;
        this.gm = interpolator;
        this.oo = null;
        this.vj = null;
        this.wh = f;
        this.qf = f2;
    }

    private pcc(T t, T t2) {
        this.vh = -3987645.8f;
        this.tmg = -3987645.8f;
        this.hc = 784923401;
        this.gbb = 784923401;
        this.jr = Float.MIN_VALUE;
        this.dax = Float.MIN_VALUE;
        this.kj = null;
        this.vy = null;
        this.ork = null;
        this.pcc = t;
        this.sf = t2;
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.wh = Float.MIN_VALUE;
        this.qf = Float.valueOf(Float.MAX_VALUE);
    }
}
