package H7;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class i extends b {
    public i(H6.a aVar, p pVar, int i10, int i11) {
        super(aVar, pVar, i10, i11);
    }

    public void finalize() {
        if (isClosed()) {
            return;
        }
        E6.a.M("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public i(Bitmap bitmap, H6.h hVar, p pVar, int i10, int i11) {
        super(bitmap, hVar, pVar, i10, i11);
    }
}
