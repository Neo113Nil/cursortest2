package c80;

import Ae.O0;
import Ae.x0;
import android.graphics.Bitmap;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L30.l f56722a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<Bitmap> f56723b;

    public d(@NotNull L30.l pdfBitmapHolder) {
        Intrinsics.checkNotNullParameter(pdfBitmapHolder, "pdfBitmapHolder");
        this.f56722a = pdfBitmapHolder;
        this.f56723b = O0.a(null);
    }

    @NotNull
    public final x0<Bitmap> e0() {
        return this.f56723b;
    }
}
