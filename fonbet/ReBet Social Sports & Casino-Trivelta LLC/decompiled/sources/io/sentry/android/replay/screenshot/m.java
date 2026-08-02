package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m {
    public static final void a(Canvas destCanvas, Paint destPaint, Rect tmpSrc, RectF tmpDst, Bitmap sourceBitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        Intrinsics.checkNotNullParameter(destCanvas, "destCanvas");
        Intrinsics.checkNotNullParameter(destPaint, "destPaint");
        Intrinsics.checkNotNullParameter(tmpSrc, "tmpSrc");
        Intrinsics.checkNotNullParameter(tmpDst, "tmpDst");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        float f12 = (i10 - i12) * f10;
        float f13 = (i11 - i13) * f11;
        tmpSrc.set(0, 0, sourceBitmap.getWidth(), sourceBitmap.getHeight());
        tmpDst.set(f12, f13, (sourceBitmap.getWidth() * f10) + f12, (sourceBitmap.getHeight() * f11) + f13);
        destCanvas.drawBitmap(sourceBitmap, tmpSrc, tmpDst, destPaint);
    }
}
