package com.google.android.gms.internal.measurement;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.InputEvent;
import android.widget.EdgeEffect;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.Buffer;
import okio.Segment;
import okio.Utf8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d5 {
    public static boolean A(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean B(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return k(bundle, key) && bundle.get(key) == null;
    }

    public static final g1.c C(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new g1.c(name);
    }

    public static float D(EdgeEffect edgeEffect, float f6, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.d.c(edgeEffect, f6, f10);
        }
        androidx.core.widget.c.a(edgeEffect, f6, f10);
        return f6;
    }

    public static com.google.firebase.messaging.w E(String str) {
        String str2;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                try {
                    uri.toURL();
                } catch (Exception unused) {
                    return new com.google.firebase.messaging.w(null, null, null);
                }
            }
            String str3 = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                str3 = uri.getRawPath();
            }
            return new com.google.firebase.messaging.w(str2 + o(rawAuthority) + str3, uri.getRawQuery(), uri.getRawFragment());
        } catch (Exception unused2) {
            return new com.google.firebase.messaging.w(null, null, null);
        }
    }

    public static String F(int i5, String str) {
        return str + "=" + i5;
    }

    public static String G(String str, String str2) {
        StringBuilder c2 = v.f.c(str, "=");
        try {
            str2 = URLEncoder.encode(str2, "UTF-8").replaceAll("\\+", "%20").replaceAll("%21", "!").replaceAll("%27", "'").replaceAll("%28", "(").replaceAll("%29", ")").replaceAll("%7E", "~");
        } catch (UnsupportedEncodingException unused) {
        }
        c2.append(str2);
        return c2.toString();
    }

    public static String H(String str, boolean z5) {
        StringBuilder c2 = v.f.c(str, "=");
        c2.append(z5 ? "t" : "f");
        return c2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(m4.s sVar, mf.c cVar) {
        n4.c cVar2;
        int i5;
        m4.s sVar2;
        Throwable th2;
        Buffer buffer;
        if (cVar instanceof n4.c) {
            cVar2 = (n4.c) cVar;
            int i10 = cVar2.f20858d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f20858d = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f20857c;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f20858d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    try {
                        Buffer buffer2 = new Buffer();
                        cVar2.f20855a = sVar;
                        cVar2.f20856b = buffer2;
                        cVar2.f20858d = 1;
                        sVar.f20425a.readAll(buffer2);
                        if (Unit.f19194a == aVar) {
                            return aVar;
                        }
                        sVar2 = sVar;
                        buffer = buffer2;
                    } catch (Throwable th3) {
                        sVar2 = sVar;
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    buffer = cVar2.f20856b;
                    sVar2 = cVar2.f20855a;
                    try {
                        h8.b.B(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            throw th2;
                        } catch (Throwable th5) {
                            u6.h.g(sVar2, th2);
                            throw th5;
                        }
                    }
                }
                u6.h.g(sVar2, null);
                return buffer;
            }
        }
        cVar2 = new n4.c(cVar);
        Object obj2 = cVar2.f20857c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f20858d;
        if (i5 != 0) {
        }
        u6.h.g(sVar2, null);
        return buffer;
    }

    public static final byte[] J(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(Segment.SIZE, inputStream.available()));
        m(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final p1.o K(float f6, p1.b rounding, List list) {
        Intrinsics.checkNotNullParameter(p1.o.f21438e, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float f10 = 2;
        float f11 = f6 / f10;
        float f12 = 0.0f - f11;
        float f13 = 1.0f / f10;
        float f14 = 0.0f - f13;
        float f15 = f11 + 0.0f;
        float f16 = f13 + 0.0f;
        return y3.b(new float[]{f15, f16, f12, f16, f12, f14, f15, f14}, rounding, list, 0.0f, 0.0f);
    }

    public static final p1.o T(int i5, float f6, p1.b rounding) {
        m8.a aVar = p1.o.f21438e;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f6 >= 1.0f) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        float[] fArr = new float[i5 * 4];
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            float f10 = p1.p.f21444b / i5;
            long e7 = p1.p.e(1.0f, 2 * f10 * i11);
            fArr[i10] = ci.c.y(e7) + 0.0f;
            fArr[i10 + 1] = ci.c.z(e7) + 0.0f;
            long e9 = p1.p.e(f6, f10 * ((i11 * 2) + 1));
            int i12 = i10 + 3;
            fArr[i10 + 2] = ci.c.y(e9) + 0.0f;
            i10 += 4;
            fArr[i12] = ci.c.z(e9) + 0.0f;
        }
        return y3.b(fArr, rounding, null, 0.0f, 0.0f);
    }

    public static final g1.c W(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new g1.c(name);
    }

    public static Task X(Task... taskArr) {
        w7.m mVar;
        if (taskArr.length == 0) {
            return q(Collections.EMPTY_LIST);
        }
        List<Task> asList = Arrays.asList(taskArr);
        e5.p pVar = w7.h.f24980a;
        if (asList == null || asList.isEmpty()) {
            return q(Collections.EMPTY_LIST);
        }
        if (asList.isEmpty()) {
            mVar = q(null);
        } else {
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                if (((Task) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            mVar = new w7.m();
            w7.i iVar = new w7.i(asList.size(), mVar);
            for (Task task : asList) {
                g6.p pVar2 = w7.h.f24981b;
                task.e(pVar2, iVar);
                task.c(pVar2, iVar);
                task.a(pVar2, iVar);
            }
        }
        return mVar.h(pVar, new gh.p(1, asList));
    }

    public static final Exception Y(String str, FileNotFoundException exception) {
        int i5;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(exception, "<this>");
        boolean z5 = true;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
                try {
                    Parcel obtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                    Process.myUserHandle().writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    i5 = obtain.readInt();
                } catch (Throwable unused) {
                    Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                    i5 = 0;
                }
                Object invoke = method.invoke(null, "sys.user." + i5 + ".ce_available", "false");
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
                z5 = Intrinsics.areEqual((String) invoke, "true");
            } catch (Throwable th2) {
                gf.d.a(exception, th2);
                z5 = false;
            }
        }
        if (z5 || str == null) {
            return exception;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return exception;
        } catch (IOException unused2) {
            return new c1.k0(exception);
        } finally {
            file.delete();
        }
    }

    public static Object a(Task task) {
        g6.v.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        g6.v.i(task, "Task must not be null");
        if (task.k()) {
            return b0(task);
        }
        b6.h hVar = new b6.h(2);
        Executor executor = w7.h.f24981b;
        task.e(executor, hVar);
        task.c(executor, hVar);
        task.a(executor, hVar);
        hVar.f3051b.await();
        return b0(task);
    }

    public static int a0(byte[] bArr, int i5, t4 t4Var) {
        int i10 = i5 + 1;
        byte b10 = bArr[i5];
        if (b10 < 0) {
            return c0(b10, bArr, i10, t4Var);
        }
        t4Var.f5245a = b10;
        return i10;
    }

    public static Object b(Task task, long j, TimeUnit timeUnit) {
        g6.v.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        g6.v.i(task, "Task must not be null");
        g6.v.i(timeUnit, "TimeUnit must not be null");
        if (task.k()) {
            return b0(task);
        }
        b6.h hVar = new b6.h(2);
        Executor executor = w7.h.f24981b;
        task.e(executor, hVar);
        task.c(executor, hVar);
        task.a(executor, hVar);
        if (hVar.f3051b.await(j, timeUnit)) {
            return b0(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Object b0(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static String c(int i5, int i10, String str) {
        if (i5 < 0) {
            return com.google.android.play.core.appupdate.b.w("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return com.google.android.play.core.appupdate.b.w("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int c0(int i5, byte[] bArr, int i10, t4 t4Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i5 & 127;
        if (b10 >= 0) {
            t4Var.f5245a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            t4Var.f5245a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            t4Var.f5245a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            t4Var.f5245a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                t4Var.f5245a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static w7.m d(Executor executor, Callable callable) {
        g6.v.i(executor, "Executor must not be null");
        w7.m mVar = new w7.m();
        executor.execute(new s7.w0(20, mVar, callable, false));
        return mVar;
    }

    public static z4 d0() {
        String str;
        ClassLoader classLoader = d5.class.getClassLoader();
        if (z4.class.equals(z4.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!z4.class.getPackage().equals(d5.class.getPackage())) {
                throw new IllegalArgumentException(z4.class.getName());
            }
            str = z4.class.getPackage().getName() + ".BlazeGenerated" + z4.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    androidx.appcompat.widget.c1.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(e9);
                }
            } catch (InstantiationException e10) {
                throw new IllegalStateException(e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new d5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e12) {
                        Logger.getLogger(x4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(z4.class.getSimpleName()), (Throwable) e12);
                    }
                }
                if (arrayList.size() == 1) {
                    return (z4) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (z4) z4.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(e13);
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException(e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(e15);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static int e0(byte[] bArr, int i5, t4 t4Var) {
        long j = bArr[i5];
        int i10 = i5 + 1;
        if (j >= 0) {
            t4Var.f5246b = j;
            return i10;
        }
        int i11 = i5 + 2;
        byte b10 = bArr[i10];
        long j6 = (j & 127) | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j6 |= (r10 & ByteCompanionObject.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        t4Var.f5246b = j6;
        return i11;
    }

    public static void f(int i5, int i10) {
        String w10;
        if (i5 < 0 || i5 >= i10) {
            if (i5 < 0) {
                w10 = com.google.android.play.core.appupdate.b.w("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("negative size: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                w10 = com.google.android.play.core.appupdate.b.w("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(w10);
        }
    }

    public static int f0(int i5, byte[] bArr) {
        int i10 = bArr[i5] & 255;
        int i11 = bArr[i5 + 1] & 255;
        int i12 = bArr[i5 + 2] & 255;
        return ((bArr[i5 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static void g(int i5, int i10) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(c(i5, i10, "index"));
        }
    }

    public static long g0(int i5, byte[] bArr) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    public static void h(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? c(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? c(i10, i11, "end index") : com.google.android.play.core.appupdate.b.w("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static int h0(byte[] bArr, int i5, t4 t4Var) {
        int a02 = a0(bArr, i5, t4Var);
        int i10 = t4Var.f5245a;
        if (i10 < 0) {
            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            t4Var.f5247c = "";
            return a02;
        }
        int i11 = s6.f5237a;
        int length = bArr.length;
        if ((((length - a02) - i10) | a02 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(a02), Integer.valueOf(i10)));
        }
        int i12 = a02 + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (a02 < i12) {
            byte b10 = bArr[a02];
            if (b10 < 0) {
                break;
            }
            a02++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (a02 < i12) {
            int i14 = a02 + 1;
            byte b11 = bArr[a02];
            if (b11 >= 0) {
                cArr[i13] = (char) b11;
                i13++;
                a02 = i14;
                while (a02 < i12) {
                    byte b12 = bArr[a02];
                    if (b12 >= 0) {
                        a02++;
                        cArr[i13] = (char) b12;
                        i13++;
                    }
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                int i15 = i13 + 1;
                a02 += 2;
                byte b13 = bArr[i14];
                if (b11 < -62 || io.sentry.config.a.F(b13)) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                cArr[i13] = (char) ((b13 & Utf8.REPLACEMENT_BYTE) | ((b11 & 31) << 6));
                i13 = i15;
            } else {
                if (b11 < -16) {
                    if (i14 >= i12 - 1) {
                        throw new p5("Protocol message had invalid UTF-8.");
                    }
                    int i16 = i13 + 1;
                    int i17 = a02 + 2;
                    byte b14 = bArr[i14];
                    a02 += 3;
                    byte b15 = bArr[i17];
                    if (!io.sentry.config.a.F(b14)) {
                        if (b11 == -32) {
                            if (b14 >= -96) {
                                b11 = -32;
                            }
                        }
                        if (b11 == -19) {
                            if (b14 < -96) {
                                b11 = -19;
                            }
                        }
                        if (!io.sentry.config.a.F(b15)) {
                            cArr[i13] = (char) (((b14 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b15 & Utf8.REPLACEMENT_BYTE));
                            i13 = i16;
                        }
                    }
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                if (i14 >= i12 - 2) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                byte b16 = bArr[i14];
                int i18 = a02 + 3;
                byte b17 = bArr[a02 + 2];
                a02 += 4;
                byte b18 = bArr[i18];
                if (io.sentry.config.a.F(b16) || (((b16 + 112) + (b11 << 28)) >> 30) != 0 || io.sentry.config.a.F(b17) || io.sentry.config.a.F(b18)) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                int i19 = ((b16 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & 7) << 18) | ((b17 & Utf8.REPLACEMENT_BYTE) << 6) | (b18 & Utf8.REPLACEMENT_BYTE);
                cArr[i13] = (char) ((i19 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i13 + 1] = (char) ((i19 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                i13 += 2;
            }
        }
        t4Var.f5247c = new String(cArr, 0, i13);
        return i12;
    }

    public static p1.o i(int i5) {
        int i10 = (i5 & 1) != 0 ? 8 : 10;
        Intrinsics.checkNotNullParameter(p1.o.f21438e, "<this>");
        return y3.a(i10, 1.0f / ((float) Math.cos(p1.p.f21444b / i10)), new p1.b(2), null);
    }

    public static int i0(byte[] bArr, int i5, t4 t4Var) {
        int a02 = a0(bArr, i5, t4Var);
        int i10 = t4Var.f5245a;
        if (i10 < 0) {
            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - a02) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            t4Var.f5247c = w4.f5334c;
            return a02;
        }
        t4Var.f5247c = w4.d(bArr, a02, i10);
        return a02 + i10;
    }

    public static ClassLoader j(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static int j0(Object obj, h6 h6Var, byte[] bArr, int i5, int i10, t4 t4Var) {
        int i11 = i5 + 1;
        int i12 = bArr[i5];
        if (i12 < 0) {
            i11 = c0(i12, bArr, i11, t4Var);
            i12 = t4Var.f5245a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = t4Var.f5248d + 1;
        t4Var.f5248d = i14;
        if (i14 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        h6Var.h(obj, bArr, i13, i15, t4Var);
        t4Var.f5248d--;
        t4Var.f5247c = obj;
        return i15;
    }

    public static final boolean k(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    public static int k0(Object obj, h6 h6Var, byte[] bArr, int i5, int i10, int i11, t4 t4Var) {
        a6 a6Var = (a6) h6Var;
        int i12 = t4Var.f5248d + 1;
        t4Var.f5248d = i12;
        if (i12 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int t3 = a6Var.t(obj, bArr, i5, i10, i11, t4Var);
        t4Var.f5248d--;
        t4Var.f5247c = obj;
        return t3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (y4.a.k(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap l(Drawable drawable, Bitmap.Config config, r4.i iVar, r4.g gVar, boolean z5) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || s6.a.o(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z5) {
                    long j = y4.a.j(bitmap.getWidth(), bitmap.getHeight(), iVar, gVar, r4.i.f22306c);
                }
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int b10 = v4.r.b(mutate);
        if (b10 <= 0) {
            b10 = 512;
        }
        int a7 = v4.r.a(mutate);
        int i5 = a7 > 0 ? a7 : 512;
        long j6 = y4.a.j(b10, i5, iVar, gVar, r4.i.f22306c);
        double k6 = y4.a.k(b10, i5, (int) (j6 >> 32), (int) (4294967295L & j6), gVar);
        int a10 = wf.b.a(b10 * k6);
        int a11 = wf.b.a(k6 * i5);
        if (config == null || s6.a.o(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a10, a11, config);
        Rect bounds = mutate.getBounds();
        int i10 = bounds.left;
        int i11 = bounds.top;
        int i12 = bounds.right;
        int i13 = bounds.bottom;
        mutate.setBounds(0, 0, a10, a11);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i10, i11, i12, i13);
        return createBitmap;
    }

    public static int l0(int i5, byte[] bArr, int i10, int i11, m5 m5Var, t4 t4Var) {
        h5 h5Var = (h5) m5Var;
        int a02 = a0(bArr, i10, t4Var);
        h5Var.d(t4Var.f5245a);
        while (a02 < i11) {
            int a03 = a0(bArr, a02, t4Var);
            if (i5 != t4Var.f5245a) {
                break;
            }
            a02 = a0(bArr, a03, t4Var);
            h5Var.d(t4Var.f5245a);
        }
        return a02;
    }

    public static final long m(InputStream inputStream, OutputStream out) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[Segment.SIZE];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static int m0(byte[] bArr, int i5, m5 m5Var, t4 t4Var) {
        h5 h5Var = (h5) m5Var;
        int a02 = a0(bArr, i5, t4Var);
        int i10 = t4Var.f5245a + a02;
        while (a02 < i10) {
            a02 = a0(bArr, a02, t4Var);
            h5Var.d(t4Var.f5245a);
        }
        if (a02 == i10) {
            return a02;
        }
        throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int n0(h6 h6Var, int i5, byte[] bArr, int i10, int i11, m5 m5Var, t4 t4Var) {
        g5 a7 = h6Var.a();
        h6 h6Var2 = h6Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        t4 t4Var2 = t4Var;
        int j0 = j0(a7, h6Var2, bArr2, i10, i12, t4Var2);
        h6Var2.g(a7);
        t4Var2.f5247c = a7;
        m5Var.add(a7);
        while (j0 < i12) {
            t4 t4Var3 = t4Var2;
            int i13 = i12;
            int a02 = a0(bArr2, j0, t4Var3);
            if (i5 != t4Var3.f5245a) {
                break;
            }
            byte[] bArr3 = bArr2;
            h6 h6Var3 = h6Var2;
            g5 a10 = h6Var3.a();
            j0 = j0(a10, h6Var3, bArr3, a02, i13, t4Var3);
            h6Var2 = h6Var3;
            bArr2 = bArr3;
            i12 = i13;
            t4Var2 = t4Var3;
            h6Var2.g(a10);
            t4Var2.f5247c = a10;
            m5Var.add(a10);
        }
        return j0;
    }

    public static String o(String str) {
        if (!str.contains("@")) {
            return str;
        }
        if (str.startsWith("@")) {
            return "[Filtered]".concat(str);
        }
        StringBuilder b10 = v.f.b(str.substring(0, str.indexOf(64)).contains(StringUtils.PROCESS_POSTFIX_DELIMITER) ? "[Filtered]:[Filtered]" : "[Filtered]");
        b10.append(str.substring(str.indexOf(64)));
        return b10.toString();
    }

    public static int o0(int i5, byte[] bArr, int i10, int i11, l6 l6Var, t4 t4Var) {
        if ((i5 >>> 3) == 0) {
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int e0 = e0(bArr, i10, t4Var);
            l6Var.d(i5, Long.valueOf(t4Var.f5246b));
            return e0;
        }
        if (i12 == 1) {
            l6Var.d(i5, Long.valueOf(g0(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int a02 = a0(bArr, i10, t4Var);
            int i13 = t4Var.f5245a;
            if (i13 < 0) {
                throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - a02) {
                throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                l6Var.d(i5, w4.f5334c);
            } else {
                l6Var.d(i5, w4.d(bArr, a02, i13));
            }
            return a02 + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new p5("Protocol message contained an invalid tag (zero).");
            }
            l6Var.d(i5, Integer.valueOf(f0(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i5 & (-8)) | 4;
        l6 a7 = l6.a();
        int i15 = t4Var.f5248d + 1;
        t4Var.f5248d = i15;
        if (i15 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int a03 = a0(bArr, i10, t4Var);
            int i17 = t4Var.f5245a;
            if (i17 == i14) {
                i16 = i17;
                i10 = a03;
                break;
            }
            i10 = o0(i17, bArr, a03, i11, a7, t4Var);
            i16 = i17;
        }
        t4Var.f5248d--;
        if (i10 > i11 || i16 != i14) {
            throw new p5("Failed to parse the message.");
        }
        l6Var.d(i5, a7);
        return i10;
    }

    public static w7.m p(Exception exc) {
        w7.m mVar = new w7.m();
        mVar.n(exc);
        return mVar;
    }

    public static int p0(int i5, byte[] bArr, int i10, int i11, t4 t4Var) {
        if ((i5 >>> 3) == 0) {
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            return e0(bArr, i10, t4Var);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return a0(bArr, i10, t4Var) + t4Var.f5245a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i5 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = a0(bArr, i10, t4Var);
            i14 = t4Var.f5245a;
            if (i14 == i13) {
                break;
            }
            i10 = p0(i14, bArr, i10, i11, t4Var);
        }
        if (i10 > i11 || i14 != i13) {
            throw new p5("Failed to parse the message.");
        }
        return i10;
    }

    public static w7.m q(Object obj) {
        w7.m mVar = new w7.m();
        mVar.m(obj);
        return mVar;
    }

    public static final String r(ag.c cVar) {
        if (cVar != null) {
            return cVar.getQualifiedName();
        }
        return null;
    }

    public static float s(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int u(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i5 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i5 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i5;
        }
        com.google.android.play.core.appupdate.b.v(key);
        throw null;
    }

    public static String w(Class navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        LinkedHashMap linkedHashMap = y1.u0.f25638b;
        String str = (String) linkedHashMap.get(navigatorClass);
        if (str == null) {
            y1.s0 s0Var = (y1.s0) navigatorClass.getAnnotation(y1.s0.class);
            str = s0Var != null ? s0Var.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
            }
            linkedHashMap.put(navigatorClass, str);
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public static final Bundle x(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        com.google.android.play.core.appupdate.b.v(key);
        throw null;
    }

    public static final ArrayList y(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ag.c parcelableClass = Reflection.getOrCreateKotlinClass(Bundle.class);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        ArrayList e7 = Build.VERSION.SDK_INT >= 34 ? h.b.e(bundle, key, u6.h.k(parcelableClass)) : bundle.getParcelableArrayList(key);
        if (e7 != null) {
            return e7;
        }
        com.google.android.play.core.appupdate.b.v(key);
        throw null;
    }

    public abstract Object L(Uri uri, InputEvent inputEvent, Continuation continuation);

    public abstract Object M(h2.d dVar, Continuation continuation);

    public abstract Object N(Uri uri, Continuation continuation);

    public abstract Object O(h2.e eVar, Continuation continuation);

    public abstract Object P(h2.f fVar, Continuation continuation);

    public abstract void R(boolean z5);

    public abstract void S(boolean z5);

    public abstract void U();

    public abstract void V();

    public abstract TransformationMethod Z(TransformationMethod transformationMethod);

    public boolean e() {
        return false;
    }

    public abstract Object n(h2.a aVar, Continuation continuation);

    public abstract InputFilter[] t(InputFilter[] inputFilterArr);

    public abstract Object v(Continuation continuation);

    public abstract boolean z();

    public void Q() {
    }
}
