package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.jr;
import com.bytedance.sdk.openadsdk.common.tmg;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.gbb.sf;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.utils.fum;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.lo;
import com.bytedance.sdk.openadsdk.utils.nac;
import defpackage.wv8;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class IABLandingPageActivity extends TTBaseLandingPageActivity {
    private static final LinkedList<WeakReference<Activity>> tsx = new LinkedList<>();
    protected boolean atb;
    protected int dax;
    protected com.bytedance.sdk.openadsdk.gbb.pcc.pcc fum;
    protected String gbb;
    protected com.bytedance.sdk.openadsdk.core.wh.wh gm;
    protected String gpj;
    protected com.bytedance.sdk.openadsdk.core.widget.pcc.wh hc;
    protected String jr;
    protected hc kj;
    private boolean kun;
    protected ILoader lo;
    private com.bytedance.sdk.openadsdk.gbb.oo lrr;
    protected String lu;
    protected int mk;
    protected String nac;
    private Button nn;
    protected tmg oo;
    protected gbb ork;
    protected com.bytedance.sdk.component.vy.qf pcc;
    protected mu qf;
    private jr rnn;
    protected ImageView sf;
    protected com.bytedance.sdk.openadsdk.common.vj tmg;
    protected int tsz;
    RelativeLayout tz;
    protected qf.pcc vh;
    protected com.bytedance.sdk.openadsdk.gbb.sf vj;
    protected com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm vy;
    protected of wh;
    protected int zti;
    int of = -1;
    protected final AtomicInteger yt = new AtomicInteger(0);
    protected final AtomicInteger qy = new AtomicInteger(0);
    protected final AtomicInteger jsj = new AtomicInteger(0);
    protected boolean ye = false;
    protected long lq = 0;
    private volatile boolean rj = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm implements View.OnTouchListener {
        private final WeakReference<hc> pcc;
        private final WeakReference<com.bytedance.sdk.openadsdk.common.vj> sf;

        public gm(hc hcVar, com.bytedance.sdk.openadsdk.common.vj vjVar) {
            this.pcc = new WeakReference<>(hcVar);
            this.sf = new WeakReference<>(vjVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            hc hcVar = this.pcc.get();
            if (hcVar != null) {
                hcVar.pcc(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.vj vjVar = this.sf.get();
            if (vjVar == null) {
                return false;
            }
            vjVar.pcc(motionEvent);
            return false;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements com.bytedance.sdk.openadsdk.oo.tmg {
        private final String gm;
        private final WeakReference<IABLandingPageActivity> oo;
        private final int pcc;
        private final of sf;

        public pcc(int i, of ofVar, String str, IABLandingPageActivity iABLandingPageActivity) {
            this.pcc = i;
            this.sf = ofVar;
            this.gm = str;
            this.oo = new WeakReference<>(iABLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.oo.tmg
        public void pcc(int i) {
            IABLandingPageActivity iABLandingPageActivity = this.oo.get();
            if (iABLandingPageActivity == null || iABLandingPageActivity.rj) {
                return;
            }
            gm.pcc.pcc(this.pcc, iABLandingPageActivity.qy.get(), iABLandingPageActivity.jsj.get(), iABLandingPageActivity.yt.get() - iABLandingPageActivity.jsj.get(), this.sf, this.gm, i);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements View.OnScrollChangeListener {
        private final WeakReference<hc> pcc;

        public sf(hc hcVar) {
            this.pcc = new WeakReference<>(hcVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            hc hcVar = this.pcc.get();
            if (hcVar != null) {
                hcVar.sf(i2);
            }
        }
    }

    private void fum() {
        if (TextUtils.isEmpty(this.lu)) {
            return;
        }
        com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.lu.oo
            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("lp_reuse");
                e.oo(IABLandingPageActivity.this.nac);
                e.pcc(BuildConfig.VERSION_NAME);
                return e;
            }
        });
        if (!this.ye) {
            this.ye = false;
            com.bytedance.sdk.openadsdk.dax.oo.pcc(false);
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.6
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("lp_reuse");
                    e.oo(IABLandingPageActivity.this.nac);
                    e.pcc(BuildConfig.VERSION_NAME);
                    return e;
                }
            });
        } else {
            hc hcVar = this.kj;
            if (hcVar != null) {
                hcVar.vj(true);
                this.wh.gpj(true);
            }
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("lp_reuse");
                    e.oo(IABLandingPageActivity.this.nac);
                    e.pcc(BuildConfig.VERSION_NAME);
                    return e;
                }
            });
            com.bytedance.sdk.openadsdk.dax.oo.pcc(true);
        }
    }

    private void gpj() {
        if (TextUtils.isEmpty(this.gpj)) {
            return;
        }
        this.lo = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
        int pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.lo, this.gpj);
        this.tsz = pcc2;
        this.mk = pcc2 > 0 ? 2 : 0;
    }

    private void jsj() {
        try {
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        } catch (Throwable unused) {
        }
        mu muVar = this.qf;
        if (muVar != null) {
            muVar.tmg();
        }
        hc hcVar = this.kj;
        if (hcVar != null) {
            hcVar.oo(true);
        }
        if (!TextUtils.isEmpty(this.gpj)) {
            gm.pcc.pcc(this.jsj.get(), this.yt.get(), this.wh);
        }
        com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.lo);
        gbb gbbVar = this.ork;
        if (gbbVar != null) {
            gbbVar.gm();
        }
    }

    private void lo() {
        mu muVar = new mu(this);
        this.qf = muVar;
        muVar.sf(this.pcc).gm(this.gbb).oo(this.jr).pcc(this.wh).sf(this.dax).pcc(this.wh.bxz()).vj(this.wh.ray()).pcc(this.pcc).sf("landingpage");
    }

    private void mk() {
        Iterator<WeakReference<Activity>> it = tsx.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity == this || activity == null) {
                it.remove();
            }
        }
    }

    private void nac() {
        try {
            com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
            if (qfVar != null) {
                WebView webView = qfVar.getWebView();
                this.pcc.setJavaScriptEnabled(true);
                this.pcc.setDomStorageEnabled(true);
                this.pcc.setMixedContentMode(0);
                if (!this.kun) {
                    webView.getSettings().setSavePassword(false);
                    this.pcc.setAllowFileAccess(false);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this).pcc(false).sf(false).pcc(webView);
                this.pcc.setLandingPage(this.kun);
                this.pcc.setTag("landingpage");
                this.pcc.setMaterialMeta(this.wh.lr());
                this.pcc.setUserAgentString(lo.pcc(webView, BuildConfig.VERSION_CODE));
            }
        } catch (Throwable unused) {
        }
    }

    private void of() {
        Activity activity;
        while (true) {
            LinkedList<WeakReference<Activity>> linkedList = tsx;
            if (linkedList.isEmpty()) {
                return;
            }
            WeakReference<Activity> pollFirst = linkedList.pollFirst();
            if (pollFirst != null && (activity = pollFirst.get()) != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        }
    }

    private boolean pcc(Bundle bundle) {
        Intent intent = getIntent();
        this.zti = intent.getIntExtra("scene", 0);
        this.lu = intent.getStringExtra("landing_url");
        int i = this.zti;
        this.kun = i == 0 || i == 2;
        if (bundle != null) {
            try {
                int i2 = bundle.getInt("meta_index", -1);
                this.of = i2;
                if (i2 >= 0) {
                    this.wh = atb.pcc().pcc(this.of);
                }
            } catch (Throwable unused) {
            }
        }
        of ofVar = this.wh;
        if (ofVar == null) {
            ofVar = atb.pcc().pcc(atb.pcc(intent));
            this.wh = ofVar;
        }
        if (ofVar == null || TextUtils.isEmpty(this.lu)) {
            return false;
        }
        pcc(this.wh, this.zti);
        if (this.zti == 2) {
            tz();
        }
        if (pcc()) {
            fum.pcc(this.wh);
        }
        return true;
    }

    private void qy() {
        com.bytedance.sdk.component.vy.qf qfVar;
        com.bytedance.sdk.component.vy.qf qfVar2;
        if (pcc()) {
            of ofVar = this.wh;
            if (ofVar != null) {
                ofVar.tmh(0);
            }
            hc hcVar = this.kj;
            if (hcVar != null && (qfVar2 = this.pcc) != null) {
                hcVar.pcc(qfVar2);
            }
        } else {
            hc hcVar2 = this.kj;
            if (hcVar2 != null && (qfVar = this.pcc) != null) {
                hcVar2.pcc(qfVar);
            }
            com.bytedance.sdk.component.vy.qf qfVar3 = this.pcc;
            if (qfVar3 != null) {
                mk.pcc(qfVar3);
            }
        }
        this.pcc = null;
    }

    private void sf(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.lu;
            }
            this.fum = new com.bytedance.sdk.openadsdk.gbb.pcc.pcc();
            this.fum.sf(this.wh.oo().sf());
            this.fum.gm(String.valueOf(System.currentTimeMillis()));
            this.fum.vj(webView.getUrl());
            this.fum.sf(this.wh.fq());
            this.fum.pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().gm(this.wh.qrz()));
            this.fum.oo(str);
            com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().sf(this.fum);
        } catch (Exception unused) {
        }
    }

    private void tsz() {
        if (sf() && this.zti == 0) {
            com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().sf();
        }
    }

    private void tz() {
        LinkedList<WeakReference<Activity>> linkedList = tsx;
        linkedList.add(new WeakReference<>(this));
        if (linkedList.size() > 30) {
            of();
        }
    }

    private void yt() {
        final com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar == null) {
            return;
        }
        qfVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.2
            @Override // java.lang.Runnable
            public void run() {
                qfVar.scrollBy(0, 1);
                qfVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (qfVar == null || IABLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        qfVar.scrollBy(0, -1);
                    }
                }, 10L);
            }
        }, 200L);
    }

    public void dax() {
        com.bytedance.sdk.component.vy.qf qfVar;
        com.bytedance.sdk.openadsdk.gbb.sf sfVar = this.vj;
        if (sfVar == null || (qfVar = this.pcc) == null) {
            return;
        }
        sfVar.pcc(qfVar.getWebView(), this.vh);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void gbb() {
        jr();
    }

    public View gm() {
        final Bundle bundle;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        if (Build.VERSION.SDK_INT >= 35) {
            gmVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        vjVar.setOrientation(1);
        gmVar.addView(vjVar, new FrameLayout.LayoutParams(-1, -1));
        if (pcc()) {
            String str = System.identityHashCode(this.wh) + "_" + this.lu;
            bundle = fum.pcc(str);
            this.pcc = fum.pcc(new MutableContextWrapper(getApplicationContext()), str);
        } else {
            bundle = null;
            this.pcc = null;
            this.ye = false;
        }
        this.vj = new com.bytedance.sdk.openadsdk.gbb.sf(this, this.wh, this.zti);
        if (this.pcc != null && bundle != null && !bundle.isEmpty()) {
            this.vj.pcc(this.pcc);
        }
        vjVar.addView(this.vj.wh(), new FrameLayout.LayoutParams(-1, -1));
        this.vj.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.1
            @Override // com.bytedance.sdk.openadsdk.gbb.sf.pcc
            public void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
                IABLandingPageActivity iABLandingPageActivity = IABLandingPageActivity.this;
                iABLandingPageActivity.pcc = qfVar;
                iABLandingPageActivity.tz = iABLandingPageActivity.vj.pcc();
                IABLandingPageActivity iABLandingPageActivity2 = IABLandingPageActivity.this;
                iABLandingPageActivity2.sf = iABLandingPageActivity2.vj.vj();
                IABLandingPageActivity iABLandingPageActivity3 = IABLandingPageActivity.this;
                iABLandingPageActivity3.gm = iABLandingPageActivity3.vj.oo();
                IABLandingPageActivity.this.sf(bundle);
            }
        });
        jr jrVar = new jr(this, new jr.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.jr.pcc
            public View pcc(Context context) {
                return new com.bytedance.sdk.openadsdk.common.kj(context);
            }
        });
        jrVar.setId(nac.qcw);
        this.rnn = jrVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        vjVar.addView(jrVar, layoutParams);
        if (this.zti == 0) {
            pcc(gmVar);
        }
        return gmVar;
    }

    public void hc() {
        hc hcVar;
        if (this.pcc == null || TextUtils.isEmpty(this.lu)) {
            return;
        }
        if (!this.kun) {
            try {
                com.bytedance.sdk.openadsdk.utils.of.pcc(this.pcc, this.lu);
                return;
            } catch (Throwable th) {
                th.getMessage();
                this.pcc.a_(this.lu);
                return;
            }
        }
        if (!pcc()) {
            com.bytedance.sdk.openadsdk.utils.of.pcc(this.pcc, this.lu);
            return;
        }
        if (!this.ye || (hcVar = this.kj) == null) {
            com.bytedance.sdk.openadsdk.utils.of.pcc(this.pcc, this.lu);
            return;
        }
        hcVar.gm(this.lu);
        this.kj.oo(this.lu);
        this.kj.pcc(this.lu, 0L);
        tmg tmgVar = this.oo;
        if (tmgVar != null) {
            tmgVar.sf();
        }
    }

    public void jr() {
        try {
            super.onBackPressed();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void kj() {
        try {
            if (this.gm != null && !isFinishing()) {
                this.gm.setVisibility(8);
            }
        } catch (Throwable unused) {
        }
        tmg tmgVar = this.oo;
        if (tmgVar != null) {
            tmgVar.sf();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        jr();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        vh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.jr.vj()) {
            finish();
            return;
        }
        try {
            lu.sf(this);
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!pcc(bundle)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.gbb.vj.pcc(this);
        try {
            setContentView(gm());
            if (this.kun) {
                gm.pcc.pcc(SystemClock.elapsedRealtime() - elapsedRealtime, this.wh, "landingpage", this.lo, this.gpj);
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        qy();
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar != null) {
            qfVar.qf();
        }
        jsj();
        tsz();
        com.bytedance.sdk.openadsdk.gbb.sf sfVar = this.vj;
        if (sfVar != null) {
            sfVar.kj();
        }
        if (this.zti == 2) {
            mk();
        }
        this.pcc = null;
        this.rj = true;
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.lrr;
        if (ooVar != null) {
            ooVar.gm();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gbb gbbVar = this.ork;
        if (gbbVar != null) {
            gbbVar.sf();
        }
        of ofVar = this.wh;
        if (ofVar != null) {
            ofVar.qf(SystemClock.elapsedRealtime());
            this.wh.tmh(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        of ofVar = this.wh;
        if (ofVar != null) {
            ofVar.tmh(1);
        }
        mu muVar = this.qf;
        if (muVar != null) {
            muVar.vh();
        }
        hc hcVar = this.kj;
        if (hcVar != null) {
            hcVar.qf();
        }
        gbb gbbVar = this.ork;
        if (gbbVar != null) {
            gbbVar.pcc();
        }
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar != null) {
            qfVar.tmg();
            yt();
        }
        com.bytedance.sdk.openadsdk.gbb.sf sfVar = this.vj;
        if (sfVar != null) {
            sfVar.qf();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int pcc2 = this.wh != null ? atb.pcc().pcc(this.wh) : -1;
            this.of = pcc2;
            bundle.putInt("meta_index", pcc2);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.of >= 0) {
            atb.pcc().gm(this.of);
            this.of = -1;
        }
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.wh);
        of ofVar = this.wh;
        if (ofVar != null) {
            ofVar.tmh(1);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        of ofVar = this.wh;
        if (ofVar != null) {
            ofVar.tmh(0);
        }
        hc hcVar = this.kj;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean oo() {
        return true;
    }

    public void ork() {
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar == null || qfVar.getWebView() == null) {
            return;
        }
        WebView webView = this.pcc.getWebView();
        webView.setOnScrollChangeListener(new sf(this.kj));
        webView.setOnTouchListener(new gm(this.kj, this.tmg) { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.9
            private float gm;
            private final int sf = lu.sf();

            @Override // com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.gm, android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (IABLandingPageActivity.this.lrr != null) {
                    IABLandingPageActivity.this.lrr.pcc();
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.gm = motionEvent.getRawY();
                } else if (actionMasked == 2) {
                    float rawY = motionEvent.getRawY();
                    if (rawY - this.gm > this.sf) {
                        IABLandingPageActivity.this.vj.sf();
                    }
                    if (rawY - this.gm < (-this.sf)) {
                        IABLandingPageActivity.this.vj.gm();
                    }
                }
                return super.onTouch(view, motionEvent);
            }
        });
        if (this.kun) {
            this.pcc.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.10
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    IABLandingPageActivity iABLandingPageActivity = IABLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar = iABLandingPageActivity.vy;
                    if (gmVar != null) {
                        gmVar.pcc(iABLandingPageActivity.wh);
                    }
                }
            });
        }
    }

    public com.bytedance.sdk.openadsdk.core.widget.pcc.wh qf() {
        return new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(this, this.qf, this.gbb, this.tmg, this.kj, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                IABLandingPageActivity.this.kj();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                com.bytedance.sdk.openadsdk.core.wh.wh whVar = IABLandingPageActivity.this.gm;
                if (whVar != null) {
                    whVar.setVisibility(0);
                    IABLandingPageActivity.this.gm.setProgress(0);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TextUtils.isEmpty(IABLandingPageActivity.this.gpj)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    WebView webView2 = IABLandingPageActivity.this.pcc.getWebView();
                    IABLandingPageActivity.this.yt.incrementAndGet();
                    com.bytedance.sdk.openadsdk.qf.sf pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc();
                    IABLandingPageActivity iABLandingPageActivity = IABLandingPageActivity.this;
                    WebResourceResponseModel pcc3 = pcc2.pcc(iABLandingPageActivity.lo, iABLandingPageActivity.gpj, str);
                    if (pcc3 != null && pcc3.getWebResourceResponse() != null) {
                        IABLandingPageActivity.this.jsj.incrementAndGet();
                        return pcc3.getWebResourceResponse();
                    }
                    if (pcc3 != null && pcc3.getMsg() == 2) {
                        IABLandingPageActivity.this.qy.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView2, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        };
    }

    public String tmg() {
        of ofVar = this.wh;
        return (ofVar == null || TextUtils.isEmpty(ofVar.bgf())) ? getString(tz.sf(this, "tt_native_banner_download")) : this.wh.bgf();
    }

    public void vh() {
        of ofVar = this.wh;
        if (ofVar == null || ofVar.az() != 4) {
            return;
        }
        jr jrVar = this.rnn;
        if (jrVar != null) {
            jrVar.setVisibility(0);
        }
        Button button = (Button) findViewById(nac.kx);
        this.nn = button;
        if (button == null) {
            return;
        }
        pcc(tmg());
        if (this.vy == null) {
            this.vy = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this, TextUtils.isEmpty(this.nac) ? kun.sf(this.dax) : this.nac);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(this, this.wh, this.nac, this.dax);
        pccVar.pcc(false);
        pccVar.gm(true);
        pccVar.pcc(this.vy);
        this.nn.setOnClickListener(pccVar);
        this.nn.setOnTouchListener(pccVar);
    }

    public void vj() {
        kun.pcc(this.wh, this.pcc);
        tmg tmgVar = this.oo;
        if (tmgVar != null) {
            tmgVar.pcc(this.wh);
            this.oo.pcc();
        }
        this.sf = (ImageView) findViewById(520093716);
    }

    public void vy() {
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar == null) {
            return;
        }
        qfVar.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.qf, this.kj, this.tmg) { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                IABLandingPageActivity.this.pcc(i);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                super.onReceivedTitle(webView, str);
                IABLandingPageActivity.this.pcc(webView, str);
            }
        });
    }

    public void wh() {
        if (this.kun) {
            pcc pccVar = new pcc(this.tsz, this.wh, "landingpage", this);
            hc sf2 = new hc(this.wh, this.pcc.getWebView(), pccVar, this.mk).sf(true);
            this.kj = sf2;
            this.vh = sf2.pcc;
            this.tmg = kun.pcc(this.wh, this.pcc, this, this.nac);
            this.kj.vj(this.ye);
            this.wh.gpj(this.ye);
            this.lrr = new com.bytedance.sdk.openadsdk.gbb.oo(this.kj);
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.wh qf = qf();
        this.hc = qf;
        qf.pcc(this.wh);
        this.hc.pcc("landingpage");
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.lrr;
        if (ooVar != null) {
            this.hc.pcc(ooVar);
        }
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar != null) {
            qfVar.setWebViewClient(this.hc);
        }
        if (this.kun) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.wh, "landingpage", this.mk);
        }
    }

    public static void sf(Context context, of ofVar, String str) {
        pcc(context, ofVar, str, 2);
    }

    public boolean sf() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_iab_history", true) && this.kun;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(Bundle bundle) {
        nac();
        gpj();
        if (this.kun) {
            lo();
            vh();
        }
        wh();
        vy();
        ork();
        vj();
        if (this.pcc != null && bundle != null && !bundle.isEmpty() && this.pcc.getWebView() != null) {
            this.pcc.getWebView().restoreState(bundle);
            this.vj.pcc(bundle);
            this.ye = true;
        }
        hc();
        if (pcc()) {
            fum();
        }
    }

    public static void pcc(Context context, of ofVar, String str) {
        if (ofVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.sf bo = ofVar.bo();
        if (!TextUtils.isEmpty(bo.gm())) {
            pcc(context, ofVar, pcc(bo.gm(), ofVar), 1);
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, str, "open_policy");
        com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(ofVar, ofVar.mnz());
    }

    private static void pcc(Context context, of ofVar, String str, int i) {
        if (context == null || ofVar == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) IABLandingPageActivity.class);
        intent.putExtra("scene", i);
        intent.putExtra("meta_index", atb.pcc().pcc(ofVar));
        intent.putExtra("landing_url", str);
        com.bytedance.sdk.component.utils.sf.pcc(context, intent, null);
    }

    private static String pcc(String str, of ofVar) {
        String mk = ofVar != null ? ofVar.mk() : null;
        if (TextUtils.isEmpty(mk) || TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String encode = URLEncoder.encode(mk);
            if (str.contains("?")) {
                return str + "&gdid_encrypted=" + encode;
            }
            return str + "?gdid_encrypted=" + encode;
        } catch (Exception unused) {
            return str;
        }
    }

    private void pcc(of ofVar, int i) {
        if (i == 0) {
            this.atb = ofVar.gbb();
            ofVar.tmh(0);
        }
        this.gbb = ofVar.esn();
        this.jr = ofVar.hl();
        this.gpj = ofVar.cz();
        this.dax = ofVar.hc();
        this.nac = ofVar.tmg();
    }

    public boolean pcc() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false) && this.zti == 0;
    }

    private void pcc(FrameLayout frameLayout) {
        tmg tmgVar = new tmg(this);
        this.oo = tmgVar;
        tmgVar.setOnlyLoading(this.atb);
        this.oo.setId(520093721);
        frameLayout.addView(this.oo, new FrameLayout.LayoutParams(-1, -1));
    }

    public void pcc(WebView webView, String str) {
        this.vj.pcc(str);
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        this.vj.sf(url);
        if (sf()) {
            sf(webView, str);
        }
    }

    public void pcc(int i) {
        tmg tmgVar = this.oo;
        if (tmgVar != null) {
            tmgVar.pcc(i);
        }
        if (this.gm != null && !isFinishing()) {
            if (i == 100 && this.gm.isShown()) {
                this.gm.setVisibility(8);
            } else {
                this.gm.setProgress(i);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lq >= 200 || i == 100) {
            dax();
            this.lq = currentTimeMillis;
        }
    }

    public void pcc(String str) {
        if (TextUtils.isEmpty(str) || this.nn == null || isFinishing()) {
            return;
        }
        this.nn.setText(str);
    }
}
