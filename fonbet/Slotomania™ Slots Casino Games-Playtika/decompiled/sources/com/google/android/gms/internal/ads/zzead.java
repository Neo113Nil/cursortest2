package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzead {
    public final long zza;
    public final int[] zzb;

    private zzead(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzgvz zza(JsonReader jsonReader) throws IOException {
        int[] iArr;
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgvz zzi = zzgvz.zzi();
            jsonReader.beginObject();
            zzead zzeadVar = null;
            Long l = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Objects.equals(nextName, "id")) {
                    l = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(nextName, "event_types")) {
                    zzgvw zzgvwVar2 = new zzgvw();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgvwVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzi = zzgvwVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (l != null && !zzi.isEmpty()) {
                long longValue = l.longValue();
                if (zzi == null) {
                    iArr = new int[0];
                } else {
                    int[] iArr2 = new int[zzi.size()];
                    for (int i2 = 0; i2 < zzi.size(); i2++) {
                        iArr2[i2] = ((Integer) zzi.get(i2)).intValue();
                    }
                    iArr = iArr2;
                }
                zzeadVar = new zzead(longValue, iArr);
            }
            if (zzeadVar != null) {
                zzgvwVar.zzf(zzeadVar);
            }
        }
        jsonReader.endArray();
        return zzgvwVar.zzi();
    }
}
