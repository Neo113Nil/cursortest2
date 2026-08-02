package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.cp4;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzavc {
    public static long a(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long b(ByteBuffer byteBuffer) {
        long a = a(byteBuffer) << 32;
        if (a >= 0) {
            return a(byteBuffer) + a;
        }
        cp4.h("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    public static double c(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) / 65536.0d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) / 1.073741824E9d;
    }
}
