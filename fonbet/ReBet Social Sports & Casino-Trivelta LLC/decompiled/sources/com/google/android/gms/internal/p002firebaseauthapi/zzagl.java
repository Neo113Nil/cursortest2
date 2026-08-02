package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import eb.C4196f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.C6900a;

/* loaded from: classes2.dex */
public final class zzagl {
    private static final Map<String, zzagk> zza = new C6900a();
    private static final Map<String, List<WeakReference<zzagn>>> zzb = new C6900a();

    private static String zza(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }

    @NonNull
    public static String zzb(String str) {
        zzagk zzagkVar;
        String str2;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    @NonNull
    public static String zzc(String str) {
        zzagk zzagkVar;
        String str2;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    @NonNull
    public static String zzd(String str) {
        zzagk zzagkVar;
        String str2;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    @NonNull
    public static String zza(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            return zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":")) + "emulator/auth/handler";
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagn zzagnVar) {
        Map<String, List<WeakReference<zzagn>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagnVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference<>(zzagnVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zza(@NonNull C4196f c4196f, @NonNull String str, int i10) {
        String b10 = c4196f.q().b();
        Map<String, zzagk> map = zza;
        synchronized (map) {
            map.put(b10, new zzagk(str, i10));
        }
        Map<String, List<WeakReference<zzagn>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(b10)) {
                    Iterator<WeakReference<zzagn>> it = map2.get(b10).iterator();
                    boolean z10 = false;
                    while (it.hasNext()) {
                        zzagn zzagnVar = it.next().get();
                        if (zzagnVar != null) {
                            zzagnVar.zza();
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        zza.remove(b10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zza(@NonNull C4196f c4196f) {
        return zza.containsKey(c4196f.q().b());
    }
}
