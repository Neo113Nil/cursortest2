package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibb {
    public static ECParameterSpec a(zziaz zziazVar) {
        int ordinal = zziazVar.ordinal();
        if (ordinal == 0) {
            return zzhmm.a;
        }
        if (ordinal == 1) {
            return zzhmm.b;
        }
        if (ordinal == 2) {
            return zzhmm.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(zziazVar.toString()));
    }

    public static byte[] b(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }
}
