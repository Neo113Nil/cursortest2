package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/MainDrawMajorScreenBgPalette;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "borderWidth", "", "getBorderWidth", "()I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "bgColor", "setBgColor", "(I)V", "lightShadowColor", "setLightShadowColor", "darkShadowColor", "setDarkShadowColor", "bgPaint", "Landroid/graphics/Paint;", "getBgPaint", "()Landroid/graphics/Paint;", "borderPaint", "getBorderPaint", "innerDarkShadowPaint", "getInnerDarkShadowPaint", "innerLightShadowPaint", "getInnerLightShadowPaint", "theme", "", "item", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenBgPalette {
    private int bgColor;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final Paint borderPaint;
    private final int borderWidth;

    @NotNull
    private final Context context;
    private int darkShadowColor;

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/MainDrawMajorScreenBgPalette$Companion;", "", "<init>", "()V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MainDrawMajorScreenBgPalette(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        int px = ResourceExtKt.toPx(4);
        this.borderWidth = px;
        this.bgColor = UtilKt.parseColor(R$color.prize_progress_bg_default_color, context);
        this.lightShadowColor = UtilKt.parseColor(R$color.prize_progress_bg_light_shadow_default_color, context);
        this.darkShadowColor = UtilKt.parseColor(R$color.prize_progress_bg_dark_shadow_default_color, context);
        Paint paint = new Paint(1);
        paint.setColor(this.bgColor);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(UtilKt.parseColor(R$color.prize_progress_border_color, context));
        paint2.setStrokeWidth(px);
        this.borderPaint = paint2;
        Paint paint3 = new Paint(1);
        float f7 = bgInnerShadowBlurRadius;
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(f7, blur));
        paint3.setColor(this.darkShadowColor);
        paint3.setStyle(style);
        float f11 = bgInnerShadowWidth;
        paint3.setStrokeWidth(f11);
        this.innerDarkShadowPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setMaskFilter(new BlurMaskFilter(f7, blur));
        paint4.setColor(this.lightShadowColor);
        paint4.setStyle(style);
        paint4.setStrokeWidth(f11);
        this.innerLightShadowPaint = paint4;
    }

    private final void setBgColor(int i11) {
        this.bgColor = i11;
        this.bgPaint.setColor(i11);
    }

    private final void setDarkShadowColor(int i11) {
        this.darkShadowColor = i11;
        this.innerDarkShadowPaint.setColor(i11);
    }

    private final void setLightShadowColor(int i11) {
        this.lightShadowColor = i11;
        this.innerLightShadowPaint.setColor(i11);
    }

    @NotNull
    public final Paint getBgPaint() {
        return this.bgPaint;
    }

    @NotNull
    public final Paint getBorderPaint() {
        return this.borderPaint;
    }

    public final int getBorderWidth() {
        return this.borderWidth;
    }

    @NotNull
    public final Paint getInnerDarkShadowPaint() {
        return this.innerDarkShadowPaint;
    }

    @NotNull
    public final Paint getInnerLightShadowPaint() {
        return this.innerLightShadowPaint;
    }

    public final void theme(@NotNull MainDrawMajorScreenVO.ProgressBlock item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof MainDrawMajorScreenVO.ProgressBlock.Progress) {
            setBgColor(UtilKt.parseColor(R$color.prize_progress_bg_default_color, this.context));
            setLightShadowColor(UtilKt.parseColor(R$color.prize_progress_bg_light_shadow_default_color, this.context));
            setDarkShadowColor(UtilKt.parseColor(R$color.prize_progress_bg_dark_shadow_default_color, this.context));
        } else {
            setBgColor(UtilKt.parseColor(R$color.prize_progress_bg_empty_color, this.context));
            setLightShadowColor(UtilKt.parseColor(R$color.prize_progress_bg_light_shadow_empty_color, this.context));
            setDarkShadowColor(UtilKt.parseColor(R$color.prize_progress_bg_dark_shadow_empty_color, this.context));
        }
    }
}
