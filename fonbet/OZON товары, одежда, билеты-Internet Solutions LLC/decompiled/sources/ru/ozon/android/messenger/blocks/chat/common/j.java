package ru.ozon.android.messenger.blocks.chat.common;

import B90.e0;
import B90.f0;
import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$color;

/* loaded from: classes10.dex */
public final class j extends Drawable implements Animatable, TimeAnimator.TimeListener {

    /* renamed from: a, reason: collision with root package name */
    private final double f84538a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f84539b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final float[] f84540c;

    /* renamed from: d, reason: collision with root package name */
    private final int f84541d;

    /* renamed from: e, reason: collision with root package name */
    private final Float f84542e;

    /* renamed from: f, reason: collision with root package name */
    private final int f84543f;

    /* renamed from: g, reason: collision with root package name */
    private final int f84544g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Paint f84545h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private TimeAnimator f84546i;

    /* renamed from: j, reason: collision with root package name */
    private float f84547j;

    /* renamed from: k, reason: collision with root package name */
    private float f84548k;

    /* renamed from: l, reason: collision with root package name */
    private float f84549l;

    /* renamed from: m, reason: collision with root package name */
    private float f84550m;

    /* renamed from: n, reason: collision with root package name */
    private float f84551n;

    public j(Context context, int i11, Float f7, int i12, int i13) {
        int[] colors = {androidx.core.content.a.getColor(context, R$color.transparent), androidx.core.content.a.getColor(context, R$color.white_transparent_600), androidx.core.content.a.getColor(context, R$color.white_transparent_800), androidx.core.content.a.getColor(context, R$color.white_transparent_600), androidx.core.content.a.getColor(context, R$color.transparent)};
        float[] positions = {0.0f, 0.33f, 0.5f, 0.67f, 1.0f};
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f84538a = 15.0d;
        this.f84539b = colors;
        this.f84540c = positions;
        this.f84541d = i11;
        this.f84542e = f7;
        this.f84543f = i12;
        this.f84544g = i13;
        this.f84545h = new Paint();
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f84546i = timeAnimator;
        timeAnimator.setTimeListener(this);
    }

    public static void a(j jVar) {
        jVar.f84546i.start();
    }

    public final void b() {
        this.f84546i.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipRect(getBounds());
        canvas.translate(this.f84547j, 0.0f);
        canvas.drawPaint(this.f84545h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f84546i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        double radians = Math.toRadians(this.f84538a);
        this.f84551n = bounds.width();
        this.f84550m = bounds.height() * ((float) Math.tan(radians));
        Float f7 = this.f84542e;
        this.f84549l = f7 != null ? f7.floatValue() : bounds.width() * 2;
        float cos = (float) (Math.cos(radians) * this.f84549l);
        float sin = (float) (Math.sin(radians) * this.f84549l);
        Paint paint = this.f84545h;
        float f11 = this.f84549l;
        float f12 = this.f84550m;
        paint.setShader(new LinearGradient((0.0f - f11) - f12, 0.0f, (cos - f11) - f12, sin, this.f84539b, this.f84540c, Shader.TileMode.CLAMP));
        this.f84548k = ((this.f84551n + this.f84550m) + this.f84549l) / this.f84541d;
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(@NotNull TimeAnimator animation, long j11, long j12) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f84547j = this.f84548k * j11;
        invalidateSelf();
        if (this.f84547j > (this.f84550m * 2) + this.f84551n + this.f84549l) {
            stop();
            new Handler(Looper.getMainLooper()).postDelayed(new e0(this, 5), this.f84544g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f84545h.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        new Handler(Looper.getMainLooper()).postDelayed(new f0(this, 8), this.f84543f);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f84546i.cancel();
    }
}
