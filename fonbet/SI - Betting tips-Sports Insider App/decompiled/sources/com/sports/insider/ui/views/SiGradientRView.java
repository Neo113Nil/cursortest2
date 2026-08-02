package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/SiGradientRView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSiGradientRView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiGradientRView.kt\ncom/sports/insider/ui/views/SiGradientRView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,206:1\n404#2:207\n*S KotlinDebug\n*F\n+ 1 SiGradientRView.kt\ncom/sports/insider/ui/views/SiGradientRView\n*L\n98#1:207\n*E\n"})
/* loaded from: classes.dex */
public final class SiGradientRView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f7898a;

    /* renamed from: b, reason: collision with root package name */
    public int f7899b;

    /* renamed from: c, reason: collision with root package name */
    public int f7900c;

    /* renamed from: d, reason: collision with root package name */
    public int f7901d;

    /* renamed from: e, reason: collision with root package name */
    public float f7902e;

    /* renamed from: f, reason: collision with root package name */
    public float f7903f;

    /* renamed from: g, reason: collision with root package name */
    public float f7904g;

    /* renamed from: h, reason: collision with root package name */
    public float f7905h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f7906i;
    public final Path j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f7907k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7908l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7909m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7910n;

    /* renamed from: o, reason: collision with root package name */
    public final float f7911o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7912p;
    public final float q;

    /* renamed from: r, reason: collision with root package name */
    public final float f7913r;

    /* renamed from: s, reason: collision with root package name */
    public final float f7914s;

    /* renamed from: t, reason: collision with root package name */
    public final float f7915t;

    /* renamed from: u, reason: collision with root package name */
    public final float f7916u;

    /* renamed from: v, reason: collision with root package name */
    public final float f7917v;

    /* renamed from: w, reason: collision with root package name */
    public float f7918w;

    /* renamed from: x, reason: collision with root package name */
    public float f7919x;

    /* renamed from: y, reason: collision with root package name */
    public float f7920y;

    /* renamed from: z, reason: collision with root package name */
    public float f7921z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiGradientRView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7906i = new Path();
        this.j = new Path();
        this.f7907k = new Paint();
        this.f7908l = 24.0f;
        this.f7909m = 56.0f;
        this.f7910n = 60.0f;
        this.f7911o = 106.0f;
        this.f7912p = 122.0f;
        this.q = 127.0f;
        this.f7913r = 129.0f;
        this.f7914s = 171.0f;
        this.f7915t = 178.0f;
        this.f7916u = 203.0f;
        this.f7917v = 211.0f;
        this.f7918w = 24.0f;
        this.f7919x = 60.0f;
        this.f7920y = 127.0f;
        this.f7921z = 211.0f;
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#20003F"));
        this.f7907k = paint;
        float f6 = context.getResources().getDisplayMetrics().density;
        float f10 = this.f7908l * f6;
        this.f7908l = f10;
        this.f7909m *= f6;
        float f11 = this.f7910n * f6;
        this.f7910n = f11;
        this.f7911o *= f6;
        this.f7912p *= f6;
        float f12 = this.q * f6;
        this.q = f12;
        this.f7913r *= f6;
        this.f7914s *= f6;
        this.f7915t *= f6;
        this.f7916u *= f6;
        float f13 = this.f7917v * f6;
        this.f7917v = f13;
        this.f7918w = f10;
        this.f7919x = f11;
        this.f7920y = f12;
        this.f7921z = f13;
        a(f10, f11, f12, f13, this.f7898a, this.f7899b);
    }

    public final void a(float f6, float f10, float f11, float f12, int i5, int i10) {
        if (i5 == 0 || i10 == 0) {
            return;
        }
        if (this.f7900c == i5 && this.f7901d == i10 && this.f7902e == f6 && this.f7903f == f10 && this.f7904g == f11 && this.f7905h == f12) {
            return;
        }
        this.f7900c = i5;
        this.f7901d = i10;
        this.f7902e = f6;
        this.f7903f = f10;
        this.f7904g = f11;
        this.f7905h = f12;
        Path path = this.f7906i;
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f13 = i5;
        path.lineTo(f13, 0.0f);
        path.lineTo(f13, f10);
        path.lineTo(0.0f, f6);
        path.close();
        Path path2 = this.j;
        path2.reset();
        float f14 = i10;
        path2.moveTo(0.0f, f14);
        path2.lineTo(f13, f14);
        path2.lineTo(f13, f14 - f12);
        path2.lineTo(0.0f, f14 - f11);
        path2.close();
    }

    public final void b(float f6, float f10, float f11, float f12) {
        this.f7918w = f6;
        this.f7919x = f10;
        this.f7920y = f11;
        this.f7921z = f12;
        a(f6, f10, f11, f12, this.f7898a, this.f7899b);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f7918w, this.f7919x, this.f7920y, this.f7921z, this.f7898a, this.f7899b);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f7906i, this.f7907k);
        canvas.drawPath(this.j, this.f7907k);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(getSuggestedMinimumWidth(), size);
        }
        this.f7898a = size;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getSuggestedMinimumHeight(), size2);
        }
        this.f7899b = size2;
        setMeasuredDimension(this.f7898a, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7899b = i10;
        this.f7898a = i5;
        a(this.f7918w, this.f7919x, this.f7920y, this.f7921z, i5, i10);
        invalidate();
    }
}
