package K7;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements InterfaceC1369j {
    @Override // G6.f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // G6.f, H6.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.recycle();
    }
}
