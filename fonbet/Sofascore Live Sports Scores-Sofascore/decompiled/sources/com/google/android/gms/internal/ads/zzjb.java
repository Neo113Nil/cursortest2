package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjb {
    public final HashMap a;

    public final void a(int i, String str) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void b(long j, String str) {
        this.a.put(str, Long.valueOf(j));
    }

    public final void c(String str, float f) {
        this.a.put(str, Float.valueOf(f));
    }

    public final void d(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void e(String str, ByteBuffer byteBuffer) {
        HashMap hashMap = this.a;
        if (byteBuffer == null) {
            hashMap.put(str, null);
            return;
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        hashMap.put(str, allocate);
    }

    public zzjb() {
        this.a = new HashMap();
    }
}
