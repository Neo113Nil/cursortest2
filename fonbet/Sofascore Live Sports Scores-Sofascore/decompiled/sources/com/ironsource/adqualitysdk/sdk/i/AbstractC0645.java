package com.ironsource.adqualitysdk.sdk.i;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0645 {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m388(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
