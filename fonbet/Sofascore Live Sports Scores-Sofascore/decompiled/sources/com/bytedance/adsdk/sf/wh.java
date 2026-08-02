package com.bytedance.adsdk.sf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.sf.qf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends ImageView {
    private static final String pcc = "wh";
    private static final vh<Throwable> sf = new vh<Throwable>() { // from class: com.bytedance.adsdk.sf.wh.1
        @Override // com.bytedance.adsdk.sf.vh
        public void pcc(Throwable th) {
            com.bytedance.adsdk.sf.wh.wh.pcc(th);
        }
    };
    private sf atb;
    private qf dax;
    private com.bytedance.adsdk.sf.gm.gm.gm fum;
    private final Set<Object> gbb;
    private final vh<qf> gm;
    private Handler gpj;
    private final Set<oo> hc;
    private hc<qf> jr;
    private String jsj;
    private String kj;
    private long lo;
    private int lu;
    private final Runnable mk;
    private final Handler nac;
    private int of;
    private final vh<Throwable> oo;
    private boolean ork;
    private final vy qf;
    private int qy;
    private boolean tmg;
    private JSONArray tsz;
    private int tz;
    private boolean vh;
    private vh<Throwable> vj;
    private int vy;
    private int wh;
    private pcc ye;
    private int yt;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.sf.wh$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            pcc = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum oo {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
    }

    public wh(Context context) {
        super(context);
        this.gm = new vh<qf>() { // from class: com.bytedance.adsdk.sf.wh.6
            @Override // com.bytedance.adsdk.sf.vh
            public void pcc(qf qfVar) {
                wh.this.setComposition(qfVar);
            }
        };
        this.oo = new vh<Throwable>() { // from class: com.bytedance.adsdk.sf.wh.7
            @Override // com.bytedance.adsdk.sf.vh
            public void pcc(Throwable th) {
                if (wh.this.wh != 0) {
                    wh whVar = wh.this;
                    whVar.setImageResource(whVar.wh);
                }
                (wh.this.vj == null ? wh.sf : wh.this.vj).pcc(th);
            }
        };
        this.wh = 0;
        this.qf = new vy();
        this.ork = false;
        this.vh = false;
        this.tmg = true;
        this.hc = new HashSet();
        this.gbb = new HashSet();
        this.nac = new Handler(Looper.getMainLooper());
        this.lu = 0;
        this.lo = 0L;
        this.mk = new Runnable() { // from class: com.bytedance.adsdk.sf.wh.4
            @Override // java.lang.Runnable
            public void run() {
                int unused = wh.this.tz;
                int unused2 = wh.this.of;
                int i = wh.this.tz;
                int i2 = wh.this.of;
                wh whVar = wh.this;
                if (i > i2) {
                    wh.lu(whVar);
                    com.bytedance.adsdk.sf.gm.gm.gm gmVar = wh.this.fum;
                    StringBuilder sb = new StringBuilder();
                    sb.append(wh.this.tz);
                    gmVar.pcc(sb.toString());
                    wh.this.invalidate();
                    wh.this.jr();
                    return;
                }
                if (whVar.yt < 0 || wh.this.qy < 0) {
                    int unused3 = wh.this.yt;
                    int unused4 = wh.this.qy;
                } else {
                    int unused5 = wh.this.yt;
                    wh.this.pcc();
                    wh whVar2 = wh.this;
                    whVar2.setFrame(whVar2.yt);
                    wh.this.pcc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.sf.wh.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (wh.this.getFrame() < wh.this.qy - 1 || wh.this.getFrame() >= wh.this.qy + 2) {
                                return;
                            }
                            int unused6 = wh.this.qy;
                            wh.this.sf(this);
                            wh.this.wh();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(wh.this.jsj) || (wh.this.tsz != null && wh.this.tsz.length() > 0)) && wh.this.atb != null) {
                    sf unused6 = wh.this.atb;
                    String unused7 = wh.this.jsj;
                    JSONArray unused8 = wh.this.tsz;
                }
            }
        };
        kj();
    }

    private void dax() {
        this.nac.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gbb() {
        vy vyVar;
        int i;
        int i2;
        final int i3;
        com.bytedance.adsdk.sf.gm.gm.gm gm2;
        if (this.dax == null || (vyVar = this.qf) == null) {
            return;
        }
        lo yt = vyVar.yt();
        qf.gm kj = this.dax.kj();
        if (kj == null || yt == null) {
            return;
        }
        final int i4 = kj.pcc;
        if (i4 < 0) {
            "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4));
            return;
        }
        int[] iArr = kj.vj;
        final int i5 = -1;
        if (iArr == null || iArr.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i2 = iArr[0];
            i = iArr[1];
        }
        String pcc2 = yt.pcc(kj.gm);
        String pcc3 = yt.pcc(kj.oo);
        try {
            i3 = Integer.parseInt(pcc2);
            try {
                i5 = Integer.parseInt(pcc3);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        boolean isEmpty = TextUtils.isEmpty(kj.sf);
        String str = kj.sf;
        if (isEmpty || (gm2 = gm(str)) == null) {
            return;
        }
        this.jsj = kj.wh;
        this.tsz = kj.qf;
        this.fum = gm2;
        this.tz = i3;
        this.of = i3 - i5;
        this.yt = i2;
        this.qy = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.tz);
        gm2.pcc(sb.toString());
        pcc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.sf.wh.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (wh.this.getFrame() < i4 - 1 || wh.this.getFrame() >= i4 + 2) {
                    return;
                }
                wh.this.getFrame();
                wh.this.sf(this);
                if (i3 >= 0 && i5 >= 0) {
                    wh.this.jr();
                }
                wh.this.wh();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qf.pcc getGlobalConfig() {
        qf jsj;
        vy vyVar = this.qf;
        if (vyVar == null || (jsj = vyVar.jsj()) == null) {
            return null;
        }
        return jsj.vh();
    }

    private qf.sf getGlobalEvent() {
        qf jsj;
        vy vyVar = this.qf;
        if (vyVar == null || (jsj = vyVar.jsj()) == null) {
            return null;
        }
        return jsj.ork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        qf jsj;
        vy vyVar = this.qf;
        if (vyVar == null || (jsj = vyVar.jsj()) == null) {
            return null;
        }
        return jsj.vy();
    }

    private com.bytedance.adsdk.sf.gm.gm.gm gm(String str) {
        com.bytedance.adsdk.sf.gm.gm.sf sf2;
        vy vyVar = this.qf;
        if (vyVar == null || (sf2 = vyVar.sf()) == null) {
            return null;
        }
        return pcc(sf2, str);
    }

    private void hc() {
        hc<qf> hcVar = this.jr;
        if (hcVar != null) {
            hcVar.sf(this.gm);
            this.jr.oo(this.oo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jr() {
        this.nac.postDelayed(this.mk, 1000L);
    }

    private void kj() {
        setSaveEnabled(false);
        this.tmg = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        pcc(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.qf.pcc(Boolean.valueOf(com.bytedance.adsdk.sf.wh.wh.pcc(getContext()) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        vy();
        ork();
        tmg();
    }

    private void lu() {
        boolean oo2 = oo();
        setImageDrawable(null);
        setImageDrawable(this.qf);
        if (oo2) {
            this.qf.hc();
        }
    }

    private void nac() {
        this.dax = null;
        this.qf.ork();
    }

    private void oo(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void ork() {
        pcc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.sf.wh.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                wh.vj(wh.this);
                qf.pcc globalConfig = wh.this.getGlobalConfig();
                if (globalConfig != null && (i = globalConfig.oo) > 0 && i > wh.this.lu) {
                    wh.this.gbb();
                    wh.this.pcc();
                    wh.this.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    wh.this.sf(this);
                    if (wh.this.ye != null) {
                        pcc unused = wh.this.ye;
                    }
                }
            }
        });
    }

    private com.bytedance.adsdk.sf.gm.gm.pcc pcc(com.bytedance.adsdk.sf.gm.gm.sf sfVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.sf.gm.gm.pcc pcc2;
        for (com.bytedance.adsdk.sf.gm.gm.pcc pccVar : sfVar.tmg()) {
            if (pccVar instanceof com.bytedance.adsdk.sf.gm.gm.sf) {
                if (pccVar.kj() && pccVar.wh() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    RectF rectF = new RectF();
                    pccVar.pcc(rectF, pccVar.oo(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (pcc2 = pcc((com.bytedance.adsdk.sf.gm.gm.sf) pccVar, motionEvent)) != null) {
                        return pcc2;
                    }
                }
            } else if (pccVar.kj() && pccVar.wh() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                RectF rectF2 = new RectF();
                vy vyVar = this.qf;
                if (vyVar == null || !vyVar.qf()) {
                    RectF rectF3 = new RectF();
                    pccVar.pcc(rectF3, pccVar.oo(), true);
                    sf(rectF2, rectF3);
                } else {
                    pccVar.pcc(rectF2, pccVar.oo(), true);
                    RectF ye = this.qf.ye();
                    if (ye != null) {
                        pcc(rectF2, ye);
                    }
                }
                if (pcc(motionEvent, rectF2)) {
                    return pccVar;
                }
            }
        }
        return null;
    }

    private void setCompositionTask(hc<qf> hcVar) {
        this.hc.add(oo.SET_ANIMATION);
        nac();
        hc();
        this.jr = hcVar.pcc(this.gm).gm(this.oo);
    }

    private void sf(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = this.qf.getBounds().width();
        float height2 = this.qf.getBounds().height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.pcc[getScaleType().ordinal()];
        if (i == 1) {
            pcc(matrix, width, height, width2, height2);
        } else if (i == 2) {
            sf(matrix, width, height, width2, height2);
        } else if (i == 3) {
            gm(matrix, width, height, width2, height2);
        } else if (i == 4) {
            oo(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void tmg() {
        pcc(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.sf.wh.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                lo yt;
                final long elapsedRealtime = SystemClock.elapsedRealtime() - wh.this.lo;
                wh.this.sf(this);
                String playDelayedELExpressTimeS = wh.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (yt = wh.this.qf.yt()) != null) {
                    try {
                        int parseInt = Integer.parseInt(yt.pcc(playDelayedELExpressTimeS)) * 1000;
                        if (wh.this.lo > 0) {
                            long elapsedRealtime2 = (wh.this.lo + parseInt) - SystemClock.elapsedRealtime();
                            "--==-- lottie delayed time: ".concat(String.valueOf(elapsedRealtime2));
                            if (elapsedRealtime2 > 0) {
                                wh.this.wh();
                                wh.this.setVisibility(8);
                                if (wh.this.gpj == null) {
                                    wh.this.gpj = new Handler(Looper.getMainLooper());
                                }
                                wh.this.gpj.removeCallbacksAndMessages(null);
                                wh.this.gpj.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.sf.wh.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        wh.this.setVisibility(0);
                                        wh.this.pcc();
                                        wh.this.pcc(elapsedRealtime);
                                    }
                                }, elapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                wh.this.pcc(elapsedRealtime);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vh() {
        final qf.pcc globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.vj <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.wh) && globalConfig.qf == null) {
            return;
        }
        int i = globalConfig.vj;
        if (i > getMaxFrame()) {
            i = (int) getMaxFrame();
        }
        final float maxFrame = i / getMaxFrame();
        pcc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.sf.wh.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame) {
                    return;
                }
                wh.this.sf(this);
                if (wh.this.atb != null) {
                    sf unused = wh.this.atb;
                }
            }
        });
    }

    private void vy() {
        pcc(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.sf.wh.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                wh.this.sf(this);
                wh.this.gbb();
                wh.this.vh();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    public boolean getClipToCompositionBounds() {
        return this.qf.gm();
    }

    public qf getComposition() {
        return this.dax;
    }

    public long getDuration() {
        qf qfVar = this.dax;
        if (qfVar != null) {
            return (long) qfVar.vj();
        }
        return 0L;
    }

    public int getFrame() {
        return this.qf.gpj();
    }

    public String getImageAssetsFolder() {
        return this.qf.oo();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.qf.vj();
    }

    public float getMaxFrame() {
        return this.qf.jr();
    }

    public float getMinFrame() {
        return this.qf.gbb();
    }

    public lu getPerformanceTracker() {
        return this.qf.kj();
    }

    public float getProgress() {
        return this.qf.atb();
    }

    public gpj getRenderMode() {
        return this.qf.wh();
    }

    public int getRepeatCount() {
        return this.qf.fum();
    }

    public int getRepeatMode() {
        return this.qf.lo();
    }

    public float getSpeed() {
        return this.qf.dax();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof vy) && ((vy) drawable).wh() == gpj.SOFTWARE) {
            this.qf.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        vy vyVar = this.qf;
        if (drawable2 == vyVar) {
            super.invalidateDrawable(vyVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.vh) {
            return;
        }
        this.qf.vh();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dax();
        Handler handler = this.gpj;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        gm();
        sf();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof gm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gm gmVar = (gm) parcelable;
        super.onRestoreInstanceState(gmVar.getSuperState());
        this.kj = gmVar.pcc;
        Set<oo> set = this.hc;
        oo ooVar = oo.SET_ANIMATION;
        if (!set.contains(ooVar) && !TextUtils.isEmpty(this.kj)) {
            setAnimation(this.kj);
        }
        this.vy = gmVar.sf;
        if (!this.hc.contains(ooVar) && (i = this.vy) != 0) {
            setAnimation(i);
        }
        if (!this.hc.contains(oo.SET_PROGRESS)) {
            pcc(gmVar.gm, false);
        }
        if (!this.hc.contains(oo.PLAY_OPTION) && gmVar.oo) {
            pcc();
        }
        if (!this.hc.contains(oo.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(gmVar.vj);
        }
        if (!this.hc.contains(oo.SET_REPEAT_MODE)) {
            setRepeatMode(gmVar.wh);
        }
        if (this.hc.contains(oo.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(gmVar.qf);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        gm gmVar = new gm(super.onSaveInstanceState());
        gmVar.pcc = this.kj;
        gmVar.sf = this.vy;
        gmVar.gm = this.qf.atb();
        gmVar.oo = this.qf.of();
        gmVar.vj = this.qf.oo();
        gmVar.wh = this.qf.lo();
        gmVar.qf = this.qf.fum();
        return gmVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.sf.gm.gm.pcc pcc2 = pcc(motionEvent);
        if (pcc2 == null) {
            if (getGlobalConfig() == null || getGlobalConfig().pcc != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String vy = pcc2.vy();
        if (pcc2 instanceof com.bytedance.adsdk.sf.gm.gm.sf) {
            if (getGlobalConfig() == null || getGlobalConfig().pcc != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (vy != null && vy.startsWith("CSJCLOSE")) {
            dax();
        }
        ork pcc3 = pcc(pcc2.vj());
        if (pcc3 != null && motionEvent.getAction() == 1) {
            pcc(vy, pcc3.vj(), pcc3.qf());
            int[][] wh = pcc3.wh();
            if (wh != null) {
                pcc(wh);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().sf) != null) {
                pcc(iArr);
            }
        }
        if (vy == null || !vy.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i) {
        this.vy = i;
        this.kj = null;
        setCompositionTask(pcc(i));
    }

    public void setAnimationFromJson(String str) {
        pcc(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.tmg ? kj.pcc(getContext(), str) : kj.pcc(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.qf.vj(z);
    }

    public void setCacheComposition(boolean z) {
        this.tmg = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.qf.pcc(z);
    }

    public void setComposition(qf qfVar) {
        if (vj.pcc) {
            "Set Composition \n".concat(String.valueOf(qfVar));
        }
        this.qf.setCallback(this);
        this.dax = qfVar;
        this.ork = true;
        boolean pcc2 = this.qf.pcc(qfVar, getContext().getApplicationContext());
        this.ork = false;
        if (getDrawable() != this.qf || pcc2) {
            if (!pcc2) {
                lu();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.gbb.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.qf.qf(str);
    }

    public void setFailureListener(vh<Throwable> vhVar) {
        this.vj = vhVar;
    }

    public void setFallbackResource(int i) {
        this.wh = i;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.sf.gm gmVar) {
        this.qf.pcc(gmVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.qf.pcc(map);
    }

    public void setFrame(int i) {
        this.qf.gm(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.qf.qf(z);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.sf.oo ooVar) {
        this.qf.pcc(ooVar);
    }

    public void setImageAssetsFolder(String str) {
        this.qf.pcc(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        hc();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        hc();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        hc();
        super.setImageResource(i);
    }

    public void setLottieAnimListener(pcc pccVar) {
        this.ye = pccVar;
    }

    public void setLottieClicklistener(sf sfVar) {
        this.atb = sfVar;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.qf.sf(z);
    }

    public void setMaxFrame(int i) {
        this.qf.sf(i);
    }

    public void setMaxProgress(float f) {
        this.qf.sf(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.qf.oo(str);
    }

    public void setMinFrame(int i) {
        this.qf.pcc(i);
    }

    public void setMinProgress(float f) {
        this.qf.pcc(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.qf.oo(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.qf.gm(z);
    }

    public void setProgress(float f) {
        pcc(f, true);
    }

    public void setRenderMode(gpj gpjVar) {
        this.qf.pcc(gpjVar);
    }

    public void setRepeatCount(int i) {
        this.hc.add(oo.SET_REPEAT_COUNT);
        this.qf.vj(i);
    }

    public void setRepeatMode(int i) {
        this.hc.add(oo.SET_REPEAT_MODE);
        this.qf.oo(i);
    }

    public void setSafeMode(boolean z) {
        this.qf.wh(z);
    }

    public void setSpeed(float f) {
        this.qf.gm(f);
    }

    public void setTextDelegate(lo loVar) {
        this.qf.pcc(loVar);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.qf.kj(z);
    }

    public void setView(View view) {
        this.qf.pcc(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        vy vyVar;
        if (!this.ork && drawable == (vyVar = this.qf) && vyVar.tz()) {
            wh();
        } else if (!this.ork && (drawable instanceof vy)) {
            vy vyVar2 = (vy) drawable;
            if (vyVar2.tz()) {
                vyVar2.mk();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void vj() {
        this.hc.add(oo.PLAY_OPTION);
        this.qf.tsz();
    }

    public void wh() {
        this.vh = false;
        this.qf.mk();
    }

    public void setMaxFrame(String str) {
        this.qf.gm(str);
    }

    public void setMinFrame(String str) {
        this.qf.sf(str);
    }

    public static /* synthetic */ int vj(wh whVar) {
        int i = whVar.lu;
        whVar.lu = i + 1;
        return i;
    }

    public void setAnimation(String str) {
        this.kj = str;
        this.vy = 0;
        setCompositionTask(sf(str));
    }

    private void gm(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    public void gm() {
        this.qf.lu();
    }

    public static /* synthetic */ int lu(wh whVar) {
        int i = whVar.tz;
        whVar.tz = i - 1;
        return i;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm extends View.BaseSavedState {
        public static final Parcelable.Creator<gm> CREATOR = new Parcelable.Creator<gm>() { // from class: com.bytedance.adsdk.sf.wh.gm.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public gm createFromParcel(Parcel parcel) {
                return new gm(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public gm[] newArray(int i) {
                return new gm[i];
            }
        };
        float gm;
        boolean oo;
        String pcc;
        int qf;
        int sf;
        String vj;
        int wh;

        private gm(Parcel parcel) {
            super(parcel);
            this.pcc = parcel.readString();
            this.gm = parcel.readFloat();
            this.oo = parcel.readInt() == 1;
            this.vj = parcel.readString();
            this.wh = parcel.readInt();
            this.qf = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.pcc);
            parcel.writeFloat(this.gm);
            parcel.writeInt(this.oo ? 1 : 0);
            parcel.writeString(this.vj);
            parcel.writeInt(this.wh);
            parcel.writeInt(this.qf);
        }

        public gm(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public boolean oo() {
        return this.qf.tz();
    }

    private void sf(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private hc<qf> sf(final String str) {
        if (isInEditMode()) {
            return new hc<>(new Callable<tmg<qf>>() { // from class: com.bytedance.adsdk.sf.wh.2
                @Override // java.util.concurrent.Callable
                /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
                public tmg<qf> call() throws Exception {
                    boolean z = wh.this.tmg;
                    wh whVar = wh.this;
                    return z ? kj.gm(whVar.getContext(), str) : kj.gm(whVar.getContext(), str, null);
                }
            }, true);
        }
        return this.tmg ? kj.sf(getContext(), str) : kj.sf(getContext(), str, (String) null);
    }

    public void sf(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.qf.sf(animatorUpdateListener);
    }

    public void sf() {
        this.qf.nac();
    }

    public void sf(Animator.AnimatorListener animatorListener) {
        this.qf.sf(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(long j) {
        Map<String, Object> map;
        qf.pcc globalConfig = getGlobalConfig();
        if (this.ye != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.sf) == null || map.isEmpty()) {
                return;
            }
            hashMap.putAll(globalConfig.sf);
        }
    }

    private ork pcc(String str) {
        vy vyVar;
        qf jsj;
        Map<String, ork> dax;
        if (TextUtils.isEmpty(str) || (vyVar = this.qf) == null || (jsj = vyVar.jsj()) == null || (dax = jsj.dax()) == null) {
            return null;
        }
        return dax.get(str);
    }

    private void pcc(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i));
            dax();
            pcc();
            setFrame(i);
            pcc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.sf.wh.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (wh.this.getFrame() < i2 - 1 || wh.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    wh.this.getFrame();
                    wh.this.sf(this);
                    wh.this.wh();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void pcc(String str, String str2, JSONArray jSONArray) {
        qf.sf globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.pcc;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.gm;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    private com.bytedance.adsdk.sf.gm.gm.pcc pcc(MotionEvent motionEvent) {
        com.bytedance.adsdk.sf.gm.gm.sf sf2;
        vy vyVar = this.qf;
        if (vyVar == null || (sf2 = vyVar.sf()) == null) {
            return null;
        }
        return pcc(sf2, motionEvent);
    }

    private boolean pcc(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent == null || rectF == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom;
    }

    private void pcc(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.pcc[getScaleType().ordinal()];
        if (i == 1) {
            pcc(matrix, width, height, width2, height2);
        } else if (i == 2) {
            sf(matrix, width, height, width2, height2);
        } else if (i == 3) {
            gm(matrix, width, height, width2, height2);
        } else if (i == 4) {
            oo(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF);
    }

    private void pcc(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    public void pcc(boolean z, Context context) {
        this.qf.pcc(z, context);
    }

    private hc<qf> pcc(final int i) {
        if (isInEditMode()) {
            return new hc<>(new Callable<tmg<qf>>() { // from class: com.bytedance.adsdk.sf.wh.13
                @Override // java.util.concurrent.Callable
                /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
                public tmg<qf> call() throws Exception {
                    boolean z = wh.this.tmg;
                    wh whVar = wh.this;
                    return z ? kj.sf(whVar.getContext(), i) : kj.sf(whVar.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.tmg ? kj.pcc(getContext(), i) : kj.pcc(getContext(), i, (String) null);
    }

    public void pcc(String str, String str2) {
        pcc(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void pcc(InputStream inputStream, String str) {
        setCompositionTask(kj.pcc(inputStream, str));
    }

    private com.bytedance.adsdk.sf.gm.gm.gm pcc(com.bytedance.adsdk.sf.gm.gm.sf sfVar, String str) {
        for (com.bytedance.adsdk.sf.gm.gm.pcc pccVar : sfVar.tmg()) {
            if (pccVar instanceof com.bytedance.adsdk.sf.gm.gm.sf) {
                com.bytedance.adsdk.sf.gm.gm.gm pcc2 = pcc((com.bytedance.adsdk.sf.gm.gm.sf) pccVar, str);
                if (pcc2 != null) {
                    return pcc2;
                }
            } else if (TextUtils.equals(str, pccVar.vy()) && (pccVar instanceof com.bytedance.adsdk.sf.gm.gm.gm)) {
                return (com.bytedance.adsdk.sf.gm.gm.gm) pccVar;
            }
        }
        return null;
    }

    public void pcc() {
        if (this.lo == 0) {
            this.lo = SystemClock.elapsedRealtime();
        }
        this.hc.add(oo.PLAY_OPTION);
        this.qf.vh();
    }

    public void pcc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.qf.pcc(animatorUpdateListener);
    }

    public void pcc(Animator.AnimatorListener animatorListener) {
        this.qf.pcc(animatorListener);
    }

    public void pcc(boolean z) {
        this.qf.vj(z ? -1 : 0);
    }

    public Bitmap pcc(String str, Bitmap bitmap) {
        return this.qf.pcc(str, bitmap);
    }

    private void pcc(float f, boolean z) {
        if (z) {
            this.hc.add(oo.SET_PROGRESS);
        }
        this.qf.oo(f);
    }
}
