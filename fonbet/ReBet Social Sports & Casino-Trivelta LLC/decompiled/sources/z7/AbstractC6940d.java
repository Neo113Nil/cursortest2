package z7;

import android.graphics.Bitmap;

/* renamed from: z7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6940d {
    public H6.a a(int i10, int i11) {
        return b(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public H6.a b(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config, null);
    }

    public H6.a c(int i10, int i11, Bitmap.Config config, Object obj) {
        return d(i10, i11, config);
    }

    public abstract H6.a d(int i10, int i11, Bitmap.Config config);
}
