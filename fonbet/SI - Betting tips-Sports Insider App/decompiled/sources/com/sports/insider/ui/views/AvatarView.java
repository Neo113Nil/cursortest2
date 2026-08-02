package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sports/insider/ui/views/AvatarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getSizeAvatar", "()I", "Landroid/graphics/Bitmap;", "bitmap", "", "setBitmap", "(Landroid/graphics/Bitmap;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAvatarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarView.kt\ncom/sports/insider/ui/views/AvatarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,264:1\n1#2:265\n404#3:266\n404#3:267\n189#4,8:268\n27#4,7:276\n*S KotlinDebug\n*F\n+ 1 AvatarView.kt\ncom/sports/insider/ui/views/AvatarView\n*L\n73#1:266\n74#1:267\n218#1:268,8\n223#1:276,7\n*E\n"})
/* loaded from: classes.dex */
public final class AvatarView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f7171a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7172b;

    /* renamed from: c, reason: collision with root package name */
    public LinearGradient f7173c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7174d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7175e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7176f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7177g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7178h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f7179i;
    public final Path j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f7180k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f7181l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f7182m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7183n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f7184o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7171a = new Paint(1);
        this.f7172b = new Paint(1);
        this.f7174d = 77.0f;
        this.f7175e = 67.0f;
        this.f7176f = 5.0f;
        this.f7177g = 1.0f;
        this.f7178h = 1.0f;
        this.f7179i = new Path();
        this.j = new Path();
        this.f7180k = new RectF();
        this.f7182m = new Matrix();
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.f7184o = iArr;
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        this.f7178h = f6 <= 0.0f ? this.f7177g : f6;
        this.f7183n = Color.parseColor("#03F39E");
        int parseColor = Color.parseColor("#40007E");
        float f10 = this.f7174d;
        float f11 = this.f7178h;
        this.f7174d = f10 * f11;
        this.f7175e *= f11;
        this.f7176f *= f11;
        iArr[0] = parseColor;
        iArr[1] = this.f7183n;
        Paint paint = this.f7171a;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f7183n);
        paint.setDither(true);
        this.f7172b.setFilterBitmap(true);
        this.f7182m.setScale(1.0f, 1.0f);
    }

    public final void a(int i5, int i10) {
        RectF rectF = this.f7180k;
        Path path = this.j;
        Path path2 = this.f7179i;
        if (i5 <= 0 || i10 <= 0) {
            path2.reset();
            path.reset();
            rectF.setEmpty();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = ((i5 - getPaddingEnd()) + 0.0f) - paddingStart;
        float paddingBottom = ((i10 - getPaddingBottom()) + 0.0f) - paddingTop;
        float f6 = (paddingBottom / 2.0f) + paddingTop;
        float f10 = paddingEnd / 2.0f;
        float f11 = paddingStart + f10;
        if (paddingBottom <= 0.0f || paddingEnd <= 0.0f) {
            path2.reset();
            path.reset();
            rectF.setEmpty();
            return;
        }
        float min = Math.min(paddingEnd, paddingBottom);
        float f12 = min / 2.0f;
        float f13 = min <= paddingEnd ? f11 - f12 : f11 - f10;
        float f14 = f13 + min;
        float f15 = f12 - this.f7176f;
        rectF.set(f11 - f15, f6 - f15, f11 + f15, f6 + f15);
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path2.addCircle(f11, f6, f12, direction);
        path.rewind();
        path.addCircle(f11, f6, f15, direction);
        this.f7173c = new LinearGradient(f13, f6, f14, f6, this.f7184o, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final int getSizeAvatar() {
        return (int) this.f7175e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f7179i;
        if (!path.isEmpty()) {
            save = canvas.save();
            canvas.clipPath(path);
            try {
                canvas.drawPath(path, this.f7171a);
            } finally {
            }
        }
        Path path2 = this.j;
        if (path2.isEmpty()) {
            return;
        }
        RectF rectF = this.f7180k;
        if (rectF.isEmpty() || (bitmap = this.f7181l) == null) {
            return;
        }
        save = canvas.save();
        try {
            canvas.clipPath(path2);
            canvas.translate(rectF.left, rectF.top);
            if (!bitmap.isRecycled()) {
                canvas.drawBitmap(bitmap, this.f7182m, this.f7172b);
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingEnd = (int) (getPaddingEnd() + getPaddingStart() + this.f7174d);
        int paddingBottom = (int) (getPaddingBottom() + getPaddingTop() + this.f7174d);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingEnd, size);
        } else if (mode != 1073741824) {
            size = paddingEnd;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        int min = Math.min(size, size2);
        Integer valueOf = Integer.valueOf(min);
        Integer valueOf2 = Integer.valueOf(min);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        a(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.f7171a;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.f7173c;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
            invalidate();
            return;
        }
        a(i5, i10);
        LinearGradient linearGradient2 = this.f7173c;
        if (linearGradient2 != null) {
            paint.setShader(linearGradient2);
        }
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.f7181l = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 100.0f && height > 100.0f) {
            RectF rectF = this.f7180k;
            float f6 = rectF.right - rectF.left;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            if (f6 <= 0.0f || f6 >= this.f7175e) {
                f6 = this.f7175e;
            }
            float max = Math.max(f6 / width, f6 / height);
            float f10 = 2;
            float f11 = (f6 - (width * max)) / f10;
            float f12 = (f6 - (height * max)) / f10;
            Matrix matrix = this.f7182m;
            matrix.setScale(max, max);
            matrix.postTranslate(f11, f12);
            if (!bitmap.isRecycled()) {
                this.f7181l = bitmap;
            }
        }
        invalidate();
    }
}
