package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PointPinProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "size", "setSize", "(I)V", "", "borderWidth", "setBorderWidth", "(F)V", "shadowOffset", "dpf2", "circlePaint", "Landroid/graphics/Paint;", "borderPaint", "centerX", "centerY", "radius", "provide", "Landroid/graphics/Bitmap;", "setStyle", "", "style", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;", "measureAndDraw", "draw", "canvas", "Landroid/graphics/Canvas;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PointPinProvider {

    @NotNull
    private final Paint borderPaint;
    private float borderWidth;
    private float centerX;
    private float centerY;

    @NotNull
    private final Paint circlePaint;

    @NotNull
    private final Context context;
    private final float dpf2;
    private float radius;
    private final int shadowOffset;
    private int size;

    public PointPinProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.size = ResourceExtKt.toPx(8, context);
        this.borderWidth = ResourceExtKt.toPxF(1, context);
        this.shadowOffset = ResourceExtKt.toPx(8, context);
        float pxF = ResourceExtKt.toPxF(2, context);
        this.dpf2 = pxF;
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicActionOnLight));
        this.circlePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ThemeExtKt.themeColor(context, R$attr.graphicLightKey));
        if (!ThemeExtKt.isDarkThemeActive(context)) {
            paint2.setShadowLayer(pxF, 0.0f, pxF, -3355444);
        }
        this.borderPaint = paint2;
    }

    private final void draw(Canvas canvas) {
        canvas.drawCircle(this.centerX, this.centerY, this.radius, this.borderPaint);
        canvas.drawCircle(this.centerX, this.centerY, this.radius - this.borderWidth, this.circlePaint);
    }

    private final Bitmap measureAndDraw() {
        int i11 = this.shadowOffset;
        int i12 = this.size;
        int i13 = i11 + i12;
        float f7 = i13 / 2.0f;
        this.centerX = f7;
        this.centerY = f7;
        this.radius = i12 / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private final void setBorderWidth(float f7) {
        if (this.borderWidth == f7) {
            return;
        }
        this.borderWidth = f7;
    }

    private final void setSize(int i11) {
        if (this.size != i11) {
            this.size = i11;
        }
    }

    @NotNull
    public final Bitmap provide() {
        return measureAndDraw();
    }

    public final void setStyle(@NotNull HotelsMapInfoV4VO.PointPinStates.PinStyles style) {
        Intrinsics.checkNotNullParameter(style, "style");
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(this.context, style.getBackgroundColor());
        if (parseColor != null) {
            this.circlePaint.setColor(parseColor.intValue());
        }
        Integer parseColor2 = styleParser.parseColor(this.context, style.getBorderColor());
        if (parseColor2 != null) {
            this.borderPaint.setColor(parseColor2.intValue());
        }
        setBorderWidth(style.getBorderWidth());
        setSize(style.getEdgeSize());
    }
}
