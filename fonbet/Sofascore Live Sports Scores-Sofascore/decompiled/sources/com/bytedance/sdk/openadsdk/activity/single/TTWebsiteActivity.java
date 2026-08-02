package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.common.fum;
import com.bytedance.sdk.openadsdk.common.hc;
import com.bytedance.sdk.openadsdk.common.lo;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import defpackage.wv8;
import java.net.URLEncoder;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private of dax;
    private ImageView gbb;
    private ImageView hc;
    private ImageView jr;
    private String kj;
    private lo oo;
    private int ork;
    public hc pcc;
    private qf.pcc qf;
    private float tmg;
    private ILoader vh;
    private com.bytedance.sdk.component.vy.qf vj;
    private int vy;
    private String gm = null;
    private boolean wh = false;
    int sf = -1;

    private void pcc(final of ofVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.vy.qf qfVar;
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        if (Build.VERSION.SDK_INT >= 35) {
            vjVar.setFitsSystemWindows(true);
        }
        vjVar.setBackgroundColor(-1);
        vjVar.setId(520093726);
        vjVar.setOrientation(1);
        vjVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(vjVar);
            int sf = rj.sf(this, 5.0f);
            int sf2 = rj.sf(this, 8.0f);
            int sf3 = rj.sf(this, 10.0f);
            int sf4 = rj.sf(this, 12.0f);
            int sf5 = rj.sf(this, 14.0f);
            int sf6 = rj.sf(this, 20.0f);
            int sf7 = rj.sf(this, 24.0f);
            int sf8 = rj.sf(this, 40.0f);
            int sf9 = rj.sf(this, 44.0f);
            int sf10 = rj.sf(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.wh.qf qfVar2 = new com.bytedance.sdk.openadsdk.core.wh.qf(this);
            qfVar2.setGravity(15);
            qfVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, sf9));
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(this);
            ooVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(sf8, sf9);
            layoutParams.setMarginStart(sf2);
            ooVar.setLayoutParams(layoutParams);
            ooVar.setClickable(true);
            ooVar.setFocusable(true);
            ooVar.setPadding(sf5, sf4, sf5, sf4);
            ooVar.setImageDrawable(tz.gm(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(this);
            ooVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(sf8, sf9);
            layoutParams2.addRule(17, 520093720);
            ooVar2.setLayoutParams(layoutParams2);
            ooVar2.setClickable(true);
            ooVar2.setFocusable(true);
            ooVar2.setPadding(sf4, sf5, sf4, sf5);
            ooVar2.setImageDrawable(tz.gm(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(this);
            kjVar.setId(nac.vd);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(sf10, sf7);
            layoutParams3.setMarginStart(sf);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            kjVar.setLayoutParams(layoutParams3);
            kjVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            kjVar.setGravity(17);
            kjVar.setSingleLine(true);
            kjVar.setTextColor(Color.parseColor("#222222"));
            kjVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar3 = new com.bytedance.sdk.openadsdk.core.wh.oo(this);
            ooVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(sf8, sf9);
            layoutParams4.addRule(16, 520093742);
            ooVar3.setLayoutParams(layoutParams4);
            ooVar3.setPadding(sf3, sf4, sf3, sf4);
            ooVar3.setImageDrawable(tz.gm(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar4 = new com.bytedance.sdk.openadsdk.core.wh.oo(this);
            ooVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(sf8, sf9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(sf2);
            ooVar4.setLayoutParams(layoutParams5);
            ooVar4.setPadding(sf4, sf6, sf4, sf6);
            ooVar4.setImageDrawable(tz.gm(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.wh.wh whVar = new com.bytedance.sdk.openadsdk.core.wh.wh(this, null, R.style.Widget.ProgressBar.Horizontal);
            whVar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, rj.sf(this, 2.0f));
            layoutParams6.addRule(12);
            whVar.setLayoutParams(layoutParams6);
            whVar.setProgress(1);
            whVar.setProgressDrawable(vh.pcc(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, rj.sf(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            qfVar2.addView(ooVar);
            qfVar2.addView(ooVar2);
            qfVar2.addView(kjVar);
            qfVar2.addView(ooVar3);
            qfVar2.addView(ooVar4);
            qfVar2.addView(whVar);
            qfVar2.addView(view);
            vjVar.addView(qfVar2);
            try {
                com.bytedance.sdk.component.vy.qf qfVar3 = new com.bytedance.sdk.component.vy.qf(this, qf.gm.PRIVACY);
                this.vj = qfVar3;
                qfVar3.setBackgroundColor(-1);
                vjVar.addView(this.vj, new ViewGroup.LayoutParams(-1, -1));
                ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        boolean kj = TTWebsiteActivity.this.vj.kj();
                        TTWebsiteActivity tTWebsiteActivity = TTWebsiteActivity.this;
                        if (kj) {
                            tTWebsiteActivity.vj.vy();
                        } else {
                            tTWebsiteActivity.finish();
                        }
                    }
                });
                ooVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                ooVar2.setVisibility(4);
                ooVar2.setClickable(false);
                if (!TextUtils.isEmpty(str3)) {
                    kjVar.setText(str3);
                }
                ooVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.vj.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.sf.pcc(TTWebsiteActivity.this, intent, null);
                    }
                });
                ooVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.8
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.oo == null) {
                            TTWebsiteActivity.this.oo = new lo(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.oo.pcc(ofVar);
                            TTWebsiteActivity.this.oo.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.oo.show();
                    }
                });
                this.gm = str2;
                if (!TextUtils.isEmpty(str)) {
                    String encode = URLEncoder.encode(str);
                    boolean contains = this.gm.contains("?");
                    String str4 = this.gm;
                    if (contains) {
                        this.gm = wv8.i(str4, "&gdid_encrypted=", encode);
                    } else {
                        this.gm = wv8.i(str4, "?gdid_encrypted=", encode);
                    }
                }
                if (this.gm == null || (qfVar = this.vj) == null) {
                    finish();
                    return;
                }
                WebView webView = qfVar.getWebView();
                if (webView != null) {
                    WebSettings settings = webView.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                try {
                    com.bytedance.sdk.openadsdk.utils.of.pcc(this.vj, this.gm);
                } catch (Exception unused2) {
                    this.vj.a_(this.gm);
                }
                this.vj.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.9
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView2, int i) {
                        super.onProgressChanged(webView2, i);
                        if (whVar == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.wh.wh whVar2 = whVar;
                        if (i != 100) {
                            whVar2.setVisibility(0);
                            whVar.setProgress(i);
                            return;
                        }
                        whVar2.setVisibility(8);
                        boolean canGoBack = webView2.canGoBack();
                        com.bytedance.sdk.openadsdk.core.wh.oo ooVar5 = ooVar2;
                        if (canGoBack) {
                            ooVar5.setVisibility(0);
                            ooVar2.setClickable(true);
                        } else {
                            ooVar5.setVisibility(4);
                            ooVar2.setClickable(false);
                        }
                    }
                });
                this.vj.setWebViewClient(new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.10
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str5) {
                        super.onPageFinished(webView2, str5);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView2, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str5) {
                        try {
                            Uri parse = Uri.parse(str5);
                            if (!lu.pcc(str5)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(parse);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.sf.pcc(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView2, str5);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i, String str5, String str6) {
                        super.onReceivedError(webView2, i, str5, str6);
                    }
                });
                com.bytedance.sdk.openadsdk.core.widget.pcc.oo.sf(this.vj.getWebView());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    private void sf(final of ofVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.vy.qf qfVar;
        if (ofVar != null) {
            this.kj = ofVar.cz();
        }
        if (!TextUtils.isEmpty(this.kj)) {
            this.vh = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
            int pcc = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.vh, this.kj);
            this.vy = pcc;
            this.ork = pcc > 0 ? 2 : 0;
        }
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        if (Build.VERSION.SDK_INT >= 35) {
            vjVar.setFitsSystemWindows(true);
        }
        vjVar.setBackgroundColor(-1);
        vjVar.setId(520093726);
        vjVar.setOrientation(1);
        vjVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(vjVar);
            hc hcVar = new hc(this, ofVar, "tag", true);
            this.pcc = hcVar;
            View oo = hcVar.oo();
            this.pcc.pcc();
            oo.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            oo.setVisibility(0);
            vjVar.addView(oo);
            final TextView textView = (TextView) oo.findViewById(nac.pcc);
            oo.findViewById(nac.sf);
            final com.bytedance.sdk.openadsdk.core.wh.wh whVar = (com.bytedance.sdk.openadsdk.core.wh.wh) findViewById(520093743);
            if (whVar != null) {
                whVar.setProgress(0);
                whVar.setMax(100);
            }
            ImageView imageView = (ImageView) findViewById(nac.mua);
            this.hc = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.11
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TTWebsiteActivity.this.vj != null) {
                            if (TTWebsiteActivity.this.qf != null) {
                                TTWebsiteActivity.this.qf.pcc();
                            }
                            boolean kj = TTWebsiteActivity.this.vj.kj();
                            TTWebsiteActivity tTWebsiteActivity = TTWebsiteActivity.this;
                            if (kj) {
                                tTWebsiteActivity.vj.vy();
                            } else {
                                tTWebsiteActivity.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(nac.vo);
            this.gbb = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.12
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TTWebsiteActivity.this.vj == null || !TTWebsiteActivity.this.vj.ork()) {
                            return;
                        }
                        TTWebsiteActivity.this.vj.vh();
                    }
                });
            }
            ImageView imageView3 = (ImageView) oo.findViewById(520093740);
            this.jr = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.13
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        final fum fumVar = new fum(TTWebsiteActivity.this, true);
                        fumVar.setOnMenuItemClickListener(new fum.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.13.1
                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void gm() {
                                ClipboardManager clipboardManager;
                                if (TTWebsiteActivity.this.vj != null) {
                                    String url = TTWebsiteActivity.this.vj.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                TTWebsiteActivity.this.pcc("onSelectCopyLink");
                                fumVar.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void oo() {
                                if (TTWebsiteActivity.this.vj != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTWebsiteActivity.this.vj.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.sf.pcc(TTWebsiteActivity.this, intent, null);
                                    }
                                    TTWebsiteActivity.this.pcc("onSelectOpenInBrowser");
                                    fumVar.pcc();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void pcc() {
                                fumVar.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void sf() {
                                com.bytedance.sdk.component.vy.qf qfVar2 = TTWebsiteActivity.this.vj;
                                if (qfVar2 != null && qfVar2.getUrl() != null) {
                                    com.bytedance.sdk.openadsdk.core.wh.wh whVar2 = whVar;
                                    if (whVar2 != null) {
                                        whVar2.setVisibility(0);
                                        whVar.setProgress(0);
                                    }
                                    qfVar2.qf();
                                    String url = qfVar2.getUrl();
                                    if (url != null) {
                                        qfVar2.a_(url);
                                    }
                                    fumVar.pcc();
                                }
                                TTWebsiteActivity.this.pcc("onSelectRetry");
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void vj() {
                                if (TTWebsiteActivity.this.oo == null) {
                                    TTWebsiteActivity.this.oo = new lo(TTWebsiteActivity.this);
                                    TTWebsiteActivity.this.oo.pcc(ofVar);
                                    TTWebsiteActivity.this.oo.setCanceledOnTouchOutside(false);
                                }
                                TTWebsiteActivity.this.oo.show();
                                TTWebsiteActivity.this.pcc("onSelectReport");
                                fumVar.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void wh() {
                                TTWebsiteActivity.this.pcc("onSelectPrivacy");
                                fumVar.pcc();
                            }
                        });
                        fumVar.pcc(view);
                    }
                });
            }
            try {
                com.bytedance.sdk.component.vy.qf gm = this.pcc.gm();
                this.vj = gm;
                WebView webView = gm.getWebView();
                if (webView != null) {
                    this.qf = new com.bytedance.sdk.openadsdk.core.widget.pcc.qf(webView, ofVar, this, false).gm();
                }
                this.pcc.pcc(true);
                if (this.vj.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.vj.getParent()).removeView(this.vj);
                }
                vjVar.addView(this.vj, new ViewGroup.LayoutParams(-1, -1));
                this.gm = str2;
                if (!TextUtils.isEmpty(str)) {
                    String encode = URLEncoder.encode(str);
                    boolean contains = this.gm.contains("?");
                    String str4 = this.gm;
                    if (contains) {
                        this.gm = wv8.i(str4, "&gdid_encrypted=", encode);
                    } else {
                        this.gm = wv8.i(str4, "?gdid_encrypted=", encode);
                    }
                }
                if (this.gm == null || (qfVar = this.vj) == null) {
                    finish();
                    return;
                }
                WebView webView2 = qfVar.getWebView();
                if (webView2 != null) {
                    WebSettings settings = webView2.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                try {
                    com.bytedance.sdk.openadsdk.utils.of.pcc(this.vj, this.gm);
                } catch (Exception unused2) {
                    this.vj.a_(this.gm);
                }
                this.vj.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.2
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView3, int i) {
                        super.onProgressChanged(webView3, i);
                        if (whVar == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.wh.wh whVar2 = whVar;
                        if (i == 100) {
                            whVar2.setVisibility(8);
                            webView3.canGoBack();
                        } else {
                            whVar2.setVisibility(0);
                            whVar.setProgress(i);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView3, String str5) {
                        TextView textView2;
                        if (TextUtils.isEmpty(str5) || (textView2 = textView) == null) {
                            return;
                        }
                        textView2.setText(str5);
                        TTWebsiteActivity.this.pcc.sf(webView3.getUrl());
                    }
                });
                this.vj.setWebViewClient(new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.3
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView3, String str5) {
                        TTWebsiteActivity tTWebsiteActivity;
                        hc hcVar2;
                        super.onPageFinished(webView3, str5);
                        if (!TTWebsiteActivity.this.wh || (hcVar2 = (tTWebsiteActivity = TTWebsiteActivity.this).pcc) == null) {
                            return;
                        }
                        hcVar2.pcc(webView3, tTWebsiteActivity.qf);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView3, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView3, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView3, String str5) {
                        try {
                            Uri parse = Uri.parse(str5);
                            if (!lu.pcc(str5)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(parse);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.sf.pcc(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView3, str5);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, int i, String str5, String str6) {
                        super.onReceivedError(webView3, i, str5, str6);
                    }
                });
                if (this.vj != null && webView2 != null) {
                    webView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.4
                        private final int sf = com.bytedance.sdk.openadsdk.core.lu.sf();

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    TTWebsiteActivity.this.tmg = motionEvent.getRawY();
                                    return false;
                                }
                                if (actionMasked != 2) {
                                    return false;
                                }
                                float rawY = motionEvent.getRawY();
                                if (!TTWebsiteActivity.this.wh) {
                                    return false;
                                }
                                if (rawY - TTWebsiteActivity.this.tmg > this.sf) {
                                    TTWebsiteActivity.this.pcc.pcc();
                                }
                                if (rawY - TTWebsiteActivity.this.tmg >= (-this.sf)) {
                                    return false;
                                }
                                TTWebsiteActivity.this.pcc.sf();
                                return false;
                            } catch (Throwable unused3) {
                                return false;
                            }
                        }
                    });
                }
                com.bytedance.sdk.openadsdk.core.widget.pcc.oo.sf(webView2);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        String str2;
        String str3 = "";
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.lu.sf(getApplicationContext());
        if (!jr.vj()) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.gbb.vj.pcc(this);
        if (bundle != null) {
            this.sf = bundle.getInt("meta_index", -1);
        }
        if (this.sf < 0) {
            this.sf = atb.pcc(getIntent());
        }
        of pcc = atb.pcc().pcc(this.sf);
        this.dax = pcc;
        if (pcc == null) {
            finish();
            return;
        }
        try {
            str = pcc.mk();
            try {
                str2 = this.dax.bo().gm();
                try {
                    str3 = this.dax.bo().vj();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                str2 = "";
            }
        } catch (Throwable unused3) {
            str = "";
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            finish();
            return;
        }
        boolean atb = com.bytedance.sdk.openadsdk.core.lu.oo().atb();
        this.wh = atb;
        of ofVar = this.dax;
        if (ofVar == null || !atb) {
            pcc(ofVar, str, str2, str3);
        } else {
            sf(ofVar, str, str2, str3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.vy.qf qfVar = this.vj;
        if (qfVar != null) {
            mk.pcc(qfVar);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int pcc = this.dax != null ? atb.pcc().pcc(this.dax) : -1;
            this.sf = pcc;
            bundle.putInt("meta_index", pcc);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.sf >= 0) {
            atb.pcc().gm(this.sf);
            this.sf = -1;
        }
    }

    public static void pcc(Context context, of ofVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, str, "open_policy");
        if (!TextUtils.isEmpty(ofVar.bo().gm())) {
            Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
            intent.putExtra("meta_index", atb.pcc().pcc(ofVar));
            com.bytedance.sdk.component.utils.sf.pcc(context, intent, null);
        }
        com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(ofVar, ofVar.mnz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final String str) {
        try {
            com.bytedance.sdk.openadsdk.dax.oo.pcc(str, false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.5
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                @Nullable
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(str).sf((String) null);
                }
            });
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.TTWebsiteActivity", "Failed to put iab_click_time into JSON", e);
        }
    }
}
