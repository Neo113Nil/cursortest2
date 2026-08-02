package ru.ozon.app.android.widgets.commonTextWidget.separator.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001AB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R*\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010*R*\u0010+\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010*R*\u0010/\u001a\u00020.2\u0006\u0010%\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00105\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010*R$\u0010:\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0010\"\u0004\b9\u0010*R\u0011\u0010>\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006B"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "drawCorners", "(Landroid/graphics/Canvas;)V", "calculateDesiredHeight", "()I", "updatePaths", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldwidth", "oldheight", "onSizeChanged", "(IIII)V", "onDraw", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "topCornersPath", "Landroid/graphics/Path;", "bottomCornersPath", AppMeasurementSdk.ConditionalUserProperty.VALUE, "contentPaddingLeft", "I", "getContentPaddingLeft", "setContentPaddingLeft", "(I)V", "contentPaddingRight", "getContentPaddingRight", "setContentPaddingRight", "Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorView$CornerRadii;", "cornerRadii", "[F", "getCornerRadii-r3_I0jg", "()[F", "setCornerRadii-sRYz_WY", "([F)V", "fixedHeight", "getFixedHeight", "setFixedHeight", "getColor", "setColor", "color", "", "getHasTopCorners", "()Z", "hasTopCorners", "getHasBottomCorners", "hasBottomCorners", "CornerRadii", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeparatorView extends View {

    @NotNull
    private final Path bottomCornersPath;
    private int contentPaddingLeft;
    private int contentPaddingRight;

    @NotNull
    private float[] cornerRadii;
    private int fixedHeight;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path topCornersPath;

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorView$CornerRadii;", "", "", "top", "bottom", "constructor-impl", "(FF)[F", "", "array", "([F)[F", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getTop-impl", "([F)F", "setTop-impl", "([FF)V", "getBottom-impl", "setBottom-impl", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CornerRadii {
        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static float[] m1589constructorimpl(@NotNull float[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return array;
        }

        /* renamed from: getBottom-impl, reason: not valid java name */
        public static final float m1590getBottomimpl(float[] fArr) {
            return fArr[1];
        }

        /* renamed from: getTop-impl, reason: not valid java name */
        public static final float m1591getTopimpl(float[] fArr) {
            return fArr[0];
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static float[] m1588constructorimpl(float f7, float f11) {
            return m1589constructorimpl(new float[]{f7, f11});
        }
    }

    public /* synthetic */ SeparatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int calculateDesiredHeight() {
        int i11 = this.fixedHeight;
        if (getHasTopCorners()) {
            i11 += (int) CornerRadii.m1591getTopimpl(this.cornerRadii);
        }
        return getHasBottomCorners() ? i11 + ((int) CornerRadii.m1590getBottomimpl(this.cornerRadii)) : i11;
    }

    private final void drawCorners(Canvas canvas) {
        if (getHasTopCorners()) {
            canvas.drawPath(this.topCornersPath, this.paint);
        }
        if (getHasBottomCorners()) {
            canvas.drawPath(this.bottomCornersPath, this.paint);
        }
    }

    private final void updatePaths() {
        float width = getWidth();
        float f7 = this.contentPaddingLeft;
        float f11 = this.contentPaddingRight;
        Path path = this.topCornersPath;
        path.reset();
        if (getHasTopCorners()) {
            path.moveTo(0.0f, 0.0f);
            path.rLineTo(f7, 0.0f);
            path.rQuadTo(0.0f, CornerRadii.m1591getTopimpl(this.cornerRadii), CornerRadii.m1591getTopimpl(this.cornerRadii), CornerRadii.m1591getTopimpl(this.cornerRadii));
            path.lineTo(0.0f, CornerRadii.m1591getTopimpl(this.cornerRadii));
            path.close();
            path.moveTo(width, 0.0f);
            path.rLineTo(-f11, 0.0f);
            path.rQuadTo(0.0f, CornerRadii.m1591getTopimpl(this.cornerRadii), -CornerRadii.m1591getTopimpl(this.cornerRadii), CornerRadii.m1591getTopimpl(this.cornerRadii));
            path.lineTo(width, CornerRadii.m1591getTopimpl(this.cornerRadii));
            path.close();
        }
        Path path2 = this.bottomCornersPath;
        path2.reset();
        if (getHasBottomCorners()) {
            float f12 = this.fixedHeight;
            if (getHasTopCorners()) {
                f12 += CornerRadii.m1591getTopimpl(this.cornerRadii);
            }
            path2.moveTo(0.0f, f12);
            path2.rLineTo(CornerRadii.m1590getBottomimpl(this.cornerRadii) + f7, 0.0f);
            path2.rQuadTo(-CornerRadii.m1590getBottomimpl(this.cornerRadii), 0.0f, -CornerRadii.m1590getBottomimpl(this.cornerRadii), CornerRadii.m1590getBottomimpl(this.cornerRadii));
            path2.lineTo(0.0f, CornerRadii.m1590getBottomimpl(this.cornerRadii) + f12);
            path2.close();
            path2.moveTo(width, f12);
            path2.rLineTo(-(CornerRadii.m1590getBottomimpl(this.cornerRadii) + f11), 0.0f);
            path2.rQuadTo(CornerRadii.m1590getBottomimpl(this.cornerRadii), 0.0f, CornerRadii.m1590getBottomimpl(this.cornerRadii), CornerRadii.m1590getBottomimpl(this.cornerRadii));
            path2.lineTo(width, CornerRadii.m1590getBottomimpl(this.cornerRadii) + f12);
            path2.close();
        }
    }

    @NotNull
    /* renamed from: getCornerRadii-r3_I0jg, reason: not valid java name and from getter */
    public final float[] getCornerRadii() {
        return this.cornerRadii;
    }

    public final boolean getHasBottomCorners() {
        return CornerRadii.m1590getBottomimpl(this.cornerRadii) > 0.0f;
    }

    public final boolean getHasTopCorners() {
        return CornerRadii.m1591getTopimpl(this.cornerRadii) > 0.0f;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.fixedHeight > 0) {
            float m1591getTopimpl = getHasTopCorners() ? CornerRadii.m1591getTopimpl(this.cornerRadii) : 0.0f;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, m1591getTopimpl, getWidth(), m1591getTopimpl + this.fixedHeight, this.paint);
        } else {
            canvas2 = canvas;
        }
        drawCorners(canvas2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(calculateDesiredHeight(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldwidth, int oldheight) {
        if (width == oldwidth && height == oldheight) {
            return;
        }
        updatePaths();
    }

    public final void setColor(int i11) {
        this.paint.setColor(i11);
        invalidate();
    }

    public final void setContentPaddingLeft(int i11) {
        this.contentPaddingLeft = i11;
        invalidate();
    }

    public final void setContentPaddingRight(int i11) {
        this.contentPaddingRight = i11;
        invalidate();
    }

    /* renamed from: setCornerRadii-sRYz_WY, reason: not valid java name */
    public final void m1587setCornerRadiisRYz_WY(@NotNull float[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cornerRadii = value;
        requestLayout();
    }

    public final void setFixedHeight(int i11) {
        this.fixedHeight = i11;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.topCornersPath = new Path();
        this.bottomCornersPath = new Path();
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < 2; i12++) {
            fArr[i12] = 0.0f;
        }
        this.cornerRadii = CornerRadii.m1589constructorimpl(fArr);
        this.fixedHeight = UiExtKt.toPx(8, context);
        setElevation(0.0f);
        setClickable(false);
        setFocusable(false);
    }
}
