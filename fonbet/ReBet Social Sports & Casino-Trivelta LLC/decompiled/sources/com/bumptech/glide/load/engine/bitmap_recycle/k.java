package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class k implements d {

    /* renamed from: k, reason: collision with root package name */
    public static final Bitmap.Config f29720k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final l f29721a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f29722b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29723c;

    /* renamed from: d, reason: collision with root package name */
    public final a f29724d;

    /* renamed from: e, reason: collision with root package name */
    public long f29725e;

    /* renamed from: f, reason: collision with root package name */
    public long f29726f;

    /* renamed from: g, reason: collision with root package name */
    public int f29727g;

    /* renamed from: h, reason: collision with root package name */
    public int f29728h;

    /* renamed from: i, reason: collision with root package name */
    public int f29729i;

    /* renamed from: j, reason: collision with root package name */
    public int f29730j;

    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static final class b implements a {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
        }
    }

    public k(long j10, l lVar, Set set) {
        this.f29723c = j10;
        this.f29725e = j10;
        this.f29721a = lVar;
        this.f29722b = set;
        this.f29724d = new b();
    }

    public static void f(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    public static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f29720k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public static Set k() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static l l() {
        return new o();
    }

    public static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void a(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void b() {
        Log.isLoggable("LruBitmapPool", 3);
        q(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f29721a.e(bitmap) <= this.f29725e && this.f29722b.contains(bitmap.getConfig())) {
                int e10 = this.f29721a.e(bitmap);
                this.f29721a.c(bitmap);
                this.f29724d.b(bitmap);
                this.f29729i++;
                this.f29726f += e10;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f29721a.a(bitmap);
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f29721a.a(bitmap);
                bitmap.isMutable();
                this.f29722b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 == null) {
            return g(i10, i11, config);
        }
        m10.eraseColor(0);
        return m10;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        return m10 == null ? g(i10, i11, config) : m10;
    }

    public final void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    public final void i() {
        Objects.toString(this.f29721a);
    }

    public final void j() {
        q(this.f29725e);
    }

    public final synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap d10;
        try {
            f(config);
            d10 = this.f29721a.d(i10, i11, config != null ? config : f29720k);
            if (d10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f29721a.b(i10, i11, config);
                }
                this.f29728h++;
            } else {
                this.f29727g++;
                this.f29726f -= this.f29721a.e(d10);
                this.f29724d.a(d10);
                p(d10);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f29721a.b(i10, i11, config);
            }
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return d10;
    }

    public long n() {
        return this.f29725e;
    }

    public final synchronized void q(long j10) {
        while (this.f29726f > j10) {
            try {
                Bitmap removeLast = this.f29721a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f29726f = 0L;
                    return;
                }
                this.f29724d.a(removeLast);
                this.f29726f -= this.f29721a.e(removeLast);
                this.f29730j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f29721a.a(removeLast);
                }
                h();
                removeLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k(long j10) {
        this(j10, l(), k());
    }
}
