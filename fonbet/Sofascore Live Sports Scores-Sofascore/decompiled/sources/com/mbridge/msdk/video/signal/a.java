package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.out.NativeListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface a extends e {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    public interface InterfaceC1336a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i, String str);

        void a(boolean z);

        void onInitSuccess();
    }

    void a(int i);

    void a(int i, String str);

    void a(InterfaceC1336a interfaceC1336a);

    void a(String str);

    void a(boolean z);

    boolean a();

    int b();

    void b(int i);

    void b(boolean z);

    String c();

    void c(int i);

    int d();

    void d(int i);

    String e();

    void e(int i);

    String f(int i);

    void f();

    String g();

    void g(int i);

    void h();

    int i();

    void release();

    void setActivity(Activity activity);

    void setAdEvents(AdEvents adEvents);

    void setAdSession(AdSession adSession);

    void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar);

    void setUnitId(String str);

    void setVideoEvents(MediaEvents mediaEvents);

    void setWebViewFront(int i);
}
