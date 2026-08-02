package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3112d extends E implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Map f31586a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f31587b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Set f31588c;

    public C3112d(Context context) {
        this.f31588c = l(context);
    }

    public static String j(String str) {
        return str.substring(0, str.indexOf(33));
    }

    public static Set l(Context context) {
        HashSet hashSet = new HashSet();
        String m10 = m(context.getApplicationInfo().sourceDir);
        if (m10 != null) {
            hashSet.add(m10);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String m11 = m(str);
                if (m11 != null) {
                    hashSet.add(m11);
                }
            }
        }
        return hashSet;
    }

    public static String m(String str) {
        String[] j10 = SysUtil.j();
        if (str == null || str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot compute fallback path, apk path is ");
            sb2.append(str == null ? "null" : "empty");
            p.g("SoLoader", sb2.toString());
            return null;
        }
        if (j10 == null || j10.length == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot compute fallback path, supportedAbis is ");
            sb3.append(j10 == null ? "null" : "empty");
            p.g("SoLoader", sb3.toString());
            return null;
        }
        return str + "!/lib/" + j10[0];
    }

    public static String n(String str, String str2) {
        return str.substring(str.indexOf(33) + 2) + File.separator + str2;
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        C3112d c3112d = new C3112d(context);
        try {
            c3112d.p();
            return c3112d;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectApkSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f31568b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        for (String str2 : this.f31588c) {
            Set set = (Set) this.f31586a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                p.f("SoLoader", str + " not found on " + str2);
            } else {
                o(str2, str, i10, threadPolicy);
                try {
                    i10 |= 4;
                    SoLoader.f31568b.a(str2 + File.separator + str, i10);
                    p.a("SoLoader", str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e10) {
                    p.h("SoLoader", str + " not found on " + str2 + " flag: " + i10, e10);
                }
            }
        }
        return 0;
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) {
        p();
    }

    public final void f(String str, String str2, String str3) {
        synchronized (this.f31587b) {
            try {
                String str4 = str + str2;
                if (!this.f31587b.containsKey(str4)) {
                    this.f31587b.put(str4, new HashSet());
                }
                ((Set) this.f31587b.get(str4)).add(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(String str, String str2) {
        synchronized (this.f31586a) {
            try {
                if (!this.f31586a.containsKey(str)) {
                    this.f31586a.put(str, new HashSet());
                }
                ((Set) this.f31586a.get(str)).add(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(String str, String str2) {
        String j10 = j(str);
        ZipFile zipFile = new ZipFile(j10);
        try {
            String n10 = n(str, str2);
            ZipEntry entry = zipFile.getEntry(n10);
            if (entry != null) {
                i(str, zipFile, entry, str2);
                zipFile.close();
                return;
            }
            p.b("SoLoader", n10 + " not found in " + j10);
            zipFile.close();
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(String str, ZipFile zipFile, ZipEntry zipEntry, String str2) {
        j jVar = new j(zipFile, zipEntry);
        try {
            for (String str3 : t.b(str2, jVar)) {
                if (!str3.startsWith("/")) {
                    f(str, str2, str3);
                }
            }
            jVar.close();
        } catch (Throwable th2) {
            try {
                jVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public boolean isValid() {
        return !this.f31588c.isEmpty();
    }

    public final Set k(String str, String str2) {
        Set set;
        synchronized (this.f31587b) {
            set = (Set) this.f31587b.get(str + str2);
        }
        return set;
    }

    public final void o(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set k10 = k(str, str2);
        if (k10 == null) {
            h(str, str2);
            k10 = k(str, str2);
        }
        if (k10 != null) {
            Iterator it = k10.iterator();
            while (it.hasNext()) {
                SoLoader.s((String) it.next(), i10, threadPolicy);
            }
        }
    }

    public final void p() {
        int indexOf;
        int i10;
        for (String str : this.f31588c) {
            String substring = (TextUtils.isEmpty(str) || (indexOf = str.indexOf(33)) < 0 || (i10 = indexOf + 2) >= str.length()) ? null : str.substring(i10);
            if (!TextUtils.isEmpty(substring)) {
                ZipFile zipFile = new ZipFile(j(str));
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement != null && nextElement.getMethod() == 0 && nextElement.getName().startsWith(substring) && nextElement.getName().endsWith(".so")) {
                            g(str, nextElement.getName().substring(substring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        return c() + "[root = " + this.f31588c.toString() + ']';
    }
}
