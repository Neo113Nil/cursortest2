package P7;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8821a = new b();

    public static final boolean a(a aVar, H6.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Object z02 = aVar2.z0();
        Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
        Bitmap bitmap = (Bitmap) z02;
        if (aVar.a()) {
            bitmap.setHasAlpha(true);
        }
        aVar.b(bitmap);
        return true;
    }
}
