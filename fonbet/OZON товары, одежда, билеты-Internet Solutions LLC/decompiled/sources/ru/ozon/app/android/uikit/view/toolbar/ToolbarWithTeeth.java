package ru.ozon.app.android.uikit.view.toolbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0007H\u0016J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000eJ\u000e\u0010)\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0007J\b\u0010*\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u0010H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/uikit/view/toolbar/ToolbarWithTeeth;", "Landroidx/appcompat/widget/Toolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "teethHeight", "", "baseToolbarHeight", "hasTeeth", "", "backgroundPaint", "Landroid/graphics/Paint;", "backgroundColor", "teethPaint", "backgroundPath", "Landroid/graphics/Path;", "teethPath", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "width", "height", "oldwidth", "oldheight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setBackgroundColor", "color", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setHasTeeth", "enabled", "setToolbarPaintColor", "updatePaths", "bgPaint", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToolbarWithTeeth extends Toolbar {
    private int backgroundColor;
    private Paint backgroundPaint;

    @NotNull
    private final Path backgroundPath;
    private final int baseToolbarHeight;
    private boolean hasTeeth;
    private final float teethHeight;

    @NotNull
    private final Paint teethPaint;

    @NotNull
    private final Path teethPath;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarWithTeeth(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Paint bgPaint() {
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.backgroundColor);
        this.backgroundPaint = paint2;
        return paint2;
    }

    private final void updatePaths() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        this.backgroundPath.reset();
        this.backgroundPath.addRect(0.0f, 0.0f, width, height, Path.Direction.CW);
        if (!this.hasTeeth) {
            this.teethPath.reset();
            return;
        }
        this.teethPath.reset();
        float f7 = this.teethHeight;
        this.teethPath.moveTo(0.0f, height);
        float f11 = height - f7;
        this.teethPath.quadTo(0.0f, f11, f7, f11);
        this.teethPath.lineTo(width - f7, f11);
        this.teethPath.quadTo(width, f11, width, height);
        this.teethPath.close();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.hasTeeth) {
            canvas2 = canvas;
            int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight() + this.teethHeight, null);
            canvas2.drawPath(this.backgroundPath, bgPaint());
            canvas2.drawPath(this.teethPath, this.teethPaint);
            canvas2.restoreToCount(saveLayer);
        } else {
            canvas2 = canvas;
            canvas2.drawPath(this.backgroundPath, bgPaint());
        }
        super.onDraw(canvas2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.resolveSize(getPaddingBottom() + getPaddingTop() + this.baseToolbarHeight, heightMeasureSpec), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldwidth, int oldheight) {
        super.onSizeChanged(width, height, oldwidth, oldheight);
        updatePaths();
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        if (!(background instanceof ColorDrawable)) {
            super.setBackground(background);
            return;
        }
        ColorDrawable colorDrawable = (ColorDrawable) background;
        this.backgroundColor = colorDrawable.getColor();
        bgPaint().setColor(colorDrawable.getColor());
        super.setBackground(null);
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.backgroundColor = color;
        bgPaint().setColor(color);
        super.setBackground(null);
        invalidate();
    }

    public final void setHasTeeth(boolean enabled) {
        if (this.hasTeeth == enabled) {
            return;
        }
        this.hasTeeth = enabled;
        requestLayout();
        invalidate();
    }

    public final void setToolbarPaintColor(int color) {
        this.backgroundColor = color;
        bgPaint().setColor(color);
        invalidate();
    }

    public /* synthetic */ ToolbarWithTeeth(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarWithTeeth(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.teethHeight = UiExtKt.toPxF(24);
        this.baseToolbarHeight = UiExtKt.toPx(44);
        this.backgroundColor = context.getColor(R$color.layer_floor_1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.teethPaint = paint;
        this.backgroundPath = new Path();
        this.teethPath = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        Drawable background = getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            this.backgroundColor = colorDrawable.getColor();
        }
        super.setBackgroundColor(this.backgroundColor);
    }
}
