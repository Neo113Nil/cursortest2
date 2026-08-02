package com.google.android.gms.internal.play_billing;

import defpackage.twn;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzcw {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, twn twnVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(twnVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(twnVar) != obj && atomicReferenceFieldUpdater.get(twnVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
