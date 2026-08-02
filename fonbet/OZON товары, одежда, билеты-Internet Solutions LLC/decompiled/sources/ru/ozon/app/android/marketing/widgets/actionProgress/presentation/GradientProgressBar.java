package ru.ozon.app.android.marketing.widgets.actionProgress.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$color;
import ru.ozon.app.android.marketing.R$styleable;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u000b\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001SB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J7\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001f\u0010\u0014J\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00100R\u0014\u00105\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010=\u001a\u00020#2\u0006\u0010<\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010 \u001a\u00020C2\u0006\u0010<\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010P\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010)\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\"¨\u0006T"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/GradientProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getDefaultBGColor", "()I", "", "setBackgroundBounds", "()V", "setProgressBounds", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "(Landroid/graphics/Canvas;)V", "drawProgressGradient", "drawProgress", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDraw", "percent", "setProgress", "(I)V", "", "startColor", "endColor", "setGradient", "(Ljava/lang/String;Ljava/lang/String;)V", "defaultGradientColorStart", "I", "defaultGradientColorEnd", "Landroid/graphics/drawable/GradientDrawable;", "gradientBackground", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "backgroundRectBounds", "Landroid/graphics/RectF;", "fillPaint", "fillRectBounds", "Landroid/graphics/Path;", "fillPath", "Landroid/graphics/Path;", "", "fillRadius", "F", AppMeasurementSdk.ConditionalUserProperty.VALUE, "fillColor", "Ljava/lang/String;", "getFillColor", "()Ljava/lang/String;", "setFillColor", "(Ljava/lang/String;)V", "", "J", "getPercent", "()J", "setPercent", "(J)V", "", "corners", "[F", "getCorners", "()[F", "setCorners", "([F)V", "cornerRadius", "getCornerRadius", "setCornerRadius", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GradientProgressBar extends View {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final RectF backgroundRectBounds;
    private int cornerRadius;

    @NotNull
    private float[] corners;
    private final int defaultGradientColorEnd;
    private final int defaultGradientColorStart;

    @NotNull
    private String fillColor;

    @NotNull
    private final Paint fillPaint;

    @NotNull
    private final Path fillPath;
    private float fillRadius;

    @NotNull
    private final RectF fillRectBounds;

    @NotNull
    private final GradientDrawable gradientBackground;
    private long percent;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static int borderSize = ResourceExtKt.toPx(3);

    @NotNull
    private static final UniColors DEFAULT_FILL_COLOR = UniColors.GRAPHIC_ACTIVE_ACTION_PRIMARY;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/GradientProgressBar$Companion;", "", "<init>", "()V", "", "borderSize", "I", "", "MAX_VALUE", "J", "MIN_VALUE", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientProgressBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawBackground(Canvas canvas) {
        RectF rectF = this.backgroundRectBounds;
        float f7 = this.fillRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.backgroundPaint);
    }

    private final void drawProgress(Canvas canvas) {
        canvas.drawPath(this.fillPath, this.fillPaint);
    }

    private final void drawProgressGradient(Canvas canvas) {
        this.gradientBackground.setCornerRadius(this.cornerRadius);
        this.gradientBackground.draw(canvas);
    }

    private final int getDefaultBGColor() {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UniColors uniColors = appTypeResolver.isSelect(context) ? UniColors.CLEAR_LIGHT_KEY_0 : UniColors.LAYER_FLOOR_0;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return styleParser.parseColor(context2, uniColors.getToken(), uniColors.getResId());
    }

    private final void setBackgroundBounds() {
        this.backgroundRectBounds.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }

    private final void setProgressBounds() {
        float width;
        long j11 = this.percent;
        if (j11 >= 100) {
            this.fillPath.reset();
            GradientDrawable gradientDrawable = this.gradientBackground;
            int i11 = borderSize;
            gradientDrawable.setBounds(i11, i11, getWidth() - borderSize, getHeight() - borderSize);
            return;
        }
        if (0 > j11 || j11 >= 2) {
            width = ((getWidth() - borderSize) / 100) * this.percent;
        } else {
            float width2 = getWidth();
            int i12 = borderSize;
            width = (((width2 - i12) / 100) * this.percent) + i12;
        }
        GradientDrawable gradientDrawable2 = this.gradientBackground;
        int i13 = borderSize;
        gradientDrawable2.setBounds(i13, i13, (int) width, getHeight() - borderSize);
        RectF rectF = this.fillRectBounds;
        int i14 = borderSize;
        RectF rectF2 = this.backgroundRectBounds;
        rectF.set(i14, rectF2.top + i14, rectF2.right - i14, rectF2.bottom - i14);
        this.fillPath.reset();
        this.fillPath.addRoundRect(this.fillRectBounds, this.corners, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.backgroundPaint.setColor(getDefaultBGColor());
        drawBackground(canvas);
        drawProgress(canvas);
        drawProgressGradient(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        setBackgroundBounds();
        setProgressBounds();
    }

    public final void setCornerRadius(int i11) {
        this.cornerRadius = i11;
        this.fillRadius = i11;
        invalidate();
    }

    public final void setFillColor(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Paint paint = this.fillPaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(styleParser.parseColor(context, value, DEFAULT_FILL_COLOR.getResId()));
        invalidate();
    }

    public final void setGradient(@NotNull String startColor, @NotNull String endColor) {
        Intrinsics.checkNotNullParameter(startColor, "startColor");
        Intrinsics.checkNotNullParameter(endColor, "endColor");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, startColor);
        int intValue = parseColor != null ? parseColor.intValue() : this.defaultGradientColorStart;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, endColor);
        this.gradientBackground.setColors(new int[]{intValue, parseColor2 != null ? parseColor2.intValue() : this.defaultGradientColorEnd});
        invalidate();
    }

    public final void setPercent(long j11) {
        this.percent = j11;
        float f7 = this.fillRadius;
        this.corners = new float[]{f7, f7, f7, f7, f7, f7, f7, f7};
        requestLayout();
        invalidate();
    }

    public final void setProgress(int percent) {
        long j11 = percent;
        setPercent((j11 > 100 ? 100L : j11 < 0 ? 0L : Integer.valueOf(percent)).longValue());
        setProgressBounds();
    }

    public /* synthetic */ GradientProgressBar(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientProgressBar(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = context.getColor(R$color.gradient_pb_start_color);
        this.defaultGradientColorStart = color;
        int color2 = context.getColor(R$color.gradient_pb_start_end);
        this.defaultGradientColorEnd = color2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{color, color2});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        this.gradientBackground = gradientDrawable;
        this.backgroundPaint = new Paint(1);
        this.backgroundRectBounds = new RectF();
        this.fillPaint = new Paint(1);
        this.fillRectBounds = new RectF();
        this.fillPath = new Path();
        this.fillColor = DEFAULT_FILL_COLOR.getToken();
        this.corners = new float[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GradientProgressBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(R$styleable.GradientProgressBar_cornerRadius, 0));
        obtainStyledAttributes.recycle();
    }
}
