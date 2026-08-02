package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfli {
    private static zzfli zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcv zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfli(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzb = context;
        this.zzc = zzcvVar;
    }

    public static zzfli zza(Context context) {
        synchronized (zzfli.class) {
            zzfli zzfliVar = zza;
            if (zzfliVar != null) {
                return zzfliVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbkf.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcv zzcvVar = null;
            if (longValue > 0 && longValue <= 260910000) {
                zzcvVar = zzf(applicationContext);
            }
            zzfli zzfliVar2 = new zzfli(applicationContext, zzcvVar);
            zza = zzfliVar2;
            return zzfliVar2;
        }
    }

    static com.google.android.gms.ads.internal.client.zzcv zzf(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcu.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzez zzg() {
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar != null) {
            try {
                return zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzez zzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i2, true, zzH);
        return (((Boolean) zzbkf.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzg.zza(), true, zzH) : versionInfoParcel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(zzbuq zzbuqVar) {
        zzbuq adapterCreator;
        if (!((Boolean) zzbkf.zza.zze()).booleanValue()) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.zzd, null, zzbuqVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar != null) {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzbuqVar = adapterCreator;
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zzbuqVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, null, zzbuqVar);
    }

    public final zzbuq zzd() {
        return (zzbuq) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzez zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }
}
