package com.airbnb.lottie;

import B5.j;
import B5.s;
import B5.t;
import B5.w;
import B5.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
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
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import sf.G;
import sf.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f57296a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f57297b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f57298c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f57299d = 0;

    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean) {
        HashMap hashMap = f57296a;
        hashMap.remove(str);
        atomicBoolean.set(true);
        if (hashMap.size() == 0) {
            q(true);
        }
    }

    public static /* synthetic */ void b(String str, AtomicBoolean atomicBoolean) {
        HashMap hashMap = f57296a;
        hashMap.remove(str);
        atomicBoolean.set(true);
        if (hashMap.size() == 0) {
            q(true);
        }
    }

    private static h<B5.g> c(final String str, Callable<w<B5.g>> callable, Runnable runnable) {
        final B5.g a11 = str == null ? null : H5.g.b().a(str);
        h<B5.g> hVar = a11 != null ? new h<>(new Callable() { // from class: B5.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new w(g.this);
            }
        }, false) : null;
        HashMap hashMap = f57296a;
        if (str != null && hashMap.containsKey(str)) {
            hVar = (h) hashMap.get(str);
        }
        if (hVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return hVar;
        }
        h<B5.g> hVar2 = new h<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            hVar2.d(new t() { // from class: B5.m
                @Override // B5.t
                public final void onResult(Object obj) {
                    com.airbnb.lottie.a.b(str, atomicBoolean);
                }
            });
            hVar2.c(new t() { // from class: B5.n
                @Override // B5.t
                public final void onResult(Object obj) {
                    com.airbnb.lottie.a.a(str, atomicBoolean);
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, hVar2);
                if (hashMap.size() == 1) {
                    q(false);
                }
            }
        }
        return hVar2;
    }

    public static h<B5.g> d(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return c(str2, new Callable() { // from class: B5.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.airbnb.lottie.a.e(applicationContext, str, str2);
            }
        }, null);
    }

    public static w<B5.g> e(Context context, String str, String str2) {
        B5.g a11 = str2 == null ? null : H5.g.b().a(str2);
        if (a11 != null) {
            return new w<>(a11);
        }
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return g(context.getAssets().open(str), str2);
            }
            return o(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e11) {
            return new w<>((Throwable) e11);
        }
    }

    public static h<B5.g> f(final InputStream inputStream, final String str) {
        return c(str, new Callable() { // from class: B5.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.airbnb.lottie.a.g(inputStream, str);
            }
        }, new j(inputStream, 0));
    }

    public static w<B5.g> g(InputStream inputStream, String str) {
        return h(N5.c.k(z.d(z.k(inputStream))), str, true);
    }

    private static w<B5.g> h(N5.c cVar, String str, boolean z11) {
        B5.g a11;
        try {
            if (str == null) {
                a11 = null;
            } else {
                try {
                    a11 = H5.g.b().a(str);
                } catch (Exception e11) {
                    w<B5.g> wVar = new w<>(e11);
                    if (z11) {
                        O5.g.b(cVar);
                    }
                    return wVar;
                }
            }
            if (a11 != null) {
                w<B5.g> wVar2 = new w<>(a11);
                if (z11) {
                    O5.g.b(cVar);
                }
                return wVar2;
            }
            B5.g a12 = M5.w.a(cVar);
            if (str != null) {
                H5.g.b().c(str, a12);
            }
            w<B5.g> wVar3 = new w<>(a12);
            if (z11) {
                O5.g.b(cVar);
            }
            return wVar3;
        } catch (Throwable th2) {
            if (z11) {
                O5.g.b(cVar);
            }
            throw th2;
        }
    }

    public static h i(final String str) {
        return c(str, new Callable(str) { // from class: B5.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                throw null;
            }
        }, null);
    }

    public static h j(int i11, Context context) {
        return k(context, i11, r(i11, context));
    }

    public static h<B5.g> k(Context context, final int i11, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return c(str, new Callable() { // from class: B5.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return com.airbnb.lottie.a.m(context2, i11, str);
            }
        }, null);
    }

    public static w l(int i11, Context context) {
        return m(context, i11, r(i11, context));
    }

    public static w<B5.g> m(Context context, int i11, String str) {
        Boolean bool;
        B5.g a11 = str == null ? null : H5.g.b().a(str);
        if (a11 != null) {
            return new w<>(a11);
        }
        try {
            G d11 = z.d(z.k(context.getResources().openRawResource(i11)));
            try {
                try {
                    G peek = d11.peek();
                    byte[] bArr = f57298c;
                    int length = bArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            peek.close();
                            bool = Boolean.TRUE;
                            break;
                        }
                        if (peek.readByte() != bArr[i12]) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        i12++;
                    }
                } catch (NoSuchMethodError unused) {
                    bool = Boolean.FALSE;
                }
            } catch (Exception unused2) {
                O5.c.b();
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? o(context, new ZipInputStream(d11.a2()), str) : g(d11.a2(), str);
        } catch (Resources.NotFoundException e11) {
            return new w<>((Throwable) e11);
        }
    }

    public static h<B5.g> n(final Context context, final String str, final String str2) {
        return c(str2, new Callable() { // from class: B5.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                L5.e b11 = c.b(context2);
                String str3 = str;
                String str4 = str2;
                w<g> a11 = b11.a(context2, str3, str4);
                if (str4 != null && a11.b() != null) {
                    H5.g.b().c(str4, a11.b());
                }
                return a11;
            }
        }, null);
    }

    public static w<B5.g> o(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return p(context, zipInputStream, str);
        } finally {
            O5.g.b(zipInputStream);
        }
    }

    private static w<B5.g> p(Context context, ZipInputStream zipInputStream, String str) {
        B5.g a11;
        s sVar;
        FileOutputStream fileOutputStream;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a11 = null;
        } else {
            try {
                a11 = H5.g.b().a(str);
            } catch (IOException e11) {
                return new w<>((Throwable) e11);
            }
        }
        if (a11 != null) {
            return new w<>(a11);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        B5.g gVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                gVar = h(N5.c.k(z.d(z.k(zipInputStream))), null, false).b();
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th2) {
                        O5.c.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
                    }
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            O5.c.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        hashMap2.put(str3, createFromFile);
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
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
        if (gVar == null) {
            return new w<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) gVar.j()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    sVar = null;
                    break;
                }
                sVar = (s) it.next();
                if (sVar.b().equals(str4)) {
                    break;
                }
            }
            if (sVar != null) {
                sVar.f(O5.g.f(sVar.e(), sVar.c(), (Bitmap) entry.getValue()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z11 = false;
            for (H5.c cVar : ((HashMap) gVar.g()).values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z11 = true;
                }
            }
            if (!z11) {
                O5.c.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) gVar.j()).entrySet().iterator();
            while (it2.hasNext()) {
                s sVar2 = (s) ((Map.Entry) it2.next()).getValue();
                if (sVar2 == null) {
                    return null;
                }
                String b11 = sVar2.b();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (b11.startsWith("data:") && b11.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(b11.substring(b11.indexOf(44) + 1), 0);
                        sVar2.f(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                    } catch (IllegalArgumentException e12) {
                        O5.c.d("data URL did not have correct base64 format.", e12);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            H5.g.b().c(str, gVar);
        }
        return new w<>(gVar);
    }

    private static void q(boolean z11) {
        ArrayList arrayList = new ArrayList(f57297b);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((y) arrayList.get(i11)).a();
        }
    }

    private static String r(int i11, Context context) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb2.append(i11);
        return sb2.toString();
    }
}
