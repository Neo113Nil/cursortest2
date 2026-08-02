package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class q {
    public static String a(String str) {
        str.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                bytes.getClass();
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                encodeToString.getClass();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return encodeToString;
            } finally {
            }
        } finally {
        }
    }
}
