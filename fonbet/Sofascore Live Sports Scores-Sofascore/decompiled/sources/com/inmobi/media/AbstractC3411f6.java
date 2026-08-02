package com.inmobi.media;

import android.util.Base64;
import com.ironsource.U3;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3411f6 {
    public static final /* synthetic */ int a = 0;

    public static byte[] a(String str) {
        int i;
        if (str != null) {
            int length = str.length() % 4;
            i = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(str != null ? new StringBuilder((CharSequence) str).reverse().toString() : null);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = ((Object) valueOf) + U3.j.b;
        }
        byte[] bytes = valueOf.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return Base64.decode(bytes, 2);
    }

    public static String a(String str, byte[] bArr) {
        byte[] bArr2;
        str.getClass();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.getClass();
            cipher.init(1, secretKeySpec);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            bArr2 = cipher.doFinal(bytes);
        } catch (Throwable th) {
            th.getMessage();
            bArr2 = null;
        }
        byte[] encode = Base64.encode(bArr2, 2);
        encode.getClass();
        return new String(encode, Charsets.UTF_8);
    }
}
