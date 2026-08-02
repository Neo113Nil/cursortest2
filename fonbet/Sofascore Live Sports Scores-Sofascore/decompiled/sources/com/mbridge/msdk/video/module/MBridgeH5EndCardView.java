package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import defpackage.lnb;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private int A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K;
    Handler L;
    private boolean M;
    private boolean N;
    boolean O;
    protected View m;
    protected RelativeLayout n;
    protected ImageView o;
    protected WindVaneWebView p;
    private boolean q;
    protected Handler r;
    protected String s;
    protected boolean t;
    protected boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (MBridgeH5EndCardView.this.C) {
                MBridgeH5EndCardView.this.notifyListener.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "");
            }
            MBridgeH5EndCardView.this.notifyListener.a(103, "");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {
        final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            super.a(webView, i);
            StringBuilder t = lnb.t(i, "h5EncardView readyStatus:", "- isError");
            t.append(MBridgeH5EndCardView.this.u);
            q0.c("WindVaneWebView", t.toString());
            MBridgeH5EndCardView.this.A = i;
            if (!MBridgeH5EndCardView.this.u) {
                MBridgeH5EndCardView.this.a(System.currentTimeMillis() - MBridgeH5EndCardView.this.B, false);
            }
            if (this.a) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 3);
                    eVar.a("result", Integer.valueOf(i));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.b, eVar);
                } catch (Throwable th) {
                    q0.b("WindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i) {
            super.b(webView, i);
            MBridgeH5EndCardView.this.A = i;
            if (MBridgeH5EndCardView.this.z) {
                return;
            }
            MBridgeH5EndCardView.this.z = true;
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (i == 1) {
                mBridgeH5EndCardView.reportRenderResult("success", 4);
            } else {
                mBridgeH5EndCardView.notifyListener.a(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, "");
                MBridgeH5EndCardView.this.reportRenderResult(U3.i.t, 6);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.u) {
                return;
            }
            mBridgeH5EndCardView.t = true;
            mBridgeH5EndCardView.notifyListener.a(100, "");
            if (MBridgeH5EndCardView.this.b != null) {
                n nVar = new n();
                nVar.n(MBridgeH5EndCardView.this.b.getRequestId());
                nVar.o(MBridgeH5EndCardView.this.b.getRequestIdNotice());
                nVar.b(MBridgeH5EndCardView.this.b.getId());
                nVar.d(1);
                nVar.e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.B));
                nVar.m("onPageFinished");
                String str2 = "2";
                if (MBridgeH5EndCardView.this.b.getAdType() == 287) {
                    nVar.a("3");
                } else if (MBridgeH5EndCardView.this.b.getAdType() == 94) {
                    nVar.a("1");
                } else if (MBridgeH5EndCardView.this.b.getAdType() == 42) {
                    nVar.a("2");
                }
                if (MBridgeH5EndCardView.this.b.isMraid()) {
                    nVar.b(n.N);
                } else {
                    nVar.g(MBridgeH5EndCardView.this.b.getendcard_url());
                    if (a1.b(MBridgeH5EndCardView.this.b.getendcard_url()) && MBridgeH5EndCardView.this.b.getendcard_url().contains(".zip")) {
                        str2 = "1";
                    }
                    nVar.f(str2);
                    nVar.b(n.O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.b);
            }
            MBridgeH5EndCardView.this.notifyListener.a(120, "");
            if (this.a) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 3);
                eVar.a("result", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.b, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "onReceivedError " + i + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.a(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, "");
            MBridgeH5EndCardView.this.notifyListener.a(129, "");
            MBridgeH5EndCardView.this.u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                q0.a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.p.getLocationOnScreen(iArr);
                    q0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (d != null) {
                        jSONObject.put("startX", v0.b(d, iArr[0]));
                        jSONObject.put("startY", v0.b(d, iArr[1]));
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.l, v0.d(d));
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                    str = "";
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.p, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.a(109, "");
                MBridgeH5EndCardView.this.i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                com.mbridge.msdk.mbsignalcommon.windvane.f a = com.mbridge.msdk.mbsignalcommon.windvane.f.a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                a.a((WebView) mBridgeH5EndCardView.p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.K.getBytes(), 0));
                MBridgeH5EndCardView.this.e();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        private MBridgeH5EndCardView a;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                q0.b("CloseRunnable", e.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g implements Runnable {
        private MBridgeH5EndCardView a;

        public g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.z) {
                return;
            }
            this.a.z = true;
            this.a.t = false;
            MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
            this.a.notifyListener.a(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, "");
            q0.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class h implements Runnable {
        private MBridgeH5EndCardView a;
        private int b;

        public h(MBridgeH5EndCardView mBridgeH5EndCardView, int i) {
            this.a = mBridgeH5EndCardView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.y) {
                    q0.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.a.y = true;
                n nVar = new n("m_download_end", 12, (this.b * 1000) + "", this.a.b.getendcard_url(), this.a.b.getId(), this.a.unitId, "ready timeout", (a1.b(this.a.b.getendcard_url()) && this.a.b.getendcard_url().contains(".zip")) ? "1" : "2");
                try {
                    if (this.a.b.getAdType() == 287) {
                        nVar.a("3");
                    } else if (this.a.b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.a.b.getAdType() == 42) {
                        nVar.a("2");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                nVar.n(this.a.b.getRequestId());
                nVar.k(this.a.b.getCurrentLocalRid());
                nVar.o(this.a.b.getRequestIdNotice());
                nVar.a(this.a.b.getAdSpaceT());
                this.a.isLoadSuccess();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class i implements Runnable {
        private MBridgeH5EndCardView a;

        public i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.G = true;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class j implements Runnable {
        private MBridgeH5EndCardView a;

        public j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.H = true;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class k implements Runnable {
        private MBridgeH5EndCardView a;

        public k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.a.D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.q = false;
        this.r = new Handler();
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 1;
        this.x = 1;
        this.y = false;
        this.z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:7|8|(1:50)(1:12)|13|(1:15)(2:46|(1:48)(9:49|17|18|19|20|(1:22)(2:37|(1:39)(2:40|(1:42)))|23|24|(1:34)(4:27|(1:29)(1:33)|30|32)))|16|17|18|19|20|(0)(0)|23|24|(1:34)(1:35)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: NullPointerException -> 0x0080, all -> 0x010f, TryCatch #0 {NullPointerException -> 0x0080, blocks: (B:20:0x0070, B:22:0x007a, B:37:0x0082, B:39:0x008c, B:40:0x0090, B:42:0x009a), top: B:19:0x0070, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[Catch: NullPointerException -> 0x0080, all -> 0x010f, TryCatch #0 {NullPointerException -> 0x0080, blocks: (B:20:0x0070, B:22:0x007a, B:37:0x0082, B:39:0x008c, B:40:0x0090, B:42:0x009a), top: B:19:0x0070, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j2, boolean z) {
        int i2;
        int i3;
        try {
            if (this.y) {
                return;
            }
            this.y = true;
            String str = (a1.b(this.b.getendcard_url()) && this.b.getendcard_url().contains(".zip")) ? "1" : "2";
            String str2 = "ready yes";
            int i4 = 2;
            if (z) {
                str2 = "ready timeout";
                i2 = 12;
            } else {
                if (this.A != 2) {
                    i2 = 10;
                    i3 = 1;
                    String str3 = str2;
                    n nVar = new n("m_download_end", i2, j2 + "", this.b.getendcard_url(), this.b.getId(), this.unitId, str3, str);
                    if (this.b.getAdType() != 287) {
                        nVar.a("3");
                    } else if (this.b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.b.getAdType() == 42) {
                        nVar.a("2");
                    }
                    nVar.n(this.b.getRequestId());
                    nVar.k(this.b.getCurrentLocalRid());
                    nVar.o(this.b.getRequestIdNotice());
                    nVar.a(this.b.getAdSpaceT());
                    a(nVar, this.b);
                    if (isLoadSuccess() && i3 == 1) {
                        nVar.d(i3);
                        nVar.e(String.valueOf(j2));
                        nVar.b(this.b.getId());
                        nVar.m(str3);
                        if (this.b.isMraid()) {
                            nVar.b(n.N);
                        } else {
                            nVar.g(this.b.getendcard_url());
                            nVar.f(str);
                            nVar.b(n.O);
                        }
                        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.b);
                        return;
                    }
                }
                str2 = "ready no";
                i4 = 3;
                i2 = 11;
            }
            i3 = i4;
            String str32 = str2;
            n nVar2 = new n("m_download_end", i2, j2 + "", this.b.getendcard_url(), this.b.getId(), this.unitId, str32, str);
            if (this.b.getAdType() != 287) {
            }
            nVar2.n(this.b.getRequestId());
            nVar2.k(this.b.getCurrentLocalRid());
            nVar2.o(this.b.getRequestIdNotice());
            nVar2.a(this.b.getAdSpaceT());
            a(nVar2, this.b);
            if (isLoadSuccess()) {
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                com.mbridge.msdk.foundation.feedback.b.b().d(this.unitId + "_1");
                com.mbridge.msdk.foundation.feedback.b.b().a(this.unitId + "_2", this.b);
            }
            CampaignEx campaignEx2 = this.b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = this.o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
                layoutParams2.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            v0.a(4, imageView, this.b, com.mbridge.msdk.foundation.controller.c.n().d(), false, new e());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void f() {
        if (this.M || this.E) {
            return;
        }
        this.M = true;
        int i2 = this.w;
        if (i2 == 0) {
            this.G = true;
            return;
        }
        this.G = false;
        if (i2 > -1) {
            this.r.postDelayed(new i(this), this.w * 1000);
        }
    }

    private void g() {
        if (this.N || this.E) {
            return;
        }
        this.N = true;
        int i2 = this.x;
        if (i2 == 0) {
            this.H = true;
            return;
        }
        this.H = false;
        if (i2 > -1) {
            this.r.postDelayed(new j(this), this.x * 1000);
        }
    }

    private void h() {
        int v;
        try {
            this.B = System.currentTimeMillis();
            String str = this.b.getendcard_url();
            com.mbridge.msdk.videocommon.setting.c c2 = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.unitId);
            if (this.v && a1.b(str)) {
                if (str.contains("wfr=1") || (c2 != null && c2.v() > 0)) {
                    if (str.contains("wfr=1")) {
                        String[] split = str.split(U3.j.c);
                        if (split != null && split.length > 0) {
                            for (String str2 : split) {
                                if (a1.b(str2) && str2.contains("to") && str2.split(U3.j.b) != null && str2.split(U3.j.b).length > 0) {
                                    v = v0.a((Object) str2.split(U3.j.b)[1]);
                                    break;
                                }
                            }
                        }
                        v = 20;
                    } else {
                        if (c2 != null && c2.v() > 0) {
                            v = c2.v();
                        }
                        v = 20;
                    }
                    if (v >= 0) {
                        excuteEndCardShowTask(v);
                    } else {
                        excuteEndCardShowTask(20);
                    }
                }
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i2 = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i2 != 0) {
            if (i2 == 1) {
                str = U3.i.D;
            } else if (i2 == 2) {
                str = U3.i.C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(U3.i.n, str);
            jSONObject.put("locked", "true");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("placementType", "Interstitial");
        hashMap.put("state", BuildConfig.FLAVOR);
        hashMap.put("viewable", "true");
        hashMap.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float n = m0.n(getContext());
            float m = m0.m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f2 = displayMetrics.widthPixels;
            float f3 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.p, n, m);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.p, f2, f3);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.p, r7.getLeft(), this.p.getTop(), this.p.getWidth(), this.p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.p, r13.getLeft(), this.p.getTop(), this.p.getWidth(), this.p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.p, hashMap);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.p, com.mbridge.msdk.mbsignalcommon.mraid.d.f);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e2) {
            q0.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.e) {
            this.o.setOnClickListener(new b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i2) {
        this.r.postDelayed(new h(this, i2), i2 * 1000);
    }

    public void excuteTask() {
        if (this.v || this.w <= -1) {
            return;
        }
        this.r.postDelayed(new k(this), this.w * 1000);
    }

    public void executeEndCardShow(int i2) {
        this.r.postDelayed(new g(this), i2 * 1000);
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.b;
    }

    public String getURL() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null) {
            this.C = false;
            return null;
        }
        this.C = true;
        if (campaignEx.isMraid()) {
            this.v = false;
            String mraid = this.b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.b.getEndScreenUrl();
                }
                return "file:////" + mraid;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
                return mraid;
            }
        }
        String str = this.b.getendcard_url();
        if (a1.a(str)) {
            this.v = false;
            return this.b.getEndScreenUrl();
        }
        this.v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            StringBuilder p = bf3.p(h5ResAddress, "&native_adtype=");
            p.append(this.b.getAdType());
            return p.toString();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                String endScreenUrl = this.b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
        StringBuilder p2 = bf3.p(str, "&native_adtype=");
        p2.append(this.b.getAdType());
        return p2.toString();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.u) {
            return;
        }
        this.u = true;
        this.t = false;
        if (this.b != null) {
            n nVar = new n();
            nVar.n(this.b.getRequestId());
            nVar.o(this.b.getRequestIdNotice());
            nVar.b(this.b.getId());
            nVar.m(str);
            com.mbridge.msdk.foundation.same.report.g.a(nVar, this.a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (i0.a(findLayout)) {
            View inflate = this.c.inflate(findLayout, (ViewGroup) null);
            this.m = inflate;
            try {
                this.e = a(inflate);
            } catch (Exception unused) {
                this.e = false;
            }
            addView(this.m, getContentLayoutParams());
            d();
            j();
        }
    }

    public boolean isLoadSuccess() {
        return this.t;
    }

    public boolean isPlayable() {
        return this.v;
    }

    public void j() {
        if (this.e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i2) {
        if (i2 == 0) {
            this.E = true;
        } else {
            if (i2 != 1) {
                return;
            }
            this.F = true;
        }
    }

    public void onBackPress() {
        boolean z;
        if (this.D || (((z = this.E) && this.F) || (!(z || !this.G || this.O) || (!z && this.H && this.O)))) {
            onCloseViewClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.mbridge.msdk.video.module.listener.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.mbridge.msdk.foundation.same.report.metrics.d] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.mbridge.msdk.video.module.listener.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.mbridge.msdk.video.module.MBridgeBaseView, com.mbridge.msdk.video.module.MBridgeH5EndCardView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.mbridge.msdk.video.module.MBridgeBaseView] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.mbridge.msdk.video.module.MBridgeBaseView] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:6:0x0057). Please report as a decompilation issue!!! */
    public void onCloseViewClick() {
        ?? r6;
        ?? r0 = "";
        ?? r1 = 119;
        ?? r2 = 103;
        try {
            if (this.p != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.p, "onSystemDestory", "");
                new Thread(new f(this)).start();
                this = this;
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "webview is null when closing webview");
                this = this;
            }
        } catch (Exception e2) {
            this.notifyListener.a(r2, r0);
            this.notifyListener.a(r1, "close webview exception" + e2.getMessage());
            q0.a(MBridgeBaseView.TAG, e2.getMessage());
            r6 = this;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            r2 = "2000152";
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            r0 = com.mbridge.msdk.foundation.same.report.metrics.d.b();
            r1 = "2000134";
            this = r6.b;
            r0.a("2000134", this);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0 || this.J) {
            return;
        }
        this.J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.p, "true");
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.p, "false");
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put(U3.i.n, U3.i.C);
            } else {
                jSONObject.put(U3.i.n, U3.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.p, U3.i.n, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.e || this.b == null || TextUtils.isEmpty(url) || this.p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, "");
            this.notifyListener.a(129, "");
        } else {
            this.B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.b);
            aVar.a(this.b.getAppName());
            this.p.setDownloadListener(aVar);
            this.p.setCampaignId(this.b.getId());
            this.p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                this.p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.p.setApiManagerJSFactory(bVar);
            if (this.b.isMraid()) {
                this.p.setMraidObject(this);
            }
            boolean z = url.contains("wfr=1") || url.contains("wfl=1");
            b1.a(this.p, this.b.getLocalRequestId(), this.b.getLocalAllowTrackClick());
            this.p.setWebViewListener(new c(z));
            if (TextUtils.isEmpty(this.b.getMraid())) {
                h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            boolean isEmpty = TextUtils.isEmpty(this.s);
            WindVaneWebView windVaneWebView = this.p;
            if (isEmpty) {
                windVaneWebView.loadUrl(url);
            } else {
                windVaneWebView.loadDataWithBaseURL(url, this.s, "text/html", C.UTF8_NAME, null);
            }
        }
        this.O = false;
    }

    public void release() {
        Handler handler = this.r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.r = null;
        }
        Handler handler2 = this.L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.n.removeAllViews();
        this.p.release();
        this.p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i2) {
        if (this.b == null || this.u) {
            return;
        }
        n nVar = new n();
        nVar.n(this.b.getRequestId());
        nVar.o(this.b.getRequestIdNotice());
        nVar.b(this.b.getId());
        nVar.d(i2);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.B));
        nVar.m(str);
        String str2 = "2";
        if (this.b.getAdType() == 287) {
            nVar.a("3");
        } else if (this.b.getAdType() == 94) {
            nVar.a("1");
        } else if (this.b.getAdType() == 42) {
            nVar.a("2");
        }
        if (this.b.isMraid()) {
            nVar.b(n.N);
        } else {
            nVar.g(this.b.getendcard_url());
            if (a1.b(this.b.getendcard_url()) && this.b.getendcard_url().contains(".zip")) {
                str2 = "1";
            }
            nVar.f(str2);
            nVar.b(n.O);
        }
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.b);
    }

    public void setCloseDelayShowTime(int i2) {
        this.w = i2;
    }

    public void setCloseVisible(int i2) {
        if (this.e) {
            this.o.setVisibility(i2);
        }
    }

    public void setCloseVisibleForMraid(int i2) {
        if (this.e) {
            this.I = true;
            ImageView imageView = this.o;
            if (i2 == 4) {
                imageView.setImageDrawable(new ColorDrawable(16711680));
            } else {
                imageView.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.o.setVisibility(0);
        }
    }

    public void setError(boolean z) {
        this.u = z;
    }

    public void setHtmlSource(String str) {
        this.s = str;
    }

    public void setLoadPlayable(boolean z) {
        this.O = z;
    }

    public void setNotchValue(String str, int i2, int i3, int i4, int i5) {
        if (!TextUtils.isEmpty(str)) {
            this.K = str;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        q0.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5))));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        int a2 = v0.a(getContext(), 20.0f);
        layoutParams.setMargins(i2 + a2, i4 + a2, i3 + a2, i5 + a2);
        this.o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i2) {
        this.x = i2;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.b.getendcard_url();
            if (a1.b(str) && str.contains("wfl=1")) {
                String[] split = str.split(U3.j.c);
                int i2 = 15;
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        if (a1.b(str2) && str2.contains("timeout") && str2.split(U3.j.b) != null && str2.split(U3.j.b).length > 0) {
                            i2 = v0.a((Object) str2.split(U3.j.b)[1]);
                        }
                    }
                }
                executeEndCardShow(i2);
            }
        } catch (Throwable th) {
            q0.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i2) {
        int visibility = this.o.getVisibility();
        if (i2 == 1) {
            this.D = true;
            visibility = 0;
        } else if (i2 == 2) {
            this.D = false;
            if (this.O) {
                g();
            } else {
                f();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z) {
        try {
            setCloseVisibleForMraid(z ? 4 : 0);
        } catch (Exception e2) {
            q0.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void volumeChange(double d2) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.p, d2);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i2) {
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z) {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements com.mbridge.msdk.foundation.feedback.a {
        public e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String str2;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str2 = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                str2 = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
        }
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = false;
        this.r = new Handler();
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 1;
        this.x = 1;
        this.y = false;
        this.z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    private boolean a(View view) {
        this.o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.p = windVaneWebView;
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.n.addView(this.p);
        return isNotNULL(this.o, this.p);
    }

    private static void a(n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c c2 = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (c2 != null) {
                nVar.s(c2.x());
            }
            com.mbridge.msdk.videocommon.setting.a c3 = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (c3 != null) {
                nVar.r(c3.f());
            }
        } catch (Exception e2) {
            q0.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }
}
