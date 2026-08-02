package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C4157k4;
import com.ironsource.O7;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class t {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ AudioManager a;

        public a(AudioManager audioManager) {
            this.a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ AudioManager a;

        public b(AudioManager audioManager) {
            this.a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public static void a(Activity activity) {
        O7.a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        O7.a.b(new b((AudioManager) activity.getSystemService("audio")));
    }
}
