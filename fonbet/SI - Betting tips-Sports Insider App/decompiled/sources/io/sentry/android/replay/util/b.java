package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16122d = Color.argb(32, KotlinVersion.MAX_COMPONENT_VALUE, 20, 20);

    /* renamed from: e, reason: collision with root package name */
    public static final int f16123e = Color.argb(128, KotlinVersion.MAX_COMPONENT_VALUE, 20, 20);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f16124a = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public final Rect f16125b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Object f16126c = e0.f19204a;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f16124a;
        paint.setTextSize(32.0f);
        paint.setColor(-16777216);
        paint.setStrokeWidth(6.0f);
        for (Rect rect : this.f16126c) {
            paint.setColor(f16122d);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRect(rect, paint);
            paint.setColor(f16123e);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            canvas.drawRect(rect, paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String sb3 = sb2.toString();
            int length = sb3.length();
            Rect rect2 = this.f16125b;
            paint.getTextBounds(sb3, 0, length, rect2);
            float f6 = rect.left;
            float f10 = rect.top;
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(sb3, f6, f10, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(sb3, f6, f10, paint);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(rect.right);
            sb4.append('/');
            sb4.append(rect.bottom);
            String sb5 = sb4.toString();
            paint.getTextBounds(sb5, 0, sb5.length(), rect2);
            float width = rect.right - rect2.width();
            float height = rect.bottom + rect2.height();
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(sb5, width, height, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(sb5, width, height, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
