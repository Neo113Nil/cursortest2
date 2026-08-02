package com.google.android.gms.ads.internal.util.client;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzc extends Thread {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public zzc(zzf zzfVar, Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(this.a, null).zzc(this.b, null);
    }
}
