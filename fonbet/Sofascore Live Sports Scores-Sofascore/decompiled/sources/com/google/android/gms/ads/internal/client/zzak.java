package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzak extends zzax {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbvu c;
    public final /* synthetic */ OnH5AdsEventListener d;

    public zzak(zzaw zzawVar, Context context, zzbvu zzbvuVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.b = context;
        this.c = zzbvuVar;
        this.d = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* synthetic */ Object zza() {
        return new zzbrs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.b;
        try {
            return ((zzbro) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaj.a)).x2(new ObjectWrapper(context), this.c, new zzbrf(this.d));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzo(new ObjectWrapper(this.b), this.c, ModuleDescriptor.MODULE_VERSION, new zzbrf(this.d));
    }
}
