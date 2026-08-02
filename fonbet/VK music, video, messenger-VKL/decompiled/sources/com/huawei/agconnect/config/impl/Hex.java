package com.huawei.agconnect.config.impl;

import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.lhg;

/* loaded from: classes13.dex */
public class Hex {
    private static final char[] HEX_CODE = "0123456789ABCDEF".toCharArray();

    private static byte[] decodeHex(char[] cArr) {
        if ((cArr.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[cArr.length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < cArr.length) {
            int digit = Character.digit(cArr[i], 16);
            if (digit == -1) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal hexadecimal character at index "));
            }
            int i3 = i + 1;
            int digit2 = Character.digit(cArr[i3], 16);
            if (digit2 == -1) {
                throw new IllegalArgumentException(lhg.a(i3, "Illegal hexadecimal character at index "));
            }
            i += 2;
            bArr[i2] = (byte) (((digit << 4) | digit2) & 255);
            i2++;
        }
        return bArr;
    }

    public static byte[] decodeHexString(String str) {
        return decodeHex(str.toCharArray());
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = HEX_CODE;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
        }
        return sb.toString();
    }
}
