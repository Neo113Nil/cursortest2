package se0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import j.C7232a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class b extends View {

    /* renamed from: a, reason: collision with root package name */
    private float f98641a;

    /* renamed from: b, reason: collision with root package name */
    private final int f98642b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Bitmap f98643c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Bitmap f98644d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Paint f98645e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Rect f98646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = (int) ((48 * getResources().getDisplayMetrics().density) + 0.5f);
        this.f98642b = i11;
        Drawable a11 = C7232a.a(context, R.drawable.map_user_marker_with_arrow);
        Intrinsics.f(a11);
        Bitmap createBitmap = Bitmap.createBitmap(androidx.core.graphics.drawable.b.b(a11, i11, i11, 4));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f98643c = createBitmap;
        Drawable a12 = C7232a.a(context, R.drawable.map_user_marker_with_arrow_user);
        Intrinsics.f(a12);
        Bitmap createBitmap2 = Bitmap.createBitmap(androidx.core.graphics.drawable.b.b(a12, i11, i11, 4));
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
        this.f98644d = createBitmap2;
        this.f98645e = new Paint();
        this.f98646f = new Rect(0, 0, i11, i11);
    }

    public final void a(Float f7) {
        if (f7 == null || Intrinsics.b(f7, this.f98641a)) {
            return;
        }
        this.f98641a = f7.floatValue();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Matrix matrix = new Matrix();
        Bitmap bitmap = this.f98643c;
        matrix.postTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
        matrix.postRotate(this.f98641a);
        matrix.postTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        Paint paint = this.f98645e;
        canvas.drawBitmap(bitmap, matrix, paint);
        canvas.drawBitmap(this.f98644d, (Rect) null, this.f98646f, paint);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13 = this.f98642b;
        setMeasuredDimension(i13, i13);
    }
}
