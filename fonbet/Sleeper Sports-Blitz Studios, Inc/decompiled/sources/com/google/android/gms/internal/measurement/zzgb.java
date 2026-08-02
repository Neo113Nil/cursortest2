package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzgb implements zzgd {
    @Override // com.google.android.gms.internal.measurement.zzgd
    public final String zza(ContentResolver contentResolver, String str) throws zzgg {
        Cursor query = contentResolver.query(zzfv.zza, null, null, new String[]{str}, null);
        try {
            if (query == null) {
                throw new zzgg("Failed to connect to GservicesProvider");
            }
            if (query.moveToFirst()) {
                String string = query.getString(1);
                if (query != null) {
                    query.close();
                }
                return string;
            }
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgd
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzge<T> zzgeVar) throws zzgg {
        Cursor query = contentResolver.query(zzfv.zzb, null, null, strArr, null);
        try {
            if (query == null) {
                throw new zzgg("Failed to connect to GservicesProvider");
            }
            T zza = zzgeVar.zza(query.getCount());
            while (query.moveToNext()) {
                zza.put(query.getString(0), query.getString(1));
            }
            if (query != null) {
                query.close();
            }
            return zza;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
