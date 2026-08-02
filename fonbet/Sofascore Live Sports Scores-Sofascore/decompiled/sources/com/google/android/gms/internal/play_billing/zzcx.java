package com.google.android.gms.internal.play_billing;

import defpackage.twn;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzcx {
    public static /* synthetic */ boolean a(Unsafe unsafe, twn twnVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(twnVar, j, obj, obj2)) {
            if (unsafe.getObject(twnVar, j) != obj && unsafe.getObject(twnVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
