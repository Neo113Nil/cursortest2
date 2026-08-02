package I6;

import D6.p;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public static a f5481h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f5482i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b, reason: collision with root package name */
    public volatile File f5484b;

    /* renamed from: d, reason: collision with root package name */
    public volatile File f5486d;

    /* renamed from: e, reason: collision with root package name */
    public long f5487e;

    /* renamed from: a, reason: collision with root package name */
    public volatile StatFs f5483a = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile StatFs f5485c = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f5489g = false;

    /* renamed from: f, reason: collision with root package name */
    public final Lock f5488f = new ReentrantLock();

    /* renamed from: I6.a$a, reason: collision with other inner class name */
    public enum EnumC0119a {
        INTERNAL,
        EXTERNAL
    }

    public static StatFs a(String str) {
        return new StatFs(str);
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f5481h == null) {
                    f5481h = new a();
                }
                aVar = f5481h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final void b() {
        if (this.f5489g) {
            return;
        }
        this.f5488f.lock();
        try {
            if (!this.f5489g) {
                this.f5484b = Environment.getDataDirectory();
                this.f5486d = Environment.getExternalStorageDirectory();
                g();
                this.f5489g = true;
            }
        } finally {
            this.f5488f.unlock();
        }
    }

    public long c(EnumC0119a enumC0119a) {
        b();
        e();
        StatFs statFs = enumC0119a == EnumC0119a.INTERNAL ? this.f5483a : this.f5485c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public final void e() {
        if (this.f5488f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f5487e > f5482i) {
                    g();
                }
            } finally {
                this.f5488f.unlock();
            }
        }
    }

    public boolean f(EnumC0119a enumC0119a, long j10) {
        b();
        long c10 = c(enumC0119a);
        return c10 <= 0 || c10 < j10;
    }

    public final void g() {
        this.f5483a = h(this.f5483a, this.f5484b);
        this.f5485c = h(this.f5485c, this.f5486d);
        this.f5487e = SystemClock.uptimeMillis();
    }

    public final StatFs h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th2) {
                throw p.a(th2);
            }
        }
        return null;
    }
}
