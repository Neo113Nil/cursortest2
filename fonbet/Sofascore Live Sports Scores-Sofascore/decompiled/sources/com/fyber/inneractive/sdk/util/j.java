package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final i b;

    public j(int i, i iVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(iVar.a());
        }
        this.b = iVar;
    }
}
