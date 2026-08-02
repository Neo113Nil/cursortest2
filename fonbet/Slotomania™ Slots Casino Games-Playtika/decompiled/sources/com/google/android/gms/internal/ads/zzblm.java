package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzblm extends NativeAd.AdChoicesInfo {
    private final zzbll zza;
    private final List zzb = new ArrayList();
    private String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r4.zzb.add(new com.google.android.gms.internal.ads.zzblt(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzblm(zzbll zzbllVar) {
        IBinder iBinder;
        this.zza = zzbllVar;
        try {
            this.zzc = zzbllVar.zzb();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbllVar.zzc()) {
                zzbls zzblsVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzblsVar = queryLocalInterface instanceof zzbls ? (zzbls) queryLocalInterface : new zzblq(iBinder);
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
