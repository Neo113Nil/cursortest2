package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/AuthBrMGradientView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthBrMGradientView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthBrMGradientView.kt\ncom/sports/insider/ui/views/AuthBrMGradientView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,155:1\n1#2:156\n404#3:157\n404#3:158\n404#3:159\n*S KotlinDebug\n*F\n+ 1 AuthBrMGradientView.kt\ncom/sports/insider/ui/views/AuthBrMGradientView\n*L\n86#1:157\n87#1:158\n101#1:159\n*E\n"})
/* loaded from: classes.dex */
public final class AuthBrMGradientView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f7157a;

    /* renamed from: b, reason: collision with root package name */
    public int f7158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7159c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f7160d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f7161e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f7162f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f7163g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f7164h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7165i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7166k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7167l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7168m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7169n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f7170o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthBrMGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7160d = new Paint(1);
        this.f7161e = new Path();
        this.f7162f = new Path();
        this.f7163g = new Path();
        this.f7164h = new Paint(1);
        this.f7165i = 56.0f;
        this.j = 24.0f;
        this.f7166k = 112.0f;
        this.f7167l = 193.0f;
        this.f7168m = 1.0f;
        this.f7169n = 1.0f;
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.f7170o = iArr;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        this.f7169n = f6 <= 0.0f ? this.f7168m : f6;
        this.f7159c = Color.parseColor("#40007E");
        int parseColor = Color.parseColor("#03F39E");
        float f10 = this.f7165i;
        float f11 = this.f7169n;
        this.f7165i = f10 * f11;
        this.j *= f11;
        this.f7166k *= f11;
        this.f7167l *= f11;
        iArr[0] = this.f7159c;
        iArr[1] = parseColor;
        Paint paint = this.f7160d;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAlpha(153);
        Paint paint2 = this.f7164h;
        paint2.setStyle(style);
        paint2.setColor(Color.parseColor("#20003F"));
        a(this.f7157a, this.f7158b);
    }

    public final void a(int i5, int i10) {
        if (this.f7157a == 0 || this.f7158b == 0) {
            return;
        }
        float f6 = i5;
        float f10 = i10;
        this.f7160d.setShader(new LinearGradient(f6, f10, 0.0f, 0.0f, this.f7170o, (float[]) null, Shader.TileMode.CLAMP));
        this.f7161e.rewind();
        this.f7161e.addRect(0.0f, 0.0f, f6, f10, Path.Direction.CCW);
        Path path = this.f7162f;
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(f6, 0.0f);
        path.lineTo(f6, this.j);
        path.lineTo(0.0f, this.f7165i);
        path.close();
        Path path2 = this.f7163g;
        path2.reset();
        path2.moveTo(0.0f, f10);
        path2.lineTo(f6, f10);
        path2.lineTo(f6, f10 - this.f7167l);
        path2.lineTo(0.0f, f10 - this.f7166k);
        path2.close();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f7157a, this.f7158b);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f7161e, this.f7160d);
        Path path = this.f7162f;
        Paint paint = this.f7164h;
        canvas.drawPath(path, paint);
        canvas.drawPath(this.f7163g, paint);
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
        this.f7157a = size;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getSuggestedMinimumHeight(), size2);
        }
        this.f7158b = size2;
        setMeasuredDimension(this.f7157a, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7158b = i10;
        this.f7157a = i5;
        a(i5, i10);
        invalidate();
    }
}
