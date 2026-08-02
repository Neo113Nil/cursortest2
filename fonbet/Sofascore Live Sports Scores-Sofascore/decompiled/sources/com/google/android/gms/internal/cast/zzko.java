package com.google.android.gms.internal.cast;

import defpackage.a70;
import defpackage.j40;
import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzko implements Closeable {
    public int a = 0;

    static {
        new j40(18);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
        } else {
            a70.j("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
