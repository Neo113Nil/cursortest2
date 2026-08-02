package ru.ozon.uni.android.controls.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/uni/android/controls/common/ButtonImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setIconColor", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "drawableResource", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getDrawableResource", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setDrawableResource", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "graphicGradient", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getGraphicGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "setGraphicGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;)V", "Landroid/graphics/Paint;", "cachedPaint", "Landroid/graphics/Paint;", "cachedWidth", "Ljava/lang/Integer;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonImageView extends AppCompatImageView {
    private Paint cachedPaint;
    private Integer cachedWidth;
    private DrawableResource drawableResource;
    private Color.Gradient graphicGradient;

    public /* synthetic */ ButtonImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.cachedPaint;
        if (this.graphicGradient == null || paint == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Color.Gradient gradient = this.graphicGradient;
        if (this.cachedPaint != null) {
            Integer num = this.cachedWidth;
            int measuredWidth = getMeasuredWidth();
            if (num != null && num.intValue() == measuredWidth) {
                return;
            }
        }
        if (gradient == null) {
            return;
        }
        float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(gradient.getOrientation(), getMeasuredWidth());
        float f7 = coordinates[0];
        float f11 = coordinates[1];
        float f12 = coordinates[2];
        float f13 = coordinates[3];
        int[] colors = gradient.getColors();
        float[] positions = gradient.getPositions();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(f7, f11, f12, f13, colors, positions, tileMode);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredWidth(), Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredWidth());
        drawable.draw(new Canvas(createBitmap));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "also(...)");
        ComposeShader composeShader = new ComposeShader(new BitmapShader(createBitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.SRC_IN);
        this.cachedWidth = Integer.valueOf(getMeasuredWidth());
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(composeShader);
        this.cachedPaint = paint;
    }

    public final void setDrawableResource(DrawableResource drawableResource) {
        this.drawableResource = drawableResource;
        if (drawableResource != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer resId = drawableResource.getResId(context);
            if (resId != null) {
                setImageResource(resId.intValue());
                this.cachedPaint = null;
            }
        }
    }

    public final void setGraphicGradient(Color.Gradient gradient) {
        this.graphicGradient = gradient;
        this.cachedPaint = null;
        invalidate();
    }

    public final void setIconColor(int color) {
        DrawableResource drawableResource = this.drawableResource;
        if (drawableResource == null || !drawableResource.getIsMulticolor()) {
            setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        } else {
            clearColorFilter();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(View.generateViewId());
        }
    }
}
