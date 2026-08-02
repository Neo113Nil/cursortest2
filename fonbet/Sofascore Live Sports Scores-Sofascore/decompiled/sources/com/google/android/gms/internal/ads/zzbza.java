package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbza extends NativeAd.AdChoicesInfo {
    public final ArrayList a = new ArrayList();
    public final String b;

    public zzbza(zzbmo zzbmoVar) {
        try {
            this.b = zzbmoVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            this.b = "";
        }
        try {
            for (Object obj : zzbmoVar.zzb()) {
                zzbmv E4 = obj instanceof IBinder ? zzbmu.E4((IBinder) obj) : null;
                if (E4 != null) {
                    this.a.add(new zzbzc(E4));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.b;
    }
}
