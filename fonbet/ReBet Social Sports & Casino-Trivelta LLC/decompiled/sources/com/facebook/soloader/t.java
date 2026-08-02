package com.facebook.soloader;

import android.os.StrictMode;
import com.facebook.soloader.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import y8.AbstractC6859b;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f31618a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final int f31619b = 3;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f31621d = false;

    /* renamed from: e, reason: collision with root package name */
    public static List f31622e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Map f31623f = null;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f31624g = false;
    private static byte[] sEncodedDeps;

    /* renamed from: c, reason: collision with root package name */
    public static final int f31620c = 3 + 3;

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantReadWriteLock f31625h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public static final HashSet f31626i = new a();

    public class a extends HashSet {
        public a() {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    }

    public static String[] a(String str) {
        if (f31621d) {
            return i(str);
        }
        if (!f31624g) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f31625h;
        reentrantReadWriteLock.readLock().lock();
        try {
            String[] i10 = i(str);
            reentrantReadWriteLock.readLock().unlock();
            return i10;
        } catch (Throwable th2) {
            f31625h.readLock().unlock();
            throw th2;
        }
    }

    public static String[] b(String str, h hVar) {
        boolean z10 = SoLoader.f31567a;
        if (z10) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        AbstractC6859b.b();
        try {
            try {
                try {
                    String[] a10 = a(str);
                    if (a10 != null) {
                        AbstractC6859b.a(null);
                        if (z10) {
                            Api18TraceUtils.b();
                        }
                        return a10;
                    }
                    String[] a11 = s.a(hVar);
                    AbstractC6859b.a(null);
                    if (z10) {
                        Api18TraceUtils.b();
                    }
                    return a11;
                } catch (Error | RuntimeException e10) {
                    throw e10;
                }
            } catch (s.a e11) {
                throw D.b(str, e11);
            }
        } catch (Throwable th2) {
            AbstractC6859b.a(null);
            if (SoLoader.f31567a) {
                Api18TraceUtils.b();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] c(int i10, int i11) {
        byte b10;
        ArrayList arrayList = new ArrayList();
        int i12 = (i10 + i11) - f31620c;
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            byte[] bArr = sEncodedDeps;
            if (i12 >= bArr.length || (b10 = bArr[i12]) == 10) {
                break;
            }
            if (b10 == 32) {
                if (z10) {
                    String d10 = d(i13);
                    if (d10 == null) {
                        return null;
                    }
                    arrayList.add(d10);
                    i13 = 0;
                    z10 = false;
                } else {
                    continue;
                }
            } else {
                if (b10 < 48 || b10 > 57) {
                    break;
                }
                i13 = (i13 * 10) + (b10 - 48);
                z10 = true;
            }
            i12++;
        }
        if (z10) {
            String d11 = d(i13);
            if (d11 == null) {
                return null;
            }
            arrayList.add(d11);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String d(int i10) {
        if (i10 >= f31622e.size()) {
            return null;
        }
        int intValue = ((Integer) f31622e.get(i10)).intValue();
        int i11 = intValue;
        while (true) {
            byte[] bArr = sEncodedDeps;
            if (i11 >= bArr.length || bArr[i11] <= 32) {
                break;
            }
            i11++;
        }
        int i12 = (i11 - intValue) + f31620c;
        char[] cArr = new char[i12];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i13 = 0; i13 < i12 - f31620c; i13++) {
            cArr[f31618a + i13] = (char) sEncodedDeps[intValue + i13];
        }
        cArr[i12 - 3] = '.';
        cArr[i12 - 2] = 's';
        cArr[i12 - 1] = 'o';
        return new String(cArr);
    }

    public static int e(String str) {
        List list = (List) f31623f.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (g(str, intValue)) {
                return intValue;
            }
        }
        return -1;
    }

    public static int f(String str) {
        int i10 = 5381;
        for (int i11 = f31618a; i11 < str.length() - f31619b; i11++) {
            i10 = str.codePointAt(i11) + (i10 << 5) + i10;
        }
        return i10;
    }

    public static boolean g(String str, int i10) {
        int i11;
        int i12 = f31618a;
        while (true) {
            int length = str.length();
            i11 = f31619b;
            if (i12 >= length - i11 || i10 >= sEncodedDeps.length || (str.codePointAt(i12) & 255) != sEncodedDeps[i10]) {
                break;
            }
            i12++;
            i10++;
        }
        return i12 == str.length() - i11;
    }

    public static void h(String str, h hVar, int i10, StrictMode.ThreadPolicy threadPolicy) {
        String[] b10 = b(str, hVar);
        p.a("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(b10));
        for (String str2 : b10) {
            if (!str2.startsWith("/") && !f31626i.contains(str2)) {
                SoLoader.s(str2, i10, threadPolicy);
            }
        }
    }

    public static String[] i(String str) {
        int e10;
        if (f31621d && str.length() > f31620c && (e10 = e(str)) != -1) {
            return c(e10, str.length());
        }
        return null;
    }
}
