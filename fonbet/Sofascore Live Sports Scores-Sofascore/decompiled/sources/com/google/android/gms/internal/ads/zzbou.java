package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.lv4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbou extends zzboc {
    public final OnAdManagerAdViewLoadedListener a;

    public zzbou(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.a = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void h2(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.Z1(iObjectWrapper));
        try {
            if (zzbuVar.zzv() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzv();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzj() : null);
            }
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        try {
            if (zzbuVar.zzu() instanceof zzbfv) {
                zzbfv zzbfvVar = (zzbfv) zzbuVar.zzu();
                adManagerAdView.setAppEventListener(zzbfvVar != null ? zzbfvVar.a : null);
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new lv4(19, this, adManagerAdView, zzbuVar));
    }
}
