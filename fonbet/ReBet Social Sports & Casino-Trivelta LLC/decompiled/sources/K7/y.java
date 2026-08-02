package K7;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class y implements InterfaceC1369j {

    /* renamed from: a, reason: collision with root package name */
    public final I f6352a = new C1370k();

    /* renamed from: b, reason: collision with root package name */
    public final int f6353b;

    /* renamed from: c, reason: collision with root package name */
    public int f6354c;

    /* renamed from: d, reason: collision with root package name */
    public final N f6355d;

    /* renamed from: e, reason: collision with root package name */
    public int f6356e;

    public y(int i10, int i11, N n10, G6.d dVar) {
        this.f6353b = i10;
        this.f6354c = i11;
        this.f6355d = n10;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap g(int i10) {
        this.f6355d.d(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    @Override // G6.f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i10) {
        try {
            int i11 = this.f6356e;
            int i12 = this.f6353b;
            if (i11 > i12) {
                j(i12);
            }
            Bitmap bitmap = (Bitmap) this.f6352a.get(i10);
            if (bitmap == null) {
                return g(i10);
            }
            int a10 = this.f6352a.a(bitmap);
            this.f6356e -= a10;
            this.f6355d.e(a10);
            return bitmap;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // G6.f, H6.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        int a10 = this.f6352a.a(bitmap);
        if (a10 <= this.f6354c) {
            this.f6355d.c(a10);
            this.f6352a.put(bitmap);
            synchronized (this) {
                this.f6356e += a10;
            }
        }
    }

    public final synchronized void j(int i10) {
        Bitmap bitmap;
        while (this.f6356e > i10 && (bitmap = (Bitmap) this.f6352a.pop()) != null) {
            int a10 = this.f6352a.a(bitmap);
            this.f6356e -= a10;
            this.f6355d.b(a10);
        }
    }
}
