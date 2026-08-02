package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3188l {

    /* renamed from: b, reason: collision with root package name */
    public static final C3183g f32718b = new C3183g("LibraryVersion", "");

    /* renamed from: c, reason: collision with root package name */
    public static final C3188l f32719c = new C3188l();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f32720a = new ConcurrentHashMap();

    public static C3188l a() {
        return f32719c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b(String str) {
        String str2;
        InputStream inputStream;
        AbstractC3191o.h(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f32720a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r4 = null;
        String str3 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = C3188l.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (IOException e10) {
                e = e10;
                str2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                C3183g c3183g = f32718b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str3).length());
                sb2.append(str);
                sb2.append(" version is ");
                sb2.append(str3);
                c3183g.d("LibraryVersion", sb2.toString());
            } else {
                C3183g c3183g2 = f32718b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Failed to get app version for libraryName: ");
                sb3.append(str);
                c3183g2.e("LibraryVersion", sb3.toString());
            }
        } catch (IOException e11) {
            e = e11;
            str2 = str3;
            inputStream2 = inputStream;
            C3183g c3183g3 = f32718b;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
            sb4.append("Failed to get app version for libraryName: ");
            sb4.append(str);
            c3183g3.c("LibraryVersion", sb4.toString(), e);
            inputStream = inputStream2;
            str3 = str2;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            this.f32720a.put(str, str3);
            return str3;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                K9.k.a(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            K9.k.a(inputStream);
        }
        if (str3 == null) {
            f32718b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            str3 = "UNKNOWN";
        }
        this.f32720a.put(str, str3);
        return str3;
    }
}
