package com.vungle.ads.internal.network;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h {
    public static final void a(Throwable th) {
        if (th instanceof ThreadDeath) {
            throw th;
        }
        if (th instanceof LinkageError) {
            throw th;
        }
    }
}
