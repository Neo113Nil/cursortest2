package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.jr;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.common.tmg;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.gbb;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import com.ironsource.Ua;
import defpackage.fem;
import defpackage.w1l;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.vh.oo {
    private TextView bg;
    nac fmh;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh gdh;
    private PAGLogoView gh;
    private View hoh;
    private long kz;
    private View ptr;
    private boolean qcw;
    private tmg se;
    private com.bytedance.sdk.openadsdk.common.vj tmh;
    private TextView vr;
    TTAdDislikeToast zsj;
    private boolean ew = false;
    final AtomicBoolean gd = new AtomicBoolean(false);
    final AtomicBoolean erj = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void dax() {
        tmg tmgVar = this.se;
        if (tmgVar != null) {
            tmgVar.sf();
        }
    }

    private void gpj() {
        try {
            if (this.fmh == null) {
                nac nacVar = new nac(this.vj, this.gbb);
                this.fmh = nacVar;
                nacVar.setDislikeSource("landing_page");
                this.fmh.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.erj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.erj.set(true);
                        TTVideoLandingPageLink2Activity.this.lo();
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void sf(View view) {
                        TTVideoLandingPageLink2Activity.this.gd.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(View view) {
                        TTVideoLandingPageLink2Activity.this.gd.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.fmh);
            if (this.zsj == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.vj);
                this.zsj = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jr() {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.gbb, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lo() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.zsj) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void nac() {
        TTAdDislikeToast tTAdDislikeToast = this.zsj;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void gm() {
        super.gm();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(tz.pcc(lu.pcc(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.hc();
                }
            });
        }
        this.vr = (TextView) findViewById(520093714);
        this.se = (tmg) findViewById(com.bytedance.sdk.openadsdk.utils.nac.zsj);
        this.ptr = findViewById(com.bytedance.sdk.openadsdk.utils.nac.fmh);
        this.hoh = findViewById(com.bytedance.sdk.openadsdk.utils.nac.rnn);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.erj);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.se);
        com.bytedance.sdk.openadsdk.core.widget.nac nacVar = (com.bytedance.sdk.openadsdk.core.widget.nac) findViewById(com.bytedance.sdk.openadsdk.utils.nac.gd);
        this.bg = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.ptr);
        if (this.gbb.zk() != null && !TextUtils.isEmpty(this.gbb.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gbb.zk(), nacVar, this.gbb);
        }
        textView2.setText(this.gbb.ofe());
        textView3.setText(this.gbb.lc());
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.nac.hoh);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    IABLandingPageActivity.pcc(tTVideoLandingPageLink2Activity.vj, tTVideoLandingPageLink2Activity.gbb, tTVideoLandingPageLink2Activity.atb);
                } else {
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity2 = TTVideoLandingPageLink2Activity.this;
                    TTWebsiteActivity.pcc(tTVideoLandingPageLink2Activity2.vj, tTVideoLandingPageLink2Activity2.gbb, tTVideoLandingPageLink2Activity2.atb);
                }
            }
        });
        if (findViewById instanceof PAGLogoView) {
            ((PAGLogoView) findViewById).initData(this.gbb);
        }
        com.bytedance.sdk.component.vy.qf qfVar = ((TTVideoLandingPageActivity) this).pcc;
        if (qfVar != null && qfVar.getWebView() != null) {
            kun.pcc(this.gbb, ((TTVideoLandingPageActivity) this).pcc);
        }
        if (((TTVideoLandingPageActivity) this).pcc.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).pcc.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    hc hcVar = TTVideoLandingPageLink2Activity.this.kun;
                    if (hcVar != null) {
                        hcVar.pcc(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.tmh == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.tmh.pcc(motionEvent);
                    return false;
                }
            });
        }
        tmg tmgVar = this.se;
        if (tmgVar != null) {
            tmgVar.pcc(this.gbb);
        }
    }

    public void hc() {
        if (isFinishing()) {
            return;
        }
        if (this.erj.get()) {
            nac();
            return;
        }
        if (this.fmh == null) {
            gpj();
        }
        nac nacVar = this.fmh;
        if (nacVar != null) {
            nacVar.pcc();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tmg tmgVar = this.se;
        if (tmgVar != null) {
            tmgVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        of ofVar;
        com.bytedance.sdk.component.vy.qf qfVar;
        super.onCreate(bundle);
        if (!jr.vj() || (ofVar = this.gbb) == null || (qfVar = ((TTVideoLandingPageActivity) this).pcc) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.vj pcc = kun.pcc(ofVar, qfVar, this.vj, this.atb);
        this.tmh = pcc;
        if (pcc != null) {
            pcc.pcc("landingpage_split_screen");
        }
        if (((TTVideoLandingPageActivity) this).pcc.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).pcc.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    hc hcVar = TTVideoLandingPageLink2Activity.this.kun;
                    if (hcVar != null) {
                        hcVar.sf(i2);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(this.vj, this.kj, this.wh, this.tmh, this.kun, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.ptr != null && !TTVideoLandingPageLink2Activity.this.qcw) {
                        TTVideoLandingPageLink2Activity.this.ptr.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.ew = true;
                    TTVideoLandingPageLink2Activity.this.dax();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(tTVideoLandingPageLink2Activity.gbb, tTVideoLandingPageLink2Activity.atb, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.kz, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.kz = System.currentTimeMillis();
            }
        };
        this.gdh = whVar;
        whVar.pcc(this.gbb);
        ((TTVideoLandingPageActivity) this).pcc.setWebViewClient(this.gdh);
        ((TTVideoLandingPageActivity) this).pcc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.kj, this.kun, this.tmh) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.se != null) {
                    TTVideoLandingPageLink2Activity.this.se.pcc(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.am);
        if (textView != null && this.gbb.yt() != null) {
            textView.setText(this.gbb.yt().vj());
        }
        of ofVar2 = this.gbb;
        jr.gm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.qcw = true;
                    if (TTVideoLandingPageLink2Activity.this.se != null) {
                        TTVideoLandingPageLink2Activity.this.se.sf();
                    }
                    TTVideoLandingPageLink2Activity.this.hoh.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.gh != null) {
                        TTVideoLandingPageLink2Activity.this.gh.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.ew) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(tTVideoLandingPageLink2Activity.gbb, tTVideoLandingPageLink2Activity.atb, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.kz, false);
                } catch (Exception unused) {
                }
            }
        }, (ofVar2 == null || ofVar2.yt() == null) ? Ua.s : this.gbb.yt().pcc() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        dax();
        if (!this.qcw && this.kun != null && ((TTVideoLandingPageActivity) this).pcc != null && this.se.getVisibility() == 8) {
            this.kun.pcc(((TTVideoLandingPageActivity) this).pcc);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void ork() {
        super.ork();
        of ofVar = this.gbb;
        if (ofVar != null) {
            ofVar.gbb(true);
        }
        TextView textView = this.bg;
        if (textView != null) {
            textView.setText(sf());
            this.bg.setClickable(true);
            this.bg.setOnClickListener(this.hpk);
            this.bg.setOnTouchListener(this.hpk);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public View pcc() {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        if (Build.VERSION.SDK_INT >= 35) {
            vjVar.setFitsSystemWindows(true);
        }
        vjVar.setOrientation(1);
        vjVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        vjVar.addView(gmVar, new LinearLayout.LayoutParams(-1, rj.sf(this, 220.0f)));
        View gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        gmVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.tsx);
        gmVar.addView(gmVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        vjVar2.setOrientation(0);
        vjVar2.setPadding(0, rj.sf(this, 20.0f), 0, 0);
        gmVar.addView(vjVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        vjVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.jr jrVar = new com.bytedance.sdk.openadsdk.core.widget.jr(this);
        jrVar.setId(520093713);
        jrVar.setGravity(17);
        jrVar.setText(tz.pcc(this, "tt_reward_feedback"));
        jrVar.setTextColor(-1);
        jrVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, rj.sf(this, 28.0f));
        int sf = rj.sf(this, 16.0f);
        layoutParams2.rightMargin = sf;
        layoutParams2.leftMargin = sf;
        vjVar2.addView(jrVar, layoutParams2);
        gbb gbbVar = new gbb(this);
        gbbVar.setId(com.bytedance.sdk.openadsdk.utils.nac.kun);
        gbbVar.setPadding(rj.sf(this, 7.0f), rj.sf(this, 7.0f), rj.sf(this, 7.0f), rj.sf(this, 7.0f));
        gbbVar.setImageResource(tz.oo(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(rj.sf(this, 28.0f), rj.sf(this, 28.0f));
        layoutParams3.rightMargin = rj.sf(this, 12.0f);
        vjVar2.addView(gbbVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(this);
        qfVar.setVisibility(8);
        qfVar.setId(com.bytedance.sdk.openadsdk.utils.nac.rj);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = rj.sf(this, 10.0f);
        vjVar.addView(qfVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.pcc pccVar = new com.bytedance.sdk.openadsdk.core.widget.pcc(this);
        pccVar.setId(com.bytedance.sdk.openadsdk.utils.nac.lrr);
        pccVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        pccVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(rj.sf(this, 44.0f), rj.sf(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = rj.sf(this, 5.0f);
        qfVar.addView(pccVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        int i = com.bytedance.sdk.openadsdk.utils.nac.iv;
        kjVar.setId(i);
        kjVar.setBackground(vh.pcc(this, "tt_circle_solid_mian"));
        kjVar.setGravity(17);
        kjVar.setTextColor(-1);
        kjVar.setTextSize(2, 19.0f);
        kjVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(rj.sf(this, 44.0f), rj.sf(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = rj.sf(this, 5.0f);
        qfVar.addView(kjVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.xb);
        kjVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar2.setEllipsize(truncateAt);
        kjVar2.setTextColor(Color.parseColor("#e5000000"));
        kjVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams c = w1l.c(-2, -2, 15);
        c.leftMargin = rj.sf(this, 5.0f);
        c.rightMargin = rj.sf(this, 80.0f);
        c.addRule(1, i);
        qfVar.addView(kjVar2, c);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar3.setId(com.bytedance.sdk.openadsdk.utils.nac.ri);
        kjVar3.setClickable(true);
        kjVar3.setMaxLines(1);
        kjVar3.setEllipsize(truncateAt);
        kjVar3.setFocusable(true);
        kjVar3.setGravity(17);
        kjVar3.setText(tz.pcc(this, "tt_video_mobile_go_detail"));
        kjVar3.setTextColor(-1);
        kjVar3.setTextSize(2, 14.0f);
        kjVar3.setPadding(rj.sf(this, 2.0f), rj.sf(this, 2.0f), rj.sf(this, 2.0f), rj.sf(this, 2.0f));
        kjVar3.setBackground(vh.pcc(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(rj.sf(this, 90.0f), rj.sf(this, 36.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = rj.sf(this, 5.0f);
        qfVar.addView(kjVar3, layoutParams7);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        vjVar.addView(gmVar3, new LinearLayout.LayoutParams(-1, -1));
        View qfVar2 = new com.bytedance.sdk.component.vy.qf(this, qf.gm.LANDING_PAGE);
        qfVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.hpk);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams8.topMargin = rj.sf(this, 2.0f);
        gmVar3.addView(qfVar2, layoutParams8);
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar3 = new com.bytedance.sdk.openadsdk.core.wh.qf(this);
        qfVar3.setId(com.bytedance.sdk.openadsdk.utils.nac.fmh);
        qfVar3.setBackgroundColor(Color.parseColor("#F8F8F8"));
        gmVar3.addView(qfVar3, new FrameLayout.LayoutParams(-1, -1));
        View tmgVar = new tmg(this);
        tmgVar.setId(com.bytedance.sdk.openadsdk.utils.nac.zsj);
        qfVar3.addView(tmgVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        vjVar3.setId(com.bytedance.sdk.openadsdk.utils.nac.rnn);
        vjVar3.setOrientation(1);
        vjVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(13);
        qfVar3.addView(vjVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.widget.nac nacVar = new com.bytedance.sdk.openadsdk.core.widget.nac(this);
        nacVar.setId(com.bytedance.sdk.openadsdk.utils.nac.gd);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(rj.sf(this, 80.0f), rj.sf(this, 80.0f));
        layoutParams10.gravity = 17;
        vjVar3.addView(nacVar, layoutParams10);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar4.setId(com.bytedance.sdk.openadsdk.utils.nac.erj);
        kjVar4.setTextColor(Color.parseColor("#161823"));
        kjVar4.setTextSize(0, rj.sf(this, 24.0f));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams11.gravity = 17;
        layoutParams11.topMargin = rj.sf(this, 12.0f);
        vjVar3.addView(kjVar4, layoutParams11);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar5 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar5.setId(com.bytedance.sdk.openadsdk.utils.nac.se);
        kjVar5.setTextColor(Color.parseColor("#80161823"));
        kjVar5.setTextSize(0, rj.sf(this, 16.0f));
        kjVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        int sf2 = rj.sf(this, 60.0f);
        layoutParams12.rightMargin = sf2;
        layoutParams12.leftMargin = sf2;
        layoutParams12.topMargin = rj.sf(this, 8.0f);
        vjVar3.addView(kjVar5, layoutParams12);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar6 = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
        kjVar6.setId(com.bytedance.sdk.openadsdk.utils.nac.ptr);
        kjVar6.setGravity(17);
        kjVar6.setTextColor(-1);
        kjVar6.setText(tz.pcc(this, "tt_video_mobile_go_detail"));
        kjVar6.setBackground(vh.pcc(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(rj.sf(this, 255.0f), rj.sf(this, 44.0f));
        layoutParams13.gravity = 17;
        layoutParams13.topMargin = rj.sf(this, 32.0f);
        vjVar3.addView(kjVar6, layoutParams13);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.gh = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.nac.hoh);
        this.gh.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, rj.sf(this, 14.0f));
        layoutParams14.addRule(12);
        layoutParams14.leftMargin = rj.sf(this, 18.0f);
        layoutParams14.bottomMargin = rj.sf(this, 61.0f);
        qfVar3.addView(this.gh, layoutParams14);
        View jrVar2 = new com.bytedance.sdk.openadsdk.common.jr(this, new jr.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.jr.pcc
            public View pcc(Context context) {
                return new com.bytedance.sdk.openadsdk.common.kj(context);
            }
        });
        jrVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.qcw);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, rj.sf(this, 48.0f));
        layoutParams15.gravity = 81;
        gmVar3.addView(jrVar2, layoutParams15);
        return vjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void vj() {
        if (!wh()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gbb.by().get(0), imageView, this.gbb);
                this.ork.setVisibility(0);
                this.ork.removeAllViews();
                this.ork.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.oo.gm.sf(TTVideoLandingPageLink2Activity.this.gbb, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.vj();
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.tmg;
        if (whVar != null) {
            if (whVar.getNativeVideoController() != null) {
                this.tmg.getNativeVideoController().pcc(false);
                this.tmg.getNativeVideoController().wh(false);
                this.ork.setClickable(true);
                this.ork.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.12
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.jr();
                        return false;
                    }
                });
            }
            this.tmg.getNativeVideoController().pcc(new fem() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.2
                @Override // defpackage.fem
                public void pcc(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.vr != null) {
                        int max = (int) Math.max(0L, (j2 - j) / 1000);
                        TTVideoLandingPageLink2Activity.this.vr.setText(String.valueOf(max));
                        if (max <= 0) {
                            TTVideoLandingPageLink2Activity.this.vr.setVisibility(8);
                        }
                    }
                }

                @Override // defpackage.fem
                public void pcc(long j, int i) {
                }

                @Override // defpackage.fem
                public void pcc() {
                }

                @Override // defpackage.fem
                public void sf(long j, int i) {
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public boolean wh() {
        int i = this.vh;
        return i == 5 || i == 15 || i == 50;
    }
}
