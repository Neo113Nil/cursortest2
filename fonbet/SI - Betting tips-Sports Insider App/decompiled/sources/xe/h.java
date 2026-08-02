package xe;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends t4.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f25462a;

    public h(int i5) {
        this.f25462a = i5;
    }

    @Override // t4.b
    public final String a() {
        return "tint-" + this.f25462a;
    }

    @Override // t4.b
    public final Bitmap b(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        Intrinsics.checkNotNull(config);
        Bitmap copy = bitmap.copy(config, true);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f25462a, PorterDuff.Mode.SRC_ATOP);
        Canvas canvas = new Canvas(copy);
        Paint paint = new Paint();
        paint.setColorFilter(porterDuffColorFilter);
        canvas.drawBitmap(copy, 0.0f, 0.0f, paint);
        Intrinsics.checkNotNull(copy);
        return copy;
    }
}
