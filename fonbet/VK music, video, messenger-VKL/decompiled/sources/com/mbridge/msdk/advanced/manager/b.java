package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.dq;
import xsna.kh10;
import xsna.oyh0;
import xsna.tgw;
import xsna.wd10;

/* compiled from: NativeAdvancedLoadManager.java */
/* loaded from: classes13.dex */
public class b {
    private static String z = "NativeAdvancedLoadManager";
    private String a;
    private String b;
    private long c;
    private com.mbridge.msdk.advanced.middle.b d;
    private MBNativeAdvancedView f;
    private com.mbridge.msdk.setting.m g;
    private List<CampaignEx> h;
    private CampaignEx i;
    private int j;
    private int k;
    private int l;
    private int m;
    private String n;
    private int o;
    private boolean p;
    private volatile boolean q;
    private com.mbridge.msdk.videocommon.listener.a r;
    private H5DownLoadManager.ZipDownloadListener s;
    private H5DownLoadManager.ZipDownloadListener t;
    private String u;
    private int v;
    private String w = "";
    private Handler x = new e(Looper.getMainLooper());
    private Runnable y = new f();
    private Context e = com.mbridge.msdk.foundation.controller.c.n().d();

    /* compiled from: NativeAdvancedLoadManager.java */
    public class a implements H5DownLoadManager.ZipDownloadListener {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ int b;

