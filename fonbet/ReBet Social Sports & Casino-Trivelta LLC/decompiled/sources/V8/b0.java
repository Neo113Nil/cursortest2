package V8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class b0 extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    public final Path f12708A;

    /* renamed from: B, reason: collision with root package name */
    public float f12709B;

    /* renamed from: C, reason: collision with root package name */
    public float f12710C;

    /* renamed from: D, reason: collision with root package name */
    public float f12711D;

    /* renamed from: E, reason: collision with root package name */
    public float f12712E;

    /* renamed from: F, reason: collision with root package name */
    public float f12713F;

    @NotNull
    private final float[] mRadii;

    /* renamed from: z, reason: collision with root package name */
    public RectF f12714z;

    public /* synthetic */ b0(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        canvas.clipPath(this.f12708A);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        canvas.clipPath(this.f12708A);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final float getBottomLeftCornerRadius() {
        return this.f12713F;
    }

    public final float getBottomRightCornerRadius() {
        return this.f12712E;
    }

    public final float getCornerRadius() {
        return this.f12709B;
    }

    public final float getTopLeftCornerRadius() {
        return this.f12710C;
    }

    public final float getTopRightCornerRadius() {
        return this.f12711D;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f12714z = new RectF(0.0f, 0.0f, i10, i11);
        x();
    }

    public final void setBottomLeftCornerRadius(float f10) {
        this.f12713F = f10;
        y();
    }

    public final void setBottomRightCornerRadius(float f10) {
        this.f12712E = f10;
        y();
    }

    public final void setCornerRadius(float f10) {
        this.f12709B = f10;
        float[] fArr = this.mRadii;
        ArraysKt.fill(fArr, f10, 0, fArr.length);
    }

    public final void setTopLeftCornerRadius(float f10) {
        this.f12710C = f10;
        y();
    }

    public final void setTopRightCornerRadius(float f10) {
        this.f12711D = f10;
        y();
    }

    public final void x() {
        this.f12708A.reset();
        Path path = this.f12708A;
        RectF rectF = this.f12714z;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rectF");
            rectF = null;
        }
        path.addRoundRect(rectF, this.mRadii, Path.Direction.CW);
        this.f12708A.close();
    }

    public final void y() {
        float[] fArr = this.mRadii;
        float f10 = this.f12710C;
        fArr[0] = f10;
        fArr[1] = f10;
        float f11 = this.f12711D;
        fArr[2] = f11;
        fArr[3] = f11;
        float f12 = this.f12712E;
        fArr[4] = f12;
        fArr[5] = f12;
        float f13 = this.f12713F;
        fArr[6] = f13;
        fArr[7] = f13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        float[] fArr = new float[8];
        this.mRadii = fArr;
        this.f12708A = new Path();
        ArraysKt.fill(fArr, 0.0f, 0, fArr.length);
        y();
    }
}
