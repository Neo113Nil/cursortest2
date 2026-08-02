package com.plaid.internal;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.plaid.internal.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3758u1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C3784x0 f41107e;

    /* renamed from: a, reason: collision with root package name */
    public final int f41108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41109b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f41110c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41111d;

    static {
        W3 w32 = Z3.f39803a;
        f41107e = new C3784x0("http-response");
    }

    public C3758u1(int i10, String str, HashMap hashMap, String str2) {
        this.f41108a = i10;
        this.f41109b = str;
        this.f41110c = hashMap;
        this.f41111d = str2;
    }

    public static C3758u1 a(InputStream inputStream) {
        String a10;
        String str;
        O6 o62 = new O6(inputStream);
        do {
            a10 = o62.a();
            if (a10 == null) {
                throw new IOException("empty response");
            }
        } while (a10.length() < 10);
        f41107e.a(W3.TRACE, "HttpResponse: ".concat(a10), new Object[0]);
        String[] split = a10.split(" ");
        if (split.length > 0) {
            String str2 = split[0];
        }
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 500;
        if (split.length > 2) {
            str = TextUtils.join(" ", Arrays.copyOfRange(split, 2, split.length));
        } else if (parseInt == 204) {
            str = "No Content";
        } else if (parseInt == 404) {
            str = "Not Found";
        } else if (parseInt == 410) {
            str = "Gone";
        } else if (parseInt != 500) {
            switch (parseInt) {
                case 200:
                    str = "OK";
                    break;
                case 201:
                    str = "Created";
                    break;
                case 202:
                    str = "Accepted";
                    break;
                default:
                    str = "Unknown Error";
                    break;
            }
        } else {
            str = "Internal Server Error";
        }
        HashMap hashMap = new HashMap();
        String a11 = o62.a();
        if (a11 == null) {
            throw new IOException("unexpected end of response");
        }
        int length = a11.length();
        while (length > 0) {
            C3784x0 c3784x0 = f41107e;
            c3784x0.a(W3.TRACE, a11, new Object[0]);
            String[] split2 = a11.split(":");
            if (split2.length > 1) {
                String lowerCase = split2[0].trim().toLowerCase();
                String trim = a11.substring(split2[0].length() + 1).trim();
                List list = (List) hashMap.get(lowerCase);
                if (list == null) {
                    list = new LinkedList();
                    hashMap.put(lowerCase, list);
                }
                list.add(trim);
            } else {
                c3784x0.a(W3.ERROR, "Invalid header line received: ".concat(a11), new Object[0]);
            }
            a11 = o62.a();
            if (a11 == null) {
                throw new IOException("unexpected end of response");
            }
            length = a11.length();
        }
        f41107e.a(W3.TRACE, a11, new Object[0]);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = -1;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) ((List) entry.getValue()).get(0);
            if ("transfer-encoding".equals(str3)) {
                if ("chunked".equalsIgnoreCase(str4)) {
                    z10 = true;
                } else if ("gzip".equalsIgnoreCase(str4)) {
                    z11 = true;
                }
            } else if ("content-length".equals(str3)) {
                i10 = Integer.parseInt((String) ((List) entry.getValue()).get(0));
            }
            if ("content-encoding".equals(entry.getKey()) && "gzip".equalsIgnoreCase(str4)) {
                z11 = true;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        if (z10) {
            f41107e.a(W3.TRACE, "read chunked", new Object[0]);
            while (true) {
                String a12 = o62.a();
                if (a12 != null) {
                    int parseInt2 = Integer.parseInt(a12.trim(), 16);
                    f41107e.a(W3.TRACE, "read chunk of " + parseInt2 + " bytes", new Object[0]);
                    if (parseInt2 != 0) {
                        byte[] bArr = new byte[parseInt2];
                        byteArrayOutputStream.write(bArr, 0, o62.f39489a.read(bArr, 0, parseInt2));
                        o62.a();
                    }
                }
            }
        } else {
            if (i10 >= 0) {
                f41107e.a(W3.TRACE, "read body of content-length=" + i10, new Object[0]);
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                do {
                    int read = o62.f39489a.read(bArr2, i11, i10 - i11);
                    if (read != -1) {
                        i11 += read;
                    }
                    byteArrayOutputStream.write(bArr2);
                } while (i11 != i10);
                byteArrayOutputStream.write(bArr2);
            } else {
                f41107e.a(W3.TRACE, "read body of unknown content-length", new Object[0]);
                byte[] bArr3 = new byte[256];
                for (int read2 = o62.f39489a.read(bArr3, 0, 256); read2 > 0; read2 = o62.f39489a.read(bArr3, 0, 256)) {
                    byteArrayOutputStream.write(bArr3, 0, read2);
                }
            }
            if (z11) {
                f41107e.a(W3.TRACE, "decompress response bytes", new Object[0]);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream = new ByteArrayOutputStream(byteArray.length * 4);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
                byte[] bArr4 = new byte[32];
                while (true) {
                    int read3 = gZIPInputStream.read(bArr4);
                    if (read3 != -1) {
                        byteArrayOutputStream.write(bArr4, 0, read3);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                    }
                }
            }
        }
        return new C3758u1(parseInt, str, hashMap, byteArrayOutputStream.toString());
    }
}
