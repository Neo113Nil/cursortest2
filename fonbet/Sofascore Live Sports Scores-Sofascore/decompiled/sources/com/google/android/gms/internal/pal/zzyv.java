package com.google.android.gms.internal.pal;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.lnb;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzyv {
    public final byte[] a;

    public zzyv(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzyv) {
            return Arrays.equals(((zzyv) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return lnb.o("Bytes(", sb.toString(), ")");
    }
}
