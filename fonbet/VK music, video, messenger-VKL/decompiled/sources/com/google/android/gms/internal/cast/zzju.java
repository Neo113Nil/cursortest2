package com.google.android.gms.internal.cast;

import android.os.Build;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzju extends zzjn {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final AtomicReference zzd;
    private static final AtomicLong zzf;
    private static final ConcurrentLinkedQueue zzg;
    private volatile zzix zze;

    static {
        String str = Build.FINGERPRINT;
        zza = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        zzc = "eng".equals(str3) || "userdebug".equals(str3);
        zzd = new AtomicReference();
        zzf = new AtomicLong();
        zzg = new ConcurrentLinkedQueue();
    }

    private zzju(String str) {
        super(str);
        if (zza || zzb) {
            this.zze = new zzjo().zza(zza());
        } else if (zzc) {
            this.zze = zzjy.zzb().zzb(false).zza(zza());
        } else {
            this.zze = null;
        }
    }

    public static zzix zzb(String str) {
        AtomicReference atomicReference = zzd;
        if (atomicReference.get() != null) {
            return ((zzjp) atomicReference.get()).zza(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt != '$') {
                    if (charAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', JwtParser.SEPARATOR_CHAR);
                    break;
                }
            } else {
                break;
            }
        }
        zzju zzjuVar = new zzju(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = zzjs.zza;
        concurrentLinkedQueue.offer(zzjuVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzju zzjuVar2 = (zzju) concurrentLinkedQueue.poll();
                if (zzjuVar2 == null) {
                    break;
                }
                zzjuVar2.zze = ((zzjp) atomicReference.get()).zza(zzjuVar2.zza());
            }
            if (((zzjt) zzg.poll()) != null) {
                zzf.getAndDecrement();
                throw null;
            }
        }
        return zzjuVar;
    }
}
