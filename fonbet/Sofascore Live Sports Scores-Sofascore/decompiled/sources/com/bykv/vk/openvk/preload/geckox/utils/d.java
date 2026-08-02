package com.bykv.vk.openvk.preload.geckox.utils;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.bf3;
import defpackage.cp4;
import defpackage.fc6;
import defpackage.vp2;
import defpackage.yhk;
import java.io.InputStream;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d {
    private static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            cp4.h("md5 check failed: md5 == null");
            return;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 4096);
                        if (read == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, read);
                        }
                    }
                    try {
                        byte[] digest = messageDigest.digest();
                        String a2 = a(digest, digest.length);
                        if (str.equals(a2)) {
                            return;
                        }
                        cp4.h(fc6.n("md5 check failed file: local md5:", a2, " expect md5:", str));
                    } catch (Exception e) {
                        vp2.e(bf3.j(e, new StringBuilder("md5 check failed:")), e);
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("md5 check failed:" + e2.getMessage(), e2);
                }
            } finally {
                CloseableUtils.close(inputStream);
            }
        } catch (Exception e3) {
            vp2.e(bf3.j(e3, new StringBuilder("md5 check failed:")), e3);
        }
    }

    private static String a(byte[] bArr, int i) {
        if (bArr != null) {
            if (i <= bArr.length) {
                int i2 = i << 1;
                char[] cArr = new char[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte b = bArr[i4];
                    int i5 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i6 = i3 + 1;
                    char[] cArr2 = a;
                    cArr[i3] = cArr2[i5 >> 4];
                    i3 += 2;
                    cArr[i6] = cArr2[b & 15];
                }
                return new String(cArr, 0, i2);
            }
            throw new IndexOutOfBoundsException();
        }
        yhk.s("bytes is null");
        return null;
    }
}
