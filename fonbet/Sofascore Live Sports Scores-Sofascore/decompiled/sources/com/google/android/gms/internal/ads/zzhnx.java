package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhnx {
    public static final zzich a = zzich.a(new byte[0]);

    public static final zzich a(int i) {
        return zzich.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzich b(int i) {
        return zzich.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
