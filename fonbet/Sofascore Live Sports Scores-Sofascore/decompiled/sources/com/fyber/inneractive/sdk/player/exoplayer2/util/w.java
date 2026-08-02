package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class w {
    public static void a(String str) {
        if (z.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (z.a >= 18) {
            Trace.endSection();
        }
    }
}
