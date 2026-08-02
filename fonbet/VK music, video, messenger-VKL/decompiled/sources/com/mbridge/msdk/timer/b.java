package com.mbridge.msdk.timer;

import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import xsna.kft0;
import xsna.wga0;

/* compiled from: TimerController.java */
/* loaded from: classes14.dex */
public class b {

    /* compiled from: TimerController.java */
    /* renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    public static class C0338b {
        static b a = new b();
    }

    public static b getInstance() {
        return C0338b.a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("addInterstitialList error:"), "TimerController");
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("addRewardList error:"), "TimerController");
        }
    }

    public void start() {
        g a2 = wga0.a(i.b());
        if (a2 == null) {
            a2 = i.b().a();
        }
        if (a2.h() > 0) {
            com.mbridge.msdk.timer.a.a().b(r0 * 1000);
        }
    }

    private b() {
    }
}
