package ru.ozon.app.android.regulardraw.widgets.daily.ui;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R$\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010!\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010#\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0013R\u0014\u0010&\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010\u0013R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/ui/DailyBackgroundPalette;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "width", "height", "", "updateGradient", "(FF)V", "gradientBorderWidth", "F", "getGradientBorderWidth", "()F", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "bgColor", "I", "setBgColor", "(I)V", "lightShadowColor", "setLightShadowColor", "darkShadowColor", "setDarkShadowColor", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "getBgPaint", "()Landroid/graphics/Paint;", "innerDarkShadowPaint", "getInnerDarkShadowPaint", "innerLightShadowPaint", "getInnerLightShadowPaint", "borderPaint", "getBorderPaint", "bgGradientStartColor", "bgGradientTransparentColor", "", "gradientColors", "[I", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyBackgroundPalette {
    private int bgColor;
    private final int bgGradientStartColor;
    private final int bgGradientTransparentColor;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final Paint borderPaint;
    private int darkShadowColor;
    private final float gradientBorderWidth;

    @NotNull
    private final int[] gradientColors;

    @NotNull
    private final Paint innerDarkShadowPaint;

    @NotNull
    private final Paint innerLightShadowPaint;
    private int lightShadowColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float bgInnerShadowWidth = ResourceExtKt.toPxF(4);
    private static final float bgInnerShadowBlurRadius = ResourceExtKt.toPxF(3);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/ui/DailyBackgroundPalette$Companion;", "", "<init>", "()V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DailyBackgroundPalette(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(1);
        this.gradientBorderWidth = pxF;
        this.bgColor = UtilKt.parseColor(R$color.daily_rewards_dialog_bg_color, context);
        this.lightShadowColor = UtilKt.parseColor(R$color.daily_rewards_light_shadow_color, context);
        this.darkShadowColor = UtilKt.parseColor(R$color.daily_rewards_dark_shadow_color, context);
        Paint paint = new Paint(1);
        paint.setColor(this.bgColor);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        float f7 = bgInnerShadowBlurRadius;
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint2.setMaskFilter(new BlurMaskFilter(f7, blur));
        paint2.setColor(this.darkShadowColor);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        float f11 = bgInnerShadowWidth;
        paint2.setStrokeWidth(f11);
        this.innerDarkShadowPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setMaskFilter(new BlurMaskFilter(f7, blur));
        paint3.setColor(this.lightShadowColor);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f11);
        this.innerLightShadowPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(pxF);
        this.borderPaint = paint4;
        int parseColor = UtilKt.parseColor(R$color.daily_rewards_bg_border_gradient_start, context);
        this.bgGradientStartColor = parseColor;
        int i11 = this.bgGradientTransparentColor;
        this.gradientColors = new int[]{parseColor, i11, i11, i11, i11, i11};
    }

    @NotNull
    public final Paint getBgPaint() {
        return this.bgPaint;
    }

    @NotNull
    public final Paint getBorderPaint() {
        return this.borderPaint;
    }

    public final float getGradientBorderWidth() {
        return this.gradientBorderWidth;
    }

    @NotNull
    public final Paint getInnerDarkShadowPaint() {
        return this.innerDarkShadowPaint;
    }

    @NotNull
    public final Paint getInnerLightShadowPaint() {
        return this.innerLightShadowPaint;
    }

    public final void updateGradient(float width, float height) {
        this.borderPaint.setShader(new LinearGradient(width / 4, 0.0f, width / 2, height, this.gradientColors, (float[]) null, Shader.TileMode.CLAMP));
    }
}
