package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzan extends zzax {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzbvu e;
    public final /* synthetic */ zzaw f;

    public zzan(zzaw zzawVar, Context context, zzr zzrVar, String str, zzbvu zzbvuVar) {
        this.b = context;
        this.c = zzrVar;
        this.d = str;
        this.e = zzbvuVar;
        this.f = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.b, "interstitial");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* synthetic */ Object zzb() throws RemoteException {
        return this.f.a.zza(this.b, this.c, this.d, this.e, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzb(new ObjectWrapper(this.b), this.c, this.d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
