package N;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {
    public static final l a() {
        return new a();
    }

    public static final Paint b() {
        return new Paint(7);
    }

    public static final void c(Paint setNativeColor, long j10) {
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(f.d(j10));
    }

    public static final void d(Paint paint, float f10) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    public static final void e(Paint setNativeStyle, int i10) {
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(m.c(i10, m.f7834a.a()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
