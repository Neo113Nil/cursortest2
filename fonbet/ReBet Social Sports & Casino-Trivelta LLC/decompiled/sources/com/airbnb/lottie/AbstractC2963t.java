package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.plaid.internal.EnumC3631g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import ti.InterfaceC6480j;

/* renamed from: com.airbnb.lottie.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2963t {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f29098a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f29099b = new HashSet();
    private static final byte[] ZIP_MAGIC = {80, 75, 3, 4};
    private static final byte[] GZIP_MAGIC = {31, -117, 8};

    public static T A(Context context, int i10, String str) {
        C2940j a10 = str == null ? null : E3.g.b().a(str);
        if (a10 != null) {
            return new T(a10);
        }
        try {
            InterfaceC6480j d10 = ti.t.d(ti.t.k(context.getResources().openRawResource(i10)));
            if (K(d10).booleanValue()) {
                return F(context, new ZipInputStream(d10.X1()), str);
            }
            if (!I(d10).booleanValue()) {
                return t(com.airbnb.lottie.parser.moshi.c.r(d10), str);
            }
            try {
                return r(new GZIPInputStream(d10.X1()), str);
            } catch (IOException e10) {
                return new T((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new T((Throwable) e11);
        }
    }

    public static V B(Context context, String str) {
        return C(context, str, "url_" + str);
    }

    public static V C(final Context context, final String str, final String str2) {
        return j(str2, new Callable() { // from class: com.airbnb.lottie.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2963t.c(context, str, str2);
            }
        }, null);
    }

    public static V D(final Context context, final ZipInputStream zipInputStream, final String str) {
        return j(str, new Callable() { // from class: com.airbnb.lottie.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                T F10;
                F10 = AbstractC2963t.F(context, zipInputStream, str);
                return F10;
            }
        }, new Runnable() { // from class: com.airbnb.lottie.p
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.z.c(zipInputStream);
            }
        });
    }

    public static V E(ZipInputStream zipInputStream, String str) {
        return D(null, zipInputStream, str);
    }

    public static T F(Context context, ZipInputStream zipInputStream, String str) {
        return G(context, zipInputStream, str, true);
    }

    public static T G(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return H(context, zipInputStream, str);
        } finally {
            if (z10) {
                com.airbnb.lottie.utils.z.c(zipInputStream);
            }
        }
    }

    public static T H(Context context, ZipInputStream zipInputStream, String str) {
        C2940j a10;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = E3.g.b().a(str);
            } catch (IOException e10) {
                return new T((Throwable) e10);
            }
        }
        if (a10 != null) {
            return new T(a10);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C2940j c2940j = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c2940j = (C2940j) v(com.airbnb.lottie.parser.moshi.c.r(ti.t.d(ti.t.k(zipInputStream))), null, false).b();
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new T((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream2 = new FileOutputStream(file);
                        } finally {
                        }
                    } catch (Throwable th2) {
                        com.airbnb.lottie.utils.g.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
                    }
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            com.airbnb.lottie.utils.g.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        hashMap2.put(str3, createFromFile);
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c2940j == null) {
            return new T((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            N k10 = k(c2940j, (String) entry.getKey());
            if (k10 != null) {
                k10.g(com.airbnb.lottie.utils.z.m((Bitmap) entry.getValue(), k10.f(), k10.d()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z10 = false;
            for (E3.c cVar : c2940j.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                com.airbnb.lottie.utils.g.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it = c2940j.j().entrySet().iterator();
            while (it.hasNext()) {
                N n10 = (N) ((Map.Entry) it.next()).getValue();
                if (n10 == null) {
                    return null;
                }
                String c10 = n10.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
                if (c10.startsWith("data:") && c10.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            n10.g(com.airbnb.lottie.utils.z.m(decodeByteArray, n10.f(), n10.d()));
                        }
                    } catch (IllegalArgumentException e11) {
                        com.airbnb.lottie.utils.g.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            E3.g.b().c(str, c2940j);
        }
        return new T(c2940j);
    }

    public static Boolean I(InterfaceC6480j interfaceC6480j) {
        return L(interfaceC6480j, GZIP_MAGIC);
    }

    public static boolean J(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean K(InterfaceC6480j interfaceC6480j) {
        return L(interfaceC6480j, ZIP_MAGIC);
    }

    public static Boolean L(InterfaceC6480j interfaceC6480j, byte[] bArr) {
        try {
            InterfaceC6480j peek = interfaceC6480j.peek();
            for (byte b10 : bArr) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            com.airbnb.lottie.utils.g.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void M(boolean z10) {
        ArrayList arrayList = new ArrayList(f29099b);
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    public static String N(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(J(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void b(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map map = f29098a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    public static /* synthetic */ T c(Context context, String str, String str2) {
        T c10 = AbstractC2935e.j(context).c(context, str, str2);
        if (str2 != null && c10.b() != null) {
            E3.g.b().c(str2, (C2940j) c10.b());
        }
        return c10;
    }

    public static /* synthetic */ T d(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return A(context, i10, str);
    }

    public static /* synthetic */ void i(String str, AtomicBoolean atomicBoolean, C2940j c2940j) {
        Map map = f29098a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    public static V j(final String str, Callable callable, Runnable runnable) {
        C2940j a10 = str == null ? null : E3.g.b().a(str);
        V v10 = a10 != null ? new V(a10) : null;
        if (str != null) {
            Map map = f29098a;
            if (map.containsKey(str)) {
                v10 = (V) map.get(str);
            }
        }
        if (v10 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return v10;
        }
        V v11 = new V(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            v11.d(new O() { // from class: com.airbnb.lottie.q
                @Override // com.airbnb.lottie.O
                public final void onResult(Object obj) {
                    AbstractC2963t.i(str, atomicBoolean, (C2940j) obj);
                }
            });
            v11.c(new O() { // from class: com.airbnb.lottie.r
                @Override // com.airbnb.lottie.O
                public final void onResult(Object obj) {
                    AbstractC2963t.b(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f29098a;
                map2.put(str, v11);
                if (map2.size() == 1) {
                    M(false);
                }
            }
        }
        return v11;
    }

    public static N k(C2940j c2940j, String str) {
        for (N n10 : c2940j.j().values()) {
            if (n10.c().equals(str)) {
                return n10;
            }
        }
        return null;
    }

    public static V l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static V m(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return j(str2, new Callable() { // from class: com.airbnb.lottie.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                T o10;
                o10 = AbstractC2963t.o(applicationContext, str, str2);
                return o10;
            }
        }, null);
    }

    public static T n(Context context, String str) {
        return o(context, str, "asset_" + str);
    }

    public static T o(Context context, String str, String str2) {
        C2940j a10 = str2 == null ? null : E3.g.b().a(str2);
        if (a10 != null) {
            return new T(a10);
        }
        try {
            return p(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new T((Throwable) e10);
        }
    }

    public static T p(Context context, InputStream inputStream, String str) {
        C2940j a10 = str == null ? null : E3.g.b().a(str);
        if (a10 != null) {
            return new T(a10);
        }
        try {
            InterfaceC6480j d10 = ti.t.d(ti.t.k(inputStream));
            return K(d10).booleanValue() ? F(context, new ZipInputStream(d10.X1()), str) : I(d10).booleanValue() ? r(new GZIPInputStream(d10.X1()), str) : t(com.airbnb.lottie.parser.moshi.c.r(d10), str);
        } catch (IOException e10) {
            return new T((Throwable) e10);
        }
    }

    public static V q(final InputStream inputStream, final String str) {
        return j(str, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                T r10;
                r10 = AbstractC2963t.r(inputStream, str);
                return r10;
            }
        }, new Runnable() { // from class: com.airbnb.lottie.m
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.z.c(inputStream);
            }
        });
    }

    public static T r(InputStream inputStream, String str) {
        return s(inputStream, str, true);
    }

    public static T s(InputStream inputStream, String str, boolean z10) {
        return w(ti.t.k(inputStream), str, z10);
    }

    public static T t(com.airbnb.lottie.parser.moshi.c cVar, String str) {
        return u(cVar, str, true);
    }

    public static T u(com.airbnb.lottie.parser.moshi.c cVar, String str, boolean z10) {
        return v(cVar, str, z10);
    }

    public static T v(com.airbnb.lottie.parser.moshi.c cVar, String str, boolean z10) {
        C2940j a10;
        try {
            if (str == null) {
                a10 = null;
            } else {
                try {
                    a10 = E3.g.b().a(str);
                } catch (Exception e10) {
                    T t10 = new T((Throwable) e10);
                    if (z10) {
                        com.airbnb.lottie.utils.z.c(cVar);
                    }
                    return t10;
                }
            }
            if (a10 != null) {
                T t11 = new T(a10);
                if (z10) {
                    com.airbnb.lottie.utils.z.c(cVar);
                }
                return t11;
            }
            C2940j a11 = com.airbnb.lottie.parser.w.a(cVar);
            if (str != null) {
                E3.g.b().c(str, a11);
            }
            T t12 = new T(a11);
            if (z10) {
                com.airbnb.lottie.utils.z.c(cVar);
            }
            return t12;
        } catch (Throwable th2) {
            if (z10) {
                com.airbnb.lottie.utils.z.c(cVar);
            }
            throw th2;
        }
    }

    public static T w(ti.G g10, String str, boolean z10) {
        return v(com.airbnb.lottie.parser.moshi.c.r(ti.t.d(g10)), str, z10);
    }

    public static V x(Context context, int i10) {
        return y(context, i10, N(context, i10));
    }

    public static V y(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return j(str, new Callable() { // from class: com.airbnb.lottie.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2963t.d(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    public static T z(Context context, int i10) {
        return A(context, i10, N(context, i10));
    }
}
