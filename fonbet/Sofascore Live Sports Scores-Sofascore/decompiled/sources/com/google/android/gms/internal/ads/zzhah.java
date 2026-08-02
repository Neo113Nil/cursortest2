package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.gko;
import defpackage.hko;
import defpackage.iko;
import defpackage.ilg;
import defpackage.jko;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhah {
    public static final iko a = new iko("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final iko b = new iko("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final hko c;

    static {
        new jko("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new jko("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        c = new hko(new gko("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract void a(StringBuilder sb, byte[] bArr, int i);

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public abstract int c(int i);

    public abstract int d(int i);

    public CharSequence e(CharSequence charSequence) {
        throw null;
    }

    public final String f(int i, byte[] bArr) {
        zzguk.k(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(c(i));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }

    public final byte[] g(String str) {
        try {
            CharSequence e = e(str);
            int d = d(e.length());
            byte[] bArr = new byte[d];
            int b2 = b(bArr, e);
            if (b2 == d) {
                return bArr;
            }
            byte[] bArr2 = new byte[b2];
            System.arraycopy(bArr, 0, bArr2, 0, b2);
            return bArr2;
        } catch (zzhaf e2) {
            ilg.k(e2);
            return null;
        }
    }
}
