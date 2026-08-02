package com.mbridge.msdk.tracker.network;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class l {
    private static volatile l b;
    private u a;

    private l() {
    }

    public static l a() {
        if (b == null) {
            synchronized (l.class) {
                try {
                    if (b == null) {
                        b = new l();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public u b() {
        if (this.a == null) {
            u a = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.a = a;
            a.b();
        }
        return this.a;
    }
}
