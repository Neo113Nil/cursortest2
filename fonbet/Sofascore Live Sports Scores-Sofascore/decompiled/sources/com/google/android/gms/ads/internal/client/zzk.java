package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzk extends RemoteCreator {
    public zzcas c;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    @Nullable
    public final zzbu zza(Context context, zzr zzrVar, String str, zzbvu zzbvuVar, int i) {
        zzbjg.a(context);
        if (((Boolean) zzba.zzc().a(zzbjg.oc)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.a)).zze(new ObjectWrapper(context), zzrVar, str, zzbvuVar, ModuleDescriptor.MODULE_VERSION, i);
                if (zze != null) {
                    IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
                }
            } catch (RemoteException e) {
                e = e;
                Throwable th = e;
                zzcas c = zzcaq.c(context);
                this.c = c;
                c.a("AdManagerCreator.newAdManagerByDynamiteLoader", th);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th);
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                e = e2;
                Throwable th2 = e;
                zzcas c2 = zzcaq.c(context);
                this.c = c2;
                c2.a("AdManagerCreator.newAdManagerByDynamiteLoader", th2);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th2);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                Throwable th22 = e;
                zzcas c22 = zzcaq.c(context);
                this.c = c22;
                c22.a("AdManagerCreator.newAdManagerByDynamiteLoader", th22);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th22);
                return null;
            }
        } else {
            try {
                IBinder zze2 = ((zzbv) b(context)).zze(new ObjectWrapper(context), zzrVar, str, zzbvuVar, ModuleDescriptor.MODULE_VERSION, i);
                if (zze2 != null) {
                    IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
                }
            } catch (RemoteException e4) {
                e = e4;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e5) {
                e = e5;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
