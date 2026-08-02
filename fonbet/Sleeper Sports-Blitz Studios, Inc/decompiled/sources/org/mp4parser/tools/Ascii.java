package org.mp4parser.tools;

import java.io.UnsupportedEncodingException;

/* loaded from: classes10.dex */
public final class Ascii {
    public static byte[] convert(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("us-ascii");
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    public static String convert(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "us-ascii");
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }
}
