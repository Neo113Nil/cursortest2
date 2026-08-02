package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3031o extends L {
    public C3031o(G6.i iVar) {
        super(B6.a.d(), iVar);
    }

    public static byte[] g(String str) {
        D6.k.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        D6.k.g(decode);
        return decode.getBytes();
    }

    public static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        return str.split(";")[r2.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.L
    public H7.k d(com.facebook.imagepipeline.request.b bVar) {
        byte[] g10 = g(bVar.getSourceUri().toString());
        return c(new ByteArrayInputStream(g10), g10.length);
    }

    @Override // com.facebook.imagepipeline.producers.L
    public String f() {
        return "DataFetchProducer";
    }
}
