package K7;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class o extends AbstractC1366g implements InterfaceC1369j {
    public o(G6.d dVar, M m10, N n10, boolean z10) {
        super(dVar, m10, n10, z10);
        s();
    }

    @Override // K7.AbstractC1366g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Bitmap g(int i10) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // K7.AbstractC1366g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void k(Bitmap bitmap) {
        D6.k.g(bitmap);
        bitmap.recycle();
    }

    @Override // K7.AbstractC1366g
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int o(Bitmap bitmap) {
        D6.k.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    @Override // K7.AbstractC1366g
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Bitmap q(C1371l c1371l) {
        Bitmap bitmap = (Bitmap) super.q(c1371l);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // K7.AbstractC1366g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean u(Bitmap bitmap) {
        D6.k.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // K7.AbstractC1366g
    public int n(int i10) {
        return i10;
    }

    @Override // K7.AbstractC1366g
    public int p(int i10) {
        return i10;
    }
}
