package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzblq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
abstract class zzax {
    public static final zzco a;

    static {
        zzco zzcoVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzcoVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to instantiate ClientApi class.");
        }
        a = zzcoVar;
    }

    public abstract Object zza();

    public abstract Object zzb();

    public abstract Object zzc(zzco zzcoVar);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        if (!z) {
            zzay.zza();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 12451000)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Google Play Services is not available.");
                z2 = true;
                z3 = false;
                boolean z5 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
                zzbjg.a(context);
                if (((Boolean) zzblc.a.c()).booleanValue()) {
                    boolean z6 = z2 | z5;
                    if (((Boolean) zzblc.b.c()).booleanValue()) {
                        z4 = true;
                        z3 = true;
                    } else {
                        z4 = false;
                        z3 = z6;
                    }
                } else {
                    z4 = false;
                }
                zzco zzcoVar = a;
                Object obj2 = null;
                if (z3) {
                    try {
                        obj = zzb();
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e);
                        obj = null;
                    }
                    if (obj == null) {
                        if (zzay.zzh().nextInt(((Long) zzblq.a.c()).intValue()) == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            zzay.zza().zzi(context, zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
                        }
                    }
                    if (obj == null) {
                        if (zzcoVar != null) {
                            try {
                                obj2 = zzc(zzcoVar);
                            } catch (RemoteException e2) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e2);
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
                        }
                        obj = obj2;
                    }
                } else {
                    if (zzcoVar != null) {
                        try {
                            obj = zzc(zzcoVar);
                        } catch (RemoteException e3) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e3);
                        }
                        if (obj == null && !z4) {
                            try {
                                obj2 = zzb();
                            } catch (RemoteException e4) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e4);
                            }
                            obj = obj2;
                        }
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
                    }
                    obj = null;
                    if (obj == null) {
                        obj2 = zzb();
                        obj = obj2;
                    }
                }
                return obj != null ? zza() : obj;
            }
        }
        z2 = z;
        z3 = false;
        boolean z52 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
        zzbjg.a(context);
        if (((Boolean) zzblc.a.c()).booleanValue()) {
        }
        zzco zzcoVar2 = a;
        Object obj22 = null;
        if (z3) {
        }
        if (obj != null) {
        }
    }
}
