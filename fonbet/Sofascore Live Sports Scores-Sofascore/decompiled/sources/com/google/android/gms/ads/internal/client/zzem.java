package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.zzbtd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzem extends com.google.android.gms.ads.preload.zzb {
    public zzem(Context context) {
        super(context, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final InterstitialAd zza(String str) {
        zzbu zzbuVar;
        try {
            zzbuVar = this.a.zzo(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbuVar = null;
        }
        if (zzbuVar == null) {
            return null;
        }
        return new zzbtd(this.c, zzbuVar);
    }
}
