package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ol {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public ol(String str) {
        String[] split = str.split(":");
        if (split.length != 3) {
            a70.p("Cannot parse iv:ciphertext:mac");
            throw null;
        }
        this.b = Base64.decode(split[0], 2);
        this.c = Base64.decode(split[1], 2);
        this.a = Base64.decode(split[2], 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol.class != obj.getClass()) {
            return false;
        }
        ol olVar = (ol) obj;
        return Arrays.equals(this.a, olVar.a) && Arrays.equals(this.b, olVar.b) && Arrays.equals(this.c, olVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + ((Arrays.hashCode(this.a) + 31) * 31)) * 31);
    }

    public final String toString() {
        String encodeToString = Base64.encodeToString(this.b, 2);
        String encodeToString2 = Base64.encodeToString(this.a, 2);
        return String.format(encodeToString + ":" + Base64.encodeToString(this.c, 2) + ":" + encodeToString2, new Object[0]);
    }

    public ol(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length];
        this.a = bArr4;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        byte[] bArr5 = new byte[bArr2.length];
        this.b = bArr5;
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        byte[] bArr6 = new byte[bArr3.length];
        this.c = bArr6;
        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
    }
}
