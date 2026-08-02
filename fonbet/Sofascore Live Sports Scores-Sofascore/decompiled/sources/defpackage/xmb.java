package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xmb implements dx1 {
    public static final Bitmap.Config e = Bitmap.Config.ARGB_8888;
    public final yjh a;
    public final Set b;
    public final long c;
    public long d;

    public xmb(long j) {
        yjh yjhVar = new yjh();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.c = j;
        this.a = yjhVar;
        this.b = unmodifiableSet;
    }

    public final synchronized Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            b = this.a.b(i, i2, config != null ? config : e);
            if (b != null) {
                this.d -= kik.r(b);
                b.setHasAlpha(true);
                b.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                yjh.c(kik.s(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                yjh.c(kik.s(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @Override // defpackage.dx1
    public final void b(int i) {
        if (i >= 40 || i >= 20) {
            p();
        } else if (i >= 20 || i == 15) {
            c(this.c / 2);
        }
    }

    public final synchronized void c(long j) {
        while (this.d > j) {
            yjh yjhVar = this.a;
            Bitmap bitmap = (Bitmap) yjhVar.b.I();
            if (bitmap != null) {
                yjhVar.a(Integer.valueOf(kik.r(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.a);
                }
                this.d = 0L;
                return;
            } else {
                this.d -= kik.r(bitmap);
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    yjh.c(kik.r(bitmap), bitmap.getConfig());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.a);
                }
                bitmap.recycle();
            }
        }
    }

    @Override // defpackage.dx1
    public final Bitmap f(int i, int i2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap a = a(i, i2, config);
        if (a != null) {
            a.eraseColor(0);
            return a;
        }
        if (config == null) {
            config = e;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.dx1
    public final Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap a = a(i, i2, config);
        if (a != null) {
            return a;
        }
        if (config == null) {
            config = e;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.dx1
    public final synchronized void i(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
        if (bitmap.isMutable() && kik.r(bitmap) <= this.c && this.b.contains(bitmap.getConfig())) {
            int r = kik.r(bitmap);
            this.a.e(bitmap);
            this.d += r;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                yjh.c(kik.r(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
            c(this.c);
            return;
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            yjh.c(kik.r(bitmap), bitmap.getConfig());
            bitmap.isMutable();
            this.b.contains(bitmap.getConfig());
        }
        bitmap.recycle();
    }

    @Override // defpackage.dx1
    public final void p() {
        c(0L);
    }
}
