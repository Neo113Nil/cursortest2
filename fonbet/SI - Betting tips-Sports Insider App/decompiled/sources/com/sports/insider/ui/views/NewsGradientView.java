package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/NewsGradientView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewsGradientView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsGradientView.kt\ncom/sports/insider/ui/views/NewsGradientView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,108:1\n404#2:109\n404#2:110\n*S KotlinDebug\n*F\n+ 1 NewsGradientView.kt\ncom/sports/insider/ui/views/NewsGradientView\n*L\n42#1:109\n43#1:110\n*E\n"})
/* loaded from: classes.dex */
public final class NewsGradientView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f7723a;

    /* renamed from: b, reason: collision with root package name */
    public int f7724b;

    /* renamed from: c, reason: collision with root package name */
    public int f7725c;

    /* renamed from: d, reason: collision with root package name */
    public int f7726d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f7727e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7728f;

    /* renamed from: g, reason: collision with root package name */
    public Path f7729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7727e = new int[]{Color.parseColor("#381F6F"), Color.parseColor("#80005B3E")};
        this.f7728f = new Paint();
        this.f7729g = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f7728f = paint;
        a(this.f7723a, this.f7724b);
    }

    public final void a(int i5, int i10) {
        if (i5 == 0 || i10 == 0) {
            return;
        }
        if (this.f7725c == i5 && this.f7726d == i10) {
            return;
        }
        this.f7725c = i5;
        this.f7726d = i10;
        float f6 = i10;
        float f10 = f6 / 2.0f;
        float f11 = i5;
        this.f7728f.setShader(new LinearGradient(0.0f, f10, f11, f10, this.f7727e, (float[]) null, Shader.TileMode.CLAMP));
        Path path = new Path();
        path.addRect(0.0f, 0.0f, f11, f6, Path.Direction.CCW);
        this.f7729g = path;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f7723a, this.f7724b);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f7729g, this.f7728f);
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
        this.f7723a = size;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getSuggestedMinimumHeight(), size2);
        }
        this.f7724b = size2;
        setMeasuredDimension(this.f7723a, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7724b = i10;
        this.f7723a = i5;
        a(i5, i10);
        invalidate();
    }
}
