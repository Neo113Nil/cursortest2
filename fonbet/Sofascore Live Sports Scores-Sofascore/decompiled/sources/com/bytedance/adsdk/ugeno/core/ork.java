package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.pcc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    private AnimatorSet gm = new AnimatorSet();
    private View oo;
    Paint pcc;
    private String qf;
    private pcc sf;
    private int vj;
    private int wh;

    public ork(View view, pcc pccVar) {
        this.oo = view;
        this.sf = pccVar;
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0167, code lost:
    
        if (r2.equals("accelerate") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc() {
        ArrayList arrayList = new ArrayList();
        List<pcc.C0028pcc> gm = this.sf.gm();
        if (gm == null || gm.size() <= 0) {
            return;
        }
        for (pcc.C0028pcc c0028pcc : gm) {
            if (c0028pcc != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0028pcc.pcc());
                if (TextUtils.equals(c0028pcc.vj(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0028pcc.vj(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0028pcc.vj());
                }
                objectAnimator.setStartDelay(c0028pcc.oo());
                objectAnimator.setTarget(this.oo);
                char c = 0;
                if (TextUtils.equals(c0028pcc.vj(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setIntValues((int) c0028pcc.wh(), (int) c0028pcc.qf());
                    c0028pcc.wh();
                    c0028pcc.qf();
                } else {
                    objectAnimator.setFloatValues(c0028pcc.wh(), c0028pcc.qf());
                }
                int sf = (int) this.sf.sf();
                if (sf != 0) {
                    objectAnimator.setRepeatCount(sf);
                } else {
                    objectAnimator.setRepeatCount((int) c0028pcc.sf());
                }
                if (TextUtils.equals(c0028pcc.vj(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String wh = this.sf.wh();
                if (TextUtils.isEmpty(wh)) {
                    wh = c0028pcc.gm();
                }
                if (TextUtils.equals(wh, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0028pcc.kj() != null && c0028pcc.kj().length > 0) {
                    objectAnimator.setFloatValues(c0028pcc.kj());
                }
                if (TextUtils.equals(c0028pcc.vj(), "rotationX")) {
                    this.oo.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ork.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ork.this.oo.setPivotX(ork.this.oo.getWidth() / 2.0f);
                            ork.this.oo.setPivotY(ork.this.oo.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0028pcc.vj(), "ripple")) {
                    this.qf = c0028pcc.ork();
                }
                String vy = c0028pcc.vy();
                vy.getClass();
                switch (vy.hashCode()) {
                    case -1354466595:
                        break;
                    case -1263948740:
                        if (vy.equals("decelerate")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1102672091:
                        if (vy.equals("linear")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 475910905:
                        if (vy.equals("accelerateDecelerate")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1312628413:
                        if (vy.equals("standard")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case 1:
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case 2:
                    case 4:
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case 3:
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.sf.oo() != 0) {
            this.gm.setDuration(this.sf.oo());
        }
        this.gm.setStartDelay(this.sf.vj());
        boolean equals = TextUtils.equals(this.sf.pcc(), "sequentially");
        AnimatorSet animatorSet = this.gm;
        if (equals) {
            animatorSet.playSequentially(arrayList);
        } else {
            animatorSet.playTogether(arrayList);
        }
        this.gm.start();
    }

    public void sf() {
        AnimatorSet animatorSet = this.gm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void pcc(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || TextUtils.isEmpty(this.qf)) {
                return;
            }
            this.pcc.setColor(com.bytedance.adsdk.ugeno.qf.pcc.pcc(this.qf));
            this.pcc.setAlpha(90);
            ((ViewGroup) this.oo.getParent()).setClipChildren(true);
            canvas.drawCircle(this.vj, this.wh, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.pcc);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void pcc(int i, int i2) {
        this.vj = i / 2;
        this.wh = i2 / 2;
    }
}
