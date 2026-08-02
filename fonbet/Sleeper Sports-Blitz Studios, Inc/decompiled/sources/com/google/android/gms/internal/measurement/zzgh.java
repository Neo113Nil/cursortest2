package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzgh implements zzgo {
    private static final Map<Uri, zzgh> zza = new ArrayMap();
    private static final String[] zzb = {SDKConstants.PARAM_KEY, "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzgm> zzi;

    public static zzgh zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgh zzghVar;
        synchronized (zzgh.class) {
            Map<Uri, zzgh> map = zza;
            zzghVar = map.get(uri);
            if (zzghVar == null) {
                try {
                    zzgh zzghVar2 = new zzgh(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzghVar2);
                    } catch (SecurityException unused) {
                    }
                    zzghVar = zzghVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzghVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    map = zze();
                    this.zzh = map;
                }
            }
        }
        return map != null ? map : Collections.EMPTY_MAP;
    }

    final /* synthetic */ Map zzb() {
        Map hashMap;
        Cursor query = this.zzc.query(this.zzd, zzb, null, null, null);
        if (query == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzgn.zza(new zzgq() { // from class: com.google.android.gms.internal.measurement.zzgk
                    @Override // com.google.android.gms.internal.measurement.zzgq
                    public final Object zza() {
                        return zzgh.this.zzb();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private zzgh(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgj zzgjVar = new zzgj(this, null);
        this.zzf = zzgjVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgjVar);
    }

    static synchronized void zzc() {
        synchronized (zzgh.class) {
            for (zzgh zzghVar : zza.values()) {
                zzghVar.zzc.unregisterContentObserver(zzghVar.zzf);
            }
            zza.clear();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            Iterator<zzgm> it = this.zzi.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
