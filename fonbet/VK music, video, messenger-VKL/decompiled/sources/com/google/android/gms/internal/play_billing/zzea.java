package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;
import xsna.wr01;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes12.dex */
public final /* synthetic */ class zzea {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!wr01.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
