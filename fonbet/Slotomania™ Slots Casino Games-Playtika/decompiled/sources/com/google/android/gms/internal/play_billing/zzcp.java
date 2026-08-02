package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.zzes$$ExternalSyntheticBackport0;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes7.dex */
public final /* synthetic */ class zzcp {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!zzes$$ExternalSyntheticBackport0.m(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
