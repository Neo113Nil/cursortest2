package com.mbridge.msdk.foundation.same;

/* compiled from: MBridgeRefactor.java */
/* loaded from: classes13.dex */
public class b {
    private static volatile b b;
    private Boolean a = null;

    private b() {
    }

    public static b b() {
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new b();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public Boolean a() {
        return this.a;
    }
}
