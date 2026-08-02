package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g {
    private final int a;
    private final List<com.mbridge.msdk.tracker.network.g> b;
    private final int c;
    private final InputStream d;
    private final byte[] e;

    public g(int i, List<com.mbridge.msdk.tracker.network.g> list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
        this.e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.e != null) {
            return new ByteArrayInputStream(this.e);
        }
        return null;
    }

    public final int b() {
        return this.c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.b);
    }

    public final int d() {
        return this.a;
    }

    public g(int i, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i, list, -1, null);
    }
}
