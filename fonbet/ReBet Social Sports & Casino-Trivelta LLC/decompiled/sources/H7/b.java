package H7;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;

/* loaded from: classes2.dex */
public class b extends a implements f {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f4839i = false;

    /* renamed from: d, reason: collision with root package name */
    public H6.a f4840d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Bitmap f4841e;

    /* renamed from: f, reason: collision with root package name */
    public final p f4842f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4843g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4844h;

    public b(Bitmap bitmap, H6.h hVar, p pVar, int i10, int i11) {
        this.f4841e = (Bitmap) D6.k.g(bitmap);
        this.f4840d = H6.a.n1(this.f4841e, (H6.h) D6.k.g(hVar));
        this.f4842f = pVar;
        this.f4843g = i10;
        this.f4844h = i11;
    }

    public static int Z1(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public static int a2(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean b2() {
        return f4839i;
    }

    @Override // H7.d
    public Bitmap A1() {
        return this.f4841e;
    }

    @Override // H7.f
    public synchronized H6.a D() {
        return H6.a.B(this.f4840d);
    }

    @Override // H7.f
    public int K0() {
        return this.f4844h;
    }

    @Override // H7.f
    public int Y0() {
        return this.f4843g;
    }

    public final synchronized H6.a Y1() {
        H6.a aVar;
        aVar = this.f4840d;
        this.f4840d = null;
        this.f4841e = null;
        return aVar;
    }

    @Override // H7.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H6.a Y12 = Y1();
        if (Y12 != null) {
            Y12.close();
        }
    }

    @Override // H7.e, H7.m
    public int getHeight() {
        int i10;
        return (this.f4843g % 180 != 0 || (i10 = this.f4844h) == 5 || i10 == 7) ? a2(this.f4841e) : Z1(this.f4841e);
    }

    @Override // H7.e, H7.m
    public int getWidth() {
        int i10;
        return (this.f4843g % 180 != 0 || (i10 = this.f4844h) == 5 || i10 == 7) ? Z1(this.f4841e) : a2(this.f4841e);
    }

    @Override // H7.e
    public synchronized boolean isClosed() {
        return this.f4840d == null;
    }

    @Override // H7.e
    public int o() {
        return BitmapUtil.getSizeInBytes(this.f4841e);
    }

    @Override // H7.a, H7.e
    public p t1() {
        return this.f4842f;
    }

    public b(H6.a aVar, p pVar, int i10, int i11) {
        H6.a aVar2 = (H6.a) D6.k.g(aVar.r());
        this.f4840d = aVar2;
        this.f4841e = (Bitmap) aVar2.z0();
        this.f4842f = pVar;
        this.f4843g = i10;
        this.f4844h = i11;
    }
}
