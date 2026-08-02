package com.google.android.gms.internal.fido;

import defpackage.a70;
import defpackage.cco;
import defpackage.lco;
import defpackage.mbo;
import defpackage.qbo;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgf {
    public static final qbo a;

    static {
        new cco("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new cco("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new lco("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new lco("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        a = new qbo(new mbo("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract void a(StringBuilder sb, byte[] bArr, int i);

    public abstract int b(int i);

    public final String c(int i, byte[] bArr) {
        zzbm.b(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(b(i));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }
}
