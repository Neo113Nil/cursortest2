package com.plaid.internal;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.plaid.internal.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3767v1 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static LinkedHashMap b(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String encodedQuery = Uri.parse(str).getEncodedQuery();
        if (encodedQuery != null) {
            int length = encodedQuery.length();
            int i10 = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i10);
                int i11 = indexOf != -1 ? indexOf : length;
                int indexOf2 = encodedQuery.indexOf(61, i10);
                if (indexOf2 > i11 || indexOf2 == -1) {
                    indexOf2 = i11;
                }
                String decode = Uri.decode(encodedQuery.substring(i10, indexOf2));
                if (indexOf2 == i11) {
                    linkedHashMap.put(decode, "");
                } else {
                    linkedHashMap.put(decode, Uri.decode(encodedQuery.substring(indexOf2 + 1, i11)));
                }
                if (indexOf == -1) {
                    break;
                }
                i10 = indexOf + 1;
            }
        }
        return linkedHashMap;
    }

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            gZIPOutputStream.flush();
            a(gZIPOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            a(gZIPOutputStream);
            throw th2;
        }
    }
}