        public a(CampaignEx campaignEx, int i) {
            this.a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.z, "zip 下载失败： " + str2 + " " + str);
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            obtain.obj = bundle;
            b.this.x.sendMessage(obtain);
            b.this.a(this.a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            q0.a(b.z, "zip 下载成功： " + str);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.a;
            obtain.arg1 = this.b;
            b.this.x.sendMessage(obtain);
            if (z) {
                return;
            }
            b.this.a(this.a, str, true, "");
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    /* renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    public class C0241b extends com.mbridge.msdk.mbsignalcommon.listener.b {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ int b;
        final /* synthetic */ long c;

        public C0241b(CampaignEx campaignEx, int i, long j) {
            this.a = campaignEx;
            this.b = i;
            this.c = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            super.a(webView, i);
            q0.b("NativeAdvancedLoadManager", "=========readyState: " + i);
            if (i != 1) {
                b.this.a(this.a, "readyState 2", this.b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.a, b.this.a, "readyState 2", this.c, 3);
                return;
            }
            b.this.f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.b + b.this.a + this.a.getRequestId(), true);
            b.this.h(this.a, this.b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.a, b.this.a, "", this.c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.a.isHasMBTplMark()) {
                b.this.f.setH5Ready(true);
                q0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.b + b.this.a + this.a.getRequestId(), true);
                b.this.h(this.a, this.b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.a, b.this.a, "", this.c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            StringBuilder a = kh10.a(i, "onReceivedError： ", "  ", str, "  ");
            a.append(str2);
            q0.b("NativeAdvancedLoadManager", a.toString());
            b.this.a(this.a, str, this.b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.a, b.this.a, tgw.b(i, "error code:", str), this.c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            q0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.a, "onReceivedSslError:" + sslError.getUrl(), this.b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.a, b.this.a, "error url:" + sslError.getUrl(), this.c, 3);
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class c implements Runnable {
        final /* synthetic */ MBNativeAdvancedWebview a;
        final /* synthetic */ String b;

        public c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.a = mBNativeAdvancedWebview;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.loadUrl(this.b);
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            Object obj;
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj2 = message.obj;
                int i2 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i2);
                return;
            }
            if (i == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i3 = ((Bundle) obj3).getInt("type");
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i3 == 1 ? 880004 : i3 == 2 ? 880007 : i3 == 3 ? 880006 : 880024);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.c(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.n, b.this.o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.n, b.this.o, (CampaignEx) null);
                    return;
                }
            }
            if (i == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.o);
                return;
            }
            if (i != 4) {
                if (i == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f != null) {
                        b.this.f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f != null) {
                b.this.f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.o);
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.n, b.this.o, (CampaignEx) null);
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class g extends com.mbridge.msdk.advanced.request.b {
        final /* synthetic */ String e;
        final /* synthetic */ int f;

        /* compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {
            final /* synthetic */ Exception a;
            final /* synthetic */ int b;
            final /* synthetic */ CampaignUnit c;

            public a(Exception exc, int i, CampaignUnit campaignUnit) {
                this.a = exc;
                this.b = i;
                this.c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.e;
                int i = this.b;
                CampaignUnit campaignUnit = this.c;
                bVar2.a(bVar, str, i, (campaignUnit == null || campaignUnit.getAds() == null || this.c.getAds().size() == 0) ? null : this.c.getAds().get(0));
            }
        }

        /* compiled from: NativeAdvancedLoadManager.java */
        /* renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        public class RunnableC0242b implements Runnable {
            final /* synthetic */ String a;

            public RunnableC0242b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.a);
                g gVar = g.this;
                b.this.a(bVar, gVar.e, gVar.f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, String str, int i2) {
            super(i);
            this.e = str;
            this.f = i2;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i) {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i, bVar.a, this.e);
                b.this.w = campaignUnit.getRequestId();
                b.this.h = campaignUnit.getAds();
            } catch (Exception e) {
                q0.b(b.z, e.getMessage());
                q0.c(b.z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.x != null) {
                    b.this.x.post(new a(e, i, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i, String str) {
            q0.b(b.z, str);
            q0.c(b.z, "onLoadCompaginFailed load failed errorCode:" + i + " msg:" + str);
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0242b(str));
            }
            b.this.f();
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class h extends c.a {
        final /* synthetic */ CampaignEx a;

        public h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.a, b.this.e, null);
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class i implements Runnable {
        final /* synthetic */ CampaignEx a;

        public i(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.e)).d();
            y.a(b.this.e, this.a);
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class j implements com.mbridge.msdk.foundation.same.image.c {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ int b;

        /* compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.a, jVar.b);
            }
        }

        /* compiled from: NativeAdvancedLoadManager.java */
        /* renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        public class RunnableC0243b implements Runnable {
            public RunnableC0243b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.a, jVar.b);
            }
        }

        public j(CampaignEx campaignEx, int i) {
            this.a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            oyh0.a("gifurl 下载失败： ", str2, b.z);
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0243b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            oyh0.a("giturl 下载成功： ", str, b.z);
            if (b.this.x != null) {
                b.this.x.post(new a());
            }
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class k implements H5DownLoadManager.ZipDownloadListener {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ int b;

        public k(CampaignEx campaignEx, int i) {
            this.a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            oyh0.a("endcard 下载失败： ", str2, b.z);
            if (b.this.f != null) {
                b.this.f.setEndCardReady(false);
            }
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            obtain.obj = bundle;
            b.this.x.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            oyh0.a("endcard 下载成功： ", str, b.z);
            if (b.this.x != null) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = this.a;
                obtain.arg1 = this.b;
                b.this.x.sendMessage(obtain);
            }
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class l implements com.mbridge.msdk.foundation.same.image.c {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ int b;

        /* compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.a, lVar.b);
            }
        }

        /* compiled from: NativeAdvancedLoadManager.java */
        /* renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        public class RunnableC0244b implements Runnable {
            public RunnableC0244b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.a, lVar.b);
            }
        }

        public l(CampaignEx campaignEx, int i) {
            this.a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            oyh0.a("image 下载失败： ", str2, b.z);
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0244b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            oyh0.a("image 下载成功： ", str, b.z);
            if (b.this.x != null) {
                b.this.x.post(new a());
            }
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class m implements Runnable {
        final /* synthetic */ File a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ int c;

        public m(File file, CampaignEx campaignEx, int i) {
            this.a = file;
            this.b = campaignEx;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a("file:////" + this.a.getAbsolutePath(), this.b, this.c);
        }
    }

    public b(String str, String str2, long j2) {
        this.b = str;
        this.a = str2;
    }

    private void b(CampaignEx campaignEx, int i2) {
        wd10.b().a(campaignEx.getGifUrl(), new j(campaignEx, i2));
    }

    private void c(CampaignEx campaignEx, int i2) {
        wd10.b().a(campaignEx.getImageUrl(), new l(campaignEx, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i2) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f, campaignEx, this.b, this.a) || this.q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.a);
        this.q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.d;
        if (bVar != null) {
            bVar.a(campaignEx, i2);
        }
    }

    private void j(CampaignEx campaignEx, int i2) {
        this.i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f, campaignEx, this.b, this.a)) {
            i(campaignEx, i2);
        } else {
            e(campaignEx, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.v = 0;
    }

    private void g() {
        try {
            int i2 = this.v + 1;
            this.v = i2;
            com.mbridge.msdk.setting.m mVar = this.g;
            if (mVar != null) {
                if (i2 > mVar.y()) {
                }
                q0.c(z, "onload 算出 下次的offset是:" + this.v);
            }
            q0.c(z, "onload 重置offset为0");
            this.v = 0;
            q0.c(z, "onload 算出 下次的offset是:" + this.v);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i2) {
        if (this.f.isH5Ready()) {
            i(campaignEx, i2);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.a, campaignEx);
        }
    }

    public String d() {
        return this.w;
    }

    public void e() {
        if (this.d != null) {
            this.d = null;
        }
        if (this.r != null) {
            this.r = null;
        }
        if (this.s != null) {
            this.s = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce A[Catch: all -> 0x00b2, Exception -> 0x0129, TRY_ENTER, TryCatch #2 {Exception -> 0x0129, blocks: (B:32:0x00ce, B:34:0x00d2, B:36:0x00d8, B:38:0x00de, B:40:0x00e4, B:42:0x00f6, B:50:0x00ff, B:75:0x00ae), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8 A[Catch: all -> 0x00b2, Exception -> 0x0129, TryCatch #2 {Exception -> 0x0129, blocks: (B:32:0x00ce, B:34:0x00d2, B:36:0x00d8, B:38:0x00de, B:40:0x00e4, B:42:0x00f6, B:50:0x00ff, B:75:0x00ae), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117 A[Catch: IOException -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IOException -> 0x011b, blocks: (B:59:0x0135, B:44:0x0117), top: B:3:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(CampaignEx campaignEx, int i2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        ?? r9;
        FileOutputStream fileOutputStream4;
        FileOutputStream fileOutputStream5 = null;
        try {
            try {
                try {
                    try {
                        com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.a, "8");
                        ?? file = new File(campaignEx.getAdHtml());
                        try {
                            if (file.exists()) {
                                fileOutputStream4 = file;
                            } else {
                                String b = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                String md5 = SameMD5.getMD5(c1.b(campaignEx.getAdHtml()));
                                if (TextUtils.isEmpty(md5)) {
                                    md5 = String.valueOf(System.currentTimeMillis());
                                }
                                ?? file2 = new File(b, md5.concat(".html"));
                                try {
                                    boolean exists = file2.exists();
                                    fileOutputStream4 = file2;
                                    if (!exists) {
                                        fileOutputStream2 = new FileOutputStream((File) file2);
                                        try {
                                            String injectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, "<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx.getAdHtml());
                                            if (campaignEx.isActiveOm()) {
                                                injectScriptContentIntoHtml = com.mbridge.msdk.omsdk.b.a(injectScriptContentIntoHtml);
                                            }
                                            fileOutputStream2.write(injectScriptContentIntoHtml.getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream5 = fileOutputStream2;
                                            fileOutputStream4 = file2;
                                        } catch (Exception e2) {
                                            e = e2;
                                            fileOutputStream5 = fileOutputStream2;
                                            fileOutputStream3 = file2;
                                            e.printStackTrace();
                                            campaignEx.setMraid("");
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.a, "8");
                                            if (fileOutputStream5 != null) {
                                            }
                                            r9 = fileOutputStream3;
                                            if (!r9.exists()) {
                                            }
                                            q0.a(z, "渲染 HTML 失败： html file write failed");
                                            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880013);
                                            a(bVar, this.n, i2, campaignEx);
                                            a(bVar, this.n, i2, campaignEx);
                                            if (fileOutputStream5 != null) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (fileOutputStream2 != null) {
                                                try {
                                                    fileOutputStream2.close();
                                                } catch (Exception unused) {
                                                    fileOutputStream5 = fileOutputStream2;
                                                    a(new com.mbridge.msdk.foundation.error.b(880013), this.n, i2, campaignEx);
                                                    if (fileOutputStream5 != null) {
                                                        fileOutputStream5.close();
                                                    }
                                                    return;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    fileOutputStream5 = fileOutputStream2;
                                                    if (fileOutputStream5 != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                            try {
                                com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.a, "8");
                                r9 = fileOutputStream4;
                                if (fileOutputStream5 != null) {
                                    fileOutputStream5.close();
                                    r9 = fileOutputStream4;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                fileOutputStream = fileOutputStream5;
                                fileOutputStream5 = fileOutputStream4;
                                fileOutputStream3 = fileOutputStream5;
                                fileOutputStream5 = fileOutputStream;
                                e.printStackTrace();
                                campaignEx.setMraid("");
                                com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.a, "8");
                                if (fileOutputStream5 != null) {
                                    fileOutputStream5.close();
                                }
                                r9 = fileOutputStream3;
                                if (!r9.exists()) {
                                }
                                q0.a(z, "渲染 HTML 失败： html file write failed");
                                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880013);
                                a(bVar2, this.n, i2, campaignEx);
                                a(bVar2, this.n, i2, campaignEx);
                                if (fileOutputStream5 != null) {
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            fileOutputStream3 = file;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream2 = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (fileOutputStream5 != null) {
                        try {
                            fileOutputStream5.close();
                        } catch (IOException e6) {
                            q0.b(z, e6.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                fileOutputStream = null;
            }
            if (!r9.exists() && r9.isFile() && r9.canRead()) {
                campaignEx.setAdHtml(r9.getAbsolutePath());
                q0.a(z, "开始渲染 HTML： ");
                Handler handler = this.x;
                if (handler != null) {
                    handler.post(new m(r9, campaignEx, i2));
                }
            } else {
                q0.a(z, "渲染 HTML 失败： html file write failed");
                com.mbridge.msdk.foundation.error.b bVar22 = new com.mbridge.msdk.foundation.error.b(880013);
                a(bVar22, this.n, i2, campaignEx);
                a(bVar22, this.n, i2, campaignEx);
            }
            if (fileOutputStream5 != null) {
                fileOutputStream5.close();
            }
        } catch (IOException e8) {
            q0.b(z, e8.getMessage());
        }
    }

    private void f(CampaignEx campaignEx, int i2) {
        this.r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.e, this.a, copyOnWriteArrayList, 298, this.r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.a, campaignEx.isBidCampaign())) {
            q0.a(z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.a);
        } else {
            q0.a(z, " load Video isReady true");
            this.f.setVideoReady(true);
            i(campaignEx, i2);
        }
    }

    /* compiled from: NativeAdvancedLoadManager.java */
    public class d implements com.mbridge.msdk.videocommon.listener.a {
        final /* synthetic */ CampaignEx a;

        public d(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            q0.a(b.z, "Video 下载成功： " + str);
            Message obtain = Message.obtain();
            obtain.obj = this.a;
            obtain.what = 5;
            b.this.x.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            q0.a(b.z, "Video 下载失败： " + str);
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            obtain.obj = bundle;
            obtain.what = 2;
            b.this.x.sendMessage(obtain);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.h);
    }

    private void e(CampaignEx campaignEx, int i2) {
        MBNativeAdvancedView mBNativeAdvancedView = this.f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            q0.a(z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.a(z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            q0.a(z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            q0.a(z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            q0.a(z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i2);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        q0.a(z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i2);
    }

    private void g(CampaignEx campaignEx, int i2) {
        String str;
        this.s = new a(campaignEx, i2);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        if (campaignEx != null) {
            r0 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getAdZip();
        } else {
            str = "";
        }
        cVar.f(r0);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.s);
    }

    public void b(String str, int i2) {
        String str2;
        CampaignEx a2;
        this.q = false;
        this.n = str;
        this.o = i2;
        this.i = null;
        if (this.f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i2, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a2 = com.mbridge.msdk.advanced.manager.d.a(this.f, this.b, this.a, str, this.j, false, false);
            str2 = str;
        } else {
            str2 = str;
            a2 = com.mbridge.msdk.advanced.manager.d.a(this.f, this.b, this.a, str2, this.j, false, true);
        }
        long timestamp = a2 != null ? a2.getTimestamp() : 0L;
        com.mbridge.msdk.setting.m mVar = this.g;
        if (mVar != null && mVar.t() == 1 && this.f != null && a2 != null) {
            j(a2, i2);
            return;
        }
        this.p = false;
        com.mbridge.msdk.setting.m mVar2 = this.g;
        if (mVar2 != null) {
            List<Integer> c2 = mVar2.c();
            if (c2 != null && c2.size() > 0) {
                this.c = c2.get(0).intValue() * 1000;
            } else {
                this.c = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
            }
        } else {
            this.c = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        }
        q0.a(z, "开始从V3请求新的 offer，超时 ：" + this.c);
        if (this.g == null || timestamp <= 0 || !TextUtils.isEmpty(str2)) {
            a(this.c);
            a(this.e, str2, i2);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.g.v() * 1000) {
            a(this.c);
            a(this.e, str2, i2);
        } else {
            j(a2, i2);
        }
    }

    public void a(com.mbridge.msdk.setting.m mVar) {
        this.g = mVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f = mBNativeAdvancedView;
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void a(int i2, int i3) {
        this.m = i2;
        this.l = i3;
    }

    private void a(long j2) {
        this.x.postDelayed(this.y, j2);
    }

    private void a(Context context, String str, int i2) {
        Exception exc;
        String str2;
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i2, (CampaignEx) null);
                return;
            }
            try {
                if (a1.a(this.a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i2, (CampaignEx) null);
                    return;
                }
                try {
                    com.mbridge.msdk.advanced.manager.d.b(this.a);
                } catch (Throwable th) {
                    q0.b(z, th.getMessage());
                }
                q0.c(z, "load 开始准备请求参数");
                MBridgeIds mBridgeIds = new MBridgeIds(this.b, this.a);
                com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
                fVar.d(i2);
                fVar.c(this.v);
                fVar.a(this.u);
                fVar.b(this.m);
                fVar.a(this.l);
                com.mbridge.msdk.foundation.same.net.wrapper.e b = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
                if (b == null) {
                    q0.c(z, "load 请求参数为空 load失败");
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i2, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    b.a("token", str);
                }
                String d2 = v0.d(this.a);
                if (!TextUtils.isEmpty(d2)) {
                    b.a(com.mbridge.msdk.foundation.same.report.j.b, d2);
                }
                str2 = str;
                try {
                    new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, b, a(str, i2), str2, com.mbridge.msdk.foundation.same.c.a(this.c, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS));
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    q0.b(z, exc.getMessage());
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
                    bVar.a((Throwable) exc);
                    a(bVar, str2, i2, (CampaignEx) null);
                    f();
                }
            } catch (Exception e3) {
                e = e3;
                str2 = str;
            }
        } catch (Exception e4) {
            exc = e4;
            str2 = str;
        }
    }

    private void b() {
        this.x.removeCallbacks(this.y);
    }

    @NonNull
    private com.mbridge.msdk.advanced.request.b a(String str, int i2) {
        g gVar = new g(i2, str, i2);
        gVar.a(str);
        gVar.setUnitId(this.a);
        gVar.setPlacementId(this.b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i2, String str, String str2) {
        String str3;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (!TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        }
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            str3 = str2;
        } else {
            str3 = str2;
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i2 == 1, str3, eVar, campaignUnit.getAds().get(0), str).t());
        }
        List<CampaignEx> a2 = a(campaignUnit);
        if (a2 != null && a2.size() > 0) {
            g();
            q0.c(z, "onload load成功 size:" + a2.size());
            CampaignEx campaignEx = a2.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i2);
            return;
        }
        q0.c(z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str3, i2, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.a);
        a(campaignEx);
        this.u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.a, campaignEx, com.mbridge.msdk.foundation.same.a.x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.e, cVar, new h(campaignEx, aVar));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i2, CampaignEx campaignEx) {
        if (this.p) {
            this.p = false;
            a(bVar, i2, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i2, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i2, String str) {
        CampaignEx a2 = com.mbridge.msdk.advanced.manager.d.a(this.f, this.b, this.a, str, this.j, true, true);
        if (a2 != null) {
            q0.b(z, "load failed cache ");
            j(a2, i2);
        } else {
            a(bVar, i2, a2);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i2, CampaignEx campaignEx) {
        if (this.q) {
            return;
        }
        b();
        if (bVar != null) {
            q0.b(z, "real failed: " + bVar.l());
        }
        this.q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.a(bVar, i2);
        }
    }

    private void a(CampaignEx campaignEx, int i2) {
        String str;
        this.t = new k(campaignEx, i2);
        if (campaignEx != null) {
            r4 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(r4);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i2) {
        MBNativeAdvancedView mBNativeAdvancedView = this.f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f.getContext(), this.b, this.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.j);
        bVar.b(this.k);
        this.f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long currentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i2);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i2);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0241b(campaignEx, i2, currentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            dq.i("=======开始渲染: ", str, z);
            Handler handler = this.x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.n, i2, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.a, "webview had destory", currentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i2) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.n, i2, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.a, campaignEx);
    }

    public String a(String str) {
        int o;
        if (this.i != null) {
            try {
                com.mbridge.msdk.videocommon.download.a a2 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.a, this.i.getId() + this.i.getVideoUrlEncode() + this.i.getBidToken());
                if (a2 != null && (o = a2.o()) == 5) {
                    String p = a2.p();
                    if (new File(p).exists()) {
                        q0.b(z, "本地已下载完 拿本地播放地址：" + p + " state：" + o);
                        return p;
                    }
                }
            } catch (Exception e2) {
                q0.b(z, e2.getMessage());
            }
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z2, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z2) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b(z, e2.getMessage());
            }
        }
    }
}
