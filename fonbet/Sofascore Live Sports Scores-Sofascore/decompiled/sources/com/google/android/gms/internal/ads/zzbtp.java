package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.fjn;
import defpackage.gpn;
import defpackage.hpn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbtp implements zzbth, zzbtf {
    public zzclm a;

    public static final void A(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void a0(String str, zzbqh zzbqhVar) {
        zzclm zzclmVar = this.a;
        if (zzclmVar != null) {
            zzclmVar.X(str, new fjn(zzbqhVar, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void c0(String str, zzbqh zzbqhVar) {
        zzclm zzclmVar = this.a;
        if (zzclmVar != null) {
            zzclmVar.T(str, new gpn(this, zzbqhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zza(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        A(new hpn(this, str, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzj() {
        zzclm zzclmVar = this.a;
        if (zzclmVar != null) {
            zzclmVar.destroy();
            this.a = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final boolean zzk() {
        zzclm zzclmVar = this.a;
        return zzclmVar == null || zzclmVar.q();
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final zzbuo zzl() {
        return new zzbuo(this);
    }
}
