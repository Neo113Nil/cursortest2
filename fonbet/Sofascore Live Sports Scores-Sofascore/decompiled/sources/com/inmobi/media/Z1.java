package com.inmobi.media;

import android.util.SparseArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum Z1 {
    d("UNKNOWN"),
    e("PLAYING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("PAUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("COMPLETED");

    public static final Y1 b = new Y1();
    public static final SparseArray c = new SparseArray();
    public final int a;

    static {
        for (Z1 z1 : values()) {
            c.put(z1.a, z1);
        }
    }

    Z1(String str) {
        this.a = r2;
    }
}
