package com.airbnb.lottie.network;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.AbstractC2963t;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.T;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final g f28994a;

    /* renamed from: b, reason: collision with root package name */
    public final f f28995b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$network$FileExtension;

        static {
            int[] iArr = new int[c.values().length];
            $SwitchMap$com$airbnb$lottie$network$FileExtension = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$network$FileExtension[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, f fVar) {
        this.f28994a = gVar;
        this.f28995b = fVar;
    }

    public final C2940j a(Context context, String str, String str2) {
        g gVar;
        Pair a10;
        T F10;
        if (str2 == null || (gVar = this.f28994a) == null || (a10 = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) a10.first;
        InputStream inputStream = (InputStream) a10.second;
        int i10 = a.$SwitchMap$com$airbnb$lottie$network$FileExtension[cVar.ordinal()];
        if (i10 == 1) {
            F10 = AbstractC2963t.F(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            F10 = AbstractC2963t.r(inputStream, str2);
        } else {
            try {
                F10 = AbstractC2963t.r(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                F10 = new T((Throwable) e10);
            }
        }
        if (F10.b() != null) {
            return (C2940j) F10.b();
        }
        return null;
    }

    public final T b(Context context, String str, String str2) {
        T t10;
        com.airbnb.lottie.utils.g.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d a10 = this.f28995b.a(str);
                if (a10.isSuccessful()) {
                    t10 = e(context, str, a10.o0(), a10.g0(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(t10.b() != null);
                    com.airbnb.lottie.utils.g.a(sb2.toString());
                } else {
                    t10 = new T((Throwable) new IllegalArgumentException(a10.o1()));
                }
                try {
                    a10.close();
                    return t10;
                } catch (IOException e10) {
                    com.airbnb.lottie.utils.g.d("LottieFetchResult close failed ", e10);
                    return t10;
                }
            } catch (Exception e11) {
                T t11 = new T((Throwable) e11);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e12) {
                        com.airbnb.lottie.utils.g.d("LottieFetchResult close failed ", e12);
                    }
                }
                return t11;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e13) {
                com.airbnb.lottie.utils.g.d("LottieFetchResult close failed ", e13);
                throw th2;
            }
        }
    }

    public T c(Context context, String str, String str2) {
        C2940j a10 = a(context, str, str2);
        if (a10 != null) {
            return new T(a10);
        }
        com.airbnb.lottie.utils.g.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }

    public final T d(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28994a) == null) ? AbstractC2963t.r(new GZIPInputStream(inputStream), null) : AbstractC2963t.r(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    public final T e(Context context, String str, InputStream inputStream, String str2, String str3) {
        T g10;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.g.a("Handling zip response.");
            c cVar2 = c.ZIP;
            g10 = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            com.airbnb.lottie.utils.g.a("Handling gzip response.");
            cVar = c.GZIP;
            g10 = d(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.g.a("Received json response.");
            cVar = c.JSON;
            g10 = f(str, inputStream, str3);
        }
        if (str3 != null && g10.b() != null && (gVar = this.f28994a) != null) {
            gVar.f(str, cVar);
        }
        return g10;
    }

    public final T f(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28994a) == null) ? AbstractC2963t.r(inputStream, null) : AbstractC2963t.r(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    public final T g(Context context, String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28994a) == null) ? AbstractC2963t.F(context, new ZipInputStream(inputStream), null) : AbstractC2963t.F(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }
}
