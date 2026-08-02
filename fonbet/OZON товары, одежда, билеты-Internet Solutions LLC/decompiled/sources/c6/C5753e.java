package c6;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: c6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5753e implements V5.v<Bitmap>, V5.r {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f56549a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.d f56550b;

    public C5753e(@NonNull W5.d dVar, @NonNull Bitmap bitmap) {
        p6.k.c(bitmap, "Bitmap must not be null");
        this.f56549a = bitmap;
        p6.k.c(dVar, "BitmapPool must not be null");
        this.f56550b = dVar;
    }

    public static C5753e c(@NonNull W5.d dVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C5753e(dVar, bitmap);
    }

    @Override // V5.v
    public final void a() {
        this.f56550b.c(this.f56549a);
    }

    @Override // V5.v
    @NonNull
    public final Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // V5.v
    @NonNull
    public final Bitmap get() {
        return this.f56549a;
    }

    @Override // V5.v
    public final int getSize() {
        return p6.l.c(this.f56549a);
    }

    @Override // V5.r
    public final void initialize() {
        this.f56549a.prepareToDraw();
    }
}
