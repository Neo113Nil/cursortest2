package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.utils.PriceFormatter;
import ru.ozon.app.android.travel.utils.utils.PathProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MJ\u000e\u0010N\u001a\u00020K2\u0006\u0010O\u001a\u00020\u0017J\u001a\u0010P\u001a\u00020K2\b\u0010:\u001a\u0004\u0018\u00010&2\b\u0010;\u001a\u0004\u0018\u00010&J\u000e\u0010Q\u001a\u00020A2\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u00020AH\u0002J\u0010\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u00020\u000bH\u0002J\u0010\u0010W\u001a\u00020K2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u00020&2\u0006\u0010R\u001a\u00020SH\u0002J\u0018\u0010[\u001a\u00020K2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u000604j\u0002`5X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020A0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dpf2", "", "dpf6", "dpf8", "dp8", "", "dp4", "shadowOffset", "betweenIconOffset", "betweenBadgeOffset", "betweenLeftIconOffset", "minContentHeight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "isIndivisiblePinsEnabled", "", "backgroundPaint", "Landroid/graphics/Paint;", "borderPaint", "borderPathProvider", "Lru/ozon/app/android/travel/utils/utils/PathProvider;", "backgroundPathProvider", "anchorWidth", "anchorHeight", "radius", "clusterSizePaint", "Landroid/text/TextPaint;", "clusterSizeBackgroundPaint", "clusterSizeTextHorizontalPadding", "clusterSizeText", "", "clusterSizeRect", "Landroid/graphics/Rect;", "clusterSizeTextStartX", "clusterSizeTextStartY", "clusterSizeBackgroundRect", "Landroid/graphics/RectF;", "clusterRectRadius", "pricePaint", "priceText", "priceBoundRect", "priceStartX", "priceStartY", "pinText", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "priceFormatter", "Lru/ozon/app/android/travel/utils/PriceFormatter;", "regex", "Lkotlin/text/Regex;", "singlePinTemplateTitle", "clusterPinTemplateTitle", "iconProvider", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/BitmapIconProvider;", "iconPaint", "icons", "", "Landroid/graphics/Bitmap;", "currentIcon", "discountIcon", "favoriteIcon", "startIconX", "startIconY", "leftIcon", "leftStartIconX", "leftStartIconY", "setStyle", "", "style", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "toggleIndivisibleClusters", "isEnabled", "setPinTitleTemplates", "provide", "pin", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "measureAndDraw", "place", "measuredHeight", "draw", "canvas", "Landroid/graphics/Canvas;", "getPinPrice", "fillPaths", "width", "height", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricePinProvider {
    private final float anchorHeight;
    private final float anchorWidth;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final PathProvider backgroundPathProvider;
    private int betweenBadgeOffset;
    private int betweenIconOffset;
    private int betweenLeftIconOffset;

    @NotNull
    private final Paint borderPaint;

    @NotNull
    private final PathProvider borderPathProvider;

    @NotNull
    private String clusterPinTemplateTitle;
    private final float clusterRectRadius;

    @NotNull
    private final TextPaint clusterSizeBackgroundPaint;

    @NotNull
    private final RectF clusterSizeBackgroundRect;

    @NotNull
    private final TextPaint clusterSizePaint;

    @NotNull
    private final Rect clusterSizeRect;

    @NotNull
    private String clusterSizeText;
    private int clusterSizeTextHorizontalPadding;
    private float clusterSizeTextStartX;
    private float clusterSizeTextStartY;

    @NotNull
    private final Context context;
    private Bitmap currentIcon;
    private Bitmap discountIcon;
    private final int dp4;
    private final int dp8;
    private final float dpf2;
    private final float dpf6;
    private final float dpf8;
    private Bitmap favoriteIcon;

    @NotNull
    private final Paint iconPaint;

    @NotNull
    private final BitmapIconProvider iconProvider;

    @NotNull
    private final Map<Integer, Bitmap> icons;
    private boolean isIndivisiblePinsEnabled;
    private Bitmap leftIcon;
    private float leftStartIconX;
    private float leftStartIconY;
    private final int minContentHeight;
    private final int paddingBottom;
    private final int paddingEnd;
    private final int paddingStart;
    private final int paddingTop;

    @NotNull
    private final StringBuilder pinText;

    @NotNull
    private final Rect priceBoundRect;

    @NotNull
    private final PriceFormatter priceFormatter;

    @NotNull
    private final TextPaint pricePaint;
    private float priceStartX;
    private float priceStartY;

    @NotNull
    private String priceText;
    private final float radius;

    @NotNull
    private final Regex regex;
    private final int shadowOffset;

    @NotNull
    private String singlePinTemplateTitle;
    private float startIconX;
    private float startIconY;

    public PricePinProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        float pxF = ResourceExtKt.toPxF(2, context);
        this.dpf2 = pxF;
        float pxF2 = ResourceExtKt.toPxF(6, context);
        this.dpf6 = pxF2;
        float pxF3 = ResourceExtKt.toPxF(8, context);
        this.dpf8 = pxF3;
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(4, context);
        this.dp4 = px2;
        this.shadowOffset = UiExtKt.toPx(4, context);
        this.minContentHeight = UiExtKt.toPx(16, context);
        this.paddingTop = px2;
        this.paddingBottom = px2;
        this.paddingStart = px;
        this.paddingEnd = px;
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.backgroundPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(ResourceExtKt.toPxF(1, context));
        paint2.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        if (!ThemeExtKt.isDarkThemeActive(context)) {
            paint2.setShadowLayer(pxF, 0.0f, pxF, -3355444);
        }
        this.borderPaint = paint2;
        this.borderPathProvider = new PathProvider();
        this.backgroundPathProvider = new PathProvider();
        this.anchorWidth = ResourceExtKt.toPxF(14, context);
        this.anchorHeight = pxF2;
        this.radius = pxF3;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        this.clusterSizePaint = textPaint;
        this.clusterSizeBackgroundPaint = new TextPaint();
        this.clusterSizeTextHorizontalPadding = UiExtKt.toPx(5, context);
        this.clusterSizeText = "";
        this.clusterSizeRect = new Rect();
        this.clusterSizeBackgroundRect = new RectF();
        this.clusterRectRadius = ResourceExtKt.toPxF(5, context);
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setAntiAlias(true);
        this.pricePaint = textPaint2;
        this.priceText = "";
        this.priceBoundRect = new Rect();
        this.pinText = new StringBuilder();
        this.priceFormatter = new PriceFormatter();
        this.regex = new Regex("\\$placeholder");
        this.singlePinTemplateTitle = "";
        this.clusterPinTemplateTitle = "";
        this.iconProvider = new BitmapIconProvider(context);
        this.iconPaint = new Paint();
        this.icons = new LinkedHashMap();
    }

    private final void draw(Canvas canvas) {
        canvas.drawPath(this.borderPathProvider.getPath(), this.borderPaint);
        canvas.drawPath(this.backgroundPathProvider.getPath(), this.backgroundPaint);
        if (this.clusterSizeText.length() > 0) {
            RectF rectF = this.clusterSizeBackgroundRect;
            float f7 = this.clusterRectRadius;
            canvas.drawRoundRect(rectF, f7, f7, this.clusterSizeBackgroundPaint);
            canvas.drawText(this.clusterSizeText, this.clusterSizeTextStartX, this.clusterSizeTextStartY, this.clusterSizePaint);
        }
        Bitmap bitmap = this.leftIcon;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.leftStartIconX, this.leftStartIconY, this.iconPaint);
        }
        if (this.priceText.length() > 0) {
            canvas.drawText(this.priceText, this.priceStartX, this.priceStartY, this.pricePaint);
        }
        Bitmap bitmap2 = this.currentIcon;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, this.startIconX, this.startIconY, this.iconPaint);
        }
    }

    private final void fillPaths(int width, int height) {
        float f7 = width;
        float f11 = height;
        float f12 = this.shadowOffset;
        this.backgroundPathProvider.fillBorderWithAnchor(f7, f11 - this.anchorHeight, this.radius, this.borderPaint.getStrokeWidth(), this.anchorWidth, this.anchorHeight, f12);
        this.borderPathProvider.fillBorderWithAnchor(f7, f11 - this.anchorHeight, this.radius, this.borderPaint.getStrokeWidth(), this.anchorWidth, this.anchorHeight, f12);
    }

    private final String getPinPrice(HotelsMapInfoV4VO.Pin pin) {
        if (!this.isIndivisiblePinsEnabled) {
            String title = pin.getTitle();
            return title == null ? "" : title;
        }
        String obj = PriceFormatter.format$default(this.priceFormatter, pin.getPrice(), null, null, false, 6, null).toString();
        StringBuilder sb2 = this.pinText;
        h.s(sb2);
        sb2.append(pin.getIsIndivisiblePin() ? this.clusterPinTemplateTitle : this.singlePinTemplateTitle);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return this.regex.replace(sb2, obj);
    }

    private final Bitmap measureAndDraw() {
        int i11;
        int i12;
        int i13 = 0;
        if (this.clusterSizeText.length() > 0) {
            TextPaint textPaint = this.clusterSizePaint;
            String str = this.clusterSizeText;
            textPaint.getTextBounds(str, 0, str.length(), this.clusterSizeRect);
            i12 = (this.clusterSizeTextHorizontalPadding * 2) + this.clusterSizeRect.width();
            i11 = Math.max(0, this.clusterSizeRect.height());
        } else {
            i11 = 0;
            i12 = 0;
        }
        Bitmap bitmap = this.leftIcon;
        if (bitmap != null) {
            i12 += bitmap.getWidth();
            i11 = Math.max(i11, bitmap.getHeight());
        }
        if (this.priceText.length() > 0) {
            TextPaint textPaint2 = this.pricePaint;
            String str2 = this.priceText;
            textPaint2.getTextBounds(str2, 0, str2.length(), this.priceBoundRect);
            i12 += this.priceBoundRect.width();
            i11 = Math.max(i11, this.priceBoundRect.height());
        }
        Bitmap bitmap2 = this.currentIcon;
        if (bitmap2 != null) {
            i12 += bitmap2.getWidth();
            i11 = Math.max(i11, bitmap2.getHeight());
        }
        this.betweenIconOffset = (this.priceText.length() <= 0 || this.currentIcon == null) ? 0 : this.dp4;
        this.betweenLeftIconOffset = (this.priceText.length() <= 0 || this.leftIcon == null) ? 0 : this.dp4;
        if (this.clusterSizeText.length() > 0 && (this.priceText.length() > 0 || this.currentIcon != null)) {
            i13 = this.dp4;
        }
        this.betweenBadgeOffset = i13;
        int i14 = (this.shadowOffset * 2) + this.betweenIconOffset + i13 + this.betweenLeftIconOffset + this.paddingStart + this.paddingEnd + i12;
        int max = (this.shadowOffset * 2) + Math.max(i11, this.minContentHeight) + ((int) this.anchorHeight) + this.paddingTop + this.paddingBottom;
        fillPaths(i14, max);
        place(max);
        Bitmap createBitmap = Bitmap.createBitmap(i14, max, Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private final void place(int measuredHeight) {
        int i11 = this.paddingStart + this.shadowOffset;
        int i12 = (measuredHeight - ((int) this.anchorHeight)) / 2;
        if (this.clusterSizeText.length() > 0) {
            this.clusterSizeTextStartX = (i11 - this.dp4) + this.clusterSizeTextHorizontalPadding;
            float ascent = i12 - ((this.clusterSizePaint.ascent() + this.clusterSizePaint.descent()) / 2);
            this.clusterSizeTextStartY = ascent;
            float width = this.clusterSizeTextStartX + this.clusterSizeRect.width();
            int i13 = this.clusterSizeTextHorizontalPadding;
            this.clusterSizeBackgroundRect.set(this.clusterSizeTextStartX - this.clusterSizeTextHorizontalPadding, (ascent - this.clusterSizeRect.height()) - this.clusterSizeTextHorizontalPadding, width + i13, this.clusterSizeTextStartY + i13);
            i11 += (this.clusterSizeTextHorizontalPadding * 2) + this.clusterSizeRect.width() + this.betweenBadgeOffset;
        }
        Bitmap bitmap = this.leftIcon;
        if (bitmap != null) {
            this.leftStartIconX = i11;
            this.leftStartIconY = i12 - (bitmap.getHeight() / 2);
            i11 += bitmap.getWidth() + this.betweenLeftIconOffset;
        }
        if (this.priceText.length() > 0) {
            this.priceStartX = i11;
            this.priceStartY = i12 - ((this.pricePaint.ascent() + this.pricePaint.descent()) / 2);
            i11 += this.priceBoundRect.width() + this.betweenIconOffset;
        }
        if (this.currentIcon != null) {
            this.startIconX = i11;
            this.startIconY = i12 - (r2.getHeight() / 2);
        }
    }

    @NotNull
    public final Bitmap provide(@NotNull HotelsMapInfoV4VO.Pin pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean z11 = pin.getHasDiscount() && !pin.getIsFavorite();
        this.priceText = (pin.getPrice() == null && pin.getTitle() == null) ? "" : getPinPrice(pin);
        this.clusterSizeText = pin.getIsIndivisiblePin() ? String.valueOf(pin.getInnerIds().size()) : "";
        this.currentIcon = pin.getIsFavorite() ? this.favoriteIcon : (!z11 || pin.getRightIconId() == null) ? z11 ? this.discountIcon : null : this.icons.get(pin.getRightIconId());
        this.leftIcon = h.K(this.clusterSizeText) ? this.icons.get(pin.getLeftIconId()) : null;
        return measureAndDraw();
    }

    public final void setPinTitleTemplates(String singlePinTemplateTitle, String clusterPinTemplateTitle) {
        if (singlePinTemplateTitle != null) {
            this.singlePinTemplateTitle = singlePinTemplateTitle;
        }
        if (clusterPinTemplateTitle != null) {
            this.clusterPinTemplateTitle = clusterPinTemplateTitle;
        }
    }

    public final void setStyle(@NotNull HotelsMapInfoV4VO.PricePinStates.PinStyles style) {
        BadgeDTO.CustomStyle customBadgeStyle;
        BadgeDTO.CustomBackground backgroundColor;
        BadgeDTO.CustomStyle customBadgeStyle2;
        Intrinsics.checkNotNullParameter(style, "style");
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(this.context, style.getBackgroundColor());
        if (parseColor != null) {
            this.backgroundPaint.setColor(parseColor.intValue());
        }
        Integer parseColor2 = styleParser.parseColor(this.context, style.getBorderColor());
        if (parseColor2 != null) {
            this.borderPaint.setColor(parseColor2.intValue());
        }
        Integer parseColor3 = styleParser.parseColor(this.context, style.getText().getTextColor());
        if (parseColor3 != null) {
            this.pricePaint.setColor(parseColor3.intValue());
        }
        Integer parseTextStyle = styleParser.parseTextStyle(style.getText().getTypographyToken());
        if (parseTextStyle != null) {
            TextPaintExtKt.applyStyle(this.pricePaint, this.context, parseTextStyle.intValue());
        }
        Context context = this.context;
        BadgeDTO badge = style.getBadge();
        String str = null;
        Integer parseColor4 = styleParser.parseColor(context, (badge == null || (customBadgeStyle2 = badge.getCustomBadgeStyle()) == null) ? null : customBadgeStyle2.getTextColor());
        if (parseColor4 != null) {
            this.clusterSizePaint.setColor(parseColor4.intValue());
        }
        Integer parseTextStyle2 = styleParser.parseTextStyle(UniTextStyles.BODY_ACCENT_250_CAPTION.getToken());
        if (parseTextStyle2 != null) {
            TextPaintExtKt.applyStyle(this.clusterSizePaint, this.context, parseTextStyle2.intValue());
        }
        Context context2 = this.context;
        BadgeDTO badge2 = style.getBadge();
        if (badge2 != null && (customBadgeStyle = badge2.getCustomBadgeStyle()) != null && (backgroundColor = customBadgeStyle.getBackgroundColor()) != null) {
            str = backgroundColor.getColor();
        }
        Integer parseColor5 = styleParser.parseColor(context2, str);
        if (parseColor5 != null) {
            this.clusterSizeBackgroundPaint.setColor(parseColor5.intValue());
        }
        for (Map.Entry<Integer, IconDTO> entry : style.getIcons().entrySet()) {
            int intValue = entry.getKey().intValue();
            Bitmap coloredBitmapFromDTO = this.iconProvider.getColoredBitmapFromDTO(entry.getValue());
            if (coloredBitmapFromDTO != null) {
                this.icons.put(Integer.valueOf(intValue), coloredBitmapFromDTO);
            }
        }
        IconDTO discountIcon = style.getDiscountIcon();
        if (discountIcon != null) {
            this.discountIcon = this.iconProvider.getColoredBitmapFromDTO(discountIcon);
        }
        this.favoriteIcon = this.iconProvider.getColoredBitmapFromDTO(style.getFavoriteIcon());
    }

    public final void toggleIndivisibleClusters(boolean isEnabled) {
        this.isIndivisiblePinsEnabled = isEnabled;
    }
}
