package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f {
    public static final f b = new f();
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    public f() {
        for (int i = 0; i < 2; i++) {
            this.a.offer(ByteBuffer.allocateDirect(16384));
        }
    }
}
