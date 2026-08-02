package defpackage;

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
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ulb {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static qmb a(final String str, Callable callable, Runnable runnable) {
        plb a2 = str == null ? null : qlb.b.a(str);
        qmb qmbVar = a2 != null ? new qmb(a2) : null;
        HashMap hashMap = a;
        if (str != null && hashMap.containsKey(str)) {
            qmbVar = (qmb) hashMap.get(str);
        }
        if (qmbVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return qmbVar;
        }
        final int i = 0;
        qmb qmbVar2 = new qmb(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qmbVar2.b(new mmb() { // from class: slb
                @Override // defpackage.mmb
                public final void onResult(Object obj) {
                    int i2 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i2) {
                        case 0:
                            HashMap hashMap2 = ulb.a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                ulb.k();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = ulb.a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                ulb.k();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            qmbVar2.a(new mmb() { // from class: slb
                @Override // defpackage.mmb
                public final void onResult(Object obj) {
                    int i22 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i22) {
                        case 0:
                            HashMap hashMap2 = ulb.a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                ulb.k();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = ulb.a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                ulb.k();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, qmbVar2);
                if (hashMap.size() == 1) {
                    k();
                }
            }
        }
        return qmbVar2;
    }

    public static omb b(Context context, String str, String str2) {
        plb a2 = str2 == null ? null : qlb.b.a(str2);
        if (a2 != null) {
            return new omb(a2);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new omb(e);
        }
    }

    public static omb c(Context context, InputStream inputStream, String str) {
        plb a2 = str == null ? null : qlb.b.a(str);
        if (a2 != null) {
            return new omb(a2);
        }
        try {
            lof lofVar = new lof(f6a.I(inputStream));
            int i = 4;
            if (j(lofVar, c).booleanValue()) {
                return h(context, new ZipInputStream(new oy1(lofVar, i)), str);
            }
            if (j(lofVar, d).booleanValue()) {
                return e(f6a.I(new GZIPInputStream(new oy1(lofVar, i))), str);
            }
            String[] strArr = wga.e;
            return d(new lha(lofVar), str, true);
        } catch (IOException e) {
            return new omb(e);
        }
    }

    public static omb d(lha lhaVar, String str, boolean z) {
        plb a2;
        try {
            if (str == null) {
                a2 = null;
            } else {
                try {
                    a2 = qlb.b.a(str);
                } catch (Exception e) {
                    omb ombVar = new omb(e);
                    if (z) {
                        vik.b(lhaVar);
                    }
                    return ombVar;
                }
            }
            if (a2 != null) {
                omb ombVar2 = new omb(a2);
                if (z) {
                    vik.b(lhaVar);
                }
                return ombVar2;
            }
            plb a3 = vlb.a(lhaVar);
            if (str != null) {
                qlb.b.a.d(str, a3);
            }
            omb ombVar3 = new omb(a3);
            if (z) {
                vik.b(lhaVar);
            }
            return ombVar3;
        } catch (Throwable th) {
            if (z) {
                vik.b(lhaVar);
            }
            throw th;
        }
    }

    public static omb e(xk0 xk0Var, String str) {
        lof lofVar = new lof(xk0Var);
        String[] strArr = wga.e;
        return d(new lha(lofVar), str, true);
    }

    public static qmb f(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: tlb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return ulb.g(context2, i, str);
            }
        }, null);
    }

    public static omb g(Context context, int i, String str) {
        plb a2 = str == null ? null : qlb.b.a(str);
        if (a2 != null) {
            return new omb(a2);
        }
        try {
            lof lofVar = new lof(f6a.I(context.getResources().openRawResource(i)));
            int i2 = 4;
            if (j(lofVar, c).booleanValue()) {
                return h(context, new ZipInputStream(new oy1(lofVar, i2)), str);
            }
            if (!j(lofVar, d).booleanValue()) {
                String[] strArr = wga.e;
                return d(new lha(lofVar), str, true);
            }
            try {
                return e(f6a.I(new GZIPInputStream(new oy1(lofVar, i2))), str);
            } catch (IOException e) {
                return new omb(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new omb(e2);
        }
    }

    public static omb h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            vik.b(zipInputStream);
        }
    }

    public static omb i(Context context, ZipInputStream zipInputStream, String str) {
        plb a2;
        lmb lmbVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = qlb.b.a(str);
            } catch (IOException e) {
                return new omb(e);
            }
        }
        if (a2 != null) {
            return new omb(a2);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        plb plbVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                lof lofVar = new lof(f6a.I(zipInputStream));
                String[] strArr = wga.e;
                plbVar = d(new lha(lofVar), null, false).a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new omb(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
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
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable unused) {
                        ajb.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ");
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        ajb.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (plbVar == null) {
            return new omb(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) plbVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    lmbVar = null;
                    break;
                }
                lmbVar = (lmb) it.next();
                if (lmbVar.d.equals(str4)) {
                    break;
                }
            }
            if (lmbVar != null) {
                lmbVar.f = vik.d((Bitmap) entry.getValue(), lmbVar.a, lmbVar.b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z = false;
            for (of8 of8Var : plbVar.f.values()) {
                if (of8Var.a.equals(entry2.getKey())) {
                    of8Var.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                ajb.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) plbVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                lmb lmbVar2 = (lmb) ((Map.Entry) it2.next()).getValue();
                if (lmbVar2 == null) {
                    return null;
                }
                String str5 = lmbVar2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            lmbVar2.f = vik.d(decodeByteArray, lmbVar2.a, lmbVar2.b);
                        }
                    } catch (IllegalArgumentException unused2) {
                        ajb.c("data URL did not have correct base64 format.");
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            qlb.b.a.d(str, plbVar);
        }
        return new omb(plbVar);
    }

    public static Boolean j(lof lofVar, byte[] bArr) {
        try {
            lof h = lofVar.h();
            for (byte b2 : bArr) {
                if (h.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            h.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            ajb.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void k() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        pvd.j();
    }

    public static String l(int i, Context context) {
        return me4.g(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
