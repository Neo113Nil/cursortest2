package com.bytedance.sdk.component.utils;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.yhk;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax {
    private static final char[] pcc = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String pcc(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            yhk.s("bytes is null");
            return null;
        }
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte b = bArr[i5 + i];
            int i6 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i7 = i4 + 1;
            char[] cArr2 = pcc;
            cArr[i4] = cArr2[i6 >> 4];
            i4 += 2;
            cArr[i7] = cArr2[b & 15];
        }
        return new String(cArr, 0, i3);
    }

    public static String pcc(byte[] bArr) {
        if (bArr != null) {
            return pcc(bArr, 0, bArr.length);
        }
        yhk.s("bytes is null");
        return null;
    }

    public static String pcc(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes(C.UTF8_NAME));
                    return pcc(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
