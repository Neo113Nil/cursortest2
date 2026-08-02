package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzbp {
    private static volatile DynamiteModule zza;
    private static volatile zzcs zzb;
    private static final Map<String, CustomTagProvider> zzc = new HashMap();
    private static final Map<String, CustomVariableProvider> zzd = new HashMap();

    private zzbp() {
    }

    static IBinder zza(Context context) {
        try {
            try {
                return zzcu.asInterface(zzg(context).instantiate("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(ObjectWrapper.wrap(context), zzh(context), new zzbo()).asBinder();
            } catch (RemoteException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (DynamiteModule.LoadingException e12) {
            throw new RuntimeException(e12);
        }
    }

    static void zze(Context context) {
        zzcs zzi = zzi(context);
        synchronized (zzbp.class) {
            try {
                try {
                    zzi.initialize(ObjectWrapper.wrap(context), zzh(context), new zzbo());
                } catch (RemoteException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void zzf(Intent intent, Context context) {
        zzcs zzi = zzi(context);
        synchronized (zzbp.class) {
            try {
                try {
                    zzi.previewIntent(intent, ObjectWrapper.wrap(context), ObjectWrapper.wrap(zza.getModuleContext()), zzh(context), new zzbo());
                } catch (RemoteException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static DynamiteModule zzg(Context context) throws DynamiteModule.LoadingException {
        DynamiteModule dynamiteModule;
        DynamiteModule dynamiteModule2 = zza;
        if (dynamiteModule2 != null) {
            return dynamiteModule2;
        }
        synchronized (zzbp.class) {
            try {
                dynamiteModule = zza;
                if (zza == null) {
                    dynamiteModule = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, ModuleDescriptor.MODULE_ID);
                    zza = dynamiteModule;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dynamiteModule;
    }

    private static zzcp zzh(Context context) {
        return new zzbn(AppMeasurement.getInstance(context));
    }

    private static zzcs zzi(Context context) {
        zzcs zzcsVar;
        zzcs zzcsVar2 = zzb;
        if (zzcsVar2 != null) {
            return zzcsVar2;
        }
        synchronized (zzbp.class) {
            zzcsVar = zzb;
            if (zzcsVar == null) {
                try {
                    zzcsVar = zzcr.asInterface(zzg(context).instantiate("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                    zzb = zzcsVar;
                } catch (DynamiteModule.LoadingException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return zzcsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzj(String str, Class<?> cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (cls3.equals(cls)) {
                    try {
                        try {
                            try {
                                return cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
                            } catch (IllegalAccessException unused) {
                                Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                                return null;
                            }
                        } catch (SecurityException unused2) {
                            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                            return null;
                        } catch (InvocationTargetException unused3) {
                            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" construction threw an exception."));
                            return null;
                        }
                    } catch (InstantiationException unused4) {
                        Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" is an abstract class."));
                        return null;
                    } catch (NoSuchMethodException unused5) {
                        Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have a valid no-arg constructor"));
                        return null;
                    }
                }
            }
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(canonicalName).length());
            sb2.append(str);
            sb2.append(" doesn't implement ");
            sb2.append(canonicalName);
            sb2.append(" interface.");
            Log.e("GoogleTagManagerAPI", sb2.toString());
            return null;
        } catch (ClassNotFoundException unused6) {
            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" can't be found in the application."));
            return null;
        }
    }
}
