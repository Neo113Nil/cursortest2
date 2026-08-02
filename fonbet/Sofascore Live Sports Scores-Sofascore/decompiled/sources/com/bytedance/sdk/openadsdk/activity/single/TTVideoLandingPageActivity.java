package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.vh;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.jr;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.oo.tmg;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.jem;
import defpackage.kwm;
import defpackage.oem;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.vh.oo {
    protected String atb;
    private ILoader fmh;
    protected TextView fum;
    protected of gbb;
    protected ImageView gm;
    protected long hc;
    protected String iv;
    protected Button jsj;
    protected mu kj;
    protected hc kun;
    protected RelativeLayout lo;
    protected TextView of;
    protected TextView oo;
    protected FrameLayout ork;
    protected com.bytedance.sdk.component.vy.qf pcc;
    private int ptr;
    protected String qf;
    protected jr qy;
    protected int rnn;
    private int se;
    protected ImageView sf;
    protected com.bytedance.sdk.openadsdk.core.jr.sf.wh tmg;
    protected com.bytedance.sdk.openadsdk.gpj.gm.pcc tsx;
    protected com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm tsz;
    protected com.bytedance.sdk.openadsdk.core.widget.pcc tz;
    protected Context vj;
    protected int vy;
    protected String wh;
    protected qf.pcc xb;
    protected TextView yt;
    protected int vh = -1;
    protected int jr = 0;
    protected int dax = 0;
    protected int nac = 0;
    protected int lu = 0;
    protected String gpj = "ダウンロード";
    protected boolean mk = false;
    protected boolean ye = false;
    protected boolean lq = true;
    protected boolean zti = false;
    protected String nn = null;
    protected AtomicBoolean rj = new AtomicBoolean(true);
    protected JSONArray lrr = null;
    private final AtomicInteger zsj = new AtomicInteger(0);
    private final AtomicInteger gd = new AtomicInteger(0);
    private final AtomicInteger erj = new AtomicInteger(0);
    int ri = -1;
    protected com.bytedance.sdk.openadsdk.core.gm.pcc hpk = null;
    private final jem hoh = new jem() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.11
        @Override // defpackage.jem
        public void pcc(boolean z) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.mk = z;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
            if (!z) {
                rj.pcc((View) tTVideoLandingPageActivity2.pcc, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.ork.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity3.nac;
                marginLayoutParams.height = tTVideoLandingPageActivity3.lu;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity3.dax;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity3.jr;
                tTVideoLandingPageActivity3.ork.setLayoutParams(marginLayoutParams);
                return;
            }
            rj.pcc((View) tTVideoLandingPageActivity2.pcc, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.ork.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity4 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity4.dax = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity4.jr = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity4.nac = marginLayoutParams2.width;
            tTVideoLandingPageActivity4.lu = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity4.ork.setLayoutParams(marginLayoutParams2);
        }
    };
    private final jsj.pcc qcw = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2
        /* JADX INFO: Access modifiers changed from: private */
        public void pcc(int i) {
            com.bytedance.sdk.component.vy.qf qfVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.rnn == 0 && i != 0 && (qfVar = tTVideoLandingPageActivity.pcc) != null && (str = tTVideoLandingPageActivity.nn) != null) {
                qfVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = TTVideoLandingPageActivity.this.tmg;
            if (whVar != null && whVar.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.ye && tTVideoLandingPageActivity2.rnn != i) {
                    tTVideoLandingPageActivity2.tmg.getNativeVideoController().gm(i);
                }
            }
            TTVideoLandingPageActivity.this.rnn = i;
        }

        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, final int i) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc(i);
                }
            });
        }
    };

    private void dax() {
        mu muVar = new mu(this);
        this.kj = muVar;
        muVar.sf(this.pcc).gm(this.wh).oo(this.qf).sf(this.vy).pcc(this.gbb).pcc(this.gbb.bxz()).pcc(this.pcc).sf("landingpage_split_screen").vj(this.gbb.ray());
    }

    private boolean fum() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar == null || whVar.getNativeVideoController() == null) {
            return true;
        }
        return this.tmg.getNativeVideoController().hc();
    }

    private void gpj() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar == null || whVar.getNativeVideoController() == null || fum()) {
            return;
        }
        this.tmg.gbb();
    }

    @NonNull
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh hc() {
        com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(this.vj, this.kj, this.wh, this.kun, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.iv)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    TTVideoLandingPageActivity.this.zsj.incrementAndGet();
                    WebResourceResponseModel pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(TTVideoLandingPageActivity.this.fmh, TTVideoLandingPageActivity.this.iv, str);
                    if (pcc2 != null && pcc2.getWebResourceResponse() != null) {
                        TTVideoLandingPageActivity.this.gd.incrementAndGet();
                        return pcc2.getWebResourceResponse();
                    }
                    if (pcc2 != null && pcc2.getMsg() == 2) {
                        TTVideoLandingPageActivity.this.erj.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable th) {
                    lo.pcc("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        };
        whVar.pcc(this.gbb);
        return whVar;
    }

    private void jr() {
        of ofVar = this.gbb;
        if (ofVar == null || ofVar.az() != 4) {
            return;
        }
        this.qy.setVisibility(0);
        Button button = (Button) findViewById(nac.kx);
        this.jsj = button;
        if (button != null) {
            pcc(sf());
            this.jsj.setOnClickListener(this.hpk);
            this.jsj.setOnTouchListener(this.hpk);
        }
    }

    private void lo() {
        if (this.tmg == null || fum()) {
            return;
        }
        this.tmg.gbb();
    }

    private void nac() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar;
        if (this.mk && (whVar = this.tmg) != null && whVar.getNativeVideoController() != null) {
            this.tmg.getNativeVideoController().vj(null, null);
            this.mk = false;
        } else if (!tz() || this.rj.getAndSet(true)) {
            super.onBackPressed();
        } else {
            of();
            pcc(0);
        }
    }

    private void of() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.kj.pcc("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void pcc(oem oemVar) {
        this.ye = this.ye || oemVar.hc();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.ye));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(oemVar.wh()));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(oemVar.qf() + oemVar.vy()));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_duration", Long.valueOf(oemVar.vy()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tz() {
        return !TextUtils.isEmpty(this.nn) && this.nn.contains("__luban_sdk");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void gbb() {
        nac();
    }

    public void gm() {
        this.qy = (jr) findViewById(nac.qcw);
        this.pcc = (com.bytedance.sdk.component.vy.qf) findViewById(nac.hpk);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.sf = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.pcc != null) {
                        qf.pcc pccVar = tTVideoLandingPageActivity.xb;
                        if (pccVar != null) {
                            pccVar.pcc();
                        }
                        boolean kj = TTVideoLandingPageActivity.this.pcc.kj();
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        if (kj) {
                            tTVideoLandingPageActivity2.pcc.vy();
                            return;
                        }
                        boolean tz = tTVideoLandingPageActivity2.tz();
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        if (tz) {
                            tTVideoLandingPageActivity3.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = tTVideoLandingPageActivity3.tmg;
                        if (whVar == null || whVar.getNativeVideoController() == null) {
                            jSONObject = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity4 = TTVideoLandingPageActivity.this;
                            jSONObject = kun.pcc(tTVideoLandingPageActivity4.gbb, tTVideoLandingPageActivity4.tmg.getNativeVideoController().qf(), TTVideoLandingPageActivity.this.tmg.getNativeVideoController().vh());
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity5 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(tTVideoLandingPageActivity5.gbb, "embeded_ad", "detail_back", tTVideoLandingPageActivity5.qf(), TTVideoLandingPageActivity.this.kj(), jSONObject2, (com.bytedance.sdk.openadsdk.oo.qf) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar != null) {
            whVar.setIsAutoPlay(this.zti);
        }
        ImageView imageView2 = (ImageView) findViewById(nac.kun);
        this.gm = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar2 = TTVideoLandingPageActivity.this.tmg;
                    if (whVar2 != null) {
                        if (whVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObject = kun.pcc(tTVideoLandingPageActivity.gbb, tTVideoLandingPageActivity.tmg.getNativeVideoController().qf(), TTVideoLandingPageActivity.this.tmg.getNativeVideoController().vh());
                        } else {
                            jSONObject = null;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(tTVideoLandingPageActivity2.gbb, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.qf(), TTVideoLandingPageActivity.this.kj(), jSONObject2, (com.bytedance.sdk.openadsdk.oo.qf) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.oo = (TextView) findViewById(nac.vd);
        this.ork = (FrameLayout) findViewById(nac.tsx);
        this.lo = (RelativeLayout) findViewById(nac.rj);
        this.fum = (TextView) findViewById(nac.iv);
        this.of = (TextView) findViewById(nac.xb);
        this.yt = (TextView) findViewById(nac.ri);
        this.tz = (com.bytedance.sdk.openadsdk.core.widget.pcc) findViewById(nac.lrr);
        vy();
    }

    public int kj() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar == null || whVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.tmg.getNativeVideoController().ork();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        nac();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.jr.vj()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(C.DEFAULT_MUXED_BUFFER_SIZE);
        } catch (Throwable unused) {
        }
        try {
            lu.sf(this);
        } catch (Throwable unused2) {
        }
        this.rnn = com.bytedance.sdk.component.utils.lu.gm(getApplicationContext());
        try {
            setContentView(pcc());
            this.vj = this;
            Intent intent = getIntent();
            this.zti = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.hc = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            of pcc2 = atb.pcc().pcc(atb.pcc(intent));
            this.gbb = pcc2;
            if (pcc2 != null) {
                this.vh = pcc2.ct();
                this.wh = this.gbb.esn();
                this.qf = this.gbb.hl();
                str = this.gbb.gmh();
                this.iv = this.gbb.cz();
                this.nn = this.gbb.vh();
                this.vy = this.gbb.hc();
                this.atb = this.gbb.tmg();
            } else {
                str = null;
            }
            if (this.gbb == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.iv)) {
                this.fmh = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
                int pcc3 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.fmh, this.iv);
                this.se = pcc3;
                this.ptr = pcc3 > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.tsx = com.bytedance.sdk.openadsdk.gpj.gm.pcc.pcc(new JSONObject(stringExtra));
                } catch (Exception unused3) {
                }
                com.bytedance.sdk.openadsdk.gpj.gm.pcc pccVar = this.tsx;
                if (pccVar != null) {
                    this.hc = pccVar.qf;
                }
            }
            if (bundle != null) {
                this.gbb = atb.pcc().pcc(bundle.getInt("meta_index", -1));
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.hc = j;
                }
            }
            gm();
            ork();
            dax();
            pcc(4);
            if (this.pcc != null) {
                com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this.vj).pcc(true).sf(false).pcc(this.pcc.getWebView());
                hc sf = new hc(this.gbb, this.pcc.getWebView(), new tmg() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.oo.tmg
                    public void pcc(int i) {
                        gm.pcc.pcc(TTVideoLandingPageActivity.this.se, TTVideoLandingPageActivity.this.erj.get(), TTVideoLandingPageActivity.this.gd.get(), TTVideoLandingPageActivity.this.zsj.get() - TTVideoLandingPageActivity.this.gd.get(), TTVideoLandingPageActivity.this.gbb, "landingpage_split_screen", i);
                    }
                }, this.ptr).sf(true);
                this.kun = sf;
                this.xb = sf.pcc;
                sf.pcc("landingpage_split_screen");
            }
            com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
            if (qfVar != null) {
                qfVar.setLandingPage(true);
                this.pcc.setTag("landingpage_split_screen");
                this.pcc.setMaterialMeta(this.gbb.lr());
                this.pcc.setWebViewClient(hc());
                com.bytedance.sdk.component.vy.qf qfVar2 = this.pcc;
                qfVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.vy.qf qfVar3 = this.pcc;
            if (qfVar3 != null) {
                qfVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.gbb, "landingpage_split_screen", this.ptr);
            com.bytedance.sdk.openadsdk.utils.of.pcc(this.pcc, this.nn);
            this.pcc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.kj, this.kun) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.pcc.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.5
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j2) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar = tTVideoLandingPageActivity.tsz;
                    if (gmVar != null) {
                        gmVar.pcc(tTVideoLandingPageActivity.gbb);
                    }
                }
            });
            TextView textView = this.oo;
            if (textView != null) {
                if (TextUtils.isEmpty(str)) {
                    str = tz.pcc(this, "tt_web_title_default");
                }
                textView.setText(str);
            }
            vh();
            vj();
            jr();
            gm.pcc.pcc(SystemClock.elapsedRealtime() - elapsedRealtime, this.gbb, "landingpage_split_screen", this.fmh, this.iv);
        } catch (Throwable unused4) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        tmg();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.gbb.gbb(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar != null) {
            com.bytedance.sdk.openadsdk.core.kun.pcc(qfVar.getWebView());
        }
        this.pcc = null;
        mu muVar = this.kj;
        if (muVar != null) {
            muVar.tmg();
        }
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar != null && whVar.getNativeVideoController() != null) {
            this.tmg.getNativeVideoController().vj();
        }
        this.tmg = null;
        this.gbb = null;
        hc hcVar = this.kun;
        if (hcVar != null) {
            hcVar.oo(true);
        }
        if (!TextUtils.isEmpty(this.iv)) {
            gm.pcc.pcc(this.gd.get(), this.zsj.get(), this.gbb);
        }
        com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.fmh);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        lo();
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar == null || whVar.getNativeVideoController() == null) {
            return;
        }
        pcc(this.tmg.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.lq) {
            gpj();
        }
        this.lq = false;
        mu muVar = this.kj;
        if (muVar != null) {
            muVar.vh();
        }
        hc hcVar = this.kun;
        if (hcVar != null) {
            hcVar.qf();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int pcc2 = this.gbb != null ? atb.pcc().pcc(this.gbb) : -1;
        this.ri = pcc2;
        bundle.putInt("meta_index", pcc2);
        bundle.putLong("video_play_position", this.hc);
        bundle.putBoolean("is_complete", this.ye);
        long j = this.hc;
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar != null && whVar.getNativeVideoController() != null) {
            j = this.tmg.getNativeVideoController().wh();
        }
        bundle.putLong("video_play_position", j);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.ri >= 0) {
            atb.pcc().gm(this.ri);
            this.ri = -1;
        }
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.gbb);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        hc hcVar = this.kun;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    public void ork() {
        if (this.gbb == null) {
            return;
        }
        this.tsz = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this, this.atb);
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(this, this.gbb, this.atb, this.vy);
        this.hpk = pccVar;
        pccVar.pcc(false);
        this.hpk.gm(true);
        this.yt.setOnClickListener(this.hpk);
        this.yt.setOnTouchListener(this.hpk);
        this.hpk.pcc(this.tsz);
    }

    public abstract View pcc();

    public long qf() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar == null || whVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.tmg.getNativeVideoController().vy();
    }

    public String sf() {
        of ofVar = this.gbb;
        if (ofVar != null && !TextUtils.isEmpty(ofVar.bgf())) {
            this.gpj = this.gbb.bgf();
        }
        return this.gpj;
    }

    public void tmg() {
        try {
            jsj.pcc(this.qcw);
        } catch (Exception unused) {
        }
    }

    public void vh() {
        jsj.pcc(this.qcw, this.vj);
    }

    public void vj() {
        if (wh()) {
            try {
                com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = new com.bytedance.sdk.openadsdk.core.jr.sf.wh(this.vj, this.gbb, true, null);
                this.tmg = whVar;
                if (whVar.getNativeVideoController() != null) {
                    this.tmg.getNativeVideoController().pcc(false);
                }
                if (this.ye) {
                    this.ork.setVisibility(0);
                    this.ork.removeAllViews();
                    this.ork.addView(this.tmg);
                    this.tmg.sf(true);
                } else {
                    if (!this.zti) {
                        this.hc = 0L;
                    }
                    if (this.tsx != null && this.tmg.getNativeVideoController() != null) {
                        this.tmg.getNativeVideoController().gm(this.tsx.qf);
                        this.tmg.getNativeVideoController().oo(this.tsx.vj);
                        this.tmg.pcc(lu.oo().gm(String.valueOf(this.gbb.kot())), "landingPageInit");
                    }
                    if (this.tmg.pcc(this.hc, this.lq, this.ye)) {
                        this.ork.setVisibility(0);
                        this.ork.removeAllViews();
                        this.ork.addView(this.tmg);
                    }
                    if (this.tmg.getNativeVideoController() != null) {
                        this.tmg.getNativeVideoController().pcc(false);
                        this.tmg.getNativeVideoController().pcc(this.hoh);
                    }
                }
                String pcc2 = this.gbb.by().get(0).pcc();
                com.bytedance.sdk.openadsdk.ork.oo.pcc().pcc(pcc2).pcc(this.gbb.by().get(0).sf()).sf(this.gbb.by().get(0).gm()).vj(rj.vj(lu.pcc())).oo(rj.gm(lu.pcc())).gm(2).pcc(new com.bytedance.sdk.openadsdk.ork.sf(this.gbb, pcc2, new dax() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.vj.dax
                    public void pcc(vh vhVar) {
                        try {
                            Object sf = vhVar.sf();
                            if (sf instanceof Bitmap) {
                                new pcc((Bitmap) sf, TTVideoLandingPageActivity.this.tmg.getNativeVideoController().tmg()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }

                    @Override // com.bytedance.sdk.component.vj.dax
                    public void pcc(int i, String str, @Nullable Throwable th) {
                    }
                }), 4);
                this.tmg.findViewById(520093726).setOnTouchListener(null);
                this.tmg.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e) {
                lo.gm("TTVideoLandingPage", e.getMessage());
                if (this.tmg == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.rnn == 0) {
                try {
                    Toast.makeText(this, tz.pcc(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void vy() {
        String lc;
        of ofVar = this.gbb;
        if (ofVar == null || ofVar.az() != 4) {
            return;
        }
        rj.pcc((View) this.lo, 0);
        boolean isEmpty = TextUtils.isEmpty(this.gbb.gmh());
        of ofVar2 = this.gbb;
        if (isEmpty) {
            boolean isEmpty2 = TextUtils.isEmpty(ofVar2.lc());
            of ofVar3 = this.gbb;
            lc = !isEmpty2 ? ofVar3.lc() : !TextUtils.isEmpty(ofVar3.ofe()) ? this.gbb.ofe() : "";
        } else {
            lc = ofVar2.gmh();
        }
        if (this.gbb.zk() != null && this.gbb.zk().pcc() != null) {
            rj.pcc((View) this.tz, 0);
            rj.pcc((View) this.fum, 4);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gbb.zk(), this.tz, this.gbb);
        } else if (!TextUtils.isEmpty(lc)) {
            rj.pcc((View) this.tz, 4);
            rj.pcc((View) this.fum, 0);
            this.fum.setText(lc.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.gbb.bgf())) {
            this.yt.setText(this.gbb.bgf());
        }
        if (!TextUtils.isEmpty(lc)) {
            this.of.setText(lc);
        }
        rj.pcc((View) this.of, 0);
        rj.pcc((View) this.yt, 0);
    }

    public abstract boolean wh();

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean oo() {
        return true;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends AsyncTask<Void, Void, Drawable> {
        private final Bitmap pcc;
        private final WeakReference<kwm> sf;

        private pcc(Bitmap bitmap, kwm kwmVar) {
            this.pcc = bitmap;
            this.sf = new WeakReference<>(kwmVar);
        }

        @Override // android.os.AsyncTask
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap pcc = com.bytedance.sdk.component.adexpress.oo.pcc.pcc(lu.pcc(), this.pcc, 25);
                if (pcc == null) {
                    return null;
                }
                return new BitmapDrawable(lu.pcc().getResources(), pcc);
            } catch (Throwable th) {
                lo.gm("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<kwm> weakReference;
            if (drawable == null || (weakReference = this.sf) == null || weakReference.get() == null) {
                return;
            }
            this.sf.get().pcc(drawable);
        }
    }

    private void pcc(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.jsj) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.jsj == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.jsj.setText(str);
            }
        });
    }

    private void pcc(final int i) {
        if (this.gm == null || !tz()) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                rj.pcc((View) TTVideoLandingPageActivity.this.gm, i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.vh.oo
    public void pcc(boolean z, JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.lrr = jSONArray;
    }
}
