package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgq extends zzbgi {
    public MessageDigest c;
    public final int d;
    public final int e;

    public zzbgq(int i) {
        int i2 = i >> 3;
        this.d = (i & 7) > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    public final byte[] b(String str) {
        synchronized (this.a) {
            try {
                MessageDigest a = a();
                this.c = a;
                if (a == null) {
                    return new byte[0];
                }
                a.reset();
                this.c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.c.digest();
                int length = digest.length;
                int i = this.d;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i2 = this.e & 7;
                if (i2 > 0) {
                    long j = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (i3 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    }
                    long j2 = j >>> (8 - i2);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
