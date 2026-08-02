package com.bytedance.adsdk.sf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.sf.vj.tz;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends Drawable implements Animatable, Drawable.Callback {
    private Canvas atb;
    private Map<String, Typeface> dax;
    private int fum;
    private oo gbb;
    lo gm;
    private boolean gpj;
    private String hc;
    private com.bytedance.adsdk.sf.sf.pcc jr;
    private boolean jsj;
    private boolean kj;
    private Matrix kun;
    private com.bytedance.adsdk.sf.gm.gm.sf lo;
    private RectF lq;
    private boolean lrr;
    private boolean lu;
    private Bitmap mk;
    private Rect mu;
    private boolean nac;
    private RectF nn;
    private boolean of;
    private qf oo;
    private final ArrayList<pcc> ork;
    String pcc;
    private Rect pq;
    private boolean qf;
    private gpj qy;
    private View rj;
    private RectF rnn;
    gm sf;
    private com.bytedance.adsdk.sf.sf.sf tmg;
    private Matrix tsx;
    private final Matrix tsz;
    private boolean tz;
    private final ValueAnimator.AnimatorUpdateListener vh;
    private final com.bytedance.adsdk.sf.wh.gm vj;
    private sf vy;
    private boolean wh;
    private Rect ye;
    private boolean yt;
    private Paint zti;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(qf qfVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum sf {
        NONE,
        PLAY,
        RESUME
    }

    public vy() {
        com.bytedance.adsdk.sf.wh.gm gmVar = new com.bytedance.adsdk.sf.wh.gm();
        this.vj = gmVar;
        this.wh = true;
        this.qf = false;
        this.kj = false;
        this.vy = sf.NONE;
        this.ork = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.sf.vy.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (vy.this.lo != null) {
                    vy.this.lo.pcc(vy.this.vj.wh());
                }
            }
        };
        this.vh = animatorUpdateListener;
        this.lu = false;
        this.gpj = true;
        this.fum = 255;
        this.qy = gpj.AUTOMATIC;
        this.jsj = false;
        this.tsz = new Matrix();
        this.lrr = false;
        gmVar.addUpdateListener(animatorUpdateListener);
    }

    private void lq() {
        qf qfVar = this.oo;
        if (qfVar == null) {
            return;
        }
        this.jsj = this.qy.pcc(Build.VERSION.SDK_INT, qfVar.pcc(), qfVar.sf());
    }

    private com.bytedance.adsdk.sf.sf.pcc mu() {
        if (getCallback() == null) {
            return null;
        }
        if (this.jr == null) {
            com.bytedance.adsdk.sf.sf.pcc pccVar = new com.bytedance.adsdk.sf.sf.pcc(getCallback(), this.sf);
            this.jr = pccVar;
            String str = this.pcc;
            if (str != null) {
                pccVar.pcc(str);
            }
        }
        return this.jr;
    }

    private Context nn() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private void pcc(Canvas canvas, com.bytedance.adsdk.sf.gm.gm.sf sfVar) {
        if (this.oo == null || sfVar == null) {
            return;
        }
        rnn();
        canvas.getMatrix(this.tsx);
        canvas.getClipBounds(this.ye);
        pcc(this.ye, this.lq);
        this.tsx.mapRect(this.lq);
        pcc(this.lq, this.ye);
        boolean z = this.gpj;
        RectF rectF = this.rnn;
        if (z) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            sfVar.pcc(rectF, (Matrix) null, false);
        }
        this.tsx.mapRect(this.rnn);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        pcc(this.rnn, width, height);
        if (!tsx()) {
            RectF rectF2 = this.rnn;
            Rect rect = this.ye;
            rectF2.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.rnn.width());
        int ceil2 = (int) Math.ceil(this.rnn.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        sf(ceil, ceil2);
        if (this.lrr) {
            this.tsz.set(this.tsx);
            this.tsz.preScale(width, height);
            Matrix matrix = this.tsz;
            RectF rectF3 = this.rnn;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.mk.eraseColor(0);
            sfVar.pcc(this.atb, this.tsz, this.fum);
            this.tsx.invert(this.kun);
            this.kun.mapRect(this.nn, this.rnn);
            pcc(this.nn, this.mu);
        }
        this.pq.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.mk, this.pq, this.mu, this.zti);
    }

    private com.bytedance.adsdk.sf.sf.sf pq() {
        com.bytedance.adsdk.sf.sf.sf sfVar = this.tmg;
        if (sfVar != null && !sfVar.pcc(nn())) {
            this.tmg = null;
        }
        com.bytedance.adsdk.sf.sf.sf sfVar2 = this.tmg;
        if (sfVar2 != null) {
            return sfVar2;
        }
        com.bytedance.adsdk.sf.sf.sf sfVar3 = new com.bytedance.adsdk.sf.sf.sf(getCallback(), this.hc, this.gbb, this.oo.dax());
        this.tmg = sfVar3;
        return sfVar3;
    }

    private void rnn() {
        if (this.atb != null) {
            return;
        }
        this.atb = new Canvas();
        this.rnn = new RectF();
        this.tsx = new Matrix();
        this.kun = new Matrix();
        this.ye = new Rect();
        this.lq = new RectF();
        this.zti = new com.bytedance.adsdk.sf.pcc.pcc();
        this.pq = new Rect();
        this.mu = new Rect();
        this.nn = new RectF();
    }

    private void sf(int i, int i2) {
        Bitmap bitmap = this.mk;
        if (bitmap == null || bitmap.getWidth() < i || this.mk.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.mk = createBitmap;
            this.atb.setBitmap(createBitmap);
            this.lrr = true;
            return;
        }
        if (this.mk.getWidth() > i || this.mk.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.mk, 0, 0, i, i2);
            this.mk = createBitmap2;
            this.atb.setBitmap(createBitmap2);
            this.lrr = true;
        }
    }

    private boolean tsx() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private boolean zti() {
        return this.wh || this.qf;
    }

    public float atb() {
        return this.vj.wh();
    }

    public float dax() {
        return this.vj.ork();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        vj.pcc("Drawable#draw");
        try {
            if (this.jsj) {
                pcc(canvas, this.lo);
            } else {
                pcc(canvas);
            }
        } catch (Throwable unused) {
        }
        this.lrr = false;
        vj.sf("Drawable#draw");
    }

    public int fum() {
        return this.vj.getRepeatCount();
    }

    public float gbb() {
        return this.vj.jr();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.fum;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        qf qfVar = this.oo;
        if (qfVar == null) {
            return -1;
        }
        return qfVar.oo().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        qf qfVar = this.oo;
        if (qfVar == null) {
            return -1;
        }
        return qfVar.oo().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void gm(final String str) {
        qf qfVar = this.oo;
        if (qfVar == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.13
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar2) {
                    vy.this.gm(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.sf.gm.wh gm = qfVar.gm(str);
        if (gm != null) {
            sf((int) (gm.pcc + gm.sf));
        } else {
            a70.p(lnb.o("Cannot find marker with name ", str, "."));
        }
    }

    public int gpj() {
        return (int) this.vj.qf();
    }

    public void hc() {
        if (this.lo == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.7
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar) {
                    vy.this.hc();
                }
            });
            return;
        }
        lq();
        if (zti() || fum() == 0) {
            if (isVisible()) {
                this.vj.gbb();
                this.vy = sf.NONE;
            } else {
                this.vy = sf.RESUME;
            }
        }
        if (zti()) {
            return;
        }
        gm((int) (dax() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? gbb() : jr()));
        this.vj.tmg();
        if (isVisible()) {
            return;
        }
        this.vy = sf.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.lrr) {
            return;
        }
        this.lrr = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return tz();
    }

    public float jr() {
        return this.vj.dax();
    }

    public qf jsj() {
        return this.oo;
    }

    public lu kj() {
        qf qfVar = this.oo;
        if (qfVar != null) {
            return qfVar.gm();
        }
        return null;
    }

    public int lo() {
        return this.vj.getRepeatMode();
    }

    public void lu() {
        this.vj.removeAllListeners();
    }

    public void mk() {
        this.ork.clear();
        this.vj.hc();
        if (isVisible()) {
            return;
        }
        this.vy = sf.NONE;
    }

    public void nac() {
        this.vj.removeAllUpdateListeners();
        this.vj.addUpdateListener(this.vh);
    }

    public boolean of() {
        if (isVisible()) {
            return this.vj.isRunning();
        }
        sf sfVar = this.vy;
        return sfVar == sf.PLAY || sfVar == sf.RESUME;
    }

    public void oo(final String str) {
        qf qfVar = this.oo;
        if (qfVar == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.2
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar2) {
                    vy.this.oo(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.sf.gm.wh gm = qfVar.gm(str);
        if (gm == null) {
            a70.p(lnb.o("Cannot find marker with name ", str, "."));
        } else {
            int i = (int) gm.pcc;
            pcc(i, ((int) gm.sf) + i);
        }
    }

    public void ork() {
        if (this.vj.isRunning()) {
            this.vj.cancel();
            if (!isVisible()) {
                this.vy = sf.NONE;
            }
        }
        this.oo = null;
        this.lo = null;
        this.tmg = null;
        this.vj.kj();
        invalidateSelf();
    }

    public void qf(String str) {
        this.pcc = str;
        com.bytedance.adsdk.sf.sf.pcc mu = mu();
        if (mu != null) {
            mu.pcc(str);
        }
    }

    public boolean qy() {
        return this.dax == null && this.gm == null && this.oo.gbb().size() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.fum = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            sf sfVar = this.vy;
            if (sfVar == sf.PLAY) {
                vh();
                return visible;
            }
            if (sfVar == sf.RESUME) {
                hc();
                return visible;
            }
        } else {
            if (this.vj.isRunning()) {
                mk();
                this.vy = sf.RESUME;
                return visible;
            }
            if (isVisible) {
                this.vy = sf.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        vh();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        tmg();
    }

    public void tmg() {
        this.ork.clear();
        this.vj.tmg();
        if (isVisible()) {
            return;
        }
        this.vy = sf.NONE;
    }

    public void tsz() {
        this.ork.clear();
        this.vj.cancel();
        if (isVisible()) {
            return;
        }
        this.vy = sf.NONE;
    }

    public boolean tz() {
        com.bytedance.adsdk.sf.wh.gm gmVar = this.vj;
        if (gmVar == null) {
            return false;
        }
        return gmVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void vh() {
        if (this.lo == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.6
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar) {
                    vy.this.vh();
                }
            });
            return;
        }
        lq();
        if (zti() || fum() == 0) {
            if (isVisible()) {
                this.vj.vh();
                this.vy = sf.NONE;
            } else {
                this.vy = sf.PLAY;
            }
        }
        if (zti()) {
            return;
        }
        gm((int) (dax() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? gbb() : jr()));
        this.vj.tmg();
        if (isVisible()) {
            return;
        }
        this.vy = sf.NONE;
    }

    public Bitmap vj(String str) {
        com.bytedance.adsdk.sf.sf.sf pq = pq();
        if (pq != null) {
            return pq.pcc(str);
        }
        return null;
    }

    public boolean vy() {
        return this.yt;
    }

    public ork wh(String str) {
        qf qfVar = this.oo;
        if (qfVar == null) {
            return null;
        }
        return qfVar.dax().get(str);
    }

    public RectF ye() {
        return this.rnn;
    }

    public lo yt() {
        return this.gm;
    }

    public void kj(boolean z) {
        this.vj.gm(z);
    }

    public void qf(boolean z) {
        this.qf = z;
    }

    public boolean qf() {
        return this.jsj;
    }

    public void vj(boolean z) {
        this.yt = z;
    }

    public void vj(int i) {
        this.vj.setRepeatCount(i);
    }

    public boolean vj() {
        return this.lu;
    }

    public void wh(boolean z) {
        this.kj = z;
    }

    public gpj wh() {
        return this.jsj ? gpj.SOFTWARE : gpj.HARDWARE;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void gm(boolean z) {
        this.tz = z;
        qf qfVar = this.oo;
        if (qfVar != null) {
            qfVar.sf(z);
        }
    }

    public void oo(boolean z) {
        if (this.of == z) {
            return;
        }
        this.of = z;
        com.bytedance.adsdk.sf.gm.gm.sf sfVar = this.lo;
        if (sfVar != null) {
            sfVar.pcc(z);
        }
    }

    public boolean gm() {
        return this.gpj;
    }

    public void gm(float f) {
        this.vj.gm(f);
    }

    public void gm(final int i) {
        if (this.oo == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.4
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar) {
                    vy.this.gm(i);
                }
            });
        } else {
            this.vj.pcc(i);
        }
    }

    public String oo() {
        return this.hc;
    }

    public void oo(final float f) {
        if (this.oo == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.5
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar) {
                    vy.this.oo(f);
                }
            });
            return;
        }
        vj.pcc("Drawable#setProgress");
        this.vj.pcc(this.oo.pcc(f));
        vj.sf("Drawable#setProgress");
    }

    public void oo(int i) {
        this.vj.setRepeatMode(i);
    }

    public com.bytedance.adsdk.sf.gm.gm.sf sf() {
        return this.lo;
    }

    public void sf(boolean z) {
        this.lu = z;
    }

    public void sf(final int i) {
        if (this.oo == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.10
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar) {
                    vy.this.sf(i);
                }
            });
        } else {
            this.vj.sf(i + 0.99f);
        }
    }

    public void sf(final float f) {
        qf qfVar = this.oo;
        if (qfVar == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.11
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar2) {
                    vy.this.sf(f);
                }
            });
        } else {
            this.vj.sf(com.bytedance.adsdk.sf.wh.vj.pcc(qfVar.wh(), this.oo.qf(), f));
        }
    }

    public void sf(final String str) {
        qf qfVar = this.oo;
        if (qfVar == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.12
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar2) {
                    vy.this.sf(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.sf.gm.wh gm = qfVar.gm(str);
        if (gm != null) {
            pcc((int) gm.pcc);
        } else {
            a70.p(lnb.o("Cannot find marker with name ", str, "."));
        }
    }

    public void sf(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.vj.removeUpdateListener(animatorUpdateListener);
    }

    public void sf(Animator.AnimatorListener animatorListener) {
        this.vj.removeListener(animatorListener);
    }

    public void pcc(View view) {
        this.rj = view;
    }

    public View pcc() {
        return this.rj;
    }

    public void pcc(boolean z, Context context) {
        if (this.nac == z) {
            return;
        }
        this.nac = z;
        if (this.oo != null) {
            pcc(context);
        }
    }

    public void pcc(boolean z) {
        if (z != this.gpj) {
            this.gpj = z;
            com.bytedance.adsdk.sf.gm.gm.sf sfVar = this.lo;
            if (sfVar != null) {
                sfVar.sf(z);
            }
            invalidateSelf();
        }
    }

    public void pcc(String str) {
        this.hc = str;
    }

    public boolean pcc(qf qfVar, Context context) {
        if (this.oo == qfVar) {
            return false;
        }
        this.lrr = true;
        ork();
        this.oo = qfVar;
        pcc(context);
        this.vj.pcc(qfVar);
        oo(this.vj.getAnimatedFraction());
        Iterator it = new ArrayList(this.ork).iterator();
        while (it.hasNext()) {
            pcc pccVar = (pcc) it.next();
            if (pccVar != null) {
                pccVar.pcc(qfVar);
            }
            it.remove();
        }
        this.ork.clear();
        qfVar.sf(this.tz);
        lq();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void pcc(gpj gpjVar) {
        this.qy = gpjVar;
        lq();
    }

    private void pcc(Context context) {
        qf qfVar = this.oo;
        if (qfVar == null) {
            return;
        }
        com.bytedance.adsdk.sf.gm.gm.sf sfVar = new com.bytedance.adsdk.sf.gm.gm.sf(this, tz.pcc(qfVar), qfVar.hc(), qfVar, context);
        this.lo = sfVar;
        if (this.of) {
            sfVar.pcc(true);
        }
        this.lo.sf(this.gpj);
    }

    public void pcc(final int i) {
        if (this.oo == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.8
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar) {
                    vy.this.pcc(i);
                }
            });
        } else {
            this.vj.pcc(i);
        }
    }

    public void pcc(final float f) {
        qf qfVar = this.oo;
        if (qfVar == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.9
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar2) {
                    vy.this.pcc(f);
                }
            });
        } else {
            pcc((int) com.bytedance.adsdk.sf.wh.vj.pcc(qfVar.wh(), this.oo.qf(), f));
        }
    }

    public void pcc(final int i, final int i2) {
        if (this.oo == null) {
            this.ork.add(new pcc() { // from class: com.bytedance.adsdk.sf.vy.3
                @Override // com.bytedance.adsdk.sf.vy.pcc
                public void pcc(qf qfVar) {
                    vy.this.pcc(i, i2);
                }
            });
        } else {
            this.vj.pcc(i, i2 + 0.99f);
        }
    }

    public void pcc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.vj.addUpdateListener(animatorUpdateListener);
    }

    public void pcc(Animator.AnimatorListener animatorListener) {
        this.vj.addListener(animatorListener);
    }

    public void pcc(Boolean bool) {
        this.wh = bool.booleanValue();
    }

    public void pcc(oo ooVar) {
        this.gbb = ooVar;
        com.bytedance.adsdk.sf.sf.sf sfVar = this.tmg;
        if (sfVar != null) {
            sfVar.pcc(ooVar);
        }
    }

    public void pcc(gm gmVar) {
        this.sf = gmVar;
        com.bytedance.adsdk.sf.sf.pcc pccVar = this.jr;
        if (pccVar != null) {
            pccVar.pcc(gmVar);
        }
    }

    public void pcc(Map<String, Typeface> map) {
        if (map == this.dax) {
            return;
        }
        this.dax = map;
        invalidateSelf();
    }

    public void pcc(lo loVar) {
        this.gm = loVar;
    }

    public Bitmap pcc(String str, Bitmap bitmap) {
        com.bytedance.adsdk.sf.sf.sf pq = pq();
        if (pq == null) {
            return null;
        }
        Bitmap pcc2 = pq.pcc(str, bitmap);
        invalidateSelf();
        return pcc2;
    }

    public Typeface pcc(com.bytedance.adsdk.sf.gm.gm gmVar) {
        Map<String, Typeface> map = this.dax;
        if (map != null) {
            String pcc2 = gmVar.pcc();
            if (map.containsKey(pcc2)) {
                return map.get(pcc2);
            }
            String sf2 = gmVar.sf();
            if (map.containsKey(sf2)) {
                return map.get(sf2);
            }
            String str = gmVar.pcc() + "-" + gmVar.gm();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.sf.sf.pcc mu = mu();
        if (mu != null) {
            return mu.pcc(gmVar);
        }
        return null;
    }

    private void pcc(Canvas canvas) {
        com.bytedance.adsdk.sf.gm.gm.sf sfVar = this.lo;
        qf qfVar = this.oo;
        if (sfVar == null || qfVar == null) {
            return;
        }
        this.tsz.reset();
        if (!getBounds().isEmpty()) {
            this.tsz.preScale(r2.width() / qfVar.oo().width(), r2.height() / qfVar.oo().height());
            this.tsz.preTranslate(r2.left, r2.top);
        }
        sfVar.pcc(canvas, this.tsz, this.fum);
    }

    private void pcc(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void pcc(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void pcc(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }
}
