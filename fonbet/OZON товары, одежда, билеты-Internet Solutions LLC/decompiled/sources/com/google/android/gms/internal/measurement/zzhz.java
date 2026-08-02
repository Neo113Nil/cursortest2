package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.C5132a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhz implements zzhj {
    private static final Map zza = new C5132a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static zzhz zza(Context context, String str) {
        zzhz zzhzVar;
        if (zzha.zza()) {
            throw null;
        }
        synchronized (zzhz.class) {
            try {
                zzhzVar = (zzhz) zza.get(null);
                if (zzhzVar == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zzhzVar;
    }

    static synchronized void zzc() {
        synchronized (zzhz.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((zzhz) it.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    public final Object zzb(String str) {
        throw null;
    }
}
