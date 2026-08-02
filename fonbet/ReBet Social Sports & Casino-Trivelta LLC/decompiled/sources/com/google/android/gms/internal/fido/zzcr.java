package com.google.android.gms.internal.fido;

import java.util.Comparator;
import kotlin.UByte;

/* loaded from: classes2.dex */
final class zzcr implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzcz zzczVar = (zzcz) obj;
        zzcz zzczVar2 = (zzcz) obj2;
        zzcq zzcqVar = new zzcq(zzczVar);
        zzcq zzcqVar2 = new zzcq(zzczVar2);
        while (zzcqVar.hasNext() && zzcqVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzcqVar.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(zzcqVar2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzczVar.zzd()).compareTo(Integer.valueOf(zzczVar2.zzd()));
    }
}
