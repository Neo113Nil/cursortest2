package c4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f3564a;

    public a(Bitmap bitmap) {
        this.f3564a = bitmap;
    }

    @Override // c4.m
    public final boolean a() {
        return true;
    }

    @Override // c4.m
    public final long b() {
        return s6.a.f(this.f3564a);
    }

    @Override // c4.m
    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.f3564a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f3564a, ((a) obj).f3564a);
    }

    @Override // c4.m
    public final int getHeight() {
        return this.f3564a.getHeight();
    }

    @Override // c4.m
    public final int getWidth() {
        return this.f3564a.getWidth();
    }

    public final int hashCode() {
        return (this.f3564a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f3564a + ", shareable=true)";
    }
}
