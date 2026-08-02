package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.fem;
import defpackage.me4;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo implements Handler.Callback {
    private long atb;
    private AtomicBoolean bg;
    private View dax;
    private ValueAnimator ei;
    private int erj;
    private com.bytedance.sdk.openadsdk.core.wh.kj ew;
    private TextView fum;
    com.bytedance.sdk.openadsdk.core.gm.sf gbb;
    private int gd;
    TextView gm;
    private TextView gpj;
    com.bytedance.sdk.openadsdk.core.gm.pcc hc;
    private com.bytedance.sdk.openadsdk.core.ork.fum hoh;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh iv;
    private Handler jr;
    private View jsj;
    FrameLayout kj;
    private boolean kun;
    private com.bytedance.sdk.openadsdk.core.widget.nac kz;
    private com.bytedance.sdk.openadsdk.core.widget.nac lo;
    private final Activity lq;
    private boolean lrr;
    private TextView lu;
    private View mk;
    private final View mu;
    private View nac;
    private int nn;
    private com.bytedance.sdk.component.vy.qf of;
    FrameLayout oo;
    ValueAnimator ork;
    private sf otd;
    ImageView pcc;
    private final com.bytedance.sdk.openadsdk.core.jr.oo.sf pq;
    private com.bytedance.sdk.openadsdk.core.wh.oo ptr;
    private FrameLayout qcw;
    final of qf;
    private com.bytedance.sdk.openadsdk.common.tmg qy;
    private final boolean ra;
    private ILoader ri;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm rnn;
    private com.bytedance.sdk.openadsdk.gbb.oo rt;
    private com.bytedance.sdk.openadsdk.common.vj se;
    FrameLayout sf;
    fem tmg;
    private LinearLayout.LayoutParams tmh;
    private com.bytedance.sdk.openadsdk.oo.hc tsx;
    private ImageView tsz;
    private mu tz;
    ObjectAnimator vh;
    View vj;
    ObjectAnimator vy;
    RelativeLayout wh;
    private String xb;
    private FrameLayout yt;
    private String zti;
    private final AtomicBoolean ye = new AtomicBoolean(false);
    private final AtomicBoolean rj = new AtomicBoolean(false);
    private volatile int hpk = 0;
    private volatile int fmh = 0;
    private volatile int zsj = 0;
    private float vr = -1.0f;
    private final AtomicBoolean gh = new AtomicBoolean(false);
    private long gdh = -1;
    private final AtomicBoolean vgx = new AtomicBoolean(false);
    private long ywp = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements com.bytedance.sdk.component.vj.kj {
        @Override // com.bytedance.sdk.component.vj.kj
        public Bitmap pcc(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.oo.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), bitmap, 25);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements com.bytedance.sdk.openadsdk.oo.tmg {
        private final String gm;
        private final WeakReference<lo> oo;
        private final int pcc;
        private final of sf;

        public sf(int i, of ofVar, String str, lo loVar) {
            this.pcc = i;
            this.sf = ofVar;
            this.gm = str;
            this.oo = new WeakReference<>(loVar);
        }

        @Override // com.bytedance.sdk.openadsdk.oo.tmg
        public void pcc(int i) {
            lo loVar = this.oo.get();
            if (loVar != null) {
                gm.pcc.pcc(this.pcc, loVar.zsj, loVar.fmh, loVar.hpk - loVar.fmh, this.sf, this.gm, i);
            }
        }
    }

    public lo(Activity activity, final of ofVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, View view) {
        this.lq = activity;
        this.qf = ofVar;
        this.zti = str;
        this.pq = sfVar;
        this.mu = view;
        this.nn = kun.pcc(str);
        if (ofVar != null) {
            this.xb = ofVar.cz();
        }
        this.ra = ofVar.xb() && wh(ofVar);
        if (!TextUtils.isEmpty(this.xb)) {
            this.ri = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
            int pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.ri, this.xb);
            this.gd = pcc2;
            this.erj = pcc2 > 0 ? 2 : 0;
        }
        boolean oo = oo(ofVar);
        boolean kj = kj(ofVar);
        boolean sf2 = sf(ofVar);
        if (sf2) {
            this.zti = "landingpage_split_screen";
        } else if (oo) {
            this.zti = "landingpage_direct";
        } else if (kj) {
            this.zti = "aggregate_page";
        } else if (gm(ofVar)) {
            this.zti = "landingpage_split_ceiling";
        }
        this.hc = new com.bytedance.sdk.openadsdk.core.gm.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), ofVar, this.zti, kun.pcc(str));
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        this.hc.pcc(hashMap);
        View findViewById = activity.findViewById(R.id.content);
        this.hc.sf(findViewById);
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar2 = new com.bytedance.sdk.openadsdk.core.gm.sf(activity, ofVar, this.zti, kun.pcc(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.lo.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf
            public boolean pcc(tmg tmgVar, Map<String, Object> map) {
                if (lo.vh(ofVar) && lo.this.iv != null) {
                    lo.this.iv.pcc(tmgVar);
                    lo.this.iv.pcc(map);
                    if (lo.ork(lo.this.qf) || lo.this.lrr) {
                        return true;
                    }
                }
                return super.pcc(tmgVar, map);
            }
        };
        this.gbb = sfVar2;
        sfVar2.pcc(hashMap);
        this.gbb.sf(findViewById);
        this.kj = frameLayout;
        if (sf2 || oo || kj) {
            try {
                this.jr = new Handler(Looper.getMainLooper(), this);
            } catch (Exception unused) {
                return;
            }
        }
        if (ofVar.xb()) {
            return;
        }
        if (oo || kj) {
            Handler handler = this.jr;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    private void dax() {
        if ((oo(this.qf) || kj(this.qf)) && (this.lq instanceof com.bytedance.sdk.openadsdk.core.jr.oo.sf)) {
            this.pq.kz();
            this.pq.nac();
        }
    }

    private void gbb() {
        this.wh.setVisibility(8);
        if (oo(this.qf) || kj(this.qf) || !oo() || gm(this.qf)) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.vh = ofFloat;
        ofFloat.setDuration(100L);
        this.vh.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) lo.this.yt.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                lo.this.pcc((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                lo.this.yt.setLayoutParams(layoutParams);
            }
        });
        this.vh.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean gpj() {
        return of.vj(this.qf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hc() {
        this.ye.get();
        this.rj.get();
        if (this.ye.get() || this.rj.get()) {
            return;
        }
        this.ye.set(true);
        pcc(0);
        long elapsedRealtime = this.gdh == -1 ? 0L : SystemClock.elapsedRealtime() - this.gdh;
        if (gm(this.qf)) {
            com.bytedance.sdk.openadsdk.oo.gm.gm(this.qf, this.zti, elapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.qf, this.zti, System.currentTimeMillis() - this.atb, true);
        gbb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jr() {
        LinearLayout.LayoutParams layoutParams;
        if (this.ye.get()) {
            return;
        }
        dax();
        this.rj.set(true);
        pcc(-1);
        this.pq.tmg();
        com.bytedance.sdk.openadsdk.common.tmg tmgVar = this.qy;
        if (tmgVar != null) {
            tmgVar.sf();
        }
        if (kj(this.qf)) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), this.qf, this.zti, "show_agg_backup");
            View view = this.nac;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.nac.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.nac.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.wh;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.dax.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.dax.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.dax.setLayoutParams(layoutParams3);
        if (this.qf.zk() != null && !TextUtils.isEmpty(this.qf.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.qf.zk().pcc(), this.qf.zk().sf(), this.qf.zk().gm(), this.lo, this.qf);
        }
        this.lu.setText(this.qf.ofe());
        this.gpj.setText(this.qf.lc());
        if (this.fum != null) {
            sf();
            this.fum.setClickable(true);
            this.fum.setOnClickListener(this.hc);
            this.fum.setOnTouchListener(this.hc);
        }
        if (!gm(this.qf) || (layoutParams = this.tmh) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            oo(8);
        } else {
            oo(0);
        }
    }

    public static boolean kj(of ofVar) {
        return ofVar != null && ofVar.bg() == 33;
    }

    private void lo() {
        com.bytedance.sdk.component.vy.qf qfVar = this.of;
        if (qfVar == null || qfVar.getWebView() == null) {
            return;
        }
        this.hpk = this.of.pcc;
        this.fmh = this.of.sf;
        this.zsj = this.of.gm;
        if (this.of.sf()) {
            this.pq.kz();
            this.atb = System.currentTimeMillis();
        }
        if (this.of.oo()) {
            hc();
        }
        if (this.of.gm()) {
            hc();
            int pcc2 = kun.pcc(this.of.getWebView());
            sf sfVar = this.otd;
            if (sfVar != null) {
                sfVar.pcc(pcc2 != 1 ? 0 : 1);
            }
        }
    }

    private void lu() {
        if (oo()) {
            this.jsj.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.tsz, "translationY", 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(500L);
            this.vy = duration;
            duration.setRepeatMode(2);
            this.vy.setRepeatCount(-1);
            this.vy.start();
            this.jsj.setClickable(true);
            this.jsj.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!lo.this.lrr) {
                        lo.this.gbb.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    lo.this.ork = ObjectAnimator.ofFloat(this, "timeSlide", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    lo.this.ork.setDuration(200L);
                    lo.this.ork.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) lo.this.yt.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            lo.this.pcc((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            lo.this.yt.setLayoutParams(layoutParams);
                        }
                    });
                    if (lo.this.gbb.wh()) {
                        lo.this.jsj.performClick();
                        lo.this.lrr = true;
                    }
                    lo.this.ork.start();
                    lo.this.jsj.setVisibility(8);
                    return true;
                }
            });
            this.jsj.setOnClickListener(this.gbb);
        }
        if (!gpj()) {
            this.kj.setVisibility(8);
            this.sf.setVisibility(0);
            this.pcc.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.pcc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lo loVar = lo.this;
                    com.bytedance.sdk.openadsdk.oo.gm.sf(loVar.qf, loVar.zti);
                }
            });
            of ofVar = this.qf;
            if (ofVar != null && ofVar.by() != null && this.qf.by().size() > 0 && this.qf.by().get(0) != null && !TextUtils.isEmpty(this.qf.by().get(0).pcc())) {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.qf.by().get(0), this.pcc, this.qf, new com.bytedance.sdk.component.vj.dax() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.7
                    @Override // com.bytedance.sdk.component.vj.dax
                    public void pcc(int i, String str, @Nullable Throwable th) {
                        if (lo.this.jr != null) {
                            lo.this.jr.removeMessages(101);
                        }
                        lo.this.ork();
                    }

                    @Override // com.bytedance.sdk.component.vj.dax
                    public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
                        if (lo.this.jr != null) {
                            lo.this.jr.removeMessages(101);
                        }
                    }
                });
            }
        }
        try {
            String pcc2 = this.qf.by().get(0).pcc();
            com.bytedance.sdk.openadsdk.ork.oo.pcc().pcc(pcc2).pcc(this.qf.by().get(0).sf()).sf(this.qf.by().get(0).gm()).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc())).gm(1).pcc(new pcc()).pcc(new com.bytedance.sdk.openadsdk.ork.sf(this.qf, pcc2, new com.bytedance.sdk.component.vj.dax() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.8
                @Override // com.bytedance.sdk.component.vj.dax
                public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
                    Drawable drawable;
                    try {
                        Object sf2 = vhVar.sf();
                        if (sf2 != null && vhVar.gm() != null) {
                            if (sf2 instanceof Bitmap) {
                                drawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.lu.pcc().getResources(), (Bitmap) sf2);
                            } else if (sf2 instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && zzl.n(sf2)) {
                                    a70.e(sf2).start();
                                }
                                drawable = (Drawable) sf2;
                            } else {
                                drawable = null;
                            }
                            boolean gpj = lo.this.gpj();
                            lo loVar = lo.this;
                            if (!gpj) {
                                loVar.sf.setBackground(drawable);
                                return;
                            }
                            loVar.oo.setBackground(drawable);
                            View dax = lo.this.pq.dax();
                            if (dax == null || !(dax.getParent() instanceof View)) {
                                return;
                            }
                            ((View) dax.getParent()).setBackground(drawable);
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.bytedance.sdk.component.vj.dax
                public void pcc(int i, String str, @Nullable Throwable th) {
                }
            }));
        } catch (Exception unused) {
        }
    }

    private void nac() {
        com.bytedance.sdk.openadsdk.common.vh loadingStyle;
        com.bytedance.sdk.openadsdk.common.tmg tmgVar = this.qy;
        if (tmgVar != null && (loadingStyle = tmgVar.getLoadingStyle()) != null) {
            this.kz = loadingStyle.sf();
            this.ew = loadingStyle.gm();
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = this.ptr;
        if (ooVar != null) {
            ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (lo.this.ptr.getTag() != null) {
                        boolean equals = lo.this.ptr.getTag().equals(1);
                        lo loVar = lo.this;
                        if (equals) {
                            loVar.sf(3);
                        } else if (loVar.ptr.getTag().equals(2)) {
                            lo.this.sf(4);
                        }
                    }
                }
            });
        }
    }

    public static boolean oo(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        if (tmg(ofVar)) {
            return true;
        }
        return ofVar.az() == 3 && (vj(ofVar) || wh(ofVar)) && !atb.sf(ofVar) && (ofVar.zx() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ofVar.zx() == 100.0f);
    }

    public static boolean qf(of ofVar) {
        jsj nfv;
        return (ofVar == null || (nfv = ofVar.nfv()) == null || nfv.pcc() != 2) ? false : true;
    }

    public static boolean sf(of ofVar) {
        return ofVar != null && ofVar.az() == 3 && ofVar.bg() == 6 && !atb.sf(ofVar) && ofVar.ial() == 1 && (ofVar.zx() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ofVar.zx() == 100.0f);
    }

    private void tmg() {
        mu muVar = new mu(this.lq);
        this.tz = muVar;
        muVar.pcc(this.pq);
        this.tz.sf(this.of).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(this.qf)).gm(this.qf.esn()).oo(this.qf.hl()).pcc(this.qf).sf(kj(this.qf) ? this.nn : -1).pcc(this.qf.bxz()).sf(this.zti).vj(this.qf.ray()).pcc(this.of).pcc(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                if (lo.kj(lo.this.qf) && (lo.this.lq instanceof com.bytedance.sdk.openadsdk.core.jr.oo.sf)) {
                    ((com.bytedance.sdk.openadsdk.core.jr.oo.sf) lo.this.lq).pq();
                } else if (lo.this.iv != null) {
                    lo.this.iv.gm();
                }
            }
        });
    }

    private void vh() {
        lo loVar;
        com.bytedance.sdk.component.vy.qf qfVar = this.of;
        if (qfVar == null || qfVar.getWebView() == null) {
            loVar = this;
        } else {
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(false).sf(false).pcc(this.of.getWebView());
            com.bytedance.sdk.component.vy.qf qfVar2 = this.of;
            if (qfVar2 != null && qfVar2.getWebView() != null) {
                this.otd = new sf(this.gd, this.qf, this.zti, this);
                if (this.of.k_() && (this.of.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.pcc.wh)) {
                    com.bytedance.sdk.openadsdk.oo.hc sf2 = ((com.bytedance.sdk.openadsdk.core.widget.pcc.wh) this.of.getWebViewClient()).sf();
                    this.tsx = sf2;
                    if (sf2 != null) {
                        sf2.pcc(this.otd);
                        this.tsx.sf(true);
                    }
                } else {
                    this.tsx = new com.bytedance.sdk.openadsdk.oo.hc(this.qf, this.of.getWebView(), this.otd, this.erj).sf(true);
                }
                this.tsx.pcc(this.zti);
                this.rt = new com.bytedance.sdk.openadsdk.gbb.oo(this.tsx);
                com.bytedance.sdk.openadsdk.common.vj pcc2 = kun.pcc(this.qf, this.of, this.lq, this.zti);
                this.se = pcc2;
                if (pcc2 != null) {
                    pcc2.pcc(this.zti);
                }
                kun.pcc(this.qf, this.of);
            }
            tmg();
            if (this.of.k_()) {
                lo();
            }
            this.of.setLandingPage(true);
            this.of.setTag(this.zti);
            this.of.setMaterialMeta(this.qf.lr());
            loVar = this;
            com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(com.bytedance.sdk.openadsdk.core.lu.pcc(), this.tz, this.qf.esn(), this.se, this.tsx, true) { // from class: com.bytedance.sdk.openadsdk.core.model.lo.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    lo.this.hc();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    lo.this.pq.kz();
                    lo.this.atb = System.currentTimeMillis();
                    if (!lo.sf(lo.this.qf) || lo.this.jr == null || of.vj(lo.this.qf)) {
                        return;
                    }
                    lo.this.jr.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String oo = com.bytedance.sdk.openadsdk.core.widget.pcc.wh.oo(str2);
                    boolean z = false;
                    if (this.wh != null) {
                        this.wh.pcc(webView, i, str, str2, com.bytedance.sdk.openadsdk.core.widget.pcc.wh.oo(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z2 = oo != null && oo.startsWith("image");
                    if (oo != null && oo.startsWith("mp4")) {
                        z = true;
                    }
                    if (z2 || z || lo.this.ye.get()) {
                        return;
                    }
                    lo.this.jr();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        lo.this.jr();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(lo.this.xb)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        lo.tmg(lo.this);
                        WebResourceResponseModel pcc3 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(lo.this.ri, lo.this.xb, str);
                        if (pcc3 != null && pcc3.getWebResourceResponse() != null) {
                            lo.gbb(lo.this);
                            return pcc3.getWebResourceResponse();
                        }
                        if (pcc3 != null && pcc3.getMsg() == 2) {
                            lo.jr(lo.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.lo.pcc("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!lo.gm(lo.this.qf) || kun.pcc(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(lo.this.lq, (Class<?>) TTCeilingLandingPageActivity.class);
                    lo.this.qf.vj(str);
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(lo.this.qf));
                    com.bytedance.sdk.component.utils.sf.pcc(this.oo, intent, null);
                    return true;
                }
            };
            loVar.iv = whVar;
            loVar.of.setWebViewClient(whVar);
            loVar.iv.pcc(loVar.qf);
            loVar.iv.pcc(loVar.zti);
            loVar.iv.pcc(loVar.pq);
            com.bytedance.sdk.openadsdk.gbb.oo ooVar = loVar.rt;
            if (ooVar != null) {
                loVar.iv.pcc(ooVar);
            }
            loVar.of.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(loVar.tz, loVar.tsx, loVar.se) { // from class: com.bytedance.sdk.openadsdk.core.model.lo.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (lo.this.lq != null && !lo.this.lq.isFinishing() && i == 100) {
                        lo.this.hc();
                    }
                    if (lo.this.qy != null) {
                        lo.this.qy.pcc(i);
                    }
                }
            });
            if (loVar.rnn == null) {
                loVar.rnn = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), loVar.zti);
            }
            loVar.of.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (lo.this.rnn != null) {
                        lo.this.rnn.pcc(lo.this.qf);
                    }
                }
            });
            com.bytedance.sdk.component.vy.qf qfVar3 = loVar.of;
            qfVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar3.getWebView(), BuildConfig.VERSION_CODE));
            loVar.of.setMixedContentMode(0);
            loVar.of.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (lo.this.tsx != null) {
                        lo.this.tsx.sf(i2);
                    }
                }
            });
            loVar.of.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (lo.this.vy()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            lo.this.vr = motionEvent.getY();
                        } else if (action == 1) {
                            if (rj.pcc(lo.this.vr, motionEvent.getY(), lo.this.lq)) {
                                lo.this.sf(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (lo.this.ra && motionEvent.getAction() == 1 && lo.this.pq != null) {
                        lo.this.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                lo.this.pq.hoh();
                            }
                        });
                    }
                    if ((!lo.this.lrr || lo.vh(lo.this.qf)) && !lo.kj(lo.this.qf)) {
                        lo.this.gbb.onTouch(view, motionEvent);
                    }
                    if ((!lo.this.lrr || lo.vh(lo.this.qf)) && !lo.kj(lo.this.qf) && motionEvent.getAction() == 1 && lo.this.gbb.wh()) {
                        lo.this.of.getWebView().performClick();
                        lo.this.lrr = true;
                    }
                    if (lo.this.tsx != null) {
                        lo.this.tsx.pcc(motionEvent);
                    }
                    if (lo.this.se != null) {
                        lo.this.se.pcc(motionEvent);
                    }
                    if (lo.this.rt == null) {
                        return false;
                    }
                    lo.this.rt.pcc();
                    return false;
                }
            });
            loVar.of.getWebView().setOnClickListener(loVar.gbb);
            com.bytedance.sdk.openadsdk.oo.gm.pcc(loVar.qf, loVar.zti, loVar.erj);
            if (!loVar.of.k_()) {
                com.bytedance.sdk.component.utils.lo.pcc("LandingPageModel", "loadUrlWithRefer url  = " + loVar.qf.xy());
                com.bytedance.sdk.openadsdk.utils.of.pcc(loVar.of, loVar.qf.xy());
            }
            loVar.kun = true;
        }
        com.bytedance.sdk.component.vy.qf qfVar4 = loVar.of;
        if (qfVar4 == null || loVar.qy == null || qfVar4.gm()) {
            return;
        }
        loVar.qy.pcc();
    }

    public static boolean vj(of ofVar) {
        return ofVar != null && ofVar.az() == 3 && ofVar.bg() == 5;
    }

    public void gm() {
        if (gpj()) {
            try {
                String str = this.qf.kez().f;
                com.bytedance.sdk.openadsdk.ork.oo.pcc().pcc(str).pcc(this.qf.kez().b).sf(this.qf.kez().a).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc())).gm(2).pcc(new pcc()).pcc(new com.bytedance.sdk.openadsdk.ork.sf(this.qf, str, new com.bytedance.sdk.component.vj.dax() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.4
                    @Override // com.bytedance.sdk.component.vj.dax
                    public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
                        try {
                            Object sf2 = vhVar.sf();
                            if (sf2 != null && vhVar.gm() != null) {
                                BitmapDrawable bitmapDrawable = sf2 instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.lu.pcc().getResources(), (Bitmap) sf2) : null;
                                View dax = lo.this.pq.dax();
                                if (bitmapDrawable == null || dax == null || !(dax.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) dax.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.lo.gm("LandingPageModel", th.getMessage());
                        }
                    }

                    @Override // com.bytedance.sdk.component.vj.dax
                    public void pcc(int i, String str2, @Nullable Throwable th) {
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        of ofVar;
        of ofVar2;
        int i = message.what;
        if (i == 100) {
            int i2 = message.arg1;
            long oo = (!oo(this.qf) || (ofVar2 = this.qf) == null || ofVar2.yt() == null) ? (!kj(this.qf) || (ofVar = this.qf) == null || ofVar.yt() == null) ? 20L : this.qf.yt().oo() : this.qf.yt().sf();
            fem femVar = this.tmg;
            if (femVar != null) {
                femVar.pcc(i2 * 1000, oo * 1000);
            }
            long j = i2;
            if (j >= oo) {
                fem femVar2 = this.tmg;
                if (femVar2 != null) {
                    femVar2.pcc(oo * 1000, 100);
                }
            } else if (j < oo && this.jr != null) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i2 + 1;
                this.jr.sendMessageDelayed(obtain, 1000L);
            }
        } else if (i == 101) {
            ork();
        }
        return true;
    }

    public void ork() {
        if ("landingpage_split_screen".equals(this.zti) && com.bytedance.sdk.openadsdk.yt.vj.pcc("default_split_style", false) && this.vgx.compareAndSet(false, true)) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.10
                @Override // java.lang.Runnable
                public void run() {
                    lo.this.ei = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    lo.this.ei.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (lo.this.mk != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) lo.this.mk.getLayoutParams();
                                layoutParams.weight = floatValue;
                                lo.this.mk.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    lo.this.ei.setDuration(500L);
                    lo.this.ei.start();
                    if (lo.this.jsj != null) {
                        lo.this.jsj.setVisibility(8);
                    }
                }
            });
        }
    }

    public void pcc() {
        View view;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.vy.qf qfVar = (com.bytedance.sdk.component.vy.qf) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.tz);
        this.of = qfVar;
        if (qfVar == null || of.pcc(this.qf)) {
            rj.pcc((View) this.of, 8);
        } else if (!this.of.k_()) {
            this.of.vj();
        }
        this.yt = (FrameLayout) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.fum);
        this.qy = (com.bytedance.sdk.openadsdk.common.tmg) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.jsj);
        this.jsj = this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.of);
        this.tsz = (ImageView) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.yt);
        this.mk = this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.mu);
        this.sf = (FrameLayout) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.gpj);
        this.pcc = (ImageView) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.lo);
        this.wh = (RelativeLayout) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.qy);
        this.gm = (TextView) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.am);
        this.oo = (FrameLayout) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.tmg);
        View findViewById = this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.tsz);
        this.dax = findViewById;
        if (findViewById == null) {
            this.dax = this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.rnn);
        }
        this.nac = this.lq.findViewById(com.bytedance.sdk.openadsdk.utils.nac.mk);
        this.lu = (TextView) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.ye);
        this.gpj = (TextView) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.lq);
        this.lo = (com.bytedance.sdk.openadsdk.core.widget.nac) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.atb);
        this.fum = (TextView) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.zti);
        if (this.gm != null && this.qf.yt() != null) {
            this.gm.setText(this.qf.yt().vj());
        }
        this.vj = this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.pq);
        this.ptr = (com.bytedance.sdk.openadsdk.core.wh.oo) this.mu.findViewById(com.bytedance.sdk.openadsdk.utils.nac.vck);
        if ((oo(this.qf) || sf(this.qf) || kj(this.qf) || gm(this.qf)) && this.qf.yt() != null) {
            View view2 = this.vj;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            boolean kj = kj(this.qf);
            of ofVar = this.qf;
            com.bytedance.sdk.openadsdk.core.jr.gm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.11
                @Override // java.lang.Runnable
                public void run() {
                    if (lo.this.ye.get()) {
                        return;
                    }
                    lo loVar = lo.this;
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(loVar.qf, loVar.zti, System.currentTimeMillis() - lo.this.atb, false);
                    lo.this.jr();
                }
            }, (kj ? ofVar.yt().gm() : ofVar.yt().pcc()) * 1000);
        }
        vh();
        if (sf(this.qf)) {
            lu();
            if (!oo()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.yt.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.yt.setLayoutParams(layoutParams);
            }
        }
        if ((oo(this.qf) || kj(this.qf)) && (view = this.mk) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.tmg tmgVar = this.qy;
        if (tmgVar != null) {
            tmgVar.pcc(this.qf);
        }
        if (gm(this.qf)) {
            nac();
        }
        gm.pcc.pcc(SystemClock.elapsedRealtime() - elapsedRealtime, this.qf, this.zti, this.ri, this.xb);
    }

    public boolean vy() {
        AtomicBoolean atomicBoolean;
        return (!gm(this.qf) || (atomicBoolean = this.bg) == null || atomicBoolean.get()) ? false : true;
    }

    public void wh() {
        com.bytedance.sdk.component.vy.qf qfVar;
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.tsx;
        if (hcVar != null && (qfVar = this.of) != null) {
            hcVar.pcc(qfVar);
        }
        Handler handler = this.jr;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.ei;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.ei.cancel();
        }
        ValueAnimator valueAnimator2 = this.ork;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.ork.cancel();
        }
        ObjectAnimator objectAnimator = this.vh;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.vh.cancel();
        }
        com.bytedance.sdk.openadsdk.common.tmg tmgVar = this.qy;
        if (tmgVar != null) {
            tmgVar.sf();
        }
        ObjectAnimator objectAnimator2 = this.vy;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.vy.qf qfVar2 = this.of;
        if (qfVar2 != null) {
            com.bytedance.sdk.openadsdk.core.kun.pcc(qfVar2.getWebView());
        }
        this.of = null;
        mu muVar = this.tz;
        if (muVar != null) {
            muVar.tmg();
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar2 = this.tsx;
        if (hcVar2 != null) {
            hcVar2.oo(true);
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.rt;
        if (ooVar != null) {
            ooVar.gm();
        }
        if (!TextUtils.isEmpty(this.xb) && this.kun) {
            gm.pcc.pcc(this.fmh, this.hpk, this.qf);
        }
        com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.ri);
    }

    public void kj() {
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.tsx;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    public static boolean vy(of ofVar) {
        return oo(ofVar) && !tmg(ofVar);
    }

    public void qf() {
        mu muVar = this.tz;
        if (muVar != null) {
            muVar.vh();
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.tsx;
        if (hcVar != null) {
            hcVar.qf();
        }
    }

    public void vj() {
        FrameLayout frameLayout = this.yt;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.mk;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public static boolean ork(of ofVar) {
        return (ofVar == null || ofVar.st() == 1 || !vh(ofVar)) ? false : true;
    }

    public void sf() {
        of ofVar = this.qf;
        if (ofVar == null || TextUtils.isEmpty(ofVar.bgf())) {
            return;
        }
        this.fum.setText(this.qf.bgf());
    }

    public void sf(int i) {
        com.bytedance.sdk.openadsdk.core.ork.fum fumVar = this.hoh;
        if (fumVar != null) {
            fumVar.vj(i);
        }
    }

    public boolean oo() {
        return this.qf.ct() == 15 || this.qf.ct() == 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo(int i) {
        rj.pcc((View) this.kz, i);
        rj.pcc((View) this.ew, i);
        if (this.rj.get()) {
            rj.pcc((View) this.lu, i);
            rj.pcc((View) this.gpj, i);
            rj.pcc((View) this.lo, i);
            rj.pcc((View) this.fum, 0);
        }
    }

    public static /* synthetic */ int gbb(lo loVar) {
        int i = loVar.fmh;
        loVar.fmh = i + 1;
        return i;
    }

    public static boolean gbb(of ofVar) {
        if (ofVar != null) {
            return wh(ofVar) || qf(ofVar);
        }
        return false;
    }

    public static boolean hc(of ofVar) {
        return ofVar != null && ofVar.bg() == 8 && ofVar.ew() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean gm(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5;
    }

    public static boolean gm(of ofVar) {
        return ofVar != null && ofVar.az() == 3 && ofVar.kz() == 38 && ofVar.ial() == 1;
    }

    public static /* synthetic */ int tmg(lo loVar) {
        int i = loVar.hpk;
        loVar.hpk = i + 1;
        return i;
    }

    public static boolean tmg(of ofVar) {
        return ofVar != null && ofVar.bg() == 19;
    }

    public static boolean wh(of ofVar) {
        jsj nfv;
        return ofVar != null && ofVar.az() == 3 && !atb.sf(ofVar) && (ofVar.zx() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ofVar.zx() == 100.0f) && (nfv = ofVar.nfv()) != null && nfv.pcc() == 1;
    }

    public static /* synthetic */ int jr(lo loVar) {
        int i = loVar.zsj;
        loVar.zsj = i + 1;
        return i;
    }

    public static boolean vh(of ofVar) {
        if (ofVar != null) {
            return ofVar.bg() == 19 || ofVar.bg() == 20;
        }
        return false;
    }

    public void pcc(fem femVar) {
        this.tmg = femVar;
    }

    public static boolean pcc(of ofVar) {
        if (ofVar == null || tmg(ofVar) || qf(ofVar) || wh(ofVar)) {
            return false;
        }
        return oo(ofVar) || sf(ofVar) || kj(ofVar);
    }

    public void pcc(int i) {
        com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar = this.pq;
        if (sfVar != null) {
            sfVar.vj();
        }
    }

    public void pcc(float f) {
        try {
            this.pq.jr();
        } catch (Throwable unused) {
        }
    }

    public void pcc(@NonNull com.bytedance.sdk.openadsdk.core.ork.fum fumVar, FrameLayout frameLayout) {
        this.hoh = fumVar;
        this.qcw = frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(final int i, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        float f;
        int wh;
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.oo.hc hcVar;
        if ((i != 3 && !gm(i)) || this.qcw == null || gbbVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.bg;
        if (atomicBoolean != null) {
            if (i == 1) {
                return;
            }
            if (i == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mk.getLayoutParams();
        this.tmh = (LinearLayout.LayoutParams) this.yt.getLayoutParams();
        final float f2 = layoutParams2.weight;
        gpj jsj = this.qf.jsj();
        if (!gm(i)) {
            if (jsj != null) {
                wh = jsj.wh();
                f = wh;
                final float f3 = f;
                layoutParams = (FrameLayout.LayoutParams) this.qcw.getLayoutParams();
                if (layoutParams == null) {
                }
                final FrameLayout.LayoutParams layoutParams3 = layoutParams;
                final int i2 = layoutParams3.height;
                final int i3 = layoutParams3.width;
                final int i4 = layoutParams3.leftMargin;
                final int i5 = layoutParams3.topMargin;
                final int sf2 = rj.sf(this.lq, (float) gbbVar.qf());
                final int sf3 = rj.sf(this.lq, (float) gbbVar.kj());
                final int sf4 = rj.sf(this.lq, (float) gbbVar.vj());
                final int sf5 = rj.sf(this.lq, (float) gbbVar.wh());
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                this.ork = ofFloat;
                ofFloat.setDuration(500L);
                this.ork.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                        float f4 = f2;
                        layoutParams4.weight = me4.b(f3, f4, floatValue, f4);
                        lo.this.tmh.weight = 100.0f - layoutParams2.weight;
                        if (lo.this.mk != null) {
                            lo.this.mk.setLayoutParams(layoutParams2);
                        }
                        if (lo.this.yt != null) {
                            lo.this.yt.setLayoutParams(lo.this.tmh);
                        }
                        float f5 = lo.this.tmh.weight;
                        lo loVar = lo.this;
                        if (f5 < 30.0f) {
                            loVar.oo(8);
                        } else {
                            loVar.oo(0);
                        }
                        FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                        layoutParams5.width = i3 + ((int) ((sf2 - r1) * floatValue));
                        layoutParams5.height = i2 + ((int) ((sf3 - r1) * floatValue));
                        layoutParams5.leftMargin = i4 + ((int) ((sf4 - r1) * floatValue));
                        layoutParams5.topMargin = i5 + ((int) ((sf5 - r1) * floatValue));
                        if (lo.this.qcw != null) {
                            lo.this.qcw.setLayoutParams(layoutParams3);
                        }
                        lo.this.pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        if (floatValue == 1.0f) {
                            if (lo.this.ptr != null) {
                                rj.pcc((View) lo.this.ptr, 0);
                                boolean gm = lo.this.gm(i);
                                lo loVar2 = lo.this;
                                if (gm) {
                                    loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_down"));
                                    lo.this.ptr.setTag(1);
                                } else {
                                    loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_up"));
                                    lo.this.ptr.setTag(2);
                                }
                            }
                            if (lo.this.bg == null) {
                                lo.this.bg = new AtomicBoolean();
                            }
                            lo.this.bg.set(lo.this.gm(i));
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.oo.gm.oo(this.qf, this.zti, i);
                this.ork.start();
                if (this.gh.compareAndSet(false, true)) {
                }
                hcVar = this.tsx;
                if (hcVar != null) {
                }
                rj.pcc((View) this.ptr, 8);
            }
            f = 70.0f;
            final float f32 = f;
            layoutParams = (FrameLayout.LayoutParams) this.qcw.getLayoutParams();
            if (layoutParams == null) {
            }
            final FrameLayout.LayoutParams layoutParams32 = layoutParams;
            final int i22 = layoutParams32.height;
            final int i32 = layoutParams32.width;
            final int i42 = layoutParams32.leftMargin;
            final int i52 = layoutParams32.topMargin;
            final int sf22 = rj.sf(this.lq, (float) gbbVar.qf());
            final int sf32 = rj.sf(this.lq, (float) gbbVar.kj());
            final int sf42 = rj.sf(this.lq, (float) gbbVar.vj());
            final int sf52 = rj.sf(this.lq, (float) gbbVar.wh());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.ork = ofFloat2;
            ofFloat2.setDuration(500L);
            this.ork.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                    float f4 = f2;
                    layoutParams4.weight = me4.b(f32, f4, floatValue, f4);
                    lo.this.tmh.weight = 100.0f - layoutParams2.weight;
                    if (lo.this.mk != null) {
                        lo.this.mk.setLayoutParams(layoutParams2);
                    }
                    if (lo.this.yt != null) {
                        lo.this.yt.setLayoutParams(lo.this.tmh);
                    }
                    float f5 = lo.this.tmh.weight;
                    lo loVar = lo.this;
                    if (f5 < 30.0f) {
                        loVar.oo(8);
                    } else {
                        loVar.oo(0);
                    }
                    FrameLayout.LayoutParams layoutParams5 = layoutParams32;
                    layoutParams5.width = i32 + ((int) ((sf22 - r1) * floatValue));
                    layoutParams5.height = i22 + ((int) ((sf32 - r1) * floatValue));
                    layoutParams5.leftMargin = i42 + ((int) ((sf42 - r1) * floatValue));
                    layoutParams5.topMargin = i52 + ((int) ((sf52 - r1) * floatValue));
                    if (lo.this.qcw != null) {
                        lo.this.qcw.setLayoutParams(layoutParams32);
                    }
                    lo.this.pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (floatValue == 1.0f) {
                        if (lo.this.ptr != null) {
                            rj.pcc((View) lo.this.ptr, 0);
                            boolean gm = lo.this.gm(i);
                            lo loVar2 = lo.this;
                            if (gm) {
                                loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_down"));
                                lo.this.ptr.setTag(1);
                            } else {
                                loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_up"));
                                lo.this.ptr.setTag(2);
                            }
                        }
                        if (lo.this.bg == null) {
                            lo.this.bg = new AtomicBoolean();
                        }
                        lo.this.bg.set(lo.this.gm(i));
                    }
                }
            });
            com.bytedance.sdk.openadsdk.oo.gm.oo(this.qf, this.zti, i);
            this.ork.start();
            if (this.gh.compareAndSet(false, true)) {
            }
            hcVar = this.tsx;
            if (hcVar != null) {
            }
            rj.pcc((View) this.ptr, 8);
        }
        if (jsj != null) {
            wh = jsj.vj();
            f = wh;
            final float f322 = f;
            layoutParams = (FrameLayout.LayoutParams) this.qcw.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            final FrameLayout.LayoutParams layoutParams322 = layoutParams;
            final int i222 = layoutParams322.height;
            final int i322 = layoutParams322.width;
            final int i422 = layoutParams322.leftMargin;
            final int i522 = layoutParams322.topMargin;
            final int sf222 = rj.sf(this.lq, (float) gbbVar.qf());
            final int sf322 = rj.sf(this.lq, (float) gbbVar.kj());
            final int sf422 = rj.sf(this.lq, (float) gbbVar.vj());
            final int sf522 = rj.sf(this.lq, (float) gbbVar.wh());
            ValueAnimator ofFloat22 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.ork = ofFloat22;
            ofFloat22.setDuration(500L);
            this.ork.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                    float f4 = f2;
                    layoutParams4.weight = me4.b(f322, f4, floatValue, f4);
                    lo.this.tmh.weight = 100.0f - layoutParams2.weight;
                    if (lo.this.mk != null) {
                        lo.this.mk.setLayoutParams(layoutParams2);
                    }
                    if (lo.this.yt != null) {
                        lo.this.yt.setLayoutParams(lo.this.tmh);
                    }
                    float f5 = lo.this.tmh.weight;
                    lo loVar = lo.this;
                    if (f5 < 30.0f) {
                        loVar.oo(8);
                    } else {
                        loVar.oo(0);
                    }
                    FrameLayout.LayoutParams layoutParams5 = layoutParams322;
                    layoutParams5.width = i322 + ((int) ((sf222 - r1) * floatValue));
                    layoutParams5.height = i222 + ((int) ((sf322 - r1) * floatValue));
                    layoutParams5.leftMargin = i422 + ((int) ((sf422 - r1) * floatValue));
                    layoutParams5.topMargin = i522 + ((int) ((sf522 - r1) * floatValue));
                    if (lo.this.qcw != null) {
                        lo.this.qcw.setLayoutParams(layoutParams322);
                    }
                    lo.this.pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (floatValue == 1.0f) {
                        if (lo.this.ptr != null) {
                            rj.pcc((View) lo.this.ptr, 0);
                            boolean gm = lo.this.gm(i);
                            lo loVar2 = lo.this;
                            if (gm) {
                                loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_down"));
                                lo.this.ptr.setTag(1);
                            } else {
                                loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_up"));
                                lo.this.ptr.setTag(2);
                            }
                        }
                        if (lo.this.bg == null) {
                            lo.this.bg = new AtomicBoolean();
                        }
                        lo.this.bg.set(lo.this.gm(i));
                    }
                }
            });
            com.bytedance.sdk.openadsdk.oo.gm.oo(this.qf, this.zti, i);
            this.ork.start();
            if (this.gh.compareAndSet(false, true)) {
                this.gdh = SystemClock.elapsedRealtime();
            }
            hcVar = this.tsx;
            if (hcVar != null) {
                hcVar.pcc(true, SystemClock.elapsedRealtime());
            }
            rj.pcc((View) this.ptr, 8);
        }
        f = 30.0f;
        final float f3222 = f;
        layoutParams = (FrameLayout.LayoutParams) this.qcw.getLayoutParams();
        if (layoutParams == null) {
        }
        final FrameLayout.LayoutParams layoutParams3222 = layoutParams;
        final int i2222 = layoutParams3222.height;
        final int i3222 = layoutParams3222.width;
        final int i4222 = layoutParams3222.leftMargin;
        final int i5222 = layoutParams3222.topMargin;
        final int sf2222 = rj.sf(this.lq, (float) gbbVar.qf());
        final int sf3222 = rj.sf(this.lq, (float) gbbVar.kj());
        final int sf4222 = rj.sf(this.lq, (float) gbbVar.vj());
        final int sf5222 = rj.sf(this.lq, (float) gbbVar.wh());
        ValueAnimator ofFloat222 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.ork = ofFloat222;
        ofFloat222.setDuration(500L);
        this.ork.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.lo.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                float f4 = f2;
                layoutParams4.weight = me4.b(f3222, f4, floatValue, f4);
                lo.this.tmh.weight = 100.0f - layoutParams2.weight;
                if (lo.this.mk != null) {
                    lo.this.mk.setLayoutParams(layoutParams2);
                }
                if (lo.this.yt != null) {
                    lo.this.yt.setLayoutParams(lo.this.tmh);
                }
                float f5 = lo.this.tmh.weight;
                lo loVar = lo.this;
                if (f5 < 30.0f) {
                    loVar.oo(8);
                } else {
                    loVar.oo(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3222;
                layoutParams5.width = i3222 + ((int) ((sf2222 - r1) * floatValue));
                layoutParams5.height = i2222 + ((int) ((sf3222 - r1) * floatValue));
                layoutParams5.leftMargin = i4222 + ((int) ((sf4222 - r1) * floatValue));
                layoutParams5.topMargin = i5222 + ((int) ((sf5222 - r1) * floatValue));
                if (lo.this.qcw != null) {
                    lo.this.qcw.setLayoutParams(layoutParams3222);
                }
                lo.this.pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (floatValue == 1.0f) {
                    if (lo.this.ptr != null) {
                        rj.pcc((View) lo.this.ptr, 0);
                        boolean gm = lo.this.gm(i);
                        lo loVar2 = lo.this;
                        if (gm) {
                            loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_down"));
                            lo.this.ptr.setTag(1);
                        } else {
                            loVar2.ptr.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(lo.this.lq, "tt_ad_zoom_up"));
                            lo.this.ptr.setTag(2);
                        }
                    }
                    if (lo.this.bg == null) {
                        lo.this.bg = new AtomicBoolean();
                    }
                    lo.this.bg.set(lo.this.gm(i));
                }
            }
        });
        com.bytedance.sdk.openadsdk.oo.gm.oo(this.qf, this.zti, i);
        this.ork.start();
        if (this.gh.compareAndSet(false, true)) {
        }
        hcVar = this.tsx;
        if (hcVar != null) {
        }
        rj.pcc((View) this.ptr, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.ywp < 100) {
            return false;
        }
        this.ywp = currentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
