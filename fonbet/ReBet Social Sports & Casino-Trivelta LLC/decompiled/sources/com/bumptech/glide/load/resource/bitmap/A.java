package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f29971e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f29972f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f29973g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile A f29974h;

    /* renamed from: b, reason: collision with root package name */
    public int f29976b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29977c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f29978d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f29975a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f29971e = i10 < 29;
        f29972f = i10 >= 28;
        f29973g = new File("/proc/self/fd");
    }

    public static A b() {
        if (f29974h == null) {
            synchronized (A.class) {
                try {
                    if (f29974h == null) {
                        f29974h = new A();
                    }
                } finally {
                }
            }
        }
        return f29974h;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return f29971e && !this.f29978d.get();
    }

    public final int c() {
        return e() ? FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION : this.f29975a;
    }

    public final synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f29976b + 1;
            this.f29976b = i10;
            if (i10 >= 50) {
                this.f29976b = 0;
                int length = f29973g.list().length;
                long c10 = c();
                if (length >= c10) {
                    z10 = false;
                }
                this.f29977c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f29977c;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f29972f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z11) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    public boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        Bitmap.Config config;
        boolean f10 = f(i10, i11, z10, z11);
        if (f10) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return f10;
    }

    public void h() {
        com.bumptech.glide.util.l.b();
        this.f29978d.set(true);
    }
}
