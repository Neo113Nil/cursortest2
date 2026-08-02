package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcaq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzae extends zzax {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbvu c;

    public zzae(zzaw zzawVar, Context context, zzbvu zzbvuVar) {
        this.b = context;
        this.c = zzbvuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.b;
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        zzbjg.a(context);
        if (((Boolean) zzba.zzc().a(zzbjg.Ua)).booleanValue()) {
            try {
                return ((zzdu) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzad.a)).zze(objectWrapper, this.c, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzcaq.c(context).a("ClientApiBroker.getOutOfContextTester", e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        Context context = this.b;
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        zzbjg.a(context);
        if (((Boolean) zzba.zzc().a(zzbjg.Ua)).booleanValue()) {
            return zzcoVar.zzp(objectWrapper, this.c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
