package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes9.dex */
public final class zbuo {
    static final Charset zba;
    public static final byte[] zbb;

    static {
        Charset.forName("US-ASCII");
        zba = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zbb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zbte(bArr, 0, 0, false, null).zba(0);
        } catch (zbuq e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static int zba(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    static int zbb(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    static Object zbc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    static boolean zbd(zbvm zbvmVar) {
        if (zbvmVar instanceof zbsk) {
            throw null;
        }
        return false;
    }
}
