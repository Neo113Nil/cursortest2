package com.mbridge.msdk.timer;

import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    public static class C1320b {
        static b a = new b();
    }

    public static b getInstance() {
        return C1320b.a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("addInterstitialList error:"), "TimerController");
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("addRewardList error:"), "TimerController");
        }
    }

    public void start() {
        g e = w1l.e(i.b());
        if (e == null) {
            e = i.b().a();
        }
        if (e.h() > 0) {
            com.mbridge.msdk.timer.a.a().b(r3 * 1000);
        }
    }

    private b() {
    }
}
