package K7;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;

/* renamed from: K7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1367h {

    /* renamed from: a, reason: collision with root package name */
    public int f6316a;

    /* renamed from: b, reason: collision with root package name */
    public long f6317b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6318c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6319d;

    /* renamed from: e, reason: collision with root package name */
    public final H6.h f6320e;

    /* renamed from: K7.h$a */
    public class a implements H6.h {
        public a() {
        }

        @Override // H6.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
            try {
                C1367h.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C1367h(int i10, int i11) {
        D6.k.b(Boolean.valueOf(i10 > 0));
        D6.k.b(Boolean.valueOf(i11 > 0));
        this.f6318c = i10;
        this.f6319d = i11;
        this.f6320e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        D6.k.c(this.f6316a > 0, "No bitmaps registered.");
        long j10 = sizeInBytes;
        D6.k.d(j10 <= this.f6317b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(sizeInBytes), Long.valueOf(this.f6317b));
        this.f6317b -= j10;
        this.f6316a--;
    }

    public synchronized int b() {
        return this.f6316a;
    }

    public synchronized int c() {
        return this.f6318c;
    }

    public synchronized int d() {
        return this.f6319d;
    }

    public H6.h e() {
        return this.f6320e;
    }

    public synchronized long f() {
        return this.f6317b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        int i10 = this.f6316a;
        if (i10 < this.f6318c) {
            long j10 = this.f6317b;
            long j11 = sizeInBytes;
            if (j10 + j11 <= this.f6319d) {
                this.f6316a = i10 + 1;
                this.f6317b = j10 + j11;
                return true;
            }
        }
        return false;
    }
}
