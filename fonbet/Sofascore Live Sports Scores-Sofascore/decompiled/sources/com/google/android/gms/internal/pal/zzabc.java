package com.google.android.gms.internal.pal;

import defpackage.q6n;
import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabc implements Closeable {
    public int a;

    static {
        new q6n();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(0 + 1);
        sb.append(" column ");
        sb.append((0 - 0) + 1);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        if (this.a > 0) {
            throw null;
        }
        sb.append(sb2.toString());
        return "zzabc".concat(sb.toString());
    }
}
