package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzifr {
    static final /* synthetic */ zzicn zza(zzicn zzicnVar, zzicn zzicnVar2, ArrayDeque arrayDeque) {
        zzb(zzicnVar, arrayDeque);
        zzb(zzicnVar2, arrayDeque);
        zzicn zzicnVar3 = (zzicn) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzicnVar3 = new zzift((zzicn) arrayDeque.pop(), zzicnVar3, null);
        }
        return zzicnVar3;
    }

    private static final void zzb(zzicn zzicnVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzicnVar.zzq()) {
            if (!(zzicnVar instanceof zzift)) {
                String valueOf = String.valueOf(zzicnVar.getClass());
                String.valueOf(valueOf);
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(valueOf)));
            }
            zzift zziftVar = (zzift) zzicnVar;
            zzb(zziftVar.zzo(), arrayDeque);
            zzb(zziftVar.zzF(), arrayDeque);
            return;
        }
        int zzc = zzc(zzicnVar.zzb(), arrayDeque);
        int zzn = zzift.zzn(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzicn) arrayDeque.peek()).zzb() >= zzn) {
            arrayDeque.push(zzicnVar);
            return;
        }
        int zzn2 = zzift.zzn(zzc);
        zzicn zzicnVar2 = (zzicn) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzicn) arrayDeque.peek()).zzb() >= zzn2) {
                break;
            } else {
                zzicnVar2 = new zzift((zzicn) arrayDeque.pop(), zzicnVar2, bArr);
            }
        }
        zzift zziftVar2 = new zzift(zzicnVar2, zzicnVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzicn) arrayDeque.peek()).zzb() >= zzift.zzn(zzc(zziftVar2.zzb(), arrayDeque) + 1)) {
                break;
            } else {
                zziftVar2 = new zzift((zzicn) arrayDeque.pop(), zziftVar2, bArr);
            }
        }
        arrayDeque.push(zziftVar2);
    }

    private static final int zzc(int i, ArrayDeque arrayDeque) {
        int binarySearch = Arrays.binarySearch(zzift.zzb, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
