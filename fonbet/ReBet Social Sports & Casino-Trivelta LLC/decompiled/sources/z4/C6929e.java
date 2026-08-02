package z4;

import android.util.Log;
import com.bumptech.glide.disklrucache.b;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import z4.InterfaceC6925a;

/* renamed from: z4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6929e implements InterfaceC6925a {

    /* renamed from: b, reason: collision with root package name */
    public final File f68571b;

    /* renamed from: c, reason: collision with root package name */
    public final long f68572c;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.disklrucache.b f68574e;

    /* renamed from: d, reason: collision with root package name */
    public final C6927c f68573d = new C6927c();

    /* renamed from: a, reason: collision with root package name */
    public final j f68570a = new j();

    public C6929e(File file, long j10) {
        this.f68571b = file;
        this.f68572c = j10;
    }

    public static InterfaceC6925a c(File file, long j10) {
        return new C6929e(file, j10);
    }

    @Override // z4.InterfaceC6925a
    public File a(com.bumptech.glide.load.g gVar) {
        String b10 = this.f68570a.b(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(gVar);
        }
        try {
            b.e a22 = d().a2(b10);
            if (a22 != null) {
                return a22.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // z4.InterfaceC6925a
    public void b(com.bumptech.glide.load.g gVar, InterfaceC6925a.b bVar) {
        String b10 = this.f68570a.b(gVar);
        this.f68573d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(gVar);
            }
            try {
                com.bumptech.glide.disklrucache.b d10 = d();
                if (d10.a2(b10) == null) {
                    b.c T12 = d10.T1(b10);
                    if (T12 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + b10);
                    }
                    try {
                        if (bVar.a(T12.f(0))) {
                            T12.e();
                        }
                        T12.b();
                    } catch (Throwable th2) {
                        T12.b();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f68573d.b(b10);
        }
    }

    @Override // z4.InterfaceC6925a
    public synchronized void clear() {
        try {
            try {
                d().n1();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
        } finally {
            e();
        }
    }

    public final synchronized com.bumptech.glide.disklrucache.b d() {
        try {
            if (this.f68574e == null) {
                this.f68574e = com.bumptech.glide.disklrucache.b.c2(this.f68571b, 1, 1, this.f68572c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f68574e;
    }

    public final synchronized void e() {
        this.f68574e = null;
    }
}
