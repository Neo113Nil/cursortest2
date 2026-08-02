package l1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import m1.AbstractC8032c;
import m1.C8034e;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7793K {
    @NotNull
    public static final AbstractC8032c a(@NotNull Bitmap bitmap) {
        AbstractC8032c b11;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b11 = C7819f0.b(colorSpace)) == null) ? C8034e.s() : b11;
    }

    @NotNull
    public static final Bitmap b(int i11, int i12, int i13, boolean z11, @NotNull AbstractC8032c abstractC8032c) {
        return Bitmap.createBitmap((DisplayMetrics) null, i11, i12, C7849z.b(i13), z11, C7819f0.a(abstractC8032c));
    }
}
