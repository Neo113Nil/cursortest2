package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {
    protected String j;
    protected com.mbridge.msdk.videocommon.setting.c k;
    protected com.mbridge.msdk.click.a l;
    protected boolean a = false;
    protected boolean b = false;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;
    protected int h = 1;
    protected int i = -1;
    public a.InterfaceC1336a m = new C1337a();
    protected int n = 2;
    protected int o = 2;
    private AdSession p = null;
    private MediaEvents q = null;
    private AdEvents r = null;

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i) {
        this.c = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", "init");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
        q0.a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.h);
        return this.h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i) {
        this.n = i;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.i;
    }

    public AdEvents j() {
        return this.r;
    }

    public AdSession k() {
        return this.p;
    }

    public int l() {
        int i = this.c;
        if (i != 0 || !this.b) {
            return i;
        }
        this.c = 1;
        return 1;
    }

    public int m() {
        int i = this.d;
        if (i != 0 || !this.b) {
            return i;
        }
        this.d = 1;
        return 1;
    }

    public int n() {
        int i = this.e;
        if (i != 0 || !this.b) {
            return i;
        }
        this.e = 1;
        return 1;
    }

    public MediaEvents o() {
        return this.q;
    }

    public boolean p() {
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.l;
        if (aVar != null) {
            aVar.a(false);
            this.l.a((NativeListener.NativeTrackingListener) null);
            this.l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        w1l.x("setUnitId:", str, "DefaultJSCommon");
        this.j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i) {
        this.g = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z) {
        this.a = z;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b implements a.InterfaceC1336a {
        private com.mbridge.msdk.video.signal.d a;
        private a.InterfaceC1336a b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC1336a interfaceC1336a) {
            this.a = dVar;
            this.b = interfaceC1336a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void a(boolean z) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.a(z);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onDownloadProgress(i);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void onInitSuccess() {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC1336a interfaceC1336a = this.b;
            return interfaceC1336a != null && interfaceC1336a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void a(int i, String str) {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.a(i, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void a() {
            a.InterfaceC1336a interfaceC1336a = this.b;
            if (interfaceC1336a != null) {
                interfaceC1336a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i) {
        this.d = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i) {
        this.e = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.h = i;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    public static class C1337a implements a.InterfaceC1336a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void a(int i, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void a(boolean z) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC1336a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(a.InterfaceC1336a interfaceC1336a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC1336a);
        this.m = interfaceC1336a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.b = z;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i) {
        this.i = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }
}
