package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzgbp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf extends zzgbp {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzs.zzP(com.google.android.gms.ads.internal.zzt.zzh().e, th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdMobHandler.handleMessage", e);
        }
    }
}
