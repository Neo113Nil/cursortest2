package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmp extends NativeAd.AdChoicesInfo {
    public final zzbmo a;
    public final ArrayList b = new ArrayList();
    public final String c;

    public zzbmp(zzbmo zzbmoVar) {
        zzbmv zzbmvVar;
        this.a = zzbmoVar;
        try {
            this.c = zzbmoVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
            this.c = "";
        }
        try {
            for (Object obj : zzbmoVar.zzb()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbmvVar = queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(iBinder);
                } else {
                    zzbmvVar = null;
                }
                if (zzbmvVar != null) {
                    this.b.add(new zzbmw(zzbmvVar));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.c;
    }
}
