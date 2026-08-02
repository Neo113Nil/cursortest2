package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import defpackage.wjn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcj {
    public static AudioManager a;

    public static synchronized AudioManager a(Context context) {
        synchronized (zzcj.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    zzff zzffVar = zzdp.a;
                    zzdt zzdtVar = new zzdt();
                    zzdi.a().execute(new wjn(5, applicationContext, zzdtVar));
                    zzdtVar.b();
                    AudioManager audioManager2 = a;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
