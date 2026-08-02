package z7;

import C7.C1037a;
import K7.InterfaceC1369j;
import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6937a extends AbstractC6940d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1369j f68620a;

    /* renamed from: b, reason: collision with root package name */
    public final C1037a f68621b;

    public C6937a(InterfaceC1369j bitmapPool, C1037a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.f68620a = bitmapPool;
        this.f68621b = closeableReferenceFactory;
    }

    @Override // z7.AbstractC6940d
    public H6.a d(int i10, int i11, Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f68620a.get(BitmapUtil.getSizeInByteForBitmap(i10, i11, bitmapConfig));
        if (bitmap.getAllocationByteCount() < i10 * i11 * BitmapUtil.getPixelSizeForBitmapConfig(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i10, i11, bitmapConfig);
        H6.a c10 = this.f68621b.c(bitmap, this.f68620a);
        Intrinsics.checkNotNullExpressionValue(c10, "create(...)");
        return c10;
    }
}
