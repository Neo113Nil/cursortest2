package io.sentry.android.replay.util;

import Sc.InterfaceC3999a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c extends Drawable {

    /* renamed from: d, reason: collision with root package name */
    private static final int f67664d = Color.argb(32, 255, 20, 20);

    /* renamed from: e, reason: collision with root package name */
    private static final int f67665e = Color.argb(UserVerificationMethods.USER_VERIFY_PATTERN, 255, 20, 20);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Paint f67666a = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f67667b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Object f67668c = K.f71697a;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f67666a;
        paint.setTextSize(32.0f);
        paint.setColor(-16777216);
        paint.setStrokeWidth(6.0f);
        for (Rect rect : this.f67668c) {
            paint.setColor(f67664d);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRect(rect, paint);
            paint.setColor(f67665e);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            canvas.drawRect(rect, paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String sb3 = sb2.toString();
            int length = sb3.length();
            Rect rect2 = this.f67667b;
            paint.getTextBounds(sb3, 0, length, rect2);
            float f7 = rect.left;
            float f11 = rect.top;
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(sb3, f7, f11, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(sb3, f7, f11, paint);
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
    @InterfaceC3999a
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
