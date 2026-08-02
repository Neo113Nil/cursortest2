package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class j implements com.vungle.ads.internal.executor.h {
    public abstract int a();

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        obj.getClass();
        if (!(obj instanceof j)) {
            return -1;
        }
        return Intrinsics.d(((j) obj).a(), a());
    }
}
