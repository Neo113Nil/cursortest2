package com.inmobi.media;

import defpackage.dmi;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M9 implements ThreadFactory {
    public final boolean a;
    public final String b;

    public M9(String str, boolean z) {
        str.getClass();
        this.a = z;
        this.b = dmi.q("TIM-", str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        try {
            Thread thread = new Thread(runnable, this.b);
            thread.setDaemon(this.a);
            return thread;
        } catch (InternalError e) {
            e.toString();
            return null;
        }
    }
}
