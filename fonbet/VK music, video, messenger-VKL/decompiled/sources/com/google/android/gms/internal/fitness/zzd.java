package com.google.android.gms.internal.fitness;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzd {
    public static int zza(@Nullable Object obj, List list) {
        if (obj == null) {
            return -1;
        }
        int indexOf = list.indexOf(obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        list.add(obj);
        return list.size() - 1;
    }
}
