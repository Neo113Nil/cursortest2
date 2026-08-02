package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbfx;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzel extends com.google.android.gms.ads.preload.zzb {
    public zzel(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    public final AppOpenAd zza(String str) {
        zzbfx zzbfxVar;
        try {
            zzbfxVar = this.zza.zzp(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbfxVar = null;
        }
        if (zzbfxVar == null) {
            return null;
        }
        return new zzbft(zzbfxVar);
    }
}
