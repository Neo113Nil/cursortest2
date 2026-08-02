package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n extends IOException {
    public final b a;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.a = bVar;
    }
}
