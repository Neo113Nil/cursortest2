package ru.ozon.fintech.features.camera.ui;

import E30.f;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J(\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/fintech/features/camera/ui/DocFrameView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "borderColor", "docFrameAreaBorderStrokePaint", "Landroid/graphics/Paint;", "docFrameAreaPaint", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroid/graphics/Rect;", "docFrameAreaRect", "getDocFrameAreaRect", "()Landroid/graphics/Rect;", "setDocFrameAreaRect", "(Landroid/graphics/Rect;)V", "docFrameAreaRectF", "Landroid/graphics/RectF;", "photoInnerFrameRectF", "isRegistrationFormat", "", "()Z", "setRegistrationFormat", "(Z)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "calculateRect", "calculatePhotoFrameRect", "docFrame", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DocFrameView extends View {
    private static final double BOX_SIZE_COEF = 0.2d;
    private static final double FRAME_H_COEF = 1.45d;
    private static final double TOP_COEF = 0.18d;
    private int borderColor;

    @NotNull
    private Paint docFrameAreaBorderStrokePaint;

    @NotNull
    private final Paint docFrameAreaPaint;

    @NotNull
    private Rect docFrameAreaRect;

    @NotNull
    private RectF docFrameAreaRectF;
    private boolean isRegistrationFormat;
    private RectF photoInnerFrameRectF;
    private static final float BOX_CORNERS_RADIUS = f.c();
    private static final int BOX_MIN_MARGIN = f.f();
    private static final int BOX_STROKE_WIDTH = f.g();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocFrameView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Rect calculatePhotoFrameRect(Rect docFrame) {
        double centerY = ((docFrame.bottom - docFrame.centerY()) * 0.15d) + docFrame.centerY();
        int i11 = docFrame.left;
        int i12 = docFrame.right;
        double d11 = ((i12 - i11) * 0.05d) + i11;
        double d12 = (i12 - i11) * 0.32d;
        return new Rect((int) d11, (int) centerY, (int) (d11 + d12), (int) ((d12 * 1.2d) + centerY));
    }

    private final Rect calculateRect(int w11, int h11) {
        double d11 = 2;
        double d12 = (w11 * BOX_SIZE_COEF) / d11;
        int i11 = BOX_MIN_MARGIN;
        if (d12 >= i11) {
            i11 = (int) d12;
        }
        double d13 = h11 * TOP_COEF;
        int i12 = w11 - i11;
        double d14 = ((((i12 - i11) * FRAME_H_COEF) + d13) - d13) / d11;
        double d15 = h11 / 2;
        return new Rect(i11, (int) (d15 - d14), i12, (int) (d15 + d14));
    }

    private final void setDocFrameAreaRect(Rect rect) {
        this.docFrameAreaRect = rect;
        this.docFrameAreaRectF = new RectF(rect);
    }

    @NotNull
    public final Rect getDocFrameAreaRect() {
        return this.docFrameAreaRect;
    }

    /* renamed from: isRegistrationFormat, reason: from getter */
    public final boolean getIsRegistrationFormat() {
        return this.isRegistrationFormat;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.docFrameAreaRectF;
        float f7 = BOX_CORNERS_RADIUS;
        canvas.drawRoundRect(rectF, f7, f7, this.docFrameAreaBorderStrokePaint);
        if (this.isRegistrationFormat) {
            return;
        }
        RectF rectF2 = this.docFrameAreaRectF;
        float f11 = rectF2.left;
        float centerY = rectF2.centerY();
        RectF rectF3 = this.docFrameAreaRectF;
        canvas.drawLine(f11, centerY, rectF3.right, rectF3.centerY(), this.docFrameAreaBorderStrokePaint);
        RectF rectF4 = this.photoInnerFrameRectF;
        if (rectF4 != null) {
            canvas.drawRoundRect(rectF4, f7, f7, this.docFrameAreaBorderStrokePaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        setDocFrameAreaRect(getVisibility() == 0 ? calculateRect(w11, h11) : new Rect(0, 0, 0, 0));
        this.photoInnerFrameRectF = getVisibility() == 0 ? new RectF(calculatePhotoFrameRect(this.docFrameAreaRect)) : null;
    }

    public final void setRegistrationFormat(boolean z11) {
        this.isRegistrationFormat = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocFrameView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DocFrameView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocFrameView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.borderColor = R.color.oz_white_1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(androidx.core.content.a.getColor(context, this.borderColor));
        paint.setStrokeWidth(BOX_STROKE_WIDTH);
        this.docFrameAreaBorderStrokePaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(androidx.core.content.a.getColor(context, R.color.transparent));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.docFrameAreaPaint = paint2;
        this.docFrameAreaRect = new Rect(0, 0, 0, 0);
        this.docFrameAreaRectF = new RectF(this.docFrameAreaRect);
    }
}
